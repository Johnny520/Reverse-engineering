package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum yg0 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.yg0 f12607 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.yg0 f12608 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.yg0 f12609 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.yg0[] f12610 = null;

    static {
            yg0 r0 = new yg0
            java.lang.String r1 = "SUCCESS"
            r2 = 0
            r0.<init>(r1, r2)
            p000.yg0.f12607 = r0
            yg0 r1 = new yg0
            java.lang.String r2 = "RETRY_AFTER_LAYOUT"
            r3 = 1
            r1.<init>(r2, r3)
            p000.yg0.f12608 = r1
            yg0 r2 = new yg0
            java.lang.String r3 = "FAILED"
            r4 = 2
            r2.<init>(r3, r4)
            p000.yg0.f12609 = r2
            yg0[] r0 = new p000.yg0[]{r0, r1, r2}
            p000.yg0.f12610 = r0
            return
    }

    public static p000.yg0 valueOf(java.lang.String r1) {
            java.lang.Class<yg0> r0 = p000.yg0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            yg0 r1 = (p000.yg0) r1
            return r1
    }

    public static p000.yg0[] values() {
            yg0[] r0 = p000.yg0.f12610
            java.lang.Object r0 = r0.clone()
            yg0[] r0 = (p000.yg0[]) r0
            return r0
    }
}
