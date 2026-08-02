package defpackage;

import java.util.List;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tt0 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ tt0(List list, String str, in0 in0Var, int i) {
        this.h = 11;
        this.k = list;
        this.i = str;
        this.j = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        eb ebVar = nx.a;
        int i2 = 2;
        a83 a83Var = a83.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                in0 in0Var = (in0) obj3;
                List list = (List) obj5;
                xk1 xk1Var = (xk1) obj4;
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
                    tp0.c(rg3.P(R.string.home_settings_hooker_debug_title, go0Var), null, null, in0Var, go0Var, 0, 30);
                    uh1 uh1VarC = te.e.c(new g71(1.0f, true));
                    jw1 jw1VarH = fg1.h();
                    xf xfVar = new xf(12.0f, new s(2));
                    boolean zH = go0Var.h(list);
                    Object objL = go0Var.L();
                    if (zH || objL == ebVar) {
                        objL = new oh(list, xk1Var, i2);
                        go0Var.f0(objL);
                    }
                    rg3.d(24960, 490, null, xfVar, null, go0Var, null, (in0) objL, null, uh1VarC, jw1VarH, false);
                    go0Var.p(true);
                }
                break;
            case 1:
                uh1 uh1Var = (uh1) obj3;
                xk1 xk1Var2 = (xk1) obj4;
                kw kwVar = (kw) obj5;
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    Object objL2 = go0Var2.L();
                    if (objL2 == ebVar) {
                        objL2 = new h0(xk1Var2, 10);
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
                    go0Var2.p(true);
                }
                break;
            case 2:
                mt mtVar = (mt) obj5;
                in0 in0Var2 = (in0) obj3;
                xm0 xm0Var = (xm0) obj4;
                px pxVar3 = (px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    go0Var3.R();
                } else {
                    sp0.g(mtVar.p(), null, rg3.Q(R.string.home_settings_update_version_code, new Object[]{Integer.valueOf(mtVar.o())}, go0Var3), ci0.n, null, null, false, null, null, go0Var3, 3072, 498);
                    if (mtVar.m()) {
                        go0Var3.W(-2064419485);
                        ci0.f(0.0f, go0Var3, 0, 1);
                        sp0.g(rg3.P(R.string.home_settings_update_required, go0Var3), null, rg3.P(R.string.home_settings_update_required_description, go0Var3), ci0.o, null, null, false, null, null, go0Var3, 3072, 498);
                        go0Var3.p(false);
                    } else {
                        go0Var3.W(-2064107160);
                        go0Var3.p(false);
                    }
                    if (pv2.s0(mtVar.r())) {
                        go0Var3.W(-2063777816);
                        go0Var3.p(false);
                    } else {
                        go0Var3.W(-2064050740);
                        ci0.f(0.0f, go0Var3, 0, 1);
                        sp0.g(rg3.P(R.string.home_settings_update_whats_new, go0Var3), null, pv2.I0(mtVar.r()).toString(), ci0.p, null, null, false, null, null, go0Var3, 3072, 498);
                        go0Var3.p(false);
                    }
                    ci0.f(0.0f, go0Var3, 0, 1);
                    String strP = rg3.P(R.string.home_settings_update_download, go0Var3);
                    String strP2 = rg3.P(R.string.home_settings_update_download_description, go0Var3);
                    kw kwVar2 = ci0.q;
                    boolean zF = go0Var3.f(in0Var2) | go0Var3.h(mtVar);
                    Object objL3 = go0Var3.L();
                    if (zF || objL3 == ebVar) {
                        objL3 = new r1(3, in0Var2, mtVar);
                        go0Var3.f0(objL3);
                    }
                    sp0.g(strP, null, strP2, kwVar2, null, null, false, (xm0) objL3, null, go0Var3, 3072, 370);
                    ci0.f(0.0f, go0Var3, 0, 1);
                    sp0.g(rg3.P(R.string.home_settings_update_check_again, go0Var3), null, null, ci0.r, null, null, false, xm0Var, null, go0Var3, 3072, 374);
                }
                break;
            case 3:
                xk1 xk1Var3 = (xk1) obj4;
                String str = (String) obj3;
                ju juVar = (ju) obj5;
                px pxVar4 = (px) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                go0 go0Var4 = (go0) pxVar4;
                if (!go0Var4.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    go0Var4.R();
                } else {
                    String strP3 = rg3.P(R.string.home_settings_theme_color, go0Var4);
                    String strP4 = rg3.P(R.string.home_settings_theme_color_description, go0Var4);
                    boolean zF2 = go0Var4.f(xk1Var3);
                    Object objL4 = go0Var4.L();
                    if (zF2 || objL4 == ebVar) {
                        objL4 = new f0(xk1Var3, 8);
                        go0Var4.f0(objL4);
                    }
                    qp0.h(strP3, (xm0) objL4, null, strP4, xe1.i0(470001941, new s9(1, juVar), go0Var4), str, null, false, null, go0Var4, 24576, 452);
                }
                break;
            case 4:
                lp1 lp1Var = (lp1) obj3;
                c73 c73Var = (c73) obj5;
                kw kwVar3 = (kw) obj4;
                px pxVar5 = (px) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                go0 go0Var5 = (go0) pxVar5;
                if (!go0Var5.O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    go0Var5.R();
                } else {
                    ur1.a(lp1Var, c73Var.c, kwVar3, go0Var5, 0);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                gf1.b((uh1) obj3, (b03) obj5, (kw) obj4, (px) obj, pp0.N(385));
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((Integer) obj2).getClass();
                tl.a((sz0) obj3, (uh1) obj5, (String) obj4, (px) obj, pp0.N(1));
                break;
            case 7:
                String str2 = (String) obj3;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                px pxVar6 = (px) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                go0 go0Var6 = (go0) pxVar6;
                if (!go0Var6.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    go0Var6.R();
                } else {
                    sp0.g(str2, null, str3, eu.c, xe1.i0(1744893553, new n0(str4, 9), go0Var6), null, false, null, null, go0Var6, 27648, 482);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ci0.n((String) obj3, (List) obj5, (mn0) obj4, (px) obj, pp0.N(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                s11.j((xt0) obj3, (xm0) obj5, (xm0) obj4, (px) obj, pp0.N(49));
                break;
            case 10:
                z62 z62Var = (z62) obj3;
                im2 im2Var = (im2) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = im2Var.h(im2Var.d(fFloatValue - z62Var.h));
                im2 im2Var2 = ((gm2) obj4).a;
                z62Var.h += im2Var.d(im2Var.g(im2Var2.c(im2Var2.k, jH, 1)));
                break;
            default:
                ((Integer) obj2).getClass();
                gf1.i((List) obj5, (String) obj4, (in0) obj3, (px) obj, pp0.N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ tt0(uh1 uh1Var, xk1 xk1Var, kw kwVar) {
        this.h = 1;
        this.j = uh1Var;
        this.i = xk1Var;
        this.k = kwVar;
    }

    public /* synthetic */ tt0(xk1 xk1Var, String str, ju juVar) {
        this.h = 3;
        this.i = xk1Var;
        this.j = str;
        this.k = juVar;
    }

    public /* synthetic */ tt0(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    public /* synthetic */ tt0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.h = i2;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    public /* synthetic */ tt0(mt mtVar, in0 in0Var, xm0 xm0Var) {
        this.h = 2;
        this.k = mtVar;
        this.j = in0Var;
        this.i = xm0Var;
    }
}
