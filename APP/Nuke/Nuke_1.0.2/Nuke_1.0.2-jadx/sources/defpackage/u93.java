package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u93 extends lw1 {
    public final nx1 e = op0.u(new gr2(0));
    public final nx1 f = op0.u(Boolean.FALSE);
    public final q93 g;
    public final nx1 h;
    public float i;
    public cl j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u93(ar0 ar0Var) {
        q93 q93Var = new q93(ar0Var);
        q93Var.f = new ea(22, this);
        this.g = q93Var;
        this.h = new nx1(a83.a, gd3.C);
        this.i = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lw1
    public final void a(float f) {
        this.i = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lw1
    public final void b(cl clVar) {
        this.j = clVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lw1
    public final long d() {
        return ((gr2) this.e.getValue()).a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lw1
    public final void e(t61 t61Var) {
        sp spVar = t61Var.h;
        cl clVar = this.j;
        q93 q93Var = this.g;
        if (clVar == null) {
            clVar = (cl) q93Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && t61Var.getLayoutDirection() == d61.i) {
            long jA0 = spVar.a0();
            b5 b5Var = spVar.i;
            long jU = b5Var.u();
            b5Var.q().l();
            try {
                ((n4) b5Var.i).A(-1.0f, 1.0f, jA0);
                q93Var.e(t61Var, this.i, clVar);
            } finally {
                vi0.r(b5Var, jU);
            }
        } else {
            q93Var.e(t61Var, this.i, clVar);
        }
        this.h.getValue();
    }
}
