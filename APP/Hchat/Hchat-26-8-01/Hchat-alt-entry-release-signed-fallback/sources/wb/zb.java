package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zb implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f20601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f20602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20605n;

    public /* synthetic */ zb(java.lang.Object r1, int r2, fg.p r3, fg.l r4, fg.l r5, i0.a1 r6, i0.a1 r7, int r8) {
            r0 = this;
            r0.f20598g = r8
            r0.f20605n = r1
            r0.f20599h = r2
            r0.f20600i = r3
            r0.f20601j = r4
            r0.f20602k = r5
            r0.f20603l = r6
            r0.f20604m = r7
            r0.<init>()
            return
    }

    public /* synthetic */ zb(na.h r2, fg.l r3, int r4, java.util.List r5, fg.l r6, fg.l r7, fg.l r8) {
            r1 = this;
            r0 = 2
            r1.f20598g = r0
            r1.<init>()
            r1.f20605n = r2
            r1.f20601j = r3
            r1.f20599h = r4
            r1.f20600i = r5
            r1.f20602k = r6
            r1.f20603l = r7
            r1.f20604m = r8
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
            r11 = this;
            int r0 = r11.f20598g
            switch(r0) {
                case 0: goto La8;
                case 1: goto L56;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f20605n
            r2 = r0
            na.h r2 = (na.h) r2
            java.lang.Object r0 = r11.f20600i
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r11.f20603l
            r7 = r0
            fg.l r7 = (fg.l) r7
            java.lang.Object r0 = r11.f20604m
            r8 = r0
            fg.l r8 = (fg.l) r8
            r.d r12 = (r.d) r12
            i0.h0 r13 = (i0.h0) r13
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r12.getClass()
            r12 = r14 & 17
            r0 = 16
            r9 = 1
            if (r12 == r0) goto L2f
            r12 = r9
            goto L30
        L2f:
            r12 = 0
        L30:
            r14 = r14 & r9
            boolean r12 = r13.S(r14, r12)
            if (r12 == 0) goto L50
            c9.t0 r1 = new c9.t0
            fg.l r3 = r11.f20601j
            int r4 = r11.f20599h
            fg.l r6 = r11.f20602k
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12 = -756847707(0xffffffffd2e36ba5, float:-4.8838178E11)
            s0.d r12 = s0.i.e(r12, r1, r13)
            r14 = 48
            r0 = 0
            wb.ho.C3(r0, r12, r13, r14, r9)
            goto L53
        L50:
            r13.V()
        L53:
            sf.n r12 = sf.n.f12433a
            return r12
        L56:
            java.lang.Object r0 = r11.f20605n
            r2 = r0
            v8.a r2 = (v8.a) r2
            java.lang.Object r0 = r11.f20600i
            r4 = r0
            fg.p r4 = (fg.p) r4
            java.lang.Object r0 = r11.f20603l
            r7 = r0
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r0 = r11.f20604m
            r8 = r0
            i0.a1 r8 = (i0.a1) r8
            r.d r12 = (r.d) r12
            i0.h0 r13 = (i0.h0) r13
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r12.getClass()
            r12 = r14 & 17
            r0 = 16
            r10 = 1
            if (r12 == r0) goto L80
            r12 = r10
            goto L81
        L80:
            r12 = 0
        L81:
            r14 = r14 & r10
            boolean r12 = r13.S(r14, r12)
            if (r12 == 0) goto La2
            c9.t0 r1 = new c9.t0
            r9 = 3
            int r3 = r11.f20599h
            fg.l r5 = r11.f20601j
            fg.l r6 = r11.f20602k
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12 = 122482762(0x74cf04a, float:1.5417869E-34)
            s0.d r12 = s0.i.e(r12, r1, r13)
            r14 = 48
            r0 = 0
            wb.ho.C3(r0, r12, r13, r14, r10)
            goto La5
        La2:
            r13.V()
        La5:
            sf.n r12 = sf.n.f12433a
            return r12
        La8:
            java.lang.Object r0 = r11.f20605n
            r2 = r0
            x8.b r2 = (x8.b) r2
            java.lang.Object r0 = r11.f20600i
            r4 = r0
            fg.p r4 = (fg.p) r4
            java.lang.Object r0 = r11.f20603l
            r7 = r0
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r0 = r11.f20604m
            r8 = r0
            i0.a1 r8 = (i0.a1) r8
            r.d r12 = (r.d) r12
            i0.h0 r13 = (i0.h0) r13
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r12.getClass()
            r12 = r14 & 17
            r0 = 16
            r10 = 1
            if (r12 == r0) goto Ld2
            r12 = r10
            goto Ld3
        Ld2:
            r12 = 0
        Ld3:
            r14 = r14 & r10
            boolean r12 = r13.S(r14, r12)
            if (r12 == 0) goto Lf4
            c9.t0 r1 = new c9.t0
            r9 = 2
            int r3 = r11.f20599h
            fg.l r5 = r11.f20601j
            fg.l r6 = r11.f20602k
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12 = -1274454550(0xffffffffb4095dea, float:-1.2793285E-7)
            s0.d r12 = s0.i.e(r12, r1, r13)
            r14 = 48
            r0 = 0
            wb.ho.C3(r0, r12, r13, r14, r10)
            goto Lf7
        Lf4:
            r13.V()
        Lf7:
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
