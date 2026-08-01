package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: t4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0465t4 extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final Bitmap f893a;

    /* JADX INFO: renamed from: b */
    public final int f894b;

    /* JADX INFO: renamed from: c */
    public final int f895c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0465t4(Bitmap bitmap, int i, int i2) {
        this.f893a = bitmap;
        this.f894b = Math.max(0, i);
        this.f895c = Math.max(0, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Bitmap bitmap;
        if (canvas == null || paint == null || (bitmap = this.f893a) == null || bitmap.isRecycled()) {
            return;
        }
        Paint paint2 = new Paint(paint);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, f + this.f894b, Math.max(0, ((i5 - i3) - bitmap.getHeight()) / 2) + i3, paint2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int width;
        int height;
        Bitmap bitmap = this.f893a;
        if (bitmap == null || bitmap.isRecycled()) {
            width = this.f895c;
            height = width;
        } else {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        int i3 = this.f894b;
        if (fontMetricsInt != null && paint != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i4 = (i3 * 2) + height;
            int i5 = ((fontMetricsInt2.ascent + fontMetricsInt2.descent) / 2) - (i4 / 2);
            fontMetricsInt.ascent = i5;
            int i6 = i4 + i5;
            fontMetricsInt.descent = i6;
            fontMetricsInt.top = i5;
            fontMetricsInt.bottom = i6;
        }
        return (i3 * 2) + width;
    }
}
