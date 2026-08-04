package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛷᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1139 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0832 f5222;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f5223;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5224;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f5225;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1139(C0832 c0832, C0947 c0947, C0947 c09472, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f5224 = i;
        this.f5222 = c0832;
        this.f5223 = c0947;
        this.f5225 = c09472;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f5224;
        C2746 c2746 = C2746.f13459;
        C0947 c0947 = this.f5225;
        C0947 c09472 = this.f5223;
        C0832 c0832 = this.f5222;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                int i2 = c09472.f4410;
                c0832.m1893(i2, c0947.f4410);
                c0832.m1894(i2);
                break;
            case 1:
                AbstractC1544.m3189(obj);
                int i3 = c09472.f4410;
                c0832.m1893(i3, c0947.f4410);
                c0832.m1894(i3);
                break;
            default:
                AbstractC1544.m3189(obj);
                int i4 = c09472.f4410;
                c0832.m1893(i4, c0947.f4410);
                c0832.m1894(i4);
                break;
        }
        return c2746;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        switch (this.f5224) {
            case 0:
                return new C1139(this.f5222, this.f5223, this.f5225, interfaceC0274, 0);
            case 1:
                return new C1139(this.f5222, this.f5223, this.f5225, interfaceC0274, 1);
            default:
                return new C1139(this.f5222, this.f5223, this.f5225, interfaceC0274, 2);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f5224;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                ((C1139) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 1:
                ((C1139) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            default:
                ((C1139) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
        }
        return c2746;
    }
}
