// Decompiled by JEB v5.42.0.202606242140

package c.ʾʻ;

import android.os.Build.VERSION;
import android.view.Gravity;

public final class CLS32 {
    public static int MTH846(int v, int v1) {
        return Build.VERSION.SDK_INT < 17 ? v & 0xFF7FFFFF : Gravity.getAbsoluteGravity(v, v1);
    }
}

