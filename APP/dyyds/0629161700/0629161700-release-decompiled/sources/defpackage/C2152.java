package defpackage;

/* JADX INFO: renamed from: ᲇᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2152 extends defpackage.C1088 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f9139;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f9140;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f9141;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public android.content.res.ColorStateList f9142;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public int f9143;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f9144;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0657 f9145;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f9146;

    public C2152(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r0 = 1711538683(0x660401fb, float:1.5584723E23)
            r8.<init>(r9, r10, r0)
            int[] r1 = defpackage.AbstractC0347.f1778
            r2 = 1712259551(0x660f01df, float:1.6883323E23)
            android.content.res.TypedArray r3 = r9.obtainStyledAttributes(r10, r1, r0, r2)
            r4 = 1
            r5 = 0
            boolean r6 = r3.getBoolean(r4, r5)
            r3.recycle()
            if (r6 == 0) goto L21
            int[] r3 = defpackage.C0292.f1592
            java.lang.String r6 = "Theme.MaterialComponents"
            defpackage.C0292.m943(r9, r3, r6)
        L21:
            int[] r3 = defpackage.C0292.f1589
            java.lang.String r6 = "Theme.AppCompat"
            defpackage.C0292.m943(r9, r3, r6)
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r10, r1, r0, r2)
            r3 = 2
            boolean r6 = r1.getBoolean(r3, r5)
            r7 = -1
            if (r6 != 0) goto L38
            r1.recycle()
            goto L46
        L38:
            int r6 = r1.getResourceId(r5, r7)
            if (r6 == r7) goto L40
            r6 = r4
            goto L41
        L40:
            r6 = r5
        L41:
            r1.recycle()
            if (r6 == 0) goto L14b
        L46:
            int[] r1 = defpackage.AbstractC0347.f1780
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r1, r0, r2)
            r10 = 9
            int r10 = r9.getDimensionPixelSize(r10, r5)
            r8.f9146 = r10
            r10 = 12
            int r10 = r9.getInt(r10, r7)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r10 = defpackage.AbstractC2279.m3701(r10)
            r8.f9139 = r10
            android.content.Context r10 = r8.getContext()
            r0 = 11
            android.content.res.ColorStateList r10 = defpackage.AbstractC0425.m1200(r10, r9, r0)
            r8.f9142 = r10
            android.content.Context r10 = r8.getContext()
            r0 = 7
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L86
            int r1 = r9.getResourceId(r0, r5)
            if (r1 == 0) goto L86
            android.graphics.drawable.Drawable r10 = defpackage.AbstractC1592.m2873(r10, r1)
            if (r10 == 0) goto L86
            goto L8a
        L86:
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r0)
        L8a:
            r8.f9144 = r10
            r10 = 8
            int r10 = r9.getInteger(r10, r4)
            r8.f9143 = r10
            r10 = 10
            int r10 = r9.getDimensionPixelSize(r10, r5)
            r8.f9140 = r10
            ᛴᛴᛸᛱ r10 = new ᛴᛴᛸᛱ
            r10.<init>(r8)
            r8.f9145 = r10
            int r0 = r9.getDimensionPixelOffset(r5, r5)
            r10.f3196 = r0
            int r0 = r9.getDimensionPixelOffset(r4, r5)
            r10.f3192 = r0
            int r0 = r9.getDimensionPixelOffset(r3, r5)
            r10.f3191 = r0
            r0 = 3
            int r0 = r9.getDimensionPixelOffset(r0, r5)
            r10.f3189 = r0
            r0 = 6
            int r0 = r9.getDimensionPixelSize(r0, r5)
            r10.f3197 = r0
            r0 = 15
            int r0 = r9.getDimensionPixelSize(r0, r5)
            r10.f3199 = r0
            r0 = 5
            int r0 = r9.getInt(r0, r7)
            android.graphics.PorterDuff$Mode r0 = defpackage.AbstractC2279.m3701(r0)
            r10.f3184 = r0
            ᲇᲇᛸᲁ r0 = r10.f3193
            android.content.Context r1 = r0.getContext()
            r2 = 4
            android.content.res.ColorStateList r1 = defpackage.AbstractC0425.m1200(r1, r9, r2)
            r10.f3187 = r1
            android.content.Context r1 = r0.getContext()
            r2 = 14
            android.content.res.ColorStateList r1 = defpackage.AbstractC0425.m1200(r1, r9, r2)
            r10.f3194 = r1
            android.content.Context r1 = r0.getContext()
            r2 = 13
            android.content.res.ColorStateList r1 = defpackage.AbstractC0425.m1200(r1, r9, r2)
            r10.f3185 = r1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            android.graphics.Paint r2 = r10.f3186
            r2.setStyle(r1)
            int r1 = r10.f3199
            float r1 = (float) r1
            r2.setStrokeWidth(r1)
            android.content.res.ColorStateList r1 = r10.f3194
            if (r1 == 0) goto L114
            int[] r3 = r0.getDrawableState()
            int r5 = r1.getColorForState(r3, r5)
        L114:
            r2.setColor(r5)
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            int r1 = r0.getPaddingStart()
            int r2 = r0.getPaddingTop()
            int r3 = r0.getPaddingEnd()
            int r4 = r0.getPaddingBottom()
            ᛱᛸᲀᛷ r5 = r10.m1486()
            r0.setInternalBackground(r5)
            int r5 = r10.f3196
            int r1 = r1 + r5
            int r5 = r10.f3191
            int r2 = r2 + r5
            int r5 = r10.f3192
            int r3 = r3 + r5
            int r10 = r10.f3189
            int r4 = r4 + r10
            r0.setPaddingRelative(r1, r2, r3, r4)
            r9.recycle()
            int r9 = r8.f9146
            r8.setCompoundDrawablePadding(r9)
            r8.m3567()
            return
        L14b:
            java.lang.String r8 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            defpackage.C2264.m3684(r8)
            r8 = 0
            throw r8
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            return r0
    }

    public int getCornerRadius() {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto Lb
            ᛴᛴᛸᛱ r1 = r1.f9145
            int r1 = r1.f3197
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public android.graphics.drawable.Drawable getIcon() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f9144
            return r0
    }

    public int getIconGravity() {
            r0 = this;
            int r0 = r0.f9143
            return r0
    }

    public int getIconPadding() {
            r0 = this;
            int r0 = r0.f9146
            return r0
    }

    public int getIconSize() {
            r0 = this;
            int r0 = r0.f9140
            return r0
    }

    public android.content.res.ColorStateList getIconTint() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.f9142
            return r0
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.f9139
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto Lb
            ᛴᛴᛸᛱ r1 = r1.f9145
            android.content.res.ColorStateList r1 = r1.f3185
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto Lb
            ᛴᛴᛸᛱ r1 = r1.f9145
            android.content.res.ColorStateList r1 = r1.f3194
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public int getStrokeWidth() {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto Lb
            ᛴᛴᛸᛱ r1 = r1.f9145
            int r1 = r1.f3199
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // defpackage.C1088
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto Lb
            ᛴᛴᛸᛱ r1 = r1.f9145
            android.content.res.ColorStateList r1 = r1.f3187
            return r1
        Lb:
            android.content.res.ColorStateList r1 = super.getSupportBackgroundTintList()
            return r1
    }

    @Override // defpackage.C1088
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto Lb
            ᛴᛴᛸᛱ r1 = r1.f9145
            android.graphics.PorterDuff$Mode r1 = r1.f3184
            return r1
        Lb:
            android.graphics.PorterDuff$Mode r1 = super.getSupportBackgroundTintMode()
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            android.graphics.drawable.Drawable r3 = r2.f9144
            if (r3 == 0) goto L4f
            int r3 = r2.f9143
            r4 = 2
            if (r3 == r4) goto Ld
            goto L4f
        Ld:
            android.text.TextPaint r3 = r2.getPaint()
            java.lang.CharSequence r0 = r2.getText()
            java.lang.String r0 = r0.toString()
            float r3 = r3.measureText(r0)
            int r3 = (int) r3
            int r0 = r2.f9140
            if (r0 != 0) goto L28
            android.graphics.drawable.Drawable r0 = r2.f9144
            int r0 = r0.getIntrinsicWidth()
        L28:
            int r1 = r2.getMeasuredWidth()
            int r1 = r1 - r3
            java.util.WeakHashMap r3 = defpackage.AbstractC0858.f3911
            int r3 = r2.getPaddingEnd()
            int r1 = r1 - r3
            int r1 = r1 - r0
            int r3 = r2.f9146
            int r1 = r1 - r3
            int r3 = r2.getPaddingStart()
            int r1 = r1 - r3
            int r1 = r1 / r4
            int r3 = r2.getLayoutDirection()
            r4 = 1
            if (r3 != r4) goto L46
            int r1 = -r1
        L46:
            int r3 = r2.f9141
            if (r3 == r1) goto L4f
            r2.f9141 = r1
            r2.m3567()
        L4f:
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto L10
            ᛴᛴᛸᛱ r1 = r1.f9145
            android.graphics.drawable.GradientDrawable r1 = r1.f3190
            if (r1 == 0) goto Lf
            r1.setColor(r2)
        Lf:
            return
        L10:
            super.setBackgroundColor(r2)
            return
    }

    @Override // defpackage.C1088, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r4) {
            r3 = this;
            boolean r0 = r3.m3566()
            if (r0 == 0) goto L34
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            if (r4 == r0) goto L28
            java.lang.String r0 = "MaterialButton"
            java.lang.String r1 = "Setting a custom background is not supported."
            android.util.Log.i(r0, r1)
            r0 = 1
            ᛴᛴᛸᛱ r1 = r3.f9145
            r1.f3198 = r0
            ᲇᲇᛸᲁ r0 = r1.f3193
            android.content.res.ColorStateList r2 = r1.f3187
            r0.setSupportBackgroundTintList(r2)
            android.graphics.PorterDuff$Mode r1 = r1.f3184
            r0.setSupportBackgroundTintMode(r1)
            super.setBackgroundDrawable(r4)
            return
        L28:
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            int[] r4 = r4.getState()
            r3.setState(r4)
            return
        L34:
            super.setBackgroundDrawable(r4)
            return
    }

    @Override // defpackage.C1088, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setBackgroundDrawable(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setSupportBackgroundTintList(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportBackgroundTintMode(r1)
            return
    }

    public void setCornerRadius(int r3) {
            r2 = this;
            boolean r0 = r2.m3566()
            if (r0 == 0) goto L2c
            ᛴᛴᛸᛱ r2 = r2.f9145
            int r0 = r2.f3197
            if (r0 == r3) goto L2c
            r2.f3197 = r3
            android.graphics.drawable.GradientDrawable r0 = r2.f3190
            if (r0 == 0) goto L2c
            android.graphics.drawable.GradientDrawable r1 = r2.f3195
            if (r1 == 0) goto L2c
            android.graphics.drawable.GradientDrawable r1 = r2.f3188
            if (r1 == 0) goto L2c
            float r3 = (float) r3
            r1 = 925353388(0x3727c5ac, float:1.0E-5)
            float r3 = r3 + r1
            r0.setCornerRadius(r3)
            android.graphics.drawable.GradientDrawable r0 = r2.f3195
            r0.setCornerRadius(r3)
            android.graphics.drawable.GradientDrawable r2 = r2.f3188
            r2.setCornerRadius(r3)
        L2c:
            return
    }

    public void setCornerRadiusResource(int r2) {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setCornerRadius(r2)
        L11:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f9144
            if (r0 == r2) goto L9
            r1.f9144 = r2
            r1.m3567()
        L9:
            return
    }

    public void setIconGravity(int r1) {
            r0 = this;
            r0.f9143 = r1
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            int r0 = r1.f9146
            if (r0 == r2) goto L9
            r1.f9146 = r2
            r1.setCompoundDrawablePadding(r2)
        L9:
            return
    }

    public void setIconResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setIcon(r2)
            return
    }

    public void setIconSize(int r2) {
            r1 = this;
            if (r2 < 0) goto Lc
            int r0 = r1.f9140
            if (r0 == r2) goto Lb
            r1.f9140 = r2
            r1.m3567()
        Lb:
            return
        Lc:
            java.lang.String r1 = "iconSize cannot be less than 0"
            defpackage.C2264.m3684(r1)
            return
    }

    public void setIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f9142
            if (r0 == r2) goto L9
            r1.f9142 = r2
            r1.m3567()
        L9:
            return
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f9139
            if (r0 == r2) goto L9
            r1.f9139 = r2
            r1.m3567()
        L9:
            return
    }

    public void setIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = defpackage.AbstractC2279.m3698(r0, r2)
            r1.setIconTint(r2)
            return
    }

    public void setInternalBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.m3566()
            if (r0 == 0) goto L21
            ᛴᛴᛸᛱ r2 = r2.f9145
            ᲇᲇᛸᲁ r0 = r2.f3193
            android.content.res.ColorStateList r1 = r2.f3185
            if (r1 == r3) goto L21
            r2.f3185 = r3
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.RippleDrawable
            if (r2 == 0) goto L21
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            android.graphics.drawable.RippleDrawable r2 = (android.graphics.drawable.RippleDrawable) r2
            r2.setColor(r3)
        L21:
            return
    }

    public void setRippleColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = defpackage.AbstractC2279.m3698(r0, r2)
            r1.setRippleColor(r2)
        L11:
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r5) {
            r4 = this;
            boolean r0 = r4.m3566()
            if (r0 == 0) goto L2b
            ᛴᛴᛸᛱ r4 = r4.f9145
            android.content.res.ColorStateList r0 = r4.f3194
            ᲇᲇᛸᲁ r1 = r4.f3193
            if (r0 == r5) goto L2b
            r4.f3194 = r5
            android.graphics.Paint r0 = r4.f3186
            r2 = 0
            if (r5 == 0) goto L1d
            int[] r3 = r1.getDrawableState()
            int r2 = r5.getColorForState(r3, r2)
        L1d:
            r0.setColor(r2)
            android.graphics.drawable.GradientDrawable r5 = r4.f3195
            if (r5 == 0) goto L2b
            ᛱᛸᲀᛷ r4 = r4.m1486()
            r1.setInternalBackground(r4)
        L2b:
            return
    }

    public void setStrokeColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = defpackage.AbstractC2279.m3698(r0, r2)
            r1.setStrokeColor(r2)
        L11:
            return
    }

    public void setStrokeWidth(int r2) {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto L21
            ᛴᛴᛸᛱ r1 = r1.f9145
            int r0 = r1.f3199
            if (r0 == r2) goto L21
            r1.f3199 = r2
            android.graphics.Paint r0 = r1.f3186
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            android.graphics.drawable.GradientDrawable r2 = r1.f3195
            if (r2 == 0) goto L21
            ᲇᲇᛸᲁ r2 = r1.f3193
            ᛱᛸᲀᛷ r1 = r1.m1486()
            r2.setInternalBackground(r1)
        L21:
            return
    }

    public void setStrokeWidthResource(int r2) {
            r1 = this;
            boolean r0 = r1.m3566()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setStrokeWidth(r2)
        L11:
            return
    }

    @Override // defpackage.C1088
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.m3566()
            ᛴᛴᛸᛱ r1 = r2.f9145
            if (r0 == 0) goto L12
            android.content.res.ColorStateList r2 = r1.f3187
            if (r2 == r3) goto L17
            r1.f3187 = r3
            r1.m1487()
            return
        L12:
            if (r1 == 0) goto L17
            super.setSupportBackgroundTintList(r3)
        L17:
            return
    }

    @Override // defpackage.C1088
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            boolean r0 = r2.m3566()
            ᛴᛴᛸᛱ r1 = r2.f9145
            if (r0 == 0) goto L12
            android.graphics.PorterDuff$Mode r2 = r1.f3184
            if (r2 == r3) goto L17
            r1.f3184 = r3
            r1.m1487()
            return
        L12:
            if (r1 == 0) goto L17
            super.setSupportBackgroundTintMode(r3)
        L17:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m3566() {
            r0 = this;
            ᛴᛴᛸᛱ r0 = r0.f9145
            if (r0 == 0) goto La
            boolean r0 = r0.f3198
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3567() {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f9144
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r5.f9144 = r0
            android.content.res.ColorStateList r1 = r5.f9142
            r0.setTintList(r1)
            android.graphics.PorterDuff$Mode r0 = r5.f9139
            if (r0 == 0) goto L18
            android.graphics.drawable.Drawable r1 = r5.f9144
            r1.setTintMode(r0)
        L18:
            int r0 = r5.f9140
            if (r0 == 0) goto L1d
            goto L23
        L1d:
            android.graphics.drawable.Drawable r0 = r5.f9144
            int r0 = r0.getIntrinsicWidth()
        L23:
            int r1 = r5.f9140
            if (r1 == 0) goto L28
            goto L2e
        L28:
            android.graphics.drawable.Drawable r1 = r5.f9144
            int r1 = r1.getIntrinsicHeight()
        L2e:
            android.graphics.drawable.Drawable r2 = r5.f9144
            int r3 = r5.f9141
            r4 = 0
            int r0 = r0 + r3
            r2.setBounds(r3, r4, r0, r1)
        L37:
            android.graphics.drawable.Drawable r0 = r5.f9144
            r1 = 0
            r5.setCompoundDrawablesRelative(r0, r1, r1, r1)
            return
    }
}
