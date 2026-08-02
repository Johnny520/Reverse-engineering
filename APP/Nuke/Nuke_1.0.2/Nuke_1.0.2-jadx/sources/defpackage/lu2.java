package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lu2 extends tw2 implements mn0 {
    public final /* synthetic */ int l = 0;
    public float m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(os osVar, float f, hd hdVar, t00 t00Var) {
        super(2, t00Var);
        this.o = osVar;
        this.m = f;
        this.p = hdVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((lu2) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                return new lu2((os) this.o, this.m, (hd) obj2, t00Var);
            default:
                lu2 lu2Var = new lu2((y33) obj2, t00Var);
                lu2Var.o = obj;
                return lu2Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        final float F;
        j20 j20Var;
        int i = this.l;
        a83 a83Var = a83.a;
        Object obj2 = this.p;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                int i2 = this.n;
                if (i2 == 0) {
                    fg1.T(obj);
                    this.n = 1;
                    if (sc.c((sc) ((os) this.o).c, new Float(this.m), (hd) obj2, null, this, 12) == k20Var) {
                    }
                } else if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
            default:
                int i3 = this.n;
                if (i3 == 0) {
                    fg1.T(obj);
                    j20 j20Var2 = (j20) this.o;
                    F = te.F(j20Var2.g());
                    j20Var = j20Var2;
                } else if (i3 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    F = this.m;
                    j20Var = (j20) this.o;
                    fg1.T(obj);
                }
                while (te.Q(j20Var)) {
                    final y33 y33Var = (y33) obj2;
                    in0 in0Var = new in0() { // from class: x33
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.in0
                        public final Object j(Object obj3) {
                            long jLongValue = ((Long) obj3).longValue();
                            y33 y33Var2 = y33Var;
                            boolean zG = y33Var2.g();
                            lx1 lx1Var = y33Var2.g;
                            if (!zG) {
                                if (lx1Var.g() == Long.MIN_VALUE) {
                                    lx1Var.h(jLongValue);
                                    y33Var2.a.a.setValue(Boolean.TRUE);
                                }
                                long jG = jLongValue - lx1Var.g();
                                float f = F;
                                if (f != 0.0f) {
                                    jG = gf1.R(jG / ((double) f));
                                }
                                if (y33Var2.b == null) {
                                    y33Var2.f.h(jG);
                                }
                                y33Var2.h(jG, f == 0.0f);
                            }
                            return a83.a;
                        }
                    };
                    this.o = j20Var;
                    this.m = F;
                    this.n = 1;
                    a20 a20Var = this.i;
                    a20Var.getClass();
                    if (qp0.A(a20Var).a(in0Var, this) == k20Var) {
                        break;
                    }
                }
                break;
        }
        return k20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(y33 y33Var, t00 t00Var) {
        super(2, t00Var);
        this.p = y33Var;
    }
}
