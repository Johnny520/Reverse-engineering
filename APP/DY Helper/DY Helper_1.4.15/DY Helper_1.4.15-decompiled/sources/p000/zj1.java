package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum zj1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ζ */
    public static final p000.rk0 f13129 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.zj1 f13130 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.zj1 f13131 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.zj1 f13132 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.zj1 f13133 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.zj1 f13134 = null;

    /* JADX INFO: renamed from: μ */
    public static final p000.zj1 f13135 = null;

    /* JADX INFO: renamed from: ν */
    public static final p000.zj1 f13136 = null;

    /* JADX INFO: renamed from: ξ */
    public static final /* synthetic */ p000.zj1[] f13137 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f13138;

    static {
            zj1 r0 = new zj1
            r1 = 0
            java.lang.String r2 = "http/1.0"
            java.lang.String r3 = "HTTP_1_0"
            r0.<init>(r1, r3, r2)
            p000.zj1.f13130 = r0
            zj1 r1 = new zj1
            r2 = 1
            java.lang.String r3 = "http/1.1"
            java.lang.String r4 = "HTTP_1_1"
            r1.<init>(r2, r4, r3)
            p000.zj1.f13131 = r1
            zj1 r2 = new zj1
            r3 = 2
            java.lang.String r4 = "spdy/3.1"
            java.lang.String r5 = "SPDY_3"
            r2.<init>(r3, r5, r4)
            p000.zj1.f13132 = r2
            zj1 r3 = new zj1
            r4 = 3
            java.lang.String r5 = "h2"
            java.lang.String r6 = "HTTP_2"
            r3.<init>(r4, r6, r5)
            p000.zj1.f13133 = r3
            zj1 r4 = new zj1
            r5 = 4
            java.lang.String r6 = "h2_prior_knowledge"
            java.lang.String r7 = "H2_PRIOR_KNOWLEDGE"
            r4.<init>(r5, r7, r6)
            p000.zj1.f13134 = r4
            zj1 r5 = new zj1
            r6 = 5
            java.lang.String r7 = "quic"
            java.lang.String r8 = "QUIC"
            r5.<init>(r6, r8, r7)
            p000.zj1.f13135 = r5
            zj1 r6 = new zj1
            r7 = 6
            java.lang.String r8 = "h3"
            java.lang.String r9 = "HTTP_3"
            r6.<init>(r7, r9, r8)
            p000.zj1.f13136 = r6
            zj1[] r0 = new p000.zj1[]{r0, r1, r2, r3, r4, r5, r6}
            p000.zj1.f13137 = r0
            rk0 r0 = new rk0
            r1 = 17
            r0.<init>(r1)
            p000.zj1.f13129 = r0
            return
    }

    zj1(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.f13138 = r3
            return
    }

    public static p000.zj1 valueOf(java.lang.String r1) {
            java.lang.Class<zj1> r0 = p000.zj1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            zj1 r1 = (p000.zj1) r1
            return r1
    }

    public static p000.zj1[] values() {
            zj1[] r0 = p000.zj1.f13137
            java.lang.Object r0 = r0.clone()
            zj1[] r0 = (p000.zj1[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f13138
            return r0
    }
}
