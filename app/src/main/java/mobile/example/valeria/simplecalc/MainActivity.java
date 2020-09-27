package mobile.example.valeria.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    EditText v1;
    EditText v2;
    EditText vr;
    Button soma;
    Button sub;
    Button mult;
    Button div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        vr = findViewById(R.id.vr);
        soma = findViewById(R.id.bsoma);
        sub = findViewById(R.id.bsub);
        mult = findViewById(R.id.bmult);
        div = findViewById(R.id.bdiv);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valor1;
                Double valor2;
                valor1 = Double.parseDouble(v1.getText().toString());
                valor2 = Double.parseDouble(v2.getText().toString());
                Double r = valor1 + valor2;
                vr.setText(r.toString());
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valor1;
                Double valor2;
                Double r;
                valor1 = Double.parseDouble(v1.getText().toString());
                valor2 = Double.parseDouble(v2.getText().toString());
                r = valor1 - valor2;
                vr.setText(r.toString());
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valor1;
                Double valor2;
                Double r;
                valor1 = Double.parseDouble(v1.getText().toString());
                valor2 = Double.parseDouble(v2.getText().toString());
                r = valor1 * valor2;
                vr.setText(r.toString());
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valor1;
                Double valor2;
                Double r;
                valor1 = Double.parseDouble(v1.getText().toString());
                valor2 = Double.parseDouble(v2.getText().toString());
                r = valor1/valor2;
                vr.setText(r.toString());
            }
        });
    }
}