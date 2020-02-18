package com.example.tugasku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class hitungLuas extends AppCompatActivity {
    private Button btnHitung;
    private TextView tvHasil;
    private EditText etJari;
    private static final double PHI = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_luas);
        btnHitung = findViewById(R.id.btn_hitung);
        etJari = findViewById(R.id.et_jari);
        tvHasil = findViewById(R.id.tv_hasil);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double dJari_jari = Double.parseDouble(etJari.getText().toString());
                    double dHasil = PHI * dJari_jari * dJari_jari;
                    String sHasil = String.valueOf(dHasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
