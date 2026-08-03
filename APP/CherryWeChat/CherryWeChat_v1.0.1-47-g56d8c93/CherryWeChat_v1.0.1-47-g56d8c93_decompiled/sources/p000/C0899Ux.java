package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: Ux */
/* JADX INFO: loaded from: classes.dex */
public final class C0899Ux extends AbstractC1114Zx {

    /* JADX INFO: renamed from: c */
    public final C0985Wx f2795c;

    public C0899Ux(C0985Wx c0985Wx) {
        this.f2795c = c0985Wx;
    }

    @Override // p000.AbstractC1114Zx
    /* JADX INFO: renamed from: a */
    public final void mo1690a(Matrix matrix, C0642Ox c0642Ox, int i, Canvas canvas) {
        float f;
        C0985Wx c0985Wx = this.f2795c;
        float f2 = c0985Wx.f3099f;
        float f3 = c0985Wx.f3100g;
        RectF rectF = new RectF(c0985Wx.f3095b, c0985Wx.f3096c, c0985Wx.f3097d, c0985Wx.f3098e);
        Paint paint = c0642Ox.f2055b;
        boolean z = f3 < 0.0f;
        Path path = c0642Ox.f2060g;
        int[] iArr = C0642Ox.f2052k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c0642Ox.f2059f;
            iArr[2] = c0642Ox.f2058e;
            iArr[3] = c0642Ox.f2057d;
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
            iArr[1] = c0642Ox.f2057d;
            iArr[2] = c0642Ox.f2058e;
            iArr[3] = c0642Ox.f2059f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f) {
            return;
        }
        float f5 = 1.0f - (i / fWidth);
        float[] fArr = C0642Ox.f2053l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c0642Ox.f2061h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
