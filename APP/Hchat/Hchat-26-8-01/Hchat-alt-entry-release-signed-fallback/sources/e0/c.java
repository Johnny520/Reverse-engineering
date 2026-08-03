package e0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f2283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f2284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2285l;

    public c(ac.k r2, h0.q0 r3, w.y0 r4, wf.c r5) {
            r1 = this;
            r0 = 1
            r1.f2280g = r0
            r1.f2283j = r2
            r1.f2284k = r3
            r1.f2285l = r4
            r1.<init>(r5)
            return
    }

    public c(e0.d r2, wf.c r3) {
            r1 = this;
            r0 = 0
            r1.f2280g = r0
            r1.f2285l = r2
            r1.<init>(r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            int r0 = r4.f2280g
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            e0.c r0 = new e0.c
            java.lang.Object r1 = r4.f2283j
            ac.k r1 = (ac.k) r1
            java.lang.Object r2 = r4.f2284k
            h0.q0 r2 = (h0.q0) r2
            java.lang.Object r3 = r4.f2285l
            w.y0 r3 = (w.y0) r3
            r0.<init>(r1, r2, r3, r6)
            r0.f2282i = r5
            return r0
        L19:
            e0.c r0 = new e0.c
            java.lang.Object r1 = r4.f2285l
            e0.d r1 = (e0.d) r1
            r0.<init>(r1, r6)
            r0.f2282i = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f2280g
            s1.k0 r2 = (s1.k0) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            e0.c r2 = (e0.c) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            e0.c r2 = (e0.c) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            int r1 = r0.f2280g
            switch(r1) {
                case 0: goto Le4;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f2283j
            ac.k r1 = (ac.k) r1
            int r2 = r0.f2281h
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            xf.a r7 = xf.a.f21579g
            if (r2 == 0) goto L35
            if (r2 == r6) goto L2b
            if (r2 == r5) goto L26
            if (r2 == r4) goto L26
            if (r2 != r3) goto L1e
            goto L26
        L1e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r7 = 0
            goto Le3
        L26:
            f8.i.I0(r22)
            goto Le1
        L2b:
            java.lang.Object r2 = r0.f2282i
            s1.k0 r2 = (s1.k0) r2
            f8.i.I0(r22)
            r8 = r22
            goto L48
        L35:
            f8.i.I0(r22)
            java.lang.Object r2 = r0.f2282i
            s1.k0 r2 = (s1.k0) r2
            r0.f2282i = r2
            r0.f2281h = r6
            java.lang.Object r8 = a.a.f(r2, r0)
            if (r8 != r7) goto L48
            goto Le3
        L48:
            s1.k r8 = (s1.k) r8
            java.lang.Object r9 = r1.f178i
            y1.l2 r9 = (y1.l2) r9
            java.lang.Object r10 = r1.f179j
            s1.t r10 = (s1.t) r10
            java.lang.Object r11 = r8.f12262a
            r12 = 0
            java.lang.Object r11 = r11.get(r12)
            s1.t r11 = (s1.t) r11
            if (r10 == 0) goto L88
            long r13 = r11.f12292b
            r15 = r13
            long r12 = r10.f12292b
            long r13 = r15 - r12
            long r15 = r9.a()
            int r12 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r12 >= 0) goto L88
            int r12 = r10.f12299i
            float r9 = m.j0.f(r9, r12)
            long r12 = r10.f12293c
            long r14 = r11.f12293c
            long r12 = e1.b.d(r12, r14)
            float r10 = e1.b.c(r12)
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 >= 0) goto L88
            int r9 = r1.f177h
            int r9 = r9 + r6
            r1.f177h = r9
            goto L8a
        L88:
            r1.f177h = r6
        L8a:
            r1.f179j = r11
            boolean r9 = h0.e0.a(r8)
            r10 = 0
            if (r9 == 0) goto Lc1
            int r11 = r8.f12265d
            r11 = r11 & 33
            if (r11 == 0) goto Lc1
            java.lang.Object r11 = r8.f12262a
            int r12 = r11.size()
            r13 = 0
        La0:
            if (r13 >= r12) goto Lb2
            java.lang.Object r14 = r11.get(r13)
            s1.t r14 = (s1.t) r14
            boolean r14 = r14.b()
            if (r14 == 0) goto Laf
            goto Lc1
        Laf:
            int r13 = r13 + 1
            goto La0
        Lb2:
            java.lang.Object r3 = r0.f2284k
            h0.q0 r3 = (h0.q0) r3
            r0.f2282i = r10
            r0.f2281h = r5
            java.lang.Object r1 = a.a.B0(r2, r3, r1, r8, r0)
            if (r1 != r7) goto Le1
            goto Le3
        Lc1:
            if (r9 != 0) goto Le1
            int r1 = r1.f177h
            java.lang.Object r5 = r0.f2285l
            w.y0 r5 = (w.y0) r5
            if (r1 != r6) goto Ld6
            r0.f2282i = r10
            r0.f2281h = r4
            java.lang.Object r1 = a.a.T0(r2, r5, r8, r0)
            if (r1 != r7) goto Le1
            goto Le3
        Ld6:
            r0.f2282i = r10
            r0.f2281h = r3
            java.lang.Object r1 = a.a.i(r2, r5, r8, r1, r0)
            if (r1 != r7) goto Le1
            goto Le3
        Le1:
            sf.n r7 = sf.n.f12433a
        Le3:
            return r7
        Le4:
            java.lang.Object r1 = r0.f2285l
            e0.d r1 = (e0.d) r1
            int r2 = r0.f2281h
            s1.l r3 = s1.l.f12274g
            r4 = 3
            r5 = 2
            r7 = 1
            xf.a r9 = xf.a.f21579g
            if (r2 == 0) goto L130
            if (r2 == r7) goto L126
            if (r2 == r5) goto L113
            if (r2 != r4) goto L10b
            java.lang.Object r1 = r0.f2283j
            s1.t r1 = (s1.t) r1
            java.lang.Object r2 = r0.f2282i
            s1.k0 r2 = (s1.k0) r2
            f8.i.I0(r22)
            r6 = r22
            r5 = r4
            r8 = r9
            r4 = 0
            goto L31c
        L10b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r9 = 0
            goto L35a
        L113:
            java.lang.Object r2 = r0.f2284k
            s1.l r2 = (s1.l) r2
            java.lang.Object r10 = r0.f2283j
            s1.t r10 = (s1.t) r10
            java.lang.Object r11 = r0.f2282i
            s1.k0 r11 = (s1.k0) r11
            f8.i.I0(r22)
            r12 = r22
            goto L1b4
        L126:
            java.lang.Object r2 = r0.f2282i
            s1.k0 r2 = (s1.k0) r2
            f8.i.I0(r22)
            r10 = r22
            goto L144
        L130:
            f8.i.I0(r22)
            java.lang.Object r2 = r0.f2282i
            s1.k0 r2 = (s1.k0) r2
            r0.f2282i = r2
            r0.f2281h = r7
            java.lang.Object r10 = m.y2.a(r2, r7, r3, r0)
            if (r10 != r9) goto L144
        L141:
            r8 = r9
            goto L31a
        L144:
            s1.t r10 = (s1.t) r10
            int r11 = r10.f12299i
            long r12 = r10.f12293c
            if (r11 != r4) goto L14d
            goto L150
        L14d:
            r14 = 4
            if (r11 != r14) goto L358
        L150:
            r11 = 32
            long r14 = r12 >> r11
            int r14 = (int) r14
            float r15 = java.lang.Float.intBitsToFloat(r14)
            r16 = 0
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 < 0) goto L194
            float r14 = java.lang.Float.intBitsToFloat(r14)
            s1.l0 r15 = r2.f12273l
            r22 = r11
            r17 = r12
            long r11 = r15.E
            long r11 = r11 >> r22
            int r11 = (int) r11
            float r11 = (float) r11
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 >= 0) goto L194
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r17 & r11
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 < 0) goto L194
            float r13 = java.lang.Float.intBitsToFloat(r13)
            s1.l0 r14 = r2.f12273l
            long r14 = r14.E
            long r11 = r11 & r14
            int r11 = (int) r11
            float r11 = (float) r11
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 >= 0) goto L194
            r11 = r7
            goto L195
        L194:
            r11 = 0
        L195:
            boolean r12 = r1.f2287x
            if (r12 != 0) goto L19f
            if (r11 == 0) goto L19c
            goto L19f
        L19c:
            s1.l r11 = s1.l.f12275h
            goto L1a0
        L19f:
            r11 = r3
        L1a0:
            r20 = r11
            r11 = r2
            r2 = r20
        L1a5:
            r0.f2282i = r11
            r0.f2283j = r10
            r0.f2284k = r2
            r0.f2281h = r5
            java.lang.Object r12 = r11.e(r2, r0)
            if (r12 != r9) goto L1b4
            goto L141
        L1b4:
            s1.k r12 = (s1.k) r12
            java.lang.Object r13 = r12.f12262a
            int r14 = r13.size()
            r15 = 0
        L1bd:
            if (r15 >= r14) goto L1e5
            java.lang.Object r16 = r13.get(r15)
            r6 = r16
            s1.t r6 = (s1.t) r6
            boolean r18 = r6.b()
            r19 = r9
            if (r18 != 0) goto L1de
            long r8 = r6.f12291a
            long r4 = r10.f12291a
            boolean r4 = s1.s.e(r8, r4)
            if (r4 == 0) goto L1de
            boolean r4 = r6.f12294d
            if (r4 == 0) goto L1de
            goto L1e9
        L1de:
            int r15 = r15 + 1
            r9 = r19
            r4 = 3
            r5 = 2
            goto L1bd
        L1e5:
            r19 = r9
            r16 = 0
        L1e9:
            r4 = r16
            s1.t r4 = (s1.t) r4
            if (r4 != 0) goto L1f0
            goto L207
        L1f0:
            long r5 = r4.f12292b
            long r8 = r10.f12292b
            long r5 = r5 - r8
            y1.l2 r8 = r11.B()
            long r8 = r8.b()
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L202
            goto L207
        L202:
            int r5 = r12.f12264c
            r6 = 2
            if (r5 != r6) goto L209
        L207:
            r4 = 0
            goto L221
        L209:
            long r8 = r4.f12293c
            long r12 = r10.f12293c
            long r8 = e1.b.d(r8, r12)
            float r5 = e1.b.c(r8)
            y1.l2 r8 = r11.B()
            float r8 = r8.c()
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L352
        L221:
            if (r4 != 0) goto L225
            goto L358
        L225:
            boolean r2 = r1.f2287x
            if (r2 != 0) goto L2fe
            y0.n r2 = r1.f21819g
            r5 = 0
        L22c:
            r6 = 16
            if (r2 == 0) goto L276
            boolean r8 = r2 instanceof d1.b0
            if (r8 == 0) goto L23b
            d1.b0 r2 = (d1.b0) r2
            d1.b0.s1(r2)
            goto L2fe
        L23b:
            int r8 = r2.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L271
            boolean r8 = r2 instanceof x1.j
            if (r8 == 0) goto L271
            r8 = r2
            x1.j r8 = (x1.j) r8
            y0.n r8 = r8.f20950v
            r9 = 0
        L24b:
            if (r8 == 0) goto L26e
            int r12 = r8.f21821i
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L26b
            int r9 = r9 + 1
            if (r9 != r7) goto L259
            r2 = r8
            goto L26b
        L259:
            if (r5 != 0) goto L262
            j0.b r5 = new j0.b
            y0.n[] r12 = new y0.n[r6]
            r5.<init>(r12)
        L262:
            if (r2 == 0) goto L268
            r5.b(r2)
            r2 = 0
        L268:
            r5.b(r8)
        L26b:
            y0.n r8 = r8.f21824l
            goto L24b
        L26e:
            if (r9 != r7) goto L271
            goto L22c
        L271:
            y0.n r2 = x1.k.e(r5)
            goto L22c
        L276:
            y0.n r2 = r1.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto L281
            java.lang.String r2 = "visitChildren called on an unattached node"
            u1.a.b(r2)
        L281:
            j0.b r2 = new j0.b
            y0.n[] r5 = new y0.n[r6]
            r2.<init>(r5)
            y0.n r5 = r1.f21819g
            y0.n r8 = r5.f21824l
            if (r8 != 0) goto L292
            x1.k.b(r2, r5)
            goto L295
        L292:
            r2.b(r8)
        L295:
            int r5 = r2.f6673i
            if (r5 == 0) goto L2fe
            int r5 = r5 + (-1)
            java.lang.Object r5 = r2.k(r5)
            y0.n r5 = (y0.n) r5
            int r8 = r5.f21822j
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L2ab
            x1.k.b(r2, r5)
            goto L295
        L2ab:
            if (r5 == 0) goto L295
            int r8 = r5.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L2fb
            r8 = 0
        L2b4:
            if (r5 == 0) goto L295
            boolean r9 = r5 instanceof d1.b0
            if (r9 == 0) goto L2c0
            d1.b0 r5 = (d1.b0) r5
            d1.b0.s1(r5)
            goto L2fe
        L2c0:
            int r9 = r5.f21821i
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L2f6
            boolean r9 = r5 instanceof x1.j
            if (r9 == 0) goto L2f6
            r9 = r5
            x1.j r9 = (x1.j) r9
            y0.n r9 = r9.f20950v
            r12 = 0
        L2d0:
            if (r9 == 0) goto L2f3
            int r13 = r9.f21821i
            r13 = r13 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L2f0
            int r12 = r12 + 1
            if (r12 != r7) goto L2de
            r5 = r9
            goto L2f0
        L2de:
            if (r8 != 0) goto L2e7
            j0.b r8 = new j0.b
            y0.n[] r13 = new y0.n[r6]
            r8.<init>(r13)
        L2e7:
            if (r5 == 0) goto L2ed
            r8.b(r5)
            r5 = 0
        L2ed:
            r8.b(r9)
        L2f0:
            y0.n r9 = r9.f21824l
            goto L2d0
        L2f3:
            if (r12 != r7) goto L2f6
            goto L2b4
        L2f6:
            y0.n r5 = x1.k.e(r8)
            goto L2b4
        L2fb:
            y0.n r5 = r5.f21824l
            goto L2ab
        L2fe:
            fg.a r1 = r1.f2286w
            r1.invoke()
            r4.a()
            r1 = r10
            r2 = r11
        L308:
            r0.f2282i = r2
            r0.f2283j = r1
            r4 = 0
            r0.f2284k = r4
            r5 = 3
            r0.f2281h = r5
            java.lang.Object r6 = r2.e(r3, r0)
            r8 = r19
            if (r6 != r8) goto L31c
        L31a:
            r9 = r8
            goto L35a
        L31c:
            s1.k r6 = (s1.k) r6
            java.lang.Object r6 = r6.f12262a
            int r7 = r6.size()
            r9 = 0
        L325:
            if (r9 >= r7) goto L346
            java.lang.Object r10 = r6.get(r9)
            r11 = r10
            s1.t r11 = (s1.t) r11
            boolean r12 = r11.b()
            if (r12 != 0) goto L343
            long r12 = r11.f12291a
            long r14 = r1.f12291a
            boolean r12 = s1.s.e(r12, r14)
            if (r12 == 0) goto L343
            boolean r11 = r11.f12294d
            if (r11 == 0) goto L343
            goto L347
        L343:
            int r9 = r9 + 1
            goto L325
        L346:
            r10 = r4
        L347:
            s1.t r10 = (s1.t) r10
            if (r10 != 0) goto L34c
            goto L358
        L34c:
            r10.a()
            r19 = r8
            goto L308
        L352:
            r5 = r6
            r9 = r19
            r4 = 3
            goto L1a5
        L358:
            sf.n r9 = sf.n.f12433a
        L35a:
            return r9
    }
}
