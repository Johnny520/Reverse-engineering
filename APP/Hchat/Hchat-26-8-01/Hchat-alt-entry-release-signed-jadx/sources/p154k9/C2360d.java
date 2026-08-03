package p154k9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import okio.C3193a;

/* JADX INFO: renamed from: k9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2360d extends Drawable {

    /* JADX INFO: renamed from: a */
    public final EnumC2359c f7757a;

    /* JADX INFO: renamed from: b */
    public final Paint f7758b;

    /* JADX INFO: renamed from: c */
    public final Path f7759c;

    /* JADX INFO: renamed from: d */
    public final RectF f7760d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2360d(EnumC2359c enumC2359c, int i9) {
        this.f7757a = enumC2359c;
        Paint paint = new Paint(5);
        paint.setColor(i9);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f7758b = paint;
        this.f7759c = new Path();
        this.f7760d = new RectF();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.getClass();
        float fMin = Math.min(getBounds().width(), getBounds().height());
        if (fMin <= 0.0f) {
            return;
        }
        float f3 = fMin / 2.0f;
        float fExactCenterX = getBounds().exactCenterX() - f3;
        float fExactCenterY = getBounds().exactCenterY() - f3;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f7758b;
        paint.setStyle(style);
        paint.setStrokeWidth(0.065f * fMin);
        Path path = this.f7759c;
        path.reset();
        int iOrdinal = this.f7757a.ordinal();
        RectF rectF = this.f7760d;
        switch (iOrdinal) {
            case 0:
                paint.setStyle(Paint.Style.FILL);
                float f10 = fMin * 0.18f;
                float f11 = fMin * 0.11f;
                float f12 = ((f10 * 2.0f) + f11) / 2.0f;
                float fExactCenterX2 = getBounds().exactCenterX() - f12;
                float fExactCenterY2 = getBounds().exactCenterY() - f12;
                for (int i9 = 0; i9 < 2; i9++) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        float f13 = f10 + f11;
                        float f14 = (i10 * f13) + fExactCenterX2;
                        float f15 = (i9 * f13) + fExactCenterY2;
                        Paint paint2 = paint;
                        float f16 = f10 * 0.28f;
                        canvas.drawRoundRect(f14, f15, f14 + f10, f15 + f10, f16, f16, paint2);
                        paint = paint2;
                    }
                }
                break;
            case 1:
                float fExactCenterX3 = getBounds().exactCenterX();
                float fExactCenterY3 = getBounds().exactCenterY();
                canvas2.drawCircle(fExactCenterX3, fExactCenterY3, 0.29f * fMin, paint);
                canvas2.drawCircle(fExactCenterX3, fExactCenterY3, 0.105f * fMin, paint);
                int i11 = 0;
                while (i11 < 8) {
                    double d10 = (((double) i11) * 3.141592653589793d) / 4.0d;
                    canvas2.drawLine((((float) Math.cos(d10)) * fMin * 0.34f) + fExactCenterX3, (((float) Math.sin(d10)) * fMin * 0.34f) + fExactCenterY3, (((float) Math.cos(d10)) * fMin * 0.43f) + fExactCenterX3, (((float) Math.sin(d10)) * fMin * 0.43f) + fExactCenterY3, paint);
                    i11++;
                    canvas2 = canvas;
                }
                break;
            case 2:
                float f17 = 0.36f * fMin;
                float f18 = f17 + fExactCenterX;
                float f19 = 0.17f * fMin;
                float f20 = f19 + fExactCenterY;
                path.moveTo(f18, f20);
                float f21 = f19 + fExactCenterX;
                path.lineTo(f21, f20);
                float f22 = f17 + fExactCenterY;
                path.lineTo(f21, f22);
                float f23 = 0.64f * fMin;
                float f24 = f23 + fExactCenterX;
                path.moveTo(f24, f20);
                float f25 = 0.83f * fMin;
                float f26 = f25 + fExactCenterX;
                path.lineTo(f26, f20);
                path.lineTo(f26, f22);
                float f27 = f23 + fExactCenterY;
                path.moveTo(f21, f27);
                float f28 = f25 + fExactCenterY;
                path.lineTo(f21, f28);
                path.lineTo(f18, f28);
                path.moveTo(f26, f27);
                path.lineTo(f26, f28);
                path.lineTo(f24, f28);
                canvas2.drawPath(path, paint);
                float f29 = (0.5f * fMin) + fExactCenterY;
                canvas2.drawLine((fMin * 0.28f) + fExactCenterX, f29, (fMin * 0.72f) + fExactCenterX, f29, paint);
                break;
            case 3:
                float fExactCenterX4 = getBounds().exactCenterX();
                float fExactCenterY4 = getBounds().exactCenterY();
                float f30 = 0.16f * fMin;
                float f31 = 0.84f * fMin;
                rectF.set(f30 + fExactCenterX, f30 + fExactCenterY, f31 + fExactCenterX, f31 + fExactCenterY);
                paint.setStyle(style);
                paint.setStrokeWidth(0.09f * fMin);
                for (int i12 = 0; i12 < 6; i12++) {
                    canvas2.drawArc(rectF, (-87.0f) + (i12 * 60.0f), 54.0f, false, paint);
                    double radians = Math.toRadians(17.0f + r3);
                    double radians2 = Math.toRadians(r3 + 52.0f);
                    canvas2 = canvas;
                    canvas2.drawLine((((float) Math.cos(radians)) * fMin * 0.13f) + fExactCenterX4, (((float) Math.sin(radians)) * fMin * 0.13f) + fExactCenterY4, (((float) Math.cos(radians2)) * fMin * 0.31f) + fExactCenterX4, (((float) Math.sin(radians2)) * fMin * 0.31f) + fExactCenterY4, paint);
                }
                paint.setStrokeWidth(fMin * 0.06f);
                canvas2.drawCircle(fExactCenterX4, fExactCenterY4, fMin * 0.12f, paint);
                break;
            case 4:
                rectF.set((0.14f * fMin) + fExactCenterX, (0.23f * fMin) + fExactCenterY, (0.86f * fMin) + fExactCenterX, (0.77f * fMin) + fExactCenterY);
                float f32 = fMin * 0.13f;
                canvas2.drawRoundRect(rectF, f32, f32, paint);
                paint.setStyle(Paint.Style.FILL);
                float f33 = (0.43f * fMin) + fExactCenterX;
                path.moveTo(f33, (0.36f * fMin) + fExactCenterY);
                path.lineTo(f33, (0.64f * fMin) + fExactCenterY);
                path.lineTo((0.67f * fMin) + fExactCenterX, (fMin * 0.5f) + fExactCenterY);
                path.close();
                canvas2.drawPath(path, paint);
                break;
            case 5:
                paint.setStyle(Paint.Style.FILL);
                float fExactCenterX5 = getBounds().exactCenterX();
                float fExactCenterY5 = (0.02f * fMin) + getBounds().exactCenterY();
                for (int i13 = 0; i13 < 10; i13++) {
                    float f34 = i13 % 2 == 0 ? 0.37f * fMin : fMin * 0.17f;
                    double d11 = ((((double) i13) * 3.141592653589793d) / 5.0d) - 1.5707963267948966d;
                    float fCos = (((float) Math.cos(d11)) * f34) + fExactCenterX5;
                    float fSin = (((float) Math.sin(d11)) * f34) + fExactCenterY5;
                    if (i13 == 0) {
                        path.moveTo(fCos, fSin);
                    } else {
                        path.lineTo(fCos, fSin);
                    }
                }
                path.close();
                canvas2.drawPath(path, paint);
                break;
            case 6:
                float f35 = (0.27f * fMin) + fExactCenterY;
                rectF.set((0.14f * fMin) + fExactCenterX, f35, (0.84f * fMin) + fExactCenterX, (0.76f * fMin) + fExactCenterY);
                float f36 = 0.1f * fMin;
                canvas2.drawRoundRect(rectF, f36, f36, paint);
                canvas2.drawLine((0.23f * fMin) + fExactCenterX, f35, (0.67f * fMin) + fExactCenterX, (0.17f * fMin) + fExactCenterY, paint);
                rectF.set((0.58f * fMin) + fExactCenterX, (0.42f * fMin) + fExactCenterY, (0.88f * fMin) + fExactCenterX, (0.62f * fMin) + fExactCenterY);
                float f37 = fMin * 0.06f;
                canvas2.drawRoundRect(rectF, f37, f37, paint);
                paint.setStyle(Paint.Style.FILL);
                canvas2.drawCircle((0.68f * fMin) + fExactCenterX, (0.52f * fMin) + fExactCenterY, fMin * 0.025f, paint);
                break;
            case 7:
                float f38 = (0.2f * fMin) + fExactCenterY;
                path.moveTo((0.55f * fMin) + fExactCenterX, f38);
                float f39 = (0.8f * fMin) + fExactCenterX;
                path.lineTo(f39, f38);
                path.lineTo(f39, (0.45f * fMin) + fExactCenterY);
                path.moveTo((0.79f * fMin) + fExactCenterX, (0.21f * fMin) + fExactCenterY);
                path.lineTo((0.46f * fMin) + fExactCenterX, (0.54f * fMin) + fExactCenterY);
                float f40 = (0.67f * fMin) + fExactCenterX;
                path.moveTo(f40, (0.44f * fMin) + fExactCenterY);
                float f41 = (0.75f * fMin) + fExactCenterY;
                path.lineTo(f40, f41);
                float f42 = (0.22f * fMin) + fExactCenterX;
                path.lineTo(f42, f41);
                float f43 = (0.3f * fMin) + fExactCenterY;
                path.lineTo(f42, f43);
                path.lineTo((fMin * 0.53f) + fExactCenterX, f43);
                canvas2.drawPath(path, paint);
                break;
            default:
                C3193a.m6822k();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.f7758b.setAlpha(i9);
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7758b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
