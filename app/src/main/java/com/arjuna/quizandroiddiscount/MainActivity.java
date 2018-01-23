package com.arjuna.quizandroiddiscount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etharga, etjumlah;
    TextView txthasil;
    Button btnhasill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etharga = (EditText)findViewById(R.id.etharga);
        etjumlah = (EditText)findViewById(R.id.etjumlah);
        btnhasill = (Button)findViewById(R.id.btnhasil);
        txthasil = (TextView)findViewById(R.id.txthasil);

        btnhasill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nharga = etharga.getText().toString();
                String njumlah = etjumlah.getText().toString();

                int aharga = Integer.parseInt(nharga);
                int ajumlah = Integer.parseInt(njumlah);

                int total = aharga * ajumlah;
                int totaldiskon = total / 2;


                if (ajumlah >= 10){
                    txthasil.setText("Harga Total :" + total + "\nHarga Diskon: " + totaldiskon);
                    Toast.makeText(getApplicationContext(), "You Get a Discount 50 %", Toast.LENGTH_LONG).show();

                }else if (ajumlah <= 10){
                    txthasil.setText("Total : " + total);
                    Toast.makeText(getApplicationContext(), "You not get a Discount", Toast.LENGTH_LONG).show();

                }


            }
        });


    }
}
