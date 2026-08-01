package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class md2 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object f7088 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f7089 = null;

    /* JADX INFO: renamed from: γ */
    public static volatile p000.C0448jx f7090;

    /* JADX INFO: renamed from: δ */
    public static volatile p000.nd2 f7091;

    /* JADX INFO: renamed from: ε */
    public static volatile java.lang.ClassLoader f7092;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.ConcurrentHashMap f7093 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.ConcurrentHashMap f7094 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.concurrent.ConcurrentHashMap f7095 = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.md2.f7088 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.md2.f7089 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.md2.f7093 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.md2.f7094 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.md2.f7095 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m3814(android.content.Context r14, p000.z81 r15) {
            android.content.Context r0 = r14.getApplicationContext()
            if (r0 != 0) goto L8
            r1 = r14
            goto L9
        L8:
            r1 = r0
        L9:
            android.content.pm.PackageManager r14 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r1.getPackageName()     // Catch: java.lang.Throwable -> L17
            r2 = 0
            android.content.pm.PackageInfo r14 = r14.getPackageInfo(r0, r2)     // Catch: java.lang.Throwable -> L17
            goto L1f
        L17:
            r0 = move-exception
            r14 = r0
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        L1f:
            boolean r0 = r14 instanceof p000.eo1
            r2 = 0
            if (r0 == 0) goto L25
            r14 = r2
        L25:
            android.content.pm.PackageInfo r14 = (android.content.pm.PackageInfo) r14
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo()
            java.lang.String r3 = ""
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.sourceDir
            if (r0 != 0) goto L34
            goto L36
        L34:
            r4 = r0
            goto L41
        L36:
            android.content.pm.ApplicationInfo r0 = r15.f13012
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.sourceDir
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 != 0) goto L34
            r4 = r3
        L41:
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L46
            goto L4d
        L46:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L4d:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L52
            r0 = r2
        L52:
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 != 0) goto L58
            java.lang.ClassLoader r0 = r15.f13011
        L58:
            r9 = r0
            java.lang.String r0 = r1.getPackageName()
            boolean r5 = p000.q02.m4671(r0)
            if (r5 == 0) goto L65
            java.lang.String r0 = r15.f13009
        L65:
            r15 = r0
            r5 = 0
            if (r14 == 0) goto L6f
            long r7 = r14.getLongVersionCode()
            goto L70
        L6f:
            r7 = r5
        L70:
            if (r14 == 0) goto L74
            java.lang.String r2 = r14.versionName
        L74:
            if (r2 != 0) goto L77
            goto L78
        L77:
            r3 = r2
        L78:
            if (r14 == 0) goto L7d
            long r5 = r14.lastUpdateTime
            goto La2
        L7d:
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L8b
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L8b
            long r10 = r14.lastModified()     // Catch: java.lang.Throwable -> L8b
            java.lang.Long r14 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L8b
            goto L93
        L8b:
            r0 = move-exception
            r14 = r0
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        L93:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            boolean r2 = r14 instanceof p000.eo1
            if (r2 == 0) goto L9c
            r14 = r0
        L9c:
            java.lang.Number r14 = (java.lang.Number) r14
            long r5 = r14.longValue()
        La2:
            java.lang.String r10 = "1.4.15"
            r12 = r5
            r6 = r3
            r3 = r4
            r4 = r7
            r7 = r12
            r2 = r15
            m3815(r1, r2, r3, r4, r6, r7, r9, r10)
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m3815(android.content.Context r14, java.lang.String r15, java.lang.String r16, long r17, java.lang.String r19, long r20, java.lang.ClassLoader r22, java.lang.String r23) {
            r0 = r22
            java.lang.Object r1 = p000.C0666ox.f8297
            r0.getClass()
            java.lang.CharSequence r1 = p000.q02.m4660(r16)
            java.lang.String r1 = r1.toString()
            boolean r2 = p000.q02.m4671(r1)
            r3 = 0
            if (r2 == 0) goto L1c
            java.lang.String r14 = "forwarding runtime init skipped, host apk path is blank"
            p000.C0666ox.m4319(r14)
            return r3
        L1c:
            java.lang.Object r2 = p000.C0666ox.f8297
            monitor-enter(r2)
            java.lang.String r4 = p000.C0666ox.f8302     // Catch: java.lang.Throwable -> L2c
            boolean r4 = p000.ln0.m3626(r4, r1)     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L30
            java.lang.ClassLoader r4 = p000.C0666ox.f8303     // Catch: java.lang.Throwable -> L2c
            if (r4 == r0) goto L38
            goto L30
        L2c:
            r0 = move-exception
            r14 = r0
            goto Lec
        L30:
            p000.C0666ox.m4307()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "forwarding runtime changed"
            p000.C0666ox.m4308(r4)     // Catch: java.lang.Throwable -> L2c
        L38:
            p000.C0666ox.f8302 = r1     // Catch: java.lang.Throwable -> L2c
            p000.C0666ox.f8303 = r0     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0666ox.f8305     // Catch: java.lang.Throwable -> L2c
            r4 = 1
            r1.set(r4)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "forwarding runtime initialized, loader="
            java.lang.String r1 = r2.concat(r1)
            p000.C0666ox.m4319(r1)
            nd2 r5 = new nd2
            r6 = r15
            r10 = r16
            r7 = r17
            r9 = r19
            r11 = r20
            r13 = r23
            r5.<init>(r6, r7, r9, r10, r11, r13)
            java.lang.Object r1 = p000.md2.f7088
            monitor-enter(r1)
            nd2 r2 = p000.md2.f7091     // Catch: java.lang.Throwable -> L95
            boolean r2 = p000.ln0.m3626(r2, r5)     // Catch: java.lang.Throwable -> L95
            java.lang.ClassLoader r7 = p000.md2.f7092     // Catch: java.lang.Throwable -> L95
            if (r7 == r0) goto L72
            r3 = r4
        L72:
            if (r2 == 0) goto L76
            if (r3 == 0) goto L8f
        L76:
            java.util.concurrent.ConcurrentHashMap r3 = p000.md2.f7093     // Catch: java.lang.Throwable -> L95
            r3.clear()     // Catch: java.lang.Throwable -> L95
            java.util.concurrent.ConcurrentHashMap r3 = p000.md2.f7094     // Catch: java.lang.Throwable -> L95
            r3.clear()     // Catch: java.lang.Throwable -> L95
            java.util.concurrent.ConcurrentHashMap r3 = p000.md2.f7095     // Catch: java.lang.Throwable -> L95
            r3.clear()     // Catch: java.lang.Throwable -> L95
            java.util.concurrent.ConcurrentHashMap r3 = p000.ld2.f6580     // Catch: java.lang.Throwable -> L95
            r3.clear()     // Catch: java.lang.Throwable -> L95
            java.util.Set r3 = p000.ld2.f6581     // Catch: java.lang.Throwable -> L95
            r3.clear()     // Catch: java.lang.Throwable -> L95
        L8f:
            if (r2 != 0) goto L98
            r2 = 0
            p000.md2.f7090 = r2     // Catch: java.lang.Throwable -> L95
            goto L98
        L95:
            r0 = move-exception
            r14 = r0
            goto Lea
        L98:
            if (r14 == 0) goto La2
            android.content.Context r2 = r14.getApplicationContext()     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto La1
            goto La2
        La1:
            r14 = r2
        La2:
            if (r14 == 0) goto Lb2
            jx r2 = p000.md2.f7090     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto Lb0
            jx r2 = new jx     // Catch: java.lang.Throwable -> L95
            r2.<init>(r14, r4)     // Catch: java.lang.Throwable -> L95
            r2.m3002(r5)     // Catch: java.lang.Throwable -> L95
        Lb0:
            p000.md2.f7090 = r2     // Catch: java.lang.Throwable -> L95
        Lb2:
            p000.md2.f7091 = r5     // Catch: java.lang.Throwable -> L95
            p000.md2.f7092 = r0     // Catch: java.lang.Throwable -> L95
            java.util.concurrent.atomic.AtomicBoolean r14 = p000.md2.f7089     // Catch: java.lang.Throwable -> L95
            r14.set(r4)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r1)
            java.lang.String r14 = "XHSHelper-DexKit"
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "initialized host="
            java.lang.String r2 = "/"
            r7 = r17
            java.lang.StringBuilder r15 = p000.AbstractC0602nx.m4137(r1, r15, r7, r2)
            java.lang.String r1 = "/"
            r15.append(r1)
            r9 = r19
            r15.append(r9)
            java.lang.String r1 = ", loader="
            r15.append(r1)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            p000.C0888ux.m5975(r14, r15)
            return r4
        Lea:
            monitor-exit(r1)
            throw r14
        Lec:
            monitor-exit(r2)
            throw r14
    }
}
