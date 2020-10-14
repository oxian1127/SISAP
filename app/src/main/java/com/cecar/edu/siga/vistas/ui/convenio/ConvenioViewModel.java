package com.cecar.edu.siga.vistas.ui.convenio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConvenioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConvenioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta es la seccion convenio");
    }

    public LiveData<String> getText() {
        return mText;
    }
}