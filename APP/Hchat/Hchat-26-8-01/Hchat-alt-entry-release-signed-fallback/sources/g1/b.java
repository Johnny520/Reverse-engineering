package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f4058a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f4059b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f4060c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f4061d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4062e = 0;

    static {
            r0 = 3
            long r0 = (long) r0
            r2 = 32
            long r3 = r0 << r2
            r5 = 0
            long r5 = (long) r5
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r5 = r5 | r3
            g1.b.f4058a = r5
            r5 = 1
            long r5 = (long) r5
            long r5 = r5 & r7
            long r5 = r5 | r3
            g1.b.f4059b = r5
            r5 = 2
            long r5 = (long) r5
            long r5 = r5 & r7
            long r3 = r3 | r5
            g1.b.f4060c = r3
            r3 = 4
            long r3 = (long) r3
            long r2 = r3 << r2
            long r0 = r0 & r7
            long r0 = r0 | r2
            g1.b.f4061d = r0
            return
    }

    public static final boolean a(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
