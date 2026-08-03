package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum t extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ha.t f5279h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ha.t f5280i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ha.t f5281j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ha.t f5282k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ha.t f5283l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ha.t[] f5284m = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f5285g;

    static {
            ha.t r0 = new ha.t
            r1 = 0
            java.lang.String r2 = "文字"
            java.lang.String r3 = "TEXT"
            r0.<init>(r3, r1, r2)
            ha.t.f5279h = r0
            ha.t r1 = new ha.t
            r2 = 1
            java.lang.String r3 = "图片"
            java.lang.String r4 = "IMAGE"
            r1.<init>(r4, r2, r3)
            ha.t.f5280i = r1
            ha.t r2 = new ha.t
            r3 = 2
            java.lang.String r4 = "视频"
            java.lang.String r5 = "VIDEO"
            r2.<init>(r5, r3, r4)
            ha.t.f5281j = r2
            ha.t r3 = new ha.t
            r4 = 3
            java.lang.String r5 = "实况"
            java.lang.String r6 = "LIVE_PHOTO"
            r3.<init>(r6, r4, r5)
            ha.t.f5282k = r3
            ha.t r4 = new ha.t
            r5 = 4
            java.lang.String r6 = "未知"
            java.lang.String r7 = "UNKNOWN"
            r4.<init>(r7, r5, r6)
            ha.t.f5283l = r4
            ha.t[] r0 = new ha.t[]{r0, r1, r2, r3, r4}
            ha.t.f5284m = r0
            return
    }

    t(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f5285g = r3
            return
    }

    public static ha.t valueOf(java.lang.String r1) {
            java.lang.Class<ha.t> r0 = ha.t.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            ha.t r1 = (ha.t) r1
            return r1
    }

    public static ha.t[] values() {
            ha.t[] r0 = ha.t.f5284m
            java.lang.Object r0 = r0.clone()
            ha.t[] r0 = (ha.t[]) r0
            return r0
    }
}
