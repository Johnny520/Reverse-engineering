package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum p extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a2.a f4461g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final gb.p f4462h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final gb.p f4463i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ gb.p[] f4464j = null;

    static {
            gb.p r0 = new gb.p
            java.lang.String r1 = "PENDING"
            r2 = 0
            r0.<init>(r1, r2)
            gb.p.f4462h = r0
            gb.p r1 = new gb.p
            java.lang.String r2 = "APPROVED"
            r3 = 1
            r1.<init>(r2, r3)
            gb.p.f4463i = r1
            gb.p[] r0 = new gb.p[]{r0, r1}
            gb.p.f4464j = r0
            a2.a r0 = new a2.a
            r1 = 16
            r0.<init>(r1)
            gb.p.f4461g = r0
            return
    }

    public static gb.p valueOf(java.lang.String r1) {
            java.lang.Class<gb.p> r0 = gb.p.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            gb.p r1 = (gb.p) r1
            return r1
    }

    public static gb.p[] values() {
            gb.p[] r0 = gb.p.f4464j
            java.lang.Object r0 = r0.clone()
            gb.p[] r0 = (gb.p[]) r0
            return r0
    }
}
