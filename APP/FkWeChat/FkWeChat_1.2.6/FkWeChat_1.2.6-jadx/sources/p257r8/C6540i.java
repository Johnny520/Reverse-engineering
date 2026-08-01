package p257r8;

import java.lang.reflect.Method;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: r8.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6540i {

    /* JADX INFO: renamed from: a */
    public static final C6540i f20491a = new C6540i();

    /* JADX INFO: renamed from: b */
    public static final a f20492b = new a(null, null, null);

    /* JADX INFO: renamed from: c */
    public static a f20493c;

    /* JADX INFO: renamed from: r8.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Method f20494a;

        /* JADX INFO: renamed from: b */
        public final Method f20495b;

        /* JADX INFO: renamed from: c */
        public final Method f20496c;

        public a(Method method, Method method2, Method method3) {
            this.f20494a = method;
            this.f20495b = method2;
            this.f20496c = method3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m25861a(InterfaceC5976f interfaceC5976f) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), interfaceC5976f.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), interfaceC5976f.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f20493c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f20492b;
            f20493c = aVar2;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m25862b(InterfaceC5976f interfaceC5976f) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        interfaceC5976f.getClass();
        a aVarM25861a = f20493c;
        if (aVarM25861a == null) {
            aVarM25861a = m25861a(interfaceC5976f);
        }
        if (aVarM25861a != f20492b && (method = aVarM25861a.f20494a) != null && (objInvoke = method.invoke(interfaceC5976f.getClass(), null)) != null && (method2 = aVarM25861a.f20495b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarM25861a.f20496c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
