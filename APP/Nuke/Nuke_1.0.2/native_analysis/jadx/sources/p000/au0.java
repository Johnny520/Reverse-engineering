package p000;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f388h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f389i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f390j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f391k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f392l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f393m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ un0 f394n;

    public /* synthetic */ au0(wm0 wm0Var, in0 in0Var, List list, View view, rs2 rs2Var, mn0 mn0Var) {
        this.f390j = wm0Var;
        this.f389i = in0Var;
        this.f391k = list;
        this.f392l = view;
        this.f393m = rs2Var;
        this.f394n = mn0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f388h;
        a83 a83Var = a83.f116a;
        un0 un0Var = this.f394n;
        Object obj3 = this.f393m;
        Object obj4 = this.f392l;
        Object obj5 = this.f391k;
        Object obj6 = this.f390j;
        switch (i) {
            case 0:
                wm0 wm0Var = (wm0) obj6;
                List list = (List) obj5;
                View view = (View) obj4;
                rs2 rs2Var = (rs2) obj3;
                mn0 mn0Var = (mn0) un0Var;
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
                    tp0.m5358c(rg3.m4462P(wm0Var.f12584h, go0Var), null, null, this.f389i, go0Var, 0, 30);
                    uh1 uh1VarMo4491c = AbstractC0731te.f10693e.mo4491c(new g71(1.0f, true));
                    jw1 jw1VarM1635h = fg1.m1635h();
                    C0884xf c0884xf = new C0884xf(12.0f, new C0676s(2));
                    boolean zM1984h = go0Var.m1984h(list) | go0Var.m1976d(wm0Var.ordinal()) | go0Var.m1984h(view) | go0Var.m1980f(rs2Var) | go0Var.m1980f(mn0Var);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1984h || objM1956L == C0520nx.f7360a) {
                        objM1956L = new C0269h9(list, wm0Var, view, rs2Var, mn0Var, 1);
                        go0Var.m1981f0(objM1956L);
                    }
                    rg3.m4468d(24960, 490, null, c0884xf, null, go0Var, null, (in0) objM1956L, null, uh1VarMo4491c, jw1VarM1635h, false);
                    go0Var.m1994p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rg3.m4469e((kf2) obj6, (String) obj5, (String) obj4, this.f389i, (xm0) obj3, (xm0) un0Var, (InterfaceC0596px) obj, pp0.m3902N(27649));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ au0(kf2 kf2Var, String str, String str2, in0 in0Var, xm0 xm0Var, xm0 xm0Var2, int i) {
        this.f390j = kf2Var;
        this.f391k = str;
        this.f392l = str2;
        this.f389i = in0Var;
        this.f393m = xm0Var;
        this.f394n = xm0Var2;
    }
}
