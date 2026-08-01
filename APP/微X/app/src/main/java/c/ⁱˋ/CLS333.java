// Decompiled by JEB v5.42.0.202606242140

package c.ⁱˋ;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

public class CLS333 {
    public static final Object FLD1551;
    public static TypedValue FLD1552;

    static {
        CLS333.FLD1551 = new Object();
    }

    public static File[] MTH4767(Context context0) {
        return Build.VERSION.SDK_INT < 19 ? new File[]{context0.getExternalCacheDir()} : context0.getExternalCacheDirs();
    }

    public static File[] MTH4768(Context context0, String s) {
        return Build.VERSION.SDK_INT < 19 ? new File[]{context0.getExternalFilesDir(s)} : context0.getExternalFilesDirs(s);
    }

    public static int MTH4769(Context context0, String s) {
        if(s == null) {
            throw new IllegalArgumentException("permission is null");
        }
        return context0.checkPermission(s, Process.myPid(), Process.myUid());
    }

    public static Drawable MTH4770(Context context0, int v) {
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 21) {
            return context0.getDrawable(v);
        }
        if(v1 >= 16) {
            return context0.getResources().getDrawable(v);
        }
        synchronized(CLS333.FLD1551) {
            if(CLS333.FLD1552 == null) {
                CLS333.FLD1552 = new TypedValue();
            }
            context0.getResources().getValue(v, CLS333.FLD1552, true);
            v = CLS333.FLD1552.resourceId;
        }
        return context0.getResources().getDrawable(v);
    }
}

