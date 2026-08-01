package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum w52 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.w52 f11573 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.w52 f11574 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.w52 f11575 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.w52[] f11576 = null;

    static {
            w52 r0 = new w52
            java.lang.String r1 = "ContinueTraversal"
            r2 = 0
            r0.<init>(r1, r2)
            p000.w52.f11573 = r0
            w52 r1 = new w52
            java.lang.String r2 = "SkipSubtreeAndContinueTraversal"
            r3 = 1
            r1.<init>(r2, r3)
            p000.w52.f11574 = r1
            w52 r2 = new w52
            java.lang.String r3 = "CancelTraversal"
            r4 = 2
            r2.<init>(r3, r4)
            p000.w52.f11575 = r2
            w52[] r0 = new p000.w52[]{r0, r1, r2}
            p000.w52.f11576 = r0
            return
    }

    public static p000.w52 valueOf(java.lang.String r1) {
            java.lang.Class<w52> r0 = p000.w52.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            w52 r1 = (p000.w52) r1
            return r1
    }

    public static p000.w52[] values() {
            w52[] r0 = p000.w52.f11576
            java.lang.Object r0 = r0.clone()
            w52[] r0 = (p000.w52[]) r0
            return r0
    }
}
