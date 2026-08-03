package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum b extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bc.b f703g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bc.b f704h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bc.b f705i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ bc.b[] f706j = null;

    static {
            bc.b r0 = new bc.b
            java.lang.String r1 = "AUTO"
            r2 = 0
            r0.<init>(r1, r2)
            bc.b.f703g = r0
            bc.b r1 = new bc.b
            java.lang.String r2 = "RESTRUCTURE"
            r3 = 1
            r1.<init>(r2, r3)
            bc.b r2 = new bc.b
            java.lang.String r3 = "SIMPLE"
            r4 = 2
            r2.<init>(r3, r4)
            bc.b.f704h = r2
            bc.b r3 = new bc.b
            java.lang.String r4 = "FALLBACK"
            r5 = 3
            r3.<init>(r4, r5)
            bc.b.f705i = r3
            bc.b[] r0 = new bc.b[]{r0, r1, r2, r3}
            bc.b.f706j = r0
            return
    }

    public static bc.b valueOf(java.lang.String r1) {
            java.lang.Class<bc.b> r0 = bc.b.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bc.b r1 = (bc.b) r1
            return r1
    }

    public static bc.b[] values() {
            bc.b[] r0 = bc.b.f706j
            java.lang.Object r0 = r0.clone()
            bc.b[] r0 = (bc.b[]) r0
            return r0
    }
}
