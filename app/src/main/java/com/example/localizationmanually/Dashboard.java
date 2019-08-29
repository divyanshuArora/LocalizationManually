package com.example.localizationmanually;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class Dashboard extends AppCompatActivity {


    TextView jodhpur,ahmedabad,jaipur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        String lang = getIntent().getStringExtra("lang");
        Log.e("Dashboard","Lang: " +lang);
        jodhpur = findViewById(R.id.Jodhpur);
        ahmedabad = findViewById(R.id.Ahmedabad);
        jaipur = findViewById(R.id.Jaipur);


        if(lang.equals("hindi"))
        {
            String languageToLoad = "hi"; // your language
            Locale locale = new Locale(languageToLoad);
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale = locale;
            getBaseContext().getResources().updateConfiguration(config,
                    getBaseContext().getResources().getDisplayMetrics());
            this.setContentView(R.layout.dashboard);
        }

        if(lang.equals("english"))
        {
            String languageToLoad = "en"; // your language
            Locale locale = new Locale(languageToLoad);
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale = locale;
            getBaseContext().getResources().updateConfiguration(config,
                    getBaseContext().getResources().getDisplayMetrics());
            this.setContentView(R.layout.dashboard);
        }

        if (lang.equals("device"))
        {
            String lng =  Locale.getDefault().getLanguage();
            Log.d("dashboard","device: "+lng);
            Locale locale = new Locale(lng);
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());
            this.setContentView(R.layout.dashboard);
        }
    }
}
