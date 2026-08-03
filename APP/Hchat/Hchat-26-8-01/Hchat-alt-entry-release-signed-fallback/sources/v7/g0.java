package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends k7.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v7.i0 f14153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k7.a f14154l;

    public g0(k7.a r2, v7.i0 r3) {
            r1 = this;
            r1.<init>()
            r1.f14153k = r3
            r1.f14154l = r2
            r3.J(r1)
            r0 = 0
            r3.H(r0)
            r2.J(r1)
            r3 = 1
            r2.H(r3)
            return
    }

    @Override // k7.a
    public final void B(q7.b r3) {
            r2 = this;
            v7.i0 r0 = r2.f14153k
            r0.G(r3)
            k7.a r1 = r2.f14154l
            r2.M(r1, r0)
            r1.G(r3)
            return
    }

    @Override // k7.a
    public final int C(java.io.ByteArrayOutputStream r3) {
            r2 = this;
            v7.i0 r0 = r2.f14153k
            int r0 = r0.K(r3)
            k7.a r1 = r2.f14154l
            int r3 = r1.K(r3)
            int r3 = r3 + r0
            return r3
    }

    public abstract void L(u7.b r1);

    public void M(k7.a r1, v7.i0 r2) {
            r0 = this;
            return
    }

    public abstract void N();

    @Override // k7.a
    public final int p() {
            r2 = this;
            v7.i0 r0 = r2.f14153k
            int r0 = r0.p()
            k7.a r1 = r2.f14154l
            int r1 = r1.p()
            int r1 = r1 + r0
            return r1
    }

    @Override // k7.a
    public final byte[] r() {
            r2 = this;
            v7.i0 r0 = r2.f14153k
            byte[] r0 = r0.r()
            k7.a r1 = r2.f14154l
            byte[] r1 = r1.r()
            byte[] r0 = k7.a.o(r0, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v7.i0 r1 = r2.f14153k
            r0.append(r1)
            java.lang.String r1 = ", value={"
            r0.append(r1)
            k7.a r1 = r2.f14154l
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // k7.a
    public final void z(f6.b r2) {
            r1 = this;
            boolean r0 = r2.f3306b
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = r2.f3308d
            k7.a r0 = (k7.a) r0
            if (r0 != r1) goto Lf
            r0 = 1
            r2.f3306b = r0
            return
        Lf:
            v7.i0 r0 = r1.f14153k
            r0.z(r2)
            k7.a r0 = r1.f14154l
            r0.z(r2)
            return
    }
}
