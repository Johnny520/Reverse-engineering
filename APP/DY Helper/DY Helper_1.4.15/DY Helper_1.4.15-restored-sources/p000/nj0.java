package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum nj0 extends java.lang.Enum {

    /* JADX INFO: renamed from: ζ */
    public static final p000.nj0 f7642 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.nj0 f7643 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.nj0 f7644 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.nj0 f7645 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.nj0 f7646 = null;

    /* JADX INFO: renamed from: λ */
    public static final /* synthetic */ p000.nj0[] f7647 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f7648;

    static {
            nj0 r0 = new nj0
            r1 = 0
            java.lang.String r2 = "陌生人"
            java.lang.String r3 = "STRANGER"
            r0.<init>(r1, r3, r2)
            p000.nj0.f7642 = r0
            nj0 r1 = new nj0
            r2 = 1
            java.lang.String r3 = "互相关注"
            java.lang.String r4 = "MUTUAL"
            r1.<init>(r2, r4, r3)
            p000.nj0.f7643 = r1
            nj0 r2 = new nj0
            r3 = 2
            java.lang.String r4 = "已关注"
            java.lang.String r5 = "FOLLOWING"
            r2.<init>(r3, r5, r4)
            p000.nj0.f7644 = r2
            nj0 r3 = new nj0
            r4 = 3
            java.lang.String r5 = "粉丝"
            java.lang.String r6 = "FAN"
            r3.<init>(r4, r6, r5)
            p000.nj0.f7645 = r3
            nj0 r4 = new nj0
            r5 = 4
            java.lang.String r6 = "其他"
            java.lang.String r7 = "OTHER"
            r4.<init>(r5, r7, r6)
            p000.nj0.f7646 = r4
            nj0[] r0 = new p000.nj0[]{r0, r1, r2, r3, r4}
            p000.nj0.f7647 = r0
            return
    }

    nj0(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.f7648 = r3
            return
    }

    public static p000.nj0 valueOf(java.lang.String r1) {
            java.lang.Class<nj0> r0 = p000.nj0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            nj0 r1 = (p000.nj0) r1
            return r1
    }

    public static p000.nj0[] values() {
            nj0[] r0 = p000.nj0.f7647
            java.lang.Object r0 = r0.clone()
            nj0[] r0 = (p000.nj0[]) r0
            return r0
    }
}
