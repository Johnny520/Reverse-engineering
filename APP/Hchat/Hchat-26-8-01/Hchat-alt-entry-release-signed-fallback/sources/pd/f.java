package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ud.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public pd.e f10487p;

    public f(int r3, qd.l r4) {
            r2 = this;
            pd.k r0 = pd.k.D
            r1 = 1
            r2.<init>(r0, r1)
            r2.f10486o = r3
            r2.I(r4)
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r3 = this;
            pd.f r0 = new pd.f
            r1 = 0
            qd.l r1 = r3.S(r1)
            int r2 = r3.f10486o
            r0.<init>(r2, r1)
            r3.P(r0)
            return r0
    }

    @Override // ud.p
    public final boolean Y(ud.p r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof pd.f
            if (r0 == 0) goto L1a
            boolean r0 = super.Y(r2)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            pd.f r2 = (pd.f) r2
            pd.e r0 = r1.f10487p
            pd.e r2 = r2.f10487p
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final java.util.List i0(qd.j r8) {
            r7 = this;
            pd.e r0 = r7.f10487p
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f10483p
            r1.<init>(r2)
            java.lang.Object r2 = r0.f10482o
            int r0 = r0.f10484q
            r3 = 1
            r4 = 0
            if (r0 == r3) goto L6c
            r3 = 2
            if (r0 == r3) goto L5a
            r3 = 4
            if (r0 == r3) goto L48
            r3 = 8
            if (r0 != r3) goto L2f
            long[] r2 = (long[]) r2
            int r0 = r2.length
        L21:
            if (r4 >= r0) goto L7e
            r5 = r2[r4]
            qd.n r3 = qd.l.S(r5, r8)
            r1.add(r3)
            int r4 = r4 + 1
            goto L21
        L2f:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "Unknown type: "
            java.lang.String r2 = ", expected: "
            java.lang.String r8 = bc.e.j(r1, r0, r2, r8)
            ah.a.k(r8)
            r8 = 0
            return r8
        L48:
            int[] r2 = (int[]) r2
            int r0 = r2.length
        L4b:
            if (r4 >= r0) goto L7e
            r3 = r2[r4]
            long r5 = (long) r3
            qd.n r3 = qd.l.S(r5, r8)
            r1.add(r3)
            int r4 = r4 + 1
            goto L4b
        L5a:
            short[] r2 = (short[]) r2
            int r0 = r2.length
        L5d:
            if (r4 >= r0) goto L7e
            short r3 = r2[r4]
            long r5 = (long) r3
            qd.n r3 = qd.l.S(r5, r8)
            r1.add(r3)
            int r4 = r4 + 1
            goto L5d
        L6c:
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
        L6f:
            if (r4 >= r0) goto L7e
            r3 = r2[r4]
            long r5 = (long) r3
            qd.n r3 = qd.l.S(r5, r8)
            r1.add(r3)
            int r4 = r4 + 1
            goto L6f
        L7e:
            return r1
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            pd.e r1 = r3.f10487p
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ", data: "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }
}
