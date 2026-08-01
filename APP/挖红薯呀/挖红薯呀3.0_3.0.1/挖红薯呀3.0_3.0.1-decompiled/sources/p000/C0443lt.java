package p000;

import android.content.Context;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.Arrays;
import p000.m00;

/* JADX INFO: renamed from: lt */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0443lt {

    /* JADX INFO: renamed from: b */
    private static volatile String f3584b;

    /* JADX INFO: renamed from: c */
    private static Context f3585c;

    /* JADX INFO: renamed from: a */
    public static final C0443lt f3583a = new C0443lt();

    /* JADX INFO: renamed from: d */
    public static final int f3586d = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0443lt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final Object m2070d(Object obj, String str, Object... objArr) {
        try {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(obj.getClass().getMethods());
            while (c0822vM1933s.hasNext()) {
                Method method = (Method) c0822vM1933s.next();
                if (p30.m3002l(method.getName(), str) && method.getParameterTypes().length == objArr.length) {
                    try {
                        return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final void m2071e(ClassLoader classLoader) {
        if (f3584b != null) {
            return;
        }
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.xingin.account.impl.UserServiceImpl");
            Object objInvoke = clsLoadClass.getMethod("getUserInfo", null).invoke(clsLoadClass.getDeclaredField("INSTANCE").get(null), null);
            if (objInvoke == null) {
                return;
            }
            Object objM2070d = m2070d(objInvoke, "getUserid", new Object[0]);
            f3584b = objM2070d instanceof String ? (String) objM2070d : null;
        } catch (Exception e) {
            AbstractC0748t1.m4161s("ensureUserId fail: ", e.getMessage(), lb0.f3404a, "Fans");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final String m2072f(Context context) {
        m00.C0452a c0452a = m00.f3663S;
        String string = context.getSharedPreferences(c0452a.m2362Y(), 0).getString(c0452a.m2389n(), m00.f3726x1);
        return string == null ? m00.f3726x1 : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final Context m2073g() {
        return f3585c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final void m2074i(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = classLoader.loadClass("com.xingin.account.entities.BaseUserInfo").getDeclaredMethod("getFans", null);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(9));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Object m2075j(XposedInterface.Chain chain) {
        Context contextM2073g;
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            if (f3584b != null) {
                C0443lt c0443lt = f3583a;
                if (c0443lt.m2081p(chain.getThisObject()) && (contextM2073g = c0443lt.m2073g()) != null && c0443lt.m2080o(contextM2073g)) {
                    String strM2072f = c0443lt.m2072f(contextM2073g);
                    if (!p30.m3002l(objProceed instanceof String ? (String) objProceed : null, strM2072f)) {
                        return strM2072f;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    private final void m2076k(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = classLoader.loadClass("he9.t").getDeclaredMethod("l", null);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(10));
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Object m2077l(XposedInterface.Chain chain) {
        Context contextM2073g;
        chain.getClass();
        Object objProceed = chain.proceed();
        try {
            if (f3584b != null && objProceed != null) {
                C0443lt c0443lt = f3583a;
                if (c0443lt.m2081p(objProceed) && (contextM2073g = c0443lt.m2073g()) != null && c0443lt.m2080o(contextM2073g)) {
                    String strM2072f = c0443lt.m2072f(contextM2073g);
                    Object objM2070d = c0443lt.m2070d(objProceed, "getFans", new Object[0]);
                    if (!p30.m3002l(objM2070d instanceof String ? (String) objM2070d : null, strM2072f)) {
                        c0443lt.m2070d(objProceed, "setFans", strM2072f);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    private final void m2078m(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = classLoader.loadClass("com.xingin.account.entities.BaseUserInfo").getDeclaredMethod("setFans", String.class);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0430lg(1, classLoader));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Object m2079n(ClassLoader classLoader, XposedInterface.Chain chain) {
        C0443lt c0443lt;
        chain.getClass();
        try {
            c0443lt = f3583a;
            c0443lt.m2071e(classLoader);
        } catch (Exception unused) {
        }
        if (f3584b == null) {
            return chain.proceed();
        }
        if (!c0443lt.m2081p(chain.getThisObject())) {
            return chain.proceed();
        }
        Context contextM2073g = c0443lt.m2073g();
        if (contextM2073g != null && !c0443lt.m2080o(contextM2073g)) {
            return chain.proceed();
        }
        chain.getArgs().set(0, contextM2073g != null ? c0443lt.m2072f(contextM2073g) : m00.f3726x1);
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    private final boolean m2080o(Context context) {
        m00.C0452a c0452a = m00.f3663S;
        return context.getSharedPreferences(c0452a.m2362Y(), 0).getBoolean(c0452a.m2388m(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    private final boolean m2081p(Object obj) {
        if (f3584b != null && obj != null) {
            try {
                Object objM2070d = m2070d(obj, "getUserid", new Object[0]);
                return p30.m3002l(f3584b, objM2070d instanceof String ? (String) objM2070d : null);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m2082h(ClassLoader classLoader) {
        classLoader.getClass();
        m2078m(classLoader);
        m2074i(classLoader);
        m2076k(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m2083q(Context context) {
        context.getClass();
        f3585c = context;
    }
}
