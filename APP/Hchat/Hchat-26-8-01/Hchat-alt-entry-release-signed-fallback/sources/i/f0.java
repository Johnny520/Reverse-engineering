package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ float f5659h;

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            i.f0 r0 = new i.f0
            r1 = 2
            r0.<init>(r1, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0.f5659h = r3
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            wf.c r2 = (wf.c) r2
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            wf.c r1 = r0.create(r1, r2)
            i.f0 r1 = (i.f0) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            f8.i.I0(r2)
            float r2 = r1.f5659h
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}
