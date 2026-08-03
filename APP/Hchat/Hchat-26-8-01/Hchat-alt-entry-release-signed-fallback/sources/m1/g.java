package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends gg.m implements fg.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m1.g f8574h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m1.g f8575i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8576g;

    static {
            m1.g r0 = new m1.g
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            m1.g.f8574h = r0
            m1.g r0 = new m1.g
            r2 = 1
            r0.<init>(r1, r2)
            m1.g.f8575i = r0
            return
    }

    public /* synthetic */ g(int r1, int r2) {
            r0 = this;
            r0.f8576g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f8576g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            sf.n r0 = sf.n.f12433a
            return r0
        L8:
            f1.k r0 = new f1.k
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            r1.<init>()
            r0.<init>(r1)
            return r0
    }
}
