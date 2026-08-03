package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v4.h f11406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f11407l;

    public h(v4.h r3) {
            r2 = this;
            r0 = 1
            r1 = -1
            r2.<init>(r0, r1)
            r2.f11406k = r3
            return
    }

    @Override // r4.a0
    public final void a(r4.p r2) {
            r1 = this;
            v4.h r0 = r1.f11406k
            p4.t.j(r2, r0)
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.B
            return r0
    }

    @Override // r4.l0
    public final void j(r4.k0 r3, int r4) {
            r2 = this;
            z4.d r4 = new z4.d
            r4.<init>()
            p4.t r0 = new p4.t
            r4.p r3 = r3.f11472b
            r0.<init>(r3, r4)
            v4.h r3 = r2.f11406k
            r1 = 1
            r0.J(r3, r1)
            byte[] r3 = r4.h()
            r2.f11407l = r3
            int r3 = r3.length
            r2.k(r3)
            return
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r1 = this;
            v4.h r0 = r1.f11406k
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // r4.l0
    public final void m(r4.p r3, z4.d r4) {
            r2 = this;
            boolean r0 = r4.d()
            if (r0 == 0) goto L20
            java.lang.String r0 = r2.g()
            java.lang.String r1 = " call site"
            java.lang.String r0 = r0.concat(r1)
            r1 = 0
            r4.b(r1, r0)
            p4.t r0 = new p4.t
            r0.<init>(r3, r4)
            v4.h r3 = r2.f11406k
            r4 = 1
            r0.J(r3, r4)
            return
        L20:
            byte[] r3 = r2.f11407l
            r4.i(r3)
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            v4.h r0 = r1.f11406k
            java.lang.String r0 = r0.toString()
            return r0
    }
}
