package pe.edu.upeu.calculadora_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista {
    private Main.Presentador presentador;
    private Button buttonsuma, buttonresta ,buttonmulti,buttondivi;
    private TextView tvr;
    private EditText edt1;
    private EditText edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new CalculadoraPresentador(this);
        edt1 = (EditText) findViewById(R.id.txtn1);

        edt2 = (EditText) findViewById(R.id.txtn2);

        tvr = (TextView) findViewById(R.id.tvr);
        buttonsuma = (Button) findViewById(R.id.btnsuma);
        buttonresta = (Button) findViewById(R.id.btnresta);
        buttonmulti = (Button) findViewById(R.id.btnmulti);
        buttondivi= (Button) findViewById(R.id.btndivi);
        buttonsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        presentador.calcularSuma(edt1.getText().toString(),edt2.getText().toString());
            }
        });
        buttonresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.calcularResta(edt1.getText().toString(),edt2.getText().toString());
            }
        });
        buttonmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.calcularMultiplicacion(edt1.getText().toString(),edt2.getText().toString());
            }
        });
        buttondivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.calcularDivision(edt1.getText().toString(),edt2.getText().toString());
            }
        });
    }

    @Override
    public void mostrarResultado(String r) {
        tvr.setText(r);
        edt1.setText(null);
        edt2.setText(null);

        //Toast.makeText(getApplicationContext(), "Factorial:"+r,Toast.LENGTH_LONG).show();
    }
}
