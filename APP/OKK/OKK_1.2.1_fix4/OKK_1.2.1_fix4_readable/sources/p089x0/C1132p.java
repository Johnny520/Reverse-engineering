package p089x0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p088w0.C1116a;

/* JADX INFO: renamed from: x0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1132p extends AbstractC1136t {

    /* JADX INFO: renamed from: c */
    public final C1134r f4375c;

    /* JADX INFO: renamed from: d */
    public final float f4376d;

    /* JADX INFO: renamed from: e */
    public final float f4377e;

    public C1132p(C1134r c1134r, float f2, float f3) {
        this.f4375c = c1134r;
        this.f4376d = f2;
        this.f4377e = f3;
    }

    @Override // p089x0.AbstractC1136t
    /* JADX INFO: renamed from: a */
    public final void mo2663a(Matrix matrix, C1116a c1116a, int i2, Canvas canvas) {
        C1134r c1134r = this.f4375c;
        float f2 = c1134r.f4386c;
        float f3 = this.f4377e;
        float f4 = c1134r.f4385b;
        float f5 = this.f4376d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = this.f4389a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(m2664b());
        c1116a.getClass();
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = C1116a.f4271i;
        iArr[0] = c1116a.f4280f;
        iArr[1] = c1116a.f4279e;
        iArr[2] = c1116a.f4278d;
        Paint paint = c1116a.f4277c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, C1116a.f4272j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m2664b() {
        C1134r c1134r = this.f4375c;
        return (float) Math.toDegrees(Math.atan((c1134r.f4386c - this.f4377e) / (c1134r.f4385b - this.f4376d)));
    }
}
