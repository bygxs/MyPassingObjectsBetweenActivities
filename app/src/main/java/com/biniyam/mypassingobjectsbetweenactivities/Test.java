package com.biniyam.mypassingobjectsbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
/*

        // Passing Normal simple variables
        Intent intent = new Intent(Test.this, UserDetailActivity.class);
        intent.putExtra("name","Pro Grammer");
        intent.putExtra("age","22");
        intent.putExtra("city","Bangalor");
        startActivity(intent);

*/


    }
}