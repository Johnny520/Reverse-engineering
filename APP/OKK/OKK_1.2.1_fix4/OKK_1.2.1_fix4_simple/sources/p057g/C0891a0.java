package p057g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: g.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0891a0 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public Drawable f3164a;

    /* JADX INFO: renamed from: b */
    public boolean f3165b;

    /* JADX INFO: renamed from: a */
    public final void m2225a(Canvas r2) {
        this.f3164a.draw(r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m2226b(float r2, float r3) {
        AbstractC1111a.m2623e(this.f3164a, r2, r3);
    }

    /* JADX INFO: renamed from: c */
    public final void m2227c(int r2, int r3, int r4, int r5) {
        AbstractC1111a.m2624f(this.f3164a, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2228d(boolean r2, boolean r3) {
        if (super.setVisible(r2, r3) == false) goto L5;
    L8:
        return true;
    L5:
        if (this.f3164a.setVisible(r2, r3) == true) goto L8;
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r2) {
        if (this.f3165b == false) goto L6;
        m2225a(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f3164a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f3164a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f3164a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f3164a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f3164a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f3164a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f3164a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r2) {
        return this.f3164a.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f3164a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f3164a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f3164a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f3164a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f3164a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        this.f3164a.setBounds(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
        return this.f3164a.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        this.f3164a.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        this.f3164a.setAutoMirrored(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r2) {
        this.f3164a.setChangingConfigurations(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.f3164a.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean r2) {
        this.f3164a.setDither(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r2) {
        this.f3164a.setFilterBitmap(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float r2, float r3) {
        if (this.f3165b == false) goto L6;
        m2226b(r2, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
        if (this.f3165b == false) goto L6;
        m2227c(r2, r3, r4, r5);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
        if (this.f3165b == true) goto L5;
        return false;
    L5:
        return this.f3164a.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        AbstractC1111a.m2625g(this.f3164a, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        AbstractC1111a.m2626h(this.f3164a, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r2) {
        AbstractC1111a.m2627i(this.f3164a, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        if (this.f3165b == true) goto L5;
        return false;
    L5:
        return m2228d(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        unscheduleSelf(r2);
    }
}
