package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb0 {
    public static final Method a = null;
    public static final boolean b = false;

    static {
        if (Build.VERSION.SDK_INT < 27) goto L5;
        boolean r1 = true;
    L6:
        b = r1;
        Method r0 = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});     // Catch: NoSuchMethodException -> L11
        a = r0;     // Catch: NoSuchMethodException -> L11
        if (r0.isAccessible() == true) goto L15;
        r0.setAccessible(true);     // Catch: NoSuchMethodException -> L11
        return;
    L15:
        return;
    L11:
        Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        return;
    L5:
        r1 = false;
        goto L6
    }

    public static boolean a(View r1) {
        WeakHashMap r0 = ja0.a;
        if (t90.d(r1) != 1) goto L5;
        return true;
    L5:
        return false;
    }
}
