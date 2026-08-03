package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: Vx */
/* JADX INFO: loaded from: classes.dex */
public final class C0942Vx extends AbstractC1114Zx {

    /* JADX INFO: renamed from: c */
    public final C1028Xx f2961c;

    /* JADX INFO: renamed from: d */
    public final float f2962d;

    /* JADX INFO: renamed from: e */
    public final float f2963e;

    public C0942Vx(C1028Xx c1028Xx, float f, float f2) {
        this.f2961c = c1028Xx;
        this.f2962d = f;
        this.f2963e = f2;
    }

    @Override // p000.AbstractC1114Zx
    /* JADX INFO: renamed from: a */
    public final void mo1690a(Matrix matrix, C0642Ox c0642Ox, int i, Canvas canvas) {
        C1028Xx c1028Xx = this.f2961c;
        float f = c1028Xx.f3274c;
        float f2 = this.f2963e;
        float f3 = c1028Xx.f3273b;
        float f4 = this.f2962d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f3515a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m1798b());
        c0642Ox.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c0642Ox.f2059f;
        int[] iArr = C0642Ox.f2050i;
        iArr[0] = i2;
        iArr[1] = c0642Ox.f2058e;
        iArr[2] = c0642Ox.f2057d;
        Paint paint = c0642Ox.f2056c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C0642Ox.f2051j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m1798b() {
        C1028Xx c1028Xx = this.f2961c;
        return (float) Math.toDegrees(Math.atan((c1028Xx.f3274c - this.f2963e) / (c1028Xx.f3273b - this.f2962d)));
    }
}
