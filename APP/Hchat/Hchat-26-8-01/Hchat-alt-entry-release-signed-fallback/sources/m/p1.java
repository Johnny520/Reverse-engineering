package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum p1 extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m.p1 f8324g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m.p1 f8325h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ m.p1[] f8326i = null;

    static {
            m.p1 r0 = new m.p1
            java.lang.String r1 = "Vertical"
            r2 = 0
            r0.<init>(r1, r2)
            m.p1.f8324g = r0
            m.p1 r1 = new m.p1
            java.lang.String r2 = "Horizontal"
            r3 = 1
            r1.<init>(r2, r3)
            m.p1.f8325h = r1
            m.p1[] r0 = new m.p1[]{r0, r1}
            m.p1.f8326i = r0
            return
    }

    public static m.p1 valueOf(java.lang.String r1) {
            java.lang.Class<m.p1> r0 = m.p1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            m.p1 r1 = (m.p1) r1
            return r1
    }

    public static m.p1[] values() {
            m.p1[] r0 = m.p1.f8326i
            java.lang.Object r0 = r0.clone()
            m.p1[] r0 = (m.p1[]) r0
            return r0
    }
}
