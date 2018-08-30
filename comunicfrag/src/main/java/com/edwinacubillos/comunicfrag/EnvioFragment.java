package com.edwinacubillos.comunicfrag;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class EnvioFragment extends Fragment {

    private EditText eNombre, eTelefono;
    private Button bEnviar;
    comunicador interfaz;

    public EnvioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_envio, container, false);

        eNombre = view.findViewById(R.id.eNombre);
        eTelefono = view.findViewById(R.id.eTelefono);
        bEnviar = view.findViewById(R.id.bEnviar);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = eNombre.getText().toString();
                String phone = eTelefono.getText().toString();
                interfaz.envioDatos(name, phone);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            interfaz = (comunicador) activity;
        }catch (ClassCastException e){

        }
    }
}
