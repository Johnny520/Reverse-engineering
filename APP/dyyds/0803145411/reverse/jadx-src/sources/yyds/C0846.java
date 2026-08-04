package yyds;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: yyds.ᛴᛴᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0846 extends Drawable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public float f3883;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final float f3884;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Paint f3885;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Path f3886;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f3887;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final RectF f3888;

    public C0846(float f) {
        this.f3884 = f;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f3885 = paint;
        this.f3886 = new Path();
        this.f3888 = new RectF();
        this.f3883 = -1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC2328.m4341(-1449928992392046L);
        float f = this.f3883;
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        Path path = this.f3886;
        path.reset();
        RectF rectF = this.f3888;
        rectF.set(0.0f, 0.0f, fWidth, fHeight);
        float f2 = this.f3884;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float f3 = 0.4f * fWidth;
        float f4 = ((fWidth + f3) * this.f3883) + ((-f3) / 2.0f);
        float f5 = f3 / 2.0f;
        LinearGradient linearGradient = new LinearGradient(f4 - f5, 0.0f, f4 + f5, 0.0f, new int[]{16777215, 872415231, 1728053247, 872415231, 16777215}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = this.f3885;
        paint.setShader(linearGradient);
        paint.setAlpha(255);
        canvas.drawRect(0.0f, 0.0f, fWidth, fHeight, paint);
        paint.setShader(null);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3885.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3885.setColorFilter(colorFilter);
    }
}
