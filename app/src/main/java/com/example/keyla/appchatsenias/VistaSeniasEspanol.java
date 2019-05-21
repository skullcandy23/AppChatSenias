package com.example.keyla.appchatsenias;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class VistaSeniasEspanol extends AppCompatActivity  implements TextToSpeech.OnInitListener{

    private String texto;
    private TextToSpeech textToSpeechEsp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_senias_espanol);

        textToSpeechEsp=new TextToSpeech(this,this);

        texto=getIntent().getStringExtra("texto");
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();

        TextView tvTexto=(TextView) findViewById(R.id.texto);
        tvTexto.setText(texto);

    }

    @Override
    public void onInit(int status) {
        if(status==TextToSpeech.LANG_MISSING_DATA || status==TextToSpeech.LANG_NOT_SUPPORTED){
            Toast.makeText(this, "Los datos del lenguaje estan faltando o el lenguaje no es soportado",Toast.LENGTH_SHORT).show();
        } else {
            textToSpeechEsp.setLanguage(new Locale("spa","MX"));
            textToSpeechEsp.setSpeechRate(1.0f);
            textToSpeechEsp.setPitch(1.0f);
        }
    }

    public void talk(View view){
        if(textToSpeechEsp!=null){
        textToSpeechEsp.speak(""+texto, TextToSpeech.QUEUE_FLUSH, null);
        }
    }

    @Override
    protected void onDestroy() {
        if (textToSpeechEsp!=null){
            textToSpeechEsp.stop();
            textToSpeechEsp.shutdown();
        }
        super.onDestroy();
    }
}
