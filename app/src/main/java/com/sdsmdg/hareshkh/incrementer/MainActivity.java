package com.sdsmdg.hareshkh.incrementer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button i, d;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = (Button) findViewById(R.id.buttonInc);
        d = (Button) findViewById(R.id.buttonDec);
        text = (TextView) findViewById(R.id.textView);

        text.setText(String.valueOf(0));
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.valueOf((Integer.parseInt(text.getText().toString()) + 1)));
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(String.valueOf((Integer.parseInt(text.getText().toString()) - 1)));
            }
        });
    }
}
