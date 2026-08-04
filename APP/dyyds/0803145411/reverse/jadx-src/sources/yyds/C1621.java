package yyds;

import android.content.Context;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛷᛸᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1621 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8252;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f8253;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f8254;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f8255;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f8256;

    public /* synthetic */ C1621(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f8254 = i;
        this.f8256 = obj;
        this.f8252 = obj2;
        this.f8255 = obj3;
        this.f8253 = obj4;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        int i = this.f8254;
        C2746 c2746 = C2746.f13459;
        Object obj = this.f8253;
        Object obj2 = this.f8255;
        Object obj3 = this.f8252;
        Object obj4 = this.f8256;
        switch (i) {
            case 0:
                C1712.m3455((TextView) obj4, (TextView) obj3, (TextView) obj2, (TextView) obj);
                AbstractC0449.m1235();
                break;
            default:
                C2133 c2133 = (C2133) obj4;
                String str = ((C2770) obj3).f13510;
                C0892 c0892 = new C0892((Context) obj2, (C0438) obj, 1);
                AbstractC2328.m4341(-1140566793028462L);
                AbstractC2071.m3959((C2454) c2133.f10553, null, new C1647(c2133, str, c0892, (InterfaceC0274) null, 11), 3);
                break;
        }
        return c2746;
    }
}
