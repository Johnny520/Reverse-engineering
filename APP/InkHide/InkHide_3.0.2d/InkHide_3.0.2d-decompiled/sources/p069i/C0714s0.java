package p069i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p087s.AbstractC0962a;

/* JADX INFO: renamed from: i.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0714s0 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: b */
    public Drawable f2415b;

    /* JADX INFO: renamed from: c */
    public boolean f2416c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1344a(Canvas canvas) {
        this.f2415b.draw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1345b(float f, float f2) {
        AbstractC0962a.m2140e(this.f2415b, f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1346c(int i2, int i3, int i4, int i5) {
        AbstractC0962a.m2141f(this.f2415b, i2, i3, i4, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1347d(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f2415b.setVisible(z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f2416c) {
            m1344a(canvas);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f2415b.getChangingConfigurations();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f2415b.getCurrent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2415b.getIntrinsicHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2415b.getIntrinsicWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f2415b.getMinimumHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f2415b.getMinimumWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f2415b.getOpacity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f2415b.getPadding(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f2415b.getState();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f2415b.getTransparentRegion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f2415b.isAutoMirrored();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f2415b.isStateful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f2415b.jumpToCurrentState();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f2415b.setBounds(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        return this.f2415b.setLevel(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f2415b.setAlpha(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f2415b.setAutoMirrored(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i2) {
        this.f2415b.setChangingConfigurations(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2415b.setColorFilter(colorFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f2415b.setDither(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f2415b.setFilterBitmap(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f2416c) {
            m1345b(f, f2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        if (this.f2416c) {
            m1346c(i2, i3, i4, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f2416c) {
            return this.f2415b.setState(iArr);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        AbstractC0962a.m2142g(this.f2415b, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC0962a.m2143h(this.f2415b, colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC0962a.m2144i(this.f2415b, mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        if (this.f2416c) {
            return m1347d(z2, z3);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
