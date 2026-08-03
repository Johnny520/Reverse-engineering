package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb.zo f20688a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f20689b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static wb.xo f20690c;

    static {
            wb.zo r0 = new wb.zo
            r0.<init>()
            wb.zo.f20688a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            wb.zo.f20689b = r0
            return
    }

    public final synchronized void a(java.lang.Class r5) {
            r4 = this;
            java.lang.String r0 = "[Hchat:FakeLocation] 地图选点结果 Hook 安装失败: "
            monitor-enter(r4)
            java.util.HashSet r1 = wb.zo.f20689b     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.contains(r5)     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto Ld
            monitor-exit(r4)
            return
        Ld:
            java.lang.String r1 = "onActivityResult"
            wb.yo r2 = new wb.yo     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = de.robv.android.xposed.XposedBridge.hookAllMethods(r5, r1, r2)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r1 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3a
            r1 = r2
        L21:
            boolean r2 = r1 instanceof sf.f     // Catch: java.lang.Throwable -> L3a
            if (r2 != 0) goto L3c
            r2 = r1
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L3a
            r2.getClass()     // Catch: java.lang.Throwable -> L3a
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r2 != 0) goto L3c
            java.util.HashSet r2 = wb.zo.f20689b     // Catch: java.lang.Throwable -> L3a
            r2.add(r5)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r5 = move-exception
            goto L4f
        L3c:
            java.lang.Throwable r1 = sf.g.b(r1)     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L4d
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = r0.concat(r5)     // Catch: java.lang.Throwable -> L3a
            fb.v0.n(r5, r1)     // Catch: java.lang.Throwable -> L3a
        L4d:
            monitor-exit(r4)
            return
        L4f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            throw r5
    }
}
