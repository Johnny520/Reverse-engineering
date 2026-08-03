package sf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum d extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sf.d f12415g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sf.d f12416h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ sf.d[] f12417i = null;

    static {
            sf.d r0 = new sf.d
            java.lang.String r1 = "SYNCHRONIZED"
            r2 = 0
            r0.<init>(r1, r2)
            sf.d.f12415g = r0
            sf.d r1 = new sf.d
            java.lang.String r2 = "PUBLICATION"
            r3 = 1
            r1.<init>(r2, r3)
            sf.d r2 = new sf.d
            java.lang.String r3 = "NONE"
            r4 = 2
            r2.<init>(r3, r4)
            sf.d.f12416h = r2
            sf.d[] r0 = new sf.d[]{r0, r1, r2}
            sf.d.f12417i = r0
            return
    }

    public static sf.d valueOf(java.lang.String r1) {
            java.lang.Class<sf.d> r0 = sf.d.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sf.d r1 = (sf.d) r1
            return r1
    }

    public static sf.d[] values() {
            sf.d[] r0 = sf.d.f12417i
            java.lang.Object r0 = r0.clone()
            sf.d[] r0 = (sf.d[]) r0
            return r0
    }
}
