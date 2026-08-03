package t1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.d f12980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.d f12981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12982c;

    public b() {
            r1 = this;
            r1.<init>()
            t1.d r0 = new t1.d
            r0.<init>()
            r1.f12980a = r0
            t1.d r0 = new t1.d
            r0.<init>()
            r1.f12981b = r0
            return
    }

    public final void a(long r3, long r5) {
            r2 = this;
            r0 = 32
            long r0 = r5 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            t1.d r1 = r2.f12980a
            r1.a(r3, r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            t1.d r6 = r2.f12981b
            r6.a(r3, r5)
            return
    }
}
