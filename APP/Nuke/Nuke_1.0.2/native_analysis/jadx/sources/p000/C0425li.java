package p000;

import java.util.List;
import java.util.Set;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: li */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0425li implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6123h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xk1 f6124i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f6125j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xk1 f6126k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ xk1 f6127l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ xk1 f6128m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean f6129n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f6130o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f6131p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f6132q;

    public /* synthetic */ C0425li(xm0 xm0Var, Long l, in0 in0Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5, boolean z) {
        this.f6130o = xm0Var;
        this.f6131p = l;
        this.f6132q = in0Var;
        this.f6124i = xk1Var;
        this.f6125j = xk1Var2;
        this.f6126k = xk1Var3;
        this.f6127l = xk1Var4;
        this.f6128m = xk1Var5;
        this.f6129n = z;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        Boolean bool;
        String str;
        go0 go0Var;
        rh1 rh1Var;
        int i = this.f6123h;
        a83 a83Var = a83.f116a;
        C0160eb c0160eb = C0520nx.f7360a;
        Object obj4 = this.f6132q;
        Object obj5 = this.f6131p;
        Object obj6 = this.f6130o;
        switch (i) {
            case 0:
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                Set set = (Set) obj4;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px;
                if (!go0Var2.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var2.m1961R();
                } else {
                    rh1 rh1Var2 = rh1.f9587a;
                    uh1 uh1VarM1882b0 = gf1.m1882b0(AbstractC0731te.m5187P(rh1Var2, 0.0f, 520.0f, 1), gf1.m1868P(go0Var2));
                    C0808vf c0808vf = tp0.f10876c;
                    C0583pk c0583pk = C0700sn.f10233u;
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(c0808vf, c0583pk, go0Var2, 0);
                    int iHashCode = Long.hashCode(go0Var2.f3614T);
                    yy1 yy1VarM1990l = go0Var2.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1882b0);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy = C0256gx.f3727b;
                    go0Var2.m1969Z();
                    if (go0Var2.f3613S) {
                        go0Var2.m1989k(c0367jy);
                    } else {
                        go0Var2.m1987i0();
                    }
                    C0419lc c0419lc = C0256gx.f3730e;
                    yf3.m6268c(go0Var2, c0419lc, c0032avM6346a);
                    C0419lc c0419lc2 = C0256gx.f3729d;
                    yf3.m6268c(go0Var2, c0419lc2, yy1VarM1990l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C0419lc c0419lc3 = C0256gx.f3731f;
                    yf3.m6268c(go0Var2, c0419lc3, numValueOf);
                    C0799v6 c0799v6 = C0256gx.f3732g;
                    yf3.m6267b(go0Var2, c0799v6);
                    C0419lc c0419lc4 = C0256gx.f3728c;
                    yf3.m6268c(go0Var2, c0419lc4, uh1VarM5285M);
                    String strM4462P = rg3.m4462P(R.string.auto_receive_transfer_money_list_mode_title, go0Var2);
                    xk1 xk1Var = this.f6124i;
                    String strM4462P2 = rg3.m4462P(((Boolean) xk1Var.getValue()).booleanValue() ? R.string.auto_receive_transfer_money_list_mode_whitelist_description : R.string.auto_receive_transfer_money_list_mode_blacklist_description, go0Var2);
                    List listM1435P = AbstractC0179eu.m1435P(Boolean.FALSE, Boolean.TRUE);
                    Boolean bool2 = (Boolean) xk1Var.getValue();
                    bool2.getClass();
                    boolean zM1980f = go0Var2.m1980f(xk1Var);
                    Object objM1956L = go0Var2.m1956L();
                    if (zM1980f || objM1956L == c0160eb) {
                        bool = bool2;
                        objM1956L = new C0260h0(xk1Var, 23);
                        go0Var2.m1981f0(objM1956L);
                    } else {
                        bool = bool2;
                    }
                    in0 in0Var = (in0) objM1956L;
                    boolean zM1980f2 = go0Var2.m1980f(str2) | go0Var2.m1980f(str3);
                    Object objM1956L2 = go0Var2.m1956L();
                    if (zM1980f2 || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0223g0(3, str2, str3);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    AbstractC0179eu.m1463m(strM4462P, listM1435P, bool, in0Var, null, strM4462P2, (in0) objM1956L2, false, go0Var2, 48);
                    String strM4462P3 = rg3.m4462P(((Boolean) xk1Var.getValue()).booleanValue() ? R.string.auto_receive_transfer_money_configure_whitelist : R.string.auto_receive_transfer_money_configure_blacklist, go0Var2);
                    String strM4463Q = rg3.m4463Q(R.string.auto_receive_transfer_money_selected_count, new Object[]{Integer.valueOf(set.size())}, go0Var2);
                    Object objM1956L3 = go0Var2.m1956L();
                    if (objM1956L3 == c0160eb) {
                        str = strM4462P3;
                        objM1956L3 = new C0186f0(this.f6127l, 15);
                        go0Var2.m1981f0(objM1956L3);
                    } else {
                        str = strM4462P3;
                    }
                    qp0.m4253h(str, (xm0) objM1956L3, null, strM4463Q, null, null, null, false, null, go0Var2, 48, 500);
                    t11.m5078d(vi0.m5687f(rh1Var2, 12.0f, go0Var2, R.string.auto_receive_transfer_money_wait_time_label, go0Var2), go0Var2, 0);
                    xk1 xk1Var2 = this.f6125j;
                    String str4 = (String) xk1Var2.getValue();
                    boolean zM1980f3 = go0Var2.m1980f(xk1Var2);
                    Object objM1956L4 = go0Var2.m1956L();
                    if (zM1980f3 || objM1956L4 == c0160eb) {
                        objM1956L4 = new C0260h0(xk1Var2, 24);
                        go0Var2.m1981f0(objM1956L4);
                    }
                    tp0.m5357b(str4, (in0) objM1956L4, null, rg3.m4462P(R.string.auto_receive_transfer_money_wait_time_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                    if (pv2.m4006s0((String) xk1Var2.getValue()) || this.f6129n) {
                        go0Var = go0Var2;
                        rh1Var = rh1Var2;
                        go0Var.m1966W(1508178592);
                        go0Var.m1994p(false);
                    } else {
                        go0Var2.m1966W(1507688048);
                        rh1Var = rh1Var2;
                        AbstractC0179eu.m1446a(rg3.m4462P(R.string.auto_receive_transfer_money_wait_time_invalid, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var2.m1988j(ur1.f11452a)).f6239g, rg3.m4450D(12), im0.f4681k, 0L, 0, rg3.m4450D(17), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                        go0Var = go0Var2;
                        go0Var.m1994p(false);
                    }
                    rp0.m4529O(go0Var, AbstractC0731te.m5186O(rh1Var, 16.0f));
                    yi0 yi0Var = AbstractC0731te.f10693e;
                    ob2 ob2VarM3265a = nb2.m3265a(new C0884xf(12.0f, new C0676s(2)), C0700sn.f10232t, go0Var, 54);
                    int iHashCode2 = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l2 = go0Var.m1990l();
                    uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, yi0Var);
                    go0Var.m1969Z();
                    rh1 rh1Var3 = rh1Var;
                    if (go0Var.f3613S) {
                        go0Var.m1989k(c0367jy);
                    } else {
                        go0Var.m1987i0();
                    }
                    yf3.m6268c(go0Var, c0419lc, ob2VarM3265a);
                    yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
                    vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
                    yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
                    g71 g71Var = new g71(1.0f, true);
                    C0032av c0032avM6346a2 = AbstractC0938yu.m6346a(c0808vf, c0583pk, go0Var, 0);
                    int iHashCode3 = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l3 = go0Var.m1990l();
                    uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var, g71Var);
                    go0Var.m1969Z();
                    if (go0Var.f3613S) {
                        go0Var.m1989k(c0367jy);
                    } else {
                        go0Var.m1987i0();
                    }
                    yf3.m6268c(go0Var, c0419lc, c0032avM6346a2);
                    yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l3);
                    vi0.m5698q(iHashCode3, go0Var, c0419lc3, go0Var, c0799v6);
                    yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M3);
                    String strM4462P4 = rg3.m4462P(R.string.auto_receive_transfer_money_auto_reply_title, go0Var);
                    tu2 tu2Var = ur1.f11452a;
                    go0 go0Var3 = go0Var;
                    AbstractC0179eu.m1446a(strM4462P4, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6237e, rg3.m4450D(14), im0.f4682l, 0L, 0, rg3.m4450D(19), null, null, 16646136), 0, false, 0, 0, go0Var3, 0, 1018);
                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.auto_receive_transfer_money_auto_reply_description, go0Var3), null, new m13(((lp1) go0Var3.m1988j(tu2Var)).f6238f, rg3.m4450D(12), null, 0L, 0, rg3.m4450D(17), null, null, 16646140), 0, false, 0, 0, go0Var3, 0, 1018);
                    go0Var3.m1994p(true);
                    xk1 xk1Var3 = this.f6128m;
                    boolean zBooleanValue = ((Boolean) xk1Var3.getValue()).booleanValue();
                    boolean zM1980f4 = go0Var3.m1980f(xk1Var3);
                    Object objM1956L5 = go0Var3.m1956L();
                    if (zM1980f4 || objM1956L5 == c0160eb) {
                        objM1956L5 = new C0260h0(xk1Var3, 20);
                        go0Var3.m1981f0(objM1956L5);
                    }
                    sp0.m4944i(zBooleanValue, (in0) objM1956L5, null, false, 0, go0Var3, 0, 60);
                    go0Var3.m1994p(true);
                    rp0.m4529O(go0Var3, AbstractC0731te.m5186O(rh1Var3, 12.0f));
                    t11.m5078d(rg3.m4462P(R.string.auto_receive_transfer_money_reply_content_label, go0Var3), go0Var3, 0);
                    xk1 xk1Var4 = this.f6126k;
                    String str5 = (String) xk1Var4.getValue();
                    boolean zM1980f5 = go0Var3.m1980f(xk1Var4);
                    Object objM1956L6 = go0Var3.m1956L();
                    if (zM1980f5 || objM1956L6 == c0160eb) {
                        objM1956L6 = new C0260h0(xk1Var4, 21);
                        go0Var3.m1981f0(objM1956L6);
                    }
                    tp0.m5357b(str5, (in0) objM1956L6, null, rg3.m4462P(R.string.auto_receive_transfer_money_reply_content_hint, go0Var3), null, null, false, 2, 4, ((Boolean) xk1Var3.getValue()).booleanValue(), false, null, null, null, go0Var3, 114819072, 0, 15412);
                    go0Var3.m1994p(true);
                }
                break;
            default:
                xm0 xm0Var = (xm0) obj6;
                final Long l = (Long) obj5;
                final in0 in0Var2 = (in0) obj4;
                pb2 pb2Var = (pb2) obj;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) interfaceC0596px2).m1980f(pb2Var) ? 4 : 2;
                }
                go0 go0Var4 = (go0) interfaceC0596px2;
                if (!go0Var4.m1958O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    go0Var4.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var4), xm0Var, pb2.m3843a(pb2Var), false, 0, go0Var4, 0, 56);
                    String strM4462P5 = rg3.m4462P(R.string.home_settings_save, go0Var4);
                    uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
                    boolean zM1980f6 = go0Var4.m1980f(l) | go0Var4.m1980f(in0Var2);
                    final xk1 xk1Var5 = this.f6124i;
                    boolean zM1980f7 = zM1980f6 | go0Var4.m1980f(xk1Var5);
                    final xk1 xk1Var6 = this.f6125j;
                    boolean zM1980f8 = zM1980f7 | go0Var4.m1980f(xk1Var6);
                    final xk1 xk1Var7 = this.f6126k;
                    boolean zM1980f9 = zM1980f8 | go0Var4.m1980f(xk1Var7);
                    final xk1 xk1Var8 = this.f6127l;
                    boolean zM1980f10 = zM1980f9 | go0Var4.m1980f(xk1Var8);
                    final xk1 xk1Var9 = this.f6128m;
                    boolean zM1980f11 = zM1980f10 | go0Var4.m1980f(xk1Var9);
                    Object objM1956L7 = go0Var4.m1956L();
                    if (zM1980f11 || objM1956L7 == c0160eb) {
                        xm0 xm0Var2 = new xm0() { // from class: ji
                            @Override // p000.xm0
                            /* JADX INFO: renamed from: a */
                            public final Object mo6a() {
                                Long l2 = l;
                                a83 a83Var2 = a83.f116a;
                                if (l2 != null) {
                                    in0Var2.mo5j(new C0131di(l2.longValue(), ((Boolean) xk1Var5.getValue()).booleanValue(), (Set) xk1Var6.getValue(), (Set) xk1Var7.getValue(), new C0241gi(pv2.m3993I0((String) xk1Var9.getValue()).toString(), ((Boolean) xk1Var8.getValue()).booleanValue())));
                                }
                                return a83Var2;
                            }
                        };
                        go0Var4.m1981f0(xm0Var2);
                        objM1956L7 = xm0Var2;
                    }
                    AbstractC0691se.m4846q(strM4462P5, (xm0) objM1956L7, uh1VarM3843a, this.f6129n, 0, go0Var4, 0, 48);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0425li(xk1 xk1Var, String str, String str2, Set set, xk1 xk1Var2, boolean z, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5) {
        this.f6124i = xk1Var;
        this.f6130o = str;
        this.f6131p = str2;
        this.f6132q = set;
        this.f6125j = xk1Var2;
        this.f6129n = z;
        this.f6126k = xk1Var3;
        this.f6127l = xk1Var4;
        this.f6128m = xk1Var5;
    }
}
