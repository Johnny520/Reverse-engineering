package z6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum c extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z6.c f22576g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z6.c f22577h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ z6.c[] f22578i = null;

    static {
            z6.c r0 = new z6.c
            java.lang.String r1 = "Circular"
            r2 = 0
            r0.<init>(r1, r2)
            z6.c.f22576g = r0
            z6.c r1 = new z6.c
            java.lang.String r2 = "Continuous"
            r3 = 1
            r1.<init>(r2, r3)
            z6.c.f22577h = r1
            z6.c[] r0 = new z6.c[]{r0, r1}
            z6.c.f22578i = r0
            return
    }

    public static z6.c valueOf(java.lang.String r1) {
            java.lang.Class<z6.c> r0 = z6.c.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            z6.c r1 = (z6.c) r1
            return r1
    }

    public static z6.c[] values() {
            z6.c[] r0 = z6.c.f22578i
            java.lang.Object r0 = r0.clone()
            z6.c[] r0 = (z6.c[]) r0
            return r0
    }
}
