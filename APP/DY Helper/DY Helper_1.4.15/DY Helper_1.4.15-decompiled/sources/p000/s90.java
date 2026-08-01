package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum s90 extends java.lang.Enum {

    /* JADX INFO: renamed from: θ */
    public static final p000.C0381i2 f9767 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.s90 f9768 = null;

    /* JADX INFO: renamed from: κ */
    public static final /* synthetic */ p000.s90[] f9769 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f9770;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f9771;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f9772;

    static {
            s90 r0 = new s90
            java.lang.String r4 = "GitHub 原站"
            java.lang.String r5 = "https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/geonames/geonames_regions.zip."
            r1 = 0
            java.lang.String r2 = "GITHUB_RAW"
            java.lang.String r3 = "github_raw"
            r0.<init>(r1, r2, r3, r4, r5)
            p000.s90.f9768 = r0
            s90 r1 = new s90
            java.lang.String r5 = "gh-proxy 代理"
            java.lang.String r6 = "https://gh-proxy.org/https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/geonames/geonames_regions.zip."
            r2 = 1
            java.lang.String r3 = "GH_PROXY"
            java.lang.String r4 = "gh_proxy"
            r1.<init>(r2, r3, r4, r5, r6)
            s90[] r0 = new p000.s90[]{r0, r1}
            p000.s90.f9769 = r0
            i2 r0 = new i2
            r1 = 27
            r0.<init>(r1)
            p000.s90.f9767 = r0
            return
    }

    s90(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.f9770 = r3
            r0.f9771 = r4
            r0.f9772 = r5
            return
    }

    public static p000.s90 valueOf(java.lang.String r1) {
            java.lang.Class<s90> r0 = p000.s90.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            s90 r1 = (p000.s90) r1
            return r1
    }

    public static p000.s90[] values() {
            s90[] r0 = p000.s90.f9769
            java.lang.Object r0 = r0.clone()
            s90[] r0 = (p000.s90[]) r0
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.String m5377(int r3) {
            r2 = this;
            r0 = 1
            if (r0 > r3) goto L20
            r1 = 9
            if (r3 >= r1) goto L20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String r0 = "%03d"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            java.lang.String r2 = r2.f9772
            java.lang.String r2 = r2.concat(r3)
            return r2
        L20:
            java.lang.String r2 = "分卷编号超出范围: "
            java.lang.String r2 = p000.a12.m17(r2, r3)
            p000.C1080.m7266(r2)
            r2 = 0
            return r2
    }
}
