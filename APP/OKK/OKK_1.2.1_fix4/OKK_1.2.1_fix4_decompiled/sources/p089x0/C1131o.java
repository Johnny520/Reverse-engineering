package p089x0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p088w0.C1116a;

/* JADX INFO: renamed from: x0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1131o extends AbstractC1136t {

    /* JADX INFO: renamed from: c */
    public final C1133q f4374c;

    public C1131o(C1133q c1133q) {
        this.f4374c = c1133q;
    }

    @Override // p089x0.AbstractC1136t
    /* JADX INFO: renamed from: a */
    public final void mo2663a(Matrix matrix, C1116a c1116a, int i2, Canvas canvas) {
        C1133q c1133q = this.f4374c;
        float f2 = c1133q.f4383f;
        float f3 = c1133q.f4384g;
        RectF rectF = new RectF(c1133q.f4379b, c1133q.f4380c, c1133q.f4381d, c1133q.f4382e);
        c1116a.getClass();
        boolean z2 = f3 < 0.0f;
        Path path = c1116a.f4281g;
        int[] iArr = C1116a.f4273k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = c1116a.f4280f;
            iArr[2] = c1116a.f4279e;
            iArr[3] = c1116a.f4278d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = c1116a.f4278d;
            iArr[2] = c1116a.f4279e;
            iArr[3] = c1116a.f4280f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / fWidth);
        float[] fArr = C1116a.f4274l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c1116a.f4276b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c1116a.f4282h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
