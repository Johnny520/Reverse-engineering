package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum z extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qe.z f11007g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qe.z f11008h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qe.z f11009i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qe.z f11010j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ qe.z[] f11011k = null;

    static {
            qe.z r0 = new qe.z
            java.lang.String r1 = "ALLOW_WIDER"
            r2 = 0
            r0.<init>(r1, r2)
            qe.z.f11007g = r0
            qe.z r1 = new qe.z
            java.lang.String r2 = "IGNORE_SAME"
            r3 = 1
            r1.<init>(r2, r3)
            qe.z.f11008h = r1
            qe.z r2 = new qe.z
            java.lang.String r3 = "IGNORE_UNKNOWN"
            r4 = 2
            r2.<init>(r3, r4)
            qe.z.f11009i = r2
            qe.z r3 = new qe.z
            java.lang.String r4 = "KEEP_GENERICS"
            r5 = 3
            r3.<init>(r4, r5)
            qe.z.f11010j = r3
            qe.z[] r0 = new qe.z[]{r0, r1, r2, r3}
            qe.z.f11011k = r0
            return
    }

    public static qe.z valueOf(java.lang.String r1) {
            java.lang.Class<qe.z> r0 = qe.z.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            qe.z r1 = (qe.z) r1
            return r1
    }

    public static qe.z[] values() {
            qe.z[] r0 = qe.z.f11011k
            java.lang.Object r0 = r0.clone()
            qe.z[] r0 = (qe.z[]) r0
            return r0
    }
}
