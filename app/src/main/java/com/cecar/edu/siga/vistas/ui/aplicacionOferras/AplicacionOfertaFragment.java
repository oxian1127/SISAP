package com.cecar.edu.siga.vistas.ui.aplicacionOferras;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.cecar.edu.siga.R;

public class AplicacionOfertaFragment extends Fragment {

    private AplicacionOfertaViewModel aplicacionOferta;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        aplicacionOferta = ViewModelProviders.of(this).get(AplicacionOfertaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_aplicacion_ofertas, container, false);

        return root;
    }
}
