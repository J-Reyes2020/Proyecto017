package com.android.proyecto017guardardatosenunaactividadceerrada;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtv1 = findViewById(R.id.txt_vista1);
    }

    public void onClickLogin(View view) {
        Intent i = new Intent(this, SegundaActividad.class);
        startActivityForResult(i, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 100) {
            if (resultCode == MainActivity.RESULT_OK) {
                Bundle datos = data.getExtras();
                txtv1.setText(datos.getString("usuario"));
            }
        }
    }
}