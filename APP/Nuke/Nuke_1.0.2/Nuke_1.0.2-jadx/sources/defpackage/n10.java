package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n10 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ t91 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n10(t91 t91Var, int i) {
        this.h = i;
        this.i = t91Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        t91 t91Var = this.i;
        switch (i) {
            case 0:
                c61 c61Var = (c61) obj;
                z03 z03VarD = t91Var.d();
                if (z03VarD != null) {
                    z03VarD.c = c61Var;
                }
                return a83Var;
            case 1:
                nx1 nx1Var = t91Var.t;
                k03 k03Var = (k03) obj;
                String str = k03Var.a.i;
                sd sdVar = t91Var.j;
                if (!t11.l(str, sdVar != null ? sdVar.i : null)) {
                    t91Var.k.setValue(tr0.h);
                    if (((Boolean) nx1Var.getValue()).booleanValue()) {
                        nx1Var.setValue(Boolean.FALSE);
                    } else {
                        t91Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = f13.b;
                t91Var.f(j);
                t91Var.e(j);
                t91Var.u.j(k03Var);
                b62 b62Var = t91Var.b;
                fy fyVar = b62Var.a;
                if (fyVar != null) {
                    fyVar.s(b62Var, null);
                }
                return a83Var;
            case 2:
                t91Var.r.z(((wx0) obj).a);
                return a83Var;
            case 3:
                return Boolean.valueOf(t91Var.r.z(((wx0) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                t91Var.q.setValue(bool);
                return a83Var;
        }
    }
}
