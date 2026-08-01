package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0315l9 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final int f531a;

    /* JADX INFO: renamed from: b */
    public final int f532b;

    /* JADX INFO: renamed from: c */
    public final Paint f533c = new Paint(1);

    /* JADX INFO: renamed from: d */
    public final RectF f534d = new RectF();

    /* JADX INFO: renamed from: e */
    public final Path f535e = new Path();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0315l9(int i, int i2) {
        this.f531a = i;
        this.f532b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m755a(int i, float f) {
        float f2 = 1.0f - f;
        float f3 = f * 255.0f;
        return Color.rgb((int) ((Color.red(i) * f2) + f3), (int) ((Color.green(i) * f2) + f3), (int) ((Color.blue(i) * f2) + f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        float f = bounds.left;
        float f2 = bounds.top;
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        RectF rectF = this.f534d;
        Paint paint = this.f533c;
        int i = this.f531a;
        if (i == 1) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.rgb(246, 186, 73));
            rectF.set((0.12f * fWidth) + f, (0.28f * fHeight) + f2, (0.46f * fWidth) + f, (0.42f * fHeight) + f2);
            float f3 = fWidth * 0.05f;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            float f4 = fWidth * 0.08f;
            rectF.set(f + f4, (fHeight * 0.36f) + f2, (0.92f * fWidth) + f, (fHeight * 0.78f) + f2);
            canvas.drawRoundRect(rectF, f4, f4, paint);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(Math.max(1.0f, fWidth * 0.045f));
            paint.setColor(Color.rgb(215, 151, 46));
            canvas.drawRoundRect(rectF, f4, f4, paint);
            return;
        }
        int i2 = this.f532b;
        if (i == 2) {
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setColor(Color.rgb(248, 251, 255));
            float f5 = (fHeight * 0.12f) + f2;
            float f6 = (0.78f * fWidth) + f;
            rectF.set((0.22f * fWidth) + f, f5, f6, (0.88f * fHeight) + f2);
            float f7 = fWidth * 0.045f;
            canvas.drawRoundRect(rectF, f7, f7, paint);
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            paint.setStrokeWidth(Math.max(1.0f, f7));
            paint.setColor(m755a(i2, 0.56f));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            paint.setStyle(style);
            paint.setColor(m755a(i2, 0.86f));
            Path path = this.f535e;
            path.reset();
            float f8 = (fWidth * 0.62f) + f;
            path.moveTo(f8, f5);
            float f9 = (fHeight * 0.28f) + f2;
            path.lineTo(f6, f9);
            path.lineTo(f8, f9);
            path.close();
            canvas.drawPath(path, paint);
            paint.setStyle(style2);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(Math.max(1.8f, 0.065f * fWidth));
            paint.setColor(i2);
            float f10 = (0.48f * fWidth) + f;
            float f11 = (fHeight * 0.36f) + f2;
            canvas.drawLine(f10, f11, f10, (0.62f * fHeight) + f2, paint);
            canvas.drawLine(f10, f11, (0.64f * fWidth) + f, (0.32f * fHeight) + f2, paint);
            paint.setStyle(style);
            canvas.drawCircle((fWidth * 0.42f) + f, (fHeight * 0.66f) + f2, fWidth * 0.075f, paint);
            paint.setStrokeCap(Paint.Cap.BUTT);
            return;
        }
        if (i == 4) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(Math.max(2.0f, 0.09f * fWidth));
            paint.setColor(i2);
            float f12 = (0.5f * fWidth) + f;
            float f13 = (0.22f * fHeight) + f2;
            float f14 = (0.48f * fHeight) + f2;
            canvas.drawLine(f12, f13, (fWidth * 0.24f) + f, f14, paint);
            canvas.drawLine(f12, f13, (fWidth * 0.76f) + f, f14, paint);
            canvas.drawLine(f12, (0.24f * fHeight) + f2, f12, (fHeight * 0.78f) + f2, paint);
            paint.setStrokeCap(Paint.Cap.BUTT);
            return;
        }
        if (i == 5) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(m755a(i2, 0.82f));
            rectF.set((0.18f * fWidth) + f, (0.22f * fHeight) + f2, (0.82f * fWidth) + f, (fHeight * 0.78f) + f2);
            float f15 = fWidth * 0.08f;
            canvas.drawRoundRect(rectF, f15, f15, paint);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(Math.max(1.0f, fWidth * 0.05f));
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f15, f15, paint);
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(248, 250, 252));
        rectF.set((0.22f * fWidth) + f, (0.14f * fHeight) + f2, (0.78f * fWidth) + f, (0.86f * fHeight) + f2);
        float f16 = 0.04f * fWidth;
        canvas.drawRoundRect(rectF, f16, f16, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Math.max(1.0f, fWidth * 0.045f));
        paint.setColor(Color.rgb(160, 170, 190));
        canvas.drawRoundRect(rectF, f16, f16, paint);
        paint.setColor(i2);
        float f17 = (0.34f * fWidth) + f;
        float f18 = (fHeight * 0.46f) + f2;
        canvas.drawLine(f17, f18, (0.66f * fWidth) + f, f18, paint);
        float f19 = (fHeight * 0.6f) + f2;
        canvas.drawLine(f17, f19, (fWidth * 0.62f) + f, f19, paint);
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
    public final void setAlpha(int i) {
        this.f533c.setAlpha(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f533c.setColorFilter(colorFilter);
    }
}
