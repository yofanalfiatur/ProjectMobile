package com.example.projectholiday.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment \n Ceritanya mau diisi foto ama nama tempat");
    }

    public LiveData<String> getText() {
        return mText;
    }
}