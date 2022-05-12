package com.android.proyecto017guardardatosenunaactividadceerrada;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SegundaActividad extends AppCompatActivity {

    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        et1 = findViewById(R.id.etxt_us);
        et2 = findViewById(R.id.etxt_pass);
    }

    public void onClickCancelar(View view) {
    }

    public void onClickConfirmar(View view) {
        Intent in = new Intent();
        in.putExtra("usuario",et1.getText().toString());
        setResult(MainActivity.RESULT_OK,in);
        finish();
    }
}