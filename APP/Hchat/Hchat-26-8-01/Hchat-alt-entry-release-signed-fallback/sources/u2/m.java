package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum m extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u2.m f13354g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u2.m f13355h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ u2.m[] f13356i = null;

    static {
            u2.m r0 = new u2.m
            java.lang.String r1 = "Ltr"
            r2 = 0
            r0.<init>(r1, r2)
            u2.m.f13354g = r0
            u2.m r1 = new u2.m
            java.lang.String r2 = "Rtl"
            r3 = 1
            r1.<init>(r2, r3)
            u2.m.f13355h = r1
            u2.m[] r0 = new u2.m[]{r0, r1}
            u2.m.f13356i = r0
            return
    }

    public static u2.m valueOf(java.lang.String r1) {
            java.lang.Class<u2.m> r0 = u2.m.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            u2.m r1 = (u2.m) r1
            return r1
    }

    public static u2.m[] values() {
            u2.m[] r0 = u2.m.f13356i
            java.lang.Object r0 = r0.clone()
            u2.m[] r0 = (u2.m[]) r0
            return r0
    }
}
