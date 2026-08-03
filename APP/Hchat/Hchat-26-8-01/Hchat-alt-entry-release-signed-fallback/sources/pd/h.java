package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class h extends pd.t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10489o;

    public h(int r3) {
            r2 = this;
            pd.k r0 = pd.k.f10508q
            r1 = 0
            r2.<init>(r0, r3, r1)
            return
    }

    public h(pd.k r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.f10489o = r2
            return
    }

    @Override // ud.p
    public ud.p O() {
            r2 = this;
            pd.h r0 = new pd.h
            int r1 = r2.f10489o
            r0.<init>(r1)
            r2.P(r0)
            return r0
    }

    public int k0() {
            r1 = this;
            int r0 = r1.f10489o
            return r0
    }

    @Override // ud.p
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            int r1 = r3.f10489o
            java.lang.String r1 = xe.m.d(r1)
            java.lang.String r2 = "-> "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }
}
