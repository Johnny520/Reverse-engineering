package b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b.f f322h;

    public /* synthetic */ a(b.f r1, int r2) {
            r0 = this;
            r0.f321g = r2
            r0.f322h = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f321g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            b.f r0 = r1.f322h
            r0.a()
            sf.n r0 = sf.n.f12433a
            return r0
        Ld:
            b.f r0 = r1.f322h
            r0.d()
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
