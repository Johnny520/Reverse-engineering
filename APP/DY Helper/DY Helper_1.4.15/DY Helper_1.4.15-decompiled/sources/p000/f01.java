package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f01 {

    /* JADX INFO: renamed from: α */
    public static final p000.f01 f3708 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f3709 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f3710 = null;

    /* JADX INFO: renamed from: δ */
    public static final android.os.Handler f3711 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.lang.ThreadLocal f3712 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.ThreadLocal f3713 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.Map f3714 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.Map f3715 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.util.Set f3716 = null;

    static {
            f01 r0 = new f01
            r0.<init>()
            p000.f01.f3708 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.f01.f3709 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.f01.f3710 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.f01.f3711 = r0
            b01 r0 = new b01
            r1 = 0
            r0.<init>(r1)
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            p000.f01.f3712 = r0
            b01 r0 = new b01
            r0.<init>(r1)
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            p000.f01.f3713 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.f01.f3714 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.f01.f3715 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r0.getClass()
            p000.f01.f3716 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m1983(p000.de0 r1, java.lang.Object r2) {
            if (r2 == 0) goto L38
            java.lang.Class r0 = r1.f3102
            boolean r0 = r0.isInstance(r2)
            if (r0 != 0) goto Lb
            goto L38
        Lb:
            java.lang.reflect.Field r1 = r1.f3103     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1e
            java.util.Set r2 = p000.f01.f3716     // Catch: java.lang.Throwable -> L20
            boolean r1 = r2.add(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L20
            goto L27
        L1e:
            r1 = 0
            goto L27
        L20:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L27:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L38
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "refactor differ registration failed: "
            java.lang.String r0 = "rd1fe9f51c470bd02"
            p000.AbstractC0602nx.m4143(r2, r1, r0)
        L38:
            return
    }
}
