package com.google.android.material.chip;

/* JADX INFO: loaded from: classes.dex */
public final class a extends a.Ta implements android.graphics.drawable.Drawable.Callback, a.Ye.b {
    public static final int[] G0 = null;
    public static final android.graphics.drawable.ShapeDrawable H0 = null;
    public float A;
    public android.content.res.ColorStateList A0;
    public float B;
    public java.lang.ref.WeakReference<com.google.android.material.chip.a.InterfaceC0030a> B0;
    public android.content.res.ColorStateList C;
    public android.text.TextUtils.TruncateAt C0;
    public float D;
    public boolean D0;
    public android.content.res.ColorStateList E;
    public int E0;
    public java.lang.CharSequence F;
    public boolean F0;
    public boolean G;
    public android.graphics.drawable.Drawable H;
    public android.content.res.ColorStateList I;
    public float J;
    public boolean K;
    public boolean L;
    public android.graphics.drawable.Drawable M;
    public android.graphics.drawable.RippleDrawable N;
    public android.content.res.ColorStateList O;
    public float P;
    public android.text.SpannableStringBuilder Q;
    public boolean R;
    public boolean S;
    public android.graphics.drawable.Drawable T;
    public android.content.res.ColorStateList U;
    public a.C0409ub V;
    public a.C0409ub W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public final android.content.Context f0;
    public final android.graphics.Paint g0;
    public final android.graphics.Paint.FontMetrics h0;
    public final android.graphics.RectF i0;
    public final android.graphics.PointF j0;
    public final android.graphics.Path k0;
    public final a.Ye l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public int t0;
    public int u0;
    public android.graphics.ColorFilter v0;
    public android.graphics.PorterDuffColorFilter w0;
    public android.content.res.ColorStateList x0;
    public android.content.res.ColorStateList y;
    public android.graphics.PorterDuff.Mode y0;
    public android.content.res.ColorStateList z;
    public int[] z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0030a {
        void a();
    }

    static {
            r0 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.chip.a.G0 = r0
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r1 = new android.graphics.drawable.shapes.OvalShape
            r1.<init>()
            r0.<init>(r1)
            com.google.android.material.chip.a.H0 = r0
            return
    }

    public a(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            int r0 = com.google.android.material.chip.Chip.w
            r1.<init>(r2, r3, r4, r0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.B = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 1
            r3.<init>(r4)
            r1.g0 = r3
            android.graphics.Paint$FontMetrics r3 = new android.graphics.Paint$FontMetrics
            r3.<init>()
            r1.h0 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r1.i0 = r3
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>()
            r1.j0 = r3
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r1.k0 = r3
            r3 = 255(0xff, float:3.57E-43)
            r1.u0 = r3
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.y0 = r3
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r0 = 0
            r3.<init>(r0)
            r1.B0 = r3
            r1.i(r2)
            r1.f0 = r2
            a.Ye r3 = new a.Ye
            r3.<init>(r1)
            r1.l0 = r3
            java.lang.String r0 = ""
            r1.F = r0
            android.text.TextPaint r3 = r3.f362a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3.density = r2
            int[] r2 = com.google.android.material.chip.a.G0
            r1.setState(r2)
            int[] r3 = r1.z0
            boolean r3 = java.util.Arrays.equals(r3, r2)
            if (r3 != 0) goto L77
            r1.z0 = r2
            boolean r3 = r1.U()
            if (r3 == 0) goto L77
            int[] r3 = r1.getState()
            r1.w(r3, r2)
        L77:
            r1.D0 = r4
            android.graphics.drawable.ShapeDrawable r2 = com.google.android.material.chip.a.H0
            r3 = -1
            r2.setTint(r3)
            return
    }

    public static void V(android.graphics.drawable.Drawable r1) {
            if (r1 == 0) goto L6
            r0 = 0
            r1.setCallback(r0)
        L6:
            return
    }

    public static boolean t(android.content.res.ColorStateList r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean u(android.graphics.drawable.Drawable r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void A(boolean r2) {
            r1 = this;
            boolean r0 = r1.S
            if (r0 == r2) goto L23
            boolean r0 = r1.S()
            r1.S = r2
            boolean r2 = r1.S()
            if (r0 == r2) goto L23
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r1.T
            r1.o(r2)
            goto L1d
        L18:
            android.graphics.drawable.Drawable r2 = r1.T
            V(r2)
        L1d:
            r1.invalidateSelf()
            r1.v()
        L23:
            return
    }

    @java.lang.Deprecated
    public final void B(float r3) {
            r2 = this;
            float r0 = r2.B
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L33
            r2.B = r3
            a.Ta$b r0 = r2.f278a
            a.Vd r0 = r0.f280a
            a.Vd$a r0 = r0.e()
            a.s r1 = new a.s
            r1.<init>(r3)
            r0.e = r1
            a.s r1 = new a.s
            r1.<init>(r3)
            r0.f = r1
            a.s r1 = new a.s
            r1.<init>(r3)
            r0.g = r1
            a.s r1 = new a.s
            r1.<init>(r3)
            r0.h = r1
            a.Vd r3 = r0.a()
            r2.setShapeAppearanceModel(r3)
        L33:
            return
    }

    public final void C(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.H
            r1 = 0
            if (r0 == 0) goto L10
            boolean r2 = r0 instanceof a.vh
            if (r2 == 0) goto L11
            a.vh r0 = (a.vh) r0
            android.graphics.drawable.Drawable r0 = r0.a()
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == r4) goto L3b
            float r2 = r3.q()
            if (r4 == 0) goto L1d
            android.graphics.drawable.Drawable r1 = r4.mutate()
        L1d:
            r3.H = r1
            float r4 = r3.q()
            V(r0)
            boolean r0 = r3.T()
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r3.H
            r3.o(r0)
        L31:
            r3.invalidateSelf()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L3b
            r3.v()
        L3b:
            return
    }

    public final void D(float r2) {
            r1 = this;
            float r0 = r1.J
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.q()
            r1.J = r2
            float r2 = r1.q()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.v()
        L1a:
            return
    }

    public final void E(android.content.res.ColorStateList r2) {
            r1 = this;
            r0 = 1
            r1.K = r0
            android.content.res.ColorStateList r0 = r1.I
            if (r0 == r2) goto L1b
            r1.I = r2
            boolean r0 = r1.T()
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.H
            a.C0439w5.a.h(r0, r2)
        L14:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L1b:
            return
    }

    public final void F(boolean r2) {
            r1 = this;
            boolean r0 = r1.G
            if (r0 == r2) goto L23
            boolean r0 = r1.T()
            r1.G = r2
            boolean r2 = r1.T()
            if (r0 == r2) goto L23
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r1.H
            r1.o(r2)
            goto L1d
        L18:
            android.graphics.drawable.Drawable r2 = r1.H
            V(r2)
        L1d:
            r1.invalidateSelf()
            r1.v()
        L23:
            return
    }

    public final void G(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.C
            if (r0 == r3) goto L20
            r2.C = r3
            boolean r0 = r2.F0
            if (r0 == 0) goto L19
            a.Ta$b r0 = r2.f278a
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

    public final void H(float r2) {
            r1 = this;
            float r0 = r1.D
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1b
            r1.D = r2
            android.graphics.Paint r0 = r1.g0
            r0.setStrokeWidth(r2)
            boolean r0 = r1.F0
            if (r0 == 0) goto L18
            a.Ta$b r0 = r1.f278a
            r0.j = r2
            r1.invalidateSelf()
        L18:
            r1.invalidateSelf()
        L1b:
            return
    }

    public final void I(android.graphics.drawable.Drawable r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.M
            r1 = 0
            if (r0 == 0) goto L10
            boolean r2 = r0 instanceof a.vh
            if (r2 == 0) goto L11
            a.vh r0 = (a.vh) r0
            android.graphics.drawable.Drawable r0 = r0.a()
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == r6) goto L50
            float r2 = r5.r()
            if (r6 == 0) goto L1d
            android.graphics.drawable.Drawable r1 = r6.mutate()
        L1d:
            r5.M = r1
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = r5.E
            if (r1 == 0) goto L26
            goto L2b
        L26:
            r1 = 0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L2b:
            android.graphics.drawable.Drawable r3 = r5.M
            android.graphics.drawable.ShapeDrawable r4 = com.google.android.material.chip.a.H0
            r6.<init>(r1, r3, r4)
            r5.N = r6
            float r6 = r5.r()
            V(r0)
            boolean r0 = r5.U()
            if (r0 == 0) goto L46
            android.graphics.drawable.Drawable r0 = r5.M
            r5.o(r0)
        L46:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L50
            r5.v()
        L50:
            return
    }

    public final void J(float r2) {
            r1 = this;
            float r0 = r1.d0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.d0 = r2
            r1.invalidateSelf()
            boolean r2 = r1.U()
            if (r2 == 0) goto L14
            r1.v()
        L14:
            return
    }

    public final void K(float r2) {
            r1 = this;
            float r0 = r1.P
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.P = r2
            r1.invalidateSelf()
            boolean r2 = r1.U()
            if (r2 == 0) goto L14
            r1.v()
        L14:
            return
    }

    public final void L(float r2) {
            r1 = this;
            float r0 = r1.c0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.c0 = r2
            r1.invalidateSelf()
            boolean r2 = r1.U()
            if (r2 == 0) goto L14
            r1.v()
        L14:
            return
    }

    public final void M(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.O
            if (r0 == r2) goto L18
            r1.O = r2
            boolean r0 = r1.U()
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.M
            a.C0439w5.a.h(r0, r2)
        L11:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L18:
            return
    }

    public final void N(boolean r2) {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == r2) goto L23
            boolean r0 = r1.U()
            r1.L = r2
            boolean r2 = r1.U()
            if (r0 == r2) goto L23
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r1.M
            r1.o(r2)
            goto L1d
        L18:
            android.graphics.drawable.Drawable r2 = r1.M
            V(r2)
        L1d:
            r1.invalidateSelf()
            r1.v()
        L23:
            return
    }

    public final void O(float r2) {
            r1 = this;
            float r0 = r1.Z
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.q()
            r1.Z = r2
            float r2 = r1.q()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.v()
        L1a:
            return
    }

    public final void P(float r2) {
            r1 = this;
            float r0 = r1.Y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.q()
            r1.Y = r2
            float r2 = r1.q()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.v()
        L1a:
            return
    }

    public final void Q(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.E
            if (r0 == r2) goto L10
            r1.E = r2
            r2 = 0
            r1.A0 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L10:
            return
    }

    public final void R(a.Ve r6) {
            r5 = this;
            a.Ye r0 = r5.l0
            a.Ve r1 = r0.f
            if (r1 == r6) goto L3d
            r0.f = r6
            if (r6 == 0) goto L29
            android.text.TextPaint r1 = r0.f362a
            android.content.Context r2 = r5.f0
            a.Ye$a r3 = r0.b
            r6.f(r2, r1, r3)
            java.lang.ref.WeakReference<a.Ye$b> r4 = r0.e
            java.lang.Object r4 = r4.get()
            a.Ye$b r4 = (a.Ye.b) r4
            if (r4 == 0) goto L23
            int[] r4 = r4.getState()
            r1.drawableState = r4
        L23:
            r6.e(r2, r1, r3)
            r6 = 1
            r0.d = r6
        L29:
            java.lang.ref.WeakReference<a.Ye$b> r6 = r0.e
            java.lang.Object r6 = r6.get()
            a.Ye$b r6 = (a.Ye.b) r6
            if (r6 == 0) goto L3d
            r6.a()
            int[] r0 = r6.getState()
            r6.onStateChange(r0)
        L3d:
            return
    }

    public final boolean S() {
            r1 = this;
            boolean r0 = r1.S
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.T
            if (r0 == 0) goto Le
            boolean r0 = r1.s0
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final boolean T() {
            r1 = this;
            boolean r0 = r1.G
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.H
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean U() {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.M
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // a.Ye.b
    public final void a() {
            r0 = this;
            r0.v()
            r0.invalidateSelf()
            return
    }

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r20) {
            r19 = this;
            r0 = r19
            android.graphics.Rect r7 = r0.getBounds()
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L10
            int r6 = r0.u0
            if (r6 != 0) goto L13
        L10:
            r13 = r0
            goto L2c3
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
            boolean r2 = r0.F0
            r3 = r2
            android.graphics.Paint r2 = r0.g0
            android.graphics.RectF r11 = r0.i0
            if (r3 != 0) goto L50
            int r3 = r0.m0
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            r11.set(r7)
            float r3 = r0.s()
            float r4 = r0.s()
            r1.drawRoundRect(r11, r3, r4, r2)
        L50:
            boolean r3 = r0.F0
            if (r3 != 0) goto L76
            int r3 = r0.n0
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            android.graphics.ColorFilter r3 = r0.v0
            if (r3 == 0) goto L63
            goto L65
        L63:
            android.graphics.PorterDuffColorFilter r3 = r0.w0
        L65:
            r2.setColorFilter(r3)
            r11.set(r7)
            float r3 = r0.s()
            float r4 = r0.s()
            r1.drawRoundRect(r11, r3, r4, r2)
        L76:
            boolean r3 = r0.F0
            if (r3 == 0) goto L7d
            super.draw(r20)
        L7d:
            float r3 = r0.D
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            r12 = 1073741824(0x40000000, float:2.0)
            if (r3 <= 0) goto Lc1
            boolean r3 = r0.F0
            if (r3 != 0) goto Lc1
            int r3 = r0.p0
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            boolean r3 = r0.F0
            if (r3 != 0) goto La2
            android.graphics.ColorFilter r3 = r0.v0
            if (r3 == 0) goto L9d
            goto L9f
        L9d:
            android.graphics.PorterDuffColorFilter r3 = r0.w0
        L9f:
            r2.setColorFilter(r3)
        La2:
            int r3 = r7.left
            float r3 = (float) r3
            float r4 = r0.D
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
            float r3 = r0.B
            float r4 = r0.D
            float r4 = r4 / r12
            float r3 = r3 - r4
            r1.drawRoundRect(r11, r3, r3, r2)
        Lc1:
            int r3 = r0.q0
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            r11.set(r7)
            boolean r3 = r0.F0
            if (r3 != 0) goto Ldf
            float r3 = r0.s()
            float r4 = r0.s()
            r1.drawRoundRect(r11, r3, r4, r2)
        Ldd:
            r13 = r0
            goto L107
        Ldf:
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r7)
            android.graphics.Path r4 = r0.k0
            a.Ta$b r5 = r0.f278a
            a.Vd r14 = r5.f280a
            float r15 = r5.i
            a.Ta$a r5 = r0.q
            a.Wd r13 = r0.r
            r16 = r3
            r18 = r4
            r17 = r5
            r13.a(r14, r15, r16, r17, r18)
            android.graphics.RectF r5 = r0.g()
            a.Ta$b r3 = r0.f278a
            a.Vd r4 = r3.f280a
            r3 = r18
            r0.e(r1, r2, r3, r4, r5)
            goto Ldd
        L107:
            boolean r0 = r13.T()
            if (r0 == 0) goto L130
            r13.p(r7, r11)
            float r0 = r11.left
            float r2 = r11.top
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r3 = r13.H
            float r4 = r11.width()
            int r4 = (int) r4
            float r5 = r11.height()
            int r5 = (int) r5
            r3.setBounds(r9, r9, r4, r5)
            android.graphics.drawable.Drawable r3 = r13.H
            r3.draw(r1)
            float r0 = -r0
            float r2 = -r2
            r1.translate(r0, r2)
        L130:
            boolean r0 = r13.S()
            if (r0 == 0) goto L159
            r13.p(r7, r11)
            float r0 = r11.left
            float r2 = r11.top
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r3 = r13.T
            float r4 = r11.width()
            int r4 = (int) r4
            float r5 = r11.height()
            int r5 = (int) r5
            r3.setBounds(r9, r9, r4, r5)
            android.graphics.drawable.Drawable r3 = r13.T
            r3.draw(r1)
            float r0 = -r0
            float r2 = -r2
            r1.translate(r0, r2)
        L159:
            boolean r0 = r13.D0
            if (r0 == 0) goto L24d
            java.lang.CharSequence r0 = r13.F
            if (r0 == 0) goto L24d
            android.graphics.PointF r0 = r13.j0
            r0.set(r6, r6)
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            java.lang.CharSequence r3 = r13.F
            a.Ye r4 = r13.l0
            if (r3 == 0) goto L1a2
            float r3 = r13.X
            float r5 = r13.q()
            float r5 = r5 + r3
            float r3 = r13.a0
            float r5 = r5 + r3
            int r3 = a.C0439w5.b.a(r13)
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
            android.text.TextPaint r5 = r4.f362a
            android.graphics.Paint$FontMetrics r6 = r13.h0
            r5.getFontMetrics(r6)
            float r5 = r6.descent
            float r6 = r6.ascent
            float r5 = r5 + r6
            float r5 = r5 / r12
            float r3 = r3 - r5
            r0.y = r3
        L1a2:
            r11.setEmpty()
            java.lang.CharSequence r3 = r13.F
            if (r3 == 0) goto L1e6
            float r3 = r13.X
            float r5 = r13.q()
            float r5 = r5 + r3
            float r3 = r13.a0
            float r5 = r5 + r3
            float r3 = r13.e0
            float r6 = r13.r()
            float r6 = r6 + r3
            float r3 = r13.b0
            float r6 = r6 + r3
            int r3 = a.C0439w5.b.a(r13)
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
            a.Ve r3 = r4.f
            android.text.TextPaint r6 = r4.f362a
            if (r3 == 0) goto L1fb
            int[] r3 = r13.getState()
            r6.drawableState = r3
            a.Ve r3 = r4.f
            a.Ye$a r5 = r4.b
            android.content.Context r14 = r13.f0
            r3.e(r14, r6, r5)
        L1fb:
            r6.setTextAlign(r2)
            java.lang.CharSequence r2 = r13.F
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
            java.lang.CharSequence r2 = r13.F
            if (r14 == 0) goto L238
            android.text.TextUtils$TruncateAt r3 = r13.C0
            if (r3 == 0) goto L238
            float r3 = r11.width()
            android.text.TextUtils$TruncateAt r4 = r13.C0
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
            boolean r0 = r13.U()
            if (r0 == 0) goto L2bc
            r11.setEmpty()
            boolean r0 = r13.U()
            if (r0 == 0) goto L28c
            float r0 = r13.e0
            float r2 = r13.d0
            float r0 = r0 + r2
            int r2 = a.C0439w5.b.a(r13)
            if (r2 != 0) goto L273
            int r2 = r7.right
            float r2 = (float) r2
            float r2 = r2 - r0
            r11.right = r2
            float r0 = r13.P
            float r2 = r2 - r0
            r11.left = r2
            goto L27e
        L273:
            int r2 = r7.left
            float r2 = (float) r2
            float r2 = r2 + r0
            r11.left = r2
            float r0 = r13.P
            float r2 = r2 + r0
            r11.right = r2
        L27e:
            float r0 = r7.exactCenterY()
            float r2 = r13.P
            float r3 = r2 / r12
            float r0 = r0 - r3
            r11.top = r0
            float r0 = r0 + r2
            r11.bottom = r0
        L28c:
            float r0 = r11.left
            float r2 = r11.top
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r3 = r13.M
            float r4 = r11.width()
            int r4 = (int) r4
            float r5 = r11.height()
            int r5 = (int) r5
            r3.setBounds(r9, r9, r4, r5)
            android.graphics.drawable.RippleDrawable r3 = r13.N
            android.graphics.drawable.Drawable r4 = r13.M
            android.graphics.Rect r4 = r4.getBounds()
            r3.setBounds(r4)
            android.graphics.drawable.RippleDrawable r3 = r13.N
            r3.jumpToCurrentState()
            android.graphics.drawable.RippleDrawable r3 = r13.N
            r3.draw(r1)
            float r0 = -r0
            float r2 = -r2
            r1.translate(r0, r2)
        L2bc:
            int r0 = r13.u0
            if (r0 >= r8) goto L2c3
            r1.restoreToCount(r10)
        L2c3:
            return
    }

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final int getAlpha() {
            r1 = this;
            int r0 = r1.u0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.v0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r1 = this;
            float r0 = r1.A
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r3 = this;
            float r0 = r3.X
            float r1 = r3.q()
            float r1 = r1 + r0
            float r0 = r3.a0
            float r1 = r1 + r0
            java.lang.CharSequence r0 = r3.F
            java.lang.String r0 = r0.toString()
            a.Ye r2 = r3.l0
            float r0 = r2.a(r0)
            float r0 = r0 + r1
            float r1 = r3.b0
            float r0 = r0 + r1
            float r1 = r3.r()
            float r1 = r1 + r0
            float r0 = r3.e0
            float r1 = r1 + r0
            int r0 = java.lang.Math.round(r1)
            int r1 = r3.E0
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // a.Ta, android.graphics.drawable.Drawable
    @android.annotation.TargetApi(21)
    public final void getOutline(android.graphics.Outline r9) {
            r8 = this;
            boolean r0 = r8.F0
            if (r0 == 0) goto L8
            super.getOutline(r9)
            return
        L8:
            android.graphics.Rect r0 = r8.getBounds()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L19
            float r1 = r8.B
            r9.setRoundRect(r0, r1)
            r2 = r9
            goto L28
        L19:
            int r5 = r8.getIntrinsicWidth()
            float r0 = r8.A
            int r6 = (int) r0
            float r7 = r8.B
            r3 = 0
            r4 = 0
            r2 = r9
            r2.setRoundRect(r3, r4, r5, r6, r7)
        L28:
            int r9 = r8.u0
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

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.y
            boolean r0 = t(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.z
            boolean r0 = t(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.C
            boolean r0 = t(r0)
            if (r0 != 0) goto L51
            a.Ye r0 = r1.l0
            a.Ve r0 = r0.f
            if (r0 == 0) goto L29
            android.content.res.ColorStateList r0 = r0.j
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            goto L51
        L29:
            boolean r0 = r1.S
            if (r0 == 0) goto L36
            android.graphics.drawable.Drawable r0 = r1.T
            if (r0 == 0) goto L36
            boolean r0 = r1.R
            if (r0 == 0) goto L36
            goto L51
        L36:
            android.graphics.drawable.Drawable r0 = r1.H
            boolean r0 = u(r0)
            if (r0 != 0) goto L51
            android.graphics.drawable.Drawable r0 = r1.T
            boolean r0 = u(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.x0
            boolean r0 = t(r0)
            if (r0 == 0) goto L4f
            goto L51
        L4f:
            r0 = 0
            return r0
        L51:
            r0 = 1
            return r0
    }

    public final void o(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L4b
        L3:
            r3.setCallback(r2)
            int r0 = a.C0439w5.b.a(r2)
            a.C0439w5.b.b(r3, r0)
            int r0 = r2.getLevel()
            r3.setLevel(r0)
            boolean r0 = r2.isVisible()
            r1 = 0
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r2.M
            if (r3 != r0) goto L31
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L2b
            int[] r0 = r2.z0
            r3.setState(r0)
        L2b:
            android.content.res.ColorStateList r0 = r2.O
            a.C0439w5.a.h(r3, r0)
            return
        L31:
            android.graphics.drawable.Drawable r0 = r2.H
            if (r3 != r0) goto L3e
            boolean r1 = r2.K
            if (r1 == 0) goto L3e
            android.content.res.ColorStateList r1 = r2.I
            a.C0439w5.a.h(r0, r1)
        L3e:
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L4b
            int[] r0 = r2.getState()
            r3.setState(r0)
        L4b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r3) {
            r2 = this;
            boolean r0 = super.onLayoutDirectionChanged(r3)
            boolean r1 = r2.T()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.H
            boolean r1 = a.C0439w5.b.b(r1, r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.S()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.T
            boolean r1 = a.C0439w5.b.b(r1, r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.U()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.M
            boolean r3 = a.C0439w5.b.b(r1, r3)
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
            boolean r1 = r2.T()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.H
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.S()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.T
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.U()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.M
            boolean r3 = r1.setLevel(r3)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
    }

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
            r1 = this;
            boolean r0 = r1.F0
            if (r0 == 0) goto L7
            super.onStateChange(r2)
        L7:
            int[] r0 = r1.z0
            boolean r2 = r1.w(r2, r0)
            return r2
    }

    public final void p(android.graphics.Rect r6, android.graphics.RectF r7) {
            r5 = this;
            r7.setEmpty()
            boolean r0 = r5.T()
            if (r0 != 0) goto L11
            boolean r0 = r5.S()
            if (r0 == 0) goto L10
            goto L11
        L10:
            return
        L11:
            float r0 = r5.X
            float r1 = r5.Y
            float r0 = r0 + r1
            boolean r1 = r5.s0
            if (r1 == 0) goto L1d
            android.graphics.drawable.Drawable r1 = r5.T
            goto L1f
        L1d:
            android.graphics.drawable.Drawable r1 = r5.H
        L1f:
            float r2 = r5.J
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 > 0) goto L2d
            if (r1 == 0) goto L2d
            int r1 = r1.getIntrinsicWidth()
            float r2 = (float) r1
        L2d:
            int r1 = a.C0439w5.b.a(r5)
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
            boolean r0 = r5.s0
            if (r0 == 0) goto L4d
            android.graphics.drawable.Drawable r0 = r5.T
            goto L4f
        L4d:
            android.graphics.drawable.Drawable r0 = r5.H
        L4f:
            float r1 = r5.J
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 > 0) goto L7d
            if (r0 == 0) goto L7d
            android.content.Context r1 = r5.f0
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

    public final float q() {
            r4 = this;
            boolean r0 = r4.T()
            r1 = 0
            if (r0 != 0) goto Lf
            boolean r0 = r4.S()
            if (r0 == 0) goto Le
            goto Lf
        Le:
            return r1
        Lf:
            float r0 = r4.Y
            boolean r2 = r4.s0
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r4.T
            goto L1a
        L18:
            android.graphics.drawable.Drawable r2 = r4.H
        L1a:
            float r3 = r4.J
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L27
            if (r2 == 0) goto L27
            int r1 = r2.getIntrinsicWidth()
            float r3 = (float) r1
        L27:
            float r3 = r3 + r0
            float r0 = r4.Z
            float r3 = r3 + r0
            return r3
    }

    public final float r() {
            r2 = this;
            boolean r0 = r2.U()
            if (r0 == 0) goto Lf
            float r0 = r2.c0
            float r1 = r2.P
            float r0 = r0 + r1
            float r1 = r2.d0
            float r0 = r0 + r1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final float s() {
            r2 = this;
            boolean r0 = r2.F0
            if (r0 == 0) goto L13
            a.Ta$b r0 = r2.f278a
            a.Vd r0 = r0.f280a
            a.w4 r0 = r0.e
            android.graphics.RectF r1 = r2.g()
            float r0 = r0.a(r1)
            return r0
        L13:
            float r0 = r2.B
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

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            int r0 = r1.u0
            if (r0 == r2) goto L9
            r1.u0 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.v0
            if (r0 == r2) goto L9
            r1.v0 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.x0
            if (r0 == r2) goto Ld
            r1.x0 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        Ld:
            return
    }

    @Override // a.Ta, android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.y0
            if (r0 == r4) goto L22
            r3.y0 = r4
            android.content.res.ColorStateList r0 = r3.x0
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
            r3.w0 = r1
            r3.invalidateSelf()
        L22:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            boolean r1 = r2.T()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.H
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.S()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.T
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.U()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.M
            boolean r3 = r1.setVisible(r3, r4)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
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

    public final void v() {
            r1 = this;
            java.lang.ref.WeakReference<com.google.android.material.chip.a$a> r0 = r1.B0
            java.lang.Object r0 = r0.get()
            com.google.android.material.chip.a$a r0 = (com.google.android.material.chip.a.InterfaceC0030a) r0
            if (r0 == 0) goto Ld
            r0.a()
        Ld:
            return
    }

    public final boolean w(int[] r12, int[] r13) {
            r11 = this;
            boolean r0 = super.onStateChange(r12)
            android.content.res.ColorStateList r1 = r11.y
            r2 = 0
            if (r1 == 0) goto L10
            int r3 = r11.m0
            int r1 = r1.getColorForState(r12, r3)
            goto L11
        L10:
            r1 = r2
        L11:
            int r1 = r11.c(r1)
            int r3 = r11.m0
            r4 = 1
            if (r3 == r1) goto L1d
            r11.m0 = r1
            r0 = r4
        L1d:
            android.content.res.ColorStateList r3 = r11.z
            if (r3 == 0) goto L28
            int r5 = r11.n0
            int r3 = r3.getColorForState(r12, r5)
            goto L29
        L28:
            r3 = r2
        L29:
            int r3 = r11.c(r3)
            int r5 = r11.n0
            if (r5 == r3) goto L34
            r11.n0 = r3
            r0 = r4
        L34:
            int r1 = a.C0419v3.b(r3, r1)
            int r3 = r11.o0
            if (r3 == r1) goto L3e
            r3 = r4
            goto L3f
        L3e:
            r3 = r2
        L3f:
            a.Ta$b r5 = r11.f278a
            android.content.res.ColorStateList r5 = r5.c
            if (r5 != 0) goto L47
            r5 = r4
            goto L48
        L47:
            r5 = r2
        L48:
            r3 = r3 | r5
            if (r3 == 0) goto L55
            r11.o0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r11.k(r0)
            r0 = r4
        L55:
            android.content.res.ColorStateList r1 = r11.C
            if (r1 == 0) goto L60
            int r3 = r11.p0
            int r1 = r1.getColorForState(r12, r3)
            goto L61
        L60:
            r1 = r2
        L61:
            int r3 = r11.p0
            if (r3 == r1) goto L68
            r11.p0 = r1
            r0 = r4
        L68:
            android.content.res.ColorStateList r1 = r11.A0
            if (r1 == 0) goto La3
            int r1 = r12.length
            r3 = 0
            r5 = r3
            r6 = r5
            r7 = r6
        L71:
            r8 = 1
            if (r5 >= r1) goto L93
            r9 = r12[r5]
            r10 = 16842910(0x101009e, float:2.3694E-38)
            if (r9 != r10) goto L7d
            r6 = r8
            goto L90
        L7d:
            r10 = 16842908(0x101009c, float:2.3693995E-38)
            if (r9 != r10) goto L84
        L82:
            r7 = r8
            goto L90
        L84:
            r10 = 16842919(0x10100a7, float:2.3694026E-38)
            if (r9 != r10) goto L8a
            goto L82
        L8a:
            r10 = 16843623(0x1010367, float:2.3696E-38)
            if (r9 != r10) goto L90
            goto L82
        L90:
            int r5 = r5 + 1
            goto L71
        L93:
            if (r6 == 0) goto L98
            if (r7 == 0) goto L98
            r3 = r8
        L98:
            if (r3 == 0) goto La3
            android.content.res.ColorStateList r1 = r11.A0
            int r3 = r11.q0
            int r1 = r1.getColorForState(r12, r3)
            goto La4
        La3:
            r1 = r2
        La4:
            int r3 = r11.q0
            if (r3 == r1) goto Laa
            r11.q0 = r1
        Laa:
            a.Ye r1 = r11.l0
            a.Ve r1 = r1.f
            if (r1 == 0) goto Lbb
            android.content.res.ColorStateList r1 = r1.j
            if (r1 == 0) goto Lbb
            int r3 = r11.r0
            int r1 = r1.getColorForState(r12, r3)
            goto Lbc
        Lbb:
            r1 = r2
        Lbc:
            int r3 = r11.r0
            if (r3 == r1) goto Lc3
            r11.r0 = r1
            r0 = r4
        Lc3:
            int[] r1 = r11.getState()
            if (r1 != 0) goto Lca
            goto Lde
        Lca:
            int r3 = r1.length
            r5 = r2
        Lcc:
            if (r5 >= r3) goto Lde
            r6 = r1[r5]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 != r7) goto Ldb
            boolean r1 = r11.R
            if (r1 == 0) goto Lde
            r1 = r4
            goto Ldf
        Ldb:
            int r5 = r5 + 1
            goto Lcc
        Lde:
            r1 = r2
        Ldf:
            boolean r3 = r11.s0
            if (r3 == r1) goto Lfb
            android.graphics.drawable.Drawable r3 = r11.T
            if (r3 == 0) goto Lfb
            float r0 = r11.q()
            r11.s0 = r1
            float r1 = r11.q()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf8
            r0 = r4
            r1 = r0
            goto Lfc
        Lf8:
            r1 = r2
            r0 = r4
            goto Lfc
        Lfb:
            r1 = r2
        Lfc:
            android.content.res.ColorStateList r3 = r11.x0
            if (r3 == 0) goto L107
            int r5 = r11.t0
            int r3 = r3.getColorForState(r12, r5)
            goto L108
        L107:
            r3 = r2
        L108:
            int r5 = r11.t0
            if (r5 == r3) goto L129
            r11.t0 = r3
            android.content.res.ColorStateList r0 = r11.x0
            android.graphics.PorterDuff$Mode r3 = r11.y0
            if (r0 == 0) goto L125
            if (r3 != 0) goto L117
            goto L125
        L117:
            int[] r5 = r11.getState()
            int r0 = r0.getColorForState(r5, r2)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r0, r3)
            goto L126
        L125:
            r5 = 0
        L126:
            r11.w0 = r5
            goto L12a
        L129:
            r4 = r0
        L12a:
            android.graphics.drawable.Drawable r0 = r11.H
            boolean r0 = u(r0)
            if (r0 == 0) goto L139
            android.graphics.drawable.Drawable r0 = r11.H
            boolean r0 = r0.setState(r12)
            r4 = r4 | r0
        L139:
            android.graphics.drawable.Drawable r0 = r11.T
            boolean r0 = u(r0)
            if (r0 == 0) goto L148
            android.graphics.drawable.Drawable r0 = r11.T
            boolean r0 = r0.setState(r12)
            r4 = r4 | r0
        L148:
            android.graphics.drawable.Drawable r0 = r11.M
            boolean r0 = u(r0)
            if (r0 == 0) goto L165
            int r0 = r12.length
            int r3 = r13.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r12.length
            java.lang.System.arraycopy(r12, r2, r0, r2, r3)
            int r12 = r12.length
            int r3 = r13.length
            java.lang.System.arraycopy(r13, r2, r0, r12, r3)
            android.graphics.drawable.Drawable r12 = r11.M
            boolean r12 = r12.setState(r0)
            r4 = r4 | r12
        L165:
            android.graphics.drawable.RippleDrawable r12 = r11.N
            boolean r12 = u(r12)
            if (r12 == 0) goto L174
            android.graphics.drawable.RippleDrawable r12 = r11.N
            boolean r12 = r12.setState(r13)
            r4 = r4 | r12
        L174:
            if (r4 == 0) goto L179
            r11.invalidateSelf()
        L179:
            if (r1 == 0) goto L17e
            r11.v()
        L17e:
            return r4
    }

    public final void x(boolean r2) {
            r1 = this;
            boolean r0 = r1.R
            if (r0 == r2) goto L21
            r1.R = r2
            float r0 = r1.q()
            if (r2 != 0) goto L13
            boolean r2 = r1.s0
            if (r2 == 0) goto L13
            r2 = 0
            r1.s0 = r2
        L13:
            float r2 = r1.q()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            r1.v()
        L21:
            return
    }

    public final void y(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.T
            if (r0 == r3) goto L22
            float r0 = r2.q()
            r2.T = r3
            float r3 = r2.q()
            android.graphics.drawable.Drawable r1 = r2.T
            V(r1)
            android.graphics.drawable.Drawable r1 = r2.T
            r2.o(r1)
            r2.invalidateSelf()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            r2.v()
        L22:
            return
    }

    public final void z(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.U
            if (r0 == r3) goto L1c
            r2.U = r3
            boolean r0 = r2.S
            if (r0 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r2.T
            if (r0 == 0) goto L15
            boolean r1 = r2.R
            if (r1 == 0) goto L15
            a.C0439w5.a.h(r0, r3)
        L15:
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        L1c:
            return
    }
}
