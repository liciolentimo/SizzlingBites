package com.lentimosystems.sizzlingbites.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.lentimosystems.sizzlingbites.R;

public class LoginTabFragment extends Fragment {
    EditText email,password;
    TextView forgot;
    Button login;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

        email = root.findViewById(R.id.email);
        password = root.findViewById(R.id.password);
        forgot = root.findViewById(R.id.forgot);
        login = root.findViewById(R.id.btn_login);

//        email.setTranslationX(800);
//        password.setTranslationX(800);
//        forgot.setTranslationX(800);
//        login.setTranslationX(800);
//
//        email.setAlpha(v);
//        password.setAlpha(v);
//        forgot.setAlpha(v);
//        login.setAlpha(v);
//
//        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
//        password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        forgot.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        login.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}
