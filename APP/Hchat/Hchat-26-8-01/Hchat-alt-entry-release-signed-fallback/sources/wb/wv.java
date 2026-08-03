package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum wv extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wb.wv f20069g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wb.wv f20070h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wb.wv f20071i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ wb.wv[] f20072j = null;

    static {
            wb.wv r0 = new wb.wv
            java.lang.String r1 = "TARGETS"
            r2 = 0
            r0.<init>(r1, r2)
            wb.wv.f20069g = r0
            wb.wv r1 = new wb.wv
            java.lang.String r2 = "EXCLUDED"
            r3 = 1
            r1.<init>(r2, r3)
            wb.wv.f20070h = r1
            wb.wv r2 = new wb.wv
            java.lang.String r3 = "DELETE"
            r4 = 2
            r2.<init>(r3, r4)
            wb.wv.f20071i = r2
            wb.wv[] r0 = new wb.wv[]{r0, r1, r2}
            wb.wv.f20072j = r0
            return
    }

    public static wb.wv valueOf(java.lang.String r1) {
            java.lang.Class<wb.wv> r0 = wb.wv.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            wb.wv r1 = (wb.wv) r1
            return r1
    }

    public static wb.wv[] values() {
            wb.wv[] r0 = wb.wv.f20072j
            java.lang.Object r0 = r0.clone()
            wb.wv[] r0 = (wb.wv[]) r0
            return r0
    }
}
