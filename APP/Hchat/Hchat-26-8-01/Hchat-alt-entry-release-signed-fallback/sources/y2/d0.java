package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum d0 extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y2.d0 f22212g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y2.d0 f22213h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ y2.d0[] f22214i = null;

    static {
            y2.d0 r0 = new y2.d0
            java.lang.String r1 = "Inherit"
            r2 = 0
            r0.<init>(r1, r2)
            y2.d0.f22212g = r0
            y2.d0 r1 = new y2.d0
            java.lang.String r2 = "SecureOn"
            r3 = 1
            r1.<init>(r2, r3)
            y2.d0.f22213h = r1
            y2.d0 r2 = new y2.d0
            java.lang.String r3 = "SecureOff"
            r4 = 2
            r2.<init>(r3, r4)
            y2.d0[] r0 = new y2.d0[]{r0, r1, r2}
            y2.d0.f22214i = r0
            return
    }

    public static y2.d0 valueOf(java.lang.String r1) {
            java.lang.Class<y2.d0> r0 = y2.d0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            y2.d0 r1 = (y2.d0) r1
            return r1
    }

    public static y2.d0[] values() {
            y2.d0[] r0 = y2.d0.f22214i
            java.lang.Object r0 = r0.clone()
            y2.d0[] r0 = (y2.d0[]) r0
            return r0
    }
}
