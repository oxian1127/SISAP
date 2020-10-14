package com.cecar.edu.siga.vistas.ui.convenio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.cecar.edu.siga.R;

public class ConvenioFragment extends Fragment {

    private ConvenioViewModel convenioViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        convenioViewModel = ViewModelProviders.of(this).get(ConvenioViewModel.class);
        View root = inflater.inflate(R.layout.fragment_convenio, container, false);

        convenioViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });

        return root;
    }
}
