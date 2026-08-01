package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ka extends defpackage.eu implements android.graphics.drawable.Drawable.Callback, defpackage.c60 {
    public static final int[] F0 = null;
    public static final android.graphics.drawable.ShapeDrawable G0 = null;
    public float A;
    public java.lang.ref.WeakReference A0;
    public android.content.res.ColorStateList B;
    public android.text.TextUtils.TruncateAt B0;
    public float C;
    public boolean C0;
    public android.content.res.ColorStateList D;
    public int D0;
    public java.lang.CharSequence E;
    public boolean E0;
    public boolean F;
    public android.graphics.drawable.Drawable G;
    public android.content.res.ColorStateList H;
    public float I;
    public boolean J;
    public boolean K;
    public android.graphics.drawable.Drawable L;
    public android.graphics.drawable.RippleDrawable M;
    public android.content.res.ColorStateList N;
    public float O;
    public android.text.SpannableStringBuilder P;
    public boolean Q;
    public boolean R;
    public android.graphics.drawable.Drawable S;
    public android.content.res.ColorStateList T;
    public defpackage.bw U;
    public defpackage.bw V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public final android.content.Context e0;
    public final android.graphics.Paint f0;
    public final android.graphics.Paint.FontMetrics g0;
    public final android.graphics.RectF h0;
    public final android.graphics.PointF i0;
    public final android.graphics.Path j0;
    public final defpackage.d60 k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public boolean r0;
    public int s0;
    public int t0;
    public android.graphics.ColorFilter u0;
    public android.graphics.PorterDuffColorFilter v0;
    public android.content.res.ColorStateList w0;
    public android.content.res.ColorStateList x;
    public android.graphics.PorterDuff.Mode x0;
    public android.content.res.ColorStateList y;
    public int[] y0;
    public float z;
    public android.content.res.ColorStateList z0;

    static {
            r0 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0}
            defpackage.ka.F0 = r0
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r1 = new android.graphics.drawable.shapes.OvalShape
            r1.<init>()
            r0.<init>(r1)
            defpackage.ka.G0 = r0
            return
    }

    public ka(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130968767(0x7f0400bf, float:1.7546197E38)
            r1 = 2131821568(0x7f110400, float:1.9275883E38)
            r2.<init>(r3, r4, r0, r1)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.A = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r0 = 1
            r4.<init>(r0)
            r2.f0 = r4
            android.graphics.Paint$FontMetrics r4 = new android.graphics.Paint$FontMetrics
            r4.<init>()
            r2.g0 = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r2.h0 = r4
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            r2.i0 = r4
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r2.j0 = r4
            r4 = 255(0xff, float:3.57E-43)
            r2.t0 = r4
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.x0 = r4
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r1 = 0
            r4.<init>(r1)
            r2.A0 = r4
            r2.h(r3)
            r2.e0 = r3
            d60 r4 = new d60
            r4.<init>(r2)
            r2.k0 = r4
            java.lang.String r1 = ""
            r2.E = r1
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            android.text.TextPaint r4 = r4.a
            r4.density = r3
            int[] r3 = defpackage.ka.F0
            r2.setState(r3)
            int[] r4 = r2.y0
            boolean r4 = java.util.Arrays.equals(r4, r3)
            if (r4 != 0) goto L7b
            r2.y0 = r3
            boolean r4 = r2.T()
            if (r4 == 0) goto L7b
            int[] r4 = r2.getState()
            r2.v(r4, r3)
        L7b:
            r2.C0 = r0
            int[] r3 = defpackage.g10.a
            android.graphics.drawable.ShapeDrawable r3 = defpackage.ka.G0
            r4 = -1
            r3.setTint(r4)
            return
    }

    public static void U(android.graphics.drawable.Drawable r1) {
            if (r1 == 0) goto L6
            r0 = 0
            r1.setCallback(r0)
        L6:
            return
    }

    public static boolean s(android.content.res.ColorStateList r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean t(android.graphics.drawable.Drawable r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void A(float r3) {
            r2 = this;
            float r0 = r2.A
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L33
            r2.A = r3
            du r0 = r2.a
            f30 r0 = r0.a
            e30 r0 = r0.e()
            e r1 = new e
            r1.<init>(r3)
            r0.e = r1
            e r1 = new e
            r1.<init>(r3)
            r0.f = r1
            e r1 = new e
            r1.<init>(r3)
            r0.g = r1
            e r1 = new e
            r1.<init>(r3)
            r0.h = r1
            f30 r3 = r0.a()
            r2.setShapeAppearanceModel(r3)
        L33:
            return
    }

    public final void B(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.G
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r2 = r0 instanceof defpackage.ad0
            if (r2 == 0) goto Le
            ad0 r0 = (defpackage.ad0) r0
            r0 = 0
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 == r4) goto L38
            float r2 = r3.p()
            if (r4 == 0) goto L1a
            android.graphics.drawable.Drawable r1 = r4.mutate()
        L1a:
            r3.G = r1
            float r4 = r3.p()
            U(r0)
            boolean r0 = r3.S()
            if (r0 == 0) goto L2e
            android.graphics.drawable.Drawable r0 = r3.G
            r3.n(r0)
        L2e:
            r3.invalidateSelf()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L38
            r3.u()
        L38:
            return
    }

    public final void C(float r2) {
            r1 = this;
            float r0 = r1.I
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.p()
            r1.I = r2
            float r2 = r1.p()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.u()
        L1a:
            return
    }

    public final void D(android.content.res.ColorStateList r2) {
            r1 = this;
            r0 = 1
            r1.J = r0
            android.content.res.ColorStateList r0 = r1.H
            if (r0 == r2) goto L1b
            r1.H = r2
            boolean r0 = r1.S()
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.G
            defpackage.ch.h(r0, r2)
        L14:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L1b:
            return
    }

    public final void E(boolean r2) {
            r1 = this;
            boolean r0 = r1.F
            if (r0 == r2) goto L23
            boolean r0 = r1.S()
            r1.F = r2
            boolean r2 = r1.S()
            if (r0 == r2) goto L23
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r1.G
            r1.n(r2)
            goto L1d
        L18:
            android.graphics.drawable.Drawable r2 = r1.G
            U(r2)
        L1d:
            r1.invalidateSelf()
            r1.u()
        L23:
            return
    }

    public final void F(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.B
            if (r0 == r3) goto L20
            r2.B = r3
            boolean r0 = r2.E0
            if (r0 == 0) goto L19
            du r0 = r2.a
            android.content.res.ColorStateList r1 = r0.d
            if (r1 == r3) goto L19
            r0.d = r3
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        L19:
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        L20:
            return
    }

    public final void G(float r2) {
            r1 = this;
            float r0 = r1.C
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1b
            r1.C = r2
            android.graphics.Paint r0 = r1.f0
            r0.setStrokeWidth(r2)
            boolean r0 = r1.E0
            if (r0 == 0) goto L18
            du r0 = r1.a
            r0.j = r2
            r1.invalidateSelf()
        L18:
            r1.invalidateSelf()
        L1b:
            return
    }

    public final void H(android.graphics.drawable.Drawable r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.L
            r1 = 0
            if (r0 == 0) goto Lb
            boolean r2 = r0 instanceof defpackage.ad0
            if (r2 == 0) goto Lc
            ad0 r0 = (defpackage.ad0) r0
        Lb:
            r0 = r1
        Lc:
            if (r0 == r6) goto L49
            float r2 = r5.q()
            if (r6 == 0) goto L18
            android.graphics.drawable.Drawable r1 = r6.mutate()
        L18:
            r5.L = r1
            int[] r6 = defpackage.g10.a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = r5.D
            android.content.res.ColorStateList r1 = defpackage.g10.a(r1)
            android.graphics.drawable.Drawable r3 = r5.L
            android.graphics.drawable.ShapeDrawable r4 = defpackage.ka.G0
            r6.<init>(r1, r3, r4)
            r5.M = r6
            float r6 = r5.q()
            U(r0)
            boolean r0 = r5.T()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r5.L
            r5.n(r0)
        L3f:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L49
            r5.u()
        L49:
            return
    }

    public final void I(float r2) {
            r1 = this;
            float r0 = r1.c0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.c0 = r2
            r1.invalidateSelf()
            boolean r2 = r1.T()
            if (r2 == 0) goto L14
            r1.u()
        L14:
            return
    }

    public final void J(float r2) {
            r1 = this;
            float r0 = r1.O
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.O = r2
            r1.invalidateSelf()
            boolean r2 = r1.T()
            if (r2 == 0) goto L14
            r1.u()
        L14:
            return
    }

    public final void K(float r2) {
            r1 = this;
            float r0 = r1.b0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.b0 = r2
            r1.invalidateSelf()
            boolean r2 = r1.T()
            if (r2 == 0) goto L14
            r1.u()
        L14:
            return
    }

    public final void L(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.N
            if (r0 == r2) goto L18
            r1.N = r2
            boolean r0 = r1.T()
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.L
            defpackage.ch.h(r0, r2)
        L11:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L18:
            return
    }

    public final void M(boolean r2) {
            r1 = this;
            boolean r0 = r1.K
            if (r0 == r2) goto L23
            boolean r0 = r1.T()
            r1.K = r2
            boolean r2 = r1.T()
            if (r0 == r2) goto L23
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r1.L
            r1.n(r2)
            goto L1d
        L18:
            android.graphics.drawable.Drawable r2 = r1.L
            U(r2)
        L1d:
            r1.invalidateSelf()
            r1.u()
        L23:
            return
    }

    public final void N(float r2) {
            r1 = this;
            float r0 = r1.Y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.p()
            r1.Y = r2
            float r2 = r1.p()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.u()
        L1a:
            return
    }

    public final void O(float r2) {
            r1 = this;
            float r0 = r1.X
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.p()
            r1.X = r2
            float r2 = r1.p()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.u()
        L1a:
            return
    }

    public final void P(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.D
            if (r0 == r2) goto L10
            r1.D = r2
            r2 = 0
            r1.z0 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L10:
            return
    }

    public final void Q(defpackage.a60 r6) {
            r5 = this;
            d60 r0 = r5.k0
            ha r1 = r0.b
            android.text.TextPaint r2 = r0.a
            a60 r3 = r0.f
            if (r3 == r6) goto L43
            r0.f = r6
            if (r6 == 0) goto L29
            android.content.Context r3 = r5.e0
            r6.f(r3, r2, r1)
            java.lang.ref.WeakReference r4 = r0.e
            java.lang.Object r4 = r4.get()
            c60 r4 = (defpackage.c60) r4
            if (r4 == 0) goto L23
            int[] r4 = r4.getState()
            r2.drawableState = r4
        L23:
            r6.e(r3, r2, r1)
            r6 = 1
            r0.d = r6
        L29:
            java.lang.ref.WeakReference r6 = r0.e
            java.lang.Object r6 = r6.get()
            c60 r6 = (defpackage.c60) r6
            if (r6 == 0) goto L43
            r0 = r6
            ka r0 = (defpackage.ka) r0
            r0.u()
            r0.invalidateSelf()
            int[] r6 = r6.getState()
            r0.onStateChange(r6)
        L43:
            return
    }

    public final boolean R() {
            r1 = this;
            boolean r0 = r1.R
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.S
            if (r0 == 0) goto Le
            boolean r0 = r1.r0
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final boolean S() {
            r1 = this;
            boolean r0 = r1.F
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.G
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean T() {
            r1 = this;
            boolean r0 = r1.K
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.L
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r20) {
            r19 = this;
            r0 = r19
            android.graphics.Rect r7 = r0.getBounds()
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L10
            int r6 = r0.t0
            if (r6 != 0) goto L13
        L10:
            r13 = r0
            goto L2c5
        L13:
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            if (r6 >= r8) goto L2c
            int r1 = r7.left
            float r2 = (float) r1
            int r1 = r7.top
            float r3 = (float) r1
            int r1 = r7.right
            float r4 = (float) r1
            int r1 = r7.bottom
            float r5 = (float) r1
            r1 = r20
            int r2 = r1.saveLayerAlpha(r2, r3, r4, r5, r6)
            r10 = r2
            goto L2f
        L2c:
            r1 = r20
            r10 = r9
        L2f:
            boolean r2 = r0.E0
            r3 = r2
            android.graphics.Paint r2 = r0.f0
            android.graphics.RectF r11 = r0.h0
            if (r3 != 0) goto L50
            int r3 = r0.l0
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            r11.set(r7)
            float r3 = r0.r()
            float r4 = r0.r()
            r1.drawRoundRect(r11, r3, r4, r2)
        L50:
            boolean r3 = r0.E0
            if (r3 != 0) goto L76
            int r3 = r0.m0
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            android.graphics.ColorFilter r3 = r0.u0
            if (r3 == 0) goto L63
            goto L65
        L63:
            android.graphics.PorterDuffColorFilter r3 = r0.v0
        L65:
            r2.setColorFilter(r3)
            r11.set(r7)
            float r3 = r0.r()
            float r4 = r0.r()
            r1.drawRoundRect(r11, r3, r4, r2)
        L76:
            boolean r3 = r0.E0
            if (r3 == 0) goto L7d
            super.draw(r20)
        L7d:
            float r3 = r0.C
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            r12 = 1073741824(0x40000000, float:2.0)
            if (r3 <= 0) goto Lc1
            boolean r3 = r0.E0
            if (r3 != 0) goto Lc1
            int r3 = r0.o0
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            boolean r3 = r0.E0
            if (r3 != 0) goto La2
            android.graphics.ColorFilter r3 = r0.u0
            if (r3 == 0) goto L9d
            goto L9f
        L9d:
            android.graphics.PorterDuffColorFilter r3 = r0.v0
        L9f:
            r2.setColorFilter(r3)
        La2:
            int r3 = r7.left
            float r3 = (float) r3
            float r4 = r0.C
            float r4 = r4 / r12
            float r3 = r3 + r4
            int r5 = r7.top
            float r5 = (float) r5
            float r5 = r5 + r4
            int r13 = r7.right
            float r13 = (float) r13
            float r13 = r13 - r4
            int r14 = r7.bottom
            float r14 = (float) r14
            float r14 = r14 - r4
            r11.set(r3, r5, r13, r14)
            float r3 = r0.A
            float r4 = r0.C
            float r4 = r4 / r12
            float r3 = r3 - r4
            r1.drawRoundRect(r11, r3, r3, r2)
        Lc1:
            int r3 = r0.p0
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            r11.set(r7)
            boolean r3 = r0.E0
            if (r3 != 0) goto Ldf
            float r3 = r0.r()
            float r4 = r0.r()
            r1.drawRoundRect(r11, r3, r4, r2)
        Ldd:
            r13 = r0
            goto L107
        Ldf:
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r7)
            du r4 = r0.a
            f30 r14 = r4.a
            float r15 = r4.i
            l0 r4 = r0.q
            h30 r13 = r0.r
            android.graphics.Path r5 = r0.j0
            r16 = r3
            r17 = r4
            r18 = r5
            r13.a(r14, r15, r16, r17, r18)
            android.graphics.RectF r5 = r0.f()
            du r3 = r0.a
            f30 r4 = r3.a
            r3 = r18
            r0.d(r1, r2, r3, r4, r5)
            goto Ldd
        L107:
            boolean r0 = r13.S()
            if (r0 == 0) goto L130
            r13.o(r7, r11)
            float r0 = r11.left
            float r2 = r11.top
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r3 = r13.G
            float r4 = r11.width()
            int r4 = (int) r4
            float r5 = r11.height()
            int r5 = (int) r5
            r3.setBounds(r9, r9, r4, r5)
            android.graphics.drawable.Drawable r3 = r13.G
            r3.draw(r1)
            float r0 = -r0
            float r2 = -r2
            r1.translate(r0, r2)
        L130:
            boolean r0 = r13.R()
            if (r0 == 0) goto L159
            r13.o(r7, r11)
            float r0 = r11.left
            float r2 = r11.top
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r3 = r13.S
            float r4 = r11.width()
            int r4 = (int) r4
            float r5 = r11.height()
            int r5 = (int) r5
            r3.setBounds(r9, r9, r4, r5)
            android.graphics.drawable.Drawable r3 = r13.S
            r3.draw(r1)
            float r0 = -r0
            float r2 = -r2
            r1.translate(r0, r2)
        L159:
            boolean r0 = r13.C0
            if (r0 == 0) goto L24d
            java.lang.CharSequence r0 = r13.E
            if (r0 == 0) goto L24d
            android.graphics.PointF r0 = r13.i0
            r0.set(r6, r6)
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            java.lang.CharSequence r3 = r13.E
            d60 r4 = r13.k0
            if (r3 == 0) goto L1a2
            float r3 = r13.W
            float r5 = r13.p()
            float r5 = r5 + r3
            float r3 = r13.Z
            float r5 = r5 + r3
            int r3 = defpackage.dh.a(r13)
            if (r3 != 0) goto L185
            int r3 = r7.left
            float r3 = (float) r3
            float r3 = r3 + r5
            r0.x = r3
            goto L18d
        L185:
            int r2 = r7.right
            float r2 = (float) r2
            float r2 = r2 - r5
            r0.x = r2
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.RIGHT
        L18d:
            int r3 = r7.centerY()
            float r3 = (float) r3
            android.text.TextPaint r5 = r4.a
            android.graphics.Paint$FontMetrics r6 = r13.g0
            r5.getFontMetrics(r6)
            float r5 = r6.descent
            float r6 = r6.ascent
            float r5 = r5 + r6
            float r5 = r5 / r12
            float r3 = r3 - r5
            r0.y = r3
        L1a2:
            r11.setEmpty()
            java.lang.CharSequence r3 = r13.E
            if (r3 == 0) goto L1e6
            float r3 = r13.W
            float r5 = r13.p()
            float r5 = r5 + r3
            float r3 = r13.Z
            float r5 = r5 + r3
            float r3 = r13.d0
            float r6 = r13.q()
            float r6 = r6 + r3
            float r3 = r13.a0
            float r6 = r6 + r3
            int r3 = defpackage.dh.a(r13)
            if (r3 != 0) goto L1d0
            int r3 = r7.left
            float r3 = (float) r3
            float r3 = r3 + r5
            r11.left = r3
            int r3 = r7.right
            float r3 = (float) r3
            float r3 = r3 - r6
            r11.right = r3
            goto L1dc
        L1d0:
            int r3 = r7.left
            float r3 = (float) r3
            float r3 = r3 + r6
            r11.left = r3
            int r3 = r7.right
            float r3 = (float) r3
            float r3 = r3 - r5
            r11.right = r3
        L1dc:
            int r3 = r7.top
            float r3 = (float) r3
            r11.top = r3
            int r3 = r7.bottom
            float r3 = (float) r3
            r11.bottom = r3
        L1e6:
            a60 r3 = r4.f
            android.text.TextPaint r6 = r4.a
            if (r3 == 0) goto L1fb
            int[] r3 = r13.getState()
            r6.drawableState = r3
            a60 r3 = r4.f
            ha r5 = r4.b
            android.content.Context r14 = r13.e0
            r3.e(r14, r6, r5)
        L1fb:
            r6.setTextAlign(r2)
            java.lang.CharSequence r2 = r13.E
            java.lang.String r2 = r2.toString()
            float r2 = r4.a(r2)
            int r2 = java.lang.Math.round(r2)
            float r3 = r11.width()
            int r3 = java.lang.Math.round(r3)
            if (r2 <= r3) goto L219
            r2 = 1
            r14 = r2
            goto L21a
        L219:
            r14 = r9
        L21a:
            if (r14 == 0) goto L225
            int r2 = r1.save()
            r1.clipRect(r11)
            r15 = r2
            goto L226
        L225:
            r15 = r9
        L226:
            java.lang.CharSequence r2 = r13.E
            if (r14 == 0) goto L238
            android.text.TextUtils$TruncateAt r3 = r13.B0
            if (r3 == 0) goto L238
            float r3 = r11.width()
            android.text.TextUtils$TruncateAt r4 = r13.B0
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r2, r6, r3, r4)
        L238:
            int r3 = r2.length()
            float r4 = r0.x
            float r5 = r0.y
            r1 = r2
            r2 = 0
            r0 = r20
            r0.drawText(r1, r2, r3, r4, r5, r6)
            r1 = r0
            if (r14 == 0) goto L24d
            r1.restoreToCount(r15)
        L24d:
            boolean r0 = r13.T()
            if (r0 == 0) goto L2be
            r11.setEmpty()
            boolean r0 = r13.T()
            if (r0 == 0) goto L28c
            float r0 = r13.d0
            float r2 = r13.c0
            float r0 = r0 + r2
            int r2 = defpackage.dh.a(r13)
            if (r2 != 0) goto L273
            int r2 = r7.right
            float r2 = (float) r2
            float r2 = r2 - r0
            r11.right = r2
            float r0 = r13.O
            float r2 = r2 - r0
            r11.left = r2
            goto L27e
        L273:
            int r2 = r7.left
            float r2 = (float) r2
            float r2 = r2 + r0
            r11.left = r2
            float r0 = r13.O
            float r2 = r2 + r0
            r11.right = r2
        L27e:
            float r0 = r7.exactCenterY()
            float r2 = r13.O
            float r3 = r2 / r12
            float r0 = r0 - r3
            r11.top = r0
            float r0 = r0 + r2
            r11.bottom = r0
        L28c:
            float r0 = r11.left
            float r2 = r11.top
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r3 = r13.L
            float r4 = r11.width()
            int r4 = (int) r4
            float r5 = r11.height()
            int r5 = (int) r5
            r3.setBounds(r9, r9, r4, r5)
            int[] r3 = defpackage.g10.a
            android.graphics.drawable.RippleDrawable r3 = r13.M
            android.graphics.drawable.Drawable r4 = r13.L
            android.graphics.Rect r4 = r4.getBounds()
            r3.setBounds(r4)
            android.graphics.drawable.RippleDrawable r3 = r13.M
            r3.jumpToCurrentState()
            android.graphics.drawable.RippleDrawable r3 = r13.M
            r3.draw(r1)
            float r0 = -r0
            float r2 = -r2
            r1.translate(r0, r2)
        L2be:
            int r0 = r13.t0
            if (r0 >= r8) goto L2c5
            r1.restoreToCount(r10)
        L2c5:
            return
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final int getAlpha() {
            r1 = this;
            int r0 = r1.t0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.u0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r1 = this;
            float r0 = r1.z
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r3 = this;
            float r0 = r3.W
            float r1 = r3.p()
            float r1 = r1 + r0
            float r0 = r3.Z
            float r1 = r1 + r0
            java.lang.CharSequence r0 = r3.E
            java.lang.String r0 = r0.toString()
            d60 r2 = r3.k0
            float r0 = r2.a(r0)
            float r0 = r0 + r1
            float r1 = r3.a0
            float r0 = r0 + r1
            float r1 = r3.q()
            float r1 = r1 + r0
            float r0 = r3.d0
            float r1 = r1 + r0
            int r0 = java.lang.Math.round(r1)
            int r1 = r3.D0
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline r9) {
            r8 = this;
            boolean r0 = r8.E0
            if (r0 == 0) goto L8
            super.getOutline(r9)
            return
        L8:
            android.graphics.Rect r0 = r8.getBounds()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L19
            float r1 = r8.A
            r9.setRoundRect(r0, r1)
            r2 = r9
            goto L28
        L19:
            int r5 = r8.getIntrinsicWidth()
            float r0 = r8.z
            int r6 = (int) r0
            float r7 = r8.A
            r3 = 0
            r4 = 0
            r2 = r9
            r2.setRoundRect(r3, r4, r5, r6, r7)
        L28:
            int r9 = r8.t0
            float r9 = (float) r9
            r0 = 1132396544(0x437f0000, float:255.0)
            float r9 = r9 / r0
            r2.setAlpha(r9)
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.invalidateDrawable(r0)
        L9:
            return
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.x
            boolean r0 = s(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.y
            boolean r0 = s(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.B
            boolean r0 = s(r0)
            if (r0 != 0) goto L51
            d60 r0 = r1.k0
            a60 r0 = r0.f
            if (r0 == 0) goto L29
            android.content.res.ColorStateList r0 = r0.j
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            goto L51
        L29:
            boolean r0 = r1.R
            if (r0 == 0) goto L36
            android.graphics.drawable.Drawable r0 = r1.S
            if (r0 == 0) goto L36
            boolean r0 = r1.Q
            if (r0 == 0) goto L36
            goto L51
        L36:
            android.graphics.drawable.Drawable r0 = r1.G
            boolean r0 = t(r0)
            if (r0 != 0) goto L51
            android.graphics.drawable.Drawable r0 = r1.S
            boolean r0 = t(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.w0
            boolean r0 = s(r0)
            if (r0 == 0) goto L4f
            goto L51
        L4f:
            r0 = 0
            return r0
        L51:
            r0 = 1
            return r0
    }

    public final void n(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L4b
        L3:
            r3.setCallback(r2)
            int r0 = defpackage.dh.a(r2)
            defpackage.dh.b(r3, r0)
            int r0 = r2.getLevel()
            r3.setLevel(r0)
            boolean r0 = r2.isVisible()
            r1 = 0
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r2.L
            if (r3 != r0) goto L31
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L2b
            int[] r0 = r2.y0
            r3.setState(r0)
        L2b:
            android.content.res.ColorStateList r0 = r2.N
            defpackage.ch.h(r3, r0)
            return
        L31:
            android.graphics.drawable.Drawable r0 = r2.G
            if (r3 != r0) goto L3e
            boolean r1 = r2.J
            if (r1 == 0) goto L3e
            android.content.res.ColorStateList r1 = r2.H
            defpackage.ch.h(r0, r1)
        L3e:
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L4b
            int[] r0 = r2.getState()
            r3.setState(r0)
        L4b:
            return
    }

    public final void o(android.graphics.Rect r6, android.graphics.RectF r7) {
            r5 = this;
            r7.setEmpty()
            boolean r0 = r5.S()
            if (r0 != 0) goto L11
            boolean r0 = r5.R()
            if (r0 == 0) goto L10
            goto L11
        L10:
            return
        L11:
            float r0 = r5.W
            float r1 = r5.X
            float r0 = r0 + r1
            boolean r1 = r5.r0
            if (r1 == 0) goto L1d
            android.graphics.drawable.Drawable r1 = r5.S
            goto L1f
        L1d:
            android.graphics.drawable.Drawable r1 = r5.G
        L1f:
            float r2 = r5.I
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 > 0) goto L2d
            if (r1 == 0) goto L2d
            int r1 = r1.getIntrinsicWidth()
            float r2 = (float) r1
        L2d:
            int r1 = defpackage.dh.a(r5)
            if (r1 != 0) goto L3d
            int r1 = r6.left
            float r1 = (float) r1
            float r1 = r1 + r0
            r7.left = r1
            float r1 = r1 + r2
            r7.right = r1
            goto L46
        L3d:
            int r1 = r6.right
            float r1 = (float) r1
            float r1 = r1 - r0
            r7.right = r1
            float r1 = r1 - r2
            r7.left = r1
        L46:
            boolean r0 = r5.r0
            if (r0 == 0) goto L4d
            android.graphics.drawable.Drawable r0 = r5.S
            goto L4f
        L4d:
            android.graphics.drawable.Drawable r0 = r5.G
        L4f:
            float r1 = r5.I
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 > 0) goto L7d
            if (r0 == 0) goto L7d
            android.content.Context r1 = r5.e0
            android.content.res.Resources r1 = r1.getResources()
            r2 = 24
            float r2 = (float) r2
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r3 = 1
            float r1 = android.util.TypedValue.applyDimension(r3, r2, r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r2 = r0.getIntrinsicHeight()
            float r2 = (float) r2
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L7d
            int r0 = r0.getIntrinsicHeight()
            float r1 = (float) r0
        L7d:
            float r6 = r6.exactCenterY()
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r1 / r0
            float r6 = r6 - r0
            r7.top = r6
            float r6 = r6 + r1
            r7.bottom = r6
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r3) {
            r2 = this;
            boolean r0 = super.onLayoutDirectionChanged(r3)
            boolean r1 = r2.S()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.G
            boolean r1 = defpackage.dh.b(r1, r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.R()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.S
            boolean r1 = defpackage.dh.b(r1, r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.T()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.L
            boolean r3 = defpackage.dh.b(r1, r3)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            r3 = 1
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r3) {
            r2 = this;
            boolean r0 = super.onLevelChange(r3)
            boolean r1 = r2.S()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.G
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.R()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.S
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.T()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.L
            boolean r3 = r1.setLevel(r3)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
            r1 = this;
            boolean r0 = r1.E0
            if (r0 == 0) goto L7
            super.onStateChange(r2)
        L7:
            int[] r0 = r1.y0
            boolean r2 = r1.v(r2, r0)
            return r2
    }

    public final float p() {
            r4 = this;
            boolean r0 = r4.S()
            r1 = 0
            if (r0 != 0) goto Lf
            boolean r0 = r4.R()
            if (r0 == 0) goto Le
            goto Lf
        Le:
            return r1
        Lf:
            float r0 = r4.X
            boolean r2 = r4.r0
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r4.S
            goto L1a
        L18:
            android.graphics.drawable.Drawable r2 = r4.G
        L1a:
            float r3 = r4.I
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L27
            if (r2 == 0) goto L27
            int r1 = r2.getIntrinsicWidth()
            float r3 = (float) r1
        L27:
            float r3 = r3 + r0
            float r0 = r4.Y
            float r3 = r3 + r0
            return r3
    }

    public final float q() {
            r2 = this;
            boolean r0 = r2.T()
            if (r0 == 0) goto Lf
            float r0 = r2.b0
            float r1 = r2.O
            float r0 = r0 + r1
            float r1 = r2.c0
            float r0 = r0 + r1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final float r() {
            r2 = this;
            boolean r0 = r2.E0
            if (r0 == 0) goto L13
            du r0 = r2.a
            f30 r0 = r0.a
            de r0 = r0.e
            android.graphics.RectF r1 = r2.f()
            float r0 = r0.a(r1)
            return r0
        L13:
            float r0 = r2.A
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.scheduleDrawable(r0, r2, r3)
        L9:
            return
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            int r0 = r1.t0
            if (r0 == r2) goto L9
            r1.t0 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.u0
            if (r0 == r2) goto L9
            r1.u0 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.w0
            if (r0 == r2) goto Ld
            r1.w0 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        Ld:
            return
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.x0
            if (r0 == r4) goto L22
            r3.x0 = r4
            android.content.res.ColorStateList r0 = r3.w0
            if (r0 == 0) goto L1c
            if (r4 != 0) goto Ld
            goto L1c
        Ld:
            int[] r1 = r3.getState()
            r2 = 0
            int r0 = r0.getColorForState(r1, r2)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r0, r4)
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r3.v0 = r1
            r3.invalidateSelf()
        L22:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            boolean r1 = r2.S()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.G
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.R()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.S
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.T()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.L
            boolean r3 = r1.setVisible(r3, r4)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
    }

    public final void u() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.A0
            java.lang.Object r0 = r0.get()
            ja r0 = (defpackage.ja) r0
            if (r0 == 0) goto L17
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            int r1 = r0.p
            r0.b(r1)
            r0.requestLayout()
            r0.invalidateOutline()
        L17:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.unscheduleDrawable(r0, r2)
        L9:
            return
    }

    public final boolean v(int[] r9, int[] r10) {
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.x
            r2 = 0
            if (r1 == 0) goto L10
            int r3 = r8.l0
            int r1 = r1.getColorForState(r9, r3)
            goto L11
        L10:
            r1 = r2
        L11:
            int r1 = r8.b(r1)
            int r3 = r8.l0
            r4 = 1
            if (r3 == r1) goto L1d
            r8.l0 = r1
            r0 = r4
        L1d:
            android.content.res.ColorStateList r3 = r8.y
            if (r3 == 0) goto L28
            int r5 = r8.m0
            int r3 = r3.getColorForState(r9, r5)
            goto L29
        L28:
            r3 = r2
        L29:
            int r3 = r8.b(r3)
            int r5 = r8.m0
            if (r5 == r3) goto L34
            r8.m0 = r3
            r0 = r4
        L34:
            int r1 = defpackage.ib.b(r3, r1)
            int r3 = r8.n0
            if (r3 == r1) goto L3e
            r3 = r4
            goto L3f
        L3e:
            r3 = r2
        L3f:
            du r5 = r8.a
            android.content.res.ColorStateList r5 = r5.c
            if (r5 != 0) goto L47
            r5 = r4
            goto L48
        L47:
            r5 = r2
        L48:
            r3 = r3 | r5
            if (r3 == 0) goto L55
            r8.n0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.j(r0)
            r0 = r4
        L55:
            android.content.res.ColorStateList r1 = r8.B
            if (r1 == 0) goto L60
            int r3 = r8.o0
            int r1 = r1.getColorForState(r9, r3)
            goto L61
        L60:
            r1 = r2
        L61:
            int r3 = r8.o0
            if (r3 == r1) goto L68
            r8.o0 = r1
            r0 = r4
        L68:
            android.content.res.ColorStateList r1 = r8.z0
            if (r1 == 0) goto L7b
            boolean r1 = defpackage.g10.b(r9)
            if (r1 == 0) goto L7b
            android.content.res.ColorStateList r1 = r8.z0
            int r3 = r8.p0
            int r1 = r1.getColorForState(r9, r3)
            goto L7c
        L7b:
            r1 = r2
        L7c:
            int r3 = r8.p0
            if (r3 == r1) goto L82
            r8.p0 = r1
        L82:
            d60 r1 = r8.k0
            a60 r1 = r1.f
            if (r1 == 0) goto L93
            android.content.res.ColorStateList r1 = r1.j
            if (r1 == 0) goto L93
            int r3 = r8.q0
            int r1 = r1.getColorForState(r9, r3)
            goto L94
        L93:
            r1 = r2
        L94:
            int r3 = r8.q0
            if (r3 == r1) goto L9b
            r8.q0 = r1
            r0 = r4
        L9b:
            int[] r1 = r8.getState()
            if (r1 != 0) goto La2
            goto Lb6
        La2:
            int r3 = r1.length
            r5 = r2
        La4:
            if (r5 >= r3) goto Lb6
            r6 = r1[r5]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 != r7) goto Lb3
            boolean r1 = r8.Q
            if (r1 == 0) goto Lb6
            r1 = r4
            goto Lb7
        Lb3:
            int r5 = r5 + 1
            goto La4
        Lb6:
            r1 = r2
        Lb7:
            boolean r3 = r8.r0
            if (r3 == r1) goto Ld3
            android.graphics.drawable.Drawable r3 = r8.S
            if (r3 == 0) goto Ld3
            float r0 = r8.p()
            r8.r0 = r1
            float r1 = r8.p()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Ld0
            r0 = r4
            r1 = r0
            goto Ld4
        Ld0:
            r1 = r2
            r0 = r4
            goto Ld4
        Ld3:
            r1 = r2
        Ld4:
            android.content.res.ColorStateList r3 = r8.w0
            if (r3 == 0) goto Ldf
            int r5 = r8.s0
            int r3 = r3.getColorForState(r9, r5)
            goto Le0
        Ldf:
            r3 = r2
        Le0:
            int r5 = r8.s0
            if (r5 == r3) goto L101
            r8.s0 = r3
            android.content.res.ColorStateList r0 = r8.w0
            android.graphics.PorterDuff$Mode r3 = r8.x0
            if (r0 == 0) goto Lfd
            if (r3 != 0) goto Lef
            goto Lfd
        Lef:
            int[] r5 = r8.getState()
            int r0 = r0.getColorForState(r5, r2)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r0, r3)
            goto Lfe
        Lfd:
            r5 = 0
        Lfe:
            r8.v0 = r5
            goto L102
        L101:
            r4 = r0
        L102:
            android.graphics.drawable.Drawable r0 = r8.G
            boolean r0 = t(r0)
            if (r0 == 0) goto L111
            android.graphics.drawable.Drawable r0 = r8.G
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L111:
            android.graphics.drawable.Drawable r0 = r8.S
            boolean r0 = t(r0)
            if (r0 == 0) goto L120
            android.graphics.drawable.Drawable r0 = r8.S
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L120:
            android.graphics.drawable.Drawable r0 = r8.L
            boolean r0 = t(r0)
            if (r0 == 0) goto L13d
            int r0 = r9.length
            int r3 = r10.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r2, r0, r2, r3)
            int r9 = r9.length
            int r3 = r10.length
            java.lang.System.arraycopy(r10, r2, r0, r9, r3)
            android.graphics.drawable.Drawable r9 = r8.L
            boolean r9 = r9.setState(r0)
            r4 = r4 | r9
        L13d:
            int[] r9 = defpackage.g10.a
            android.graphics.drawable.RippleDrawable r9 = r8.M
            boolean r9 = t(r9)
            if (r9 == 0) goto L14e
            android.graphics.drawable.RippleDrawable r9 = r8.M
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L14e:
            if (r4 == 0) goto L153
            r8.invalidateSelf()
        L153:
            if (r1 == 0) goto L158
            r8.u()
        L158:
            return r4
    }

    public final void w(boolean r2) {
            r1 = this;
            boolean r0 = r1.Q
            if (r0 == r2) goto L21
            r1.Q = r2
            float r0 = r1.p()
            if (r2 != 0) goto L13
            boolean r2 = r1.r0
            if (r2 == 0) goto L13
            r2 = 0
            r1.r0 = r2
        L13:
            float r2 = r1.p()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            r1.u()
        L21:
            return
    }

    public final void x(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.S
            if (r0 == r3) goto L22
            float r0 = r2.p()
            r2.S = r3
            float r3 = r2.p()
            android.graphics.drawable.Drawable r1 = r2.S
            U(r1)
            android.graphics.drawable.Drawable r1 = r2.S
            r2.n(r1)
            r2.invalidateSelf()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            r2.u()
        L22:
            return
    }

    public final void y(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.T
            if (r0 == r3) goto L1c
            r2.T = r3
            boolean r0 = r2.R
            if (r0 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r2.S
            if (r0 == 0) goto L15
            boolean r1 = r2.Q
            if (r1 == 0) goto L15
            defpackage.ch.h(r0, r3)
        L15:
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        L1c:
            return
    }

    public final void z(boolean r2) {
            r1 = this;
            boolean r0 = r1.R
            if (r0 == r2) goto L23
            boolean r0 = r1.R()
            r1.R = r2
            boolean r2 = r1.R()
            if (r0 == r2) goto L23
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r1.S
            r1.n(r2)
            goto L1d
        L18:
            android.graphics.drawable.Drawable r2 = r1.S
            U(r2)
        L1d:
            r1.invalidateSelf()
            r1.u()
        L23:
            return
    }
}
