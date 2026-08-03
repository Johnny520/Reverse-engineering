package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends m0.j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0.r f8483d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0.r f8484e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0.r f8485f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m0.r f8486g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8487c;

    static {
            m0.r r0 = new m0.r
            r1 = 2
            r2 = 0
            r3 = 1
            r0.<init>(r3, r1, r2)
            m0.r.f8483d = r0
            m0.r r0 = new m0.r
            r1 = 1
            r2 = 1
            r0.<init>(r1, r1, r2)
            m0.r.f8484e = r0
            m0.r r0 = new m0.r
            r1 = 2
            r2 = 2
            r0.<init>(r3, r1, r2)
            m0.r.f8485f = r0
            m0.r r0 = new m0.r
            r1 = 1
            r2 = 3
            r0.<init>(r1, r1, r2)
            m0.r.f8486g = r0
            return
    }

    public /* synthetic */ r(int r1, int r2, int r3) {
            r0 = this;
            r0.f8487c = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // m0.j0
    public final void a(h0.s r3, i0.a r4, l0.k r5, b5.i r6, m0.k0 r7) {
            r2 = this;
            int r7 = r2.f8487c
            switch(r7) {
                case 0: goto L9b;
                case 1: goto L7e;
                case 2: goto L3d;
                default: goto L5;
            }
        L5:
            r4 = 0
            java.lang.Object r7 = r3.d(r4)
            int r3 = r3.c(r4)
            boolean r4 = r7 instanceof i0.k0
            if (r4 == 0) goto L23
            r4 = r7
            i0.k0 r4 = (i0.k0) r4
            java.util.RandomAccess r0 = r6.f480f
            j0.b r0 = (j0.b) r0
            r0.b(r4)
            java.lang.Object r0 = r6.f479e
            f.l0 r0 = (f.l0) r0
            r0.a(r4)
        L23:
            int r4 = r5.f7713t
            java.lang.Object r3 = r5.K(r4, r3, r7)
            boolean r4 = r3 instanceof i0.k0
            if (r4 == 0) goto L33
            i0.k0 r3 = (i0.k0) r3
            r6.g(r3)
            goto L3c
        L33:
            boolean r4 = r3 instanceof i0.r1
            if (r4 == 0) goto L3c
            i0.r1 r3 = (i0.r1) r3
            r3.c()
        L3c:
            return
        L3d:
            r4 = 0
            java.lang.Object r7 = r3.d(r4)
            r0 = 1
            java.lang.Object r0 = r3.d(r0)
            l0.b r0 = (l0.b) r0
            int r3 = r3.c(r4)
            boolean r4 = r7 instanceof i0.k0
            if (r4 == 0) goto L62
            r4 = r7
            i0.k0 r4 = (i0.k0) r4
            java.util.RandomAccess r1 = r6.f480f
            j0.b r1 = (j0.b) r1
            r1.b(r4)
            java.lang.Object r1 = r6.f479e
            f.l0 r1 = (f.l0) r1
            r1.a(r4)
        L62:
            int r4 = r5.c(r0)
            java.lang.Object r3 = r5.K(r4, r3, r7)
            boolean r4 = r3 instanceof i0.k0
            if (r4 == 0) goto L74
            i0.k0 r3 = (i0.k0) r3
            r6.g(r3)
            goto L7d
        L74:
            boolean r4 = r3 instanceof i0.r1
            if (r4 == 0) goto L7d
            i0.r1 r3 = (i0.r1) r3
            r3.c()
        L7d:
            return
        L7e:
            r6 = 0
            java.lang.Object r7 = r3.d(r6)
            l0.b r7 = (l0.b) r7
            int r3 = r3.c(r6)
            r4.k()
            r7.getClass()
            int r6 = r5.c(r7)
            java.lang.Object r5 = r5.D(r6)
            r4.c(r3, r5)
            return
        L9b:
            r6 = 0
            java.lang.Object r7 = r3.d(r6)
            fg.a r7 = (fg.a) r7
            java.lang.Object r7 = r7.invoke()
            r0 = 1
            java.lang.Object r0 = r3.d(r0)
            l0.b r0 = (l0.b) r0
            int r3 = r3.c(r6)
            r0.getClass()
            int r6 = r5.c(r0)
            r5.U(r6, r7)
            r4.p(r3, r7)
            r4.d(r7)
            return
    }

    @Override // m0.j0
    public l0.b b(h0.s r2) {
            r1 = this;
            int r0 = r1.f8487c
            switch(r0) {
                case 0: goto L12;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            l0.b r2 = super.b(r2)
            return r2
        La:
            r0 = 0
            java.lang.Object r2 = r2.d(r0)
            l0.b r2 = (l0.b) r2
            return r2
        L12:
            r0 = 1
            java.lang.Object r2 = r2.d(r0)
            l0.b r2 = (l0.b) r2
            return r2
    }
}
