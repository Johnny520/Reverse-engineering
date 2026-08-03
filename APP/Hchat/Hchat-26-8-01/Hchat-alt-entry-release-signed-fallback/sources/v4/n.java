package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends v4.s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v4.n f14102h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v4.n f14103i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v4.n f14104j = null;

    static {
            r0 = 0
            int r0 = java.lang.Float.floatToIntBits(r0)
            v4.n r1 = new v4.n
            r1.<init>(r0)
            v4.n.f14102h = r1
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            v4.n r1 = new v4.n
            r1.<init>(r0)
            v4.n.f14103i = r1
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            v4.n r1 = new v4.n
            r1.<init>(r0)
            v4.n.f14104j = r1
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            int r0 = r1.f14121g
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.Float.toString(r0)
            return r0
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.c r0 = w4.c.f14870s
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "float"
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "float{0x"
            r0.<init>(r1)
            int r1 = r3.f14121g
            java.lang.String r2 = a.a.Y0(r1)
            r0.append(r2)
            java.lang.String r2 = " / "
            r0.append(r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
