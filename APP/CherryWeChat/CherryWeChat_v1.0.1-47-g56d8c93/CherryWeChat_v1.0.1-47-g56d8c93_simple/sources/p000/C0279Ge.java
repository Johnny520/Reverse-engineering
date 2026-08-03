package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Ge */
/* JADX INFO: loaded from: classes.dex */
public final class C0279Ge extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public Drawable f905a;

    /* JADX INFO: renamed from: b */
    public boolean f906b;

    /* JADX INFO: renamed from: a */
    public final void m560a(Canvas r2) {
        this.f905a.draw(r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m561b(float r2, float r3) {
        this.f905a.setHotspot(r2, r3);
    }

    /* JADX INFO: renamed from: c */
    public final void m562c(int r2, int r3, int r4, int r5) {
        this.f905a.setHotspotBounds(r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m563d(boolean r2, boolean r3) {
        if (super.setVisible(r2, r3) == false) goto L5;
        return true;
    L5:
        if (this.f905a.setVisible(r2, r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r2) {
        if (this.f906b == false) goto L6;
        m560a(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f905a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f905a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f905a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f905a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f905a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f905a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f905a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r2) {
        return this.f905a.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f905a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f905a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f905a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f905a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f905a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        this.f905a.setBounds(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
        return this.f905a.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        this.f905a.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        this.f905a.setAutoMirrored(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r2) {
        this.f905a.setChangingConfigurations(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.f905a.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean r2) {
        this.f905a.setDither(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r2) {
        this.f905a.setFilterBitmap(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float r2, float r3) {
        if (this.f906b == false) goto L6;
        m561b(r2, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
        if (this.f906b == false) goto L6;
        m562c(r2, r3, r4, r5);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
        if (this.f906b == true) goto L5;
        return false;
    L5:
        return this.f905a.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        this.f905a.setTint(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        this.f905a.setTintList(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r2) {
        this.f905a.setTintMode(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        if (this.f906b == true) goto L5;
        return false;
    L5:
        return m563d(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        unscheduleSelf(r2);
    }
}
