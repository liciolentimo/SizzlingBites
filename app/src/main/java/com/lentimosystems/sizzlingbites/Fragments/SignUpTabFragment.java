package com.lentimosystems.sizzlingbites.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.lentimosystems.sizzlingbites.R;

public class SignUpTabFragment extends Fragment {
EditText email,phone,password,confirm;
Button sign_up;
float v =0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment,container,false);


        email = root.findViewById(R.id.emailSignUp);
        password = root.findViewById(R.id.passwordSignUp);
        phone = root.findViewById(R.id.phone);
        //confirm = root.findViewById(R.id.confirm_password);
        sign_up = root.findViewById(R.id.btn_signup);

//        email.setTranslationX(800);
//        password.setTranslationX(800);
//        phone.setTranslationX(800);
//        confirm.setTranslationX(800);
//        sign_up.setTranslationX(800);

//        email.setAlpha(v);
//        password.setAlpha(v);
//        phone.setAlpha(v);
//        confirm.setAlpha(v);
//        sign_up.setAlpha(v);

//        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
//        password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        phone.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        confirm.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();
//        sign_up.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(800).start();

        return root;
    }
}
