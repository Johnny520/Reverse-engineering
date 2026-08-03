package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum k5 extends java.lang.Enum {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wb.k5 f17195i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wb.k5 f17196j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final wb.k5 f17197k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final wb.k5 f17198l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final wb.k5 f17199m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ wb.k5[] f17200n = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f17201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f17202h;

    static {
            wb.k5 r0 = new wb.k5
            r1 = 0
            java.lang.String r2 = "好友"
            java.lang.String r3 = "FRIENDS"
            r0.<init>(r1, r3, r2, r2)
            wb.k5.f17195i = r0
            wb.k5 r1 = new wb.k5
            r2 = 1
            java.lang.String r3 = "群聊"
            java.lang.String r4 = "GROUPS"
            r1.<init>(r2, r4, r3, r3)
            wb.k5.f17196j = r1
            wb.k5 r2 = new wb.k5
            r3 = 2
            java.lang.String r4 = "公众号"
            java.lang.String r5 = "OFFICIALS"
            r2.<init>(r3, r5, r4, r4)
            wb.k5.f17197k = r2
            wb.k5 r3 = new wb.k5
            java.lang.String r4 = "标签"
            java.lang.String r5 = "标签好友"
            r6 = 3
            java.lang.String r7 = "LABELS"
            r3.<init>(r6, r7, r4, r5)
            wb.k5.f17198l = r3
            wb.k5 r4 = new wb.k5
            r5 = 4
            java.lang.String r6 = "全部"
            java.lang.String r7 = "ALL"
            r4.<init>(r5, r7, r6, r6)
            wb.k5.f17199m = r4
            wb.k5[] r0 = new wb.k5[]{r0, r1, r2, r3, r4}
            wb.k5.f17200n = r0
            return
    }

    k5(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.f17201g = r3
            r0.f17202h = r4
            return
    }

    public static wb.k5 valueOf(java.lang.String r1) {
            java.lang.Class<wb.k5> r0 = wb.k5.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            wb.k5 r1 = (wb.k5) r1
            return r1
    }

    public static wb.k5[] values() {
            wb.k5[] r0 = wb.k5.f17200n
            java.lang.Object r0 = r0.clone()
            wb.k5[] r0 = (wb.k5[]) r0
            return r0
    }
}
