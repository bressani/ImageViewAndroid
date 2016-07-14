package com.example.bressani.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView texto;
    ImageView imagem;
    Button btFoto1, btFoto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = (ImageView) findViewById(R.id.foto);

        texto = (TextView) findViewById(R.id.texto);

        btFoto1 = (Button) findViewById(R.id.btImg1);
        btFoto2 = (Button) findViewById(R.id.btImg2);


        btFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagem.setImageResource(R.drawable.android1);
                texto.setText("Imagem 1");
            }
        });

        btFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagem.setImageResource(R.drawable.android2);
                texto.setText("Imagem 2");
            }
        });
    }
}
