package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ap1 implements eq2 {
    public final long a;
    public final float b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ap1(float f, long j) {
        this.a = j;
        this.b = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.eq2
    public final te a(long j, d61 d61Var, e70 e70Var) {
        d61Var.getClass();
        e70Var.getClass();
        float f = this.b;
        if (f <= 0.0f) {
            return new sv1(aa.a());
        }
        long j2 = this.a;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        float fHypot = ((float) Math.hypot(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat(i)), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat(i2)))) * f;
        y9 y9VarA = aa.a();
        float fIntBitsToFloat = Float.intBitsToFloat(i) - fHypot;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) - fHypot;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) + fHypot;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) + fHypot;
        if (y9VarA.b == null) {
            y9VarA.b = new RectF();
        }
        RectF rectF = y9VarA.b;
        rectF.getClass();
        rectF.set(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
        Path path = y9VarA.a;
        RectF rectF2 = y9VarA.b;
        rectF2.getClass();
        path.addOval(rectF2, aa.b(ux1.h));
        return new sv1(y9VarA);
    }
}
