package ob;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum j extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ob.j f9726g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ob.j f9727h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ob.j[] f9728i = null;

    static {
            ob.j r0 = new ob.j
            java.lang.String r1 = "CHINESE"
            r2 = 0
            r0.<init>(r1, r2)
            ob.j.f9726g = r0
            ob.j r1 = new ob.j
            java.lang.String r2 = "ENGLISH"
            r3 = 1
            r1.<init>(r2, r3)
            ob.j.f9727h = r1
            ob.j[] r0 = new ob.j[]{r0, r1}
            ob.j.f9728i = r0
            return
    }

    public static ob.j valueOf(java.lang.String r1) {
            java.lang.Class<ob.j> r0 = ob.j.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            ob.j r1 = (ob.j) r1
            return r1
    }

    public static ob.j[] values() {
            ob.j[] r0 = ob.j.f9728i
            java.lang.Object r0 = r0.clone()
            ob.j[] r0 = (ob.j[]) r0
            return r0
    }
}
