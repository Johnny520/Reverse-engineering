package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends v4.t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v4.k f14099h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v4.k f14100i = null;

    static {
            v4.k r0 = new v4.k
            r1 = 0
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r0.<init>(r1)
            v4.k.f14099h = r0
            v4.k r0 = new v4.k
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r0.<init>(r1)
            v4.k.f14100i = r0
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r2 = this;
            long r0 = r2.f14122g
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.String r0 = java.lang.Double.toString(r0)
            return r0
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.c r0 = w4.c.f14869r
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "double"
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "double{0x"
            r0.<init>(r1)
            long r1 = r4.f14122g
            java.lang.String r3 = a.a.Z0(r1)
            r0.append(r3)
            java.lang.String r3 = " / "
            r0.append(r3)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
