// Decompiled by JEB v5.42.0.202606242140

package c.ʻᵢ;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

public final class CLS27 {
    public static boolean FLD119;
    public static Method FLD120;

    public static boolean MTH799(Drawable drawable0, int v) {
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 23) {
            return drawable0.setLayoutDirection(v);
        }
        if(v1 >= 17) {
            if(!CLS27.FLD119) {
                try {
                    Method method0 = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    CLS27.FLD120 = method0;
                    method0.setAccessible(true);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", noSuchMethodException0);
                }
                CLS27.FLD119 = true;
            }
            Method method1 = CLS27.FLD120;
            if(method1 != null) {
                try {
                    method1.invoke(drawable0, v);
                    return true;
                }
                catch(Exception exception0) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", exception0);
                    CLS27.FLD120 = null;
                }
            }
        }
        return false;
    }

    public static boolean MTH800(Drawable drawable0) {
        return Build.VERSION.SDK_INT < 19 ? false : drawable0.isAutoMirrored();
    }
}

