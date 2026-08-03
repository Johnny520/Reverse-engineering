package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xb.o f21519j;

    public /* synthetic */ m(xb.o r1, wf.c r2, int r3) {
            r0 = this;
            r0.f21517h = r3
            r0.f21519j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f21517h
            switch(r3) {
                case 0: goto L32;
                case 1: goto L29;
                case 2: goto L20;
                case 3: goto L17;
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            xb.m r3 = new xb.m
            xb.o r0 = r2.f21519j
            r1 = 5
            r3.<init>(r0, r4, r1)
            return r3
        Le:
            xb.m r3 = new xb.m
            xb.o r0 = r2.f21519j
            r1 = 4
            r3.<init>(r0, r4, r1)
            return r3
        L17:
            xb.m r3 = new xb.m
            xb.o r0 = r2.f21519j
            r1 = 3
            r3.<init>(r0, r4, r1)
            return r3
        L20:
            xb.m r3 = new xb.m
            xb.o r0 = r2.f21519j
            r1 = 2
            r3.<init>(r0, r4, r1)
            return r3
        L29:
            xb.m r3 = new xb.m
            xb.o r0 = r2.f21519j
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        L32:
            xb.m r3 = new xb.m
            xb.o r0 = r2.f21519j
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f21517h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L3d;
                case 2: goto L30;
                case 3: goto L23;
                case 4: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            xb.m r2 = (xb.m) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            xb.m r2 = (xb.m) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            xb.m r2 = (xb.m) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L30:
            wf.c r2 = r1.create(r2, r3)
            xb.m r2 = (xb.m) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L3d:
            wf.c r2 = r1.create(r2, r3)
            xb.m r2 = (xb.m) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L4a:
            wf.c r2 = r1.create(r2, r3)
            xb.m r2 = (xb.m) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f21517h
            switch(r0) {
                case 0: goto L110;
                case 1: goto Le0;
                case 2: goto Laa;
                case 3: goto L74;
                case 4: goto L3e;
                default: goto L5;
            }
        L5:
            int r0 = r8.f21518i
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            f8.i.I0(r9)
            r4 = r8
            goto L3b
        L11:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            r4 = r8
            goto L3d
        L19:
            f8.i.I0(r9)
            xb.o r9 = r8.f21519j
            i.c r2 = r9.f21528f
            long r3 = r9.f21529g
            r4 = r3
            e1.b r3 = new e1.b
            r3.<init>(r4)
            i.r0 r4 = r9.f21526d
            r8.f21518i = r1
            r5 = 0
            r7 = 12
            r6 = r8
            java.lang.Object r9 = i.c.c(r2, r3, r4, r5, r6, r7)
            r4 = r6
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L3b
            r9 = r0
            goto L3d
        L3b:
            sf.n r9 = sf.n.f12433a
        L3d:
            return r9
        L3e:
            r4 = r8
            int r0 = r4.f21518i
            r1 = 1
            if (r0 == 0) goto L51
            if (r0 != r1) goto L4a
            f8.i.I0(r9)
            goto L71
        L4a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L73
        L51:
            f8.i.I0(r9)
            xb.o r9 = r4.f21519j
            i.c r0 = r9.f21527e
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            i.r0 r9 = r9.f21525c
            r4.f21518i = r2
            r3 = 0
            r5 = 12
            r2 = r9
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L71
            r9 = r0
            goto L73
        L71:
            sf.n r9 = sf.n.f12433a
        L73:
            return r9
        L74:
            r4 = r8
            int r0 = r4.f21518i
            r1 = 1
            if (r0 == 0) goto L87
            if (r0 != r1) goto L80
            f8.i.I0(r9)
            goto La7
        L80:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto La9
        L87:
            f8.i.I0(r9)
            xb.o r9 = r4.f21519j
            i.c r0 = r9.f21528f
            long r2 = r9.f21529g
            r5 = r1
            e1.b r1 = new e1.b
            r1.<init>(r2)
            i.r0 r2 = r9.f21526d
            r4.f21518i = r5
            r3 = 0
            r5 = 12
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto La7
            r9 = r0
            goto La9
        La7:
            sf.n r9 = sf.n.f12433a
        La9:
            return r9
        Laa:
            r4 = r8
            int r0 = r4.f21518i
            r1 = 1
            if (r0 == 0) goto Lbd
            if (r0 != r1) goto Lb6
            f8.i.I0(r9)
            goto Ldd
        Lb6:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto Ldf
        Lbd:
            f8.i.I0(r9)
            xb.o r9 = r4.f21519j
            i.c r0 = r9.f21527e
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            i.r0 r9 = r9.f21525c
            r4.f21518i = r2
            r3 = 0
            r5 = 12
            r2 = r9
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto Ldd
            r9 = r0
            goto Ldf
        Ldd:
            sf.n r9 = sf.n.f12433a
        Ldf:
            return r9
        Le0:
            r4 = r8
            int r0 = r4.f21518i
            r1 = 1
            if (r0 == 0) goto Lf3
            if (r0 != r1) goto Lec
            f8.i.I0(r9)
            goto L10d
        Lec:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L10f
        Lf3:
            f8.i.I0(r9)
            xb.o r9 = r4.f21519j
            i.c r0 = r9.f21528f
            long r2 = r9.f21529g
            e1.b r9 = new e1.b
            r9.<init>(r2)
            r4.f21518i = r1
            java.lang.Object r9 = r0.e(r9, r8)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L10d
            r9 = r0
            goto L10f
        L10d:
            sf.n r9 = sf.n.f12433a
        L10f:
            return r9
        L110:
            r4 = r8
            int r0 = r4.f21518i
            r1 = 1
            if (r0 == 0) goto L123
            if (r0 != r1) goto L11c
            f8.i.I0(r9)
            goto L144
        L11c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L146
        L123:
            f8.i.I0(r9)
            xb.o r9 = r4.f21519j
            i.c r0 = r9.f21527e
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3)
            i.r0 r9 = r9.f21525c
            r4.f21518i = r2
            r3 = 0
            r5 = 12
            r2 = r9
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L144
            r9 = r0
            goto L146
        L144:
            sf.n r9 = sf.n.f12433a
        L146:
            return r9
    }
}
