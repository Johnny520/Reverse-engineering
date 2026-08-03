package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.r0 f4701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h.s0 f4702i;

    public /* synthetic */ i0(h.r0 r1, h.s0 r2, int r3) {
            r0 = this;
            r0.f4700g = r3
            r0.f4701h = r1
            r0.f4702i = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f4700g
            switch(r0) {
                case 0: goto L73;
                case 1: goto L45;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            h.f0 r4 = (h.f0) r4
            int r4 = r4.ordinal()
            if (r4 == 0) goto L1d
            r0 = 1
            if (r4 == r0) goto L1d
            r0 = 2
            if (r4 != r0) goto L18
            h.s0 r4 = r3.f4702i
            h.h1 r4 = r4.f4753a
            goto L1d
        L18:
            okio.a.k()
            r4 = 0
            goto L23
        L1d:
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L23:
            return r4
        L24:
            i.e1 r4 = (i.e1) r4
            h.f0 r0 = h.f0.f4659g
            h.f0 r1 = h.f0.f4660h
            boolean r0 = r4.a(r0, r1)
            if (r0 == 0) goto L33
            i.r0 r4 = h.m0.f4718b
            goto L44
        L33:
            h.f0 r0 = h.f0.f4661i
            boolean r4 = r4.a(r1, r0)
            if (r4 == 0) goto L42
            h.s0 r4 = r3.f4702i
            h.h1 r4 = r4.f4753a
            i.r0 r4 = h.m0.f4718b
            goto L44
        L42:
            i.r0 r4 = h.m0.f4718b
        L44:
            return r4
        L45:
            h.f0 r4 = (h.f0) r4
            int r4 = r4.ordinal()
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L66
            r2 = 1
            if (r4 == r2) goto L5f
            r2 = 2
            if (r4 != r2) goto L61
            h.s0 r4 = r3.f4702i
            h.h1 r4 = r4.f4753a
            h.t0 r4 = r4.f4690a
            if (r4 == 0) goto L5f
            goto L6e
        L5f:
            r0 = r1
            goto L6e
        L61:
            okio.a.k()
            r4 = 0
            goto L72
        L66:
            h.r0 r4 = r3.f4701h
            h.h1 r4 = r4.f4746a
            h.t0 r4 = r4.f4690a
            if (r4 == 0) goto L5f
        L6e:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
        L72:
            return r4
        L73:
            i.e1 r4 = (i.e1) r4
            h.f0 r0 = h.f0.f4659g
            h.f0 r1 = h.f0.f4660h
            boolean r0 = r4.a(r0, r1)
            if (r0 == 0) goto L8e
            h.r0 r4 = r3.f4701h
            h.h1 r4 = r4.f4746a
            h.t0 r4 = r4.f4690a
            if (r4 == 0) goto L8b
            i.y r4 = r4.f4757a
            if (r4 != 0) goto La7
        L8b:
            i.r0 r4 = h.m0.f4718b
            goto La7
        L8e:
            h.f0 r0 = h.f0.f4661i
            boolean r4 = r4.a(r1, r0)
            if (r4 == 0) goto La5
            h.s0 r4 = r3.f4702i
            h.h1 r4 = r4.f4753a
            h.t0 r4 = r4.f4690a
            if (r4 == 0) goto La2
            i.y r4 = r4.f4757a
            if (r4 != 0) goto La7
        La2:
            i.r0 r4 = h.m0.f4718b
            goto La7
        La5:
            i.r0 r4 = h.m0.f4718b
        La7:
            return r4
    }
}
