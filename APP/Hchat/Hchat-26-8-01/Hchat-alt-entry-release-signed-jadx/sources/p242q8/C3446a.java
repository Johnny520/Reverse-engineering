package p242q8;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: q8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3446a extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f11165a;

    /* JADX INFO: renamed from: b */
    public final RectF f11166b;

    /* JADX INFO: renamed from: c */
    public final int f11167c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3446a(int i9, int i10) {
        Paint paint = new Paint(1);
        this.f11165a = paint;
        this.f11166b = new RectF();
        this.f11167c = i10;
        paint.setColor(i9);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fMin = Math.min(bounds.width(), bounds.height());
        if (fMin <= 0.0f) {
            return;
        }
        float fWidth = ((bounds.width() - fMin) / 2.0f) + bounds.left;
        float fHeight = ((bounds.height() - fMin) / 2.0f) + bounds.top;
        float fMax = Math.max(2.0f, 0.055f * fMin);
        Paint paint = this.f11165a;
        paint.setStrokeWidth(fMax);
        float f3 = 0.18f * fMin;
        float f10 = 0.82f * fMin;
        RectF rectF = this.f11166b;
        rectF.set(fWidth + f3, f3 + fHeight, fWidth + f10, f10 + fHeight);
        if (this.f11167c == 2) {
            canvas.drawOval(rectF, paint);
        } else {
            float f11 = 0.14f * fMin;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        float f12 = (0.38f * fMin) + fWidth;
        float f13 = (0.62f * fMin) + fWidth;
        float f14 = (0.35f * fMin) + fHeight;
        float f15 = (0.5f * fMin) + fHeight;
        float f16 = (fMin * 0.65f) + fHeight;
        canvas.drawLine(f12, f14, f12, f16, paint);
        canvas.drawLine(f13, f14, f13, f16, paint);
        canvas.drawLine(f12, f15, f13, f15, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 96;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 96;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.f11165a.setAlpha(i9);
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11165a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
