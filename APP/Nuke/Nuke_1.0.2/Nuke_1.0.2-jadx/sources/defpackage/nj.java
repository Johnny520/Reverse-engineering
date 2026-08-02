package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nj extends th1 implements mc0, os1, on2 {
    public eq2 A;
    public te B;
    public long v;
    public eq2 w;
    public long x;
    public d61 y;
    public te z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.os1
    public final void L() {
        this.x = 9205357640488583168L;
        this.y = null;
        this.z = null;
        this.A = null;
        ci0.M(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void P(t61 t61Var) {
        te teVar;
        t61 t61Var2;
        y9 y9Var;
        t61 t61Var3 = t61Var;
        sp spVar = t61Var3.h;
        if (this.w != sp0.h) {
            xi0 xi0Var = xi0.h;
            if (gr2.a(spVar.d(), this.x) && t61Var3.getLayoutDirection() == this.y && t11.l(this.A, this.w)) {
                teVar = this.z;
                teVar.getClass();
            } else {
                s11.S(this, new r1(8, this, t61Var3));
                teVar = this.B;
                this.B = null;
            }
            this.z = teVar;
            this.x = spVar.d();
            this.y = t61Var3.getLayoutDirection();
            this.A = this.w;
            teVar.getClass();
            if (!ju.c(this.v, ju.g)) {
                long j = this.v;
                if (teVar instanceof tv1) {
                    o62 o62Var = ((tv1) teVar).j;
                    float f = o62Var.a;
                    float f2 = o62Var.b;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(f);
                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
                    long jW = tl.W(o62Var);
                    t61Var2 = t61Var;
                    t61Var2.c0(j, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), jW, xi0Var, 3);
                } else {
                    t61Var2 = t61Var3;
                    if (teVar instanceof uv1) {
                        uv1 uv1Var = (uv1) teVar;
                        y9Var = uv1Var.k;
                        if (y9Var == null) {
                            db2 db2Var = uv1Var.j;
                            float f3 = db2Var.b;
                            float f4 = db2Var.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (db2Var.h >> 32));
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                            float f5 = db2Var.c - f4;
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(db2Var.d - f3)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
                            long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            int i = (int) (jFloatToRawIntBits3 >> 32);
                            int i2 = (int) (jFloatToRawIntBits3 & 4294967295L);
                            spVar.h.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits5 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits5 & 4294967295L)), sp.a(spVar, j, xi0Var, 3));
                        }
                    } else {
                        if (!(teVar instanceof sv1)) {
                            c80.s();
                            return;
                        }
                        y9Var = ((sv1) teVar).j;
                    }
                    t61Var2.t(y9Var, j, xi0Var);
                }
            }
            t61Var2.a();
        }
        if (!ju.c(this.v, ju.g)) {
            nc0.i0(t61Var, this.v, 0L, 0L, 126);
            t61Var3 = t61Var;
        }
        t61Var2 = t61Var3;
        t61Var2.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final boolean i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        xn2.c(zn2Var, this.w);
    }
}
