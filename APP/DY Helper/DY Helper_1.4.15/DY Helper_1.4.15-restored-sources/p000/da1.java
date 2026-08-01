package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum da1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ζ */
    public static final p000.da1 f3011 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.da1 f3012 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.da1 f3013 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.da1 f3014 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.da1 f3015 = null;

    /* JADX INFO: renamed from: λ */
    public static final /* synthetic */ p000.da1[] f3016 = null;

    /* JADX INFO: renamed from: ε */
    public final int f3017;

    static {
            da1 r0 = new da1
            r1 = 0
            r2 = 1
            java.lang.String r3 = "PCM_8_BIT"
            r0.<init>(r1, r2, r3)
            p000.da1.f3011 = r0
            da1 r1 = new da1
            r3 = 2
            java.lang.String r4 = "PCM_16_BIT"
            r1.<init>(r2, r3, r4)
            p000.da1.f3012 = r1
            da1 r2 = new da1
            r4 = 3
            java.lang.String r5 = "PCM_24_BIT_PACKED"
            r2.<init>(r3, r4, r5)
            p000.da1.f3013 = r2
            da1 r3 = new da1
            r5 = 4
            java.lang.String r6 = "PCM_32_BIT"
            r3.<init>(r4, r5, r6)
            p000.da1.f3014 = r3
            da1 r4 = new da1
            java.lang.String r6 = "PCM_FLOAT"
            r4.<init>(r5, r5, r6)
            p000.da1.f3015 = r4
            da1[] r0 = new p000.da1[]{r0, r1, r2, r3, r4}
            p000.da1.f3016 = r0
            return
    }

    da1(int r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3, r1)
            r0.f3017 = r2
            return
    }

    public static p000.da1 valueOf(java.lang.String r1) {
            java.lang.Class<da1> r0 = p000.da1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            da1 r1 = (p000.da1) r1
            return r1
    }

    public static p000.da1[] values() {
            da1[] r0 = p000.da1.f3016
            java.lang.Object r0 = r0.clone()
            da1[] r0 = (p000.da1[]) r0
            return r0
    }
}
