package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ud.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qd.j f10529o;

    public p(int r2, qd.j r3) {
            r1 = this;
            pd.k r0 = pd.k.I
            r1.<init>(r0, r2)
            r1.f10529o = r3
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r3 = this;
            pd.p r0 = new pd.p
            java.util.List r1 = r3.f13715m
            int r1 = r1.size()
            qd.j r2 = r3.f10529o
            r0.<init>(r1, r2)
            r3.P(r0)
            return r0
    }

    @Override // ud.p
    public final boolean Y(ud.p r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof pd.p
            r2 = 0
            if (r1 == 0) goto L19
            boolean r1 = super.Y(r4)
            if (r1 != 0) goto L10
            goto L19
        L10:
            pd.p r4 = (pd.p) r4
            qd.j r1 = r3.f10529o
            qd.j r4 = r4.f10529o
            if (r1 != r4) goto L19
            return r0
        L19:
            return r2
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            qd.j r1 = r3.f10529o
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " type: "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }
}
