import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calcula extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtResultado = (TextView)findViewById(R.id.resultado);
        final EditText edtNumero1 = (EditText)findViewById(R.id.numero1);
        final EditText edtNumero2 = (EditText)findViewById(R.id.numero2);
        Button btnSuma = (Button)findViewById(R.id.btnSuma);
        Button btnResta = (Button)findViewById(R.id.btnResta);
        Button btnMulti = (Button)findViewById(R.id.btnMulti);
        Button btnDiv = (Button)findViewById(R.id.btnDivision);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Introduzca ambos número", Toast.LENGTH_LONG).show();
                    return;
                }

                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);
                aritmetica suma = new aritmetica(numero1,numero2);

                txtResultado.setText("Suma: " + String.valueOf(suma.suma()));
                //txtResultado.setText("Resultado: " + String.valueOf(numero1+numero2));
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(),"Introduza ambos número", Toast.LENGTH_LONG).show();
                    return;
                }

                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);
                aritmetica resta = new aritmetica(numero1,numero2);

                txtResultado.setText("Resta: " + String.valueOf(resta.resta()));
                //txtResultado.setText("Resultado: "+String.valueOf(numero1-numero2));
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(),"Introduza ambos número", Toast.LENGTH_LONG).show();
                    return;
                }

                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);
                aritmetica mul = new aritmetica(numero1,numero2);

                txtResultado.setText("Multiplicación: " + String.valueOf(mul.multiplicacion()));
                //txtResultado.setText("Resultado: "+String.valueOf(numero1*numero2));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(),"Introduza ambos número", Toast.LENGTH_LONG).show();
                    return;
                }

                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);
                aritmetica div = new aritmetica(numero1,numero2);

                txtResultado.setText("División: " + String.valueOf(div.division()));
                //txtResultado.setText("Resultado: "+String.valueOf(numero1/numero2));
            }
        });
    }
}
