package com.tozent.alcchallenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button about;
    private Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ALC 4 Phase 1");

        about   = (Button) findViewById(R.id.btn_about);
        profile = (Button)findViewById(R.id.btn_profile);

        about.setOnClickListener(this);
        profile.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_about:
                Intent aboutIntent = new Intent(this,AboutActivity.class);
                startActivity(aboutIntent);
                break;

            case R.id.btn_profile:
                Intent profileintent = new Intent(this,ProfileActivity.class);
                startActivity(profileintent);
                break;
        }

    }







}
