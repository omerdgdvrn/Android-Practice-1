package com.example.soru1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnhesapla;
    EditText editSayi1;
    EditText editSayi2;
    EditText editSayi3;
    EditText editSayi4;
    TextView textResult;
    RadioButton radiomin;
    RadioButton radiomax;
    RadioButton radioaverage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editSayi1=findViewById(R.id.editTextSayi1);
        editSayi2=findViewById(R.id.editTextSayi2);
        editSayi3=findViewById(R.id.editTextSayi3);
        editSayi4=findViewById(R.id.editTextSayi4);
        btnhesapla=findViewById(R.id.btnHesapla);
        radiomin=findViewById(R.id.radiomin);
        radiomax=findViewById(R.id.radiomax);
        radioaverage=findViewById(R.id.radioaverage);
        textResult=findViewById(R.id.textResult);
        initUI();



    }

    private void initUI() {
        btnhesapla.setOnClickListener(v -> hesaplaClicked());


    }
    public void hesaplaClicked(){
        double average;
        int min;
        int max;
        if (!editSayi1.getText().toString().equals("") && !editSayi2.getText().toString().equals("") && !editSayi3.getText().toString().equals("") && !editSayi4.getText().toString().equals("")){
            if (radiomin.isChecked()){
            min=Integer.parseInt(editSayi1.getText().toString());
            if (min>Integer.parseInt(editSayi2.getText().toString())){
                min=Integer.parseInt(editSayi2.getText().toString());
            }
            if(min>Integer.parseInt(editSayi3.getText().toString())){
                min=Integer.parseInt(editSayi3.getText().toString());
            }
            if(min>Integer.parseInt(editSayi4.getText().toString())){
                min=Integer.parseInt(editSayi4.getText().toString());
            }
                textResult.setText("Result = " + min);
            }
        else if (radiomax.isChecked()){

                max=Integer.parseInt(editSayi1.getText().toString());
                if (max<Integer.parseInt(editSayi2.getText().toString())){
                    max=Integer.parseInt(editSayi2.getText().toString());
                }
                 if(max<Integer.parseInt(editSayi3.getText().toString())){
                    max=Integer.parseInt(editSayi3.getText().toString());
                }
                if(max<Integer.parseInt(editSayi4.getText().toString())){
                    max=Integer.parseInt(editSayi4.getText().toString());
                }
                textResult.setText("Result = " + max);
            }

            if (radioaverage.isChecked()){
                average=(Double.parseDouble(editSayi1.getText().toString()) +Double.parseDouble(editSayi2.getText().toString()) +Double.parseDouble(editSayi3.getText().toString()) +Double.parseDouble(editSayi4.getText().toString()))/4;
                textResult.setText("Result = " + average);
            }

        }

    }
}
