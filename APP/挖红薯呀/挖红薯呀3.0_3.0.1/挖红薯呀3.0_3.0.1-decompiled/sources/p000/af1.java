package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.luckypray.dexkit.DexKitBridge;
import p000.C0695rn;
import p000.m00;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class af1 {

    /* JADX INFO: renamed from: a */
    public static final af1 f152a = new af1();

    /* JADX INFO: renamed from: b */
    private static final String f153b = "XhsUpBlock";

    /* JADX INFO: renamed from: c */
    public static final int f154c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private af1() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final void m132A(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = classLoader.loadClass("com.xingin.update.UpdateDialogActivity").getDeclaredMethod("onCreate", Bundle.class);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new dc1(9));
        } catch (Exception e) {
            AbstractC0748t1.m4161s("dialog: ", e.getMessage(), lb0.f3404a, f153b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Object m133B(XposedInterface.Chain chain) {
        chain.getClass();
        if (!f152a.m140I()) {
            return chain.proceed();
        }
        Object objProceed = chain.proceed();
        try {
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            ((Activity) thisObject).finish();
        } catch (Exception unused) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    private final void m134C(Class<?> cls) {
        kf1 kf1VarM1887b;
        XposedInterface.HookBuilder hookBuilderHook;
        Method method;
        kf1 kf1VarM1887b2;
        XposedInterface.HookBuilder hookBuilderHook2;
        Method method2;
        kf1 kf1VarM1887b3;
        XposedInterface.HookBuilder hookBuilderHook3;
        Class cls2 = Void.TYPE;
        Method method3 = null;
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods[i];
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && p30.m3002l(method2.getReturnType(), cls2) && !p30.m3002l(method2.getName(), "e")) {
                    break;
                } else {
                    i++;
                }
            }
            if (method2 != null && (kf1VarM1887b3 = kf1.f3100G.m1887b()) != null && (hookBuilderHook3 = kf1VarM1887b3.hook(method2)) != null) {
                hookBuilderHook3.intercept(new dc1(6));
            }
        } catch (Exception e) {
            AbstractC0748t1.m4161s("mgr_b: ", e.getMessage(), lb0.f3404a, f153b);
        }
        try {
            Method[] declaredMethods2 = cls.getDeclaredMethods();
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    method = null;
                    break;
                }
                method = declaredMethods2[i2];
                if (method.getParameterTypes().length == 2 && p30.m3002l(method.getParameterTypes()[0], Context.class) && p30.m3002l(method.getParameterTypes()[1], Boolean.TYPE)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method != null && (kf1VarM1887b2 = kf1.f3100G.m1887b()) != null && (hookBuilderHook2 = kf1VarM1887b2.hook(method)) != null) {
                hookBuilderHook2.intercept(new dc1(7));
            }
        } catch (Exception e2) {
            AbstractC0748t1.m4161s("mgr_c: ", e2.getMessage(), lb0.f3404a, f153b);
        }
        try {
            Method[] declaredMethods3 = cls.getDeclaredMethods();
            declaredMethods3.getClass();
            int length3 = declaredMethods3.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    break;
                }
                Method method4 = declaredMethods3[i3];
                if (method4.getParameterTypes().length == 1 && p30.m3002l(method4.getParameterTypes()[0], Context.class) && p30.m3002l(method4.getReturnType(), cls2)) {
                    method3 = method4;
                    break;
                }
                i3++;
            }
            if (method3 == null || (kf1VarM1887b = kf1.f3100G.m1887b()) == null || (hookBuilderHook = kf1VarM1887b.hook(method3)) == null) {
                return;
            }
            hookBuilderHook.intercept(new dc1(8));
        } catch (Exception e3) {
            AbstractC0748t1.m4161s("mgr_f: ", e3.getMessage(), lb0.f3404a, f153b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Object m135D(XposedInterface.Chain chain) {
        chain.getClass();
        if (f152a.m140I()) {
            return null;
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Object m136E(XposedInterface.Chain chain) {
        chain.getClass();
        if (f152a.m140I()) {
            return null;
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Object m137F(XposedInterface.Chain chain) {
        chain.getClass();
        if (f152a.m140I()) {
            return null;
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    private final void m138G(Class<?> cls, int i, Class<?>[] clsArr, InterfaceC0298hw interfaceC0298hw) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            int i2 = 0;
            boolean z = clsArr.length == 0;
            Method method = null;
            Class cls2 = Void.TYPE;
            if (!z) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Method method2 = declaredMethods[i2];
                    if (method2.getParameterTypes().length == i && p30.m3002l(method2.getReturnType(), cls2) && Arrays.equals(method2.getParameterTypes(), clsArr)) {
                        method = method2;
                        break;
                    }
                    i2++;
                }
            } else {
                Method[] declaredMethods2 = cls.getDeclaredMethods();
                declaredMethods2.getClass();
                int length2 = declaredMethods2.length;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    Method method3 = declaredMethods2[i2];
                    Class<?>[] parameterTypes = method3.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0 && p30.m3002l(method3.getReturnType(), cls2)) {
                        method = method3;
                        break;
                    }
                    i2++;
                }
            }
            if (method != null) {
                kf1 kf1VarM1887b = kf1.f3100G.m1887b();
                if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(method)) == null) {
                    return;
                }
                hookBuilderHook.intercept(new dc1(4));
                return;
            }
            lb0.f3404a.m2014a(f153b, interfaceC0298hw.invoke() + ": method not found");
        } catch (Exception e) {
            lb0.f3404a.m2014a(f153b, interfaceC0298hw.invoke() + ": " + e.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final Object m139H(XposedInterface.Chain chain) {
        chain.getClass();
        if (f152a.m140I()) {
            return null;
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final boolean m140I() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
            Context context = objInvoke instanceof Context ? (Context) objInvoke : null;
            if (context == null) {
                return false;
            }
            m00.C0452a c0452a = m00.f3663S;
            return context.getSharedPreferences(c0452a.m2362Y(), 0).getBoolean(c0452a.m2361X(), true);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    private final void m154o(ClassLoader classLoader) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.xingin.update.manager.channel.LiteUpdateManager");
            clsLoadClass.getClass();
            m138G(clsLoadClass, 0, new Class[0], new cc1(15));
            Class cls = Boolean.TYPE;
            cls.getClass();
            m138G(clsLoadClass, 2, new Class[]{Context.class, cls}, new cc1(16));
            m138G(clsLoadClass, 1, new Class[]{Context.class}, new cc1(17));
        } catch (Exception e) {
            AbstractC0748t1.m4161s("liteMgr: ", e.getMessage(), lb0.f3404a, f153b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m155p() {
        return "lite_b";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final String m156q() {
        return "lite_c";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final String m157r() {
        return "lite_f";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    private final void m158s(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = classLoader.loadClass("com.xingin.xhs.manager.UpdateNotifyManagerExtensionHelper").getDeclaredMethod("init", Class.forName("com.uber.autodispose.ScopeProvider", false, classLoader));
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new dc1(5));
        } catch (Exception e) {
            AbstractC0748t1.m4161s("notifyInit: ", e.getMessage(), lb0.f3404a, f153b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Object m159t(XposedInterface.Chain chain) {
        chain.getClass();
        if (f152a.m140I()) {
            return null;
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    private final void m160u(Class<?> cls) {
        int i;
        Method method;
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                i = 1;
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (method.getParameterTypes().length == 3 && p30.m3002l(method.getParameterTypes()[0], Context.class) && p30.m3002l(method.getParameterTypes()[1], Bundle.class) && p30.m3002l(method.getParameterTypes()[2], Integer.TYPE)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method == null) {
                lb0.f3404a.m2014a(f153b, "router: method not found");
                return;
            }
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(method)) == null) {
                return;
            }
            hookBuilderHook.intercept(new dc1(i));
        } catch (Exception e) {
            AbstractC0748t1.m4161s("router: ", e.getMessage(), lb0.f3404a, f153b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Object m161v(XposedInterface.Chain chain) {
        chain.getClass();
        if (f152a.m140I()) {
            return null;
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    private final void m162w(Class<?> cls) {
        XposedInterface.HookBuilder hookBuilderHook;
        int i;
        Method method;
        kf1 kf1VarM1887b;
        XposedInterface.HookBuilder hookBuilderHook2;
        Method method2;
        XposedInterface.HookBuilder hookBuilderHook3;
        Class cls2 = Void.TYPE;
        Method method3 = null;
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods[i2];
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && p30.m3002l(method2.getReturnType(), cls2)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method2 != null) {
                kf1 kf1VarM1887b2 = kf1.f3100G.m1887b();
                if (kf1VarM1887b2 != null && (hookBuilderHook3 = kf1VarM1887b2.hook(method2)) != null) {
                    hookBuilderHook3.intercept(new dc1(10));
                }
            } else {
                lb0.f3404a.m2014a(f153b, "stateManager: no void() method found");
            }
        } catch (Exception e) {
            AbstractC0748t1.m4161s("stateManager void(): ", e.getMessage(), lb0.f3404a, f153b);
        }
        try {
            Method[] declaredMethods2 = cls.getDeclaredMethods();
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            int i3 = 0;
            while (true) {
                i = 2;
                if (i3 >= length2) {
                    method = null;
                    break;
                }
                method = declaredMethods2[i3];
                if (method.getParameterTypes().length == 2 && p30.m3002l(method.getParameterTypes()[0], Context.class) && p30.m3002l(method.getParameterTypes()[1], Boolean.TYPE)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (method != null && (kf1VarM1887b = kf1.f3100G.m1887b()) != null && (hookBuilderHook2 = kf1VarM1887b.hook(method)) != null) {
                hookBuilderHook2.intercept(new dc1(i));
            }
        } catch (Exception e2) {
            AbstractC0748t1.m4161s("stateManager a(ctx,bool): ", e2.getMessage(), lb0.f3404a, f153b);
        }
        try {
            Method[] declaredMethods3 = cls.getDeclaredMethods();
            declaredMethods3.getClass();
            int length3 = declaredMethods3.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length3) {
                    break;
                }
                Method method4 = declaredMethods3[i4];
                if (method4.getParameterTypes().length == 1 && p30.m3002l(method4.getParameterTypes()[0], Context.class) && p30.m3002l(method4.getReturnType(), cls2)) {
                    method3 = method4;
                    break;
                }
                i4++;
            }
            if (method3 == null) {
                lb0.f3404a.m2014a(f153b, "stateManager: no void(Context) method found");
                return;
            }
            kf1 kf1VarM1887b3 = kf1.f3100G.m1887b();
            if (kf1VarM1887b3 == null || (hookBuilderHook = kf1VarM1887b3.hook(method3)) == null) {
                return;
            }
            hookBuilderHook.intercept(new dc1(3));
        } catch (Exception e3) {
            AbstractC0748t1.m4161s("stateManager void(Context): ", e3.getMessage(), lb0.f3404a, f153b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Object m163x(XposedInterface.Chain chain) {
        chain.getClass();
        if (f152a.m140I()) {
            return null;
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Object m164y(XposedInterface.Chain chain) {
        chain.getClass();
        if (f152a.m140I()) {
            return null;
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Object m165z(XposedInterface.Chain chain) {
        chain.getClass();
        if (f152a.m140I()) {
            return null;
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m166J() {
        Context context;
        Object objInvoke;
        Context context2 = null;
        try {
            try {
                objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
            } catch (Exception unused) {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke2 = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
                if (objInvoke2 instanceof Context) {
                    context = (Context) objInvoke2;
                }
            }
            if (objInvoke instanceof Context) {
                context = (Context) objInvoke;
                context2 = context;
            }
        } catch (Exception unused2) {
        }
        try {
            if (context2 == null) {
                lb0.f3404a.m2014a(f153b, "trigger: cannot get XHS context");
            } else {
                Intent intent = new Intent();
                intent.setClassName("com.xingin.xhs", "com.xingin.update.UpdateDialogActivity");
                intent.putExtra("source", "debug_trigger");
                intent.addFlags(268435456);
                context2.startActivity(intent);
            }
        } catch (Exception e) {
            AbstractC0748t1.m4161s("trigger: ", e.getMessage(), lb0.f3404a, f153b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m167n(ClassLoader classLoader) {
        classLoader.getClass();
        DexKitBridge dexKitBridgeM1429J = C0289hn.f2299a.m1429J();
        if (dexKitBridgeM1429J == null) {
            lb0.f3404a.m2014a(f153b, "bridge not available");
            return;
        }
        try {
            C0695rn.c cVarM3917w5 = C0695rn.f5457a.m3917w5(dexKitBridgeM1429J, classLoader);
            m132A(classLoader);
            m154o(classLoader);
            m158s(classLoader);
            if (cVarM3917w5.m3978g() != null) {
                m160u(cVarM3917w5.m3978g());
            } else {
                lb0.f3404a.m2014a(f153b, "routerHandler not found");
            }
            if (cVarM3917w5.m3979h() != null) {
                m162w(cVarM3917w5.m3979h());
            } else {
                lb0.f3404a.m2014a(f153b, "stateManager not found");
            }
            if (cVarM3917w5.m3977f() != null) {
                m134C(cVarM3917w5.m3977f());
            }
        } catch (Exception e) {
            AbstractC0748t1.m4161s("find: ", e.getMessage(), lb0.f3404a, f153b);
        }
    }
}
