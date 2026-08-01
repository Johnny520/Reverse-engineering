package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ce */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0047ce extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f108a;

    /* JADX INFO: renamed from: b */
    public final Paint f109b;

    /* JADX INFO: renamed from: c */
    public final Path f110c;

    /* JADX INFO: renamed from: d */
    public final RectF f111d;

    /* JADX INFO: renamed from: e */
    public final int f112e;

    /* JADX INFO: renamed from: f */
    public final int f113f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0047ce(int i, int i2, float f) {
        Paint paint = new Paint(1);
        this.f108a = paint;
        Paint paint2 = new Paint(1);
        this.f109b = paint2;
        this.f110c = new Path();
        this.f111d = new RectF();
        this.f112e = i;
        this.f113f = Math.max(1, Math.round(Math.max(1.0f, f) * 32.0f));
        paint.setColor(i2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
        int i = this.f112e;
        Paint paint = this.f108a;
        if (i == 1) {
            float fMin = Math.min(bounds.width(), bounds.height());
            float fExactCenterX = bounds.exactCenterX();
            float fExactCenterY = bounds.exactCenterY();
            int iSaveLayer = canvas.saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, null);
            paint.setStyle(Paint.Style.FILL);
            float f = 0.38f * fMin;
            RectF rectF = this.f111d;
            rectF.set(fExactCenterX - f, fExactCenterY - (0.28f * fMin), f + fExactCenterX, (0.35f * fMin) + fExactCenterY);
            float f2 = 0.14f * fMin;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = this.f109b;
            paint2.setStyle(style);
            paint2.setStrokeWidth(Math.max(2.7f, 0.135f * fMin));
            canvas.drawLine(fExactCenterX, fExactCenterY - (0.36f * fMin), fExactCenterX, (0.09f * fMin) + fExactCenterY, paint2);
            float f3 = 0.18f * fMin;
            float f4 = fExactCenterY - (0.07f * fMin);
            float f5 = (fMin * 0.12f) + fExactCenterY;
            canvas.drawLine(fExactCenterX - f3, f4, fExactCenterX, f5, paint2);
            canvas.drawLine(fExactCenterX + f3, f4, fExactCenterX, f5, paint2);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        float fMin2 = Math.min(bounds.width(), bounds.height());
        float fWidth = ((bounds.width() - fMin2) * 0.5f) + bounds.left;
        float fHeight = (0.5f * fMin2) + ((bounds.height() - fMin2) * 0.5f) + bounds.top;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Math.max(3.2f, 0.145f * fMin2));
        Path path = this.f110c;
        path.reset();
        float f6 = 0.13f * fMin2;
        float f7 = 0.22f * fMin2;
        path.moveTo(fWidth + f6, fHeight + f7);
        float f8 = fHeight - f6;
        path.cubicTo((0.2f * fMin2) + fWidth, fHeight - (0.08f * fMin2), (0.48f * fMin2) + fWidth, fHeight - f7, (0.65f * fMin2) + fWidth, f8);
        canvas.drawPath(path, paint);
        paint.setStyle(Paint.Style.FILL);
        path.reset();
        path.moveTo((0.87f * fMin2) + fWidth, f8);
        path.lineTo((0.61f * fMin2) + fWidth, fHeight - (0.34f * fMin2));
        path.lineTo((0.64f * fMin2) + fWidth, (fMin2 * 0.1f) + fHeight);
        path.close();
        canvas.drawPath(path, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f113f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f113f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f108a.setAlpha(i);
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f108a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
