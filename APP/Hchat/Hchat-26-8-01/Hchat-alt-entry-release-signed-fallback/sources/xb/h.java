package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f21479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xb.i f21480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f21481j;

    public h(xb.i r1, float r2, wf.c r3) {
            r0 = this;
            r0.f21480i = r1
            r0.f21481j = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            xb.h r0 = new xb.h
            xb.i r1 = r3.f21480i
            float r2 = r3.f21481j
            r0.<init>(r1, r2, r5)
            r0.f21479h = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            xb.h r1 = (xb.h) r1
            sf.n r2 = sf.n.f12433a
            r1.invokeSuspend(r2)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = r5.f21479h
            qg.t r0 = (qg.t) r0
            f8.i.I0(r6)
            xb.a r6 = new xb.a
            float r1 = r5.f21481j
            r2 = 1
            xb.i r3 = r5.f21480i
            r4 = 0
            r6.<init>(r3, r1, r4, r2)
            r1 = 3
            qg.v.q(r0, r4, r6, r1)
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
