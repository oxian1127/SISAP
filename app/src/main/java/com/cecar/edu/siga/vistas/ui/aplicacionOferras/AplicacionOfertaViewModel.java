package com.cecar.edu.siga.vistas.ui.aplicacionOferras;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AplicacionOfertaViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AplicacionOfertaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is aplicacion convenio fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}