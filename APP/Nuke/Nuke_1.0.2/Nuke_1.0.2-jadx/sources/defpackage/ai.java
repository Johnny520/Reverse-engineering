package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ai implements on0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;
    public final /* synthetic */ xk1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ai(List list, xk1 xk1Var, int i) {
        this.h = i;
        this.i = list;
        this.j = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.h;
        a83 a83Var = a83.a;
        eb ebVar = nx.a;
        List list = this.i;
        xk1 xk1Var = this.j;
        switch (i) {
            case 0:
                o71 o71Var = (o71) obj;
                int iIntValue = ((Number) obj2).intValue();
                px pxVar = (px) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((go0) pxVar).f(o71Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((go0) pxVar).d(iIntValue) ? 32 : 16;
                }
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(i2 & 1, (i2 & 147) != 146)) {
                    go0Var.R();
                } else {
                    s62 s62Var = (s62) list.get(iIntValue);
                    go0Var.W(698952505);
                    boolean zContains = ((Set) xk1Var.getValue()).contains(s62Var.a);
                    boolean zF = go0Var.f(xk1Var) | go0Var.f(s62Var);
                    Object objL = go0Var.L();
                    if (zF || objL == ebVar) {
                        objL = new zh(0, s62Var, xk1Var);
                        go0Var.f0(objL);
                    }
                    s11.p(s62Var, zContains, (in0) objL, go0Var, 0);
                    op0.a(null, 0.5f, ((lp1) go0Var.j(ur1.a)).d, go0Var, 48, 1);
                    go0Var.p(false);
                }
                break;
            case 1:
                o71 o71Var2 = (o71) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                px pxVar2 = (px) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((go0) pxVar2).f(o71Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= ((go0) pxVar2).d(iIntValue3) ? 32 : 16;
                }
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(i3 & 1, (i3 & 147) != 146)) {
                    go0Var2.R();
                } else {
                    g33 g33Var = (g33) list.get(iIntValue3);
                    go0Var2.W(-1599649350);
                    boolean zContains2 = ((Set) xk1Var.getValue()).contains(g33Var.a);
                    boolean zF2 = go0Var2.f(xk1Var) | go0Var2.f(g33Var);
                    Object objL2 = go0Var2.L();
                    if (zF2 || objL2 == ebVar) {
                        objL2 = new zh(1, g33Var, xk1Var);
                        go0Var2.f0(objL2);
                    }
                    t11.f(g33Var, zContains2, (in0) objL2, go0Var2, 0);
                    op0.a(null, 0.5f, ((lp1) go0Var2.j(ur1.a)).d, go0Var2, 48, 1);
                    go0Var2.p(false);
                }
                break;
            case 2:
                o71 o71Var3 = (o71) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                px pxVar3 = (px) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (((go0) pxVar3).f(o71Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= ((go0) pxVar3).d(iIntValue5) ? 32 : 16;
                }
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(i4 & 1, (i4 & 147) != 146)) {
                    go0Var3.R();
                } else {
                    xt0 xt0Var = (xt0) list.get(iIntValue5);
                    go0Var3.W(-772896861);
                    boolean z = iIntValue5 == 0;
                    boolean zH = go0Var3.h(xt0Var);
                    Object objL3 = go0Var3.L();
                    if (zH || objL3 == ebVar) {
                        objL3 = new x0(2, xt0Var, xk1Var);
                        go0Var3.f0(objL3);
                    }
                    s11.k(xt0Var, z, (xm0) objL3, go0Var3, 0);
                    go0Var3.p(false);
                }
                break;
            default:
                o71 o71Var4 = (o71) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                px pxVar4 = (px) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i5 = (iIntValue8 & 6) == 0 ? iIntValue8 | (((go0) pxVar4).f(o71Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= ((go0) pxVar4).d(iIntValue7) ? 32 : 16;
                }
                go0 go0Var4 = (go0) pxVar4;
                if (!go0Var4.O(i5 & 1, (i5 & 147) != 146)) {
                    go0Var4.R();
                } else {
                    jc3 jc3Var = (jc3) list.get(iIntValue7);
                    go0Var4.W(824619610);
                    boolean zContains3 = ((Set) xk1Var.getValue()).contains(jc3Var.a);
                    boolean zF3 = go0Var4.f(xk1Var) | go0Var4.f(jc3Var);
                    Object objL4 = go0Var4.L();
                    if (zF3 || objL4 == ebVar) {
                        objL4 = new zh(12, jc3Var, xk1Var);
                        go0Var4.f0(objL4);
                    }
                    se.j(jc3Var, zContains3, (in0) objL4, go0Var4, 0);
                    op0.a(null, 0.5f, ((lp1) go0Var4.j(ur1.a)).d, go0Var4, 48, 1);
                    go0Var4.p(false);
                }
                break;
        }
        return a83Var;
    }
}
