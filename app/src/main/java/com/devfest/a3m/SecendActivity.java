package com.devfest.a3m;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecendActivity extends AppCompatActivity  {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
    }

    public void goToResr(View view) {
        i = new Intent(getApplicationContext(),ReservationActivity.class);
        startActivity(i);
    }


    public void goToRechContre(View view) {
        i = new Intent(getApplicationContext(),RechercheContre.class);
        startActivity(i);
    }

    public void goToRechPos(View view) {
        i = new Intent(getApplicationContext(),RecherchePosition.class);
        startActivity(i);
    }
}
