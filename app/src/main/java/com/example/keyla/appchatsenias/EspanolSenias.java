package com.example.keyla.appchatsenias;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EspanolSenias extends AppCompatActivity {

    private TextToSpeech textToSpeechEsp;
    private TextView tvTexto;
    private String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espanol_senias);

        tvTexto=(TextView) findViewById(R.id.tvTexto);

    }

    public void limpiar(View view){
        tvTexto.setText("");
    }

    public void borrar(View view){
        texto=tvTexto.getText().toString();
        char[] textoArray=texto.toCharArray();
        texto="";
        for (int i=0;i<textoArray.length-1;i++){
            texto+=textoArray[i];
        }
        tvTexto.setText(texto);
    }

    public void traducir(View view){
        Intent intent=new Intent(this, VistaEspanolSenias.class);
        intent.putExtra("texto",tvTexto.getText().toString());
        startActivity(intent);
    }

    public void talkAndWriteA(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"A");
    }

    public void talkAndWriteB(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"B");
    }

    public void talkAndWriteC(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"C");
    }

    public void talkAndWriteD(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"D");
    }

    public void talkAndWriteE(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"E");
    }

    public void talkAndWriteF(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"F");
    }

    public void talkAndWriteG(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"G");
    }

    public void talkAndWriteH(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"H");
    }

    public void talkAndWriteI(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"I");
    }

    public void talkAndWriteJ(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"J");
    }

    public void talkAndWriteK(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"K");
    }

    public void talkAndWriteL(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"L");
    }

    public void talkAndWriteM(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"M");
    }

    public void talkAndWriteN(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"N");
    }

    public void talkAndWriteO(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"O");
    }

    public void talkAndWriteP(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"P");
    }

    public void talkAndWriteQ(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"Q");
    }

    public void talkAndWriteR(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"R");
    }

    public void talkAndWriteS(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"S");
    }

    public void talkAndWriteT(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"T");
    }

    public void talkAndWriteU(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"U");
    }

    public void talkAndWriteV(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"V");
    }

    public void talkAndWriteW(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"W");
    }

    public void talkAndWriteX(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"X");
    }

    public void talkAndWriteY(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"Y");
    }

    public void talkAndWriteZ(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"Z");
    }

    public void talkAndWrite1(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"1");
    }

    public void talkAndWrite2(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"2");
    }

    public void talkAndWrite3(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"3");
    }

    public void talkAndWrite4(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"4");
    }

    public void talkAndWrite5(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"5");
    }

    public void talkAndWrite6(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"6");
    }

    public void talkAndWrite7(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"7");
    }

    public void talkAndWrite8(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"8");
    }

    public void talkAndWrite9(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"9");
    }

    public void talkAndWrite0(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+"0");
    }

    public void talkAndWriteEsp(View view){
        texto=tvTexto.getText().toString();
        tvTexto.setText(texto+" ");
    }

}

