package zc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zc.a f22658g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zc.a f22659h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final zc.a f22660i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ zc.a[] f22661j = null;

    static {
            zc.a r0 = new zc.a
            java.lang.String r1 = "VERIFY_APP_PACKAGE"
            r2 = 0
            r0.<init>(r1, r2)
            zc.a.f22658g = r0
            zc.a r1 = new zc.a
            java.lang.String r2 = "SECURE_XML_PARSER"
            r3 = 1
            r1.<init>(r2, r3)
            zc.a.f22659h = r1
            zc.a r2 = new zc.a
            java.lang.String r3 = "SECURE_ZIP_READER"
            r4 = 2
            r2.<init>(r3, r4)
            zc.a.f22660i = r2
            zc.a[] r0 = new zc.a[]{r0, r1, r2}
            zc.a.f22661j = r0
            return
    }

    public static zc.a valueOf(java.lang.String r1) {
            java.lang.Class<zc.a> r0 = zc.a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            zc.a r1 = (zc.a) r1
            return r1
    }

    public static zc.a[] values() {
            zc.a[] r0 = zc.a.f22661j
            java.lang.Object r0 = r0.clone()
            zc.a[] r0 = (zc.a[]) r0
            return r0
    }
}
