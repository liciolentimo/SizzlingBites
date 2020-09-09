package com.lentimosystems.sizzlingbites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class IntroActivity extends AppCompatActivity {
    ImageView logo, img;
    LottieAnimationView mLottieAnimationView;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        logo = findViewById(R.id.logo);
        img = findViewById(R.id.img);
        mLottieAnimationView = findViewById(R.id.lottie);
        title = findViewById(R.id.title);

        img.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        mLottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        title.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
    }
}