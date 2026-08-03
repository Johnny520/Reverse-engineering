package e2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends gg.m implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e2.b f2316h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e2.b f2317i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e2.b f2318j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2319g;

    static {
            e2.b r0 = new e2.b
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            e2.b.f2316h = r0
            e2.b r0 = new e2.b
            r2 = 1
            r0.<init>(r1, r2)
            e2.b.f2317i = r0
            e2.b r0 = new e2.b
            r2 = 2
            r0.<init>(r1, r2)
            e2.b.f2318j = r0
            return
    }

    public /* synthetic */ b(int r1, int r2) {
            r0 = this;
            r0.f2319g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2319g
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            e2.i r2 = (e2.i) r2
            u2.k r2 = r2.f2337c
            int r2 = r2.a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L12:
            e2.i r2 = (e2.i) r2
            int r2 = r2.f2336b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L1b:
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
