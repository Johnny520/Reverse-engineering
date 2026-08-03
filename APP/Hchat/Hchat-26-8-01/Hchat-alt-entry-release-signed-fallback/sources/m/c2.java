package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m.h2 f8108h;

    public /* synthetic */ c2(m.h2 r1, int r2) {
            r0 = this;
            r0.f8107g = r2
            r0.f8108h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f8107g
            switch(r0) {
                case 0: goto L53;
                default: goto L5;
            }
        L5:
            m.h2 r0 = r5.f8108h
            d1.b0 r0 = r0.V
            r1 = r0
            y0.n r1 = (y0.n) r1
            y0.n r1 = r1.f21819g
            boolean r1 = r1.f21832t
            r2 = 0
            if (r1 != 0) goto L14
            goto L52
        L14:
            d1.z r1 = r0.p1()
            int r3 = r1.ordinal()
            if (r3 == 0) goto L2d
            r4 = 1
            if (r3 == r4) goto L2d
            r4 = 2
            if (r3 == r4) goto L2d
            r0 = 3
            if (r3 != r0) goto L28
            goto L52
        L28:
            okio.a.k()
            r2 = 0
            goto L52
        L2d:
            boolean r1 = r1.a()
            if (r1 == 0) goto L38
            e1.c r2 = r0.n1(r2)
            goto L52
        L38:
            x1.r1 r1 = x1.k.x(r0)
            y1.t r1 = (y1.t) r1
            d1.l r1 = r1.getFocusOwner()
            d1.p r1 = (d1.p) r1
            d1.b0 r1 = r1.f()
            if (r1 == 0) goto L52
            x1.i1 r0 = x1.k.v(r0)
            e1.c r2 = r1.n1(r0)
        L52:
            return r2
        L53:
            m.h2 r0 = r5.f8108h
            boolean r0 = r0.f21832t
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
