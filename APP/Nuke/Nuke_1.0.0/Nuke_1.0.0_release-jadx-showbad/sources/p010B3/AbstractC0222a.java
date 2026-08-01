package p010B3;

import android.app.Activity;
import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: B3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0222a {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f769a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public static int f770b;

    /* JADX INFO: renamed from: c */
    public static Activity f771c;

    /* JADX INFO: renamed from: d */
    public static String f772d;

    /* JADX INFO: renamed from: e */
    public static ClassLoader f773e;

    /* JADX INFO: renamed from: f */
    public static ClassLoader f774f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m325a(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField("mH");
        declaredField.setAccessible(true);
        Handler handler = (Handler) declaredField.get(obj);
        Field declaredField2 = Class.forName("android.os.Handler").getDeclaredField("mCallback");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, new C0226e(0, (Handler.Callback) declaredField2.get(handler)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m326b() throws IllegalAccessException, NoSuchFieldException {
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
        declaredField2.set(obj, Proxy.newProxyInstance(f773e, new Class[]{Class.forName("android.app.IActivityManager")}, new C0225d(declaredField2.get(obj))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m327c() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
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
        declaredField3.set(obj, Proxy.newProxyInstance(f773e, new Class[]{Class.forName("android.app.IActivityTaskManager")}, new C0225d(declaredField3.get(obj))));
    }
}
