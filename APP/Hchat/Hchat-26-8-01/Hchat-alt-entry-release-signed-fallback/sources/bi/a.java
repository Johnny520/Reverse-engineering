package bi;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ bi.a[] f863g = null;

    static {
            bi.a r0 = new bi.a
            java.lang.String r1 = "System"
            r2 = 0
            r0.<init>(r1, r2)
            bi.a r1 = new bi.a
            java.lang.String r2 = "Light"
            r3 = 1
            r1.<init>(r2, r3)
            bi.a r2 = new bi.a
            java.lang.String r3 = "Dark"
            r4 = 2
            r2.<init>(r3, r4)
            bi.a r3 = new bi.a
            java.lang.String r4 = "MonetSystem"
            r5 = 3
            r3.<init>(r4, r5)
            bi.a r4 = new bi.a
            java.lang.String r5 = "MonetLight"
            r6 = 4
            r4.<init>(r5, r6)
            bi.a r5 = new bi.a
            java.lang.String r6 = "MonetDark"
            r7 = 5
            r5.<init>(r6, r7)
            bi.a[] r0 = new bi.a[]{r0, r1, r2, r3, r4, r5}
            bi.a.f863g = r0
            return
    }

    public static bi.a valueOf(java.lang.String r1) {
            java.lang.Class<bi.a> r0 = bi.a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bi.a r1 = (bi.a) r1
            return r1
    }

    public static bi.a[] values() {
            bi.a[] r0 = bi.a.f863g
            java.lang.Object r0 = r0.clone()
            bi.a[] r0 = (bi.a[]) r0
            return r0
    }
}
