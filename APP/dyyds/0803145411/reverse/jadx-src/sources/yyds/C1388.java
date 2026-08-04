package yyds;

/* JADX INFO: renamed from: yyds.ᛶᛸᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1388 implements InterfaceC0097 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6478;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1549 f6479;

    public /* synthetic */ C1388(InterfaceC1549 interfaceC1549, AbstractC0145 abstractC0145, int i) {
        this.f6478 = i;
        this.f6479 = interfaceC1549;
    }

    @Override // yyds.InterfaceC0097
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo385(C1829 c1829) {
        Object c2658;
        switch (this.f6478) {
            case 0:
                AbstractC2328.m4341(-1086922651501422L);
                break;
            default:
                AbstractC2328.m4341(-1000606693753710L);
                try {
                    this.f6479.mo371(c1829);
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    AbstractC0145.m663(AbstractC2328.m4341(-1000645348459374L) + thM4249.getMessage(), thM4249);
                }
                break;
        }
    }

    @Override // yyds.InterfaceC0097
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo399(C0488 c0488) {
        Object c2658;
        switch (this.f6478) {
            case 0:
                AbstractC2328.m4341(-817198705312622L);
                try {
                    this.f6479.mo371(c0488);
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    AbstractC0145.m663(AbstractC2328.m4341(-817237360018286L) + thM4249.getMessage(), thM4249);
                }
                break;
            default:
                AbstractC2328.m4341(-1086961306207086L);
                break;
        }
    }
}
