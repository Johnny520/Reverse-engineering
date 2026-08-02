package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au0 implements mn0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ in0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ un0 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ au0(wm0 wm0Var, in0 in0Var, List list, View view, rs2 rs2Var, mn0 mn0Var) {
        this.j = wm0Var;
        this.i = in0Var;
        this.k = list;
        this.l = view;
        this.m = rs2Var;
        this.n = mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        un0 un0Var = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                wm0 wm0Var = (wm0) obj6;
                List list = (List) obj5;
                View view = (View) obj4;
                rs2 rs2Var = (rs2) obj3;
                mn0 mn0Var = (mn0) un0Var;
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
                    tp0.c(rg3.P(wm0Var.h, go0Var), null, null, this.i, go0Var, 0, 30);
                    uh1 uh1VarC = te.e.c(new g71(1.0f, true));
                    jw1 jw1VarH = fg1.h();
                    xf xfVar = new xf(12.0f, new s(2));
                    boolean zH = go0Var.h(list) | go0Var.d(wm0Var.ordinal()) | go0Var.h(view) | go0Var.f(rs2Var) | go0Var.f(mn0Var);
                    Object objL = go0Var.L();
                    if (zH || objL == nx.a) {
                        objL = new h9(list, wm0Var, view, rs2Var, mn0Var, 1);
                        go0Var.f0(objL);
                    }
                    rg3.d(24960, 490, null, xfVar, null, go0Var, null, (in0) objL, null, uh1VarC, jw1VarH, false);
                    go0Var.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rg3.e((kf2) obj6, (String) obj5, (String) obj4, this.i, (xm0) obj3, (xm0) un0Var, (px) obj, pp0.N(27649));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ au0(kf2 kf2Var, String str, String str2, in0 in0Var, xm0 xm0Var, xm0 xm0Var2, int i) {
        this.j = kf2Var;
        this.k = str;
        this.l = str2;
        this.i = in0Var;
        this.m = xm0Var;
        this.n = xm0Var2;
    }
}
