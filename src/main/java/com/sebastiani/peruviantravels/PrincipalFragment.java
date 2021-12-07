package com.sebastiani.peruviantravels;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

public class PrincipalFragment extends Fragment {


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.principal_fragment,container,false);


        MaterialButton goButton= view.findViewById(R.id.button_go);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ((NavigateHost) getActivity()).navigateTo(new PlacesFragment(), false);
               
            }
        });



        return view;
    }
}
