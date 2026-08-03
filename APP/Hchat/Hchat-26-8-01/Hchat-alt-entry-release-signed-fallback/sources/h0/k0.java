package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f4927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4928k;

    public /* synthetic */ k0(long r1, java.lang.Object r3, wf.c r4, int r5) {
            r0 = this;
            r0.f4925h = r5
            r0.f4927j = r1
            r0.f4928k = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public /* synthetic */ k0(java.lang.Object r1, long r2, wf.c r4, int r5) {
            r0 = this;
            r0.f4925h = r5
            r0.f4928k = r1
            r0.f4927j = r2
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r8, wf.c r9) {
            r7 = this;
            int r8 = r7.f4925h
            switch(r8) {
                case 0: goto L32;
                case 1: goto L23;
                case 2: goto L14;
                default: goto L5;
            }
        L5:
            h0.k0 r0 = new h0.k0
            java.lang.Object r8 = r7.f4928k
            r1 = r8
            x2.h r1 = (x2.h) r1
            long r2 = r7.f4927j
            r5 = 3
            r4 = r9
            r0.<init>(r1, r2, r4, r5)
            return r0
        L14:
            r5 = r9
            h0.k0 r1 = new h0.k0
            java.lang.Object r8 = r7.f4928k
            r4 = r8
            i0.a1 r4 = (i0.a1) r4
            r6 = 2
            long r2 = r7.f4927j
            r1.<init>(r2, r4, r5, r6)
            return r1
        L23:
            r5 = r9
            h0.k0 r1 = new h0.k0
            java.lang.Object r8 = r7.f4928k
            r4 = r8
            s1.k0 r4 = (s1.k0) r4
            r6 = 1
            long r2 = r7.f4927j
            r1.<init>(r2, r4, r5, r6)
            return r1
        L32:
            r5 = r9
            h0.k0 r1 = new h0.k0
            java.lang.Object r8 = r7.f4928k
            r2 = r8
            i.c r2 = (i.c) r2
            long r3 = r7.f4927j
            r6 = 0
            r1.<init>(r2, r3, r5, r6)
            return r1
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f4925h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L31;
                case 1: goto L24;
                case 2: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            h0.k0 r2 = (h0.k0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            h0.k0 r2 = (h0.k0) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            xf.a r2 = xf.a.f21579g
            return r2
        L24:
            wf.c r2 = r1.create(r2, r3)
            h0.k0 r2 = (h0.k0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L31:
            wf.c r2 = r1.create(r2, r3)
            h0.k0 r2 = (h0.k0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f4925h
            switch(r0) {
                case 0: goto Lb9;
                case 1: goto L6b;
                case 2: goto L31;
                default: goto L5;
            }
        L5:
            int r0 = r10.f4926i
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r11)
            goto L2e
        L10:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            goto L30
        L17:
            f8.i.I0(r11)
            java.lang.Object r11 = r10.f4928k
            x2.h r11 = (x2.h) r11
            r1.d r11 = r11.f21123g
            r10.f4926i = r1
            long r0 = r10.f4927j
            java.lang.Object r11 = r11.c(r0, r10)
            xf.a r0 = xf.a.f21579g
            if (r11 != r0) goto L2e
            r11 = r0
            goto L30
        L2e:
            sf.n r11 = sf.n.f12433a
        L30:
            return r11
        L31:
            int r0 = r10.f4926i
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 != r1) goto L39
            goto L40
        L39:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            goto L6a
        L40:
            f8.i.I0(r11)
        L43:
            java.lang.Object r11 = r10.f4928k
            i0.a1 r11 = (i0.a1) r11
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r10.f4927j
            long r2 = r2 - r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L55
            r2 = r4
        L55:
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r11.setValue(r0)
            r10.f4926i = r1
            java.lang.Object r11 = qg.v.f(r4, r10)
            xf.a r0 = xf.a.f21579g
            if (r11 != r0) goto L43
            r11 = r0
        L6a:
            return r11
        L6b:
            int r0 = r10.f4926i
            r1 = 8
            long r3 = r10.f4927j
            r5 = 2
            r6 = 1
            xf.a r7 = xf.a.f21579g
            if (r0 == 0) goto L8a
            if (r0 == r6) goto L86
            if (r0 != r5) goto L7f
            f8.i.I0(r11)
            goto La1
        L7f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r7 = 0
            goto Lb8
        L86:
            f8.i.I0(r11)
            goto L98
        L8a:
            f8.i.I0(r11)
            long r8 = r3 - r1
            r10.f4926i = r6
            java.lang.Object r11 = qg.v.f(r8, r10)
            if (r11 != r7) goto L98
            goto Lb8
        L98:
            r10.f4926i = r5
            java.lang.Object r11 = qg.v.f(r1, r10)
            if (r11 != r7) goto La1
            goto Lb8
        La1:
            java.lang.Object r11 = r10.f4928k
            s1.k0 r11 = (s1.k0) r11
            qg.g r11 = r11.f12270i
            if (r11 == 0) goto Lb6
            s1.m r0 = new s1.m
            r0.<init>(r3)
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r11.resumeWith(r1)
        Lb6:
            sf.n r7 = sf.n.f12433a
        Lb8:
            return r7
        Lb9:
            int r0 = r10.f4926i
            r1 = 1
            if (r0 == 0) goto Lcb
            if (r0 != r1) goto Lc4
            f8.i.I0(r11)
            goto Lec
        Lc4:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            goto Lee
        Lcb:
            f8.i.I0(r11)
            java.lang.Object r11 = r10.f4928k
            r2 = r11
            i.c r2 = (i.c) r2
            e1.b r3 = new e1.b
            long r4 = r10.f4927j
            r3.<init>(r4)
            i.r0 r4 = h0.m0.f4945d
            r10.f4926i = r1
            r5 = 0
            r7 = 12
            r6 = r10
            java.lang.Object r11 = i.c.c(r2, r3, r4, r5, r6, r7)
            xf.a r0 = xf.a.f21579g
            if (r11 != r0) goto Lec
            r11 = r0
            goto Lee
        Lec:
            sf.n r11 = sf.n.f12433a
        Lee:
            return r11
    }
}
