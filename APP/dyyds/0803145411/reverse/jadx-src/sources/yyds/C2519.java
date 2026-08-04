package yyds;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᲇᲀᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2519 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12426;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0903 f12427;

    public /* synthetic */ C2519(C0903 c0903, int i) {
        this.f12426 = i;
        this.f12427 = c0903;
    }

    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final Object mo371(Object obj) {
        int i = this.f12426;
        C0903 c0903 = this.f12427;
        switch (i) {
            case 0:
                C0536 c0536 = new C0536((Method) ((Member) obj));
                Object obj2 = c0903.f4116;
                if (obj2 != null) {
                    c0536.mo1374(obj2);
                }
                return c0536;
            case 1:
                C1956 c1956 = new C1956((Constructor) ((Member) obj));
                Object obj3 = c0903.f4116;
                return c1956;
            case 2:
                C1558 c1558 = new C1558((Field) ((Member) obj));
                Object obj4 = c0903.f4116;
                if (obj4 != null) {
                    c1558.mo1374(obj4);
                }
                return c1558;
            case 3:
                C0536 c05362 = new C0536((Method) ((Member) obj));
                Object obj5 = c0903.f4116;
                if (obj5 != null) {
                    c05362.mo1374(obj5);
                }
                return c05362;
            case 4:
                C1956 c19562 = new C1956((Constructor) ((Member) obj));
                Object obj6 = c0903.f4116;
                return c19562;
            case 5:
                C1558 c15582 = new C1558((Field) ((Member) obj));
                Object obj7 = c0903.f4116;
                if (obj7 != null) {
                    c15582.mo1374(obj7);
                }
                return c15582;
            case 6:
                C0536 c05363 = new C0536((Method) ((Member) obj));
                Object obj8 = c0903.f4116;
                if (obj8 != null) {
                    c05363.mo1374(obj8);
                }
                return c05363;
            case 7:
                C1956 c19563 = new C1956((Constructor) ((Member) obj));
                Object obj9 = c0903.f4116;
                return c19563;
            default:
                C1558 c15583 = new C1558((Field) ((Member) obj));
                Object obj10 = c0903.f4116;
                if (obj10 != null) {
                    c15583.mo1374(obj10);
                }
                return c15583;
        }
    }
}
