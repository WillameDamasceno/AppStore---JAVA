package com.example.willstore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    ArrayList<MyEquipGamer> equipGamers;
    Context context;

    public MyAdapter(ArrayList<MyEquipGamer> myEquipGamers,Context context) {
        this.equipGamers = myEquipGamers;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_item_list,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Object currentEquip = equipGamers.get(position);
        MyEquipGamer myEquipGamer = equipGamers.get(position);
        holder.bindTo((MyEquipGamer) currentEquip);
        holder.button_desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(context, DescActivity.class);
                bundle.putSerializable("produto",myEquipGamer);
                intent.putExtras(bundle);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return equipGamers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView gamerImg;
        TextView textDesc;
        TextView textPreco;
        Button button_desc;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gamerImg = itemView.findViewById(R.id.img_monitor);
            textDesc = itemView.findViewById(R.id.tv_desc);
            textPreco = itemView.findViewById(R.id.tv_preco);
            button_desc = itemView.findViewById(R.id.button_desc);

        }

        // Função que faz o bind
        public void bindTo(MyEquipGamer Equip) {
            textDesc.setText(Equip.getTextDesc());
            textPreco.setText(Equip.getTextPreco());
            gamerImg.setImageResource(Equip.getGamerImg());
        }

        // Passar o OnClick pra dentro do ViewHolder

    }
}