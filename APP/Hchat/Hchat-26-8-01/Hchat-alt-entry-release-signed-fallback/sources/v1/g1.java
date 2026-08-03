package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0.o f13937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sf.b f13940k;

    public /* synthetic */ g1(java.lang.Object r1, y0.o r2, sf.b r3, int r4, int r5) {
            r0 = this;
            r0.f13936g = r5
            r0.f13939j = r1
            r0.f13937h = r2
            r0.f13940k = r3
            r0.f13938i = r4
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f13936g
            i0.h0 r4 = (i0.h0) r4
            java.lang.Number r5 = (java.lang.Number) r5
            r5.intValue()
            switch(r0) {
                case 0: goto L24;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r5 = r3.f13939j
            fg.l r5 = (fg.l) r5
            sf.b r0 = r3.f13940k
            fg.l r0 = (fg.l) r0
            int r1 = r3.f13938i
            r1 = r1 | 1
            int r1 = i0.r.C(r1)
            y0.o r2 = r3.f13937h
            x2.i.a(r5, r2, r0, r4, r1)
            sf.n r4 = sf.n.f12433a
            return r4
        L24:
            java.lang.Object r5 = r3.f13939j
            v1.j1 r5 = (v1.j1) r5
            sf.b r0 = r3.f13940k
            fg.p r0 = (fg.p) r0
            int r1 = r3.f13938i
            r1 = r1 | 1
            int r1 = i0.r.C(r1)
            y0.o r2 = r3.f13937h
            v1.w.a(r5, r2, r0, r4, r1)
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
