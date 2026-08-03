package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s1 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.y1 f6043h;

    public /* synthetic */ s1(i0.y1 r1, int r2) {
            r0 = this;
            r0.f6042g = r2
            r0.f6043h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f6042g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            i0.y1 r0 = r1.f6043h
            r0.E()
        La:
            sf.n r0 = sf.n.f12433a
            return r0
        Ld:
            i0.y1 r0 = r1.f6043h
            r0.E()
            goto La
    }
}
