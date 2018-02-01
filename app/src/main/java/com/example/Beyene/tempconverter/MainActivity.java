package com.example.Beyene.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText EditTextView;
    private TextView resultTextView;
    private Button ConvertButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextView = (EditText) findViewById((R.id.EditTextView));
        resultTextView = (TextView) findViewById(R.id.resultTextview);
        ConvertButton = (Button) findViewById(R.id.ConvertButton);
        //onclick listener to convert the temp to celsius

        ConvertButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                // get information

                double degree = Double.valueOf(EditTextView.getText().toString());

                //math converter

                double cells = (degree - 32) * 5 / 9;

                //set celsius after degree has been input by user

                resultTextView.setText(String.valueOf(cells));

            }

        });

    }

}
