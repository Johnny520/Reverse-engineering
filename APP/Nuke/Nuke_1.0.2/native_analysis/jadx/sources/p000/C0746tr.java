package p000;

import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: tr */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0746tr implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10902h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f10903i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f10904j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f10905k;

    public /* synthetic */ C0746tr(xk1 xk1Var, xk1 xk1Var2, Integer num) {
        this.f10902h = 5;
        this.f10904j = xk1Var;
        this.f10905k = xk1Var2;
        this.f10903i = num;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        C0419lc c0419lc;
        C0367jy c0367jy;
        boolean z;
        int i = this.f10902h;
        rh1 rh1Var = rh1.f9587a;
        int i2 = 12;
        C0160eb c0160eb = C0520nx.f7360a;
        int i3 = 4;
        a83 a83Var = a83.f116a;
        Object obj4 = this.f10905k;
        Object obj5 = this.f10903i;
        Object obj6 = this.f10904j;
        switch (i) {
            case 0:
                String str = (String) obj5;
                xk1 xk1Var = (xk1) obj6;
                xk1 xk1Var2 = (xk1) obj4;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.m1961R();
                } else {
                    String strM4462P = rg3.m4462P(R.string.chat_auto_reply_task_order_description, go0Var);
                    tu2 tu2Var = ur1.f11452a;
                    AbstractC0179eu.m1446a(strM4462P, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6238f, rg3.m4450D(12), null, 0L, 0, rg3.m4450D(17), null, null, 16646140), 0, false, 0, 0, go0Var, 0, 1018);
                    String strM5687f = vi0.m5687f(rh1Var, 10.0f, go0Var, R.string.chat_auto_reply_add_task, go0Var);
                    String strM4462P2 = rg3.m4462P(R.string.chat_auto_reply_add_task_description, go0Var);
                    boolean zM1980f = go0Var.m1980f(str);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1980f || objM1956L == c0160eb) {
                        objM1956L = new C0640r1(10, str, xk1Var2);
                        go0Var.m1981f0(objM1956L);
                    }
                    qp0.m4253h(strM5687f, (xm0) objM1956L, null, strM4462P2, null, null, null, false, null, go0Var, 0, 500);
                    op0.m3579a(null, 0.5f, ((lp1) go0Var.m1988j(tu2Var)).f6236d, go0Var, 48, 1);
                    if (!((List) xk1Var.getValue()).isEmpty()) {
                        go0Var.m1966W(-1025631879);
                        uh1 uh1VarM5187P = AbstractC0731te.m5187P(AbstractC0731te.f10693e, 0.0f, 390.0f, 1);
                        boolean zM1980f2 = go0Var.m1980f(xk1Var);
                        Object objM1956L2 = go0Var.m1956L();
                        if (zM1980f2 || objM1956L2 == c0160eb) {
                            objM1956L2 = new C0297i0(xk1Var, xk1Var2, i3);
                            go0Var.m1981f0(objM1956L2);
                        }
                        rg3.m4468d(6, 510, null, null, null, go0Var, null, (in0) objM1956L2, null, uh1VarM5187P, null, false);
                        go0Var.m1994p(false);
                    } else {
                        go0Var.m1966W(-1026050255);
                        AbstractC0179eu.m1446a(rg3.m4462P(R.string.chat_auto_reply_no_tasks, go0Var), fg1.m1612D(rh1Var, 14.0f, 28.0f), new m13(((lp1) go0Var.m1988j(tu2Var)).f6238f, rg3.m4450D(13), null, 0L, 0, rg3.m4450D(18), null, null, 16646140), 0, false, 0, 0, go0Var, 48, 1016);
                        go0Var.m1994p(false);
                    }
                }
                break;
            case 1:
                String str2 = (String) obj5;
                C0402kw c0402kw = (C0402kw) obj6;
                nn0 nn0Var = (nn0) obj4;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C0282hm) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.m1961R();
                } else {
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var2, 0);
                    int iHashCode = Long.hashCode(go0Var2.f3614T);
                    yy1 yy1VarM1990l = go0Var2.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, rh1Var);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy2 = C0256gx.f3727b;
                    go0Var2.m1969Z();
                    if (go0Var2.f3613S) {
                        go0Var2.m1989k(c0367jy2);
                    } else {
                        go0Var2.m1987i0();
                    }
                    C0419lc c0419lc2 = C0256gx.f3730e;
                    yf3.m6268c(go0Var2, c0419lc2, c0032avM6346a);
                    C0419lc c0419lc3 = C0256gx.f3729d;
                    yf3.m6268c(go0Var2, c0419lc3, yy1VarM1990l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C0419lc c0419lc4 = C0256gx.f3731f;
                    yf3.m6268c(go0Var2, c0419lc4, numValueOf);
                    C0799v6 c0799v6 = C0256gx.f3732g;
                    yf3.m6267b(go0Var2, c0799v6);
                    C0419lc c0419lc5 = C0256gx.f3728c;
                    yf3.m6268c(go0Var2, c0419lc5, uh1VarM5285M);
                    if (str2 != null) {
                        go0Var2.m1966W(-127905055);
                        c0419lc = c0419lc2;
                        c0367jy = c0367jy2;
                        AbstractC0179eu.m1446a(str2, new bu0(), new m13(((lp1) go0Var2.m1988j(ur1.f11452a)).f6237e, rg3.m4450D(18), im0.f4683m, 0L, 3, rg3.m4450D(24), null, null, 16613368), 0, false, 0, 0, go0Var2, 0, 1016);
                        rp0.m4529O(go0Var2, AbstractC0731te.m5186O(rh1Var, 12.0f));
                        go0Var2.m1994p(false);
                    } else {
                        c0419lc = c0419lc2;
                        c0367jy = c0367jy2;
                        go0Var2.m1966W(-127381310);
                        go0Var2.m1994p(false);
                    }
                    c0402kw.mo489e(C0069bv.f1040a, go0Var2, 6);
                    if (nn0Var != null) {
                        go0Var2.m1966W(-127313017);
                        rp0.m4529O(go0Var2, AbstractC0731te.m5186O(rh1Var, 24.0f));
                        yi0 yi0Var = AbstractC0731te.f10693e;
                        ob2 ob2VarM3265a = nb2.m3265a(new C0884xf(12.0f, new C0676s(2)), C0700sn.f10232t, go0Var2, 54);
                        int iHashCode2 = Long.hashCode(go0Var2.f3614T);
                        yy1 yy1VarM1990l2 = go0Var2.m1990l();
                        uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var2, yi0Var);
                        go0Var2.m1969Z();
                        if (go0Var2.f3613S) {
                            go0Var2.m1989k(c0367jy);
                        } else {
                            go0Var2.m1987i0();
                        }
                        yf3.m6268c(go0Var2, c0419lc, ob2VarM3265a);
                        yf3.m6268c(go0Var2, c0419lc3, yy1VarM1990l2);
                        vi0.m5698q(iHashCode2, go0Var2, c0419lc4, go0Var2, c0799v6);
                        yf3.m6268c(go0Var2, c0419lc5, uh1VarM5285M2);
                        nn0Var.mo489e(pb2.f8246a, go0Var2, 6);
                        z = true;
                        go0Var2.m1994p(true);
                        go0Var2.m1994p(false);
                    } else {
                        z = true;
                        go0Var2.m1966W(-126979550);
                        go0Var2.m1994p(false);
                    }
                    go0Var2.m1994p(z);
                }
                break;
            case 2:
                xk1 xk1Var3 = (xk1) obj6;
                String str3 = (String) obj5;
                C0363ju c0363ju = (C0363ju) obj4;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.m1961R();
                } else {
                    AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_theme_color, go0Var3), xe1.m6126i0(976164414, new tt0(xk1Var3, str3, c0363ju), go0Var3), go0Var3, 384, 1);
                }
                break;
            case 3:
                String str4 = (String) obj5;
                in0 in0Var = (in0) obj6;
                String str5 = (String) obj4;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (!go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    go0Var4.m1961R();
                } else {
                    ci0.m808i(str4, in0Var, pv2.m4006s0(str5), go0Var4, 0);
                }
                break;
            case 4:
                xm0 xm0Var = (xm0) obj5;
                xt0 xt0Var = (xt0) obj6;
                xm0 xm0Var2 = (xm0) obj4;
                pb2 pb2Var = (pb2) obj;
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((go0) interfaceC0596px5).m1980f(pb2Var) ? 4 : 2;
                }
                go0 go0Var5 = (go0) interfaceC0596px5;
                if (!go0Var5.m1958O(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    go0Var5.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var5), xm0Var, pb2.m3843a(pb2Var), false, 0, go0Var5, 0, 56);
                    AbstractC0691se.m4846q(rg3.m4462P(R.string.home_settings_hooker_debug_unlock, go0Var5), xm0Var2, pb2.m3843a(pb2Var), xt0Var.f13170d == zt0.f14092j, 0, go0Var5, 0, 48);
                }
                break;
            case 5:
                xk1 xk1Var4 = (xk1) obj6;
                xk1 xk1Var5 = (xk1) obj4;
                Integer num = (Integer) obj5;
                InterfaceC0596px interfaceC0596px6 = (InterfaceC0596px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var6 = (go0) interfaceC0596px6;
                if (!go0Var6.m1958O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    go0Var6.m1961R();
                } else {
                    String strM4462P3 = rg3.m4462P(R.string.modify_friends_count_hide, go0Var6);
                    String strM4462P4 = rg3.m4462P(R.string.modify_friends_count_hide_description, go0Var6);
                    C0402kw c0402kwM6126i0 = xe1.m6126i0(-814859775, new C0686s9(i2, xk1Var4), go0Var6);
                    boolean zM1980f3 = go0Var6.m1980f(xk1Var4);
                    Object objM1956L3 = go0Var6.m1956L();
                    if (zM1980f3 || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0186f0(xk1Var4, 29);
                        go0Var6.m1981f0(objM1956L3);
                    }
                    sp0.m4940g(strM4462P3, null, strM4462P4, null, c0402kwM6126i0, null, false, (xm0) objM1956L3, null, go0Var6, 24576, 362);
                    rh1 rh1Var2 = rh1.f9587a;
                    rp0.m4529O(go0Var6, AbstractC0731te.m5186O(rh1Var2, 10.0f));
                    uh1 uh1VarM1615G = fg1.m1615G(rh1Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strM4462P5 = rg3.m4462P(R.string.modify_friends_count_label, go0Var6);
                    tu2 tu2Var2 = ur1.f11452a;
                    long j = ((lp1) go0Var6.m1988j(tu2Var2)).f6238f;
                    long jM4450D = rg3.m4450D(13);
                    long jM4450D2 = rg3.m4450D(18);
                    im0 im0Var = im0.f4681k;
                    AbstractC0179eu.m1446a(strM4462P5, uh1VarM1615G, new m13(j, jM4450D, im0Var, 0L, 0, jM4450D2, null, null, 16646136), 0, false, 0, 0, go0Var6, 48, 1016);
                    String str6 = (String) xk1Var5.getValue();
                    boolean zM1980f4 = go0Var6.m1980f(xk1Var5);
                    Object objM1956L4 = go0Var6.m1956L();
                    if (zM1980f4 || objM1956L4 == c0160eb) {
                        objM1956L4 = new C0590pr(xk1Var5, 11);
                        go0Var6.m1981f0(objM1956L4);
                    }
                    tp0.m5357b(str6, (in0) objM1956L4, null, rg3.m4462P(R.string.modify_friends_count_hint, go0Var6), null, null, false, 0, 0, !((Boolean) xk1Var4.getValue()).booleanValue(), false, null, new m51(3, 123), null, go0Var6, 0, 384, 11764);
                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.modify_friends_count_description, go0Var6), fg1.m1615G(rh1Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var6.m1988j(tu2Var2)).f6238f, rg3.m4450D(12), null, 0L, 0, rg3.m4450D(17), null, null, 16646140), 0, false, 0, 0, go0Var6, 48, 1016);
                    if (((Boolean) xk1Var4.getValue()).booleanValue() || pv2.m4006s0((String) xk1Var5.getValue()) || num != null) {
                        go0Var6.m1966W(517771837);
                        go0Var6.m1994p(false);
                    } else {
                        go0Var6.m1966W(517381361);
                        AbstractC0179eu.m1446a(rg3.m4462P(R.string.modify_friends_count_invalid, go0Var6), fg1.m1615G(rh1Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var6.m1988j(tu2Var2)).f6239g, rg3.m4450D(12), im0Var, 0L, 0, rg3.m4450D(17), null, null, 16646136), 0, false, 0, 0, go0Var6, 48, 1016);
                        go0Var6.m1994p(false);
                    }
                }
                break;
            default:
                xm0 xm0Var3 = (xm0) obj6;
                String str7 = (String) obj5;
                in0 in0Var2 = (in0) obj4;
                pb2 pb2Var2 = (pb2) obj;
                InterfaceC0596px interfaceC0596px7 = (InterfaceC0596px) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                pb2Var2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((go0) interfaceC0596px7).m1980f(pb2Var2) ? 4 : 2;
                }
                go0 go0Var7 = (go0) interfaceC0596px7;
                if (!go0Var7.m1958O(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    go0Var7.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var7), xm0Var3, pb2.m3843a(pb2Var2), false, 0, go0Var7, 0, 56);
                    String strM4462P6 = rg3.m4462P(R.string.open_user_card_open, go0Var7);
                    boolean z2 = str7.length() > 0;
                    uh1 uh1VarM3843a = pb2.m3843a(pb2Var2);
                    boolean zM1980f5 = go0Var7.m1980f(in0Var2) | go0Var7.m1980f(str7);
                    Object objM1956L5 = go0Var7.m1956L();
                    if (zM1980f5 || objM1956L5 == c0160eb) {
                        objM1956L5 = new bu1(in0Var2, str7, 0);
                        go0Var7.m1981f0(objM1956L5);
                    }
                    AbstractC0691se.m4846q(strM4462P6, (xm0) objM1956L5, uh1VarM3843a, z2, 0, go0Var7, 0, 48);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0746tr(int i, Object obj, Object obj2, String str) {
        this.f10902h = i;
        this.f10904j = obj;
        this.f10903i = str;
        this.f10905k = obj2;
    }

    public /* synthetic */ C0746tr(Object obj, Object obj2, Object obj3, int i) {
        this.f10902h = i;
        this.f10903i = obj;
        this.f10904j = obj2;
        this.f10905k = obj3;
    }
}
