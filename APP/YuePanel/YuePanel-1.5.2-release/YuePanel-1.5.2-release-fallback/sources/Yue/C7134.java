package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7134 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, Yue.InterfaceC7133, Yue.InterfaceC6260 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final android.graphics.PorterDuff.Mode f24662 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f24663;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f24664;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f24665;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Yue.C7136 f24666;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f24667;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f24668;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            Yue.C7134.f24662 = r0
            return
    }

    public C7134(@Yue.InterfaceC4410 Yue.C7136 r1, @Yue.InterfaceC4544 android.content.res.Resources r2) {
            r0 = this;
            r0.<init>()
            r0.f24666 = r1
            r0.m27465(r2)
            return
    }

    public C7134(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.<init>()
            Yue.ۥۢۦ۠ۢ r0 = r1.m27464()
            r1.f24666 = r0
            r1.mo27461(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@Yue.InterfaceC4410 android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.draw(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            Yue.ۥۢۦ۠ۢ r1 = r2.f24666
            if (r1 == 0) goto Ld
            int r1 = r1.getChangingConfigurations()
            goto Le
        Ld:
            r1 = 0
        Le:
            r0 = r0 | r1
            android.graphics.drawable.Drawable r1 = r2.f24668
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC4544
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            Yue.ۥۢۦ۠ۢ r0 = r2.f24666
            if (r0 == 0) goto L15
            boolean r0 = r0.m27468()
            if (r0 == 0) goto L15
            Yue.ۥۢۦ۠ۢ r0 = r2.f24666
            int r1 = r2.getChangingConfigurations()
            r0.f24671 = r1
            Yue.ۥۢۦ۠ۢ r0 = r2.f24666
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC4410
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC5336(23)
    public int getLayoutDirection() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            int r0 = Yue.C1995.m9223(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@Yue.InterfaceC4410 android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            boolean r2 = r0.getPadding(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC4410
    public int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            int[] r0 = r0.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            boolean r0 = Yue.C1995.m9225(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = r1.mo27463()
            if (r0 == 0) goto Ld
            Yue.ۥۢۦ۠ۢ r0 = r1.f24666
            if (r0 == 0) goto Ld
            android.content.res.ColorStateList r0 = r0.f24673
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1e
        L16:
            android.graphics.drawable.Drawable r0 = r1.f24668
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L20
        L1e:
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC4410
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            boolean r0 = r2.f24667
            if (r0 != 0) goto L2a
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L2a
            Yue.ۥۢۦ۠ۢ r0 = r2.m27464()
            r2.f24666 = r0
            android.graphics.drawable.Drawable r0 = r2.f24668
            if (r0 == 0) goto L17
            r0.mutate()
        L17:
            Yue.ۥۢۦ۠ۢ r0 = r2.f24666
            if (r0 == 0) goto L27
            android.graphics.drawable.Drawable r1 = r2.f24668
            if (r1 == 0) goto L24
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            goto L25
        L24:
            r1 = 0
        L25:
            r0.f24672 = r1
        L27:
            r0 = 1
            r2.f24667 = r0
        L2a:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC5336(23)
    public boolean onLayoutDirectionChanged(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            boolean r2 = Yue.C1995.m9230(r0, r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            boolean r2 = r0.setLevel(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4410 java.lang.Runnable r2, long r3) {
            r0 = this;
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            Yue.C1995.m9227(r0, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setDither(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setFilterBitmap(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@Yue.InterfaceC4410 int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            boolean r0 = r0.setState(r2)
            boolean r2 = r1.m27466(r2)
            if (r2 != 0) goto L11
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥۢۦ۠ۢ r0 = r1.f24666
            r0.f24673 = r2
            int[] r2 = r1.getState()
            r1.m27466(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintMode(@Yue.InterfaceC4410 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥۢۦ۠ۢ r0 = r1.f24666
            r0.f24674 = r2
            int[] r2 = r1.getState()
            r1.m27466(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = super.setVisible(r2, r3)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.f24668
            boolean r2 = r0.setVisible(r2, r3)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4410 java.lang.Runnable r2) {
            r0 = this;
            r0.unscheduleSelf(r2)
            return
    }

    @Override // Yue.InterfaceC7133
    /* JADX INFO: renamed from: ۥ */
    public final void mo27461(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24668
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f24668 = r3
            if (r3 == 0) goto L36
            r3.setCallback(r2)
            boolean r0 = r3.isVisible()
            r1 = 1
            r2.setVisible(r0, r1)
            int[] r0 = r3.getState()
            r2.setState(r0)
            int r0 = r3.getLevel()
            r2.setLevel(r0)
            android.graphics.Rect r0 = r3.getBounds()
            r2.setBounds(r0)
            Yue.ۥۢۦ۠ۢ r0 = r2.f24666
            if (r0 == 0) goto L36
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            r0.f24672 = r3
        L36:
            r2.invalidateSelf()
            return
    }

    @Override // Yue.InterfaceC7133
    /* JADX INFO: renamed from: ۥ۟ */
    public final android.graphics.drawable.Drawable mo27462() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo27463() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C7136 m27464() {
            r2 = this;
            Yue.ۥۢۦ۠ۢ r0 = new Yue.ۥۢۦ۠ۢ
            Yue.ۥۢۦ۠ۢ r1 = r2.f24666
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m27465(@Yue.InterfaceC4544 android.content.res.Resources r2) {
            r1 = this;
            Yue.ۥۢۦ۠ۢ r0 = r1.f24666
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable$ConstantState r0 = r0.f24672
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable r2 = r0.newDrawable(r2)
            r1.mo27461(r2)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m27466(int[] r5) {
            r4 = this;
            boolean r0 = r4.mo27463()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            Yue.ۥۢۦ۠ۢ r0 = r4.f24666
            android.content.res.ColorStateList r2 = r0.f24673
            android.graphics.PorterDuff$Mode r0 = r0.f24674
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
            int r3 = r2.getDefaultColor()
            int r5 = r2.getColorForState(r5, r3)
            boolean r2 = r4.f24665
            if (r2 == 0) goto L26
            int r2 = r4.f24663
            if (r5 != r2) goto L26
            android.graphics.PorterDuff$Mode r2 = r4.f24664
            if (r0 == r2) goto L36
        L26:
            r4.setColorFilter(r5, r0)
            r4.f24663 = r5
            r4.f24664 = r0
            r5 = 1
            r4.f24665 = r5
            return r5
        L31:
            r4.f24665 = r1
            r4.clearColorFilter()
        L36:
            return r1
    }
}
