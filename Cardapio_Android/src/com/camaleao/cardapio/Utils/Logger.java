package com.camaleao.cardapio.Utils;

import android.util.Log;

/**
 * Created by adriano on 02/11/14.
 */
public  class Logger {


    private static final String LOG = "CARDAPIO";
    private static enum TipoLog{DEBUG, ERROR, INFOR};

    public static void sendLog(String logText){
        Log.d(LOG, logText);
    }

    public static void sendLog(String logText, TipoLog tipo){
        switch (tipo){
            case DEBUG:
                Log.d(LOG, logText);
                break;
            case ERROR:
                Log.e(LOG, logText);
                break;
            case INFOR:
                Log.i(LOG, logText);
                break;
        }
    }

}
