package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0.d f12646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.p f12647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.p f12648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.p f12649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.p f12651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f12652n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fg.p f12653o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s0.d f12654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p.r1 f12655q;

    public /* synthetic */ k0(s0.d r1, fg.p r2, fg.p r3, fg.p r4, int r5, fg.p r6, int r7, fg.p r8, p.r1 r9, s0.d r10, int r11) {
            r0 = this;
            r11 = 0
            r0.f12645g = r11
            r0.<init>()
            r0.f12646h = r1
            r0.f12647i = r2
            r0.f12648j = r3
            r0.f12649k = r4
            r0.f12650l = r5
            r0.f12651m = r6
            r0.f12652n = r7
            r0.f12653o = r8
            r0.f12655q = r9
            r0.f12654p = r10
            return
    }

    public /* synthetic */ k0(s0.d r2, fg.p r3, fg.p r4, fg.p r5, int r6, fg.p r7, int r8, fg.p r9, sh.e0 r10, s0.d r11) {
            r1 = this;
            r0 = 1
            r1.f12645g = r0
            r1.<init>()
            r1.f12646h = r2
            r1.f12647i = r3
            r1.f12648j = r4
            r1.f12649k = r5
            r1.f12650l = r6
            r1.f12651m = r7
            r1.f12652n = r8
            r1.f12653o = r9
            r1.f12655q = r10
            r1.f12654p = r11
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.f12645g
            switch(r0) {
                case 0: goto L40;
                default: goto L5;
            }
        L5:
            p.r1 r0 = r13.f12655q
            r9 = r0
            sh.e0 r9 = (sh.e0) r9
            r11 = r14
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r15 = r14 & 3
            r0 = 2
            r1 = 1
            if (r15 == r0) goto L1b
            r15 = r1
            goto L1c
        L1b:
            r15 = 0
        L1c:
            r14 = r14 & r1
            boolean r14 = r11.S(r14, r15)
            if (r14 == 0) goto L3a
            r12 = 0
            s0.d r1 = r13.f12646h
            fg.p r2 = r13.f12647i
            fg.p r3 = r13.f12648j
            fg.p r4 = r13.f12649k
            int r5 = r13.f12650l
            fg.p r6 = r13.f12651m
            int r7 = r13.f12652n
            fg.p r8 = r13.f12653o
            s0.d r10 = r13.f12654p
            sh.p0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L3d
        L3a:
            r11.V()
        L3d:
            sf.n r14 = sf.n.f12433a
            return r14
        L40:
            r10 = r14
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r15 = (java.lang.Integer) r15
            r15.getClass()
            r14 = 1
            int r11 = i0.r.C(r14)
            s0.d r0 = r13.f12646h
            fg.p r1 = r13.f12647i
            fg.p r2 = r13.f12648j
            fg.p r3 = r13.f12649k
            int r4 = r13.f12650l
            fg.p r5 = r13.f12651m
            int r6 = r13.f12652n
            fg.p r7 = r13.f12653o
            p.r1 r8 = r13.f12655q
            s0.d r9 = r13.f12654p
            sh.p0.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
