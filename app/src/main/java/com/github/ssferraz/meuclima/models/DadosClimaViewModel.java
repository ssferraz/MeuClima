package com.github.ssferraz.meuclima.models;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.github.ssferraz.meuclima.repository.DadosClimaRepository;

public class DadosClimaViewModel extends ViewModel {
    public LiveData<DadosClima> getDadosClima(String latitude, String longitude){
        return DadosClimaRepository.getInstance().getDadosClima(latitude, longitude);
    }
}
