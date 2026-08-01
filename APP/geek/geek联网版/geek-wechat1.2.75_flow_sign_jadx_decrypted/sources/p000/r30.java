package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class r30 extends v30 {

    /* JADX INFO: renamed from: c */
    public final t30 f4054c;

    /* JADX INFO: renamed from: d */
    public final float f4055d;

    /* JADX INFO: renamed from: e */
    public final float f4056e;

    public r30(t30 t30Var, float f, float f2) {
        this.f4054c = t30Var;
        this.f4055d = f;
        this.f4056e = f2;
    }

    @Override // p000.v30
    /* JADX INFO: renamed from: a */
    public final void mo2062a(Matrix matrix, k30 k30Var, int i, Canvas canvas) {
        t30 t30Var = this.f4054c;
        float f = t30Var.f4399c;
        float f2 = this.f4056e;
        float f3 = t30Var.f4398b;
        float f4 = this.f4055d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f4887a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m2224b());
        k30Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = k30Var.f2773f;
        int[] iArr = k30.f2764i;
        iArr[0] = i2;
        iArr[1] = k30Var.f2772e;
        iArr[2] = k30Var.f2771d;
        Paint paint = k30Var.f2770c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, k30.f2765j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m2224b() {
        t30 t30Var = this.f4054c;
        return (float) Math.toDegrees(Math.atan((t30Var.f4399c - this.f4056e) / (t30Var.f4398b - this.f4055d)));
    }
}
