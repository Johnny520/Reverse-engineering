package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d7.l implements java.util.Comparator {
    @Override // d7.l, o7.e, k7.c
    public final void N() {
            r8 = this;
            o7.g r0 = r8.f2051o
            k7.a r0 = r0.f9577k
            d7.n r0 = (d7.n) r0
            r0.getClass()
            r1 = 24
            r2 = 0
            r0.M(r1, r2)
            r3 = 16
            byte[] r4 = d7.n.f2054m
            r5 = 8
            r0.P(r4, r2, r5, r3)
            super.N()
            r7.b r3 = r8.f2049m
            boolean r4 = r3 instanceof r7.h
            if (r4 == 0) goto L26
            r7.h r3 = (r7.h) r3
            long r3 = r3.f11562n
            goto L2b
        L26:
            r7.f r3 = (r7.f) r3
            int r3 = r3.f11560n
            long r3 = (long) r3
        L2b:
            int r6 = r0.p()
            if (r6 >= r1) goto L34
            r0.M(r1, r2)
        L34:
            byte[] r0 = r0.f11553k
            int r1 = r0.length
            if (r5 <= r1) goto L3a
            goto L47
        L3a:
            if (r2 >= r5) goto L47
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r3
            int r1 = (int) r6
            byte r1 = (byte) r1
            r0[r2] = r1
            long r3 = r3 >>> r5
            int r2 = r2 + 1
            goto L3a
        L47:
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            d7.p r1 = (d7.p) r1
            d7.p r2 = (d7.p) r2
            d7.o r1 = r1.S()
            d7.o r2 = r2.S()
            int r1 = r1.f2064i
            int r2 = r2.f2064i
            int r1 = java.lang.Integer.compare(r1, r2)
            return r1
    }

    @Override // k7.d
    public final k7.a n() {
            r1 = this;
            d7.p r0 = new d7.p
            r0.<init>()
            return r0
    }
}
