package p000;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: iw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0327iw implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4807h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f4808i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4809j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f4810k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4811l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f4812m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f4813n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f4814o;

    public /* synthetic */ C0327iw(int i, in0 in0Var, in0 in0Var2, xk1 xk1Var, yk1 yk1Var, Object obj, List list) {
        this.f4810k = yk1Var;
        this.f4811l = xk1Var;
        this.f4812m = list;
        this.f4808i = obj;
        this.f4813n = in0Var;
        this.f4814o = in0Var2;
        this.f4809j = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f4807h;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f4814o;
        Object obj4 = this.f4810k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0402kw) obj4).m2748i(this.f4808i, (Boolean) obj3, this.f4811l, this.f4812m, this.f4813n, (InterfaceC0596px) obj, pp0.m3902N(this.f4809j) | 1);
                break;
            default:
                final yk1 yk1Var = (yk1) obj4;
                final xk1 xk1Var = (xk1) this.f4811l;
                final List list = (List) this.f4812m;
                final in0 in0Var = (in0) this.f4813n;
                final in0 in0Var2 = (in0) obj3;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    sf0 sf0VarM3293a = nf0.m3293a(up0.m5531J(90, null, 6), 2);
                    fj0 fj0VarM5531J = up0.m5531J(120, null, 6);
                    if ((1 & 2) != 0) {
                        fj0VarM5531J = up0.m5528G(0.0f, 400.0f, null, 5);
                    }
                    ph0 ph0VarM3866a = new ph0(new z33(new uh0(fj0VarM5531J), (t11) null, (cd2) null, (LinkedHashMap) null, 126)).m3866a(new ph0(new z33((uh0) null, (t11) null, new cd2(rb3.m4426a(0.82f, ((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f), up0.m5531J(120, null, 6)), (LinkedHashMap) null, 119)));
                    final int i2 = this.f4809j;
                    final Object obj5 = this.f4808i;
                    rp0.m4518D(yk1Var, null, sf0VarM3293a, ph0VarM3866a, null, xe1.m6126i0(159255744, new nn0() { // from class: br1
                        @Override // p000.nn0
                        /* JADX INFO: renamed from: e */
                        public final Object mo489e(Object obj6, Object obj7, Object obj8) {
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj7;
                            int iIntValue2 = ((Integer) obj8).intValue();
                            ((C0126dd) obj6).getClass();
                            go0 go0Var2 = (go0) interfaceC0596px2;
                            if (go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                in0 in0Var3 = in0Var;
                                boolean zM1980f = go0Var2.m1980f(in0Var3);
                                yk1 yk1Var2 = yk1Var;
                                boolean zM1984h = zM1980f | go0Var2.m1984h(yk1Var2);
                                Object objM1956L = go0Var2.m1956L();
                                if (zM1984h || objM1956L == C0520nx.f7360a) {
                                    objM1956L = new C0115d2(23, in0Var3, yk1Var2);
                                    go0Var2.m1981f0(objM1956L);
                                }
                                AbstractC0179eu.m1460j(list, obj5, (in0) objM1956L, in0Var2, ((Boolean) xk1Var.getValue()).booleanValue(), go0Var2, ((i2 >> 6) & 8) << 3);
                            } else {
                                go0Var2.m1961R();
                            }
                            return a83.f116a;
                        }
                    }, go0Var), go0Var, 196992);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0327iw(C0402kw c0402kw, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.f4810k = c0402kw;
        this.f4808i = obj;
        this.f4814o = bool;
        this.f4811l = obj2;
        this.f4812m = obj3;
        this.f4813n = obj4;
        this.f4809j = i;
    }
}
