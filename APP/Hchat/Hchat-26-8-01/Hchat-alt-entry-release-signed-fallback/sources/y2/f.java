package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0.o f22218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.p f22219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22220i;

    public f(y0.o r1, fg.p r2, int r3) {
            r0 = this;
            r0.f22218g = r1
            r0.f22219h = r2
            r0.f22220i = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            i0.h0 r3 = (i0.h0) r3
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            int r4 = r2.f22220i
            r4 = r4 | 1
            int r4 = i0.r.C(r4)
            y0.o r0 = r2.f22218g
            fg.p r1 = r2.f22219h
            x6.d.f(r0, r1, r3, r4)
            sf.n r3 = sf.n.f12433a
            return r3
    }
}
