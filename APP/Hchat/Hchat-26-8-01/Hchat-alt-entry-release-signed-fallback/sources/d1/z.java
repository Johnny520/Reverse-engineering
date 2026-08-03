package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum z extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d1.z f1964g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d1.z f1965h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d1.z f1966i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d1.z[] f1967j = null;

    static {
            d1.z r0 = new d1.z
            java.lang.String r1 = "Active"
            r2 = 0
            r0.<init>(r1, r2)
            d1.z.f1964g = r0
            d1.z r1 = new d1.z
            java.lang.String r2 = "ActiveParent"
            r3 = 1
            r1.<init>(r2, r3)
            d1.z.f1965h = r1
            d1.z r2 = new d1.z
            java.lang.String r3 = "Captured"
            r4 = 2
            r2.<init>(r3, r4)
            d1.z r3 = new d1.z
            java.lang.String r4 = "Inactive"
            r5 = 3
            r3.<init>(r4, r5)
            d1.z.f1966i = r3
            d1.z[] r0 = new d1.z[]{r0, r1, r2, r3}
            d1.z.f1967j = r0
            return
    }

    public static d1.z valueOf(java.lang.String r1) {
            java.lang.Class<d1.z> r0 = d1.z.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            d1.z r1 = (d1.z) r1
            return r1
    }

    public static d1.z[] values() {
            d1.z[] r0 = d1.z.f1967j
            java.lang.Object r0 = r0.clone()
            d1.z[] r0 = (d1.z[]) r0
            return r0
    }

    public final boolean a() {
            r3 = this;
            int r0 = r3.ordinal()
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 == r1) goto L15
            r2 = 2
            if (r0 == r2) goto L17
            r1 = 3
            if (r0 != r1) goto L10
            goto L15
        L10:
            okio.a.k()
            r0 = 0
            return r0
        L15:
            r0 = 0
            return r0
        L17:
            return r1
    }
}
