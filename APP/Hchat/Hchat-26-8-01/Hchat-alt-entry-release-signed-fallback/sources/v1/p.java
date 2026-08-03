package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum p extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v1.p f14009g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v1.p f14010h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ v1.p[] f14011i = null;

    static {
            v1.p r0 = new v1.p
            java.lang.String r1 = "Min"
            r2 = 0
            r0.<init>(r1, r2)
            v1.p.f14009g = r0
            v1.p r1 = new v1.p
            java.lang.String r2 = "Max"
            r3 = 1
            r1.<init>(r2, r3)
            v1.p.f14010h = r1
            v1.p[] r0 = new v1.p[]{r0, r1}
            v1.p.f14011i = r0
            return
    }

    public static v1.p valueOf(java.lang.String r1) {
            java.lang.Class<v1.p> r0 = v1.p.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            v1.p r1 = (v1.p) r1
            return r1
    }

    public static v1.p[] values() {
            v1.p[] r0 = v1.p.f14011i
            java.lang.Object r0 = r0.clone()
            v1.p[] r0 = (v1.p[]) r0
            return r0
    }
}
