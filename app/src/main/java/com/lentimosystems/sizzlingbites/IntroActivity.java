package com.lentimosystems.sizzlingbites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.lentimosystems.sizzlingbites.Fragments.OnboardingFragmentOne;
import com.lentimosystems.sizzlingbites.Fragments.OnboardingFragmentThree;
import com.lentimosystems.sizzlingbites.Fragments.OnboardingFragmentTwo;

public class IntroActivity extends AppCompatActivity {
    ImageView logo, img;
    LottieAnimationView mLottieAnimationView;
    TextView title;
    Animation anim;

    private static final int NUM_PAGES = 3;
    private ViewPager mViewPager;
    private ScreenSlidePagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        logo = findViewById(R.id.logo);
        img = findViewById(R.id.img);
        mLottieAnimationView = findViewById(R.id.lottie);
        title = findViewById(R.id.title);



        mViewPager = findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);

        anim = AnimationUtils.loadAnimation(this,R.anim.fade_in_anim);
        mViewPager.setAnimation(anim);

        img.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        mLottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        title.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{

        public ScreenSlidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    OnboardingFragmentOne one = new OnboardingFragmentOne();
                    return one;
                case 1:
                    OnboardingFragmentTwo two = new OnboardingFragmentTwo();
                    return two;
                case 2:
                    OnboardingFragmentThree three = new OnboardingFragmentThree();
                    return three;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}