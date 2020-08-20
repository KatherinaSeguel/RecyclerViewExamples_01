package com.crisspian.recyclerviewexamples_01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.bumptech.glide.Glide;
import com.crisspian.recyclerviewexamples_01.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private String seleccion;
    private String seleccion2;
    private FragmentSecondBinding mBinding;//se declara

    @Override
    //se sobreescribe este metodo desde code generar metodo Oncreate
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //si vienen cosas en la caja aca las rescato
        //PASO 1
        if (getArguments()!=null){
            //marca un error y se crea la segunda opcion, crea una variable de campo
            seleccion = getArguments().getString("URL");//URL nombre argumentos ya declarado
            seleccion2 = getArguments().getString("TEXT");

        }
    }



    @Override
    //devuelve un objeto vista
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        //paso 2 despues de declarar variable
        mBinding=FragmentSecondBinding.inflate(inflater,container,false);
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_second, container, false);
       // mBinding.ivDescription.setText(seleccion2);
       // Glide.with(getContext().load(seleccion1)).into(mBinding.ivDescription);

        return mBinding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}