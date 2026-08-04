package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛲᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2186 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public /* synthetic */ Object f10744;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1549 f10745;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10746;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2186(InterfaceC0274 interfaceC0274, InterfaceC1549 interfaceC1549, int i) {
        super(2, interfaceC0274);
        this.f10746 = i;
        this.f10745 = interfaceC1549;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f10746;
        InterfaceC1549 interfaceC1549 = this.f10745;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                break;
            default:
                AbstractC1544.m3189(obj);
                break;
        }
        return interfaceC1549.mo371(((C0236) this.f10744).mo885());
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f10746;
        InterfaceC1549 interfaceC1549 = this.f10745;
        switch (i) {
            case 0:
                C2186 c2186 = new C2186(interfaceC0274, interfaceC1549, 0);
                c2186.f10744 = obj;
                return c2186;
            default:
                C2186 c21862 = new C2186(interfaceC0274, interfaceC1549, 1);
                c21862.f10744 = obj;
                return c21862;
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f10746;
        C2746 c2746 = C2746.f13459;
        C0236 c0236 = (C0236) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C2186) mo630(c0236, interfaceC0274)).mo474(c2746);
    }
}
