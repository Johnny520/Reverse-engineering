package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k.g f6944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n.m f6945k;

    public /* synthetic */ e(k.g r1, n.m r2, wf.c r3, int r4) {
            r0 = this;
            r0.f6942h = r4
            r0.f6944j = r1
            r0.f6945k = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r4 = r3.f6942h
            switch(r4) {
                case 0: goto L26;
                case 1: goto L1b;
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            k.e r4 = new k.e
            n.m r0 = r3.f6945k
            r1 = 3
            k.g r2 = r3.f6944j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L10:
            k.e r4 = new k.e
            n.m r0 = r3.f6945k
            r1 = 2
            k.g r2 = r3.f6944j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L1b:
            k.e r4 = new k.e
            n.m r0 = r3.f6945k
            r1 = 1
            k.g r2 = r3.f6944j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L26:
            k.e r4 = new k.e
            n.m r0 = r3.f6945k
            r1 = 0
            k.g r2 = r3.f6944j
            r4.<init>(r2, r0, r5, r1)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f6942h
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
            k.e r2 = (k.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            k.e r2 = (k.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            k.e r2 = (k.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L30:
            wf.c r2 = r1.create(r2, r3)
            k.e r2 = (k.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f6942h
            switch(r0) {
                case 0: goto L93;
                case 1: goto L62;
                case 2: goto L36;
                default: goto L5;
            }
        L5:
            int r0 = r3.f6943i
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r4)
            goto L33
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            goto L35
        L17:
            f8.i.I0(r4)
            k.g r4 = r3.f6944j
            n.k r4 = r4.f6954w
            if (r4 == 0) goto L33
            n.n r0 = new n.n
            n.m r2 = r3.f6945k
            r0.<init>(r2)
            r3.f6943i = r1
            java.lang.Object r4 = r4.a(r0, r3)
            xf.a r0 = xf.a.f21579g
            if (r4 != r0) goto L33
            r4 = r0
            goto L35
        L33:
            sf.n r4 = sf.n.f12433a
        L35:
            return r4
        L36:
            int r0 = r3.f6943i
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 != r1) goto L41
            f8.i.I0(r4)
            goto L5f
        L41:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            goto L61
        L48:
            f8.i.I0(r4)
            k.g r4 = r3.f6944j
            n.k r4 = r4.f6954w
            if (r4 == 0) goto L5f
            r3.f6943i = r1
            n.m r0 = r3.f6945k
            java.lang.Object r4 = r4.a(r0, r3)
            xf.a r0 = xf.a.f21579g
            if (r4 != r0) goto L5f
            r4 = r0
            goto L61
        L5f:
            sf.n r4 = sf.n.f12433a
        L61:
            return r4
        L62:
            int r0 = r3.f6943i
            r1 = 1
            if (r0 == 0) goto L74
            if (r0 != r1) goto L6d
            f8.i.I0(r4)
            goto L90
        L6d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            goto L92
        L74:
            f8.i.I0(r4)
            k.g r4 = r3.f6944j
            n.k r4 = r4.f6954w
            if (r4 == 0) goto L90
            n.l r0 = new n.l
            n.m r2 = r3.f6945k
            r0.<init>(r2)
            r3.f6943i = r1
            java.lang.Object r4 = r4.a(r0, r3)
            xf.a r0 = xf.a.f21579g
            if (r4 != r0) goto L90
            r4 = r0
            goto L92
        L90:
            sf.n r4 = sf.n.f12433a
        L92:
            return r4
        L93:
            int r0 = r3.f6943i
            r1 = 1
            if (r0 == 0) goto La5
            if (r0 != r1) goto L9e
            f8.i.I0(r4)
            goto Lc1
        L9e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            goto Lc3
        La5:
            f8.i.I0(r4)
            k.g r4 = r3.f6944j
            n.k r4 = r4.f6954w
            if (r4 == 0) goto Lc1
            n.l r0 = new n.l
            n.m r2 = r3.f6945k
            r0.<init>(r2)
            r3.f6943i = r1
            java.lang.Object r4 = r4.a(r0, r3)
            xf.a r0 = xf.a.f21579g
            if (r4 != r0) goto Lc1
            r4 = r0
            goto Lc3
        Lc1:
            sf.n r4 = sf.n.f12433a
        Lc3:
            return r4
    }
}
