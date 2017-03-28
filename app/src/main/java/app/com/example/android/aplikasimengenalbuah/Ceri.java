package app.com.example.android.aplikasimengenalbuah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ceri extends AppCompatActivity {
    EditText editTextCeri;
    Button btProsesCeri;
    TextView hasilCeri;
    String benar = "ceri";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceri);

        editTextCeri = (EditText)findViewById(R.id.edt_buah_ceri);
        btProsesCeri = (Button)findViewById(R.id.bt_proses_ceri);
        hasilCeri = (TextView)findViewById(R.id.hasil_ceri);

        btProsesCeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextCeri.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show();
                }
                else {
                    String jawaban = editTextCeri.getText().toString();
                    if (jawaban.equals(benar)){
                        String keterangan = "Anda benar";
                        hasilCeri.setText(keterangan);
                    }
                    else{
                        String keterangan = "Anda salah";
                        hasilCeri.setText(keterangan);
                    }
                }

            }

        });
    }
}
