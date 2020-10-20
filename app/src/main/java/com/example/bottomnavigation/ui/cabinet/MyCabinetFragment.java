package com.example.bottomnavigation.ui.cabinet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bottomnavigation.R;

public class MyCabinetFragment extends Fragment {
    View view;
    
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_cabinet, container, false);
        return view;
    }
}