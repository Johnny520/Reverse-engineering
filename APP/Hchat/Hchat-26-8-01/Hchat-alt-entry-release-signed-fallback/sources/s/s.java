package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s.t f12088j;

    public /* synthetic */ s(s.t r1, wf.c r2, int r3) {
            r0 = this;
            r0.f12086h = r3
            r0.f12088j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f12086h
            switch(r3) {
                case 0: goto L29;
                case 1: goto L20;
                case 2: goto L17;
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            s.s r3 = new s.s
            s.t r0 = r2.f12088j
            r1 = 4
            r3.<init>(r0, r4, r1)
            return r3
        Le:
            s.s r3 = new s.s
            s.t r0 = r2.f12088j
            r1 = 3
            r3.<init>(r0, r4, r1)
            return r3
        L17:
            s.s r3 = new s.s
            s.t r0 = r2.f12088j
            r1 = 2
            r3.<init>(r0, r4, r1)
            return r3
        L20:
            s.s r3 = new s.s
            s.t r0 = r2.f12088j
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        L29:
            s.s r3 = new s.s
            s.t r0 = r2.f12088j
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f12086h
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
            s.s r2 = (s.s) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            s.s r2 = (s.s) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            s.s r2 = (s.s) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L30:
            wf.c r2 = r1.create(r2, r3)
            s.s r2 = (s.s) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L3d:
            wf.c r2 = r1.create(r2, r3)
            s.s r2 = (s.s) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f12086h
            sf.n r1 = sf.n.f12433a
            s.t r2 = r9.f12088j
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            xf.a r5 = xf.a.f21579g
            r6 = 1
            switch(r0) {
                case 0: goto L98;
                case 1: goto L69;
                case 2: goto L4b;
                case 3: goto L2d;
                default: goto Lf;
            }
        Lf:
            int r0 = r9.f12087i
            if (r0 == 0) goto L1e
            if (r0 != r6) goto L19
            f8.i.I0(r10)
            goto L2c
        L19:
            j8.o.A(r4)
            r1 = r3
            goto L2c
        L1e:
            f8.i.I0(r10)
            i.c r10 = r2.f12108n
            r9.f12087i = r6
            java.lang.Object r10 = r10.f(r9)
            if (r10 != r5) goto L2c
            r1 = r5
        L2c:
            return r1
        L2d:
            int r0 = r9.f12087i
            if (r0 == 0) goto L3c
            if (r0 != r6) goto L37
            f8.i.I0(r10)
            goto L4a
        L37:
            j8.o.A(r4)
            r1 = r3
            goto L4a
        L3c:
            f8.i.I0(r10)
            i.c r10 = r2.f12108n
            r9.f12087i = r6
            java.lang.Object r10 = r10.f(r9)
            if (r10 != r5) goto L4a
            r1 = r5
        L4a:
            return r1
        L4b:
            int r0 = r9.f12087i
            if (r0 == 0) goto L5a
            if (r0 != r6) goto L55
            f8.i.I0(r10)
            goto L68
        L55:
            j8.o.A(r4)
            r1 = r3
            goto L68
        L5a:
            f8.i.I0(r10)
            i.c r10 = r2.f12107m
            r9.f12087i = r6
            java.lang.Object r10 = r10.f(r9)
            if (r10 != r5) goto L68
            r1 = r5
        L68:
            return r1
        L69:
            int r0 = r9.f12087i
            r7 = 0
            if (r0 == 0) goto L7a
            if (r0 != r6) goto L75
            f8.i.I0(r10)
            goto L8e
        L75:
            j8.o.A(r4)
            r1 = r3
            goto L97
        L7a:
            f8.i.I0(r10)
            i.c r10 = r2.f12107m
            u2.j r0 = new u2.j
            r0.<init>(r7)
            r9.f12087i = r6
            java.lang.Object r10 = r10.e(r0, r9)
            if (r10 != r5) goto L8e
            r1 = r5
            goto L97
        L8e:
            int r10 = s.t.f12094r
            r2.e(r7)
            r10 = 0
            r2.d(r10)
        L97:
            return r1
        L98:
            int r0 = r9.f12087i
            if (r0 == 0) goto La7
            if (r0 != r6) goto La2
            f8.i.I0(r10)
            goto Lbc
        La2:
            j8.o.A(r4)
            r1 = r3
            goto Lbc
        La7:
            f8.i.I0(r10)
            i.c r10 = r2.f12108n
            java.lang.Float r0 = new java.lang.Float
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2)
            r9.f12087i = r6
            java.lang.Object r10 = r10.e(r0, r9)
            if (r10 != r5) goto Lbc
            r1 = r5
        Lbc:
            return r1
    }
}
