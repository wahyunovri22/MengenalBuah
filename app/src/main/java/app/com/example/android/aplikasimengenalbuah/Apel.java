package app.com.example.android.aplikasimengenalbuah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Apel extends AppCompatActivity {
    EditText editTextApel;
    Button btProsesApel;
    TextView hasilApel;
    String benar = "apel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apel);
        editTextApel = (EditText)findViewById(R.id.edt_buah_apel);
        btProsesApel = (Button)findViewById(R.id.bt_proses_apel);
        hasilApel = (TextView)findViewById(R.id.hasil_apel);

        btProsesApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextApel.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show();
                }
                else {
                    String jawaban = editTextApel.getText().toString();
                    if (jawaban.equals(benar)){
                        String keterangan = "Anda benar";
                        hasilApel.setText(keterangan);
                    }
                    else{
                        String keterangan = "Anda salah";
                        hasilApel.setText(keterangan);
                    }
                }

            }
        });

    }
}
