package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements wf.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f5860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f5861i;

    public d(android.view.Choreographer r2, y1.n0 r3) {
            r1 = this;
            r0 = 2
            r1.f5859g = r0
            r1.<init>()
            r1.f5860h = r2
            r1.f5861i = r3
            return
    }

    public d(i0.d r2) {
            r1 = this;
            r0 = 1
            r1.f5859g = r0
            r1.<init>()
            r1.f5860h = r2
            j8.f r2 = new j8.f
            r2.<init>()
            r1.f5861i = r2
            return
    }

    public d(i0.s1 r2) {
            r1 = this;
            r0 = 0
            r1.f5859g = r0
            r1.<init>()
            r1.f5860h = r2
            be.k r2 = new be.k
            r0 = 4
            r2.<init>(r0)
            r1.f5861i = r2
            return
    }

    public final java.lang.Object d(fg.l r7, wf.c r8) {
            r6 = this;
            int r0 = r6.f5859g
            switch(r0) {
                case 0: goto Lf3;
                case 1: goto L63;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.f5861i
            y1.n0 r0 = (y1.n0) r0
            qg.g r1 = new qg.g
            wf.c r8 = fb.v0.x(r8)
            r2 = 1
            r1.<init>(r2, r8)
            r1.p()
            y1.o0 r8 = new y1.o0
            r8.<init>(r1, r6, r7)
            android.view.Choreographer r7 = r0.f22006i
            java.lang.Object r3 = r6.f5860h
            android.view.Choreographer r3 = (android.view.Choreographer) r3
            boolean r7 = gg.l.a(r7, r3)
            if (r7 == 0) goto L4d
            java.lang.Object r7 = r0.f22008k
            monitor-enter(r7)
            java.util.ArrayList r3 = r0.f22010m     // Catch: java.lang.Throwable -> L3d
            r3.add(r8)     // Catch: java.lang.Throwable -> L3d
            boolean r3 = r0.f22013p     // Catch: java.lang.Throwable -> L3d
            if (r3 != 0) goto L3f
            r0.f22013p = r2     // Catch: java.lang.Throwable -> L3d
            android.view.Choreographer r2 = r0.f22006i     // Catch: java.lang.Throwable -> L3d
            y1.m0 r3 = r0.f22014q     // Catch: java.lang.Throwable -> L3d
            r2.postFrameCallback(r3)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r8 = move-exception
            goto L4b
        L3f:
            monitor-exit(r7)
            f1.p r7 = new f1.p
            r2 = 9
            r7.<init>(r0, r2, r8)
            r1.r(r7)
            goto L5e
        L4b:
            monitor-exit(r7)
            throw r8
        L4d:
            java.lang.Object r7 = r6.f5860h
            android.view.Choreographer r7 = (android.view.Choreographer) r7
            r7.postFrameCallback(r8)
            f1.p r7 = new f1.p
            r0 = 10
            r7.<init>(r6, r0, r8)
            r1.r(r7)
        L5e:
            java.lang.Object r7 = r1.o()
            return r7
        L63:
            boolean r0 = r8 instanceof i0.k1
            if (r0 == 0) goto L76
            r0 = r8
            i0.k1 r0 = (i0.k1) r0
            int r1 = r0.f5949j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L76
            int r1 = r1 - r2
            r0.f5949j = r1
            goto L7b
        L76:
            i0.k1 r0 = new i0.k1
            r0.<init>(r6, r8)
        L7b:
            java.lang.Object r8 = r0.f5947h
            xf.a r1 = xf.a.f21579g
            int r2 = r0.f5949j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L9a
            if (r2 == r4) goto L94
            if (r2 != r3) goto L8d
            f8.i.I0(r8)
            goto Lec
        L8d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r8 = 0
            goto Lec
        L94:
            fg.l r7 = r0.f5946g
            f8.i.I0(r8)
            goto Ldc
        L9a:
            f8.i.I0(r8)
            java.lang.Object r8 = r6.f5861i
            j8.f r8 = (j8.f) r8
            r0.f5946g = r7
            r0.f5949j = r4
            java.lang.Object r2 = r8.f6781b
            monitor-enter(r2)
            boolean r5 = r8.f6780a     // Catch: java.lang.Throwable -> Lf0
            monitor-exit(r2)
            if (r5 == 0) goto Lb0
            sf.n r8 = sf.n.f12433a
            goto Ld9
        Lb0:
            qg.g r2 = new qg.g
            wf.c r5 = fb.v0.x(r0)
            r2.<init>(r4, r5)
            r2.p()
            java.lang.Object r4 = r8.f6781b
            monitor-enter(r4)
            java.lang.Object r5 = r8.f6782c     // Catch: java.lang.Throwable -> Led
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> Led
            r5.add(r2)     // Catch: java.lang.Throwable -> Led
            monitor-exit(r4)
            i0.q0 r4 = new i0.q0
            r5 = 0
            r4.<init>(r8, r5, r2)
            r2.r(r4)
            java.lang.Object r8 = r2.o()
            if (r8 != r1) goto Ld7
            goto Ld9
        Ld7:
            sf.n r8 = sf.n.f12433a
        Ld9:
            if (r8 != r1) goto Ldc
            goto Leb
        Ldc:
            java.lang.Object r8 = r6.f5860h
            i0.d r8 = (i0.d) r8
            r2 = 0
            r0.f5946g = r2
            r0.f5949j = r3
            java.lang.Object r8 = r8.d(r7, r0)
            if (r8 != r1) goto Lec
        Leb:
            r8 = r1
        Lec:
            return r8
        Led:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        Lf0:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        Lf3:
            qg.g r0 = new qg.g
            wf.c r8 = fb.v0.x(r8)
            r1 = 1
            r0.<init>(r1, r8)
            r0.p()
            java.lang.Object r8 = r6.f5861i
            be.k r8 = (be.k) r8
            i0.b r1 = new i0.b
            r1.<init>()
            r1.f5847a = r0
            r1.f5848b = r7
            java.lang.Object r7 = r6.f5860h
            i0.s1 r7 = (i0.s1) r7
            i0.f r7 = r8.d(r1, r7)
            i0.c r8 = new i0.c
            r1 = 0
            r8.<init>(r7, r1)
            r0.r(r8)
            java.lang.Object r7 = r0.o()
            return r7
    }

    @Override // wf.g
    public final wf.g e(wf.g r2) {
            r1 = this;
            int r0 = r1.f5859g
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            wf.g r2 = f8.i.q0(r1, r2)
            return r2
        La:
            wf.g r2 = f8.i.q0(r1, r2)
            return r2
        Lf:
            wf.g r2 = f8.i.q0(r1, r2)
            return r2
    }

    @Override // wf.e
    public wf.f getKey() {
            r1 = this;
            i0.e r0 = i0.e.f5866i
            return r0
    }

    @Override // wf.g
    public final java.lang.Object k(fg.p r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f5859g
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r2.invoke(r3, r1)
            return r2
        La:
            java.lang.Object r2 = r2.invoke(r3, r1)
            return r2
        Lf:
            java.lang.Object r2 = r2.invoke(r3, r1)
            return r2
    }

    @Override // wf.g
    public final wf.e s(wf.f r2) {
            r1 = this;
            int r0 = r1.f5859g
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            wf.e r2 = f8.i.w(r1, r2)
            return r2
        La:
            wf.e r2 = f8.i.w(r1, r2)
            return r2
        Lf:
            wf.e r2 = f8.i.w(r1, r2)
            return r2
    }

    @Override // wf.g
    public final wf.g t(wf.f r2) {
            r1 = this;
            int r0 = r1.f5859g
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            wf.g r2 = f8.i.l0(r1, r2)
            return r2
        La:
            wf.g r2 = f8.i.l0(r1, r2)
            return r2
        Lf:
            wf.g r2 = f8.i.l0(r1, r2)
            return r2
    }
}
