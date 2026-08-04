package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛲᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0801 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Exception f3679;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3680;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0801(Exception exc, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f3680 = i;
        this.f3679 = exc;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f3680;
        C2746 c2746 = C2746.f13459;
        Exception exc = this.f3679;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                C1624.m3320();
                AbstractC1960.m3789(AbstractC2328.m4341(-194961023337326L) + exc.getMessage());
                break;
            default:
                AbstractC1544.m3189(obj);
                AbstractC1960.m3789(AbstractC2328.m4341(-780811742380910L) + exc.getMessage());
                break;
        }
        return c2746;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f3680;
        Exception exc = this.f3679;
        switch (i) {
            case 0:
                return new C0801(exc, interfaceC0274, 0);
            default:
                return new C0801(exc, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f3680;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                ((C0801) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            default:
                ((C0801) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
        }
        return c2746;
    }
}
