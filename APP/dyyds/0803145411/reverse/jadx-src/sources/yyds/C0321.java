package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛳᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0321 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0876 f1695 = new C0876(new C0321(2), 0);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f1696;

    public C0321(int i) {
        this.f1696 = i;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        int iM3744 = c1942.m3744();
        int iM4012 = AbstractC2104.m4012(iM3744);
        if (iM4012 == 5 || iM4012 == 6) {
            return AbstractC0897.m1991(this.f1696, c1942);
        }
        if (iM4012 == 8) {
            c1942.m3767();
            return null;
        }
        throw new C1600("Expecting number, got: " + AbstractC0897.m1992(iM3744) + "; at path " + c1942.m3749(false));
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        c1405.m2867((Number) obj);
    }
}
