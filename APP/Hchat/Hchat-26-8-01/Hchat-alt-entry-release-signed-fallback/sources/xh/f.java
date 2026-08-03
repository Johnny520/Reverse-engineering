package xh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f21689h;

    public /* synthetic */ f(fg.a r1, int r2) {
            r0 = this;
            r0.f21688g = r2
            r0.f21689h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f21688g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            fg.a r0 = r1.f21689h
            r0.invoke()
        La:
            sf.n r0 = sf.n.f12433a
            return r0
        Ld:
            fg.a r0 = r1.f21689h
            r0.invoke()
            goto La
    }
}
