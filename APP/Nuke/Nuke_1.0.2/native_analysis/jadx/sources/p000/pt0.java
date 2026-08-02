package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8553h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f8554i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f8555j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ c73 f8556k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f8557l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f8558m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ in0 f8559n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ mn0 f8560o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ in0 f8561p;

    public /* synthetic */ pt0(List list, mn0 mn0Var, List list2, boolean z, in0 in0Var, c73 c73Var, boolean z2, in0 in0Var2) {
        this.f8554i = list;
        this.f8560o = mn0Var;
        this.f8555j = list2;
        this.f8557l = z;
        this.f8559n = in0Var;
        this.f8556k = c73Var;
        this.f8558m = z2;
        this.f8561p = in0Var2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        Object x92Var;
        a83 a83Var;
        int i = this.f8553h;
        a83 a83Var2 = a83.f116a;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object[] objArr = new Object[0];
                    Object objM1956L = go0Var.m1956L();
                    C0160eb c0160eb = C0520nx.f7360a;
                    if (objM1956L == c0160eb) {
                        objM1956L = new C0146dy(14);
                        go0Var.m1981f0(objM1956L);
                    }
                    xk1 xk1Var = (xk1) gf1.m1865M(objArr, (xm0) objM1956L, go0Var, 48);
                    Object[] objArr2 = new Object[0];
                    Object objM1956L2 = go0Var.m1956L();
                    if (objM1956L2 == c0160eb) {
                        objM1956L2 = new C0146dy(15);
                        go0Var.m1981f0(objM1956L2);
                    }
                    xk1 xk1Var2 = (xk1) gf1.m1865M(objArr2, (xm0) objM1956L2, go0Var, 48);
                    Object[] objArr3 = new Object[0];
                    Object objM1956L3 = go0Var.m1956L();
                    if (objM1956L3 == c0160eb) {
                        objM1956L3 = new C0146dy(16);
                        go0Var.m1981f0(objM1956L3);
                    }
                    xk1 xk1Var3 = (xk1) gf1.m1865M(objArr3, (xm0) objM1956L3, go0Var, 48);
                    List list = this.f8554i;
                    boolean zM1980f = go0Var.m1980f(list);
                    Object objM1956L4 = go0Var.m1956L();
                    Object obj3 = objM1956L4;
                    if (zM1980f || objM1956L4 == c0160eb) {
                        rs2 rs2Var = new rs2();
                        ArrayList<gx2> arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof gx2) {
                                arrayList.add(obj4);
                            }
                        }
                        for (gx2 gx2Var : arrayList) {
                            rs2Var.put(gx2Var.mo9d(), Boolean.valueOf(ci0.m789N(gx2Var)));
                        }
                        go0Var.m1981f0(rs2Var);
                        obj3 = rs2Var;
                    }
                    rs2 rs2Var2 = (rs2) obj3;
                    boolean zM1980f2 = go0Var.m1980f((String) xk1Var2.getValue());
                    Object objM1956L5 = go0Var.m1956L();
                    if (zM1980f2 || objM1956L5 == c0160eb) {
                        String str = (String) xk1Var2.getValue();
                        if (str == null) {
                            objM1956L5 = null;
                        } else {
                            try {
                                x92Var = wm0.valueOf(str);
                            } catch (Throwable th) {
                                x92Var = new x92(th);
                            }
                            if (x92Var instanceof x92) {
                                x92Var = null;
                            }
                            objM1956L5 = (wm0) x92Var;
                        }
                        go0Var.m1981f0(objM1956L5);
                    }
                    wm0 wm0Var = (wm0) objM1956L5;
                    boolean z = (wm0Var == null && ((Integer) xk1Var3.getValue()) == null) ? false : true;
                    Object objM1956L6 = go0Var.m1956L();
                    if (objM1956L6 == c0160eb) {
                        objM1956L6 = AbstractC0179eu.m1422C(go0Var);
                        go0Var.m1981f0(objM1956L6);
                    }
                    j20 j20Var = (j20) objM1956L6;
                    boolean zM1980f3 = go0Var.m1980f(j20Var);
                    Object objM1956L7 = go0Var.m1956L();
                    if (zM1980f3 || objM1956L7 == c0160eb) {
                        objM1956L7 = new ep1(j20Var, z);
                        go0Var.m1981f0(objM1956L7);
                    }
                    ep1 ep1Var = (ep1) objM1956L7;
                    boolean zM1980f4 = go0Var.m1980f(rs2Var2);
                    mn0 mn0Var = this.f8560o;
                    boolean zM1980f5 = zM1980f4 | go0Var.m1980f(mn0Var);
                    Object objM1956L8 = go0Var.m1956L();
                    if (zM1980f5 || objM1956L8 == c0160eb) {
                        objM1956L8 = new C0016af(10, rs2Var2, mn0Var);
                        go0Var.m1981f0(objM1956L8);
                    }
                    mn0 mn0Var2 = (mn0) objM1956L8;
                    boolean zM1980f6 = go0Var.m1980f(xk1Var2) | go0Var.m1980f(xk1Var3);
                    Object objM1956L9 = go0Var.m1956L();
                    if (zM1980f6 || objM1956L9 == c0160eb) {
                        objM1956L9 = new rt0(xk1Var2, xk1Var3, 0);
                        go0Var.m1981f0(objM1956L9);
                    }
                    xm0 xm0Var = (xm0) objM1956L9;
                    boolean zM1980f7 = go0Var.m1980f(ep1Var) | go0Var.m1980f(xm0Var);
                    Object objM1956L10 = go0Var.m1956L();
                    if (zM1980f7 || objM1956L10 == c0160eb) {
                        objM1956L10 = new C0115d2(17, ep1Var, xm0Var);
                        go0Var.m1981f0(objM1956L10);
                    }
                    in0 in0Var = (in0) objM1956L10;
                    boolean z2 = !pv2.m4006s0((String) xk1Var.getValue()) && wm0Var == null && ((Integer) xk1Var3.getValue()) == null;
                    boolean zM1980f8 = go0Var.m1980f(xk1Var);
                    Object objM1956L11 = go0Var.m1956L();
                    if (zM1980f8 || objM1956L11 == c0160eb) {
                        a83Var = a83Var2;
                        objM1956L11 = new C0186f0(xk1Var, 25);
                        go0Var.m1981f0(objM1956L11);
                    } else {
                        a83Var = a83Var2;
                    }
                    pp0.m3905c(z2, (xm0) objM1956L11, go0Var, 0, 0);
                    boolean zM1980f9 = go0Var.m1980f(ep1Var) | go0Var.m1980f(xm0Var);
                    Object objM1956L12 = go0Var.m1956L();
                    if (zM1980f9 || objM1956L12 == c0160eb) {
                        objM1956L12 = new C0040b2(ep1Var, xm0Var, (t00) null, 10);
                        go0Var.m1981f0(objM1956L12);
                    }
                    xe1.m6109a(z, (mn0) objM1956L12, go0Var, 0);
                    List list2 = this.f8555j;
                    pp0.m3909g(ep1Var, null, xe1.m6126i0(-2001369463, new C0734th(list, list2, xk1Var, this.f8557l, this.f8559n, rs2Var2, mn0Var2, ep1Var, xk1Var3, xk1Var2), go0Var), xe1.m6126i0(211046474, new C0734th(wm0Var, list2, in0Var, list, rs2Var2, mn0Var2, this.f8556k, this.f8558m, this.f8561p, xk1Var3), go0Var), go0Var, 3456);
                } else {
                    go0Var.m1961R();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                tp0.m5356a(this.f8554i, this.f8555j, this.f8556k, this.f8557l, this.f8558m, this.f8559n, this.f8560o, this.f8561p, (InterfaceC0596px) obj, pp0.m3902N(513));
                break;
        }
        return a83Var2;
    }

    public /* synthetic */ pt0(List list, List list2, c73 c73Var, boolean z, boolean z2, in0 in0Var, mn0 mn0Var, in0 in0Var2, int i) {
        this.f8554i = list;
        this.f8555j = list2;
        this.f8556k = c73Var;
        this.f8557l = z;
        this.f8558m = z2;
        this.f8559n = in0Var;
        this.f8560o = mn0Var;
        this.f8561p = in0Var2;
    }
}
