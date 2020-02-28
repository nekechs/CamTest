package com.example.camtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public int runningCount = 0;
    Button addBtn;
    Button resetBtn;
    TextView txView;

    TimeKeeper timer = new TimeKeeper(999999);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = (Button) findViewById(R.id.addOne);
        resetBtn = (Button) findViewById(R.id.resetBt);

        txView = (TextView) findViewById(R.id.numBox);

        txView.setText(Integer.toString(runningCount));

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runningCount ++;
                txView.setText(Integer.toString(runningCount));
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runningCount = 0;
                txView.setText(Integer.toString(runningCount));
            }
        });

    }
}
