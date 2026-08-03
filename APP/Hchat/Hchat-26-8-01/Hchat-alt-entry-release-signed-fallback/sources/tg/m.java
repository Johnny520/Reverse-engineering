package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ int f13224h;

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            tg.m r0 = new tg.m
            r1 = 2
            r0.<init>(r1, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.f13224h = r3
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            wf.c r2 = (wf.c) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            wf.c r1 = r0.create(r1, r2)
            tg.m r1 = (tg.m) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r1) {
            r0 = this;
            f8.i.I0(r1)
            int r1 = r0.f13224h
            if (r1 <= 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }
}
