package com.example.menghitungpersegipanjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextpanjang;
    private EditText editTextlebar;
    private EditText editTextluasl;
    private Button btnHitungluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitUI();
        InitEvent();
    }

    private void InitUI() {
        editTextpanjang = (EditText) findViewById(R.id.editTextpanjang);
        editTextlebar = (EditText) findViewById(R.id.editTextlebar);
        editTextluasl = (EditText) findViewById(R.id.editTextluas);
        btnHitungluas = (Button) findViewById(R.id.btnLuas);

    }

    private void InitEvent() {
        btnHitungluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HitungLuas();
            }
        });

    }

    private void HitungLuas() {
        int panjang = Integer.parseInt(editTextpanjang.getText().toString());
        int lebar = Integer.parseInt(editTextlebar.getText().toString());
        int luas = panjang * lebar;
        editTextluasl.setText(luas + "");
    }

    public boolean onCreateOptionMenu(MenuItem item) {
        int id=item.getItemId();
        if (id ==R.id.action_setting){

            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}