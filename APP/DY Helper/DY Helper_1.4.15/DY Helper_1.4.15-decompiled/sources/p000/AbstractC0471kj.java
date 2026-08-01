package p000;

/* JADX INFO: renamed from: kj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0471kj {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f5941 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f5942 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f5943 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap f5944 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.AbstractC0471kj.f5941 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.AbstractC0471kj.f5942 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.AbstractC0471kj.f5943 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.AbstractC0471kj.f5944 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m3282(java.lang.Class r2) {
            java.lang.ClassLoader r0 = r2.getClassLoader()
            if (r0 == 0) goto Lb
            int r0 = java.lang.System.identityHashCode(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = ":commentNestedLayoutField"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.Class m3283(java.lang.ClassLoader r4, java.lang.String r5) {
            r5.getClass()
            r4.getClass()
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.util.concurrent.ConcurrentHashMap r1 = p000.AbstractC0471kj.f5941
            java.lang.Object r2 = r1.get(r0)
            r3 = 0
            if (r2 == 0) goto L2f
            boolean r4 = r2 instanceof java.lang.Class
            if (r4 == 0) goto L2e
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
        L2e:
            return r3
        L2f:
            java.lang.Class r3 = p000.qe0.m4876(r4, r5)     // Catch: java.lang.Throwable -> L33
        L33:
            if (r3 != 0) goto L38
            x r4 = p000.C0966x.f11954
            goto L39
        L38:
            r4 = r3
        L39:
            r1.put(r0, r4)
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.reflect.Method m3284(java.lang.Class r5, java.lang.String r6, java.lang.Class... r7) {
            java.lang.String r0 = "H"
            java.lang.String r0 = m3285(r0, r5, r6, r7)
            java.util.concurrent.ConcurrentHashMap r1 = p000.AbstractC0471kj.f5943
            java.lang.Object r2 = r1.get(r0)
            r3 = 0
            if (r2 == 0) goto L17
            boolean r5 = r2 instanceof java.lang.reflect.Method
            if (r5 == 0) goto L16
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            return r2
        L16:
            return r3
        L17:
            if (r5 == 0) goto L39
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L39
            int r2 = r7.length     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r7, r2)     // Catch: java.lang.Throwable -> L34
            java.lang.Class[] r2 = (java.lang.Class[]) r2     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r6, r2)     // Catch: java.lang.Throwable -> L34
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L34
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L34
            return r2
        L34:
            java.lang.Class r5 = r5.getSuperclass()
            goto L17
        L39:
            x r5 = p000.C0966x.f11954
            r1.put(r0, r5)
            return r3
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m3285(java.lang.String r2, java.lang.Class r3, java.lang.String r4, java.lang.Class[] r5) {
            java.lang.ClassLoader r0 = r3.getClassLoader()
            if (r0 == 0) goto Lb
            int r0 = java.lang.System.identityHashCode(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r2 = 58
            r1.append(r2)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            r2 = 35
            r1.append(r2)
            r1.append(r4)
            r2 = 40
            r1.append(r2)
            gh r2 = new gh
            r3 = 23
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r0 = 0
            java.lang.String r2 = p000.AbstractC0312g7.m2256(r5, r4, r0, r2, r3)
            r3 = 41
            java.lang.String r2 = p000.AbstractC0602nx.m4132(r1, r2, r3)
            return r2
    }
}
