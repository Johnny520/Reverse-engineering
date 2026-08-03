package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends android.widget.CompoundButton {
    public static final androidx.appcompat.widget.SwitchCompat.a R = null;
    public static final int[] S = null;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final android.text.TextPaint I;
    public final android.content.res.ColorStateList J;
    public android.text.StaticLayout K;
    public android.text.StaticLayout L;
    public final a.C0309p0 M;
    public android.animation.ObjectAnimator N;
    public a.C0058b1 O;
    public androidx.appcompat.widget.SwitchCompat.b P;
    public final android.graphics.Rect Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.graphics.drawable.Drawable f843a;
    public android.content.res.ColorStateList b;
    public android.graphics.PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public android.graphics.drawable.Drawable f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public java.lang.CharSequence o;
    public java.lang.CharSequence p;
    public java.lang.CharSequence q;
    public java.lang.CharSequence r;
    public boolean s;
    public int t;
    public final int u;
    public float v;
    public float w;
    public final android.view.VelocityTracker x;
    public final int y;
    public float z;

    public class a extends android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float> {
        @Override // android.util.Property
        public final java.lang.Float get(androidx.appcompat.widget.SwitchCompat r1) {
                r0 = this;
                androidx.appcompat.widget.SwitchCompat r1 = (androidx.appcompat.widget.SwitchCompat) r1
                float r1 = r1.z
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public final void set(androidx.appcompat.widget.SwitchCompat r1, java.lang.Float r2) {
                r0 = this;
                androidx.appcompat.widget.SwitchCompat r1 = (androidx.appcompat.widget.SwitchCompat) r1
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r1.setThumbPosition(r2)
                return
        }
    }

    public static class b extends androidx.emoji2.text.c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.ref.WeakReference f844a;

        public b(androidx.appcompat.widget.SwitchCompat r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f844a = r0
                return
        }

        @Override // androidx.emoji2.text.c.e
        public final void a() {
                r1 = this;
                java.lang.ref.WeakReference r0 = r1.f844a
                java.lang.Object r0 = r0.get()
                androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
                if (r0 == 0) goto Ld
                r0.c()
            Ld:
                return
        }

        @Override // androidx.emoji2.text.c.e
        public final void b() {
                r1 = this;
                java.lang.ref.WeakReference r0 = r1.f844a
                java.lang.Object r0 = r0.get()
                androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
                if (r0 == 0) goto Ld
                r0.c()
            Ld:
                return
        }
    }

    static {
            androidx.appcompat.widget.SwitchCompat$a r0 = new androidx.appcompat.widget.SwitchCompat$a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "thumbPos"
            r0.<init>(r1, r2)
            androidx.appcompat.widget.SwitchCompat.R = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.SwitchCompat.S = r0
            return
    }

    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            int r5 = androidx.appcompat.R.attr.switchStyle
            r12.<init>(r13, r14, r5)
            r6 = 0
            r12.b = r6
            r12.c = r6
            r7 = 0
            r12.d = r7
            r12.e = r7
            r12.g = r6
            r12.h = r6
            r12.i = r7
            r12.j = r7
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.x = r0
            r8 = 1
            r12.H = r8
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.Q = r0
            android.content.Context r0 = r12.getContext()
            a.C0109df.a(r12, r0)
            android.text.TextPaint r9 = new android.text.TextPaint
            r9.<init>(r8)
            r12.I = r9
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r9.density = r0
            int[] r0 = androidx.appcompat.R.styleable.SwitchCompat
            a.of r10 = a.C0306of.e(r13, r14, r0, r5)
            int[] r2 = androidx.appcompat.R.styleable.SwitchCompat
            android.content.res.TypedArray r4 = r10.b
            r0 = r12
            r1 = r13
            r3 = r14
            a.C0414ug.i(r0, r1, r2, r3, r4, r5)
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_android_thumb
            android.graphics.drawable.Drawable r13 = r10.b(r13)
            r0.f843a = r13
            if (r13 == 0) goto L5e
            r13.setCallback(r12)
        L5e:
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_track
            android.graphics.drawable.Drawable r13 = r10.b(r13)
            r0.f = r13
            if (r13 == 0) goto L6b
            r13.setCallback(r12)
        L6b:
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_android_textOn
            android.content.res.TypedArray r14 = r10.b
            java.lang.CharSequence r13 = r14.getText(r13)
            r12.setTextOnInternal(r13)
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_android_textOff
            java.lang.CharSequence r13 = r14.getText(r13)
            r12.setTextOffInternal(r13)
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_showText
            boolean r13 = r14.getBoolean(r13, r8)
            r0.s = r13
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_thumbTextPadding
            int r13 = r14.getDimensionPixelSize(r13, r7)
            r0.k = r13
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_switchMinWidth
            int r13 = r14.getDimensionPixelSize(r13, r7)
            r0.l = r13
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_switchPadding
            int r13 = r14.getDimensionPixelSize(r13, r7)
            r0.m = r13
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_splitTrack
            boolean r13 = r14.getBoolean(r13, r7)
            r0.n = r13
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_thumbTint
            android.content.res.ColorStateList r13 = r10.a(r13)
            if (r13 == 0) goto Lb3
            r0.b = r13
            r0.d = r8
        Lb3:
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_thumbTintMode
            r2 = -1
            int r13 = r14.getInt(r13, r2)
            android.graphics.PorterDuff$Mode r13 = a.C0457x5.c(r13, r6)
            android.graphics.PorterDuff$Mode r4 = r0.c
            if (r4 == r13) goto Lc6
            r0.c = r13
            r0.e = r8
        Lc6:
            boolean r13 = r0.d
            if (r13 != 0) goto Lce
            boolean r13 = r0.e
            if (r13 == 0) goto Ld1
        Lce:
            r12.a()
        Ld1:
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_trackTint
            android.content.res.ColorStateList r13 = r10.a(r13)
            if (r13 == 0) goto Ldd
            r0.g = r13
            r0.i = r8
        Ldd:
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_trackTintMode
            int r13 = r14.getInt(r13, r2)
            android.graphics.PorterDuff$Mode r13 = a.C0457x5.c(r13, r6)
            android.graphics.PorterDuff$Mode r4 = r0.h
            if (r4 == r13) goto Lef
            r0.h = r13
            r0.j = r8
        Lef:
            boolean r13 = r0.i
            if (r13 != 0) goto Lf7
            boolean r13 = r0.j
            if (r13 == 0) goto Lfa
        Lf7:
            r12.b()
        Lfa:
            int r13 = androidx.appcompat.R.styleable.SwitchCompat_switchTextAppearance
            int r13 = r14.getResourceId(r13, r7)
            if (r13 == 0) goto L1c6
            int[] r14 = androidx.appcompat.R.styleable.TextAppearance
            android.content.res.TypedArray r13 = r1.obtainStyledAttributes(r13, r14)
            int r14 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r4 = r13.hasValue(r14)
            if (r4 == 0) goto L11d
            int r4 = r13.getResourceId(r14, r7)
            if (r4 == 0) goto L11d
            android.content.res.ColorStateList r4 = a.Y3.a(r1, r4)
            if (r4 == 0) goto L11d
            goto L121
        L11d:
            android.content.res.ColorStateList r4 = r13.getColorStateList(r14)
        L121:
            if (r4 == 0) goto L126
            r0.J = r4
            goto L12c
        L126:
            android.content.res.ColorStateList r14 = r12.getTextColors()
            r0.J = r14
        L12c:
            int r14 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            int r14 = r13.getDimensionPixelSize(r14, r7)
            if (r14 == 0) goto L143
            float r14 = (float) r14
            float r4 = r9.getTextSize()
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 == 0) goto L143
            r9.setTextSize(r14)
            r12.requestLayout()
        L143:
            int r14 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            int r14 = r13.getInt(r14, r2)
            int r4 = androidx.appcompat.R.styleable.TextAppearance_android_textStyle
            int r2 = r13.getInt(r4, r2)
            r4 = 2
            if (r14 == r8) goto L15f
            if (r14 == r4) goto L15c
            r11 = 3
            if (r14 == r11) goto L159
            r14 = r6
            goto L161
        L159:
            android.graphics.Typeface r14 = android.graphics.Typeface.MONOSPACE
            goto L161
        L15c:
            android.graphics.Typeface r14 = android.graphics.Typeface.SERIF
            goto L161
        L15f:
            android.graphics.Typeface r14 = android.graphics.Typeface.SANS_SERIF
        L161:
            r11 = 0
            if (r2 <= 0) goto L18e
            if (r14 != 0) goto L16b
            android.graphics.Typeface r14 = android.graphics.Typeface.defaultFromStyle(r2)
            goto L16f
        L16b:
            android.graphics.Typeface r14 = android.graphics.Typeface.create(r14, r2)
        L16f:
            r12.setSwitchTypeface(r14)
            if (r14 == 0) goto L179
            int r14 = r14.getStyle()
            goto L17a
        L179:
            r14 = r7
        L17a:
            int r14 = ~r14
            r14 = r14 & r2
            r2 = r14 & 1
            if (r2 == 0) goto L181
            goto L182
        L181:
            r8 = r7
        L182:
            r9.setFakeBoldText(r8)
            r14 = r14 & r4
            if (r14 == 0) goto L18a
            r11 = -1098907648(0xffffffffbe800000, float:-0.25)
        L18a:
            r9.setTextSkewX(r11)
            goto L197
        L18e:
            r9.setFakeBoldText(r7)
            r9.setTextSkewX(r11)
            r12.setSwitchTypeface(r14)
        L197:
            int r14 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r14 = r13.getBoolean(r14, r7)
            if (r14 == 0) goto L1b7
            a.p0 r14 = new a.p0
            android.content.Context r2 = r12.getContext()
            r14.<init>()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            r14.f629a = r2
            r0.M = r14
            goto L1b9
        L1b7:
            r0.M = r6
        L1b9:
            java.lang.CharSequence r14 = r0.o
            r12.setTextOnInternal(r14)
            java.lang.CharSequence r14 = r0.q
            r12.setTextOffInternal(r14)
            r13.recycle()
        L1c6:
            a.p1 r13 = new a.p1
            r13.<init>(r12)
            r13.f(r3, r5)
            r10.f()
            android.view.ViewConfiguration r13 = android.view.ViewConfiguration.get(r1)
            int r14 = r13.getScaledTouchSlop()
            r0.u = r14
            int r13 = r13.getScaledMinimumFlingVelocity()
            r0.y = r13
            a.b1 r13 = r12.getEmojiTextViewHelper()
            r13.b(r3, r5)
            r12.refreshDrawableState()
            boolean r13 = r12.isChecked()
            r12.setChecked(r13)
            return
    }

    private a.C0058b1 getEmojiTextViewHelper() {
            r1 = this;
            a.b1 r0 = r1.O
            if (r0 != 0) goto Lb
            a.b1 r0 = new a.b1
            r0.<init>(r1)
            r1.O = r0
        Lb:
            a.b1 r0 = r1.O
            return r0
    }

    private boolean getTargetCheckedState() {
            r2 = this;
            float r0 = r2.z
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private int getThumbOffset() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Ld
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2.z
            float r0 = r0 - r1
            goto Lf
        Ld:
            float r0 = r2.z
        Lf:
            int r1 = r2.getThumbScrollRange()
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            return r0
    }

    private int getThumbScrollRange() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f
            if (r0 == 0) goto L26
            android.graphics.Rect r1 = r4.Q
            r0.getPadding(r1)
            android.graphics.drawable.Drawable r0 = r4.f843a
            if (r0 == 0) goto L12
            android.graphics.Rect r0 = a.C0457x5.b(r0)
            goto L14
        L12:
            android.graphics.Rect r0 = a.C0457x5.c
        L14:
            int r2 = r4.A
            int r3 = r4.C
            int r2 = r2 - r3
            int r3 = r1.left
            int r2 = r2 - r3
            int r1 = r1.right
            int r2 = r2 - r1
            int r1 = r0.left
            int r2 = r2 - r1
            int r0 = r0.right
            int r2 = r2 - r0
            return r2
        L26:
            r0 = 0
            return r0
    }

    private void setTextOffInternal(java.lang.CharSequence r3) {
            r2 = this;
            r2.q = r3
            a.b1 r0 = r2.getEmojiTextViewHelper()
            a.p0 r1 = r2.M
            a.S5 r0 = r0.b
            a.S5$b r0 = r0.f256a
            android.text.method.TransformationMethod r0 = r0.e(r1)
            if (r0 == 0) goto L16
            java.lang.CharSequence r3 = r0.getTransformation(r3, r2)
        L16:
            r2.r = r3
            r3 = 0
            r2.L = r3
            boolean r3 = r2.s
            if (r3 == 0) goto L22
            r2.d()
        L22:
            return
    }

    private void setTextOnInternal(java.lang.CharSequence r3) {
            r2 = this;
            r2.o = r3
            a.b1 r0 = r2.getEmojiTextViewHelper()
            a.p0 r1 = r2.M
            a.S5 r0 = r0.b
            a.S5$b r0 = r0.f256a
            android.text.method.TransformationMethod r0 = r0.e(r1)
            if (r0 == 0) goto L16
            java.lang.CharSequence r3 = r0.getTransformation(r3, r2)
        L16:
            r2.p = r3
            r3 = 0
            r2.K = r3
            boolean r3 = r2.s
            if (r3 == 0) goto L22
            r2.d()
        L22:
            return
    }

    public final void a() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f843a
            if (r0 == 0) goto L37
            boolean r1 = r2.d
            if (r1 != 0) goto Lc
            boolean r1 = r2.e
            if (r1 == 0) goto L37
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f843a = r0
            boolean r1 = r2.d
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.b
            a.C0439w5.a.h(r0, r1)
        L1b:
            boolean r0 = r2.e
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.f843a
            android.graphics.PorterDuff$Mode r1 = r2.c
            a.C0439w5.a.i(r0, r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.f843a
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r0 = r2.f843a
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L37:
            return
    }

    public final void b() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f
            if (r0 == 0) goto L37
            boolean r1 = r2.i
            if (r1 != 0) goto Lc
            boolean r1 = r2.j
            if (r1 == 0) goto L37
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f = r0
            boolean r1 = r2.i
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.g
            a.C0439w5.a.h(r0, r1)
        L1b:
            boolean r0 = r2.j
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.f
            android.graphics.PorterDuff$Mode r1 = r2.h
            a.C0439w5.a.i(r0, r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.f
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r0 = r2.f
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L37:
            return
    }

    public final void c() {
            r1 = this;
            java.lang.CharSequence r0 = r1.o
            r1.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r1.q
            r1.setTextOffInternal(r0)
            r1.requestLayout()
            return
    }

    public final void d() {
            r3 = this;
            androidx.appcompat.widget.SwitchCompat$b r0 = r3.P
            if (r0 != 0) goto L2c
            a.b1 r0 = r3.O
            a.S5 r0 = r0.b
            a.S5$b r0 = r0.f256a
            boolean r0 = r0.b()
            if (r0 != 0) goto L11
            goto L2c
        L11:
            androidx.emoji2.text.c r0 = androidx.emoji2.text.c.k
            if (r0 == 0) goto L2c
            androidx.emoji2.text.c r0 = androidx.emoji2.text.c.a()
            int r1 = r0.b()
            r2 = 3
            if (r1 == r2) goto L22
            if (r1 != 0) goto L2c
        L22:
            androidx.appcompat.widget.SwitchCompat$b r1 = new androidx.appcompat.widget.SwitchCompat$b
            r1.<init>(r3)
            r3.P = r1
            r0.f(r1)
        L2c:
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            int r0 = r10.D
            int r1 = r10.E
            int r2 = r10.F
            int r3 = r10.G
            int r4 = r10.getThumbOffset()
            int r4 = r4 + r0
            android.graphics.drawable.Drawable r5 = r10.f843a
            if (r5 == 0) goto L16
            android.graphics.Rect r5 = a.C0457x5.b(r5)
            goto L18
        L16:
            android.graphics.Rect r5 = a.C0457x5.c
        L18:
            android.graphics.drawable.Drawable r6 = r10.f
            android.graphics.Rect r7 = r10.Q
            if (r6 == 0) goto L51
            r6.getPadding(r7)
            int r6 = r7.left
            int r4 = r4 + r6
            if (r5 == 0) goto L4a
            int r8 = r5.left
            if (r8 <= r6) goto L2c
            int r8 = r8 - r6
            int r0 = r0 + r8
        L2c:
            int r6 = r5.top
            int r8 = r7.top
            if (r6 <= r8) goto L35
            int r6 = r6 - r8
            int r6 = r6 + r1
            goto L36
        L35:
            r6 = r1
        L36:
            int r8 = r5.right
            int r9 = r7.right
            if (r8 <= r9) goto L3e
            int r8 = r8 - r9
            int r2 = r2 - r8
        L3e:
            int r5 = r5.bottom
            int r8 = r7.bottom
            if (r5 <= r8) goto L48
            int r5 = r5 - r8
            int r5 = r3 - r5
            goto L4c
        L48:
            r5 = r3
            goto L4c
        L4a:
            r6 = r1
            goto L48
        L4c:
            android.graphics.drawable.Drawable r8 = r10.f
            r8.setBounds(r0, r6, r2, r5)
        L51:
            android.graphics.drawable.Drawable r0 = r10.f843a
            if (r0 == 0) goto L70
            r0.getPadding(r7)
            int r0 = r7.left
            int r0 = r4 - r0
            int r2 = r10.C
            int r4 = r4 + r2
            int r2 = r7.right
            int r4 = r4 + r2
            android.graphics.drawable.Drawable r2 = r10.f843a
            r2.setBounds(r0, r1, r4, r3)
            android.graphics.drawable.Drawable r2 = r10.getBackground()
            if (r2 == 0) goto L70
            a.C0439w5.a.f(r2, r0, r1, r4, r3)
        L70:
            super.draw(r11)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float r2, float r3) {
            r1 = this;
            super.drawableHotspotChanged(r2, r3)
            android.graphics.drawable.Drawable r0 = r1.f843a
            if (r0 == 0) goto La
            a.C0439w5.a.e(r0, r2, r3)
        La:
            android.graphics.drawable.Drawable r0 = r1.f
            if (r0 == 0) goto L11
            a.C0439w5.a.e(r0, r2, r3)
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            android.graphics.drawable.Drawable r1 = r4.f843a
            if (r1 == 0) goto L16
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L16
            boolean r1 = r1.setState(r0)
            goto L17
        L16:
            r1 = 0
        L17:
            android.graphics.drawable.Drawable r2 = r4.f
            if (r2 == 0) goto L26
            boolean r3 = r2.isStateful()
            if (r3 == 0) goto L26
            boolean r0 = r2.setState(r0)
            r1 = r1 | r0
        L26:
            if (r1 == 0) goto L2b
            r4.invalidate()
        L2b:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L1c
            int r0 = super.getCompoundPaddingLeft()
            int r1 = r2.A
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1b
            int r1 = r2.m
            int r0 = r0 + r1
        L1b:
            return r0
        L1c:
            int r0 = super.getCompoundPaddingLeft()
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r0 = super.getCompoundPaddingRight()
            return r0
        Lc:
            int r0 = super.getCompoundPaddingRight()
            int r1 = r2.A
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L20
            int r1 = r2.m
            int r0 = r0 + r1
        L20:
            return r0
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = a.Ze.b(r0)
            return r0
    }

    public boolean getShowText() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    public boolean getSplitTrack() {
            r1 = this;
            boolean r0 = r1.n
            return r0
    }

    public int getSwitchMinWidth() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public int getSwitchPadding() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public java.lang.CharSequence getTextOff() {
            r1 = this;
            java.lang.CharSequence r0 = r1.q
            return r0
    }

    public java.lang.CharSequence getTextOn() {
            r1 = this;
            java.lang.CharSequence r0 = r1.o
            return r0
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f843a
            return r0
    }

    public final float getThumbPosition() {
            r1 = this;
            float r0 = r1.z
            return r0
    }

    public int getThumbTextPadding() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public android.content.res.ColorStateList getThumbTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.b
            return r0
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.c
            return r0
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f
            return r0
    }

    public android.content.res.ColorStateList getTrackTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.g
            return r0
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.h
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f843a
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.f
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.animation.ObjectAnimator r0 = r1.N
            if (r0 == 0) goto L23
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L23
            android.animation.ObjectAnimator r0 = r1.N
            r0.end()
            r0 = 0
            r1.N = r0
        L23:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = androidx.appcompat.widget.SwitchCompat.S
            android.view.View.mergeDrawableStates(r2, r0)
        L11:
            return r2
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            android.graphics.drawable.Drawable r0 = r9.f
            android.graphics.Rect r1 = r9.Q
            if (r0 == 0) goto Ld
            r0.getPadding(r1)
            goto L10
        Ld:
            r1.setEmpty()
        L10:
            int r2 = r9.E
            int r3 = r9.G
            int r4 = r1.top
            int r2 = r2 + r4
            int r4 = r1.bottom
            int r3 = r3 - r4
            android.graphics.drawable.Drawable r4 = r9.f843a
            if (r0 == 0) goto L4c
            boolean r5 = r9.n
            if (r5 == 0) goto L49
            if (r4 == 0) goto L49
            android.graphics.Rect r5 = a.C0457x5.b(r4)
            r4.copyBounds(r1)
            int r6 = r1.left
            int r7 = r5.left
            int r6 = r6 + r7
            r1.left = r6
            int r6 = r1.right
            int r5 = r5.right
            int r6 = r6 - r5
            r1.right = r6
            int r5 = r10.save()
            android.graphics.Region$Op r6 = android.graphics.Region.Op.DIFFERENCE
            r10.clipRect(r1, r6)
            r0.draw(r10)
            r10.restoreToCount(r5)
            goto L4c
        L49:
            r0.draw(r10)
        L4c:
            int r0 = r10.save()
            if (r4 == 0) goto L55
            r4.draw(r10)
        L55:
            boolean r1 = r9.getTargetCheckedState()
            if (r1 == 0) goto L5e
            android.text.StaticLayout r1 = r9.K
            goto L60
        L5e:
            android.text.StaticLayout r1 = r9.L
        L60:
            if (r1 == 0) goto La1
            int[] r5 = r9.getDrawableState()
            android.content.res.ColorStateList r6 = r9.J
            android.text.TextPaint r7 = r9.I
            if (r6 == 0) goto L74
            r8 = 0
            int r6 = r6.getColorForState(r5, r8)
            r7.setColor(r6)
        L74:
            r7.drawableState = r5
            if (r4 == 0) goto L82
            android.graphics.Rect r4 = r4.getBounds()
            int r5 = r4.left
            int r4 = r4.right
            int r5 = r5 + r4
            goto L86
        L82:
            int r5 = r9.getWidth()
        L86:
            int r5 = r5 / 2
            int r4 = r1.getWidth()
            int r4 = r4 / 2
            int r5 = r5 - r4
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r3 = r1.getHeight()
            int r3 = r3 / 2
            int r2 = r2 - r3
            float r3 = (float) r5
            float r2 = (float) r2
            r10.translate(r3, r2)
            r1.draw(r10)
        La1:
            r10.restoreToCount(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "android.widget.Switch"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            java.lang.String r0 = "android.widget.Switch"
            r4.setClassName(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L40
            boolean r0 = r3.isChecked()
            if (r0 == 0) goto L17
            java.lang.CharSequence r0 = r3.o
            goto L19
        L17:
            java.lang.CharSequence r0 = r3.q
        L19:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L40
            java.lang.CharSequence r1 = r4.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L2d
            r4.setText(r0)
            return
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 32
            r2.append(r1)
            r2.append(r0)
            r4.setText(r2)
        L40:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            r3 = r2
            android.graphics.drawable.Drawable r4 = r3.f843a
            r5 = 0
            if (r4 == 0) goto L2f
            android.graphics.drawable.Drawable r4 = r3.f
            android.graphics.Rect r6 = r3.Q
            if (r4 == 0) goto L13
            r4.getPadding(r6)
            goto L16
        L13:
            r6.setEmpty()
        L16:
            android.graphics.drawable.Drawable r4 = r3.f843a
            android.graphics.Rect r4 = a.C0457x5.b(r4)
            int r7 = r4.left
            int r0 = r6.left
            int r7 = r7 - r0
            int r7 = java.lang.Math.max(r5, r7)
            int r4 = r4.right
            int r6 = r6.right
            int r4 = r4 - r6
            int r5 = java.lang.Math.max(r5, r4)
            goto L30
        L2f:
            r7 = r5
        L30:
            int r4 = r2.getLayoutDirection()
            r6 = 1
            if (r4 != r6) goto L42
            int r4 = r2.getPaddingLeft()
            int r4 = r4 + r7
            int r6 = r3.A
            int r6 = r6 + r4
            int r6 = r6 - r7
            int r6 = r6 - r5
            goto L53
        L42:
            int r4 = r2.getWidth()
            int r6 = r2.getPaddingRight()
            int r4 = r4 - r6
            int r6 = r4 - r5
            int r4 = r3.A
            int r4 = r6 - r4
            int r4 = r4 + r7
            int r4 = r4 + r5
        L53:
            int r5 = r2.getGravity()
            r5 = r5 & 112(0x70, float:1.57E-43)
            r7 = 16
            if (r5 == r7) goto L78
            r7 = 80
            if (r5 == r7) goto L69
            int r5 = r2.getPaddingTop()
            int r7 = r3.B
            int r7 = r7 + r5
            goto L91
        L69:
            int r5 = r2.getHeight()
            int r7 = r2.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r3.B
            int r5 = r7 - r5
            goto L91
        L78:
            int r5 = r2.getPaddingTop()
            int r7 = r2.getHeight()
            int r7 = r7 + r5
            int r5 = r2.getPaddingBottom()
            int r7 = r7 - r5
            int r7 = r7 / 2
            int r5 = r3.B
            int r0 = r5 / 2
            int r7 = r7 - r0
            int r5 = r5 + r7
            r1 = r7
            r7 = r5
            r5 = r1
        L91:
            r3.D = r4
            r3.E = r5
            r3.G = r7
            r3.F = r6
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r11, int r12) {
            r10 = this;
            boolean r0 = r10.s
            r1 = 0
            if (r0 == 0) goto L4b
            android.text.StaticLayout r0 = r10.K
            android.text.TextPaint r4 = r10.I
            if (r0 != 0) goto L29
            java.lang.CharSequence r3 = r10.p
            android.text.StaticLayout r2 = new android.text.StaticLayout
            if (r3 == 0) goto L1d
            float r0 = android.text.Layout.getDesiredWidth(r3, r4)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            int r0 = (int) r5
            r5 = r0
            goto L1e
        L1d:
            r5 = r1
        L1e:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.K = r2
        L29:
            android.text.StaticLayout r0 = r10.L
            if (r0 != 0) goto L4b
            java.lang.CharSequence r3 = r10.r
            android.text.StaticLayout r2 = new android.text.StaticLayout
            if (r3 == 0) goto L3f
            float r0 = android.text.Layout.getDesiredWidth(r3, r4)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            int r0 = (int) r5
            r5 = r0
            goto L40
        L3f:
            r5 = r1
        L40:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.L = r2
        L4b:
            android.graphics.drawable.Drawable r0 = r10.f843a
            android.graphics.Rect r2 = r10.Q
            if (r0 == 0) goto L67
            r0.getPadding(r2)
            android.graphics.drawable.Drawable r0 = r10.f843a
            int r0 = r0.getIntrinsicWidth()
            int r3 = r2.left
            int r0 = r0 - r3
            int r3 = r2.right
            int r0 = r0 - r3
            android.graphics.drawable.Drawable r3 = r10.f843a
            int r3 = r3.getIntrinsicHeight()
            goto L69
        L67:
            r0 = r1
            r3 = r0
        L69:
            boolean r4 = r10.s
            if (r4 == 0) goto L83
            android.text.StaticLayout r4 = r10.K
            int r4 = r4.getWidth()
            android.text.StaticLayout r5 = r10.L
            int r5 = r5.getWidth()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r10.k
            int r5 = r5 * 2
            int r5 = r5 + r4
            goto L84
        L83:
            r5 = r1
        L84:
            int r0 = java.lang.Math.max(r5, r0)
            r10.C = r0
            android.graphics.drawable.Drawable r0 = r10.f
            if (r0 == 0) goto L98
            r0.getPadding(r2)
            android.graphics.drawable.Drawable r0 = r10.f
            int r1 = r0.getIntrinsicHeight()
            goto L9b
        L98:
            r2.setEmpty()
        L9b:
            int r0 = r2.left
            int r2 = r2.right
            android.graphics.drawable.Drawable r4 = r10.f843a
            if (r4 == 0) goto Lb3
            android.graphics.Rect r4 = a.C0457x5.b(r4)
            int r5 = r4.left
            int r0 = java.lang.Math.max(r0, r5)
            int r4 = r4.right
            int r2 = java.lang.Math.max(r2, r4)
        Lb3:
            boolean r4 = r10.H
            if (r4 == 0) goto Lc4
            int r4 = r10.l
            int r5 = r10.C
            int r5 = r5 * 2
            int r5 = r5 + r0
            int r5 = r5 + r2
            int r0 = java.lang.Math.max(r4, r5)
            goto Lc6
        Lc4:
            int r0 = r10.l
        Lc6:
            int r1 = java.lang.Math.max(r1, r3)
            r10.A = r0
            r10.B = r1
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredHeight()
            if (r11 >= r1) goto Lde
            int r11 = r10.getMeasuredWidthAndState()
            r10.setMeasuredDimension(r11, r1)
        Lde:
            return
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onPopulateAccessibilityEvent(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto Lc
            java.lang.CharSequence r0 = r1.o
            goto Le
        Lc:
            java.lang.CharSequence r0 = r1.q
        Le:
            if (r0 == 0) goto L17
            java.util.List r2 = r2.getText()
            r2.add(r0)
        L17:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            android.view.VelocityTracker r0 = r9.x
            r0.addMovement(r10)
            int r1 = r10.getActionMasked()
            int r2 = r9.u
            r3 = 1
            if (r1 == 0) goto Lf4
            r4 = 3
            r5 = 0
            r6 = 2
            if (r1 == r3) goto L8c
            if (r1 == r6) goto L19
            if (r1 == r4) goto L8c
            goto L140
        L19:
            int r0 = r9.t
            if (r0 == r3) goto L5d
            if (r0 == r6) goto L21
            goto L140
        L21:
            float r10 = r10.getX()
            int r0 = r9.getThumbScrollRange()
            float r1 = r9.v
            float r1 = r10 - r1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L34
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L3d
        L34:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r1 = r2
            goto L3d
        L3a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L3d:
            int r0 = r9.getLayoutDirection()
            if (r0 != r3) goto L44
            float r1 = -r1
        L44:
            float r0 = r9.z
            float r1 = r1 + r0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L4c
            goto L53
        L4c:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L52
            r5 = r2
            goto L53
        L52:
            r5 = r1
        L53:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L5c
            r9.v = r10
            r9.setThumbPosition(r5)
        L5c:
            return r3
        L5d:
            float r0 = r10.getX()
            float r1 = r10.getY()
            float r4 = r9.v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            float r2 = (float) r2
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L7e
            float r4 = r9.w
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L140
        L7e:
            r9.t = r6
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r3)
            r9.v = r0
            r9.w = r1
            return r3
        L8c:
            int r1 = r9.t
            r2 = 0
            if (r1 != r6) goto Lee
            r9.t = r2
            int r1 = r10.getAction()
            if (r1 != r3) goto La1
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto La1
            r1 = r3
            goto La2
        La1:
            r1 = r2
        La2:
            boolean r6 = r9.isChecked()
            if (r1 == 0) goto Ld4
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            float r0 = r0.getXVelocity()
            float r1 = java.lang.Math.abs(r0)
            int r7 = r9.y
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto Lcf
            int r1 = r9.getLayoutDirection()
            if (r1 != r3) goto Lca
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lc8
        Lc6:
            r0 = r3
            goto Ld5
        Lc8:
            r0 = r2
            goto Ld5
        Lca:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lc8
            goto Lc6
        Lcf:
            boolean r0 = r9.getTargetCheckedState()
            goto Ld5
        Ld4:
            r0 = r6
        Ld5:
            if (r0 == r6) goto Lda
            r9.playSoundEffect(r2)
        Lda:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r4)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r3
        Lee:
            r9.t = r2
            r0.clear()
            goto L140
        Lf4:
            float r0 = r10.getX()
            float r1 = r10.getY()
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto L140
            android.graphics.drawable.Drawable r4 = r9.f843a
            if (r4 != 0) goto L107
            goto L140
        L107:
            int r4 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r9.f843a
            android.graphics.Rect r6 = r9.Q
            r5.getPadding(r6)
            int r5 = r9.E
            int r5 = r5 - r2
            int r7 = r9.D
            int r7 = r7 + r4
            int r7 = r7 - r2
            int r4 = r9.C
            int r4 = r4 + r7
            int r8 = r6.left
            int r4 = r4 + r8
            int r6 = r6.right
            int r4 = r4 + r6
            int r4 = r4 + r2
            int r6 = r9.G
            int r6 = r6 + r2
            float r2 = (float) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L140
            float r2 = (float) r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L140
            float r2 = (float) r5
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L140
            float r2 = (float) r6
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L140
            r9.t = r3
            r9.v = r0
            r9.w = r1
        L140:
            boolean r10 = super.onTouchEvent(r10)
            return r10
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            a.b1 r0 = r1.getEmojiTextViewHelper()
            r0.c(r2)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r8) {
            r7 = this;
            r0 = 1
            super.setChecked(r8)
            boolean r8 = r7.isChecked()
            r1 = 64
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r3 = 30
            if (r8 == 0) goto L2f
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r3) goto L4d
            java.lang.CharSequence r4 = r7.o
            if (r4 != 0) goto L22
            android.content.res.Resources r4 = r7.getResources()
            int r5 = androidx.appcompat.R.string.abc_capital_on
            java.lang.String r4 = r4.getString(r5)
        L22:
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            a.sg r5 = new a.sg
            int r6 = androidx.core.R.id.tag_state_description
            r5.<init>(r6, r2, r1, r3)
            r5.c(r7, r4)
            goto L4d
        L2f:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r3) goto L4d
            java.lang.CharSequence r4 = r7.q
            if (r4 != 0) goto L41
            android.content.res.Resources r4 = r7.getResources()
            int r5 = androidx.appcompat.R.string.abc_capital_off
            java.lang.String r4 = r4.getString(r5)
        L41:
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            a.sg r5 = new a.sg
            int r6 = androidx.core.R.id.tag_state_description
            r5.<init>(r6, r2, r1, r3)
            r5.c(r7, r4)
        L4d:
            android.os.IBinder r1 = r7.getWindowToken()
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L7c
            boolean r1 = r7.isLaidOut()
            if (r1 == 0) goto L7c
            if (r8 == 0) goto L5f
            r2 = r3
        L5f:
            androidx.appcompat.widget.SwitchCompat$a r8 = androidx.appcompat.widget.SwitchCompat.R
            float[] r1 = new float[r0]
            r3 = 0
            r1[r3] = r2
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r7, r8, r1)
            r7.N = r8
            r1 = 250(0xfa, double:1.235E-321)
            r8.setDuration(r1)
            android.animation.ObjectAnimator r8 = r7.N
            r8.setAutoCancel(r0)
            android.animation.ObjectAnimator r8 = r7.N
            r8.start()
            return
        L7c:
            android.animation.ObjectAnimator r0 = r7.N
            if (r0 == 0) goto L83
            r0.cancel()
        L83:
            if (r8 == 0) goto L86
            r2 = r3
        L86:
            r7.setThumbPosition(r2)
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            a.b1 r0 = r1.getEmojiTextViewHelper()
            r0.d(r2)
            java.lang.CharSequence r2 = r1.o
            r1.setTextOnInternal(r2)
            java.lang.CharSequence r2 = r1.q
            r1.setTextOffInternal(r2)
            r1.requestLayout()
            return
    }

    public final void setEnforceSwitchWidth(boolean r1) {
            r0 = this;
            r0.H = r1
            r0.invalidate()
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            a.b1 r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.a(r2)
            super.setFilters(r2)
            return
    }

    public void setShowText(boolean r2) {
            r1 = this;
            boolean r0 = r1.s
            if (r0 == r2) goto Le
            r1.s = r2
            r1.requestLayout()
            if (r2 == 0) goto Le
            r1.d()
        Le:
            return
    }

    public void setSplitTrack(boolean r1) {
            r0 = this;
            r0.n = r1
            r0.invalidate()
            return
    }

    public void setSwitchMinWidth(int r1) {
            r0 = this;
            r0.l = r1
            r0.requestLayout()
            return
    }

    public void setSwitchPadding(int r1) {
            r0 = this;
            r0.m = r1
            r0.requestLayout()
            return
    }

    public void setSwitchTypeface(android.graphics.Typeface r3) {
            r2 = this;
            android.text.TextPaint r0 = r2.I
            android.graphics.Typeface r1 = r0.getTypeface()
            if (r1 == 0) goto L12
            android.graphics.Typeface r1 = r0.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1a
        L12:
            android.graphics.Typeface r1 = r0.getTypeface()
            if (r1 != 0) goto L23
            if (r3 == 0) goto L23
        L1a:
            r0.setTypeface(r3)
            r2.requestLayout()
            r2.invalidate()
        L23:
            return
    }

    public void setTextOff(java.lang.CharSequence r6) {
            r5 = this;
            r5.setTextOffInternal(r6)
            r5.requestLayout()
            boolean r6 = r5.isChecked()
            if (r6 != 0) goto L30
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r6 < r0) goto L30
            java.lang.CharSequence r6 = r5.q
            if (r6 != 0) goto L20
            android.content.res.Resources r6 = r5.getResources()
            int r1 = androidx.appcompat.R.string.abc_capital_off
            java.lang.String r6 = r6.getString(r1)
        L20:
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            a.sg r1 = new a.sg
            int r2 = androidx.core.R.id.tag_state_description
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r4 = 64
            r1.<init>(r2, r3, r4, r0)
            r1.c(r5, r6)
        L30:
            return
    }

    public void setTextOn(java.lang.CharSequence r6) {
            r5 = this;
            r5.setTextOnInternal(r6)
            r5.requestLayout()
            boolean r6 = r5.isChecked()
            if (r6 == 0) goto L30
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r6 < r0) goto L30
            java.lang.CharSequence r6 = r5.o
            if (r6 != 0) goto L20
            android.content.res.Resources r6 = r5.getResources()
            int r1 = androidx.appcompat.R.string.abc_capital_on
            java.lang.String r6 = r6.getString(r1)
        L20:
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            a.sg r1 = new a.sg
            int r2 = androidx.core.R.id.tag_state_description
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r4 = 64
            r1.<init>(r2, r3, r4, r0)
            r1.c(r5, r6)
        L30:
            return
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f843a
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f843a = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    public void setThumbPosition(float r1) {
            r0 = this;
            r0.z = r1
            r0.invalidate()
            return
    }

    public void setThumbResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setThumbDrawable(r2)
            return
    }

    public void setThumbTextPadding(int r1) {
            r0 = this;
            r0.k = r1
            r0.requestLayout()
            return
    }

    public void setThumbTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.b = r1
            r1 = 1
            r0.d = r1
            r0.a()
            return
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.c = r1
            r1 = 1
            r0.e = r1
            r0.a()
            return
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    public void setTrackResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setTrackDrawable(r2)
            return
    }

    public void setTrackTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.g = r1
            r1 = 1
            r0.i = r1
            r0.b()
            return
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.h = r1
            r1 = 1
            r0.j = r1
            r0.b()
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
            r1 = this;
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.f843a
            if (r2 == r0) goto L11
            android.graphics.drawable.Drawable r0 = r1.f
            if (r2 != r0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }
}
