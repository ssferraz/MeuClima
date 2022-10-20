package com.github.ssferraz.meuclima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.github.ssferraz.meuclima.databinding.ActivityMainBinding;
import com.github.ssferraz.meuclima.models.DadosClimaViewModel;

public class MainActivity extends AppCompatActivity {

    DadosClimaViewModel climaViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        climaViewModel = new ViewModelProvider(this).get(DadosClimaViewModel.class);
    }

    public void recuperar(View view){
        EditText latitude = binding.latitudeEditText;
        EditText longitude = binding.longitudeEditText;
        climaViewModel.getDadosClima(latitude.getText().toString(), longitude.getText().toString());
    }
}