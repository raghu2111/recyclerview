package com.example.bikeview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bikeview.R;
import com.example.bikeview.model.bikeModel;

import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.BikeViewHolder> {

    List<bikeModel> bikeModelList;

    public MyCustomAdapter(List<bikeModel> bikeModelList) {
        this.bikeModelList = bikeModelList;
    }


    @NonNull
    @Override
    public MyCustomAdapter.BikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return new BikeViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomAdapter.BikeViewHolder holder, int position) {
 bikeModel bikeModel=bikeModelList.get(position);

        holder.textView.setText(bikeModel.getBikeName());
        holder.textView.setText(bikeModel.getBikePrice());
        holder.imageView.setImageResource(bikeModel.getBikeImage());

    }

    @Override
    public int getItemCount() {
        return bikeModelList.size();
    }

    public static class BikeViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        public BikeViewHolder(@NonNull View itemView) {
            super(itemView);

            textView= itemView.findViewById(R.id.name);
            textView=itemView.findViewById(R.id.price);
            imageView= itemView.findViewById(R.id.image);

        }
    }

}
