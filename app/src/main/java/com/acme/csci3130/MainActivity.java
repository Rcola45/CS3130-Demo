package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity {


    private Button submit_button;
    private EditText input_text;
    private TextView display_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input_text = (EditText) findViewById(R.id.inputText_textbox) ;
        display_text = (TextView) findViewById(R.id.displayText_label) ;

    }

    public void changeLabel(View v){
        display_text.setText(input_text.getEditableText().toString());
    }
}
