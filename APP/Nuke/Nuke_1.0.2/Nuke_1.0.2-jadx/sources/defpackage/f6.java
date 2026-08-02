package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f6 implements qp {
    public Canvas a = g6.a;
    public Rect b;
    public Rect c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void a(d9 d9Var, q9 q9Var) {
        this.a.drawBitmap(p40.i(d9Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) q9Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void c(float f) {
        this.a.rotate(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void d(float f, long j, q9 q9Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) q9Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void e(d9 d9Var, long j, long j2, long j3, q9 q9Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapI = p40.i(d9Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapI, rect, rect2, (Paint) q9Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void f(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void g(float f, float f2) {
        this.a.translate(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void h(y9 y9Var, q9 q9Var) {
        Canvas canvas = this.a;
        if (y9Var instanceof y9) {
            canvas.drawPath(y9Var.a, pp0.w(q9Var));
        } else {
            c80.t("Unable to obtain android.graphics.Path");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void i() {
        this.a.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void j(float f, float f2, float f3, float f4, float f5, float f6, q9 q9Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) q9Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void l() {
        this.a.save();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void m(long j, long j2, q9 q9Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) q9Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void n() {
        sp0.z(this.a, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void o(o62 o62Var, q9 q9Var) {
        this.a.saveLayer(o62Var.a, o62Var.b, o62Var.c, o62Var.d, (Paint) q9Var.c, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void p(float f, float f2, float f3, float f4, q9 q9Var) {
        this.a.drawRect(f, f2, f3, f4, pp0.w(q9Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void q(float[] fArr) {
        if (p7.y(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        ci0.U(matrix, fArr);
        this.a.concat(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void r() {
        sp0.z(this.a, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void s(y9 y9Var) {
        Canvas canvas = this.a;
        if (y9Var instanceof y9) {
            canvas.clipPath(y9Var.a, Region.Op.INTERSECT);
        } else {
            c80.t("Unable to obtain android.graphics.Path");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, q9 q9Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) q9Var.c);
    }
}
