package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: m9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0331m9 extends Drawable {

    /* JADX INFO: renamed from: c */
    public final float f565c;

    /* JADX INFO: renamed from: a */
    public final Paint f563a = new Paint(1);

    /* JADX INFO: renamed from: b */
    public final RectF f564b = new RectF();

    /* JADX INFO: renamed from: d */
    public int f566d = 255;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0331m9(float f) {
        this.f565c = Math.max(1.0f, Math.min(f, 1.8f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m759a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = this.f565c;
        float f9 = ((f4 - 54.0f) * f8) + 54.0f;
        float f10 = ((f5 - 54.0f) * f8) + 54.0f;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f563a;
        paint.setStyle(style);
        paint.setColor(i);
        paint.setAlpha(this.f566d);
        RectF rectF = this.f564b;
        rectF.set((f9 * f3) + f, (f10 * f3) + f2, ((f9 + (f6 * f8)) * f3) + f, ((f10 + (f7 * f8)) * f3) + f2);
        float f11 = 3.5f * f8 * f3;
        canvas.drawRoundRect(rectF, f11, f11, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (canvas == null || (bounds = getBounds()) == null || bounds.isEmpty()) {
            return;
        }
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        float fMin = Math.min(fWidth, fHeight);
        float f = ((fWidth - fMin) / 2.0f) + bounds.left;
        float f2 = ((fHeight - fMin) / 2.0f) + bounds.top;
        float f3 = fMin / 108.0f;
        m759a(canvas, Color.rgb(73, 209, 149), f, f2, f3, 31.5f, 38.25f, 14.75f, 36.75f);
        m759a(canvas, Color.rgb(254, 174, 57), f, f2, f3, 58.5f, 44.25f, 18.0f, 31.0f);
        m759a(canvas, Color.rgb(78, 127, 224), f, f2, f3, 44.5f, 32.5f, 17.75f, 42.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 108;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 108;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f566d = Math.max(0, Math.min(i, 255));
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f563a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
