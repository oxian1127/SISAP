package com.cecar.edu.siga.vistas.ui.ofertas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OfertasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OfertasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Postulacion a Ofertas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}