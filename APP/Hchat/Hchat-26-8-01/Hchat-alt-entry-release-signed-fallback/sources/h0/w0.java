package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends yf.i implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5015i;

    public /* synthetic */ w0(java.lang.Object r1, wf.c r2, int r3) {
            r0 = this;
            r0.f5014h = r3
            r0.f5015i = r1
            r1 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(wf.c r4) {
            r3 = this;
            int r0 = r3.f5014h
            switch(r0) {
                case 0: goto L31;
                case 1: goto L26;
                case 2: goto L1b;
                case 3: goto L10;
                default: goto L5;
            }
        L5:
            h0.w0 r0 = new h0.w0
            java.lang.Object r1 = r3.f5015i
            i.c r1 = (i.c) r1
            r2 = 4
            r0.<init>(r1, r4, r2)
            return r0
        L10:
            h0.w0 r0 = new h0.w0
            java.lang.Object r1 = r3.f5015i
            h0.d1 r1 = (h0.d1) r1
            r2 = 3
            r0.<init>(r1, r4, r2)
            return r0
        L1b:
            h0.w0 r0 = new h0.w0
            java.lang.Object r1 = r3.f5015i
            h0.d1 r1 = (h0.d1) r1
            r2 = 2
            r0.<init>(r1, r4, r2)
            return r0
        L26:
            h0.w0 r0 = new h0.w0
            java.lang.Object r1 = r3.f5015i
            h0.d1 r1 = (h0.d1) r1
            r2 = 1
            r0.<init>(r1, r4, r2)
            return r0
        L31:
            h0.w0 r0 = new h0.w0
            java.lang.Object r1 = r3.f5015i
            h0.d1 r1 = (h0.d1) r1
            r2 = 0
            r0.<init>(r1, r4, r2)
            return r0
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f5014h
            wf.c r2 = (wf.c) r2
            switch(r0) {
                case 0: goto L37;
                case 1: goto L2b;
                case 2: goto L1f;
                case 3: goto L13;
                default: goto L7;
            }
        L7:
            wf.c r2 = r1.create(r2)
            h0.w0 r2 = (h0.w0) r2
            sf.n r0 = sf.n.f12433a
            r2.invokeSuspend(r0)
            return r0
        L13:
            wf.c r2 = r1.create(r2)
            h0.w0 r2 = (h0.w0) r2
            sf.n r0 = sf.n.f12433a
            r2.invokeSuspend(r0)
            return r0
        L1f:
            wf.c r2 = r1.create(r2)
            h0.w0 r2 = (h0.w0) r2
            sf.n r0 = sf.n.f12433a
            r2.invokeSuspend(r0)
            return r0
        L2b:
            wf.c r2 = r1.create(r2)
            h0.w0 r2 = (h0.w0) r2
            sf.n r0 = sf.n.f12433a
            r2.invokeSuspend(r0)
            return r0
        L37:
            wf.c r2 = r1.create(r2)
            h0.w0 r2 = (h0.w0) r2
            sf.n r0 = sf.n.f12433a
            r2.invokeSuspend(r0)
            return r0
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f5014h
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L2e;
                case 2: goto L1f;
                case 3: goto L12;
                default: goto L5;
            }
        L5:
            f8.i.I0(r2)
            java.lang.Object r2 = r1.f5015i
            i.c r2 = (i.c) r2
            i.c.b(r2)
            sf.n r2 = sf.n.f12433a
            return r2
        L12:
            f8.i.I0(r2)
            java.lang.Object r2 = r1.f5015i
            h0.d1 r2 = (h0.d1) r2
            r2.p()
            sf.n r2 = sf.n.f12433a
            return r2
        L1f:
            f8.i.I0(r2)
            java.lang.Object r2 = r1.f5015i
            h0.d1 r2 = (h0.d1) r2
            boolean r0 = r2.A
            r2.d(r0)
            sf.n r2 = sf.n.f12433a
            return r2
        L2e:
            f8.i.I0(r2)
            java.lang.Object r2 = r1.f5015i
            h0.d1 r2 = (h0.d1) r2
            r2.f()
            sf.n r2 = sf.n.f12433a
            return r2
        L3b:
            f8.i.I0(r2)
            java.lang.Object r2 = r1.f5015i
            h0.d1 r2 = (h0.d1) r2
            r0 = 0
            r2.A = r0
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
