package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum yf1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.yf1 f12603 = null;

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ p000.yf1[] f12604 = null;

    static {
            yf1 r0 = new yf1
            java.lang.String r1 = "DETECT_ONLY"
            r2 = 0
            r0.<init>(r1, r2)
            p000.yf1.f12603 = r0
            yf1 r1 = new yf1
            java.lang.String r2 = "CLAIM_REWARD"
            r3 = 1
            r1.<init>(r2, r3)
            yf1[] r0 = new p000.yf1[]{r0, r1}
            p000.yf1.f12604 = r0
            return
    }

    public static p000.yf1 valueOf(java.lang.String r1) {
            java.lang.Class<yf1> r0 = p000.yf1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            yf1 r1 = (p000.yf1) r1
            return r1
    }

    public static p000.yf1[] values() {
            yf1[] r0 = p000.yf1.f12604
            java.lang.Object r0 = r0.clone()
            yf1[] r0 = (p000.yf1[]) r0
            return r0
    }
}
