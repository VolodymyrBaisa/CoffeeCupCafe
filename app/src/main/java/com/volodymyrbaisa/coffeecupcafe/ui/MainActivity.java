package com.volodymyrbaisa.coffeecupcafe.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.volodymyrbaisa.coffeecupcafe.R;
import com.volodymyrbaisa.coffeecupcafe.utils.FontUtils;

public class MainActivity extends AppCompatActivity {

    private TextView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        logo = findViewById(R.id.logo);

        FontUtils.setFont(logo, "logo_fonts.ttf");
    }
}
