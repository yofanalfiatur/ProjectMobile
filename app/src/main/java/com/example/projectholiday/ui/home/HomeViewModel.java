package com.example.projectholiday.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment Nggak tau mau di isi apa nihh, ngikut websitenya aja :v");
    }

    public LiveData<String> getText() {
        return mText;
    }
}