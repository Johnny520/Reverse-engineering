package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class q30 extends v30 {

    /* JADX INFO: renamed from: c */
    public final s30 f3790c;

    public q30(s30 s30Var) {
        this.f3790c = s30Var;
    }

    @Override // p000.v30
    /* JADX INFO: renamed from: a */
    public final void mo2062a(Matrix matrix, k30 k30Var, int i, Canvas canvas) {
        float f;
        s30 s30Var = this.f3790c;
        float f2 = s30Var.f4200f;
        float f3 = s30Var.f4201g;
        RectF rectF = new RectF(s30Var.f4196b, s30Var.f4197c, s30Var.f4198d, s30Var.f4199e);
        Paint paint = k30Var.f2769b;
        boolean z = f3 < 0.0f;
        Path path = k30Var.f2774g;
        int[] iArr = k30.f2766k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = k30Var.f2773f;
            iArr[2] = k30Var.f2772e;
            iArr[3] = k30Var.f2771d;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = k30Var.f2771d;
            iArr[2] = k30Var.f2772e;
            iArr[3] = k30Var.f2773f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f) {
            return;
        }
        float f5 = 1.0f - (i / fWidth);
        float[] fArr = k30.f2767l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, k30Var.f2775h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
