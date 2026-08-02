package p000;

import android.content.Context;
import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: ze */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0959ze implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13846h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13847i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f13848j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f13849k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f13850l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f13851m;

    public /* synthetic */ C0959ze(in0 in0Var, Context context, kx1 kx1Var, xk1 xk1Var, xk1 xk1Var2) {
        this.f13846h = 0;
        this.f13847i = in0Var;
        this.f13848j = context;
        this.f13849k = kx1Var;
        this.f13850l = xk1Var;
        this.f13851m = xk1Var2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f13846h;
        C0160eb c0160eb = C0520nx.f7360a;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f13851m;
        Object obj4 = this.f13847i;
        Object obj5 = this.f13850l;
        Object obj6 = this.f13849k;
        Object obj7 = this.f13848j;
        switch (i) {
            case 0:
                in0 in0Var = (in0) obj4;
                Context context = (Context) obj7;
                kx1 kx1Var = (kx1) obj6;
                xk1 xk1Var = (xk1) obj5;
                xk1 xk1Var2 = (xk1) obj3;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
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
                    tp0.m5358c(rg3.m4462P(R.string.home_settings_check_update, go0Var), null, null, in0Var, go0Var, 0, 30);
                    yi0 yi0Var2 = AbstractC0731te.f10693e;
                    jw1 jw1Var = new jw1(18.0f, 4.0f, 18.0f, 20.0f);
                    C0884xf c0884xf = new C0884xf(12.0f, new C0676s(2));
                    boolean zM1984h = go0Var.m1984h(context) | go0Var.m1980f(kx1Var);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1984h || objM1956L == c0160eb) {
                        C0575pc c0575pc = new C0575pc(context, kx1Var, xk1Var, xk1Var2, 1);
                        go0Var.m1981f0(c0575pc);
                        objM1956L = c0575pc;
                    }
                    rg3.m4468d(24582, 490, null, c0884xf, null, go0Var, null, (in0) objM1956L, null, yi0Var2, jw1Var, false);
                    go0Var.m1994p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0691se.m4833d((String) obj7, (String) obj6, (String) obj5, (xm0) obj3, (in0) obj4, (InterfaceC0596px) obj, pp0.m3902N(3073));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ci0.m809j((List) obj4, (mn0) obj7, (rs2) obj6, (mn0) obj5, (String) obj3, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                t11.m5077c((wm0) obj7, (List) obj6, (rs2) obj5, (mn0) obj3, (in0) obj4, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            case 4:
                uh1 uh1Var = (uh1) obj4;
                xk1 xk1Var3 = (xk1) obj5;
                C0402kw c0402kw = (C0402kw) obj7;
                C0243gk c0243gk = (C0243gk) obj6;
                xm0 xm0Var = (xm0) obj3;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    Object objM1956L2 = go0Var2.m1956L();
                    if (objM1956L2 == c0160eb) {
                        objM1956L2 = new C0590pr(xk1Var3, 20);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    uh1 uh1VarM5053E = t11.m5053E(uh1Var, (in0) objM1956L2);
                    nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, true);
                    int iHashCode2 = Long.hashCode(go0Var2.f3614T);
                    yy1 yy1VarM1990l2 = go0Var2.m1990l();
                    uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var2, uh1VarM5053E);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy2 = C0256gx.f3727b;
                    go0Var2.m1969Z();
                    if (go0Var2.f3613S) {
                        go0Var2.m1989k(c0367jy2);
                    } else {
                        go0Var2.m1987i0();
                    }
                    yf3.m6268c(go0Var2, C0256gx.f3730e, nf1VarM1060d);
                    yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l2);
                    yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode2));
                    yf3.m6267b(go0Var2, C0256gx.f3732g);
                    yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M2);
                    c0402kw.mo12g(go0Var2, 0);
                    c0243gk.m1929b(xm0Var, go0Var2, 6);
                    go0Var2.m1994p(true);
                }
                break;
            case 5:
                cq1 cq1Var = (cq1) obj4;
                j20 j20Var = (j20) obj6;
                Context context2 = (Context) obj7;
                xk1 xk1Var4 = (xk1) obj5;
                xk1 xk1Var5 = (xk1) obj3;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    go0Var3.m1961R();
                } else {
                    boolean z = cq1Var.f1680f;
                    boolean z2 = cq1Var.f1681g == null;
                    boolean zM1984h2 = go0Var3.m1984h(j20Var) | go0Var3.m1984h(cq1Var) | go0Var3.m1984h(context2);
                    Object objM1956L3 = go0Var3.m1956L();
                    if (zM1984h2 || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0269h9(j20Var, cq1Var, context2, xk1Var4, xk1Var5, 4);
                        go0Var3.m1981f0(objM1956L3);
                    }
                    sp0.m4944i(z, (in0) objM1956L3, null, z2, 0, go0Var3, 0, 52);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rg3.m4470f((kf2) obj7, (j31) obj6, (String) obj5, (in0) obj4, (xm0) obj3, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0959ze(uh1 uh1Var, xk1 xk1Var, C0402kw c0402kw, C0243gk c0243gk, xm0 xm0Var) {
        this.f13846h = 4;
        this.f13847i = uh1Var;
        this.f13850l = xk1Var;
        this.f13848j = c0402kw;
        this.f13849k = c0243gk;
        this.f13851m = xm0Var;
    }

    public /* synthetic */ C0959ze(cq1 cq1Var, j20 j20Var, Context context, xk1 xk1Var, xk1 xk1Var2) {
        this.f13846h = 5;
        this.f13847i = cq1Var;
        this.f13849k = j20Var;
        this.f13848j = context;
        this.f13850l = xk1Var;
        this.f13851m = xk1Var2;
    }

    public /* synthetic */ C0959ze(kf2 kf2Var, j31 j31Var, String str, in0 in0Var, xm0 xm0Var, int i) {
        this.f13846h = 6;
        this.f13848j = kf2Var;
        this.f13849k = j31Var;
        this.f13850l = str;
        this.f13847i = in0Var;
        this.f13851m = xm0Var;
    }

    public /* synthetic */ C0959ze(Object obj, Object obj2, Object obj3, un0 un0Var, in0 in0Var, int i, int i2) {
        this.f13846h = i2;
        this.f13848j = obj;
        this.f13849k = obj2;
        this.f13850l = obj3;
        this.f13851m = un0Var;
        this.f13847i = in0Var;
    }

    public /* synthetic */ C0959ze(List list, mn0 mn0Var, rs2 rs2Var, mn0 mn0Var2, String str, int i) {
        this.f13846h = 2;
        this.f13847i = list;
        this.f13848j = mn0Var;
        this.f13849k = rs2Var;
        this.f13850l = mn0Var2;
        this.f13851m = str;
    }
}
