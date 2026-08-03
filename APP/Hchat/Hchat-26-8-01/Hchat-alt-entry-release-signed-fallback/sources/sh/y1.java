package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i.c f12927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i.r0 f12928k;

    public /* synthetic */ y1(i.c r1, i.r0 r2, wf.c r3, int r4) {
            r0 = this;
            r0.f12925h = r4
            r0.f12927j = r1
            r0.f12928k = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r4 = r3.f12925h
            switch(r4) {
                case 0: goto L26;
                case 1: goto L1b;
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            sh.y1 r4 = new sh.y1
            i.r0 r0 = r3.f12928k
            r1 = 3
            i.c r2 = r3.f12927j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L10:
            sh.y1 r4 = new sh.y1
            i.r0 r0 = r3.f12928k
            r1 = 2
            i.c r2 = r3.f12927j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L1b:
            sh.y1 r4 = new sh.y1
            i.r0 r0 = r3.f12928k
            r1 = 1
            i.c r2 = r3.f12927j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L26:
            sh.y1 r4 = new sh.y1
            i.r0 r0 = r3.f12928k
            r1 = 0
            i.c r2 = r3.f12927j
            r4.<init>(r2, r0, r5, r1)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f12925h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L30;
                case 1: goto L23;
                case 2: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            sh.y1 r2 = (sh.y1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            sh.y1 r2 = (sh.y1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            sh.y1 r2 = (sh.y1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L30:
            wf.c r2 = r1.create(r2, r3)
            sh.y1 r2 = (sh.y1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f12925h
            switch(r0) {
                case 0: goto La1;
                case 1: goto L6e;
                case 2: goto L3b;
                default: goto L5;
            }
        L5:
            int r0 = r6.f12926i
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            f8.i.I0(r7)
            r4 = r6
            goto L38
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            r4 = r6
            goto L3a
        L19:
            f8.i.I0(r7)
            r7 = r1
            java.lang.Float r1 = new java.lang.Float
            r0 = 1101004800(0x41a00000, float:20.0)
            r1.<init>(r0)
            r6.f12926i = r7
            i.c r0 = r6.f12927j
            i.r0 r2 = r6.f12928k
            r3 = 0
            r5 = 12
            r4 = r6
            java.lang.Object r7 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r7 != r0) goto L38
            r7 = r0
            goto L3a
        L38:
            sf.n r7 = sf.n.f12433a
        L3a:
            return r7
        L3b:
            r4 = r6
            int r0 = r4.f12926i
            r1 = 1
            if (r0 == 0) goto L4e
            if (r0 != r1) goto L47
            f8.i.I0(r7)
            goto L6b
        L47:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto L6d
        L4e:
            f8.i.I0(r7)
            r7 = r1
            java.lang.Float r1 = new java.lang.Float
            r0 = 0
            r1.<init>(r0)
            r4.f12926i = r7
            i.c r0 = r4.f12927j
            i.r0 r2 = r4.f12928k
            r3 = 0
            r5 = 12
            java.lang.Object r7 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r7 != r0) goto L6b
            r7 = r0
            goto L6d
        L6b:
            sf.n r7 = sf.n.f12433a
        L6d:
            return r7
        L6e:
            r4 = r6
            int r0 = r4.f12926i
            r1 = 1
            if (r0 == 0) goto L81
            if (r0 != r1) goto L7a
            f8.i.I0(r7)
            goto L9e
        L7a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto La0
        L81:
            f8.i.I0(r7)
            r7 = r1
            java.lang.Float r1 = new java.lang.Float
            r0 = 0
            r1.<init>(r0)
            r4.f12926i = r7
            i.c r0 = r4.f12927j
            i.r0 r2 = r4.f12928k
            r3 = 0
            r5 = 12
            java.lang.Object r7 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r7 != r0) goto L9e
            r7 = r0
            goto La0
        L9e:
            sf.n r7 = sf.n.f12433a
        La0:
            return r7
        La1:
            r4 = r6
            int r0 = r4.f12926i
            r1 = 1
            if (r0 == 0) goto Lb4
            if (r0 != r1) goto Lad
            f8.i.I0(r7)
            goto Ld2
        Lad:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto Ld4
        Lb4:
            f8.i.I0(r7)
            r7 = r1
            java.lang.Float r1 = new java.lang.Float
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r0)
            r4.f12926i = r7
            i.c r0 = r4.f12927j
            i.r0 r2 = r4.f12928k
            r3 = 0
            r5 = 12
            java.lang.Object r7 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r7 != r0) goto Ld2
            r7 = r0
            goto Ld4
        Ld2:
            sf.n r7 = sf.n.f12433a
        Ld4:
            return r7
    }
}
