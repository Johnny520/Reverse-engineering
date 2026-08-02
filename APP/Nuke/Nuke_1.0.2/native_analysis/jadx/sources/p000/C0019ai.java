package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ai */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0019ai implements on0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f206h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f207i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f208j;

    public /* synthetic */ C0019ai(List list, xk1 xk1Var, int i) {
        this.f206h = i;
        this.f207i = list;
        this.f208j = xk1Var;
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: o */
    public final Object mo171o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f206h;
        a83 a83Var = a83.f116a;
        C0160eb c0160eb = C0520nx.f7360a;
        List list = this.f207i;
        xk1 xk1Var = this.f208j;
        switch (i) {
            case 0:
                o71 o71Var = (o71) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((go0) interfaceC0596px).m1980f(o71Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((go0) interfaceC0596px).m1976d(iIntValue) ? 32 : 16;
                }
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
                    go0Var.m1961R();
                } else {
                    s62 s62Var = (s62) list.get(iIntValue);
                    go0Var.m1966W(698952505);
                    boolean zContains = ((Set) xk1Var.getValue()).contains(s62Var.f9944a);
                    boolean zM1980f = go0Var.m1980f(xk1Var) | go0Var.m1980f(s62Var);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1980f || objM1956L == c0160eb) {
                        objM1956L = new C0962zh(0, s62Var, xk1Var);
                        go0Var.m1981f0(objM1956L);
                    }
                    s11.m4712p(s62Var, zContains, (in0) objM1956L, go0Var, 0);
                    op0.m3579a(null, 0.5f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6236d, go0Var, 48, 1);
                    go0Var.m1994p(false);
                }
                break;
            case 1:
                o71 o71Var2 = (o71) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((go0) interfaceC0596px2).m1980f(o71Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= ((go0) interfaceC0596px2).m1976d(iIntValue3) ? 32 : 16;
                }
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(i3 & 1, (i3 & 147) != 146)) {
                    go0Var2.m1961R();
                } else {
                    g33 g33Var = (g33) list.get(iIntValue3);
                    go0Var2.m1966W(-1599649350);
                    boolean zContains2 = ((Set) xk1Var.getValue()).contains(g33Var.f3298a);
                    boolean zM1980f2 = go0Var2.m1980f(xk1Var) | go0Var2.m1980f(g33Var);
                    Object objM1956L2 = go0Var2.m1956L();
                    if (zM1980f2 || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0962zh(1, g33Var, xk1Var);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    t11.m5080f(g33Var, zContains2, (in0) objM1956L2, go0Var2, 0);
                    op0.m3579a(null, 0.5f, ((lp1) go0Var2.m1988j(ur1.f11452a)).f6236d, go0Var2, 48, 1);
                    go0Var2.m1994p(false);
                }
                break;
            case 2:
                o71 o71Var3 = (o71) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (((go0) interfaceC0596px3).m1980f(o71Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= ((go0) interfaceC0596px3).m1976d(iIntValue5) ? 32 : 16;
                }
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(i4 & 1, (i4 & 147) != 146)) {
                    go0Var3.m1961R();
                } else {
                    xt0 xt0Var = (xt0) list.get(iIntValue5);
                    go0Var3.m1966W(-772896861);
                    boolean z = iIntValue5 == 0;
                    boolean zM1984h = go0Var3.m1984h(xt0Var);
                    Object objM1956L3 = go0Var3.m1956L();
                    if (zM1984h || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0867x0(2, xt0Var, xk1Var);
                        go0Var3.m1981f0(objM1956L3);
                    }
                    s11.m4702k(xt0Var, z, (xm0) objM1956L3, go0Var3, 0);
                    go0Var3.m1994p(false);
                }
                break;
            default:
                o71 o71Var4 = (o71) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i5 = (iIntValue8 & 6) == 0 ? iIntValue8 | (((go0) interfaceC0596px4).m1980f(o71Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= ((go0) interfaceC0596px4).m1976d(iIntValue7) ? 32 : 16;
                }
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (!go0Var4.m1958O(i5 & 1, (i5 & 147) != 146)) {
                    go0Var4.m1961R();
                } else {
                    jc3 jc3Var = (jc3) list.get(iIntValue7);
                    go0Var4.m1966W(824619610);
                    boolean zContains3 = ((Set) xk1Var.getValue()).contains(jc3Var.f4964a);
                    boolean zM1980f3 = go0Var4.m1980f(xk1Var) | go0Var4.m1980f(jc3Var);
                    Object objM1956L4 = go0Var4.m1956L();
                    if (zM1980f3 || objM1956L4 == c0160eb) {
                        objM1956L4 = new C0962zh(12, jc3Var, xk1Var);
                        go0Var4.m1981f0(objM1956L4);
                    }
                    AbstractC0691se.m4839j(jc3Var, zContains3, (in0) objM1956L4, go0Var4, 0);
                    op0.m3579a(null, 0.5f, ((lp1) go0Var4.m1988j(ur1.f11452a)).f6236d, go0Var4, 48, 1);
                    go0Var4.m1994p(false);
                }
                break;
        }
        return a83Var;
    }
}
