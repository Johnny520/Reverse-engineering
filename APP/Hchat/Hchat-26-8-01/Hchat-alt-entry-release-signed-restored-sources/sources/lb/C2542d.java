package lb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lb.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2542d extends Drawable {

    /* JADX INFO: renamed from: a */
    public final float f8227a;

    /* JADX INFO: renamed from: b */
    public final Paint f8228b;

    /* JADX INFO: renamed from: c */
    public final Paint f8229c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2542d(Context context) {
        this.f8227a = context.getResources().getDisplayMetrics().density;
        Paint paint = new Paint(1);
        paint.setColor((context.getResources().getConfiguration().uiMode & 48) == 32 ? -1 : Color.rgb(51, 51, 51));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f8228b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(paint.getColor());
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.DEFAULT_BOLD);
        this.f8229c = paint2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Rect bounds = getBounds();
        bounds.getClass();
        float fMin = Math.min(bounds.width(), bounds.height());
        if (fMin <= 0.0f) {
            return;
        }
        float fExactCenterX = bounds.exactCenterX();
        float fExactCenterY = bounds.exactCenterY();
        float fMax = Math.max(this.f8227a * 1.6f, 0.065f * fMin);
        Paint paint = this.f8228b;
        paint.setStrokeWidth(fMax);
        canvas.drawCircle(fExactCenterX, fExactCenterY, 0.38f * fMin, paint);
        Paint paint2 = this.f8229c;
        paint2.setTextSize(fMin * 0.34f);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        canvas.drawText("+1", fExactCenterX, fExactCenterY - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.f8227a * 32.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.f8227a * 32.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.f8228b.setAlpha(i9);
        this.f8229c.setAlpha(i9);
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8228b.setColorFilter(colorFilter);
        this.f8229c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
