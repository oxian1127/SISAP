package com.cecar.edu.siga.vistas.ui.agregarVacantes;

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

public class AgregarVacanteFragment extends Fragment {

    private AgregarVacanteViewModel agregarVacante;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        agregarVacante = ViewModelProviders.of(this).get(AgregarVacanteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_agregar_vacante, container, false);

        agregarVacante.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });

        return root;
    }
}
