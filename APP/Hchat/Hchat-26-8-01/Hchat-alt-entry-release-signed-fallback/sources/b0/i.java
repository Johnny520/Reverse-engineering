package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0.o f378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0.d f379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f380j;

    public /* synthetic */ i(y0.o r1, s0.d r2, int r3, int r4) {
            r0 = this;
            r0.f377g = r4
            r0.f378h = r1
            r0.f379i = r2
            r0.f380j = r3
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f377g
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            switch(r0) {
                case 0: goto L4e;
                case 1: goto L3e;
                case 2: goto L2e;
                case 3: goto L1e;
                default: goto Lc;
            }
        Lc:
            int r4 = r2.f380j
            r4 = r4 | 1
            int r4 = i0.r.C(r4)
            y0.o r0 = r2.f378h
            s0.d r1 = r2.f379i
            b0.o.a(r0, r1, r3, r4)
        L1b:
            sf.n r3 = sf.n.f12433a
            return r3
        L1e:
            int r4 = r2.f380j
            r4 = r4 | 1
            int r4 = i0.r.C(r4)
            y0.o r0 = r2.f378h
            s0.d r1 = r2.f379i
            b0.o.b(r0, r1, r3, r4)
            goto L1b
        L2e:
            int r4 = r2.f380j
            r4 = r4 | 1
            int r4 = i0.r.C(r4)
            y0.o r0 = r2.f378h
            s0.d r1 = r2.f379i
            b0.w.d(r0, r1, r3, r4)
            goto L1b
        L3e:
            int r4 = r2.f380j
            r4 = r4 | 1
            int r4 = i0.r.C(r4)
            y0.o r0 = r2.f378h
            s0.d r1 = r2.f379i
            b0.o.d(r0, r1, r3, r4)
            goto L1b
        L4e:
            int r4 = r2.f380j
            r4 = r4 | 1
            int r4 = i0.r.C(r4)
            y0.o r0 = r2.f378h
            s0.d r1 = r2.f379i
            b0.o.c(r0, r1, r3, r4)
            goto L1b
    }
}
