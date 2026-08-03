package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends r7.k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11564q;

    @Override // r7.k, r7.b
    public final void L() {
            r2 = this;
            super.L()
            byte[] r0 = r2.f11553k
            r1 = 0
            int r0 = k7.a.x(r0, r1)
            r2.f11564q = r0
            return
    }

    @Override // r7.k
    public final int N() {
            r1 = this;
            int r0 = r1.f11564q
            return r0
    }

    @Override // r7.k
    public final boolean O() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // r7.k
    public final int P() {
            r2 = this;
            byte[] r0 = r2.f11553k
            r1 = 2
            int r0 = k7.a.x(r0, r1)
            int r0 = r0 * 4
            return r0
    }

    @Override // r7.k
    public final void Q(int r3) {
            r2 = this;
            int r0 = r2.f11564q
            if (r3 == r0) goto Lf
            r7.k.R(r3)
            r2.f11564q = r3
            byte[] r0 = r2.f11553k
            r1 = 0
            k7.a.E(r0, r1, r3)
        Lf:
            return
    }

    @Override // r7.k
    public final void S(int r3) {
            r2 = this;
            int r3 = r3 / 4
            r7.k.R(r3)
            byte[] r0 = r2.f11553k
            r1 = 2
            k7.a.E(r0, r1, r3)
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            r7.k r2 = (r7.k) r2
            if (r2 != r1) goto L6
            r2 = 0
            return r2
        L6:
            int r0 = r1.f11568m
            int r2 = r2.f11568m
            int r2 = y7.a.b(r0, r2)
            return r2
    }
}
