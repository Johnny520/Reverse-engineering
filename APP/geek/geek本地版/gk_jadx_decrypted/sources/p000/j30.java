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
public final class j30 extends o30 {

    /* JADX INFO: renamed from: c */
    public final l30 f2544c;

    public j30(l30 l30Var) {
        this.f2544c = l30Var;
    }

    @Override // p000.o30
    /* JADX INFO: renamed from: a */
    public final void mo1390a(Matrix matrix, d30 d30Var, int i, Canvas canvas) {
        float f;
        l30 l30Var = this.f2544c;
        float f2 = l30Var.f3007f;
        float f3 = l30Var.f3008g;
        RectF rectF = new RectF(l30Var.f3003b, l30Var.f3004c, l30Var.f3005d, l30Var.f3006e);
        Paint paint = d30Var.f1354b;
        boolean z = f3 < 0.0f;
        Path path = d30Var.f1359g;
        int[] iArr = d30.f1351k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = d30Var.f1358f;
            iArr[2] = d30Var.f1357e;
            iArr[3] = d30Var.f1356d;
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
            iArr[1] = d30Var.f1356d;
            iArr[2] = d30Var.f1357e;
            iArr[3] = d30Var.f1358f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f) {
            return;
        }
        float f5 = 1.0f - (i / fWidth);
        float[] fArr = d30.f1352l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, d30Var.f1360h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
