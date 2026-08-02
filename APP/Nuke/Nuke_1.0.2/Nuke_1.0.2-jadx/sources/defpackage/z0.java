package defpackage;

import java.util.List;
import nuke.module.wechat.ai.AIModelInfo;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements on0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ z0(List list, Object obj, Object obj2, int i) {
        this.h = i;
        this.i = list;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj5 = this.k;
        List list = this.i;
        Object obj6 = this.j;
        eb ebVar = nx.a;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                o71 o71Var = (o71) obj;
                int iIntValue = ((Number) obj2).intValue();
                px pxVar = (px) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                in0 in0Var = (in0) obj5;
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((go0) pxVar).f(o71Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= ((go0) pxVar).d(iIntValue) ? 32 : 16;
                }
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(i4 & 1, (i4 & 147) != 146)) {
                    go0Var.R();
                } else {
                    AIModelInfo aIModelInfo = (AIModelInfo) list.get(iIntValue);
                    go0Var.W(-1134965831);
                    boolean zL = t11.l(aIModelInfo.getId(), (String) obj6);
                    boolean zF = go0Var.f(in0Var) | go0Var.h(aIModelInfo);
                    Object objL = go0Var.L();
                    Object obj7 = objL;
                    if (zF || objL == ebVar) {
                        x0 x0Var = new x0(i2, in0Var, aIModelInfo);
                        go0Var.f0(x0Var);
                        obj7 = x0Var;
                    }
                    se.c(aIModelInfo, zL, (xm0) obj7, go0Var, AIModelInfo.$stable);
                    op0.a(null, 0.5f, ((lp1) go0Var.j(ur1.a)).d, go0Var, 48, 1);
                    go0Var.p(false);
                }
                break;
            default:
                o71 o71Var2 = (o71) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                px pxVar2 = (px) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                xk1 xk1Var = (xk1) obj6;
                int i5 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((go0) pxVar2).f(o71Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i5 |= ((go0) pxVar2).d(iIntValue3) ? 32 : 16;
                }
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(i5 & 1, (i5 & 147) != 146)) {
                    go0Var2.R();
                } else {
                    zq zqVar = (zq) list.get(iIntValue3);
                    go0Var2.W(-1816796736);
                    boolean z = iIntValue3 > 0;
                    boolean z2 = iIntValue3 < eu.L((List) xk1Var.getValue());
                    boolean zH = go0Var2.h(zqVar);
                    Object objL2 = go0Var2.L();
                    Object obj8 = objL2;
                    if (zH || objL2 == ebVar) {
                        x0 x0Var2 = new x0(i3, zqVar, (xk1) obj5);
                        go0Var2.f0(x0Var2);
                        obj8 = x0Var2;
                    }
                    xm0 xm0Var = (xm0) obj8;
                    int i6 = i5 & 112;
                    int i7 = i6 ^ 48;
                    boolean zF2 = go0Var2.f(xk1Var) | ((i7 > 32 && go0Var2.d(iIntValue3)) || (i5 & 48) == 32);
                    Object objL3 = go0Var2.L();
                    Object obj9 = objL3;
                    if (zF2 || objL3 == ebVar) {
                        ur urVar = new ur(iIntValue3, xk1Var, i2);
                        go0Var2.f0(urVar);
                        obj9 = urVar;
                    }
                    xm0 xm0Var2 = (xm0) obj9;
                    boolean zF3 = go0Var2.f(xk1Var) | ((i7 > 32 && go0Var2.d(iIntValue3)) || (i5 & 48) == 32);
                    Object objL4 = go0Var2.L();
                    Object obj10 = objL4;
                    if (zF3 || objL4 == ebVar) {
                        ur urVar2 = new ur(iIntValue3, xk1Var, i3);
                        go0Var2.f0(urVar2);
                        obj10 = urVar2;
                    }
                    xm0 xm0Var3 = (xm0) obj10;
                    boolean zF4 = go0Var2.f(xk1Var);
                    if ((i7 <= 32 || !go0Var2.d(iIntValue3)) && (i5 & 48) != 32) {
                        i3 = 0;
                    }
                    int i8 = (zF4 ? 1 : 0) | i3 | (go0Var2.h(zqVar) ? 1 : 0);
                    Object objL5 = go0Var2.L();
                    Object obj11 = objL5;
                    if (i8 != 0 || objL5 == ebVar) {
                        vr vrVar = new vr(xk1Var, iIntValue3, zqVar);
                        go0Var2.f0(vrVar);
                        obj11 = vrVar;
                    }
                    yr.c(zqVar, iIntValue3, z, z2, xm0Var, xm0Var2, xm0Var3, (in0) obj11, go0Var2, i6);
                    if (iIntValue3 != eu.L((List) xk1Var.getValue())) {
                        go0Var2.W(-1815956544);
                        op0.a(null, 0.5f, ((lp1) go0Var2.j(ur1.a)).d, go0Var2, 48, 1);
                        go0Var2.p(false);
                    } else {
                        go0Var2.W(-1815787687);
                        go0Var2.p(false);
                    }
                    go0Var2.p(false);
                }
                break;
        }
        return a83Var;
    }
}
