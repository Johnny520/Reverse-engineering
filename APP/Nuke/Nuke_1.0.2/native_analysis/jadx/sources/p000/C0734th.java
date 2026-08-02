package p000;

import java.util.ArrayList;
import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: th */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0734th implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10746h = 2;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f10747i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f10748j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xk1 f10749k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f10750l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f10751m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f10752n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f10753o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f10754p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f10755q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f10756r;

    public /* synthetic */ C0734th(wm0 wm0Var, List list, in0 in0Var, List list2, rs2 rs2Var, mn0 mn0Var, c73 c73Var, boolean z, in0 in0Var2, xk1 xk1Var) {
        this.f10750l = wm0Var;
        this.f10751m = list;
        this.f10747i = in0Var;
        this.f10752n = list2;
        this.f10753o = rs2Var;
        this.f10754p = mn0Var;
        this.f10755q = c73Var;
        this.f10748j = z;
        this.f10756r = in0Var2;
        this.f10749k = xk1Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) throws Throwable {
        go0 go0Var;
        int i = this.f10746h;
        xk1 xk1Var = this.f10749k;
        a83 a83Var = a83.f116a;
        C0160eb c0160eb = C0520nx.f7360a;
        Object obj4 = this.f10753o;
        Object obj5 = this.f10752n;
        Object obj6 = this.f10756r;
        Object obj7 = this.f10755q;
        Object obj8 = this.f10754p;
        Object obj9 = this.f10751m;
        Object obj10 = this.f10750l;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                xm0 xm0Var = (xm0) obj10;
                Long l = (Long) obj9;
                xk1 xk1Var2 = (xk1) obj5;
                xk1 xk1Var3 = (xk1) obj4;
                xk1 xk1Var4 = (xk1) obj8;
                xk1 xk1Var5 = (xk1) obj7;
                xk1 xk1Var6 = (xk1) obj6;
                pb2 pb2Var = (pb2) obj;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) interfaceC0596px).m1980f(pb2Var) ? 4 : 2;
                }
                go0 go0Var2 = (go0) interfaceC0596px;
                if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.m3843a(pb2Var), false, 0, go0Var2, 0, 56);
                    String strM4462P = rg3.m4462P(R.string.home_settings_save, go0Var2);
                    uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
                    boolean zM1980f = go0Var2.m1980f(l);
                    in0 in0Var = this.f10747i;
                    boolean zM1980f2 = zM1980f | go0Var2.m1980f(in0Var);
                    xk1 xk1Var7 = this.f10749k;
                    boolean zM1980f3 = zM1980f2 | go0Var2.m1980f(xk1Var7) | go0Var2.m1980f(xk1Var2) | go0Var2.m1980f(xk1Var3) | go0Var2.m1980f(xk1Var4) | go0Var2.m1980f(xk1Var5) | go0Var2.m1980f(xk1Var6);
                    Object objM1956L = go0Var2.m1956L();
                    if (zM1980f3 || objM1956L == c0160eb) {
                        objM1956L = new C0810vh(l, in0Var, xk1Var7, xk1Var2, xk1Var3, xk1Var4, xk1Var5, xk1Var6);
                        go0Var2.m1981f0(objM1956L);
                    }
                    AbstractC0691se.m4846q(strM4462P, (xm0) objM1956L, uh1VarM3843a, this.f10748j, 0, go0Var2, 0, 48);
                } else {
                    go0Var2.m1961R();
                }
                break;
            case 1:
                wm0 wm0Var = (wm0) obj10;
                List list = (List) obj9;
                List list2 = (List) obj5;
                rs2 rs2Var = (rs2) obj4;
                mn0 mn0Var = (mn0) obj8;
                c73 c73Var = (c73) obj7;
                in0 in0Var2 = (in0) obj6;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C0282hm) obj).getClass();
                go0 go0Var3 = (go0) interfaceC0596px2;
                if (go0Var3.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    in0 in0Var3 = this.f10747i;
                    if (wm0Var != null) {
                        go0Var3.m1966W(-546508667);
                        if (wm0Var == wm0.f12581o) {
                            go0Var3.m1966W(-546432965);
                            s11.m4698i(list, in0Var3, go0Var3, 0);
                            go0Var3.m1994p(false);
                            go0Var = go0Var3;
                        } else {
                            go0Var3.m1966W(-546194141);
                            boolean zM1980f4 = go0Var3.m1980f(list2) | go0Var3.m1976d(wm0Var.ordinal());
                            Object objM1956L2 = go0Var3.m1956L();
                            Object obj11 = objM1956L2;
                            if (zM1980f4 || objM1956L2 == c0160eb) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj12 : list2) {
                                    if (((AbstractC0255gw) obj12).mo143n() == wm0Var) {
                                        arrayList.add(obj12);
                                    }
                                }
                                go0Var3.m1981f0(arrayList);
                                obj11 = arrayList;
                            }
                            go0 go0Var4 = go0Var3;
                            t11.m5077c(wm0Var, (List) obj11, rs2Var, mn0Var, in0Var3, go0Var4, 0);
                            go0Var4.m1994p(false);
                            go0Var = go0Var4;
                        }
                        go0Var.m1994p(false);
                    } else if (((Integer) xk1Var.getValue()) != null) {
                        go0Var3.m1966W(-545429991);
                        Integer num = (Integer) xk1Var.getValue();
                        if (num != null) {
                            int iIntValue3 = num.intValue();
                            if (iIntValue3 == R.string.home_settings_appearance) {
                                go0Var3.m1966W(-545267427);
                                AbstractC0731te.m5204d(c73Var, this.f10748j, in0Var2, in0Var3, go0Var3, 8);
                                go0Var3.m1994p(false);
                            } else if (iIntValue3 == R.string.home_settings_scripts) {
                                go0Var3.m1966W(-544833954);
                                rg3.m4471g(in0Var3, go0Var3, 0);
                                go0Var3.m1994p(false);
                            } else if (iIntValue3 == R.string.home_settings_check_update) {
                                go0Var3.m1966W(-544581149);
                                AbstractC0691se.m4836g(in0Var3, null, go0Var3, 0);
                                go0Var3.m1994p(false);
                            } else if (iIntValue3 == R.string.home_settings_about_module) {
                                go0Var3.m1966W(-544333087);
                                AbstractC0731te.m5200b(in0Var3, go0Var3, 0);
                                go0Var3.m1994p(false);
                            } else {
                                go0Var3.m1966W(-544112026);
                                up0.m5537b(iIntValue3, in0Var3, go0Var3, 0);
                                go0Var3.m1994p(false);
                            }
                            go0Var3.m1994p(false);
                        } else {
                            go0Var3.m1994p(false);
                        }
                    } else {
                        go0Var3.m1966W(-543813992);
                        go0Var3.m1994p(false);
                    }
                } else {
                    go0Var3.m1961R();
                }
                break;
            default:
                List list3 = (List) obj10;
                List list4 = (List) obj9;
                rs2 rs2Var2 = (rs2) obj8;
                mn0 mn0Var2 = (mn0) obj7;
                final ep1 ep1Var = (ep1) obj6;
                final xk1 xk1Var8 = (xk1) obj5;
                final xk1 xk1Var9 = (xk1) obj4;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C0282hm) obj).getClass();
                go0 go0Var5 = (go0) interfaceC0596px3;
                if (go0Var5.m1958O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String str = (String) xk1Var.getValue();
                    boolean zM1980f5 = go0Var5.m1980f(xk1Var);
                    Object objM1956L3 = go0Var5.m1956L();
                    if (zM1980f5 || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0590pr(xk1Var, 10);
                        go0Var5.m1981f0(objM1956L3);
                    }
                    in0 in0Var4 = (in0) objM1956L3;
                    boolean zM1980f6 = go0Var5.m1980f(ep1Var) | go0Var5.m1980f(xk1Var8) | go0Var5.m1980f(xk1Var9);
                    Object objM1956L4 = go0Var5.m1956L();
                    if (zM1980f6 || objM1956L4 == c0160eb) {
                        objM1956L4 = new mn0() { // from class: qt0
                            @Override // p000.mn0
                            /* JADX INFO: renamed from: g */
                            public final Object mo12g(Object obj13, Object obj14) {
                                int i4 = i2;
                                a83 a83Var2 = a83.f116a;
                                xk1 xk1Var10 = xk1Var9;
                                xk1 xk1Var11 = xk1Var8;
                                ep1 ep1Var2 = ep1Var;
                                switch (i4) {
                                    case 0:
                                        wm0 wm0Var2 = (wm0) obj13;
                                        wm0Var2.getClass();
                                        ep1Var2.m1407e(((rs1) obj14).f9744a, new C0678s1((Object) wm0Var2, xk1Var11, xk1Var10, 12));
                                        break;
                                    default:
                                        yp2 yp2Var = (yp2) obj13;
                                        yp2Var.getClass();
                                        ep1Var2.m1407e(((rs1) obj14).f9744a, new C0678s1((Object) yp2Var, xk1Var11, xk1Var10, 11));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var5.m1981f0(objM1956L4);
                    }
                    mn0 mn0Var3 = (mn0) objM1956L4;
                    boolean zM1980f7 = go0Var5.m1980f(ep1Var) | go0Var5.m1980f(xk1Var9) | go0Var5.m1980f(xk1Var8);
                    Object objM1956L5 = go0Var5.m1956L();
                    if (zM1980f7 || objM1956L5 == c0160eb) {
                        objM1956L5 = new mn0() { // from class: qt0
                            @Override // p000.mn0
                            /* JADX INFO: renamed from: g */
                            public final Object mo12g(Object obj13, Object obj14) {
                                int i4 = i3;
                                a83 a83Var2 = a83.f116a;
                                xk1 xk1Var10 = xk1Var8;
                                xk1 xk1Var11 = xk1Var9;
                                ep1 ep1Var2 = ep1Var;
                                switch (i4) {
                                    case 0:
                                        wm0 wm0Var2 = (wm0) obj13;
                                        wm0Var2.getClass();
                                        ep1Var2.m1407e(((rs1) obj14).f9744a, new C0678s1((Object) wm0Var2, xk1Var11, xk1Var10, 12));
                                        break;
                                    default:
                                        yp2 yp2Var = (yp2) obj13;
                                        yp2Var.getClass();
                                        ep1Var2.m1407e(((rs1) obj14).f9744a, new C0678s1((Object) yp2Var, xk1Var11, xk1Var10, 11));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var5.m1981f0(objM1956L5);
                    }
                    AbstractC0179eu.m1454e(list3, list4, str, in0Var4, this.f10748j, this.f10747i, rs2Var2, mn0Var2, mn0Var3, (mn0) objM1956L5, go0Var5, 0);
                } else {
                    go0Var5.m1961R();
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0734th(xm0 xm0Var, Long l, in0 in0Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5, xk1 xk1Var6, boolean z) {
        this.f10750l = xm0Var;
        this.f10751m = l;
        this.f10747i = in0Var;
        this.f10749k = xk1Var;
        this.f10752n = xk1Var2;
        this.f10753o = xk1Var3;
        this.f10754p = xk1Var4;
        this.f10755q = xk1Var5;
        this.f10756r = xk1Var6;
        this.f10748j = z;
    }

    public /* synthetic */ C0734th(List list, List list2, xk1 xk1Var, boolean z, in0 in0Var, rs2 rs2Var, mn0 mn0Var, ep1 ep1Var, xk1 xk1Var2, xk1 xk1Var3) {
        this.f10750l = list;
        this.f10751m = list2;
        this.f10749k = xk1Var;
        this.f10748j = z;
        this.f10747i = in0Var;
        this.f10754p = rs2Var;
        this.f10755q = mn0Var;
        this.f10756r = ep1Var;
        this.f10752n = xk1Var2;
        this.f10753o = xk1Var3;
    }
}
