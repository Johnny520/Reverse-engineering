package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends defpackage.nz implements defpackage.xz {
    public final defpackage.uq A;
    public final defpackage.vq B;
    public final int C;
    public final int[] D;
    public int p;
    public defpackage.wq q;
    public defpackage.ai r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public defpackage.xq z;

    public LinearLayoutManager(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.p = r0
            r1 = 0
            r3.t = r1
            r3.u = r1
            r3.v = r1
            r3.w = r0
            r0 = -1
            r3.x = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.y = r0
            r0 = 0
            r3.z = r0
            uq r2 = new uq
            r2.<init>()
            r3.A = r2
            vq r2 = new vq
            r2.<init>()
            r3.B = r2
            r2 = 2
            r3.C = r2
            int[] r2 = new int[r2]
            r3.D = r2
            r3.X0(r4)
            r3.c(r0)
            boolean r4 = r3.t
            if (r4 != 0) goto L39
            return
        L39:
            r3.t = r1
            r3.j0()
            return
    }

    public LinearLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.p = r0
            r1 = 0
            r2.t = r1
            r2.u = r1
            r2.v = r1
            r2.w = r0
            r0 = -1
            r2.x = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.y = r0
            r0 = 0
            r2.z = r0
            uq r1 = new uq
            r1.<init>()
            r2.A = r1
            vq r1 = new vq
            r1.<init>()
            r2.B = r1
            r1 = 2
            r2.C = r1
            int[] r1 = new int[r1]
            r2.D = r1
            mz r3 = defpackage.nz.G(r3, r4, r5, r6)
            int r4 = r3.a
            r2.X0(r4)
            boolean r4 = r3.c
            r2.c(r0)
            boolean r5 = r2.t
            if (r4 != r5) goto L41
            goto L46
        L41:
            r2.t = r4
            r2.j0()
        L46:
            boolean r3 = r3.d
            r2.Y0(r3)
            return
    }

    public final int A0(defpackage.yz r7) {
            r6 = this;
            int r0 = r6.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.E0()
            ai r1 = r6.r
            boolean r0 = r6.w
            r0 = r0 ^ 1
            android.view.View r2 = r6.H0(r0)
            android.view.View r3 = r6.G0(r0)
            boolean r5 = r6.w
            r4 = r6
            r0 = r7
            int r7 = defpackage.zt.g(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public final int B0(defpackage.yz r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            r7.E0()
            ai r1 = r7.r
            boolean r0 = r7.w
            r0 = r0 ^ 1
            android.view.View r2 = r7.H0(r0)
            android.view.View r3 = r7.G0(r0)
            boolean r5 = r7.w
            boolean r6 = r7.u
            r4 = r7
            r0 = r8
            int r8 = defpackage.zt.h(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    public final int C0(defpackage.yz r7) {
            r6 = this;
            int r0 = r6.v()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.E0()
            ai r1 = r6.r
            boolean r0 = r6.w
            r0 = r0 ^ 1
            android.view.View r2 = r6.H0(r0)
            android.view.View r3 = r6.G0(r0)
            boolean r5 = r6.w
            r4 = r6
            r0 = r7
            int r7 = defpackage.zt.i(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public final int D0(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L3f
            r2 = 2
            if (r5 == r2) goto L32
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L2c
            r2 = 33
            if (r5 == r2) goto L26
            r0 = 66
            if (r5 == r0) goto L20
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L1a
            return r3
        L1a:
            int r5 = r4.p
            if (r5 != r1) goto L1f
            return r1
        L1f:
            return r3
        L20:
            int r5 = r4.p
            if (r5 != 0) goto L25
            return r1
        L25:
            return r3
        L26:
            int r5 = r4.p
            if (r5 != r1) goto L2b
            return r0
        L2b:
            return r3
        L2c:
            int r5 = r4.p
            if (r5 != 0) goto L31
            return r0
        L31:
            return r3
        L32:
            int r5 = r4.p
            if (r5 != r1) goto L37
            return r1
        L37:
            boolean r5 = r4.Q0()
            if (r5 == 0) goto L3e
            return r0
        L3e:
            return r1
        L3f:
            int r5 = r4.p
            if (r5 != r1) goto L44
            return r0
        L44:
            boolean r5 = r4.Q0()
            if (r5 == 0) goto L4b
            return r1
        L4b:
            return r0
    }

    public final void E0() {
            r2 = this;
            wq r0 = r2.q
            if (r0 != 0) goto L16
            wq r0 = new wq
            r0.<init>()
            r1 = 1
            r0.a = r1
            r1 = 0
            r0.h = r1
            r0.i = r1
            r1 = 0
            r0.k = r1
            r2.q = r0
        L16:
            return
    }

    public final int F0(defpackage.tz r8, defpackage.wq r9, defpackage.yz r10, boolean r11) {
            r7 = this;
            int r0 = r9.c
            int r1 = r9.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L10
            if (r0 >= 0) goto Ld
            int r1 = r1 + r0
            r9.g = r1
        Ld:
            r7.T0(r8, r9)
        L10:
            int r1 = r9.c
            int r3 = r9.h
            int r1 = r1 + r3
        L15:
            boolean r3 = r9.l
            if (r3 != 0) goto L1b
            if (r1 <= 0) goto L6b
        L1b:
            int r3 = r9.d
            if (r3 < 0) goto L6b
            int r4 = r10.b()
            if (r3 >= r4) goto L6b
            vq r3 = r7.B
            r4 = 0
            r3.a = r4
            r3.b = r4
            r3.c = r4
            r3.d = r4
            r7.R0(r8, r10, r9, r3)
            boolean r4 = r3.b
            if (r4 == 0) goto L38
            goto L6b
        L38:
            int r4 = r9.b
            int r5 = r3.a
            int r6 = r9.f
            int r6 = r6 * r5
            int r6 = r6 + r4
            r9.b = r6
            boolean r4 = r3.c
            if (r4 == 0) goto L4e
            java.util.List r4 = r9.k
            if (r4 != 0) goto L4e
            boolean r4 = r10.g
            if (r4 != 0) goto L54
        L4e:
            int r4 = r9.c
            int r4 = r4 - r5
            r9.c = r4
            int r1 = r1 - r5
        L54:
            int r4 = r9.g
            if (r4 == r2) goto L65
            int r4 = r4 + r5
            r9.g = r4
            int r5 = r9.c
            if (r5 >= 0) goto L62
            int r4 = r4 + r5
            r9.g = r4
        L62:
            r7.T0(r8, r9)
        L65:
            if (r11 == 0) goto L15
            boolean r3 = r3.d
            if (r3 == 0) goto L15
        L6b:
            int r8 = r9.c
            int r0 = r0 - r8
            return r0
    }

    public final android.view.View G0(boolean r3) {
            r2 = this;
            boolean r0 = r2.u
            if (r0 == 0) goto Le
            r0 = 0
            int r1 = r2.v()
            android.view.View r3 = r2.K0(r0, r1, r3)
            return r3
        Le:
            int r0 = r2.v()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r3 = r2.K0(r0, r1, r3)
            return r3
    }

    public final android.view.View H0(boolean r3) {
            r2 = this;
            boolean r0 = r2.u
            if (r0 == 0) goto L10
            int r0 = r2.v()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r3 = r2.K0(r0, r1, r3)
            return r3
        L10:
            r0 = 0
            int r1 = r2.v()
            android.view.View r3 = r2.K0(r0, r1, r3)
            return r3
    }

    public final int I0() {
            r3 = this;
            int r0 = r3.v()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = -1
            android.view.View r0 = r3.K0(r0, r2, r1)
            if (r0 != 0) goto Lf
            return r2
        Lf:
            int r0 = defpackage.nz.F(r0)
            return r0
    }

    @Override // defpackage.nz
    public final boolean J() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final android.view.View J0(int r4, int r5) {
            r3 = this;
            r3.E0()
            if (r5 <= r4) goto L6
            goto L8
        L6:
            if (r5 >= r4) goto L35
        L8:
            ai r0 = r3.r
            android.view.View r1 = r3.u(r4)
            int r0 = r0.e(r1)
            ai r1 = r3.r
            int r1 = r1.k()
            if (r0 >= r1) goto L1f
            r0 = 16644(0x4104, float:2.3323E-41)
            r1 = 16388(0x4004, float:2.2964E-41)
            goto L23
        L1f:
            r0 = 4161(0x1041, float:5.831E-42)
            r1 = 4097(0x1001, float:5.741E-42)
        L23:
            int r2 = r3.p
            if (r2 != 0) goto L2e
            d4 r2 = r3.c
            android.view.View r4 = r2.s(r4, r5, r0, r1)
            return r4
        L2e:
            d4 r2 = r3.d
            android.view.View r4 = r2.s(r4, r5, r0, r1)
            return r4
        L35:
            android.view.View r4 = r3.u(r4)
            return r4
    }

    public final android.view.View K0(int r3, int r4, boolean r5) {
            r2 = this;
            r2.E0()
            r0 = 320(0x140, float:4.48E-43)
            if (r5 == 0) goto La
            r5 = 24579(0x6003, float:3.4443E-41)
            goto Lb
        La:
            r5 = r0
        Lb:
            int r1 = r2.p
            if (r1 != 0) goto L16
            d4 r1 = r2.c
            android.view.View r3 = r1.s(r3, r4, r5, r0)
            return r3
        L16:
            d4 r1 = r2.d
            android.view.View r3 = r1.s(r3, r4, r5, r0)
            return r3
    }

    public android.view.View L0(defpackage.tz r6, defpackage.yz r7, int r8, int r9, int r10) {
            r5 = this;
            r5.E0()
            ai r6 = r5.r
            int r6 = r6.k()
            ai r7 = r5.r
            int r7 = r7.g()
            if (r9 <= r8) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = -1
        L14:
            r1 = 0
            r2 = r1
        L16:
            if (r8 == r9) goto L4d
            android.view.View r3 = r5.u(r8)
            int r4 = defpackage.nz.F(r3)
            if (r4 < 0) goto L4b
            if (r4 >= r10) goto L4b
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            oz r4 = (defpackage.oz) r4
            b00 r4 = r4.a
            boolean r4 = r4.h()
            if (r4 == 0) goto L36
            if (r2 != 0) goto L4b
            r2 = r3
            goto L4b
        L36:
            ai r4 = r5.r
            int r4 = r4.e(r3)
            if (r4 >= r7) goto L48
            ai r4 = r5.r
            int r4 = r4.b(r3)
            if (r4 >= r6) goto L47
            goto L48
        L47:
            return r3
        L48:
            if (r1 != 0) goto L4b
            r1 = r3
        L4b:
            int r8 = r8 + r0
            goto L16
        L4d:
            if (r1 == 0) goto L50
            return r1
        L50:
            return r2
    }

    public final int M0(int r2, defpackage.tz r3, defpackage.yz r4, boolean r5) {
            r1 = this;
            ai r0 = r1.r
            int r0 = r0.g()
            int r0 = r0 - r2
            if (r0 <= 0) goto L23
            int r0 = -r0
            int r3 = r1.W0(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            ai r4 = r1.r
            int r4 = r4.g()
            int r4 = r4 - r2
            if (r4 <= 0) goto L22
            ai r2 = r1.r
            r2.o(r4)
            int r4 = r4 + r3
            return r4
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    public final int N0(int r2, defpackage.tz r3, defpackage.yz r4, boolean r5) {
            r1 = this;
            ai r0 = r1.r
            int r0 = r0.k()
            int r0 = r2 - r0
            if (r0 <= 0) goto L23
            int r3 = r1.W0(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            ai r4 = r1.r
            int r4 = r4.k()
            int r2 = r2 - r4
            if (r2 <= 0) goto L22
            ai r4 = r1.r
            int r5 = -r2
            r4.o(r5)
            int r3 = r3 - r2
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    public final android.view.View O0() {
            r1 = this;
            boolean r0 = r1.u
            if (r0 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r0 = r1.v()
            int r0 = r0 + (-1)
        Lc:
            android.view.View r0 = r1.u(r0)
            return r0
    }

    @Override // defpackage.nz
    public final void P(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            return
    }

    public final android.view.View P0() {
            r1 = this;
            boolean r0 = r1.u
            if (r0 == 0) goto Lb
            int r0 = r1.v()
            int r0 = r0 + (-1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r0 = r1.u(r0)
            return r0
    }

    @Override // defpackage.nz
    public android.view.View Q(android.view.View r3, int r4, defpackage.tz r5, defpackage.yz r6) {
            r2 = this;
            r2.V0()
            int r3 = r2.v()
            if (r3 != 0) goto La
            goto L73
        La:
            int r3 = r2.D0(r4)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r4) goto L13
            goto L73
        L13:
            r2.E0()
            ai r0 = r2.r
            int r0 = r0.l()
            float r0 = (float) r0
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 0
            r2.Z0(r3, r0, r1, r6)
            wq r0 = r2.q
            r0.g = r4
            r0.a = r1
            r4 = 1
            r2.F0(r5, r0, r6, r4)
            r5 = -1
            if (r3 != r5) goto L4a
            boolean r6 = r2.u
            if (r6 == 0) goto L41
            int r6 = r2.v()
            int r6 = r6 - r4
            android.view.View r4 = r2.J0(r6, r5)
            goto L60
        L41:
            int r4 = r2.v()
            android.view.View r4 = r2.J0(r1, r4)
            goto L60
        L4a:
            boolean r6 = r2.u
            if (r6 == 0) goto L57
            int r4 = r2.v()
            android.view.View r4 = r2.J0(r1, r4)
            goto L60
        L57:
            int r6 = r2.v()
            int r6 = r6 - r4
            android.view.View r4 = r2.J0(r6, r5)
        L60:
            if (r3 != r5) goto L67
            android.view.View r3 = r2.P0()
            goto L6b
        L67:
            android.view.View r3 = r2.O0()
        L6b:
            boolean r5 = r3.hasFocusable()
            if (r5 == 0) goto L75
            if (r4 != 0) goto L74
        L73:
            r3 = 0
        L74:
            return r3
        L75:
            return r4
    }

    public final boolean Q0() {
            r2 = this;
            int r0 = r2.A()
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    @Override // defpackage.nz
    public final void R(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.R(r3)
            int r0 = r2.v()
            if (r0 <= 0) goto L24
            r0 = 0
            int r1 = r2.v()
            android.view.View r0 = r2.K0(r0, r1, r0)
            if (r0 != 0) goto L16
            r0 = -1
            goto L1a
        L16:
            int r0 = defpackage.nz.F(r0)
        L1a:
            r3.setFromIndex(r0)
            int r0 = r2.I0()
            r3.setToIndex(r0)
        L24:
            return
    }

    public void R0(defpackage.tz r11, defpackage.yz r12, defpackage.wq r13, defpackage.vq r14) {
            r10 = this;
            android.view.View r11 = r13.b(r11)
            r12 = 1
            if (r11 != 0) goto La
            r14.b = r12
            return
        La:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            java.util.List r1 = r13.k
            r2 = -1
            r3 = 0
            if (r1 != 0) goto L29
            boolean r1 = r10.u
            int r4 = r13.f
            if (r4 != r2) goto L1e
            r4 = r12
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r1 != r4) goto L25
            r10.b(r11, r2, r3)
            goto L3b
        L25:
            r10.b(r11, r3, r3)
            goto L3b
        L29:
            boolean r1 = r10.u
            int r4 = r13.f
            if (r4 != r2) goto L31
            r4 = r12
            goto L32
        L31:
            r4 = r3
        L32:
            if (r1 != r4) goto L38
            r10.b(r11, r2, r12)
            goto L3b
        L38:
            r10.b(r11, r3, r12)
        L3b:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            oz r1 = (defpackage.oz) r1
            androidx.recyclerview.widget.RecyclerView r3 = r10.b
            android.graphics.Rect r3 = r3.J(r11)
            int r4 = r3.left
            int r5 = r3.right
            int r4 = r4 + r5
            int r5 = r3.top
            int r3 = r3.bottom
            int r5 = r5 + r3
            int r3 = r10.n
            int r6 = r10.l
            int r7 = r10.C()
            int r8 = r10.D()
            int r8 = r8 + r7
            int r7 = r1.leftMargin
            int r8 = r8 + r7
            int r7 = r1.rightMargin
            int r8 = r8 + r7
            int r8 = r8 + r4
            int r4 = r1.width
            boolean r7 = r10.d()
            int r3 = defpackage.nz.w(r7, r3, r6, r8, r4)
            int r4 = r10.o
            int r6 = r10.m
            int r7 = r10.E()
            int r8 = r10.B()
            int r8 = r8 + r7
            int r7 = r1.topMargin
            int r8 = r8 + r7
            int r7 = r1.bottomMargin
            int r8 = r8 + r7
            int r8 = r8 + r5
            int r5 = r1.height
            boolean r7 = r10.e()
            int r4 = defpackage.nz.w(r7, r4, r6, r8, r5)
            boolean r1 = r10.s0(r11, r3, r4, r1)
            if (r1 == 0) goto L96
            r11.measure(r3, r4)
        L96:
            ai r1 = r10.r
            int r1 = r1.c(r11)
            r14.a = r1
            int r1 = r10.p
            if (r1 != r12) goto Ld4
            boolean r1 = r10.Q0()
            if (r1 == 0) goto Lb8
            int r1 = r10.n
            int r3 = r10.D()
            int r1 = r1 - r3
            ai r3 = r10.r
            int r3 = r3.d(r11)
            int r3 = r1 - r3
            goto Lc3
        Lb8:
            int r3 = r10.C()
            ai r1 = r10.r
            int r1 = r1.d(r11)
            int r1 = r1 + r3
        Lc3:
            int r4 = r13.f
            if (r4 != r2) goto Lce
            int r13 = r13.b
            int r2 = r14.a
            int r2 = r13 - r2
            goto Lfa
        Lce:
            int r2 = r13.b
            int r13 = r14.a
            int r13 = r13 + r2
            goto Lfa
        Ld4:
            int r1 = r10.E()
            ai r3 = r10.r
            int r3 = r3.d(r11)
            int r3 = r3 + r1
            int r4 = r13.f
            if (r4 != r2) goto Lef
            int r13 = r13.b
            int r2 = r14.a
            int r2 = r13 - r2
            r9 = r1
            r1 = r13
            r13 = r3
            r3 = r2
            r2 = r9
            goto Lfa
        Lef:
            int r13 = r13.b
            int r2 = r14.a
            int r2 = r2 + r13
            r9 = r3
            r3 = r13
            r13 = r9
            r9 = r2
            r2 = r1
            r1 = r9
        Lfa:
            defpackage.nz.L(r11, r3, r2, r1, r13)
            b00 r13 = r0.a
            boolean r13 = r13.h()
            if (r13 != 0) goto L10d
            b00 r13 = r0.a
            boolean r13 = r13.k()
            if (r13 == 0) goto L10f
        L10d:
            r14.c = r12
        L10f:
            boolean r11 = r11.hasFocusable()
            r14.d = r11
            return
    }

    public void S0(defpackage.tz r1, defpackage.yz r2, defpackage.uq r3, int r4) {
            r0 = this;
            return
    }

    public final void T0(defpackage.tz r6, defpackage.wq r7) {
            r5 = this;
            boolean r0 = r7.a
            if (r0 == 0) goto Lb3
            boolean r0 = r7.l
            if (r0 == 0) goto La
            goto Lb3
        La:
            int r0 = r7.g
            int r1 = r7.i
            int r7 = r7.f
            r2 = 0
            r3 = -1
            if (r7 != r3) goto L68
            int r7 = r5.v()
            if (r0 >= 0) goto L1c
            goto Lb3
        L1c:
            ai r3 = r5.r
            int r3 = r3.f()
            int r3 = r3 - r0
            int r3 = r3 + r1
            boolean r0 = r5.u
            if (r0 == 0) goto L47
            r0 = r2
        L29:
            if (r0 >= r7) goto Lb3
            android.view.View r1 = r5.u(r0)
            ai r4 = r5.r
            int r4 = r4.e(r1)
            if (r4 < r3) goto L43
            ai r4 = r5.r
            int r1 = r4.n(r1)
            if (r1 >= r3) goto L40
            goto L43
        L40:
            int r0 = r0 + 1
            goto L29
        L43:
            r5.U0(r6, r2, r0)
            return
        L47:
            int r7 = r7 + (-1)
            r0 = r7
        L4a:
            if (r0 < 0) goto Lb3
            android.view.View r1 = r5.u(r0)
            ai r2 = r5.r
            int r2 = r2.e(r1)
            if (r2 < r3) goto L64
            ai r2 = r5.r
            int r1 = r2.n(r1)
            if (r1 >= r3) goto L61
            goto L64
        L61:
            int r0 = r0 + (-1)
            goto L4a
        L64:
            r5.U0(r6, r7, r0)
            return
        L68:
            if (r0 >= 0) goto L6b
            goto Lb3
        L6b:
            int r0 = r0 - r1
            int r7 = r5.v()
            boolean r1 = r5.u
            if (r1 == 0) goto L95
            int r7 = r7 + (-1)
            r1 = r7
        L77:
            if (r1 < 0) goto Lb3
            android.view.View r2 = r5.u(r1)
            ai r3 = r5.r
            int r3 = r3.b(r2)
            if (r3 > r0) goto L91
            ai r3 = r5.r
            int r2 = r3.m(r2)
            if (r2 <= r0) goto L8e
            goto L91
        L8e:
            int r1 = r1 + (-1)
            goto L77
        L91:
            r5.U0(r6, r7, r1)
            return
        L95:
            r1 = r2
        L96:
            if (r1 >= r7) goto Lb3
            android.view.View r3 = r5.u(r1)
            ai r4 = r5.r
            int r4 = r4.b(r3)
            if (r4 > r0) goto Lb0
            ai r4 = r5.r
            int r3 = r4.m(r3)
            if (r3 <= r0) goto Lad
            goto Lb0
        Lad:
            int r1 = r1 + 1
            goto L96
        Lb0:
            r5.U0(r6, r2, r1)
        Lb3:
            return
    }

    public final void U0(defpackage.tz r2, int r3, int r4) {
            r1 = this;
            if (r3 != r4) goto L3
            goto L25
        L3:
            if (r4 <= r3) goto L16
            int r4 = r4 + (-1)
        L7:
            if (r4 < r3) goto L25
            android.view.View r0 = r1.u(r4)
            r1.h0(r4)
            r2.f(r0)
            int r4 = r4 + (-1)
            goto L7
        L16:
            if (r3 <= r4) goto L25
            android.view.View r0 = r1.u(r3)
            r1.h0(r3)
            r2.f(r0)
            int r3 = r3 + (-1)
            goto L16
        L25:
            return
    }

    public final void V0() {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.Q0()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.t
            r0 = r0 ^ r1
            r2.u = r0
            return
        L12:
            boolean r0 = r2.t
            r2.u = r0
            return
    }

    public final int W0(int r6, defpackage.tz r7, defpackage.yz r8) {
            r5 = this;
            int r0 = r5.v()
            r1 = 0
            if (r0 == 0) goto L39
            if (r6 != 0) goto La
            goto L39
        La:
            r5.E0()
            wq r0 = r5.q
            r2 = 1
            r0.a = r2
            if (r6 <= 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = -1
        L17:
            int r3 = java.lang.Math.abs(r6)
            r5.Z0(r0, r3, r2, r8)
            wq r2 = r5.q
            int r4 = r2.g
            int r7 = r5.F0(r7, r2, r8, r1)
            int r7 = r7 + r4
            if (r7 >= 0) goto L2a
            goto L39
        L2a:
            if (r3 <= r7) goto L2e
            int r6 = r0 * r7
        L2e:
            ai r7 = r5.r
            int r8 = -r6
            r7.o(r8)
            wq r7 = r5.q
            r7.j = r6
            return r6
        L39:
            return r1
    }

    public final void X0(int r4) {
            r3 = this;
            if (r4 == 0) goto L1a
            r0 = 1
            if (r4 != r0) goto L6
            goto L1a
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid orientation:"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L1a:
            r0 = 0
            r3.c(r0)
            int r0 = r3.p
            if (r4 != r0) goto L28
            ai r0 = r3.r
            if (r0 != 0) goto L27
            goto L28
        L27:
            return
        L28:
            ai r0 = defpackage.ai.a(r3, r4)
            r3.r = r0
            uq r1 = r3.A
            r1.a = r0
            r3.p = r4
            r3.j0()
            return
    }

    public void Y0(boolean r2) {
            r1 = this;
            r0 = 0
            r1.c(r0)
            boolean r0 = r1.v
            if (r0 != r2) goto L9
            return
        L9:
            r1.v = r2
            r1.j0()
            return
    }

    @Override // defpackage.nz
    public void Z(defpackage.tz r18, defpackage.yz r19) {
            r17 = this;
            r0 = r17
            r2 = r19
            xq r1 = r0.z
            r6 = -1
            if (r1 != 0) goto Ld
            int r1 = r0.x
            if (r1 == r6) goto L17
        Ld:
            int r1 = r2.b()
            if (r1 != 0) goto L17
            r17.e0(r18)
            return
        L17:
            xq r1 = r0.z
            if (r1 == 0) goto L21
            int r1 = r1.a
            if (r1 < 0) goto L21
            r0.x = r1
        L21:
            r0.E0()
            wq r1 = r0.q
            r7 = 0
            r1.a = r7
            r0.V0()
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            if (r1 != 0) goto L31
            goto L43
        L31:
            android.view.View r1 = r1.getFocusedChild()
            if (r1 == 0) goto L43
            r5 r3 = r0.a
            java.lang.Object r3 = r3.d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L44
        L43:
            r1 = 0
        L44:
            uq r9 = r0.A
            boolean r3 = r9.e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1
            if (r3 == 0) goto L81
            int r3 = r0.x
            if (r3 != r6) goto L81
            xq r3 = r0.z
            if (r3 == 0) goto L56
            goto L81
        L56:
            if (r1 == 0) goto L75
            ai r3 = r0.r
            int r3 = r3.e(r1)
            ai r4 = r0.r
            int r4 = r4.g()
            if (r3 >= r4) goto L79
            ai r3 = r0.r
            int r3 = r3.b(r1)
            ai r4 = r0.r
            int r4 = r4.k()
            if (r3 > r4) goto L75
            goto L79
        L75:
            r1 = r18
            goto L298
        L79:
            int r3 = defpackage.nz.F(r1)
            r9.c(r1, r3)
            goto L75
        L81:
            r9.d()
            boolean r1 = r0.u
            boolean r3 = r0.v
            r1 = r1 ^ r3
            r9.d = r1
            boolean r1 = r2.g
            if (r1 != 0) goto L18c
            int r1 = r0.x
            if (r1 != r6) goto L95
            goto L18c
        L95:
            if (r1 < 0) goto L188
            int r3 = r2.b()
            if (r1 < r3) goto L9f
            goto L188
        L9f:
            int r1 = r0.x
            r9.b = r1
            xq r3 = r0.z
            if (r3 == 0) goto Ld0
            int r4 = r3.a
            if (r4 < 0) goto Ld0
            boolean r1 = r3.c
            r9.d = r1
            if (r1 == 0) goto Lc2
            ai r1 = r0.r
            int r1 = r1.g()
            xq r3 = r0.z
            int r3 = r3.b
            int r1 = r1 - r3
            r9.c = r1
        Lbe:
            r1 = r18
            goto L296
        Lc2:
            ai r1 = r0.r
            int r1 = r1.k()
            xq r3 = r0.z
            int r3 = r3.b
            int r1 = r1 + r3
            r9.c = r1
            goto Lbe
        Ld0:
            int r3 = r0.y
            if (r3 != r10) goto L168
            android.view.View r1 = r0.q(r1)
            if (r1 == 0) goto L145
            ai r3 = r0.r
            int r3 = r3.c(r1)
            ai r4 = r0.r
            int r4 = r4.l()
            if (r3 <= r4) goto Lec
            r9.a()
            goto Lbe
        Lec:
            ai r3 = r0.r
            int r3 = r3.e(r1)
            ai r4 = r0.r
            int r4 = r4.k()
            int r3 = r3 - r4
            if (r3 >= 0) goto L106
            ai r1 = r0.r
            int r1 = r1.k()
            r9.c = r1
            r9.d = r7
            goto Lbe
        L106:
            ai r3 = r0.r
            int r3 = r3.g()
            ai r4 = r0.r
            int r4 = r4.b(r1)
            int r3 = r3 - r4
            if (r3 >= 0) goto L120
            ai r1 = r0.r
            int r1 = r1.g()
            r9.c = r1
            r9.d = r11
            goto Lbe
        L120:
            boolean r3 = r9.d
            if (r3 == 0) goto L13b
            ai r3 = r0.r
            int r1 = r3.b(r1)
            ai r3 = r0.r
            int r4 = r3.a
            if (r10 != r4) goto L132
            r4 = r7
            goto L139
        L132:
            int r4 = r3.l()
            int r3 = r3.a
            int r4 = r4 - r3
        L139:
            int r4 = r4 + r1
            goto L141
        L13b:
            ai r3 = r0.r
            int r4 = r3.e(r1)
        L141:
            r9.c = r4
            goto Lbe
        L145:
            int r1 = r0.v()
            if (r1 <= 0) goto L163
            android.view.View r1 = r0.u(r7)
            int r1 = defpackage.nz.F(r1)
            int r3 = r0.x
            if (r3 >= r1) goto L159
            r1 = r11
            goto L15a
        L159:
            r1 = r7
        L15a:
            boolean r3 = r0.u
            if (r1 != r3) goto L160
            r1 = r11
            goto L161
        L160:
            r1 = r7
        L161:
            r9.d = r1
        L163:
            r9.a()
            goto Lbe
        L168:
            boolean r1 = r0.u
            r9.d = r1
            if (r1 == 0) goto L17b
            ai r1 = r0.r
            int r1 = r1.g()
            int r3 = r0.y
            int r1 = r1 - r3
            r9.c = r1
            goto Lbe
        L17b:
            ai r1 = r0.r
            int r1 = r1.k()
            int r3 = r0.y
            int r1 = r1 + r3
            r9.c = r1
            goto Lbe
        L188:
            r0.x = r6
            r0.y = r10
        L18c:
            int r1 = r0.v()
            if (r1 != 0) goto L196
        L192:
            r1 = r18
            goto L286
        L196:
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            if (r1 != 0) goto L19b
            goto L1ad
        L19b:
            android.view.View r1 = r1.getFocusedChild()
            if (r1 == 0) goto L1ad
            r5 r3 = r0.a
            java.lang.Object r3 = r3.d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L1ae
        L1ad:
            r1 = 0
        L1ae:
            if (r1 == 0) goto L1db
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            b00 r4 = r3.a
            boolean r4 = r4.h()
            if (r4 != 0) goto L1db
            b00 r4 = r3.a
            int r4 = r4.b()
            if (r4 < 0) goto L1db
            b00 r3 = r3.a
            int r3 = r3.b()
            int r4 = r2.b()
            if (r3 >= r4) goto L1db
            int r3 = defpackage.nz.F(r1)
            r9.c(r1, r3)
            goto Lbe
        L1db:
            boolean r1 = r0.s
            boolean r3 = r0.v
            if (r1 == r3) goto L1e2
            goto L192
        L1e2:
            boolean r1 = r9.d
            if (r1 == 0) goto L216
            boolean r1 = r0.u
            if (r1 == 0) goto L1fc
            int r4 = r0.v()
            int r5 = r2.b()
            r3 = 0
            r1 = r18
            android.view.View r3 = r0.L0(r1, r2, r3, r4, r5)
            r0 = r17
            goto L211
        L1fc:
            int r0 = r17.v()
            int r3 = r0 + (-1)
            r4 = -1
            int r5 = r19.b()
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r3 = r0.L0(r1, r2, r3, r4, r5)
        L211:
            r1 = r18
            r2 = r19
            goto L243
        L216:
            boolean r1 = r0.u
            if (r1 == 0) goto L230
            int r1 = r0.v()
            int r3 = r1 + (-1)
            r4 = -1
            int r5 = r19.b()
            r1 = r18
            r2 = r19
            android.view.View r3 = r0.L0(r1, r2, r3, r4, r5)
            r0 = r17
            goto L243
        L230:
            int r4 = r17.v()
            int r5 = r19.b()
            r3 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r3 = r0.L0(r1, r2, r3, r4, r5)
        L243:
            if (r3 == 0) goto L286
            int r4 = defpackage.nz.F(r3)
            r9.b(r3, r4)
            boolean r4 = r2.g
            if (r4 != 0) goto L296
            boolean r4 = r0.x0()
            if (r4 == 0) goto L296
            ai r4 = r0.r
            int r4 = r4.e(r3)
            ai r5 = r0.r
            int r5 = r5.g()
            if (r4 >= r5) goto L272
            ai r4 = r0.r
            int r3 = r4.b(r3)
            ai r4 = r0.r
            int r4 = r4.k()
            if (r3 >= r4) goto L296
        L272:
            boolean r3 = r9.d
            if (r3 == 0) goto L27d
            ai r3 = r0.r
            int r3 = r3.g()
            goto L283
        L27d:
            ai r3 = r0.r
            int r3 = r3.k()
        L283:
            r9.c = r3
            goto L296
        L286:
            r9.a()
            boolean r3 = r0.v
            if (r3 == 0) goto L293
            int r3 = r2.b()
            int r3 = r3 - r11
            goto L294
        L293:
            r3 = r7
        L294:
            r9.b = r3
        L296:
            r9.e = r11
        L298:
            wq r3 = r0.q
            int r4 = r3.j
            if (r4 < 0) goto L2a0
            r4 = r11
            goto L2a1
        L2a0:
            r4 = r6
        L2a1:
            r3.f = r4
            int[] r3 = r0.D
            r3[r7] = r7
            r3[r11] = r7
            r0.y0(r2, r3)
            r4 = r3[r7]
            int r4 = java.lang.Math.max(r7, r4)
            ai r5 = r0.r
            int r5 = r5.k()
            int r5 = r5 + r4
            r3 = r3[r11]
            int r3 = java.lang.Math.max(r7, r3)
            ai r4 = r0.r
            int r4 = r4.h()
            int r4 = r4 + r3
            boolean r3 = r2.g
            if (r3 == 0) goto L302
            int r3 = r0.x
            if (r3 == r6) goto L302
            int r12 = r0.y
            if (r12 == r10) goto L302
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L302
            boolean r10 = r0.u
            if (r10 == 0) goto L2ed
            ai r10 = r0.r
            int r10 = r10.g()
            ai r12 = r0.r
            int r3 = r12.b(r3)
            int r10 = r10 - r3
            int r3 = r0.y
        L2eb:
            int r10 = r10 - r3
            goto L2fd
        L2ed:
            ai r10 = r0.r
            int r3 = r10.e(r3)
            ai r10 = r0.r
            int r10 = r10.k()
            int r3 = r3 - r10
            int r10 = r0.y
            goto L2eb
        L2fd:
            if (r10 <= 0) goto L301
            int r5 = r5 + r10
            goto L302
        L301:
            int r4 = r4 - r10
        L302:
            boolean r3 = r9.d
            if (r3 == 0) goto L30c
            boolean r3 = r0.u
            if (r3 == 0) goto L310
        L30a:
            r6 = r11
            goto L310
        L30c:
            boolean r3 = r0.u
            if (r3 == 0) goto L30a
        L310:
            r0.S0(r1, r2, r9, r6)
            r17.p(r18)
            wq r3 = r0.q
            ai r6 = r0.r
            int r6 = r6.i()
            if (r6 != 0) goto L32a
            ai r6 = r0.r
            int r6 = r6.f()
            if (r6 != 0) goto L32a
            r6 = r11
            goto L32b
        L32a:
            r6 = r7
        L32b:
            r3.l = r6
            wq r3 = r0.q
            r3.getClass()
            wq r3 = r0.q
            r3.i = r7
            boolean r3 = r9.d
            if (r3 == 0) goto L37f
            int r3 = r9.b
            int r6 = r9.c
            r0.b1(r3, r6)
            wq r3 = r0.q
            r3.h = r5
            r0.F0(r1, r3, r2, r7)
            wq r3 = r0.q
            int r5 = r3.b
            int r6 = r3.d
            int r3 = r3.c
            if (r3 <= 0) goto L353
            int r4 = r4 + r3
        L353:
            int r3 = r9.b
            int r10 = r9.c
            r0.a1(r3, r10)
            wq r3 = r0.q
            r3.h = r4
            int r4 = r3.d
            int r10 = r3.e
            int r4 = r4 + r10
            r3.d = r4
            r0.F0(r1, r3, r2, r7)
            wq r3 = r0.q
            int r4 = r3.b
            int r3 = r3.c
            if (r3 <= 0) goto L3c3
            r0.b1(r6, r5)
            wq r5 = r0.q
            r5.h = r3
            r0.F0(r1, r5, r2, r7)
            wq r3 = r0.q
            int r5 = r3.b
            goto L3c3
        L37f:
            int r3 = r9.b
            int r6 = r9.c
            r0.a1(r3, r6)
            wq r3 = r0.q
            r3.h = r4
            r0.F0(r1, r3, r2, r7)
            wq r3 = r0.q
            int r4 = r3.b
            int r6 = r3.d
            int r3 = r3.c
            if (r3 <= 0) goto L398
            int r5 = r5 + r3
        L398:
            int r3 = r9.b
            int r10 = r9.c
            r0.b1(r3, r10)
            wq r3 = r0.q
            r3.h = r5
            int r5 = r3.d
            int r10 = r3.e
            int r5 = r5 + r10
            r3.d = r5
            r0.F0(r1, r3, r2, r7)
            wq r3 = r0.q
            int r5 = r3.b
            int r3 = r3.c
            if (r3 <= 0) goto L3c3
            r0.a1(r6, r4)
            wq r4 = r0.q
            r4.h = r3
            r0.F0(r1, r4, r2, r7)
            wq r3 = r0.q
            int r4 = r3.b
        L3c3:
            int r3 = r0.v()
            if (r3 <= 0) goto L3e8
            boolean r3 = r0.u
            boolean r6 = r0.v
            r3 = r3 ^ r6
            if (r3 == 0) goto L3dd
            int r3 = r0.M0(r4, r1, r2, r11)
            int r5 = r5 + r3
            int r4 = r4 + r3
            int r3 = r0.N0(r5, r1, r2, r7)
        L3da:
            int r5 = r5 + r3
            int r4 = r4 + r3
            goto L3e8
        L3dd:
            int r3 = r0.N0(r5, r1, r2, r11)
            int r5 = r5 + r3
            int r4 = r4 + r3
            int r3 = r0.M0(r4, r1, r2, r7)
            goto L3da
        L3e8:
            boolean r3 = r2.k
            if (r3 == 0) goto L482
            int r3 = r0.v()
            if (r3 == 0) goto L482
            boolean r3 = r2.g
            if (r3 != 0) goto L482
            boolean r3 = r0.x0()
            if (r3 != 0) goto L3fe
            goto L482
        L3fe:
            java.util.List r3 = r1.d
            int r6 = r3.size()
            android.view.View r10 = r0.u(r7)
            int r10 = defpackage.nz.F(r10)
            r12 = r7
            r13 = r12
            r14 = r13
        L40f:
            if (r12 >= r6) goto L440
            java.lang.Object r15 = r3.get(r12)
            b00 r15 = (defpackage.b00) r15
            boolean r16 = r15.h()
            android.view.View r11 = r15.a
            if (r16 == 0) goto L420
            goto L43c
        L420:
            int r15 = r15.b()
            if (r15 >= r10) goto L428
            r15 = 1
            goto L429
        L428:
            r15 = r7
        L429:
            boolean r8 = r0.u
            if (r15 == r8) goto L435
            ai r8 = r0.r
            int r8 = r8.c(r11)
            int r13 = r13 + r8
            goto L43c
        L435:
            ai r8 = r0.r
            int r8 = r8.c(r11)
            int r14 = r14 + r8
        L43c:
            int r12 = r12 + 1
            r11 = 1
            goto L40f
        L440:
            wq r6 = r0.q
            r6.k = r3
            if (r13 <= 0) goto L460
            android.view.View r3 = r0.P0()
            int r3 = defpackage.nz.F(r3)
            r0.b1(r3, r5)
            wq r3 = r0.q
            r3.h = r13
            r3.c = r7
            r5 = 0
            r3.a(r5)
            wq r3 = r0.q
            r0.F0(r1, r3, r2, r7)
        L460:
            if (r14 <= 0) goto L47d
            android.view.View r3 = r0.O0()
            int r3 = defpackage.nz.F(r3)
            r0.a1(r3, r4)
            wq r3 = r0.q
            r3.h = r14
            r3.c = r7
            r5 = 0
            r3.a(r5)
            wq r3 = r0.q
            r0.F0(r1, r3, r2, r7)
            goto L47e
        L47d:
            r5 = 0
        L47e:
            wq r1 = r0.q
            r1.k = r5
        L482:
            boolean r1 = r2.g
            if (r1 != 0) goto L48f
            ai r1 = r0.r
            int r2 = r1.l()
            r1.a = r2
            goto L492
        L48f:
            r9.d()
        L492:
            boolean r1 = r0.v
            r0.s = r1
            return
    }

    public final void Z0(int r5, int r6, boolean r7, defpackage.yz r8) {
            r4 = this;
            wq r0 = r4.q
            ai r1 = r4.r
            int r1 = r1.i()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L16
            ai r1 = r4.r
            int r1 = r1.f()
            if (r1 != 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = r2
        L17:
            r0.l = r1
            wq r0 = r4.q
            r0.f = r5
            int[] r0 = r4.D
            r0[r2] = r2
            r0[r3] = r2
            r4.y0(r8, r0)
            r8 = r0[r2]
            int r8 = java.lang.Math.max(r2, r8)
            r0 = r0[r3]
            int r0 = java.lang.Math.max(r2, r0)
            if (r5 != r3) goto L35
            r2 = r3
        L35:
            wq r5 = r4.q
            if (r2 == 0) goto L3b
            r1 = r0
            goto L3c
        L3b:
            r1 = r8
        L3c:
            r5.h = r1
            if (r2 == 0) goto L41
            goto L42
        L41:
            r8 = r0
        L42:
            r5.i = r8
            r8 = -1
            if (r2 == 0) goto L7e
            ai r0 = r4.r
            int r0 = r0.h()
            int r0 = r0 + r1
            r5.h = r0
            android.view.View r5 = r4.O0()
            wq r0 = r4.q
            boolean r1 = r4.u
            if (r1 == 0) goto L5b
            r3 = r8
        L5b:
            r0.e = r3
            int r8 = defpackage.nz.F(r5)
            wq r1 = r4.q
            int r2 = r1.e
            int r8 = r8 + r2
            r0.d = r8
            ai r8 = r4.r
            int r8 = r8.b(r5)
            r1.b = r8
            ai r8 = r4.r
            int r5 = r8.b(r5)
            ai r8 = r4.r
            int r8 = r8.g()
            int r5 = r5 - r8
            goto Lba
        L7e:
            android.view.View r5 = r4.P0()
            wq r0 = r4.q
            int r1 = r0.h
            ai r2 = r4.r
            int r2 = r2.k()
            int r2 = r2 + r1
            r0.h = r2
            wq r0 = r4.q
            boolean r1 = r4.u
            if (r1 == 0) goto L96
            goto L97
        L96:
            r3 = r8
        L97:
            r0.e = r3
            int r8 = defpackage.nz.F(r5)
            wq r1 = r4.q
            int r2 = r1.e
            int r8 = r8 + r2
            r0.d = r8
            ai r8 = r4.r
            int r8 = r8.e(r5)
            r1.b = r8
            ai r8 = r4.r
            int r5 = r8.e(r5)
            int r5 = -r5
            ai r8 = r4.r
            int r8 = r8.k()
            int r5 = r5 + r8
        Lba:
            wq r8 = r4.q
            r8.c = r6
            if (r7 == 0) goto Lc3
            int r6 = r6 - r5
            r8.c = r6
        Lc3:
            r8.g = r5
            return
    }

    @Override // defpackage.xz
    public final android.graphics.PointF a(int r4) {
            r3 = this;
            int r0 = r3.v()
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            r0 = 0
            android.view.View r1 = r3.u(r0)
            int r1 = defpackage.nz.F(r1)
            r2 = 1
            if (r4 >= r1) goto L15
            r0 = r2
        L15:
            boolean r4 = r3.u
            if (r0 == r4) goto L1a
            r2 = -1
        L1a:
            int r4 = r3.p
            r0 = 0
            if (r4 != 0) goto L26
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r1, r0)
            return r4
        L26:
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r0, r1)
            return r4
    }

    @Override // defpackage.nz
    public void a0(defpackage.yz r1) {
            r0 = this;
            r1 = 0
            r0.z = r1
            r1 = -1
            r0.x = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.y = r1
            uq r1 = r0.A
            r1.d()
            return
    }

    public final void a1(int r4, int r5) {
            r3 = this;
            wq r0 = r3.q
            ai r1 = r3.r
            int r1 = r1.g()
            int r1 = r1 - r5
            r0.c = r1
            wq r0 = r3.q
            boolean r1 = r3.u
            r2 = 1
            if (r1 == 0) goto L14
            r1 = -1
            goto L15
        L14:
            r1 = r2
        L15:
            r0.e = r1
            r0.d = r4
            r0.f = r2
            r0.b = r5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.g = r4
            return
    }

    @Override // defpackage.nz
    public final void b0(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.xq
            if (r0 == 0) goto Lb
            xq r2 = (defpackage.xq) r2
            r1.z = r2
            r1.j0()
        Lb:
            return
    }

    public final void b1(int r3, int r4) {
            r2 = this;
            wq r0 = r2.q
            ai r1 = r2.r
            int r1 = r1.k()
            int r1 = r4 - r1
            r0.c = r1
            wq r0 = r2.q
            r0.d = r3
            boolean r3 = r2.u
            r1 = -1
            if (r3 == 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = r1
        L18:
            r0.e = r3
            r0.f = r1
            r0.b = r4
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.g = r3
            return
    }

    @Override // defpackage.nz
    public final void c(java.lang.String r2) {
            r1 = this;
            xq r0 = r1.z
            if (r0 != 0) goto L7
            super.c(r2)
        L7:
            return
    }

    @Override // defpackage.nz
    public final android.os.Parcelable c0() {
            r4 = this;
            xq r0 = r4.z
            if (r0 == 0) goto L16
            xq r1 = new xq
            r1.<init>()
            int r2 = r0.a
            r1.a = r2
            int r2 = r0.b
            r1.b = r2
            boolean r0 = r0.c
            r1.c = r0
            return r1
        L16:
            xq r0 = new xq
            r0.<init>()
            int r1 = r4.v()
            if (r1 <= 0) goto L61
            r4.E0()
            boolean r1 = r4.s
            boolean r2 = r4.u
            r1 = r1 ^ r2
            r0.c = r1
            if (r1 == 0) goto L47
            android.view.View r1 = r4.O0()
            ai r2 = r4.r
            int r2 = r2.g()
            ai r3 = r4.r
            int r3 = r3.b(r1)
            int r2 = r2 - r3
            r0.b = r2
            int r1 = defpackage.nz.F(r1)
            r0.a = r1
            return r0
        L47:
            android.view.View r1 = r4.P0()
            int r2 = defpackage.nz.F(r1)
            r0.a = r2
            ai r2 = r4.r
            int r1 = r2.e(r1)
            ai r2 = r4.r
            int r2 = r2.k()
            int r1 = r1 - r2
            r0.b = r1
            return r0
        L61:
            r1 = -1
            r0.a = r1
            return r0
    }

    @Override // defpackage.nz
    public final boolean d() {
            r1 = this;
            int r0 = r1.p
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.nz
    public final boolean e() {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.nz
    public final void h(int r2, int r3, defpackage.yz r4, defpackage.bn r5) {
            r1 = this;
            int r0 = r1.p
            if (r0 != 0) goto L5
            goto L6
        L5:
            r2 = r3
        L6:
            int r3 = r1.v()
            if (r3 == 0) goto L24
            if (r2 != 0) goto Lf
            goto L24
        Lf:
            r1.E0()
            r3 = 1
            if (r2 <= 0) goto L17
            r0 = r3
            goto L18
        L17:
            r0 = -1
        L18:
            int r2 = java.lang.Math.abs(r2)
            r1.Z0(r0, r2, r3, r4)
            wq r2 = r1.q
            r1.z0(r4, r2, r5)
        L24:
            return
    }

    @Override // defpackage.nz
    public final void i(int r6, defpackage.bn r7) {
            r5 = this;
            xq r0 = r5.z
            r1 = -1
            r2 = 0
            if (r0 == 0) goto Ld
            int r3 = r0.a
            if (r3 < 0) goto Ld
            boolean r0 = r0.c
            goto L1c
        Ld:
            r5.V0()
            boolean r0 = r5.u
            int r3 = r5.x
            if (r3 != r1) goto L1c
            if (r0 == 0) goto L1b
            int r3 = r6 + (-1)
            goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r1 = 1
        L20:
            r0 = r2
        L21:
            int r4 = r5.C
            if (r0 >= r4) goto L30
            if (r3 < 0) goto L30
            if (r3 >= r6) goto L30
            r7.a(r3, r2)
            int r3 = r3 + r1
            int r0 = r0 + 1
            goto L21
        L30:
            return
    }

    @Override // defpackage.nz
    public final int j(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.A0(r1)
            return r1
    }

    @Override // defpackage.nz
    public int k(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.B0(r1)
            return r1
    }

    @Override // defpackage.nz
    public int k0(int r3, defpackage.tz r4, defpackage.yz r5) {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            int r3 = r2.W0(r3, r4, r5)
            return r3
    }

    @Override // defpackage.nz
    public int l(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.C0(r1)
            return r1
    }

    @Override // defpackage.nz
    public final void l0(int r2) {
            r1 = this;
            r1.x = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.y = r2
            xq r2 = r1.z
            if (r2 == 0) goto Ld
            r0 = -1
            r2.a = r0
        Ld:
            r1.j0()
            return
    }

    @Override // defpackage.nz
    public final int m(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.A0(r1)
            return r1
    }

    @Override // defpackage.nz
    public int m0(int r2, defpackage.tz r3, defpackage.yz r4) {
            r1 = this;
            int r0 = r1.p
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r1.W0(r2, r3, r4)
            return r2
    }

    @Override // defpackage.nz
    public int n(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.B0(r1)
            return r1
    }

    @Override // defpackage.nz
    public int o(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.C0(r1)
            return r1
    }

    @Override // defpackage.nz
    public final android.view.View q(int r3) {
            r2 = this;
            int r0 = r2.v()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r1 = 0
            android.view.View r1 = r2.u(r1)
            int r1 = defpackage.nz.F(r1)
            int r1 = r3 - r1
            if (r1 < 0) goto L22
            if (r1 >= r0) goto L22
            android.view.View r0 = r2.u(r1)
            int r1 = defpackage.nz.F(r0)
            if (r1 != r3) goto L22
            return r0
        L22:
            android.view.View r3 = super.q(r3)
            return r3
    }

    @Override // defpackage.nz
    public defpackage.oz r() {
            r2 = this;
            oz r0 = new oz
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // defpackage.nz
    public final boolean t0() {
            r5 = this;
            int r0 = r5.m
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L27
            int r0 = r5.l
            if (r0 == r2) goto L27
            int r0 = r5.v()
            r2 = r1
        L10:
            if (r2 >= r0) goto L27
            android.view.View r3 = r5.u(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            int r4 = r3.width
            if (r4 >= 0) goto L24
            int r3 = r3.height
            if (r3 >= 0) goto L24
            r0 = 1
            return r0
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r1
    }

    @Override // defpackage.nz
    public void v0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            yq r0 = new yq
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.a = r3
            r1.w0(r0)
            return
    }

    @Override // defpackage.nz
    public boolean x0() {
            r2 = this;
            xq r0 = r2.z
            if (r0 != 0) goto Lc
            boolean r0 = r2.s
            boolean r1 = r2.v
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void y0(defpackage.yz r4, int[] r5) {
            r3 = this;
            int r4 = r4.a
            r0 = 0
            r1 = -1
            if (r4 == r1) goto Ld
            ai r4 = r3.r
            int r4 = r4.l()
            goto Le
        Ld:
            r4 = r0
        Le:
            wq r2 = r3.q
            int r2 = r2.f
            if (r2 != r1) goto L16
            r1 = r0
            goto L18
        L16:
            r1 = r4
            r4 = r0
        L18:
            r5[r0] = r4
            r4 = 1
            r5[r4] = r1
            return
    }

    public void z0(defpackage.yz r2, defpackage.wq r3, defpackage.bn r4) {
            r1 = this;
            int r0 = r3.d
            if (r0 < 0) goto L14
            int r2 = r2.b()
            if (r0 >= r2) goto L14
            r2 = 0
            int r3 = r3.g
            int r2 = java.lang.Math.max(r2, r3)
            r4.a(r0, r2)
        L14:
            return
    }
}
