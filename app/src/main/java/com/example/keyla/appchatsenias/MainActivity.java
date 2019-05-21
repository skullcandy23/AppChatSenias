package com.example.keyla.appchatsenias;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Spinner;
        import android.widget.Toast;
        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity{

    private Spinner spinner;
    private String lenguaje="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> op=new ArrayList<String>();
        op.add("Español-Señas");
        op.add("Señas-Español");
        op.add("Aprendiendo LSM");
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,op);
        spinner=(Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                lenguaje=parent.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),lenguaje,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void escribir(View view){
        if(lenguaje.equals("Español-Señas")){
            Intent intent = new Intent(this, EspanolSenias.class);
            startActivity(intent);
        }
        if(lenguaje.equals("Señas-Español")) {
            Intent intent=new Intent(this,SeniasEspanol.class);
            startActivity(intent);
        }
        if(lenguaje.equals("Aprendiendo LSM")) {
            Intent intent=new Intent(this,ManosActivity.class);
            startActivity(intent);
        }
    }
}
