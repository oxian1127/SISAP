package com.cecar.edu.siga.administrador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.cecar.edu.siga.R;

public class ConfiguracionApp extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gestionar_estudiante, container, false);
    }

    @Override
    public void onClick(View v) {

    }
}
