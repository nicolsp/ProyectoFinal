package com.example.checkapartmentni2.Adapter;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.checkapartmentni2.Apartment;
import com.example.checkapartmentni2.R;
import com.example.checkapartmentni2.databinding.ItemLayoutBinding;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ApartViewHolder> {
    private List<Apartment> apartmentList;
    private Check mCheck;

    public Adapter(List<Apartment> apartmentList,Check mCheck) {
        this.apartmentList = apartmentList;
        this.mCheck = mCheck;
    }

    @NonNull
    @Override
    public ApartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemLayoutBinding binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ApartViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ApartViewHolder holder, int position) {
    Apartment apartment = apartmentList.get(position);
    holder.tv1.setText(apartment.getBuildingName());
    holder.tv2.setText(apartment.getUnitId());
    holder.tv3.setText(apartment.getAddress());
        Glide.with(holder.im1.getContext()).load(apartment.getUrlImageBuilding()).into(holder.im1);
    }

    @Override
    public int getItemCount() {
        return apartmentList.size();
    }


    public class ApartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView im1;
        private TextView tv1;
        private TextView tv2;
        private TextView tv3;

        public ApartViewHolder(@NonNull ItemLayoutBinding mBinding) {
            super(mBinding.getRoot());
            im1 = mBinding.im1;
            tv1 = mBinding.tv1;
            tv2 = mBinding.tv2;
            tv3 = mBinding.tv3;
            itemView.setOnClickListener(this);


        }


        @Override
        public void onClick(View view) {
            int posicion=getLayoutPosition();
            Apartment apartment = apartmentList.get(posicion);
            mCheck.passElement(apartment);
        }
    }
    public interface Check {
        void passElement(Apartment apartment);
    }
}
