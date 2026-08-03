package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f17588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17589i;

    public /* synthetic */ m1(fg.a r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f17587g = r3
            r0.f17588h = r1
            r0.f17589i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f17587g
            switch(r0) {
                case 0: goto L21;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r2.f17589i
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            fg.a r0 = r2.f17588h
            r0.invoke()
        L11:
            sf.n r0 = sf.n.f12433a
            return r0
        L14:
            i0.a1 r0 = r2.f17589i
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            fg.a r0 = r2.f17588h
            r0.invoke()
            goto L11
        L21:
            i0.a1 r0 = r2.f17589i
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            fg.a r0 = r2.f17588h
            r0.invoke()
            goto L11
    }
}
