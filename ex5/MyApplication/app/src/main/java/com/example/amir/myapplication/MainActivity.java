package com.example.amir.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity   {
    RecyclerView rcv;
    EtudiantAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv=(RecyclerView)findViewById(R.id.rcv);
        List<Etudiant>data=genererEtudiant();
        myAdapter=new EtudiantAdapter(MainActivity.this,data);
        rcv.setLayoutManager(new LinearLayoutManager(MainActivity.this));


        rcv.setAdapter(myAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if ( id==R.id.yajbekchi)
            Toast.makeText(getApplicationContext(),"ajout",Toast.LENGTH_LONG).show();


        if ( id==R.id.delete)
            Toast.makeText(getApplicationContext(),"suppression",Toast.LENGTH_LONG).show();

        if ( id==R.id.search)
            Toast.makeText(getApplicationContext(),"recherche",Toast.LENGTH_LONG).show();




        return super.onOptionsItemSelected(item);
    }



    private List<Etudiant>genererEtudiant()
    {
        List<Etudiant>etudiants=new ArrayList<Etudiant>() ;
        etudiants.add(new Etudiant("amir","amirensit@gmail.com",5,R.drawable.a ) ) ;
        etudiants.add(new Etudiant("safa","safaBenNasr@gmail.com",4,R.drawable.b ) );
        etudiants.add(new Etudiant("nedia","nediaGader@gmail.com",0,R.drawable.picture));
        etudiants.add(new Etudiant("alah","nediaGader@gmail.com",0,R.drawable.d));
        etudiants.add(new Etudiant("akbar","nediaGader@gmail.com",0,R.drawable.b));
        etudiants.add(new Etudiant("mohamed","nediaGader@gmail.com",10,R.drawable.c));
        etudiants.add(new Etudiant("ayhem","nediaGader@gmail.com",0,R.drawable.d));
        etudiants.add(new Etudiant("manassa","nediaGader@gmail.com",0,R.drawable.a));
        etudiants.add(new Etudiant("bahria","nediaGader@gmail.com",2,R.drawable.a));
        etudiants.add(new Etudiant("ahmed","nediaGader@gmail.com",7,R.drawable.d));
        etudiants.add(new Etudiant("mouna","nediaGader@gmail.com",9,R.drawable.picture));
        etudiants.add(new Etudiant("imen","nediaGader@gmail.com",4,R.drawable.c));
        etudiants.add(new Etudiant("sihem","nediaGader@gmail.com",8,R.drawable.b));





        return  etudiants;

    }






}
