package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xb.i f21463j;

    public /* synthetic */ b(xb.i r1, wf.c r2, int r3) {
            r0 = this;
            r0.f21461h = r3
            r0.f21463j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f21461h
            switch(r3) {
                case 0: goto L3b;
                case 1: goto L32;
                case 2: goto L29;
                case 3: goto L20;
                case 4: goto L17;
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            xb.b r3 = new xb.b
            xb.i r0 = r2.f21463j
            r1 = 6
            r3.<init>(r0, r4, r1)
            return r3
        Le:
            xb.b r3 = new xb.b
            xb.i r0 = r2.f21463j
            r1 = 5
            r3.<init>(r0, r4, r1)
            return r3
        L17:
            xb.b r3 = new xb.b
            xb.i r0 = r2.f21463j
            r1 = 4
            r3.<init>(r0, r4, r1)
            return r3
        L20:
            xb.b r3 = new xb.b
            xb.i r0 = r2.f21463j
            r1 = 3
            r3.<init>(r0, r4, r1)
            return r3
        L29:
            xb.b r3 = new xb.b
            xb.i r0 = r2.f21463j
            r1 = 2
            r3.<init>(r0, r4, r1)
            return r3
        L32:
            xb.b r3 = new xb.b
            xb.i r0 = r2.f21463j
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        L3b:
            xb.b r3 = new xb.b
            xb.i r0 = r2.f21463j
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f21461h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L57;
                case 1: goto L4a;
                case 2: goto L3d;
                case 3: goto L30;
                case 4: goto L23;
                case 5: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            xb.b r2 = (xb.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            xb.b r2 = (xb.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            xb.b r2 = (xb.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L30:
            wf.c r2 = r1.create(r2, r3)
            xb.b r2 = (xb.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L3d:
            wf.c r2 = r1.create(r2, r3)
            xb.b r2 = (xb.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L4a:
            wf.c r2 = r1.create(r2, r3)
            xb.b r2 = (xb.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L57:
            wf.c r2 = r1.create(r2, r3)
            xb.b r2 = (xb.b) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f21461h
            switch(r0) {
                case 0: goto L151;
                case 1: goto L11a;
                case 2: goto Le2;
                case 3: goto Laa;
                case 4: goto L74;
                case 5: goto L3d;
                default: goto L5;
            }
        L5:
            int r0 = r8.f21462i
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            f8.i.I0(r9)
            r4 = r8
            goto L3a
        L11:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            r4 = r8
            goto L3c
        L19:
            f8.i.I0(r9)
            xb.i r9 = r8.f21463j
            i.c r2 = r9.f21496o
            java.lang.Float r3 = new java.lang.Float
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r0)
            i.r0 r4 = r9.f21491j
            r8.f21462i = r1
            r5 = 0
            r7 = 12
            r6 = r8
            java.lang.Object r9 = i.c.c(r2, r3, r4, r5, r6, r7)
            r4 = r6
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L3a
            r9 = r0
            goto L3c
        L3a:
            sf.n r9 = sf.n.f12433a
        L3c:
            return r9
        L3d:
            r4 = r8
            int r0 = r4.f21462i
            r1 = 1
            if (r0 == 0) goto L50
            if (r0 != r1) goto L49
            f8.i.I0(r9)
            goto L71
        L49:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L73
        L50:
            f8.i.I0(r9)
            xb.i r9 = r4.f21463j
            i.c r0 = r9.f21495n
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3)
            i.r0 r9 = r9.f21490i
            r4.f21462i = r2
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
            int r0 = r4.f21462i
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
            xb.i r9 = r4.f21463j
            i.c r0 = r9.f21494m
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            i.r0 r9 = r9.f21489h
            r4.f21462i = r2
            r3 = 0
            r5 = 12
            r2 = r9
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
            int r0 = r4.f21462i
            r1 = 1
            if (r0 == 0) goto Lbd
            if (r0 != r1) goto Lb6
            f8.i.I0(r9)
            goto Ldf
        Lb6:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto Le1
        Lbd:
            f8.i.I0(r9)
            xb.i r9 = r4.f21463j
            i.c r0 = r9.f21496o
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            r3 = 1068648741(0x3fb24925, float:1.3928572)
            r1.<init>(r3)
            i.r0 r9 = r9.f21491j
            r4.f21462i = r2
            r3 = 0
            r5 = 12
            r2 = r9
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto Ldf
            r9 = r0
            goto Le1
        Ldf:
            sf.n r9 = sf.n.f12433a
        Le1:
            return r9
        Le2:
            r4 = r8
            int r0 = r4.f21462i
            r1 = 1
            if (r0 == 0) goto Lf5
            if (r0 != r1) goto Lee
            f8.i.I0(r9)
            goto L117
        Lee:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L119
        Lf5:
            f8.i.I0(r9)
            xb.i r9 = r4.f21463j
            i.c r0 = r9.f21495n
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            r3 = 1068648741(0x3fb24925, float:1.3928572)
            r1.<init>(r3)
            i.r0 r9 = r9.f21490i
            r4.f21462i = r2
            r3 = 0
            r5 = 12
            r2 = r9
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L117
            r9 = r0
            goto L119
        L117:
            sf.n r9 = sf.n.f12433a
        L119:
            return r9
        L11a:
            r4 = r8
            int r0 = r4.f21462i
            r1 = 1
            if (r0 == 0) goto L12d
            if (r0 != r1) goto L126
            f8.i.I0(r9)
            goto L14e
        L126:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L150
        L12d:
            f8.i.I0(r9)
            xb.i r9 = r4.f21463j
            i.c r0 = r9.f21494m
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3)
            i.r0 r9 = r9.f21489h
            r4.f21462i = r2
            r3 = 0
            r5 = 12
            r2 = r9
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L14e
            r9 = r0
            goto L150
        L14e:
            sf.n r9 = sf.n.f12433a
        L150:
            return r9
        L151:
            r4 = r8
            int r0 = r4.f21462i
            r1 = 1
            if (r0 == 0) goto L164
            if (r0 != r1) goto L15d
            f8.i.I0(r9)
            goto L184
        L15d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L186
        L164:
            f8.i.I0(r9)
            xb.i r9 = r4.f21463j
            i.c r0 = r9.f21493l
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            i.r0 r9 = r9.f21488g
            r4.f21462i = r2
            r3 = 0
            r5 = 12
            r2 = r9
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L184
            r9 = r0
            goto L186
        L184:
            sf.n r9 = sf.n.f12433a
        L186:
            return r9
    }
}
