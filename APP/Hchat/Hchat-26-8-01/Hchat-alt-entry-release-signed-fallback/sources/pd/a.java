package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ud.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f10474p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10475o;

    public a(int r3, qd.r r4, qd.l r5, qd.l r6) {
            r2 = this;
            pd.k r0 = pd.k.f10501j
            r1 = 2
            r2.<init>(r0, r1)
            r2.f10475o = r3
            r2.d0(r4)
            r2.I(r5)
            r2.I(r6)
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r5 = this;
            pd.a r0 = new pd.a
            r1 = 0
            qd.l r1 = r5.S(r1)
            qd.l r1 = r1.H()
            r2 = 1
            qd.l r2 = r5.S(r2)
            qd.l r2 = r2.H()
            int r3 = r5.f10475o
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            r5.P(r0)
            return r0
    }

    @Override // ud.p
    public final boolean Y(ud.p r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            goto L3b
        L4:
            boolean r1 = r6 instanceof pd.a
            if (r1 == 0) goto L3c
            boolean r1 = super.Y(r6)
            if (r1 != 0) goto Lf
            goto L3c
        Lf:
            pd.a r6 = (pd.a) r6
            int r1 = r5.f10475o
            int r2 = r6.f10475o
            if (r1 != r2) goto L3c
            qd.l r1 = r5.S(r0)
            qd.l r6 = r6.S(r0)
            r1.getClass()
            boolean r2 = r1 instanceof qd.n
            r6.getClass()
            boolean r3 = r6 instanceof qd.n
            if (r2 == r3) goto L2c
            goto L3c
        L2c:
            if (r2 != 0) goto L2f
            goto L3b
        L2f:
            qd.n r1 = (qd.n) r1
            long r1 = r1.f10905l
            qd.n r6 = (qd.n) r6
            long r3 = r6.f10905l
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L3c
        L3b:
            return r0
        L3c:
            r6 = 0
            return r6
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.f13716n
            java.lang.String r1 = xe.m.d(r1)
            r0.append(r1)
            java.lang.String r1 = ": ARITH "
            r0.append(r1)
            md.a r1 = md.a.T
            md.f r2 = r6.f8877g
            boolean r1 = r2.a(r1)
            r2 = 1
            int r3 = r6.f10475o
            r4 = 0
            r5 = 32
            if (r1 == 0) goto L41
            qd.l r1 = r6.S(r4)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = p.a.e(r3)
            r0.append(r1)
            java.lang.String r1 = "= "
            r0.append(r1)
            qd.l r1 = r6.S(r2)
            r0.append(r1)
            goto L68
        L41:
            qd.r r1 = r6.f13714l
            if (r1 == 0) goto L4d
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
        L4d:
            qd.l r1 = r6.S(r4)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = p.a.e(r3)
            r0.append(r1)
            r0.append(r5)
            qd.l r1 = r6.S(r2)
            r0.append(r1)
        L68:
            r6.K(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
