package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v7 extends w51 implements mn0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(int i, Object obj, Object obj2) {
        super(2);
        this.i = i;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        a83 a83Var = a83.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                qn2 qn2Var = (qn2) obj2;
                w7 w7Var = (w7) obj3;
                if (!((rn2) obj4).b.b(qn2Var.f)) {
                    w7Var.l(iIntValue, qn2Var);
                    w7Var.o.s(a83Var);
                }
                break;
            case 1:
                px pxVar = (px) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var.R();
                } else {
                    Boolean bool = (Boolean) ((x61) obj4).g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    mn0 mn0Var = (mn0) obj3;
                    go0Var.Y(bool);
                    boolean zG = go0Var.g(zBooleanValue);
                    if (zBooleanValue) {
                        mn0Var.g(go0Var, 0);
                    } else {
                        if (go0Var.l != 0) {
                            tx.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!go0Var.S) {
                            if (zG) {
                                pr2 pr2Var = go0Var.G;
                                int i2 = pr2Var.g;
                                int i3 = pr2Var.h;
                                qx qxVar = go0Var.M;
                                qxVar.getClass();
                                qxVar.d(false);
                                qxVar.b.t.X(hu1.c);
                                p7.i(go0Var.s, i2, i3);
                                go0Var.G.t();
                            } else {
                                go0Var.Q();
                            }
                        }
                    }
                    if (go0Var.y && go0Var.G.i == go0Var.z) {
                        go0Var.z = -1;
                        go0Var.y = false;
                    }
                    go0Var.p(false);
                }
                break;
            default:
                qp qpVar = (qp) obj;
                pq0 pq0Var = (pq0) obj2;
                zn1 zn1Var = (zn1) obj4;
                r61 r61Var = zn1Var.v;
                if (!r61Var.I()) {
                    zn1Var.R = true;
                } else {
                    zn1Var.O = qpVar;
                    zn1Var.N = pq0Var;
                    bw1 snapshotObserver = ((b7) u61.a(r61Var)).getSnapshotObserver();
                    ca2 ca2Var = zn1.T;
                    snapshotObserver.a.c(zn1Var, oq0.m, (yn1) obj3);
                    zn1Var.R = false;
                }
                break;
        }
        return a83Var;
    }
}
