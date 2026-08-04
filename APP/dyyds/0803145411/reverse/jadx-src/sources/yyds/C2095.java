package yyds;

/* JADX INFO: renamed from: yyds.ᲀᲁᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2095 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0645 f10382;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10383;

    public native /* synthetic */ C2095(C0645 c0645, InterfaceC0274 interfaceC0274, int i);

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f10383;
        C2746 c2746 = C2746.f13459;
        C0645 c0645 = this.f10382;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                c0645.mo371(Boolean.TRUE);
                break;
            default:
                AbstractC1544.m3189(obj);
                c0645.mo371(Boolean.FALSE);
                break;
        }
        return c2746;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f10383;
        C0645 c0645 = this.f10382;
        switch (i) {
            case 0:
                return new C2095(c0645, interfaceC0274, 0);
            default:
                return new C2095(c0645, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f10383;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                ((C2095) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            default:
                ((C2095) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
        }
        return c2746;
    }
}
