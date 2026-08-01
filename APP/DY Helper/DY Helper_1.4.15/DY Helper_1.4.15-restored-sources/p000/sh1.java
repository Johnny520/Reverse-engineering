package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sh1 {

    /* JADX INFO: renamed from: α */
    public static final p000.sh1 f9903 = null;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f9904 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f9905 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f9906 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f9907 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicBoolean f9908 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicInteger f9909 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.Set f9910 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.util.Set f9911 = null;

    /* JADX INFO: renamed from: κ */
    public static volatile java.lang.ref.WeakReference f9912;

    /* JADX INFO: renamed from: λ */
    public static volatile boolean f9913;

    /* JADX INFO: renamed from: μ */
    public static final java.lang.Object f9914 = null;

    /* JADX INFO: renamed from: ν */
    public static volatile long f9915;

    /* JADX INFO: renamed from: ξ */
    public static volatile java.lang.String f9916;

    /* JADX INFO: renamed from: ο */
    public static volatile java.lang.ref.WeakReference f9917;

    /* JADX INFO: renamed from: π */
    public static final java.util.concurrent.ConcurrentHashMap f9918 = null;

    /* JADX INFO: renamed from: ρ */
    public static final java.util.Set f9919 = null;

    static {
            sh1 r0 = new sh1
            r0.<init>()
            p000.sh1.f9903 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.sh1.f9904 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.sh1.f9905 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.sh1.f9906 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.sh1.f9907 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.sh1.f9908 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            p000.sh1.f9909 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            p000.sh1.f9910 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            p000.sh1.f9911 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.sh1.f9914 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.sh1.f9918 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            p000.sh1.f9919 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m5501(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L1e
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1e
            java.lang.reflect.Method[] r1 = r2.getDeclaredMethods()
            r1.getClass()
            p000.AbstractC0984xh.m6659(r0, r1)
            java.lang.Class r2 = r2.getSuperclass()
            goto L5
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static void m5502(java.lang.Object r5) {
            kx r0 = p000.EnumC0491kx.f6210
            if (r5 != 0) goto L6
            goto L7c
        L6:
            java.lang.ref.WeakReference r1 = p000.sh1.f9917
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r1.get()
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 != r5) goto L13
            goto L7c
        L13:
            java.lang.Class r1 = r5.getClass()
            boolean r2 = m5509(r1)
            if (r2 != 0) goto L1e
            goto L7c
        L1e:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r5)
            p000.sh1.f9917 = r2
            java.lang.Object r5 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.C0666ox.f8305
            boolean r5 = r5.get()
            if (r5 == 0) goto L7c
            java.util.Set r5 = p000.sh1.f9919
            java.lang.String r2 = r1.getName()
            boolean r5 = r5.add(r2)
            if (r5 == 0) goto L7c
            java.util.List r5 = p000.uh1.f10811
            java.lang.ClassLoader r5 = r1.getClassLoader()
            java.util.List r5 = p000.C0666ox.m4321(r0, r5)
            if (r5 != 0) goto L49
            jz r5 = p000.C0450jz.f5672
        L49:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L55
            goto L74
        L55:
            java.util.Iterator r5 = r2.iterator()
        L59:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r5.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = r1.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L59
            goto L7c
        L74:
            r2.add(r1)
            java.lang.Object r5 = p000.C0666ox.f8297
            p000.C0666ox.m4325(r0, r2)
        L7c:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.Integer m5503(java.lang.Object r2, java.lang.String r3) {
            r0 = 0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = p000.qe0.m4869(r2, r3, r0)     // Catch: java.lang.Throwable -> Lf
            boolean r3 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L11
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> Lf
            goto L19
        Lf:
            r2 = move-exception
            goto L13
        L11:
            r2 = r1
            goto L19
        L13:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L19:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m5504(java.lang.Class r5, java.lang.String r6) {
        L0:
            r0 = 0
            if (r5 == 0) goto L32
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L32
            java.lang.Class[] r1 = r5.getInterfaces()
            r1.getClass()
            int r2 = r1.length
        L13:
            if (r0 >= r2) goto L2d
            r3 = r1[r0]
            java.lang.String r4 = r3.getName()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L22
            goto L28
        L22:
            boolean r3 = m5504(r3, r6)
            if (r3 == 0) goto L2a
        L28:
            r5 = 1
            return r5
        L2a:
            int r0 = r0 + 1
            goto L13
        L2d:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L32:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static void m5505(java.lang.ClassLoader r6, java.util.List r7) {
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r7.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r1 = p000.uh1.m5860(r0)
            if (r1 != 0) goto L17
            goto L4
        L17:
            java.lang.String r1 = m5511(r0)
            java.util.Set r2 = p000.sh1.f9910
            boolean r3 = r2.add(r1)
            if (r3 != 0) goto L24
            goto L4
        L24:
            r3 = 1
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L4b
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L4b
            bm r4 = new bm     // Catch: java.lang.Throwable -> L4b
            r5 = 8
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L4b
            r3.m6775(r0, r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "hook play complete -> "
            r0.append(r3)     // Catch: java.lang.Throwable -> L4b
            r0.append(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4b
            m5510(r0)     // Catch: java.lang.Throwable -> L4b
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L4b
            goto L52
        L4b:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L52:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L4
            r2.remove(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "hook play complete failed -> "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", err="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            m5510(r0)
            goto L4
        L75:
            return
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m5506(java.lang.ClassLoader r3) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6208
            java.util.List r0 = p000.C0666ox.m4323(r0, r3)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L18
            java.lang.String r3 = "completed methods cache empty, re-resolve"
            m5510(r3)
            return r1
        L18:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L21
            m5505(r3, r0)
        L21:
            int r3 = r0.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "completed methods cache present, count="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            m5510(r3)
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public static boolean m5507(java.lang.ClassLoader r7, java.lang.Object r8, java.lang.String r9) {
            java.util.List r0 = p000.uh1.f10811
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6213
            java.lang.reflect.Field r7 = p000.C0666ox.m4322(r0, r7)
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L35
            r7.setAccessible(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = r7.get(r8)     // Catch: java.lang.Throwable -> L1e
            boolean r3 = p000.uh1.m5861(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L25:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r5 = r3 instanceof p000.eo1
            if (r5 == 0) goto L2c
            r3 = r4
        L2c:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L35
            goto L8f
        L35:
            java.lang.Class r7 = r8.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L3e:
            if (r7 == 0) goto L4d
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L4d
            java.lang.Class r7 = p000.lz1.m3684(r7, r3)
            goto L3e
        L4d:
            java.util.Iterator r7 = r3.iterator()
        L51:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r7.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L51
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r3.get(r8)     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L76:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L7b
            r4 = r1
        L7b:
            if (r4 != 0) goto L7e
            goto L51
        L7e:
            boolean r4 = p000.uh1.m5861(r4)
            if (r4 == 0) goto L51
            r3.setAccessible(r2)
            java.lang.Object r7 = p000.C0666ox.f8297
            p000.C0666ox.m4326(r0, r3)
            r7 = r3
            goto L8f
        L8e:
            r7 = r1
        L8f:
            if (r7 != 0) goto L92
            goto Le6
        L92:
            r7.setAccessible(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r7.get(r8)     // Catch: java.lang.Throwable -> L9a
            goto La1
        L9a:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        La1:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto La6
            r0 = r1
        La6:
            if (r0 != 0) goto La9
            goto Le6
        La9:
            java.lang.Class r3 = r0.getClass()
            java.util.ArrayList r3 = m5501(r3)
            java.util.Iterator r3 = r3.iterator()
        Lb5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le1
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto Lb5
            java.lang.String r6 = r5.getName()
            boolean r6 = p000.ln0.m3626(r6, r9)
            if (r6 == 0) goto Lb5
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto Lb5
            goto Le2
        Le1:
            r4 = r1
        Le2:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 != 0) goto Le8
        Le6:
            r7 = 0
            return r7
        Le8:
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> L135
            r4.invoke(r0, r1)     // Catch: java.lang.Throwable -> L135
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> L135
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L135
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L135
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L135
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L135
            java.lang.String r1 = r4.getName()     // Catch: java.lang.Throwable -> L135
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r2.<init>()     // Catch: java.lang.Throwable -> L135
            java.lang.String r3 = "invoke internal player OK: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L135
            r2.append(r8)     // Catch: java.lang.Throwable -> L135
            java.lang.String r8 = "."
            r2.append(r8)     // Catch: java.lang.Throwable -> L135
            r2.append(r7)     // Catch: java.lang.Throwable -> L135
            java.lang.String r7 = " -> "
            r2.append(r7)     // Catch: java.lang.Throwable -> L135
            r2.append(r0)     // Catch: java.lang.Throwable -> L135
            java.lang.String r7 = "#"
            r2.append(r7)     // Catch: java.lang.Throwable -> L135
            r2.append(r1)     // Catch: java.lang.Throwable -> L135
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L135
            m5510(r7)     // Catch: java.lang.Throwable -> L135
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L135
            goto L13c
        L135:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L13c:
            java.lang.Throwable r8 = p000.fo1.m2190(r7)
            if (r8 != 0) goto L143
            goto L15e
        L143:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "invoke internal player failed: method="
            r7.<init>(r0)
            r7.append(r9)
            java.lang.String r9 = ", err="
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            m5510(r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L15e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
    }

    /* JADX INFO: renamed from: λ */
    public static boolean m5508(java.lang.Object r6, java.lang.ClassLoader r7, boolean r8) {
            java.lang.String r0 = "resumeFeedPlayer OK via wrapper="
            java.lang.String r1 = "pauseFeedPlayer OK via wrapper="
            if (r8 == 0) goto L23
            java.util.List r2 = p000.uh1.f10811
            java.lang.String r2 = "pausePlay"
            java.lang.String r3 = "onPausePlay"
            java.lang.String r4 = "LJIIIIZZ"
            java.lang.String r5 = "pause"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r2, r3}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.util.List r3 = p000.AbstractC1021yh.m6896(r5)
            kx r4 = p000.EnumC0491kx.f6211
            java.lang.reflect.Method r7 = p000.uh1.m5863(r4, r6, r7, r2, r3)
            goto L3d
        L23:
            java.util.List r2 = p000.uh1.f10811
            java.lang.String r2 = "onResumePlay"
            java.lang.String r3 = "resumePlay"
            java.lang.String r4 = "resume"
            java.lang.String[] r2 = new java.lang.String[]{r3, r4, r2}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.util.List r3 = p000.AbstractC1021yh.m6896(r4)
            kx r4 = p000.EnumC0491kx.f6212
            java.lang.reflect.Method r7 = p000.uh1.m5863(r4, r6, r7, r2, r3)
        L3d:
            if (r7 != 0) goto L41
            r6 = 0
            return r6
        L41:
            r2 = 1
            r7.setAccessible(r2)     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            r7.invoke(r6, r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "#"
            if (r8 == 0) goto L6e
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            r3.append(r6)     // Catch: java.lang.Throwable -> L6c
            r3.append(r2)     // Catch: java.lang.Throwable -> L6c
            r3.append(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L6c
            goto L8c
        L6c:
            r6 = move-exception
            goto L92
        L6e:
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r7.getName()     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            r3.append(r6)     // Catch: java.lang.Throwable -> L6c
            r3.append(r2)     // Catch: java.lang.Throwable -> L6c
            r3.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L6c
        L8c:
            m5510(r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6c
            goto L98
        L92:
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L98:
            java.lang.Throwable r0 = p000.fo1.m2190(r6)
            if (r0 != 0) goto L9f
            goto Lc6
        L9f:
            java.lang.String r6 = r7.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "invoke wrapper control failed: pause="
            r7.<init>(r1)
            r7.append(r8)
            java.lang.String r8 = ", method="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ", err="
            r7.append(r6)
            r7.append(r0)
            java.lang.String r6 = r7.toString()
            m5510(r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        Lc6:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
    }

    /* JADX INFO: renamed from: μ */
    public static boolean m5509(java.lang.Class r6) {
            java.lang.String r0 = r6.getName()
            java.util.concurrent.ConcurrentHashMap r1 = p000.sh1.f9918
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L13
            boolean r6 = r0.booleanValue()
            return r6
        L13:
            java.lang.String r0 = r6.getName()
            java.lang.String r2 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r2 = r0.equals(r2)
            r3 = 1
            if (r2 == 0) goto L25
            goto L78
        L25:
            java.lang.String r2 = "FeedPlayerWrapper"
            r4 = 0
            boolean r0 = p000.q02.m4654(r0, r2, r4)
            if (r0 == 0) goto L2f
            goto L78
        L2f:
            java.lang.String r0 = "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A6499963AF392C9B2B9E9BAA7A7377F1B689B86E188"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m5504(r6, r0)
            if (r0 == 0) goto L3c
            goto L78
        L3c:
            java.util.ArrayList r0 = m5501(r6)
            f7 r2 = new f7
            r5 = 1
            r2.<init>(r5, r0)
            cf1 r0 = new cf1
            r5 = 19
            r0.<init>(r5)
            t52 r5 = new t52
            r5.<init>(r2, r0)
            java.util.Set r0 = p000.us1.m5950(r5)
            java.lang.String r2 = "setOnUIPlayListener"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L77
            java.lang.String r2 = "isPlaying"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "resumePlay"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "LJIIIIZZ"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L77
            goto L78
        L77:
            r3 = r4
        L78:
            java.lang.String r6 = r6.getName()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.put(r6, r0)
            return r3
    }

    /* JADX INFO: renamed from: ν */
    public static void m5510(java.lang.String r1) {
            java.lang.String r0 = "r33415130c3798aa0"
            p000.C0888ux.m5975(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.String m5511(java.lang.reflect.Method r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            cf1 r2 = new cf1
            r3 = 18
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: π */
    public static java.lang.Integer m5512(java.lang.Object r1, java.lang.String r2) {
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L15
            int r1 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L1c:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L21
            r1 = 0
        L21:
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public static boolean m5513(android.app.Activity r5) {
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "live"
            r2 = 0
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            r3 = 1
            if (r1 == 0) goto L1c
            goto L36
        L1c:
            java.lang.String r1 = "publish"
            boolean r1 = p000.q02.m4654(r0, r1, r2)
            if (r1 == 0) goto L25
            goto L36
        L25:
            java.lang.String r1 = "edit"
            boolean r0 = p000.q02.m4654(r0, r1, r2)
            if (r0 == 0) goto L2e
            goto L36
        L2e:
            android.view.View r0 = r5.getCurrentFocus()
            boolean r0 = r0 instanceof android.widget.EditText
            if (r0 == 0) goto L37
        L36:
            return r3
        L37:
            android.view.Window r5 = r5.getWindow()
            r0 = 0
            if (r5 == 0) goto L43
            android.view.View r5 = r5.getDecorView()
            goto L44
        L43:
            r5 = r0
        L44:
            boolean r1 = r5 instanceof android.view.ViewGroup
            if (r1 == 0) goto L4b
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L4b:
            if (r0 != 0) goto L4e
            goto L68
        L4e:
            qm1 r5 = new qm1
            r5.<init>()
            qh1 r1 = new qh1
            r4 = 0
            r1.<init>(r5, r4, r0)
            m5515(r0, r1)
            boolean r5 = r5.f9050
            if (r5 == 0) goto L68
            java.lang.String r5 = "auto_scroll_in_comment"
            boolean r5 = p000.ui1.m5887(r5, r2)
            r5 = r5 ^ r3
            return r5
        L68:
            return r2
    }

    /* JADX INFO: renamed from: σ */
    public static void m5514(android.app.Activity r2, java.lang.String r3) {
            xx0 r0 = new xx0
            r1 = 11
            r0.<init>(r2, r3, r1)
            android.os.Handler r2 = p000.sh1.f9904
            r2.post(r0)
            return
    }

    /* JADX INFO: renamed from: τ */
    public static void m5515(android.view.View r3, p000.a80 r4) {
            r4.invoke(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1d
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1d
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            m5515(r2, r4)
            int r1 = r1 + 1
            goto Le
        L1d:
            return
    }

    /* JADX INFO: renamed from: φ */
    public static final void m5516(long r8, float r10, android.app.Activity r11, int r12, float r13) {
            long r2 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            r0 = r8
            r5 = r10
            r4 = r12
            r6 = r13
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            r9 = 4098(0x1002, float:5.743E-42)
            r8.setSource(r9)
            e30 r9 = p000.e30.f3390     // Catch: java.lang.Throwable -> L1b
            p000.e30.m1838(r11, r8)     // Catch: java.lang.Throwable -> L1b
            r8.recycle()
            return
        L1b:
            r0 = move-exception
            r9 = r0
            r8.recycle()
            throw r9
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object m5517(java.lang.ClassLoader r10) {
            r9 = this;
            java.lang.ref.WeakReference r0 = p000.sh1.f9917
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L15
            java.lang.Class r1 = r0.getClass()
            boolean r1 = m5509(r1)
            if (r1 == 0) goto L15
            return r0
        L15:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.List r1 = p000.uh1.f10811
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6209
            java.util.List r1 = p000.C0666ox.m4323(r1, r10)
            if (r1 != 0) goto L28
            jz r1 = p000.C0450jz.f5672
        L28:
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r3 = m5511(r2)
            r0.put(r3, r2)
            goto L2c
        L40:
            java.util.List r1 = p000.uh1.f10811
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.List r2 = p000.uh1.f10812
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class r3 = p000.AbstractC0093bx.m1082(r10, r3)
            if (r3 != 0) goto L60
            goto L4d
        L60:
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            r3.getClass()
            int r4 = r3.length
            r5 = 0
        L69:
            if (r5 >= r4) goto L4d
            r6 = r3[r5]
            java.util.List r7 = p000.uh1.f10811
            r6.getClass()
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L7d
            goto Lab
        L7d:
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7.getClass()
            int r7 = r7.length
            if (r7 != 0) goto Lab
            java.lang.Class r7 = r6.getReturnType()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A6499963AF392C9B2B9E9BAA7A7377F1B689B86E188"
            java.lang.String r8 = p000.jf0.m2957(r8)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L9c
            goto La8
        L9c:
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "LIZJ"
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto Lab
        La8:
            p000.uh1.m5856(r1, r6)
        Lab:
            int r5 = r5 + 1
            goto L69
        Lae:
            java.util.Collection r10 = r1.values()
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = p000.AbstractC0984xh.m6666(r10)
            java.util.Iterator r10 = r10.iterator()
        Lbf:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Ld3
            java.lang.Object r1 = r10.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r2 = m5511(r1)
            r0.put(r2, r1)
            goto Lbf
        Ld3:
            boolean r10 = r0.isEmpty()
            r1 = 0
            if (r10 == 0) goto Ldb
            goto L130
        Ldb:
            java.util.Collection r10 = r0.values()
            java.util.Iterator r10 = r10.iterator()
        Le3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L130
            java.lang.Object r0 = r10.next()
            r0.getClass()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Throwable -> Lfb
            goto L102
        Lfb:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L102:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L107
            r0 = r1
        L107:
            if (r0 != 0) goto L10a
            goto Le3
        L10a:
            java.lang.Class r2 = r0.getClass()
            boolean r2 = m5509(r2)
            if (r2 == 0) goto Le3
            m5502(r0)
            java.lang.Class r10 = r0.getClass()
            r9.m5519(r10)
            java.lang.Class r9 = r0.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "FeedPlayerWrapper obtained -> "
            java.lang.String r9 = r10.concat(r9)
            m5510(r9)
            return r0
        L130:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m5518(android.app.Activity r11) {
            r10 = this;
            android.view.Window r0 = r11.getWindow()
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r0 = r0.getDecorView()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L14
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L15
        L14:
            r0 = r1
        L15:
            r2 = 0
            if (r0 != 0) goto L1a
            goto L141
        L1a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            wa r4 = new wa
            r5 = 29
            r4.<init>(r0, r5, r3)
            m5515(r0, r4)
            ib1 r0 = new ib1
            r4 = 17
            r0.<init>(r4)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r3, r0)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L41
            java.lang.String r0 = "auto next pager candidates empty"
            m5510(r0)
            goto L141
        L41:
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L141
            java.lang.Object r3 = r0.next()
            l91 r3 = (p000.l91) r3
            java.lang.Object r4 = r3.f6502
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r3.f6503
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r5 = "setCurrentItem"
            java.lang.String r6 = "getCurrentItem"
            java.lang.Integer r6 = m5503(r4, r6)
            if (r6 == 0) goto L6c
        L67:
            int r6 = r6.intValue()
            goto L7e
        L6c:
            java.lang.String r6 = "mCurrentItem"
            java.lang.Integer r6 = m5512(r4, r6)
            if (r6 == 0) goto L75
            goto L67
        L75:
            java.lang.String r6 = "mCurItem"
            java.lang.Integer r6 = m5512(r4, r6)
            if (r6 == 0) goto Laf
            goto L67
        L7e:
            java.lang.String r7 = "getAdapter"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = p000.qe0.m4869(r4, r7, r8)     // Catch: java.lang.Throwable -> L87
            goto L8e
        L87:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L8e:
            boolean r8 = r7 instanceof p000.eo1
            if (r8 == 0) goto L93
            r7 = r1
        L93:
            if (r7 != 0) goto L97
            r8 = r1
            goto La5
        L97:
            java.lang.String r8 = "getItemCount"
            java.lang.Integer r8 = m5503(r7, r8)
            if (r8 != 0) goto La5
            java.lang.String r8 = "getCount"
            java.lang.Integer r8 = m5503(r7, r8)
        La5:
            if (r8 == 0) goto Lb2
            int r7 = r6 + 1
            int r8 = r8.intValue()
            if (r7 < r8) goto Lb2
        Laf:
            r5 = r2
            goto L122
        Lb2:
            pq r7 = p000.C0696pq.f8651
            mq r7 = p000.C0696pq.m4566()
            java.lang.Object r8 = p000.qe0.f8982     // Catch: java.lang.Throwable -> Lca
            int r8 = r6 + 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lca
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lca
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}     // Catch: java.lang.Throwable -> Lca
            p000.qe0.m4869(r4, r5, r8)     // Catch: java.lang.Throwable -> Lca
            goto Ld0
        Lca:
            r8 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r8)
        Ld0:
            java.lang.Throwable r8 = p000.fo1.m2190(r9)
            if (r8 != 0) goto Ld7
            goto Lf1
        Ld7:
            java.lang.Object r8 = p000.qe0.f8982     // Catch: java.lang.Throwable -> Lea
            int r6 = r6 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lea
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> Lea
            p000.qe0.m4869(r4, r5, r6)     // Catch: java.lang.Throwable -> Lea
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lea
            r9 = r5
            goto Lf1
        Lea:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r9 = r6
        Lf1:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r6 = r9 instanceof p000.eo1
            if (r6 == 0) goto Lf8
            r9 = r5
        Lf8:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r5 = r9.booleanValue()
            if (r5 == 0) goto L122
            java.lang.Class r6 = r4.getClass()
            java.lang.String r6 = r6.getName()
            if (r7 != 0) goto L110
            java.lang.String r6 = "auto next pager fallback skipped: current work summary unavailable"
            m5510(r6)
            goto L122
        L110:
            java.util.concurrent.atomic.AtomicInteger r8 = p000.sh1.f9909
            int r8 = r8.get()
            vw r9 = new vw
            r9.<init>(r8, r11, r7, r6)
            r6 = 450(0x1c2, double:2.223E-321)
            android.os.Handler r8 = p000.sh1.f9904
            r8.postDelayed(r9, r6)
        L122:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = ", score="
            java.lang.String r7 = ", accepted="
            java.lang.String r8 = "auto next pager request class="
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4135(r3, r8, r4, r6, r7)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            m5510(r3)
            if (r5 == 0) goto L45
            goto L147
        L141:
            boolean r10 = r10.m5521(r11)
            if (r10 == 0) goto L148
        L147:
            r2 = 1
        L148:
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public final void m5519(java.lang.Class r11) {
            r10 = this;
            java.lang.String r0 = r11.getName()
            java.util.Set r1 = p000.sh1.f9911
            boolean r0 = r1.add(r0)
            if (r0 != 0) goto Le
            goto Le2
        Le:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L7d
            ad1 r2 = new ad1     // Catch: java.lang.Throwable -> L7d
            r3 = 5
            r2.<init>(r3, r10)     // Catch: java.lang.Throwable -> L7d
            r0.m6773(r11, r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "LJIIIIZZ"
            java.lang.String r5 = "resumePlay"
            java.lang.String r6 = "pause"
            java.lang.String r7 = "resume"
            java.lang.String r8 = "stopPlay"
            java.lang.String r9 = "setOnUIPlayListener"
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}     // Catch: java.lang.Throwable -> L7d
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.reflect.Method[] r2 = r11.getDeclaredMethods()     // Catch: java.lang.Throwable -> L7d
            r2.getClass()     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Throwable -> L7d
            int r4 = r2.length     // Catch: java.lang.Throwable -> L7d
            r5 = 0
        L3b:
            r6 = 1
            if (r5 >= r4) goto L86
            r7 = r2[r5]     // Catch: java.lang.Throwable -> L7d
            int r8 = r7.getModifiers()     // Catch: java.lang.Throwable -> L7d
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L83
            int r8 = r7.getModifiers()     // Catch: java.lang.Throwable -> L7d
            boolean r8 = java.lang.reflect.Modifier.isAbstract(r8)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L83
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L7d
            boolean r8 = r0.contains(r8)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L80
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L7d
            r8.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r9 = "pause"
            boolean r8 = p000.q02.m4654(r8, r9, r6)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L80
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L7d
            r8.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r9 = "resume"
            boolean r6 = p000.q02.m4654(r8, r9, r6)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L83
            goto L80
        L7d:
            r0 = move-exception
            r10 = r0
            goto Lc0
        L80:
            r3.add(r7)     // Catch: java.lang.Throwable -> L7d
        L83:
            int r5 = r5 + 1
            goto L3b
        L86:
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
        L8a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto La5
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L7d
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L7d
            r2.setAccessible(r6)     // Catch: java.lang.Throwable -> L7d
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L7d
            ad1 r4 = new ad1     // Catch: java.lang.Throwable -> L7d
            r5 = 6
            r4.<init>(r5, r10)     // Catch: java.lang.Throwable -> L7d
            r3.m6775(r2, r4)     // Catch: java.lang.Throwable -> L7d
            goto L8a
        La5:
            java.lang.String r10 = r11.getName()     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r0.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "FeedPlayerWrapper cache hook OK -> "
            r0.append(r2)     // Catch: java.lang.Throwable -> L7d
            r0.append(r10)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L7d
            m5510(r10)     // Catch: java.lang.Throwable -> L7d
            s62 r10 = p000.s62.f9751     // Catch: java.lang.Throwable -> L7d
            goto Lc6
        Lc0:
            eo1 r0 = new eo1
            r0.<init>(r10)
            r10 = r0
        Lc6:
            java.lang.Throwable r10 = p000.fo1.m2190(r10)
            if (r10 == 0) goto Le2
            java.lang.String r0 = r11.getName()
            r1.remove(r0)
            java.lang.String r11 = r11.getName()
            java.lang.String r0 = "FeedPlayerWrapper cache hook failed: "
            java.lang.String r11 = r0.concat(r11)
            java.lang.String r0 = "r33415130c3798aa0"
            p000.C0888ux.m5977(r0, r11, r10)
        Le2:
            return
    }

    /* JADX INFO: renamed from: ο */
    public final void m5520(java.lang.ClassLoader r9) {
            r8 = this;
            java.lang.Object r8 = r8.m5517(r9)
            java.lang.String r0 = "pause"
            r1 = 1
            if (r8 == 0) goto L19
            boolean r2 = m5508(r8, r9, r1)
            if (r2 == 0) goto L11
            goto Ld2
        L11:
            boolean r8 = m5507(r9, r8, r0)
            if (r8 == 0) goto L19
            goto Ld2
        L19:
            java.lang.String r8 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC406E12B8914FB88E85298625B4217CE390D825569B5182C86950"
            java.lang.String r8 = p000.jf0.m2957(r8)     // Catch: java.lang.Throwable -> La9
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> La9
            r2 = 0
            r8 = r8[r2]     // Catch: java.lang.Throwable -> La9
            java.lang.Class r8 = p000.AbstractC0093bx.m1082(r9, r8)     // Catch: java.lang.Throwable -> La9
            r9 = 0
            if (r8 == 0) goto L2e
            goto L2f
        L2e:
            r8 = r9
        L2f:
            if (r8 != 0) goto L33
            goto Ld0
        L33:
            java.lang.reflect.Method[] r3 = r8.getDeclaredMethods()     // Catch: java.lang.Throwable -> L5f
            r3.getClass()     // Catch: java.lang.Throwable -> L5f
            int r4 = r3.length     // Catch: java.lang.Throwable -> L5f
            r5 = r2
        L3c:
            if (r5 >= r4) goto L64
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L5f
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L5f
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L61
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L5f
            r7.getClass()     // Catch: java.lang.Throwable -> L5f
            int r7 = r7.length     // Catch: java.lang.Throwable -> L5f
            if (r7 != 0) goto L61
            java.lang.Class r7 = r6.getReturnType()     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r8.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L61
            goto L65
        L5f:
            r3 = move-exception
            goto L71
        L61:
            int r5 = r5 + 1
            goto L3c
        L64:
            r6 = r9
        L65:
            if (r6 == 0) goto L6f
            r6.setAccessible(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = r6.invoke(r9, r9)     // Catch: java.lang.Throwable -> L5f
            goto L77
        L6f:
            r3 = r9
            goto L77
        L71:
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> La9
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La9
            r3 = r4
        L77:
            boolean r4 = r3 instanceof p000.eo1     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto L7c
            r3 = r9
        L7c:
            if (r3 != 0) goto L98
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r9)     // Catch: java.lang.Throwable -> L8a
            r8.setAccessible(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r8 = r8.newInstance(r9)     // Catch: java.lang.Throwable -> L8a
            goto L91
        L8a:
            r8 = move-exception
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> La9
            r1.<init>(r8)     // Catch: java.lang.Throwable -> La9
            r8 = r1
        L91:
            boolean r1 = r8 instanceof p000.eo1     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto L96
            goto L99
        L96:
            r9 = r8
            goto L99
        L98:
            r9 = r3
        L99:
            if (r9 != 0) goto L9c
            goto Ld0
        L9c:
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La9
            p000.qe0.m4869(r9, r0, r8)     // Catch: java.lang.Throwable -> La9
            java.lang.String r8 = "pauseFeedPlayer OK via PlayerService"
            m5510(r8)     // Catch: java.lang.Throwable -> La9
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La9
            goto Lb0
        La9:
            r8 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        Lb0:
            java.lang.Throwable r9 = p000.fo1.m2190(r8)
            if (r9 != 0) goto Lb7
            goto Lca
        Lb7:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "pauseByPlayerService failed: "
            r8.<init>(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            m5510(r8)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        Lca:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r2 = r8.booleanValue()
        Ld0:
            if (r2 == 0) goto Ld3
        Ld2:
            return
        Ld3:
            java.lang.String r8 = "pauseFeedPlayer failed: wrapper/provider/playerService all unavailable"
            m5510(r8)
            return
    }

    /* JADX INFO: renamed from: υ */
    public final boolean m5521(android.app.Activity r19) {
            r18 = this;
            android.view.Window r0 = r19.getWindow()
            r1 = 0
            if (r0 == 0) goto La7
            android.view.View r0 = r0.getDecorView()
            if (r0 != 0) goto Lf
            goto La7
        Lf:
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            if (r2 <= 0) goto La7
            if (r0 > 0) goto L1d
            goto La7
        L1d:
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r6 = r2 * r3
            float r0 = (float) r0
            r2 = 1060655596(0x3f3851ec, float:0.72)
            float r9 = r0 * r2
            r2 = 1049582633(0x3e8f5c29, float:0.28)
            float r0 = r0 * r2
            long r4 = android.os.SystemClock.uptimeMillis()
            r2 = 1
            p000.sh1.f9913 = r2
            r8 = 0
            r7 = r19
            m5516(r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L79
            r3 = r9
        L3a:
            float r7 = (float) r2     // Catch: java.lang.Throwable -> L79
            r10 = 8
            float r8 = (float) r10     // Catch: java.lang.Throwable -> L79
            float r7 = r7 / r8
            float r8 = r0 - r3
            float r8 = r8 * r7
            float r8 = r8 + r3
            android.os.Handler r11 = p000.sh1.f9904     // Catch: java.lang.Throwable -> L79
            r9 = r6
            r6 = r4
            ph1 r4 = new ph1     // Catch: java.lang.Throwable -> L79
            r5 = r8
            r8 = r9
            r9 = r19
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L79
            r16 = r6
            r7 = r4
            r4 = r16
            r6 = r8
            long r8 = (long) r2     // Catch: java.lang.Throwable -> L79
            r12 = 320(0x140, double:1.58E-321)
            long r8 = r8 * r12
            r14 = 9
            long r14 = (long) r14     // Catch: java.lang.Throwable -> L79
            long r8 = r8 / r14
            r11.postDelayed(r7, r8)     // Catch: java.lang.Throwable -> L79
            if (r2 == r10) goto L66
            int r2 = r2 + 1
            goto L3a
        L66:
            ph1 r2 = new ph1     // Catch: java.lang.Throwable -> L79
            r10 = r19
            r7 = r4
            r9 = r6
            r5 = r18
            r6 = r0
            r4 = r2
            r4.<init>(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L79
            r11.postDelayed(r4, r12)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L79
            goto L80
        L79:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L80:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            if (r2 == 0) goto L99
            p000.sh1.f9913 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "swipe next failed: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m5510(r1)
        L99:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto La0
            r0 = r1
        La0:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        La7:
            return r1
    }
}
