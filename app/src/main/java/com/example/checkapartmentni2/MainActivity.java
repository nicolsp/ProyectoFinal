package com.example.checkapartmentni2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtnombre, txtpasword;
    private Button button;
    private int count =0;

   // public MainActivity(EditText txtnombre) {
    //    this.txtnombre = txtnombre;
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = (EditText) findViewById(R.id.txtcorreo);
        txtpasword = (EditText) findViewById(R.id.txtpasword);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EnviarPrincipal(view);
                Toast.makeText(MainActivity.this, "Llevas" + count + "Intentos. Solo tienes 3 oportunidades", Toast.LENGTH_SHORT).show();
            }

            public void EnviarPrincipal(View view) {
                String pasword = "";
                if (txtnombre.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Campo Correo Vacio", Toast.LENGTH_LONG).show();
                else {
                    if (txtpasword.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "Campo Contraseña Vacio", Toast.LENGTH_LONG).show();
                    } else {
                        pasword = txtpasword.getText().toString();
                        if (pasword.equals("123pass") && count < 4)
                            next();
                        count++;

                    }
                }
            }
            });
        }


    private void next() {
        Intent iniciar = new Intent(MainActivity.this, HintActivity.class);
        count=0;
        startActivity(iniciar);
    }
    }

