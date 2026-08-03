package p230p8;

import android.content.Context;
import android.content.SharedPreferences;
import ch.C0568c;
import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3019q;
import org.luckypray.dexkit.DexKitBridge;
import p054dg.C0791j;
import p062e8.C0828b;
import p086fh.C1243a;
import p211o9.C3092e;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: p8.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3372x {

    /* JADX INFO: renamed from: a */
    public final Context f10885a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f10886b;

    /* JADX INFO: renamed from: c */
    public final DexKitBridge f10887c;

    /* JADX INFO: renamed from: d */
    public final C3364p f10888d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f10889e;

    /* JADX INFO: renamed from: f */
    public volatile Method f10890f;

    /* JADX INFO: renamed from: g */
    public volatile Method f10891g;

    /* JADX INFO: renamed from: h */
    public volatile Object f10892h;

    /* JADX INFO: renamed from: i */
    public volatile Constructor f10893i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3372x(Context context, ClassLoader classLoader, DexKitBridge dexKitBridge, C3364p c3364p) {
        classLoader.getClass();
        this.f10885a = context;
        this.f10886b = classLoader;
        this.f10887c = dexKitBridge;
        this.f10888d = c3364p;
        this.f10889e = AbstractC4302b.m8640c(context, "Hchat_sns_interaction_method_cache");
        this.f10892h = C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m7146a(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m7147b((Method) it.next())) {
                if (list.isEmpty()) {
                    return false;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (m7148c((Method) it2.next())) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m7147b(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (Modifier.isStatic(method.getModifiers()) && !AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 7 && parameterTypes[0].getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
            Class<?> cls = parameterTypes[1];
            Class cls2 = Integer.TYPE;
            if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(parameterTypes[2], String.class) && AbstractC1416l.m3825a(parameterTypes[3], Long.TYPE) && AbstractC1416l.m3825a(parameterTypes[4], String.class) && AbstractC1416l.m3825a(parameterTypes[5], Boolean.TYPE) && AbstractC1416l.m3825a(parameterTypes[6], cls2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m7148c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (Modifier.isStatic(method.getModifiers()) && !AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && ((parameterTypes.length == 7 || parameterTypes.length == 8) && parameterTypes[0].getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo"))) {
            Class<?> cls = parameterTypes[1];
            Class cls2 = Integer.TYPE;
            if (AbstractC1416l.m3825a(cls, cls2) && !parameterTypes[2].isPrimitive() && !parameterTypes[3].isPrimitive() && AbstractC1416l.m3825a(parameterTypes[3], method.getReturnType()) && AbstractC1416l.m3825a(parameterTypes[4], Boolean.TYPE) && AbstractC1416l.m3825a(parameterTypes[5], cls2) && AbstractC1416l.m3825a(parameterTypes[6], cls2) && (parameterTypes.length == 7 || AbstractC1416l.m3825a(parameterTypes[7], String.class))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m7149d(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (Modifier.isStatic(method.getModifiers()) && !AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 4 && parameterTypes[0].getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
            Class<?> cls = parameterTypes[1];
            Class cls2 = Integer.TYPE;
            if (AbstractC1416l.m3825a(cls, cls2) && !parameterTypes[2].isPrimitive() && AbstractC1416l.m3825a(parameterTypes[3], cls2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m7150e(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (parameterTypes.length == 3) {
            Class<?> cls = parameterTypes[0];
            Class cls2 = Long.TYPE;
            if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(parameterTypes[1], cls2) && AbstractC1416l.m3825a(parameterTypes[2], Integer.TYPE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized Method m7151f() {
        Object c3959f;
        Object next;
        Method method = this.f10891g;
        Object obj = null;
        if (method != null) {
            if (!m7147b(method)) {
                method = null;
            }
            if (method != null) {
                return method;
            }
        }
        String strM2091g = C0828b.m2091g(this.f10885a, this.f10886b);
        Method methodM2087c = C0828b.m2087c(this.f10889e, strM2091g, this.f10886b, "native_comment_v1");
        if (methodM2087c != null) {
            if (!m7147b(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                this.f10891g = methodM2087c;
                return methodM2087c;
            }
        }
        DexKitBridge dexKitBridge = this.f10887c;
        if (dexKitBridge == null) {
            return null;
        }
        try {
            C0568c c0568c = new C0568c();
            C1243a c1243a = new C1243a();
            c1243a.m3363p0("MicroMsg.SnsService", "can not add Comment");
            c0568c.f1762h = c1243a;
            C3010h c3010h = new C3010h(new C0791j(AbstractC3015m.m6414X(AbstractC4166m.m8415m1(dexKitBridge.findClass(c0568c)), new C3371w(this, 1)), new C3092e(14), C3019q.f9816n));
            while (true) {
                if (!c3010h.hasNext()) {
                    next = null;
                    break;
                }
                next = c3010h.next();
                if (m7147b((Method) next)) {
                    break;
                }
            }
            Method method2 = (Method) next;
            if (method2 != null) {
                this.f10891g = method2;
                C0828b.m2092h(this.f10889e, strM2091g, "native_comment_v1", method2);
                c3959f = method2;
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f10888d.invoke("定位朋友圈原生评论方法失败: " + thM8182b.getMessage());
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (Method) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized Method m7152g() {
        Object c3959f;
        Object next;
        Method method = this.f10890f;
        Object obj = null;
        if (method != null) {
            if (!m7149d(method)) {
                method = null;
            }
            if (method != null) {
                return method;
            }
        }
        String strM2091g = C0828b.m2091g(this.f10885a, this.f10886b);
        Method methodM2087c = C0828b.m2087c(this.f10889e, strM2091g, this.f10886b, "native_like_v1");
        if (methodM2087c != null) {
            if (!m7149d(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                this.f10890f = methodM2087c;
                return methodM2087c;
            }
        }
        DexKitBridge dexKitBridge = this.f10887c;
        if (dexKitBridge == null) {
            return null;
        }
        try {
            C0568c c0568c = new C0568c();
            C1243a c1243a = new C1243a();
            c1243a.m3363p0("MicroMsg.SnsService", "can not add Comment");
            c0568c.f1762h = c1243a;
            C3010h c3010h = new C3010h(new C0791j(AbstractC3015m.m6414X(AbstractC4166m.m8415m1(dexKitBridge.findClass(c0568c)), new C3371w(this, 0)), new C3092e(13), C3019q.f9816n));
            while (true) {
                if (!c3010h.hasNext()) {
                    next = null;
                    break;
                }
                next = c3010h.next();
                if (m7149d((Method) next)) {
                    break;
                }
            }
            Method method2 = (Method) next;
            if (method2 != null) {
                this.f10890f = method2;
                C0828b.m2092h(this.f10889e, strM2091g, "native_like_v1", method2);
                c3959f = method2;
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f10888d.invoke("定位朋友圈原生点赞方法失败: " + thM8182b.getMessage());
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (Method) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized Constructor m7153h() {
        Object c3959f;
        Object next;
        Constructor constructor = this.f10893i;
        Object obj = null;
        if (constructor != null) {
            if (!m7150e(constructor)) {
                constructor = null;
            }
            if (constructor != null) {
                return constructor;
            }
        }
        String strM2091g = C0828b.m2091g(this.f10885a, this.f10886b);
        Constructor constructorM2088d = C0828b.m2088d(this.f10889e, strM2091g, this.f10886b, "timeline_refresh_v1");
        if (constructorM2088d != null) {
            if (!m7150e(constructorM2088d)) {
                constructorM2088d = null;
            }
            if (constructorM2088d != null) {
                this.f10893i = constructorM2088d;
                return constructorM2088d;
            }
        }
        DexKitBridge dexKitBridge = this.f10887c;
        if (dexKitBridge == null) {
            return null;
        }
        try {
            C0568c c0568c = new C0568c();
            C1243a c1243a = new C1243a();
            c1243a.m3363p0("MicroMsg.NetSceneSnsTimeLine");
            c0568c.f1762h = c1243a;
            C3010h c3010h = new C3010h(new C0791j(AbstractC3015m.m6414X(AbstractC4166m.m8415m1(dexKitBridge.findClass(c0568c)), new C3371w(this, 2)), new C3092e(15), C3019q.f9816n));
            while (true) {
                if (!c3010h.hasNext()) {
                    next = null;
                    break;
                }
                next = c3010h.next();
                if (m7150e((Constructor) next)) {
                    break;
                }
            }
            Constructor constructor2 = (Constructor) next;
            if (constructor2 != null) {
                this.f10893i = constructor2;
                C0828b.m2093i(this.f10889e, strM2091g, "timeline_refresh_v1", constructor2);
                c3959f = constructor2;
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f10888d.invoke("定位朋友圈原生刷新请求失败: " + thM8182b.getMessage());
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (Constructor) obj;
    }
}
