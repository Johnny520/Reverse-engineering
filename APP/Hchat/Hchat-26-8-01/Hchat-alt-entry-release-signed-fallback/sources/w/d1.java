package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f14437i;

    public d1(i0.a1 r1, wf.c r2, boolean r3) {
            r0 = this;
            r0.f14436h = r1
            r0.f14437i = r3
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            w.d1 r3 = new w.d1
            i0.a1 r0 = r2.f14436h
            boolean r1 = r2.f14437i
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            w.d1 r1 = (w.d1) r1
            sf.n r2 = sf.n.f12433a
            r1.invokeSuspend(r2)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            f8.i.I0(r2)
            i0.a1 r2 = r1.f14436h
            java.lang.Object r0 = r2.getValue()
            n.m r0 = (n.m) r0
            if (r0 == 0) goto L11
            r0 = 0
            r2.setValue(r0)
        L11:
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
