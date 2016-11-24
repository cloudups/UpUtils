package com.burialpoint.library.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * class SharedPrefsUtil
 *
 * @author shifeiqi
 * @version 1.0
 * @descri SharedPreferences utils
 */
public class SharedPrefsUtil {

    /**
     * the name of SharedPreferences
     */
    public static final String preferencesName = "bp_share_setting";

    /**
     * put the string value to the sharedPreferences
     *
     * @param context
     * @param key
     * @param value
     */
    public static void putValue(Context context, String key, String value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(preferencesName, Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.commit();
    }

    /**
     * get the string value from the sharedPreferences
     *
     * @param context
     * @param key
     * @param defValue
     * @return
     */
    public static String getValue(Context context, String key, String defValue) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(preferencesName, Context.MODE_PRIVATE);
        String value = sharedPreferences.getString(key, defValue);
        return value;
    }
}
