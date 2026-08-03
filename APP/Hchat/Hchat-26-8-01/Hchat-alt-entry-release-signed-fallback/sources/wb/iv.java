package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum iv extends java.lang.Enum {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wb.iv f16932i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wb.iv f16933j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final wb.iv f16934k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final wb.iv f16935l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final wb.iv f16936m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ wb.iv[] f16937n = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f16938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f16939h;

    static {
            wb.iv r0 = new wb.iv
            java.lang.String r1 = "全部"
            java.lang.String r2 = "全部联系人"
            r3 = 0
            java.lang.String r4 = "ALL"
            r0.<init>(r3, r4, r1, r2)
            wb.iv.f16932i = r0
            wb.iv r1 = new wb.iv
            r2 = 1
            java.lang.String r3 = "好友"
            java.lang.String r4 = "FRIENDS"
            r1.<init>(r2, r4, r3, r3)
            wb.iv.f16933j = r1
            wb.iv r2 = new wb.iv
            r3 = 2
            java.lang.String r4 = "群聊"
            java.lang.String r5 = "GROUPS"
            r2.<init>(r3, r5, r4, r4)
            wb.iv.f16934k = r2
            wb.iv r3 = new wb.iv
            r4 = 3
            java.lang.String r5 = "公众号"
            java.lang.String r6 = "OFFICIALS"
            r3.<init>(r4, r6, r5, r5)
            wb.iv.f16935l = r3
            wb.iv r4 = new wb.iv
            java.lang.String r5 = "标签"
            java.lang.String r6 = "标签好友"
            r7 = 4
            java.lang.String r8 = "LABELS"
            r4.<init>(r7, r8, r5, r6)
            wb.iv.f16936m = r4
            wb.iv[] r0 = new wb.iv[]{r0, r1, r2, r3, r4}
            wb.iv.f16937n = r0
            return
    }

    iv(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.f16938g = r3
            r0.f16939h = r4
            return
    }

    public static wb.iv valueOf(java.lang.String r1) {
            java.lang.Class<wb.iv> r0 = wb.iv.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            wb.iv r1 = (wb.iv) r1
            return r1
    }

    public static wb.iv[] values() {
            wb.iv[] r0 = wb.iv.f16937n
            java.lang.Object r0 = r0.clone()
            wb.iv[] r0 = (wb.iv[]) r0
            return r0
    }
}
