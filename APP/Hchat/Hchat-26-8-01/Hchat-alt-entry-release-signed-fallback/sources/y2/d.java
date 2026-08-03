package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends gg.m implements fg.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y2.d f22207h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y2.d f22208i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y2.d f22209j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y2.d f22210k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22211g;

    static {
            y2.d r0 = new y2.d
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            y2.d.f22207h = r0
            y2.d r0 = new y2.d
            r2 = 1
            r0.<init>(r1, r2)
            y2.d.f22208i = r0
            y2.d r0 = new y2.d
            r2 = 2
            r0.<init>(r1, r2)
            y2.d.f22209j = r0
            y2.d r0 = new y2.d
            r2 = 3
            r0.<init>(r1, r2)
            y2.d.f22210k = r0
            return
    }

    public /* synthetic */ d(int r1, int r2) {
            r0 = this;
            r0.f22211g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f22211g
            switch(r0) {
                case 0: goto L10;
                case 1: goto Ld;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            return r0
        La:
            java.lang.String r0 = "DEFAULT_TEST_TAG"
            return r0
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L10:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            return r0
    }
}
