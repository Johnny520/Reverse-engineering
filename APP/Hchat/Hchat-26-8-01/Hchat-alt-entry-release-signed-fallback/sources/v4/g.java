package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends v4.s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v4.g f14095h = null;

    static {
            v4.g r0 = new v4.g
            r1 = 0
            r0.<init>(r1)
            v4.g.f14095h = r0
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            int r0 = r1.f14121g
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.c r0 = w4.c.f14867p
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "byte"
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byte{0x"
            r0.<init>(r1)
            int r1 = r3.f14121g
            java.lang.String r2 = a.a.W0(r1)
            r0.append(r2)
            java.lang.String r2 = " / "
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
