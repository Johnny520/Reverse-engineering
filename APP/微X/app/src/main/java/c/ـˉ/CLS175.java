// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.content.Context;
import android.os.Environment;
import java.io.File;

public class CLS175 {
    public static boolean FLD862;
    public static boolean FLD863;

    public static File MTH3054(Context context0) {
        if(context0 == null) {
            return null;
        }
        return CLS175.MTH3058() ? context0.getExternalCacheDir() : context0.getCacheDir();
    }

    public static boolean MTH3055() {
        CLS175.MTH3056();
        return CLS175.FLD862;
    }

    public static void MTH3056() {
        try {
            String s = Environment.getExternalStorageState();
            if(s.equals("mounted")) {
                CLS175.FLD862 = true;
                CLS175.FLD863 = true;
                return;
            }
            if(s.equals("mounted_ro")) {
                CLS175.FLD863 = true;
                CLS175.FLD862 = false;
                return;
            }
            CLS175.FLD862 = false;
            CLS175.FLD863 = false;
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    public static File MTH3057(Context context0, String s) {
        return context0 == null || CLS175.MTH3055() ? new File(Environment.getExternalStorageDirectory(), s) : new File(CLS175.MTH3054(context0), s);
    }

    public static boolean MTH3058() {
        CLS175.MTH3056();
        return CLS175.FLD863 && CLS175.FLD862;
    }
}

