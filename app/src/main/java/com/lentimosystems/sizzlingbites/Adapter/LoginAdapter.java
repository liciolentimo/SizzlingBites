package com.lentimosystems.sizzlingbites.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.lentimosystems.sizzlingbites.Fragments.LoginTabFragment;
import com.lentimosystems.sizzlingbites.Fragments.SignUpTabFragment;

public class LoginAdapter extends FragmentPagerAdapter {
    private Context mContext;
    int totaltabs;

    public LoginAdapter(@NonNull FragmentManager fm, Context context, int totaltabs) {
        super(fm);
        mContext = context;
        this.totaltabs = totaltabs;
    }

    @Override
    public int getCount() {
        return totaltabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;
            case 1:
                SignUpTabFragment signUpTabFragment = new SignUpTabFragment();
                return signUpTabFragment;
            default:
                return null;
        }
    }
}
