package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends androidx.recyclerview.widget.RecyclerView.l implements androidx.recyclerview.widget.RecyclerView.v.b {
    public int A;
    public int B;
    public final int C;
    public int p;
    public int q;
    public int r;
    public final com.google.android.material.carousel.CarouselLayoutManager.b s;
    public final a.C0481yb t;
    public com.google.android.material.carousel.c u;
    public com.google.android.material.carousel.b v;
    public int w;
    public java.util.HashMap x;
    public a.Q2 y;
    public final android.view.View.OnLayoutChangeListener z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.View f1058a;
        public final float b;
        public final float c;
        public final com.google.android.material.carousel.CarouselLayoutManager.c d;

        public a(android.view.View r1, float r2, float r3, com.google.android.material.carousel.CarouselLayoutManager.c r4) {
                r0 = this;
                r0.<init>()
                r0.f1058a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }
    }

    public static class b extends androidx.recyclerview.widget.RecyclerView.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.Paint f1059a;
        public java.util.List<com.google.android.material.carousel.b.C0029b> b;

        public b() {
                r2 = this;
                r2.<init>()
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r2.f1059a = r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = java.util.Collections.unmodifiableList(r1)
                r2.b = r1
                r1 = 1084227584(0x40a00000, float:5.0)
                r0.setStrokeWidth(r1)
                r1 = -65281(0xffffffffffff00ff, float:NaN)
                r0.setColor(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public final void d(android.graphics.Canvas r12, androidx.recyclerview.widget.RecyclerView r13) {
                r11 = this;
                android.graphics.Paint r5 = r11.f1059a
                android.content.res.Resources r0 = r13.getResources()
                int r1 = com.google.android.material.R.dimen.m3_carousel_debug_keyline_width
                float r0 = r0.getDimension(r1)
                r5.setStrokeWidth(r0)
                java.util.List<com.google.android.material.carousel.b$b> r0 = r11.b
                java.util.Iterator r6 = r0.iterator()
            L15:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto Lbf
                java.lang.Object r0 = r6.next()
                com.google.android.material.carousel.b$b r0 = (com.google.android.material.carousel.b.C0029b) r0
                float r1 = r0.c
                java.lang.ThreadLocal<double[]> r2 = a.C0419v3.f730a
                r2 = 1065353216(0x3f800000, float:1.0)
                float r2 = r2 - r1
                r3 = -65281(0xffffffffffff00ff, float:NaN)
                int r4 = android.graphics.Color.alpha(r3)
                float r4 = (float) r4
                float r4 = r4 * r2
                r7 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
                int r8 = android.graphics.Color.alpha(r7)
                float r8 = (float) r8
                float r8 = r8 * r1
                float r8 = r8 + r4
                int r4 = android.graphics.Color.red(r3)
                float r4 = (float) r4
                float r4 = r4 * r2
                int r9 = android.graphics.Color.red(r7)
                float r9 = (float) r9
                float r9 = r9 * r1
                float r9 = r9 + r4
                int r4 = android.graphics.Color.green(r3)
                float r4 = (float) r4
                float r4 = r4 * r2
                int r10 = android.graphics.Color.green(r7)
                float r10 = (float) r10
                float r10 = r10 * r1
                float r10 = r10 + r4
                int r3 = android.graphics.Color.blue(r3)
                float r3 = (float) r3
                float r3 = r3 * r2
                int r2 = android.graphics.Color.blue(r7)
                float r2 = (float) r2
                float r2 = r2 * r1
                float r2 = r2 + r3
                int r1 = (int) r8
                int r3 = (int) r9
                int r4 = (int) r10
                int r2 = (int) r2
                int r1 = android.graphics.Color.argb(r1, r3, r4, r2)
                r5.setColor(r1)
                androidx.recyclerview.widget.RecyclerView$l r1 = r13.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
                boolean r1 = r1.P0()
                if (r1 == 0) goto L9b
                androidx.recyclerview.widget.RecyclerView$l r1 = r13.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
                a.Q2 r1 = r1.y
                int r1 = r1.i()
                float r2 = (float) r1
                androidx.recyclerview.widget.RecyclerView$l r1 = r13.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
                a.Q2 r1 = r1.y
                int r1 = r1.d()
                float r4 = (float) r1
                float r1 = r0.b
                r3 = r1
                r0 = r12
                r0.drawLine(r1, r2, r3, r4, r5)
                goto Lbc
            L9b:
                androidx.recyclerview.widget.RecyclerView$l r1 = r13.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r1 = (com.google.android.material.carousel.CarouselLayoutManager) r1
                a.Q2 r1 = r1.y
                int r1 = r1.f()
                float r1 = (float) r1
                androidx.recyclerview.widget.RecyclerView$l r2 = r13.getLayoutManager()
                com.google.android.material.carousel.CarouselLayoutManager r2 = (com.google.android.material.carousel.CarouselLayoutManager) r2
                a.Q2 r2 = r2.y
                int r2 = r2.g()
                float r3 = (float) r2
                float r2 = r0.b
                r4 = r2
                r0 = r12
                r0.drawLine(r1, r2, r3, r4, r5)
            Lbc:
                r12 = r0
                goto L15
            Lbf:
                return
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.material.carousel.b.C0029b f1060a;
        public final com.google.android.material.carousel.b.C0029b b;

        public c(com.google.android.material.carousel.b.C0029b r3, com.google.android.material.carousel.b.C0029b r4) {
                r2 = this;
                r2.<init>()
                float r0 = r3.f1063a
                float r1 = r4.f1063a
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L10
                r2.f1060a = r3
                r2.b = r4
                return
            L10:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>()
                throw r3
        }
    }

    public CarouselLayoutManager() {
            r3 = this;
            a.yb r0 = new a.yb
            r0.<init>()
            r3.<init>()
            com.google.android.material.carousel.CarouselLayoutManager$b r1 = new com.google.android.material.carousel.CarouselLayoutManager$b
            r1.<init>()
            r3.s = r1
            r1 = 0
            r3.w = r1
            a.L2 r2 = new a.L2
            r2.<init>(r3)
            r3.z = r2
            r2 = -1
            r3.B = r2
            r3.C = r1
            r3.t = r0
            r3.W0()
            r3.Y0(r1)
            return
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            com.google.android.material.carousel.CarouselLayoutManager$b r3 = new com.google.android.material.carousel.CarouselLayoutManager$b
            r3.<init>()
            r0.s = r3
            r3 = 0
            r0.w = r3
            a.L2 r4 = new a.L2
            r4.<init>(r0)
            r0.z = r4
            r4 = -1
            r0.B = r4
            r0.C = r3
            a.yb r4 = new a.yb
            r4.<init>()
            r0.t = r4
            r0.W0()
            if (r2 == 0) goto L42
            int[] r4 = com.google.android.material.R.styleable.Carousel
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r4)
            int r2 = com.google.android.material.R.styleable.Carousel_carousel_alignment
            int r2 = r1.getInt(r2, r3)
            r0.C = r2
            r0.W0()
            int r2 = com.google.android.material.R.styleable.RecyclerView_android_orientation
            int r2 = r1.getInt(r2, r3)
            r0.Y0(r2)
            r1.recycle()
        L42:
            return
    }

    public static com.google.android.material.carousel.CarouselLayoutManager.c O0(java.util.List<com.google.android.material.carousel.b.C0029b> r13, float r14, boolean r15) {
            r0 = -1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = 0
            r6 = r0
            r7 = r6
            r8 = r7
            r9 = r8
            r4 = r2
            r5 = r3
            r2 = r1
            r3 = r2
        L10:
            int r10 = r13.size()
            if (r5 >= r10) goto L4c
            java.lang.Object r10 = r13.get(r5)
            com.google.android.material.carousel.b$b r10 = (com.google.android.material.carousel.b.C0029b) r10
            if (r15 == 0) goto L21
            float r10 = r10.b
            goto L23
        L21:
            float r10 = r10.f1063a
        L23:
            float r11 = r10 - r14
            float r11 = java.lang.Math.abs(r11)
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 > 0) goto L33
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 > 0) goto L33
            r6 = r5
            r1 = r11
        L33:
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 <= 0) goto L3d
            int r12 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r12 > 0) goto L3d
            r8 = r5
            r2 = r11
        L3d:
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 > 0) goto L43
            r7 = r5
            r3 = r10
        L43:
            int r11 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r11 <= 0) goto L49
            r9 = r5
            r4 = r10
        L49:
            int r5 = r5 + 1
            goto L10
        L4c:
            if (r6 != r0) goto L4f
            r6 = r7
        L4f:
            if (r8 != r0) goto L52
            r8 = r9
        L52:
            com.google.android.material.carousel.CarouselLayoutManager$c r14 = new com.google.android.material.carousel.CarouselLayoutManager$c
            java.lang.Object r15 = r13.get(r6)
            com.google.android.material.carousel.b$b r15 = (com.google.android.material.carousel.b.C0029b) r15
            java.lang.Object r13 = r13.get(r8)
            com.google.android.material.carousel.b$b r13 = (com.google.android.material.carousel.b.C0029b) r13
            r14.<init>(r15, r13)
            return r14
    }

    public final void C0(android.view.View r3, int r4, com.google.android.material.carousel.CarouselLayoutManager.a r5) {
            r2 = this;
            com.google.android.material.carousel.b r0 = r2.v
            float r0 = r0.f1061a
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r1 = 0
            r2.b(r3, r4, r1)
            float r4 = r5.c
            float r1 = r4 - r0
            int r1 = (int) r1
            float r4 = r4 + r0
            int r4 = (int) r4
            a.Q2 r0 = r2.y
            r0.j(r3, r1, r4)
            com.google.android.material.carousel.CarouselLayoutManager$c r4 = r5.d
            float r5 = r5.b
            r2.Z0(r3, r5, r4)
            return
    }

    public final float D0(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.Q0()
            if (r0 == 0) goto L8
            float r2 = r2 - r3
            return r2
        L8:
            float r2 = r2 + r3
            return r2
    }

    public final void E0(int r6, androidx.recyclerview.widget.RecyclerView.r r7, androidx.recyclerview.widget.RecyclerView.w r8) {
            r5 = this;
            float r0 = r5.H0(r6)
        L4:
            int r1 = r8.b()
            if (r6 >= r1) goto L31
            com.google.android.material.carousel.CarouselLayoutManager$a r1 = r5.T0(r7, r0, r6)
            float r2 = r1.c
            com.google.android.material.carousel.CarouselLayoutManager$c r3 = r1.d
            boolean r4 = r5.R0(r2, r3)
            if (r4 == 0) goto L19
            goto L31
        L19:
            com.google.android.material.carousel.b r4 = r5.v
            float r4 = r4.f1061a
            float r0 = r5.D0(r0, r4)
            boolean r2 = r5.S0(r2, r3)
            if (r2 == 0) goto L28
            goto L2e
        L28:
            android.view.View r2 = r1.f1058a
            r3 = -1
            r5.C0(r2, r3, r1)
        L2e:
            int r6 = r6 + 1
            goto L4
        L31:
            return
    }

    public final void F0(androidx.recyclerview.widget.RecyclerView.r r7, int r8) {
            r6 = this;
            float r0 = r6.H0(r8)
        L4:
            if (r8 < 0) goto L32
            com.google.android.material.carousel.CarouselLayoutManager$a r1 = r6.T0(r7, r0, r8)
            com.google.android.material.carousel.CarouselLayoutManager$c r2 = r1.d
            float r3 = r1.c
            boolean r4 = r6.S0(r3, r2)
            if (r4 == 0) goto L15
            goto L32
        L15:
            com.google.android.material.carousel.b r4 = r6.v
            float r4 = r4.f1061a
            boolean r5 = r6.Q0()
            if (r5 == 0) goto L21
            float r0 = r0 + r4
            goto L22
        L21:
            float r0 = r0 - r4
        L22:
            boolean r2 = r6.R0(r3, r2)
            if (r2 == 0) goto L29
            goto L2f
        L29:
            android.view.View r2 = r1.f1058a
            r3 = 0
            r6.C0(r2, r3, r1)
        L2f:
            int r8 = r8 + (-1)
            goto L4
        L32:
            return
    }

    public final float G0(android.view.View r6, float r7, com.google.android.material.carousel.CarouselLayoutManager.c r8) {
            r5 = this;
            com.google.android.material.carousel.b$b r0 = r8.f1060a
            float r1 = r0.b
            com.google.android.material.carousel.b$b r8 = r8.b
            float r2 = r8.b
            float r3 = r0.f1063a
            float r4 = r8.f1063a
            float r1 = a.C0434w0.b(r1, r2, r3, r4, r7)
            com.google.android.material.carousel.b r2 = r5.v
            com.google.android.material.carousel.b$b r2 = r2.b()
            if (r8 == r2) goto L22
            com.google.android.material.carousel.b r2 = r5.v
            com.google.android.material.carousel.b$b r2 = r2.d()
            if (r0 != r2) goto L21
            goto L22
        L21:
            return r1
        L22:
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r6 = (androidx.recyclerview.widget.RecyclerView.m) r6
            a.Q2 r0 = r5.y
            float r6 = r0.b(r6)
            com.google.android.material.carousel.b r0 = r5.v
            float r0 = r0.f1061a
            float r6 = r6 / r0
            float r7 = r7 - r4
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8.c
            float r0 = r0 - r8
            float r0 = r0 + r6
            float r0 = r0 * r7
            float r0 = r0 + r1
            return r0
    }

    public final float H0(int r3) {
            r2 = this;
            a.Q2 r0 = r2.y
            int r0 = r0.h()
            int r1 = r2.p
            int r0 = r0 - r1
            float r0 = (float) r0
            com.google.android.material.carousel.b r1 = r2.v
            float r1 = r1.f1061a
            float r3 = (float) r3
            float r1 = r1 * r3
            float r3 = r2.D0(r0, r1)
            return r3
    }

    public final void I0(androidx.recyclerview.widget.RecyclerView.r r6, androidx.recyclerview.widget.RecyclerView.w r7) {
            r5 = this;
        L0:
            int r0 = r5.v()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L22
            android.view.View r0 = r5.u(r1)
            float r3 = r5.K0(r0)
            com.google.android.material.carousel.b r4 = r5.v
            java.util.List<com.google.android.material.carousel.b$b> r4 = r4.b
            com.google.android.material.carousel.CarouselLayoutManager$c r4 = O0(r4, r3, r2)
            boolean r3 = r5.S0(r3, r4)
            if (r3 == 0) goto L22
            r5.k0(r0, r6)
            goto L0
        L22:
            int r0 = r5.v()
            int r0 = r0 - r2
            if (r0 < 0) goto L48
            int r0 = r5.v()
            int r0 = r0 - r2
            android.view.View r0 = r5.u(r0)
            float r3 = r5.K0(r0)
            com.google.android.material.carousel.b r4 = r5.v
            java.util.List<com.google.android.material.carousel.b$b> r4 = r4.b
            com.google.android.material.carousel.CarouselLayoutManager$c r4 = O0(r4, r3, r2)
            boolean r3 = r5.R0(r3, r4)
            if (r3 == 0) goto L48
            r5.k0(r0, r6)
            goto L22
        L48:
            int r0 = r5.v()
            if (r0 != 0) goto L5a
            int r0 = r5.w
            int r0 = r0 - r2
            r5.F0(r6, r0)
            int r0 = r5.w
            r5.E0(r0, r6, r7)
            return
        L5a:
            android.view.View r0 = r5.u(r1)
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
            int r1 = r5.v()
            int r1 = r1 - r2
            android.view.View r1 = r5.u(r1)
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r1)
            int r0 = r0 - r2
            r5.F0(r6, r0)
            int r1 = r1 + r2
            r5.E0(r1, r6, r7)
            return
    }

    public final int J0() {
            r1 = this;
            boolean r0 = r1.P0()
            if (r0 == 0) goto L9
            int r0 = r1.n
            return r0
        L9:
            int r0 = r1.o
            return r0
    }

    public final float K0(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            super.y(r2, r0)
            boolean r2 = r1.P0()
            if (r2 == 0) goto L14
            int r2 = r0.centerX()
        L12:
            float r2 = (float) r2
            return r2
        L14:
            int r2 = r0.centerY()
            goto L12
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean L() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final com.google.android.material.carousel.b L0(int r4) {
            r3 = this;
            java.util.HashMap r0 = r3.x
            if (r0 == 0) goto L20
            int r1 = r3.B()
            int r1 = r1 + (-1)
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            int r4 = a.C0282n9.j(r4, r2, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.material.carousel.b r4 = (com.google.android.material.carousel.b) r4
            if (r4 == 0) goto L20
            return r4
        L20:
            com.google.android.material.carousel.c r4 = r3.u
            com.google.android.material.carousel.b r4 = r4.f1064a
            return r4
    }

    public final int M0(int r4, com.google.android.material.carousel.b r5) {
            r3 = this;
            boolean r0 = r3.Q0()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L1d
            int r0 = r3.J0()
            float r0 = (float) r0
            com.google.android.material.carousel.b$b r2 = r5.c()
            float r2 = r2.f1063a
            float r0 = r0 - r2
            float r4 = (float) r4
            float r5 = r5.f1061a
            float r4 = r4 * r5
            float r0 = r0 - r4
            float r5 = r5 / r1
            float r0 = r0 - r5
            int r4 = (int) r0
            return r4
        L1d:
            float r4 = (float) r4
            float r0 = r5.f1061a
            float r4 = r4 * r0
            com.google.android.material.carousel.b$b r0 = r5.a()
            float r0 = r0.f1063a
            float r4 = r4 - r0
            float r5 = r5.f1061a
            float r5 = r5 / r1
            float r5 = r5 + r4
            int r4 = (int) r5
            return r4
    }

    public final int N0(int r7, com.google.android.material.carousel.b r8) {
            r6 = this;
            int r0 = r8.d
            int r0 = r0 + 1
            java.util.List<com.google.android.material.carousel.b$b> r1 = r8.b
            int r2 = r8.c
            java.util.List r0 = r1.subList(r2, r0)
            java.util.Iterator r0 = r0.iterator()
            r1 = 2147483647(0x7fffffff, float:NaN)
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r0.next()
            com.google.android.material.carousel.b$b r2 = (com.google.android.material.carousel.b.C0029b) r2
            float r3 = (float) r7
            float r4 = r8.f1061a
            float r3 = r3 * r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r4 = r4 + r3
            boolean r3 = r6.Q0()
            if (r3 == 0) goto L38
            int r3 = r6.J0()
            float r3 = (float) r3
            float r2 = r2.f1063a
            float r3 = r3 - r2
            float r3 = r3 - r4
            int r2 = (int) r3
            goto L3c
        L38:
            float r2 = r2.f1063a
            float r4 = r4 - r2
            int r2 = (int) r4
        L3c:
            int r3 = r6.p
            int r2 = r2 - r3
            int r3 = java.lang.Math.abs(r1)
            int r4 = java.lang.Math.abs(r2)
            if (r3 <= r4) goto L13
            r1 = r2
            goto L13
        L4b:
            return r1
    }

    public final boolean P0() {
            r1 = this;
            a.Q2 r0 = r1.y
            int r0 = r0.f222a
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean Q0() {
            r2 = this;
            boolean r0 = r2.P0()
            if (r0 == 0) goto Le
            int r0 = r2.C()
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void R(androidx.recyclerview.widget.RecyclerView r6) {
            r5 = this;
            a.yb r0 = r5.t
            android.content.Context r1 = r6.getContext()
            float r2 = r0.f237a
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto Le
            goto L18
        Le:
            android.content.res.Resources r2 = r1.getResources()
            int r4 = com.google.android.material.R.dimen.m3_carousel_small_item_size_min
            float r2 = r2.getDimension(r4)
        L18:
            r0.f237a = r2
            float r2 = r0.b
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L21
            goto L2b
        L21:
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.google.android.material.R.dimen.m3_carousel_small_item_size_max
            float r2 = r1.getDimension(r2)
        L2b:
            r0.b = r2
            r5.W0()
            android.view.View$OnLayoutChangeListener r0 = r5.z
            r6.addOnLayoutChangeListener(r0)
            return
    }

    public final boolean R0(float r4, com.google.android.material.carousel.CarouselLayoutManager.c r5) {
            r3 = this;
            com.google.android.material.carousel.b$b r0 = r5.f1060a
            float r1 = r0.d
            com.google.android.material.carousel.b$b r5 = r5.b
            float r2 = r5.d
            float r0 = r0.b
            float r5 = r5.b
            float r5 = a.C0434w0.b(r1, r2, r0, r5, r4)
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            boolean r0 = r3.Q0()
            if (r0 == 0) goto L1b
            float r4 = r4 + r5
            goto L1c
        L1b:
            float r4 = r4 - r5
        L1c:
            boolean r5 = r3.Q0()
            if (r5 == 0) goto L28
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L33
            goto L31
        L28:
            int r5 = r3.J0()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L33
        L31:
            r4 = 1
            return r4
        L33:
            r4 = 0
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void S(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            android.view.View$OnLayoutChangeListener r0 = r1.z
            r2.removeOnLayoutChangeListener(r0)
            return
    }

    public final boolean S0(float r4, com.google.android.material.carousel.CarouselLayoutManager.c r5) {
            r3 = this;
            com.google.android.material.carousel.b$b r0 = r5.f1060a
            float r1 = r0.d
            com.google.android.material.carousel.b$b r5 = r5.b
            float r2 = r5.d
            float r0 = r0.b
            float r5 = r5.b
            float r5 = a.C0434w0.b(r1, r2, r0, r5, r4)
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r3.D0(r4, r5)
            boolean r5 = r3.Q0()
            if (r5 == 0) goto L27
            int r5 = r3.J0()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L2e
            goto L2c
        L27:
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L2e
        L2c:
            r4 = 1
            return r4
        L2e:
            r4 = 0
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final android.view.View T(android.view.View r5, int r6, androidx.recyclerview.widget.RecyclerView.r r7, androidx.recyclerview.widget.RecyclerView.w r8) {
            r4 = this;
            int r8 = r4.v()
            if (r8 != 0) goto L8
            goto L9c
        L8:
            a.Q2 r8 = r4.y
            int r8 = r8.f222a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L46
            r3 = 2
            if (r6 == r3) goto L3c
            r3 = 17
            if (r6 == r3) goto L4b
            r3 = 33
            if (r6 == r3) goto L48
            r3 = 66
            if (r6 == r3) goto L3e
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r8.<init>(r3)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.String r8 = "CarouselLayoutManager"
            android.util.Log.d(r8, r6)
        L38:
            r6 = r0
            goto L54
        L3a:
            if (r8 != r2) goto L38
        L3c:
            r6 = r2
            goto L54
        L3e:
            if (r8 != 0) goto L38
            boolean r6 = r4.Q0()
            if (r6 == 0) goto L3c
        L46:
            r6 = r1
            goto L54
        L48:
            if (r8 != r2) goto L38
            goto L46
        L4b:
            if (r8 != 0) goto L38
            boolean r6 = r4.Q0()
            if (r6 == 0) goto L46
            goto L3c
        L54:
            if (r6 != r0) goto L57
            goto L9c
        L57:
            r8 = 0
            if (r6 != r1) goto L91
            int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            if (r5 != 0) goto L61
            goto L9c
        L61:
            android.view.View r5 = r4.u(r8)
            int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L80
            int r6 = r4.B()
            if (r5 < r6) goto L73
            goto L80
        L73:
            float r6 = r4.H0(r5)
            com.google.android.material.carousel.CarouselLayoutManager$a r5 = r4.T0(r7, r6, r5)
            android.view.View r6 = r5.f1058a
            r4.C0(r6, r8, r5)
        L80:
            boolean r5 = r4.Q0()
            if (r5 == 0) goto L8c
            int r5 = r4.v()
            int r8 = r5 + (-1)
        L8c:
            android.view.View r5 = r4.u(r8)
            return r5
        L91:
            int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            int r6 = r4.B()
            int r6 = r6 - r2
            if (r5 != r6) goto L9e
        L9c:
            r5 = 0
            return r5
        L9e:
            int r5 = r4.v()
            int r5 = r5 - r2
            android.view.View r5 = r4.u(r5)
            int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lc2
            int r6 = r4.B()
            if (r5 < r6) goto Lb5
            goto Lc2
        Lb5:
            float r6 = r4.H0(r5)
            com.google.android.material.carousel.CarouselLayoutManager$a r5 = r4.T0(r7, r6, r5)
            android.view.View r6 = r5.f1058a
            r4.C0(r6, r1, r5)
        Lc2:
            boolean r5 = r4.Q0()
            if (r5 == 0) goto Lc9
            goto Lcf
        Lc9:
            int r5 = r4.v()
            int r8 = r5 + (-1)
        Lcf:
            android.view.View r5 = r4.u(r8)
            return r5
    }

    public final com.google.android.material.carousel.CarouselLayoutManager.a T0(androidx.recyclerview.widget.RecyclerView.r r3, float r4, int r5) {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            androidx.recyclerview.widget.RecyclerView$A r3 = r3.k(r0, r5)
            android.view.View r3 = r3.f963a
            r2.U0(r3)
            com.google.android.material.carousel.b r5 = r2.v
            float r5 = r5.f1061a
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r2.D0(r4, r5)
            com.google.android.material.carousel.b r5 = r2.v
            java.util.List<com.google.android.material.carousel.b$b> r5 = r5.b
            r0 = 0
            com.google.android.material.carousel.CarouselLayoutManager$c r5 = O0(r5, r4, r0)
            float r0 = r2.G0(r3, r4, r5)
            com.google.android.material.carousel.CarouselLayoutManager$a r1 = new com.google.android.material.carousel.CarouselLayoutManager$a
            r1.<init>(r3, r4, r0, r5)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void U(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.U(r2)
            int r0 = r1.v()
            if (r0 <= 0) goto L26
            r0 = 0
            android.view.View r0 = r1.u(r0)
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
            r2.setFromIndex(r0)
            int r0 = r1.v()
            int r0 = r0 + (-1)
            android.view.View r0 = r1.u(r0)
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
            r2.setToIndex(r0)
        L26:
            return
    }

    public final void U0(android.view.View r10) {
            r9 = this;
            boolean r0 = r10 instanceof a.InterfaceC0408ua
            if (r0 == 0) goto L8a
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            androidx.recyclerview.widget.RecyclerView r2 = r9.b
            if (r2 != 0) goto L18
            r2 = 0
            r1.set(r2, r2, r2, r2)
            goto L1f
        L18:
            android.graphics.Rect r2 = r2.M(r10)
            r1.set(r2)
        L1f:
            int r2 = r1.left
            int r3 = r1.right
            int r2 = r2 + r3
            int r3 = r1.top
            int r1 = r1.bottom
            int r3 = r3 + r1
            com.google.android.material.carousel.c r1 = r9.u
            if (r1 == 0) goto L38
            a.Q2 r4 = r9.y
            int r4 = r4.f222a
            if (r4 != 0) goto L38
            com.google.android.material.carousel.b r4 = r1.f1064a
            float r4 = r4.f1061a
            goto L3b
        L38:
            int r4 = r0.width
            float r4 = (float) r4
        L3b:
            if (r1 == 0) goto L49
            a.Q2 r5 = r9.y
            int r5 = r5.f222a
            r6 = 1
            if (r5 != r6) goto L49
            com.google.android.material.carousel.b r1 = r1.f1064a
            float r1 = r1.f1061a
            goto L4c
        L49:
            int r1 = r0.height
            float r1 = (float) r1
        L4c:
            int r5 = r9.n
            int r6 = r9.l
            int r7 = r9.E()
            int r8 = r9.F()
            int r8 = r8 + r7
            int r7 = r0.leftMargin
            int r8 = r8 + r7
            int r7 = r0.rightMargin
            int r8 = r8 + r7
            int r8 = r8 + r2
            int r2 = (int) r4
            boolean r4 = r9.P0()
            int r2 = androidx.recyclerview.widget.RecyclerView.l.w(r4, r5, r6, r8, r2)
            int r4 = r9.o
            int r5 = r9.m
            int r6 = r9.G()
            int r7 = r9.D()
            int r7 = r7 + r6
            int r6 = r0.topMargin
            int r7 = r7 + r6
            int r0 = r0.bottomMargin
            int r7 = r7 + r0
            int r7 = r7 + r3
            int r0 = (int) r1
            boolean r1 = r9.e()
            int r0 = androidx.recyclerview.widget.RecyclerView.l.w(r1, r4, r5, r7, r0)
            r10.measure(r2, r0)
            return
        L8a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r10.<init>(r0)
            throw r10
    }

    public final void V0(androidx.recyclerview.widget.RecyclerView.r r29) {
            r28 = this;
            r0 = r28
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r4 = r29
            androidx.recyclerview.widget.RecyclerView$A r1 = r4.k(r1, r3)
            android.view.View r1 = r1.f963a
            r0.U0(r1)
            a.yb r2 = r0.t
            r2.getClass()
            int r4 = r0.o
            float r4 = (float) r4
            boolean r5 = r0.P0()
            if (r5 == 0) goto L24
            int r4 = r0.n
            float r4 = (float) r4
        L24:
            r5 = r4
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.m) r4
            int r6 = r4.topMargin
            int r7 = r4.bottomMargin
            int r6 = r6 + r7
            float r6 = (float) r6
            int r7 = r1.getMeasuredHeight()
            float r7 = (float) r7
            boolean r8 = r0.P0()
            if (r8 == 0) goto L47
            int r6 = r4.leftMargin
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            float r6 = (float) r6
            int r4 = r1.getMeasuredWidth()
            float r7 = (float) r4
        L47:
            r4 = r6
            float r6 = r2.f237a
            float r6 = r6 + r4
            float r8 = r2.b
            float r8 = r8 + r4
            float r8 = java.lang.Math.max(r8, r6)
            float r9 = r7 + r4
            float r12 = java.lang.Math.min(r9, r5)
            r9 = 1077936128(0x40400000, float:3.0)
            float r7 = r7 / r9
            float r7 = r7 + r4
            float r9 = r6 + r4
            float r10 = r8 + r4
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L66
            r7 = r9
            goto L6b
        L66:
            int r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r9 <= 0) goto L6b
            r7 = r10
        L6b:
            float r9 = r12 + r7
            r14 = 1073741824(0x40000000, float:2.0)
            float r10 = r9 / r14
            int[] r9 = a.C0481yb.d
            float r11 = r6 * r14
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            r15 = 1
            if (r11 >= 0) goto L7e
            int[] r9 = new int[r15]
            r9[r3] = r3
        L7e:
            int[] r11 = a.C0481yb.e
            int r13 = r0.C
            if (r13 != r15) goto La7
            int r13 = r9.length
            r29 = r14
            int[] r14 = new int[r13]
            r16 = r15
        L8b:
            r15 = 2
            if (r3 >= r13) goto L97
            r17 = r9[r3]
            int r17 = r17 * 2
            r14[r3] = r17
            int r3 = r3 + 1
            goto L8b
        L97:
            int[] r3 = new int[r15]
            r9 = 0
        L9a:
            if (r9 >= r15) goto La4
            r13 = r11[r9]
            int r13 = r13 * r15
            r3[r9] = r13
            int r9 = r9 + 1
            goto L9a
        La4:
            r11 = r3
            r9 = r14
            goto Lab
        La7:
            r29 = r14
            r16 = r15
        Lab:
            int r3 = r11.length
            r14 = 0
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
        Laf:
            if (r14 >= r3) goto Lb9
            r13 = r11[r14]
            if (r13 <= r15) goto Lb6
            r15 = r13
        Lb6:
            int r14 = r14 + 1
            goto Laf
        Lb9:
            float r3 = (float) r15
            float r3 = r3 * r10
            float r3 = r5 - r3
            int r13 = r9.length
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 0
        Lc1:
            if (r15 >= r13) goto Lcf
            r17 = r1
            r1 = r9[r15]
            if (r1 <= r14) goto Lca
            r14 = r1
        Lca:
            int r15 = r15 + 1
            r1 = r17
            goto Lc1
        Lcf:
            r17 = r1
            float r1 = (float) r14
            float r1 = r1 * r8
            float r3 = r3 - r1
            float r3 = r3 / r12
            double r13 = (double) r3
            double r13 = java.lang.Math.floor(r13)
            r1 = r5
            r3 = r6
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = java.lang.Math.max(r5, r13)
            int r5 = (int) r5
            float r6 = r1 / r12
            double r13 = (double) r6
            double r13 = java.lang.Math.ceil(r13)
            int r14 = (int) r13
            int r5 = r14 - r5
            int r15 = r5 + 1
            int[] r13 = new int[r15]
            r5 = 0
        Lf2:
            if (r5 >= r15) goto Lfb
            int r6 = r14 - r5
            r13[r5] = r6
            int r5 = r5 + 1
            goto Lf2
        Lfb:
            r5 = r1
            r6 = r7
            r7 = r3
            a.D1 r1 = a.D1.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            int r3 = r1.c
            int r9 = r1.d
            int r3 = r3 + r9
            int r9 = r1.g
            int r3 = r3 + r9
            r2.c = r3
            int r2 = r0.B()
            int r3 = r1.c
            int r11 = r1.d
            int r13 = r3 + r11
            int r13 = r13 + r9
            int r13 = r13 - r2
            if (r13 <= 0) goto L122
            if (r3 > 0) goto L120
            r2 = r16
            if (r11 <= r2) goto L122
        L120:
            r2 = 1
            goto L123
        L122:
            r2 = 0
        L123:
            if (r13 <= 0) goto L13a
            int r3 = r1.c
            if (r3 <= 0) goto L12e
            int r3 = r3 + (-1)
            r1.c = r3
            goto L137
        L12e:
            int r3 = r1.d
            r11 = 1
            if (r3 <= r11) goto L137
            int r3 = r3 + (-1)
            r1.d = r3
        L137:
            int r13 = r13 + (-1)
            goto L123
        L13a:
            if (r2 == 0) goto L151
            int r2 = r1.c
            int[] r2 = new int[]{r2}
            int r1 = r1.d
            int[] r11 = new int[]{r1}
            int[] r13 = new int[]{r9}
            r9 = r2
            a.D1 r1 = a.D1.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L151:
            android.content.Context r2 = r17.getContext()
            int r3 = r0.C
            r6 = 0
            r11 = 1
            if (r3 != r11) goto L2a3
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.google.android.material.R.dimen.m3_carousel_gone_size
            float r2 = r2.getDimension(r3)
            float r2 = r2 + r4
            float r3 = r1.f
            float r10 = java.lang.Math.min(r2, r3)
            float r2 = r10 / r29
            float r8 = r6 - r2
            float r3 = r1.b
            int r7 = r1.c
            float r3 = com.google.android.material.carousel.a.b(r6, r3, r7)
            float r7 = r1.b
            int r9 = r1.c
            float r9 = (float) r9
            float r9 = r9 / r29
            double r11 = (double) r9
            double r11 = java.lang.Math.floor(r11)
            int r9 = (int) r11
            float r7 = com.google.android.material.carousel.a.a(r3, r7, r9)
            float r9 = r1.b
            int r11 = r1.c
            float r7 = com.google.android.material.carousel.a.c(r6, r7, r9, r11)
            float r9 = r1.e
            int r11 = r1.d
            float r13 = com.google.android.material.carousel.a.b(r7, r9, r11)
            float r9 = r1.e
            int r11 = r1.d
            float r11 = (float) r11
            float r11 = r11 / r29
            double r11 = (double) r11
            double r11 = java.lang.Math.floor(r11)
            int r11 = (int) r11
            float r9 = com.google.android.material.carousel.a.a(r13, r9, r11)
            float r11 = r1.e
            int r12 = r1.d
            float r7 = com.google.android.material.carousel.a.c(r7, r9, r11, r12)
            float r9 = r1.f
            int r11 = r1.g
            float r14 = com.google.android.material.carousel.a.b(r7, r9, r11)
            float r9 = r1.f
            float r9 = com.google.android.material.carousel.a.a(r14, r9, r11)
            float r12 = r1.f
            float r7 = com.google.android.material.carousel.a.c(r7, r9, r12, r11)
            float r9 = r1.e
            int r11 = r1.d
            float r15 = com.google.android.material.carousel.a.b(r7, r9, r11)
            float r9 = r1.e
            int r11 = r1.d
            float r11 = (float) r11
            float r11 = r11 / r29
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            float r9 = com.google.android.material.carousel.a.a(r15, r9, r11)
            float r11 = r1.e
            int r12 = r1.d
            float r7 = com.google.android.material.carousel.a.c(r7, r9, r11, r12)
            float r9 = r1.b
            int r11 = r1.c
            float r23 = com.google.android.material.carousel.a.b(r7, r9, r11)
            float r2 = r2 + r5
            float r7 = r1.f
            float r9 = a.R2.a(r10, r7, r4)
            float r7 = r1.b
            float r11 = r1.f
            float r19 = a.R2.a(r7, r11, r4)
            float r7 = r1.e
            float r11 = r1.f
            float r4 = a.R2.a(r7, r11, r4)
            com.google.android.material.carousel.b$a r7 = new com.google.android.material.carousel.b$a
            float r11 = r1.f
            r7.<init>(r11, r5)
            r11 = 0
            r12 = 1
            r7.a(r8, r9, r10, r11, r12)
            r17 = r7
            int r5 = r1.c
            if (r5 <= 0) goto L22e
            float r7 = r1.b
            float r5 = (float) r5
            float r5 = r5 / r29
            double r11 = (double) r5
            double r11 = java.lang.Math.floor(r11)
            int r5 = (int) r11
            r22 = 0
            r18 = r3
            r21 = r5
            r20 = r7
            r17.c(r18, r19, r20, r21, r22)
        L22e:
            r3 = r19
            int r5 = r1.d
            if (r5 <= 0) goto L24c
            float r7 = r1.e
            float r5 = (float) r5
            float r5 = r5 / r29
            double r11 = (double) r5
            double r11 = java.lang.Math.floor(r11)
            int r5 = (int) r11
            r22 = 0
            r19 = r4
            r21 = r5
            r20 = r7
            r18 = r13
            r17.c(r18, r19, r20, r21, r22)
        L24c:
            float r5 = r1.f
            r22 = 1
            r19 = 0
            int r7 = r1.g
            r20 = r5
            r21 = r7
            r18 = r14
            r17.c(r18, r19, r20, r21, r22)
            int r5 = r1.d
            if (r5 <= 0) goto L279
            float r7 = r1.e
            float r5 = (float) r5
            float r5 = r5 / r29
            double r11 = (double) r5
            double r11 = java.lang.Math.ceil(r11)
            int r5 = (int) r11
            r22 = 0
            r19 = r4
            r21 = r5
            r20 = r7
            r18 = r15
            r17.c(r18, r19, r20, r21, r22)
        L279:
            int r4 = r1.c
            if (r4 <= 0) goto L295
            float r1 = r1.b
            float r4 = (float) r4
            float r4 = r4 / r29
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            r22 = 0
            r20 = r1
            r19 = r3
            r21 = r4
            r18 = r23
            r17.c(r18, r19, r20, r21, r22)
        L295:
            r11 = 0
            r12 = 1
            r8 = r2
            r7 = r17
            r7.a(r8, r9, r10, r11, r12)
            com.google.android.material.carousel.b r1 = r17.d()
            goto L34c
        L2a3:
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.google.android.material.R.dimen.m3_carousel_gone_size
            float r2 = r2.getDimension(r3)
            float r2 = r2 + r4
            float r3 = r1.f
            float r10 = java.lang.Math.min(r2, r3)
            float r2 = r10 / r29
            float r8 = r6 - r2
            float r3 = r1.f
            int r7 = r1.g
            float r3 = com.google.android.material.carousel.a.b(r6, r3, r7)
            float r9 = r1.f
            float r9 = com.google.android.material.carousel.a.a(r3, r9, r7)
            float r11 = r1.f
            float r7 = com.google.android.material.carousel.a.c(r6, r9, r11, r7)
            float r9 = r1.e
            int r11 = r1.d
            float r13 = com.google.android.material.carousel.a.b(r7, r9, r11)
            float r9 = r1.e
            int r11 = r1.d
            float r7 = com.google.android.material.carousel.a.c(r7, r13, r9, r11)
            float r9 = r1.b
            int r11 = r1.c
            float r14 = com.google.android.material.carousel.a.b(r7, r9, r11)
            float r2 = r2 + r5
            float r7 = r1.f
            float r9 = a.R2.a(r10, r7, r4)
            float r7 = r1.b
            float r11 = r1.f
            float r15 = a.R2.a(r7, r11, r4)
            float r7 = r1.e
            float r11 = r1.f
            float r4 = a.R2.a(r7, r11, r4)
            com.google.android.material.carousel.b$a r7 = new com.google.android.material.carousel.b$a
            float r11 = r1.f
            r7.<init>(r11, r5)
            r11 = 0
            r12 = 1
            r7.a(r8, r9, r10, r11, r12)
            r17 = r7
            float r5 = r1.f
            r22 = 1
            r19 = 0
            int r7 = r1.g
            r18 = r3
            r20 = r5
            r21 = r7
            r17.c(r18, r19, r20, r21, r22)
            int r3 = r1.d
            if (r3 <= 0) goto L32d
            float r3 = r1.e
            r22 = 0
            r21 = 0
            r20 = r3
            r19 = r4
            r18 = r13
            r17.a(r18, r19, r20, r21, r22)
        L32d:
            int r3 = r1.c
            if (r3 <= 0) goto L340
            float r1 = r1.b
            r22 = 0
            r20 = r1
            r21 = r3
            r18 = r14
            r19 = r15
            r17.c(r18, r19, r20, r21, r22)
        L340:
            r11 = 0
            r12 = 1
            r8 = r2
            r7 = r17
            r7.a(r8, r9, r10, r11, r12)
            com.google.android.material.carousel.b r1 = r17.d()
        L34c:
            boolean r2 = r0.Q0()
            if (r2 == 0) goto L3a1
            int r2 = r0.J0()
            float r2 = (float) r2
            com.google.android.material.carousel.b$a r7 = new com.google.android.material.carousel.b$a
            float r3 = r1.f1061a
            r7.<init>(r3, r2)
            com.google.android.material.carousel.b$b r3 = r1.d()
            float r3 = r3.b
            float r2 = r2 - r3
            com.google.android.material.carousel.b$b r3 = r1.d()
            float r3 = r3.d
            float r3 = r3 / r29
            float r2 = r2 - r3
            java.util.List<com.google.android.material.carousel.b$b> r3 = r1.b
            int r4 = r3.size()
            r16 = 1
            int r4 = r4 + (-1)
        L378:
            if (r4 < 0) goto L39d
            java.lang.Object r5 = r3.get(r4)
            com.google.android.material.carousel.b$b r5 = (com.google.android.material.carousel.b.C0029b) r5
            float r10 = r5.d
            float r8 = r10 / r29
            float r8 = r8 + r2
            int r9 = r1.c
            if (r4 < r9) goto L38f
            int r9 = r1.d
            if (r4 > r9) goto L38f
            r11 = 1
            goto L390
        L38f:
            r11 = 0
        L390:
            float r9 = r5.c
            boolean r12 = r5.e
            r7.a(r8, r9, r10, r11, r12)
            float r5 = r5.d
            float r2 = r2 + r5
            int r4 = r4 + (-1)
            goto L378
        L39d:
            com.google.android.material.carousel.b r1 = r7.d()
        L3a1:
            r7 = r1
            int r1 = r0.v()
            if (r1 <= 0) goto L3c4
            r1 = 0
            android.view.View r2 = r0.u(r1)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r1 = (androidx.recyclerview.widget.RecyclerView.m) r1
            a.Q2 r2 = r0.y
            int r2 = r2.f222a
            if (r2 != 0) goto L3bf
            int r2 = r1.leftMargin
            int r1 = r1.rightMargin
        L3bd:
            int r1 = r1 + r2
            goto L3c5
        L3bf:
            int r2 = r1.topMargin
            int r1 = r1.bottomMargin
            goto L3bd
        L3c4:
            r1 = 0
        L3c5:
            float r1 = (float) r1
            androidx.recyclerview.widget.RecyclerView r2 = r0.b
            if (r2 == 0) goto L3d0
            boolean r2 = r2.h
            if (r2 == 0) goto L3d0
            r2 = 0
            goto L3e5
        L3d0:
            a.yb r2 = r0.t
            r2.getClass()
            a.Q2 r2 = r0.y
            int r2 = r2.f222a
            r11 = 1
            if (r2 != r11) goto L3e1
            int r2 = r0.G()
            goto L3e5
        L3e1:
            int r2 = r0.E()
        L3e5:
            float r2 = (float) r2
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 == 0) goto L3f0
            boolean r3 = r3.h
            if (r3 == 0) goto L3f0
            r3 = 0
            goto L405
        L3f0:
            a.yb r3 = r0.t
            r3.getClass()
            a.Q2 r3 = r0.y
            int r3 = r3.f222a
            r11 = 1
            if (r3 != r11) goto L401
            int r3 = r0.D()
            goto L405
        L401:
            int r3 = r0.F()
        L405:
            float r3 = (float) r3
            com.google.android.material.carousel.c r4 = new com.google.android.material.carousel.c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.add(r7)
            r8 = 0
        L411:
            java.util.List<com.google.android.material.carousel.b$b> r14 = r7.b
            int r9 = r14.size()
            if (r8 >= r9) goto L427
            java.lang.Object r9 = r14.get(r8)
            com.google.android.material.carousel.b$b r9 = (com.google.android.material.carousel.b.C0029b) r9
            boolean r9 = r9.e
            if (r9 != 0) goto L424
            goto L428
        L424:
            int r8 = r8 + 1
            goto L411
        L427:
            r8 = -1
        L428:
            boolean r9 = r0.P0()
            if (r9 == 0) goto L433
            int r9 = r0.n
        L430:
            float r9 = (float) r9
            r13 = r9
            goto L436
        L433:
            int r9 = r0.o
            goto L430
        L436:
            com.google.android.material.carousel.b$b r9 = r7.a()
            float r9 = r9.b
            com.google.android.material.carousel.b$b r10 = r7.a()
            float r10 = r10.d
            float r10 = r10 / r29
            float r9 = r9 - r10
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            r24 = 0
            int r10 = r7.d
            int r11 = r7.c
            if (r9 < 0) goto L471
            com.google.android.material.carousel.b$b r9 = r7.a()
            r25 = r6
            r12 = 0
        L456:
            int r6 = r14.size()
            if (r12 >= r6) goto L46a
            java.lang.Object r6 = r14.get(r12)
            com.google.android.material.carousel.b$b r6 = (com.google.android.material.carousel.b.C0029b) r6
            boolean r15 = r6.e
            if (r15 != 0) goto L467
            goto L46c
        L467:
            int r12 = r12 + 1
            goto L456
        L46a:
            r6 = r24
        L46c:
            if (r9 != r6) goto L46f
            goto L476
        L46f:
            r6 = -1
            goto L474
        L471:
            r25 = r6
            goto L46f
        L474:
            if (r8 != r6) goto L487
        L476:
            int r6 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r6 <= 0) goto L482
            r6 = 1
            com.google.android.material.carousel.b r2 = com.google.android.material.carousel.c.f(r7, r2, r13, r6, r1)
            r5.add(r2)
        L482:
            r15 = r10
            r26 = r11
            goto L555
        L487:
            int r6 = r11 - r8
            com.google.android.material.carousel.b$b r9 = r7.b()
            float r9 = r9.b
            com.google.android.material.carousel.b$b r12 = r7.b()
            float r12 = r12.d
            float r12 = r12 / r29
            float r9 = r9 - r12
            if (r6 > 0) goto L4c0
            com.google.android.material.carousel.b$b r12 = r7.a()
            float r12 = r12.f
            int r12 = (r12 > r25 ? 1 : (r12 == r25 ? 0 : -1))
            if (r12 <= 0) goto L4c0
            com.google.android.material.carousel.b$b r2 = r7.a()
            float r2 = r2.f
            float r9 = r9 + r2
            r8 = 0
            r2 = r11
            int r11 = r7.c
            r6 = r10
            r10 = r9
            r9 = 0
            int r12 = r7.d
            r26 = r2
            r15 = r6
            com.google.android.material.carousel.b r2 = com.google.android.material.carousel.c.e(r7, r8, r9, r10, r11, r12, r13)
            r5.add(r2)
            goto L555
        L4c0:
            r15 = r10
            r26 = r11
            r23 = r13
            r11 = r25
            r10 = 0
        L4c8:
            if (r10 >= r6) goto L555
            int r12 = r5.size()
            r16 = 1
            int r12 = r12 + (-1)
            java.lang.Object r12 = r5.get(r12)
            com.google.android.material.carousel.b r12 = (com.google.android.material.carousel.b) r12
            int r13 = r8 + r10
            int r17 = r14.size()
            int r17 = r17 + (-1)
            java.lang.Object r18 = r14.get(r13)
            r27 = r6
            r6 = r18
            com.google.android.material.carousel.b$b r6 = (com.google.android.material.carousel.b.C0029b) r6
            float r6 = r6.f
            float r11 = r11 + r6
            int r13 = r13 + (-1)
            if (r13 < 0) goto L526
            java.lang.Object r6 = r14.get(r13)
            com.google.android.material.carousel.b$b r6 = (com.google.android.material.carousel.b.C0029b) r6
            float r6 = r6.c
            int r13 = r12.d
            r17 = r6
        L4fd:
            java.util.List<com.google.android.material.carousel.b$b> r6 = r12.b
            r18 = r8
            int r8 = r6.size()
            if (r13 >= r8) goto L51a
            java.lang.Object r6 = r6.get(r13)
            com.google.android.material.carousel.b$b r6 = (com.google.android.material.carousel.b.C0029b) r6
            float r6 = r6.c
            int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r6 != 0) goto L515
            r8 = 1
            goto L521
        L515:
            int r13 = r13 + 1
            r8 = r18
            goto L4fd
        L51a:
            int r6 = r6.size()
            r8 = 1
            int r13 = r6 + (-1)
        L521:
            int r17 = r13 + (-1)
        L523:
            r19 = r17
            goto L52a
        L526:
            r18 = r8
            r8 = 1
            goto L523
        L52a:
            int r6 = r26 - r10
            int r21 = r6 + (-1)
            int r6 = r15 - r10
            int r22 = r6 + (-1)
            float r20 = r9 + r11
            r17 = r12
            com.google.android.material.carousel.b r6 = com.google.android.material.carousel.c.e(r17, r18, r19, r20, r21, r22, r23)
            r13 = r23
            int r12 = r27 + (-1)
            if (r10 != r12) goto L548
            int r12 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r12 <= 0) goto L548
            com.google.android.material.carousel.b r6 = com.google.android.material.carousel.c.f(r6, r2, r13, r8, r1)
        L548:
            r5.add(r6)
            int r10 = r10 + 1
            r23 = r13
            r8 = r18
            r6 = r27
            goto L4c8
        L555:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r7)
            int r6 = r14.size()
            r16 = 1
            int r6 = r6 + (-1)
        L565:
            if (r6 < 0) goto L575
            java.lang.Object r8 = r14.get(r6)
            com.google.android.material.carousel.b$b r8 = (com.google.android.material.carousel.b.C0029b) r8
            boolean r8 = r8.e
            if (r8 != 0) goto L572
            goto L576
        L572:
            int r6 = r6 + (-1)
            goto L565
        L575:
            r6 = -1
        L576:
            boolean r8 = r0.P0()
            if (r8 == 0) goto L581
            int r8 = r0.n
        L57e:
            float r8 = (float) r8
            r13 = r8
            goto L584
        L581:
            int r8 = r0.o
            goto L57e
        L584:
            int r8 = r0.o
            boolean r9 = r0.P0()
            if (r9 == 0) goto L58e
            int r8 = r0.n
        L58e:
            com.google.android.material.carousel.b$b r9 = r7.c()
            float r9 = r9.b
            com.google.android.material.carousel.b$b r10 = r7.c()
            float r10 = r10.d
            float r10 = r10 / r29
            float r10 = r10 + r9
            float r8 = (float) r8
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 > 0) goto L5c3
            com.google.android.material.carousel.b$b r8 = r7.c()
            int r9 = r14.size()
            r16 = 1
            int r9 = r9 + (-1)
        L5ae:
            if (r9 < 0) goto L5be
            java.lang.Object r10 = r14.get(r9)
            com.google.android.material.carousel.b$b r10 = (com.google.android.material.carousel.b.C0029b) r10
            boolean r11 = r10.e
            if (r11 != 0) goto L5bb
            goto L5c0
        L5bb:
            int r9 = r9 + (-1)
            goto L5ae
        L5be:
            r10 = r24
        L5c0:
            if (r8 != r10) goto L5c3
            goto L5c6
        L5c3:
            r8 = -1
            if (r6 != r8) goto L5d4
        L5c6:
            int r6 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r6 <= 0) goto L68f
            r6 = 0
            com.google.android.material.carousel.b r1 = com.google.android.material.carousel.c.f(r7, r3, r13, r6, r1)
            r2.add(r1)
            goto L68f
        L5d4:
            int r8 = r6 - r15
            com.google.android.material.carousel.b$b r9 = r7.b()
            float r9 = r9.b
            com.google.android.material.carousel.b$b r10 = r7.b()
            float r10 = r10.d
            float r10 = r10 / r29
            float r9 = r9 - r10
            if (r8 > 0) goto L608
            com.google.android.material.carousel.b$b r10 = r7.c()
            float r10 = r10.f
            int r10 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r10 <= 0) goto L608
            com.google.android.material.carousel.b$b r1 = r7.c()
            float r1 = r1.f
            float r10 = r9 - r1
            r8 = 0
            int r11 = r7.c
            r9 = 0
            int r12 = r7.d
            com.google.android.material.carousel.b r1 = com.google.android.material.carousel.c.e(r7, r8, r9, r10, r11, r12, r13)
            r2.add(r1)
            goto L68f
        L608:
            r23 = r13
            r11 = r25
            r10 = 0
        L60d:
            if (r10 >= r8) goto L68f
            int r12 = r2.size()
            r16 = 1
            int r12 = r12 + (-1)
            java.lang.Object r12 = r2.get(r12)
            com.google.android.material.carousel.b r12 = (com.google.android.material.carousel.b) r12
            int r13 = r6 - r10
            java.lang.Object r17 = r14.get(r13)
            r18 = r6
            r6 = r17
            com.google.android.material.carousel.b$b r6 = (com.google.android.material.carousel.b.C0029b) r6
            float r6 = r6.f
            float r11 = r11 + r6
            int r13 = r13 + 1
            int r6 = r14.size()
            if (r13 >= r6) goto L661
            java.lang.Object r6 = r14.get(r13)
            com.google.android.material.carousel.b$b r6 = (com.google.android.material.carousel.b.C0029b) r6
            float r6 = r6.c
            int r13 = r12.c
            int r13 = r13 + (-1)
        L640:
            if (r13 < 0) goto L65a
            r17 = r6
            java.util.List<com.google.android.material.carousel.b$b> r6 = r12.b
            java.lang.Object r6 = r6.get(r13)
            com.google.android.material.carousel.b$b r6 = (com.google.android.material.carousel.b.C0029b) r6
            float r6 = r6.c
            int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r6 != 0) goto L655
        L652:
            r16 = 1
            goto L65c
        L655:
            int r13 = r13 + (-1)
            r6 = r17
            goto L640
        L65a:
            r13 = 0
            goto L652
        L65c:
            int r6 = r13 + 1
            r19 = r6
            goto L663
        L661:
            r19 = 0
        L663:
            int r6 = r26 + r10
            int r21 = r6 + 1
            int r6 = r15 + r10
            int r22 = r6 + 1
            float r20 = r9 - r11
            r17 = r12
            com.google.android.material.carousel.b r6 = com.google.android.material.carousel.c.e(r17, r18, r19, r20, r21, r22, r23)
            r13 = r23
            int r12 = r8 + (-1)
            if (r10 != r12) goto L683
            int r12 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r12 <= 0) goto L683
            r12 = 0
            com.google.android.material.carousel.b r6 = com.google.android.material.carousel.c.f(r6, r3, r13, r12, r1)
            goto L684
        L683:
            r12 = 0
        L684:
            r2.add(r6)
            int r10 = r10 + 1
            r23 = r13
            r6 = r18
            goto L60d
        L68f:
            r4.<init>(r7, r5, r2)
            r0.u = r4
            return
    }

    public final void W0() {
            r1 = this;
            r0 = 0
            r1.u = r0
            r1.n0()
            return
    }

    public final int X0(int r12, androidx.recyclerview.widget.RecyclerView.r r13, androidx.recyclerview.widget.RecyclerView.w r14) {
            r11 = this;
            int r0 = r11.v()
            r1 = 0
            if (r0 == 0) goto La3
            if (r12 != 0) goto Lb
            goto La3
        Lb:
            com.google.android.material.carousel.c r0 = r11.u
            if (r0 != 0) goto L12
            r11.V0(r13)
        L12:
            int r0 = r11.p
            int r2 = r11.q
            int r3 = r11.r
            int r4 = r0 + r12
            if (r4 >= r2) goto L1f
            int r12 = r2 - r0
            goto L23
        L1f:
            if (r4 <= r3) goto L23
            int r12 = r3 - r0
        L23:
            int r0 = r0 + r12
            r11.p = r0
            com.google.android.material.carousel.c r0 = r11.u
            r11.a1(r0)
            com.google.android.material.carousel.b r0 = r11.v
            float r0 = r0.f1061a
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            android.view.View r2 = r11.u(r1)
            int r2 = androidx.recyclerview.widget.RecyclerView.l.H(r2)
            float r2 = r11.H0(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r4 = r11.Q0()
            if (r4 == 0) goto L52
            com.google.android.material.carousel.b r4 = r11.v
            com.google.android.material.carousel.b$b r4 = r4.c()
            float r4 = r4.b
            goto L5a
        L52:
            com.google.android.material.carousel.b r4 = r11.v
            com.google.android.material.carousel.b$b r4 = r4.a()
            float r4 = r4.b
        L5a:
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r6 = r1
        L5e:
            int r7 = r11.v()
            if (r6 >= r7) goto L9f
            android.view.View r7 = r11.u(r6)
            float r8 = r11.D0(r2, r0)
            com.google.android.material.carousel.b r9 = r11.v
            java.util.List<com.google.android.material.carousel.b$b> r9 = r9.b
            com.google.android.material.carousel.CarouselLayoutManager$c r9 = O0(r9, r8, r1)
            float r10 = r11.G0(r7, r8, r9)
            super.y(r7, r3)
            r11.Z0(r7, r8, r9)
            a.Q2 r8 = r11.y
            r8.l(r7, r3, r0, r10)
            float r8 = r4 - r10
            float r8 = java.lang.Math.abs(r8)
            int r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r9 >= 0) goto L94
            int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r7)
            r11.B = r5
            r5 = r8
        L94:
            com.google.android.material.carousel.b r7 = r11.v
            float r7 = r7.f1061a
            float r2 = r11.D0(r2, r7)
            int r6 = r6 + 1
            goto L5e
        L9f:
            r11.I0(r13, r14)
            return r12
        La3:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y(int r1, int r2) {
            r0 = this;
            r0.b1()
            return
    }

    public final void Y0(int r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L12
            if (r3 != r0) goto L6
            goto L12
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid orientation:"
            java.lang.String r3 = a.C0487z.e(r1, r3)
            r0.<init>(r3)
            throw r0
        L12:
            r1 = 0
            r2.c(r1)
            a.Q2 r1 = r2.y
            if (r1 == 0) goto L20
            int r1 = r1.f222a
            if (r3 == r1) goto L1f
            goto L20
        L1f:
            return
        L20:
            if (r3 == 0) goto L32
            if (r3 != r0) goto L2a
            a.O2 r3 = new a.O2
            r3.<init>(r2)
            goto L37
        L2a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid orientation"
            r3.<init>(r0)
            throw r3
        L32:
            a.P2 r3 = new a.P2
            r3.<init>(r2)
        L37:
            r2.y = r3
            r2.W0()
            return
    }

    public final void Z0(android.view.View r9, float r10, com.google.android.material.carousel.CarouselLayoutManager.c r11) {
            r8 = this;
            boolean r0 = r9 instanceof a.InterfaceC0408ua
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.carousel.b$b r0 = r11.f1060a
            float r1 = r0.c
            com.google.android.material.carousel.b$b r2 = r11.b
            float r3 = r2.c
            float r0 = r0.f1063a
            float r2 = r2.f1063a
            float r0 = a.C0434w0.b(r1, r3, r0, r2, r10)
            int r1 = r9.getHeight()
            float r1 = (float) r1
            int r2 = r9.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r2 / r3
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = a.C0434w0.b(r5, r4, r5, r6, r0)
            float r7 = r1 / r3
            float r0 = a.C0434w0.b(r5, r7, r5, r6, r0)
            a.Q2 r5 = r8.y
            android.graphics.RectF r0 = r5.c(r1, r2, r0, r4)
            float r10 = r8.G0(r9, r10, r11)
            float r11 = r0.height()
            float r11 = r11 / r3
            float r11 = r10 - r11
            float r1 = r0.height()
            float r1 = r1 / r3
            float r1 = r1 + r10
            float r2 = r0.width()
            float r2 = r2 / r3
            float r2 = r10 - r2
            float r4 = r0.width()
            float r4 = r4 / r3
            float r4 = r4 + r10
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r2, r11, r4, r1)
            android.graphics.RectF r11 = new android.graphics.RectF
            a.Q2 r1 = r8.y
            int r1 = r1.f()
            float r1 = (float) r1
            a.Q2 r2 = r8.y
            int r2 = r2.i()
            float r2 = (float) r2
            a.Q2 r3 = r8.y
            int r3 = r3.g()
            float r3 = (float) r3
            a.Q2 r4 = r8.y
            int r4 = r4.d()
            float r4 = (float) r4
            r11.<init>(r1, r2, r3, r4)
            a.yb r1 = r8.t
            r1.getClass()
            a.Q2 r1 = r8.y
            r1.a(r0, r10, r11)
            a.Q2 r1 = r8.y
            r1.k(r0, r10, r11)
            a.ua r9 = (a.InterfaceC0408ua) r9
            r9.a()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v.b
    public final android.graphics.PointF a(int r3) {
            r2 = this;
            com.google.android.material.carousel.c r0 = r2.u
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            com.google.android.material.carousel.b r0 = r2.L0(r3)
            int r3 = r2.M0(r3, r0)
            int r0 = r2.p
            int r3 = r3 - r0
            boolean r0 = r2.P0()
            r1 = 0
            if (r0 == 0) goto L1f
            android.graphics.PointF r0 = new android.graphics.PointF
            float r3 = (float) r3
            r0.<init>(r3, r1)
            return r0
        L1f:
            android.graphics.PointF r0 = new android.graphics.PointF
            float r3 = (float) r3
            r0.<init>(r1, r3)
            return r0
    }

    public final void a1(com.google.android.material.carousel.c r4) {
            r3 = this;
            int r0 = r3.r
            int r1 = r3.q
            if (r0 > r1) goto L18
            boolean r0 = r3.Q0()
            if (r0 == 0) goto L11
            com.google.android.material.carousel.b r4 = r4.a()
            goto L15
        L11:
            com.google.android.material.carousel.b r4 = r4.c()
        L15:
            r3.v = r4
            goto L23
        L18:
            int r2 = r3.p
            float r2 = (float) r2
            float r1 = (float) r1
            float r0 = (float) r0
            com.google.android.material.carousel.b r4 = r4.b(r2, r1, r0)
            r3.v = r4
        L23:
            com.google.android.material.carousel.b r4 = r3.v
            java.util.List<com.google.android.material.carousel.b$b> r4 = r4.b
            com.google.android.material.carousel.CarouselLayoutManager$b r0 = r3.s
            r0.getClass()
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            r0.b = r4
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void b0(int r1, int r2) {
            r0 = this;
            r0.b1()
            return
    }

    public final void b1() {
            r5 = this;
            int r0 = r5.B()
            int r1 = r5.A
            if (r0 == r1) goto L2c
            com.google.android.material.carousel.c r2 = r5.u
            if (r2 != 0) goto Ld
            goto L2c
        Ld:
            a.yb r2 = r5.t
            int r3 = r2.c
            if (r1 >= r3) goto L1b
            int r3 = r5.B()
            int r4 = r2.c
            if (r3 >= r4) goto L27
        L1b:
            int r3 = r2.c
            if (r1 < r3) goto L2a
            int r1 = r5.B()
            int r2 = r2.c
            if (r1 >= r2) goto L2a
        L27:
            r5.W0()
        L2a:
            r5.A = r0
        L2c:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean d() {
            r1 = this;
            boolean r0 = r1.P0()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d0(androidx.recyclerview.widget.RecyclerView.r r17, androidx.recyclerview.widget.RecyclerView.w r18) {
            r16 = this;
            r0 = r16
            int r1 = r18.b()
            r2 = 0
            if (r1 <= 0) goto L19c
            int r1 = r0.J0()
            float r1 = (float) r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L15
            goto L19c
        L15:
            boolean r1 = r0.Q0()
            com.google.android.material.carousel.c r3 = r0.u
            r4 = 1
            if (r3 != 0) goto L20
            r3 = r4
            goto L21
        L20:
            r3 = r2
        L21:
            if (r3 == 0) goto L26
            r16.V0(r17)
        L26:
            com.google.android.material.carousel.c r5 = r0.u
            boolean r6 = r0.Q0()
            if (r6 == 0) goto L33
            com.google.android.material.carousel.b r5 = r5.a()
            goto L37
        L33:
            com.google.android.material.carousel.b r5 = r5.c()
        L37:
            if (r6 == 0) goto L3e
            com.google.android.material.carousel.b$b r6 = r5.c()
            goto L42
        L3e:
            com.google.android.material.carousel.b$b r6 = r5.a()
        L42:
            float r6 = r6.f1063a
            float r5 = r5.f1061a
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r7
            boolean r7 = r0.Q0()
            if (r7 == 0) goto L51
            float r6 = r6 + r5
            goto L52
        L51:
            float r6 = r6 - r5
        L52:
            a.Q2 r5 = r0.y
            int r5 = r5.h()
            float r5 = (float) r5
            float r5 = r5 - r6
            int r5 = (int) r5
            com.google.android.material.carousel.c r6 = r0.u
            boolean r7 = r0.Q0()
            if (r7 == 0) goto L68
            com.google.android.material.carousel.b r6 = r6.c()
            goto L6c
        L68:
            com.google.android.material.carousel.b r6 = r6.a()
        L6c:
            if (r7 == 0) goto L73
            com.google.android.material.carousel.b$b r8 = r6.a()
            goto L77
        L73:
            com.google.android.material.carousel.b$b r8 = r6.c()
        L77:
            int r9 = r18.b()
            int r9 = r9 - r4
            float r9 = (float) r9
            float r6 = r6.f1061a
            float r9 = r9 * r6
            if (r7 == 0) goto L85
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L87
        L85:
            r6 = 1065353216(0x3f800000, float:1.0)
        L87:
            float r9 = r9 * r6
            if (r7 == 0) goto L8e
            float r6 = r8.g
            float r6 = -r6
            goto L90
        L8e:
            float r6 = r8.h
        L90:
            float r10 = r8.f1063a
            a.Q2 r11 = r0.y
            int r11 = r11.h()
            float r11 = (float) r11
            float r10 = r10 - r11
            a.Q2 r11 = r0.y
            int r11 = r11.e()
            float r11 = (float) r11
            float r8 = r8.f1063a
            float r11 = r11 - r8
            float r9 = r9 - r10
            float r9 = r9 + r11
            float r9 = r9 + r6
            int r6 = (int) r9
            if (r7 == 0) goto Laf
            int r6 = java.lang.Math.min(r2, r6)
            goto Lb3
        Laf:
            int r6 = java.lang.Math.max(r2, r6)
        Lb3:
            if (r1 == 0) goto Lb7
            r7 = r6
            goto Lb8
        Lb7:
            r7 = r5
        Lb8:
            r0.q = r7
            if (r1 == 0) goto Lbd
            r6 = r5
        Lbd:
            r0.r = r6
            if (r3 == 0) goto L16b
            r0.p = r5
            com.google.android.material.carousel.c r1 = r0.u
            int r3 = r0.B()
            int r5 = r0.q
            int r6 = r0.r
            boolean r7 = r0.Q0()
            com.google.android.material.carousel.b r8 = r1.f1064a
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r10 = r2
            r11 = r10
        Lda:
            r12 = -1
            float r13 = r8.f1061a
            if (r10 >= r3) goto L11b
            if (r7 == 0) goto Le5
            int r14 = r3 - r10
            int r14 = r14 - r4
            goto Le6
        Le5:
            r14 = r10
        Le6:
            float r15 = (float) r14
            float r15 = r15 * r13
            if (r7 == 0) goto Leb
            goto Lec
        Leb:
            r12 = r4
        Lec:
            float r12 = (float) r12
            float r15 = r15 * r12
            float r12 = (float) r6
            float r13 = r1.g
            float r12 = r12 - r13
            int r12 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            java.util.List<com.google.android.material.carousel.b> r13 = r1.c
            if (r12 > 0) goto L100
            int r12 = r13.size()
            int r12 = r3 - r12
            if (r10 < r12) goto L118
        L100:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            int r14 = r13.size()
            int r14 = r14 - r4
            int r14 = a.C0282n9.j(r11, r2, r14)
            java.lang.Object r13 = r13.get(r14)
            com.google.android.material.carousel.b r13 = (com.google.android.material.carousel.b) r13
            r9.put(r12, r13)
            int r11 = r11 + 1
        L118:
            int r10 = r10 + 1
            goto Lda
        L11b:
            int r6 = r3 + (-1)
            r8 = r2
        L11e:
            if (r6 < 0) goto L15b
            if (r7 == 0) goto L126
            int r10 = r3 - r6
            int r10 = r10 - r4
            goto L127
        L126:
            r10 = r6
        L127:
            float r11 = (float) r10
            float r11 = r11 * r13
            if (r7 == 0) goto L12d
            r14 = r12
            goto L12e
        L12d:
            r14 = r4
        L12e:
            float r14 = (float) r14
            float r11 = r11 * r14
            float r14 = (float) r5
            float r15 = r1.f
            float r14 = r14 + r15
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            java.util.List<com.google.android.material.carousel.b> r14 = r1.b
            if (r11 < 0) goto L140
            int r11 = r14.size()
            if (r6 >= r11) goto L158
        L140:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r11 = r14.size()
            int r11 = r11 - r4
            int r11 = a.C0282n9.j(r8, r2, r11)
            java.lang.Object r11 = r14.get(r11)
            com.google.android.material.carousel.b r11 = (com.google.android.material.carousel.b) r11
            r9.put(r10, r11)
            int r8 = r8 + 1
        L158:
            int r6 = r6 + (-1)
            goto L11e
        L15b:
            r0.x = r9
            int r1 = r0.B
            if (r1 == r12) goto L16b
            com.google.android.material.carousel.b r3 = r0.L0(r1)
            int r1 = r0.M0(r1, r3)
            r0.p = r1
        L16b:
            int r1 = r0.p
            int r3 = r0.q
            int r4 = r0.r
            if (r1 >= r3) goto L175
            int r3 = r3 - r1
            goto L17b
        L175:
            if (r1 <= r4) goto L17a
            int r3 = r4 - r1
            goto L17b
        L17a:
            r3 = r2
        L17b:
            int r3 = r3 + r1
            r0.p = r3
            int r1 = r0.w
            int r3 = r18.b()
            int r1 = a.C0282n9.j(r1, r2, r3)
            r0.w = r1
            com.google.android.material.carousel.c r1 = r0.u
            r0.a1(r1)
            r16.p(r17)
            r16.I0(r17, r18)
            int r1 = r0.B()
            r0.A = r1
            return
        L19c:
            r16.i0(r17)
            r0.w = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean e() {
            r1 = this;
            boolean r0 = r1.P0()
            r0 = r0 ^ 1
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e0(androidx.recyclerview.widget.RecyclerView.w r2) {
            r1 = this;
            int r2 = r1.v()
            r0 = 0
            if (r2 != 0) goto La
            r1.w = r0
            return
        La:
            android.view.View r2 = r1.u(r0)
            int r2 = androidx.recyclerview.widget.RecyclerView.l.H(r2)
            r1.w = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int j(androidx.recyclerview.widget.RecyclerView.w r3) {
            r2 = this;
            int r0 = r2.v()
            if (r0 == 0) goto L24
            com.google.android.material.carousel.c r0 = r2.u
            if (r0 == 0) goto L24
            int r0 = r2.B()
            r1 = 1
            if (r0 > r1) goto L12
            goto L24
        L12:
            com.google.android.material.carousel.c r0 = r2.u
            com.google.android.material.carousel.b r0 = r0.f1064a
            float r0 = r0.f1061a
            int r3 = r2.l(r3)
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r2.n
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int k(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.p
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int l(androidx.recyclerview.widget.RecyclerView.w r2) {
            r1 = this;
            int r2 = r1.r
            int r0 = r1.q
            int r2 = r2 - r0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int m(androidx.recyclerview.widget.RecyclerView.w r3) {
            r2 = this;
            int r0 = r2.v()
            if (r0 == 0) goto L24
            com.google.android.material.carousel.c r0 = r2.u
            if (r0 == 0) goto L24
            int r0 = r2.B()
            r1 = 1
            if (r0 > r1) goto L12
            goto L24
        L12:
            com.google.android.material.carousel.c r0 = r2.u
            com.google.android.material.carousel.b r0 = r0.f1064a
            float r0 = r0.f1061a
            int r3 = r2.o(r3)
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r2.o
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean m0(androidx.recyclerview.widget.RecyclerView r4, android.view.View r5, android.graphics.Rect r6, boolean r7, boolean r8) {
            r3 = this;
            com.google.android.material.carousel.c r6 = r3.u
            r7 = 0
            if (r6 != 0) goto L6
            goto L18
        L6:
            int r6 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            int r8 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            com.google.android.material.carousel.b r8 = r3.L0(r8)
            int r6 = r3.N0(r6, r8)
            if (r6 != 0) goto L19
        L18:
            return r7
        L19:
            int r8 = r3.p
            int r0 = r3.q
            int r1 = r3.r
            int r2 = r8 + r6
            if (r2 >= r0) goto L26
            int r6 = r0 - r8
            goto L2a
        L26:
            if (r2 <= r1) goto L2a
            int r6 = r1 - r8
        L2a:
            com.google.android.material.carousel.c r2 = r3.u
            int r8 = r8 + r6
            float r6 = (float) r8
            float r8 = (float) r0
            float r0 = (float) r1
            com.google.android.material.carousel.b r6 = r2.b(r6, r8, r0)
            int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            int r5 = r3.N0(r5, r6)
            boolean r6 = r3.P0()
            if (r6 == 0) goto L46
            r4.scrollBy(r5, r7)
            goto L49
        L46:
            r4.scrollBy(r7, r5)
        L49:
            r4 = 1
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int n(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.p
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o(androidx.recyclerview.widget.RecyclerView.w r2) {
            r1 = this;
            int r2 = r1.r
            int r0 = r1.q
            int r2 = r2 - r0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o0(int r2, androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4) {
            r1 = this;
            boolean r0 = r1.P0()
            if (r0 == 0) goto Lb
            int r2 = r1.X0(r2, r3, r4)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void p0(int r3) {
            r2 = this;
            r2.B = r3
            com.google.android.material.carousel.c r0 = r2.u
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.material.carousel.b r0 = r2.L0(r3)
            int r0 = r2.M0(r3, r0)
            r2.p = r0
            int r0 = r2.B()
            int r0 = r0 + (-1)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = a.C0282n9.j(r3, r1, r0)
            r2.w = r3
            com.google.android.material.carousel.c r3 = r2.u
            r2.a1(r3)
            r2.n0()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int q0(int r2, androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4) {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 == 0) goto Lb
            int r2 = r1.X0(r2, r3, r4)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final androidx.recyclerview.widget.RecyclerView.m r() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = new androidx.recyclerview.widget.RecyclerView$m
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void y(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            super.y(r5, r6)
            int r5 = r6.centerY()
            float r5 = (float) r5
            boolean r0 = r4.P0()
            if (r0 == 0) goto L13
            int r5 = r6.centerX()
            float r5 = (float) r5
        L13:
            com.google.android.material.carousel.b r0 = r4.v
            java.util.List<com.google.android.material.carousel.b$b> r0 = r0.b
            r1 = 1
            com.google.android.material.carousel.CarouselLayoutManager$c r0 = O0(r0, r5, r1)
            com.google.android.material.carousel.b$b r1 = r0.f1060a
            float r2 = r1.d
            com.google.android.material.carousel.b$b r0 = r0.b
            float r3 = r0.d
            float r1 = r1.b
            float r0 = r0.b
            float r5 = a.C0434w0.b(r2, r3, r1, r0, r5)
            boolean r0 = r4.P0()
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L3d
            int r0 = r6.width()
            float r0 = (float) r0
            float r0 = r0 - r5
            float r0 = r0 / r2
            goto L3e
        L3d:
            r0 = r1
        L3e:
            boolean r3 = r4.P0()
            if (r3 == 0) goto L45
            goto L4c
        L45:
            int r1 = r6.height()
            float r1 = (float) r1
            float r1 = r1 - r5
            float r1 = r1 / r2
        L4c:
            int r5 = r6.left
            float r5 = (float) r5
            float r5 = r5 + r0
            int r5 = (int) r5
            int r2 = r6.top
            float r2 = (float) r2
            float r2 = r2 + r1
            int r2 = (int) r2
            int r3 = r6.right
            float r3 = (float) r3
            float r3 = r3 - r0
            int r0 = (int) r3
            int r3 = r6.bottom
            float r3 = (float) r3
            float r3 = r3 - r1
            int r1 = (int) r3
            r6.set(r5, r2, r0, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void z0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            a.N2 r0 = new a.N2
            android.content.Context r2 = r2.getContext()
            r0.<init>(r1, r2)
            r0.f980a = r3
            r1.A0(r0)
            return
    }
}
