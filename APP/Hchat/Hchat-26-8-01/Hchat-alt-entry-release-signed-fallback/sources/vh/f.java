package vh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u2.m f14386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f14388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f14389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f14390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f14391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f14392g;

    public f(fg.a r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.f14388c = r3
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.f14387b = r0
            vh.e r3 = new vh.e
            r0 = 0
            r3.<init>(r2, r0)
            r2.f14392g = r3
            return
    }

    public f(u2.m r1, u2.c r2, m2.d r3, i2.n0 r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>()
            r0.f14386a = r1
            r0.f14388c = r2
            r0.f14389d = r3
            r0.f14390e = r4
            r0.f14391f = r5
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            i0.j1 r1 = i0.r.u(r1)
            r0.f14392g = r1
            java.lang.Object r1 = r0.f14389d
            m2.d r1 = (m2.d) r1
            java.lang.Object r2 = r0.f14390e
            i2.n0 r2 = (i2.n0) r2
            java.lang.Object r3 = r0.f14388c
            u2.c r3 = (u2.c) r3
            long r1 = w.a1.b(r2, r3, r1)
            r0.f14387b = r1
            return
    }

    public static void a(vh.f r3, u2.m r4, u2.c r5, i2.n0 r6, int r7) {
            r0 = r7 & 1
            if (r0 == 0) goto L6
            u2.m r4 = r3.f14386a
        L6:
            r0 = r7 & 2
            if (r0 == 0) goto Le
            java.lang.Object r5 = r3.f14388c
            u2.c r5 = (u2.c) r5
        Le:
            java.lang.Object r0 = r3.f14389d
            m2.d r0 = (m2.d) r0
            r7 = r7 & 8
            if (r7 == 0) goto L1a
            java.lang.Object r6 = r3.f14390e
            i2.n0 r6 = (i2.n0) r6
        L1a:
            java.lang.Object r7 = r3.f14391f
            u2.m r1 = r3.f14386a
            java.lang.Object r2 = r3.f14392g
            i0.j1 r2 = (i0.j1) r2
            if (r4 != r1) goto L53
            java.lang.Object r1 = r3.f14388c
            u2.c r1 = (u2.c) r1
            boolean r1 = gg.l.a(r5, r1)
            if (r1 == 0) goto L53
            java.lang.Object r1 = r3.f14389d
            m2.d r1 = (m2.d) r1
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L53
            java.lang.Object r1 = r3.f14390e
            i2.n0 r1 = (i2.n0) r1
            boolean r1 = gg.l.a(r6, r1)
            if (r1 != 0) goto L43
            goto L53
        L43:
            java.lang.Object r4 = r3.f14391f
            boolean r4 = gg.l.a(r7, r4)
            if (r4 != 0) goto L52
            r3.f14391f = r7
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.setValue(r3)
        L52:
            return
        L53:
            r3.f14386a = r4
            r3.f14388c = r5
            r3.f14389d = r0
            r3.f14390e = r6
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.setValue(r3)
            return
    }
}
