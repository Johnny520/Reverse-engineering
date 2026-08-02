package p000;

import java.util.LinkedHashMap;
import java.util.List;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: v1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0794v1 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11591h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f11592i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f11593j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f11594k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f11595l;

    public /* synthetic */ C0794v1(AbstractC0255gw abstractC0255gw, rs2 rs2Var, mn0 mn0Var, in0 in0Var, int i) {
        this.f11591h = 5;
        this.f11593j = abstractC0255gw;
        this.f11594k = rs2Var;
        this.f11595l = mn0Var;
        this.f11592i = in0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11591h;
        C0160eb c0160eb = C0520nx.f7360a;
        a83 a83Var = a83.f116a;
        final int i2 = 1;
        Object obj3 = this.f11595l;
        Object obj4 = this.f11594k;
        Object obj5 = this.f11593j;
        Object obj6 = this.f11592i;
        switch (i) {
            case 0:
                in0 in0Var = (in0) obj6;
                String str = (String) obj5;
                List list = (List) obj4;
                List list2 = (List) obj3;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yi0 yi0Var = AbstractC0731te.f10695g;
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l = go0Var.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, yi0Var);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy = C0256gx.f3727b;
                    go0Var.m1969Z();
                    if (go0Var.f3613S) {
                        go0Var.m1989k(c0367jy);
                    } else {
                        go0Var.m1987i0();
                    }
                    yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
                    yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                    yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                    yf3.m6267b(go0Var, C0256gx.f3732g);
                    yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                    tp0.m5358c(rg3.m4462P(R.string.home_settings_about_module, go0Var), null, null, in0Var, go0Var, 0, 30);
                    uh1 uh1VarMo4491c = AbstractC0731te.f10693e.mo4491c(new g71(1.0f, true));
                    jw1 jw1VarM1635h = fg1.m1635h();
                    C0884xf c0884xf = new C0884xf(12.0f, new C0676s(2));
                    boolean zM1980f = go0Var.m1980f(str) | go0Var.m1984h(list) | go0Var.m1984h(list2);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1980f || objM1956L == c0160eb) {
                        objM1956L = new C0444m0(1, list, list2, str);
                        go0Var.m1981f0(objM1956L);
                    }
                    rg3.m4468d(24960, 490, null, c0884xf, null, go0Var, null, (in0) objM1956L, null, uh1VarMo4491c, jw1VarM1635h, false);
                    go0Var.m1994p(true);
                } else {
                    go0Var.m1961R();
                }
                return a83Var;
            case 1:
                EnumC0578pf enumC0578pf = (EnumC0578pf) obj5;
                in0 in0Var2 = (in0) obj6;
                c73 c73Var = (c73) obj4;
                final LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strM4462P = rg3.m4462P(R.string.home_settings_theme, go0Var2);
                    String strM4462P2 = rg3.m4462P(R.string.home_settings_theme_subtitle, go0Var2);
                    boolean zM1980f2 = go0Var2.m1980f(in0Var2) | go0Var2.m1984h(c73Var);
                    Object objM1956L2 = go0Var2.m1956L();
                    if (zM1980f2 || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0275hf(in0Var2, c73Var, 1);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    in0 in0Var3 = (in0) objM1956L2;
                    boolean zM1984h = go0Var2.m1984h(linkedHashMap);
                    Object objM1956L3 = go0Var2.m1956L();
                    if (zM1984h || objM1956L3 == c0160eb) {
                        objM1956L3 = new in0() { // from class: jf
                            @Override // p000.in0
                            /* JADX INFO: renamed from: j */
                            public final Object mo5j(Object obj7) {
                                int i3 = i2;
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                switch (i3) {
                                    case 0:
                                        x51 x51Var = (x51) obj7;
                                        x51Var.getClass();
                                        return (String) we1.m5875p0(x51Var, linkedHashMap2);
                                    default:
                                        EnumC0578pf enumC0578pf2 = (EnumC0578pf) obj7;
                                        enumC0578pf2.getClass();
                                        return (String) we1.m5875p0(enumC0578pf2, linkedHashMap2);
                                }
                            }
                        };
                        go0Var2.m1981f0(objM1956L3);
                    }
                    AbstractC0179eu.m1463m(strM4462P, EnumC0578pf.f8294m, enumC0578pf, in0Var3, null, strM4462P2, (in0) objM1956L3, false, go0Var2, 0);
                } else {
                    go0Var2.m1961R();
                }
                return a83Var;
            case 2:
                x51 x51Var = (x51) obj5;
                in0 in0Var4 = (in0) obj6;
                c73 c73Var2 = (c73) obj4;
                final LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj3;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strM4462P3 = rg3.m4462P(R.string.home_settings_language, go0Var3);
                    String strM4462P4 = rg3.m4462P(R.string.home_settings_language_subtitle, go0Var3);
                    boolean zM1980f3 = go0Var3.m1980f(in0Var4) | go0Var3.m1984h(c73Var2);
                    Object objM1956L4 = go0Var3.m1956L();
                    if (zM1980f3 || objM1956L4 == c0160eb) {
                        objM1956L4 = new C0275hf(in0Var4, c73Var2, 0);
                        go0Var3.m1981f0(objM1956L4);
                    }
                    in0 in0Var5 = (in0) objM1956L4;
                    boolean zM1984h2 = go0Var3.m1984h(linkedHashMap2);
                    Object objM1956L5 = go0Var3.m1956L();
                    if (zM1984h2 || objM1956L5 == c0160eb) {
                        final boolean z = false ? 1 : 0;
                        objM1956L5 = new in0() { // from class: jf
                            @Override // p000.in0
                            /* JADX INFO: renamed from: j */
                            public final Object mo5j(Object obj7) {
                                int i3 = z;
                                LinkedHashMap linkedHashMap22 = linkedHashMap2;
                                switch (i3) {
                                    case 0:
                                        x51 x51Var2 = (x51) obj7;
                                        x51Var2.getClass();
                                        return (String) we1.m5875p0(x51Var2, linkedHashMap22);
                                    default:
                                        EnumC0578pf enumC0578pf2 = (EnumC0578pf) obj7;
                                        enumC0578pf2.getClass();
                                        return (String) we1.m5875p0(enumC0578pf2, linkedHashMap22);
                                }
                            }
                        };
                        go0Var3.m1981f0(objM1956L5);
                    }
                    AbstractC0179eu.m1463m(strM4462P3, x51.f12816m, x51Var, in0Var5, null, strM4462P4, (in0) objM1956L5, false, go0Var3, 0);
                } else {
                    go0Var3.m1961R();
                }
                return a83Var;
            case 3:
                uh1 uh1Var = (uh1) obj6;
                xk1 xk1Var = (xk1) obj5;
                C0402kw c0402kw = (C0402kw) obj4;
                C0243gk c0243gk = (C0243gk) obj3;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objM1956L6 = go0Var4.m1956L();
                    if (objM1956L6 == c0160eb) {
                        objM1956L6 = new C0260h0(xk1Var, 25);
                        go0Var4.m1981f0(objM1956L6);
                    }
                    uh1 uh1VarM5053E = t11.m5053E(uh1Var, (in0) objM1956L6);
                    nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, true);
                    int iHashCode2 = Long.hashCode(go0Var4.f3614T);
                    yy1 yy1VarM1990l2 = go0Var4.m1990l();
                    uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var4, uh1VarM5053E);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy2 = C0256gx.f3727b;
                    go0Var4.m1969Z();
                    if (go0Var4.f3613S) {
                        go0Var4.m1989k(c0367jy2);
                    } else {
                        go0Var4.m1987i0();
                    }
                    yf3.m6268c(go0Var4, C0256gx.f3730e, nf1VarM1060d);
                    yf3.m6268c(go0Var4, C0256gx.f3729d, yy1VarM1990l2);
                    yf3.m6268c(go0Var4, C0256gx.f3731f, Integer.valueOf(iHashCode2));
                    yf3.m6267b(go0Var4, C0256gx.f3732g);
                    yf3.m6268c(go0Var4, C0256gx.f3728c, uh1VarM5285M2);
                    c0402kw.mo12g(go0Var4, 0);
                    Object objM1956L7 = go0Var4.m1956L();
                    if (objM1956L7 == c0160eb) {
                        objM1956L7 = new C0186f0(xk1Var, 16);
                        go0Var4.m1981f0(objM1956L7);
                    }
                    c0243gk.m1929b((xm0) objM1956L7, go0Var4, 6);
                    go0Var4.m1994p(true);
                } else {
                    go0Var4.m1961R();
                }
                return a83Var;
            case 4:
                List list3 = (List) obj4;
                rs2 rs2Var = (rs2) obj6;
                mn0 mn0Var = (mn0) obj5;
                mn0 mn0Var2 = (mn0) obj3;
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                go0 go0Var5 = (go0) interfaceC0596px5;
                if (go0Var5.m1958O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int i3 = 0;
                    for (Object obj7 : list3) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0179eu.m1447a0();
                            throw null;
                        }
                        AbstractC0255gw abstractC0255gw = (AbstractC0255gw) obj7;
                        boolean zM1980f4 = go0Var5.m1980f(mn0Var2) | go0Var5.m1984h(abstractC0255gw);
                        Object objM1956L8 = go0Var5.m1956L();
                        Object obj8 = objM1956L8;
                        if (zM1980f4 || objM1956L8 == c0160eb) {
                            C0115d2 c0115d2 = new C0115d2(16, mn0Var2, abstractC0255gw);
                            go0Var5.m1981f0(c0115d2);
                            obj8 = c0115d2;
                        }
                        ci0.m810k(abstractC0255gw, rs2Var, mn0Var, (in0) obj8, go0Var5, 8);
                        if (i3 < list3.size() - 1) {
                            go0Var5.m1966W(303243273);
                            ci0.m805f(0.0f, go0Var5, 0, 1);
                            go0Var5.m1994p(false);
                        } else {
                            go0Var5.m1966W(303286518);
                            go0Var5.m1994p(false);
                        }
                        i3 = i4;
                    }
                } else {
                    go0Var5.m1961R();
                }
                return a83Var;
            case 5:
                ((Integer) obj2).getClass();
                ci0.m810k((AbstractC0255gw) obj5, (rs2) obj4, (mn0) obj3, (in0) obj6, (InterfaceC0596px) obj, pp0.m3902N(9));
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((Integer) obj2).getClass();
                AbstractC0738tl.m5300b((xm0) obj6, (uh1) obj5, (j81) obj4, (w81) obj3, (InterfaceC0596px) obj, pp0.m3902N(1));
                return a83Var;
            case 7:
                ((Integer) obj2).getClass();
                ff1.m1608b((C0593pu) obj6, (hq2) obj5, (o63) obj4, (C0402kw) obj3, (InterfaceC0596px) obj, pp0.m3902N(3073));
                return a83Var;
            case 8:
                ((Integer) obj2).getClass();
                pp0.m3909g((ep1) obj6, (uh1) obj5, (C0402kw) obj4, (C0402kw) obj3, (InterfaceC0596px) obj, pp0.m3902N(3457));
                return a83Var;
            default:
                in0 in0Var6 = (in0) obj6;
                gu2 gu2Var = (gu2) obj4;
                gu2 gu2Var2 = (gu2) obj3;
                InterfaceC0596px interfaceC0596px6 = (InterfaceC0596px) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                go0 go0Var6 = (go0) interfaceC0596px6;
                if (go0Var6.m1958O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var6, 48);
                    int iHashCode3 = Long.hashCode(go0Var6.f3614T);
                    yy1 yy1VarM1990l3 = go0Var6.m1990l();
                    rh1 rh1Var = rh1.f9587a;
                    uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var6, rh1Var);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy3 = C0256gx.f3727b;
                    go0Var6.m1969Z();
                    if (go0Var6.f3613S) {
                        go0Var6.m1989k(c0367jy3);
                    } else {
                        go0Var6.m1987i0();
                    }
                    yf3.m6268c(go0Var6, C0256gx.f3730e, ob2VarM3265a);
                    yf3.m6268c(go0Var6, C0256gx.f3729d, yy1VarM1990l3);
                    yf3.m6268c(go0Var6, C0256gx.f3731f, Integer.valueOf(iHashCode3));
                    yf3.m6267b(go0Var6, C0256gx.f3732g);
                    yf3.m6268c(go0Var6, C0256gx.f3728c, uh1VarM5285M3);
                    String str2 = (String) in0Var6.mo5j(obj5);
                    go0Var6.m1966W(-2020066745);
                    tu2 tu2Var = ur1.f11452a;
                    long j = ((lp1) go0Var6.m1988j(tu2Var)).f6239g;
                    go0Var6.m1994p(false);
                    AbstractC0179eu.m1446a(str2, null, new m13(j, rg3.m4450D(14), im0.f4681k, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var6, 0, 1018);
                    rp0.m4529O(go0Var6, AbstractC0731te.m5231q0(rh1Var, 6.0f));
                    boolean zM1980f5 = go0Var6.m1980f(gu2Var) | go0Var6.m1980f(gu2Var2);
                    Object objM1956L9 = go0Var6.m1956L();
                    if (zM1980f5 || objM1956L9 == c0160eb) {
                        objM1956L9 = new er1(gu2Var, gu2Var2, 0);
                        go0Var6.m1981f0(objM1956L9);
                    }
                    uh1 uh1VarM5183L = AbstractC0731te.m5183L(rh1Var, (in0) objM1956L9);
                    go0Var6.m1966W(-2020047698);
                    long j2 = ((lp1) go0Var6.m1988j(tu2Var)).f6238f;
                    go0Var6.m1994p(false);
                    AbstractC0179eu.m1462l(uh1VarM5183L, j2, go0Var6, 0);
                    go0Var6.m1994p(true);
                } else {
                    go0Var6.m1961R();
                }
                return a83Var;
        }
    }

    public /* synthetic */ C0794v1(Enum r1, in0 in0Var, c73 c73Var, LinkedHashMap linkedHashMap, int i) {
        this.f11591h = i;
        this.f11593j = r1;
        this.f11592i = in0Var;
        this.f11594k = c73Var;
        this.f11595l = linkedHashMap;
    }

    public /* synthetic */ C0794v1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f11591h = i;
        this.f11592i = obj;
        this.f11593j = obj2;
        this.f11594k = obj3;
        this.f11595l = obj4;
    }

    public /* synthetic */ C0794v1(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f11591h = i2;
        this.f11592i = obj;
        this.f11593j = obj2;
        this.f11594k = obj3;
        this.f11595l = obj4;
    }

    public /* synthetic */ C0794v1(List list, rs2 rs2Var, mn0 mn0Var, mn0 mn0Var2) {
        this.f11591h = 4;
        this.f11594k = list;
        this.f11592i = rs2Var;
        this.f11593j = mn0Var;
        this.f11595l = mn0Var2;
    }
}
