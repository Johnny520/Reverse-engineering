package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f6358b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6359c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6360a;

    static {
            r0 = 0
            long r0 = i2.e0.b(r0, r0)
            i2.m0.f6358b = r0
            return
    }

    public /* synthetic */ m0(long r1) {
            r0 = this;
            r0.<init>()
            r0.f6360a = r1
            return
    }

    public static boolean a(java.lang.Object r4, long r5) {
            boolean r0 = r4 instanceof i2.m0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            i2.m0 r4 = (i2.m0) r4
            long r2 = r4.f6360a
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            return r1
        Lf:
            r4 = 1
            return r4
    }

    public static final boolean b(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final boolean c(long r3) {
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            if (r0 != r3) goto L10
            r3 = 1
            return r3
        L10:
            r3 = 0
            return r3
    }

    public static final int d(long r1) {
            int r0 = e(r1)
            int r1 = f(r1)
            int r0 = r0 - r1
            return r0
    }

    public static final int e(long r3) {
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            int r3 = java.lang.Math.max(r0, r3)
            return r3
    }

    public static final int f(long r3) {
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            int r3 = java.lang.Math.min(r0, r3)
            return r3
    }

    public static final boolean g(long r3) {
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            if (r0 <= r3) goto L10
            r3 = 1
            return r3
        L10:
            r3 = 0
            return r3
    }

    public static java.lang.String h(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextRange("
            r0.<init>(r1)
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            r4 = 41
            java.lang.String r3 = p.a.n(r0, r3, r4)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.f6360a
            boolean r3 = a(r3, r0)
            return r3
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f6360a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f6360a
            java.lang.String r0 = h(r0)
            return r0
    }
}
