// Decompiled by JEB v5.42.0.202606242140

package c.ˆٴ;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

public class CLS78 {
    public static TypedValue FLD418;
    public static final Object FLD419;

    static {
        CLS78.FLD419 = new Object();
    }

    public static Drawable MTH1871(Context context0, int v) {
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 21) {
            return context0.getDrawable(v);
        }
        if(v1 >= 16) {
            return context0.getResources().getDrawable(v);
        }
        synchronized(CLS78.FLD419) {
            if(CLS78.FLD418 == null) {
                CLS78.FLD418 = new TypedValue();
            }
            context0.getResources().getValue(v, CLS78.FLD418, true);
            v = CLS78.FLD418.resourceId;
        }
        return context0.getResources().getDrawable(v);
    }

    public static int MTH1872(Context context0, String s) {
        if(s == null) {
            throw new IllegalArgumentException("permission is null");
        }
        return context0.checkPermission(s, Process.myPid(), Process.myUid());
    }

    public static File[] MTH1873(Context context0) {
        return Build.VERSION.SDK_INT < 19 ? new File[]{context0.getExternalCacheDir()} : context0.getExternalCacheDirs();
    }

    public static File[] MTH1874(Context context0, String s) {
        return Build.VERSION.SDK_INT < 19 ? new File[]{context0.getExternalFilesDir(s)} : context0.getExternalFilesDirs(s);
    }
}

