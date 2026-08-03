package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends pd.n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mc.a f10527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final od.d f10528r;

    public o(od.d r2, int r3, mc.a r4, od.d r5) {
            r1 = this;
            r0 = 6
            r1.<init>(r2, r0, r3)
            r1.f10527q = r4
            r1.f10528r = r5
            return
    }

    public o(od.d r7, gf.a r8, jf.g r9, od.d r10, boolean r11) {
            r6 = this;
            r3 = 6
            r4 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f10527q = r9
            r0.f10528r = r10
            return
    }

    @Override // pd.n, ud.p
    public final ud.p O() {
            r5 = this;
            pd.o r0 = new pd.o
            java.util.List r1 = r5.f13715m
            int r1 = r1.size()
            mc.a r2 = r5.f10527q
            od.d r3 = r5.f10528r
            od.d r4 = r5.f10526p
            r0.<init>(r4, r1, r2, r3)
            r5.P(r0)
            return r0
    }

    @Override // pd.n, ud.p
    public final boolean Y(ud.p r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof pd.o
            if (r0 == 0) goto L1a
            boolean r0 = super.Y(r2)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            pd.o r2 = (pd.o) r2
            mc.a r0 = r1.f10527q
            mc.a r2 = r2.f10527q
            boolean r2 = r0.equals(r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // pd.n, ud.p
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.f13716n
            java.lang.String r1 = xe.m.d(r1)
            r0.append(r1)
            java.lang.String r1 = ": INVOKE_POLYMORPHIC "
            r0.append(r1)
            qd.r r1 = r3.f13714l
            if (r1 == 0) goto L1f
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
        L1f:
            boolean r1 = r3.J(r0)
            r2 = 10
            if (r1 != 0) goto L2a
            r0.append(r2)
        L2a:
            r3.K(r0)
            java.lang.String r1 = " base: "
            r0.append(r1)
            od.d r1 = r3.f10528r
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " proto: "
            r0.append(r1)
            mc.a r1 = r3.f10527q
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
