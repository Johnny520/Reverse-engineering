package com.p001mr.elaris;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsFeedbackIconDrawable extends Drawable {
    private final int color;
    private final Paint paint = new Paint(1);
    private final InAppSettings settings;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InAppSettingsFeedbackIconDrawable(InAppSettings inAppSettings, int i) {
        this.settings = inAppSettings;
        this.color = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        float fMax = Math.max(1.0f, this.settings.m139dp(1.0f));
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(fMax);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setColor(this.color);
        float fM139dp = this.settings.m139dp(1.4f);
        RectF rectF2 = new RectF(rectF.left + fM139dp, rectF.top + fM139dp, rectF.right - fM139dp, rectF.bottom - this.settings.m139dp(4.0f));
        canvas.drawRoundRect(rectF2, this.settings.m139dp(5.0f), this.settings.m139dp(5.0f), this.paint);
        float fWidth = (rectF2.width() * 0.32f) + rectF2.left;
        float f = rectF2.bottom;
        canvas.drawLine(fWidth, f, fWidth - this.settings.m139dp(2.0f), f + this.settings.m139dp(2.7f), this.paint);
        canvas.drawLine(fWidth - this.settings.m139dp(2.0f), f + this.settings.m139dp(2.7f), fWidth + this.settings.m139dp(2.6f), f, this.paint);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((rectF2.width() * 0.35f) + rectF2.left, rectF2.centerY(), this.settings.m139dp(0.9f), this.paint);
        canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), this.settings.m139dp(0.9f), this.paint);
        canvas.drawCircle((rectF2.width() * 0.65f) + rectF2.left, rectF2.centerY(), this.settings.m139dp(0.9f), this.paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }
}
