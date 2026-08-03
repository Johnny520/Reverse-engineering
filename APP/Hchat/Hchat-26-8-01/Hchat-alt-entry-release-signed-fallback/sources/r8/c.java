package r8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum c extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r8.c f11602h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r8.c f11603i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r8.c f11604j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ r8.c[] f11605k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11606g;

    static {
            r8.c r0 = new r8.c
            java.lang.String r1 = "EARLY"
            r2 = 0
            r0.<init>(r1, r2, r2)
            r8.c.f11602h = r0
            r8.c r1 = new r8.c
            java.lang.String r2 = "BRIDGE"
            r3 = 1
            r1.<init>(r2, r3, r3)
            r8.c.f11603i = r1
            r8.c r2 = new r8.c
            java.lang.String r3 = "WARMUP"
            r4 = 2
            r2.<init>(r3, r4, r4)
            r8.c.f11604j = r2
            r8.c[] r0 = new r8.c[]{r0, r1, r2}
            r8.c.f11605k = r0
            return
    }

    c(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f11606g = r3
            return
    }

    public static r8.c valueOf(java.lang.String r1) {
            java.lang.Class<r8.c> r0 = r8.c.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            r8.c r1 = (r8.c) r1
            return r1
    }

    public static r8.c[] values() {
            r8.c[] r0 = r8.c.f11605k
            java.lang.Object r0 = r0.clone()
            r8.c[] r0 = (r8.c[]) r0
            return r0
    }
}
