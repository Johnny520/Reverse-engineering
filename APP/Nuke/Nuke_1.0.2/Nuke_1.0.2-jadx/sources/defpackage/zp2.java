package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zp2 extends an {
    public hh1 a;
    public long b = 9205357640488583168L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.an
    public final void a(float f, long j, q9 q9Var) {
        Paint paint = (Paint) q9Var.c;
        hh1 hh1Var = this.a;
        if (hh1Var == null || !gr2.a(this.b, j)) {
            if (gr2.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                hh1Var = null;
            } else {
                hh1Var = this.a;
                if (hh1Var == null) {
                    hh1Var = new hh1(23, false);
                    this.a = hh1Var;
                }
                hh1Var.i = b(j);
                this.a = hh1Var;
                this.b = j;
            }
        }
        long jB = sp0.b(paint.getColor());
        long j2 = ju.b;
        if (!ju.c(jB, j2)) {
            q9Var.k(j2);
        }
        if (!t11.l((Shader) q9Var.d, hh1Var != null ? (Shader) hh1Var.i : null)) {
            q9Var.n(hh1Var != null ? (Shader) hh1Var.i : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        q9Var.i(f);
    }

    public abstract Shader b(long j);
}
