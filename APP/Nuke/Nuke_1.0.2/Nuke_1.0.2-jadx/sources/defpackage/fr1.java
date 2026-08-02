package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fr1 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ un0 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ fr1(List list, Object obj, Object obj2, Object obj3, un0 un0Var, int i) {
        this.h = i;
        this.i = list;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = un0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        long jB;
        rh1 rh1Var;
        boolean z;
        long jB2;
        boolean z2;
        int i = this.h;
        a83 a83Var = a83.a;
        eb ebVar = nx.a;
        boolean z3 = false;
        un0 un0Var = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                kr1 kr1Var = (kr1) obj5;
                in0 in0Var = (in0) obj4;
                in0 in0Var2 = (in0) un0Var;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((hm) obj).getClass();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.R();
                } else {
                    av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    rh1 rh1Var2 = rh1.a;
                    uh1 uh1VarM = tl.M(go0Var, rh1Var2);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, gx.e, avVarA);
                    yf3.c(go0Var, gx.d, yy1VarL);
                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                    yf3.b(go0Var, gx.g);
                    yf3.c(go0Var, gx.c, uh1VarM);
                    go0Var.W(1091744710);
                    Iterator it = this.i.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        boolean zL = t11.l(next, obj6);
                        uh1 uh1VarZ = ci0.z(fg1.D(te.e, 6.0f, 2.0f), kr1Var);
                        if (zL) {
                            go0Var.W(-1632861127);
                            jB = ju.b(0.09f, ((lp1) go0Var.j(ur1.a)).g);
                            go0Var.p(z3);
                        } else {
                            go0Var.W(-1632749837);
                            go0Var.p(z3);
                            jB = ju.f;
                        }
                        uh1 uh1VarN = gf1.n(uh1VarZ, jB, sp0.h);
                        boolean zF = go0Var.f(in0Var) | go0Var.h(next);
                        Object objL = go0Var.L();
                        if (zF || objL == ebVar) {
                            objL = new r1(25, in0Var, next);
                            go0Var.f0(objL);
                        }
                        uh1 uh1VarD = fg1.D(tl.O(uh1VarN, (xm0) objL), 10.0f, 10.0f);
                        ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var, 48);
                        int iHashCode2 = Long.hashCode(go0Var.T);
                        yy1 yy1VarL2 = go0Var.l();
                        uh1 uh1VarM2 = tl.M(go0Var, uh1VarD);
                        hx.c.getClass();
                        jy jyVar2 = gx.b;
                        go0Var.Z();
                        Iterator it2 = it;
                        if (go0Var.S) {
                            go0Var.k(jyVar2);
                        } else {
                            go0Var.i0();
                        }
                        yf3.c(go0Var, gx.e, ob2VarA);
                        yf3.c(go0Var, gx.d, yy1VarL2);
                        yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode2));
                        yf3.b(go0Var, gx.g);
                        yf3.c(go0Var, gx.c, uh1VarM2);
                        String str = (String) in0Var2.j(next);
                        rh1 rh1Var3 = rh1Var2;
                        g71 g71Var = new g71(1.0f, true);
                        if (zL) {
                            go0Var.W(-256314235);
                            rh1Var = rh1Var3;
                            jB2 = ((lp1) go0Var.j(ur1.a)).e;
                            z = false;
                        } else {
                            rh1Var = rh1Var3;
                            z = false;
                            go0Var.W(-256312756);
                            jB2 = ju.b(0.8f, ((lp1) go0Var.j(ur1.a)).e);
                        }
                        go0Var.p(z);
                        long j = jB2;
                        rh1 rh1Var4 = rh1Var;
                        eu.a(str, g71Var, new m13(j, rg3.D(14), zL ? im0.m : im0.j, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, 0, 1016);
                        if (zL) {
                            go0Var.W(644490413);
                            rp0.O(go0Var, te.q0(rh1Var4, 12.0f));
                            z2 = false;
                            eu.k(null, ((lp1) go0Var.j(ur1.a)).g, go0Var, 0);
                            go0Var.p(false);
                        } else {
                            z2 = false;
                            go0Var.W(644700872);
                            go0Var.p(false);
                        }
                        go0Var.p(true);
                        rh1Var2 = rh1Var4;
                        z3 = z2;
                        it = it2;
                    }
                    go0Var.p(z3);
                    go0Var.p(true);
                }
                break;
            default:
                wm0 wm0Var = (wm0) obj6;
                View view = (View) obj5;
                rs2 rs2Var = (rs2) obj4;
                mn0 mn0Var = (mn0) un0Var;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.R();
                } else {
                    List list = this.i;
                    if (!list.isEmpty()) {
                        go0Var2.W(-987522138);
                        String strP = rg3.P(wm0Var.h, go0Var2);
                        boolean zH = go0Var2.h(view);
                        Object objL2 = go0Var2.L();
                        if (zH || objL2 == ebVar) {
                            objL2 = new kt0(view, 1);
                            go0Var2.f0(objL2);
                        }
                        ci0.j(list, (mn0) objL2, rs2Var, mn0Var, strP, go0Var2, 0);
                        go0Var2.p(false);
                    } else {
                        go0Var2.W(-987630762);
                        ci0.g(null, null, null, go0Var2, 0, 7);
                        go0Var2.p(false);
                    }
                }
                break;
        }
        return a83Var;
    }
}
