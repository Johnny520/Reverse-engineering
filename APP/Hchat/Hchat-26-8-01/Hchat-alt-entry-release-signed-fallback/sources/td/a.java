package td;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends pd.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final od.d f13119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f13120p;

    public a(od.d r3, int r4) {
            r2 = this;
            java.util.List r0 = r3.f9779i
            int r0 = r0.size()
            pd.k r1 = pd.k.S
            r2.<init>(r1, r0)
            r2.f13119o = r3
            r2.f13120p = r4
            return
    }

    public a(ud.r r4, pd.n r5, od.d r6) {
            r3 = this;
            java.util.List r0 = r5.f13715m
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            pd.k r2 = pd.k.S
            r3.<init>(r2, r0)
            r3.f13119o = r6
            od.a r0 = r6.f9780j
            r2 = 0
            qd.l r2 = r5.S(r2)
            boolean r2 = r2.N()
            if (r2 != 0) goto L1e
            r4 = r1
            goto L39
        L1e:
            ud.e r2 = r4.f13718l
            od.a r2 = r2.f13690m
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2a
            r4 = 2
            goto L39
        L2a:
            java.lang.String r6 = r6.f9781k
            od.d r4 = r4.f13717k
            java.lang.String r4 = r4.f9781k
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L38
            r4 = 4
            goto L39
        L38:
            r4 = 3
        L39:
            r3.f13120p = r4
            java.util.List r4 = r5.f13715m
            int r4 = r4.size()
        L41:
            if (r1 >= r4) goto L4d
            qd.l r6 = r5.S(r1)
            r3.I(r6)
            int r1 = r1 + 1
            goto L41
        L4d:
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r3 = this;
            td.a r0 = new td.a
            od.d r1 = r3.f13119o
            int r2 = r3.f13120p
            r0.<init>(r1, r2)
            r3.P(r0)
            return r0
    }

    @Override // ud.p
    public final boolean Y(ud.p r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L20
        L3:
            boolean r0 = r3 instanceof td.a
            if (r0 == 0) goto L22
            boolean r0 = super.Y(r3)
            if (r0 != 0) goto Le
            goto L22
        Le:
            td.a r3 = (td.a) r3
            od.d r0 = r2.f13119o
            od.d r1 = r3.f13119o
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
            int r0 = r2.f13120p
            int r3 = r3.f13120p
            if (r0 != r3) goto L22
        L20:
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    @Override // pd.b
    public final od.d i0() {
            r1 = this;
            od.d r0 = r1.f13119o
            return r0
    }

    @Override // pd.b
    public final int j0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // pd.b
    public final /* bridge */ /* synthetic */ qd.l k0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean l0() {
            r2 = this;
            int r0 = r2.f13120p
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = super.toString()
            od.d r1 = r5.f13119o
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 1
            int r3 = r5.f13120p
            if (r3 == r2) goto L24
            r2 = 2
            if (r3 == r2) goto L21
            r2 = 3
            if (r3 == r2) goto L1e
            r2 = 4
            if (r3 == r2) goto L1b
            java.lang.String r2 = "null"
            goto L26
        L1b:
            java.lang.String r2 = "SELF"
            goto L26
        L1e:
            java.lang.String r2 = "THIS"
            goto L26
        L21:
            java.lang.String r2 = "SUPER"
            goto L26
        L24:
            java.lang.String r2 = "CONSTRUCTOR"
        L26:
            java.lang.String r3 = " call: "
            java.lang.String r4 = " type: "
            java.lang.String r0 = bc.e.v(r0, r3, r1, r4, r2)
            return r0
    }
}
