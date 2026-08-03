package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class hr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb.hr f16681a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f16682b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static wb.gr f16683c;

    static {
            wb.hr r0 = new wb.hr
            r0.<init>()
            wb.hr.f16681a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            wb.hr.f16682b = r0
            return
    }

    public final synchronized void a(java.lang.Class r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.HashSet r0 = wb.hr.f16682b     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r0.contains(r5)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto Lb
            monitor-exit(r4)
            return
        Lb:
            java.lang.String r1 = "onActivityResult"
            wb.q0 r2 = new wb.q0     // Catch: java.lang.Throwable -> L19
            r3 = 4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L19
            de.robv.android.xposed.XposedBridge.hookAllMethods(r5, r1, r2)     // Catch: java.lang.Throwable -> L19
            r0.add(r5)     // Catch: java.lang.Throwable -> L19
        L19:
            monitor-exit(r4)
            return
        L1b:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            throw r5
    }
}
