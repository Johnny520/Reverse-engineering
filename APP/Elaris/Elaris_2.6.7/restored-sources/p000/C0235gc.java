package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: gc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0235gc extends Drawable {

    /* JADX INFO: renamed from: a */
    public final RectF f324a = new RectF();

    /* JADX INFO: renamed from: b */
    public final Paint f325b;

    /* JADX INFO: renamed from: c */
    public final Paint f326c;

    /* JADX INFO: renamed from: d */
    public final int f327d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0235gc(int i, float f) {
        Paint paint = new Paint(1);
        this.f325b = paint;
        Paint paint2 = new Paint(1);
        this.f326c = paint2;
        this.f327d = Math.max(1, Math.round(Math.max(1.0f, f) * 28.0f));
        paint.setColor(i);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint2.setColor(i);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (canvas == null || bounds.width() <= 0 || bounds.height() <= 0) {
            return;
        }
        float fMin = Math.min(bounds.width(), bounds.height());
        float fExactCenterX = bounds.exactCenterX();
        float fExactCenterY = bounds.exactCenterY();
        float fMax = Math.max(1.7f, 0.082f * fMin);
        float fMax2 = Math.max(0.0f, 0.4f * fMin);
        Paint paint = this.f325b;
        paint.setStrokeWidth(fMax);
        RectF rectF = this.f324a;
        rectF.set(fExactCenterX - fMax2, fExactCenterY - fMax2, fExactCenterX + fMax2, fMax2 + fExactCenterY);
        canvas.drawOval(rectF, paint);
        float fMax3 = Math.max(1.5f, 0.067f * fMin);
        Paint paint2 = this.f326c;
        paint2.setStrokeWidth(fMax3);
        float f = fExactCenterX - (0.12f * fMin);
        float f2 = 0.105f * fMin;
        canvas.drawLine(f - f2, fExactCenterY, f + f2, fExactCenterY, paint2);
        canvas.drawLine(f, fExactCenterY - f2, f, fExactCenterY + f2, paint2);
        float f3 = (0.15f * fMin) + fExactCenterX;
        float f4 = 0.14f * fMin;
        float f5 = fExactCenterY - f4;
        canvas.drawLine(f3 - (0.07f * fMin), fExactCenterY - (fMin * 0.075f), f3, f5, paint2);
        canvas.drawLine(f3, f5, f3, f4 + fExactCenterY, paint2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f327d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f327d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f325b.setAlpha(i);
        this.f326c.setAlpha(i);
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f325b.setColorFilter(colorFilter);
        this.f326c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
