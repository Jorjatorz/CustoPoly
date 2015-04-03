package com.iplusplus.custopoly;

import android.app.Application;
import android.content.Context;
import com.iplusplus.custopoly.model.ShopKeeper;
import com.iplusplus.custopoly.model.ThemeHandler;

/**
 * Created by Fran on 02/04/2015.
 *
 * Global class which contains the context of the application
 */
public class Custopoly extends Application {

    private static Context context;
    private static ThemeHandler themeHandler;
    private static ShopKeeper shopKeeper;

    public void onCreate(){
        super.onCreate();
        Custopoly.context = getApplicationContext();

    }

    public static Context getAppContext() {
        return Custopoly.context;
    }


}

