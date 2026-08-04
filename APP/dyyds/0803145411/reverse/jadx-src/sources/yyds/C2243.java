package yyds;

import android.content.Context;

/* JADX INFO: renamed from: yyds.ᲁᛵᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2243 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f11071;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1939 f11072;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11073;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2243(Context context, C1939 c1939, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f11073 = i;
        this.f11071 = context;
        this.f11072 = c1939;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f11073;
        C2746 c2746 = C2746.f13459;
        C1939 c1939 = this.f11072;
        Context context = this.f11071;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                C1327 c1327 = C1327.f6093;
                C1327.m2618(context);
                C1624.m3320();
                AbstractC1960.m3789(c1939.f9756);
                break;
            default:
                AbstractC1544.m3189(obj);
                C1327 c13272 = C1327.f6093;
                C1327.m2618(context);
                C1624.m3320();
                AbstractC1960.m3789(c1939.f9756);
                break;
        }
        return c2746;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        switch (this.f11073) {
            case 0:
                return new C2243(this.f11071, this.f11072, interfaceC0274, 0);
            default:
                return new C2243(this.f11071, this.f11072, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f11073;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                ((C2243) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            default:
                ((C2243) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
        }
        return c2746;
    }
}
