package com.MVVMExample.Database;

import android.content.Context;
import android.content.SharedPreferences;

public class MPreferences {
    private static final String PreferencesName = "MVVMPreferences";

    public static void setPreferences(Context context, String userName) {
        SharedPreferences.Editor preferencesEditor = context.getSharedPreferences(PreferencesName, Context.MODE_PRIVATE).edit();
        preferencesEditor.putString("userName", userName);
        preferencesEditor.apply();

    }

    public static String getPreferences(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PreferencesName, Context.MODE_PRIVATE);
        String userName = preferences.getString("userName", "null");
        return userName;
    }


}
