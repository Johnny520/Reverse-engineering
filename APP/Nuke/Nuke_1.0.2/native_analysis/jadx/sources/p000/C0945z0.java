package p000;

import java.util.List;
import nuke.module.wechat.p002ai.AIModelInfo;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0945z0 implements on0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13690h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f13691i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f13692j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f13693k;

    public /* synthetic */ C0945z0(List list, Object obj, Object obj2, int i) {
        this.f13690h = i;
        this.f13691i = list;
        this.f13692j = obj;
        this.f13693k = obj2;
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: o */
    public final Object mo171o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f13690h;
        a83 a83Var = a83.f116a;
        Object obj5 = this.f13693k;
        List list = this.f13691i;
        Object obj6 = this.f13692j;
        C0160eb c0160eb = C0520nx.f7360a;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                o71 o71Var = (o71) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                in0 in0Var = (in0) obj5;
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((go0) interfaceC0596px).m1980f(o71Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= ((go0) interfaceC0596px).m1976d(iIntValue) ? 32 : 16;
                }
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(i4 & 1, (i4 & 147) != 146)) {
                    go0Var.m1961R();
                } else {
                    AIModelInfo aIModelInfo = (AIModelInfo) list.get(iIntValue);
                    go0Var.m1966W(-1134965831);
                    boolean zM5086l = t11.m5086l(aIModelInfo.getId(), (String) obj6);
                    boolean zM1980f = go0Var.m1980f(in0Var) | go0Var.m1984h(aIModelInfo);
                    Object objM1956L = go0Var.m1956L();
                    Object obj7 = objM1956L;
                    if (zM1980f || objM1956L == c0160eb) {
                        C0867x0 c0867x0 = new C0867x0(i2, in0Var, aIModelInfo);
                        go0Var.m1981f0(c0867x0);
                        obj7 = c0867x0;
                    }
                    AbstractC0691se.m4832c(aIModelInfo, zM5086l, (xm0) obj7, go0Var, AIModelInfo.$stable);
                    op0.m3579a(null, 0.5f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6236d, go0Var, 48, 1);
                    go0Var.m1994p(false);
                }
                break;
            default:
                o71 o71Var2 = (o71) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                xk1 xk1Var = (xk1) obj6;
                int i5 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((go0) interfaceC0596px2).m1980f(o71Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i5 |= ((go0) interfaceC0596px2).m1976d(iIntValue3) ? 32 : 16;
                }
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(i5 & 1, (i5 & 147) != 146)) {
                    go0Var2.m1961R();
                } else {
                    C0971zq c0971zq = (C0971zq) list.get(iIntValue3);
                    go0Var2.m1966W(-1816796736);
                    boolean z = iIntValue3 > 0;
                    boolean z2 = iIntValue3 < AbstractC0179eu.m1431L((List) xk1Var.getValue());
                    boolean zM1984h = go0Var2.m1984h(c0971zq);
                    Object objM1956L2 = go0Var2.m1956L();
                    Object obj8 = objM1956L2;
                    if (zM1984h || objM1956L2 == c0160eb) {
                        C0867x0 c0867x02 = new C0867x0(i3, c0971zq, (xk1) obj5);
                        go0Var2.m1981f0(c0867x02);
                        obj8 = c0867x02;
                    }
                    xm0 xm0Var = (xm0) obj8;
                    int i6 = i5 & 112;
                    int i7 = i6 ^ 48;
                    boolean zM1980f2 = go0Var2.m1980f(xk1Var) | ((i7 > 32 && go0Var2.m1976d(iIntValue3)) || (i5 & 48) == 32);
                    Object objM1956L3 = go0Var2.m1956L();
                    Object obj9 = objM1956L3;
                    if (zM1980f2 || objM1956L3 == c0160eb) {
                        C0783ur c0783ur = new C0783ur(iIntValue3, xk1Var, i2);
                        go0Var2.m1981f0(c0783ur);
                        obj9 = c0783ur;
                    }
                    xm0 xm0Var2 = (xm0) obj9;
                    boolean zM1980f3 = go0Var2.m1980f(xk1Var) | ((i7 > 32 && go0Var2.m1976d(iIntValue3)) || (i5 & 48) == 32);
                    Object objM1956L4 = go0Var2.m1956L();
                    Object obj10 = objM1956L4;
                    if (zM1980f3 || objM1956L4 == c0160eb) {
                        C0783ur c0783ur2 = new C0783ur(iIntValue3, xk1Var, i3);
                        go0Var2.m1981f0(c0783ur2);
                        obj10 = c0783ur2;
                    }
                    xm0 xm0Var3 = (xm0) obj10;
                    boolean zM1980f4 = go0Var2.m1980f(xk1Var);
                    if ((i7 <= 32 || !go0Var2.m1976d(iIntValue3)) && (i5 & 48) != 32) {
                        i3 = 0;
                    }
                    int i8 = (zM1980f4 ? 1 : 0) | i3 | (go0Var2.m1984h(c0971zq) ? 1 : 0);
                    Object objM1956L5 = go0Var2.m1956L();
                    Object obj11 = objM1956L5;
                    if (i8 != 0 || objM1956L5 == c0160eb) {
                        C0820vr c0820vr = new C0820vr(xk1Var, iIntValue3, c0971zq);
                        go0Var2.m1981f0(c0820vr);
                        obj11 = c0820vr;
                    }
                    AbstractC0933yr.m6314c(c0971zq, iIntValue3, z, z2, xm0Var, xm0Var2, xm0Var3, (in0) obj11, go0Var2, i6);
                    if (iIntValue3 != AbstractC0179eu.m1431L((List) xk1Var.getValue())) {
                        go0Var2.m1966W(-1815956544);
                        op0.m3579a(null, 0.5f, ((lp1) go0Var2.m1988j(ur1.f11452a)).f6236d, go0Var2, 48, 1);
                        go0Var2.m1994p(false);
                    } else {
                        go0Var2.m1966W(-1815787687);
                        go0Var2.m1994p(false);
                    }
                    go0Var2.m1994p(false);
                }
                break;
        }
        return a83Var;
    }
}
