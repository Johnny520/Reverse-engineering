package p080o;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: o.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0777c {

    /* JADX INFO: renamed from: a */
    public static final Class f2606a;

    /* JADX INFO: renamed from: b */
    public static final Field f2607b;

    /* JADX INFO: renamed from: c */
    public static final Field f2608c;

    /* JADX INFO: renamed from: d */
    public static final Method f2609d;

    /* JADX INFO: renamed from: e */
    public static final Method f2610e;

    /* JADX INFO: renamed from: f */
    public static final Method f2611f;

    /* JADX INFO: renamed from: g */
    public static final Handler f2612g = new Handler(Looper.getMainLooper());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f2606a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f2607b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f2608c = declaredField2;
        Class cls2 = f2606a;
        Class cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f2609d = declaredMethod;
        Class cls4 = f2606a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f2610e = declaredMethod2;
        Class cls5 = f2606a;
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 == 26 || i2 == 27) && cls5 != null) {
            try {
                Class cls6 = Integer.TYPE;
                Class cls7 = Boolean.TYPE;
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f2611f = method;
    }
}
