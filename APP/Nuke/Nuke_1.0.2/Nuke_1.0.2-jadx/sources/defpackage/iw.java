package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw implements mn0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ iw(int i, in0 in0Var, in0 in0Var2, xk1 xk1Var, yk1 yk1Var, Object obj, List list) {
        this.k = yk1Var;
        this.l = xk1Var;
        this.m = list;
        this.i = obj;
        this.n = in0Var;
        this.o = in0Var2;
        this.j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj3 = this.o;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((kw) obj4).i(this.i, (Boolean) obj3, this.l, this.m, this.n, (px) obj, pp0.N(this.j) | 1);
                break;
            default:
                final yk1 yk1Var = (yk1) obj4;
                final xk1 xk1Var = (xk1) this.l;
                final List list = (List) this.m;
                final in0 in0Var = (in0) this.n;
                final in0 in0Var2 = (in0) obj3;
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    sf0 sf0VarA = nf0.a(up0.J(90, null, 6), 2);
                    fj0 fj0VarJ = up0.J(120, null, 6);
                    if ((1 & 2) != 0) {
                        fj0VarJ = up0.G(0.0f, 400.0f, null, 5);
                    }
                    ph0 ph0VarA = new ph0(new z33(new uh0(fj0VarJ), (t11) null, (cd2) null, (LinkedHashMap) null, 126)).a(new ph0(new z33((uh0) null, (t11) null, new cd2(rb3.a(0.82f, ((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f), up0.J(120, null, 6)), (LinkedHashMap) null, 119)));
                    final int i2 = this.j;
                    final Object obj5 = this.i;
                    rp0.D(yk1Var, null, sf0VarA, ph0VarA, null, xe1.i0(159255744, new nn0() { // from class: br1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.nn0
                        public final Object e(Object obj6, Object obj7, Object obj8) {
                            px pxVar2 = (px) obj7;
                            int iIntValue2 = ((Integer) obj8).intValue();
                            ((dd) obj6).getClass();
                            go0 go0Var2 = (go0) pxVar2;
                            if (go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                in0 in0Var3 = in0Var;
                                boolean zF = go0Var2.f(in0Var3);
                                yk1 yk1Var2 = yk1Var;
                                boolean zH = zF | go0Var2.h(yk1Var2);
                                Object objL = go0Var2.L();
                                if (zH || objL == nx.a) {
                                    objL = new d2(23, in0Var3, yk1Var2);
                                    go0Var2.f0(objL);
                                }
                                eu.j(list, obj5, (in0) objL, in0Var2, ((Boolean) xk1Var.getValue()).booleanValue(), go0Var2, ((i2 >> 6) & 8) << 3);
                            } else {
                                go0Var2.R();
                            }
                            return a83.a;
                        }
                    }, go0Var), go0Var, 196992);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ iw(kw kwVar, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.k = kwVar;
        this.i = obj;
        this.o = bool;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.j = i;
    }
}
