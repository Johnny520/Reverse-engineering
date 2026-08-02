package p000;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 implements eq2 {

    /* JADX INFO: renamed from: a */
    public final float f5734a;

    public kr1(float f) {
        this.f5734a = f;
    }

    @Override // p000.eq2
    /* JADX INFO: renamed from: a */
    public final AbstractC0731te mo248a(long j, d61 d61Var, e70 e70Var) {
        d61Var.getClass();
        e70Var.getClass();
        float fMo689A = e70Var.mo689A(this.f5734a);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fM778C = ci0.m778C(1.35f, 1.0f, 1.6f);
        float fM778C2 = ci0.m778C(fMo689A, 0.0f, Math.min(fIntBitsToFloat, fIntBitsToFloat2) / 2.0f);
        C0915y9 c0915y9M117a = AbstractC0011aa.m117a();
        Path path = c0915y9M117a.f13365a;
        float fMin = Math.min(fIntBitsToFloat, fIntBitsToFloat2) / 2.0f;
        float f = fM778C2 * fM778C;
        float f2 = f > fMin ? fMin : f;
        float f3 = (((fM778C - 1.0f) * 0.18f) + 0.52f) * fM778C2;
        float f4 = f3 > f2 ? f2 : f3;
        path.moveTo(f2, 0.0f);
        float f5 = fIntBitsToFloat - f2;
        c0915y9M117a.m6233e(f5, 0.0f);
        float f6 = fIntBitsToFloat - f4;
        c0915y9M117a.m6231c(f6, 0.0f, fIntBitsToFloat, f4, fIntBitsToFloat, f2);
        float f7 = f4;
        float f8 = f2;
        float f9 = fIntBitsToFloat2 - f8;
        c0915y9M117a.m6233e(fIntBitsToFloat, f9);
        float f10 = fIntBitsToFloat2 - f7;
        c0915y9M117a.m6231c(fIntBitsToFloat, f10, f6, fIntBitsToFloat2, f5, fIntBitsToFloat2);
        c0915y9M117a.m6233e(f8, fIntBitsToFloat2);
        c0915y9M117a.m6231c(f7, fIntBitsToFloat2, 0.0f, f10, 0.0f, f9);
        c0915y9M117a.m6233e(0.0f, f8);
        c0915y9M117a.m6231c(0.0f, f7, f7, 0.0f, f8, 0.0f);
        path.close();
        return new sv1(c0915y9M117a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr1) && za0.m6404b(this.f5734a, ((kr1) obj).f5734a) && Float.compare(1.35f, 1.35f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.35f) + (Float.hashCode(this.f5734a) * 31);
    }

    public final String toString() {
        return vi0.m5691j("NukeSquircleShape(radius=", za0.m6405c(this.f5734a), ", smoothness=1.35)");
    }
}
