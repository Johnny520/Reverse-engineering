package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th implements nn0 {
    public final /* synthetic */ int h = 2;
    public final /* synthetic */ in0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ xk1 k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ th(wm0 wm0Var, List list, in0 in0Var, List list2, rs2 rs2Var, mn0 mn0Var, c73 c73Var, boolean z, in0 in0Var2, xk1 xk1Var) {
        this.l = wm0Var;
        this.m = list;
        this.i = in0Var;
        this.n = list2;
        this.o = rs2Var;
        this.p = mn0Var;
        this.q = c73Var;
        this.j = z;
        this.r = in0Var2;
        this.k = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) throws Throwable {
        go0 go0Var;
        int i = this.h;
        xk1 xk1Var = this.k;
        a83 a83Var = a83.a;
        eb ebVar = nx.a;
        Object obj4 = this.o;
        Object obj5 = this.n;
        Object obj6 = this.r;
        Object obj7 = this.q;
        Object obj8 = this.p;
        Object obj9 = this.m;
        Object obj10 = this.l;
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
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) pxVar).f(pb2Var) ? 4 : 2;
                }
                go0 go0Var2 = (go0) pxVar;
                if (go0Var2.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.a(pb2Var), false, 0, go0Var2, 0, 56);
                    String strP = rg3.P(R.string.home_settings_save, go0Var2);
                    uh1 uh1VarA = pb2.a(pb2Var);
                    boolean zF = go0Var2.f(l);
                    in0 in0Var = this.i;
                    boolean zF2 = zF | go0Var2.f(in0Var);
                    xk1 xk1Var7 = this.k;
                    boolean zF3 = zF2 | go0Var2.f(xk1Var7) | go0Var2.f(xk1Var2) | go0Var2.f(xk1Var3) | go0Var2.f(xk1Var4) | go0Var2.f(xk1Var5) | go0Var2.f(xk1Var6);
                    Object objL = go0Var2.L();
                    if (zF3 || objL == ebVar) {
                        objL = new vh(l, in0Var, xk1Var7, xk1Var2, xk1Var3, xk1Var4, xk1Var5, xk1Var6);
                        go0Var2.f0(objL);
                    }
                    se.q(strP, (xm0) objL, uh1VarA, this.j, 0, go0Var2, 0, 48);
                } else {
                    go0Var2.R();
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
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((hm) obj).getClass();
                go0 go0Var3 = (go0) pxVar2;
                if (go0Var3.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    in0 in0Var3 = this.i;
                    if (wm0Var != null) {
                        go0Var3.W(-546508667);
                        if (wm0Var == wm0.o) {
                            go0Var3.W(-546432965);
                            s11.i(list, in0Var3, go0Var3, 0);
                            go0Var3.p(false);
                            go0Var = go0Var3;
                        } else {
                            go0Var3.W(-546194141);
                            boolean zF4 = go0Var3.f(list2) | go0Var3.d(wm0Var.ordinal());
                            Object objL2 = go0Var3.L();
                            Object obj11 = objL2;
                            if (zF4 || objL2 == ebVar) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj12 : list2) {
                                    if (((gw) obj12).n() == wm0Var) {
                                        arrayList.add(obj12);
                                    }
                                }
                                go0Var3.f0(arrayList);
                                obj11 = arrayList;
                            }
                            go0 go0Var4 = go0Var3;
                            t11.c(wm0Var, (List) obj11, rs2Var, mn0Var, in0Var3, go0Var4, 0);
                            go0Var4.p(false);
                            go0Var = go0Var4;
                        }
                        go0Var.p(false);
                    } else if (((Integer) xk1Var.getValue()) != null) {
                        go0Var3.W(-545429991);
                        Integer num = (Integer) xk1Var.getValue();
                        if (num != null) {
                            int iIntValue3 = num.intValue();
                            if (iIntValue3 == R.string.home_settings_appearance) {
                                go0Var3.W(-545267427);
                                te.d(c73Var, this.j, in0Var2, in0Var3, go0Var3, 8);
                                go0Var3.p(false);
                            } else if (iIntValue3 == R.string.home_settings_scripts) {
                                go0Var3.W(-544833954);
                                rg3.g(in0Var3, go0Var3, 0);
                                go0Var3.p(false);
                            } else if (iIntValue3 == R.string.home_settings_check_update) {
                                go0Var3.W(-544581149);
                                se.g(in0Var3, null, go0Var3, 0);
                                go0Var3.p(false);
                            } else if (iIntValue3 == R.string.home_settings_about_module) {
                                go0Var3.W(-544333087);
                                te.b(in0Var3, go0Var3, 0);
                                go0Var3.p(false);
                            } else {
                                go0Var3.W(-544112026);
                                up0.b(iIntValue3, in0Var3, go0Var3, 0);
                                go0Var3.p(false);
                            }
                            go0Var3.p(false);
                        } else {
                            go0Var3.p(false);
                        }
                    } else {
                        go0Var3.W(-543813992);
                        go0Var3.p(false);
                    }
                } else {
                    go0Var3.R();
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
                px pxVar3 = (px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((hm) obj).getClass();
                go0 go0Var5 = (go0) pxVar3;
                if (go0Var5.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String str = (String) xk1Var.getValue();
                    boolean zF5 = go0Var5.f(xk1Var);
                    Object objL3 = go0Var5.L();
                    if (zF5 || objL3 == ebVar) {
                        objL3 = new pr(xk1Var, 10);
                        go0Var5.f0(objL3);
                    }
                    in0 in0Var4 = (in0) objL3;
                    boolean zF6 = go0Var5.f(ep1Var) | go0Var5.f(xk1Var8) | go0Var5.f(xk1Var9);
                    Object objL4 = go0Var5.L();
                    if (zF6 || objL4 == ebVar) {
                        objL4 = new mn0() { // from class: qt0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.mn0
                            public final Object g(Object obj13, Object obj14) {
                                int i4 = i2;
                                a83 a83Var2 = a83.a;
                                xk1 xk1Var10 = xk1Var9;
                                xk1 xk1Var11 = xk1Var8;
                                ep1 ep1Var2 = ep1Var;
                                switch (i4) {
                                    case 0:
                                        wm0 wm0Var2 = (wm0) obj13;
                                        wm0Var2.getClass();
                                        ep1Var2.e(((rs1) obj14).a, new s1((Object) wm0Var2, xk1Var11, xk1Var10, 12));
                                        break;
                                    default:
                                        yp2 yp2Var = (yp2) obj13;
                                        yp2Var.getClass();
                                        ep1Var2.e(((rs1) obj14).a, new s1((Object) yp2Var, xk1Var11, xk1Var10, 11));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var5.f0(objL4);
                    }
                    mn0 mn0Var3 = (mn0) objL4;
                    boolean zF7 = go0Var5.f(ep1Var) | go0Var5.f(xk1Var9) | go0Var5.f(xk1Var8);
                    Object objL5 = go0Var5.L();
                    if (zF7 || objL5 == ebVar) {
                        objL5 = new mn0() { // from class: qt0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.mn0
                            public final Object g(Object obj13, Object obj14) {
                                int i4 = i3;
                                a83 a83Var2 = a83.a;
                                xk1 xk1Var10 = xk1Var8;
                                xk1 xk1Var11 = xk1Var9;
                                ep1 ep1Var2 = ep1Var;
                                switch (i4) {
                                    case 0:
                                        wm0 wm0Var2 = (wm0) obj13;
                                        wm0Var2.getClass();
                                        ep1Var2.e(((rs1) obj14).a, new s1((Object) wm0Var2, xk1Var11, xk1Var10, 12));
                                        break;
                                    default:
                                        yp2 yp2Var = (yp2) obj13;
                                        yp2Var.getClass();
                                        ep1Var2.e(((rs1) obj14).a, new s1((Object) yp2Var, xk1Var11, xk1Var10, 11));
                                        break;
                                }
                                return a83Var2;
                            }
                        };
                        go0Var5.f0(objL5);
                    }
                    eu.e(list3, list4, str, in0Var4, this.j, this.i, rs2Var2, mn0Var2, mn0Var3, (mn0) objL5, go0Var5, 0);
                } else {
                    go0Var5.R();
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ th(xm0 xm0Var, Long l, in0 in0Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5, xk1 xk1Var6, boolean z) {
        this.l = xm0Var;
        this.m = l;
        this.i = in0Var;
        this.k = xk1Var;
        this.n = xk1Var2;
        this.o = xk1Var3;
        this.p = xk1Var4;
        this.q = xk1Var5;
        this.r = xk1Var6;
        this.j = z;
    }

    public /* synthetic */ th(List list, List list2, xk1 xk1Var, boolean z, in0 in0Var, rs2 rs2Var, mn0 mn0Var, ep1 ep1Var, xk1 xk1Var2, xk1 xk1Var3) {
        this.l = list;
        this.m = list2;
        this.k = xk1Var;
        this.j = z;
        this.i = in0Var;
        this.p = rs2Var;
        this.q = mn0Var;
        this.r = ep1Var;
        this.n = xk1Var2;
        this.o = xk1Var3;
    }
}
