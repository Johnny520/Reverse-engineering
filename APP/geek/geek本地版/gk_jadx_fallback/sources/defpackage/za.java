package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class za {
    public java.lang.CharSequence A;
    public java.lang.CharSequence B;
    public boolean C;
    public final boolean D;
    public android.graphics.Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final android.text.TextPaint N;
    public final android.text.TextPaint O;
    public android.animation.TimeInterpolator P;
    public android.animation.TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public android.content.res.ColorStateList U;
    public float V;
    public float W;
    public float X;
    public android.text.StaticLayout Y;
    public float Z;
    public final com.google.android.material.textfield.TextInputLayout a;
    public float a0;
    public float b;
    public float b0;
    public final android.graphics.Rect c;
    public java.lang.CharSequence c0;
    public final android.graphics.Rect d;
    public final int d0;
    public final android.graphics.RectF e;
    public final float e0;
    public int f;
    public final int f0;
    public int g;
    public float h;
    public float i;
    public android.content.res.ColorStateList j;
    public android.content.res.ColorStateList k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public android.graphics.Typeface r;
    public android.graphics.Typeface s;
    public android.graphics.Typeface t;
    public android.graphics.Typeface u;
    public android.graphics.Typeface v;
    public android.graphics.Typeface w;
    public android.graphics.Typeface x;
    public defpackage.g8 y;
    public final android.text.TextUtils.TruncateAt z;

    public za(com.google.android.material.textfield.TextInputLayout r3) {
            r2 = this;
            r2.<init>()
            r0 = 16
            r2.f = r0
            r2.g = r0
            r0 = 1097859072(0x41700000, float:15.0)
            r2.h = r0
            r2.i = r0
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.z = r0
            r0 = 1
            r2.D = r0
            r2.d0 = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.e0 = r1
            r2.f0 = r0
            r2.a = r3
            android.text.TextPaint r0 = new android.text.TextPaint
            r1 = 129(0x81, float:1.81E-43)
            r0.<init>(r1)
            r2.N = r0
            android.text.TextPaint r1 = new android.text.TextPaint
            r1.<init>(r0)
            r2.O = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.d = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.c = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.e = r0
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            r2.g(r3)
            return
    }

    public static int a(float r5, int r6, int r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r5
            int r1 = android.graphics.Color.alpha(r6)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r2 = android.graphics.Color.alpha(r7)
            float r2 = (float) r2
            float r2 = r2 * r5
            float r2 = r2 + r1
            int r1 = android.graphics.Color.red(r6)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r3 = android.graphics.Color.red(r7)
            float r3 = (float) r3
            float r3 = r3 * r5
            float r3 = r3 + r1
            int r1 = android.graphics.Color.green(r6)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r4 = android.graphics.Color.green(r7)
            float r4 = (float) r4
            float r4 = r4 * r5
            float r4 = r4 + r1
            int r6 = android.graphics.Color.blue(r6)
            float r6 = (float) r6
            float r6 = r6 * r0
            int r7 = android.graphics.Color.blue(r7)
            float r7 = (float) r7
            float r7 = r7 * r5
            float r7 = r7 + r6
            int r5 = java.lang.Math.round(r2)
            int r6 = java.lang.Math.round(r3)
            int r0 = java.lang.Math.round(r4)
            int r7 = java.lang.Math.round(r7)
            int r5 = android.graphics.Color.argb(r5, r6, r0, r7)
            return r5
    }

    public static float f(float r0, float r1, float r2, android.animation.TimeInterpolator r3) {
            if (r3 == 0) goto L6
            float r2 = r3.getInterpolation(r2)
        L6:
            float r0 = defpackage.q2.a(r0, r1, r2)
            return r0
    }

    public final boolean b(java.lang.CharSequence r3) {
            r2 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            com.google.android.material.textfield.TextInputLayout r0 = r2.a
            int r0 = defpackage.t90.d(r0)
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r0 = r2.D
            if (r0 == 0) goto L21
            if (r1 == 0) goto L16
            r7 r0 = defpackage.b60.d
            goto L18
        L16:
            r7 r0 = defpackage.b60.c
        L18:
            int r1 = r3.length()
            boolean r3 = r0.b(r3, r1)
            return r3
        L21:
            return r1
    }

    public final void c(float r11, boolean r12) {
            r10 = this;
            java.lang.CharSequence r0 = r10.A
            if (r0 != 0) goto L6
            goto Lc6
        L6:
            android.graphics.Rect r0 = r10.d
            int r0 = r0.width()
            float r0 = (float) r0
            android.graphics.Rect r1 = r10.c
            int r1 = r1.width()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11 - r2
            float r3 = java.lang.Math.abs(r3)
            r4 = 925353388(0x3727c5ac, float:1.0E-5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r5 = 0
            if (r3 >= 0) goto L2d
            float r11 = r10.i
            float r12 = r10.V
            r10.F = r2
            android.graphics.Typeface r1 = r10.r
            goto L68
        L2d:
            float r3 = r10.h
            float r6 = r10.W
            android.graphics.Typeface r7 = r10.u
            float r8 = r11 - r5
            float r8 = java.lang.Math.abs(r8)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L40
            r10.F = r2
            goto L4f
        L40:
            float r4 = r10.h
            float r8 = r10.i
            android.animation.TimeInterpolator r9 = r10.Q
            float r11 = f(r4, r8, r11, r9)
            float r4 = r10.h
            float r11 = r11 / r4
            r10.F = r11
        L4f:
            float r11 = r10.i
            float r4 = r10.h
            float r11 = r11 / r4
            float r4 = r1 * r11
            if (r12 != 0) goto L66
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 <= 0) goto L66
            float r0 = r0 / r11
            float r11 = java.lang.Math.min(r0, r1)
            r0 = r11
        L62:
            r11 = r3
            r12 = r6
            r1 = r7
            goto L68
        L66:
            r0 = r1
            goto L62
        L68:
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            android.text.TextPaint r4 = r10.N
            r5 = 1
            r6 = 0
            if (r3 <= 0) goto Lbe
            float r3 = r10.G
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 == 0) goto L78
            r3 = r5
            goto L79
        L78:
            r3 = r6
        L79:
            float r7 = r10.X
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 == 0) goto L81
            r7 = r5
            goto L82
        L81:
            r7 = r6
        L82:
            android.graphics.Typeface r8 = r10.x
            if (r8 == r1) goto L88
            r8 = r5
            goto L89
        L88:
            r8 = r6
        L89:
            android.text.StaticLayout r9 = r10.Y
            if (r9 == 0) goto L98
            int r9 = r9.getWidth()
            float r9 = (float) r9
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 == 0) goto L98
            r9 = r5
            goto L99
        L98:
            r9 = r6
        L99:
            if (r3 != 0) goto La8
            if (r7 != 0) goto La8
            if (r9 != 0) goto La8
            if (r8 != 0) goto La8
            boolean r3 = r10.M
            if (r3 == 0) goto La6
            goto La8
        La6:
            r3 = r6
            goto La9
        La8:
            r3 = r5
        La9:
            r10.G = r11
            r10.X = r12
            r10.x = r1
            r10.M = r6
            float r11 = r10.F
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto Lb9
            r11 = r5
            goto Lba
        Lb9:
            r11 = r6
        Lba:
            r4.setLinearText(r11)
            goto Lbf
        Lbe:
            r3 = r6
        Lbf:
            java.lang.CharSequence r11 = r10.B
            if (r11 == 0) goto Lc7
            if (r3 == 0) goto Lc6
            goto Lc7
        Lc6:
            return
        Lc7:
            float r11 = r10.G
            r4.setTextSize(r11)
            android.graphics.Typeface r11 = r10.x
            r4.setTypeface(r11)
            float r11 = r10.X
            r4.setLetterSpacing(r11)
            java.lang.CharSequence r11 = r10.A
            boolean r11 = r10.b(r11)
            r10.C = r11
            int r12 = r10.d0
            if (r12 <= r5) goto Le4
            if (r11 == 0) goto Le5
        Le4:
            r12 = r5
        Le5:
            if (r12 != r5) goto Lea
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L10d
        Lea:
            int r1 = r10.f
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r11)
            r1 = r1 & 7
            if (r1 == r5) goto L10b
            r2 = 5
            if (r1 == r2) goto L101
            boolean r1 = r10.C
            if (r1 == 0) goto Lfe
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L10d
        Lfe:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L10d
        L101:
            boolean r1 = r10.C
            if (r1 == 0) goto L108
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L10d
        L108:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L10d
        L10b:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
        L10d:
            java.lang.CharSequence r2 = r10.A
            int r0 = (int) r0
            t40 r3 = new t40
            r3.<init>(r2, r4, r0)
            android.text.TextUtils$TruncateAt r0 = r10.z
            r3.k = r0
            r3.j = r11
            r3.e = r1
            r3.i = r6
            r3.f = r12
            float r11 = r10.e0
            r3.g = r11
            int r11 = r10.f0
            r3.h = r11
            android.text.StaticLayout r11 = r3.a()
            r11.getClass()
            r10.Y = r11
            java.lang.CharSequence r11 = r11.getText()
            r10.B = r11
            return
    }

    public final float d() {
            r2 = this;
            float r0 = r2.i
            android.text.TextPaint r1 = r2.O
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = r2.r
            r1.setTypeface(r0)
            float r0 = r2.V
            r1.setLetterSpacing(r0)
            float r0 = r1.ascent()
            float r0 = -r0
            return r0
    }

    public final int e(android.content.res.ColorStateList r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int[] r1 = r2.L
            if (r1 == 0) goto Ld
            int r3 = r3.getColorForState(r1, r0)
            return r3
        Ld:
            int r3 = r3.getDefaultColor()
            return r3
    }

    public final void g(android.content.res.Configuration r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L30
            android.graphics.Typeface r0 = r2.t
            if (r0 == 0) goto L10
            android.graphics.Typeface r0 = defpackage.zt.G(r3, r0)
            r2.s = r0
        L10:
            android.graphics.Typeface r0 = r2.w
            if (r0 == 0) goto L1a
            android.graphics.Typeface r3 = defpackage.zt.G(r3, r0)
            r2.v = r3
        L1a:
            android.graphics.Typeface r3 = r2.s
            if (r3 == 0) goto L1f
            goto L21
        L1f:
            android.graphics.Typeface r3 = r2.t
        L21:
            r2.r = r3
            android.graphics.Typeface r3 = r2.v
            if (r3 == 0) goto L28
            goto L2a
        L28:
            android.graphics.Typeface r3 = r2.w
        L2a:
            r2.u = r3
            r3 = 1
            r2.h(r3)
        L30:
            return
    }

    public final void h(boolean r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.material.textfield.TextInputLayout r2 = r0.a
            int r3 = r2.getHeight()
            if (r3 <= 0) goto L12
            int r3 = r2.getWidth()
            if (r3 > 0) goto L14
        L12:
            if (r1 == 0) goto L1fe
        L14:
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.c(r3, r1)
            java.lang.CharSequence r4 = r0.B
            android.text.TextPaint r5 = r0.N
            if (r4 == 0) goto L30
            android.text.StaticLayout r6 = r0.Y
            if (r6 == 0) goto L30
            int r6 = r6.getWidth()
            float r6 = (float) r6
            android.text.TextUtils$TruncateAt r7 = r0.z
            java.lang.CharSequence r4 = android.text.TextUtils.ellipsize(r4, r5, r6, r7)
            r0.c0 = r4
        L30:
            java.lang.CharSequence r4 = r0.c0
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L41
            int r8 = r4.length()
            float r4 = r5.measureText(r4, r7, r8)
            r0.Z = r4
            goto L43
        L41:
            r0.Z = r6
        L43:
            int r4 = r0.g
            boolean r8 = r0.C
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r8)
            r8 = r4 & 112(0x70, float:1.57E-43)
            android.graphics.Rect r9 = r0.d
            r10 = 80
            r11 = 48
            r12 = 1073741824(0x40000000, float:2.0)
            if (r8 == r11) goto L77
            if (r8 == r10) goto L6c
            float r8 = r5.descent()
            float r13 = r5.ascent()
            float r8 = r8 - r13
            float r8 = r8 / r12
            int r13 = r9.centerY()
            float r13 = (float) r13
            float r13 = r13 - r8
            r0.m = r13
            goto L7c
        L6c:
            int r8 = r9.bottom
            float r8 = (float) r8
            float r13 = r5.ascent()
            float r13 = r13 + r8
            r0.m = r13
            goto L7c
        L77:
            int r8 = r9.top
            float r8 = (float) r8
            r0.m = r8
        L7c:
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r8
            r13 = 5
            r14 = 1
            if (r4 == r14) goto L95
            if (r4 == r13) goto L8c
            int r4 = r9.left
            float r4 = (float) r4
            r0.o = r4
            goto La0
        L8c:
            int r4 = r9.right
            float r4 = (float) r4
            float r15 = r0.Z
            float r4 = r4 - r15
            r0.o = r4
            goto La0
        L95:
            int r4 = r9.centerX()
            float r4 = (float) r4
            float r15 = r0.Z
            float r15 = r15 / r12
            float r4 = r4 - r15
            r0.o = r4
        La0:
            r0.c(r6, r1)
            android.text.StaticLayout r1 = r0.Y
            if (r1 == 0) goto Lad
            int r1 = r1.getHeight()
            float r1 = (float) r1
            goto Lae
        Lad:
            r1 = r6
        Lae:
            android.text.StaticLayout r4 = r0.Y
            if (r4 == 0) goto Lbc
            int r15 = r0.d0
            if (r15 <= r14) goto Lbc
            int r4 = r4.getWidth()
            float r4 = (float) r4
            goto Lca
        Lbc:
            java.lang.CharSequence r4 = r0.B
            if (r4 == 0) goto Lc9
            int r15 = r4.length()
            float r4 = r5.measureText(r4, r7, r15)
            goto Lca
        Lc9:
            r4 = r6
        Lca:
            android.text.StaticLayout r15 = r0.Y
            if (r15 == 0) goto Ld1
            r15.getLineCount()
        Ld1:
            int r15 = r0.f
            r16 = r8
            boolean r8 = r0.C
            int r8 = android.view.Gravity.getAbsoluteGravity(r15, r8)
            r15 = r8 & 112(0x70, float:1.57E-43)
            r17 = r12
            android.graphics.Rect r12 = r0.c
            if (r15 == r11) goto Lfc
            if (r15 == r10) goto Lf0
            float r1 = r1 / r17
            int r10 = r12.centerY()
            float r10 = (float) r10
            float r10 = r10 - r1
            r0.l = r10
            goto L101
        Lf0:
            int r10 = r12.bottom
            float r10 = (float) r10
            float r10 = r10 - r1
            float r1 = r5.descent()
            float r1 = r1 + r10
            r0.l = r1
            goto L101
        Lfc:
            int r1 = r12.top
            float r1 = (float) r1
            r0.l = r1
        L101:
            r1 = r8 & r16
            if (r1 == r14) goto L114
            if (r1 == r13) goto L10d
            int r1 = r12.left
            float r1 = (float) r1
            r0.n = r1
            goto L11e
        L10d:
            int r1 = r12.right
            float r1 = (float) r1
            float r1 = r1 - r4
            r0.n = r1
            goto L11e
        L114:
            int r1 = r12.centerX()
            float r1 = (float) r1
            float r4 = r4 / r17
            float r1 = r1 - r4
            r0.n = r1
        L11e:
            android.graphics.Bitmap r1 = r0.E
            if (r1 == 0) goto L128
            r1.recycle()
            r1 = 0
            r0.E = r1
        L128:
            float r1 = r0.b
            r0.l(r1)
            float r1 = r0.b
            int r4 = r12.left
            float r4 = (float) r4
            int r8 = r9.left
            float r8 = (float) r8
            android.animation.TimeInterpolator r10 = r0.P
            float r4 = f(r4, r8, r1, r10)
            android.graphics.RectF r8 = r0.e
            r8.left = r4
            float r4 = r0.l
            float r10 = r0.m
            android.animation.TimeInterpolator r11 = r0.P
            float r4 = f(r4, r10, r1, r11)
            r8.top = r4
            int r4 = r12.right
            float r4 = (float) r4
            int r10 = r9.right
            float r10 = (float) r10
            android.animation.TimeInterpolator r11 = r0.P
            float r4 = f(r4, r10, r1, r11)
            r8.right = r4
            int r4 = r12.bottom
            float r4 = (float) r4
            int r9 = r9.bottom
            float r9 = (float) r9
            android.animation.TimeInterpolator r10 = r0.P
            float r4 = f(r4, r9, r1, r10)
            r8.bottom = r4
            float r4 = r0.n
            float r8 = r0.o
            android.animation.TimeInterpolator r9 = r0.P
            float r4 = f(r4, r8, r1, r9)
            r0.p = r4
            float r4 = r0.l
            float r8 = r0.m
            android.animation.TimeInterpolator r9 = r0.P
            float r4 = f(r4, r8, r1, r9)
            r0.q = r4
            r0.l(r1)
            float r4 = r3 - r1
            tj r8 = defpackage.q2.b
            float r4 = f(r6, r3, r4, r8)
            float r4 = r3 - r4
            r0.a0 = r4
            java.util.WeakHashMap r4 = defpackage.ja0.a
            defpackage.s90.k(r2)
            float r3 = f(r3, r6, r1, r8)
            r0.b0 = r3
            defpackage.s90.k(r2)
            android.content.res.ColorStateList r3 = r0.k
            android.content.res.ColorStateList r4 = r0.j
            if (r3 == r4) goto L1b4
            int r3 = r0.e(r4)
            android.content.res.ColorStateList r4 = r0.k
            int r4 = r0.e(r4)
            int r3 = a(r1, r3, r4)
            r5.setColor(r3)
            goto L1bb
        L1b4:
            int r3 = r0.e(r3)
            r5.setColor(r3)
        L1bb:
            float r3 = r0.V
            float r4 = r0.W
            int r9 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r9 == 0) goto L1cb
            float r3 = f(r4, r3, r1, r8)
            r5.setLetterSpacing(r3)
            goto L1ce
        L1cb:
            r5.setLetterSpacing(r3)
        L1ce:
            float r3 = r0.R
            float r3 = defpackage.q2.a(r6, r3, r1)
            r0.H = r3
            float r3 = r0.S
            float r3 = defpackage.q2.a(r6, r3, r1)
            r0.I = r3
            float r3 = r0.T
            float r3 = defpackage.q2.a(r6, r3, r1)
            r0.J = r3
            android.content.res.ColorStateList r3 = r0.U
            int r3 = r0.e(r3)
            int r1 = a(r1, r7, r3)
            r0.K = r1
            float r3 = r0.H
            float r4 = r0.I
            float r6 = r0.J
            r5.setShadowLayer(r3, r4, r6, r1)
            defpackage.s90.k(r2)
        L1fe:
            return
    }

    public final void i(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.k
            if (r0 != r2) goto La
            android.content.res.ColorStateList r0 = r1.j
            if (r0 == r2) goto L9
            goto La
        L9:
            return
        La:
            r1.k = r2
            r1.j = r2
            r2 = 0
            r1.h(r2)
            return
    }

    public final boolean j(android.graphics.Typeface r3) {
            r2 = this;
            g8 r0 = r2.y
            r1 = 1
            if (r0 == 0) goto L7
            r0.c = r1
        L7:
            android.graphics.Typeface r0 = r2.t
            if (r0 == r3) goto L28
            r2.t = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.a
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.graphics.Typeface r3 = defpackage.zt.G(r0, r3)
            r2.s = r3
            if (r3 != 0) goto L25
            android.graphics.Typeface r3 = r2.t
        L25:
            r2.r = r3
            return r1
        L28:
            r3 = 0
            return r3
    }

    public final void k(float r9) {
            r8 = this;
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 >= 0) goto L9
            r9 = r0
            goto Le
        L9:
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 <= 0) goto Le
            r9 = r2
        Le:
            float r1 = r8.b
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 == 0) goto Lee
            r8.b = r9
            android.graphics.Rect r1 = r8.c
            int r3 = r1.left
            float r3 = (float) r3
            android.graphics.Rect r4 = r8.d
            int r5 = r4.left
            float r5 = (float) r5
            android.animation.TimeInterpolator r6 = r8.P
            float r3 = f(r3, r5, r9, r6)
            android.graphics.RectF r5 = r8.e
            r5.left = r3
            float r3 = r8.l
            float r6 = r8.m
            android.animation.TimeInterpolator r7 = r8.P
            float r3 = f(r3, r6, r9, r7)
            r5.top = r3
            int r3 = r1.right
            float r3 = (float) r3
            int r6 = r4.right
            float r6 = (float) r6
            android.animation.TimeInterpolator r7 = r8.P
            float r3 = f(r3, r6, r9, r7)
            r5.right = r3
            int r1 = r1.bottom
            float r1 = (float) r1
            int r3 = r4.bottom
            float r3 = (float) r3
            android.animation.TimeInterpolator r4 = r8.P
            float r1 = f(r1, r3, r9, r4)
            r5.bottom = r1
            float r1 = r8.n
            float r3 = r8.o
            android.animation.TimeInterpolator r4 = r8.P
            float r1 = f(r1, r3, r9, r4)
            r8.p = r1
            float r1 = r8.l
            float r3 = r8.m
            android.animation.TimeInterpolator r4 = r8.P
            float r1 = f(r1, r3, r9, r4)
            r8.q = r1
            r8.l(r9)
            float r1 = r2 - r9
            tj r3 = defpackage.q2.b
            float r1 = f(r0, r2, r1, r3)
            float r1 = r2 - r1
            r8.a0 = r1
            java.util.WeakHashMap r1 = defpackage.ja0.a
            com.google.android.material.textfield.TextInputLayout r1 = r8.a
            defpackage.s90.k(r1)
            float r2 = f(r2, r0, r9, r3)
            r8.b0 = r2
            defpackage.s90.k(r1)
            android.content.res.ColorStateList r2 = r8.k
            android.content.res.ColorStateList r4 = r8.j
            android.text.TextPaint r5 = r8.N
            if (r2 == r4) goto La3
            int r2 = r8.e(r4)
            android.content.res.ColorStateList r4 = r8.k
            int r4 = r8.e(r4)
            int r2 = a(r9, r2, r4)
            r5.setColor(r2)
            goto Laa
        La3:
            int r2 = r8.e(r2)
            r5.setColor(r2)
        Laa:
            float r2 = r8.V
            float r4 = r8.W
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto Lba
            float r2 = f(r4, r2, r9, r3)
            r5.setLetterSpacing(r2)
            goto Lbd
        Lba:
            r5.setLetterSpacing(r2)
        Lbd:
            float r2 = r8.R
            float r2 = defpackage.q2.a(r0, r2, r9)
            r8.H = r2
            float r2 = r8.S
            float r2 = defpackage.q2.a(r0, r2, r9)
            r8.I = r2
            float r2 = r8.T
            float r0 = defpackage.q2.a(r0, r2, r9)
            r8.J = r0
            android.content.res.ColorStateList r0 = r8.U
            int r0 = r8.e(r0)
            r2 = 0
            int r9 = a(r9, r2, r0)
            r8.K = r9
            float r0 = r8.H
            float r2 = r8.I
            float r3 = r8.J
            r5.setShadowLayer(r0, r2, r3, r9)
            defpackage.s90.k(r1)
        Lee:
            return
    }

    public final void l(float r2) {
            r1 = this;
            r0 = 0
            r1.c(r2, r0)
            java.util.WeakHashMap r2 = defpackage.ja0.a
            com.google.android.material.textfield.TextInputLayout r2 = r1.a
            defpackage.s90.k(r2)
            return
    }

    public final void m(android.graphics.Typeface r4) {
            r3 = this;
            boolean r0 = r3.j(r4)
            android.graphics.Typeface r1 = r3.w
            r2 = 0
            if (r1 == r4) goto L27
            r3.w = r4
            com.google.android.material.textfield.TextInputLayout r1 = r3.a
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.graphics.Typeface r4 = defpackage.zt.G(r1, r4)
            r3.v = r4
            if (r4 != 0) goto L23
            android.graphics.Typeface r4 = r3.w
        L23:
            r3.u = r4
            r4 = 1
            goto L28
        L27:
            r4 = r2
        L28:
            if (r0 != 0) goto L2e
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            return
        L2e:
            r3.h(r2)
            return
    }
}
