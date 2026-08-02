package defpackage;

import android.content.Context;
import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ze implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ze(in0 in0Var, Context context, kx1 kx1Var, xk1 xk1Var, xk1 xk1Var2) {
        this.h = 0;
        this.i = in0Var;
        this.j = context;
        this.k = kx1Var;
        this.l = xk1Var;
        this.m = xk1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        eb ebVar = nx.a;
        a83 a83Var = a83.a;
        Object obj3 = this.m;
        Object obj4 = this.i;
        Object obj5 = this.l;
        Object obj6 = this.k;
        Object obj7 = this.j;
        switch (i) {
            case 0:
                in0 in0Var = (in0) obj4;
                Context context = (Context) obj7;
                kx1 kx1Var = (kx1) obj6;
                xk1 xk1Var = (xk1) obj5;
                xk1 xk1Var2 = (xk1) obj3;
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    yi0 yi0Var = te.g;
                    av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    uh1 uh1VarM = tl.M(go0Var, yi0Var);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, gx.e, avVarA);
                    yf3.c(go0Var, gx.d, yy1VarL);
                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                    yf3.b(go0Var, gx.g);
                    yf3.c(go0Var, gx.c, uh1VarM);
                    tp0.c(rg3.P(R.string.home_settings_check_update, go0Var), null, null, in0Var, go0Var, 0, 30);
                    yi0 yi0Var2 = te.e;
                    jw1 jw1Var = new jw1(18.0f, 4.0f, 18.0f, 20.0f);
                    xf xfVar = new xf(12.0f, new s(2));
                    boolean zH = go0Var.h(context) | go0Var.f(kx1Var);
                    Object objL = go0Var.L();
                    if (zH || objL == ebVar) {
                        pc pcVar = new pc(context, kx1Var, xk1Var, xk1Var2, 1);
                        go0Var.f0(pcVar);
                        objL = pcVar;
                    }
                    rg3.d(24582, 490, null, xfVar, null, go0Var, null, (in0) objL, null, yi0Var2, jw1Var, false);
                    go0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                se.d((String) obj7, (String) obj6, (String) obj5, (xm0) obj3, (in0) obj4, (px) obj, pp0.N(3073));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ci0.j((List) obj4, (mn0) obj7, (rs2) obj6, (mn0) obj5, (String) obj3, (px) obj, pp0.N(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                t11.c((wm0) obj7, (List) obj6, (rs2) obj5, (mn0) obj3, (in0) obj4, (px) obj, pp0.N(1));
                break;
            case 4:
                uh1 uh1Var = (uh1) obj4;
                xk1 xk1Var3 = (xk1) obj5;
                kw kwVar = (kw) obj7;
                gk gkVar = (gk) obj6;
                xm0 xm0Var = (xm0) obj3;
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    Object objL2 = go0Var2.L();
                    if (objL2 == ebVar) {
                        objL2 = new pr(xk1Var3, 20);
                        go0Var2.f0(objL2);
                    }
                    uh1 uh1VarE = t11.E(uh1Var, (in0) objL2);
                    nf1 nf1VarD = dm.d(sn.j, true);
                    int iHashCode2 = Long.hashCode(go0Var2.T);
                    yy1 yy1VarL2 = go0Var2.l();
                    uh1 uh1VarM2 = tl.M(go0Var2, uh1VarE);
                    hx.c.getClass();
                    jy jyVar2 = gx.b;
                    go0Var2.Z();
                    if (go0Var2.S) {
                        go0Var2.k(jyVar2);
                    } else {
                        go0Var2.i0();
                    }
                    yf3.c(go0Var2, gx.e, nf1VarD);
                    yf3.c(go0Var2, gx.d, yy1VarL2);
                    yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode2));
                    yf3.b(go0Var2, gx.g);
                    yf3.c(go0Var2, gx.c, uh1VarM2);
                    kwVar.g(go0Var2, 0);
                    gkVar.b(xm0Var, go0Var2, 6);
                    go0Var2.p(true);
                }
                break;
            case 5:
                cq1 cq1Var = (cq1) obj4;
                j20 j20Var = (j20) obj6;
                Context context2 = (Context) obj7;
                xk1 xk1Var4 = (xk1) obj5;
                xk1 xk1Var5 = (xk1) obj3;
                px pxVar3 = (px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    go0Var3.R();
                } else {
                    boolean z = cq1Var.f;
                    boolean z2 = cq1Var.g == null;
                    boolean zH2 = go0Var3.h(j20Var) | go0Var3.h(cq1Var) | go0Var3.h(context2);
                    Object objL3 = go0Var3.L();
                    if (zH2 || objL3 == ebVar) {
                        objL3 = new h9(j20Var, cq1Var, context2, xk1Var4, xk1Var5, 4);
                        go0Var3.f0(objL3);
                    }
                    sp0.i(z, (in0) objL3, null, z2, 0, go0Var3, 0, 52);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rg3.f((kf2) obj7, (j31) obj6, (String) obj5, (in0) obj4, (xm0) obj3, (px) obj, pp0.N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ ze(uh1 uh1Var, xk1 xk1Var, kw kwVar, gk gkVar, xm0 xm0Var) {
        this.h = 4;
        this.i = uh1Var;
        this.l = xk1Var;
        this.j = kwVar;
        this.k = gkVar;
        this.m = xm0Var;
    }

    public /* synthetic */ ze(cq1 cq1Var, j20 j20Var, Context context, xk1 xk1Var, xk1 xk1Var2) {
        this.h = 5;
        this.i = cq1Var;
        this.k = j20Var;
        this.j = context;
        this.l = xk1Var;
        this.m = xk1Var2;
    }

    public /* synthetic */ ze(kf2 kf2Var, j31 j31Var, String str, in0 in0Var, xm0 xm0Var, int i) {
        this.h = 6;
        this.j = kf2Var;
        this.k = j31Var;
        this.l = str;
        this.i = in0Var;
        this.m = xm0Var;
    }

    public /* synthetic */ ze(Object obj, Object obj2, Object obj3, un0 un0Var, in0 in0Var, int i, int i2) {
        this.h = i2;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = un0Var;
        this.i = in0Var;
    }

    public /* synthetic */ ze(List list, mn0 mn0Var, rs2 rs2Var, mn0 mn0Var2, String str, int i) {
        this.h = 2;
        this.i = list;
        this.j = mn0Var;
        this.k = rs2Var;
        this.l = mn0Var2;
        this.m = str;
    }
}
