package com.MVVMExample.Repository;

import android.content.Context;

import com.MVVMExample.Database.MPreferences;
import com.MVVMExample.MainViewModel.MainViewModel;

public class repository
{
    MainViewModel mainViewModel;
    Context context;

    public repository(Context context) {
        this.context = context;
    }

    public void addData(String name)
    {
        MPreferences.setPreferences(context,name);
    }
    public String showData()
    {
       return MPreferences.getPreferences(context);
    }
}
