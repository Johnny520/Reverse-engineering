package fd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum d extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fd.d f3900g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fd.d f3901h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final fd.d f3902i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ fd.d[] f3903j = null;

    static {
            fd.d r0 = new fd.d
            java.lang.String r1 = "BODY_ONLY"
            r2 = 0
            r0.<init>(r1, r2)
            fd.d.f3900g = r0
            fd.d r1 = new fd.d
            java.lang.String r2 = "BODY_ONLY_NOWRAP"
            r3 = 1
            r1.<init>(r2, r3)
            fd.d.f3901h = r1
            fd.d r2 = new fd.d
            java.lang.String r3 = "INLINE"
            r4 = 2
            r2.<init>(r3, r4)
            fd.d.f3902i = r2
            fd.d[] r0 = new fd.d[]{r0, r1, r2}
            fd.d.f3903j = r0
            return
    }

    public static fd.d valueOf(java.lang.String r1) {
            java.lang.Class<fd.d> r0 = fd.d.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fd.d r1 = (fd.d) r1
            return r1
    }

    public static fd.d[] values() {
            fd.d[] r0 = fd.d.f3903j
            java.lang.Object r0 = r0.clone()
            fd.d[] r0 = (fd.d[]) r0
            return r0
    }
}
