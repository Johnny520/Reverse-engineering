package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum d0 extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a2.a f5186h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ha.d0 f5187i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ha.d0 f5188j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ha.d0 f5189k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ha.d0 f5190l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ha.d0[] f5191m = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f5192g;

    static {
            ha.d0 r0 = new ha.d0
            r1 = 0
            java.lang.String r2 = "文字"
            java.lang.String r3 = "TEXT"
            r0.<init>(r3, r1, r2)
            ha.d0.f5187i = r0
            ha.d0 r1 = new ha.d0
            r2 = 1
            java.lang.String r3 = "图片/图文"
            java.lang.String r4 = "IMAGE"
            r1.<init>(r4, r2, r3)
            ha.d0.f5188j = r1
            ha.d0 r2 = new ha.d0
            r3 = 2
            java.lang.String r4 = "视频/视文"
            java.lang.String r5 = "VIDEO"
            r2.<init>(r5, r3, r4)
            ha.d0.f5189k = r2
            ha.d0 r3 = new ha.d0
            r4 = 3
            java.lang.String r5 = "未知"
            java.lang.String r6 = "UNKNOWN"
            r3.<init>(r6, r4, r5)
            ha.d0.f5190l = r3
            ha.d0[] r0 = new ha.d0[]{r0, r1, r2, r3}
            ha.d0.f5191m = r0
            a2.a r0 = new a2.a
            r1 = 17
            r0.<init>(r1)
            ha.d0.f5186h = r0
            return
    }

    d0(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f5192g = r3
            return
    }

    public static ha.d0 valueOf(java.lang.String r1) {
            java.lang.Class<ha.d0> r0 = ha.d0.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            ha.d0 r1 = (ha.d0) r1
            return r1
    }

    public static ha.d0[] values() {
            ha.d0[] r0 = ha.d0.f5191m
            java.lang.Object r0 = r0.clone()
            ha.d0[] r0 = (ha.d0[]) r0
            return r0
    }
}
