package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v1.c1 f13914h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v1.c1 f13915i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13916g;

    static {
            v1.c1 r0 = new v1.c1
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            v1.c1.f13914h = r0
            v1.c1 r0 = new v1.c1
            r2 = 1
            r0.<init>(r1, r2)
            v1.c1.f13915i = r0
            return
    }

    public /* synthetic */ c1(int r1, int r2) {
            r0 = this;
            r0.f13916g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f13916g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            v1.a1 r2 = (v1.a1) r2
            sf.n r2 = sf.n.f12433a
            return r2
        La:
            f1.d0 r2 = (f1.d0) r2
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
