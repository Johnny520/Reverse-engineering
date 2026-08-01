package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class v80 extends Drawable {
    public Drawable a;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ch.a(r0, r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.clearColorFilter();
        return;
    L6:
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getCurrent();
    L7:
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getMinimumHeight();
    L7:
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getMinimumWidth();
    L7:
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getPadding(r2);
    L7:
        return super.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getState();
    L7:
        return super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getTransparentRegion();
    L7:
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.jumpToCurrentState();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.setLevel(r2);
    L7:
        return super.onLevelChange(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.setChangingConfigurations(r2);
        return;
    L6:
        super.setChangingConfigurations(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int r2, PorterDuff.Mode r3) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.setColorFilter(r2, r3);
        return;
    L6:
        super.setColorFilter(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.setFilterBitmap(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float r2, float r3) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ch.e(r0, r2, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ch.f(r0, r2, r3, r4, r5);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.setState(r2);
    L7:
        return super.setState(r2);
    }
}
