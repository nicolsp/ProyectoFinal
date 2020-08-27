package com.example.checkapartmentni2;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.checkapartmentni2.Adapter.Adapter;
import com.example.checkapartmentni2.databinding.FragmentFirstBinding;
import com.google.android.material.internal.FlowLayout;

public class FirstFragment extends Fragment implements Adapter.Check {
    private RecyclerView mRecycler;
    private Adapter mAdapter;
    private FragmentFirstBinding mBinding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       mBinding = FragmentFirstBinding.inflate(inflater,container,false);
       mRecycler = mBinding.idR;
       mAdapter = new Adapter(ApartmentData.apartmentList(),this);
       mRecycler.setLayoutManager(new GridLayoutManager(getContext(),2));
       mRecycler.setAdapter(mAdapter);
       return mBinding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

     /*   view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        } ); */
    }

    @Override
    public void passElement(Apartment apartment) {
        Bundle mbundle = new Bundle();
        mbundle.putString("Nombre", apartment.getBuildingName());
        mbundle.putString("Numero",apartment.getUnitId());
        mbundle.putString("Direccion",apartment.getAddress());
        mbundle.putString("URL", apartment.getUrlImageBuilding());
        Navigation.findNavController(mBinding.getRoot()).navigate(R.id.action_FirstFragment_to_SecondFragment,mbundle);
    }
}

