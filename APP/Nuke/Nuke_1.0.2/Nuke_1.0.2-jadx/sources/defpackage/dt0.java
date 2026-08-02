package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dt0 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ dt0(int i, Object obj, Object obj2, boolean z) {
        this.h = i;
        this.i = z;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        Object x92Var;
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        boolean z = this.i;
        switch (i) {
            case 0:
                gw gwVar = (gw) obj3;
                mn0 mn0Var = (mn0) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (z != zBooleanValue) {
                    pp1 pp1Var = pp1.a;
                    op1 op1VarC = pp1.c();
                    String strD = gwVar.d();
                    op1VarC.getClass();
                    strD.getClass();
                    op1VarC.e(strD, String.valueOf(zBooleanValue));
                    ArrayList arrayList = st0.a;
                    if (!gwVar.e() && gwVar.f()) {
                        try {
                            if (zBooleanValue) {
                                x92Var = Boolean.valueOf(st0.a(gwVar));
                            } else {
                                st0.c(gwVar);
                                x92Var = a83Var;
                            }
                        } catch (Throwable th) {
                            x92Var = new x92(th);
                        }
                        Throwable thA = y92.a(x92Var);
                        if (thA != null) {
                            pp1 pp1Var2 = pp1.a;
                            pp1.h(gwVar, zBooleanValue ? "install" : "uninstall", thA, zBooleanValue ? "Hooker switch install failed" : "Hooker switch uninstall failed");
                        }
                    }
                    mn0Var.g(gwVar, bool);
                }
                break;
            case 1:
                in0 in0Var = (in0) obj3;
                xk1 xk1Var = (xk1) obj2;
                Boolean bool2 = (Boolean) obj;
                if (bool2.booleanValue() && !z) {
                    xk1Var.setValue(Boolean.TRUE);
                } else {
                    in0Var.j(bool2);
                }
                break;
            default:
                gu2 gu2Var = (gu2) obj3;
                gu2 gu2Var2 = (gu2) obj2;
                ca2 ca2Var = (ca2) obj;
                ca2Var.getClass();
                ca2Var.c(z ? 1.0f : 0.62f);
                ca2Var.k(((Number) gu2Var.getValue()).floatValue());
                ca2Var.l(((Number) gu2Var2.getValue()).floatValue());
                break;
        }
        return a83Var;
    }
}
