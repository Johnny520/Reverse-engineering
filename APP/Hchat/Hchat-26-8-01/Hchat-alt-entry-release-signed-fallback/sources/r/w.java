package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11270h;

    public /* synthetic */ w(int r1, wf.c r2, int r3) {
            r0 = this;
            r0.f11270h = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f11270h
            switch(r3) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            r.w r3 = new r.w
            r0 = 2
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        Ld:
            r.w r3 = new r.w
            r0 = 2
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f11270h
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            r.w r2 = (r.w) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            m.u1 r2 = (m.u1) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            r.w r2 = (r.w) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f11270h
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            f8.i.I0(r2)
            android.view.Choreographer r2 = android.view.Choreographer.getInstance()
            return r2
        Ld:
            f8.i.I0(r2)
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
