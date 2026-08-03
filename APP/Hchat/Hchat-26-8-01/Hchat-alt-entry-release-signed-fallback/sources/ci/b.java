package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ci.h0 f1668i;

    public /* synthetic */ b(ci.h0 r1, wf.c r2, int r3) {
            r0 = this;
            r0.f1667h = r3
            r0.f1668i = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f1667h
            switch(r3) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            ci.b r3 = new ci.b
            ci.h0 r0 = r2.f1668i
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        Le:
            ci.b r3 = new ci.b
            ci.h0 r0 = r2.f1668i
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f1667h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L15;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            ci.b r2 = (ci.b) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L15:
            wf.c r2 = r1.create(r2, r3)
            ci.b r2 = (ci.b) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f1667h
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            f8.i.I0(r2)
            r2 = 1
            ci.h0 r0 = r1.f1668i
            r0.f1724h = r2
            yg.b r2 = r0.f1726j
            boolean r0 = r2.c()
            if (r0 == 0) goto L19
            r0 = 0
            r2.f(r0)
        L19:
            sf.n r2 = sf.n.f12433a
            return r2
        L1c:
            f8.i.I0(r2)
            r2 = 1
            ci.h0 r0 = r1.f1668i
            r0.f1725i = r2
            yg.b r2 = r0.f1726j
            boolean r0 = r2.c()
            if (r0 == 0) goto L30
            r0 = 0
            r2.f(r0)
        L30:
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
