package com.example.test_question3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText EditText = (EditText) findViewById(R.id.EditText);
        Button Button = (Button) findViewById(R.id.Button);
        Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText.setText("Button Click");
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView TextView = (TextView) findViewById(R.id.TextView3);

        switch (view.getId()) {
            case R.id.RadioButton1:
                if (checked) {
                    TextView.setText("left");
                }
                break;
            case R.id.RadioButton2:
                if (checked) {
                    TextView.setText("right");
                }
        }
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        TextView TextView = (TextView) findViewById(R.id.TextView1);

        switch (view.getId()) {

            case R.id.checkBox:
                if (checked) {
                    TextView.setText(TextView.getText() + "A");
                }

                break;
            case R.id.checkBox2:
                if (checked) {
                    TextView.setText(TextView.getText() + "B");
                }

                break;
        }
    }
}
