package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements i0.l2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.j1 f12014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12015h;

    static {
            return
    }

    public g0(int r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4 / 30
            int r0 = r0 * 30
            int r1 = r0 + (-100)
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = r0 + 130
            lg.d r0 = r9.e0.r0(r1, r0)
            i0.e r1 = i0.e.f5870m
            i0.j1 r2 = new i0.j1
            r2.<init>(r0, r1)
            r3.f12014g = r2
            r3.f12015h = r4
            return
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r1 = this;
            i0.j1 r0 = r1.f12014g
            java.lang.Object r0 = r0.getValue()
            lg.d r0 = (lg.d) r0
            return r0
    }
}
