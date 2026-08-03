package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ud.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f10477o;

    public d(java.lang.String r3) {
            r2 = this;
            pd.k r0 = pd.k.f10499h
            r1 = 0
            r2.<init>(r0, r1)
            r2.f10477o = r3
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r2 = this;
            pd.d r0 = new pd.d
            java.lang.String r1 = r2.f10477o
            r0.<init>(r1)
            r2.P(r0)
            return r0
    }

    @Override // ud.p
    public final boolean Y(ud.p r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof pd.d
            if (r0 == 0) goto L1a
            boolean r0 = super.Y(r2)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            pd.d r2 = (pd.d) r2
            java.lang.String r0 = r1.f10477o
            java.lang.String r2 = r2.f10477o
            boolean r2 = r0.equals(r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            xe.q r1 = xe.q.f21574b
            java.lang.String r2 = r3.f10477o
            java.lang.String r1 = r1.i(r2)
            java.lang.String r2 = " "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }
}
