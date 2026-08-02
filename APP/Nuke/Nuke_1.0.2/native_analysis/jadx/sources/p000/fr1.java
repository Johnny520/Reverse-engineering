package p000;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fr1 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3119h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f3120i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f3121j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f3122k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f3123l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ un0 f3124m;

    public /* synthetic */ fr1(List list, Object obj, Object obj2, Object obj3, un0 un0Var, int i) {
        this.f3119h = i;
        this.f3120i = list;
        this.f3121j = obj;
        this.f3122k = obj2;
        this.f3123l = obj3;
        this.f3124m = un0Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        long jM2565b;
        rh1 rh1Var;
        boolean z;
        long jM2565b2;
        boolean z2;
        int i = this.f3119h;
        a83 a83Var = a83.f116a;
        C0160eb c0160eb = C0520nx.f7360a;
        boolean z3 = false;
        un0 un0Var = this.f3124m;
        Object obj4 = this.f3123l;
        Object obj5 = this.f3122k;
        Object obj6 = this.f3121j;
        switch (i) {
            case 0:
                kr1 kr1Var = (kr1) obj5;
                in0 in0Var = (in0) obj4;
                in0 in0Var2 = (in0) un0Var;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C0282hm) obj).getClass();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.m1961R();
                } else {
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l = go0Var.m1990l();
                    rh1 rh1Var2 = rh1.f9587a;
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, rh1Var2);
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
                    go0Var.m1966W(1091744710);
                    Iterator it = this.f3120i.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        boolean zM5086l = t11.m5086l(next, obj6);
                        uh1 uh1VarM825z = ci0.m825z(fg1.m1612D(AbstractC0731te.f10693e, 6.0f, 2.0f), kr1Var);
                        if (zM5086l) {
                            go0Var.m1966W(-1632861127);
                            jM2565b = C0363ju.m2565b(0.09f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6239g);
                            go0Var.m1994p(z3);
                        } else {
                            go0Var.m1966W(-1632749837);
                            go0Var.m1994p(z3);
                            jM2565b = C0363ju.f5216f;
                        }
                        uh1 uh1VarM1896n = gf1.m1896n(uh1VarM825z, jM2565b, sp0.f10267h);
                        boolean zM1980f = go0Var.m1980f(in0Var) | go0Var.m1984h(next);
                        Object objM1956L = go0Var.m1956L();
                        if (zM1980f || objM1956L == c0160eb) {
                            objM1956L = new C0640r1(25, in0Var, next);
                            go0Var.m1981f0(objM1956L);
                        }
                        uh1 uh1VarM1612D = fg1.m1612D(AbstractC0738tl.m5287O(uh1VarM1896n, (xm0) objM1956L), 10.0f, 10.0f);
                        ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var, 48);
                        int iHashCode2 = Long.hashCode(go0Var.f3614T);
                        yy1 yy1VarM1990l2 = go0Var.m1990l();
                        uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarM1612D);
                        InterfaceC0293hx.f4166c.getClass();
                        C0367jy c0367jy2 = C0256gx.f3727b;
                        go0Var.m1969Z();
                        Iterator it2 = it;
                        if (go0Var.f3613S) {
                            go0Var.m1989k(c0367jy2);
                        } else {
                            go0Var.m1987i0();
                        }
                        yf3.m6268c(go0Var, C0256gx.f3730e, ob2VarM3265a);
                        yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l2);
                        yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode2));
                        yf3.m6267b(go0Var, C0256gx.f3732g);
                        yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M2);
                        String str = (String) in0Var2.mo5j(next);
                        rh1 rh1Var3 = rh1Var2;
                        g71 g71Var = new g71(1.0f, true);
                        if (zM5086l) {
                            go0Var.m1966W(-256314235);
                            rh1Var = rh1Var3;
                            jM2565b2 = ((lp1) go0Var.m1988j(ur1.f11452a)).f6237e;
                            z = false;
                        } else {
                            rh1Var = rh1Var3;
                            z = false;
                            go0Var.m1966W(-256312756);
                            jM2565b2 = C0363ju.m2565b(0.8f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6237e);
                        }
                        go0Var.m1994p(z);
                        long j = jM2565b2;
                        rh1 rh1Var4 = rh1Var;
                        AbstractC0179eu.m1446a(str, g71Var, new m13(j, rg3.m4450D(14), zM5086l ? im0.f4683m : im0.f4680j, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, 0, 1016);
                        if (zM5086l) {
                            go0Var.m1966W(644490413);
                            rp0.m4529O(go0Var, AbstractC0731te.m5231q0(rh1Var4, 12.0f));
                            z2 = false;
                            AbstractC0179eu.m1461k(null, ((lp1) go0Var.m1988j(ur1.f11452a)).f6239g, go0Var, 0);
                            go0Var.m1994p(false);
                        } else {
                            z2 = false;
                            go0Var.m1966W(644700872);
                            go0Var.m1994p(false);
                        }
                        go0Var.m1994p(true);
                        rh1Var2 = rh1Var4;
                        z3 = z2;
                        it = it2;
                    }
                    go0Var.m1994p(z3);
                    go0Var.m1994p(true);
                }
                break;
            default:
                wm0 wm0Var = (wm0) obj6;
                View view = (View) obj5;
                rs2 rs2Var = (rs2) obj4;
                mn0 mn0Var = (mn0) un0Var;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.m1961R();
                } else {
                    List list = this.f3120i;
                    if (!list.isEmpty()) {
                        go0Var2.m1966W(-987522138);
                        String strM4462P = rg3.m4462P(wm0Var.f12584h, go0Var2);
                        boolean zM1984h = go0Var2.m1984h(view);
                        Object objM1956L2 = go0Var2.m1956L();
                        if (zM1984h || objM1956L2 == c0160eb) {
                            objM1956L2 = new kt0(view, 1);
                            go0Var2.m1981f0(objM1956L2);
                        }
                        ci0.m809j(list, (mn0) objM1956L2, rs2Var, mn0Var, strM4462P, go0Var2, 0);
                        go0Var2.m1994p(false);
                    } else {
                        go0Var2.m1966W(-987630762);
                        ci0.m806g(null, null, null, go0Var2, 0, 7);
                        go0Var2.m1994p(false);
                    }
                }
                break;
        }
        return a83Var;
    }
}
