package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ v1(gw gwVar, rs2 rs2Var, mn0 mn0Var, in0 in0Var, int i) {
        this.h = 5;
        this.j = gwVar;
        this.k = rs2Var;
        this.l = mn0Var;
        this.i = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        eb ebVar = nx.a;
        a83 a83Var = a83.a;
        final int i2 = 1;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (i) {
            case 0:
                in0 in0Var = (in0) obj6;
                String str = (String) obj5;
                List list = (List) obj4;
                List list2 = (List) obj3;
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
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
                    tp0.c(rg3.P(R.string.home_settings_about_module, go0Var), null, null, in0Var, go0Var, 0, 30);
                    uh1 uh1VarC = te.e.c(new g71(1.0f, true));
                    jw1 jw1VarH = fg1.h();
                    xf xfVar = new xf(12.0f, new s(2));
                    boolean zF = go0Var.f(str) | go0Var.h(list) | go0Var.h(list2);
                    Object objL = go0Var.L();
                    if (zF || objL == ebVar) {
                        objL = new m0(1, list, list2, str);
                        go0Var.f0(objL);
                    }
                    rg3.d(24960, 490, null, xfVar, null, go0Var, null, (in0) objL, null, uh1VarC, jw1VarH, false);
                    go0Var.p(true);
                } else {
                    go0Var.R();
                }
                return a83Var;
            case 1:
                pf pfVar = (pf) obj5;
                in0 in0Var2 = (in0) obj6;
                c73 c73Var = (c73) obj4;
                final LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strP = rg3.P(R.string.home_settings_theme, go0Var2);
                    String strP2 = rg3.P(R.string.home_settings_theme_subtitle, go0Var2);
                    boolean zF2 = go0Var2.f(in0Var2) | go0Var2.h(c73Var);
                    Object objL2 = go0Var2.L();
                    if (zF2 || objL2 == ebVar) {
                        objL2 = new hf(in0Var2, c73Var, 1);
                        go0Var2.f0(objL2);
                    }
                    in0 in0Var3 = (in0) objL2;
                    boolean zH = go0Var2.h(linkedHashMap);
                    Object objL3 = go0Var2.L();
                    if (zH || objL3 == ebVar) {
                        objL3 = new in0() { // from class: jf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.in0
                            public final Object j(Object obj7) {
                                int i3 = i2;
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                switch (i3) {
                                    case 0:
                                        x51 x51Var = (x51) obj7;
                                        x51Var.getClass();
                                        return (String) we1.p0(x51Var, linkedHashMap2);
                                    default:
                                        pf pfVar2 = (pf) obj7;
                                        pfVar2.getClass();
                                        return (String) we1.p0(pfVar2, linkedHashMap2);
                                }
                            }
                        };
                        go0Var2.f0(objL3);
                    }
                    eu.m(strP, pf.m, pfVar, in0Var3, null, strP2, (in0) objL3, false, go0Var2, 0);
                } else {
                    go0Var2.R();
                }
                return a83Var;
            case 2:
                x51 x51Var = (x51) obj5;
                in0 in0Var4 = (in0) obj6;
                c73 c73Var2 = (c73) obj4;
                final LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj3;
                px pxVar3 = (px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) pxVar3;
                if (go0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strP3 = rg3.P(R.string.home_settings_language, go0Var3);
                    String strP4 = rg3.P(R.string.home_settings_language_subtitle, go0Var3);
                    boolean zF3 = go0Var3.f(in0Var4) | go0Var3.h(c73Var2);
                    Object objL4 = go0Var3.L();
                    if (zF3 || objL4 == ebVar) {
                        objL4 = new hf(in0Var4, c73Var2, 0);
                        go0Var3.f0(objL4);
                    }
                    in0 in0Var5 = (in0) objL4;
                    boolean zH2 = go0Var3.h(linkedHashMap2);
                    Object objL5 = go0Var3.L();
                    if (zH2 || objL5 == ebVar) {
                        final boolean z = false ? 1 : 0;
                        objL5 = new in0() { // from class: jf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.in0
                            public final Object j(Object obj7) {
                                int i3 = z;
                                LinkedHashMap linkedHashMap22 = linkedHashMap2;
                                switch (i3) {
                                    case 0:
                                        x51 x51Var2 = (x51) obj7;
                                        x51Var2.getClass();
                                        return (String) we1.p0(x51Var2, linkedHashMap22);
                                    default:
                                        pf pfVar2 = (pf) obj7;
                                        pfVar2.getClass();
                                        return (String) we1.p0(pfVar2, linkedHashMap22);
                                }
                            }
                        };
                        go0Var3.f0(objL5);
                    }
                    eu.m(strP3, x51.m, x51Var, in0Var5, null, strP4, (in0) objL5, false, go0Var3, 0);
                } else {
                    go0Var3.R();
                }
                return a83Var;
            case 3:
                uh1 uh1Var = (uh1) obj6;
                xk1 xk1Var = (xk1) obj5;
                kw kwVar = (kw) obj4;
                gk gkVar = (gk) obj3;
                px pxVar4 = (px) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                go0 go0Var4 = (go0) pxVar4;
                if (go0Var4.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objL6 = go0Var4.L();
                    if (objL6 == ebVar) {
                        objL6 = new h0(xk1Var, 25);
                        go0Var4.f0(objL6);
                    }
                    uh1 uh1VarE = t11.E(uh1Var, (in0) objL6);
                    nf1 nf1VarD = dm.d(sn.j, true);
                    int iHashCode2 = Long.hashCode(go0Var4.T);
                    yy1 yy1VarL2 = go0Var4.l();
                    uh1 uh1VarM2 = tl.M(go0Var4, uh1VarE);
                    hx.c.getClass();
                    jy jyVar2 = gx.b;
                    go0Var4.Z();
                    if (go0Var4.S) {
                        go0Var4.k(jyVar2);
                    } else {
                        go0Var4.i0();
                    }
                    yf3.c(go0Var4, gx.e, nf1VarD);
                    yf3.c(go0Var4, gx.d, yy1VarL2);
                    yf3.c(go0Var4, gx.f, Integer.valueOf(iHashCode2));
                    yf3.b(go0Var4, gx.g);
                    yf3.c(go0Var4, gx.c, uh1VarM2);
                    kwVar.g(go0Var4, 0);
                    Object objL7 = go0Var4.L();
                    if (objL7 == ebVar) {
                        objL7 = new f0(xk1Var, 16);
                        go0Var4.f0(objL7);
                    }
                    gkVar.b((xm0) objL7, go0Var4, 6);
                    go0Var4.p(true);
                } else {
                    go0Var4.R();
                }
                return a83Var;
            case 4:
                List list3 = (List) obj4;
                rs2 rs2Var = (rs2) obj6;
                mn0 mn0Var = (mn0) obj5;
                mn0 mn0Var2 = (mn0) obj3;
                px pxVar5 = (px) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                go0 go0Var5 = (go0) pxVar5;
                if (go0Var5.O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int i3 = 0;
                    for (Object obj7 : list3) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            eu.a0();
                            throw null;
                        }
                        gw gwVar = (gw) obj7;
                        boolean zF4 = go0Var5.f(mn0Var2) | go0Var5.h(gwVar);
                        Object objL8 = go0Var5.L();
                        Object obj8 = objL8;
                        if (zF4 || objL8 == ebVar) {
                            d2 d2Var = new d2(16, mn0Var2, gwVar);
                            go0Var5.f0(d2Var);
                            obj8 = d2Var;
                        }
                        ci0.k(gwVar, rs2Var, mn0Var, (in0) obj8, go0Var5, 8);
                        if (i3 < list3.size() - 1) {
                            go0Var5.W(303243273);
                            ci0.f(0.0f, go0Var5, 0, 1);
                            go0Var5.p(false);
                        } else {
                            go0Var5.W(303286518);
                            go0Var5.p(false);
                        }
                        i3 = i4;
                    }
                } else {
                    go0Var5.R();
                }
                return a83Var;
            case 5:
                ((Integer) obj2).getClass();
                ci0.k((gw) obj5, (rs2) obj4, (mn0) obj3, (in0) obj6, (px) obj, pp0.N(9));
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((Integer) obj2).getClass();
                tl.b((xm0) obj6, (uh1) obj5, (j81) obj4, (w81) obj3, (px) obj, pp0.N(1));
                return a83Var;
            case 7:
                ((Integer) obj2).getClass();
                ff1.b((pu) obj6, (hq2) obj5, (o63) obj4, (kw) obj3, (px) obj, pp0.N(3073));
                return a83Var;
            case 8:
                ((Integer) obj2).getClass();
                pp0.g((ep1) obj6, (uh1) obj5, (kw) obj4, (kw) obj3, (px) obj, pp0.N(3457));
                return a83Var;
            default:
                in0 in0Var6 = (in0) obj6;
                gu2 gu2Var = (gu2) obj4;
                gu2 gu2Var2 = (gu2) obj3;
                px pxVar6 = (px) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                go0 go0Var6 = (go0) pxVar6;
                if (go0Var6.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var6, 48);
                    int iHashCode3 = Long.hashCode(go0Var6.T);
                    yy1 yy1VarL3 = go0Var6.l();
                    rh1 rh1Var = rh1.a;
                    uh1 uh1VarM3 = tl.M(go0Var6, rh1Var);
                    hx.c.getClass();
                    jy jyVar3 = gx.b;
                    go0Var6.Z();
                    if (go0Var6.S) {
                        go0Var6.k(jyVar3);
                    } else {
                        go0Var6.i0();
                    }
                    yf3.c(go0Var6, gx.e, ob2VarA);
                    yf3.c(go0Var6, gx.d, yy1VarL3);
                    yf3.c(go0Var6, gx.f, Integer.valueOf(iHashCode3));
                    yf3.b(go0Var6, gx.g);
                    yf3.c(go0Var6, gx.c, uh1VarM3);
                    String str2 = (String) in0Var6.j(obj5);
                    go0Var6.W(-2020066745);
                    tu2 tu2Var = ur1.a;
                    long j = ((lp1) go0Var6.j(tu2Var)).g;
                    go0Var6.p(false);
                    eu.a(str2, null, new m13(j, rg3.D(14), im0.k, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var6, 0, 1018);
                    rp0.O(go0Var6, te.q0(rh1Var, 6.0f));
                    boolean zF5 = go0Var6.f(gu2Var) | go0Var6.f(gu2Var2);
                    Object objL9 = go0Var6.L();
                    if (zF5 || objL9 == ebVar) {
                        objL9 = new er1(gu2Var, gu2Var2, 0);
                        go0Var6.f0(objL9);
                    }
                    uh1 uh1VarL = te.L(rh1Var, (in0) objL9);
                    go0Var6.W(-2020047698);
                    long j2 = ((lp1) go0Var6.j(tu2Var)).f;
                    go0Var6.p(false);
                    eu.l(uh1VarL, j2, go0Var6, 0);
                    go0Var6.p(true);
                } else {
                    go0Var6.R();
                }
                return a83Var;
        }
    }

    public /* synthetic */ v1(Enum r1, in0 in0Var, c73 c73Var, LinkedHashMap linkedHashMap, int i) {
        this.h = i;
        this.j = r1;
        this.i = in0Var;
        this.k = c73Var;
        this.l = linkedHashMap;
    }

    public /* synthetic */ v1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }

    public /* synthetic */ v1(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.h = i2;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }

    public /* synthetic */ v1(List list, rs2 rs2Var, mn0 mn0Var, mn0 mn0Var2) {
        this.h = 4;
        this.k = list;
        this.i = rs2Var;
        this.j = mn0Var;
        this.l = mn0Var2;
    }
}
