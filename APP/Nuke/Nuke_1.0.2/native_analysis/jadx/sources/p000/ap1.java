package p000;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ap1 implements eq2 {

    /* JADX INFO: renamed from: a */
    public final long f319a;

    /* JADX INFO: renamed from: b */
    public final float f320b;

    public ap1(float f, long j) {
        this.f319a = j;
        this.f320b = f;
    }

    @Override // p000.eq2
    /* JADX INFO: renamed from: a */
    public final AbstractC0731te mo248a(long j, d61 d61Var, e70 e70Var) {
        d61Var.getClass();
        e70Var.getClass();
        float f = this.f320b;
        if (f <= 0.0f) {
            return new sv1(AbstractC0011aa.m117a());
        }
        long j2 = this.f319a;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        float fHypot = ((float) Math.hypot(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat(i)), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat(i2)))) * f;
        C0915y9 c0915y9M117a = AbstractC0011aa.m117a();
        float fIntBitsToFloat = Float.intBitsToFloat(i) - fHypot;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) - fHypot;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) + fHypot;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) + fHypot;
        if (c0915y9M117a.f13366b == null) {
            c0915y9M117a.f13366b = new RectF();
        }
        RectF rectF = c0915y9M117a.f13366b;
        rectF.getClass();
        rectF.set(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
        Path path = c0915y9M117a.f13365a;
        RectF rectF2 = c0915y9M117a.f13366b;
        rectF2.getClass();
        path.addOval(rectF2, AbstractC0011aa.m118b(ux1.f11544h));
        return new sv1(c0915y9M117a);
    }
}
