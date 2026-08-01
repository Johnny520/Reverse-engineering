package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum hb0 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.hb0 f4674 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.hb0 f4675 = null;

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ p000.hb0[] f4676 = null;

    static {
            hb0 r0 = new hb0
            java.lang.String r1 = "COLD_START"
            r2 = 0
            r0.<init>(r1, r2)
            p000.hb0.f4674 = r0
            hb0 r1 = new hb0
            java.lang.String r2 = "POLLING"
            r3 = 1
            r1.<init>(r2, r3)
            p000.hb0.f4675 = r1
            hb0[] r0 = new p000.hb0[]{r0, r1}
            p000.hb0.f4676 = r0
            return
    }

    public static p000.hb0 valueOf(java.lang.String r1) {
            java.lang.Class<hb0> r0 = p000.hb0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hb0 r1 = (p000.hb0) r1
            return r1
    }

    public static p000.hb0[] values() {
            hb0[] r0 = p000.hb0.f4676
            java.lang.Object r0 = r0.clone()
            hb0[] r0 = (p000.hb0[]) r0
            return r0
    }
}
