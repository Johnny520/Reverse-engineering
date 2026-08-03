package y6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y6.a f22304g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ y6.a[] f22305h = null;

    static {
            y6.a r0 = new y6.a
            java.lang.String r1 = "DEBUG"
            r2 = 0
            r0.<init>(r1, r2)
            y6.a r1 = new y6.a
            java.lang.String r2 = "INFO"
            r3 = 1
            r1.<init>(r2, r3)
            y6.a r2 = new y6.a
            java.lang.String r3 = "WARN"
            r4 = 2
            r2.<init>(r3, r4)
            y6.a.f22304g = r2
            y6.a r3 = new y6.a
            java.lang.String r4 = "ERROR"
            r5 = 3
            r3.<init>(r4, r5)
            y6.a r4 = new y6.a
            java.lang.String r5 = "OFF"
            r6 = 4
            r4.<init>(r5, r6)
            y6.a[] r0 = new y6.a[]{r0, r1, r2, r3, r4}
            y6.a.f22305h = r0
            return
    }

    public static y6.a valueOf(java.lang.String r1) {
            java.lang.Class<y6.a> r0 = y6.a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            y6.a r1 = (y6.a) r1
            return r1
    }

    public static y6.a[] values() {
            y6.a[] r0 = y6.a.f22305h
            java.lang.Object r0 = r0.clone()
            y6.a[] r0 = (y6.a[]) r0
            return r0
    }
}
