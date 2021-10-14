package com.MVVMExample.MainViewModel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import com.MVVMExample.Database.MPreferences;

public class MainViewModel extends ViewModel {
    MutableLiveData<String> userName;

    public LiveData<String> getUserName(Context context) {
        if (userName == null) {
            userName = new MutableLiveData<>();
            loadUserName(context);
        }
        return userName;

    }


    private void loadUserName(Context context) {
        userName.setValue(MPreferences.getPreferences(context));
    }
    Observer<String> liveDataObserver= new Observer<String>() {
        @Override
        public void onChanged(String s) {

        }
    };

}
