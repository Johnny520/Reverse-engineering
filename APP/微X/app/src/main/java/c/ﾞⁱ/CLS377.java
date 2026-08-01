// Decompiled by JEB v5.42.0.202606242140

package c.ﾞⁱ;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

public final class CLS377 {
    public static Method FLD1664;
    public static boolean FLD1665;

    public static boolean MTH5138(Drawable drawable0) {
        return Build.VERSION.SDK_INT < 19 ? false : drawable0.isAutoMirrored();
    }

    public static boolean MTH5139(Drawable drawable0, int v) {
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 23) {
            return drawable0.setLayoutDirection(v);
        }
        if(v1 >= 17) {
            if(!CLS377.FLD1665) {
                try {
                    Method method0 = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    CLS377.FLD1664 = method0;
                    method0.setAccessible(true);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", noSuchMethodException0);
                }
                CLS377.FLD1665 = true;
            }
            Method method1 = CLS377.FLD1664;
            if(method1 != null) {
                try {
                    method1.invoke(drawable0, v);
                    return true;
                }
                catch(Exception exception0) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", exception0);
                    CLS377.FLD1664 = null;
                }
            }
        }
        return false;
    }
}

