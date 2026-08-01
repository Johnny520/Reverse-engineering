// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.content.Context;
import android.os.Environment;
import java.io.File;

public class CLS215 {
    public static boolean FLD877;
    public static boolean FLD878;

    public static File MTH3031(Context context0, String s) {
        return context0 == null || CLS215.MTH3032() ? new File(Environment.getExternalStorageDirectory(), s) : new File(CLS215.MTH3035(context0), s);
    }

    public static boolean MTH3032() {
        CLS215.MTH3034();
        return CLS215.FLD878;
    }

    public static boolean MTH3033() {
        CLS215.MTH3034();
        return CLS215.FLD877 && CLS215.FLD878;
    }

    public static void MTH3034() {
        try {
            String s = Environment.getExternalStorageState();
            if(s.equals("mounted")) {
                CLS215.FLD878 = true;
                CLS215.FLD877 = true;
                return;
            }
            if(s.equals("mounted_ro")) {
                CLS215.FLD877 = true;
                CLS215.FLD878 = false;
                return;
            }
            CLS215.FLD878 = false;
            CLS215.FLD877 = false;
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    public static File MTH3035(Context context0) {
        if(context0 == null) {
            return null;
        }
        return CLS215.MTH3033() ? context0.getExternalCacheDir() : context0.getCacheDir();
    }
}

