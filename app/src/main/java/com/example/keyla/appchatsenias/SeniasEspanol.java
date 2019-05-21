package com.example.keyla.appchatsenias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.ArrayList;

public class SeniasEspanol extends AppCompatActivity {

    private TableLayout tabla;
    private TableRow tableRow;
    private int c = 0;
    private String texto = "";
    private ImageView imageViewA;
    private ArrayList<ImageView> imageViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senias_espanol);

        tabla = (TableLayout) findViewById(R.id.tabla);

        tableRow = new TableRow(this);
        tabla.addView(tableRow);

        imageViews=new ArrayList<>();

    }

    public void limpiar(View view){
        tabla.removeAllViews();
        c=0;
        texto="";
        tabla=null;
        tabla = (TableLayout) findViewById(R.id.tabla);
        tableRow = new TableRow(this);
        tabla.addView(tableRow);
        imageViews=new ArrayList<>();
    }

    public void traducir(View view){
        Intent intent=new Intent(this, VistaSeniasEspanol.class);
        intent.putExtra("texto",texto);
        startActivity(intent);
    }

    public void borrar(View view){
        if(imageViews.size()>0) {
            tableRow.removeView(imageViews.get(imageViews.size() - 1));
            imageViews.remove(imageViews.get(imageViews.size() - 1));
        }
        char[] textoArray=texto.toCharArray();
        texto="";
        for (int i=0;i<textoArray.length-1;i++){
            texto+=textoArray[i];
        }
        c--;
        //Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
    }

    public void writeA(View view){
        ImageView imageView=getImagen("A");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c>5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeB(View view){
        ImageView imageView=getImagen("B");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeC(View view){
        ImageView imageView=getImagen("C");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeD(View view){
        ImageView imageView=getImagen("D");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeE(View view){
        ImageView imageView=getImagen("E");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeF(View view){
        ImageView imageView=getImagen("F");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeG(View view){
        ImageView imageView=getImagen("G");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeH(View view){
        ImageView imageView=getImagen("H");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeI(View view){
        ImageView imageView=getImagen("I");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeJ(View view){
        ImageView imageView=getImagen("J");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeK(View view){
        ImageView imageView=getImagen("K");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeL(View view){
        ImageView imageView=getImagen("L");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeM(View view){
        ImageView imageView=getImagen("M");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeN(View view){
        ImageView imageView=getImagen("N");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeO(View view){
        ImageView imageView=getImagen("O");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeP(View view){
        ImageView imageView=getImagen("P");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeQ(View view){
        ImageView imageView=getImagen("Q");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeR(View view){
        ImageView imageView=getImagen("R");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeS(View view){
        ImageView imageView=getImagen("S");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeT(View view){
        ImageView imageView=getImagen("T");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeU(View view){
        ImageView imageView=getImagen("U");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeV(View view){
        ImageView imageView=getImagen("V");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeW(View view){
        ImageView imageView=getImagen("W");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeX(View view){
        ImageView imageView=getImagen("X");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeY(View view){
        ImageView imageView=getImagen("Y");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void writeZ(View view){
        ImageView imageView=getImagen("Z");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write1(View view){
        ImageView imageView=getImagen("1");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write2(View view){
        ImageView imageView=getImagen("2");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write3(View view){
        ImageView imageView=getImagen("3");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write4(View view){
        ImageView imageView=getImagen("4");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write5(View view){
        ImageView imageView=getImagen("5");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write6(View view){
        ImageView imageView=getImagen("6");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write7(View view){
        ImageView imageView=getImagen("7");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write8(View view){
        ImageView imageView=getImagen("8");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write9(View view){
        ImageView imageView=getImagen("9");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }

    public void write0(View view){
        ImageView imageView=getImagen("0");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }
    public void writeEsp(View view){
        ImageView imageView=getImagen(" ");
        imageViews.add(imageView);
        tableRow.addView(imageView);
        c++;
        if(c==5){
            tableRow = new TableRow(this);
            tabla.addView(tableRow);
            c=0;
        }
    }
    private ImageView getImagen(String letra){
        //Toast.makeText(this,letra,Toast.LENGTH_SHORT).show();
        texto+=letra;
        imageViewA=new ImageView(this);
        switch (letra.toLowerCase()){
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
