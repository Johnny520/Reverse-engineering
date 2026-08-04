package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛳᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2630 extends AbstractC0931 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0504 f12961;

    public C2630(C0504 c0504) {
        this.f12961 = c0504;
    }

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo925(Throwable th) {
        AbstractC0986 abstractC0986 = this.f4255;
        if (abstractC0986 == null) {
            abstractC0986 = null;
        }
        Object objM2163 = abstractC0986.m2163();
        boolean z = objM2163 instanceof C0417;
        C0504 c0504 = this.f12961;
        if (z) {
            c0504.mo812(new C2658(((C0417) objM2163).f2152));
        } else {
            c0504.mo812(AbstractC0395.m1137(objM2163));
        }
    }

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final boolean mo926() {
        return false;
    }
}
