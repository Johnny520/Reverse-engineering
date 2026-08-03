package o7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k7.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k7.a f9577k;

    @Override // k7.c, k7.a
    public final void B(q7.b r2) {
            r1 = this;
            k7.a r0 = r1.f9577k
            if (r0 == 0) goto L7
            r0.G(r2)
        L7:
            return
    }

    @Override // k7.c, k7.a
    public final int C(java.io.ByteArrayOutputStream r2) {
            r1 = this;
            k7.a r0 = r1.f9577k
            if (r0 == 0) goto L9
            int r2 = r0.K(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // k7.c
    public final k7.a[] L() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // k7.c
    public final void N() {
            r0 = this;
            return
    }

    @Override // k7.c
    public final void O() {
            r2 = this;
            k7.a r0 = r2.f9577k
            boolean r1 = r0 instanceof k7.e
            if (r1 == 0) goto Lb
            k7.e r0 = (k7.e) r0
            r0.c()
        Lb:
            return
    }

    public final void P(k7.a r3) {
            r2 = this;
            if (r3 != 0) goto L11
            k7.a r3 = r2.f9577k
            r0 = 0
            if (r3 == 0) goto Le
            r1 = -1
            r3.H(r1)
            r3.J(r0)
        Le:
            r2.f9577k = r0
            return
        L11:
            r2.f9577k = r3
            int r0 = r2.f7388g
            r3.H(r0)
            r3.J(r2)
            return
    }

    @Override // k7.c, k7.a
    public final int p() {
            r1 = this;
            k7.a r0 = r1.f9577k
            if (r0 == 0) goto L9
            int r0 = r0.p()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // k7.c, k7.a
    public final byte[] r() {
            r1 = this;
            k7.a r0 = r1.f9577k
            if (r0 == 0) goto L9
            byte[] r0 = r0.r()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            k7.a r0 = r2.f9577k
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            return r0
        L9:
            java.lang.Class<o7.g> r0 = o7.g.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = ": EMPTY"
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    @Override // k7.c, k7.a
    public final void z(f6.b r2) {
            r1 = this;
            boolean r0 = r2.f3306b
            if (r0 == 0) goto L5
            goto L16
        L5:
            java.lang.Object r0 = r2.f3308d
            k7.a r0 = (k7.a) r0
            if (r0 != r1) goto Lf
            r0 = 1
            r2.f3306b = r0
            return
        Lf:
            k7.a r0 = r1.f9577k
            if (r0 == 0) goto L16
            r0.z(r2)
        L16:
            return
    }
}
