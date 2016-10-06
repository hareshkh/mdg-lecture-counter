package com.sdsmdg.hareshkh.incrementer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button increase, decrease;
    TextView count;
    int previousCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increase = (Button) findViewById(R.id.buttonInc);
        decrease = (Button) findViewById(R.id.buttonDec);
        count = (TextView) findViewById(R.id.textView);

        count.setText(String.valueOf(0));
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousCount = (Integer.parseInt(count.getText().toString()));
                count.setText(String.valueOf(previousCount + 1));
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousCount = (Integer.parseInt(count.getText().toString()));
                count.setText(String.valueOf(previousCount - 1));
            }
        });
    }
}
