package com.biniyam.mypassingobjectsbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserDetailActivity extends AppCompatActivity {

    TextView nameAndAgeTv, genderTv, cityTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        nameAndAgeTv = findViewById(R.id.nameAndAge);
        genderTv = findViewById(R.id.gender);
        cityTv = findViewById(R.id.city);

        User user = getIntent().getParcelableExtra("user");
        nameAndAgeTv.setText(user.name+","+user.age);
        genderTv.setText(user.gender);
        cityTv.setText(user.city);


    }
}