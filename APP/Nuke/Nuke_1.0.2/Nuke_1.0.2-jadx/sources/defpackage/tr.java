package defpackage;

import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ tr(xk1 xk1Var, xk1 xk1Var2, Integer num) {
        this.h = 5;
        this.j = xk1Var;
        this.k = xk1Var2;
        this.i = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        lc lcVar;
        jy jyVar;
        boolean z;
        int i = this.h;
        rh1 rh1Var = rh1.a;
        int i2 = 12;
        eb ebVar = nx.a;
        int i3 = 4;
        a83 a83Var = a83.a;
        Object obj4 = this.k;
        Object obj5 = this.i;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                String str = (String) obj5;
                xk1 xk1Var = (xk1) obj6;
                xk1 xk1Var2 = (xk1) obj4;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.R();
                } else {
                    String strP = rg3.P(R.string.chat_auto_reply_task_order_description, go0Var);
                    tu2 tu2Var = ur1.a;
                    eu.a(strP, null, new m13(((lp1) go0Var.j(tu2Var)).f, rg3.D(12), null, 0L, 0, rg3.D(17), null, null, 16646140), 0, false, 0, 0, go0Var, 0, 1018);
                    String strF = vi0.f(rh1Var, 10.0f, go0Var, R.string.chat_auto_reply_add_task, go0Var);
                    String strP2 = rg3.P(R.string.chat_auto_reply_add_task_description, go0Var);
                    boolean zF = go0Var.f(str);
                    Object objL = go0Var.L();
                    if (zF || objL == ebVar) {
                        objL = new r1(10, str, xk1Var2);
                        go0Var.f0(objL);
                    }
                    qp0.h(strF, (xm0) objL, null, strP2, null, null, null, false, null, go0Var, 0, 500);
                    op0.a(null, 0.5f, ((lp1) go0Var.j(tu2Var)).d, go0Var, 48, 1);
                    if (!((List) xk1Var.getValue()).isEmpty()) {
                        go0Var.W(-1025631879);
                        uh1 uh1VarP = te.P(te.e, 0.0f, 390.0f, 1);
                        boolean zF2 = go0Var.f(xk1Var);
                        Object objL2 = go0Var.L();
                        if (zF2 || objL2 == ebVar) {
                            objL2 = new i0(xk1Var, xk1Var2, i3);
                            go0Var.f0(objL2);
                        }
                        rg3.d(6, 510, null, null, null, go0Var, null, (in0) objL2, null, uh1VarP, null, false);
                        go0Var.p(false);
                    } else {
                        go0Var.W(-1026050255);
                        eu.a(rg3.P(R.string.chat_auto_reply_no_tasks, go0Var), fg1.D(rh1Var, 14.0f, 28.0f), new m13(((lp1) go0Var.j(tu2Var)).f, rg3.D(13), null, 0L, 0, rg3.D(18), null, null, 16646140), 0, false, 0, 0, go0Var, 48, 1016);
                        go0Var.p(false);
                    }
                }
                break;
            case 1:
                String str2 = (String) obj5;
                kw kwVar = (kw) obj6;
                nn0 nn0Var = (nn0) obj4;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((hm) obj).getClass();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.R();
                } else {
                    av avVarA = yu.a(tp0.c, sn.u, go0Var2, 0);
                    int iHashCode = Long.hashCode(go0Var2.T);
                    yy1 yy1VarL = go0Var2.l();
                    uh1 uh1VarM = tl.M(go0Var2, rh1Var);
                    hx.c.getClass();
                    jy jyVar2 = gx.b;
                    go0Var2.Z();
                    if (go0Var2.S) {
                        go0Var2.k(jyVar2);
                    } else {
                        go0Var2.i0();
                    }
                    lc lcVar2 = gx.e;
                    yf3.c(go0Var2, lcVar2, avVarA);
                    lc lcVar3 = gx.d;
                    yf3.c(go0Var2, lcVar3, yy1VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    lc lcVar4 = gx.f;
                    yf3.c(go0Var2, lcVar4, numValueOf);
                    v6 v6Var = gx.g;
                    yf3.b(go0Var2, v6Var);
                    lc lcVar5 = gx.c;
                    yf3.c(go0Var2, lcVar5, uh1VarM);
                    if (str2 != null) {
                        go0Var2.W(-127905055);
                        lcVar = lcVar2;
                        jyVar = jyVar2;
                        eu.a(str2, new bu0(), new m13(((lp1) go0Var2.j(ur1.a)).e, rg3.D(18), im0.m, 0L, 3, rg3.D(24), null, null, 16613368), 0, false, 0, 0, go0Var2, 0, 1016);
                        rp0.O(go0Var2, te.O(rh1Var, 12.0f));
                        go0Var2.p(false);
                    } else {
                        lcVar = lcVar2;
                        jyVar = jyVar2;
                        go0Var2.W(-127381310);
                        go0Var2.p(false);
                    }
                    kwVar.e(bv.a, go0Var2, 6);
                    if (nn0Var != null) {
                        go0Var2.W(-127313017);
                        rp0.O(go0Var2, te.O(rh1Var, 24.0f));
                        yi0 yi0Var = te.e;
                        ob2 ob2VarA = nb2.a(new xf(12.0f, new s(2)), sn.t, go0Var2, 54);
                        int iHashCode2 = Long.hashCode(go0Var2.T);
                        yy1 yy1VarL2 = go0Var2.l();
                        uh1 uh1VarM2 = tl.M(go0Var2, yi0Var);
                        go0Var2.Z();
                        if (go0Var2.S) {
                            go0Var2.k(jyVar);
                        } else {
                            go0Var2.i0();
                        }
                        yf3.c(go0Var2, lcVar, ob2VarA);
                        yf3.c(go0Var2, lcVar3, yy1VarL2);
                        vi0.q(iHashCode2, go0Var2, lcVar4, go0Var2, v6Var);
                        yf3.c(go0Var2, lcVar5, uh1VarM2);
                        nn0Var.e(pb2.a, go0Var2, 6);
                        z = true;
                        go0Var2.p(true);
                        go0Var2.p(false);
                    } else {
                        z = true;
                        go0Var2.W(-126979550);
                        go0Var2.p(false);
                    }
                    go0Var2.p(z);
                }
                break;
            case 2:
                xk1 xk1Var3 = (xk1) obj6;
                String str3 = (String) obj5;
                ju juVar = (ju) obj4;
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.R();
                } else {
                    eu.n(null, rg3.P(R.string.home_settings_theme_color, go0Var3), xe1.i0(976164414, new tt0(xk1Var3, str3, juVar), go0Var3), go0Var3, 384, 1);
                }
                break;
            case 3:
                String str4 = (String) obj5;
                in0 in0Var = (in0) obj6;
                String str5 = (String) obj4;
                px pxVar4 = (px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var4 = (go0) pxVar4;
                if (!go0Var4.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    go0Var4.R();
                } else {
                    ci0.i(str4, in0Var, pv2.s0(str5), go0Var4, 0);
                }
                break;
            case 4:
                xm0 xm0Var = (xm0) obj5;
                xt0 xt0Var = (xt0) obj6;
                xm0 xm0Var2 = (xm0) obj4;
                pb2 pb2Var = (pb2) obj;
                px pxVar5 = (px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((go0) pxVar5).f(pb2Var) ? 4 : 2;
                }
                go0 go0Var5 = (go0) pxVar5;
                if (!go0Var5.O(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    go0Var5.R();
                } else {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var5), xm0Var, pb2.a(pb2Var), false, 0, go0Var5, 0, 56);
                    se.q(rg3.P(R.string.home_settings_hooker_debug_unlock, go0Var5), xm0Var2, pb2.a(pb2Var), xt0Var.d == zt0.j, 0, go0Var5, 0, 48);
                }
                break;
            case 5:
                xk1 xk1Var4 = (xk1) obj6;
                xk1 xk1Var5 = (xk1) obj4;
                Integer num = (Integer) obj5;
                px pxVar6 = (px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var6 = (go0) pxVar6;
                if (!go0Var6.O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    go0Var6.R();
                } else {
                    String strP3 = rg3.P(R.string.modify_friends_count_hide, go0Var6);
                    String strP4 = rg3.P(R.string.modify_friends_count_hide_description, go0Var6);
                    kw kwVarI0 = xe1.i0(-814859775, new s9(i2, xk1Var4), go0Var6);
                    boolean zF3 = go0Var6.f(xk1Var4);
                    Object objL3 = go0Var6.L();
                    if (zF3 || objL3 == ebVar) {
                        objL3 = new f0(xk1Var4, 29);
                        go0Var6.f0(objL3);
                    }
                    sp0.g(strP3, null, strP4, null, kwVarI0, null, false, (xm0) objL3, null, go0Var6, 24576, 362);
                    rh1 rh1Var2 = rh1.a;
                    rp0.O(go0Var6, te.O(rh1Var2, 10.0f));
                    uh1 uh1VarG = fg1.G(rh1Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strP5 = rg3.P(R.string.modify_friends_count_label, go0Var6);
                    tu2 tu2Var2 = ur1.a;
                    long j = ((lp1) go0Var6.j(tu2Var2)).f;
                    long jD = rg3.D(13);
                    long jD2 = rg3.D(18);
                    im0 im0Var = im0.k;
                    eu.a(strP5, uh1VarG, new m13(j, jD, im0Var, 0L, 0, jD2, null, null, 16646136), 0, false, 0, 0, go0Var6, 48, 1016);
                    String str6 = (String) xk1Var5.getValue();
                    boolean zF4 = go0Var6.f(xk1Var5);
                    Object objL4 = go0Var6.L();
                    if (zF4 || objL4 == ebVar) {
                        objL4 = new pr(xk1Var5, 11);
                        go0Var6.f0(objL4);
                    }
                    tp0.b(str6, (in0) objL4, null, rg3.P(R.string.modify_friends_count_hint, go0Var6), null, null, false, 0, 0, !((Boolean) xk1Var4.getValue()).booleanValue(), false, null, new m51(3, 123), null, go0Var6, 0, 384, 11764);
                    eu.a(rg3.P(R.string.modify_friends_count_description, go0Var6), fg1.G(rh1Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var6.j(tu2Var2)).f, rg3.D(12), null, 0L, 0, rg3.D(17), null, null, 16646140), 0, false, 0, 0, go0Var6, 48, 1016);
                    if (((Boolean) xk1Var4.getValue()).booleanValue() || pv2.s0((String) xk1Var5.getValue()) || num != null) {
                        go0Var6.W(517771837);
                        go0Var6.p(false);
                    } else {
                        go0Var6.W(517381361);
                        eu.a(rg3.P(R.string.modify_friends_count_invalid, go0Var6), fg1.G(rh1Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var6.j(tu2Var2)).g, rg3.D(12), im0Var, 0L, 0, rg3.D(17), null, null, 16646136), 0, false, 0, 0, go0Var6, 48, 1016);
                        go0Var6.p(false);
                    }
                }
                break;
            default:
                xm0 xm0Var3 = (xm0) obj6;
                String str7 = (String) obj5;
                in0 in0Var2 = (in0) obj4;
                pb2 pb2Var2 = (pb2) obj;
                px pxVar7 = (px) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                pb2Var2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((go0) pxVar7).f(pb2Var2) ? 4 : 2;
                }
                go0 go0Var7 = (go0) pxVar7;
                if (!go0Var7.O(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    go0Var7.R();
                } else {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var7), xm0Var3, pb2.a(pb2Var2), false, 0, go0Var7, 0, 56);
                    String strP6 = rg3.P(R.string.open_user_card_open, go0Var7);
                    boolean z2 = str7.length() > 0;
                    uh1 uh1VarA = pb2.a(pb2Var2);
                    boolean zF5 = go0Var7.f(in0Var2) | go0Var7.f(str7);
                    Object objL5 = go0Var7.L();
                    if (zF5 || objL5 == ebVar) {
                        objL5 = new bu1(in0Var2, str7, 0);
                        go0Var7.f0(objL5);
                    }
                    se.q(strP6, (xm0) objL5, uh1VarA, z2, 0, go0Var7, 0, 48);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ tr(int i, Object obj, Object obj2, String str) {
        this.h = i;
        this.j = obj;
        this.i = str;
        this.k = obj2;
    }

    public /* synthetic */ tr(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }
}
