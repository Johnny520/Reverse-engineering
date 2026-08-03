package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class d extends v4.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.c f14069g;

    public d(v4.c r1) {
            r0 = this;
            r0.<init>()
            r1.k()
            r0.f14069g = r1
            return
    }

    @Override // z4.k
    public java.lang.String a() {
            r4 = this;
            java.lang.String r0 = "}"
            r1 = 1
            v4.c r2 = r4.f14069g
            java.lang.String r3 = "{"
            java.lang.String r0 = r2.n(r3, r0, r1)
            return r0
    }

    @Override // v4.a
    public int e(v4.a r2) {
            r1 = this;
            v4.d r2 = (v4.d) r2
            v4.c r2 = r2.f14069g
            v4.c r0 = r1.f14069g
            int r2 = r0.o(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof v4.d
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            v4.d r2 = (v4.d) r2
            v4.c r2 = r2.f14069g
            v4.c r0 = r1.f14069g
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            v4.c r0 = r1.f14069g
            java.lang.Object[] r0 = r0.f22543h
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // v4.a
    public boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // v4.a
    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "array"
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "}"
            r1 = 0
            v4.c r2 = r4.f14069g
            java.lang.String r3 = "array{"
            java.lang.String r0 = r2.n(r3, r0, r1)
            return r0
    }
}
