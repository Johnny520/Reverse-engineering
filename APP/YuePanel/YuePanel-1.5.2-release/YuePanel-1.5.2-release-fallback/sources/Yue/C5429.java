package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public class C5429 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float f20115;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.graphics.Paint f20116;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.graphics.RectF f20117;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final android.graphics.Rect f20118;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f20119;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f20120;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f20121;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public android.content.res.ColorStateList f20122;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public android.graphics.PorterDuffColorFilter f20123;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public android.content.res.ColorStateList f20124;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f20125;

    public C5429(android.content.res.ColorStateList r2, float r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f20120 = r0
            r0 = 1
            r1.f20121 = r0
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.f20125 = r0
            r1.f20115 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r0 = 5
            r3.<init>(r0)
            r1.f20116 = r3
            r1.m20461(r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.f20117 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f20118 = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.f20116
            android.graphics.PorterDuffColorFilter r1 = r4.f20123
            if (r1 == 0) goto L13
            android.graphics.ColorFilter r1 = r0.getColorFilter()
            if (r1 != 0) goto L13
            android.graphics.PorterDuffColorFilter r1 = r4.f20123
            r0.setColorFilter(r1)
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            android.graphics.RectF r2 = r4.f20117
            float r3 = r4.f20115
            r5.drawRoundRect(r2, r3, r3, r0)
            if (r1 == 0) goto L21
            r5 = 0
            r0.setColorFilter(r5)
        L21:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.f20118
            float r1 = r2.f20115
            r3.setRoundRect(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f20124
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        La:
            android.content.res.ColorStateList r0 = r1.f20122
            if (r0 == 0) goto L14
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        L14:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r0.m20465(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f20122
            int r1 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r1)
            android.graphics.Paint r0 = r3.f20116
            int r0 = r0.getColor()
            r1 = 1
            if (r4 == r0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1d
            android.graphics.Paint r2 = r3.f20116
            r2.setColor(r4)
        L1d:
            android.content.res.ColorStateList r4 = r3.f20124
            if (r4 == 0) goto L2c
            android.graphics.PorterDuff$Mode r2 = r3.f20125
            if (r2 == 0) goto L2c
            android.graphics.PorterDuffColorFilter r4 = r3.m20457(r4, r2)
            r3.f20123 = r4
            return r1
        L2c:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20116
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20116
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f20124 = r2
            android.graphics.PorterDuff$Mode r0 = r1.f20125
            android.graphics.PorterDuffColorFilter r2 = r1.m20457(r2, r0)
            r1.f20123 = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.f20125 = r2
            android.content.res.ColorStateList r0 = r1.f20124
            android.graphics.PorterDuffColorFilter r2 = r1.m20457(r0, r2)
            r1.f20123 = r2
            r1.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.PorterDuffColorFilter m20457(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r2 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L14:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.content.res.ColorStateList m20458() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f20122
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m20459() {
            r1 = this;
            float r0 = r1.f20119
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m20460() {
            r1 = this;
            float r0 = r1.f20115
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m20461(android.content.res.ColorStateList r4) {
            r3 = this;
            if (r4 != 0) goto L7
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L7:
            r3.f20122 = r4
            android.graphics.Paint r0 = r3.f20116
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.f20122
            int r2 = r2.getDefaultColor()
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m20462(@Yue.InterfaceC4544 android.content.res.ColorStateList r1) {
            r0 = this;
            r0.m20461(r1)
            r0.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m20463(float r2, boolean r3, boolean r4) {
            r1 = this;
            float r0 = r1.f20119
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            boolean r0 = r1.f20120
            if (r0 != r3) goto Lf
            boolean r0 = r1.f20121
            if (r0 != r4) goto Lf
            return
        Lf:
            r1.f20119 = r2
            r1.f20120 = r3
            r1.f20121 = r4
            r2 = 0
            r1.m20465(r2)
            r1.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m20464(float r2) {
            r1 = this;
            float r0 = r1.f20115
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            r1.f20115 = r2
            r2 = 0
            r1.m20465(r2)
            r1.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m20465(android.graphics.Rect r6) {
            r5 = this;
            if (r6 != 0) goto L6
            android.graphics.Rect r6 = r5.getBounds()
        L6:
            android.graphics.RectF r0 = r5.f20117
            int r1 = r6.left
            float r1 = (float) r1
            int r2 = r6.top
            float r2 = (float) r2
            int r3 = r6.right
            float r3 = (float) r3
            int r4 = r6.bottom
            float r4 = (float) r4
            r0.set(r1, r2, r3, r4)
            android.graphics.Rect r0 = r5.f20118
            r0.set(r6)
            boolean r6 = r5.f20120
            if (r6 == 0) goto L4c
            float r6 = r5.f20119
            float r0 = r5.f20115
            boolean r1 = r5.f20121
            float r6 = Yue.C5430.m20467(r6, r0, r1)
            float r0 = r5.f20119
            float r1 = r5.f20115
            boolean r2 = r5.f20121
            float r0 = Yue.C5430.m20466(r0, r1, r2)
            android.graphics.Rect r1 = r5.f20118
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            double r2 = (double) r6
            double r2 = java.lang.Math.ceil(r2)
            int r6 = (int) r2
            r1.inset(r0, r6)
            android.graphics.RectF r6 = r5.f20117
            android.graphics.Rect r0 = r5.f20118
            r6.set(r0)
        L4c:
            return
    }
}
