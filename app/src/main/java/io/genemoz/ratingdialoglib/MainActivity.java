package io.genemoz.ratingdialoglib;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import io.genemoz.ratingdialog.RatingUtils;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.showDialog);

        button.setOnClickListener(v -> {
            RatingUtils ratingUtils = new RatingUtils(this);
            ratingUtils.setDialog();
            ratingUtils.showDialog();

        });

        RatingUtils ratingUtils = new RatingUtils(this);
        ratingUtils.setTargetLaunchCount(3);
        ratingUtils.startLaunchCounting(true);
        ratingUtils.setDialog();


    }
}