package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4846k;

    public d0(long r2, gg.t r4, wf.c r5) {
            r1 = this;
            r0 = 0
            r1.f4842g = r0
            r1.f4843h = r2
            r1.f4846k = r4
            r1.<init>(r5)
            return
    }

    public d0(s1.t r2, wf.c r3) {
            r1 = this;
            r0 = 1
            r1.f4842g = r0
            r1.f4846k = r2
            r1.<init>(r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            int r0 = r4.f4842g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            h0.d0 r0 = new h0.d0
            java.lang.Object r1 = r4.f4846k
            s1.t r1 = (s1.t) r1
            r0.<init>(r1, r6)
            r0.f4845j = r5
            return r0
        L11:
            h0.d0 r0 = new h0.d0
            long r1 = r4.f4843h
            java.lang.Object r3 = r4.f4846k
            gg.t r3 = (gg.t) r3
            r0.<init>(r1, r3, r6)
            r0.f4845j = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f4842g
            s1.k0 r2 = (s1.k0) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            h0.d0 r2 = (h0.d0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            h0.d0 r2 = (h0.d0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f4842g
            switch(r0) {
                case 0: goto L50;
                default: goto L5;
            }
        L5:
            int r0 = r6.f4844i
            r1 = 1
            if (r0 == 0) goto L1d
            if (r0 != r1) goto L16
            long r2 = r6.f4843h
            java.lang.Object r0 = r6.f4845j
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r7)
            goto L47
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto L4f
        L1d:
            f8.i.I0(r7)
            java.lang.Object r7 = r6.f4845j
            s1.k0 r7 = (s1.k0) r7
            java.lang.Object r0 = r6.f4846k
            s1.t r0 = (s1.t) r0
            long r2 = r0.f12292b
            y1.l2 r0 = r7.B()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L36:
            r6.f4845j = r0
            r6.f4843h = r2
            r6.f4844i = r1
            r7 = 3
            java.lang.Object r7 = m.y2.b(r0, r6, r7)
            xf.a r4 = xf.a.f21579g
            if (r7 != r4) goto L47
            r7 = r4
            goto L4f
        L47:
            s1.t r7 = (s1.t) r7
            long r4 = r7.f12292b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L36
        L4f:
            return r7
        L50:
            java.lang.Object r0 = r6.f4846k
            gg.t r0 = (gg.t) r0
            int r1 = r6.f4844i
            r2 = 1
            if (r1 == 0) goto L6a
            if (r1 != r2) goto L63
            java.lang.Object r1 = r6.f4845j
            s1.k0 r1 = (s1.k0) r1
            f8.i.I0(r7)
            goto L88
        L63:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto Lba
        L6a:
            f8.i.I0(r7)
            java.lang.Object r7 = r6.f4845j
            r1 = r7
            s1.k0 r1 = (s1.k0) r1
            long r3 = r6.f4843h
            b0.t r7 = new b0.t
            r5 = 6
            r7.<init>(r0, r5)
            r6.f4845j = r1
            r6.f4844i = r2
            java.lang.Object r7 = m.j0.c(r1, r3, r7, r6)
            xf.a r2 = xf.a.f21579g
            if (r7 != r2) goto L88
            r7 = r2
            goto Lba
        L88:
            s1.t r7 = (s1.t) r7
            if (r7 == 0) goto La0
            long r2 = r0.f4563g
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r4
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto La0
            h0.j r7 = h0.j.f4914h
            goto Lba
        La0:
            s1.l0 r7 = r1.f12273l
            s1.k r7 = r7.f12283z
            java.lang.Object r7 = r7.f12262a
            java.lang.Object r7 = tf.m.t1(r7)
            s1.t r7 = (s1.t) r7
            boolean r0 = s1.s.d(r7)
            if (r0 == 0) goto Lb8
            r7.a()
            h0.j r7 = h0.j.f4913g
            goto Lba
        Lb8:
            h0.j r7 = h0.j.f4916j
        Lba:
            return r7
    }
}
