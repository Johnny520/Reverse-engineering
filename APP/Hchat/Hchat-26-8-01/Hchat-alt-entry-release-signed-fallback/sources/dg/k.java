package dg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum k extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dg.k f2255g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final dg.k f2256h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ dg.k[] f2257i = null;

    static {
            dg.k r0 = new dg.k
            java.lang.String r1 = "TOP_DOWN"
            r2 = 0
            r0.<init>(r1, r2)
            dg.k.f2255g = r0
            dg.k r1 = new dg.k
            java.lang.String r2 = "BOTTOM_UP"
            r3 = 1
            r1.<init>(r2, r3)
            dg.k.f2256h = r1
            dg.k[] r0 = new dg.k[]{r0, r1}
            dg.k.f2257i = r0
            return
    }

    public static dg.k valueOf(java.lang.String r1) {
            java.lang.Class<dg.k> r0 = dg.k.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            dg.k r1 = (dg.k) r1
            return r1
    }

    public static dg.k[] values() {
            dg.k[] r0 = dg.k.f2257i
            java.lang.Object r0 = r0.clone()
            dg.k[] r0 = (dg.k[]) r0
            return r0
    }
}
