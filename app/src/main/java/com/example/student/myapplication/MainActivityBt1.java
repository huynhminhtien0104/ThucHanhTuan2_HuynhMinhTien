package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityBt1 extends AppCompatActivity {

    TextView tvResult;
    EditText edtNum1,edtNum2;
    Button btnSum,btnMinus,btnThuong,btnTich,btnUoc,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bt1);
        tvResult=(TextView)findViewById(R.id.tvResult);
        edtNum1=(EditText)findViewById(R.id.edtNum1);
        edtNum2=(EditText)findViewById(R.id.edtNum2);
        btnSum=(Button)findViewById(R.id.btnSum);
        btnMinus=(Button)findViewById(R.id.btnMinus);
        btnThuong=(Button)findViewById(R.id.btnthuong);
        btnTich=(Button)findViewById(R.id.btnTich);
        btnUoc=(Button)findViewById(R.id.btnUoc);
        btnThoat=(Button)findViewById(R.id.btnExit);
    }
    private int GCD(int a, int b){
        if (a == 0 || b == 0){
            return a + b;
        }
        while (a != b){
            if (a > b){
                a -= b; // a = a - b
            }else{
                b -= a;
            }
        }
        return a;
    }

    public void Caculate(View v){
        int a,b;
        float kq;

        switch (v.getId()){
            case R.id.btnSum:
                kq=Float.parseFloat(edtNum1.getText().toString()) + Float.parseFloat(edtNum2.getText().toString());
                tvResult.setText(""+kq);
                break;
            case R.id.btnExit:
                finish();
                break;
            case R.id.btnMinus:
                kq=Float.parseFloat(edtNum1.getText().toString()) - Float.parseFloat(edtNum2.getText().toString());
                tvResult.setText(""+kq);
                break;
            case R.id.btnthuong:
                kq=Float.parseFloat(edtNum1.getText().toString()) / Float.parseFloat(edtNum2.getText().toString());
                tvResult.setText(""+kq);
                break;
            case R.id.btnTich:
                kq=Float.parseFloat(edtNum1.getText().toString()) * Float.parseFloat(edtNum2.getText().toString());
                tvResult.setText(""+kq);
                break;
            case R.id.btnUoc:
                tvResult.setText(String.format("%s",GCD(Integer.parseInt(edtNum1.getText().toString()),Integer.parseInt(edtNum2.getText().toString()))));
                break;
        }
    }
}
