package com.example.matescuadermillorubio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * @Sebas
 */
public class MainActivity extends AppCompatActivity {
    Spinner spn;
    TextView txt1;
    TextView txt2;
    TextView simb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = findViewById(R.id.btn_jugar);
        spn = findViewById(R.id.spn_niveles);
         txt1 = findViewById(R.id.txt_numero1);
        txt2 = findViewById(R.id.txt_numero2);
        simb = findViewById(R.id.txt_simbolo);
        /*spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("mietiqueta", "Elemento seleccionado: " + position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                hacerOperacion();
            }
        });

    }
    public void hacerOperacion() {
        int opcion =  spn.getSelectedItemPosition();
        Operacion op = new Operacion();
        boolean mayorMenor =   op.crearOperacion(opcion);;
        if (mayorMenor == true){
            txt1.setText(op.setValor1());
        } else {
            txt1.setText(op.setValor2());
        }
    }
}