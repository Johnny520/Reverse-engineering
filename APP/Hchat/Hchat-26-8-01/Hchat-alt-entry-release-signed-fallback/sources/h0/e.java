package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f4874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4877k;

    public /* synthetic */ e(y0.o r2, fg.a r3, boolean r4, int r5) {
            r1 = this;
            r0 = 0
            r1.f4873g = r0
            r1.<init>()
            r1.f4876j = r2
            r1.f4877k = r3
            r1.f4874h = r4
            r1.f4875i = r5
            return
    }

    public /* synthetic */ e(boolean r2, t2.j r3, h0.d1 r4, int r5) {
            r1 = this;
            r0 = 1
            r1.f4873g = r0
            r1.<init>()
            r1.f4874h = r2
            r1.f4876j = r3
            r1.f4877k = r4
            r1.f4875i = r5
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f4873g
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f4876j
            t2.j r0 = (t2.j) r0
            java.lang.Object r1 = r3.f4877k
            h0.d1 r1 = (h0.d1) r1
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r3.f4875i
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            boolean r2 = r3.f4874h
            f8.i.a(r2, r0, r1, r4, r5)
        L21:
            sf.n r4 = sf.n.f12433a
            return r4
        L24:
            java.lang.Object r0 = r3.f4876j
            y0.o r0 = (y0.o) r0
            java.lang.Object r1 = r3.f4877k
            fg.a r1 = (fg.a) r1
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r5 = r3.f4875i
            r5 = r5 | 1
            int r5 = i0.r.C(r5)
            boolean r2 = r3.f4874h
            oh.h.c(r0, r1, r2, r4, r5)
            goto L21
    }
}
