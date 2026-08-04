package yyds;

import java.io.File;

/* JADX INFO: renamed from: yyds.ᛲᛷᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0393 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ File f2026;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f2027;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2028;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0393(File file, String str, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f2028 = i;
        this.f2026 = file;
        this.f2027 = str;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f2028;
        String str = this.f2027;
        File file = this.f2026;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                C1221.f5600.getClass();
                break;
            default:
                AbstractC1544.m3189(obj);
                C1221.f5600.getClass();
                break;
        }
        return Boolean.valueOf(C1221.m2486(file, str));
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f2028;
        String str = this.f2027;
        File file = this.f2026;
        switch (i) {
            case 0:
                return new C0393(file, str, interfaceC0274, 0);
            default:
                return new C0393(file, str, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f2028;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C0393) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
    }
}
