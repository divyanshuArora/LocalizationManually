package com.example.localizationmanually;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Hindi,English,deviceLang;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hindi = findViewById(R.id.Hindi);
        English = findViewById(R.id.English);
        deviceLang = findViewById(R.id.deviceLang);


        Hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                intent = new Intent(MainActivity.this,Dashboard.class);
                intent.putExtra("lang","hindi");
            }
        });

        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                intent = new Intent(MainActivity.this,Dashboard.class);
                intent.putExtra("lang","english");
                startActivity(intent);
            }
        });

        deviceLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                intent = new Intent(MainActivity.this,Dashboard.class);
                intent.putExtra("lang","device");
                startActivity(intent);
            }
        });





    }
}
