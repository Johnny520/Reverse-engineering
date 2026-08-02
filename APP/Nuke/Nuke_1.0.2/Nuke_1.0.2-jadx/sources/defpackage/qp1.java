package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qp1 implements mn0 {
    public final /* synthetic */ int h = 2;
    public final /* synthetic */ Object i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ String k;
    public final /* synthetic */ un0 l;
    public final /* synthetic */ un0 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ qp1(uh1 uh1Var, boolean z, String str, nn0 nn0Var, kw kwVar) {
        this.i = uh1Var;
        this.j = z;
        this.k = str;
        this.l = nn0Var;
        this.m = kwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        un0 un0Var = this.m;
        un0 un0Var2 = this.l;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qp0.f((uh1) obj3, this.j, this.k, (nn0) un0Var2, (kw) un0Var, (px) obj, pp0.N(1));
                break;
            case 1:
                uh1 uh1Var = (uh1) obj3;
                nn0 nn0Var = (nn0) un0Var2;
                kw kwVar = (kw) un0Var;
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    qp0.f(uh1Var, this.j, this.k, nn0Var, kwVar, go0Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                se.u(this.k, (Set) obj3, this.j, (xm0) un0Var2, (in0) un0Var, (px) obj, pp0.N(3457));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ qp1(uh1 uh1Var, boolean z, String str, nn0 nn0Var, kw kwVar, int i) {
        this.i = uh1Var;
        this.j = z;
        this.k = str;
        this.l = nn0Var;
        this.m = kwVar;
    }

    public /* synthetic */ qp1(String str, Set set, boolean z, xm0 xm0Var, in0 in0Var, int i) {
        this.k = str;
        this.i = set;
        this.j = z;
        this.l = xm0Var;
        this.m = in0Var;
    }
}
