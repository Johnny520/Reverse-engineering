package com.p001mr.elaris.xposedcompat;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.C0479u2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class XposedBridge {
    private static volatile XposedInterface sFramework;
    public static final ClassLoader BOOTCLASSLOADER = ClassLoader.getSystemClassLoader();
    public static int XPOSED_BRIDGE_VERSION = 102;
    private static volatile String sFrameworkClassName = "";
    private static volatile boolean sLoggingEnabled = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private XposedBridge() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void appendFrameworkSource(StringBuilder sb, String str) {
        if (sb == null || str == null || str.length() == 0 || str.startsWith("com.mr.elaris.")) {
            return;
        }
        if (isFrameworkMarker(str) || sb.length() <= 0) {
            if (str.length() + sb.length() + (sb.length() > 0 ? 1 : 0) > 110) {
                return;
            }
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void attachModernFramework(XposedInterface xposedInterface) {
        if (xposedInterface != null) {
            sFramework = xposedInterface;
            rememberFrameworkClass(xposedInterface);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void detachModernFramework(XposedInterface xposedInterface) {
        if (xposedInterface == null || sFramework != xposedInterface) {
            return;
        }
        sFramework = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getFrameworkClassName() {
        String str = sFrameworkClassName;
        if (str != null && str.length() > 0) {
            return str;
        }
        XposedInterface xposedInterface = sFramework;
        if (xposedInterface == null) {
            return "";
        }
        try {
            return xposedInterface.getClass().getName();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getFrameworkName() {
        XposedInterface xposedInterface = sFramework;
        if (xposedInterface == null) {
            return "";
        }
        try {
            return xposedInterface.getFrameworkName();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getFrameworkVersion() {
        XposedInterface xposedInterface = sFramework;
        if (xposedInterface == null) {
            return "";
        }
        try {
            return xposedInterface.getFrameworkVersion();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ApplicationInfo getModuleApplicationInfo() {
        XposedInterface xposedInterface = sFramework;
        if (xposedInterface == null) {
            return null;
        }
        try {
            return xposedInterface.getModuleApplicationInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SharedPreferences getRemotePreferences(String str) {
        XposedInterface xposedInterface = sFramework;
        if (xposedInterface == null) {
            return null;
        }
        try {
            return xposedInterface.getRemotePreferences(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getXposedVersion() {
        XposedInterface xposedInterface = sFramework;
        if (xposedInterface == null) {
            return XPOSED_BRIDGE_VERSION;
        }
        try {
            return xposedInterface.getApiVersion();
        } catch (Throwable unused) {
            return XPOSED_BRIDGE_VERSION;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Set<XC_MethodHook.Unhook> hookAllConstructors(Class<?> cls, XC_MethodHook xC_MethodHook) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (cls != null) {
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                try {
                    constructor.setAccessible(true);
                    linkedHashSet.add(hookMethod(constructor, xC_MethodHook));
                } catch (Throwable th) {
                    log("hookAllConstructors failed " + constructor + ": " + th);
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Set<XC_MethodHook.Unhook> hookAllMethods(Class<?> cls, String str, XC_MethodHook xC_MethodHook) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (cls != null && str != null) {
            for (Method method : cls.getDeclaredMethods()) {
                if (str.equals(method.getName())) {
                    try {
                        method.setAccessible(true);
                        linkedHashSet.add(hookMethod(method, xC_MethodHook));
                    } catch (Throwable th) {
                        log("hookAllMethods failed " + method + ": " + th);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static XC_MethodHook.Unhook hookMethod(Member member, final XC_MethodHook xC_MethodHook) {
        if (!(member instanceof Executable)) {
            C0479u2.m1036a(member, "Only methods and constructors can be hooked: ");
            return null;
        }
        if (xC_MethodHook == null) {
            throw new NullPointerException("callback == null");
        }
        final XposedInterface.HookHandle hookHandleIntercept = requireFramework().hook((Executable) member).setPriority(xC_MethodHook.priority).setExceptionMode(XposedInterface.ExceptionMode.PROTECTIVE).intercept(new XposedInterface.Hooker() { // from class: com.mr.elaris.xposedcompat.XposedBridge.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Object intercept(XposedInterface.Chain chain) {
                return XposedBridge.invokeHook(chain, xC_MethodHook);
            }
        });
        return new XC_MethodHook.Unhook(member, xC_MethodHook, new Runnable() { // from class: com.mr.elaris.xposedcompat.XposedBridge.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public void run() {
                hookHandleIntercept.unhook();
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static Object invokeHook(XposedInterface.Chain chain, XC_MethodHook xC_MethodHook) {
        XC_MethodHook.MethodHookParam methodHookParam = new XC_MethodHook.MethodHookParam();
        methodHookParam.method = chain.getExecutable();
        methodHookParam.thisObject = safeThisObject(chain);
        methodHookParam.args = toArray(chain.getArgs());
        xC_MethodHook.beforeHookedMethod(methodHookParam);
        if (!methodHookParam.shouldReturnEarly()) {
            try {
                Object objProceed = chain.proceed(methodHookParam.args);
                Object objSafeThisObject = safeThisObject(chain);
                if (methodHookParam.thisObject == null) {
                    if (objSafeThisObject == null) {
                        objSafeThisObject = objProceed;
                    }
                    methodHookParam.thisObject = objSafeThisObject;
                }
                methodHookParam.setResult(objProceed);
                methodHookParam.clearReturnEarly();
            } catch (Throwable th) {
                methodHookParam.setThrowable(th);
                methodHookParam.clearReturnEarly();
            }
        }
        xC_MethodHook.afterHookedMethod(methodHookParam);
        return methodHookParam.getResultOrThrowable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object invokeOriginalMethod(Member member, Object obj, Object[] objArr) {
        if (member == null) {
            throw new NullPointerException("method == null");
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        XposedInterface xposedInterface = sFramework;
        if (xposedInterface != null) {
            if (member instanceof Method) {
                XposedInterface.Invoker invoker = xposedInterface.getInvoker((Method) member);
                invoker.setType(XposedInterface.Invoker.Type.ORIGIN);
                return invoker.invoke(obj, objArr);
            }
            if (member instanceof Constructor) {
                XposedInterface.CtorInvoker invoker2 = xposedInterface.getInvoker((Constructor) member);
                invoker2.setType(XposedInterface.Invoker.Type.ORIGIN);
                return invoker2.newInstance(objArr);
            }
        }
        if (member instanceof Method) {
            Method method = (Method) member;
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        }
        if (!(member instanceof Constructor)) {
            C0479u2.m1036a(member, "Unsupported member: ");
            return null;
        }
        Constructor constructor = (Constructor) member;
        constructor.setAccessible(true);
        return constructor.newInstance(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isFrameworkMarker(String str) {
        String lowerCase = str == null ? "" : str.toLowerCase();
        return lowerCase.contains("lsposed") || lowerCase.contains("lspd") || lowerCase.contains("lspatch") || lowerCase.contains("npatch") || lowerCase.contains("nitsuya") || lowerCase.contains("fpa") || lowerCase.contains("fankes") || lowerCase.contains("libxposed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized void log(Throwable th) {
        try {
            if (sLoggingEnabled) {
                logRaw(6, th == null ? "null" : String.valueOf(th), th);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized void logAlways(String str) {
        logRaw(4, str, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void logRaw(int i, String str, Throwable th) {
        if (str == null) {
            str = "null";
        }
        XposedInterface xposedInterface = sFramework;
        if (xposedInterface != null) {
            try {
                if (th == null) {
                    xposedInterface.log(i, "Elaris", str);
                    return;
                } else {
                    xposedInterface.log(i, "Elaris", str, th);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        try {
            if (th == null) {
                Log.i("Elaris", str);
            } else {
                Log.e("Elaris", str, th);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void rememberFrameworkClass(XposedInterface xposedInterface) {
        try {
            StringBuilder sb = new StringBuilder();
            appendFrameworkSource(sb, xposedInterface.getClass().getName());
            ClassLoader classLoader = xposedInterface.getClass().getClassLoader();
            if (classLoader != null) {
                appendFrameworkSource(sb, String.valueOf(classLoader));
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int i = 0;
            while (true) {
                if (i >= stackTrace.length) {
                    break;
                }
                if (isFrameworkMarker(stackTrace[i].getClassName())) {
                    appendFrameworkSource(sb, stackTrace[i].getClassName());
                    break;
                }
                i++;
            }
            if (sb.length() > 0) {
                sFrameworkClassName = sb.toString();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static XposedInterface requireFramework() {
        XposedInterface xposedInterface = sFramework;
        if (xposedInterface != null) {
            return xposedInterface;
        }
        C0479u2.m1037b("Xposed framework is not attached");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object safeThisObject(XposedInterface.Chain chain) {
        try {
            return chain.getThisObject();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setLoggingEnabled(boolean z) {
        sLoggingEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object[] toArray(List<Object> list) {
        return (list == null || list.isEmpty()) ? new Object[0] : list.toArray(new Object[0]);
    }

    public static synchronized void log(String str) {
        if (sLoggingEnabled) {
            logRaw(4, str, null);
        }
    }

    public static void unhookMethod(Member member, XC_MethodHook xC_MethodHook) {
    }
}
