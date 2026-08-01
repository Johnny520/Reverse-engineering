package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class k30 extends o30 {

    /* JADX INFO: renamed from: c */
    public final m30 f2691c;

    /* JADX INFO: renamed from: d */
    public final float f2692d;

    /* JADX INFO: renamed from: e */
    public final float f2693e;

    public k30(m30 m30Var, float f, float f2) {
        this.f2691c = m30Var;
        this.f2692d = f;
        this.f2693e = f2;
    }

    @Override // p000.o30
    /* JADX INFO: renamed from: a */
    public final void mo1390a(Matrix matrix, d30 d30Var, int i, Canvas canvas) {
        m30 m30Var = this.f2691c;
        float f = m30Var.f3131c;
        float f2 = this.f2693e;
        float f3 = m30Var.f3130b;
        float f4 = this.f2692d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f3482a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m1621b());
        d30Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = d30Var.f1358f;
        int[] iArr = d30.f1349i;
        iArr[0] = i2;
        iArr[1] = d30Var.f1357e;
        iArr[2] = d30Var.f1356d;
        Paint paint = d30Var.f1355c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, d30.f1350j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m1621b() {
        m30 m30Var = this.f2691c;
        return (float) Math.toDegrees(Math.atan((m30Var.f3131c - this.f2693e) / (m30Var.f3130b - this.f2692d)));
    }
}
