package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w.n1 f14517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f14518i;

    public /* synthetic */ k(w.n1 r1, fg.l r2, int r3) {
            r0 = this;
            r0.f14516g = r3
            r0.f14517h = r1
            r0.f14518i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f14516g
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            i0.a0 r4 = (i0.a0) r4
            w.n1 r4 = r3.f14517h
            w0.p r0 = r4.f14577c
            fg.l r1 = r3.f14518i
            r0.add(r1)
            ci.w r0 = new ci.w
            r2 = 8
            r0.<init>(r4, r2, r1)
            return r0
        L18:
            i2.k0 r4 = (i2.k0) r4
            w.n1 r0 = r3.f14517h
            if (r0 == 0) goto L23
            i0.j1 r0 = r0.f14575a
            r0.setValue(r4)
        L23:
            fg.l r0 = r3.f14518i
            if (r0 == 0) goto L2a
            r0.invoke(r4)
        L2a:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
