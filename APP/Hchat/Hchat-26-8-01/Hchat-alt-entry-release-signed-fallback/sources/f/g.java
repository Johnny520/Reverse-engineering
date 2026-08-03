package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long[] f2807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.Object f2815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2816q;

    public /* synthetic */ g(java.lang.Object r1, wf.c r2, int r3) {
            r0 = this;
            r0.f2806g = r3
            r0.f2816q = r1
            r0.<init>(r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f2806g
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L1f;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            f.g r0 = new f.g
            java.lang.Object r1 = r3.f2816q
            j0.d r1 = (j0.d) r1
            r2 = 3
            r0.<init>(r1, r5, r2)
            r0.f2814o = r4
            return r0
        L12:
            f.g r0 = new f.g
            java.lang.Object r1 = r3.f2816q
            f.u0 r1 = (f.u0) r1
            r2 = 2
            r0.<init>(r1, r5, r2)
            r0.f2814o = r4
            return r0
        L1f:
            f.g r0 = new f.g
            java.lang.Object r1 = r3.f2816q
            f.h r1 = (f.h) r1
            r2 = 1
            r0.<init>(r1, r5, r2)
            r0.f2814o = r4
            return r0
        L2c:
            f.g r0 = new f.g
            java.lang.Object r1 = r3.f2816q
            f.h r1 = (f.h) r1
            r2 = 0
            r0.<init>(r1, r5, r2)
            r0.f2814o = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f2806g
            ng.l r2 = (ng.l) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L30;
                case 1: goto L23;
                case 2: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            f.g r2 = (f.g) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            f.g r2 = (f.g) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            f.g r2 = (f.g) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L30:
            wf.c r2 = r1.create(r2, r3)
            f.g r2 = (f.g) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.f2806g
            switch(r1) {
                case 0: goto L1dd;
                case 1: goto L141;
                case 2: goto La3;
                default: goto L7;
            }
        L7:
            int r1 = r0.f2813n
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2a
            int r1 = r0.f2811l
            int r5 = r0.f2810k
            long r6 = r0.f2812m
            int r8 = r0.f2809j
            int r9 = r0.f2808i
            long[] r10 = r0.f2807h
            java.lang.Object r11 = r0.f2815p
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            java.lang.Object r12 = r0.f2814o
            ng.l r12 = (ng.l) r12
            f8.i.I0(r20)
            goto L92
        L2a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            goto La2
        L32:
            f8.i.I0(r20)
            java.lang.Object r1 = r0.f2814o
            ng.l r1 = (ng.l) r1
            java.lang.Object r5 = r0.f2816q
            j0.d r5 = (j0.d) r5
            f.l0 r5 = r5.f6674g
            java.lang.Object[] r6 = r5.f2856b
            long[] r5 = r5.f2855a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La0
            r8 = r2
        L49:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L9b
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r5
            r9 = r7
            r5 = r11
            r11 = r6
            r6 = r17
        L6a:
            if (r1 >= r5) goto L95
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L92
            int r2 = r8 << 3
            int r2 = r2 + r1
            r2 = r11[r2]
            r0.f2814o = r12
            r0.f2815p = r11
            r0.f2807h = r10
            r0.f2808i = r9
            r0.f2809j = r8
            r0.f2812m = r6
            r0.f2810k = r5
            r0.f2811l = r1
            r0.f2813n = r4
            r12.a(r2, r0)
            xf.a r1 = xf.a.f21579g
            goto La2
        L92:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L6a
        L95:
            if (r5 != r3) goto La0
            r7 = r9
            r5 = r10
            r6 = r11
            r1 = r12
        L9b:
            if (r8 == r7) goto La0
            int r8 = r8 + 1
            goto L49
        La0:
            sf.n r1 = sf.n.f12433a
        La2:
            return r1
        La3:
            int r1 = r0.f2813n
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto Lce
            if (r1 != r4) goto Lc6
            int r1 = r0.f2811l
            int r5 = r0.f2810k
            long r6 = r0.f2812m
            int r8 = r0.f2809j
            int r9 = r0.f2808i
            long[] r10 = r0.f2807h
            java.lang.Object r11 = r0.f2815p
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            java.lang.Object r12 = r0.f2814o
            ng.l r12 = (ng.l) r12
            f8.i.I0(r20)
            goto L130
        Lc6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            goto L140
        Lce:
            f8.i.I0(r20)
            java.lang.Object r1 = r0.f2814o
            ng.l r1 = (ng.l) r1
            java.lang.Object r5 = r0.f2816q
            f.u0 r5 = (f.u0) r5
            java.lang.Object r5 = r5.f2914h
            f.k0 r5 = (f.k0) r5
            java.lang.Object[] r6 = r5.f2850c
            long[] r5 = r5.f2848a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L13e
            r8 = r2
        Le7:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L139
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r5
            r9 = r7
            r5 = r11
            r11 = r6
            r6 = r17
        L108:
            if (r1 >= r5) goto L133
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L130
            int r2 = r8 << 3
            int r2 = r2 + r1
            r2 = r11[r2]
            r0.f2814o = r12
            r0.f2815p = r11
            r0.f2807h = r10
            r0.f2808i = r9
            r0.f2809j = r8
            r0.f2812m = r6
            r0.f2810k = r5
            r0.f2811l = r1
            r0.f2813n = r4
            r12.a(r2, r0)
            xf.a r1 = xf.a.f21579g
            goto L140
        L130:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L108
        L133:
            if (r5 != r3) goto L13e
            r7 = r9
            r5 = r10
            r6 = r11
            r1 = r12
        L139:
            if (r8 == r7) goto L13e
            int r8 = r8 + 1
            goto Le7
        L13e:
            sf.n r1 = sf.n.f12433a
        L140:
            return r1
        L141:
            int r1 = r0.f2813n
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L16c
            if (r1 != r4) goto L164
            int r1 = r0.f2811l
            int r5 = r0.f2810k
            long r6 = r0.f2812m
            int r8 = r0.f2809j
            int r9 = r0.f2808i
            long[] r10 = r0.f2807h
            java.lang.Object r11 = r0.f2815p
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            java.lang.Object r12 = r0.f2814o
            ng.l r12 = (ng.l) r12
            f8.i.I0(r20)
            goto L1cc
        L164:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            goto L1dc
        L16c:
            f8.i.I0(r20)
            java.lang.Object r1 = r0.f2814o
            ng.l r1 = (ng.l) r1
            java.lang.Object r5 = r0.f2816q
            f.h r5 = (f.h) r5
            f.k0 r5 = r5.f2826h
            java.lang.Object[] r6 = r5.f2849b
            long[] r5 = r5.f2848a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L1da
            r8 = r2
        L183:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L1d5
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r5
            r9 = r7
            r5 = r11
            r11 = r6
            r6 = r17
        L1a4:
            if (r1 >= r5) goto L1cf
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L1cc
            int r2 = r8 << 3
            int r2 = r2 + r1
            r2 = r11[r2]
            r0.f2814o = r12
            r0.f2815p = r11
            r0.f2807h = r10
            r0.f2808i = r9
            r0.f2809j = r8
            r0.f2812m = r6
            r0.f2810k = r5
            r0.f2811l = r1
            r0.f2813n = r4
            r12.a(r2, r0)
            xf.a r1 = xf.a.f21579g
            goto L1dc
        L1cc:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L1a4
        L1cf:
            if (r5 != r3) goto L1da
            r7 = r9
            r5 = r10
            r6 = r11
            r1 = r12
        L1d5:
            if (r8 == r7) goto L1da
            int r8 = r8 + 1
            goto L183
        L1da:
            sf.n r1 = sf.n.f12433a
        L1dc:
            return r1
        L1dd:
            int r1 = r0.f2813n
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L208
            if (r1 != r4) goto L200
            int r1 = r0.f2811l
            int r5 = r0.f2810k
            long r6 = r0.f2812m
            int r8 = r0.f2809j
            int r9 = r0.f2808i
            long[] r10 = r0.f2807h
            java.lang.Object r11 = r0.f2815p
            f.h r11 = (f.h) r11
            java.lang.Object r12 = r0.f2814o
            ng.l r12 = (ng.l) r12
            f8.i.I0(r20)
            goto L275
        L200:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            goto L285
        L208:
            f8.i.I0(r20)
            java.lang.Object r1 = r0.f2814o
            ng.l r1 = (ng.l) r1
            java.lang.Object r5 = r0.f2816q
            f.h r5 = (f.h) r5
            f.k0 r6 = r5.f2826h
            long[] r6 = r6.f2848a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L283
            r8 = r2
        L21d:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L27e
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r5
            r5 = r12
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r6
            r9 = r7
            r6 = r17
        L23f:
            if (r1 >= r5) goto L278
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L275
            int r2 = r8 << 3
            int r2 = r2 + r1
            f.s r3 = new f.s
            f.k0 r13 = r11.f2826h
            java.lang.Object[] r14 = r13.f2849b
            r14 = r14[r2]
            java.lang.Object[] r13 = r13.f2850c
            r2 = r13[r2]
            r13 = 0
            r3.<init>(r14, r13, r2)
            r0.f2814o = r12
            r0.f2815p = r11
            r0.f2807h = r10
            r0.f2808i = r9
            r0.f2809j = r8
            r0.f2812m = r6
            r0.f2810k = r5
            r0.f2811l = r1
            r0.f2813n = r4
            r12.a(r3, r0)
            xf.a r1 = xf.a.f21579g
            goto L285
        L275:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L23f
        L278:
            if (r5 != r3) goto L283
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r12
        L27e:
            if (r8 == r7) goto L283
            int r8 = r8 + 1
            goto L21d
        L283:
            sf.n r1 = sf.n.f12433a
        L285:
            return r1
    }
}
