package com.google.android.material.chip;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends a.J0 implements com.google.android.material.chip.a.InterfaceC0030a, a.Zd, android.widget.Checkable {
    public static final int w = 0;
    public static final android.graphics.Rect x = null;
    public static final int[] y = null;
    public static final int[] z = null;
    public com.google.android.material.chip.a e;
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
    public final com.google.android.material.chip.Chip.b r;
    public boolean s;
    public final android.graphics.Rect t;
    public final android.graphics.RectF u;
    public final com.google.android.material.chip.Chip.a v;

    public class a extends a.AbstractC0040a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.chip.Chip f1065a;

        public a(com.google.android.material.chip.Chip r1) {
                r0 = this;
                r0.<init>()
                r0.f1065a = r1
                return
        }

        @Override // a.AbstractC0040a2
        public final void d(int r1) {
                r0 = this;
                return
        }

        @Override // a.AbstractC0040a2
        public final void e(android.graphics.Typeface r2, boolean r3) {
                r1 = this;
                com.google.android.material.chip.Chip r2 = r1.f1065a
                com.google.android.material.chip.a r3 = r2.e
                boolean r0 = r3.D0
                if (r0 == 0) goto Lb
                java.lang.CharSequence r3 = r3.F
                goto Lf
            Lb:
                java.lang.CharSequence r3 = r2.getText()
            Lf:
                r2.setText(r3)
                r2.requestLayout()
                r2.invalidate()
                return
        }
    }

    public class b extends a.AbstractC0172h6 {
        public final /* synthetic */ com.google.android.material.chip.Chip q;

        public b(com.google.android.material.chip.Chip r1, com.google.android.material.chip.Chip r2) {
                r0 = this;
                r0.q = r1
                r0.<init>(r2)
                return
        }

        @Override // a.AbstractC0172h6
        public final void l(java.util.ArrayList r3) {
                r2 = this;
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3.add(r0)
                int r0 = com.google.android.material.chip.Chip.w
                com.google.android.material.chip.Chip r0 = r2.q
                boolean r1 = r0.d()
                if (r1 == 0) goto L26
                com.google.android.material.chip.a r1 = r0.e
                if (r1 == 0) goto L26
                boolean r1 = r1.L
                if (r1 == 0) goto L26
                android.view.View$OnClickListener r0 = r0.h
                if (r0 == 0) goto L26
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3.add(r0)
            L26:
                return
        }

        @Override // a.AbstractC0172h6
        public final void o(int r7, a.I r8) {
                r6 = this;
                android.view.accessibility.AccessibilityNodeInfo r0 = r8.f118a
                r1 = 1
                java.lang.String r2 = ""
                if (r7 != r1) goto L47
                com.google.android.material.chip.Chip r7 = r6.q
                java.lang.CharSequence r1 = r7.getCloseIconContentDescription()
                if (r1 == 0) goto L13
                r0.setContentDescription(r1)
                goto L33
            L13:
                java.lang.CharSequence r1 = r7.getText()
                android.content.Context r3 = r7.getContext()
                int r4 = com.google.android.material.R.string.mtrl_chip_close_icon_content_description
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L24
                r2 = r1
            L24:
                java.lang.Object[] r1 = new java.lang.Object[]{r2}
                java.lang.String r1 = r3.getString(r4, r1)
                java.lang.String r1 = r1.trim()
                r0.setContentDescription(r1)
            L33:
                android.graphics.Rect r1 = com.google.android.material.chip.Chip.b(r7)
                r0.setBoundsInParent(r1)
                a.I$a r1 = a.I.a.e
                r8.b(r1)
                boolean r7 = r7.isEnabled()
                r0.setEnabled(r7)
                return
            L47:
                r0.setContentDescription(r2)
                android.graphics.Rect r7 = com.google.android.material.chip.Chip.x
                r0.setBoundsInParent(r7)
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Action
            com.google.android.material.chip.Chip.w = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.google.android.material.chip.Chip.x = r0
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.chip.Chip.y = r0
            r0 = 16842911(0x101009f, float:2.3694004E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.chip.Chip.z = r0
            return
    }

    public Chip(android.content.Context r14, android.util.AttributeSet r15) {
            r13 = this;
            int r3 = com.google.android.material.R.attr.chipStyle
            int r4 = com.google.android.material.chip.Chip.w
            android.content.Context r14 = a.Wa.a(r14, r15, r3, r4)
            r13.<init>(r14, r15, r3)
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            r13.t = r14
            android.graphics.RectF r14 = new android.graphics.RectF
            r14.<init>()
            r13.u = r14
            com.google.android.material.chip.Chip$a r14 = new com.google.android.material.chip.Chip$a
            r14.<init>(r13)
            r13.v = r14
            android.content.Context r14 = r13.getContext()
            r6 = 1
            r7 = 8388627(0x800013, float:1.175497E-38)
            if (r15 != 0) goto L2b
            goto L8b
        L2b:
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = "background"
            java.lang.String r1 = r15.getAttributeValue(r0, r1)
            java.lang.String r2 = "Chip"
            if (r1 == 0) goto L3c
            java.lang.String r1 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r2, r1)
        L3c:
            java.lang.String r1 = "drawableLeft"
            java.lang.String r1 = r15.getAttributeValue(r0, r1)
            if (r1 != 0) goto L3b7
            java.lang.String r1 = "drawableStart"
            java.lang.String r1 = r15.getAttributeValue(r0, r1)
            if (r1 != 0) goto L3af
            java.lang.String r1 = "drawableEnd"
            java.lang.String r1 = r15.getAttributeValue(r0, r1)
            java.lang.String r5 = "Please set end drawable using R.attr#closeIcon."
            if (r1 != 0) goto L3a9
            java.lang.String r1 = "drawableRight"
            java.lang.String r1 = r15.getAttributeValue(r0, r1)
            if (r1 != 0) goto L3a3
            java.lang.String r1 = "singleLine"
            boolean r1 = r15.getAttributeBooleanValue(r0, r1, r6)
            if (r1 == 0) goto L39b
            java.lang.String r1 = "lines"
            int r1 = r15.getAttributeIntValue(r0, r1, r6)
            if (r1 != r6) goto L39b
            java.lang.String r1 = "minLines"
            int r1 = r15.getAttributeIntValue(r0, r1, r6)
            if (r1 != r6) goto L39b
            java.lang.String r1 = "maxLines"
            int r1 = r15.getAttributeIntValue(r0, r1, r6)
            if (r1 != r6) goto L39b
            java.lang.String r1 = "gravity"
            int r0 = r15.getAttributeIntValue(r0, r1, r7)
            if (r0 == r7) goto L8b
            java.lang.String r0 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r2, r0)
        L8b:
            com.google.android.material.chip.a r8 = new com.google.android.material.chip.a
            r8.<init>(r14, r15, r3)
            int[] r2 = com.google.android.material.R.styleable.Chip
            r9 = 0
            int[] r5 = new int[r9]
            android.content.Context r0 = r8.f0
            r1 = r15
            android.content.res.TypedArray r15 = a.C0091cf.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.Chip_shapeAppearance
            boolean r0 = r15.hasValue(r0)
            r8.F0 = r0
            int r0 = com.google.android.material.R.styleable.Chip_chipSurfaceColor
            android.content.Context r2 = r8.f0
            android.content.res.ColorStateList r0 = a.Sa.b(r2, r15, r0)
            android.content.res.ColorStateList r5 = r8.y
            if (r5 == r0) goto Lb9
            r8.y = r0
            int[] r0 = r8.getState()
            r8.onStateChange(r0)
        Lb9:
            int r0 = com.google.android.material.R.styleable.Chip_chipBackgroundColor
            android.content.res.ColorStateList r0 = a.Sa.b(r2, r15, r0)
            android.content.res.ColorStateList r5 = r8.z
            if (r5 == r0) goto Lcc
            r8.z = r0
            int[] r0 = r8.getState()
            r8.onStateChange(r0)
        Lcc:
            int r0 = com.google.android.material.R.styleable.Chip_chipMinHeight
            r5 = 0
            float r0 = r15.getDimension(r0, r5)
            float r10 = r8.A
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 == 0) goto Le1
            r8.A = r0
            r8.invalidateSelf()
            r8.v()
        Le1:
            int r0 = com.google.android.material.R.styleable.Chip_chipCornerRadius
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto Lf2
            int r0 = com.google.android.material.R.styleable.Chip_chipCornerRadius
            float r0 = r15.getDimension(r0, r5)
            r8.B(r0)
        Lf2:
            int r0 = com.google.android.material.R.styleable.Chip_chipStrokeColor
            android.content.res.ColorStateList r0 = a.Sa.b(r2, r15, r0)
            r8.G(r0)
            int r0 = com.google.android.material.R.styleable.Chip_chipStrokeWidth
            float r0 = r15.getDimension(r0, r5)
            r8.H(r0)
            int r0 = com.google.android.material.R.styleable.Chip_rippleColor
            android.content.res.ColorStateList r0 = a.Sa.b(r2, r15, r0)
            r8.Q(r0)
            int r0 = com.google.android.material.R.styleable.Chip_android_text
            java.lang.CharSequence r0 = r15.getText(r0)
            if (r0 != 0) goto L117
            java.lang.String r0 = ""
        L117:
            java.lang.CharSequence r10 = r8.F
            boolean r10 = android.text.TextUtils.equals(r10, r0)
            if (r10 != 0) goto L12b
            r8.F = r0
            a.Ye r0 = r8.l0
            r0.d = r6
            r8.invalidateSelf()
            r8.v()
        L12b:
            int r0 = com.google.android.material.R.styleable.Chip_android_textAppearance
            boolean r10 = r15.hasValue(r0)
            r11 = 0
            if (r10 == 0) goto L140
            int r0 = r15.getResourceId(r0, r9)
            if (r0 == 0) goto L140
            a.Ve r10 = new a.Ve
            r10.<init>(r2, r0)
            goto L141
        L140:
            r10 = r11
        L141:
            int r0 = com.google.android.material.R.styleable.Chip_android_textSize
            float r12 = r10.k
            float r0 = r15.getDimension(r0, r12)
            r10.k = r0
            r8.R(r10)
            int r0 = com.google.android.material.R.styleable.Chip_android_ellipsize
            int r0 = r15.getInt(r0, r9)
            if (r0 == r6) goto L167
            r10 = 2
            if (r0 == r10) goto L162
            r10 = 3
            if (r0 == r10) goto L15d
            goto L16b
        L15d:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r8.C0 = r0
            goto L16b
        L162:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            r8.C0 = r0
            goto L16b
        L167:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            r8.C0 = r0
        L16b:
            int r0 = com.google.android.material.R.styleable.Chip_chipIconVisible
            boolean r0 = r15.getBoolean(r0, r9)
            r8.F(r0)
            java.lang.String r0 = "http://schemas.android.com/apk/res-auto"
            if (r1 == 0) goto L191
            java.lang.String r10 = "chipIconEnabled"
            java.lang.String r10 = r1.getAttributeValue(r0, r10)
            if (r10 == 0) goto L191
            java.lang.String r10 = "chipIconVisible"
            java.lang.String r10 = r1.getAttributeValue(r0, r10)
            if (r10 != 0) goto L191
            int r10 = com.google.android.material.R.styleable.Chip_chipIconEnabled
            boolean r10 = r15.getBoolean(r10, r9)
            r8.F(r10)
        L191:
            int r10 = com.google.android.material.R.styleable.Chip_chipIcon
            android.graphics.drawable.Drawable r10 = a.Sa.c(r2, r15, r10)
            r8.C(r10)
            int r10 = com.google.android.material.R.styleable.Chip_chipIconTint
            boolean r10 = r15.hasValue(r10)
            if (r10 == 0) goto L1ab
            int r10 = com.google.android.material.R.styleable.Chip_chipIconTint
            android.content.res.ColorStateList r10 = a.Sa.b(r2, r15, r10)
            r8.E(r10)
        L1ab:
            int r10 = com.google.android.material.R.styleable.Chip_chipIconSize
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r15.getDimension(r10, r12)
            r8.D(r10)
            int r10 = com.google.android.material.R.styleable.Chip_closeIconVisible
            boolean r10 = r15.getBoolean(r10, r9)
            r8.N(r10)
            if (r1 == 0) goto L1da
            java.lang.String r10 = "closeIconEnabled"
            java.lang.String r10 = r1.getAttributeValue(r0, r10)
            if (r10 == 0) goto L1da
            java.lang.String r10 = "closeIconVisible"
            java.lang.String r10 = r1.getAttributeValue(r0, r10)
            if (r10 != 0) goto L1da
            int r10 = com.google.android.material.R.styleable.Chip_closeIconEnabled
            boolean r10 = r15.getBoolean(r10, r9)
            r8.N(r10)
        L1da:
            int r10 = com.google.android.material.R.styleable.Chip_closeIcon
            android.graphics.drawable.Drawable r10 = a.Sa.c(r2, r15, r10)
            r8.I(r10)
            int r10 = com.google.android.material.R.styleable.Chip_closeIconTint
            android.content.res.ColorStateList r10 = a.Sa.b(r2, r15, r10)
            r8.M(r10)
            int r10 = com.google.android.material.R.styleable.Chip_closeIconSize
            float r10 = r15.getDimension(r10, r5)
            r8.K(r10)
            int r10 = com.google.android.material.R.styleable.Chip_android_checkable
            boolean r10 = r15.getBoolean(r10, r9)
            r8.x(r10)
            int r10 = com.google.android.material.R.styleable.Chip_checkedIconVisible
            boolean r10 = r15.getBoolean(r10, r9)
            r8.A(r10)
            if (r1 == 0) goto L222
            java.lang.String r10 = "checkedIconEnabled"
            java.lang.String r10 = r1.getAttributeValue(r0, r10)
            if (r10 == 0) goto L222
            java.lang.String r10 = "checkedIconVisible"
            java.lang.String r0 = r1.getAttributeValue(r0, r10)
            if (r0 != 0) goto L222
            int r0 = com.google.android.material.R.styleable.Chip_checkedIconEnabled
            boolean r0 = r15.getBoolean(r0, r9)
            r8.A(r0)
        L222:
            int r0 = com.google.android.material.R.styleable.Chip_checkedIcon
            android.graphics.drawable.Drawable r0 = a.Sa.c(r2, r15, r0)
            r8.y(r0)
            int r0 = com.google.android.material.R.styleable.Chip_checkedIconTint
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L23c
            int r0 = com.google.android.material.R.styleable.Chip_checkedIconTint
            android.content.res.ColorStateList r0 = a.Sa.b(r2, r15, r0)
            r8.z(r0)
        L23c:
            int r0 = com.google.android.material.R.styleable.Chip_showMotionSpec
            boolean r10 = r15.hasValue(r0)
            if (r10 == 0) goto L24f
            int r0 = r15.getResourceId(r0, r9)
            if (r0 == 0) goto L24f
            a.ub r0 = a.C0409ub.a(r2, r0)
            goto L250
        L24f:
            r0 = r11
        L250:
            r8.V = r0
            int r0 = com.google.android.material.R.styleable.Chip_hideMotionSpec
            boolean r10 = r15.hasValue(r0)
            if (r10 == 0) goto L264
            int r0 = r15.getResourceId(r0, r9)
            if (r0 == 0) goto L264
            a.ub r11 = a.C0409ub.a(r2, r0)
        L264:
            r8.W = r11
            int r0 = com.google.android.material.R.styleable.Chip_chipStartPadding
            float r0 = r15.getDimension(r0, r5)
            float r2 = r8.X
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L27a
            r8.X = r0
            r8.invalidateSelf()
            r8.v()
        L27a:
            int r0 = com.google.android.material.R.styleable.Chip_iconStartPadding
            float r0 = r15.getDimension(r0, r5)
            r8.P(r0)
            int r0 = com.google.android.material.R.styleable.Chip_iconEndPadding
            float r0 = r15.getDimension(r0, r5)
            r8.O(r0)
            int r0 = com.google.android.material.R.styleable.Chip_textStartPadding
            float r0 = r15.getDimension(r0, r5)
            float r2 = r8.a0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L2a0
            r8.a0 = r0
            r8.invalidateSelf()
            r8.v()
        L2a0:
            int r0 = com.google.android.material.R.styleable.Chip_textEndPadding
            float r0 = r15.getDimension(r0, r5)
            float r2 = r8.b0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L2b4
            r8.b0 = r0
            r8.invalidateSelf()
            r8.v()
        L2b4:
            int r0 = com.google.android.material.R.styleable.Chip_closeIconStartPadding
            float r0 = r15.getDimension(r0, r5)
            r8.L(r0)
            int r0 = com.google.android.material.R.styleable.Chip_closeIconEndPadding
            float r0 = r15.getDimension(r0, r5)
            r8.J(r0)
            int r0 = com.google.android.material.R.styleable.Chip_chipEndPadding
            float r0 = r15.getDimension(r0, r5)
            float r2 = r8.e0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L2da
            r8.e0 = r0
            r8.invalidateSelf()
            r8.v()
        L2da:
            int r0 = com.google.android.material.R.styleable.Chip_android_maxWidth
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r15.getDimensionPixelSize(r0, r2)
            r8.E0 = r0
            r15.recycle()
            int[] r2 = com.google.android.material.R.styleable.Chip
            int[] r5 = new int[r9]
            a.C0091cf.a(r14, r1, r3, r4)
            r0 = r14
            a.C0091cf.b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r14 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            int r15 = com.google.android.material.R.styleable.Chip_ensureMinTouchTargetSize
            boolean r15 = r14.getBoolean(r15, r9)
            r13.n = r15
            android.content.Context r15 = r13.getContext()
            android.content.res.Resources r15 = r15.getResources()
            r2 = 48
            float r2 = (float) r2
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = android.util.TypedValue.applyDimension(r6, r2, r15)
            double r10 = (double) r15
            double r10 = java.lang.Math.ceil(r10)
            float r15 = (float) r10
            int r2 = com.google.android.material.R.styleable.Chip_chipMinTouchTargetSize
            float r15 = r14.getDimension(r2, r15)
            double r10 = (double) r15
            double r10 = java.lang.Math.ceil(r10)
            int r15 = (int) r10
            r13.p = r15
            r14.recycle()
            r13.setChipDrawable(r8)
            float r14 = a.C0414ug.d.i(r13)
            r8.j(r14)
            int[] r2 = com.google.android.material.R.styleable.Chip
            int[] r5 = new int[r9]
            a.C0091cf.a(r0, r1, r3, r4)
            a.C0091cf.b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r14 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            int r15 = com.google.android.material.R.styleable.Chip_shapeAppearance
            boolean r15 = r14.hasValue(r15)
            r14.recycle()
            com.google.android.material.chip.Chip$b r14 = new com.google.android.material.chip.Chip$b
            r14.<init>(r13, r13)
            r13.r = r14
            r13.e()
            if (r15 != 0) goto L35e
            a.Y2 r14 = new a.Y2
            r14.<init>(r13)
            r13.setOutlineProvider(r14)
        L35e:
            boolean r14 = r13.j
            r13.setChecked(r14)
            java.lang.CharSequence r14 = r8.F
            r13.setText(r14)
            android.text.TextUtils$TruncateAt r14 = r8.C0
            r13.setEllipsize(r14)
            r13.h()
            com.google.android.material.chip.a r14 = r13.e
            boolean r14 = r14.D0
            if (r14 != 0) goto L37c
            r13.setLines(r6)
            r13.setHorizontallyScrolling(r6)
        L37c:
            r13.setGravity(r7)
            r13.g()
            boolean r14 = r13.n
            if (r14 == 0) goto L38b
            int r14 = r13.p
            r13.setMinHeight(r14)
        L38b:
            int r14 = r13.getLayoutDirection()
            r13.o = r14
            a.X2 r14 = new a.X2
            r15 = 0
            r14.<init>(r15, r13)
            super.setOnCheckedChangeListener(r14)
            return
        L39b:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            java.lang.String r15 = "Chip does not support multi-line text"
            r14.<init>(r15)
            throw r14
        L3a3:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            r14.<init>(r5)
            throw r14
        L3a9:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            r14.<init>(r5)
            throw r14
        L3af:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            java.lang.String r15 = "Please set start drawable using R.attr#chipIcon."
            r14.<init>(r15)
            throw r14
        L3b7:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            java.lang.String r15 = "Please set left drawable using R.attr#chipIcon."
            r14.<init>(r15)
            throw r14
    }

    public static /* synthetic */ android.graphics.Rect b(com.google.android.material.chip.Chip r0) {
            android.graphics.Rect r0 = r0.getCloseIconTouchBoundsInt()
            return r0
    }

    private android.graphics.RectF getCloseIconTouchBounds() {
            r5 = this;
            android.graphics.RectF r0 = r5.u
            r0.setEmpty()
            boolean r1 = r5.d()
            if (r1 == 0) goto L4d
            android.view.View$OnClickListener r1 = r5.h
            if (r1 == 0) goto L4d
            com.google.android.material.chip.a r1 = r5.e
            android.graphics.Rect r2 = r1.getBounds()
            r0.setEmpty()
            boolean r3 = r1.U()
            if (r3 == 0) goto L4d
            float r3 = r1.e0
            float r4 = r1.d0
            float r3 = r3 + r4
            float r4 = r1.P
            float r3 = r3 + r4
            float r4 = r1.c0
            float r3 = r3 + r4
            float r4 = r1.b0
            float r3 = r3 + r4
            int r1 = a.C0439w5.b.a(r1)
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

    private a.Ve getTextAppearance() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L9
            a.Ye r0 = r0.l0
            a.Ve r0 = r0.f
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

    @Override // com.google.android.material.chip.a.InterfaceC0030a
    public final void a() {
            r1 = this;
            int r0 = r1.p
            r1.c(r0)
            r1.requestLayout()
            r1.invalidateOutline()
            return
    }

    public final void c(int r11) {
            r10 = this;
            r10.p = r11
            boolean r0 = r10.n
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L23
            android.graphics.drawable.InsetDrawable r11 = r10.f
            if (r11 == 0) goto L1f
            if (r11 == 0) goto L54
            r10.f = r1
            r10.setMinWidth(r2)
            float r11 = r10.getChipMinHeight()
            int r11 = (int) r11
            r10.setMinHeight(r11)
            r10.f()
            return
        L1f:
            r10.f()
            return
        L23:
            com.google.android.material.chip.a r0 = r10.e
            float r0 = r0.A
            int r0 = (int) r0
            int r0 = r11 - r0
            int r0 = java.lang.Math.max(r2, r0)
            com.google.android.material.chip.a r3 = r10.e
            int r3 = r3.getIntrinsicWidth()
            int r3 = r11 - r3
            int r3 = java.lang.Math.max(r2, r3)
            if (r3 > 0) goto L59
            if (r0 > 0) goto L59
            android.graphics.drawable.InsetDrawable r11 = r10.f
            if (r11 == 0) goto L55
            if (r11 == 0) goto L54
            r10.f = r1
            r10.setMinWidth(r2)
            float r11 = r10.getChipMinHeight()
            int r11 = (int) r11
            r10.setMinHeight(r11)
            r10.f()
        L54:
            return
        L55:
            r10.f()
            return
        L59:
            if (r3 <= 0) goto L5f
            int r3 = r3 / 2
            r6 = r3
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r0 <= 0) goto L64
            int r2 = r0 / 2
        L64:
            r7 = r2
            android.graphics.drawable.InsetDrawable r0 = r10.f
            if (r0 == 0) goto L87
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r1 = r10.f
            r1.getPadding(r0)
            int r1 = r0.top
            if (r1 != r7) goto L87
            int r1 = r0.bottom
            if (r1 != r7) goto L87
            int r1 = r0.left
            if (r1 != r6) goto L87
            int r0 = r0.right
            if (r0 != r6) goto L87
            r10.f()
            return
        L87:
            int r0 = r10.getMinHeight()
            if (r0 == r11) goto L90
            r10.setMinHeight(r11)
        L90:
            int r0 = r10.getMinWidth()
            if (r0 == r11) goto L99
            r10.setMinWidth(r11)
        L99:
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            com.google.android.material.chip.a r5 = r10.e
            r8 = r6
            r9 = r7
            r4.<init>(r5, r6, r7, r8, r9)
            r10.f = r4
            r10.f()
            return
    }

    public final boolean d() {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r0.M
            if (r0 == 0) goto L13
            boolean r1 = r0 instanceof a.vh
            if (r1 == 0) goto L14
            a.vh r0 = (a.vh) r0
            android.graphics.drawable.Drawable r0 = r0.a()
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
            r9 = this;
            boolean r0 = r9.s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$b r0 = r9.r
            android.view.accessibility.AccessibilityManager r1 = r0.h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L6c
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6c
        L1c:
            int r1 = r10.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 7
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r5) goto L3d
            r5 = 9
            if (r1 == r5) goto L3d
            r5 = 10
            if (r1 == r5) goto L30
            goto L6c
        L30:
            int r1 = r0.m
            if (r1 == r6) goto L6c
            if (r1 != r6) goto L37
            goto L72
        L37:
            r0.m = r6
            r0.q(r1, r2)
            return r3
        L3d:
            float r1 = r10.getX()
            float r5 = r10.getY()
            com.google.android.material.chip.Chip r7 = r0.q
            boolean r8 = r7.d()
            if (r8 == 0) goto L59
            android.graphics.RectF r7 = r7.getCloseIconTouchBounds()
            boolean r1 = r7.contains(r1, r5)
            if (r1 == 0) goto L59
            r1 = r3
            goto L5a
        L59:
            r1 = r4
        L5a:
            int r5 = r0.m
            if (r5 != r1) goto L5f
            goto L69
        L5f:
            r0.m = r1
            r7 = 128(0x80, float:1.8E-43)
            r0.q(r1, r7)
            r0.q(r5, r2)
        L69:
            if (r1 == r6) goto L6c
            goto L72
        L6c:
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L73
        L72:
            return r3
        L73:
            return r4
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
            r9 = this;
            boolean r0 = r9.s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$b r0 = r9.r
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L9d
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
            int r1 = r1 + r3
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r3
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
            if (r1 == r4) goto L85
            com.google.android.material.chip.Chip r5 = r0.q
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r3) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.s
            if (r1 == 0) goto L85
            com.google.android.material.chip.Chip$b r1 = r5.r
            r1.q(r3, r3)
        L85:
            r2 = r3
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m(r3, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.l
            if (r0 == r4) goto La4
            return r3
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
    }

    @Override // a.J0, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r5 = this;
            super.drawableStateChanged()
            com.google.android.material.chip.a r0 = r5.e
            r1 = 0
            if (r0 == 0) goto L84
            android.graphics.drawable.Drawable r0 = r0.M
            boolean r0 = com.google.android.material.chip.a.u(r0)
            if (r0 == 0) goto L84
            com.google.android.material.chip.a r0 = r5.e
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
            int[] r3 = r0.z0
            boolean r3 = java.util.Arrays.equals(r3, r2)
            if (r3 != 0) goto L84
            r0.z0 = r2
            boolean r3 = r0.U()
            if (r3 == 0) goto L84
            int[] r1 = r0.getState()
            boolean r1 = r0.w(r1, r2)
        L84:
            if (r1 == 0) goto L89
            r5.invalidate()
        L89:
            return
    }

    public final void e() {
            r1 = this;
            boolean r0 = r1.d()
            if (r0 == 0) goto L1b
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L1b
            boolean r0 = r0.L
            if (r0 == 0) goto L1b
            android.view.View$OnClickListener r0 = r1.h
            if (r0 == 0) goto L1b
            com.google.android.material.chip.Chip$b r0 = r1.r
            a.C0414ug.j(r1, r0)
            r0 = 1
            r1.s = r0
            return
        L1b:
            r0 = 0
            a.C0414ug.j(r1, r0)
            r0 = 0
            r1.s = r0
            return
    }

    public final void f() {
            r4 = this;
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            com.google.android.material.chip.a r1 = r4.e
            android.content.res.ColorStateList r1 = r1.E
            if (r1 == 0) goto L9
            goto Le
        L9:
            r1 = 0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        Le:
            android.graphics.drawable.Drawable r2 = r4.getBackgroundDrawable()
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.g = r0
            com.google.android.material.chip.a r0 = r4.e
            r0.getClass()
            android.graphics.drawable.RippleDrawable r0 = r4.g
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            r4.setBackground(r0)
            r4.g()
            return
    }

    public final void g() {
            r5 = this;
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L48
            com.google.android.material.chip.a r0 = r5.e
            if (r0 != 0) goto Lf
            goto L48
        Lf:
            float r1 = r0.e0
            float r2 = r0.b0
            float r1 = r1 + r2
            float r0 = r0.r()
            float r0 = r0 + r1
            int r0 = (int) r0
            com.google.android.material.chip.a r1 = r5.e
            float r2 = r1.X
            float r3 = r1.a0
            float r2 = r2 + r3
            float r1 = r1.q()
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
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            r5.setPaddingRelative(r1, r2, r0, r3)
        L48:
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
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L15
            boolean r0 = r0.R
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L28
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof a.Z2
            if (r1 != 0) goto L21
            goto L2e
        L21:
            a.Z2 r0 = (a.Z2) r0
            r0.getClass()
            r0 = 0
            throw r0
        L28:
            boolean r0 = r2.isClickable()
            if (r0 == 0) goto L31
        L2e:
            java.lang.String r0 = "android.widget.Button"
            return r0
        L31:
            java.lang.String r0 = "android.view.View"
            return r0
    }

    public android.graphics.drawable.Drawable getBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.InsetDrawable r0 = r1.f
            if (r0 != 0) goto L6
            com.google.android.material.chip.a r0 = r1.e
        L6:
            return r0
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            android.graphics.drawable.Drawable r0 = r0.T
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.U
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getChipBackgroundColor() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.z
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipCornerRadius() {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            r1 = 0
            if (r0 == 0) goto Le
            float r0 = r0.s()
            float r0 = java.lang.Math.max(r1, r0)
            return r0
        Le:
            return r1
    }

    public android.graphics.drawable.Drawable getChipDrawable() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            return r0
    }

    public float getChipEndPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.e0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getChipIcon() {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            r1 = 0
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r0.H
            if (r0 == 0) goto L14
            boolean r1 = r0 instanceof a.vh
            if (r1 == 0) goto L13
            a.vh r0 = (a.vh) r0
            android.graphics.drawable.Drawable r0 = r0.a()
        L13:
            return r0
        L14:
            return r1
    }

    public float getChipIconSize() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.J
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getChipIconTint() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.I
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipMinHeight() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.A
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipStartPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.X
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getChipStrokeColor() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.C
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipStrokeWidth() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.D
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
            com.google.android.material.chip.a r0 = r2.e
            r1 = 0
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r0.M
            if (r0 == 0) goto L14
            boolean r1 = r0 instanceof a.vh
            if (r1 == 0) goto L13
            a.vh r0 = (a.vh) r0
            android.graphics.drawable.Drawable r0 = r0.a()
        L13:
            return r0
        L14:
            return r1
    }

    public java.lang.CharSequence getCloseIconContentDescription() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            android.text.SpannableStringBuilder r0 = r0.Q
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getCloseIconEndPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.d0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getCloseIconSize() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.P
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getCloseIconStartPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.c0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getCloseIconTint() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.O
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView
    public android.text.TextUtils.TruncateAt getEllipsize() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            android.text.TextUtils$TruncateAt r0 = r0.C0
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
            com.google.android.material.chip.Chip$b r0 = r3.r
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

    public a.C0409ub getHideMotionSpec() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            a.ub r0 = r0.W
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getIconEndPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.Z
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getIconStartPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.Y
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.E
            return r0
        L7:
            r0 = 0
            return r0
    }

    public a.Vd getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            a.Ta$b r0 = r0.f278a
            a.Vd r0 = r0.f280a
            return r0
    }

    public a.C0409ub getShowMotionSpec() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            a.ub r0 = r0.V
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getTextEndPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.b0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getTextStartPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            float r0 = r0.a0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final void h() {
            r4 = this;
            android.text.TextPaint r0 = r4.getPaint()
            com.google.android.material.chip.a r1 = r4.e
            if (r1 == 0) goto Le
            int[] r1 = r1.getState()
            r0.drawableState = r1
        Le:
            a.Ve r1 = r4.getTextAppearance()
            if (r1 == 0) goto L1d
            android.content.Context r2 = r4.getContext()
            com.google.android.material.chip.Chip$a r3 = r4.v
            r1.e(r2, r0, r3)
        L1d:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.chip.a r0 = r1.e
            a.C0282n9.A(r1, r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.chip.Chip.y
            android.view.View.mergeDrawableStates(r2, r0)
        L11:
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L1e
            boolean r0 = r0.R
            if (r0 == 0) goto L1e
            int[] r0 = com.google.android.material.chip.Chip.z
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
            com.google.android.material.chip.Chip$b r0 = r3.r
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
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r11) {
            r10 = this;
            super.onInitializeAccessibilityNodeInfo(r11)
            java.lang.CharSequence r0 = r10.getAccessibilityClassName()
            r11.setClassName(r0)
            com.google.android.material.chip.a r0 = r10.e
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = r0.R
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = r1
        L16:
            r11.setCheckable(r0)
            boolean r0 = r10.isClickable()
            r11.setClickable(r0)
            android.view.ViewParent r0 = r10.getParent()
            boolean r0 = r0 instanceof a.Z2
            if (r0 == 0) goto L7b
            android.view.ViewParent r0 = r10.getParent()
            a.Z2 r0 = (a.Z2) r0
            boolean r2 = r0.c
            r3 = -1
            if (r2 == 0) goto L59
            r2 = r1
        L34:
            int r4 = r0.getChildCount()
            if (r1 >= r4) goto L56
            android.view.View r4 = r0.getChildAt(r1)
            boolean r5 = r4 instanceof com.google.android.material.chip.Chip
            if (r5 == 0) goto L53
            android.view.View r5 = r0.getChildAt(r1)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L53
            com.google.android.material.chip.Chip r4 = (com.google.android.material.chip.Chip) r4
            if (r4 != r10) goto L51
            goto L57
        L51:
            int r2 = r2 + 1
        L53:
            int r1 = r1 + 1
            goto L34
        L56:
            r2 = r3
        L57:
            r6 = r2
            goto L5a
        L59:
            r6 = r3
        L5a:
            int r0 = com.google.android.material.R.id.row_index_key
            java.lang.Object r0 = r10.getTag(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 != 0) goto L66
        L64:
            r4 = r3
            goto L6d
        L66:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            goto L64
        L6d:
            boolean r9 = r10.isChecked()
            r8 = 0
            r5 = 1
            r7 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r4, r5, r6, r7, r8, r9)
            r11.setCollectionItemInfo(r0)
        L7b:
            return
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @android.annotation.TargetApi(24)
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
    @android.annotation.TargetApi(17)
    public final void onRtlPropertiesChanged(int r2) {
            r1 = this;
            super.onRtlPropertiesChanged(r2)
            int r0 = r1.o
            if (r0 == r2) goto Lc
            r1.o = r2
            r1.g()
        Lc:
            return
    }

    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.s
            if (r0 == 0) goto L43
            com.google.android.material.chip.Chip$b r0 = r5.r
            r0.q(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r3
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

    @Override // a.J0, android.view.View
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

    @Override // a.J0, android.view.View
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
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.x(r2)
        L7:
            return
    }

    public void setCheckableResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            boolean r3 = r1.getBoolean(r3)
            r0.x(r3)
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 != 0) goto L7
            r1.j = r2
            return
        L7:
            boolean r0 = r0.R
            if (r0 == 0) goto Le
            super.setChecked(r2)
        Le:
            return
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.y(r2)
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
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f0
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r1, r3)
            r0.y(r3)
        Ld:
            return
    }

    public void setCheckedIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.z(r2)
        L7:
            return
    }

    public void setCheckedIconTintResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f0
            android.content.res.ColorStateList r3 = a.Y3.a(r1, r3)
            r0.z(r3)
        Ld:
            return
    }

    public void setCheckedIconVisible(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            boolean r3 = r1.getBoolean(r3)
            r0.A(r3)
        L11:
            return
    }

    public void setCheckedIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.A(r2)
        L7:
            return
    }

    public void setChipBackgroundColor(android.content.res.ColorStateList r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.res.ColorStateList r1 = r0.z
            if (r1 == r3) goto L11
            r0.z = r3
            int[] r3 = r0.getState()
            r0.onStateChange(r3)
        L11:
            return
    }

    public void setChipBackgroundColorResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L17
            android.content.Context r1 = r0.f0
            android.content.res.ColorStateList r3 = a.Y3.a(r1, r3)
            android.content.res.ColorStateList r1 = r0.z
            if (r1 == r3) goto L17
            r0.z = r3
            int[] r3 = r0.getState()
            r0.onStateChange(r3)
        L17:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadius(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.B(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadiusResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.B(r3)
        L11:
            return
    }

    public void setChipDrawable(com.google.android.material.chip.a r4) {
            r3 = this;
            com.google.android.material.chip.a r0 = r3.e
            if (r0 == r4) goto L1f
            if (r0 == 0) goto Le
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = 0
            r1.<init>(r2)
            r0.B0 = r1
        Le:
            r3.e = r4
            r0 = 0
            r4.D0 = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r4.B0 = r0
            int r4 = r3.p
            r3.c(r4)
        L1f:
            return
    }

    public void setChipEndPadding(float r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.e0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.e0 = r3
            r0.invalidateSelf()
            r0.v()
        L12:
            return
    }

    public void setChipEndPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.e0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.e0 = r3
            r0.invalidateSelf()
            r0.v()
        L1c:
            return
    }

    public void setChipIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.C(r2)
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
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f0
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r1, r3)
            r0.C(r3)
        Ld:
            return
    }

    public void setChipIconSize(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.D(r2)
        L7:
            return
    }

    public void setChipIconSizeResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.D(r3)
        L11:
            return
    }

    public void setChipIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.E(r2)
        L7:
            return
    }

    public void setChipIconTintResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f0
            android.content.res.ColorStateList r3 = a.Y3.a(r1, r3)
            r0.E(r3)
        Ld:
            return
    }

    public void setChipIconVisible(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            boolean r3 = r1.getBoolean(r3)
            r0.F(r3)
        L11:
            return
    }

    public void setChipIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.F(r2)
        L7:
            return
    }

    public void setChipMinHeight(float r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.A
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.A = r3
            r0.invalidateSelf()
            r0.v()
        L12:
            return
    }

    public void setChipMinHeightResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.A
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.A = r3
            r0.invalidateSelf()
            r0.v()
        L1c:
            return
    }

    public void setChipStartPadding(float r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.X
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.X = r3
            r0.invalidateSelf()
            r0.v()
        L12:
            return
    }

    public void setChipStartPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.X
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.X = r3
            r0.invalidateSelf()
            r0.v()
        L1c:
            return
    }

    public void setChipStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.G(r2)
        L7:
            return
    }

    public void setChipStrokeColorResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f0
            android.content.res.ColorStateList r3 = a.Y3.a(r1, r3)
            r0.G(r3)
        Ld:
            return
    }

    public void setChipStrokeWidth(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.H(r2)
        L7:
            return
    }

    public void setChipStrokeWidthResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.H(r3)
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
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.I(r2)
        L7:
            r1.e()
            return
    }

    public void setCloseIconContentDescription(java.lang.CharSequence r4) {
            r3 = this;
            com.google.android.material.chip.a r0 = r3.e
            if (r0 == 0) goto L28
            android.text.SpannableStringBuilder r1 = r0.Q
            if (r1 == r4) goto L28
            java.lang.String r1 = a.C0132f2.b
            java.util.Locale r1 = java.util.Locale.getDefault()
            int r1 = android.text.TextUtils.getLayoutDirectionFromLocale(r1)
            r2 = 1
            if (r1 != r2) goto L18
            a.f2 r1 = a.C0132f2.e
            goto L1a
        L18:
            a.f2 r1 = a.C0132f2.d
        L1a:
            r1.getClass()
            a.Xe$c r2 = a.Xe.f341a
            android.text.SpannableStringBuilder r4 = r1.c(r4)
            r0.Q = r4
            r0.invalidateSelf()
        L28:
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
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.J(r2)
        L7:
            return
    }

    public void setCloseIconEndPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.J(r3)
        L11:
            return
    }

    public void setCloseIconResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f0
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r1, r3)
            r0.I(r3)
        Ld:
            r2.e()
            return
    }

    public void setCloseIconSize(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.K(r2)
        L7:
            return
    }

    public void setCloseIconSizeResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.K(r3)
        L11:
            return
    }

    public void setCloseIconStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.L(r2)
        L7:
            return
    }

    public void setCloseIconStartPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.L(r3)
        L11:
            return
    }

    public void setCloseIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.M(r2)
        L7:
            return
    }

    public void setCloseIconTintResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f0
            android.content.res.ColorStateList r3 = a.Y3.a(r1, r3)
            r0.M(r3)
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
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.N(r2)
        L7:
            r1.e()
            return
    }

    @Override // a.J0, android.widget.TextView
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

    @Override // a.J0, android.widget.TextView
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
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setEllipsize(android.text.TextUtils.TruncateAt r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 != 0) goto L5
            goto L12
        L5:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            if (r2 == r0) goto L13
            super.setEllipsize(r2)
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L12
            r0.C0 = r2
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
            r0.c(r1)
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

    public void setHideMotionSpec(a.C0409ub r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L6
            r0.W = r2
        L6:
            return
    }

    public void setHideMotionSpecResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto Lc
            android.content.Context r1 = r0.f0
            a.ub r3 = a.C0409ub.a(r1, r3)
            r0.W = r3
        Lc:
            return
    }

    public void setIconEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.O(r2)
        L7:
            return
    }

    public void setIconEndPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.O(r3)
        L11:
            return
    }

    public void setIconStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.P(r2)
        L7:
            return
    }

    public void setIconStartPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.P(r3)
        L11:
            return
    }

    public void setInternalOnCheckedChangeListener(a.Ma<com.google.android.material.chip.Chip> r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setLayoutDirection(int r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
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
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L9
            r0.E0 = r2
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
            r0.e()
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.Q(r2)
        L7:
            com.google.android.material.chip.a r2 = r1.e
            r2.getClass()
            r1.f()
            return
    }

    public void setRippleColorResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L15
            android.content.Context r1 = r0.f0
            android.content.res.ColorStateList r3 = a.Y3.a(r1, r3)
            r0.Q(r3)
            com.google.android.material.chip.a r3 = r2.e
            r3.getClass()
            r2.f()
        L15:
            return
    }

    @Override // a.Zd
    public void setShapeAppearanceModel(a.Vd r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            r0.setShapeAppearanceModel(r2)
            return
    }

    public void setShowMotionSpec(a.C0409ub r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L6
            r0.V = r2
        L6:
            return
    }

    public void setShowMotionSpecResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto Lc
            android.content.Context r1 = r0.f0
            a.ub r3 = a.C0409ub.a(r1, r3)
            r0.V = r3
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
            com.google.android.material.chip.a r0 = r1.e
            if (r0 != 0) goto L5
            goto L2c
        L5:
            if (r2 != 0) goto L9
            java.lang.String r2 = ""
        L9:
            boolean r0 = r0.D0
            if (r0 == 0) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = r2
        L10:
            super.setText(r0, r3)
            com.google.android.material.chip.a r3 = r1.e
            if (r3 == 0) goto L2c
            java.lang.CharSequence r0 = r3.F
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L2c
            r3.F = r2
            a.Ye r2 = r3.l0
            r0 = 1
            r2.d = r0
            r3.invalidateSelf()
            r3.v()
        L2c:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r4) {
            r3 = this;
            super.setTextAppearance(r4)
            com.google.android.material.chip.a r0 = r3.e
            if (r0 == 0) goto L11
            a.Ve r1 = new a.Ve
            android.content.Context r2 = r0.f0
            r1.<init>(r2, r4)
            r0.R(r1)
        L11:
            r3.h()
            return
    }

    public void setTextAppearance(a.Ve r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.R(r2)
        L7:
            r1.h()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r3, int r4) {
            r2 = this;
            super.setTextAppearance(r3, r4)
            com.google.android.material.chip.a r3 = r2.e
            if (r3 == 0) goto L11
            a.Ve r0 = new a.Ve
            android.content.Context r1 = r3.f0
            r0.<init>(r1, r4)
            r3.R(r0)
        L11:
            r2.h()
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
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.b0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.b0 = r3
            r0.invalidateSelf()
            r0.v()
        L12:
            return
    }

    public void setTextEndPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.b0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.b0 = r3
            r0.invalidateSelf()
            r0.v()
        L1c:
            return
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
            r2 = this;
            super.setTextSize(r3, r4)
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L23
            android.content.res.Resources r1 = r2.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r1)
            a.Ye r4 = r0.l0
            a.Ve r1 = r4.f
            if (r1 == 0) goto L23
            r1.k = r3
            android.text.TextPaint r4 = r4.f362a
            r4.setTextSize(r3)
            r0.a()
        L23:
            r2.h()
            return
    }

    public void setTextStartPadding(float r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L12
            float r1 = r0.a0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.a0 = r3
            r0.invalidateSelf()
            r0.v()
        L12:
            return
    }

    public void setTextStartPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.e
            if (r0 == 0) goto L1c
            android.content.Context r1 = r0.f0
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            float r1 = r0.a0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c
            r0.a0 = r3
            r0.invalidateSelf()
            r0.v()
        L1c:
            return
    }
}
