package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ba.a f545h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ba.a f546i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ba.a f547j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ba.a f548k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ba.a[] f549l = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f550g;

    static {
            ba.a r0 = new ba.a
            r1 = 0
            java.lang.String r2 = "普通消息"
            java.lang.String r3 = "GENERAL"
            r0.<init>(r3, r1, r2)
            ba.a.f545h = r0
            ba.a r1 = new ba.a
            r2 = 1
            java.lang.String r3 = "红包消息"
            java.lang.String r4 = "RED_PACKET"
            r1.<init>(r4, r2, r3)
            ba.a.f546i = r1
            ba.a r2 = new ba.a
            r3 = 2
            java.lang.String r4 = "转账消息"
            java.lang.String r5 = "TRANSFER"
            r2.<init>(r5, r3, r4)
            ba.a.f547j = r2
            ba.a r3 = new ba.a
            r4 = 3
            java.lang.String r5 = "系统消息"
            java.lang.String r6 = "SYSTEM"
            r3.<init>(r6, r4, r5)
            ba.a.f548k = r3
            ba.a[] r0 = new ba.a[]{r0, r1, r2, r3}
            ba.a.f549l = r0
            return
    }

    a(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f550g = r3
            return
    }

    public static ba.a valueOf(java.lang.String r1) {
            java.lang.Class<ba.a> r0 = ba.a.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            ba.a r1 = (ba.a) r1
            return r1
    }

    public static ba.a[] values() {
            ba.a[] r0 = ba.a.f549l
            java.lang.Object r0 = r0.clone()
            ba.a[] r0 = (ba.a[]) r0
            return r0
    }
}
