package com.google.android.material.chip;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends defpackage.y2 implements defpackage.ja, defpackage.q30, android.widget.Checkable {
    public static final android.graphics.Rect w = null;
    public static final int[] x = null;
    public static final int[] y = null;
    public defpackage.ka e;
    public android.graphics.drawable.InsetDrawable f;
    public android.graphics.drawable.RippleDrawable g;
    public android.view.View.OnClickListener h;
    public android.widget.CompoundButton.OnCheckedChangeListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public java.lang.CharSequence q;
    public final defpackage.ia r;
    public boolean s;
    public final android.graphics.Rect t;
    public final android.graphics.RectF u;
    public final defpackage.ha v;

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.google.android.material.chip.Chip.w = r0
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.chip.Chip.x = r0
            r0 = 16842911(0x101009f, float:2.3694004E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.chip.Chip.y = r0
            return
    }

    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = 2131821568(0x7f110400, float:1.9275883E38)
            r4 = 2130968767(0x7f0400bf, float:1.7546197E38)
            r3 = r17
            android.content.Context r1 = defpackage.ff.W(r3, r2, r4, r1)
            r0.<init>(r1, r2, r4)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.t = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.u = r1
            ha r1 = new ha
            r3 = 0
            r1.<init>(r3, r0)
            r0.v = r1
            android.content.Context r7 = r0.getContext()
            r8 = 8388627(0x800013, float:1.175497E-38)
            r9 = 1
            if (r2 != 0) goto L34
            goto L94
        L34:
            java.lang.String r1 = "background"
            java.lang.String r3 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            java.lang.String r5 = "Chip"
            if (r1 == 0) goto L45
            java.lang.String r1 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r5, r1)
        L45:
            java.lang.String r1 = "drawableLeft"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            if (r1 != 0) goto L3b3
            java.lang.String r1 = "drawableStart"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            if (r1 != 0) goto L3ab
            java.lang.String r1 = "drawableEnd"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            java.lang.String r6 = "Please set end drawable using R.attr#closeIcon."
            if (r1 != 0) goto L3a5
            java.lang.String r1 = "drawableRight"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            if (r1 != 0) goto L39f
            java.lang.String r1 = "singleLine"
            boolean r1 = r2.getAttributeBooleanValue(r3, r1, r9)
            if (r1 == 0) goto L397
            java.lang.String r1 = "lines"
            int r1 = r2.getAttributeIntValue(r3, r1, r9)
            if (r1 != r9) goto L397
            java.lang.String r1 = "minLines"
            int r1 = r2.getAttributeIntValue(r3, r1, r9)
            if (r1 != r9) goto L397
            java.lang.String r1 = "maxLines"
            int r1 = r2.getAttributeIntValue(r3, r1, r9)
            if (r1 != r9) goto L397
            java.lang.String r1 = "gravity"
            int r1 = r2.getAttributeIntValue(r3, r1, r8)
            if (r1 == r8) goto L94
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r5, r1)
        L94:
            ka r10 = new ka
            r10.<init>(r7, r2)
            r11 = 0
            int[] r6 = new int[r11]
            android.content.Context r1 = r10.e0
            int[] r3 = defpackage.wy.c
            r5 = 2131821568(0x7f110400, float:1.9275883E38)
            android.content.res.TypedArray r1 = defpackage.a80.u(r1, r2, r3, r4, r5, r6)
            r12 = 37
            boolean r5 = r1.hasValue(r12)
            r10.E0 = r5
            r5 = 24
            android.content.Context r6 = r10.e0
            android.content.res.ColorStateList r5 = defpackage.ct.n(r6, r1, r5)
            android.content.res.ColorStateList r13 = r10.x
            if (r13 == r5) goto Lc4
            r10.x = r5
            int[] r5 = r10.getState()
            r10.onStateChange(r5)
        Lc4:
            r5 = 11
            android.content.res.ColorStateList r5 = defpackage.ct.n(r6, r1, r5)
            android.content.res.ColorStateList r13 = r10.y
            if (r13 == r5) goto Ld7
            r10.y = r5
            int[] r5 = r10.getState()
            r10.onStateChange(r5)
        Ld7:
            r5 = 19
            r13 = 0
            float r5 = r1.getDimension(r5, r13)
            float r14 = r10.z
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 == 0) goto Lec
            r10.z = r5
            r10.invalidateSelf()
            r10.u()
        Lec:
            r5 = 12
            boolean r14 = r1.hasValue(r5)
            if (r14 == 0) goto Lfb
            float r5 = r1.getDimension(r5, r13)
            r10.A(r5)
        Lfb:
            r5 = 22
            android.content.res.ColorStateList r5 = defpackage.ct.n(r6, r1, r5)
            r10.F(r5)
            r5 = 23
            float r5 = r1.getDimension(r5, r13)
            r10.G(r5)
            r5 = 36
            android.content.res.ColorStateList r5 = defpackage.ct.n(r6, r1, r5)
            r10.P(r5)
            r5 = 5
            java.lang.CharSequence r5 = r1.getText(r5)
            if (r5 != 0) goto L11f
            java.lang.String r5 = ""
        L11f:
            java.lang.CharSequence r14 = r10.E
            boolean r14 = android.text.TextUtils.equals(r14, r5)
            if (r14 != 0) goto L133
            r10.E = r5
            d60 r5 = r10.k0
            r5.d = r9
            r10.invalidateSelf()
            r10.u()
        L133:
            boolean r5 = r1.hasValue(r11)
            if (r5 == 0) goto L145
            int r5 = r1.getResourceId(r11, r11)
            if (r5 == 0) goto L145
            a60 r15 = new a60
            r15.<init>(r6, r5)
            goto L146
        L145:
            r15 = 0
        L146:
            float r5 = r15.k
            float r5 = r1.getDimension(r9, r5)
            r15.k = r5
            r10.Q(r15)
            r5 = 3
            int r15 = r1.getInt(r5, r11)
            if (r15 == r9) goto L168
            r14 = 2
            if (r15 == r14) goto L163
            if (r15 == r5) goto L15e
            goto L16c
        L15e:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r10.B0 = r5
            goto L16c
        L163:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.MIDDLE
            r10.B0 = r5
            goto L16c
        L168:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.START
            r10.B0 = r5
        L16c:
            r5 = 18
            boolean r5 = r1.getBoolean(r5, r11)
            r10.E(r5)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r2 == 0) goto L192
            java.lang.String r14 = "chipIconEnabled"
            java.lang.String r14 = r2.getAttributeValue(r5, r14)
            if (r14 == 0) goto L192
            java.lang.String r14 = "chipIconVisible"
            java.lang.String r14 = r2.getAttributeValue(r5, r14)
            if (r14 != 0) goto L192
            r14 = 15
            boolean r14 = r1.getBoolean(r14, r11)
            r10.E(r14)
        L192:
            r14 = 14
            android.graphics.drawable.Drawable r14 = defpackage.ct.o(r6, r1, r14)
            r10.B(r14)
            r14 = 17
            boolean r15 = r1.hasValue(r14)
            if (r15 == 0) goto L1aa
            android.content.res.ColorStateList r14 = defpackage.ct.n(r6, r1, r14)
            r10.D(r14)
        L1aa:
            r14 = 16
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r14 = r1.getDimension(r14, r15)
            r10.C(r14)
            r14 = 31
            boolean r14 = r1.getBoolean(r14, r11)
            r10.M(r14)
            if (r2 == 0) goto L1d9
            java.lang.String r14 = "closeIconEnabled"
            java.lang.String r14 = r2.getAttributeValue(r5, r14)
            if (r14 == 0) goto L1d9
            java.lang.String r14 = "closeIconVisible"
            java.lang.String r14 = r2.getAttributeValue(r5, r14)
            if (r14 != 0) goto L1d9
            r14 = 26
            boolean r14 = r1.getBoolean(r14, r11)
            r10.M(r14)
        L1d9:
            r14 = 25
            android.graphics.drawable.Drawable r14 = defpackage.ct.o(r6, r1, r14)
            r10.H(r14)
            r14 = 30
            android.content.res.ColorStateList r14 = defpackage.ct.n(r6, r1, r14)
            r10.L(r14)
            r14 = 28
            float r14 = r1.getDimension(r14, r13)
            r10.J(r14)
            r14 = 6
            boolean r14 = r1.getBoolean(r14, r11)
            r10.w(r14)
            r14 = 10
            boolean r14 = r1.getBoolean(r14, r11)
            r10.z(r14)
            if (r2 == 0) goto L220
            java.lang.String r14 = "checkedIconEnabled"
            java.lang.String r14 = r2.getAttributeValue(r5, r14)
            if (r14 == 0) goto L220
            java.lang.String r14 = "checkedIconVisible"
            java.lang.String r5 = r2.getAttributeValue(r5, r14)
            if (r5 != 0) goto L220
            r5 = 8
            boolean r5 = r1.getBoolean(r5, r11)
            r10.z(r5)
        L220:
            r5 = 7
            android.graphics.drawable.Drawable r5 = defpackage.ct.o(r6, r1, r5)
            r10.x(r5)
            r5 = 9
            boolean r14 = r1.hasValue(r5)
            if (r14 == 0) goto L237
            android.content.res.ColorStateList r5 = defpackage.ct.n(r6, r1, r5)
            r10.y(r5)
        L237:
            r5 = 39
            boolean r14 = r1.hasValue(r5)
            if (r14 == 0) goto L24a
            int r5 = r1.getResourceId(r5, r11)
            if (r5 == 0) goto L24a
            bw r5 = defpackage.bw.a(r6, r5)
            goto L24b
        L24a:
            r5 = 0
        L24b:
            r10.U = r5
            r5 = 33
            boolean r14 = r1.hasValue(r5)
            if (r14 == 0) goto L260
            int r5 = r1.getResourceId(r5, r11)
            if (r5 == 0) goto L260
            bw r14 = defpackage.bw.a(r6, r5)
            goto L261
        L260:
            r14 = 0
        L261:
            r10.V = r14
            r5 = 21
            float r5 = r1.getDimension(r5, r13)
            float r6 = r10.W
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 == 0) goto L277
            r10.W = r5
            r10.invalidateSelf()
            r10.u()
        L277:
            r5 = 35
            float r5 = r1.getDimension(r5, r13)
            r10.O(r5)
            r5 = 34
            float r5 = r1.getDimension(r5, r13)
            r10.N(r5)
            r5 = 41
            float r5 = r1.getDimension(r5, r13)
            float r6 = r10.Z
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 == 0) goto L29d
            r10.Z = r5
            r10.invalidateSelf()
            r10.u()
        L29d:
            r5 = 40
            float r5 = r1.getDimension(r5, r13)
            float r6 = r10.a0
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 == 0) goto L2b1
            r10.a0 = r5
            r10.invalidateSelf()
            r10.u()
        L2b1:
            r5 = 29
            float r5 = r1.getDimension(r5, r13)
            r10.K(r5)
            r5 = 27
            float r5 = r1.getDimension(r5, r13)
            r10.I(r5)
            r5 = 13
            float r5 = r1.getDimension(r5, r13)
            float r6 = r10.d0
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 == 0) goto L2d7
            r10.d0 = r5
            r10.invalidateSelf()
            r10.u()
        L2d7:
            r5 = 4
            r6 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r1.getDimensionPixelSize(r5, r6)
            r10.D0 = r5
            r1.recycle()
            int[] r6 = new int[r11]
            r5 = 2131821568(0x7f110400, float:1.9275883E38)
            defpackage.a80.c(r7, r2, r4, r5)
            r1 = r7
            defpackage.a80.e(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6 = 32
            boolean r6 = r5.getBoolean(r6, r11)
            r0.n = r6
            android.content.Context r6 = r0.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 48
            float r7 = (float) r7
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = android.util.TypedValue.applyDimension(r9, r7, r6)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            float r6 = (float) r6
            r7 = 20
            float r6 = r5.getDimension(r7, r6)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            r0.p = r6
            r5.recycle()
            r0.setChipDrawable(r10)
            float r5 = defpackage.y90.i(r0)
            r10.i(r5)
            int[] r6 = new int[r11]
            r5 = 2131821568(0x7f110400, float:1.9275883E38)
            defpackage.a80.c(r1, r2, r4, r5)
            defpackage.a80.e(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            boolean r2 = r1.hasValue(r12)
            r1.recycle()
            ia r1 = new ia
            r1.<init>(r0, r0)
            r0.r = r1
            r0.d()
            if (r2 != 0) goto L35b
            g6 r1 = new g6
            r2 = 7
            r1.<init>(r2, r0)
            r0.setOutlineProvider(r1)
        L35b:
            boolean r1 = r0.j
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r10.E
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r10.B0
            r0.setEllipsize(r1)
            r0.g()
            ka r1 = r0.e
            boolean r1 = r1.C0
            if (r1 != 0) goto L379
            r0.setLines(r9)
            r0.setHorizontallyScrolling(r9)
        L379:
            r0.setGravity(r8)
            r0.f()
            boolean r1 = r0.n
            if (r1 == 0) goto L388
            int r1 = r0.p
            r0.setMinHeight(r1)
        L388:
            int r1 = defpackage.t90.d(r0)
            r0.o = r1
            ga r1 = new ga
            r1.<init>(r0)
            super.setOnCheckedChangeListener(r1)
            return
        L397:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L39f:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r6)
            throw r1
        L3a5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r6)
            throw r1
        L3ab:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L3b3:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ android.graphics.Rect a(com.google.android.material.chip.Chip r0) {
            android.graphics.Rect r0 = r0.getCloseIconTouchBoundsInt()
            return r0
    }

    private android.graphics.RectF getCloseIconTouchBounds() {
            r5 = this;
            android.graphics.RectF r0 = r5.u
            r0.setEmpty()
            boolean r1 = r5.c()
            if (r1 == 0) goto L4d
            android.view.View$OnClickListener r1 = r5.h
            if (r1 == 0) goto L4d
            ka r1 = r5.e
            android.graphics.Rect r2 = r1.getBounds()
            r0.setEmpty()
            boolean r3 = r1.T()
            if (r3 == 0) goto L4d
            float r3 = r1.d0
            float r4 = r1.c0
            float r3 = r3 + r4
            float r4 = r1.O
            float r3 = r3 + r4
            float r4 = r1.b0
            float r3 = r3 + r4
            float r4 = r1.a0
            float r3 = r3 + r4
            int r1 = defpackage.dh.a(r1)
            if (r1 != 0) goto L3b
            int r1 = r2.right
            float r1 = (float) r1
            r0.right = r1
            float r1 = r1 - r3
            r0.left = r1
            goto L43
        L3b:
            int r1 = r2.left
            float r1 = (float) r1
            r0.left = r1
            float r1 = r1 + r3
            r0.right = r1
        L43:
            int r1 = r2.top
            float r1 = (float) r1
            r0.top = r1
            int r1 = r2.bottom
            float r1 = (float) r1
            r0.bottom = r1
        L4d:
            return r0
    }

    private android.graphics.Rect getCloseIconTouchBoundsInt() {
            r5 = this;
            android.graphics.RectF r0 = r5.getCloseIconTouchBounds()
            float r1 = r0.left
            int r1 = (int) r1
            float r2 = r0.top
            int r2 = (int) r2
            float r3 = r0.right
            int r3 = (int) r3
            float r0 = r0.bottom
            int r0 = (int) r0
            android.graphics.Rect r4 = r5.t
            r4.set(r1, r2, r3, r0)
            return r4
    }

    private defpackage.a60 getTextAppearance() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L9
            d60 r0 = r0.k0
            a60 r0 = r0.f
            return r0
        L9:
            r0 = 0
            return r0
    }

    private void setCloseIconHovered(boolean r2) {
            r1 = this;
            boolean r0 = r1.l
            if (r0 == r2) goto L9
            r1.l = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    private void setCloseIconPressed(boolean r2) {
            r1 = this;
            boolean r0 = r1.k
            if (r0 == r2) goto L9
            r1.k = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    public final void b(int r11) {
            r10 = this;
            r10.p = r11
            boolean r0 = r10.n
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L27
            android.graphics.drawable.InsetDrawable r11 = r10.f
            if (r11 == 0) goto L21
            if (r11 == 0) goto L5a
            r10.f = r1
            r10.setMinWidth(r2)
            float r11 = r10.getChipMinHeight()
            int r11 = (int) r11
            r10.setMinHeight(r11)
            int[] r11 = defpackage.g10.a
            r10.e()
            return
        L21:
            int[] r11 = defpackage.g10.a
            r10.e()
            return
        L27:
            ka r0 = r10.e
            float r0 = r0.z
            int r0 = (int) r0
            int r0 = r11 - r0
            int r0 = java.lang.Math.max(r2, r0)
            ka r3 = r10.e
            int r3 = r3.getIntrinsicWidth()
            int r3 = r11 - r3
            int r3 = java.lang.Math.max(r2, r3)
            if (r3 > 0) goto L61
            if (r0 > 0) goto L61
            android.graphics.drawable.InsetDrawable r11 = r10.f
            if (r11 == 0) goto L5b
            if (r11 == 0) goto L5a
            r10.f = r1
            r10.setMinWidth(r2)
            float r11 = r10.getChipMinHeight()
            int r11 = (int) r11
            r10.setMinHeight(r11)
            int[] r11 = defpackage.g10.a
            r10.e()
        L5a:
            return
        L5b:
            int[] r11 = defpackage.g10.a
            r10.e()
            return
        L61:
            if (r3 <= 0) goto L67
            int r3 = r3 / 2
            r6 = r3
            goto L68
        L67:
            r6 = r2
        L68:
            if (r0 <= 0) goto L6c
            int r2 = r0 / 2
        L6c:
            r7 = r2
            android.graphics.drawable.InsetDrawable r0 = r10.f
            if (r0 == 0) goto L91
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r1 = r10.f
            r1.getPadding(r0)
            int r1 = r0.top
            if (r1 != r7) goto L91
            int r1 = r0.bottom
            if (r1 != r7) goto L91
            int r1 = r0.left
            if (r1 != r6) goto L91
            int r0 = r0.right
            if (r0 != r6) goto L91
            int[] r11 = defpackage.g10.a
            r10.e()
            return
        L91:
            int r0 = r10.getMinHeight()
            if (r0 == r11) goto L9a
            r10.setMinHeight(r11)
        L9a:
            int r0 = r10.getMinWidth()
            if (r0 == r11) goto La3
            r10.setMinWidth(r11)
        La3:
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            ka r5 = r10.e
            r8 = r6
            r9 = r7
            r4.<init>(r5, r6, r7, r8, r9)
            r10.f = r4
            int[] r11 = defpackage.g10.a
            r10.e()
            return
    }

    public final boolean c() {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.L
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof defpackage.ad0
            if (r1 == 0) goto Lf
            ad0 r0 = (defpackage.ad0) r0
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    public final void d() {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L1b
            ka r0 = r1.e
            if (r0 == 0) goto L1b
            boolean r0 = r0.K
            if (r0 == 0) goto L1b
            android.view.View$OnClickListener r0 = r1.h
            if (r0 == 0) goto L1b
            ia r0 = r1.r
            defpackage.ja0.l(r1, r0)
            r0 = 1
            r1.s = r0
            return
        L1b:
            r0 = 0
            defpackage.ja0.l(r1, r0)
            r0 = 0
            r1.s = r0
            return
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent r9) {
            r8 = this;
            boolean r0 = r8.s
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchHoverEvent(r9)
            return r9
        L9:
            ia r0 = r8.r
            android.view.accessibility.AccessibilityManager r1 = r0.h
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6b
        L1c:
            int r1 = r9.getAction()
            r2 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L42
            r2 = 9
            if (r1 == r2) goto L42
            r2 = 10
            if (r1 == r2) goto L30
            goto L6b
        L30:
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.m = r2
            r0.p(r2, r6)
            r0.p(r1, r5)
            return r4
        L42:
            float r1 = r9.getX()
            float r9 = r9.getY()
            com.google.android.material.chip.Chip r2 = r0.n
            boolean r7 = r2.c()
            if (r7 == 0) goto L5d
            android.graphics.RectF r2 = r2.getCloseIconTouchBounds()
            boolean r9 = r2.contains(r1, r9)
            if (r9 == 0) goto L5d
            r3 = r4
        L5d:
            int r9 = r0.m
            if (r9 != r3) goto L62
            goto L71
        L62:
            r0.m = r3
            r0.p(r3, r6)
            r0.p(r9, r5)
            return r4
        L6b:
            boolean r9 = super.dispatchHoverEvent(r9)
            if (r9 == 0) goto L72
        L71:
            return r4
        L72:
            return r3
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
            r9 = this;
            boolean r0 = r9.s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            ia r0 = r9.r
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            if (r1 == r4) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r4
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.l
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.n
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.s
            if (r1 == 0) goto L85
            ia r1 = r5.r
            r1.p(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.l
            if (r0 == r3) goto La4
            return r4
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
    }

    @Override // defpackage.y2, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r5 = this;
            super.drawableStateChanged()
            ka r0 = r5.e
            r1 = 0
            if (r0 == 0) goto L84
            android.graphics.drawable.Drawable r0 = r0.L
            boolean r0 = defpackage.ka.t(r0)
            if (r0 == 0) goto L84
            ka r0 = r5.e
            boolean r2 = r5.isEnabled()
            boolean r3 = r5.m
            if (r3 == 0) goto L1c
            int r2 = r2 + 1
        L1c:
            boolean r3 = r5.l
            if (r3 == 0) goto L22
            int r2 = r2 + 1
        L22:
            boolean r3 = r5.k
            if (r3 == 0) goto L28
            int r2 = r2 + 1
        L28:
            boolean r3 = r5.isChecked()
            if (r3 == 0) goto L30
            int r2 = r2 + 1
        L30:
            int[] r2 = new int[r2]
            boolean r3 = r5.isEnabled()
            if (r3 == 0) goto L3f
            r3 = 16842910(0x101009e, float:2.3694E-38)
            r2[r1] = r3
            r3 = 1
            goto L40
        L3f:
            r3 = r1
        L40:
            boolean r4 = r5.m
            if (r4 == 0) goto L4b
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r2[r3] = r4
            int r3 = r3 + 1
        L4b:
            boolean r4 = r5.l
            if (r4 == 0) goto L56
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r2[r3] = r4
            int r3 = r3 + 1
        L56:
            boolean r4 = r5.k
            if (r4 == 0) goto L61
            r4 = 16842919(0x10100a7, float:2.3694026E-38)
            r2[r3] = r4
            int r3 = r3 + 1
        L61:
            boolean r4 = r5.isChecked()
            if (r4 == 0) goto L6c
            r4 = 16842913(0x10100a1, float:2.369401E-38)
            r2[r3] = r4
        L6c:
            int[] r3 = r0.y0
            boolean r3 = java.util.Arrays.equals(r3, r2)
            if (r3 != 0) goto L84
            r0.y0 = r2
            boolean r3 = r0.T()
            if (r3 == 0) goto L84
            int[] r1 = r0.getState()
            boolean r1 = r0.v(r1, r2)
        L84:
            if (r1 == 0) goto L89
            r5.invalidate()
        L89:
            return
    }

    public final void e() {
            r4 = this;
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            ka r1 = r4.e
            android.content.res.ColorStateList r1 = r1.D
            android.content.res.ColorStateList r1 = defpackage.g10.a(r1)
            android.graphics.drawable.Drawable r2 = r4.getBackgroundDrawable()
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.g = r0
            ka r0 = r4.e
            r0.getClass()
            android.graphics.drawable.RippleDrawable r0 = r4.g
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.q(r4, r0)
            r4.f()
            return
    }

    public final void f() {
            r5 = this;
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L48
            ka r0 = r5.e
            if (r0 != 0) goto Lf
            goto L48
        Lf:
            float r1 = r0.d0
            float r2 = r0.a0
            float r1 = r1 + r2
            float r0 = r0.q()
            float r0 = r0 + r1
            int r0 = (int) r0
            ka r1 = r5.e
            float r2 = r1.W
            float r3 = r1.Z
            float r2 = r2 + r3
            float r1 = r1.p()
            float r1 = r1 + r2
            int r1 = (int) r1
            android.graphics.drawable.InsetDrawable r2 = r5.f
            if (r2 == 0) goto L3b
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.drawable.InsetDrawable r3 = r5.f
            r3.getPadding(r2)
            int r3 = r2.left
            int r1 = r1 + r3
            int r2 = r2.right
            int r0 = r0 + r2
        L3b:
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingBottom()
            java.util.WeakHashMap r4 = defpackage.ja0.a
            defpackage.t90.k(r5, r1, r2, r0, r3)
        L48:
            return
    }

    public final void g() {
            r4 = this;
            android.text.TextPaint r0 = r4.getPaint()
            ka r1 = r4.e
            if (r1 == 0) goto Le
            int[] r1 = r1.getState()
            r0.drawableState = r1
        Le:
            a60 r1 = r4.getTextAppearance()
            if (r1 == 0) goto L1d
            android.content.Context r2 = r4.getContext()
            ha r3 = r4.v
            r1.e(r2, r0, r3)
        L1d:
            return
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r2 = this;
            java.lang.CharSequence r0 = r2.q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.CharSequence r0 = r2.q
            return r0
        Lb:
            ka r0 = r2.e
            java.lang.String r1 = "android.widget.Button"
            if (r0 == 0) goto L19
            boolean r0 = r0.Q
            if (r0 == 0) goto L19
            r2.getParent()
            return r1
        L19:
            boolean r0 = r2.isClickable()
            if (r0 == 0) goto L20
            return r1
        L20:
            java.lang.String r0 = "android.view.View"
            return r0
    }

    public android.graphics.drawable.Drawable getBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.InsetDrawable r0 = r1.f
            if (r0 != 0) goto L6
            ka r0 = r1.e
        L6:
            return r0
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            android.graphics.drawable.Drawable r0 = r0.S
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.T
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getChipBackgroundColor() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.y
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipCornerRadius() {
            r2 = this;
            ka r0 = r2.e
            r1 = 0
            if (r0 == 0) goto Le
            float r0 = r0.r()
            float r0 = java.lang.Math.max(r1, r0)
            return r0
        Le:
            return r1
    }

    public android.graphics.drawable.Drawable getChipDrawable() {
            r1 = this;
            ka r0 = r1.e
            return r0
    }

    public float getChipEndPadding() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.d0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getChipIcon() {
            r2 = this;
            ka r0 = r2.e
            r1 = 0
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r0.G
            if (r0 == 0) goto L11
            boolean r1 = r0 instanceof defpackage.ad0
            if (r1 == 0) goto L10
            ad0 r0 = (defpackage.ad0) r0
            r0 = 0
        L10:
            return r0
        L11:
            return r1
    }

    public float getChipIconSize() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.I
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getChipIconTint() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.H
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipMinHeight() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.z
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipStartPadding() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.W
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getChipStrokeColor() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.B
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipStrokeWidth() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.C
            return r0
        L7:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getChipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            return r0
    }

    public android.graphics.drawable.Drawable getCloseIcon() {
            r2 = this;
            ka r0 = r2.e
            r1 = 0
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r0.L
            if (r0 == 0) goto L11
            boolean r1 = r0 instanceof defpackage.ad0
            if (r1 == 0) goto L10
            ad0 r0 = (defpackage.ad0) r0
            r0 = 0
        L10:
            return r0
        L11:
            return r1
    }

    public java.lang.CharSequence getCloseIconContentDescription() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            android.text.SpannableStringBuilder r0 = r0.P
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getCloseIconEndPadding() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.c0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getCloseIconSize() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.O
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getCloseIconStartPadding() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.b0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getCloseIconTint() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.N
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView
    public android.text.TextUtils.TruncateAt getEllipsize() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            android.text.TextUtils$TruncateAt r0 = r0.B0
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(android.graphics.Rect r4) {
            r3 = this;
            boolean r0 = r3.s
            if (r0 == 0) goto L17
            ia r0 = r3.r
            int r1 = r0.l
            r2 = 1
            if (r1 == r2) goto Lf
            int r0 = r0.k
            if (r0 != r2) goto L17
        Lf:
            android.graphics.Rect r0 = r3.getCloseIconTouchBoundsInt()
            r4.set(r0)
            return
        L17:
            super.getFocusedRect(r4)
            return
    }

    public defpackage.bw getHideMotionSpec() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            bw r0 = r0.V
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getIconEndPadding() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.Y
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getIconStartPadding() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.X
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.D
            return r0
        L7:
            r0 = 0
            return r0
    }

    public defpackage.f30 getShapeAppearanceModel() {
            r1 = this;
            ka r0 = r1.e
            du r0 = r0.a
            f30 r0 = r0.a
            return r0
    }

    public defpackage.bw getShowMotionSpec() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            bw r0 = r0.U
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getTextEndPadding() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.a0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getTextStartPadding() {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.Z
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            ka r0 = r1.e
            defpackage.gt.D(r1, r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.chip.Chip.x
            android.view.View.mergeDrawableStates(r2, r0)
        L11:
            ka r0 = r1.e
            if (r0 == 0) goto L1e
            boolean r0 = r0.Q
            if (r0 == 0) goto L1e
            int[] r0 = com.google.android.material.chip.Chip.y
            android.view.View.mergeDrawableStates(r2, r0)
        L1e:
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean r4, int r5, android.graphics.Rect r6) {
            r3 = this;
            super.onFocusChanged(r4, r5, r6)
            boolean r0 = r3.s
            if (r0 == 0) goto L17
            ia r0 = r3.r
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L12
            r0.j(r1)
        L12:
            if (r4 == 0) goto L17
            r0.m(r5, r6)
        L17:
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 7
            if (r0 == r1) goto L11
            r1 = 10
            if (r0 == r1) goto Lc
            goto L24
        Lc:
            r0 = 0
            r3.setCloseIconHovered(r0)
            goto L24
        L11:
            android.graphics.RectF r0 = r3.getCloseIconTouchBounds()
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.contains(r1, r2)
            r3.setCloseIconHovered(r0)
        L24:
            boolean r4 = super.onHoverEvent(r4)
            return r4
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.CharSequence r0 = r1.getAccessibilityClassName()
            r2.setClassName(r0)
            ka r0 = r1.e
            if (r0 == 0) goto L14
            boolean r0 = r0.Q
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r2.setCheckable(r0)
            boolean r0 = r1.isClickable()
            r2.setClickable(r0)
            r1.getParent()
            return
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent r4, int r5) {
            r3 = this;
            android.graphics.RectF r0 = r3.getCloseIconTouchBounds()
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.contains(r1, r2)
            if (r0 == 0) goto L23
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L23
            android.content.Context r4 = r3.getContext()
            r5 = 1002(0x3ea, float:1.404E-42)
            android.view.PointerIcon r4 = android.view.PointerIcon.getSystemIcon(r4, r5)
            return r4
        L23:
            android.view.PointerIcon r4 = super.onResolvePointerIcon(r4, r5)
            return r4
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int r2) {
            r1 = this;
            super.onRtlPropertiesChanged(r2)
            int r0 = r1.o
            if (r0 == r2) goto Lc
            r1.o = r2
            r1.f()
        Lc:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.s
            if (r0 == 0) goto L43
            ia r0 = r5.r
            r0.p(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
    }

    public void setAccessibilityClassName(java.lang.CharSequence r1) {
            r0 = this;
            r0.q = r1
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto L12
            android.graphics.drawable.RippleDrawable r0 = r1.g
            if (r2 == r0) goto L12
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
        L12:
            super.setBackground(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background color; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    @Override // defpackage.y2, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto L12
            android.graphics.drawable.RippleDrawable r0 = r1.g
            if (r2 == r0) goto L12
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background drawable; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
        L12:
            super.setBackgroundDrawable(r2)
            return
    }

    @Override // defpackage.y2, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background resource; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background tint list; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background tint mode; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.w(r2)
        L7:
            return
    }

    public void setCheckableResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            boolean r3 = r1.getBoolean(r3)
            r0.w(r3)
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 != 0) goto L7
            r1.j = r2
            return
        L7:
            boolean r0 = r0.Q
            if (r0 == 0) goto Le
            super.setChecked(r2)
        Le:
            return
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.x(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabled(boolean r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabledResource(int r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    public void setCheckedIconResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.e0
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r1, r3)
            r0.x(r3)
        Ld:
            return
    }

    public void setCheckedIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.y(r2)
        L7:
            return
    }

    public void setCheckedIconTintResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.e0
            android.content.res.ColorStateList r3 = defpackage.ip.v(r1, r3)
            r0.y(r3)
        Ld:
            return
    }

    public void setCheckedIconVisible(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            boolean r3 = r1.getBoolean(r3)
            r0.z(r3)
        L11:
            return
    }

    public void setCheckedIconVisible(boolean r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.z(r2)
        L7:
            return
    }

    public void setChipBackgroundColor(android.content.res.ColorStateList r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.res.ColorStateList r1 = r0.y
            if (r1 == r3) goto L11
            r0.y = r3
            int[] r3 = r0.getState()
            r0.onStateChange(r3)
        L11:
            return
    }

    public void setChipBackgroundColorResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L17
            android.content.Context r1 = r0.e0
            android.content.res.ColorStateList r3 = defpackage.ip.v(r1, r3)
            android.content.res.ColorStateList r1 = r0.y
            if (r1 == r3) goto L17
            r0.y = r3
            int[] r3 = r0.getState()
            r0.onStateChange(r3)
        L17:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadius(float r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.A(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadiusResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.A(r3)
        L11:
            return
    }

    public void setChipDrawable(defpackage.ka r4) {
            r3 = this;
            ka r0 = r3.e
            if (r0 == r4) goto L1f
            if (r0 == 0) goto Le
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = 0
            r1.<init>(r2)
            r0.A0 = r1
        Le:
            r3.e = r4
            r0 = 0
            r4.C0 = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r4.A0 = r0
            int r4 = r3.p
            r3.b(r4)
        L1f:
            return
    }

    public void setChipEndPadding(float r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.d0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.d0 = r3
            r0.invalidateSelf()
            r0.u()
        L12:
            return
    }

    public void setChipEndPaddingResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.d0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.d0 = r3
            r0.invalidateSelf()
            r0.u()
        L1c:
            return
    }

    public void setChipIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.B(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabled(boolean r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabledResource(int r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    public void setChipIconResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.e0
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r1, r3)
            r0.B(r3)
        Ld:
            return
    }

    public void setChipIconSize(float r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.C(r2)
        L7:
            return
    }

    public void setChipIconSizeResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.C(r3)
        L11:
            return
    }

    public void setChipIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.D(r2)
        L7:
            return
    }

    public void setChipIconTintResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.e0
            android.content.res.ColorStateList r3 = defpackage.ip.v(r1, r3)
            r0.D(r3)
        Ld:
            return
    }

    public void setChipIconVisible(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            boolean r3 = r1.getBoolean(r3)
            r0.E(r3)
        L11:
            return
    }

    public void setChipIconVisible(boolean r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.E(r2)
        L7:
            return
    }

    public void setChipMinHeight(float r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.z
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.z = r3
            r0.invalidateSelf()
            r0.u()
        L12:
            return
    }

    public void setChipMinHeightResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.z
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.z = r3
            r0.invalidateSelf()
            r0.u()
        L1c:
            return
    }

    public void setChipStartPadding(float r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.W
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.W = r3
            r0.invalidateSelf()
            r0.u()
        L12:
            return
    }

    public void setChipStartPaddingResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.W
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.W = r3
            r0.invalidateSelf()
            r0.u()
        L1c:
            return
    }

    public void setChipStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.F(r2)
        L7:
            return
    }

    public void setChipStrokeColorResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.e0
            android.content.res.ColorStateList r3 = defpackage.ip.v(r1, r3)
            r0.F(r3)
        Ld:
            return
    }

    public void setChipStrokeWidth(float r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.G(r2)
        L7:
            return
    }

    public void setChipStrokeWidthResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.G(r3)
        L11:
            return
    }

    @java.lang.Deprecated
    public void setChipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setText(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipTextResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            return
    }

    public void setCloseIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.H(r2)
        L7:
            r1.d()
            return
    }

    public void setCloseIconContentDescription(java.lang.CharSequence r4) {
            r3 = this;
            ka r0 = r3.e
            if (r0 == 0) goto L2a
            android.text.SpannableStringBuilder r1 = r0.P
            if (r1 == r4) goto L2a
            java.lang.String r1 = defpackage.m7.b
            java.util.Locale r1 = java.util.Locale.getDefault()
            int r2 = defpackage.i60.a
            int r1 = defpackage.h60.a(r1)
            r2 = 1
            if (r1 != r2) goto L1a
            m7 r1 = defpackage.m7.e
            goto L1c
        L1a:
            m7 r1 = defpackage.m7.d
        L1c:
            r1.getClass()
            r7 r2 = defpackage.b60.a
            android.text.SpannableStringBuilder r4 = r1.c(r4)
            r0.P = r4
            r0.invalidateSelf()
        L2a:
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabled(boolean r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabledResource(int r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    public void setCloseIconEndPadding(float r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.I(r2)
        L7:
            return
    }

    public void setCloseIconEndPaddingResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.I(r3)
        L11:
            return
    }

    public void setCloseIconResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.e0
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r1, r3)
            r0.H(r3)
        Ld:
            r2.d()
            return
    }

    public void setCloseIconSize(float r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.J(r2)
        L7:
            return
    }

    public void setCloseIconSizeResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.J(r3)
        L11:
            return
    }

    public void setCloseIconStartPadding(float r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.K(r2)
        L7:
            return
    }

    public void setCloseIconStartPaddingResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.K(r3)
        L11:
            return
    }

    public void setCloseIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.L(r2)
        L7:
            return
    }

    public void setCloseIconTintResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.e0
            android.content.res.ColorStateList r3 = defpackage.ip.v(r1, r3)
            r0.L(r3)
        Ld:
            return
    }

    public void setCloseIconVisible(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setCloseIconVisible(r2)
            return
    }

    public void setCloseIconVisible(boolean r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.M(r2)
        L7:
            r1.d()
            return
    }

    @Override // defpackage.y2, android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawables(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // defpackage.y2, android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set right drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            ka r0 = r1.e
            if (r0 == 0) goto La
            r0.i(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setEllipsize(android.text.TextUtils.TruncateAt r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 != 0) goto L5
            goto L12
        L5:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            if (r2 == r0) goto L13
            super.setEllipsize(r2)
            ka r0 = r1.e
            if (r0 == 0) goto L12
            r0.B0 = r2
        L12:
            return
        L13:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Text within a chip are not allowed to scroll."
            r2.<init>(r0)
            throw r2
    }

    public void setEnsureMinTouchTargetSize(boolean r1) {
            r0 = this;
            r0.n = r1
            int r1 = r0.p
            r0.b(r1)
            return
    }

    @Override // android.widget.TextView
    public void setGravity(int r2) {
            r1 = this;
            r0 = 8388627(0x800013, float:1.175497E-38)
            if (r2 == r0) goto Ld
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r2, r0)
            return
        Ld:
            super.setGravity(r2)
            return
    }

    public void setHideMotionSpec(defpackage.bw r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L6
            r0.V = r2
        L6:
            return
    }

    public void setHideMotionSpecResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto Lc
            android.content.Context r1 = r0.e0
            bw r3 = defpackage.bw.a(r1, r3)
            r0.V = r3
        Lc:
            return
    }

    public void setIconEndPadding(float r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.N(r2)
        L7:
            return
    }

    public void setIconEndPaddingResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.N(r3)
        L11:
            return
    }

    public void setIconStartPadding(float r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.O(r2)
        L7:
            return
    }

    public void setIconStartPaddingResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.O(r3)
        L11:
            return
    }

    public void setInternalOnCheckedChangeListener(defpackage.yt r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setLayoutDirection(int r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 != 0) goto L5
            return
        L5:
            super.setLayoutDirection(r2)
            return
    }

    @Override // android.widget.TextView
    public void setLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.TextView
    public void setMaxLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setMaxLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int r2) {
            r1 = this;
            super.setMaxWidth(r2)
            ka r0 = r1.e
            if (r0 == 0) goto L9
            r0.D0 = r2
        L9:
            return
    }

    @Override // android.widget.TextView
    public void setMinLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setMinLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void setOnCloseIconClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.h = r1
            r0.d()
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.P(r2)
        L7:
            ka r2 = r1.e
            r2.getClass()
            r1.e()
            return
    }

    public void setRippleColorResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L15
            android.content.Context r1 = r0.e0
            android.content.res.ColorStateList r3 = defpackage.ip.v(r1, r3)
            r0.P(r3)
            ka r3 = r2.e
            r3.getClass()
            r2.e()
        L15:
            return
    }

    @Override // defpackage.q30
    public void setShapeAppearanceModel(defpackage.f30 r2) {
            r1 = this;
            ka r0 = r1.e
            r0.setShapeAppearanceModel(r2)
            return
    }

    public void setShowMotionSpec(defpackage.bw r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L6
            r0.U = r2
        L6:
            return
    }

    public void setShowMotionSpecResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto Lc
            android.content.Context r1 = r0.e0
            bw r3 = defpackage.bw.a(r1, r3)
            r0.U = r3
        Lc:
            return
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            super.setSingleLine(r2)
            return
        L6:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.TextView
    public final void setText(java.lang.CharSequence r2, android.widget.TextView.BufferType r3) {
            r1 = this;
            ka r0 = r1.e
            if (r0 != 0) goto L5
            goto L2c
        L5:
            if (r2 != 0) goto L9
            java.lang.String r2 = ""
        L9:
            boolean r0 = r0.C0
            if (r0 == 0) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = r2
        L10:
            super.setText(r0, r3)
            ka r3 = r1.e
            if (r3 == 0) goto L2c
            java.lang.CharSequence r0 = r3.E
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L2c
            r3.E = r2
            d60 r2 = r3.k0
            r0 = 1
            r2.d = r0
            r3.invalidateSelf()
            r3.u()
        L2c:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r4) {
            r3 = this;
            super.setTextAppearance(r4)
            ka r0 = r3.e
            if (r0 == 0) goto L11
            a60 r1 = new a60
            android.content.Context r2 = r0.e0
            r1.<init>(r2, r4)
            r0.Q(r1)
        L11:
            r3.g()
            return
    }

    public void setTextAppearance(defpackage.a60 r2) {
            r1 = this;
            ka r0 = r1.e
            if (r0 == 0) goto L7
            r0.Q(r2)
        L7:
            r1.g()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r3, int r4) {
            r2 = this;
            super.setTextAppearance(r3, r4)
            ka r3 = r2.e
            if (r3 == 0) goto L11
            a60 r0 = new a60
            android.content.Context r1 = r3.e0
            r0.<init>(r1, r4)
            r3.Q(r0)
        L11:
            r2.g()
            return
    }

    public void setTextAppearanceResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            r1.setTextAppearance(r0, r2)
            return
    }

    public void setTextEndPadding(float r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.a0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.a0 = r3
            r0.invalidateSelf()
            r0.u()
        L12:
            return
    }

    public void setTextEndPaddingResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.a0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.a0 = r3
            r0.invalidateSelf()
            r0.u()
        L1c:
            return
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
            r2 = this;
            super.setTextSize(r3, r4)
            ka r0 = r2.e
            if (r0 == 0) goto L26
            android.content.res.Resources r1 = r2.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r1)
            d60 r4 = r0.k0
            a60 r1 = r4.f
            if (r1 == 0) goto L26
            r1.k = r3
            android.text.TextPaint r4 = r4.a
            r4.setTextSize(r3)
            r0.u()
            r0.invalidateSelf()
        L26:
            r2.g()
            return
    }

    public void setTextStartPadding(float r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.Z
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.Z = r3
            r0.invalidateSelf()
            r0.u()
        L12:
            return
    }

    public void setTextStartPaddingResource(int r3) {
            r2 = this;
            ka r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.e0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.Z
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.Z = r3
            r0.invalidateSelf()
            r0.u()
        L1c:
            return
    }
}
