package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum i2 extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wb.i2 f16704h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wb.i2 f16705i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wb.i2 f16706j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final wb.i2 f16707k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ wb.i2[] f16708l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ zf.b f16709m = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f16710g;

    static {
            wb.i2 r0 = new wb.i2
            r1 = 0
            java.lang.String r2 = "公众号"
            java.lang.String r3 = "OFFICIAL"
            r0.<init>(r3, r1, r2)
            wb.i2.f16704h = r0
            wb.i2 r1 = new wb.i2
            r2 = 1
            java.lang.String r3 = "群聊"
            java.lang.String r4 = "GROUP"
            r1.<init>(r4, r2, r3)
            wb.i2.f16705i = r1
            wb.i2 r2 = new wb.i2
            r3 = 2
            java.lang.String r4 = "好友"
            java.lang.String r5 = "FRIEND"
            r2.<init>(r5, r3, r4)
            wb.i2.f16706j = r2
            wb.i2 r3 = new wb.i2
            r4 = 3
            java.lang.String r5 = "全部"
            java.lang.String r6 = "ALL"
            r3.<init>(r6, r4, r5)
            wb.i2.f16707k = r3
            wb.i2[] r0 = new wb.i2[]{r0, r1, r2, r3}
            wb.i2.f16708l = r0
            zf.b r1 = new zf.b
            r1.<init>(r0)
            wb.i2.f16709m = r1
            return
    }

    i2(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f16710g = r3
            return
    }

    public static wb.i2 valueOf(java.lang.String r1) {
            java.lang.Class<wb.i2> r0 = wb.i2.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            wb.i2 r1 = (wb.i2) r1
            return r1
    }

    public static wb.i2[] values() {
            wb.i2[] r0 = wb.i2.f16708l
            java.lang.Object r0 = r0.clone()
            wb.i2[] r0 = (wb.i2[]) r0
            return r0
    }
}
