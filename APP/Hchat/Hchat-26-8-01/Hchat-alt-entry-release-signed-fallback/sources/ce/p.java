package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum p extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ce.p f1656g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ce.p f1657h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ce.p f1658i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ ce.p[] f1659j = null;

    static {
            ce.p r0 = new ce.p
            java.lang.String r1 = "WHITE"
            r2 = 0
            r0.<init>(r1, r2)
            ce.p.f1656g = r0
            ce.p r1 = new ce.p
            java.lang.String r2 = "GRAY"
            r3 = 1
            r1.<init>(r2, r3)
            ce.p.f1657h = r1
            ce.p r2 = new ce.p
            java.lang.String r3 = "BLACK"
            r4 = 2
            r2.<init>(r3, r4)
            ce.p.f1658i = r2
            ce.p[] r0 = new ce.p[]{r0, r1, r2}
            ce.p.f1659j = r0
            return
    }

    public static ce.p valueOf(java.lang.String r1) {
            java.lang.Class<ce.p> r0 = ce.p.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ce.p r1 = (ce.p) r1
            return r1
    }

    public static ce.p[] values() {
            ce.p[] r0 = ce.p.f1659j
            java.lang.Object r0 = r0.clone()
            ce.p[] r0 = (ce.p[]) r0
            return r0
    }
}
