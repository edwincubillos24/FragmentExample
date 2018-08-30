package com.edwinacubillos.comunicfrag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecepcionFragment extends Fragment {

    private TextView tNombre, tTelefono;

    public RecepcionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recepcion, container, false);

        tNombre = view.findViewById(R.id.tNombre);
        tTelefono = view.findViewById(R.id.tTelefono);

        Bundle bundle = getArguments();
        String name = bundle.getString("nombre");
        String telefono = bundle.getString("telefono");

        tNombre.setText(name);
        tTelefono.setText(telefono);


        return view;
    }

}
