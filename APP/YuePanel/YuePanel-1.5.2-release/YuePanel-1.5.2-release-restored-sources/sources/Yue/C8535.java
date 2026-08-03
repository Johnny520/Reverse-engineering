package Yue;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8535 extends Drawable implements Drawable.Callback, InterfaceC8534, InterfaceC7833 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final PorterDuff.Mode f25356 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f25357;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public PorterDuff.Mode f25358;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f25359;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C8537 f25360;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f25361;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Drawable f25362;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8535(@InterfaceC6391 C8537 c8537, @InterfaceC6490 Resources resources) {
        this.f25360 = c8537;
        m28405(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC6391 Canvas canvas) {
        this.f25362.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C8537 c8537 = this.f25360;
        return changingConfigurations | (c8537 != null ? c8537.getChangingConfigurations() : 0) | this.f25362.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC6490
    public Drawable.ConstantState getConstantState() {
        C8537 c8537 = this.f25360;
        if (c8537 == null || !c8537.m4523()) {
            return null;
        }
        this.f25360.f3544 = getChangingConfigurations();
        return this.f25360;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC6391
    public Drawable getCurrent() {
        return this.f25362.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f25362.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f25362.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC7113(23)
    public int getLayoutDirection() {
        return C4520.m13227(this.f25362);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f25362.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f25362.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f25362.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@InterfaceC6391 Rect rect) {
        return this.f25362.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC6391
    public int[] getState() {
        return this.f25362.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f25362.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@InterfaceC6391 Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C4520.m13229(this.f25362);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C8537 c8537;
        ColorStateList colorStateList = (!mo28403() || (c8537 = this.f25360) == null) ? null : c8537.f25365;
        return (colorStateList != null && colorStateList.isStateful()) || this.f25362.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f25362.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC6391
    public Drawable mutate() {
        if (!this.f25361 && super.mutate() == this) {
            this.f25360 = m28404();
            Drawable drawable = this.f25362;
            if (drawable != null) {
                drawable.mutate();
            }
            C8537 c8537 = this.f25360;
            if (c8537 != null) {
                Drawable drawable2 = this.f25362;
                c8537.f3545 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f25361 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25362;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC7113(23)
    public boolean onLayoutDirectionChanged(int i) {
        return C4520.m13234(this.f25362, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f25362.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f25362.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        C4520.m13231(this.f25362, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f25362.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25362.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f25362.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f25362.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@InterfaceC6391 int[] iArr) {
        return m28406(iArr) || this.f25362.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintList(ColorStateList colorStateList) {
        this.f25360.f25365 = colorStateList;
        m28406(getState());
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintMode(@InterfaceC6391 PorterDuff.Mode mode) {
        this.f25360.f25366 = mode;
        m28406(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f25362.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // Yue.InterfaceC8534
    /* JADX INFO: renamed from: ۥ */
    public final void mo4521(Drawable drawable) {
        Drawable drawable2 = this.f25362;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f25362 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C8537 c8537 = this.f25360;
            if (c8537 != null) {
                c8537.f3545 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // Yue.InterfaceC8534
    /* JADX INFO: renamed from: ۥ۟ */
    public final Drawable mo4522() {
        return this.f25362;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo28403() {
        return true;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C8537 m28404() {
        return new C8537(this.f25360);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28405(@InterfaceC6490 Resources resources) {
        Drawable.ConstantState constantState;
        C8537 c8537 = this.f25360;
        if (c8537 == null || (constantState = c8537.f3545) == null) {
            return;
        }
        mo4521(constantState.newDrawable(resources));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m28406(int[] iArr) {
        if (!mo28403()) {
            return false;
        }
        C8537 c8537 = this.f25360;
        ColorStateList colorStateList = c8537.f25365;
        PorterDuff.Mode mode = c8537.f25366;
        if (colorStateList == null || mode == null) {
            this.f25359 = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f25359 || colorForState != this.f25357 || mode != this.f25358) {
                setColorFilter(colorForState, mode);
                this.f25357 = colorForState;
                this.f25358 = mode;
                this.f25359 = true;
                return true;
            }
        }
        return false;
    }

    public C8535(@InterfaceC6490 Drawable drawable) {
        this.f25360 = m28404();
        mo4521(drawable);
    }
}
