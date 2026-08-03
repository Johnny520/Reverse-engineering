package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u2.p[] f13358b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13359c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13360a;

    static {
            u2.p r0 = new u2.p
            r1 = 0
            r0.<init>(r1)
            u2.p r3 = new u2.p
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            r3.<init>(r4)
            u2.p r4 = new u2.p
            r5 = 8589934592(0x200000000, double:4.243991582E-314)
            r4.<init>(r5)
            u2.p[] r0 = new u2.p[]{r0, r3, r4}
            u2.o.f13358b = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            long r0 = x6.d.R(r1, r0)
            u2.o.f13359c = r0
            return
    }

    public /* synthetic */ o(long r1) {
            r0 = this;
            r0.<init>()
            r0.f13360a = r1
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

    public static final long b(long r2) {
            r0 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r2 = r2 & r0
            r0 = 32
            long r2 = r2 >>> r0
            int r2 = (int) r2
            u2.p[] r3 = u2.o.f13358b
            r2 = r3[r2]
            long r2 = r2.f13361a
            return r2
    }

    public static final float c(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    public static java.lang.String d(long r4) {
            long r0 = b(r4)
            r2 = 0
            boolean r2 = u2.p.a(r0, r2)
            if (r2 == 0) goto Lf
            java.lang.String r4 = "Unspecified"
            return r4
        Lf:
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = u2.p.a(r0, r2)
            if (r2 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r4 = c(r4)
            r0.append(r4)
            java.lang.String r4 = ".sp"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L30:
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = u2.p.a(r0, r2)
            if (r0 == 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r4 = c(r4)
            r0.append(r4)
            java.lang.String r4 = ".em"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L51:
            java.lang.String r4 = "Invalid"
            return r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u2.o
            if (r0 != 0) goto L5
            goto Lf
        L5:
            u2.o r5 = (u2.o) r5
            long r0 = r5.f13360a
            long r2 = r4.f13360a
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L11
        Lf:
            r5 = 0
            return r5
        L11:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f13360a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f13360a
            java.lang.String r0 = d(r0)
            return r0
    }
}
