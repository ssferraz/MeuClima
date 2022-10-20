package com.github.ssferraz.meuclima.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.github.ssferraz.meuclima.models.DadosClima;

public class DadosClimaRepository {

    MutableLiveData<DadosClima> dadosClima;

    static DadosClimaRepository instance;

    private DadosClimaRepository(){}

    public static DadosClimaRepository getInstance(){
        if(instance == null){
           instance = new DadosClimaRepository();
        }
        return instance;
    }

    public LiveData<DadosClima> getDadosClima(String latitude, String longitude){
        if(dadosClima == null){
            dadosClima = new MutableLiveData<>();
            dadosClima.setValue(new DadosClima());
        }
        return dadosClima;
    }
}
