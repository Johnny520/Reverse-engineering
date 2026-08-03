package a1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum k extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a1.k f47g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a1.k f48h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a1.k[] f49i = null;

    static {
            a1.k r0 = new a1.k
            java.lang.String r1 = "VIEW_APPEAR"
            r2 = 0
            r0.<init>(r1, r2)
            a1.k.f47g = r0
            a1.k r1 = new a1.k
            java.lang.String r2 = "VIEW_DISAPPEAR"
            r3 = 1
            r1.<init>(r2, r3)
            a1.k.f48h = r1
            a1.k[] r0 = new a1.k[]{r0, r1}
            a1.k.f49i = r0
            return
    }

    public static a1.k valueOf(java.lang.String r1) {
            java.lang.Class<a1.k> r0 = a1.k.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a1.k r1 = (a1.k) r1
            return r1
    }

    public static a1.k[] values() {
            a1.k[] r0 = a1.k.f49i
            java.lang.Object r0 = r0.clone()
            a1.k[] r0 = (a1.k[]) r0
            return r0
    }
}
