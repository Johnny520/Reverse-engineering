package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum sp extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wb.sp f19124g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wb.sp f19125h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wb.sp f19126i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wb.sp f19127j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final wb.sp f19128k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ wb.sp[] f19129l = null;

    static {
            wb.sp r0 = new wb.sp
            java.lang.String r1 = "QUEUED"
            r2 = 0
            r0.<init>(r1, r2)
            wb.sp.f19124g = r0
            wb.sp r1 = new wb.sp
            java.lang.String r2 = "UPLOADING"
            r3 = 1
            r1.<init>(r2, r3)
            wb.sp.f19125h = r1
            wb.sp r2 = new wb.sp
            java.lang.String r3 = "SUCCESS"
            r4 = 2
            r2.<init>(r3, r4)
            wb.sp.f19126i = r2
            wb.sp r3 = new wb.sp
            java.lang.String r4 = "PENDING_REVIEW"
            r5 = 3
            r3.<init>(r4, r5)
            wb.sp.f19127j = r3
            wb.sp r4 = new wb.sp
            java.lang.String r5 = "FAILED"
            r6 = 4
            r4.<init>(r5, r6)
            wb.sp.f19128k = r4
            wb.sp[] r0 = new wb.sp[]{r0, r1, r2, r3, r4}
            wb.sp.f19129l = r0
            return
    }

    public static wb.sp valueOf(java.lang.String r1) {
            java.lang.Class<wb.sp> r0 = wb.sp.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            wb.sp r1 = (wb.sp) r1
            return r1
    }

    public static wb.sp[] values() {
            wb.sp[] r0 = wb.sp.f19129l
            java.lang.Object r0 = r0.clone()
            wb.sp[] r0 = (wb.sp[]) r0
            return r0
    }
}
