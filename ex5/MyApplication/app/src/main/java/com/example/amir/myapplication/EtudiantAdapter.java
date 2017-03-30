package com.example.amir.myapplication;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

public class EtudiantAdapter extends RecyclerView.Adapter<EtudiantAdapter.EtudiantHolder>
{
     Context context;
    private LayoutInflater inflater;
    List<Etudiant>data= Collections.emptyList();
    Etudiant etudiant;

    public EtudiantAdapter(Context context,List<Etudiant>data) {
        this.context=context;
        inflater=LayoutInflater.from(context);
        this.data=data;
    }

    @Override
    public EtudiantHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.etudiantlayout,parent,false);
        EtudiantHolder holder=new EtudiantHolder(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(EtudiantHolder holder, int position) {
       etudiant=data.get(position);
        holder.nom.setText(etudiant.getNom());
        holder.abs.setText(""+etudiant.getAbs());
        holder.email.setText(etudiant.getEmail());
        holder.avatar.setImageResource(etudiant.getPic());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class EtudiantHolder extends RecyclerView.ViewHolder implements View.OnClickListener    {
        public TextView nom;
        public TextView email;
        public TextView abs;
        public ImageView avatar;



        public EtudiantHolder( View itemview) {

            super(itemview);
            itemview.setOnClickListener(this);
            nom = (TextView) itemview.findViewById(R.id.nom);
            email = (TextView) itemview.findViewById(R.id.email);
            abs = (TextView) itemview.findViewById(R.id.abs);
            avatar = (ImageView) itemview.findViewById(R.id.avatar);

        }


        @Override
        public void onClick(View v) {
            Toast.makeText(context,nom.getText(),Toast.LENGTH_SHORT).show();
        }


    }
}
