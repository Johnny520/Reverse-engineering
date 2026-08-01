package p313v9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: v9.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8855a {

    /* JADX INFO: renamed from: a */
    public static final C8855a f29409a = new C8855a();

    /* JADX INFO: renamed from: b */
    public static a f29410b;

    /* JADX INFO: renamed from: v9.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Method f29411a;

        /* JADX INFO: renamed from: b */
        public final Method f29412b;

        public a(Method method, Method method2) {
            this.f29411a = method;
            this.f29412b = method2;
        }

        /* JADX INFO: renamed from: a */
        public final Method m34005a() {
            return this.f29412b;
        }

        /* JADX INFO: renamed from: b */
        public final Method m34006b() {
            return this.f29411a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m34001a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final a m34002b(Object obj) {
        a aVar = f29410b;
        if (aVar != null) {
            return aVar;
        }
        a aVarM34001a = m34001a(obj);
        f29410b = aVarM34001a;
        return aVarM34001a;
    }

    /* JADX INFO: renamed from: c */
    public final Method m34003c(Object obj) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        Method methodM34005a = m34002b(obj).m34005a();
        if (methodM34005a == null) {
            return null;
        }
        Object objInvoke = methodM34005a.invoke(obj, null);
        objInvoke.getClass();
        return (Method) objInvoke;
    }

    /* JADX INFO: renamed from: d */
    public final Class m34004d(Object obj) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        Method methodM34006b = m34002b(obj).m34006b();
        if (methodM34006b == null) {
            return null;
        }
        Object objInvoke = methodM34006b.invoke(obj, null);
        objInvoke.getClass();
        return (Class) objInvoke;
    }
}
