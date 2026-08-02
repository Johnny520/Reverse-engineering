package p000;

import android.app.Application;
import android.app.Instrumentation;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: c5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0079c5 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f1150a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public static Application f1151b;

    /* JADX INFO: renamed from: c */
    public static String f1152c;

    /* JADX INFO: renamed from: d */
    public static ClassLoader f1153d;

    /* JADX INFO: renamed from: e */
    public static ClassLoader f1154e;

    /* JADX INFO: renamed from: a */
    public static void m637a(Application application) {
        f1154e = application.getClassLoader();
        f1153d = AbstractC0079c5.class.getClassLoader();
        f1151b = application;
        try {
            f1152c = application.getPackageManager().getPackageInfo(application.getPackageName(), 1).activities[0].name;
            if (f1150a.getAndSet(true)) {
                return;
            }
            try {
                Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                Field declaredField2 = obj.getClass().getDeclaredField("mInstrumentation");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, new j42((Instrumentation) declaredField2.get(obj)));
                m638b(obj);
                m639c();
                try {
                    m640d();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m638b(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField("mH");
        declaredField.setAccessible(true);
        Handler handler = (Handler) declaredField.get(obj);
        Field declaredField2 = Class.forName("android.os.Handler").getDeclaredField("mCallback");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, new dp0(1, (Handler.Callback) declaredField2.get(handler)));
    }

    /* JADX INFO: renamed from: c */
    public static void m639c() throws IllegalAccessException, NoSuchFieldException {
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
        declaredField2.set(obj, Proxy.newProxyInstance(f1153d, new Class[]{Class.forName("android.app.IActivityManager")}, new cx0(declaredField2.get(obj))));
    }

    /* JADX INFO: renamed from: d */
    public static void m640d() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
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
        declaredField3.set(obj, Proxy.newProxyInstance(f1153d, new Class[]{Class.forName("android.app.IActivityTaskManager")}, new cx0(declaredField3.get(obj))));
    }
}
