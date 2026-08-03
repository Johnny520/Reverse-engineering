package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum t extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r9.t f11795g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r9.t f11796h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r9.t f11797i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ r9.t[] f11798j = null;

    static {
            r9.t r0 = new r9.t
            java.lang.String r1 = "STABLE"
            r2 = 0
            r0.<init>(r1, r2)
            r9.t.f11795g = r0
            r9.t r1 = new r9.t
            java.lang.String r2 = "NEEDS_LAYOUT"
            r3 = 1
            r1.<init>(r2, r3)
            r9.t.f11796h = r1
            r9.t r2 = new r9.t
            java.lang.String r3 = "UNAVAILABLE"
            r4 = 2
            r2.<init>(r3, r4)
            r9.t.f11797i = r2
            r9.t[] r0 = new r9.t[]{r0, r1, r2}
            r9.t.f11798j = r0
            return
    }

    public static r9.t valueOf(java.lang.String r1) {
            java.lang.Class<r9.t> r0 = r9.t.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            r9.t r1 = (r9.t) r1
            return r1
    }

    public static r9.t[] values() {
            r9.t[] r0 = r9.t.f11798j
            java.lang.Object r0 = r0.clone()
            r9.t[] r0 = (r9.t[]) r0
            return r0
    }
}
