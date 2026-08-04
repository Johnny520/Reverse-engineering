package yyds;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: renamed from: yyds.ᛸᛸᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1846 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public float f9305;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ValueAnimator f9306;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Paint f9307;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final RectF f9308;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0477 f9309;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Path f9310;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Paint f9311;

    public C1846(int i, int i2, InterfaceC0477 interfaceC0477) {
        this.f9309 = interfaceC0477;
        Paint paint = new Paint(1);
        paint.setColor(i);
        this.f9311 = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(i2);
        this.f9307 = paint2;
        this.f9310 = new Path();
        this.f9308 = new RectF();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1150L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C2405(2, this));
        this.f9306 = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC2328.m4341(-130639593112430L);
        Rect bounds = getBounds();
        AbstractC2328.m4341(-130669657883502L);
        if (bounds.isEmpty()) {
            return;
        }
        float fHeight = bounds.height();
        float fWidth = bounds.width();
        float f = fHeight / 2.0f;
        canvas.drawRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, f, f, this.f9311);
        float f2 = 0.35f * fWidth;
        float f3 = (this.f9305 * (fWidth + f2)) + (bounds.left - f2);
        float f4 = f3 + f2;
        int iSave = canvas.save();
        canvas.clipPath(this.f9310);
        canvas.drawRoundRect(f3, bounds.top, f4, bounds.bottom, f, f, this.f9307);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9306.isStarted();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        AbstractC2328.m4341(-130609528341358L);
        super.onBoundsChange(rect);
        float fHeight = rect.height() / 2.0f;
        Path path = this.f9310;
        path.reset();
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.f9308;
        rectF.set(f, f2, f3, f4);
        path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f9311.setAlpha(i);
        this.f9307.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9311.setColorFilter(colorFilter);
        this.f9307.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.f9306;
        if (valueAnimator.isStarted()) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f9306.cancel();
        InterfaceC0477 interfaceC0477 = this.f9309;
        if (interfaceC0477 != null) {
            interfaceC0477.mo511(Float.valueOf(AbstractC0598.m1483(this.f9305, 0.0f, 1.0f)), Boolean.FALSE);
        }
    }
}
