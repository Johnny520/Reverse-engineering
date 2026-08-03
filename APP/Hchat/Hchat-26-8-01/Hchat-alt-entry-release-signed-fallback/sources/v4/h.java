package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends v4.d {
    @Override // v4.d, z4.k
    public final java.lang.String a() {
            r4 = this;
            java.lang.String r0 = "}"
            r1 = 1
            v4.c r2 = r4.f14069g
            java.lang.String r3 = "{"
            java.lang.String r0 = r2.n(r3, r0, r1)
            return r0
    }

    @Override // v4.d, v4.a
    public final int e(v4.a r2) {
            r1 = this;
            v4.h r2 = (v4.h) r2
            v4.c r2 = r2.f14069g
            v4.c r0 = r1.f14069g
            int r2 = r0.o(r2)
            return r2
    }

    @Override // v4.d
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof v4.h
            if (r0 == 0) goto Lf
            v4.h r2 = (v4.h) r2
            v4.c r2 = r2.f14069g
            v4.c r0 = r1.f14069g
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // v4.d
    public final int hashCode() {
            r1 = this;
            v4.c r0 = r1.f14069g
            java.lang.Object[] r0 = r0.f22543h
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // v4.d, v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "call site"
            return r0
    }

    @Override // v4.d
    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "}"
            r1 = 0
            v4.c r2 = r4.f14069g
            java.lang.String r3 = "call site{"
            java.lang.String r0 = r2.n(r3, r0, r1)
            return r0
    }
}
