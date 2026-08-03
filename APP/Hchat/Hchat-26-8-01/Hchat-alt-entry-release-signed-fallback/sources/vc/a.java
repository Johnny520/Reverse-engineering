package vc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vc.a[] f14307g = null;

    static {
            vc.a r0 = new vc.a
            java.lang.String r1 = "PER_PROJECT"
            r2 = 0
            r0.<init>(r1, r2)
            vc.a r1 = new vc.a
            java.lang.String r2 = "HIDE_IN_GUI"
            r3 = 1
            r1.<init>(r2, r3)
            vc.a r2 = new vc.a
            java.lang.String r3 = "DISABLE_IN_GUI"
            r4 = 2
            r2.<init>(r3, r4)
            vc.a r3 = new vc.a
            java.lang.String r4 = "NOT_CHANGING_CODE"
            r5 = 3
            r3.<init>(r4, r5)
            vc.a[] r0 = new vc.a[]{r0, r1, r2, r3}
            vc.a.f14307g = r0
            return
    }

    public static vc.a valueOf(java.lang.String r1) {
            java.lang.Class<vc.a> r0 = vc.a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            vc.a r1 = (vc.a) r1
            return r1
    }

    public static vc.a[] values() {
            vc.a[] r0 = vc.a.f14307g
            java.lang.Object r0 = r0.clone()
            vc.a[] r0 = (vc.a[]) r0
            return r0
    }
}
