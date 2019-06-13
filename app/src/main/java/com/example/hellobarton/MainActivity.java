package com.example.hellobarton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                                                         @Override
                                                         public void onClick(View view) {
                                                             ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));
                                                         }
                                                     }
        );

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //grab text from user

                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                //post the text into text view once the change text button in clicked

                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Android is Awesome!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // reset text color to black
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));

                //reset background color to ColorAccent
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));

                //reset text back to "Hello from Kevin!"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Kevin!");
            }
        });

    }
}
