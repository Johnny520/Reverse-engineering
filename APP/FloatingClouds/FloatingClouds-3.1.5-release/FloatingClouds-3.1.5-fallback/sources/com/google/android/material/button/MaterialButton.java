package com.google.android.material.button;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends a.H0 implements android.widget.Checkable, a.Zd {
    public static final int[] r = null;
    public static final int[] s = null;
    public static final int t = 0;
    public final a.Da d;
    public final java.util.LinkedHashSet<com.google.android.material.button.MaterialButton.a> e;
    public com.google.android.material.button.MaterialButton.b f;
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

    public interface a {
        void a();
    }

    public interface b {
    }

    public static class c extends a.r {
        public static final android.os.Parcelable.Creator<com.google.android.material.button.MaterialButton.c> CREATOR = null;
        public boolean c;

        public class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.button.MaterialButton.c> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.button.MaterialButton$c r0 = new com.google.android.material.button.MaterialButton$c
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final com.google.android.material.button.MaterialButton.c createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.button.MaterialButton$c r0 = new com.google.android.material.button.MaterialButton$c
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.button.MaterialButton$c[] r1 = new com.google.android.material.button.MaterialButton.c[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.button.MaterialButton$c$a r0 = new com.google.android.material.button.MaterialButton$c$a
                r0.<init>()
                com.google.android.material.button.MaterialButton.c.CREATOR = r0
                return
        }

        public c(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 != 0) goto La
                java.lang.Class<com.google.android.material.button.MaterialButton$c> r2 = com.google.android.material.button.MaterialButton.c.class
                r2.getClassLoader()
            La:
                int r1 = r1.readInt()
                r2 = 1
                if (r1 != r2) goto L12
                goto L13
            L12:
                r2 = 0
            L13:
                r0.c = r2
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.c
                r1.writeInt(r2)
                return
        }
    }

    static {
            r0 = 16842911(0x101009f, float:2.3694004E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.button.MaterialButton.r = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.button.MaterialButton.s = r0
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Button
            com.google.android.material.button.MaterialButton.t = r0
            return
    }

    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            int r3 = com.google.android.material.R.attr.materialButtonStyle
            int r4 = com.google.android.material.button.MaterialButton.t
            android.content.Context r9 = a.Wa.a(r9, r10, r3, r4)
            r8.<init>(r9, r10, r3)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.e = r9
            r9 = 0
            r8.o = r9
            r8.p = r9
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialButton
            int[] r5 = new int[r9]
            r1 = r10
            android.content.res.TypedArray r10 = a.C0091cf.d(r0, r1, r2, r3, r4, r5)
            int r2 = com.google.android.material.R.styleable.MaterialButton_iconPadding
            int r2 = r10.getDimensionPixelSize(r2, r9)
            r8.n = r2
            int r2 = com.google.android.material.R.styleable.MaterialButton_iconTintMode
            r5 = -1
            int r2 = r10.getInt(r2, r5)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = a.Rg.b(r2, r6)
            r8.g = r2
            android.content.Context r2 = r8.getContext()
            int r7 = com.google.android.material.R.styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r2 = a.Sa.b(r2, r10, r7)
            r8.h = r2
            android.content.Context r2 = r8.getContext()
            int r7 = com.google.android.material.R.styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r2 = a.Sa.c(r2, r10, r7)
            r8.i = r2
            int r2 = com.google.android.material.R.styleable.MaterialButton_iconGravity
            r7 = 1
            int r2 = r10.getInteger(r2, r7)
            r8.q = r2
            int r2 = com.google.android.material.R.styleable.MaterialButton_iconSize
            int r2 = r10.getDimensionPixelSize(r2, r9)
            r8.k = r2
            a.Vd$a r0 = a.Vd.b(r0, r1, r3, r4)
            a.Vd r0 = r0.a()
            a.Da r1 = new a.Da
            r1.<init>(r8, r0)
            r8.d = r1
            int r0 = com.google.android.material.R.styleable.MaterialButton_android_insetLeft
            int r0 = r10.getDimensionPixelOffset(r0, r9)
            r1.c = r0
            int r0 = com.google.android.material.R.styleable.MaterialButton_android_insetRight
            int r0 = r10.getDimensionPixelOffset(r0, r9)
            r1.d = r0
            int r0 = com.google.android.material.R.styleable.MaterialButton_android_insetTop
            int r0 = r10.getDimensionPixelOffset(r0, r9)
            r1.e = r0
            int r0 = com.google.android.material.R.styleable.MaterialButton_android_insetBottom
            int r0 = r10.getDimensionPixelOffset(r0, r9)
            r1.f = r0
            int r0 = com.google.android.material.R.styleable.MaterialButton_cornerRadius
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto Lcf
            int r0 = com.google.android.material.R.styleable.MaterialButton_cornerRadius
            int r0 = r10.getDimensionPixelSize(r0, r5)
            r1.g = r0
            a.Vd r2 = r1.b
            float r0 = (float) r0
            a.Vd$a r2 = r2.e()
            a.s r3 = new a.s
            r3.<init>(r0)
            r2.e = r3
            a.s r3 = new a.s
            r3.<init>(r0)
            r2.f = r3
            a.s r3 = new a.s
            r3.<init>(r0)
            r2.g = r3
            a.s r3 = new a.s
            r3.<init>(r0)
            r2.h = r3
            a.Vd r0 = r2.a()
            r1.c(r0)
            r1.p = r7
        Lcf:
            int r0 = com.google.android.material.R.styleable.MaterialButton_strokeWidth
            int r0 = r10.getDimensionPixelSize(r0, r9)
            r1.h = r0
            int r0 = com.google.android.material.R.styleable.MaterialButton_backgroundTintMode
            int r0 = r10.getInt(r0, r5)
            android.graphics.PorterDuff$Mode r0 = a.Rg.b(r0, r6)
            r1.i = r0
            android.content.Context r0 = r8.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_backgroundTint
            android.content.res.ColorStateList r0 = a.Sa.b(r0, r10, r2)
            r1.j = r0
            android.content.Context r0 = r8.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_strokeColor
            android.content.res.ColorStateList r0 = a.Sa.b(r0, r10, r2)
            r1.k = r0
            android.content.Context r0 = r8.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_rippleColor
            android.content.res.ColorStateList r0 = a.Sa.b(r0, r10, r2)
            r1.l = r0
            int r0 = com.google.android.material.R.styleable.MaterialButton_android_checkable
            boolean r0 = r10.getBoolean(r0, r9)
            r1.q = r0
            int r0 = com.google.android.material.R.styleable.MaterialButton_elevation
            int r0 = r10.getDimensionPixelSize(r0, r9)
            r1.t = r0
            int r0 = com.google.android.material.R.styleable.MaterialButton_toggleCheckedStateOnClick
            boolean r0 = r10.getBoolean(r0, r7)
            r1.r = r0
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            int r0 = r8.getPaddingStart()
            int r2 = r8.getPaddingTop()
            int r3 = r8.getPaddingEnd()
            int r4 = r8.getPaddingBottom()
            int r5 = com.google.android.material.R.styleable.MaterialButton_android_background
            boolean r5 = r10.hasValue(r5)
            if (r5 == 0) goto L146
            r1.o = r7
            android.content.res.ColorStateList r5 = r1.j
            r8.setSupportBackgroundTintList(r5)
            android.graphics.PorterDuff$Mode r5 = r1.i
            r8.setSupportBackgroundTintMode(r5)
            goto L149
        L146:
            r1.e()
        L149:
            int r5 = r1.c
            int r0 = r0 + r5
            int r5 = r1.e
            int r2 = r2 + r5
            int r5 = r1.d
            int r3 = r3 + r5
            int r1 = r1.f
            int r4 = r4 + r1
            r8.setPaddingRelative(r0, r2, r3, r4)
            r10.recycle()
            int r10 = r8.n
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.i
            if (r10 == 0) goto L165
            r9 = r7
        L165:
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
            int r3 = r1.length()
            r4 = 0
            r0.getTextBounds(r1, r4, r3, r2)
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
            a.Da r0 = r1.d
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
            if (r0 == r1) goto La
            r2 = 2
            if (r0 != r2) goto L9
            goto La
        L9:
            r1 = 0
        La:
            r2 = 0
            if (r1 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r3.i
            r3.setCompoundDrawablesRelative(r0, r2, r2, r2)
            return
        L13:
            r1 = 3
            if (r0 == r1) goto L2a
            r1 = 4
            if (r0 != r1) goto L1a
            goto L2a
        L1a:
            r1 = 16
            if (r0 == r1) goto L24
            r1 = 32
            if (r0 != r1) goto L23
            goto L24
        L23:
            return
        L24:
            android.graphics.drawable.Drawable r0 = r3.i
            r3.setCompoundDrawablesRelative(r2, r0, r2, r2)
            return
        L2a:
            android.graphics.drawable.Drawable r0 = r3.i
            r3.setCompoundDrawablesRelative(r2, r2, r0, r2)
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
            a.C0439w5.a.h(r0, r2)
            android.graphics.PorterDuff$Mode r0 = r6.g
            if (r0 == 0) goto L19
            android.graphics.drawable.Drawable r2 = r6.i
            a.C0439w5.a.i(r2, r0)
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
            android.graphics.drawable.Drawable[] r7 = r6.getCompoundDrawablesRelative()
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

    public final void d(int r8, int r9) {
            r7 = this;
            r0 = 2
            android.graphics.drawable.Drawable r1 = r7.i
            if (r1 == 0) goto Lc0
            android.text.Layout r1 = r7.getLayout()
            if (r1 != 0) goto Ld
            goto Lc0
        Ld:
            int r1 = r7.q
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L18
            if (r1 != r0) goto L16
            goto L18
        L16:
            r4 = r2
            goto L19
        L18:
            r4 = r3
        L19:
            r5 = 4
            r6 = 3
            if (r4 != 0) goto L62
            if (r1 == r6) goto L62
            if (r1 != r5) goto L22
            goto L62
        L22:
            r8 = 16
            if (r1 == r8) goto L2c
            r3 = 32
            if (r1 != r3) goto L2b
            goto L2c
        L2b:
            return
        L2c:
            r7.l = r2
            if (r1 != r8) goto L36
            r7.m = r2
            r7.c(r2)
            return
        L36:
            int r8 = r7.k
            if (r8 != 0) goto L40
            android.graphics.drawable.Drawable r8 = r7.i
            int r8 = r8.getIntrinsicHeight()
        L40:
            int r1 = r7.getTextHeight()
            int r9 = r9 - r1
            int r1 = r7.getPaddingTop()
            int r9 = r9 - r1
            int r9 = r9 - r8
            int r8 = r7.n
            int r9 = r9 - r8
            int r8 = r7.getPaddingBottom()
            int r9 = r9 - r8
            int r9 = r9 / r0
            int r8 = java.lang.Math.max(r2, r9)
            int r9 = r7.m
            if (r9 == r8) goto Lc0
            r7.m = r8
            r7.c(r2)
            return
        L62:
            r7.m = r2
            android.text.Layout$Alignment r9 = r7.getActualTextAlignment()
            int r1 = r7.q
            if (r1 == r3) goto Lbb
            if (r1 == r6) goto Lbb
            if (r1 != r0) goto L74
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r9 == r4) goto Lbb
        L74:
            if (r1 != r5) goto L7b
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r9 != r1) goto L7b
            goto Lbb
        L7b:
            int r1 = r7.k
            if (r1 != 0) goto L85
            android.graphics.drawable.Drawable r1 = r7.i
            int r1 = r1.getIntrinsicWidth()
        L85:
            int r4 = r7.getTextLayoutWidth()
            int r8 = r8 - r4
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            int r4 = r7.getPaddingEnd()
            int r8 = r8 - r4
            int r8 = r8 - r1
            int r1 = r7.n
            int r8 = r8 - r1
            int r1 = r7.getPaddingStart()
            int r8 = r8 - r1
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r9 != r1) goto L9f
            int r8 = r8 / r0
        L9f:
            int r9 = r7.getLayoutDirection()
            if (r9 != r3) goto La7
            r9 = r3
            goto La8
        La7:
            r9 = r2
        La8:
            int r0 = r7.q
            if (r0 != r5) goto Lad
            goto Lae
        Lad:
            r3 = r2
        Lae:
            if (r9 == r3) goto Lb1
            int r8 = -r8
        Lb1:
            int r9 = r7.l
            if (r9 == r8) goto Lc0
            r7.l = r8
            r7.c(r2)
            return
        Lbb:
            r7.l = r2
            r7.c(r2)
        Lc0:
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
            a.Da r0 = r1.d
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
            a.Da r0 = r1.d
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
            a.Da r0 = r1.d
            int r0 = r0.f
            return r0
    }

    public int getInsetTop() {
            r1 = this;
            a.Da r0 = r1.d
            int r0 = r0.e
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            a.Da r0 = r1.d
            android.content.res.ColorStateList r0 = r0.l
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public a.Vd getShapeAppearanceModel() {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto Lb
            a.Da r0 = r2.d
            a.Vd r0 = r0.b
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
            a.Da r0 = r1.d
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
            a.Da r0 = r1.d
            int r0 = r0.h
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // a.H0
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            a.Da r0 = r1.d
            android.content.res.ColorStateList r0 = r0.j
            return r0
        Lb:
            android.content.res.ColorStateList r0 = super.getSupportBackgroundTintList()
            return r0
    }

    @Override // a.H0
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lb
            a.Da r0 = r1.d
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
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            boolean r0 = r2.a()
            if (r0 == 0) goto L13
            r0 = 0
            a.Da r1 = r2.d
            a.Ta r0 = r1.b(r0)
            a.C0282n9.A(r2, r0)
        L13:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            a.Da r0 = r1.d
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

    @Override // a.H0, android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            boolean r0 = r1.o
            r2.setChecked(r0)
            return
    }

    @Override // a.H0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            a.Da r0 = r1.d
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

    @Override // a.H0, android.widget.TextView, android.view.View
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
            boolean r0 = r2 instanceof com.google.android.material.button.MaterialButton.c
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.button.MaterialButton$c r2 = (com.google.android.material.button.MaterialButton.c) r2
            android.os.Parcelable r0 = r2.f661a
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.c
            r1.setChecked(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.button.MaterialButton$c r1 = new com.google.android.material.button.MaterialButton$c
            r1.<init>(r0)
            boolean r0 = r2.o
            r1.c = r0
            return r1
    }

    @Override // a.H0, android.widget.TextView
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
            a.Da r0 = r1.d
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
            a.Da r0 = r3.d
            r1 = 0
            a.Ta r2 = r0.b(r1)
            if (r2 == 0) goto L16
            a.Ta r0 = r0.b(r1)
            r0.setTint(r4)
        L16:
            return
        L17:
            super.setBackgroundColor(r4)
            return
    }

    @Override // a.H0, android.view.View
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
            a.Da r1 = r3.d
            r1.o = r0
            android.content.res.ColorStateList r0 = r1.j
            com.google.android.material.button.MaterialButton r2 = r1.f59a
            r2.setSupportBackgroundTintList(r0)
            android.graphics.PorterDuff$Mode r0 = r1.i
            r2.setSupportBackgroundTintMode(r0)
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

    @Override // a.H0, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
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
            a.Da r0 = r1.d
            r0.q = r2
        La:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r3) {
            r2 = this;
            a.Da r0 = r2.d
            if (r0 == 0) goto L54
            boolean r0 = r0.q
            if (r0 == 0) goto L54
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L54
            boolean r0 = r2.o
            if (r0 == r3) goto L54
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
            goto L54
        L38:
            r3 = 1
            r2.p = r3
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$a> r3 = r2.e
            java.util.Iterator r3 = r3.iterator()
        L41:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r3.next()
            com.google.android.material.button.MaterialButton$a r0 = (com.google.android.material.button.MaterialButton.a) r0
            r0.a()
            goto L41
        L51:
            r3 = 0
            r2.p = r3
        L54:
            return
    }

    public void setCornerRadius(int r4) {
            r3 = this;
            boolean r0 = r3.a()
            if (r0 == 0) goto L3f
            a.Da r0 = r3.d
            boolean r1 = r0.p
            if (r1 == 0) goto L10
            int r1 = r0.g
            if (r1 == r4) goto L3f
        L10:
            r0.g = r4
            r1 = 1
            r0.p = r1
            a.Vd r1 = r0.b
            float r4 = (float) r4
            a.Vd$a r1 = r1.e()
            a.s r2 = new a.s
            r2.<init>(r4)
            r1.e = r2
            a.s r2 = new a.s
            r2.<init>(r4)
            r1.f = r2
            a.s r2 = new a.s
            r2.<init>(r4)
            r1.g = r2
            a.s r2 = new a.s
            r2.<init>(r4)
            r1.h = r2
            a.Vd r4 = r1.a()
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
            r0 = 0
            a.Da r1 = r2.d
            a.Ta r0 = r1.b(r0)
            r0.j(r3)
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
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
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
            android.content.res.ColorStateList r2 = a.Y3.a(r0, r2)
            r1.setIconTint(r2)
            return
    }

    public void setInsetBottom(int r3) {
            r2 = this;
            a.Da r0 = r2.d
            int r1 = r0.e
            r0.d(r1, r3)
            return
    }

    public void setInsetTop(int r3) {
            r2 = this;
            a.Da r0 = r2.d
            int r1 = r0.f
            r0.d(r3, r1)
            return
    }

    public void setInternalBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    public void setOnPressedChangeListenerInternal(com.google.android.material.button.MaterialButton.b r1) {
            r0 = this;
            r0.f = r1
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            com.google.android.material.button.MaterialButton$b r0 = r1.f
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonToggleGroup$e r0 = (com.google.android.material.button.MaterialButtonToggleGroup.e) r0
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r0.f1057a
            r0.invalidate()
        Lb:
            super.setPressed(r2)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L29
            a.Da r0 = r2.d
            android.content.res.ColorStateList r1 = r0.l
            if (r1 == r3) goto L29
            r0.l = r3
            com.google.android.material.button.MaterialButton r0 = r0.f59a
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            if (r3 == 0) goto L21
            goto L26
        L21:
            r3 = 0
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
        L26:
            r0.setColor(r3)
        L29:
            return
    }

    public void setRippleColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = a.Y3.a(r0, r2)
            r1.setRippleColor(r2)
        L11:
            return
    }

    @Override // a.Zd
    public void setShapeAppearanceModel(a.Vd r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lc
            a.Da r0 = r1.d
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
            a.Da r0 = r1.d
            r0.n = r2
            r0.f()
        Ld:
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L11
            a.Da r0 = r2.d
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
            android.content.res.ColorStateList r2 = a.Y3.a(r0, r2)
            r1.setStrokeColor(r2)
        L11:
            return
    }

    public void setStrokeWidth(int r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L11
            a.Da r0 = r2.d
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

    @Override // a.H0
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L1f
            a.Da r0 = r2.d
            android.content.res.ColorStateList r1 = r0.j
            if (r1 == r3) goto L1e
            r0.j = r3
            r3 = 0
            a.Ta r1 = r0.b(r3)
            if (r1 == 0) goto L1e
            a.Ta r3 = r0.b(r3)
            android.content.res.ColorStateList r0 = r0.j
            a.C0439w5.a.h(r3, r0)
        L1e:
            return
        L1f:
            super.setSupportBackgroundTintList(r3)
            return
    }

    @Override // a.H0
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto L23
            a.Da r0 = r2.d
            android.graphics.PorterDuff$Mode r1 = r0.i
            if (r1 == r3) goto L22
            r0.i = r3
            r3 = 0
            a.Ta r1 = r0.b(r3)
            if (r1 == 0) goto L22
            android.graphics.PorterDuff$Mode r1 = r0.i
            if (r1 == 0) goto L22
            a.Ta r3 = r0.b(r3)
            android.graphics.PorterDuff$Mode r0 = r0.i
            a.C0439w5.a.i(r3, r0)
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
            a.Da r0 = r1.d
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
