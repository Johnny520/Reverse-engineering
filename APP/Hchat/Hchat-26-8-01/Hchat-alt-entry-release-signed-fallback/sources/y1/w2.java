package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y1.x2 f22148j;

    public /* synthetic */ w2(y1.x2 r1, wf.c r2, int r3) {
            r0 = this;
            r0.f22146h = r3
            r0.f22148j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f22146h
            switch(r3) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            y1.w2 r3 = new y1.w2
            y1.x2 r0 = r2.f22148j
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        Le:
            y1.w2 r3 = new y1.w2
            y1.x2 r0 = r2.f22148j
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f22146h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            y1.w2 r2 = (y1.w2) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            y1.w2 r2 = (y1.w2) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f22146h
            switch(r0) {
                case 0: goto L32;
                default: goto L5;
            }
        L5:
            int r0 = r3.f22147i
            sf.n r1 = sf.n.f12433a
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 != r2) goto L12
            f8.i.I0(r4)
            goto L31
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r1 = 0
            goto L31
        L19:
            f8.i.I0(r4)
            y1.x2 r4 = r3.f22148j
            y1.t r4 = r4.f22156g
            r3.f22147i = r2
            a1.i r4 = r4.G
            java.lang.Object r4 = r4.e(r3)
            xf.a r0 = xf.a.f21579g
            if (r4 != r0) goto L2d
            goto L2e
        L2d:
            r4 = r1
        L2e:
            if (r4 != r0) goto L31
            r1 = r0
        L31:
            return r1
        L32:
            int r0 = r3.f22147i
            sf.n r1 = sf.n.f12433a
            r2 = 1
            if (r0 == 0) goto L46
            if (r0 != r2) goto L3f
            f8.i.I0(r4)
            goto L5e
        L3f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r1 = 0
            goto L5e
        L46:
            f8.i.I0(r4)
            y1.x2 r4 = r3.f22148j
            y1.t r4 = r4.f22156g
            r3.f22147i = r2
            y1.z r4 = r4.F
            java.lang.Object r4 = r4.e(r3)
            xf.a r0 = xf.a.f21579g
            if (r4 != r0) goto L5a
            goto L5b
        L5a:
            r4 = r1
        L5b:
            if (r4 != r0) goto L5e
            r1 = r0
        L5e:
            return r1
    }
}
