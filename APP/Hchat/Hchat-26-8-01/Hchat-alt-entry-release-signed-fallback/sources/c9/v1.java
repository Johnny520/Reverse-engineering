package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum v1 extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c9.v1 f1408g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c9.v1 f1409h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c9.v1 f1410i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c9.v1 f1411j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ c9.v1[] f1412k = null;

    static {
            c9.v1 r0 = new c9.v1
            java.lang.String r1 = "REMOVE"
            r2 = 0
            r0.<init>(r1, r2)
            c9.v1.f1408g = r0
            c9.v1 r1 = new c9.v1
            java.lang.String r2 = "MOVE"
            r3 = 1
            r1.<init>(r2, r3)
            c9.v1.f1409h = r1
            c9.v1 r2 = new c9.v1
            java.lang.String r3 = "PIN"
            r4 = 2
            r2.<init>(r3, r4)
            c9.v1.f1410i = r2
            c9.v1 r3 = new c9.v1
            java.lang.String r4 = "UNPIN"
            r5 = 3
            r3.<init>(r4, r5)
            c9.v1.f1411j = r3
            c9.v1[] r0 = new c9.v1[]{r0, r1, r2, r3}
            c9.v1.f1412k = r0
            return
    }

    public static c9.v1 valueOf(java.lang.String r1) {
            java.lang.Class<c9.v1> r0 = c9.v1.class
            java.lang.Enum r1 = j8.b.g(r0, r1)
            c9.v1 r1 = (c9.v1) r1
            return r1
    }

    public static c9.v1[] values() {
            c9.v1[] r0 = c9.v1.f1412k
            java.lang.Object r0 = r0.clone()
            c9.v1[] r0 = (c9.v1[]) r0
            return r0
    }
}
