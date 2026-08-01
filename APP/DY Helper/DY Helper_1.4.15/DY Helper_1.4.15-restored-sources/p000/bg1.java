package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum bg1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ζ */
    public static final p000.bg1 f1703 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.bg1 f1704 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.bg1 f1705 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.bg1 f1706 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.bg1 f1707 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.bg1 f1708 = null;

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ p000.bg1[] f1709 = null;

    /* JADX INFO: renamed from: ε */
    public final boolean f1710;

    static {
            bg1 r0 = new bg1
            java.lang.String r1 = "PRECONDITION"
            r2 = 0
            r0.<init>(r1, r2, r2)
            p000.bg1.f1703 = r0
            bg1 r1 = new bg1
            java.lang.String r3 = "SOURCE_UNAVAILABLE"
            r4 = 1
            r1.<init>(r3, r4, r2)
            p000.bg1.f1704 = r1
            r3 = r2
            bg1 r2 = new bg1
            java.lang.String r5 = "HOST_NOT_READY"
            r6 = 2
            r2.<init>(r5, r6, r4)
            p000.bg1.f1705 = r2
            r5 = r3
            bg1 r3 = new bg1
            java.lang.String r6 = "HOST_CALL_FAILED"
            r7 = 3
            r3.<init>(r6, r7, r4)
            p000.bg1.f1706 = r3
            r6 = r4
            bg1 r4 = new bg1
            java.lang.String r7 = "CALLBACK_TIMEOUT"
            r8 = 4
            r4.<init>(r7, r8, r6)
            p000.bg1.f1707 = r4
            r6 = r5
            bg1 r5 = new bg1
            java.lang.String r7 = "CONTRACT_INCOMPATIBLE"
            r8 = 5
            r5.<init>(r7, r8, r6)
            p000.bg1.f1708 = r5
            bg1[] r0 = new p000.bg1[]{r0, r1, r2, r3, r4, r5}
            p000.bg1.f1709 = r0
            return
    }

    bg1(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f1710 = r3
            return
    }

    public static p000.bg1 valueOf(java.lang.String r1) {
            java.lang.Class<bg1> r0 = p000.bg1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bg1 r1 = (p000.bg1) r1
            return r1
    }

    public static p000.bg1[] values() {
            bg1[] r0 = p000.bg1.f1709
            java.lang.Object r0 = r0.clone()
            bg1[] r0 = (p000.bg1[]) r0
            return r0
    }
}
