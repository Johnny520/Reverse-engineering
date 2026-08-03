package va;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum b extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final va.b f14295g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final va.b f14296h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ va.b[] f14297i = null;

    static {
            va.b r0 = new va.b
            java.lang.String r1 = "CONTACT"
            r2 = 0
            r0.<init>(r1, r2)
            va.b.f14295g = r0
            va.b r1 = new va.b
            java.lang.String r2 = "CHATROOM"
            r3 = 1
            r1.<init>(r2, r3)
            va.b.f14296h = r1
            va.b[] r0 = new va.b[]{r0, r1}
            va.b.f14297i = r0
            return
    }

    public static va.b valueOf(java.lang.String r1) {
            java.lang.Class<va.b> r0 = va.b.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            va.b r1 = (va.b) r1
            return r1
    }

    public static va.b[] values() {
            va.b[] r0 = va.b.f14297i
            java.lang.Object r0 = r0.clone()
            va.b[] r0 = (va.b[]) r0
            return r0
    }
}
