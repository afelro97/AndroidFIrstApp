package co.unab.edu.arodriguez474.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitulo = findViewById(R.id.tv_titulo);

        tvTitulo.setText("Estimados estudiantes");

        Log.d("ciclo_vida", "Ejecutando Oncreate");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("ciclo_vida", "Ejecutando onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo_vida", "Ejecutando onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo_vida", "Ejecutando onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("ciclo_vida", "Ejecutando onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo_vida", "Ejecutando onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ciclo_vida", "Ejecutando onRestart");
    }
}