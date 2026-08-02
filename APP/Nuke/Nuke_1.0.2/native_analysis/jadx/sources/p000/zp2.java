package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zp2 extends AbstractC0024an {

    /* JADX INFO: renamed from: a */
    public hh1 f14019a;

    /* JADX INFO: renamed from: b */
    public long f14020b = 9205357640488583168L;

    @Override // p000.AbstractC0024an
    /* JADX INFO: renamed from: a */
    public final void mo234a(float f, long j, C0611q9 c0611q9) {
        Paint paint = (Paint) c0611q9.f8830c;
        hh1 hh1Var = this.f14019a;
        if (hh1Var == null || !gr2.m2019a(this.f14020b, j)) {
            if (gr2.m2021c(j)) {
                this.f14019a = null;
                this.f14020b = 9205357640488583168L;
                hh1Var = null;
            } else {
                hh1Var = this.f14019a;
                if (hh1Var == null) {
                    hh1Var = new hh1(23, false);
                    this.f14019a = hh1Var;
                }
                hh1Var.f4019i = mo507b(j);
                this.f14019a = hh1Var;
                this.f14020b = j;
            }
        }
        long jM4930b = sp0.m4930b(paint.getColor());
        long j2 = C0363ju.f5212b;
        if (!C0363ju.m2566c(jM4930b, j2)) {
            c0611q9.m4095k(j2);
        }
        if (!t11.m5086l((Shader) c0611q9.f8831d, hh1Var != null ? (Shader) hh1Var.f4019i : null)) {
            c0611q9.m4098n(hh1Var != null ? (Shader) hh1Var.f4019i : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        c0611q9.m4093i(f);
    }

    /* JADX INFO: renamed from: b */
    public abstract Shader mo507b(long j);
}
