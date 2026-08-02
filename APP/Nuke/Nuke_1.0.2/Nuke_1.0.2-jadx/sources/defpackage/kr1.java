package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 implements eq2 {
    public final float a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kr1(float f) {
        this.a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.eq2
    public final te a(long j, d61 d61Var, e70 e70Var) {
        d61Var.getClass();
        e70Var.getClass();
        float fA = e70Var.A(this.a);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fC = ci0.C(1.35f, 1.0f, 1.6f);
        float fC2 = ci0.C(fA, 0.0f, Math.min(fIntBitsToFloat, fIntBitsToFloat2) / 2.0f);
        y9 y9VarA = aa.a();
        Path path = y9VarA.a;
        float fMin = Math.min(fIntBitsToFloat, fIntBitsToFloat2) / 2.0f;
        float f = fC2 * fC;
        float f2 = f > fMin ? fMin : f;
        float f3 = (((fC - 1.0f) * 0.18f) + 0.52f) * fC2;
        float f4 = f3 > f2 ? f2 : f3;
        path.moveTo(f2, 0.0f);
        float f5 = fIntBitsToFloat - f2;
        y9VarA.e(f5, 0.0f);
        float f6 = fIntBitsToFloat - f4;
        y9VarA.c(f6, 0.0f, fIntBitsToFloat, f4, fIntBitsToFloat, f2);
        float f7 = f4;
        float f8 = f2;
        float f9 = fIntBitsToFloat2 - f8;
        y9VarA.e(fIntBitsToFloat, f9);
        float f10 = fIntBitsToFloat2 - f7;
        y9VarA.c(fIntBitsToFloat, f10, f6, fIntBitsToFloat2, f5, fIntBitsToFloat2);
        y9VarA.e(f8, fIntBitsToFloat2);
        y9VarA.c(f7, fIntBitsToFloat2, 0.0f, f10, 0.0f, f9);
        y9VarA.e(0.0f, f8);
        y9VarA.c(0.0f, f7, f7, 0.0f, f8, 0.0f);
        path.close();
        return new sv1(y9VarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr1) && za0.b(this.a, ((kr1) obj).a) && Float.compare(1.35f, 1.35f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(1.35f) + (Float.hashCode(this.a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return vi0.j("NukeSquircleShape(radius=", za0.c(this.a), ", smoothness=1.35)");
    }
}
