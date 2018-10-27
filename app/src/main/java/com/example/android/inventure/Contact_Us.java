package com.example.android.inventure;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Contact_Us extends AppCompatActivity {
    TextView txt_contact_us ;
    CircleImageView circleImageView ;
    Animation animation ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__us);

        circleImageView = findViewById(R.id.contact_us);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim3);
        circleImageView.setAnimation(animation);

        txt_contact_us = findViewById(R.id.txt_contact_us);

        Typeface tf = Typeface.createFromAsset(getAssets(),"BRUSHSCI.TTF");
        txt_contact_us.setTypeface(tf);
        txt_contact_us.setTextSize(45);

        FloatingActionButton float_contact_us = (FloatingActionButton) findViewById(R.id.home_floatcontact_us);
        float_contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.home_floatcontact_us:
                        startActivity(new Intent(Contact_Us.this, MainActivity.class));
                        break;
                }
            }
        });
    }

}
