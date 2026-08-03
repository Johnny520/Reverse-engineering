package com.google.android.material.progressindicator;

import Yue.C6132;
import Yue.InterfaceC3897;
import Yue.InterfaceC4885;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    private float totalTrackLengthFraction;
    private float trackLength;
    private boolean useStrokeCap;

    public LinearDrawingDelegate(@InterfaceC6391 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    private void drawLine(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Paint paint, float f, float f2, @InterfaceC3897 int i, @InterfaceC6844 int i2, @InterfaceC6844 int i3) {
        float fM18837 = C6132.m18837(f, 0.0f, 1.0f);
        float fM188372 = C6132.m18837(f2, 0.0f, 1.0f);
        float fLerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fM18837);
        float fLerp2 = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fM188372);
        int iM18837 = (int) ((i2 * C6132.m18837(fLerp, 0.0f, 0.01f)) / 0.01f);
        int iM188372 = (int) ((i3 * (1.0f - C6132.m18837(fLerp2, 0.99f, 1.0f))) / 0.01f);
        float f3 = this.trackLength;
        int i4 = (int) ((fLerp * f3) + iM18837);
        int i5 = (int) ((fLerp2 * f3) - iM188372);
        float f4 = (-f3) / 2.0f;
        if (i4 <= i5) {
            float f5 = this.displayedCornerRadius;
            float f6 = i4 + f5;
            float f7 = i5 - f5;
            float f8 = f5 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            if (f6 >= f7) {
                drawRoundedBlock(canvas, paint, new PointF(f6 + f4, 0.0f), new PointF(f7 + f4, 0.0f), f8, this.displayedTrackThickness);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f9 = f6 + f4;
            float f10 = f7 + f4;
            canvas.drawLine(f9, 0.0f, f10, 0.0f, paint);
            if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f6 > 0.0f) {
                drawRoundedBlock(canvas, paint, new PointF(f9, 0.0f), f8, this.displayedTrackThickness);
            }
            if (f7 < this.trackLength) {
                drawRoundedBlock(canvas, paint, new PointF(f10, 0.0f), f8, this.displayedTrackThickness);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void drawRoundedBlock(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Paint paint, @InterfaceC6391 PointF pointF, float f, float f2) {
        drawRoundedBlock(canvas, paint, pointF, null, f, f2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f, boolean z, boolean z2) {
        this.trackLength = rect.width();
        float f2 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - f2) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f3 = this.trackLength / 2.0f;
        float f4 = f2 / 2.0f;
        canvas.clipRect(-f3, -f4, f3, f4);
        S s = this.spec;
        this.useStrokeCap = ((LinearProgressIndicatorSpec) s).trackThickness / 2 == ((LinearProgressIndicatorSpec) s).trackCornerRadius;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s).trackThickness * f;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s).trackThickness / 2, ((LinearProgressIndicatorSpec) s).trackCornerRadius) * f;
        if (z || z2) {
            if ((z && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z2 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (1.0f - f)) / 2.0f);
            }
        }
        if (z2 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Paint paint, @InterfaceC3897 int i, @InterfaceC5459(from = 0, m2228to = 255) int i2) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i2);
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        PointF pointF = new PointF((this.trackLength / 2.0f) - (this.displayedTrackThickness / 2.0f), 0.0f);
        S s = this.spec;
        drawRoundedBlock(canvas, paint, pointF, ((LinearProgressIndicatorSpec) s).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s).trackStopIndicatorSize);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Paint paint, @InterfaceC6391 DrawingDelegate.ActiveIndicator activeIndicator, int i) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i);
        float f = activeIndicator.startFraction;
        float f2 = activeIndicator.endFraction;
        int i2 = activeIndicator.gapSize;
        drawLine(canvas, paint, f, f2, iCompositeARGBWithAlpha, i2, i2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Paint paint, float f, float f2, int i, int i2, @InterfaceC6844 int i3) {
        drawLine(canvas, paint, f, f2, MaterialColors.compositeARGBWithAlpha(i, i2), i3, i3);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private void drawRoundedBlock(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Paint paint, @InterfaceC6391 PointF pointF, @InterfaceC6490 PointF pointF2, float f, float f2) {
        float fMin = Math.min(f2, this.displayedTrackThickness);
        float f3 = f / 2.0f;
        float fMin2 = Math.min(f3, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f3, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
