package defpackage;

import android.app.Application;
import android.app.Instrumentation;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c5 {
    public static final AtomicBoolean a = new AtomicBoolean();
    public static Application b;
    public static String c;
    public static ClassLoader d;
    public static ClassLoader e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Application application) {
        e = application.getClassLoader();
        d = c5.class.getClassLoader();
        b = application;
        try {
            c = application.getPackageManager().getPackageInfo(application.getPackageName(), 1).activities[0].name;
            if (a.getAndSet(true)) {
                return;
            }
            try {
                Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                Field declaredField2 = obj.getClass().getDeclaredField("mInstrumentation");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, new j42((Instrumentation) declaredField2.get(obj)));
                b(obj);
                c();
                try {
                    d();
                } catch (Exception unused) {
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField("mH");
        declaredField.setAccessible(true);
        Handler handler = (Handler) declaredField.get(obj);
        Field declaredField2 = Class.forName("android.os.Handler").getDeclaredField("mCallback");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, new dp0(1, (Handler.Callback) declaredField2.get(handler)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c() throws IllegalAccessException, NoSuchFieldException {
        Field declaredField;
        try {
            try {
                declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            } catch (Exception unused) {
                return;
            }
        } catch (Exception unused2) {
            declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
        }
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
        declaredField2.setAccessible(true);
        declaredField2.set(obj, Proxy.newProxyInstance(d, new Class[]{Class.forName("android.app.IActivityManager")}, new cx0(declaredField2.get(obj))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
        Field declaredField;
        Field declaredField2 = Class.forName("android.app.ActivityTaskManager").getDeclaredField("IActivityTaskManagerSingleton");
        declaredField2.setAccessible(true);
        Object obj = declaredField2.get(null);
        try {
            try {
                declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            } catch (Exception unused) {
                return;
            }
        } catch (Exception unused2) {
            declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
        }
        declaredField.setAccessible(true);
        declaredField.get(null);
        Class<?> cls = Class.forName("android.util.Singleton");
        Field declaredField3 = cls.getDeclaredField("mInstance");
        declaredField3.setAccessible(true);
        cls.getMethod("get", null).invoke(obj, null);
        declaredField3.set(obj, Proxy.newProxyInstance(d, new Class[]{Class.forName("android.app.IActivityTaskManager")}, new cx0(declaredField3.get(obj))));
    }
}
