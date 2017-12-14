package com.example.smothviewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.smothviewpager.iner.CaseTwoActivity;
import com.example.smothviewpager.outer.CaseOneActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void caseOne(View view){
        startActivity(new Intent(this,CaseOneActivity.class));
    }

    public void caseTwo(View view){
        startActivity(new Intent(this,CaseTwoActivity.class));
    }
}
