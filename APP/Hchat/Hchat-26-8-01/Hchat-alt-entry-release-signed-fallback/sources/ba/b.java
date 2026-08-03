package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum b extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ba.b f551g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ba.b f552h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ba.b f553i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ ba.b[] f554j = null;

    static {
            ba.b r0 = new ba.b
            java.lang.String r1 = "SAVED"
            r2 = 0
            r0.<init>(r1, r2)
            ba.b.f551g = r0
            ba.b r1 = new ba.b
            java.lang.String r2 = "CANCELLED"
            r3 = 1
            r1.<init>(r2, r3)
            ba.b.f552h = r1
            ba.b r2 = new ba.b
            java.lang.String r3 = "FAILED"
            r4 = 2
            r2.<init>(r3, r4)
            ba.b.f553i = r2
            ba.b[] r0 = new ba.b[]{r0, r1, r2}
            ba.b.f554j = r0
            return
    }

    public static ba.b valueOf(java.lang.String r1) {
            java.lang.Class<ba.b> r0 = ba.b.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            ba.b r1 = (ba.b) r1
            return r1
    }

    public static ba.b[] values() {
            ba.b[] r0 = ba.b.f554j
            java.lang.Object r0 = r0.clone()
            ba.b[] r0 = (ba.b[]) r0
            return r0
    }
}
