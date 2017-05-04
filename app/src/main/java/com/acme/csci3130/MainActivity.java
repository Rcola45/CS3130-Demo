package com.acme.csci3130;
import android.content.Intent;
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

    public void resetText(View v) {
        display_text.setText("");
        input_text.setText("");
    }

    public void shareClick(View v){
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = display_text.getText().toString();
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Shared via CS3130");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}
