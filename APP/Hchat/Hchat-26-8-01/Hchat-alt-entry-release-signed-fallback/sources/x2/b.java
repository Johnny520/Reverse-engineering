package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends gg.m implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x2.b f21103h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x2.b f21104i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x2.b f21105j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x2.b f21106k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21107g;

    static {
            x2.b r0 = new x2.b
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            x2.b.f21103h = r0
            x2.b r0 = new x2.b
            r2 = 1
            r0.<init>(r1, r2)
            x2.b.f21104i = r0
            x2.b r0 = new x2.b
            r2 = 2
            r0.<init>(r1, r2)
            x2.b.f21105j = r0
            x2.b r0 = new x2.b
            r2 = 3
            r0.<init>(r1, r2)
            x2.b.f21106k = r0
            return
    }

    public /* synthetic */ b(int r1, int r2) {
            r0 = this;
            r0.f21107g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f21107g
            switch(r0) {
                case 0: goto L14;
                case 1: goto Lf;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            android.view.View r4 = (android.view.View) r4
            sf.n r4 = sf.n.f12433a
            return r4
        La:
            f2.y r4 = (f2.y) r4
            sf.n r4 = sf.n.f12433a
            return r4
        Lf:
            v1.a1 r4 = (v1.a1) r4
            sf.n r4 = sf.n.f12433a
            return r4
        L14:
            x2.h r4 = (x2.h) r4
            android.os.Handler r0 = r4.getHandler()
            x2.g r4 = r4.f21140x
            b0.c r1 = new b0.c
            r2 = 5
            r1.<init>(r4, r2)
            r0.post(r1)
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
