package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends yf.i implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i.c f5592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5593i;

    public b(i.c r1, java.lang.Object r2, wf.c r3) {
            r0 = this;
            r0.f5592h = r1
            r0.f5593i = r2
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(wf.c r4) {
            r3 = this;
            i.b r0 = new i.b
            i.c r1 = r3.f5592h
            java.lang.Object r2 = r3.f5593i
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            wf.c r2 = (wf.c) r2
            wf.c r2 = r1.create(r2)
            i.b r2 = (i.b) r2
            sf.n r0 = sf.n.f12433a
            r2.invokeSuspend(r0)
            return r0
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            r2 = this;
            f8.i.I0(r3)
            i.c r3 = r2.f5592h
            i.c.b(r3)
            java.lang.Object r0 = r2.f5593i
            java.lang.Object r0 = i.c.a(r3, r0)
            i.l r1 = r3.f5604c
            i0.j1 r1 = r1.f5719h
            r1.setValue(r0)
            i0.j1 r3 = r3.f5606e
            r3.setValue(r0)
            sf.n r3 = sf.n.f12433a
            return r3
    }
}
