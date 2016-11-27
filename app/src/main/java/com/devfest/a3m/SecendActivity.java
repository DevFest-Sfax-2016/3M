package com.devfest.a3m;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecendActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.reservation:
                Intent i = new Intent(getApplicationContext(),ReservationActivity.class);


                break;

        }

    }
}
