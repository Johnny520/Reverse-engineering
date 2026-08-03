package sd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends pd.t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12414o;

    public a(int r3) {
            r2 = this;
            pd.k r0 = pd.k.Z
            r1 = 0
            r2.<init>(r0, r1)
            r2.f12414o = r3
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r2 = this;
            sd.a r0 = new sd.a
            int r1 = r2.f12414o
            r0.<init>(r1)
            r2.P(r0)
            return r0
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.k()
            int r1 = r4.f12414o
            java.lang.String r1 = xe.m.d(r1)
            java.lang.String r2 = r4.M()
            java.lang.String r3 = " -> "
            java.lang.String r0 = wb.en.i(r0, r3, r1, r2)
            return r0
    }
}
