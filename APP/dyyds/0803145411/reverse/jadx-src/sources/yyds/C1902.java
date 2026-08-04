package yyds;

import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛸᲇᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1902 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f9623;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1127 f9624;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f9625;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1902(Object obj, C1127 c1127, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f9625 = i;
        this.f9623 = obj;
        this.f9624 = c1127;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f9625;
        C2746 c2746 = C2746.f13459;
        C1127 c1127 = this.f9624;
        Object obj2 = this.f9623;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                TextView textView = c1127.f5195;
                if (!(obj2 instanceof C2658)) {
                    textView.setText((String) obj2);
                }
                Throwable thM4249 = C2248.m4249(obj2);
                if (thM4249 != null) {
                    textView.setText(AbstractC2328.m4341(-188853579842414L) + thM4249.getMessage());
                }
                break;
            default:
                AbstractC1544.m3189(obj);
                TextView textView2 = c1127.f5190;
                if (!(obj2 instanceof C2658)) {
                    textView2.setText((String) obj2);
                }
                Throwable thM42492 = C2248.m4249(obj2);
                if (thM42492 != null) {
                    textView2.setText(AbstractC2328.m4341(-151156651885422L) + thM42492.getMessage());
                }
                break;
        }
        return c2746;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f9625;
        C1127 c1127 = this.f9624;
        Object obj2 = this.f9623;
        switch (i) {
            case 0:
                return new C1902(obj2, c1127, interfaceC0274, 0);
            default:
                return new C1902(obj2, c1127, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f9625;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                ((C1902) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            default:
                ((C1902) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
        }
        return c2746;
    }
}
