package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends k7.a implements k7.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k7.c f8760k;

    public q(k7.c r2) {
            r1 = this;
            r1.<init>()
            r1.f8760k = r2
            r2.J(r1)
            r0 = 0
            r2.H(r0)
            return
    }

    @Override // k7.a
    public final void B(q7.b r2) {
            r1 = this;
            k7.c r0 = r1.f8760k
            r0.G(r2)
            return
    }

    @Override // k7.a
    public final int C(java.io.ByteArrayOutputStream r2) {
            r1 = this;
            k7.c r0 = r1.f8760k
            int r2 = r0.K(r2)
            return r2
    }

    @Override // k7.a
    public final void I(boolean r2) {
            r1 = this;
            k7.c r0 = r1.f8760k
            r0.I(r2)
            return
    }

    public m7.q L() {
            r1 = this;
            java.lang.Class<m7.q> r0 = m7.q.class
            k7.a r0 = r1.v(r0)
            m7.q r0 = (m7.q) r0
            return r0
    }

    public abstract void M();

    public abstract void N();

    @Override // k7.e
    public final void c() {
            r1 = this;
            k7.c r0 = r1.f8760k
            r0.c()
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof m7.q
            k7.c r1 = r2.f8760k
            if (r0 == 0) goto L13
            m7.q r3 = (m7.q) r3
            k7.c r3 = r3.f8760k
            boolean r3 = r1.equals(r3)
            return r3
        L13:
            boolean r3 = r1.equals(r3)
            return r3
    }

    public final int hashCode() {
            r1 = this;
            k7.c r0 = r1.f8760k
            int r0 = r0.hashCode()
            return r0
    }

    @Override // k7.a
    public final int p() {
            r1 = this;
            k7.c r0 = r1.f8760k
            int r0 = r0.p()
            return r0
    }

    @Override // k7.a
    public final byte[] r() {
            r1 = this;
            k7.c r0 = r1.f8760k
            byte[] r0 = r0.r()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            k7.c r0 = r1.f8760k
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // k7.a
    public boolean y() {
            r1 = this;
            k7.c r0 = r1.f8760k
            boolean r0 = r0.y()
            return r0
    }

    @Override // k7.a
    public final void z(f6.b r2) {
            r1 = this;
            k7.c r0 = r1.f8760k
            r0.z(r2)
            return
    }
}
