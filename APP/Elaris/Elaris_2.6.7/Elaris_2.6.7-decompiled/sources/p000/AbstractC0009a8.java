package p000;

import android.app.Application;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: a8 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0009a8 {

    /* JADX INFO: renamed from: c */
    public static volatile boolean f36c;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f38e;

    /* JADX INFO: renamed from: a */
    public static volatile WeakReference f34a = new WeakReference(null);

    /* JADX INFO: renamed from: b */
    public static volatile String f35b = "unknown";

    /* JADX INFO: renamed from: d */
    public static volatile WeakReference f37d = new WeakReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Application m70a() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
            if (objInvoke instanceof Application) {
                return (Application) objInvoke;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke2 = cls.getDeclaredMethod("currentActivityThread", null).invoke(null, null);
            if (objInvoke2 != null) {
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke2);
                if (obj instanceof Application) {
                    return (Application) obj;
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m71b() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null).invoke(null, null);
            if ((objInvoke instanceof String) && ((String) objInvoke).length() > 0) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        try {
            Object objInvoke2 = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", null).invoke(null, null);
            if (objInvoke2 == null) {
                return "com.tencent.mobileqq";
            }
            Object objInvoke3 = objInvoke2.getClass().getDeclaredMethod("getProcessName", null).invoke(objInvoke2, null);
            return (!(objInvoke3 instanceof String) || ((String) objInvoke3).length() <= 0) ? "com.tencent.mobileqq" : (String) objInvoke3;
        } catch (Throwable unused2) {
            return "com.tencent.mobileqq";
        }
    }
}
