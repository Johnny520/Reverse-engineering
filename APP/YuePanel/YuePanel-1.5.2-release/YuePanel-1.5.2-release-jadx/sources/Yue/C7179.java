package Yue;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public class C7179 extends Drawable {

    /* JADX INFO: renamed from: ۥ */
    public float f2715;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final RectF f21638;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Rect f21639;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f21640;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public ColorStateList f21643;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public PorterDuffColorFilter f21644;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public ColorStateList f21645;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f21641 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f21642 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public PorterDuff.Mode f21646 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥ۟ */
    public final Paint f2716 = new Paint(5);

    public C7179(ColorStateList colorStateList, float f) {
        this.f2715 = f;
        m22461(colorStateList);
        this.f21638 = new RectF();
        this.f21639 = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f2716;
        if (this.f21644 == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f21644);
            z = true;
        }
        RectF rectF = this.f21638;
        float f = this.f2715;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f21639, this.f2715);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f21645;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f21643) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m22465(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f21643;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f2716.getColor();
        if (z) {
            this.f2716.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f21645;
        if (colorStateList2 == null || (mode = this.f21646) == null) {
            return z;
        }
        this.f21644 = m3460(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2716.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2716.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f21645 = colorStateList;
        this.f21644 = m3460(colorStateList, this.f21646);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f21646 = mode;
        this.f21644 = m3460(this.f21645, mode);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ */
    public final PorterDuffColorFilter m3460(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public ColorStateList m3461() {
        return this.f21643;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m22459() {
        return this.f21640;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m22460() {
        return this.f2715;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m22461(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f21643 = colorStateList;
        this.f2716.setColor(colorStateList.getColorForState(getState(), this.f21643.getDefaultColor()));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m22462(@InterfaceC6490 ColorStateList colorStateList) {
        m22461(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m22463(float f, boolean z, boolean z2) {
        if (f == this.f21640 && this.f21641 == z && this.f21642 == z2) {
            return;
        }
        this.f21640 = f;
        this.f21641 = z;
        this.f21642 = z2;
        m22465(null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m22464(float f) {
        if (f == this.f2715) {
            return;
        }
        this.f2715 = f;
        m22465(null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m22465(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f21638.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f21639.set(rect);
        if (this.f21641) {
            this.f21639.inset((int) Math.ceil(C7180.m22466(this.f21640, this.f2715, this.f21642)), (int) Math.ceil(C7180.m22467(this.f21640, this.f2715, this.f21642)));
            this.f21638.set(this.f21639);
        }
    }
}
