package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k7.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r7.f f14151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r7.d f14152l;

    public g() {
            r4 = this;
            r4.<init>()
            r7.f r0 = new r7.f
            r1 = 0
            r0.<init>(r1)
            r4.f14151k = r0
            r7.d r2 = new r7.d
            r3 = 256(0x100, float:3.59E-43)
            r2.<init>(r3)
            r4.f14152l = r2
            r0.H(r1)
            r0.J(r4)
            r0 = 1
            r2.H(r0)
            r2.J(r4)
            return
    }

    @Override // k7.a
    public final void B(q7.b r2) {
            r1 = this;
            r7.f r0 = r1.f14151k
            r0.G(r2)
            r7.d r0 = r1.f14152l
            r0.G(r2)
            return
    }

    @Override // k7.a
    public final int C(java.io.ByteArrayOutputStream r3) {
            r2 = this;
            r7.f r0 = r2.f14151k
            int r0 = r0.K(r3)
            r7.d r1 = r2.f14152l
            int r3 = r1.K(r3)
            int r3 = r3 + r0
            return r3
    }

    @Override // k7.a
    public final int p() {
            r2 = this;
            boolean r0 = r2.f7390i
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            r7.f r0 = r2.f14151k
            int r0 = r0.p()
            r7.d r1 = r2.f14152l
            int r1 = r1.p()
            int r1 = r1 + r0
            return r1
    }

    @Override // k7.a
    public final byte[] r() {
            r2 = this;
            boolean r0 = r2.f7390i
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            r7.f r0 = r2.f14151k
            byte[] r0 = r0.r()
            r7.d r1 = r2.f14152l
            byte[] r1 = r1.r()
            byte[] r0 = k7.a.o(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LIBRARY{"
            r0.<init>(r1)
            r7.f r1 = r3.f14151k
            int r1 = r1.f11560n
            byte r1 = (byte) r1
            java.lang.String r1 = y7.a.n(r1)
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            r7.d r1 = r3.f14152l
            java.lang.String r1 = r1.f11578m
            if (r1 != 0) goto L20
            java.lang.String r1 = "NULL"
        L20:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = eh.a.q(r0, r1, r2)
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
            r7.f r0 = r1.f14151k
            r0.z(r2)
            r7.d r0 = r1.f14152l
            r0.z(r2)
            return
    }
}
