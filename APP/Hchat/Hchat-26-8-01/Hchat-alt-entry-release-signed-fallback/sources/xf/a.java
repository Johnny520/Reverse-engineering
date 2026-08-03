package xf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xf.a f21579g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final xf.a f21580h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xf.a f21581i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ xf.a[] f21582j = null;

    static {
            xf.a r0 = new xf.a
            java.lang.String r1 = "COROUTINE_SUSPENDED"
            r2 = 0
            r0.<init>(r1, r2)
            xf.a.f21579g = r0
            xf.a r1 = new xf.a
            java.lang.String r2 = "UNDECIDED"
            r3 = 1
            r1.<init>(r2, r3)
            xf.a.f21580h = r1
            xf.a r2 = new xf.a
            java.lang.String r3 = "RESUMED"
            r4 = 2
            r2.<init>(r3, r4)
            xf.a.f21581i = r2
            xf.a[] r0 = new xf.a[]{r0, r1, r2}
            xf.a.f21582j = r0
            return
    }

    public static xf.a valueOf(java.lang.String r1) {
            java.lang.Class<xf.a> r0 = xf.a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xf.a r1 = (xf.a) r1
            return r1
    }

    public static xf.a[] values() {
            xf.a[] r0 = xf.a.f21582j
            java.lang.Object r0 = r0.clone()
            xf.a[] r0 = (xf.a[]) r0
            return r0
    }
}
