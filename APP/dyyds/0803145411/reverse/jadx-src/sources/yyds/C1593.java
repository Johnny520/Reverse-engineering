package yyds;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: yyds.ᛷᛷᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1593 extends Drawable {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final float f8114;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Paint f8115 = new Paint(1);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final RectF f8116 = new RectF();

    public C1593(float f) {
        this.f8114 = f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC2328.m4341(-229067358634862L);
        Rect bounds = getBounds();
        RectF rectF = this.f8116;
        rectF.set(bounds);
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f8115;
        paint.setStyle(style);
        paint.setColor(-14408668);
        float f = this.f8114;
        canvas.drawRoundRect(rectF, f, f, paint);
        int iSave = canvas.save();
        canvas.clipRect(rectF.centerX(), rectF.top, rectF.right, rectF.bottom);
        paint.setColor(-1513240);
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.restoreToCount(iSave);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(855638016);
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8115.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8115.setColorFilter(colorFilter);
    }
}
