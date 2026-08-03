package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f21521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xb.o f21522j;

    public /* synthetic */ n(xb.o r1, wf.c r2, int r3) {
            r0 = this;
            r0.f21520h = r3
            r0.f21522j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f21520h
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            xb.n r0 = new xb.n
            xb.o r1 = r3.f21522j
            r2 = 2
            r0.<init>(r1, r5, r2)
            r0.f21521i = r4
            return r0
        L10:
            xb.n r0 = new xb.n
            xb.o r1 = r3.f21522j
            r2 = 1
            r0.<init>(r1, r5, r2)
            r0.f21521i = r4
            return r0
        L1b:
            xb.n r0 = new xb.n
            xb.o r1 = r3.f21522j
            r2 = 0
            r0.<init>(r1, r5, r2)
            r0.f21521i = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f21520h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L21;
                case 1: goto L15;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            xb.n r2 = (xb.n) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L15:
            wf.c r2 = r1.create(r2, r3)
            xb.n r2 = (xb.n) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L21:
            wf.c r2 = r1.create(r2, r3)
            xb.n r2 = (xb.n) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f21520h
            switch(r0) {
                case 0: goto L45;
                case 1: goto L25;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f21521i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r6)
            xb.m r6 = new xb.m
            r1 = 4
            xb.o r2 = r5.f21522j
            r3 = 0
            r6.<init>(r2, r3, r1)
            r1 = 3
            qg.v.q(r0, r3, r6, r1)
            xb.m r6 = new xb.m
            r4 = 5
            r6.<init>(r2, r3, r4)
            qg.v.q(r0, r3, r6, r1)
            sf.n r6 = sf.n.f12433a
            return r6
        L25:
            java.lang.Object r0 = r5.f21521i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r6)
            xb.m r6 = new xb.m
            r1 = 2
            xb.o r2 = r5.f21522j
            r3 = 0
            r6.<init>(r2, r3, r1)
            r1 = 3
            qg.v.q(r0, r3, r6, r1)
            xb.m r6 = new xb.m
            r4 = 3
            r6.<init>(r2, r3, r4)
            qg.v.q(r0, r3, r6, r1)
            sf.n r6 = sf.n.f12433a
            return r6
        L45:
            java.lang.Object r0 = r5.f21521i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r6)
            xb.m r6 = new xb.m
            r1 = 0
            xb.o r2 = r5.f21522j
            r3 = 0
            r6.<init>(r2, r3, r1)
            r1 = 3
            qg.v.q(r0, r3, r6, r1)
            xb.m r6 = new xb.m
            r4 = 1
            r6.<init>(r2, r3, r4)
            qg.v.q(r0, r3, r6, r1)
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
