package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z4.e implements w4.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u4.p f13403i = null;

    static {
            u4.p r0 = new u4.p
            r1 = 0
            r0.<init>(r1)
            u4.p.f13403i = r0
            return
    }

    public static u4.p p(u4.o r2) {
            u4.p r0 = new u4.p
            r1 = 1
            r0.<init>(r1)
            r1 = 0
            r0.m(r1, r2)
            return r0
    }

    public static u4.p q(u4.o r2, u4.o r3) {
            u4.p r0 = new u4.p
            r1 = 2
            r0.<init>(r1)
            r1 = 0
            r0.m(r1, r2)
            r2 = 1
            r0.m(r2, r3)
            return r0
    }

    @Override // w4.e
    public final w4.e d(w4.c r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }

    @Override // z4.e, w4.e
    public final w4.c getType(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.l(r1)
            u4.o r1 = (u4.o) r1
            w4.d r1 = r1.f13401h
            w4.c r1 = r1.getType()
            r1.getClass()
            return r1
    }

    public final int o() {
            r4 = this;
            java.lang.Object[] r0 = r4.f22543h
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r1 >= r0) goto L13
            w4.c r3 = r4.getType(r1)
            int r3 = r3.i()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L5
        L13:
            return r2
    }

    public final u4.p r(boolean r8, java.util.BitSet r9) {
            r7 = this;
            java.lang.Object[] r0 = r7.f22543h
            int r1 = r0.length
            if (r1 != 0) goto L6
            return r7
        L6:
            u4.p r2 = new u4.p
            int r0 = r0.length
            r2.<init>(r0)
            r0 = 0
            r3 = r0
            r4 = r3
        Lf:
            if (r3 >= r1) goto L32
            java.lang.Object r5 = r7.l(r3)
            u4.o r5 = (u4.o) r5
            if (r9 != 0) goto L1a
            goto L20
        L1a:
            boolean r6 = r9.get(r3)
            if (r6 != 0) goto L2b
        L20:
            u4.o r5 = r5.o(r4)
            if (r8 != 0) goto L2b
            int r8 = r5.j()
            int r4 = r4 + r8
        L2b:
            r2.m(r3, r5)
            int r3 = r3 + 1
            r8 = r0
            goto Lf
        L32:
            boolean r8 = r7.f22555g
            if (r8 != 0) goto L38
            r2.f22555g = r0
        L38:
            return r2
    }

    public final u4.p s(int r7) {
            r6 = this;
            java.lang.Object[] r0 = r6.f22543h
            int r0 = r0.length
            if (r0 != 0) goto L6
            return r6
        L6:
            u4.p r1 = new u4.p
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r0) goto L25
            java.lang.Object r4 = r6.l(r3)
            u4.o r4 = (u4.o) r4
            if (r7 != 0) goto L18
            goto L1f
        L18:
            int r5 = r4.f13400g
            int r5 = r5 + r7
            u4.o r4 = r4.o(r5)
        L1f:
            r1.m(r3, r4)
            int r3 = r3 + 1
            goto Ld
        L25:
            boolean r7 = r6.f22555g
            if (r7 != 0) goto L2b
            r1.f22555g = r2
        L2b:
            return r1
    }
}
