package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum j extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t2.j f13011g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t2.j f13012h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ t2.j[] f13013i = null;

    static {
            t2.j r0 = new t2.j
            java.lang.String r1 = "Ltr"
            r2 = 0
            r0.<init>(r1, r2)
            t2.j.f13011g = r0
            t2.j r1 = new t2.j
            java.lang.String r2 = "Rtl"
            r3 = 1
            r1.<init>(r2, r3)
            t2.j.f13012h = r1
            t2.j[] r0 = new t2.j[]{r0, r1}
            t2.j.f13013i = r0
            return
    }

    public static t2.j valueOf(java.lang.String r1) {
            java.lang.Class<t2.j> r0 = t2.j.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            t2.j r1 = (t2.j) r1
            return r1
    }

    public static t2.j[] values() {
            t2.j[] r0 = t2.j.f13013i
            java.lang.Object r0 = r0.clone()
            t2.j[] r0 = (t2.j[]) r0
            return r0
    }
}
