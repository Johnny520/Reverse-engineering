package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛶᛵᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1348 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f6239;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2133 f6240;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6241;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f6242;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1348(C2133 c2133, String str, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f6241 = i;
        this.f6240 = c2133;
        this.f6242 = str;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f6241;
        String str = this.f6242;
        C2133 c2133 = this.f6240;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        switch (i) {
            case 0:
                int i2 = this.f6239;
                try {
                    if (i2 == 0) {
                        AbstractC1544.m3189(obj);
                        C0380 c0380 = (C0380) c2133.f10555;
                        this.f6239 = 1;
                        c0380.getClass();
                        obj = AbstractC1960.m3774(c0380.f1954, this, new C2085(AbstractC2328.m4341(-1402705826972526L), 12, str), true, false);
                        if (obj == enumC1765) {
                            return enumC1765;
                        }
                    } else {
                        if (i2 != 1) {
                            C0188.m800(AbstractC2328.m4341(-1516367841493870L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (!AbstractC0473.m1313((String) obj2)) {
                            arrayList.add(obj2);
                        }
                        break;
                    }
                    return arrayList;
                } catch (Exception e) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1516329186788206L), e);
                    return C1860.f9345;
                }
            default:
                int i3 = this.f6239;
                try {
                } catch (Exception e2) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1714056596194158L), e2);
                }
                if (i3 == 0) {
                    AbstractC1544.m3189(obj);
                    C0380 c03802 = (C0380) c2133.f10555;
                    this.f6239 = 1;
                    c03802.getClass();
                    obj = AbstractC1960.m3774(c03802.f1954, this, new C2085(AbstractC2328.m4341(-1402400884294510L), 8, str), true, false);
                    if (obj == enumC1765) {
                        return enumC1765;
                    }
                } else {
                    if (i3 != 1) {
                        C0188.m800(AbstractC2328.m4341(-1714078071030638L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                }
                return (C2770) obj;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f6241;
        String str = this.f6242;
        C2133 c2133 = this.f6240;
        switch (i) {
            case 0:
                return new C1348(c2133, str, interfaceC0274, 0);
            default:
                return new C1348(c2133, str, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f6241;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C1348) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
    }
}
