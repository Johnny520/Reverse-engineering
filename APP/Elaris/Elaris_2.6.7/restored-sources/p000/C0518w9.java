package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0518w9 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f1013a;

    /* JADX INFO: renamed from: b */
    public final Paint f1014b;

    /* JADX INFO: renamed from: c */
    public final RectF f1015c;

    /* JADX INFO: renamed from: d */
    public final float f1016d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0518w9(float f) {
        Paint paint = new Paint(1);
        this.f1013a = paint;
        Paint paint2 = new Paint(1);
        this.f1014b = paint2;
        this.f1015c = new RectF();
        this.f1016d = f <= 0.0f ? 1.0f : f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-15554315);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-15554315);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setFakeBoldText(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (canvas != null && (bounds = getBounds()) != null && bounds.width() > 0 && bounds.height() > 0) {
            float fMin = Math.min(bounds.width(), bounds.height());
            float fWidth = (bounds.width() / 2.0f) + bounds.left;
            float fHeight = (bounds.height() / 2.0f) + bounds.top;
            float f = this.f1016d;
            float fMax = Math.max(1.0f * f, 0.062f * fMin);
            float fMax2 = Math.max(0.0f, (fMin / 2.0f) - (fMax / 2.0f));
            Paint paint = this.f1013a;
            paint.setStrokeWidth(fMax);
            RectF rectF = this.f1015c;
            rectF.set(fWidth - fMax2, fHeight - fMax2, fWidth + fMax2, fMax2 + fHeight);
            canvas.drawOval(rectF, paint);
            float fMax3 = Math.max(f * 8.0f, fMin * 0.44f);
            Paint paint2 = this.f1014b;
            paint2.setTextSize(fMax3);
            Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
            canvas.drawText("+1", fWidth, fHeight - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.round(this.f1016d * 25.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.round(this.f1016d * 25.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1013a.setAlpha(i);
        this.f1014b.setAlpha(i);
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1013a.setColorFilter(colorFilter);
        this.f1014b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
