package com.cecar.edu.siga.vistas.ui.agregarVacantes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AgregarVacanteViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AgregarVacanteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is aplicacion vacante fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}