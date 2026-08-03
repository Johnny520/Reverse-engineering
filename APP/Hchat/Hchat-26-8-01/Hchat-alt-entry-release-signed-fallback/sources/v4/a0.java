package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends v4.f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4.a f14064g;

    public a0(w4.a r1) {
            r0 = this;
            r0.<init>()
            r0.f14064g = r1
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            w4.a r0 = r1.f14064g
            java.lang.String r0 = r0.f14843g
            return r0
    }

    @Override // v4.a
    public final int e(v4.a r2) {
            r1 = this;
            v4.a0 r2 = (v4.a0) r2
            w4.a r0 = r1.f14064g
            w4.a r2 = r2.f14064g
            int r2 = r0.a(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof v4.a0
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            v4.a0 r2 = (v4.a0) r2
            w4.a r0 = r1.f14064g
            w4.a r2 = r2.f14064g
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.c r0 = w4.c.C
            return r0
    }

    public final int hashCode() {
            r1 = this;
            w4.a r0 = r1.f14064g
            java.lang.String r0 = r0.f14843g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "proto"
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "proto{"
            r0.<init>(r1)
            w4.a r1 = r3.f14064g
            java.lang.String r1 = r1.f14843g
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
