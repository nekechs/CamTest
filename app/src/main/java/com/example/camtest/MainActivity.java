package com.example.camtest;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Switch;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 0;
    private static final int REQUEST_DISCOVER_BT = 1;

    TextView blueStatusTV, pairedTv;
    ImageView blueIV;
    Button enSec, disSec, discover, pairDevice;
    Switch btToggle;

    BluetoothAdapter mBlueAdapter;

    TimeKeeper timer = new TimeKeeper(999999);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueStatusTV = findViewById(R.id.btConStat);
        pairedTv = findViewById(R.id.numBox);
        enSec = findViewById(R.id.addOne);
        disSec = findViewById(R.id.resetBt);
        discover = findViewById(R.id.discover);
        pairDevice = findViewById(R.id.getPairDevice);
        btToggle = findViewById(R.id.btToggle);

        mBlueAdapter = BluetoothAdapter.getDefaultAdapter();

        if(mBlueAdapter == null) {
            blueStatusTV.setText("Bluetooth is not available.");
        }

        else {
            blueStatusTV.setText("Bluetooth is available!");
        }

        btToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {

                }

                else {

                }
            }
        });

        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
