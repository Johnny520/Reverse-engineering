package p000;

import android.app.Activity;
import android.content.Intent;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0264i9 {

    /* JADX INFO: renamed from: a */
    public static final String[] f410a = {"com.tencent.mobileqq.troop.file.api.impl.TroopFileApiImpl", "com.tencent.mobileqq.troop.file.api.TroopFileApiImpl", "com.tencent.mobileqq.troop.file.TroopFileApiImpl"};

    /* JADX INFO: renamed from: b */
    public static volatile boolean f411b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:9:0x001c, B:12:0x0027, B:14:0x002d, B:16:0x0035, B:18:0x003f, B:20:0x0049, B:21:0x0054, B:24:0x005a, B:26:0x0062, B:28:0x0068, B:33:0x0074, B:34:0x0080, B:36:0x0088, B:38:0x008e, B:43:0x009a, B:44:0x00a6, B:46:0x00ae), top: B:51:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:9:0x001c, B:12:0x0027, B:14:0x002d, B:16:0x0035, B:18:0x003f, B:20:0x0049, B:21:0x0054, B:24:0x005a, B:26:0x0062, B:28:0x0068, B:33:0x0074, B:34:0x0080, B:36:0x0088, B:38:0x008e, B:43:0x009a, B:44:0x00a6, B:46:0x00ae), top: B:51:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:9:0x001c, B:12:0x0027, B:14:0x002d, B:16:0x0035, B:18:0x003f, B:20:0x0049, B:21:0x0054, B:24:0x005a, B:26:0x0062, B:28:0x0068, B:33:0x0074, B:34:0x0080, B:36:0x0088, B:38:0x008e, B:43:0x009a, B:44:0x00a6, B:46:0x00ae), top: B:51:0x001c }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m677a(Class cls) {
        int i = 0;
        for (Method method : cls.getDeclaredMethods()) {
            if (!Modifier.isAbstract(method.getModifiers())) {
                String name = method.getName();
                try {
                    boolean zEquals = "shouldJumpComposeTroopFile".equals(name);
                    Class<?> cls2 = Boolean.TYPE;
                    if (zEquals && method.getReturnType() == cls2) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 2 && Activity.class.isAssignableFrom(parameterTypes[0]) && Intent.class.isAssignableFrom(parameterTypes[1])) {
                            method.setAccessible(true);
                            XposedBridge.hookMethod(method, new C0232g9(false, method));
                        }
                        i++;
                    } else if ("disableComposeTroopFile".equals(name)) {
                        if (method.getReturnType() == cls2 && method.getParameterTypes().length == 0) {
                            method.setAccessible(true);
                            XposedBridge.hookMethod(method, new C0232g9(true, method));
                        }
                        i++;
                    } else if ("isInExpComposeTroopFileB".equals(name)) {
                        if (method.getReturnType() == cls2 && method.getParameterTypes().length == 0) {
                            method.setAccessible(true);
                            XposedBridge.hookMethod(method, new C0232g9(false, method));
                        }
                        i++;
                    } else if ("openTroopFileMainPage".equals(name)) {
                        method.setAccessible(true);
                        XposedBridge.hookMethod(method, new C0248h9(method));
                        i++;
                    }
                } catch (Throwable th) {
                    HookEntry.log("legacy group file layout hook failed method=" + cls.getName() + "#" + name + ": " + th);
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static synchronized int m678b(ClassLoader classLoader) {
        try {
            if (!f411b && classLoader != null) {
                String[] strArr = f410a;
                int iM677a = 0;
                for (int i = 0; i < 3; i++) {
                    Class clsM1091j = AbstractC0497v4.m1091j(classLoader, strArr[i]);
                    if (clsM1091j != null) {
                        iM677a += m677a(clsM1091j);
                    }
                }
                if (iM677a > 0) {
                    f411b = true;
                    HookEntry.logAlways("legacy group file layout hook installed count=" + iM677a);
                }
                return iM677a;
            }
            return 0;
        } finally {
        }
    }
}
