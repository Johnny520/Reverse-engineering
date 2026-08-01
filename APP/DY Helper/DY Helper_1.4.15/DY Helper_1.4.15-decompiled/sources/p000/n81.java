package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum n81 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.n81 f7456 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.n81 f7457 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.n81 f7458 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.n81[] f7459 = null;

    static {
            n81 r0 = new n81
            java.lang.String r1 = "AUTO"
            r2 = 0
            r0.<init>(r1, r2)
            p000.n81.f7456 = r0
            n81 r1 = new n81
            java.lang.String r2 = "DISLIKE"
            r3 = 1
            r1.<init>(r2, r3)
            p000.n81.f7457 = r1
            n81 r2 = new n81
            java.lang.String r3 = "NOT_RELATED_RECOMMEND"
            r4 = 2
            r2.<init>(r3, r4)
            p000.n81.f7458 = r2
            n81[] r0 = new p000.n81[]{r0, r1, r2}
            p000.n81.f7459 = r0
            return
    }

    public static p000.n81 valueOf(java.lang.String r1) {
            java.lang.Class<n81> r0 = p000.n81.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            n81 r1 = (p000.n81) r1
            return r1
    }

    public static p000.n81[] values() {
            n81[] r0 = p000.n81.f7459
            java.lang.Object r0 = r0.clone()
            n81[] r0 = (p000.n81[]) r0
            return r0
    }
}
