package com.arthur.tu.base.app;

import android.os.Environment;

import java.io.File;

public class Constants {
    //================= PATH ====================
    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";
    public static final String PATH_CACHE = PATH_DATA + File.separator + "NetCache";

    public static final String PRIMARYCOLOR = "PRIMARYCOLOR";
    public static final String TITLECOLOR = "TITLECOLOR";
    public static final String DISCOVERlASTpAGE = "DISCOVERlASTpAGE";

    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "codeest" + File.separator + "GeekNews";

}
