package n;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n.k f8907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f8908k;

    public /* synthetic */ e(n.k r1, i0.a1 r2, wf.c r3, int r4) {
            r0 = this;
            r0.f8905h = r4
            r0.f8907j = r1
            r0.f8908k = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r4 = r3.f8905h
            switch(r4) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            n.e r4 = new n.e
            i0.a1 r0 = r3.f8908k
            r1 = 2
            n.k r2 = r3.f8907j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L10:
            n.e r4 = new n.e
            i0.a1 r0 = r3.f8908k
            r1 = 1
            n.k r2 = r3.f8907j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L1b:
            n.e r4 = new n.e
            i0.a1 r0 = r3.f8908k
            r1 = 0
            n.k r2 = r3.f8907j
            r4.<init>(r2, r0, r5, r1)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f8905h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L23;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            n.e r2 = (n.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            n.e r2 = (n.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            n.e r2 = (n.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f8905h
            switch(r0) {
                case 0: goto L6b;
                case 1: goto L38;
                default: goto L5;
            }
        L5:
            int r0 = r5.f8906i
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L12
            f8.i.I0(r6)
            sf.n r6 = sf.n.f12433a
            goto L37
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            goto L37
        L19:
            f8.i.I0(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            n.k r0 = r5.f8907j
            tg.r r0 = r0.f8911a
            n.d r2 = new n.d
            i0.a1 r3 = r5.f8908k
            r4 = 2
            r2.<init>(r6, r3, r4)
            r5.f8906i = r1
            r0.getClass()
            tg.r.j(r0, r2, r5)
            xf.a r6 = xf.a.f21579g
        L37:
            return r6
        L38:
            int r0 = r5.f8906i
            r1 = 1
            if (r0 == 0) goto L4c
            if (r0 != r1) goto L45
            f8.i.I0(r6)
            sf.n r6 = sf.n.f12433a
            goto L6a
        L45:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            goto L6a
        L4c:
            f8.i.I0(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            n.k r0 = r5.f8907j
            tg.r r0 = r0.f8911a
            n.d r2 = new n.d
            i0.a1 r3 = r5.f8908k
            r4 = 1
            r2.<init>(r6, r3, r4)
            r5.f8906i = r1
            r0.getClass()
            tg.r.j(r0, r2, r5)
            xf.a r6 = xf.a.f21579g
        L6a:
            return r6
        L6b:
            int r0 = r5.f8906i
            r1 = 1
            if (r0 == 0) goto L7f
            if (r0 != r1) goto L78
            f8.i.I0(r6)
            sf.n r6 = sf.n.f12433a
            goto L9d
        L78:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            goto L9d
        L7f:
            f8.i.I0(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            n.k r0 = r5.f8907j
            tg.r r0 = r0.f8911a
            n.d r2 = new n.d
            i0.a1 r3 = r5.f8908k
            r4 = 0
            r2.<init>(r6, r3, r4)
            r5.f8906i = r1
            r0.getClass()
            tg.r.j(r0, r2, r5)
            xf.a r6 = xf.a.f21579g
        L9d:
            return r6
    }
}
