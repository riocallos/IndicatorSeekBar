package com.warkiz.indicatorseekbar.donation;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Locale;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Locale mLocale = new Locale("ar");
        Configuration config = new Configuration();
        config.setLocale(mLocale);

        getResources().updateConfiguration(config, getResources().getDisplayMetrics());

        setContentView(getLayoutResId());
        initCreate();
    }

    protected void initCreate() {

    }

    public abstract int getLayoutResId();


}
