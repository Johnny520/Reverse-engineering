package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum fg1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.fg1 f3929 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.fg1 f3930 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.fg1 f3931 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.fg1[] f3932 = null;

    static {
            fg1 r0 = new fg1
            java.lang.String r1 = "MUTUAL_MESSAGE"
            r2 = 0
            r0.<init>(r1, r2)
            p000.fg1.f3929 = r0
            fg1 r1 = new fg1
            java.lang.String r2 = "CONTENT_SHARE"
            r3 = 1
            r1.<init>(r2, r3)
            p000.fg1.f3930 = r1
            fg1 r2 = new fg1
            java.lang.String r3 = "OTHER"
            r4 = 2
            r2.<init>(r3, r4)
            p000.fg1.f3931 = r2
            fg1[] r0 = new p000.fg1[]{r0, r1, r2}
            p000.fg1.f3932 = r0
            return
    }

    public static p000.fg1 valueOf(java.lang.String r1) {
            java.lang.Class<fg1> r0 = p000.fg1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fg1 r1 = (p000.fg1) r1
            return r1
    }

    public static p000.fg1[] values() {
            fg1[] r0 = p000.fg1.f3932
            java.lang.Object r0 = r0.clone()
            fg1[] r0 = (p000.fg1[]) r0
            return r0
    }
}
