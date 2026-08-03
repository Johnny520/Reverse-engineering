package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gg.u f8295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gg.u f8296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m.p0 f8299m;

    public o0(gg.u r2, m.p0 r3, wf.c r4) {
            r1 = this;
            r0 = 0
            r1.f8294h = r0
            r1.f8296j = r2
            r1.f8299m = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public o0(m.p0 r2, wf.c r3) {
            r1 = this;
            r0 = 1
            r1.f8294h = r0
            r1.f8299m = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f8294h
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            m.o0 r0 = new m.o0
            m.p0 r1 = r3.f8299m
            r0.<init>(r1, r5)
            r0.f8298l = r4
            return r0
        Lf:
            m.o0 r0 = new m.o0
            gg.u r1 = r3.f8296j
            m.p0 r2 = r3.f8299m
            r0.<init>(r1, r2, r5)
            r0.f8298l = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f8294h
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            m.o0 r2 = (m.o0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            fg.l r2 = (fg.l) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            m.o0 r2 = (m.o0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f8294h
            switch(r0) {
                case 0: goto Leb;
                default: goto L5;
            }
        L5:
            int r0 = r6.f8297k
            r1 = 0
            m.p0 r2 = r6.f8299m
            xf.a r3 = xf.a.f21579g
            switch(r0) {
                case 0: goto L53;
                case 1: goto L47;
                case 2: goto L3d;
                case 3: goto L2e;
                case 4: goto L27;
                case 5: goto L1f;
                case 6: goto L17;
                default: goto Lf;
            }
        Lf:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r3 = 0
            goto Lea
        L17:
            java.lang.Object r0 = r6.f8298l
            qg.t r0 = (qg.t) r0
            f8.i.I0(r7)
            goto L2c
        L1f:
            java.lang.Object r0 = r6.f8298l
            qg.t r0 = (qg.t) r0
        L23:
            f8.i.I0(r7)     // Catch: java.util.concurrent.CancellationException -> Lda
            goto L2c
        L27:
            java.lang.Object r0 = r6.f8298l
            qg.t r0 = (qg.t) r0
            goto L23
        L2c:
            r5 = r0
            goto L5b
        L2e:
            gg.u r0 = r6.f8295i
            java.lang.Object r4 = r6.f8298l
            qg.t r4 = (qg.t) r4
            f8.i.I0(r7)     // Catch: java.util.concurrent.CancellationException -> L3a
        L37:
            r5 = r4
            goto Lb0
        L3a:
            r0 = r4
            goto Lda
        L3d:
            gg.u r0 = r6.f8295i
            java.lang.Object r4 = r6.f8298l
            qg.t r4 = (qg.t) r4
            f8.i.I0(r7)
            goto L9d
        L47:
            gg.u r0 = r6.f8296j
            gg.u r4 = r6.f8295i
            java.lang.Object r5 = r6.f8298l
            qg.t r5 = (qg.t) r5
            f8.i.I0(r7)
            goto L7c
        L53:
            f8.i.I0(r7)
            java.lang.Object r7 = r6.f8298l
            qg.t r7 = (qg.t) r7
            r5 = r7
        L5b:
            boolean r7 = qg.v.o(r5)
            if (r7 == 0) goto Le8
            gg.u r0 = new gg.u
            r0.<init>()
            sg.c r7 = r2.B
            if (r7 == 0) goto L7f
            r6.f8298l = r5
            r6.f8295i = r0
            r6.f8296j = r0
            r4 = 1
            r6.f8297k = r4
            java.lang.Object r7 = r7.f(r6)
            if (r7 != r3) goto L7b
            goto Lea
        L7b:
            r4 = r0
        L7c:
            m.b0 r7 = (m.b0) r7
            goto L81
        L7f:
            r4 = r0
            r7 = r1
        L81:
            r0.f4564g = r7
            java.lang.Object r7 = r4.f4564g
            boolean r0 = r7 instanceof m.z
            if (r0 == 0) goto L5b
            m.z r7 = (m.z) r7
            r6.f8298l = r5
            r6.f8295i = r4
            r6.f8296j = r1
            r0 = 2
            r6.f8297k = r0
            java.lang.Object r7 = m.p0.o1(r2, r7, r6)
            if (r7 != r3) goto L9b
            goto Lea
        L9b:
            r0 = r4
            r4 = r5
        L9d:
            m.o0 r7 = new m.o0     // Catch: java.util.concurrent.CancellationException -> L3a
            r7.<init>(r0, r2, r1)     // Catch: java.util.concurrent.CancellationException -> L3a
            r6.f8298l = r4     // Catch: java.util.concurrent.CancellationException -> L3a
            r6.f8295i = r0     // Catch: java.util.concurrent.CancellationException -> L3a
            r5 = 3
            r6.f8297k = r5     // Catch: java.util.concurrent.CancellationException -> L3a
            java.lang.Object r7 = r2.r1(r7, r6)     // Catch: java.util.concurrent.CancellationException -> L3a
            if (r7 != r3) goto L37
            goto Lea
        Lb0:
            java.lang.Object r7 = r0.f4564g     // Catch: java.util.concurrent.CancellationException -> Lc6
            boolean r0 = r7 instanceof m.a0     // Catch: java.util.concurrent.CancellationException -> Lc6
            if (r0 == 0) goto Lc8
            m.a0 r7 = (m.a0) r7     // Catch: java.util.concurrent.CancellationException -> Lc6
            r6.f8298l = r5     // Catch: java.util.concurrent.CancellationException -> Lc6
            r6.f8295i = r1     // Catch: java.util.concurrent.CancellationException -> Lc6
            r0 = 4
            r6.f8297k = r0     // Catch: java.util.concurrent.CancellationException -> Lc6
            java.lang.Object r7 = m.p0.p1(r2, r7, r6)     // Catch: java.util.concurrent.CancellationException -> Lc6
            if (r7 != r3) goto L5b
            goto Lea
        Lc6:
            r0 = r5
            goto Lda
        Lc8:
            boolean r7 = r7 instanceof m.x     // Catch: java.util.concurrent.CancellationException -> Lc6
            if (r7 == 0) goto L5b
            r6.f8298l = r5     // Catch: java.util.concurrent.CancellationException -> Lc6
            r6.f8295i = r1     // Catch: java.util.concurrent.CancellationException -> Lc6
            r7 = 5
            r6.f8297k = r7     // Catch: java.util.concurrent.CancellationException -> Lc6
            java.lang.Object r7 = m.p0.n1(r2, r6)     // Catch: java.util.concurrent.CancellationException -> Lc6
            if (r7 != r3) goto L5b
            goto Lea
        Lda:
            r6.f8298l = r0
            r6.f8295i = r1
            r7 = 6
            r6.f8297k = r7
            java.lang.Object r7 = m.p0.n1(r2, r6)
            if (r7 != r3) goto L2c
            goto Lea
        Le8:
            sf.n r3 = sf.n.f12433a
        Lea:
            return r3
        Leb:
            gg.u r0 = r6.f8296j
            int r1 = r6.f8297k
            r2 = 1
            if (r1 == 0) goto L105
            if (r1 != r2) goto Lfe
            gg.u r1 = r6.f8295i
            java.lang.Object r3 = r6.f8298l
            fg.l r3 = (fg.l) r3
            f8.i.I0(r7)
            goto L13c
        Lfe:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto L146
        L105:
            f8.i.I0(r7)
            java.lang.Object r7 = r6.f8298l
            fg.l r7 = (fg.l) r7
            r3 = r7
        L10d:
            java.lang.Object r7 = r0.f4564g
            boolean r1 = r7 instanceof m.a0
            if (r1 != 0) goto L144
            boolean r1 = r7 instanceof m.x
            if (r1 != 0) goto L144
            boolean r1 = r7 instanceof m.y
            r4 = 0
            if (r1 == 0) goto L11f
            m.y r7 = (m.y) r7
            goto L120
        L11f:
            r7 = r4
        L120:
            if (r7 == 0) goto L125
            r3.invoke(r7)
        L125:
            m.p0 r7 = r6.f8299m
            sg.c r7 = r7.B
            if (r7 == 0) goto L140
            r6.f8298l = r3
            r6.f8295i = r0
            r6.f8297k = r2
            java.lang.Object r7 = r7.f(r6)
            xf.a r1 = xf.a.f21579g
            if (r7 != r1) goto L13b
            r7 = r1
            goto L146
        L13b:
            r1 = r0
        L13c:
            r4 = r7
            m.b0 r4 = (m.b0) r4
            goto L141
        L140:
            r1 = r0
        L141:
            r1.f4564g = r4
            goto L10d
        L144:
            sf.n r7 = sf.n.f12433a
        L146:
            return r7
    }
}
