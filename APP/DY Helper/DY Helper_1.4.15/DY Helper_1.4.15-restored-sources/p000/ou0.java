package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum ou0 extends java.lang.Enum {

    /* JADX INFO: renamed from: η */
    public static final p000.rk0 f8254 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.ou0 f8255 = null;

    /* JADX INFO: renamed from: ι */
    public static final /* synthetic */ p000.ou0[] f8256 = null;

    /* JADX INFO: renamed from: ε */
    public final int f8257;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f8258;

    static {
            ou0 r0 = new ou0
            r1 = 0
            java.lang.String r2 = "兼容模式"
            java.lang.String r3 = "COMPATIBLE"
            r0.<init>(r1, r1, r3, r2)
            p000.ou0.f8255 = r0
            ou0 r1 = new ou0
            r2 = 1
            java.lang.String r3 = "小米格式"
            java.lang.String r4 = "XIAOMI"
            r1.<init>(r2, r2, r4, r3)
            ou0 r2 = new ou0
            r3 = 2
            java.lang.String r4 = "OPPO/一加格式"
            java.lang.String r5 = "OPPO"
            r2.<init>(r3, r3, r5, r4)
            ou0[] r0 = new p000.ou0[]{r0, r1, r2}
            p000.ou0.f8256 = r0
            rk0 r0 = new rk0
            r1 = 1
            r0.<init>(r1)
            p000.ou0.f8254 = r0
            return
    }

    ou0(int r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r3, r1)
            r0.f8257 = r2
            r0.f8258 = r4
            return
    }

    public static p000.ou0 valueOf(java.lang.String r1) {
            java.lang.Class<ou0> r0 = p000.ou0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ou0 r1 = (p000.ou0) r1
            return r1
    }

    public static p000.ou0[] values() {
            ou0[] r0 = p000.ou0.f8256
            java.lang.Object r0 = r0.clone()
            ou0[] r0 = (p000.ou0[]) r0
            return r0
    }
}
