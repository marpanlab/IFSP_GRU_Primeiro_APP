package com.ifsp.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    private ConstraintLayout layout;
    private Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//randomize color background 1/2
        layout = findViewById(R.id.layout);
        click = findViewById(R.id.click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//transform text into number counter ------
                i++;
                TextView txtTela = findViewById(R.id.txtcontador);
                txtTela.setText(String.valueOf(i));
//randomize color background 2/2
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                layout.setBackgroundColor(color);
//end
            }
        });
    }
}


