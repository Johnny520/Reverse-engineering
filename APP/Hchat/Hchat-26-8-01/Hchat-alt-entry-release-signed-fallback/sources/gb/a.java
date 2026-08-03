package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final gb.a f4404g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final gb.a f4405h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final gb.a f4406i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ gb.a[] f4407j = null;

    static {
            gb.a r0 = new gb.a
            java.lang.String r1 = "GET"
            r2 = 0
            r0.<init>(r1, r2)
            gb.a.f4404g = r0
            gb.a r1 = new gb.a
            java.lang.String r2 = "POST"
            r3 = 1
            r1.<init>(r2, r3)
            gb.a.f4405h = r1
            gb.a r2 = new gb.a
            java.lang.String r3 = "DELETE"
            r4 = 2
            r2.<init>(r3, r4)
            gb.a.f4406i = r2
            gb.a[] r0 = new gb.a[]{r0, r1, r2}
            gb.a.f4407j = r0
            return
    }

    public static gb.a valueOf(java.lang.String r1) {
            java.lang.Class<gb.a> r0 = gb.a.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            gb.a r1 = (gb.a) r1
            return r1
    }

    public static gb.a[] values() {
            gb.a[] r0 = gb.a.f4407j
            java.lang.Object r0 = r0.clone()
            gb.a[] r0 = (gb.a[]) r0
            return r0
    }
}
