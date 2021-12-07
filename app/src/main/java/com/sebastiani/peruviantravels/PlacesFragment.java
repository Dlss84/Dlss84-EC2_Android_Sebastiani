package com.sebastiani.peruviantravels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class PlacesFragment extends Fragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.places_fragment, container, false);
    }
}
