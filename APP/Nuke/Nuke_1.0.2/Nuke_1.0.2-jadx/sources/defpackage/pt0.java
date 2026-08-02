package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt0 implements mn0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ List i;
    public final /* synthetic */ List j;
    public final /* synthetic */ c73 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ in0 n;
    public final /* synthetic */ mn0 o;
    public final /* synthetic */ in0 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pt0(List list, mn0 mn0Var, List list2, boolean z, in0 in0Var, c73 c73Var, boolean z2, in0 in0Var2) {
        this.i = list;
        this.o = mn0Var;
        this.j = list2;
        this.l = z;
        this.n = in0Var;
        this.k = c73Var;
        this.m = z2;
        this.p = in0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        Object x92Var;
        a83 a83Var;
        int i = this.h;
        a83 a83Var2 = a83.a;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object[] objArr = new Object[0];
                    Object objL = go0Var.L();
                    eb ebVar = nx.a;
                    if (objL == ebVar) {
                        objL = new dy(14);
                        go0Var.f0(objL);
                    }
                    xk1 xk1Var = (xk1) gf1.M(objArr, (xm0) objL, go0Var, 48);
                    Object[] objArr2 = new Object[0];
                    Object objL2 = go0Var.L();
                    if (objL2 == ebVar) {
                        objL2 = new dy(15);
                        go0Var.f0(objL2);
                    }
                    xk1 xk1Var2 = (xk1) gf1.M(objArr2, (xm0) objL2, go0Var, 48);
                    Object[] objArr3 = new Object[0];
                    Object objL3 = go0Var.L();
                    if (objL3 == ebVar) {
                        objL3 = new dy(16);
                        go0Var.f0(objL3);
                    }
                    xk1 xk1Var3 = (xk1) gf1.M(objArr3, (xm0) objL3, go0Var, 48);
                    List list = this.i;
                    boolean zF = go0Var.f(list);
                    Object objL4 = go0Var.L();
                    Object obj3 = objL4;
                    if (zF || objL4 == ebVar) {
                        rs2 rs2Var = new rs2();
                        ArrayList<gx2> arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof gx2) {
                                arrayList.add(obj4);
                            }
                        }
                        for (gx2 gx2Var : arrayList) {
                            rs2Var.put(gx2Var.d(), Boolean.valueOf(ci0.N(gx2Var)));
                        }
                        go0Var.f0(rs2Var);
                        obj3 = rs2Var;
                    }
                    rs2 rs2Var2 = (rs2) obj3;
                    boolean zF2 = go0Var.f((String) xk1Var2.getValue());
                    Object objL5 = go0Var.L();
                    if (zF2 || objL5 == ebVar) {
                        String str = (String) xk1Var2.getValue();
                        if (str == null) {
                            objL5 = null;
                        } else {
                            try {
                                x92Var = wm0.valueOf(str);
                            } catch (Throwable th) {
                                x92Var = new x92(th);
                            }
                            if (x92Var instanceof x92) {
                                x92Var = null;
                            }
                            objL5 = (wm0) x92Var;
                        }
                        go0Var.f0(objL5);
                    }
                    wm0 wm0Var = (wm0) objL5;
                    boolean z = (wm0Var == null && ((Integer) xk1Var3.getValue()) == null) ? false : true;
                    Object objL6 = go0Var.L();
                    if (objL6 == ebVar) {
                        objL6 = eu.C(go0Var);
                        go0Var.f0(objL6);
                    }
                    j20 j20Var = (j20) objL6;
                    boolean zF3 = go0Var.f(j20Var);
                    Object objL7 = go0Var.L();
                    if (zF3 || objL7 == ebVar) {
                        objL7 = new ep1(j20Var, z);
                        go0Var.f0(objL7);
                    }
                    ep1 ep1Var = (ep1) objL7;
                    boolean zF4 = go0Var.f(rs2Var2);
                    mn0 mn0Var = this.o;
                    boolean zF5 = zF4 | go0Var.f(mn0Var);
                    Object objL8 = go0Var.L();
                    if (zF5 || objL8 == ebVar) {
                        objL8 = new af(10, rs2Var2, mn0Var);
                        go0Var.f0(objL8);
                    }
                    mn0 mn0Var2 = (mn0) objL8;
                    boolean zF6 = go0Var.f(xk1Var2) | go0Var.f(xk1Var3);
                    Object objL9 = go0Var.L();
                    if (zF6 || objL9 == ebVar) {
                        objL9 = new rt0(xk1Var2, xk1Var3, 0);
                        go0Var.f0(objL9);
                    }
                    xm0 xm0Var = (xm0) objL9;
                    boolean zF7 = go0Var.f(ep1Var) | go0Var.f(xm0Var);
                    Object objL10 = go0Var.L();
                    if (zF7 || objL10 == ebVar) {
                        objL10 = new d2(17, ep1Var, xm0Var);
                        go0Var.f0(objL10);
                    }
                    in0 in0Var = (in0) objL10;
                    boolean z2 = !pv2.s0((String) xk1Var.getValue()) && wm0Var == null && ((Integer) xk1Var3.getValue()) == null;
                    boolean zF8 = go0Var.f(xk1Var);
                    Object objL11 = go0Var.L();
                    if (zF8 || objL11 == ebVar) {
                        a83Var = a83Var2;
                        objL11 = new f0(xk1Var, 25);
                        go0Var.f0(objL11);
                    } else {
                        a83Var = a83Var2;
                    }
                    pp0.c(z2, (xm0) objL11, go0Var, 0, 0);
                    boolean zF9 = go0Var.f(ep1Var) | go0Var.f(xm0Var);
                    Object objL12 = go0Var.L();
                    if (zF9 || objL12 == ebVar) {
                        objL12 = new b2(ep1Var, xm0Var, (t00) null, 10);
                        go0Var.f0(objL12);
                    }
                    xe1.a(z, (mn0) objL12, go0Var, 0);
                    List list2 = this.j;
                    pp0.g(ep1Var, null, xe1.i0(-2001369463, new th(list, list2, xk1Var, this.l, this.n, rs2Var2, mn0Var2, ep1Var, xk1Var3, xk1Var2), go0Var), xe1.i0(211046474, new th(wm0Var, list2, in0Var, list, rs2Var2, mn0Var2, this.k, this.m, this.p, xk1Var3), go0Var), go0Var, 3456);
                } else {
                    go0Var.R();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                tp0.a(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (px) obj, pp0.N(513));
                break;
        }
        return a83Var2;
    }

    public /* synthetic */ pt0(List list, List list2, c73 c73Var, boolean z, boolean z2, in0 in0Var, mn0 mn0Var, in0 in0Var2, int i) {
        this.i = list;
        this.j = list2;
        this.k = c73Var;
        this.l = z;
        this.m = z2;
        this.n = in0Var;
        this.o = mn0Var;
        this.p = in0Var2;
    }
}
