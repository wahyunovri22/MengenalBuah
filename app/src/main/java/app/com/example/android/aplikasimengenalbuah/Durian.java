package app.com.example.android.aplikasimengenalbuah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Durian extends AppCompatActivity {
    EditText editTextDurian;
    Button btProsesDurian;
    TextView hasilDurian;
    String benar = "durian";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durian);

        editTextDurian = (EditText) findViewById(R.id.edt_buah_durian);
        btProsesDurian = (Button)findViewById(R.id.bt_proses_durian);
        hasilDurian = (TextView)findViewById(R.id.hasil_durian);

        btProsesDurian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextDurian.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show();
                }
                else {
                    String jawaban = editTextDurian.getText().toString();
                    if (jawaban.equals(benar)){
                        String keterangan = "Anda benar";
                        hasilDurian.setText(keterangan);
                    }
                    else{
                        String keterangan = "Anda salah";
                        hasilDurian.setText(keterangan);
                    }
                }
            }
        });
    }
}
