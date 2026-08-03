package j7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends k7.b implements java.util.Comparator {
    @Override // o7.b
    public final void V() {
            r3 = this;
            java.lang.Class<v7.c0> r0 = v7.c0.class
            k7.a r0 = r3.u(r0)
            v7.c0 r0 = (v7.c0) r0
            v7.i0 r0 = r0.f14153k
            v7.f r0 = (v7.f) r0
            z7.c r1 = r3.f9563k
            int r1 = r1.size()
            byte[] r0 = r0.f11553k
            r2 = 12
            k7.a.D(r0, r2, r1)
            return
    }

    @Override // o7.b
    public final void X() {
            r0 = this;
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            v7.e0 r3 = (v7.e0) r3
            v7.e0 r4 = (v7.e0) r4
            r0 = 0
            if (r3 != r4) goto L8
            return r0
        L8:
            r1 = 1
            if (r3 != 0) goto Lc
            return r1
        Lc:
            if (r4 != 0) goto Lf
            goto L22
        Lf:
            if (r4 != r3) goto L12
            goto L1c
        L12:
            int r3 = r3.Z()
            int r4 = r4.Z()
            if (r3 != r4) goto L1d
        L1c:
            return r0
        L1d:
            if (r3 != 0) goto L20
            return r1
        L20:
            if (r4 != 0) goto L24
        L22:
            r3 = -1
            return r3
        L24:
            int r3 = java.lang.Integer.compare(r3, r4)
            return r3
    }

    @Override // k7.d
    public final k7.a n() {
            r3 = this;
            v7.e0 r0 = new v7.e0
            r1 = 12
            r2 = 4
            r0.<init>(r1, r2)
            return r0
    }
}
