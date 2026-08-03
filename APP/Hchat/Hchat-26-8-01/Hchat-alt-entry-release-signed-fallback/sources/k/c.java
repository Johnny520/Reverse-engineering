package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n.k f6922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n.m f6923k;

    public /* synthetic */ c(n.k r1, n.m r2, wf.c r3, int r4) {
            r0 = this;
            r0.f6920h = r4
            r0.f6922j = r1
            r0.f6923k = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public c(n.m r2, n.k r3, wf.c r4) {
            r1 = this;
            r0 = 0
            r1.f6920h = r0
            r1.f6923k = r2
            r1.f6922j = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r4 = r3.f6920h
            switch(r4) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            k.c r4 = new k.c
            n.m r0 = r3.f6923k
            r1 = 2
            n.k r2 = r3.f6922j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L10:
            k.c r4 = new k.c
            n.m r0 = r3.f6923k
            r1 = 1
            n.k r2 = r3.f6922j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L1b:
            k.c r4 = new k.c
            n.m r0 = r3.f6923k
            n.k r1 = r3.f6922j
            r4.<init>(r0, r1, r5)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f6920h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L23;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            k.c r2 = (k.c) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            k.c r2 = (k.c) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            k.c r2 = (k.c) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f6920h
            switch(r0) {
                case 0: goto L55;
                case 1: goto L2d;
                default: goto L5;
            }
        L5:
            int r0 = r2.f6921i
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r3)
            goto L2a
        L10:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r3)
            r3 = 0
            goto L2c
        L17:
            f8.i.I0(r3)
            r2.f6921i = r1
            n.k r3 = r2.f6922j
            n.m r0 = r2.f6923k
            java.lang.Object r3 = r3.a(r0, r2)
            xf.a r0 = xf.a.f21579g
            if (r3 != r0) goto L2a
            r3 = r0
            goto L2c
        L2a:
            sf.n r3 = sf.n.f12433a
        L2c:
            return r3
        L2d:
            int r0 = r2.f6921i
            r1 = 1
            if (r0 == 0) goto L3f
            if (r0 != r1) goto L38
            f8.i.I0(r3)
            goto L52
        L38:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r3)
            r3 = 0
            goto L54
        L3f:
            f8.i.I0(r3)
            r2.f6921i = r1
            n.k r3 = r2.f6922j
            n.m r0 = r2.f6923k
            java.lang.Object r3 = r3.a(r0, r2)
            xf.a r0 = xf.a.f21579g
            if (r3 != r0) goto L52
            r3 = r0
            goto L54
        L52:
            sf.n r3 = sf.n.f12433a
        L54:
            return r3
        L55:
            int r0 = r2.f6921i
            r1 = 1
            if (r0 == 0) goto L67
            if (r0 != r1) goto L60
            f8.i.I0(r3)
            goto L7f
        L60:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r3)
            r3 = 0
            goto L81
        L67:
            f8.i.I0(r3)
            n.n r3 = new n.n
            n.m r0 = r2.f6923k
            r3.<init>(r0)
            r2.f6921i = r1
            n.k r0 = r2.f6922j
            java.lang.Object r3 = r0.a(r3, r2)
            xf.a r0 = xf.a.f21579g
            if (r3 != r0) goto L7f
            r3 = r0
            goto L81
        L7f:
            sf.n r3 = sf.n.f12433a
        L81:
            return r3
    }
}
