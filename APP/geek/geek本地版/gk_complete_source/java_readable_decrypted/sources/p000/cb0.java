package p000;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb0 {

    /* JADX INFO: renamed from: a */
    public static final Method f942a;

    /* JADX INFO: renamed from: b */
    public static final boolean f943b;

    static {
        f943b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f942a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m658a(View view) {
        WeakHashMap weakHashMap = ja0.f2600a;
        return t90.m2367d(view) == 1;
    }
}
