package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ud.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qd.j f10476o;

    public c(qd.j r3) {
            r2 = this;
            pd.k r0 = pd.k.f10500i
            r1 = 0
            r2.<init>(r0, r1)
            r2.f10476o = r3
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r2 = this;
            pd.c r0 = new pd.c
            qd.j r1 = r2.f10476o
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
            boolean r0 = r2 instanceof pd.c
            if (r0 == 0) goto L1a
            boolean r0 = super.Y(r2)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            pd.c r2 = (pd.c) r2
            qd.j r0 = r1.f10476o
            qd.j r2 = r2.f10476o
            boolean r2 = r0.equals(r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = super.toString()
            qd.j r1 = r4.f10476o
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " "
            java.lang.String r3 = ".class"
            java.lang.String r0 = wb.en.i(r0, r2, r1, r3)
            return r0
    }
}
