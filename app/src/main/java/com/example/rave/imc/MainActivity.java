package com.example.rave.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnCalculador = (Button) findViewById(R.id.btnCalcular);

           btnCalculador.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

            EditText editPesso = (EditText) findViewById(R.id.editPeso);
            EditText editAltuta = (EditText) findViewById(R.id.editAltura);
            TextView resultadoView = (TextView) findViewById(R.id.resultado);

            float Massa = Float.parseFloat(editPesso.getText().toString());
            float Altura = Float.parseFloat(editAltuta.getText().toString());

            float resultado = Massa / (Altura * Altura);


            String result = Float.toString(resultado);
            result = result.replace(",", ".");

            if (resultado < 16) {
               Toast.makeText(getApplicationContext(), "Magreza grave", Toast.LENGTH_LONG).show();
                resultadoView.setText(result);

            } else if (resultado >= 16 && resultado <= 17) {
                Toast.makeText(getApplicationContext(), "Magreza moderada", LENGTH_LONG).show();
                resultadoView.setText(result);

            } else if (resultado >= 17 && resultado <= 18.5) {
                Toast.makeText(getApplicationContext(), "Magreza leve", LENGTH_LONG).show();
                resultadoView.setText(result);

            } else if (resultado >= 18.5 && resultado <= 25) {
                Toast.makeText(getApplicationContext(), "Saudável", LENGTH_LONG).show();
                resultadoView.setText(result);

            } else if (resultado >= 25 && resultado <= 30) {
                Toast.makeText(getApplicationContext(), "Sobrepeso", LENGTH_LONG).show();
                resultadoView.setText(result);

            } else if (resultado >= 30 && resultado <= 35) {
                Toast.makeText(getApplicationContext(), "Obesidade Grau I", LENGTH_LONG).show();
                resultadoView.setText(result);

            } else if (resultado >= 35 && resultado <= 40) {
                Toast.makeText(getApplicationContext(), "Obesidade Grau II (severa)", LENGTH_LONG).show();
                resultadoView.setText(result);

            } else if (resultado < 40) {
                Toast.makeText(getApplicationContext(), "Obesidade Grau III (mórbida)", LENGTH_LONG).show();
                resultadoView.setText(result);
            }


        }

    });
}
}




