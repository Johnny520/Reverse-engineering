package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.List f6082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f6083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.util.List f6084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f.l0 f6085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f.l0 f6086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f.l0 f6087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.Set f6088n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f.l0 f6089o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6090p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ i0.d f6091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.y1 f6092r;

    public x1(i0.y1 r1, wf.c r2) {
            r0 = this;
            r0.f6092r = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    public static final void f(i0.y1 r22, java.util.List r23, java.util.List r24, java.util.List r25, f.l0 r26, f.l0 r27, f.l0 r28, f.l0 r29) {
            r0 = r22
            r1 = r26
            r2 = r27
            r3 = r29
            java.lang.Object r4 = r0.f6098c
            monitor-enter(r4)
            r23.clear()     // Catch: java.lang.Throwable -> L29
            r24.clear()     // Catch: java.lang.Throwable -> L29
            int r5 = r25.size()     // Catch: java.lang.Throwable -> L29
            r7 = 0
        L16:
            if (r7 >= r5) goto L2c
            r8 = r25
            java.lang.Object r9 = r8.get(r7)     // Catch: java.lang.Throwable -> L29
            i0.q r9 = (i0.q) r9     // Catch: java.lang.Throwable -> L29
            r9.a()     // Catch: java.lang.Throwable -> L29
            r0.L(r9)     // Catch: java.lang.Throwable -> L29
            int r7 = r7 + 1
            goto L16
        L29:
            r0 = move-exception
            goto L107
        L2c:
            r8 = r25
            r8.clear()     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r5 = r1.f2856b     // Catch: java.lang.Throwable -> L29
            long[] r7 = r1.f2855a     // Catch: java.lang.Throwable -> L29
            int r8 = r7.length     // Catch: java.lang.Throwable -> L29
            int r8 = r8 + (-2)
            r6 = 8
            r24 = 128(0x80, double:6.3E-322)
            if (r8 < 0) goto L7a
            r9 = 0
            r16 = 255(0xff, double:1.26E-321)
        L41:
            r11 = r7[r9]     // Catch: java.lang.Throwable -> L29
            r10 = 7
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = ~r11     // Catch: java.lang.Throwable -> L29
            long r13 = r13 << r10
            long r13 = r13 & r11
            long r13 = r13 & r18
            int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r13 == 0) goto L75
            int r13 = r9 - r8
            int r13 = ~r13     // Catch: java.lang.Throwable -> L29
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = 0
        L5a:
            if (r14 >= r13) goto L73
            long r20 = r11 & r16
            int r15 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r15 >= 0) goto L6f
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]     // Catch: java.lang.Throwable -> L29
            i0.q r15 = (i0.q) r15     // Catch: java.lang.Throwable -> L29
            r15.a()     // Catch: java.lang.Throwable -> L29
            r0.L(r15)     // Catch: java.lang.Throwable -> L29
        L6f:
            long r11 = r11 >> r6
            int r14 = r14 + 1
            goto L5a
        L73:
            if (r13 != r6) goto L82
        L75:
            if (r9 == r8) goto L82
            int r9 = r9 + 1
            goto L41
        L7a:
            r10 = 7
            r16 = 255(0xff, double:1.26E-321)
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L82:
            r1.b()     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r1 = r2.f2856b     // Catch: java.lang.Throwable -> L29
            long[] r5 = r2.f2855a     // Catch: java.lang.Throwable -> L29
            int r7 = r5.length     // Catch: java.lang.Throwable -> L29
            int r7 = r7 + (-2)
            if (r7 < 0) goto Lbf
            r8 = 0
        L8f:
            r11 = r5[r8]     // Catch: java.lang.Throwable -> L29
            long r13 = ~r11     // Catch: java.lang.Throwable -> L29
            long r13 = r13 << r10
            long r13 = r13 & r11
            long r13 = r13 & r18
            int r9 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r9 == 0) goto Lba
            int r9 = r8 - r7
            int r9 = ~r9     // Catch: java.lang.Throwable -> L29
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r13 = 0
        La2:
            if (r13 >= r9) goto Lb8
            long r14 = r11 & r16
            int r14 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r14 >= 0) goto Lb4
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r1[r14]     // Catch: java.lang.Throwable -> L29
            i0.q r14 = (i0.q) r14     // Catch: java.lang.Throwable -> L29
            r14.g()     // Catch: java.lang.Throwable -> L29
        Lb4:
            long r11 = r11 >> r6
            int r13 = r13 + 1
            goto La2
        Lb8:
            if (r9 != r6) goto Lbf
        Lba:
            if (r8 == r7) goto Lbf
            int r8 = r8 + 1
            goto L8f
        Lbf:
            r2.b()     // Catch: java.lang.Throwable -> L29
            r28.b()     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r1 = r3.f2856b     // Catch: java.lang.Throwable -> L29
            long[] r2 = r3.f2855a     // Catch: java.lang.Throwable -> L29
            int r5 = r2.length     // Catch: java.lang.Throwable -> L29
            int r5 = r5 + (-2)
            if (r5 < 0) goto L102
            r7 = 0
        Lcf:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L29
            long r11 = ~r8     // Catch: java.lang.Throwable -> L29
            long r11 = r11 << r10
            long r11 = r11 & r8
            long r11 = r11 & r18
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 == 0) goto Lfd
            int r11 = r7 - r5
            int r11 = ~r11     // Catch: java.lang.Throwable -> L29
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        Le2:
            if (r12 >= r11) goto Lfb
            long r13 = r8 & r16
            int r13 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r13 >= 0) goto Lf7
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r1[r13]     // Catch: java.lang.Throwable -> L29
            i0.q r13 = (i0.q) r13     // Catch: java.lang.Throwable -> L29
            r13.a()     // Catch: java.lang.Throwable -> L29
            r0.L(r13)     // Catch: java.lang.Throwable -> L29
        Lf7:
            long r8 = r8 >> r6
            int r12 = r12 + 1
            goto Le2
        Lfb:
            if (r11 != r6) goto L102
        Lfd:
            if (r7 == r5) goto L102
            int r7 = r7 + 1
            goto Lcf
        L102:
            r3.b()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)
            return
        L107:
            monitor-exit(r4)
            throw r0
    }

    public static final void g(java.util.List r5, i0.y1 r6) {
            r5.clear()
            java.lang.Object r0 = r6.f6098c
            monitor-enter(r0)
            java.util.ArrayList r1 = r6.f6106k     // Catch: java.lang.Throwable -> L1b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
        Ld:
            if (r3 >= r2) goto L1d
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L1b
            i0.v0 r4 = (i0.v0) r4     // Catch: java.lang.Throwable -> L1b
            r5.add(r4)     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 + 1
            goto Ld
        L1b:
            r5 = move-exception
            goto L24
        L1d:
            java.util.ArrayList r5 = r6.f6106k     // Catch: java.lang.Throwable -> L1b
            r5.clear()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L24:
            monitor-exit(r0)
            throw r5
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            qg.t r2 = (qg.t) r2
            i0.d r3 = (i0.d) r3
            wf.c r4 = (wf.c) r4
            i0.x1 r2 = new i0.x1
            i0.y1 r0 = r1.f6092r
            r2.<init>(r0, r4)
            r2.f6091q = r3
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            xf.a r2 = xf.a.f21579g
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            r22 = this;
            r1 = r22
            xf.a r0 = xf.a.f21579g
            int r2 = r1.f6090p
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            f.l0 r2 = r1.f6089o
            java.util.Set r6 = r1.f6088n
            java.util.Set r6 = (java.util.Set) r6
            f.l0 r7 = r1.f6087m
            f.l0 r8 = r1.f6086l
            f.l0 r9 = r1.f6085k
            java.util.List r10 = r1.f6084j
            java.util.List r11 = r1.f6083i
            java.util.List r12 = r1.f6082h
            i0.d r13 = r1.f6091q
            f8.i.I0(r23)
            r21 = r13
            r13 = r2
            r2 = r21
            goto L12c
        L2d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            return r3
        L33:
            f.l0 r2 = r1.f6089o
            java.util.Set r6 = r1.f6088n
            java.util.Set r6 = (java.util.Set) r6
            f.l0 r7 = r1.f6087m
            f.l0 r8 = r1.f6086l
            f.l0 r9 = r1.f6085k
            java.util.List r10 = r1.f6084j
            java.util.List r11 = r1.f6083i
            java.util.List r12 = r1.f6082h
            i0.d r13 = r1.f6091q
            f8.i.I0(r23)
            r14 = r9
            r9 = r2
            r2 = r13
            r13 = r10
            r10 = r12
            r12 = r14
        L50:
            r15 = r6
            r14 = r8
            r8 = r7
            goto Lf5
        L55:
            f8.i.I0(r23)
            i0.d r2 = r1.f6091q
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            f.l0 r9 = f.s0.f2899a
            f.l0 r9 = new f.l0
            r9.<init>()
            f.l0 r10 = new f.l0
            r10.<init>()
            f.l0 r11 = new f.l0
            r11.<init>()
            j0.d r12 = new j0.d
            r12.<init>(r11)
            f.l0 r13 = new f.l0
            r13.<init>()
            r21 = r12
            r12 = r6
            r6 = r21
            r21 = r11
            r11 = r7
            r7 = r21
            r21 = r10
            r10 = r8
            r8 = r21
        L93:
            i0.y1 r14 = r1.f6092r
            java.lang.Object r14 = r14.f6098c
            monitor-enter(r14)
            monitor-exit(r14)
            i0.y1 r14 = r1.f6092r
            r1.f6091q = r2
            r1.f6082h = r12
            r1.f6083i = r11
            r1.f6084j = r10
            r1.f6085k = r9
            r1.f6086l = r8
            r1.f6087m = r7
            r15 = r6
            java.util.Set r15 = (java.util.Set) r15
            r1.f6088n = r15
            r1.f6089o = r13
            r1.f6090p = r5
            boolean r15 = r14.C()
            if (r15 != 0) goto Le9
            qg.g r15 = new qg.g
            wf.c r3 = fb.v0.x(r1)
            r15.<init>(r5, r3)
            r15.p()
            java.lang.Object r3 = r14.f6098c
            monitor-enter(r3)
            boolean r16 = r14.C()     // Catch: java.lang.Throwable -> Le6
            if (r16 == 0) goto Lcf
            r14 = r15
            goto Ld2
        Lcf:
            r14.f6113r = r15     // Catch: java.lang.Throwable -> Le6
            r14 = 0
        Ld2:
            monitor-exit(r3)
            if (r14 == 0) goto Lda
            sf.n r3 = sf.n.f12433a
            r14.resumeWith(r3)
        Lda:
            java.lang.Object r3 = r15.o()
            xf.a r14 = xf.a.f21579g
            if (r3 != r14) goto Le3
            goto Leb
        Le3:
            sf.n r3 = sf.n.f12433a
            goto Leb
        Le6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Le9:
            sf.n r3 = sf.n.f12433a
        Leb:
            if (r3 != r0) goto Lee
            goto L123
        Lee:
            r14 = r12
            r12 = r9
            r9 = r13
            r13 = r10
            r10 = r14
            goto L50
        Lf5:
            i0.y1 r3 = r1.f6092r
            tg.b0 r6 = i0.y1.f6095z
            boolean r3 = r3.K()
            if (r3 == 0) goto L1d9
            i0.y1 r7 = r1.f6092r
            i0.w1 r6 = new i0.w1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f6091q = r2
            r1.f6082h = r10
            r1.f6083i = r11
            r1.f6084j = r13
            r1.f6085k = r12
            r1.f6086l = r14
            r1.f6087m = r8
            r3 = r15
            java.util.Set r3 = (java.util.Set) r3
            r1.f6088n = r3
            r1.f6089o = r9
            r1.f6090p = r4
            java.lang.Object r3 = r2.d(r6, r1)
            if (r3 != r0) goto L124
        L123:
            return r0
        L124:
            r6 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r6
            r7 = r8
            r8 = r14
            r6 = r15
        L12c:
            i0.y1 r3 = r1.f6092r
            java.lang.Object r14 = r3.f6098c
            monitor-enter(r14)
            f.k0 r15 = r3.f6107l     // Catch: java.lang.Throwable -> L18a
            boolean r15 = r15.j()     // Catch: java.lang.Throwable -> L18a
            if (r15 == 0) goto L194
            f.k0 r15 = r3.f6107l     // Catch: java.lang.Throwable -> L18a
            f.f0 r15 = j0.a.b(r15)     // Catch: java.lang.Throwable -> L18a
            f.k0 r5 = r3.f6107l     // Catch: java.lang.Throwable -> L18a
            r5.a()     // Catch: java.lang.Throwable -> L18a
            b.e r5 = r3.f6108m     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r4 = r5.f332h     // Catch: java.lang.Throwable -> L18a
            f.k0 r4 = (f.k0) r4     // Catch: java.lang.Throwable -> L18a
            r4.a()     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r4 = r5.f333i     // Catch: java.lang.Throwable -> L18a
            f.k0 r4 = (f.k0) r4     // Catch: java.lang.Throwable -> L18a
            r4.a()     // Catch: java.lang.Throwable -> L18a
            f.k0 r4 = r3.f6110o     // Catch: java.lang.Throwable -> L18a
            r4.a()     // Catch: java.lang.Throwable -> L18a
            f.f0 r4 = new f.f0     // Catch: java.lang.Throwable -> L18a
            int r5 = r15.f2804b     // Catch: java.lang.Throwable -> L18a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L18a
            java.lang.Object[] r5 = r15.f2803a     // Catch: java.lang.Throwable -> L18a
            int r15 = r15.f2804b     // Catch: java.lang.Throwable -> L18a
            r17 = r0
            r0 = 0
        L167:
            if (r0 >= r15) goto L18c
            r18 = r5[r0]     // Catch: java.lang.Throwable -> L18a
            r19 = r0
            r0 = r18
            i0.v0 r0 = (i0.v0) r0     // Catch: java.lang.Throwable -> L18a
            r18 = r2
            f.k0 r2 = r3.f6109n     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r2 = r2.g(r0)     // Catch: java.lang.Throwable -> L18a
            r20 = r5
            sf.e r5 = new sf.e     // Catch: java.lang.Throwable -> L18a
            r5.<init>(r0, r2)     // Catch: java.lang.Throwable -> L18a
            r4.a(r5)     // Catch: java.lang.Throwable -> L18a
            int r0 = r19 + 1
            r2 = r18
            r5 = r20
            goto L167
        L18a:
            r0 = move-exception
            goto L1d7
        L18c:
            r18 = r2
            f.k0 r0 = r3.f6109n     // Catch: java.lang.Throwable -> L18a
            r0.a()     // Catch: java.lang.Throwable -> L18a
            goto L19d
        L194:
            r17 = r0
            r18 = r2
            f.f0 r4 = f.p0.f2883b     // Catch: java.lang.Throwable -> L18a
            r4.getClass()     // Catch: java.lang.Throwable -> L18a
        L19d:
            monitor-exit(r14)
            java.lang.Object[] r0 = r4.f2803a
            int r2 = r4.f2804b
            r3 = 0
        L1a3:
            if (r3 >= r2) goto L1b4
            r4 = r0[r3]
            sf.e r4 = (sf.e) r4
            java.lang.Object r5 = r4.f12418g
            i0.v0 r5 = (i0.v0) r5
            java.lang.Object r4 = r4.f12419h
            i0.u0 r4 = (i0.u0) r4
            int r3 = r3 + 1
            goto L1a3
        L1b4:
            i0.y1 r0 = r1.f6092r
            b5.c r0 = r0.f6097b
            java.lang.Object r2 = r0.f469a
            s0.a r2 = (s0.a) r2
            r3 = 0
            r2.set(r3)
            java.lang.Object r0 = r0.f470b
            be.k r0 = (be.k) r0
            g0.o r2 = new g0.o
            r3 = 28
            r2.<init>(r3)
            r0.f(r2)
            r0 = r17
            r2 = r18
            r3 = 0
            r4 = 2
            r5 = 1
            goto L93
        L1d7:
            monitor-exit(r14)
            throw r0
        L1d9:
            r3 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r3
            r7 = r8
            r8 = r14
            r6 = r15
            r3 = 0
            goto L93
    }
}
