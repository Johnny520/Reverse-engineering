package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lw1 {
    public q9 a;
    public cl b;
    public float c = 1.0f;
    public d61 d = d61.h;

    public abstract void a(float f);

    public abstract void b(cl clVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(t61 t61Var, long j, float f, cl clVar) {
        sp spVar = t61Var.h;
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!t11.l(this.b, clVar)) {
            b(clVar);
            this.b = clVar;
        }
        d61 layoutDirection = t61Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (spVar.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (spVar.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((n4) spVar.i.i).u(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(t61Var);
                }
            } finally {
                ((n4) spVar.i.i).u(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(t61 t61Var);
}
