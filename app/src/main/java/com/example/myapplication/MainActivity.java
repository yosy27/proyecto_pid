package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.entity.Usuario;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etApellido, etTelefono, etEmail, etPassword;
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etTelefono = findViewById(R.id.etTelefono);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre = etNombre.getText().toString();
                String apellido = etApellido.getText().toString();
                String telefono = etTelefono.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                Usuario obj = new Usuario();
                obj.setNombre(nombre);
                obj.setApellido(apellido);
                obj.setTelefono(telefono);
                obj.setEmail(email);
                obj.setPassword(password);

                String msg = "Bienvenido \n";
                msg += "Nombres " + obj.getNombre() + "\n";
                msg += "Apellidos " + obj.getApellido() + "\n";
                msg += "Telefóno " + obj.getTelefono() + "\n";
                msg += "Email " + obj.getEmail() + "\n";
                msg += "Clave " + obj.getPassword();
            }
        });
    }

    public void mensaje(String msg){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(msg);
        alert.setTitle("Confirmación");
        alert.show();
    }

}