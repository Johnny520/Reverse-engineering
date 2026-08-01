package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class ih extends Drawable implements Drawable.Callback {
    public Drawable a;
    public boolean b;

    public final void a(Canvas r2) {
        this.a.draw(r2);
    }

    public final void b(float r2, float r3) {
        ch.e(this.a, r2, r3);
    }

    public final void c(int r2, int r3, int r4, int r5) {
        ch.f(this.a, r2, r3, r4, r5);
    }

    public final boolean d(boolean r2, boolean r3) {
        if (super.setVisible(r2, r3) == false) goto L5;
        return true;
    L5:
        if (this.a.setVisible(r2, r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r2) {
        if (this.b == false) goto L6;
        a(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r2) {
        return this.a.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return bh.d(this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        this.a.setBounds(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
        return this.a.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        this.a.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        bh.e(this.a, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r2) {
        this.a.setChangingConfigurations(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.a.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean r2) {
        this.a.setDither(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r2) {
        this.a.setFilterBitmap(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float r2, float r3) {
        if (this.b == false) goto L6;
        b(r2, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
        if (this.b == false) goto L6;
        c(r2, r3, r4, r5);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
        if (this.b == true) goto L5;
        return false;
    L5:
        return this.a.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        ch.g(this.a, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        ch.h(this.a, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r2) {
        ch.i(this.a, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        if (this.b == true) goto L5;
        return false;
    L5:
        return d(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        unscheduleSelf(r2);
    }
}
