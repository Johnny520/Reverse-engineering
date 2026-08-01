package p000;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class hb0 {

    /* JADX INFO: renamed from: a */
    public static final Method f2214a;

    /* JADX INFO: renamed from: b */
    public static final boolean f2215b;

    static {
        f2215b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f2214a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1385a(View view) {
        WeakHashMap weakHashMap = oa0.f3426a;
        return y90.m2732d(view) == 1;
    }
}
