package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sp implements nc0 {
    public final rp h;
    public final b5 i;
    public q9 j;
    public q9 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sp() {
        h70 h70Var = pp0.c;
        rp rpVar = new rp();
        rpVar.a = h70Var;
        rpVar.b = d61.h;
        rpVar.c = yd0.a;
        rpVar.d = 0L;
        this.h = rpVar;
        this.i = new b5(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q9 a(sp spVar, long j, op0 op0Var, int i) {
        q9 q9VarF = spVar.f(op0Var);
        Paint paint = (Paint) q9VarF.c;
        if (!ju.c(sp0.b(paint.getColor()), j)) {
            q9VarF.k(j);
        }
        if (((Shader) q9VarF.d) != null) {
            q9VarF.n(null);
        }
        if (!t11.l((cl) q9VarF.e, null)) {
            q9VarF.l(null);
        }
        if (q9VarF.b != i) {
            q9VarF.j(i);
        }
        if (paint.isFilterBitmap()) {
            return q9VarF;
        }
        q9VarF.m(1);
        return q9VarF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final b5 E() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void G(y9 y9Var, an anVar, float f, op0 op0Var, int i) {
        this.h.c.h(y9Var, c(anVar, op0Var, f, null, i, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void R(d9 d9Var, long j, long j2, long j3, float f, cl clVar, int i) {
        this.h.c.e(d9Var, j, j2, j3, c(null, xi0.h, f, clVar, 3, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void Y(long j, long j2, long j3, float f, int i) {
        qp qpVar = this.h.c;
        q9 q9VarI = this.k;
        if (q9VarI == null) {
            q9VarI = pp0.i();
            q9VarI.r(1);
            this.k = q9VarI;
        }
        Paint paint = (Paint) q9VarI.c;
        if (!ju.c(sp0.b(paint.getColor()), j)) {
            q9VarI.k(j);
        }
        if (((Shader) q9VarI.d) != null) {
            q9VarI.n(null);
        }
        if (!t11.l((cl) q9VarI.e, null)) {
            q9VarI.l(null);
        }
        if (q9VarI.b != 3) {
            q9VarI.j(3);
        }
        if (paint.getStrokeWidth() != f) {
            q9VarI.q(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (q9VarI.f() != i) {
            q9VarI.o(i);
        }
        if (q9VarI.g() != 0) {
            q9VarI.p(0);
        }
        if (!paint.isFilterBitmap()) {
            q9VarI.m(1);
        }
        qpVar.m(j2, j3, q9VarI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.h.a.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q9 c(an anVar, op0 op0Var, float f, cl clVar, int i, int i2) {
        q9 q9VarF = f(op0Var);
        Paint paint = (Paint) q9VarF.c;
        if (anVar != null) {
            anVar.a(f, d(), q9VarF);
        } else {
            if (((Shader) q9VarF.d) != null) {
                q9VarF.n(null);
            }
            long jB = sp0.b(paint.getColor());
            long j = ju.b;
            if (!ju.c(jB, j)) {
                q9VarF.k(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                q9VarF.i(f);
            }
        }
        if (!t11.l((cl) q9VarF.e, clVar)) {
            q9VarF.l(clVar);
        }
        if (q9VarF.b != i) {
            q9VarF.j(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return q9VarF;
        }
        q9VarF.m(i2);
        return q9VarF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void c0(long j, long j2, long j3, op0 op0Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.h.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, op0Var, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(d9 d9Var, cl clVar) {
        this.h.c.a(d9Var, c(null, xi0.h, 1.0f, clVar, 3, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q9 f(op0 op0Var) {
        if (t11.l(op0Var, xi0.h)) {
            q9 q9Var = this.j;
            if (q9Var != null) {
                return q9Var;
            }
            q9 q9VarI = pp0.i();
            q9VarI.r(0);
            this.j = q9VarI;
            return q9VarI;
        }
        if (!(op0Var instanceof xv2)) {
            c80.s();
            return null;
        }
        q9 q9VarI2 = this.k;
        if (q9VarI2 == null) {
            q9VarI2 = pp0.i();
            q9VarI2.r(1);
            this.k = q9VarI2;
        }
        Paint paint = (Paint) q9VarI2.c;
        float strokeWidth = paint.getStrokeWidth();
        xv2 xv2Var = (xv2) op0Var;
        float f = xv2Var.h;
        if (strokeWidth != f) {
            q9VarI2.q(f);
        }
        int iF = q9VarI2.f();
        int i = xv2Var.j;
        if (iF != i) {
            q9VarI2.o(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = xv2Var.i;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iG = q9VarI2.g();
        int i2 = xv2Var.k;
        if (iG == i2) {
            return q9VarI2;
        }
        q9VarI2.p(i2);
        return q9VarI2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final d61 getLayoutDirection() {
        return this.h.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.h.a.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void o(long j, float f, long j2, op0 op0Var) {
        this.h.c.d(f, j2, a(this, j, op0Var, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void t(y9 y9Var, long j, op0 op0Var) {
        this.h.c.h(y9Var, a(this, j, op0Var, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void z(an anVar, long j, long j2, long j3, float f, op0 op0Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.h.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c(anVar, op0Var, f, null, 3, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void z0(long j, float f, float f2, long j2, long j3, op0 op0Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.h.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, op0Var, 3));
    }
}
