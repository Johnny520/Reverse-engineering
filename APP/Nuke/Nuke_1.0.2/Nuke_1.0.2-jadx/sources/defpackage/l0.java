package defpackage;

import android.content.Context;
import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xk1 i;
    public final /* synthetic */ xk1 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ xk1 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, int i) {
        this.h = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.i = xk1Var;
        this.j = xk1Var2;
        this.n = xk1Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        String strP;
        int i = this.h;
        a83 a83Var = a83.a;
        eb ebVar = nx.a;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.k;
        int i2 = 1;
        switch (i) {
            case 0:
                List list = (List) obj6;
                String str = (String) obj5;
                in0 in0Var = (in0) obj4;
                kx1 kx1Var = (kx1) this.n;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.R();
                } else {
                    xk1 xk1Var = this.i;
                    String str2 = (String) xk1Var.getValue();
                    Object objL = go0Var.L();
                    if (objL == ebVar) {
                        objL = new h0(xk1Var, 8);
                        go0Var.f0(objL);
                    }
                    String strP2 = rg3.P(R.string.ai_chat_model_list_search, go0Var);
                    xk1 xk1Var2 = this.j;
                    tp0.b(str2, (in0) objL, null, strP2, null, null, false, 0, 0, ((n1) xk1Var2.getValue()) instanceof l1, false, null, null, null, go0Var, 48, 0, 15860);
                    rp0.O(go0Var, te.O(rh1.a, 10.0f));
                    n1 n1Var = (n1) xk1Var2.getValue();
                    if (t11.l(n1Var, m1.a)) {
                        go0Var.W(-970546026);
                        se.e(p40.b, go0Var, 6);
                        go0Var.p(false);
                    } else if (n1Var instanceof k1) {
                        go0Var.W(-969987437);
                        se.e(xe1.i0(1460439071, new x(i2, (k1) n1Var, kx1Var), go0Var), go0Var, 6);
                        go0Var.p(false);
                    } else if (!(n1Var instanceof l1)) {
                        go0Var.W(384333736);
                        go0Var.p(false);
                        c80.s();
                    } else {
                        go0Var.W(-969345520);
                        if (list.isEmpty()) {
                            go0Var.W(-969328253);
                            se.e(p40.c, go0Var, 6);
                            go0Var.p(false);
                        } else {
                            go0Var.W(-969056693);
                            uh1 uh1VarP = te.P(te.e, 0.0f, 380.0f, 1);
                            boolean zH = go0Var.h(list) | go0Var.f(str) | go0Var.f(in0Var);
                            Object objL2 = go0Var.L();
                            if (zH || objL2 == ebVar) {
                                objL2 = new m0(list, str, in0Var, 0);
                                go0Var.f0(objL2);
                            }
                            rg3.d(6, 510, null, null, null, go0Var, null, (in0) objL2, null, uh1VarP, null, false);
                            go0Var.p(false);
                        }
                        go0Var.p(false);
                    }
                }
                break;
            case 1:
                vy1 vy1Var = (vy1) obj6;
                j20 j20Var = (j20) obj5;
                Context context = (Context) obj4;
                pb2 pb2Var = (pb2) obj;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) pxVar2).f(pb2Var) ? 4 : 2;
                }
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    go0Var2.R();
                } else {
                    String strP3 = rg3.P(R.string.home_settings_cancel, go0Var2);
                    xk1 xk1Var3 = this.i;
                    boolean z = !((Boolean) xk1Var3.getValue()).booleanValue();
                    uh1 uh1VarA = pb2.a(pb2Var);
                    Object objL3 = go0Var2.L();
                    xk1 xk1Var4 = this.j;
                    if (objL3 == ebVar) {
                        objL3 = new a02(xk1Var4, 2);
                        go0Var2.f0(objL3);
                    }
                    se.r(strP3, (xm0) objL3, uh1VarA, z, 0, go0Var2, 48, 48);
                    if (vy1Var.d) {
                        go0Var2.W(-206257018);
                        strP = rg3.P(R.string.script_settings_authorize_and_enable, go0Var2);
                        go0Var2.p(false);
                    } else {
                        go0Var2.W(-206143279);
                        strP = rg3.P(R.string.script_settings_authorize, go0Var2);
                        go0Var2.p(false);
                    }
                    String str3 = strP;
                    boolean z2 = !((Boolean) xk1Var3.getValue()).booleanValue();
                    uh1 uh1VarA2 = pb2.a(pb2Var);
                    boolean zH2 = go0Var2.h(j20Var) | go0Var2.h(vy1Var) | go0Var2.h(context);
                    Object objL4 = go0Var2.L();
                    if (zH2 || objL4 == ebVar) {
                        mf mfVar = new mf(j20Var, xk1Var3, vy1Var, xk1Var4, this.n, context, 3);
                        go0Var2.f0(mfVar);
                        objL4 = mfVar;
                    }
                    se.q(str3, (xm0) objL4, uh1VarA2, z2, 0, go0Var2, 0, 48);
                }
                break;
            default:
                j20 j20Var2 = (j20) obj6;
                cq1 cq1Var = (cq1) obj5;
                Context context2 = (Context) obj4;
                pb2 pb2Var2 = (pb2) obj;
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                pb2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((go0) pxVar3).f(pb2Var2) ? 4 : 2;
                }
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    go0Var3.R();
                } else {
                    String strP4 = rg3.P(R.string.home_settings_cancel, go0Var3);
                    xk1 xk1Var5 = this.i;
                    boolean z3 = !((Boolean) xk1Var5.getValue()).booleanValue();
                    uh1 uh1VarA3 = pb2.a(pb2Var2);
                    Object objL5 = go0Var3.L();
                    xk1 xk1Var6 = this.j;
                    if (objL5 == ebVar) {
                        objL5 = new a02(xk1Var6, 1);
                        go0Var3.f0(objL5);
                    }
                    se.r(strP4, (xm0) objL5, uh1VarA3, z3, 0, go0Var3, 48, 48);
                    String strP5 = rg3.P(R.string.script_settings_revoke, go0Var3);
                    boolean z4 = !((Boolean) xk1Var5.getValue()).booleanValue();
                    uh1 uh1VarA4 = pb2.a(pb2Var2);
                    boolean zH3 = go0Var3.h(j20Var2) | go0Var3.h(cq1Var) | go0Var3.h(context2);
                    Object objL6 = go0Var3.L();
                    if (zH3 || objL6 == ebVar) {
                        mf mfVar2 = new mf(j20Var2, xk1Var5, cq1Var, xk1Var6, this.n, context2, 2);
                        go0Var3.f0(mfVar2);
                        objL6 = mfVar2;
                    }
                    se.q(strP5, (xm0) objL6, uh1VarA4, z4, 0, go0Var3, 0, 48);
                }
                break;
        }
        return a83Var;
    }
}
