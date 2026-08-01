package p313v9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: v9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8857b {

    /* JADX INFO: renamed from: a */
    public static final C8857b f29413a = new C8857b();

    /* JADX INFO: renamed from: b */
    public static a f29414b;

    /* JADX INFO: renamed from: v9.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Method f29415a;

        /* JADX INFO: renamed from: b */
        public final Method f29416b;

        /* JADX INFO: renamed from: c */
        public final Method f29417c;

        /* JADX INFO: renamed from: d */
        public final Method f29418d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f29415a = method;
            this.f29416b = method2;
            this.f29417c = method3;
            this.f29418d = method4;
        }

        /* JADX INFO: renamed from: a */
        public final Method m34013a() {
            return this.f29416b;
        }

        /* JADX INFO: renamed from: b */
        public final Method m34014b() {
            return this.f29418d;
        }

        /* JADX INFO: renamed from: c */
        public final Method m34015c() {
            return this.f29417c;
        }

        /* JADX INFO: renamed from: d */
        public final Method m34016d() {
            return this.f29415a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m34007a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final a m34008b() {
        a aVar = f29414b;
        if (aVar != null) {
            return aVar;
        }
        a aVarM34007a = m34007a();
        f29414b = aVarM34007a;
        return aVarM34007a;
    }

    /* JADX INFO: renamed from: c */
    public final Class[] m34009c(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method methodM34013a = m34008b().m34013a();
        if (methodM34013a == null) {
            return null;
        }
        Object objInvoke = methodM34013a.invoke(cls, null);
        objInvoke.getClass();
        return (Class[]) objInvoke;
    }

    /* JADX INFO: renamed from: d */
    public final Object[] m34010d(Class cls) {
        cls.getClass();
        Method methodM34014b = m34008b().m34014b();
        if (methodM34014b == null) {
            return null;
        }
        return (Object[]) methodM34014b.invoke(cls, null);
    }

    /* JADX INFO: renamed from: e */
    public final Boolean m34011e(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method methodM34015c = m34008b().m34015c();
        if (methodM34015c == null) {
            return null;
        }
        Object objInvoke = methodM34015c.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m34012f(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method methodM34016d = m34008b().m34016d();
        if (methodM34016d == null) {
            return null;
        }
        Object objInvoke = methodM34016d.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }
}
