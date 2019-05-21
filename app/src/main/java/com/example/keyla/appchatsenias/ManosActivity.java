package com.example.keyla.appchatsenias;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class ManosActivity extends AppCompatActivity  implements TextToSpeech.OnInitListener {


    private TextToSpeech textToSpeechEsp;
    private TextView tvTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manos);

        textToSpeechEsp = new TextToSpeech(this, (TextToSpeech.OnInitListener) this);

        tvTexto = (TextView) findViewById(R.id.tvTexto);
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.LANG_MISSING_DATA || status == TextToSpeech.LANG_NOT_SUPPORTED) {
            Toast.makeText(this, "Los datos del lenguaje estan faltando o el lenguaje no es soportado", Toast.LENGTH_SHORT).show();
        } else {
            textToSpeechEsp.setLanguage(new Locale("spa", "MX"));
            textToSpeechEsp.setSpeechRate(1.0f);
            textToSpeechEsp.setPitch(1.0f);
        }
    }

    @Override
    protected void onDestroy() {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.stop();
            textToSpeechEsp.shutdown();
        }
        super.onDestroy();
    }

    public void doWriteTalkA(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("A", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("A");
        }
    }

    public void doWriteTalkB(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("B", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("B");
        }
    }

    public void doWriteTalkC(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("C", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("C");
        }
    }

    public void doWriteTalkD(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("D", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("D");
        }
    }

    public void doWriteTalkE(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("E", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("E");
        }
    }

    public void doWriteTalkF(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("F", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("F");
        }
    }

    public void doWriteTalkG(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("G", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("G");
        }
    }

    public void doWriteTalkH(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("H", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("H");
        }
    }

    public void doWriteTalkI(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("I", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("I");
        }
    }

    public void doWriteTalkJ(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("J", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("J");
        }
    }

    public void doWriteTalkK(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("K", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("K");
        }
    }

    public void doWriteTalkL(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("L", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("L");
        }
    }

    public void doWriteTalkM(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("M", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("M");
        }
    }

    public void doWriteTalkN(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("N", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("N");
        }
    }

    public void doWriteTalkO(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("O", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("O");
        }
    }

    public void doWriteTalkP(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("P", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("P");
        }
    }

    public void doWriteTalkQ(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("Q", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Q");
        }
    }

    public void doWriteTalkR(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("R", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("R");
        }
    }

    public void doWriteTalkS(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("S", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("S");
        }
    }

    public void doWriteTalkT(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("T", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("T");
        }
    }

    public void doWriteTalkU(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("U", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("U");
        }
    }

    public void doWriteTalkV(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("V", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("V");
        }
    }

    public void doWriteTalkW(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("W", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("W");
        }
    }

    public void doWriteTalkX(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("X", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("X");
        }
    }

    public void doWriteTalkY(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("Y", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Y");
        }
    }

    public void doWriteTalkZ(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("Z", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Z");
        }
    }

    public void doWriteTalk1(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("1", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Uno");
        }
    }

    public void doWriteTalk2(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("2", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Dos");
        }
    }

    public void doWriteTalk3(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("3", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Tres");
        }
    }

    public void doWriteTalk4(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("4", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Cuatro");
        }
    }

    public void doWriteTalk5(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("5", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Cinco");
        }
    }

    public void doWriteTalk6(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("6", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Seis");
        }
    }

    public void doWriteTalk7(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("7", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Siete");
        }
    }

    public void doWriteTalk8(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("8", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Ocho");
        }
    }

    public void doWriteTalk9(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("9", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Nueve");
        }
    }
    public void doWriteTalk0(View view) {
        if (textToSpeechEsp != null) {
            textToSpeechEsp.speak("0", TextToSpeech.QUEUE_FLUSH, null);
            tvTexto.setText("Cero");
        }
    }

}
