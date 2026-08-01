package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum bw1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.bw1 f1875 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.bw1 f1876 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.bw1 f1877 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.bw1[] f1878 = null;

    static {
            bw1 r0 = new bw1
            java.lang.String r1 = "START"
            r2 = 0
            r0.<init>(r1, r2)
            p000.bw1.f1875 = r0
            bw1 r1 = new bw1
            java.lang.String r2 = "STOP"
            r3 = 1
            r1.<init>(r2, r3)
            p000.bw1.f1876 = r1
            bw1 r2 = new bw1
            java.lang.String r3 = "STOP_AND_RESET_REPLAY_CACHE"
            r4 = 2
            r2.<init>(r3, r4)
            p000.bw1.f1877 = r2
            bw1[] r0 = new p000.bw1[]{r0, r1, r2}
            p000.bw1.f1878 = r0
            return
    }

    public static p000.bw1 valueOf(java.lang.String r1) {
            java.lang.Class<bw1> r0 = p000.bw1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bw1 r1 = (p000.bw1) r1
            return r1
    }

    public static p000.bw1[] values() {
            bw1[] r0 = p000.bw1.f1878
            java.lang.Object r0 = r0.clone()
            bw1[] r0 = (p000.bw1[]) r0
            return r0
    }
}
