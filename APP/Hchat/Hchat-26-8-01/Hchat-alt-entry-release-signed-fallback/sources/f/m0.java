package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.i0 f2861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.n0 f2862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f2863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f2868n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f.n0 f2871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f.i0 f2872r;

    public m0(f.n0 r1, f.i0 r2, wf.c r3) {
            r0 = this;
            r0.f2871q = r1
            r0.f2872r = r2
            r0.<init>(r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            f.m0 r0 = new f.m0
            f.n0 r1 = r3.f2871q
            f.i0 r2 = r3.f2872r
            r0.<init>(r1, r2, r5)
            r0.f2870p = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ng.l r1 = (ng.l) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            f.m0 r1 = (f.m0) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            int r1 = r0.f2869o
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.f2867m
            int r5 = r0.f2866l
            long r6 = r0.f2868n
            int r8 = r0.f2865k
            int r9 = r0.f2864j
            long[] r10 = r0.f2863i
            f.n0 r11 = r0.f2862h
            f.i0 r12 = r0.f2861g
            java.lang.Object r13 = r0.f2870p
            ng.l r13 = (ng.l) r13
            f8.i.I0(r21)
            goto L94
        L25:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            return r1
        L2c:
            f8.i.I0(r21)
            java.lang.Object r1 = r0.f2870p
            ng.l r1 = (ng.l) r1
            f.n0 r5 = r0.f2871q
            f.l0 r6 = r5.f2875h
            long[] r6 = r6.f2855a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            f.i0 r8 = r0.f2872r
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f2837h = r2
            f.l0 r3 = r11.f2875h
            java.lang.Object[] r3 = r3.f2856b
            r2 = r3[r2]
            r0.f2870p = r13
            r0.f2861g = r12
            r0.f2862h = r11
            r0.f2863i = r10
            r0.f2864j = r9
            r0.f2865k = r8
            r0.f2868n = r6
            r0.f2866l = r5
            r0.f2867m = r1
            r0.f2869o = r4
            r13.a(r2, r0)
            xf.a r1 = xf.a.f21579g
            return r1
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
