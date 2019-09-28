package com.example.pitneybowes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    public void UserMaps(View view){
        startActivity(new Intent(getApplicationContext(),MapsActivity.class));
    }
    public void Cost(View view){
        startActivity(new Intent(getApplicationContext(),CostActivity.class));
    }
    public void Shipping(View view){
        startActivity(new Intent(getApplicationContext(),ShippingActivity.class));
    }
    public void QRCode(View view){
        startActivity(new Intent(getApplicationContext(),QRActivity.class));
    }
    public void Employee(View view){
        startActivity(new Intent(getApplicationContext(),EmployeeActivity.class));
    }
    public void FeedBacks(View view){
        startActivity(new Intent(getApplicationContext(),FeedbackActivity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
}
