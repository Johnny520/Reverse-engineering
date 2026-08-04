package yyds;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: yyds.ᛸᛵᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1780 extends Drawable {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Paint f8967;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Paint f8968;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final RectF f8969;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public float f8970;

    public C1780(int i, float f) {
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f);
        paint.setColor((16777215 & i) | 1191182336);
        this.f8967 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(i);
        this.f8968 = paint2;
        this.f8969 = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC2328.m4341(-1647514667877230L);
        Paint paint = this.f8967;
        float strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
        RectF rectF = this.f8969;
        rectF.set(getBounds().left + strokeWidth, getBounds().top + strokeWidth, getBounds().right - strokeWidth, getBounds().bottom - strokeWidth);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
        canvas.drawArc(rectF, this.f8970, 76.0f, false, this.f8968);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8967.setAlpha(i);
        this.f8968.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8967.setColorFilter(colorFilter);
        this.f8968.setColorFilter(colorFilter);
    }
}
