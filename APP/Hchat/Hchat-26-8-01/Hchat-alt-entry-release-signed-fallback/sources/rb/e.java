package rb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum e extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final rb.e f11885g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final rb.e f11886h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final rb.e f11887i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ rb.e[] f11888j = null;

    static {
            rb.e r0 = new rb.e
            java.lang.String r1 = "NORMAL"
            r2 = 0
            r0.<init>(r1, r2)
            rb.e.f11885g = r0
            rb.e r1 = new rb.e
            java.lang.String r2 = "DEAD"
            r3 = 1
            r1.<init>(r2, r3)
            rb.e.f11886h = r1
            rb.e r2 = new rb.e
            java.lang.String r3 = "UNKNOWN"
            r4 = 2
            r2.<init>(r3, r4)
            rb.e.f11887i = r2
            rb.e[] r0 = new rb.e[]{r0, r1, r2}
            rb.e.f11888j = r0
            return
    }

    public static rb.e valueOf(java.lang.String r1) {
            java.lang.Class<rb.e> r0 = rb.e.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            rb.e r1 = (rb.e) r1
            return r1
    }

    public static rb.e[] values() {
            rb.e[] r0 = rb.e.f11888j
            java.lang.Object r0 = r0.clone()
            rb.e[] r0 = (rb.e[]) r0
            return r0
    }
}
