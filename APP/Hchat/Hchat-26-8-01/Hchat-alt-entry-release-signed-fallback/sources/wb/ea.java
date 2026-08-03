package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ea implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f15878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v8.a f15879i;

    public /* synthetic */ ea(fg.l r1, v8.a r2, int r3) {
            r0 = this;
            r0.f15877g = r3
            r0.f15878h = r1
            r0.f15879i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f15877g
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L17;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            fg.l r0 = r2.f15878h
            v8.a r1 = r2.f15879i
            r0.invoke(r1)
        Lc:
            sf.n r0 = sf.n.f12433a
            return r0
        Lf:
            fg.l r0 = r2.f15878h
            v8.a r1 = r2.f15879i
            r0.invoke(r1)
            goto Lc
        L17:
            fg.l r0 = r2.f15878h
            v8.a r1 = r2.f15879i
            r0.invoke(r1)
            goto Lc
        L1f:
            fg.l r0 = r2.f15878h
            v8.a r1 = r2.f15879i
            r0.invoke(r1)
            goto Lc
    }
}
