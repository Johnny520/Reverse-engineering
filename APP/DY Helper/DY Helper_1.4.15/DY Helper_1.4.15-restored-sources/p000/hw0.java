package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum hw0 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.hw0 f4828 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.hw0 f4829 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.hw0 f4830 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.hw0[] f4831 = null;

    static {
            hw0 r0 = new hw0
            java.lang.String r1 = "IsPlacedInLookahead"
            r2 = 0
            r0.<init>(r1, r2)
            p000.hw0.f4828 = r0
            hw0 r1 = new hw0
            java.lang.String r2 = "IsPlacedInApproach"
            r3 = 1
            r1.<init>(r2, r3)
            p000.hw0.f4829 = r1
            hw0 r2 = new hw0
            java.lang.String r3 = "IsNotPlaced"
            r4 = 2
            r2.<init>(r3, r4)
            p000.hw0.f4830 = r2
            hw0[] r0 = new p000.hw0[]{r0, r1, r2}
            p000.hw0.f4831 = r0
            return
    }

    public static p000.hw0 valueOf(java.lang.String r1) {
            java.lang.Class<hw0> r0 = p000.hw0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hw0 r1 = (p000.hw0) r1
            return r1
    }

    public static p000.hw0[] values() {
            hw0[] r0 = p000.hw0.f4831
            java.lang.Object r0 = r0.clone()
            hw0[] r0 = (p000.hw0[]) r0
            return r0
    }
}
