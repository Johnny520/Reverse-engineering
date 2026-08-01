package defpackage;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class hc0 {
    public static final Field a = null;
    public static final Field b = null;
    public static final Field c = null;
    public static final boolean d = false;

    static {
        Field r0 = View.class.getDeclaredField("mAttachInfo");     // Catch: ReflectiveOperationException -> L4
        a = r0;     // Catch: ReflectiveOperationException -> L4
        r0.setAccessible(true);     // Catch: ReflectiveOperationException -> L4
        Class<?> r02 = Class.forName("android.view.View$AttachInfo");     // Catch: ReflectiveOperationException -> L4
        Field r2 = r02.getDeclaredField("mStableInsets");     // Catch: ReflectiveOperationException -> L4
        b = r2;     // Catch: ReflectiveOperationException -> L4
        r2.setAccessible(true);     // Catch: ReflectiveOperationException -> L4
        Field r03 = r02.getDeclaredField("mContentInsets");     // Catch: ReflectiveOperationException -> L4
        c = r03;     // Catch: ReflectiveOperationException -> L4
        r03.setAccessible(true);     // Catch: ReflectiveOperationException -> L4
        d = true;     // Catch: ReflectiveOperationException -> L4
        return;
    L4:
        e = move-exception;
        Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
    }
}
