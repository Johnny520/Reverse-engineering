package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gk implements zy2 {
    public final kw a;
    public final gl1 b = new gl1();
    public final nx1 c = op0.u(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gk(kw kwVar) {
        this.a = kwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zy2
    public final Object a(ry2 ry2Var, tw2 tw2Var) {
        mb mbVar = new mb(this, new fk(ry2Var), null, 1);
        gl1 gl1Var = this.b;
        gl1Var.getClass();
        Object objU = te.u(new tc(gl1Var, mbVar, null, 1), tw2Var);
        return objU == k20.h ? objU : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(final xm0 xm0Var, px pxVar, final int i) {
        final xm0 xm0Var2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(723898654);
        int i2 = (go0Var.f(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (go0Var.O(i2 & 1, (i2 & 19) != 18)) {
            fk fkVar = (fk) this.c.getValue();
            if (fkVar == null) {
                b62 b62VarR = go0Var.r();
                if (b62VarR != null) {
                    b62VarR.d = new mn0(this, xm0Var, i, i3) { // from class: ek
                        public final /* synthetic */ int h;
                        public final /* synthetic */ gk i;
                        public final /* synthetic */ xm0 j;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.h = i3;
                            this.i = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            int i5 = this.h;
                            a83 a83Var = a83.a;
                            xm0 xm0Var3 = this.j;
                            gk gkVar = this.i;
                            px pxVar2 = (px) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    gkVar.b(xm0Var3, pxVar2, pp0.N(7));
                                    break;
                                default:
                                    gkVar.b(xm0Var3, pxVar2, pp0.N(7));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    return;
                }
                return;
            }
            xm0Var2 = xm0Var;
            this.a.k(fkVar, fkVar.a, xm0Var2, go0Var, 384);
        } else {
            xm0Var2 = xm0Var;
            go0Var.R();
        }
        b62 b62VarR2 = go0Var.r();
        if (b62VarR2 != null) {
            b62VarR2.d = new mn0(this, xm0Var2, i, i4) { // from class: ek
                public final /* synthetic */ int h;
                public final /* synthetic */ gk i;
                public final /* synthetic */ xm0 j;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.h = i4;
                    this.i = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    int i5 = this.h;
                    a83 a83Var = a83.a;
                    xm0 xm0Var3 = this.j;
                    gk gkVar = this.i;
                    px pxVar2 = (px) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            gkVar.b(xm0Var3, pxVar2, pp0.N(7));
                            break;
                        default:
                            gkVar.b(xm0Var3, pxVar2, pp0.N(7));
                            break;
                    }
                    return a83Var;
                }
            };
        }
    }
}
