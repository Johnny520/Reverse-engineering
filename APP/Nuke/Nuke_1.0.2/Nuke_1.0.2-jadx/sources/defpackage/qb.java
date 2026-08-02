package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qb extends TextPaint {
    public q9 a;
    public gz2 b;
    public int c;
    public bq2 d;
    public ju e;
    public an f;
    public n70 g;
    public gr2 h;
    public op0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q9 a() {
        q9 q9Var = this.a;
        if (q9Var != null) {
            return q9Var;
        }
        q9 q9Var2 = new q9(this);
        this.a = q9Var2;
        return q9Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().j(i);
        this.c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final an anVar, final long j, float f) {
        if (anVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (anVar instanceof ft2) {
            d(rp0.i0(f, ((ft2) anVar).a));
            return;
        }
        if (!(anVar instanceof zp2)) {
            c80.s();
            return;
        }
        if (t11.l(this.f, anVar)) {
            gr2 gr2Var = this.h;
            if (!(gr2Var == null ? false : gr2.a(gr2Var.a, j))) {
            }
        } else {
            if (j != 9205357640488583168L) {
                this.f = anVar;
                this.h = new gr2(j);
                this.g = op0.m(new xm0() { // from class: pb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xm0
                    public final Object a() {
                        return ((zp2) anVar).b(j);
                    }
                });
            }
        }
        q9 q9VarA = a();
        n70 n70Var = this.g;
        q9VarA.n(n70Var != null ? (Shader) n70Var.getValue() : null);
        this.e = null;
        sp0.h0(this, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(long j) {
        ju juVar = this.e;
        if (juVar == null ? false : ju.c(juVar.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new ju(j);
            setColor(sp0.j0(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(op0 op0Var) {
        if (op0Var == null || t11.l(this.i, op0Var)) {
            return;
        }
        this.i = op0Var;
        if (op0Var.equals(xi0.h)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(op0Var instanceof xv2)) {
            c80.s();
            return;
        }
        a().r(1);
        xv2 xv2Var = (xv2) op0Var;
        a().q(xv2Var.h);
        q9 q9VarA = a();
        ((Paint) q9VarA.c).setStrokeMiter(xv2Var.i);
        a().p(xv2Var.k);
        a().o(xv2Var.j);
        ((Paint) a().c).setPathEffect(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(bq2 bq2Var) {
        if (bq2Var == null || t11.l(this.d, bq2Var)) {
            return;
        }
        this.d = bq2Var;
        if (bq2Var.equals(bq2.d)) {
            clearShadowLayer();
            return;
        }
        bq2 bq2Var2 = this.d;
        float f = bq2Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (bq2Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), sp0.j0(this.d.a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(gz2 gz2Var) {
        if (gz2Var == null || t11.l(this.b, gz2Var)) {
            return;
        }
        this.b = gz2Var;
        int i = gz2Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
