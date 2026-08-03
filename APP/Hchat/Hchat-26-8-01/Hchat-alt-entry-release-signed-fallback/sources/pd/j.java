package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ud.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.Object f10495o;

    public j(pd.k r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.f10495o = r2
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r4 = this;
            pd.j r0 = new pd.j
            java.lang.Object r1 = r4.f10495o
            java.util.List r2 = r4.f13715m
            int r2 = r2.size()
            pd.k r3 = r4.f13713k
            r0.<init>(r3, r1, r2)
            r4.P(r0)
            return r0
    }

    @Override // ud.p
    public final boolean Y(ud.p r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof pd.j
            if (r0 == 0) goto L1a
            boolean r0 = super.Y(r2)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            pd.j r2 = (pd.j) r2
            java.lang.Object r0 = r1.f10495o
            java.lang.Object r2 = r2.f10495o
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r3 = this;
            pd.k r0 = r3.f13713k
            int r1 = r0.ordinal()
            r2 = 8
            if (r1 == r2) goto L1f
            r2 = 20
            if (r1 == r2) goto L1f
            java.lang.String r0 = super.toString()
            java.lang.Object r1 = r3.f10495o
            java.lang.String r1 = xe.m.i(r1)
            java.lang.String r2 = " "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.f13716n
            java.lang.String r2 = xe.m.d(r2)
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            qd.r r0 = r3.f13714l
            if (r0 == 0) goto L46
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
        L46:
            r0 = 40
            r1.append(r0)
            java.lang.Object r0 = r3.f10495o
            java.lang.String r0 = xe.m.i(r0)
            r1.append(r0)
            java.lang.String r0 = ") "
            r1.append(r0)
            java.util.List r0 = r3.f13715m
            java.lang.String r2 = ", "
            java.lang.String r0 = xe.s.j(r0, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
