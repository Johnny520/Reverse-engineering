package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wa implements in0 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ wa(xm0 xm0Var, boolean z, d9 d9Var, cl clVar) {
        this.j = xm0Var;
        this.i = z;
        this.k = d9Var;
        this.l = clVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        boolean z = this.i;
        switch (i) {
            case 0:
                d9 d9Var = (d9) obj3;
                cl clVar = (cl) obj2;
                t61 t61Var = (t61) obj;
                t61Var.a();
                sp spVar = t61Var.h;
                if (((Boolean) ((xm0) obj4).a()).booleanValue()) {
                    if (z) {
                        long jA0 = spVar.a0();
                        b5 b5Var = spVar.i;
                        long jU = b5Var.u();
                        b5Var.q().l();
                        try {
                            ((n4) b5Var.i).A(-1.0f, 1.0f, jA0);
                            spVar.e(d9Var, clVar);
                        } finally {
                            vi0.r(b5Var, jU);
                        }
                    } else {
                        spVar.e(d9Var, clVar);
                    }
                }
                return a83Var;
            default:
                ca2 ca2Var = (ca2) obj;
                ca2Var.getClass();
                ca2Var.c(((Number) ((gu2) obj4).getValue()).floatValue());
                ca2Var.k(((Number) ((gu2) obj3).getValue()).floatValue());
                ca2Var.l(((Number) ((gu2) obj2).getValue()).floatValue());
                ca2Var.r(rb3.a(0.82f, z ? 1.0f : 0.0f));
                return a83Var;
        }
    }

    public /* synthetic */ wa(boolean z, gu2 gu2Var, gu2 gu2Var2, gu2 gu2Var3) {
        this.i = z;
        this.j = gu2Var;
        this.k = gu2Var2;
        this.l = gu2Var3;
    }
}
