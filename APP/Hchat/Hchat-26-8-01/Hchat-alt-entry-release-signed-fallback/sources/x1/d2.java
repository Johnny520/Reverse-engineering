package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum d2 extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x1.d2 f20872g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x1.d2 f20873h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x1.d2 f20874i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ x1.d2[] f20875j = null;

    static {
            x1.d2 r0 = new x1.d2
            java.lang.String r1 = "ContinueTraversal"
            r2 = 0
            r0.<init>(r1, r2)
            x1.d2.f20872g = r0
            x1.d2 r1 = new x1.d2
            java.lang.String r2 = "SkipSubtreeAndContinueTraversal"
            r3 = 1
            r1.<init>(r2, r3)
            x1.d2.f20873h = r1
            x1.d2 r2 = new x1.d2
            java.lang.String r3 = "CancelTraversal"
            r4 = 2
            r2.<init>(r3, r4)
            x1.d2.f20874i = r2
            x1.d2[] r0 = new x1.d2[]{r0, r1, r2}
            x1.d2.f20875j = r0
            return
    }

    public static x1.d2 valueOf(java.lang.String r1) {
            java.lang.Class<x1.d2> r0 = x1.d2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            x1.d2 r1 = (x1.d2) r1
            return r1
    }

    public static x1.d2[] values() {
            x1.d2[] r0 = x1.d2.f20875j
            java.lang.Object r0 = r0.clone()
            x1.d2[] r0 = (x1.d2[]) r0
            return r0
    }
}
