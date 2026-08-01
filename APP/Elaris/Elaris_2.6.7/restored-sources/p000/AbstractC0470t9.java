package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: t9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0470t9 {

    /* JADX INFO: renamed from: a */
    public static final String[] f898a = {"com.tencent.open.agent.QrAgentLoginManager", "com.tencent.open.agent.QrAgentLoginManager$a", "com.tencent.open.agent.QrAgentLoginManager$2"};

    /* JADX INFO: renamed from: b */
    public static volatile boolean f899b = false;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f900c = false;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f901d = false;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f902e = false;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f903f = false;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f904g = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Method m1019a(Class cls) {
        byte b;
        byte b2 = -1;
        Method method = null;
        for (Method method2 : cls.getDeclaredMethods()) {
            if (method2.getReturnType() == Void.TYPE) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length >= 4 && m1025g(parameterTypes[1]) && parameterTypes[2] == String.class && parameterTypes[3] == Bundle.class) {
                    b = 100;
                } else if (parameterTypes.length == 3 && m1025g(parameterTypes[0])) {
                    b = 90;
                } else if (parameterTypes.length == 4 && m1025g(parameterTypes[1])) {
                    b = 80;
                } else {
                    int length = parameterTypes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            b = 0;
                            break;
                        }
                        if (m1025g(parameterTypes[i])) {
                            b = 30;
                            break;
                        }
                        i++;
                    }
                }
                if (b > b2) {
                    method = method2;
                    b2 = b;
                }
            }
        }
        if (b2 > 0) {
            return method;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Method m1020b(Class cls) {
        Method method = null;
        for (Method method2 : cls.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method2.getParameterTypes();
            if (method2.getReturnType() == Void.TYPE && parameterTypes.length == 1 && m1025g(parameterTypes[0]) && !Modifier.isStatic(method2.getModifiers())) {
                if (Modifier.isProtected(method2.getModifiers())) {
                    method2.setAccessible(true);
                    return method2;
                }
                if (method == null) {
                    method = method2;
                }
            }
        }
        if (method != null) {
            method.setAccessible(true);
        }
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1021c(ClassLoader classLoader) {
        Class<?> clsFindClass;
        int i = 0;
        for (char c = 'a'; c < 'p'; c = (char) (c + 1)) {
            try {
                clsFindClass = XposedHelpers.findClass("com.tencent.biz.qrcode.activity.QRLoginAuthActivity$" + c, classLoader);
            } catch (Throwable unused) {
                clsFindClass = null;
            }
            if (clsFindClass != null && clsFindClass.getSuperclass() == CountDownTimer.class) {
                try {
                    XposedBridge.hookAllConstructors(clsFindClass, new C0406p9(90));
                    i++;
                } catch (Throwable th) {
                    m1026h("hook known QR timer failed: " + clsFindClass.getName() + " " + th);
                }
            }
        }
        if (i > 0) {
            m1026h("hooked QR confirm timer classes: " + i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1022d(ClassLoader classLoader) {
        Class<?> clsFindClass;
        Method method;
        Object obj;
        Method method2 = null;
        try {
            clsFindClass = XposedHelpers.findClass("com.tencent.biz.qrcode.activity.QRLoginAuthActivity", classLoader);
        } catch (Throwable unused) {
            clsFindClass = null;
        }
        if (clsFindClass == null) {
            return;
        }
        try {
            try {
                Field declaredField = XposedHelpers.findClass(new String[]{"com.tencent.mobileqq.R$id"}[0], classLoader).getDeclaredField("confirm_risk_login_btn");
                declaredField.setAccessible(true);
                obj = declaredField.get(null);
            } catch (Throwable unused2) {
            }
            int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
            Method methodM1020b = m1020b(clsFindClass);
            Method[] declaredMethods = clsFindClass.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                Class<?>[] parameterTypes = method.getParameterTypes();
                if ("onClick".equals(method.getName()) && parameterTypes.length == 1 && View.class.isAssignableFrom(parameterTypes[0])) {
                    method.setAccessible(true);
                    break;
                }
                i++;
            }
            if (!f903f && iIntValue != 0 && methodM1020b != null && method != null) {
                XposedBridge.hookMethod(method, new C0422q9(iIntValue, methodM1020b));
                f903f = true;
                m1026h("hooked QRLoginAuthActivity confirm click fallback -> " + m1027i(method));
            }
            Method[] declaredMethods2 = clsFindClass.getDeclaredMethods();
            int length2 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i2];
                Class<?>[] parameterTypes2 = method3.getParameterTypes();
                if (Modifier.isPrivate(method3.getModifiers()) && method3.getReturnType() == Void.TYPE && parameterTypes2.length == 1 && parameterTypes2[0] == String.class) {
                    method3.setAccessible(true);
                    method2 = method3;
                    break;
                }
                i2++;
            }
            if (!f904g && iIntValue != 0 && method2 != null) {
                XposedBridge.hookMethod(method2, new C0438r9(iIntValue));
                f904g = true;
                m1026h("hooked QRLoginAuthActivity start countdown fallback -> " + m1027i(method2));
            }
        } catch (Throwable th) {
            m1026h("hookQrAuthActivityFallback failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m1023e(ClassLoader classLoader) {
        if (f902e) {
            return;
        }
        f902e = true;
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.utils.DialogUtil", classLoader);
            Class cls = Boolean.TYPE;
            Class cls2 = Integer.TYPE;
            XposedHelpers.findAndHookMethod(clsFindClass, "createCountdownDialog", Context.class, String.class, CharSequence.class, String.class, String.class, cls, cls2, cls2, View.OnClickListener.class, View.OnClickListener.class, new C0454s9(60));
            m1026h("hooked QR confirm fast-path openSdk createCountdownDialog");
        } catch (Throwable th) {
            m1026h("hookQrConfirmFastPathOpenSdk failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static synchronized void m1024f(ClassLoader classLoader) {
        Method methodM1019a;
        Class<?> clsFindClass;
        if (f899b) {
            return;
        }
        try {
            String[] strArr = f898a;
            methodM1019a = null;
            for (int i = 0; i < 3; i++) {
                try {
                    clsFindClass = XposedHelpers.findClass(strArr[i], classLoader);
                } catch (Throwable unused) {
                    clsFindClass = null;
                }
                if (clsFindClass != null && (methodM1019a = m1019a(clsFindClass)) != null) {
                    break;
                }
            }
        } catch (Throwable th) {
            m1026h("hookQrGalleryGate failed: " + th);
        }
        if (methodM1019a == null) {
            if (!f900c) {
                f900c = true;
                m1026h("QR gallery gate: target method not found in QR agent candidates");
            }
            return;
        }
        methodM1019a.setAccessible(true);
        XposedBridge.hookMethod(methodM1019a, new C0363o9(m1028j(methodM1019a)));
        f899b = true;
        m1026h("hooked QR gallery gate -> " + m1027i(methodM1019a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m1025g(Class cls) {
        return cls == Boolean.TYPE || cls == Boolean.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m1026h(String str) {
        if (HookEntry.shouldLogMessage(str)) {
            XposedBridge.log("Elaris: ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m1027i(Method method) {
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
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m1028j(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length < 4 || !m1025g(parameterTypes[1]) || parameterTypes[2] != String.class || parameterTypes[3] != Bundle.class) {
            if (parameterTypes.length == 3 && m1025g(parameterTypes[0])) {
                return 0;
            }
            if (parameterTypes.length != 4 || !m1025g(parameterTypes[1])) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (m1025g(parameterTypes[i])) {
                        return i;
                    }
                }
                return -1;
            }
        }
        return 1;
    }
}
