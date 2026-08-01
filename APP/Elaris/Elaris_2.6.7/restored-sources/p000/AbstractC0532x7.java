package p000;

import android.content.Context;
import android.os.Bundle;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: x7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0532x7 {

    /* JADX INFO: renamed from: a */
    public static final Set f1039a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b */
    public static final Set f1040b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: c */
    public static final Set f1041c = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m1132a(ClassLoader classLoader, String str, String str2) {
        String str3;
        try {
            Method declaredMethod = XposedHelpers.findClass(str, classLoader).getDeclaredMethod("attachBaseContext", Context.class);
            declaredMethod.setAccessible(true);
            str3 = str;
            try {
                XposedBridge.hookMethod(declaredMethod, new C0404p7(new AtomicReference(), new AtomicReference(), str2, classLoader, str3));
                return 1;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                StringBuilder sbM1b = AbstractC0000a.m1b("host hot update early entry not found: ", str3, ", ");
                sbM1b.append(m1138g(th2));
                HookEntry.log(sbM1b.toString());
                return 0;
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m1133b(ClassLoader classLoader) {
        int i;
        int i2;
        Method declaredMethod;
        Class<?> cls = Void.TYPE;
        int i3 = 0;
        try {
            declaredMethod = XposedHelpers.findClass("com.tencent.rfix.lib.download.PatchDownloadTask", classLoader).getDeclaredMethod("run", null);
        } catch (Throwable th) {
            HookEntry.log("host hot update target not found: RFix PatchDownloadTask.run, ".concat(m1138g(th)));
        }
        if (m1137f(declaredMethod)) {
            declaredMethod.setAccessible(true);
            XposedBridge.hookMethod(declaredMethod, new C0468t7(90));
            i = 1;
        } else {
            i = 0;
        }
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.rfix.lib.config.PatchConfig", classLoader);
            i2 = 0;
            for (Method method : XposedHelpers.findClass("com.tencent.rfix.lib.engine.PatchEngineBase", classLoader).getDeclaredMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (method.getReturnType() == cls && parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == clsFindClass && m1137f(method)) {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0484u7(90));
                    i2++;
                }
            }
            if (i2 == 0) {
                HookEntry.log("host hot update PatchEngineBase method not found");
            }
        } catch (Throwable th2) {
            HookEntry.log("host hot update PatchEngineBase target not found: ".concat(m1138g(th2)));
            i2 = 0;
        }
        int i4 = i + i2;
        try {
            int i5 = 0;
            for (Method method2 : XposedHelpers.findClass("com.tencent.mobileqq.msf.core.net.patch.PatchReporter", classLoader).getDeclaredMethods()) {
                if (method2.getName() != null && method2.getName().startsWith("report") && method2.getReturnType() == cls && !Modifier.isAbstract(method2.getModifiers()) && m1137f(method2)) {
                    method2.setAccessible(true);
                    XposedBridge.hookMethod(method2, new C0500v7(80));
                    i5++;
                }
            }
            if (i5 == 0) {
                HookEntry.log("host hot update PatchReporter report methods not found");
            }
            i3 = i5;
        } catch (Throwable th3) {
            HookEntry.log("host hot update PatchReporter target not found: ".concat(m1138g(th3)));
        }
        return i4 + i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m1134c(ClassLoader classLoader) {
        try {
            Method declaredMethod = XposedHelpers.findClass("com.tencent.tinker.loader.TinkerLoader", classLoader).getDeclaredMethod("tryLoad", XposedHelpers.findClass("com.tencent.tinker.loader.app.TinkerApplication", classLoader));
            if (!m1137f(declaredMethod)) {
                return 0;
            }
            declaredMethod.setAccessible(true);
            XposedBridge.hookMethod(declaredMethod, new C0436r7(100));
            return 1;
        } catch (Throwable th) {
            HookEntry.log("host hot update Tinker target not found: ".concat(m1138g(th)));
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1135d(ClassLoader classLoader, String str) {
        if (classLoader == null || !HookEntry.runtimeBool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE)) {
            return;
        }
        if (str == null || str.length() == 0) {
            str = "com.tencent.mobileqq";
        }
        if (f1039a.add("all@".concat(str))) {
            int iM1134c = m1134c(classLoader);
            int iM1133b = m1133b(classLoader);
            int i = 0;
            if ("com.tencent.mobileqq".equals(str) || "com.tencent.mobileqq:tool".equals(str)) {
                try {
                    Method declaredMethod = XposedHelpers.findClass("com.tencent.mobileqq.upgrade.ui.dialog.UpgradeActivity", classLoader).getDeclaredMethod("doOnCreate", Bundle.class);
                    if (m1137f(declaredMethod)) {
                        declaredMethod.setAccessible(true);
                        XposedBridge.hookMethod(declaredMethod, new C0516w7(90));
                        i = 1;
                    }
                } catch (Throwable th) {
                    HookEntry.log("host upgrade activity target not found: ".concat(m1138g(th)));
                }
            }
            HookEntry.logAlways("host hot update hooks installed: process=" + str + ", tinker=" + iM1134c + ", rfix=" + iM1133b + ", upgrade=" + i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m1136e(ClassLoader classLoader, String str) {
        if (str == null || str.length() == 0) {
            str = "com.tencent.mobileqq";
        }
        if (("com.tencent.mobileqq".equals(str) || "com.tencent.mobileqq:MSF".equals(str) || "com.tencent.mobileqq:tool".equals(str) || "com.tencent.mobileqq:qqfav".equals(str) || str.contains(":peak") || str.contains(":file")) && f1040b.add(str)) {
            int iM1132a = m1132a(classLoader, "com.tencent.common.app.QFixApplicationImpl", str) + m1132a(classLoader, "com.tencent.common.app.QFixApplicationImplProxy", str);
            if (iM1132a > 0) {
                HookEntry.log("host hot update early entry installed: process=" + str + ", qfix=" + iM1132a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m1137f(Method method) {
        if (method == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(method.getDeclaringClass().getName());
        sb.append('#');
        sb.append(method.getName());
        sb.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(parameterTypes[i].getName());
        }
        sb.append("):");
        sb.append(method.getReturnType().getName());
        return f1041c.add(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m1138g(Throwable th) {
        String message = th.getMessage();
        if (message == null || message.length() == 0) {
            return th.getClass().getSimpleName();
        }
        return th.getClass().getSimpleName() + ": " + message;
    }
}
