package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8346h;

    public /* synthetic */ r0(int r1, wf.c r2, int r3) {
            r0 = this;
            r0.f8346h = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r0 = r1.f8346h
            switch(r0) {
                case 0: goto L30;
                case 1: goto L1a;
                default: goto L5;
            }
        L5:
            m.q1 r2 = (m.q1) r2
            e1.b r3 = (e1.b) r3
            long r2 = r3.f2294a
            wf.c r4 = (wf.c) r4
            m.r0 r2 = new m.r0
            r3 = 3
            r0 = 2
            r2.<init>(r3, r4, r0)
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L1a:
            qg.t r2 = (qg.t) r2
            java.lang.Number r3 = (java.lang.Number) r3
            r3.floatValue()
            wf.c r4 = (wf.c) r4
            m.r0 r2 = new m.r0
            r3 = 3
            r0 = 1
            r2.<init>(r3, r4, r0)
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L30:
            qg.t r2 = (qg.t) r2
            e1.b r3 = (e1.b) r3
            long r2 = r3.f2294a
            wf.c r4 = (wf.c) r4
            m.r0 r2 = new m.r0
            r3 = 3
            r0 = 0
            r2.<init>(r3, r4, r0)
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f8346h
            sf.n r1 = sf.n.f12433a
            switch(r0) {
                case 0: goto Lf;
                case 1: goto Lb;
                default: goto L7;
            }
        L7:
            f8.i.I0(r3)
            return r1
        Lb:
            f8.i.I0(r3)
            return r1
        Lf:
            f8.i.I0(r3)
            return r1
    }
}
