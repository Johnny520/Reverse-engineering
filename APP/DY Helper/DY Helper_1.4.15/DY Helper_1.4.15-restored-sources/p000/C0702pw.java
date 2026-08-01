package p000;

/* JADX INFO: renamed from: pw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0702pw extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* JADX INFO: renamed from: ε */
    public android.graphics.drawable.Drawable f8740;

    /* JADX INFO: renamed from: ζ */
    public boolean f8741;

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r2) {
            r1 = this;
            boolean r0 = r1.f8741
            if (r0 == 0) goto L7
            r1.m4642(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable getCurrent() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            boolean r0 = r0.getPadding(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            int[] r0 = r0.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setBounds(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            boolean r0 = r0.setLevel(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setAlpha(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setAutoMirrored(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setChangingConfigurations(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setColorFilter(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setDither(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setFilterBitmap(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.f8741
            if (r0 == 0) goto L7
            r1.m4643(r2, r3)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.f8741
            if (r0 == 0) goto L7
            r1.m4644(r2, r3, r4, r5)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
            r1 = this;
            boolean r0 = r1.f8741
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r1 = r1.f8740
            boolean r1 = r1.setState(r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setTint(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setTintMode(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.f8741
            if (r0 == 0) goto L9
            boolean r1 = r1.m4645(r2, r3)
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            r0.unscheduleSelf(r2)
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m4642(android.graphics.Canvas r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.draw(r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m4643(float r1, float r2) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setHotspot(r1, r2)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m4644(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f8740
            r0.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m4645(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = super.setVisible(r2, r3)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r1 = r1.f8740
            boolean r1 = r1.setVisible(r2, r3)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }
}
