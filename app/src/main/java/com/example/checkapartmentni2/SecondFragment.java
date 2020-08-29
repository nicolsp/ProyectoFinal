package com.example.checkapartmentni2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.bumptech.glide.Glide;
import com.example.checkapartmentni2.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private String nombre;
    private String numero;
    private String direccion;
    private String url;
    int puntaje=0;
    int valor=0;
    int valortotal=0;
    int puntajetotal=0;


    private FragmentSecondBinding mBinding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() !=null) {
            nombre= getArguments().getString("Nombre");
            numero= getArguments().getString("Numero");
            direccion= getArguments().getString("Direccion");
            url = getArguments().getString("URL");
        }
    }



       public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        mBinding = FragmentSecondBinding.inflate(inflater,container,false);
           Glide.with(getContext()).load(url).into(mBinding.i2f);
           mBinding.rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(RadioGroup radioGroup, int i) {
                   if (mBinding.tvf4.isChecked()) {
                       puntaje+= 10;
                   }
                   if (mBinding.tvf5.isChecked()) {
                       puntaje+= 40;
                   }
                   if (mBinding.tvf6.isChecked()) {
                       puntaje+= 30;
                   }
                   if (mBinding.tvf7.isChecked()) {
                       puntaje+= 20;
                   }
                   if (mBinding.tvf10.isChecked()) {
                       valor=3;
                   }
                   if (mBinding.tvf11.isChecked()) {
                       valor=2;
                   }
                   if (mBinding.tvf12.isChecked()) {
                       valor=1;
                   }

               }

             //  public void EnviarAlerta(
               //        if(puntaje<130)
          //     ){}
           });


        return mBinding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }
}