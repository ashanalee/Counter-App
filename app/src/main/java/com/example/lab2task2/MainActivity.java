package com.example.lab2task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text,counttxt;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(MainActivity.this,"This is for testing", Toast.LENGTH_SHORT);
        toast.show();

        Button tasbeeh = (Button)findViewById(R.id.button4);
        tasbeeh.setOnClickListener(this);

        Button kalima = (Button)findViewById(R.id.button5);
        kalima.setOnClickListener(this);

        Button astaghfar = (Button)findViewById(R.id.button10);
        astaghfar.setOnClickListener(this);

        Button darood = (Button)findViewById(R.id.button13);
        darood.setOnClickListener(this);

        Button ayat = (Button)findViewById(R.id.button14);
        ayat.setOnClickListener(this);

        Button reset = (Button)findViewById(R.id.button15);
        reset.setOnClickListener(this);

        Button count = (Button)findViewById(R.id.button);
        count.setOnClickListener(this);

        text = (TextView)findViewById(R.id.textView);

        counttxt = (TextView)findViewById(R.id.textView2);

    }

    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
            case R.id.button4:
                text.setText(""+"Tasbeeh Fatima");
                counter = 0;
                counttxt.setText(""+counter);
                break;

            case R.id.button5:
                text.setText(""+"1st Kalima 100 Times");
                counter = 0;
                counttxt.setText(""+counter);
                break;

            case R.id.button10:
                text.setText(""+"Astaghfar 100 Times");
                counter = 0;
                counttxt.setText(""+counter);
                break;

            case R.id.button13:
                text.setText(""+"Darood 100 Times");
                counter = 0;
                counttxt.setText(""+counter);
                break;

            case R.id.button14:
                text.setText(""+"Ayate-E-Karima 100 Times");
                counter = 0;
                counttxt.setText(""+counter);
                break;

            case R.id.button15:
                text.setText(""+"Select Tasbeeh");
                counter = 0;
                counttxt.setText(""+counter);
                break;

            case R.id.button:

                counter++;

                if(counter<=100)
                {
                    counttxt.setText(""+counter);
                }

                else if(counter > 100)
                {
                    Toast toast1 = Toast.makeText(MainActivity.this,"100 Times Completed", Toast.LENGTH_SHORT);
                    toast1.show();
                }
                break;
        }
    }
}