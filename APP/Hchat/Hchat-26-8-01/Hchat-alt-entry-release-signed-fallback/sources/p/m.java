package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0.o f9946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9947i;

    public /* synthetic */ m(y0.o r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f9945g = r0
            r1.<init>()
            r1.f9946h = r2
            r1.f9947i = r3
            return
    }

    public /* synthetic */ m(y0.o r1, int r2, int r3) {
            r0 = this;
            r2 = 1
            r0.f9945g = r2
            r0.<init>()
            r0.f9946h = r1
            r0.f9947i = r3
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f9945g
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            switch(r0) {
                case 0: goto L1b;
                default: goto Lc;
            }
        Lc:
            r4 = 1
            int r4 = i0.r.C(r4)
            y0.o r0 = r2.f9946h
            int r1 = r2.f9947i
            w.b.b(r0, r3, r4, r1)
        L18:
            sf.n r3 = sf.n.f12433a
            return r3
        L1b:
            int r4 = r2.f9947i
            r4 = r4 | 1
            int r4 = i0.r.C(r4)
            y0.o r0 = r2.f9946h
            p.o.a(r0, r3, r4)
            goto L18
    }
}
