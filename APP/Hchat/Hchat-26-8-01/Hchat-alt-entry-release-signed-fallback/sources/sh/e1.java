package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12570i;

    public e1(i0.a1 r1, i0.a1 r2, wf.c r3) {
            r0 = this;
            r0.f12569h = r1
            r0.f12570i = r2
            r1 = 3
            r0.<init>(r1, r3)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            qg.t r2 = (qg.t) r2
            java.lang.Number r3 = (java.lang.Number) r3
            r3.floatValue()
            wf.c r4 = (wf.c) r4
            sh.e1 r2 = new sh.e1
            i0.a1 r3 = r1.f12569h
            i0.a1 r0 = r1.f12570i
            r2.<init>(r3, r0, r4)
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            f8.i.I0(r2)
            i.r0 r2 = sh.f1.f12580a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            i0.a1 r0 = r1.f12569h
            r0.setValue(r2)
            i0.a1 r2 = r1.f12570i
            java.lang.Object r2 = r2.getValue()
            fg.a r2 = (fg.a) r2
            if (r2 == 0) goto L19
            r2.invoke()
        L19:
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
