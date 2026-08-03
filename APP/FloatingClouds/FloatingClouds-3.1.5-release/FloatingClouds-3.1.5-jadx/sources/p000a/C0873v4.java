package p000a;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: a.v4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0873v4 {

    /* JADX INFO: renamed from: a */
    public static final C0873v4 f3418a = new C0873v4();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f3419b;

    /* JADX INFO: renamed from: a */
    public static void m2087a(Class cls, String str) {
        StringBuilder sb = new StringBuilder(C0944z.m2226f(str, "\n"));
        for (Class cls2 : new C0351T7(new C0004A3(6, cls), new C0586g2(7))) {
            sb.append("--- " + cls2.getName() + " ---\n");
            Method[] declaredMethods = cls2.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                String name = method.getReturnType().getName();
                String name2 = method.getName();
                Class<?>[] parameterTypes = method.getParameterTypes();
                C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                sb.append(name + " " + name2 + "(" + C0238N1.m631e0(parameterTypes, null, new C0586g2(8), 31) + ")\n");
            }
        }
        C0908x1.m2193a("ConvMuteRuleRegistrar", sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public static void m2088b(ClassLoader classLoader) {
        Object objM2206a;
        C0052Cd c0052Cd;
        C0785qb c0785qb;
        C0631i9.m1482e(classLoader, "cl");
        C0908x1.m2194b("ConvMuteRuleRegistrar", "register() called registered=" + f3419b + " cl=" + classLoader);
        if (f3419b) {
            C0908x1.m2194b("ConvMuteRuleRegistrar", "register() already registered, skip");
            return;
        }
        int i = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, classLoader);
        try {
            c0052Cd = C0052Cd.f184a;
            InterfaceC0711md interfaceC0711mdM140c = c0052Cd.m140c("wx8076_conv_getter");
            c0785qb = interfaceC0711mdM140c instanceof C0785qb ? (C0785qb) interfaceC0711mdM140c : null;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (c0785qb == null) {
            throw new IllegalStateException("wx8076_conv_getter not registered");
        }
        Method method = c0052Cd.m139b(c0785qb, c0578fd).f2213f;
        if (method == null) {
            throw new IllegalStateException("wx8076_conv_getter method unresolved");
        }
        Class<?> declaringClass = method.getDeclaringClass();
        Class<?> returnType = method.getReturnType();
        String name = declaringClass.getName();
        String name2 = returnType.getName();
        C0908x1.m2194b("ConvMuteRuleRegistrar", "register convGetter OK: " + name + "." + method.getName() + "(String) -> " + name2);
        C0587g3 c0587g3 = new C0587g3("wx8076_mute_storage_class", name, 80, 12);
        C0587g3 c0587g32 = new C0587g3("wx8076_mute_model_class", name2, 80, 12);
        c0052Cd.m141i(c0587g3);
        c0052Cd.m141i(c0587g32);
        C0785qb c0785qb2 = new C0785qb("wx8076_mute_getter", "boolean", C0439Y5.f1645a, "", "wx8076_mute_model_class", true);
        C0785qb c0785qb3 = new C0785qb("wx8076_mute_setter", "void", C0889w1.m2124K("I"), "", "wx8076_mute_model_class", true);
        C0785qb c0785qb4 = new C0785qb("wx8076_conv_persist", "int", C0739o3.m1757d0("L" + C0015Ae.m48G(name2, ".", "/") + ";", "Ljava/lang/String;"), "W", "wx8076_mute_storage_class", true);
        Iterator it = C0739o3.m1757d0(c0785qb2, c0785qb3, c0785qb4).iterator();
        while (it.hasNext()) {
            C0052Cd.f184a.m141i((C0785qb) it.next());
        }
        C0052Cd c0052Cd2 = C0052Cd.f184a;
        C0597gd c0597gdM139b = c0052Cd2.m139b(c0785qb2, c0578fd);
        C0597gd c0597gdM139b2 = c0052Cd2.m139b(c0785qb3, c0578fd);
        C0597gd c0597gdM139b3 = c0052Cd2.m139b(c0785qb4, c0578fd);
        String name3 = method.getName();
        Method method2 = c0597gdM139b.f2213f;
        String name4 = method2 != null ? method2.getName() : null;
        Method method3 = c0597gdM139b2.f2213f;
        String name5 = method3 != null ? method3.getName() : null;
        Method method4 = c0597gdM139b3.f2213f;
        C0908x1.m2194b("ConvMuteRuleRegistrar", "register rules executed storage=" + name + " model=" + name2 + " convGetter=" + name3 + " muteGetter=" + name4 + " muteSetter=" + name5 + " persist=" + (method4 != null ? method4.getName() : null));
        Method method5 = c0597gdM139b.f2213f;
        if (method5 != null && c0597gdM139b2.f2213f != null && c0597gdM139b3.f2213f != null) {
            f3419b = true;
            C0908x1.m2194b("ConvMuteRuleRegistrar", "register() SUCCESS");
            objM2206a = C0413Wf.f1577a;
            Throwable thM2189a = C0901wd.m2189a(objM2206a);
            if (thM2189a != null) {
                C0908x1.m2193a("ConvMuteRuleRegistrar", "register() FAILED", thM2189a);
                return;
            }
            return;
        }
        if (method5 == null) {
            m2087a(returnType, "muteGetter not found on " + name2);
        }
        if (c0597gdM139b2.f2213f == null) {
            m2087a(returnType, "muteSetter not found on " + name2);
        }
        if (c0597gdM139b3.f2213f == null) {
            m2087a(declaringClass, "persist not found on " + name);
        }
        throw new IllegalStateException("mute rules partially unresolved");
    }
}
