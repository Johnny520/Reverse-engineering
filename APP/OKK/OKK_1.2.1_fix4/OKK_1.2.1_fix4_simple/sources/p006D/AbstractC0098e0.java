package p006D;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: D.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0098e0 {

    /* JADX INFO: renamed from: a */
    public static final Field f253a = null;

    /* JADX INFO: renamed from: b */
    public static final Field f254b = null;

    /* JADX INFO: renamed from: c */
    public static final Field f255c = null;

    /* JADX INFO: renamed from: d */
    public static final boolean f256d = false;

    static {
        Field r02 = View.class.getDeclaredField("mAttachInfo");     // Catch: ReflectiveOperationException -> L4
        f253a = r02;     // Catch: ReflectiveOperationException -> L4
        r02.setAccessible(true);     // Catch: ReflectiveOperationException -> L4
        Class<?> r03 = Class.forName("android.view.View$AttachInfo");     // Catch: ReflectiveOperationException -> L4
        Field r2 = r03.getDeclaredField("mStableInsets");     // Catch: ReflectiveOperationException -> L4
        f254b = r2;     // Catch: ReflectiveOperationException -> L4
        r2.setAccessible(true);     // Catch: ReflectiveOperationException -> L4
        Field r04 = r03.getDeclaredField("mContentInsets");     // Catch: ReflectiveOperationException -> L4
        f255c = r04;     // Catch: ReflectiveOperationException -> L4
        r04.setAccessible(true);     // Catch: ReflectiveOperationException -> L4
        f256d = true;     // Catch: ReflectiveOperationException -> L4
        return;
    L4:
        e = move-exception;
        e.getMessage();
    }
}
