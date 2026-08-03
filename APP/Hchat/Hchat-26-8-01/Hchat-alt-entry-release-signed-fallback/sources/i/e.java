package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f5649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f5651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f5652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5655o;

    public e(i.n0 r2, fg.l r3, wf.c r4) {
            r1 = this;
            r0 = 1
            r1.f5648h = r0
            r1.f5654n = r2
            yf.i r3 = (yf.i) r3
            r1.f5655o = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public e(i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, wf.c r7) {
            r1 = this;
            r0 = 4
            r1.f5648h = r0
            r1.f5654n = r2
            r1.f5655o = r3
            r1.f5651k = r4
            r1.f5652l = r5
            r1.f5653m = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public e(k.h1 r2, fg.l r3, wf.c r4) {
            r1 = this;
            r0 = 2
            r1.f5648h = r0
            r1.f5654n = r2
            yf.i r3 = (yf.i) r3
            r1.f5655o = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public e(s1.x r2, fg.l r3, fg.l r4, fg.q r5, fg.l r6, wf.c r7) {
            r1 = this;
            r0 = 3
            r1.f5648h = r0
            r1.f5651k = r2
            r1.f5652l = r3
            r1.f5653m = r4
            r1.f5654n = r5
            r1.f5655o = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public e(sg.g r2, i.c r3, i0.a1 r4, i0.a1 r5, wf.c r6) {
            r1 = this;
            r0 = 0
            r1.f5648h = r0
            r1.f5652l = r2
            r1.f5653m = r3
            r1.f5654n = r4
            r1.f5655o = r5
            r2 = 2
            r1.<init>(r2, r6)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r10, wf.c r11) {
            r9 = this;
            int r0 = r9.f5648h
            switch(r0) {
                case 0: goto L6c;
                case 1: goto L5b;
                case 2: goto L4a;
                case 3: goto L27;
                default: goto L5;
            }
        L5:
            i.e r1 = new i.e
            java.lang.Object r0 = r9.f5654n
            r2 = r0
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r0 = r9.f5655o
            r3 = r0
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r0 = r9.f5651k
            r4 = r0
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r0 = r9.f5652l
            r5 = r0
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r0 = r9.f5653m
            r6 = r0
            i0.a1 r6 = (i0.a1) r6
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.f5649i = r10
            return r1
        L27:
            r7 = r11
            i.e r2 = new i.e
            java.lang.Object r11 = r9.f5651k
            r3 = r11
            s1.x r3 = (s1.x) r3
            java.lang.Object r11 = r9.f5652l
            r4 = r11
            fg.l r4 = (fg.l) r4
            java.lang.Object r11 = r9.f5653m
            r5 = r11
            fg.l r5 = (fg.l) r5
            java.lang.Object r11 = r9.f5654n
            r6 = r11
            fg.q r6 = (fg.q) r6
            java.lang.Object r11 = r9.f5655o
            fg.l r11 = (fg.l) r11
            r8 = r7
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2.f5649i = r10
            return r2
        L4a:
            r7 = r11
            i.e r11 = new i.e
            java.lang.Object r0 = r9.f5654n
            k.h1 r0 = (k.h1) r0
            java.lang.Object r1 = r9.f5655o
            yf.i r1 = (yf.i) r1
            r11.<init>(r0, r1, r7)
            r11.f5653m = r10
            return r11
        L5b:
            r7 = r11
            i.e r11 = new i.e
            java.lang.Object r0 = r9.f5654n
            i.n0 r0 = (i.n0) r0
            java.lang.Object r1 = r9.f5655o
            yf.i r1 = (yf.i) r1
            r11.<init>(r0, r1, r7)
            r11.f5653m = r10
            return r11
        L6c:
            r7 = r11
            i.e r2 = new i.e
            java.lang.Object r11 = r9.f5652l
            r3 = r11
            sg.g r3 = (sg.g) r3
            java.lang.Object r11 = r9.f5653m
            r4 = r11
            i.c r4 = (i.c) r4
            java.lang.Object r11 = r9.f5654n
            r5 = r11
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r11 = r9.f5655o
            r6 = r11
            i0.a1 r6 = (i0.a1) r6
            r2.<init>(r3, r4, r5, r6, r7)
            r2.f5649i = r10
            return r2
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f5648h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L30;
                case 2: goto L23;
                case 3: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            i.e r2 = (i.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            i.e r2 = (i.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            i.e r2 = (i.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L30:
            wf.c r2 = r1.create(r2, r3)
            i.e r2 = (i.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L3d:
            wf.c r2 = r1.create(r2, r3)
            i.e r2 = (i.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f5648h
            switch(r0) {
                case 0: goto L2e0;
                case 1: goto L1e5;
                case 2: goto L11e;
                case 3: goto Ld2;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r14.f5649i
            r1 = r0
            qg.t r1 = (qg.t) r1
            int r0 = r14.f5650j
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            goto L1a
        L12:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r15 = 0
            goto Ld1
        L1a:
            f8.i.I0(r15)
        L1d:
            java.lang.Object r15 = r14.f5654n
            i0.a1 r15 = (i0.a1) r15
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lcf
            java.lang.Object r15 = r14.f5655o
            i0.a1 r15 = (i0.a1) r15
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lcf
            java.lang.Object r15 = r14.f5651k
            i0.a1 r15 = (i0.a1) r15
            java.lang.Object r15 = r15.getValue()
            android.media.MediaPlayer r15 = (android.media.MediaPlayer) r15
            if (r15 == 0) goto Lbf
            java.lang.Object r0 = r14.f5652l
            r3 = r0
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r0 = r14.f5653m
            r4 = r0
            i0.a1 r4 = (i0.a1) r4
            r5 = 0
            int r0 = r15.getCurrentPosition()     // Catch: java.lang.Throwable -> L61
            if (r0 >= 0) goto L5b
            r0 = r5
        L5b:
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L61
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L61
            goto L67
        L61:
            r0 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r0)
        L67:
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r0)
            boolean r0 = r6 instanceof sf.f
            if (r0 == 0) goto L7b
            r6 = r7
        L7b:
            java.lang.Number r6 = (java.lang.Number) r6
            int r0 = r6.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setValue(r0)
            int r15 = r15.getDuration()     // Catch: java.lang.Throwable -> L96
            if (r15 >= 0) goto L8f
            goto L90
        L8f:
            r5 = r15
        L90:
            java.lang.Integer r15 = new java.lang.Integer     // Catch: java.lang.Throwable -> L96
            r15.<init>(r5)     // Catch: java.lang.Throwable -> L96
            goto L9e
        L96:
            r0 = move-exception
            r15 = r0
            sf.f r0 = new sf.f
            r0.<init>(r15)
            r15 = r0
        L9e:
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            boolean r0 = r15 instanceof sf.f
            if (r0 == 0) goto Lb2
            r15 = r3
        Lb2:
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r4.setValue(r15)
        Lbf:
            r14.f5649i = r1
            r14.f5650j = r2
            r3 = 250(0xfa, double:1.235E-321)
            java.lang.Object r15 = qg.v.f(r3, r14)
            xf.a r0 = xf.a.f21579g
            if (r15 != r0) goto L1d
            r15 = r0
            goto Ld1
        Lcf:
            sf.n r15 = sf.n.f12433a
        Ld1:
            return r15
        Ld2:
            java.lang.Object r0 = r14.f5651k
            s1.x r0 = (s1.x) r0
            int r1 = r14.f5650j
            r2 = 1
            if (r1 == 0) goto Le8
            if (r1 != r2) goto Le1
            f8.i.I0(r15)
            goto L11b
        Le1:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r15 = 0
            goto L11d
        Le8:
            f8.i.I0(r15)
            java.lang.Object r15 = r14.f5649i
            r4 = r15
            qg.t r4 = (qg.t) r4
            m.t1 r5 = new m.t1
            r5.<init>(r0)
            m.t2 r3 = new m.t2
            java.lang.Object r15 = r14.f5652l
            r6 = r15
            fg.l r6 = (fg.l) r6
            java.lang.Object r15 = r14.f5653m
            r7 = r15
            fg.l r7 = (fg.l) r7
            java.lang.Object r15 = r14.f5654n
            r8 = r15
            fg.q r8 = (fg.q) r8
            java.lang.Object r15 = r14.f5655o
            r9 = r15
            fg.l r9 = (fg.l) r9
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r14.f5650j = r2
            java.lang.Object r15 = a.a.n(r0, r3, r14)
            xf.a r0 = xf.a.f21579g
            if (r15 != r0) goto L11b
            r15 = r0
            goto L11d
        L11b:
            sf.n r15 = sf.n.f12433a
        L11d:
            return r15
        L11e:
            java.lang.Object r0 = r14.f5654n
            k.h1 r0 = (k.h1) r0
            int r1 = r14.f5650j
            r2 = 2
            r3 = 1
            r4 = 0
            xf.a r5 = xf.a.f21579g
            if (r1 == 0) goto L164
            if (r1 == r3) goto L14f
            if (r1 != r2) goto L147
            java.lang.Object r0 = r14.f5649i
            r1 = r0
            k.h1 r1 = (k.h1) r1
            java.lang.Object r0 = r14.f5651k
            r2 = r0
            yg.b r2 = (yg.b) r2
            java.lang.Object r0 = r14.f5653m
            r3 = r0
            k.f1 r3 = (k.f1) r3
            f8.i.I0(r15)     // Catch: java.lang.Throwable -> L143
            goto L1b5
        L143:
            r0 = move-exception
            r15 = r0
            goto L1d1
        L147:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r5 = 0
            goto L1c8
        L14f:
            java.lang.Object r0 = r14.f5652l
            k.h1 r0 = (k.h1) r0
            java.lang.Object r1 = r14.f5649i
            fg.l r1 = (fg.l) r1
            java.lang.Object r3 = r14.f5651k
            yg.b r3 = (yg.b) r3
            java.lang.Object r6 = r14.f5653m
            k.f1 r6 = (k.f1) r6
            f8.i.I0(r15)
        L162:
            r15 = r0
            goto L1a0
        L164:
            f8.i.I0(r15)
            java.lang.Object r15 = r14.f5653m
            qg.t r15 = (qg.t) r15
            k.f1 r1 = new k.f1
            wf.g r15 = r15.n()
            qg.q r6 = qg.q.f11090h
            wf.e r15 = r15.s(r6)
            r15.getClass()
            qg.r0 r15 = (qg.r0) r15
            k.d1 r6 = k.d1.f6939g
            r1.<init>(r6, r15)
            k.h1.a(r0, r1)
            yg.b r15 = r0.f6985b
            java.lang.Object r6 = r14.f5655o
            yf.i r6 = (yf.i) r6
            r14.f5653m = r1
            r14.f5651k = r15
            r14.f5649i = r6
            r14.f5652l = r0
            r14.f5650j = r3
            java.lang.Object r3 = r15.d(r14)
            if (r3 != r5) goto L19b
            goto L1c8
        L19b:
            r3 = r6
            r6 = r1
            r1 = r3
            r3 = r15
            goto L162
        L1a0:
            r14.f5653m = r6     // Catch: java.lang.Throwable -> L1cc
            r14.f5651k = r3     // Catch: java.lang.Throwable -> L1cc
            r14.f5649i = r15     // Catch: java.lang.Throwable -> L1cc
            r14.f5652l = r4     // Catch: java.lang.Throwable -> L1cc
            r14.f5650j = r2     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r0 = r1.invoke(r14)     // Catch: java.lang.Throwable -> L1cc
            if (r0 != r5) goto L1b1
            goto L1c8
        L1b1:
            r1 = r15
            r15 = r0
            r2 = r3
            r3 = r6
        L1b5:
            java.util.concurrent.atomic.AtomicReference r0 = r1.f6984a     // Catch: java.lang.Throwable -> L1c9
        L1b7:
            boolean r1 = r0.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L1c9
            if (r1 == 0) goto L1be
            goto L1c4
        L1be:
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L1c9
            if (r1 == r3) goto L1b7
        L1c4:
            r2.f(r4)
            r5 = r15
        L1c8:
            return r5
        L1c9:
            r0 = move-exception
            r15 = r0
            goto L1e1
        L1cc:
            r0 = move-exception
            r1 = r15
            r15 = r0
            r2 = r3
            r3 = r6
        L1d1:
            java.util.concurrent.atomic.AtomicReference r0 = r1.f6984a     // Catch: java.lang.Throwable -> L1c9
        L1d3:
            boolean r1 = r0.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L1c9
            if (r1 != 0) goto L1e0
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L1c9
            if (r1 != r3) goto L1e0
            goto L1d3
        L1e0:
            throw r15     // Catch: java.lang.Throwable -> L1c9
        L1e1:
            r2.f(r4)
            throw r15
        L1e5:
            java.lang.Object r0 = r14.f5654n
            i.n0 r0 = (i.n0) r0
            int r1 = r14.f5650j
            r2 = 2
            r3 = 1
            r4 = 0
            xf.a r5 = xf.a.f21579g
            if (r1 == 0) goto L22b
            if (r1 == r3) goto L216
            if (r1 != r2) goto L20e
            java.lang.Object r0 = r14.f5649i
            r1 = r0
            i.n0 r1 = (i.n0) r1
            java.lang.Object r0 = r14.f5651k
            r2 = r0
            yg.b r2 = (yg.b) r2
            java.lang.Object r0 = r14.f5653m
            r3 = r0
            i.m0 r3 = (i.m0) r3
            f8.i.I0(r15)     // Catch: java.lang.Throwable -> L20a
            goto L2a8
        L20a:
            r0 = move-exception
            r15 = r0
            goto L2c4
        L20e:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r5 = 0
            goto L2bb
        L216:
            java.lang.Object r0 = r14.f5652l
            i.n0 r0 = (i.n0) r0
            java.lang.Object r1 = r14.f5649i
            fg.l r1 = (fg.l) r1
            java.lang.Object r3 = r14.f5651k
            yg.b r3 = (yg.b) r3
            java.lang.Object r6 = r14.f5653m
            i.m0 r6 = (i.m0) r6
            f8.i.I0(r15)
        L229:
            r15 = r0
            goto L293
        L22b:
            f8.i.I0(r15)
            java.lang.Object r15 = r14.f5653m
            qg.t r15 = (qg.t) r15
            i.m0 r1 = new i.m0
            wf.g r15 = r15.n()
            qg.q r6 = qg.q.f11090h
            wf.e r15 = r15.s(r6)
            r15.getClass()
            qg.r0 r15 = (qg.r0) r15
            r1.<init>(r15)
            java.util.concurrent.atomic.AtomicReference r6 = r0.f5734a
        L248:
            java.lang.Object r15 = r6.get()
            r7 = r15
            i.m0 r7 = (i.m0) r7
            if (r7 == 0) goto L262
            i.k0 r15 = i.k0.f5705g
            int r15 = r15.compareTo(r15)
            if (r15 < 0) goto L25a
            goto L262
        L25a:
            java.util.concurrent.CancellationException r15 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Current mutation had a higher priority"
            r15.<init>(r0)
            throw r15
        L262:
            boolean r15 = r6.compareAndSet(r7, r1)
            if (r15 == 0) goto L2d8
            if (r7 == 0) goto L277
            qg.r0 r15 = r7.f5729a
            i.l0 r6 = new i.l0
            java.lang.String r7 = "Mutation interrupted"
            r8 = 0
            r6.<init>(r7, r8)
            r15.a(r6)
        L277:
            yg.b r15 = r0.f5735b
            java.lang.Object r6 = r14.f5655o
            yf.i r6 = (yf.i) r6
            r14.f5653m = r1
            r14.f5651k = r15
            r14.f5649i = r6
            r14.f5652l = r0
            r14.f5650j = r3
            java.lang.Object r3 = r15.d(r14)
            if (r3 != r5) goto L28e
            goto L2bb
        L28e:
            r3 = r6
            r6 = r1
            r1 = r3
            r3 = r15
            goto L229
        L293:
            r14.f5653m = r6     // Catch: java.lang.Throwable -> L2bf
            r14.f5651k = r3     // Catch: java.lang.Throwable -> L2bf
            r14.f5649i = r15     // Catch: java.lang.Throwable -> L2bf
            r14.f5652l = r4     // Catch: java.lang.Throwable -> L2bf
            r14.f5650j = r2     // Catch: java.lang.Throwable -> L2bf
            java.lang.Object r0 = r1.invoke(r14)     // Catch: java.lang.Throwable -> L2bf
            if (r0 != r5) goto L2a4
            goto L2bb
        L2a4:
            r1 = r15
            r15 = r0
            r2 = r3
            r3 = r6
        L2a8:
            java.util.concurrent.atomic.AtomicReference r0 = r1.f5734a     // Catch: java.lang.Throwable -> L2bc
        L2aa:
            boolean r1 = r0.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L2bc
            if (r1 == 0) goto L2b1
            goto L2b7
        L2b1:
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L2bc
            if (r1 == r3) goto L2aa
        L2b7:
            r2.f(r4)
            r5 = r15
        L2bb:
            return r5
        L2bc:
            r0 = move-exception
            r15 = r0
            goto L2d4
        L2bf:
            r0 = move-exception
            r1 = r15
            r15 = r0
            r2 = r3
            r3 = r6
        L2c4:
            java.util.concurrent.atomic.AtomicReference r0 = r1.f5734a     // Catch: java.lang.Throwable -> L2bc
        L2c6:
            boolean r1 = r0.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L2bc
            if (r1 != 0) goto L2d3
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L2bc
            if (r1 != r3) goto L2d3
            goto L2c6
        L2d3:
            throw r15     // Catch: java.lang.Throwable -> L2bc
        L2d4:
            r2.f(r4)
            throw r15
        L2d8:
            java.lang.Object r15 = r6.get()
            if (r15 == r7) goto L262
            goto L248
        L2e0:
            java.lang.Object r0 = r14.f5652l
            sg.g r0 = (sg.g) r0
            int r1 = r14.f5650j
            r2 = 1
            if (r1 == 0) goto L2fe
            if (r1 != r2) goto L2f7
            java.lang.Object r1 = r14.f5651k
            sg.b r1 = (sg.b) r1
            java.lang.Object r3 = r14.f5649i
            qg.t r3 = (qg.t) r3
            f8.i.I0(r15)
            goto L31a
        L2f7:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r15 = 0
            goto L353
        L2fe:
            f8.i.I0(r15)
            java.lang.Object r15 = r14.f5649i
            qg.t r15 = (qg.t) r15
            sg.b r1 = r0.iterator()
            r3 = r15
        L30a:
            r14.f5649i = r3
            r14.f5651k = r1
            r14.f5650j = r2
            java.lang.Object r15 = r1.b(r14)
            xf.a r4 = xf.a.f21579g
            if (r15 != r4) goto L31a
            r15 = r4
            goto L353
        L31a:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L351
            java.lang.Object r15 = r1.c()
            java.lang.Object r4 = r0.d()
            boolean r5 = r4 instanceof sg.i
            r6 = 0
            if (r5 != 0) goto L330
            goto L331
        L330:
            r4 = r6
        L331:
            if (r4 != 0) goto L335
            r8 = r15
            goto L336
        L335:
            r8 = r4
        L336:
            ci.e r7 = new ci.e
            java.lang.Object r15 = r14.f5653m
            r9 = r15
            i.c r9 = (i.c) r9
            java.lang.Object r15 = r14.f5654n
            r10 = r15
            i0.a1 r10 = (i0.a1) r10
            java.lang.Object r15 = r14.f5655o
            r11 = r15
            i0.a1 r11 = (i0.a1) r11
            r12 = 0
            r13 = 4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r15 = 3
            qg.v.q(r3, r6, r7, r15)
            goto L30a
        L351:
            sf.n r15 = sf.n.f12433a
        L353:
            return r15
    }
}
