package com.example.nsrivast.drugsideeffects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static final String DRUG_NAME = "com.example.myfirstapp.DRUGNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the button */
    public void enterName(View view) {
       Intent intent = new Intent(this, SearchDBActivity.class);

        EditText editText = (EditText) findViewById(R.id.editText);
        String drugName = editText.getText().toString();
        intent.putExtra(DRUG_NAME, drugName);
        startActivity(intent);
    }
}
