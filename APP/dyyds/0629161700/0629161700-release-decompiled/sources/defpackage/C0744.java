package defpackage;

/* JADX INFO: renamed from: ᛴᲀᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0744 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.content.res.ColorStateList f3505;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f3506;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public android.graphics.PorterDuffColorFilter f3507;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public float f3508;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.graphics.Rect f3509;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.RectF f3510;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public float f3511;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.content.res.ColorStateList f3512;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Paint f3513;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f3514;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f3515;

    public C0744(android.content.res.ColorStateList r3, float r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f3514 = r0
            r1 = 1
            r2.f3515 = r1
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.f3506 = r1
            r2.f3511 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r1 = 5
            r4.<init>(r1)
            r2.f3513 = r4
            if (r3 != 0) goto L1d
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
        L1d:
            r2.f3505 = r3
            int[] r0 = r2.getState()
            android.content.res.ColorStateList r1 = r2.f3505
            int r1 = r1.getDefaultColor()
            int r3 = r3.getColorForState(r0, r1)
            r4.setColor(r3)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r2.f3510 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.f3509 = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r4) {
            r3 = this;
            android.graphics.PorterDuffColorFilter r0 = r3.f3507
            android.graphics.Paint r1 = r3.f3513
            if (r0 == 0) goto L13
            android.graphics.ColorFilter r0 = r1.getColorFilter()
            if (r0 != 0) goto L13
            android.graphics.PorterDuffColorFilter r0 = r3.f3507
            r1.setColorFilter(r0)
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            android.graphics.RectF r2 = r3.f3510
            float r3 = r3.f3511
            r4.drawRoundRect(r2, r3, r3, r1)
            if (r0 == 0) goto L21
            r3 = 0
            r1.setColorFilter(r3)
        L21:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.f3509
            float r1 = r1.f3511
            r2.setRoundRect(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3512
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        La:
            android.content.res.ColorStateList r0 = r1.f3505
            if (r0 == 0) goto L14
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        L14:
            boolean r1 = super.isStateful()
            if (r1 == 0) goto L1c
        L1a:
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r0.m1663(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f3505
            int r1 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r1)
            android.graphics.Paint r0 = r3.f3513
            int r1 = r0.getColor()
            r2 = 1
            if (r4 == r1) goto L15
            r1 = r2
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L1b
            r0.setColor(r4)
        L1b:
            android.content.res.ColorStateList r4 = r3.f3512
            if (r4 == 0) goto L2a
            android.graphics.PorterDuff$Mode r0 = r3.f3506
            if (r0 == 0) goto L2a
            android.graphics.PorterDuffColorFilter r4 = r3.m1662(r4, r0)
            r3.f3507 = r4
            return r2
        L2a:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            android.graphics.Paint r0 = r0.f3513
            r0.setAlpha(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            android.graphics.Paint r0 = r0.f3513
            r0.setColorFilter(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f3512 = r2
            android.graphics.PorterDuff$Mode r0 = r1.f3506
            android.graphics.PorterDuffColorFilter r2 = r1.m1662(r2, r0)
            r1.f3507 = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.f3506 = r2
            android.content.res.ColorStateList r0 = r1.f3512
            android.graphics.PorterDuffColorFilter r2 = r1.m1662(r0, r2)
            r1.f3507 = r2
            r1.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.graphics.PorterDuffColorFilter m1662(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r1 = r1.getState()
            r0 = 0
            int r1 = r2.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r3)
            return r2
        L14:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1663(android.graphics.Rect r12) {
            r11 = this;
            if (r12 != 0) goto L6
            android.graphics.Rect r12 = r11.getBounds()
        L6:
            int r0 = r12.left
            float r0 = (float) r0
            int r1 = r12.top
            float r1 = (float) r1
            int r2 = r12.right
            float r2 = (float) r2
            int r3 = r12.bottom
            float r3 = (float) r3
            android.graphics.RectF r4 = r11.f3510
            r4.set(r0, r1, r2, r3)
            android.graphics.Rect r0 = r11.f3509
            r0.set(r12)
            boolean r12 = r11.f3514
            if (r12 == 0) goto L56
            float r12 = r11.f3508
            float r1 = r11.f3511
            boolean r11 = r11.f3515
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 1069547520(0x3fc00000, float:1.5)
            if (r11 == 0) goto L37
            float r5 = r5 * r12
            double r5 = (double) r5
            double r7 = defpackage.AbstractC1740.f7702
            double r7 = r2 - r7
            double r9 = (double) r1
            double r7 = r7 * r9
            double r7 = r7 + r5
            float r5 = (float) r7
            goto L3a
        L37:
            int r6 = defpackage.AbstractC1740.f7703
            float r5 = r5 * r12
        L3a:
            if (r11 == 0) goto L44
            double r11 = (double) r12
            double r6 = defpackage.AbstractC1740.f7702
            double r2 = r2 - r6
            double r6 = (double) r1
            double r2 = r2 * r6
            double r2 = r2 + r11
            float r12 = (float) r2
        L44:
            double r11 = (double) r12
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            double r1 = (double) r5
            double r1 = java.lang.Math.ceil(r1)
            int r12 = (int) r1
            r0.inset(r11, r12)
            r4.set(r0)
        L56:
            return
    }
}
