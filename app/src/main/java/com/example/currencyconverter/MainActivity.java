package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerCurrencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCurrencies = findViewById(R.id.spinnerCurrencies);
    }

    public void onClickChangeCurrency(View view) {
        EditText currencyAmount = findViewById(R.id.currencyAmount);
        int position = spinnerCurrencies.getSelectedItemPosition();
        String input = currencyAmount.getText().toString();

        double resultInDollars = Double.parseDouble(input) * 68;
        double resultInEuro = Double.parseDouble(input) * 73;

        if (position == 0) {
            Toast.makeText(this, resultInDollars + "₽", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, resultInEuro + "₽", Toast.LENGTH_SHORT).show();
        }
    }
}
