package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d8 implements in0 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ float i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d8(float f, d9 d9Var, cl clVar) {
        this.i = f;
        this.j = d9Var;
        this.k = clVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj2 = this.k;
        float f = this.i;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                d9 d9Var = (d9) obj3;
                cl clVar = (cl) obj2;
                t61 t61Var = (t61) obj;
                t61Var.a();
                sp spVar = t61Var.h;
                b5 b5Var = spVar.i;
                long jU = b5Var.u();
                b5Var.q().l();
                try {
                    n4 n4Var = (n4) b5Var.i;
                    n4Var.C(f, 0.0f);
                    n4Var.z(45.0f, 0L);
                    spVar.e(d9Var, clVar);
                    return a83Var;
                } finally {
                    vi0.r(b5Var, jU);
                }
            default:
                p83 p83Var = (p83) obj3;
                in0 in0Var = (in0) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (p83Var.b == Long.MIN_VALUE) {
                    p83Var.b = jLongValue;
                }
                float f2 = p83Var.e;
                jd jdVar = new jd(f2);
                jd jdVar2 = p83.f;
                long jB = f == 0.0f ? p83Var.a.b(new jd(f2), jdVar2, p83Var.c) : gf1.R((jLongValue - p83Var.b) / f);
                float f3 = ((jd) p83Var.a.s(jB, jdVar, jdVar2, p83Var.c)).a;
                p83Var.c = (jd) p83Var.a.q(jB, jdVar, jdVar2, p83Var.c);
                p83Var.b = jLongValue;
                float f4 = p83Var.e - f3;
                p83Var.e = f3;
                in0Var.j(Float.valueOf(f4));
                return a83Var;
        }
    }

    public /* synthetic */ d8(p83 p83Var, float f, in0 in0Var) {
        this.j = p83Var;
        this.i = f;
        this.k = in0Var;
    }
}
