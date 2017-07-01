package com.example.paulo.mychat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgregarContacto extends AppCompatActivity {
    EditText nombre;
    EditText apellido;
    EditText correo;
    Button editar;
    Button regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_contacto);
        final DBHelper db = new DBHelper(this);
        nombre = (EditText)findViewById(R.id.input_nombre);
        apellido = (EditText) findViewById(R.id.input_apellido);
        correo = (EditText) findViewById(R.id.input_correo);
        editar = (Button) findViewById(R.id.btn_Editar);
        regresar = (Button)findViewById(R.id.)
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.insertarContacto(nombre.getText().toString(),apellido.getText().toString(),correo.getText().toString());
                Toast.makeText(AgregarContacto.this,"El Contacto se Inserto Correctamente",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
