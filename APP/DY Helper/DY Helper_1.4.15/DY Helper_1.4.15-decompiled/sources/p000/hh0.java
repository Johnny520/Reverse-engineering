package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum hh0 extends java.lang.Enum {

    /* JADX INFO: renamed from: θ */
    public static final p000.hh0 f4735 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.hh0 f4736 = null;

    /* JADX INFO: renamed from: κ */
    public static final /* synthetic */ p000.hh0[] f4737 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f4738;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f4739;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f4740;

    static {
            hh0 r0 = new hh0
            java.lang.String r4 = "json"
            java.lang.String r5 = "application/json"
            r1 = 0
            java.lang.String r2 = "JSON"
            java.lang.String r3 = "JSON"
            r0.<init>(r1, r2, r3, r4, r5)
            p000.hh0.f4735 = r0
            hh0 r1 = new hh0
            java.lang.String r5 = "txt"
            java.lang.String r6 = "text/plain"
            r2 = 1
            java.lang.String r3 = "TXT"
            java.lang.String r4 = "TXT"
            r1.<init>(r2, r3, r4, r5, r6)
            p000.hh0.f4736 = r1
            hh0[] r0 = new p000.hh0[]{r0, r1}
            p000.hh0.f4737 = r0
            return
    }

    hh0(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.f4738 = r3
            r0.f4739 = r4
            r0.f4740 = r5
            return
    }

    public static p000.hh0 valueOf(java.lang.String r1) {
            java.lang.Class<hh0> r0 = p000.hh0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hh0 r1 = (p000.hh0) r1
            return r1
    }

    public static p000.hh0[] values() {
            hh0[] r0 = p000.hh0.f4737
            java.lang.Object r0 = r0.clone()
            hh0[] r0 = (p000.hh0[]) r0
            return r0
    }
}
