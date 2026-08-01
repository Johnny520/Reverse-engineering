package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class k11 {

    /* JADX INFO: renamed from: d */
    private static volatile boolean f2990d;

    /* JADX INFO: renamed from: a */
    public static final k11 f2987a = new k11();

    /* JADX INFO: renamed from: b */
    private static final u60 f2988b = new x51(new us0(10));

    /* JADX INFO: renamed from: c */
    private static final u60 f2989c = new x51(new us0(11));

    /* JADX INFO: renamed from: e */
    public static final int f2991e = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private k11() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final du0 m1753d() {
        return new du0("tag:([^,}]+)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final String m1754e() {
        return ik0.f2579a.m1592a(24, 17, 20, 84, 6, 29, 30, 68);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final String m1755f(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        try {
            String string = obj.toString();
            du0 du0VarM1758i = m1758i();
            du0VarM1758i.getClass();
            string.getClass();
            Matcher matcher = du0VarM1758i.f1193d.matcher(string);
            matcher.getClass();
            od0 od0VarM1204c = g60.m1204c(matcher, 0, string);
            if (od0VarM1204c == null || (str = (String) ((nd0) od0VarM1204c.m2878a()).get(1)) == null) {
                return null;
            }
            return k41.m1775g0(str).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final Activity m1756g(View view) {
        boolean z;
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final String m1757h() {
        return (String) f2988b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final du0 m1758i() {
        return (du0) f2989c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Object m1759k(XposedInterface.Chain chain) {
        chain.getClass();
        try {
            k11 k11Var = f2987a;
            Object thisObject = chain.getThisObject();
            if (k11Var.m1756g(thisObject instanceof View ? (View) thisObject : null) == null) {
                return chain.proceed();
            }
            Object obj = chain.getArgs().get(1);
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            if (arrayList == null) {
                return chain.proceed();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                try {
                } catch (Exception unused) {
                }
                boolean z = f2987a.m1755f(obj2) == null ? true : !m00.f3663S.m2385k0(r0, r5);
                if (z) {
                    arrayList2.add(obj2);
                }
            }
            List args = chain.getArgs();
            args.getClass();
            Object[] array = args.toArray(new Object[0]);
            array[1] = new ArrayList(arrayList2);
            return chain.proceed(array);
        } catch (Exception unused2) {
            return chain.proceed();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1760j(Class<?> cls) {
        XposedInterface.HookBuilder hookBuilderHook;
        if (f2990d || cls == null) {
            return;
        }
        f2990d = true;
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            ArrayList<Method> arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 2 && p30.m3002l(parameterTypes[1], ArrayList.class)) {
                    arrayList.add(method);
                }
            }
            if (arrayList.isEmpty()) {
                lb0.f3404a.m2014a(m1757h(), "no target");
                return;
            }
            for (Method method2 : arrayList) {
                try {
                    kf1 kf1VarM1887b = kf1.f3100G.m1887b();
                    if (kf1VarM1887b != null && (hookBuilderHook = kf1VarM1887b.hook(method2)) != null) {
                        hookBuilderHook.intercept(new C0796ua(24));
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }
}
