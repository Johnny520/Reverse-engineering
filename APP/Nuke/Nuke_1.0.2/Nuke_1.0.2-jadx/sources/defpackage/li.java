package defpackage;

import java.util.List;
import java.util.Set;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class li implements nn0 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ xk1 i;
    public final /* synthetic */ xk1 j;
    public final /* synthetic */ xk1 k;
    public final /* synthetic */ xk1 l;
    public final /* synthetic */ xk1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ li(xm0 xm0Var, Long l, in0 in0Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5, boolean z) {
        this.o = xm0Var;
        this.p = l;
        this.q = in0Var;
        this.i = xk1Var;
        this.j = xk1Var2;
        this.k = xk1Var3;
        this.l = xk1Var4;
        this.m = xk1Var5;
        this.n = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        Boolean bool;
        String str;
        go0 go0Var;
        rh1 rh1Var;
        int i = this.h;
        a83 a83Var = a83.a;
        eb ebVar = nx.a;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.o;
        switch (i) {
            case 0:
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                Set set = (Set) obj4;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var2 = (go0) pxVar;
                if (!go0Var2.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var2.R();
                } else {
                    rh1 rh1Var2 = rh1.a;
                    uh1 uh1VarB0 = gf1.b0(te.P(rh1Var2, 0.0f, 520.0f, 1), gf1.P(go0Var2));
                    vf vfVar = tp0.c;
                    pk pkVar = sn.u;
                    av avVarA = yu.a(vfVar, pkVar, go0Var2, 0);
                    int iHashCode = Long.hashCode(go0Var2.T);
                    yy1 yy1VarL = go0Var2.l();
                    uh1 uh1VarM = tl.M(go0Var2, uh1VarB0);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var2.Z();
                    if (go0Var2.S) {
                        go0Var2.k(jyVar);
                    } else {
                        go0Var2.i0();
                    }
                    lc lcVar = gx.e;
                    yf3.c(go0Var2, lcVar, avVarA);
                    lc lcVar2 = gx.d;
                    yf3.c(go0Var2, lcVar2, yy1VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    lc lcVar3 = gx.f;
                    yf3.c(go0Var2, lcVar3, numValueOf);
                    v6 v6Var = gx.g;
                    yf3.b(go0Var2, v6Var);
                    lc lcVar4 = gx.c;
                    yf3.c(go0Var2, lcVar4, uh1VarM);
                    String strP = rg3.P(R.string.auto_receive_transfer_money_list_mode_title, go0Var2);
                    xk1 xk1Var = this.i;
                    String strP2 = rg3.P(((Boolean) xk1Var.getValue()).booleanValue() ? R.string.auto_receive_transfer_money_list_mode_whitelist_description : R.string.auto_receive_transfer_money_list_mode_blacklist_description, go0Var2);
                    List listP = eu.P(Boolean.FALSE, Boolean.TRUE);
                    Boolean bool2 = (Boolean) xk1Var.getValue();
                    bool2.getClass();
                    boolean zF = go0Var2.f(xk1Var);
                    Object objL = go0Var2.L();
                    if (zF || objL == ebVar) {
                        bool = bool2;
                        objL = new h0(xk1Var, 23);
                        go0Var2.f0(objL);
                    } else {
                        bool = bool2;
                    }
                    in0 in0Var = (in0) objL;
                    boolean zF2 = go0Var2.f(str2) | go0Var2.f(str3);
                    Object objL2 = go0Var2.L();
                    if (zF2 || objL2 == ebVar) {
                        objL2 = new g0(3, str2, str3);
                        go0Var2.f0(objL2);
                    }
                    eu.m(strP, listP, bool, in0Var, null, strP2, (in0) objL2, false, go0Var2, 48);
                    String strP3 = rg3.P(((Boolean) xk1Var.getValue()).booleanValue() ? R.string.auto_receive_transfer_money_configure_whitelist : R.string.auto_receive_transfer_money_configure_blacklist, go0Var2);
                    String strQ = rg3.Q(R.string.auto_receive_transfer_money_selected_count, new Object[]{Integer.valueOf(set.size())}, go0Var2);
                    Object objL3 = go0Var2.L();
                    if (objL3 == ebVar) {
                        str = strP3;
                        objL3 = new f0(this.l, 15);
                        go0Var2.f0(objL3);
                    } else {
                        str = strP3;
                    }
                    qp0.h(str, (xm0) objL3, null, strQ, null, null, null, false, null, go0Var2, 48, 500);
                    t11.d(vi0.f(rh1Var2, 12.0f, go0Var2, R.string.auto_receive_transfer_money_wait_time_label, go0Var2), go0Var2, 0);
                    xk1 xk1Var2 = this.j;
                    String str4 = (String) xk1Var2.getValue();
                    boolean zF3 = go0Var2.f(xk1Var2);
                    Object objL4 = go0Var2.L();
                    if (zF3 || objL4 == ebVar) {
                        objL4 = new h0(xk1Var2, 24);
                        go0Var2.f0(objL4);
                    }
                    tp0.b(str4, (in0) objL4, null, rg3.P(R.string.auto_receive_transfer_money_wait_time_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                    if (pv2.s0((String) xk1Var2.getValue()) || this.n) {
                        go0Var = go0Var2;
                        rh1Var = rh1Var2;
                        go0Var.W(1508178592);
                        go0Var.p(false);
                    } else {
                        go0Var2.W(1507688048);
                        rh1Var = rh1Var2;
                        eu.a(rg3.P(R.string.auto_receive_transfer_money_wait_time_invalid, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var2.j(ur1.a)).g, rg3.D(12), im0.k, 0L, 0, rg3.D(17), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                        go0Var = go0Var2;
                        go0Var.p(false);
                    }
                    rp0.O(go0Var, te.O(rh1Var, 16.0f));
                    yi0 yi0Var = te.e;
                    ob2 ob2VarA = nb2.a(new xf(12.0f, new s(2)), sn.t, go0Var, 54);
                    int iHashCode2 = Long.hashCode(go0Var.T);
                    yy1 yy1VarL2 = go0Var.l();
                    uh1 uh1VarM2 = tl.M(go0Var, yi0Var);
                    go0Var.Z();
                    rh1 rh1Var3 = rh1Var;
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, lcVar, ob2VarA);
                    yf3.c(go0Var, lcVar2, yy1VarL2);
                    vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
                    yf3.c(go0Var, lcVar4, uh1VarM2);
                    g71 g71Var = new g71(1.0f, true);
                    av avVarA2 = yu.a(vfVar, pkVar, go0Var, 0);
                    int iHashCode3 = Long.hashCode(go0Var.T);
                    yy1 yy1VarL3 = go0Var.l();
                    uh1 uh1VarM3 = tl.M(go0Var, g71Var);
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, lcVar, avVarA2);
                    yf3.c(go0Var, lcVar2, yy1VarL3);
                    vi0.q(iHashCode3, go0Var, lcVar3, go0Var, v6Var);
                    yf3.c(go0Var, lcVar4, uh1VarM3);
                    String strP4 = rg3.P(R.string.auto_receive_transfer_money_auto_reply_title, go0Var);
                    tu2 tu2Var = ur1.a;
                    go0 go0Var3 = go0Var;
                    eu.a(strP4, null, new m13(((lp1) go0Var.j(tu2Var)).e, rg3.D(14), im0.l, 0L, 0, rg3.D(19), null, null, 16646136), 0, false, 0, 0, go0Var3, 0, 1018);
                    eu.a(rg3.P(R.string.auto_receive_transfer_money_auto_reply_description, go0Var3), null, new m13(((lp1) go0Var3.j(tu2Var)).f, rg3.D(12), null, 0L, 0, rg3.D(17), null, null, 16646140), 0, false, 0, 0, go0Var3, 0, 1018);
                    go0Var3.p(true);
                    xk1 xk1Var3 = this.m;
                    boolean zBooleanValue = ((Boolean) xk1Var3.getValue()).booleanValue();
                    boolean zF4 = go0Var3.f(xk1Var3);
                    Object objL5 = go0Var3.L();
                    if (zF4 || objL5 == ebVar) {
                        objL5 = new h0(xk1Var3, 20);
                        go0Var3.f0(objL5);
                    }
                    sp0.i(zBooleanValue, (in0) objL5, null, false, 0, go0Var3, 0, 60);
                    go0Var3.p(true);
                    rp0.O(go0Var3, te.O(rh1Var3, 12.0f));
                    t11.d(rg3.P(R.string.auto_receive_transfer_money_reply_content_label, go0Var3), go0Var3, 0);
                    xk1 xk1Var4 = this.k;
                    String str5 = (String) xk1Var4.getValue();
                    boolean zF5 = go0Var3.f(xk1Var4);
                    Object objL6 = go0Var3.L();
                    if (zF5 || objL6 == ebVar) {
                        objL6 = new h0(xk1Var4, 21);
                        go0Var3.f0(objL6);
                    }
                    tp0.b(str5, (in0) objL6, null, rg3.P(R.string.auto_receive_transfer_money_reply_content_hint, go0Var3), null, null, false, 2, 4, ((Boolean) xk1Var3.getValue()).booleanValue(), false, null, null, null, go0Var3, 114819072, 0, 15412);
                    go0Var3.p(true);
                }
                break;
            default:
                xm0 xm0Var = (xm0) obj6;
                final Long l = (Long) obj5;
                final in0 in0Var2 = (in0) obj4;
                pb2 pb2Var = (pb2) obj;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) pxVar2).f(pb2Var) ? 4 : 2;
                }
                go0 go0Var4 = (go0) pxVar2;
                if (!go0Var4.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    go0Var4.R();
                } else {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var4), xm0Var, pb2.a(pb2Var), false, 0, go0Var4, 0, 56);
                    String strP5 = rg3.P(R.string.home_settings_save, go0Var4);
                    uh1 uh1VarA = pb2.a(pb2Var);
                    boolean zF6 = go0Var4.f(l) | go0Var4.f(in0Var2);
                    final xk1 xk1Var5 = this.i;
                    boolean zF7 = zF6 | go0Var4.f(xk1Var5);
                    final xk1 xk1Var6 = this.j;
                    boolean zF8 = zF7 | go0Var4.f(xk1Var6);
                    final xk1 xk1Var7 = this.k;
                    boolean zF9 = zF8 | go0Var4.f(xk1Var7);
                    final xk1 xk1Var8 = this.l;
                    boolean zF10 = zF9 | go0Var4.f(xk1Var8);
                    final xk1 xk1Var9 = this.m;
                    boolean zF11 = zF10 | go0Var4.f(xk1Var9);
                    Object objL7 = go0Var4.L();
                    if (zF11 || objL7 == ebVar) {
                        xm0 xm0Var2 = new xm0() { // from class: ji
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.xm0
                            public final Object a() {
                                Long l2 = l;
                                a83 a83Var2 = a83.a;
                                if (l2 != null) {
                                    in0Var2.j(new di(l2.longValue(), ((Boolean) xk1Var5.getValue()).booleanValue(), (Set) xk1Var6.getValue(), (Set) xk1Var7.getValue(), new gi(pv2.I0((String) xk1Var9.getValue()).toString(), ((Boolean) xk1Var8.getValue()).booleanValue())));
                                }
                                return a83Var2;
                            }
                        };
                        go0Var4.f0(xm0Var2);
                        objL7 = xm0Var2;
                    }
                    se.q(strP5, (xm0) objL7, uh1VarA, this.n, 0, go0Var4, 0, 48);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ li(xk1 xk1Var, String str, String str2, Set set, xk1 xk1Var2, boolean z, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5) {
        this.i = xk1Var;
        this.o = str;
        this.p = str2;
        this.q = set;
        this.j = xk1Var2;
        this.n = z;
        this.k = xk1Var3;
        this.l = xk1Var4;
        this.m = xk1Var5;
    }
}
