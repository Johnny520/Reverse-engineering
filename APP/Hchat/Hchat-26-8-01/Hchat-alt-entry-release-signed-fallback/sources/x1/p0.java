package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum p0 extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x1.p0 f21018g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x1.p0 f21019h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x1.p0 f21020i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ x1.p0[] f21021j = null;

    static {
            x1.p0 r0 = new x1.p0
            java.lang.String r1 = "IsPlacedInLookahead"
            r2 = 0
            r0.<init>(r1, r2)
            x1.p0.f21018g = r0
            x1.p0 r1 = new x1.p0
            java.lang.String r2 = "IsPlacedInApproach"
            r3 = 1
            r1.<init>(r2, r3)
            x1.p0.f21019h = r1
            x1.p0 r2 = new x1.p0
            java.lang.String r3 = "IsNotPlaced"
            r4 = 2
            r2.<init>(r3, r4)
            x1.p0.f21020i = r2
            x1.p0[] r0 = new x1.p0[]{r0, r1, r2}
            x1.p0.f21021j = r0
            return
    }

    public static x1.p0 valueOf(java.lang.String r1) {
            java.lang.Class<x1.p0> r0 = x1.p0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            x1.p0 r1 = (x1.p0) r1
            return r1
    }

    public static x1.p0[] values() {
            x1.p0[] r0 = x1.p0.f21021j
            java.lang.Object r0 = r0.clone()
            x1.p0[] r0 = (x1.p0[]) r0
            return r0
    }
}
