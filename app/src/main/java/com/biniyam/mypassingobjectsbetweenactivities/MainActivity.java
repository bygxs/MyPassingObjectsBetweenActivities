package com.biniyam.mypassingobjectsbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nameTV, ageTV, cityTV, genderTV;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTV = findViewById(R.id.nameTV);
        ageTV = findViewById(R.id.ageTV);
        cityTV = findViewById(R.id.cityTV);
        genderTV = findViewById(R.id.genderTV);

        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameTV.getText().toString();
                String age = ageTV.getText().toString();
                String city = cityTV.getText().toString();
                String gender = genderTV.getText().toString();

                User user = new User(name,age,city,gender);

                Intent intent = new Intent(MainActivity.this,UserDetailActivity.class);
                intent.putExtra("user",user);
                startActivity(intent);

            }
        });






    }

}