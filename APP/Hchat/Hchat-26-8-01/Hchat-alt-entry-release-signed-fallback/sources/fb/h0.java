package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f3540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3541j;

    public /* synthetic */ h0(h0.l r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = 2
            r1.f3538g = r0
            r1.<init>()
            r1.f3541j = r2
            r1.f3539h = r3
            r1.f3540i = r4
            return
    }

    public /* synthetic */ h0(boolean r1, boolean r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.f3538g = r4
            r0.f3539h = r1
            r0.f3540i = r2
            r0.f3541j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f3538g
            r1 = 0
            r2 = 1
            boolean r3 = r13.f3540i
            boolean r4 = r13.f3539h
            java.lang.Object r5 = r13.f3541j
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L46;
                default: goto Ld;
            }
        Ld:
            h0.l r5 = (h0.l) r5
            f2.y r14 = (f2.y) r14
            long r8 = r5.a()
            f2.x r0 = h0.h0.f4904c
            h0.g0 r6 = new h0.g0
            if (r4 == 0) goto L1f
            w.g0 r4 = w.g0.f14461h
        L1d:
            r7 = r4
            goto L22
        L1f:
            w.g0 r4 = w.g0.f14462i
            goto L1d
        L22:
            if (r3 == 0) goto L28
            h0.f0 r3 = h0.f0.f4884g
        L26:
            r10 = r3
            goto L2b
        L28:
            h0.f0 r3 = h0.f0.f4886i
            goto L26
        L2b:
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r3 = r3 & r8
            r11 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 == 0) goto L3c
            r11 = r2
            goto L3d
        L3c:
            r11 = r1
        L3d:
            r6.<init>(r7, r8, r10, r11)
            r14.a(r0, r6)
            sf.n r14 = sf.n.f12433a
            return r14
        L46:
            java.lang.String r5 = (java.lang.String) r5
            fb.l0 r14 = (fb.l0) r14
            r14.getClass()
            java.lang.String r14 = r14.f3620a
            if (r4 == 0) goto L5a
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r0)
            r14.getClass()
        L5a:
            if (r3 == 0) goto L61
            boolean r14 = og.m.h0(r14, r5, r1)
            goto L65
        L61:
            boolean r14 = r14.equals(r5)
        L65:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        L6a:
            java.lang.String r5 = (java.lang.String) r5
            t7.b r14 = (t7.b) r14
            r14.getClass()
            java.util.Set r0 = fb.n0.f3650a
            java.util.List r0 = fb.n0.R(r14)
            dg.n r1 = new dg.n
            r6 = 6
            r1.<init>(r0, r6)
            fb.h0 r0 = new fb.h0
            r0.<init>(r4, r3, r5, r2)
            ng.i r3 = new ng.i
            r3.<init>(r1, r2, r0)
            b0.d0 r0 = new b0.d0
            r1 = 14
            r0.<init>(r14, r1)
            ng.t r14 = ng.m.W(r3, r0)
            return r14
    }
}
