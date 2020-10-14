package com.cecar.edu.siga.vistas.ui.preinscripcion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.cecar.edu.siga.R;

public class PreInscripcionFragment extends Fragment {

    private PreInscripcionViewModel preInscripcionViewModel;
    private Button btnRegistrar;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        preInscripcionViewModel = ViewModelProviders.of(this).get(PreInscripcionViewModel.class);

        View root = inflater.inflate(R.layout.fragment_pre_inscripcion, container, false);

        return root;
    }
}
