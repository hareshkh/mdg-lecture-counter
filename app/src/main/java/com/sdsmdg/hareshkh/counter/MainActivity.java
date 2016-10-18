package com.sdsmdg.hareshkh.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button increaseBtn, decreaseBtn;
    TextView countText;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increaseBtn = (Button) findViewById(R.id.increase_button);
        decreaseBtn = (Button) findViewById(R.id.decrease_button);
        countText = (TextView) findViewById(R.id.textView);

        countText.setText(String.valueOf(count));

        increaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                countText.setText(String.valueOf(count));
            }
        });

        decreaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                countText.setText(String.valueOf(count));
            }
        });
    }
}
