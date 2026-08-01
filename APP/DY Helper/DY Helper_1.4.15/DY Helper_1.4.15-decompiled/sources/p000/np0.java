package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum np0 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.np0 f7701 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.np0 f7702 = null;

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ p000.np0[] f7703 = null;

    static {
            np0 r0 = new np0
            java.lang.String r1 = "Ltr"
            r2 = 0
            r0.<init>(r1, r2)
            p000.np0.f7701 = r0
            np0 r1 = new np0
            java.lang.String r2 = "Rtl"
            r3 = 1
            r1.<init>(r2, r3)
            p000.np0.f7702 = r1
            np0[] r0 = new p000.np0[]{r0, r1}
            p000.np0.f7703 = r0
            return
    }

    public static p000.np0 valueOf(java.lang.String r1) {
            java.lang.Class<np0> r0 = p000.np0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            np0 r1 = (p000.np0) r1
            return r1
    }

    public static p000.np0[] values() {
            np0[] r0 = p000.np0.f7703
            java.lang.Object r0 = r0.clone()
            np0[] r0 = (p000.np0[]) r0
            return r0
    }
}
