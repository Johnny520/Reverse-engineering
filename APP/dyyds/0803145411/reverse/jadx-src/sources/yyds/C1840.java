package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛸᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1840 extends AbstractC0931 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C1321 f9218;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C2628 f9219;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final AbstractC0986 f9220;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Object f9221;

    public C1840(AbstractC0986 abstractC0986, C1321 c1321, C2628 c2628, Object obj) {
        this.f9220 = abstractC0986;
        this.f9218 = c1321;
        this.f9219 = c2628;
        this.f9221 = obj;
    }

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo925(Throwable th) {
        C2628 c2628 = this.f9219;
        C2628 c2628M2141 = AbstractC0986.m2141(c2628);
        AbstractC0986 abstractC0986 = this.f9220;
        C1321 c1321 = this.f9218;
        Object obj = this.f9221;
        if (c2628M2141 == null || !abstractC0986.m2155(c1321, c2628M2141, obj)) {
            c1321.f6074.m1603(new C2031(2), 2);
            C2628 c2628M21412 = AbstractC0986.m2141(c2628);
            if (c2628M21412 == null || !abstractC0986.m2155(c1321, c2628M21412, obj)) {
                abstractC0986.mo1619(abstractC0986.m2149(c1321, obj));
            }
        }
    }

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final boolean mo926() {
        return false;
    }
}
