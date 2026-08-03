package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum u extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qg.u f11096g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qg.u f11097h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qg.u f11098i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qg.u f11099j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ qg.u[] f11100k = null;

    static {
            qg.u r0 = new qg.u
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            qg.u.f11096g = r0
            qg.u r1 = new qg.u
            java.lang.String r2 = "LAZY"
            r3 = 1
            r1.<init>(r2, r3)
            qg.u.f11097h = r1
            qg.u r2 = new qg.u
            java.lang.String r3 = "ATOMIC"
            r4 = 2
            r2.<init>(r3, r4)
            qg.u.f11098i = r2
            qg.u r3 = new qg.u
            java.lang.String r4 = "UNDISPATCHED"
            r5 = 3
            r3.<init>(r4, r5)
            qg.u.f11099j = r3
            qg.u[] r0 = new qg.u[]{r0, r1, r2, r3}
            qg.u.f11100k = r0
            return
    }

    public static qg.u valueOf(java.lang.String r1) {
            java.lang.Class<qg.u> r0 = qg.u.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            qg.u r1 = (qg.u) r1
            return r1
    }

    public static qg.u[] values() {
            qg.u[] r0 = qg.u.f11100k
            java.lang.Object r0 = r0.clone()
            qg.u[] r0 = (qg.u[]) r0
            return r0
    }
}
