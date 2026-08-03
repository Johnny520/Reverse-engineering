package xg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum b extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xg.b f21598g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final xg.b f21599h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xg.b f21600i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final xg.b f21601j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final xg.b f21602k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ xg.b[] f21603l = null;

    static {
            xg.b r0 = new xg.b
            java.lang.String r1 = "CPU_ACQUIRED"
            r2 = 0
            r0.<init>(r1, r2)
            xg.b.f21598g = r0
            xg.b r1 = new xg.b
            java.lang.String r2 = "BLOCKING"
            r3 = 1
            r1.<init>(r2, r3)
            xg.b.f21599h = r1
            xg.b r2 = new xg.b
            java.lang.String r3 = "PARKING"
            r4 = 2
            r2.<init>(r3, r4)
            xg.b.f21600i = r2
            xg.b r3 = new xg.b
            java.lang.String r4 = "DORMANT"
            r5 = 3
            r3.<init>(r4, r5)
            xg.b.f21601j = r3
            xg.b r4 = new xg.b
            java.lang.String r5 = "TERMINATED"
            r6 = 4
            r4.<init>(r5, r6)
            xg.b.f21602k = r4
            xg.b[] r0 = new xg.b[]{r0, r1, r2, r3, r4}
            xg.b.f21603l = r0
            return
    }

    public static xg.b valueOf(java.lang.String r1) {
            java.lang.Class<xg.b> r0 = xg.b.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xg.b r1 = (xg.b) r1
            return r1
    }

    public static xg.b[] values() {
            xg.b[] r0 = xg.b.f21603l
            java.lang.Object r0 = r0.clone()
            xg.b[] r0 = (xg.b[]) r0
            return r0
    }
}
