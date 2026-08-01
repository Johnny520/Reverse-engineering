package com.google.android.material.button;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends defpackage.w2 implements android.widget.Checkable, defpackage.q30 {
    public static final int[] r = null;
    public static final int[] s = null;
    public final defpackage.mt d;
    public final java.util.LinkedHashSet e;
    public defpackage.kt f;
    public android.graphics.PorterDuff.Mode g;
    public android.content.res.ColorStateList h;
    public android.graphics.drawable.Drawable i;
    public java.lang.String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    static {
            r0 = 16842911(0x101009f, float:2.3694004E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.button.MaterialButton.r = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.button.MaterialButton.s = r0
            return
    }

    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r3 = 2130969264(0x7f0402b0, float:1.7547205E38)
            r6 = 2131821554(0x7f1103f2, float:1.9275854E38)
            android.content.Context r9 = defpackage.ff.W(r9, r10, r3, r6)
            r8.<init>(r9, r10, r3)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.e = r9
            r9 = 0
            r8.o = r9
            r8.p = r9
            android.content.Context r0 = r8.getContext()
            r4 = 2131821554(0x7f1103f2, float:1.9275854E38)
            int[] r5 = new int[r9]
            int[] r2 = defpackage.wy.j
            r1 = r10
            android.content.res.TypedArray r10 = defpackage.a80.u(r0, r1, r2, r3, r4, r5)
            r2 = 12
            int r2 = r10.getDimensionPixelSize(r2, r9)
            r8.n = r2
            r2 = 15
            r4 = -1
            int r2 = r10.getInt(r2, r4)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = defpackage.gt.v(r2, r5)
            r8.g = r2
            android.content.Context r2 = r8.getContext()
            r7 = 14
            android.content.res.ColorStateList r2 = defpackage.ct.n(r2, r10, r7)
            r8.h = r2
            android.content.Context r2 = r8.getContext()
            r7 = 10
            android.graphics.drawable.Drawable r2 = defpackage.ct.o(r2, r10, r7)
            r8.i = r2
            r2 = 11
            r7 = 1
            int r2 = r10.getInteger(r2, r7)
            r8.q = r2
            r2 = 13
            int r2 = r10.getDimensionPixelSize(r2, r9)
            r8.k = r2
            e30 r0 = defpackage.f30.b(r0, r1, r3, r6)
            f30 r0 = r0.a()
            mt r1 = new mt
            r1.<init>(r8, r0)
            r8.d = r1
            int r0 = r10.getDimensionPixelOffset(r7, r9)
            r1.c = r0
            r0 = 2
            int r0 = r10.getDimensionPixelOffset(r0, r9)
            r1.d = r0
            r0 = 3
            int r0 = r10.getDimensionPixelOffset(r0, r9)
            r1.e = r0
            r0 = 4
            int r0 = r10.getDimensionPixelOffset(r0, r9)
            r1.f = r0
            r0 = 8
            boolean r2 = r10.hasValue(r0)
            if (r2 == 0) goto Lcd
            int r0 = r10.getDimensionPixelSize(r0, r4)
            r1.g = r0
            f30 r2 = r1.b
            float r0 = (float) r0
            e30 r2 = r2.e()
            e r3 = new e
            r3.<init>(r0)
            r2.e = r3
            e r3 = new e
            r3.<init>(r0)
            r2.f = r3
            e r3 = new e
            r3.<init>(r0)
            r2.g = r3
            e r3 = new e
            r3.<init>(r0)
            r2.h = r3
            f30 r0 = r2.a()
            r1.c(r0)
            r1.p = r7
        Lcd:
            r0 = 20
            int r0 = r10.getDimensionPixelSize(r0, r9)
            r1.h = r0
            r0 = 7
            int r0 = r10.getInt(r0, r4)
            android.graphics.PorterDuff$Mode r0 = defpackage.gt.v(r0, r5)
            r1.i = r0
            android.content.Context r0 = r8.getContext()
            r2 = 6
            android.content.res.ColorStateList r0 = defpackage.ct.n(r0, r10, r2)
            r1.j = r0
            android.content.Context r0 = r8.getContext()
            r2 = 19
            android.content.res.ColorStateList r0 = defpackage.ct.n(r0, r10, r2)
            r1.k = r0
            android.content.Context r0 = r8.getContext()
            r2 = 16
            android.content.res.ColorStateList r0 = defpackage.ct.n(r0, r10, r2)
            r1.l = r0
            r0 = 5
            boolean r0 = r10.getBoolean(r0, r9)
            r1.q = r0
            r0 = 9
            int r0 = r10.getDimensionPixelSize(r0, r9)
            r1.t = r0
            r0 = 21
            boolean r0 = r10.getBoolean(r0, r7)
            r1.r = r0
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r0 = defpackage.t90.f(r8)
            int r2 = r8.getPaddingTop()
            int r3 = defpackage.t90.e(r8)
            int r4 = r8.getPaddingBottom()
            boolean r5 = r10.hasValue(r9)
            if (r5 == 0) goto L13f
            r1.o = r7
            android.content.res.ColorStateList r5 = r1.j
            r8.setSupportBackgroundTintList(r5)
            android.graphics.PorterDuff$Mode r5 = r1.i
            r8.setSupportBackgroundTintMode(r5)
            goto L142
        L13f:
            r1.e()
        L142:
            int r5 = r1.c
            int r0 = r0 + r5
            int r5 = r1.e
            int r2 = r2 + r5
            int r5 = r1.d
            int r3 = r3 + r5
            int r1 = r1.f
            int r4 = r4 + r1
            defpackage.t90.k(r8, r0, r2, r3, r4)
            r10.recycle()
            int r10 = r8.n
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.i
            if (r10 == 0) goto L15e
            r9 = r7
        L15e:
            r8.c(r9)
            return
    }

    private android.text.Layout.Alignment getActualTextAlignment() {
            r2 = this;
            int r0 = r2.getTextAlignment()
            r1 = 1
            if (r0 == r1) goto L19
            r1 = 6
            if (r0 == r1) goto L16
            r1 = 3
            if (r0 == r1) goto L16
            r1 = 4
            if (r0 == r1) goto L13
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L13:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        L16:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L19:
            android.text.Layout$Alignment r0 = r2.getGravityTextAlignment()
            return r0
    }

    private android.text.Layout.Alignment getGravityTextAlignment() {
            r2 = this;
            int r0 = r2.getGravity()
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r1
            r1 = 1
            if (r0 == r1) goto L19
            r1 = 5
            if (r0 == r1) goto L16
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 == r1) goto L16
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L16:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L19:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
    }

    private int getTextHeight() {
            r5 = this;
            int r0 = r5.getLineCount()
            r1 = 1
            if (r0 <= r1) goto L10
            android.text.Layout r0 = r5.getLayout()
            int r0 = r0.getHeight()
            return r0
        L10:
            android.text.TextPaint r0 = r5.getPaint()
            java.lang.CharSequence r1 = r5.getText()
            java.lang.String r1 = r1.toString()
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            if (r2 == 0) goto L2e
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            java.lang.CharSequence r1 = r2.getTransformation(r1, r5)
            java.lang.String r1 = r1.toString()
        L2e:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3 = 0
            int r4 = r1.length()
            r0.getTextBounds(r1, r3, r4, r2)
            int r0 = r2.height()
            android.text.Layout r1 = r5.getLayout()
            int r1 = r1.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    private int getTextLayoutWidth() {
            r4 = this;
            int r0 = r4.getLineCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L17
            android.text.Layout r3 = r4.getLayout()
            float r3 = r3.getLineWidth(r2)
            float r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L6
        L17:
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            return r0
    }

    public final boolean a() {
            r1 = this;
            mt r0 = r1.d
            if (r0 == 0) goto La
            boolean r0 = r0.o
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void b() {
            r3 = this;
            int r0 = r3.q
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L27
            r1 = 2
            if (r0 != r1) goto La
            goto L27
        La:
            r1 = 3
            if (r0 == r1) goto L21
            r1 = 4
            if (r0 != r1) goto L11
            goto L21
        L11:
            r1 = 16
            if (r0 == r1) goto L1b
            r1 = 32
            if (r0 != r1) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            android.graphics.drawable.Drawable r0 = r3.i
            defpackage.k60.e(r3, r2, r0, r2, r2)
            return
        L21:
            android.graphics.drawable.Drawable r0 = r3.i
            defpackage.k60.e(r3, r2, r2, r0, r2)
            return
        L27:
            android.graphics.drawable.Drawable r0 = r3.i
            defpackage.k60.e(r3, r0, r2, r2, r2)
            return
    }

    public final void c(boolean r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.i
            r1 = 1
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r6.i = r0
            android.content.res.ColorStateList r2 = r6.h
            defpackage.ch.h(r0, r2)
            android.graphics.PorterDuff$Mode r0 = r6.g
            if (r0 == 0) goto L19
            android.graphics.drawable.Drawable r2 = r6.i
            defpackage.ch.i(r2, r0)
        L19:
            int r0 = r6.k
            if (r0 == 0) goto L1e
            goto L24
        L1e:
            android.graphics.drawable.Drawable r0 = r6.i
            int r0 = r0.getIntrinsicWidth()
        L24:
            int r2 = r6.k
            if (r2 == 0) goto L29
            goto L2f
        L29:
            android.graphics.drawable.Drawable r2 = r6.i
            int r2 = r2.getIntrinsicHeight()
        L2f:
            android.graphics.drawable.Drawable r3 = r6.i
            int r4 = r6.l
            int r5 = r6.m
            int r0 = r0 + r4
            int r2 = r2 + r5
            r3.setBounds(r4, r5, r0, r2)
            android.graphics.drawable.Drawable r0 = r6.i
            r0.setVisible(r1, r7)
        L3f:
            if (r7 == 0) goto L45
            r6.b()
            return
        L45:
            android.graphics.drawable.Drawable[] r7 = defpackage.k60.a(r6)
            r0 = 0
            r0 = r7[r0]
            r2 = r7[r1]
            r3 = 2
            r7 = r7[r3]
            int r4 = r6.q
            if (r4 == r1) goto L57
            if (r4 != r3) goto L5b
        L57:
            android.graphics.drawable.Drawable r1 = r6.i
            if (r0 != r1) goto L75
        L5b:
            r0 = 3
            if (r4 == r0) goto L61
            r0 = 4
            if (r4 != r0) goto L65
        L61:
            android.graphics.drawable.Drawable r0 = r6.i
            if (r7 != r0) goto L75
        L65:
            r7 = 16
            if (r4 == r7) goto L6f
            r7 = 32
            if (r4 != r7) goto L6e
            goto L6f
        L6e:
            return
        L6f:
            android.graphics.drawable.Drawable r7 = r6.i
            if (r2 == r7) goto L74
            goto L75
        L74:
            return
        L75:
            r6.b()
            return
    }

    public final void d(int r7, int r8) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.i
            if (r0 == 0) goto Lbc
            android.text.Layout r0 = r6.getLayout()
            if (r0 != 0) goto Lc
            goto Lbc
        Lc:
            int r0 = r6.q
            r1 = 3
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L5d
            if (r0 != r4) goto L18
            goto L5d
        L18:
            if (r0 == r1) goto L5d
            if (r0 != r2) goto L1d
            goto L5d
        L1d:
            r7 = 16
            if (r0 == r7) goto L27
            r1 = 32
            if (r0 != r1) goto L26
            goto L27
        L26:
            return
        L27:
            r6.l = r5
            if (r0 != r7) goto L31
            r6.m = r5
            r6.c(r5)
            return
        L31:
            int r7 = r6.k
            if (r7 != 0) goto L3b
            android.graphics.drawable.Drawable r7 = r6.i
            int r7 = r7.getIntrinsicHeight()
        L3b:
            int r0 = r6.getTextHeight()
            int r8 = r8 - r0
            int r0 = r6.getPaddingTop()
            int r8 = r8 - r0
            int r8 = r8 - r7
            int r7 = r6.n
            int r8 = r8 - r7
            int r7 = r6.getPaddingBottom()
            int r8 = r8 - r7
            int r8 = r8 / r4
            int r7 = java.lang.Math.max(r5, r8)
            int r8 = r6.m
            if (r8 == r7) goto Lbc
            r6.m = r7
            r6.c(r5)
            return
        L5d:
            r6.m = r5
            android.text.Layout$Alignment r8 = r6.getActualTextAlignment()
            int r0 = r6.q
            if (r0 == r3) goto Lb7
            if (r0 == r1) goto Lb7
            if (r0 != r4) goto L6f
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r8 == r1) goto Lb7
        L6f:
            if (r0 != r2) goto L76
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r8 != r0) goto L76
            goto Lb7
        L76:
            int r0 = r6.k
            if (r0 != 0) goto L80
            android.graphics.drawable.Drawable r0 = r6.i
            int r0 = r0.getIntrinsicWidth()
        L80:
            int r1 = r6.getTextLayoutWidth()
            int r7 = r7 - r1
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r1 = defpackage.t90.e(r6)
            int r7 = r7 - r1
            int r7 = r7 - r0
            int r0 = r6.n
            int r7 = r7 - r0
            int r0 = defpackage.t90.f(r6)
            int r7 = r7 - r0
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r8 != r0) goto L9b
            int r7 = r7 / 2
        L9b:
            int r8 = defpackage.t90.d(r6)
            if (r8 != r3) goto La3
            r8 = r3
            goto La4
        La3:
            r8 = r5
        La4:
            int r0 = r6.q
            if (r0 != r2) goto La9
            goto Laa
        La9:
            r3 = r5
        Laa:
            if (r8 == r3) goto Lad
            int r7 = -r7
        Lad:
            int r8 = r6.l
            if (r8 == r7) goto Lbc
            r6.l = r7
            r6.c(r5)
            return
        Lb7:
            r6.l = r5
            r6.c(r5)
        Lbc:
            return
    }

    public java.lang.String getA11yClassName() {
            r1 = this;
            java.lang.String r0 = r1.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r1.j
            return r0
        Lb:
            mt r0 = r1.d
            if (r0 == 0) goto L16
            boolean r0 = r0.q
            if (r0 == 0) goto L16
            java.lang.Class<android.widget.CompoundButton> r0 = android.widget.CompoundButton.class
            goto L18
        L16:
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
        L18:
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getSupportBackgroundTintList()
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.getSupportBackgroundTintMode()
            return r0
    }

    public int getCornerRadius() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            mt r0 = r1.d
            int r0 = r0.g
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.i
            return r0
    }

    public int getIconGravity() {
            r1 = this;
            int r0 = r1.q
            return r0
    }

    public int getIconPadding() {
            r1 = this;
            int r0 = r1.n
            return r0
    }

    public int getIconSize() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public android.content.res.ColorStateList getIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.h
            return r0
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.g
            return r0
    }

    public int getInsetBottom() {
            r1 = this;
            mt r0 = r1.d
            int r0 = r0.f
            return r0
    }

    public int getInsetTop() {
            r1 = this;
            mt r0 = r1.d
            int r0 = r0.e
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            mt r0 = r1.d
            android.content.res.ColorStateList r0 = r0.l
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public defpackage.f30 getShapeAppearanceModel() {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto Lb
            mt r0 = r2.d
            f30 r0 = r0.b
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background."
            r0.<init>(r1)
            throw r0
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            mt r0 = r1.d
            android.content.res.ColorStateList r0 = r0.k
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public int getStrokeWidth() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            mt r0 = r1.d
            int r0 = r0.h
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.w2
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            mt r0 = r1.d
            android.content.res.ColorStateList r0 = r0.j
            return r0
        Lb:
            android.content.res.ColorStateList r0 = super.getSupportBackgroundTintList()
            return r0
    }

    @Override // defpackage.w2
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            mt r0 = r1.d
            android.graphics.PorterDuff$Mode r0 = r0.i
            return r0
        Lb:
            android.graphics.PorterDuff$Mode r0 = super.getSupportBackgroundTintMode()
            return r0
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
            r1 = this;
            boolean r0 = r1.o
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            boolean r0 = r2.a()
            if (r0 == 0) goto L13
            mt r0 = r2.d
            r1 = 0
            eu r0 = r0.b(r1)
            defpackage.gt.D(r2, r0)
        L13:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            mt r0 = r1.d
            if (r0 == 0) goto L13
            boolean r0 = r0.q
            if (r0 == 0) goto L13
            int[] r0 = com.google.android.material.button.MaterialButton.r
            android.view.View.mergeDrawableStates(r2, r0)
        L13:
            boolean r0 = r1.o
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.button.MaterialButton.s
            android.view.View.mergeDrawableStates(r2, r0)
        L1c:
            return r2
    }

    @Override // defpackage.w2, android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            boolean r0 = r1.o
            r2.setChecked(r0)
            return
    }

    @Override // defpackage.w2, android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            mt r0 = r1.d
            if (r0 == 0) goto L14
            boolean r0 = r0.q
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r2.setCheckable(r0)
            boolean r0 = r1.o
            r2.setChecked(r0)
            boolean r0 = r1.isClickable()
            r2.setClickable(r0)
            return
    }

    @Override // defpackage.w2, android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = r0
            int r2 = r0.getMeasuredWidth()
            int r3 = r0.getMeasuredHeight()
            r0.d(r2, r3)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.lt
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            lt r2 = (defpackage.lt) r2
            android.os.Parcelable r0 = r2.a
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.c
            r1.setChecked(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            lt r1 = new lt
            r1.<init>(r0)
            boolean r0 = r2.o
            r1.c = r0
            return r1
    }

    @Override // defpackage.w2, android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            r0.d(r1, r2)
            return
    }

    @Override // android.view.View
    public final boolean performClick() {
            r1 = this;
            mt r0 = r1.d
            boolean r0 = r0.r
            if (r0 == 0) goto L9
            r1.toggle()
        L9:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
            r2 = this;
            super.refreshDrawableState()
            android.graphics.drawable.Drawable r0 = r2.i
            if (r0 == 0) goto L16
            int[] r0 = r2.getDrawableState()
            android.graphics.drawable.Drawable r1 = r2.i
            boolean r0 = r1.setState(r0)
            if (r0 == 0) goto L16
            r2.invalidate()
        L16:
            return
    }

    public void setA11yClassName(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r4) {
            r3 = this;
            boolean r0 = r3.a()
            if (r0 == 0) goto L17
            mt r0 = r3.d
            r1 = 0
            eu r2 = r0.b(r1)
            if (r2 == 0) goto L16
            eu r0 = r0.b(r1)
            r0.setTint(r4)
        L16:
            return
        L17:
            super.setBackgroundColor(r4)
            return
    }

    @Override // defpackage.w2, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r4) {
            r3 = this;
            boolean r0 = r3.a()
            if (r0 == 0) goto L34
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            if (r4 == r0) goto L28
            java.lang.String r0 = "MaterialButton"
            java.lang.String r1 = "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled"
            android.util.Log.w(r0, r1)
            r0 = 1
            mt r1 = r3.d
            r1.o = r0
            com.google.android.material.button.MaterialButton r0 = r1.a
            android.content.res.ColorStateList r2 = r1.j
            r0.setSupportBackgroundTintList(r2)
            android.graphics.PorterDuff$Mode r1 = r1.i
            r0.setSupportBackgroundTintMode(r1)
            super.setBackgroundDrawable(r4)
            return
        L28:
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            int[] r4 = r4.getState()
            r0.setState(r4)
            return
        L34:
            super.setBackgroundDrawable(r4)
            return
    }

    @Override // defpackage.w2, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
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

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto La
            mt r0 = r1.d
            r0.q = r2
        La:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r3) {
            r2 = this;
            mt r0 = r2.d
            if (r0 == 0) goto L50
            boolean r0 = r0.q
            if (r0 == 0) goto L50
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L50
            boolean r0 = r2.o
            if (r0 == r3) goto L50
            r2.o = r3
            r2.refreshDrawableState()
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof com.google.android.material.button.MaterialButtonToggleGroup
            if (r3 == 0) goto L33
            android.view.ViewParent r3 = r2.getParent()
            com.google.android.material.button.MaterialButtonToggleGroup r3 = (com.google.android.material.button.MaterialButtonToggleGroup) r3
            boolean r0 = r2.o
            boolean r1 = r3.f
            if (r1 == 0) goto L2c
            goto L33
        L2c:
            int r1 = r2.getId()
            r3.b(r1, r0)
        L33:
            boolean r3 = r2.p
            if (r3 == 0) goto L38
            goto L50
        L38:
            r3 = 1
            r2.p = r3
            java.util.LinkedHashSet r3 = r2.e
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L4b
            r3 = 0
            r2.p = r3
            return
        L4b:
            java.lang.ClassCastException r3 = defpackage.z30.h(r3)
            throw r3
        L50:
            return
    }

    public void setCornerRadius(int r4) {
            r3 = this;
            boolean r0 = r3.a()
            if (r0 == 0) goto L3f
            mt r0 = r3.d
            boolean r1 = r0.p
            if (r1 == 0) goto L10
            int r1 = r0.g
            if (r1 == r4) goto L3f
        L10:
            r0.g = r4
            r1 = 1
            r0.p = r1
            f30 r1 = r0.b
            float r4 = (float) r4
            e30 r1 = r1.e()
            e r2 = new e
            r2.<init>(r4)
            r1.e = r2
            e r2 = new e
            r2.<init>(r4)
            r1.f = r2
            e r2 = new e
            r2.<init>(r4)
            r1.g = r2
            e r2 = new e
            r2.<init>(r4)
            r1.h = r2
            f30 r4 = r1.a()
            r0.c(r4)
        L3f:
            return
    }

    public void setCornerRadiusResource(int r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setCornerRadius(r2)
        L11:
            return
    }

    @Override // android.view.View
    public void setElevation(float r3) {
            r2 = this;
            super.setElevation(r3)
            boolean r0 = r2.a()
            if (r0 == 0) goto L13
            mt r0 = r2.d
            r1 = 0
            eu r0 = r0.b(r1)
            r0.i(r3)
        L13:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.i
            if (r0 == r2) goto L15
            r1.i = r2
            r2 = 1
            r1.c(r2)
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.d(r2, r0)
        L15:
            return
    }

    public void setIconGravity(int r2) {
            r1 = this;
            int r0 = r1.q
            if (r0 == r2) goto L11
            r1.q = r2
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.d(r2, r0)
        L11:
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            int r0 = r1.n
            if (r0 == r2) goto L9
            r1.n = r2
            r1.setCompoundDrawablePadding(r2)
        L9:
            return
    }

    public void setIconResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setIcon(r2)
            return
    }

    public void setIconSize(int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.k
            if (r0 == r2) goto Lc
            r1.k = r2
            r2 = 1
            r1.c(r2)
        Lc:
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "iconSize cannot be less than 0"
            r2.<init>(r0)
            throw r2
    }

    public void setIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.h
            if (r0 == r2) goto La
            r1.h = r2
            r2 = 0
            r1.c(r2)
        La:
            return
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.g
            if (r0 == r2) goto La
            r1.g = r2
            r2 = 0
            r1.c(r2)
        La:
            return
    }

    public void setIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = defpackage.ip.v(r0, r2)
            r1.setIconTint(r2)
            return
    }

    public void setInsetBottom(int r3) {
            r2 = this;
            mt r0 = r2.d
            int r1 = r0.e
            r0.d(r1, r3)
            return
    }

    public void setInsetTop(int r3) {
            r2 = this;
            mt r0 = r2.d
            int r1 = r0.f
            r0.d(r3, r1)
            return
    }

    public void setInternalBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    public void setOnPressedChangeListenerInternal(defpackage.kt r1) {
            r0 = this;
            r0.f = r1
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            kt r0 = r1.f
            if (r0 == 0) goto Ld
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            com.google.android.material.button.MaterialButtonToggleGroup r0 = (com.google.android.material.button.MaterialButtonToggleGroup) r0
            r0.invalidate()
        Ld:
            super.setPressed(r2)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r4) {
            r3 = this;
            boolean r0 = r3.a()
            if (r0 == 0) goto L25
            mt r0 = r3.d
            com.google.android.material.button.MaterialButton r1 = r0.a
            android.content.res.ColorStateList r2 = r0.l
            if (r2 == r4) goto L25
            r0.l = r4
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L25
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r4 = defpackage.g10.a(r4)
            r0.setColor(r4)
        L25:
            return
    }

    public void setRippleColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = defpackage.ip.v(r0, r2)
            r1.setRippleColor(r2)
        L11:
            return
    }

    @Override // defpackage.q30
    public void setShapeAppearanceModel(defpackage.f30 r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lc
            mt r0 = r1.d
            r0.c(r2)
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background."
            r2.<init>(r0)
            throw r2
    }

    public void setShouldDrawSurfaceColorStroke(boolean r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Ld
            mt r0 = r1.d
            r0.n = r2
            r0.f()
        Ld:
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L11
            mt r0 = r2.d
            android.content.res.ColorStateList r1 = r0.k
            if (r1 == r3) goto L11
            r0.k = r3
            r0.f()
        L11:
            return
    }

    public void setStrokeColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = defpackage.ip.v(r0, r2)
            r1.setStrokeColor(r2)
        L11:
            return
    }

    public void setStrokeWidth(int r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L11
            mt r0 = r2.d
            int r1 = r0.h
            if (r1 == r3) goto L11
            r0.h = r3
            r0.f()
        L11:
            return
    }

    public void setStrokeWidthResource(int r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setStrokeWidth(r2)
        L11:
            return
    }

    @Override // defpackage.w2
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L1f
            mt r0 = r2.d
            android.content.res.ColorStateList r1 = r0.j
            if (r1 == r3) goto L1e
            r0.j = r3
            r3 = 0
            eu r1 = r0.b(r3)
            if (r1 == 0) goto L1e
            eu r3 = r0.b(r3)
            android.content.res.ColorStateList r0 = r0.j
            defpackage.ch.h(r3, r0)
        L1e:
            return
        L1f:
            super.setSupportBackgroundTintList(r3)
            return
    }

    @Override // defpackage.w2
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L23
            mt r0 = r2.d
            android.graphics.PorterDuff$Mode r1 = r0.i
            if (r1 == r3) goto L22
            r0.i = r3
            r3 = 0
            eu r1 = r0.b(r3)
            if (r1 == 0) goto L22
            android.graphics.PorterDuff$Mode r1 = r0.i
            if (r1 == 0) goto L22
            eu r3 = r0.b(r3)
            android.graphics.PorterDuff$Mode r0 = r0.i
            defpackage.ch.i(r3, r0)
        L22:
            return
        L23:
            super.setSupportBackgroundTintMode(r3)
            return
    }

    @Override // android.view.View
    public void setTextAlignment(int r2) {
            r1 = this;
            super.setTextAlignment(r2)
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.d(r2, r0)
            return
    }

    public void setToggleCheckedStateOnClick(boolean r2) {
            r1 = this;
            mt r0 = r1.d
            r0.r = r2
            return
    }

    @Override // android.widget.Checkable
    public final void toggle() {
            r1 = this;
            boolean r0 = r1.o
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
