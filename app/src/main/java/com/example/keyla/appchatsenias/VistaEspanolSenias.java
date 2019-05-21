package com.example.keyla.appchatsenias;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.ArrayList;

public class VistaEspanolSenias extends AppCompatActivity {

    private ArrayList<ImageView> imageViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_espanol_senias);

        String texto=getIntent().getStringExtra("texto");
        char[] textoArray=texto.toLowerCase().toCharArray();
        Toast.makeText(this,texto+" "+textoArray.length,Toast.LENGTH_SHORT).show();

        TableLayout tabla = (TableLayout) findViewById(R.id.tabla);

        int c=1;
        TableRow tableRow = new TableRow(this);
        tabla.addView(tableRow);
        for(int i = 0; i<textoArray.length; i++){
            String letra=""+textoArray[i];
            tableRow.addView(getImagen(letra));
            if(c==6) {
                tableRow = new TableRow(this);
                tabla.addView(tableRow);
                c=1;
            } else {
                c++;
            }
        }
    }

    private ImageView getImagen(String letra){
        //Toast.makeText(this,letra,Toast.LENGTH_SHORT).show();
        ImageView imageViewA=new ImageView(this);
        switch (letra){
            case "a":
                imageViewA.setImageResource(R.drawable.a);
                break;
            case "b":
                imageViewA.setImageResource(R.drawable.b);
                break;
            case "c":
                imageViewA.setImageResource(R.drawable.c);
                break;
            case "d":
                imageViewA.setImageResource(R.drawable.d);
                break;
            case "e":
                imageViewA.setImageResource(R.drawable.e);
                break;
            case "f":
                imageViewA.setImageResource(R.drawable.f);
                break;
            case "g":
                imageViewA.setImageResource(R.drawable.g);
                break;
            case "h":
                imageViewA.setImageResource(R.drawable.h);
                break;
            case "i":
                imageViewA.setImageResource(R.drawable.i);
                break;
            case "j":
                imageViewA.setImageResource(R.drawable.j);
                break;
            case "k":
                imageViewA.setImageResource(R.drawable.k);
                break;
            case "l":
                imageViewA.setImageResource(R.drawable.l);
                break;
            case "m":
                imageViewA.setImageResource(R.drawable.m);
                break;
            case "n":
                imageViewA.setImageResource(R.drawable.n);
                break;
            case "o":
                imageViewA.setImageResource(R.drawable.o);
                break;
            case "p":
                imageViewA.setImageResource(R.drawable.p);
                break;
            case "q":
                imageViewA.setImageResource(R.drawable.q);
                break;
            case "r":
                imageViewA.setImageResource(R.drawable.r);
                break;
            case "s":
                imageViewA.setImageResource(R.drawable.s);
                break;
            case "t":
                imageViewA.setImageResource(R.drawable.t);
                break;
            case "u":
                imageViewA.setImageResource(R.drawable.u);
                break;
            case "v":
                imageViewA.setImageResource(R.drawable.v);
                break;
            case "w":
                imageViewA.setImageResource(R.drawable.w);
                break;
            case "x":
                imageViewA.setImageResource(R.drawable.x);
                break;
            case "y":
                imageViewA.setImageResource(R.drawable.y);
                break;
            case "z":
                imageViewA.setImageResource(R.drawable.z);
                break;
            case "1":
                imageViewA.setImageResource(R.drawable.num10);
                break;
            case "2":
                imageViewA.setImageResource(R.drawable.n2);
                break;
            case "3":
                imageViewA.setImageResource(R.drawable.n3);
                break;
            case "4":
                imageViewA.setImageResource(R.drawable.n4);
                break;
            case "5":
                imageViewA.setImageResource(R.drawable.n5);
                break;
            case "6":
                imageViewA.setImageResource(R.drawable.n6);
                break;
            case "7":
                imageViewA.setImageResource(R.drawable.n7);
                break;
            case "8":
                imageViewA.setImageResource(R.drawable.n8);
                break;
            case "9":
                imageViewA.setImageResource(R.drawable.n9);
                break;
            case "0":
                imageViewA.setImageResource(R.drawable.n0);
                break;
            case " ":
                imageViewA.setImageResource(R.drawable.esp);
                break;
        }
        imageViewA.setMaxWidth(10);
        imageViewA.setMaxHeight(10);
        return imageViewA;
    }

}
