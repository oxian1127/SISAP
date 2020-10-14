package com.cecar.edu.siga.vistas.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.cecar.edu.siga.R;
import com.cecar.edu.siga.administrador.AgregarCoordinadorPractica;
import com.cecar.edu.siga.administrador.GestionarCordinador;
import com.cecar.edu.siga.administrador.GestionarEstudianteFragment;
import com.cecar.edu.siga.vistas.ui.agregarVacantes.AgregarVacanteFragment;
import com.cecar.edu.siga.vistas.ui.convenio.ConvenioFragment;

public class HomeFragment extends Fragment implements View.OnClickListener {

    //botones de control de datos
    private Button btnGestionarEstudiante;
    private Button btnAgregarVacante;
    private Button btnAgregarConvenio;
    private Button btnAgregarCordinador;
    private Button btnGestionarCordinador;


    private TextView textViewConocer_mas;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        textViewConocer_mas = root.findViewById(R.id.txtConocerMas);
        SpannableString content = new SpannableString(textViewConocer_mas.getText());
        content.setSpan(new UnderlineSpan(), 0, textViewConocer_mas.length(), 0);
        textViewConocer_mas.setText(content);
        textViewConocer_mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/file/d/1hbgcCrF6ViGlmxjFFSe9S9Nc-gGkIy3l/view?usp=sharing"));
                startActivity(i);
            }
        });


        //Asociacion de los botones con java
        btnGestionarEstudiante = root.findViewById(R.id.btnGestionarEstudiante);
        btnAgregarVacante = root.findViewById(R.id.btnAgregarVacante);
        btnAgregarConvenio = root.findViewById(R.id.btnAgregarConvenio);
        btnAgregarCordinador = root.findViewById(R.id.btnAgregarCoordinador);
        btnGestionarCordinador = root.findViewById(R.id.btnGestionarCoordinador);

        btnGestionarEstudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tbtnGestionarEstudiante = Toast.makeText(getContext(), "Modulo Gestion Estudiante", Toast.LENGTH_SHORT);
                tbtnGestionarEstudiante.show();

                /*nav_host_fragment
                Fragment desde donde se montan los otros fragment
                 */

                GestionarEstudianteFragment fragmentGestionarEstudiante = new GestionarEstudianteFragment();
                FragmentTransaction fragmentDestino = getFragmentManager().beginTransaction();
                fragmentDestino.replace(R.id.nav_host_fragment, fragmentGestionarEstudiante);
                fragmentDestino.addToBackStack(null);
                fragmentDestino.commit();

            }
        });


        btnAgregarVacante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tbtnAgregarOferta = Toast.makeText(getContext(), "Modulo Agregar Oferta", Toast.LENGTH_SHORT);
                tbtnAgregarOferta.show();

                AgregarVacanteFragment fragmentAgregarVacante = new AgregarVacanteFragment();
                FragmentTransaction fragmentDestino = getFragmentManager().beginTransaction();
                fragmentDestino.replace(R.id.nav_host_fragment, fragmentAgregarVacante);
                fragmentDestino.addToBackStack(null);
                fragmentDestino.commit();
            }
        });

        btnAgregarConvenio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tbtnAgregarConvenio = Toast.makeText(getContext(), "Modulo Agregar Convenio", Toast.LENGTH_SHORT);
                tbtnAgregarConvenio.show();

                ConvenioFragment fragmentagregarvacante = new ConvenioFragment();
                FragmentTransaction fragmentDestino = getFragmentManager().beginTransaction();
                fragmentDestino.replace(R.id.nav_host_fragment, fragmentagregarvacante);
                fragmentDestino.addToBackStack(null);
                fragmentDestino.commit();

            }
        });

        btnAgregarCordinador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tbtnAgregarConvenio = Toast.makeText(getContext(), "Modulo Agregar Cordinador", Toast.LENGTH_SHORT);
                tbtnAgregarConvenio.show();

                AgregarCoordinadorPractica fragmentAgregarCordinador = new AgregarCoordinadorPractica();
                FragmentTransaction fragmentDestino = getFragmentManager().beginTransaction();
                fragmentDestino.replace(R.id.nav_host_fragment, fragmentAgregarCordinador);
                fragmentDestino.addToBackStack(null);
                fragmentDestino.commit();
            }
        });

        btnGestionarCordinador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tbtnGestionarCordinador = Toast.makeText(getContext(), "Modulo Gestionar Coordinador", Toast.LENGTH_SHORT);
                tbtnGestionarCordinador.show();

                GestionarCordinador fragmentGestionarCordinador = new GestionarCordinador();
                FragmentTransaction fragmentDestino = getFragmentManager().beginTransaction();
                fragmentDestino.replace(R.id.nav_host_fragment, fragmentGestionarCordinador);
                fragmentDestino.addToBackStack(null);
                fragmentDestino.commit();

            }
        });

        return root;
    }

    @Override
    public void onClick(View v) {

    }
}
