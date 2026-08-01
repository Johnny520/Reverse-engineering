package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {
    public static final Class a = null;
    public static final Field b = null;
    public static final Field c = null;
    public static final Method d = null;
    public static final Method e = null;
    public static final Method f = null;
    public static final Handler g = null;

    static {
        g = new Handler(Looper.getMainLooper());
        Method r1 = null;
        Class<?> r2 = Class.forName("android.app.ActivityThread");     // Catch: Throwable -> L5
    L6:
        a = r2;
        Field r3 = Activity.class.getDeclaredField("mMainThread");     // Catch: Throwable -> L9
        r3.setAccessible(true);     // Catch: Throwable -> L9
    L10:
        b = r3;
        Field r0 = Activity.class.getDeclaredField("mToken");     // Catch: Throwable -> L13
        r0.setAccessible(true);     // Catch: Throwable -> L13
    L14:
        c = r0;
        Class r02 = a;
        Class r32 = Boolean.TYPE;
        if (r02 != null) goto L43;
    L16:
        Method r03 = null;
    L18:
        d = r03;
        Class r04 = a;
        if (r04 != null) goto L37;
    L20:
        Method r05 = null;
    L22:
        e = r05;
        Class r06 = a;
        int r33 = Build.VERSION.SDK_INT;
        if (r33 != 26) goto L25;
    L26:
        if (r06 != null) goto L45;
    L30:
        f = r1;
        return;
    L45:
        Class r7 = Integer.TYPE;     // Catch: Throwable -> L34
        Class r8 = Boolean.TYPE;     // Catch: Throwable -> L34
        Method r07 = r06.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, r7, r8, Configuration.class, Configuration.class, r8, r8});     // Catch: Throwable -> L34
        r07.setAccessible(true);     // Catch: Throwable -> L34
        r1 = r07;
        goto L30
    L25:
        if (r33 != 27) goto L30;
    L37:
        r05 = r04.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, r32});     // Catch: Throwable -> L33
        r05.setAccessible(true);     // Catch: Throwable -> L33
    L43:
        r03 = r02.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, r32, String.class});     // Catch: Throwable -> L32
        r03.setAccessible(true);     // Catch: Throwable -> L32
    L13:
        r0 = null;
    L9:
        r3 = null;
    L5:
        r2 = null;
        goto L6
    }
}
