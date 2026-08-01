package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends defpackage.nz implements defpackage.xz {
    public int A;
    public final defpackage.d4 B;
    public final int C;
    public boolean D;
    public boolean E;
    public defpackage.m40 F;
    public final android.graphics.Rect G;
    public final defpackage.j40 H;
    public final boolean I;
    public int[] J;
    public final defpackage.y6 K;
    public final int p;
    public final defpackage.n40[] q;
    public final defpackage.ai r;
    public final defpackage.ai s;
    public final int t;
    public int u;
    public final defpackage.dq v;
    public boolean w;
    public boolean x;
    public final java.util.BitSet y;
    public int z;

    public StaggeredGridLayoutManager(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
            r6 = this;
            r6.<init>()
            r0 = -1
            r6.p = r0
            r1 = 0
            r6.w = r1
            r6.x = r1
            r6.z = r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.A = r2
            d4 r2 = new d4
            r3 = 17
            r4 = 0
            r2.<init>(r3, r4)
            r6.B = r2
            r3 = 2
            r6.C = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r6.G = r3
            j40 r3 = new j40
            r3.<init>(r6)
            r6.H = r3
            r3 = 1
            r6.I = r3
            y6 r4 = new y6
            r5 = 9
            r4.<init>(r5, r6)
            r6.K = r4
            mz r7 = defpackage.nz.G(r7, r8, r9, r10)
            int r8 = r7.a
            if (r8 == 0) goto L4b
            if (r8 != r3) goto L43
            goto L4b
        L43:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "invalid orientation."
            r7.<init>(r8)
            throw r7
        L4b:
            r9 = 0
            r6.c(r9)
            int r10 = r6.t
            if (r8 != r10) goto L54
            goto L61
        L54:
            r6.t = r8
            ai r8 = r6.r
            ai r10 = r6.s
            r6.r = r10
            r6.s = r8
            r6.j0()
        L61:
            int r8 = r7.b
            r6.c(r9)
            int r10 = r6.p
            if (r8 == r10) goto L9d
            java.lang.Object r10 = r2.b
            int[] r10 = (int[]) r10
            if (r10 == 0) goto L73
            java.util.Arrays.fill(r10, r0)
        L73:
            r2.c = r9
            r6.j0()
            r6.p = r8
            java.util.BitSet r8 = new java.util.BitSet
            int r10 = r6.p
            r8.<init>(r10)
            r6.y = r8
            int r8 = r6.p
            n40[] r8 = new defpackage.n40[r8]
            r6.q = r8
            r8 = r1
        L8a:
            int r10 = r6.p
            if (r8 >= r10) goto L9a
            n40[] r10 = r6.q
            n40 r0 = new n40
            r0.<init>(r6, r8)
            r10[r8] = r0
            int r8 = r8 + 1
            goto L8a
        L9a:
            r6.j0()
        L9d:
            boolean r7 = r7.c
            r6.c(r9)
            m40 r8 = r6.F
            if (r8 == 0) goto Lac
            boolean r9 = r8.h
            if (r9 == r7) goto Lac
            r8.h = r7
        Lac:
            r6.w = r7
            r6.j0()
            dq r7 = new dq
            r7.<init>()
            r7.a = r3
            r7.f = r1
            r7.g = r1
            r6.v = r7
            int r7 = r6.t
            ai r7 = defpackage.ai.a(r6, r7)
            r6.r = r7
            int r7 = r6.t
            int r3 = r3 - r7
            ai r7 = defpackage.ai.a(r6, r3)
            r6.s = r7
            return
    }

    public static int Y0(int r2, int r3, int r4) {
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            goto L12
        L5:
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L13
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L12
            goto L13
        L12:
            return r2
        L13:
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = r2 - r3
            int r2 = r2 - r4
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            return r2
    }

    public final int A0(defpackage.tz r20, defpackage.dq r21, defpackage.yz r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.BitSet r3 = r0.y
            r4 = 0
            int r5 = r0.p
            r6 = 1
            r3.set(r4, r5, r6)
            dq r3 = r0.v
            boolean r5 = r3.i
            if (r5 == 0) goto L20
            int r5 = r2.e
            if (r5 != r6) goto L1d
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L2f
        L1d:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L2f
        L20:
            int r5 = r2.e
            if (r5 != r6) goto L2a
            int r5 = r2.g
            int r9 = r2.b
            int r5 = r5 + r9
            goto L2f
        L2a:
            int r5 = r2.f
            int r9 = r2.b
            int r5 = r5 - r9
        L2f:
            int r9 = r2.e
            r10 = r4
        L32:
            int r11 = r0.p
            if (r10 >= r11) goto L4d
            n40[] r11 = r0.q
            r11 = r11[r10]
            java.util.ArrayList r11 = r11.a
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L43
            goto L4a
        L43:
            n40[] r11 = r0.q
            r11 = r11[r10]
            r0.X0(r11, r9, r5)
        L4a:
            int r10 = r10 + 1
            goto L32
        L4d:
            boolean r9 = r0.x
            if (r9 == 0) goto L58
            ai r9 = r0.r
            int r9 = r9.g()
            goto L5e
        L58:
            ai r9 = r0.r
            int r9 = r9.k()
        L5e:
            r10 = r4
        L5f:
            int r11 = r2.c
            r12 = -1
            if (r11 < 0) goto L262
            int r13 = r22.b()
            if (r11 >= r13) goto L262
            boolean r11 = r3.i
            if (r11 != 0) goto L76
            java.util.BitSet r11 = r0.y
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L262
        L76:
            int r10 = r2.c
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            b00 r10 = r1.i(r10, r13)
            android.view.View r10 = r10.a
            int r11 = r2.c
            int r13 = r2.d
            int r11 = r11 + r13
            r2.c = r11
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            k40 r11 = (defpackage.k40) r11
            b00 r13 = r11.a
            int r13 = r13.b()
            d4 r14 = r0.B
            java.lang.Object r15 = r14.b
            int[] r15 = (int[]) r15
            if (r15 == 0) goto La5
            int r8 = r15.length
            if (r13 < r8) goto La2
            goto La5
        La2:
            r8 = r15[r13]
            goto La6
        La5:
            r8 = r12
        La6:
            if (r8 != r12) goto L109
            int r8 = r2.e
            boolean r8 = r0.O0(r8)
            if (r8 == 0) goto Lb7
            int r8 = r0.p
            int r8 = r8 - r6
            r15 = r12
            r16 = r15
            goto Lbd
        Lb7:
            int r8 = r0.p
            r16 = r6
            r15 = r8
            r8 = r4
        Lbd:
            int r7 = r2.e
            r17 = 0
            if (r7 != r6) goto Le3
            ai r7 = r0.r
            int r7 = r7.k()
            r4 = 2147483647(0x7fffffff, float:NaN)
        Lcc:
            if (r8 == r15) goto Le0
            n40[] r12 = r0.q
            r12 = r12[r8]
            int r6 = r12.f(r7)
            if (r6 >= r4) goto Ldb
            r4 = r6
            r17 = r12
        Ldb:
            int r8 = r8 + r16
            r6 = 1
            r12 = -1
            goto Lcc
        Le0:
            r4 = r17
            goto Lfd
        Le3:
            ai r4 = r0.r
            int r4 = r4.g()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        Leb:
            if (r8 == r15) goto Le0
            n40[] r7 = r0.q
            r7 = r7[r8]
            int r12 = r7.h(r4)
            if (r12 <= r6) goto Lfa
            r17 = r7
            r6 = r12
        Lfa:
            int r8 = r8 + r16
            goto Leb
        Lfd:
            r14.r(r13)
            java.lang.Object r6 = r14.b
            int[] r6 = (int[]) r6
            int r7 = r4.e
            r6[r13] = r7
            goto L10d
        L109:
            n40[] r4 = r0.q
            r4 = r4[r8]
        L10d:
            r11.e = r4
            int r6 = r2.e
            r7 = 1
            if (r6 != r7) goto L11a
            r6 = -1
            r8 = 0
            r0.b(r10, r6, r8)
            goto L11e
        L11a:
            r8 = 0
            r0.b(r10, r8, r8)
        L11e:
            int r6 = r0.t
            if (r6 != r7) goto L143
            int r6 = r0.u
            int r12 = r0.l
            int r13 = r11.width
            int r6 = defpackage.nz.w(r8, r6, r12, r8, r13)
            int r8 = r0.o
            int r12 = r0.m
            int r13 = r0.E()
            int r14 = r0.B()
            int r14 = r14 + r13
            int r13 = r11.height
            int r8 = defpackage.nz.w(r7, r8, r12, r14, r13)
            r0.M0(r10, r6, r8)
            goto L164
        L143:
            int r6 = r0.n
            int r8 = r0.l
            int r12 = r0.C()
            int r13 = r0.D()
            int r13 = r13 + r12
            int r12 = r11.width
            int r6 = defpackage.nz.w(r7, r6, r8, r13, r12)
            int r8 = r0.u
            int r12 = r0.m
            int r13 = r11.height
            r14 = 0
            int r8 = defpackage.nz.w(r14, r8, r12, r14, r13)
            r0.M0(r10, r6, r8)
        L164:
            int r6 = r2.e
            if (r6 != r7) goto L174
            int r6 = r4.f(r9)
            ai r7 = r0.r
            int r7 = r7.c(r10)
            int r7 = r7 + r6
            goto L180
        L174:
            int r7 = r4.h(r9)
            ai r6 = r0.r
            int r6 = r6.c(r10)
            int r6 = r7 - r6
        L180:
            int r8 = r2.e
            r12 = 1
            if (r8 != r12) goto L1c3
            n40 r8 = r11.e
            r8.getClass()
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            k40 r11 = (defpackage.k40) r11
            r11.e = r8
            java.util.ArrayList r13 = r8.a
            r13.add(r10)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.c = r14
            int r13 = r13.size()
            if (r13 != r12) goto L1a3
            r8.b = r14
        L1a3:
            b00 r12 = r11.a
            boolean r12 = r12.h()
            if (r12 != 0) goto L1b3
            b00 r11 = r11.a
            boolean r11 = r11.k()
            if (r11 == 0) goto L1c0
        L1b3:
            int r11 = r8.d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = r8.f
            ai r12 = r12.r
            int r12 = r12.c(r10)
            int r12 = r12 + r11
            r8.d = r12
        L1c0:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L200
        L1c3:
            n40 r8 = r11.e
            r8.getClass()
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            k40 r11 = (defpackage.k40) r11
            r11.e = r8
            java.util.ArrayList r12 = r8.a
            r14 = 0
            r12.add(r14, r10)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.b = r14
            int r12 = r12.size()
            r13 = 1
            if (r12 != r13) goto L1e3
            r8.c = r14
        L1e3:
            b00 r12 = r11.a
            boolean r12 = r12.h()
            if (r12 != 0) goto L1f3
            b00 r11 = r11.a
            boolean r11 = r11.k()
            if (r11 == 0) goto L200
        L1f3:
            int r11 = r8.d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = r8.f
            ai r12 = r12.r
            int r12 = r12.c(r10)
            int r12 = r12 + r11
            r8.d = r12
        L200:
            boolean r8 = r0.L0()
            if (r8 == 0) goto L224
            int r8 = r0.t
            r12 = 1
            if (r8 != r12) goto L224
            ai r8 = r0.s
            int r8 = r8.g()
            int r11 = r0.p
            int r11 = r11 - r12
            int r12 = r4.e
            int r11 = r11 - r12
            int r12 = r0.u
            int r11 = r11 * r12
            int r8 = r8 - r11
            ai r11 = r0.s
            int r11 = r11.c(r10)
            int r11 = r8 - r11
            goto L237
        L224:
            int r8 = r4.e
            int r11 = r0.u
            int r8 = r8 * r11
            ai r11 = r0.s
            int r11 = r11.k()
            int r11 = r11 + r8
            ai r8 = r0.s
            int r8 = r8.c(r10)
            int r8 = r8 + r11
        L237:
            int r12 = r0.t
            r13 = 1
            if (r12 != r13) goto L240
            defpackage.nz.L(r10, r11, r6, r8, r7)
            goto L243
        L240:
            defpackage.nz.L(r10, r6, r11, r7, r8)
        L243:
            int r6 = r3.e
            r0.X0(r4, r6, r5)
            r0.Q0(r1, r3)
            boolean r6 = r3.h
            if (r6 == 0) goto L25d
            boolean r6 = r10.hasFocusable()
            if (r6 == 0) goto L25d
            java.util.BitSet r6 = r0.y
            int r4 = r4.e
            r8 = 0
            r6.set(r4, r8)
        L25d:
            r6 = r13
            r10 = r6
            r4 = 0
            goto L5f
        L262:
            if (r10 != 0) goto L267
            r0.Q0(r1, r3)
        L267:
            int r1 = r3.e
            r6 = -1
            if (r1 != r6) goto L27e
            ai r1 = r0.r
            int r1 = r1.k()
            int r1 = r0.I0(r1)
            ai r3 = r0.r
            int r3 = r3.k()
            int r3 = r3 - r1
            goto L290
        L27e:
            ai r1 = r0.r
            int r1 = r1.g()
            int r1 = r0.H0(r1)
            ai r3 = r0.r
            int r3 = r3.g()
            int r3 = r1 - r3
        L290:
            if (r3 <= 0) goto L299
            int r1 = r2.b
            int r1 = java.lang.Math.min(r1, r3)
            return r1
        L299:
            r18 = 0
            return r18
    }

    public final android.view.View B0(boolean r8) {
            r7 = this;
            ai r0 = r7.r
            int r0 = r0.k()
            ai r1 = r7.r
            int r1 = r1.g()
            int r2 = r7.v()
            int r2 = r2 + (-1)
            r3 = 0
        L13:
            if (r2 < 0) goto L37
            android.view.View r4 = r7.u(r2)
            ai r5 = r7.r
            int r5 = r5.e(r4)
            ai r6 = r7.r
            int r6 = r6.b(r4)
            if (r6 <= r0) goto L34
            if (r5 < r1) goto L2a
            goto L34
        L2a:
            if (r6 <= r1) goto L33
            if (r8 != 0) goto L2f
            goto L33
        L2f:
            if (r3 != 0) goto L34
            r3 = r4
            goto L34
        L33:
            return r4
        L34:
            int r2 = r2 + (-1)
            goto L13
        L37:
            return r3
    }

    public final android.view.View C0(boolean r9) {
            r8 = this;
            ai r0 = r8.r
            int r0 = r0.k()
            ai r1 = r8.r
            int r1 = r1.g()
            int r2 = r8.v()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L36
            android.view.View r5 = r8.u(r4)
            ai r6 = r8.r
            int r6 = r6.e(r5)
            ai r7 = r8.r
            int r7 = r7.b(r5)
            if (r7 <= r0) goto L33
            if (r6 < r1) goto L29
            goto L33
        L29:
            if (r6 >= r0) goto L32
            if (r9 != 0) goto L2e
            goto L32
        L2e:
            if (r3 != 0) goto L33
            r3 = r5
            goto L33
        L32:
            return r5
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            return r3
    }

    public final void D0(defpackage.tz r3, defpackage.yz r4, boolean r5) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.H0(r0)
            if (r1 != r0) goto L9
            goto L22
        L9:
            ai r0 = r2.r
            int r0 = r0.g()
            int r0 = r0 - r1
            if (r0 <= 0) goto L22
            int r1 = -r0
            int r3 = r2.U0(r1, r3, r4)
            int r3 = -r3
            int r0 = r0 - r3
            if (r5 == 0) goto L22
            if (r0 <= 0) goto L22
            ai r3 = r2.r
            r3.o(r0)
        L22:
            return
    }

    public final void E0(defpackage.tz r3, defpackage.yz r4, boolean r5) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2.I0(r0)
            if (r1 != r0) goto La
            goto L22
        La:
            ai r0 = r2.r
            int r0 = r0.k()
            int r1 = r1 - r0
            if (r1 <= 0) goto L22
            int r3 = r2.U0(r1, r3, r4)
            int r1 = r1 - r3
            if (r5 == 0) goto L22
            if (r1 <= 0) goto L22
            ai r3 = r2.r
            int r4 = -r1
            r3.o(r4)
        L22:
            return
    }

    public final int F0() {
            r2 = this;
            int r0 = r2.v()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.u(r1)
            int r0 = defpackage.nz.F(r0)
            return r0
    }

    public final int G0() {
            r1 = this;
            int r0 = r1.v()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            android.view.View r0 = r1.u(r0)
            int r0 = defpackage.nz.F(r0)
            return r0
    }

    @Override // defpackage.nz
    public final int H(defpackage.tz r2, defpackage.yz r3) {
            r1 = this;
            int r0 = r1.t
            if (r0 != 0) goto L7
            int r2 = r1.p
            return r2
        L7:
            int r2 = super.H(r2, r3)
            return r2
    }

    public final int H0(int r4) {
            r3 = this;
            n40[] r0 = r3.q
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.f(r4)
            r1 = 1
        La:
            int r2 = r3.p
            if (r1 >= r2) goto L1c
            n40[] r2 = r3.q
            r2 = r2[r1]
            int r2 = r2.f(r4)
            if (r2 <= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    public final int I0(int r4) {
            r3 = this;
            n40[] r0 = r3.q
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.h(r4)
            r1 = 1
        La:
            int r2 = r3.p
            if (r1 >= r2) goto L1c
            n40[] r2 = r3.q
            r2 = r2[r1]
            int r2 = r2.h(r4)
            if (r2 >= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    @Override // defpackage.nz
    public final boolean J() {
            r1 = this;
            int r0 = r1.C
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void J0(int r10, int r11, int r12) {
            r9 = this;
            boolean r0 = r9.x
            if (r0 == 0) goto L9
            int r0 = r9.G0()
            goto Ld
        L9:
            int r0 = r9.F0()
        Ld:
            r1 = 8
            if (r12 != r1) goto L1b
            if (r10 >= r11) goto L17
            int r2 = r11 + 1
        L15:
            r3 = r10
            goto L1e
        L17:
            int r2 = r10 + 1
            r3 = r11
            goto L1e
        L1b:
            int r2 = r10 + r11
            goto L15
        L1e:
            d4 r4 = r9.B
            java.lang.Object r5 = r4.b
            int[] r5 = (int[]) r5
            if (r5 != 0) goto L28
            goto La9
        L28:
            int r5 = r5.length
            if (r3 < r5) goto L2d
            goto La9
        L2d:
            java.lang.Object r5 = r4.c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r6 = -1
            if (r5 != 0) goto L36
        L34:
            r5 = r6
            goto L90
        L36:
            if (r5 != 0) goto L39
            goto L53
        L39:
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L3f:
            if (r5 < 0) goto L53
            java.lang.Object r7 = r4.c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r5)
            l40 r7 = (defpackage.l40) r7
            int r8 = r7.a
            if (r8 != r3) goto L50
            goto L54
        L50:
            int r5 = r5 + (-1)
            goto L3f
        L53:
            r7 = 0
        L54:
            if (r7 == 0) goto L5d
            java.lang.Object r5 = r4.c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.remove(r7)
        L5d:
            java.lang.Object r5 = r4.c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r7 = 0
        L66:
            if (r7 >= r5) goto L7a
            java.lang.Object r8 = r4.c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r7)
            l40 r8 = (defpackage.l40) r8
            int r8 = r8.a
            if (r8 < r3) goto L77
            goto L7b
        L77:
            int r7 = r7 + 1
            goto L66
        L7a:
            r7 = r6
        L7b:
            if (r7 == r6) goto L34
            java.lang.Object r5 = r4.c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r7)
            l40 r5 = (defpackage.l40) r5
            java.lang.Object r8 = r4.c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.remove(r7)
            int r5 = r5.a
        L90:
            if (r5 != r6) goto La0
            java.lang.Object r5 = r4.b
            int[] r5 = (int[]) r5
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            java.lang.Object r5 = r4.b
            int[] r5 = (int[]) r5
            int r5 = r5.length
            goto La9
        La0:
            java.lang.Object r7 = r4.b
            int[] r7 = (int[]) r7
            int r5 = r5 + 1
            java.util.Arrays.fill(r7, r3, r5, r6)
        La9:
            r5 = 1
            if (r12 == r5) goto Lbd
            r6 = 2
            if (r12 == r6) goto Lb9
            if (r12 == r1) goto Lb2
            goto Lc0
        Lb2:
            r4.B(r10, r5)
            r4.A(r11, r5)
            goto Lc0
        Lb9:
            r4.B(r10, r11)
            goto Lc0
        Lbd:
            r4.A(r10, r11)
        Lc0:
            if (r2 > r0) goto Lc3
            goto Ld5
        Lc3:
            boolean r10 = r9.x
            if (r10 == 0) goto Lcc
            int r10 = r9.F0()
            goto Ld0
        Lcc:
            int r10 = r9.G0()
        Ld0:
            if (r3 > r10) goto Ld5
            r9.j0()
        Ld5:
            return
    }

    public final android.view.View K0() {
            r14 = this;
            int r0 = r14.v()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r14.p
            r2.<init>(r3)
            int r3 = r14.p
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r14.t
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r14.L0()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r14.x
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto Lfe
            android.view.View r7 = r14.u(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            k40 r8 = (defpackage.k40) r8
            n40 r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto Lb4
            n40 r9 = r8.e
            boolean r10 = r14.x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L73
            int r10 = r9.c
            if (r10 == r11) goto L4f
            goto L54
        L4f:
            r9.a()
            int r10 = r9.c
        L54:
            ai r11 = r14.r
            int r11 = r11.g()
            if (r10 >= r11) goto Lad
            java.util.ArrayList r0 = r9.a
            int r1 = r0.size()
            int r1 = r1 - r5
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            k40 r0 = (defpackage.k40) r0
            r0.getClass()
            return r7
        L73:
            int r10 = r9.b
            java.util.ArrayList r12 = r9.a
            if (r10 == r11) goto L7a
            goto L95
        L7a:
            java.lang.Object r10 = r12.get(r4)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            k40 r11 = (defpackage.k40) r11
            androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = r9.f
            ai r13 = r13.r
            int r10 = r13.e(r10)
            r9.b = r10
            r11.getClass()
            int r10 = r9.b
        L95:
            ai r9 = r14.r
            int r9 = r9.k()
            if (r10 <= r9) goto Lad
            java.lang.Object r0 = r12.get(r4)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            k40 r0 = (defpackage.k40) r0
            r0.getClass()
            return r7
        Lad:
            n40 r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        Lb4:
            int r1 = r1 + r6
            if (r1 == r0) goto L2c
            android.view.View r9 = r14.u(r1)
            boolean r10 = r14.x
            if (r10 == 0) goto Ld1
            ai r10 = r14.r
            int r10 = r10.b(r7)
            ai r11 = r14.r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto Lce
            goto Lfd
        Lce:
            if (r10 != r11) goto L2c
            goto Le2
        Ld1:
            ai r10 = r14.r
            int r10 = r10.e(r7)
            ai r11 = r14.r
            int r11 = r11.e(r9)
            if (r10 <= r11) goto Le0
            goto Lfd
        Le0:
            if (r10 != r11) goto L2c
        Le2:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            k40 r9 = (defpackage.k40) r9
            n40 r8 = r8.e
            int r8 = r8.e
            n40 r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto Lf5
            r8 = r5
            goto Lf6
        Lf5:
            r8 = r4
        Lf6:
            if (r3 >= 0) goto Lfa
            r9 = r5
            goto Lfb
        Lfa:
            r9 = r4
        Lfb:
            if (r8 == r9) goto L2c
        Lfd:
            return r7
        Lfe:
            r0 = 0
            return r0
    }

    public final boolean L0() {
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
    public final void M(int r5) {
            r4 = this;
            super.M(r5)
            r0 = 0
        L4:
            int r1 = r4.p
            if (r0 >= r1) goto L1f
            n40[] r1 = r4.q
            r1 = r1[r0]
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.b = r2
        L15:
            int r2 = r1.c
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.c = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    public final void M0(android.view.View r6, int r7, int r8) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            android.graphics.Rect r1 = r5.G
            if (r0 != 0) goto Lb
            r0 = 0
            r1.set(r0, r0, r0, r0)
            goto L12
        Lb:
            android.graphics.Rect r0 = r0.J(r6)
            r1.set(r0)
        L12:
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            k40 r0 = (defpackage.k40) r0
            int r2 = r0.leftMargin
            int r3 = r1.left
            int r2 = r2 + r3
            int r3 = r0.rightMargin
            int r4 = r1.right
            int r3 = r3 + r4
            int r7 = Y0(r7, r2, r3)
            int r2 = r0.topMargin
            int r3 = r1.top
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r1 = r1.bottom
            int r3 = r3 + r1
            int r8 = Y0(r8, r2, r3)
            boolean r0 = r5.s0(r6, r7, r8, r0)
            if (r0 == 0) goto L3d
            r6.measure(r7, r8)
        L3d:
            return
    }

    @Override // defpackage.nz
    public final void N(int r5) {
            r4 = this;
            super.N(r5)
            r0 = 0
        L4:
            int r1 = r4.p
            if (r0 >= r1) goto L1f
            n40[] r1 = r4.q
            r1 = r1[r0]
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.b = r2
        L15:
            int r2 = r1.c
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.c = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    public final void N0(defpackage.tz r17, defpackage.yz r18, boolean r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            m40 r3 = r0.F
            r4 = -1
            j40 r5 = r0.H
            if (r3 != 0) goto L11
            int r3 = r0.z
            if (r3 == r4) goto L1e
        L11:
            int r3 = r2.b()
            if (r3 != 0) goto L1e
            r16.e0(r17)
            r5.a()
            return
        L1e:
            boolean r3 = r5.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r5.g
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L31
            int r3 = r0.z
            if (r3 != r4) goto L31
            m40 r3 = r0.F
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = r7
            goto L32
        L31:
            r3 = r8
        L32:
            r9 = 0
            d4 r10 = r0.B
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L220
            r5.a()
            m40 r12 = r0.F
            if (r12 == 0) goto Lc3
            int r13 = r12.c
            if (r13 <= 0) goto L88
            int r14 = r0.p
            if (r13 != r14) goto L7a
            r12 = r7
        L49:
            int r13 = r0.p
            if (r12 >= r13) goto L88
            n40[] r13 = r0.q
            r13 = r13[r12]
            r13.b()
            m40 r13 = r0.F
            int[] r14 = r13.d
            r14 = r14[r12]
            if (r14 == r11) goto L6f
            boolean r13 = r13.i
            if (r13 == 0) goto L68
            ai r13 = r0.r
            int r13 = r13.g()
        L66:
            int r14 = r14 + r13
            goto L6f
        L68:
            ai r13 = r0.r
            int r13 = r13.k()
            goto L66
        L6f:
            n40[] r13 = r0.q
            r13 = r13[r12]
            r13.b = r14
            r13.c = r14
            int r12 = r12 + 1
            goto L49
        L7a:
            r12.d = r9
            r12.c = r7
            r12.e = r7
            r12.f = r9
            r12.g = r9
            int r13 = r12.b
            r12.a = r13
        L88:
            m40 r12 = r0.F
            boolean r13 = r12.j
            r0.E = r13
            boolean r12 = r12.h
            r0.c(r9)
            m40 r13 = r0.F
            if (r13 == 0) goto L9d
            boolean r14 = r13.h
            if (r14 == r12) goto L9d
            r13.h = r12
        L9d:
            r0.w = r12
            r0.j0()
            r0.T0()
            m40 r12 = r0.F
            int r13 = r12.a
            if (r13 == r4) goto Lb2
            r0.z = r13
            boolean r13 = r12.i
            r5.c = r13
            goto Lb6
        Lb2:
            boolean r13 = r0.x
            r5.c = r13
        Lb6:
            int r13 = r12.e
            if (r13 <= r8) goto Lca
            int[] r13 = r12.f
            r10.b = r13
            java.util.ArrayList r12 = r12.g
            r10.c = r12
            goto Lca
        Lc3:
            r0.T0()
            boolean r12 = r0.x
            r5.c = r12
        Lca:
            boolean r12 = r2.g
            if (r12 != 0) goto L1dd
            int r12 = r0.z
            if (r12 != r4) goto Ld4
            goto L1dd
        Ld4:
            if (r12 < 0) goto L1d9
            int r13 = r2.b()
            if (r12 < r13) goto Lde
            goto L1d9
        Lde:
            m40 r12 = r0.F
            if (r12 == 0) goto Lf3
            int r13 = r12.a
            if (r13 == r4) goto Lf3
            int r12 = r12.c
            if (r12 >= r8) goto Leb
            goto Lf3
        Leb:
            r5.b = r11
            int r12 = r0.z
            r5.a = r12
            goto L21e
        Lf3:
            int r12 = r0.z
            android.view.View r12 = r0.q(r12)
            if (r12 == 0) goto L188
            boolean r13 = r0.x
            if (r13 == 0) goto L104
            int r13 = r0.G0()
            goto L108
        L104:
            int r13 = r0.F0()
        L108:
            r5.a = r13
            int r13 = r0.A
            if (r13 == r11) goto L13a
            boolean r13 = r5.c
            if (r13 == 0) goto L126
            ai r13 = r0.r
            int r13 = r13.g()
            int r14 = r0.A
            int r13 = r13 - r14
            ai r14 = r0.r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            r5.b = r13
            goto L21e
        L126:
            ai r13 = r0.r
            int r13 = r13.k()
            int r14 = r0.A
            int r13 = r13 + r14
            ai r14 = r0.r
            int r12 = r14.e(r12)
            int r13 = r13 - r12
            r5.b = r13
            goto L21e
        L13a:
            ai r13 = r0.r
            int r13 = r13.c(r12)
            ai r14 = r0.r
            int r14 = r14.l()
            if (r13 <= r14) goto L15d
            boolean r12 = r5.c
            if (r12 == 0) goto L153
            ai r12 = r0.r
            int r12 = r12.g()
            goto L159
        L153:
            ai r12 = r0.r
            int r12 = r12.k()
        L159:
            r5.b = r12
            goto L21e
        L15d:
            ai r13 = r0.r
            int r13 = r13.e(r12)
            ai r14 = r0.r
            int r14 = r14.k()
            int r13 = r13 - r14
            if (r13 >= 0) goto L171
            int r12 = -r13
            r5.b = r12
            goto L21e
        L171:
            ai r13 = r0.r
            int r13 = r13.g()
            ai r14 = r0.r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            if (r13 >= 0) goto L184
            r5.b = r13
            goto L21e
        L184:
            r5.b = r11
            goto L21e
        L188:
            int r12 = r0.z
            r5.a = r12
            int r13 = r0.A
            if (r13 != r11) goto L1bf
            int r13 = r0.v()
            if (r13 != 0) goto L19b
            boolean r12 = r0.x
            if (r12 == 0) goto L1a8
            goto L1aa
        L19b:
            int r13 = r0.F0()
            if (r12 >= r13) goto L1a3
            r12 = r8
            goto L1a4
        L1a3:
            r12 = r7
        L1a4:
            boolean r13 = r0.x
            if (r12 == r13) goto L1aa
        L1a8:
            r12 = r7
            goto L1ab
        L1aa:
            r12 = r8
        L1ab:
            r5.c = r12
            if (r12 == 0) goto L1b6
            ai r12 = r6.r
            int r12 = r12.g()
            goto L1bc
        L1b6:
            ai r12 = r6.r
            int r12 = r12.k()
        L1bc:
            r5.b = r12
            goto L1d6
        L1bf:
            boolean r12 = r5.c
            if (r12 == 0) goto L1cd
            ai r12 = r6.r
            int r12 = r12.g()
            int r12 = r12 - r13
            r5.b = r12
            goto L1d6
        L1cd:
            ai r12 = r6.r
            int r12 = r12.k()
            int r12 = r12 + r13
            r5.b = r12
        L1d6:
            r5.d = r8
            goto L21e
        L1d9:
            r0.z = r4
            r0.A = r11
        L1dd:
            boolean r12 = r0.D
            if (r12 == 0) goto L1fe
            int r12 = r2.b()
            int r13 = r0.v()
            int r13 = r13 - r8
        L1ea:
            if (r13 < 0) goto L1fc
            android.view.View r14 = r0.u(r13)
            int r14 = defpackage.nz.F(r14)
            if (r14 < 0) goto L1f9
            if (r14 >= r12) goto L1f9
            goto L21a
        L1f9:
            int r13 = r13 + (-1)
            goto L1ea
        L1fc:
            r14 = r7
            goto L21a
        L1fe:
            int r12 = r2.b()
            int r13 = r0.v()
            r14 = r7
        L207:
            if (r14 >= r13) goto L1fc
            android.view.View r15 = r0.u(r14)
            int r15 = defpackage.nz.F(r15)
            if (r15 < 0) goto L217
            if (r15 >= r12) goto L217
            r14 = r15
            goto L21a
        L217:
            int r14 = r14 + 1
            goto L207
        L21a:
            r5.a = r14
            r5.b = r11
        L21e:
            r5.e = r8
        L220:
            m40 r12 = r0.F
            if (r12 != 0) goto L243
            int r12 = r0.z
            if (r12 != r4) goto L243
            boolean r12 = r5.c
            boolean r13 = r0.D
            if (r12 != r13) goto L236
            boolean r12 = r0.L0()
            boolean r13 = r0.E
            if (r12 == r13) goto L243
        L236:
            java.lang.Object r12 = r10.b
            int[] r12 = (int[]) r12
            if (r12 == 0) goto L23f
            java.util.Arrays.fill(r12, r4)
        L23f:
            r10.c = r9
            r5.d = r8
        L243:
            int r9 = r0.v()
            if (r9 <= 0) goto L2ee
            m40 r9 = r0.F
            if (r9 == 0) goto L251
            int r9 = r9.c
            if (r9 >= r8) goto L2ee
        L251:
            boolean r9 = r5.d
            if (r9 == 0) goto L270
            r3 = r7
        L256:
            int r6 = r0.p
            if (r3 >= r6) goto L2ee
            n40[] r6 = r0.q
            r6 = r6[r3]
            r6.b()
            int r6 = r5.b
            if (r6 == r11) goto L26d
            n40[] r9 = r0.q
            r9 = r9[r3]
            r9.b = r6
            r9.c = r6
        L26d:
            int r3 = r3 + 1
            goto L256
        L270:
            if (r3 != 0) goto L28e
            int[] r3 = r5.f
            if (r3 != 0) goto L277
            goto L28e
        L277:
            r3 = r7
        L278:
            int r6 = r0.p
            if (r3 >= r6) goto L2ee
            n40[] r6 = r0.q
            r6 = r6[r3]
            r6.b()
            int[] r9 = r5.f
            r9 = r9[r3]
            r6.b = r9
            r6.c = r9
            int r3 = r3 + 1
            goto L278
        L28e:
            r3 = r7
        L28f:
            int r9 = r0.p
            if (r3 >= r9) goto L2cd
            n40[] r9 = r0.q
            r9 = r9[r3]
            boolean r10 = r0.x
            int r12 = r5.b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = r9.f
            if (r10 == 0) goto L2a4
            int r14 = r9.f(r11)
            goto L2a8
        L2a4:
            int r14 = r9.h(r11)
        L2a8:
            r9.b()
            if (r14 != r11) goto L2ae
            goto L2ca
        L2ae:
            if (r10 == 0) goto L2b8
            ai r15 = r13.r
            int r15 = r15.g()
            if (r14 < r15) goto L2ca
        L2b8:
            if (r10 != 0) goto L2c3
            ai r10 = r13.r
            int r10 = r10.k()
            if (r14 <= r10) goto L2c3
            goto L2ca
        L2c3:
            if (r12 == r11) goto L2c6
            int r14 = r14 + r12
        L2c6:
            r9.c = r14
            r9.b = r14
        L2ca:
            int r3 = r3 + 1
            goto L28f
        L2cd:
            n40[] r3 = r0.q
            int r9 = r3.length
            int[] r10 = r5.f
            if (r10 == 0) goto L2d7
            int r10 = r10.length
            if (r10 >= r9) goto L2de
        L2d7:
            n40[] r6 = r6.q
            int r6 = r6.length
            int[] r6 = new int[r6]
            r5.f = r6
        L2de:
            r6 = r7
        L2df:
            if (r6 >= r9) goto L2ee
            int[] r10 = r5.f
            r12 = r3[r6]
            int r12 = r12.h(r11)
            r10[r6] = r12
            int r6 = r6 + 1
            goto L2df
        L2ee:
            r16.p(r17)
            dq r3 = r0.v
            r3.a = r7
            ai r6 = r0.s
            int r6 = r6.l()
            int r9 = r0.p
            int r9 = r6 / r9
            r0.u = r9
            ai r9 = r0.s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            int r6 = r5.a
            r0.W0(r6, r2)
            boolean r6 = r5.c
            if (r6 == 0) goto L327
            r0.V0(r4)
            r0.A0(r1, r3, r2)
            r0.V0(r8)
            int r4 = r5.a
            int r6 = r3.d
            int r4 = r4 + r6
            r3.c = r4
            r0.A0(r1, r3, r2)
            goto L33a
        L327:
            r0.V0(r8)
            r0.A0(r1, r3, r2)
            r0.V0(r4)
            int r4 = r5.a
            int r6 = r3.d
            int r4 = r4 + r6
            r3.c = r4
            r0.A0(r1, r3, r2)
        L33a:
            ai r3 = r0.s
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L346
            goto L3e2
        L346:
            int r3 = r0.v()
            r4 = 0
            r6 = r7
        L34c:
            if (r6 >= r3) goto L36e
            android.view.View r9 = r0.u(r6)
            ai r10 = r0.s
            int r10 = r10.c(r9)
            float r10 = (float) r10
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 >= 0) goto L35e
            goto L36b
        L35e:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            k40 r9 = (defpackage.k40) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r10)
        L36b:
            int r6 = r6 + 1
            goto L34c
        L36e:
            int r6 = r0.u
            int r9 = r0.p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            ai r9 = r0.s
            int r9 = r9.i()
            if (r9 != r11) goto L38a
            ai r9 = r0.s
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L38a:
            int r9 = r0.p
            int r9 = r4 / r9
            r0.u = r9
            ai r9 = r0.s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.u
            if (r4 != r6) goto L39e
            goto L3e2
        L39e:
            r4 = r7
        L39f:
            if (r4 >= r3) goto L3e2
            android.view.View r9 = r0.u(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            k40 r10 = (defpackage.k40) r10
            r10.getClass()
            boolean r11 = r0.L0()
            if (r11 == 0) goto L3ca
            int r11 = r0.t
            if (r11 != r8) goto L3ca
            int r11 = r0.p
            int r11 = r11 - r8
            n40 r10 = r10.e
            int r10 = r10.e
            int r11 = r11 - r10
            int r10 = -r11
            int r11 = r0.u
            int r11 = r11 * r10
            int r10 = r10 * r6
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L3df
        L3ca:
            n40 r10 = r10.e
            int r10 = r10.e
            int r11 = r0.u
            int r11 = r11 * r10
            int r10 = r10 * r6
            int r12 = r0.t
            if (r12 != r8) goto L3db
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L3df
        L3db:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L3df:
            int r4 = r4 + 1
            goto L39f
        L3e2:
            int r3 = r0.v()
            if (r3 <= 0) goto L3f9
            boolean r3 = r0.x
            if (r3 == 0) goto L3f3
            r0.D0(r1, r2, r8)
            r0.E0(r1, r2, r7)
            goto L3f9
        L3f3:
            r0.E0(r1, r2, r8)
            r0.D0(r1, r2, r7)
        L3f9:
            if (r19 == 0) goto L41f
            boolean r3 = r2.g
            if (r3 != 0) goto L41f
            int r3 = r0.C
            if (r3 == 0) goto L41f
            int r3 = r0.v()
            if (r3 <= 0) goto L41f
            android.view.View r3 = r0.K0()
            if (r3 == 0) goto L41f
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 == 0) goto L418
            y6 r4 = r0.K
            r3.removeCallbacks(r4)
        L418:
            boolean r3 = r0.y0()
            if (r3 == 0) goto L41f
            goto L420
        L41f:
            r8 = r7
        L420:
            boolean r3 = r2.g
            if (r3 == 0) goto L427
            r5.a()
        L427:
            boolean r3 = r5.c
            r0.D = r3
            boolean r3 = r0.L0()
            r0.E = r3
            if (r8 == 0) goto L439
            r5.a()
            r0.N0(r1, r2, r7)
        L439:
            return
    }

    public final boolean O0(int r5) {
            r4 = this;
            int r0 = r4.t
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L12
            if (r5 != r1) goto Lb
            r5 = r3
            goto Lc
        Lb:
            r5 = r2
        Lc:
            boolean r0 = r4.x
            if (r5 == r0) goto L11
            return r3
        L11:
            return r2
        L12:
            if (r5 != r1) goto L16
            r5 = r3
            goto L17
        L16:
            r5 = r2
        L17:
            boolean r0 = r4.x
            if (r5 != r0) goto L1d
            r5 = r3
            goto L1e
        L1d:
            r5 = r2
        L1e:
            boolean r0 = r4.L0()
            if (r5 != r0) goto L25
            return r3
        L25:
            return r2
    }

    @Override // defpackage.nz
    public final void P(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.b
            if (r0 == 0) goto L9
            y6 r1 = r2.K
            r0.removeCallbacks(r1)
        L9:
            r0 = 0
        La:
            int r1 = r2.p
            if (r0 >= r1) goto L18
            n40[] r1 = r2.q
            r1 = r1[r0]
            r1.b()
            int r0 = r0 + 1
            goto La
        L18:
            r3.requestLayout()
            return
    }

    public final void P0(int r5, defpackage.yz r6) {
            r4 = this;
            r0 = 1
            if (r5 <= 0) goto L9
            int r1 = r4.G0()
            r2 = r0
            goto Le
        L9:
            int r1 = r4.F0()
            r2 = -1
        Le:
            dq r3 = r4.v
            r3.a = r0
            r4.W0(r1, r6)
            r4.V0(r2)
            int r6 = r3.d
            int r1 = r1 + r6
            r3.c = r1
            int r5 = java.lang.Math.abs(r5)
            r3.b = r5
            return
    }

    @Override // defpackage.nz
    public final android.view.View Q(android.view.View r9, int r10, defpackage.tz r11, defpackage.yz r12) {
            r8 = this;
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L9
            goto L15f
        L9:
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            if (r0 != 0) goto Le
            goto L21
        Le:
            android.view.View r9 = r0.A(r9)
            if (r9 != 0) goto L15
            goto L21
        L15:
            r5 r0 = r8.a
            java.lang.Object r0 = r0.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L22
        L21:
            r9 = r1
        L22:
            if (r9 != 0) goto L26
            goto L15f
        L26:
            r8.T0()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r10 == r3) goto L66
            r4 = 2
            if (r10 == r4) goto L5a
            r4 = 17
            if (r10 == r4) goto L55
            r4 = 33
            if (r10 == r4) goto L4f
            r4 = 66
            if (r10 == r4) goto L4a
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L44
        L42:
            r10 = r0
            goto L72
        L44:
            int r10 = r8.t
            if (r10 != r3) goto L42
        L48:
            r10 = r3
            goto L72
        L4a:
            int r10 = r8.t
            if (r10 != 0) goto L42
            goto L48
        L4f:
            int r10 = r8.t
            if (r10 != r3) goto L42
        L53:
            r10 = r2
            goto L72
        L55:
            int r10 = r8.t
            if (r10 != 0) goto L42
        L59:
            goto L53
        L5a:
            int r10 = r8.t
            if (r10 != r3) goto L5f
            goto L48
        L5f:
            boolean r10 = r8.L0()
            if (r10 == 0) goto L48
            goto L53
        L66:
            int r10 = r8.t
            if (r10 != r3) goto L6b
            goto L59
        L6b:
            boolean r10 = r8.L0()
            if (r10 == 0) goto L53
            goto L48
        L72:
            if (r10 != r0) goto L76
            goto L15f
        L76:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            k40 r0 = (defpackage.k40) r0
            r0.getClass()
            n40 r0 = r0.e
            if (r10 != r3) goto L88
            int r4 = r8.G0()
            goto L8c
        L88:
            int r4 = r8.F0()
        L8c:
            r8.W0(r4, r12)
            r8.V0(r10)
            dq r5 = r8.v
            int r6 = r5.d
            int r6 = r6 + r4
            r5.c = r6
            ai r6 = r8.r
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.b = r6
            r5.h = r3
            r6 = 0
            r5.a = r6
            r8.A0(r11, r5, r12)
            boolean r11 = r8.x
            r8.D = r11
            android.view.View r11 = r0.g(r4, r10)
            if (r11 == 0) goto Lbc
            if (r11 == r9) goto Lbc
            return r11
        Lbc:
            boolean r11 = r8.O0(r10)
            if (r11 == 0) goto Ld7
            int r11 = r8.p
            int r11 = r11 - r3
        Lc5:
            if (r11 < 0) goto Lec
            n40[] r12 = r8.q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto Ld4
            if (r12 == r9) goto Ld4
            return r12
        Ld4:
            int r11 = r11 + (-1)
            goto Lc5
        Ld7:
            r11 = r6
        Ld8:
            int r12 = r8.p
            if (r11 >= r12) goto Lec
            n40[] r12 = r8.q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto Le9
            if (r12 == r9) goto Le9
            return r12
        Le9:
            int r11 = r11 + 1
            goto Ld8
        Lec:
            boolean r11 = r8.w
            r11 = r11 ^ r3
            if (r10 != r2) goto Lf3
            r12 = r3
            goto Lf4
        Lf3:
            r12 = r6
        Lf4:
            if (r11 != r12) goto Lf8
            r11 = r3
            goto Lf9
        Lf8:
            r11 = r6
        Lf9:
            if (r11 == 0) goto L100
            int r12 = r0.c()
            goto L104
        L100:
            int r12 = r0.d()
        L104:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L10d
            if (r12 == r9) goto L10d
            return r12
        L10d:
            boolean r10 = r8.O0(r10)
            if (r10 == 0) goto L13c
            int r10 = r8.p
            int r10 = r10 - r3
        L116:
            if (r10 < 0) goto L15f
            int r12 = r0.e
            if (r10 != r12) goto L11d
            goto L139
        L11d:
            if (r11 == 0) goto L128
            n40[] r12 = r8.q
            r12 = r12[r10]
            int r12 = r12.c()
            goto L130
        L128:
            n40[] r12 = r8.q
            r12 = r12[r10]
            int r12 = r12.d()
        L130:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L139
            if (r12 == r9) goto L139
            return r12
        L139:
            int r10 = r10 + (-1)
            goto L116
        L13c:
            int r10 = r8.p
            if (r6 >= r10) goto L15f
            if (r11 == 0) goto L14b
            n40[] r10 = r8.q
            r10 = r10[r6]
            int r10 = r10.c()
            goto L153
        L14b:
            n40[] r10 = r8.q
            r10 = r10[r6]
            int r10 = r10.d()
        L153:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L15c
            if (r10 == r9) goto L15c
            return r10
        L15c:
            int r6 = r6 + 1
            goto L13c
        L15f:
            return r1
    }

    public final void Q0(defpackage.tz r5, defpackage.dq r6) {
            r4 = this;
            boolean r0 = r6.a
            if (r0 == 0) goto L85
            boolean r0 = r6.i
            if (r0 == 0) goto La
            goto L85
        La:
            int r0 = r6.b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.e
            if (r0 != r1) goto L19
            int r6 = r6.g
            r4.R0(r5, r6)
            return
        L19:
            int r6 = r6.f
            r4.S0(r5, r6)
            return
        L1f:
            int r0 = r6.e
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L55
            int r0 = r6.f
            n40[] r1 = r4.q
            r1 = r1[r3]
            int r1 = r1.h(r0)
        L2f:
            int r3 = r4.p
            if (r2 >= r3) goto L41
            n40[] r3 = r4.q
            r3 = r3[r2]
            int r3 = r3.h(r0)
            if (r3 <= r1) goto L3e
            r1 = r3
        L3e:
            int r2 = r2 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L47
            int r6 = r6.g
            goto L51
        L47:
            int r1 = r6.g
            int r6 = r6.b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
        L51:
            r4.R0(r5, r6)
            return
        L55:
            int r0 = r6.g
            n40[] r1 = r4.q
            r1 = r1[r3]
            int r1 = r1.f(r0)
        L5f:
            int r3 = r4.p
            if (r2 >= r3) goto L71
            n40[] r3 = r4.q
            r3 = r3[r2]
            int r3 = r3.f(r0)
            if (r3 >= r1) goto L6e
            r1 = r3
        L6e:
            int r2 = r2 + 1
            goto L5f
        L71:
            int r0 = r6.g
            int r1 = r1 - r0
            if (r1 >= 0) goto L79
            int r6 = r6.f
            goto L82
        L79:
            int r0 = r6.f
            int r6 = r6.b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
        L82:
            r4.S0(r5, r6)
        L85:
            return
    }

    @Override // defpackage.nz
    public final void R(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.R(r3)
            int r0 = r2.v()
            if (r0 <= 0) goto L2e
            r0 = 0
            android.view.View r1 = r2.C0(r0)
            android.view.View r0 = r2.B0(r0)
            if (r1 == 0) goto L2e
            if (r0 != 0) goto L17
            goto L2e
        L17:
            int r1 = defpackage.nz.F(r1)
            int r0 = defpackage.nz.F(r0)
            if (r1 >= r0) goto L28
            r3.setFromIndex(r1)
            r3.setToIndex(r0)
            return
        L28:
            r3.setFromIndex(r0)
            r3.setToIndex(r1)
        L2e:
            return
    }

    public final void R0(defpackage.tz r9, int r10) {
            r8 = this;
            int r0 = r8.v()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L74
            android.view.View r2 = r8.u(r0)
            ai r3 = r8.r
            int r3 = r3.e(r2)
            if (r3 < r10) goto L74
            ai r3 = r8.r
            int r3 = r3.n(r2)
            if (r3 < r10) goto L74
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            k40 r3 = (defpackage.k40) r3
            r3.getClass()
            n40 r4 = r3.e
            java.util.ArrayList r4 = r4.a
            int r4 = r4.size()
            if (r4 != r1) goto L30
            goto L74
        L30:
            n40 r3 = r3.e
            java.util.ArrayList r4 = r3.a
            int r5 = r4.size()
            int r6 = r5 + (-1)
            java.lang.Object r4 = r4.remove(r6)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            k40 r6 = (defpackage.k40) r6
            r7 = 0
            r6.e = r7
            b00 r7 = r6.a
            boolean r7 = r7.h()
            if (r7 != 0) goto L59
            b00 r6 = r6.a
            boolean r6 = r6.k()
            if (r6 == 0) goto L66
        L59:
            int r6 = r3.d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = r3.f
            ai r7 = r7.r
            int r4 = r7.c(r4)
            int r6 = r6 - r4
            r3.d = r6
        L66:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r1) goto L6c
            r3.b = r4
        L6c:
            r3.c = r4
            r8.g0(r2, r9)
            int r0 = r0 + (-1)
            goto L6
        L74:
            return
    }

    @Override // defpackage.nz
    public final void S(defpackage.tz r3, defpackage.yz r4, android.view.View r5, defpackage.j0 r6) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r4 = r3 instanceof defpackage.k40
            if (r4 != 0) goto Lc
            r2.T(r5, r6)
            return
        Lc:
            k40 r3 = (defpackage.k40) r3
            int r4 = r2.t
            r5 = 0
            r0 = 1
            r1 = -1
            if (r4 != 0) goto L25
            n40 r3 = r3.e
            if (r3 != 0) goto L1b
            r3 = r1
            goto L1d
        L1b:
            int r3 = r3.e
        L1d:
            i0 r3 = defpackage.i0.a(r5, r3, r0, r1, r1)
            r6.f(r3)
            return
        L25:
            n40 r3 = r3.e
            if (r3 != 0) goto L2b
            r3 = r1
            goto L2d
        L2b:
            int r3 = r3.e
        L2d:
            i0 r3 = defpackage.i0.a(r5, r1, r1, r3, r0)
            r6.f(r3)
            return
    }

    public final void S0(defpackage.tz r7, int r8) {
            r6 = this;
        L0:
            int r0 = r6.v()
            if (r0 <= 0) goto L70
            r0 = 0
            android.view.View r1 = r6.u(r0)
            ai r2 = r6.r
            int r2 = r2.b(r1)
            if (r2 > r8) goto L70
            ai r2 = r6.r
            int r2 = r2.m(r1)
            if (r2 > r8) goto L70
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            k40 r2 = (defpackage.k40) r2
            r2.getClass()
            n40 r3 = r2.e
            java.util.ArrayList r3 = r3.a
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L30
            goto L70
        L30:
            n40 r2 = r2.e
            java.util.ArrayList r3 = r2.a
            java.lang.Object r0 = r3.remove(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            k40 r4 = (defpackage.k40) r4
            r5 = 0
            r4.e = r5
            int r3 = r3.size()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L4d
            r2.c = r5
        L4d:
            b00 r3 = r4.a
            boolean r3 = r3.h()
            if (r3 != 0) goto L5d
            b00 r3 = r4.a
            boolean r3 = r3.k()
            if (r3 == 0) goto L6a
        L5d:
            int r3 = r2.d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = r2.f
            ai r4 = r4.r
            int r0 = r4.c(r0)
            int r3 = r3 - r0
            r2.d = r3
        L6a:
            r2.b = r5
            r6.g0(r1, r7)
            goto L0
        L70:
            return
    }

    public final void T0() {
            r2 = this;
            int r0 = r2.t
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.L0()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.w
            r0 = r0 ^ r1
            r2.x = r0
            return
        L12:
            boolean r0 = r2.w
            r2.x = r0
            return
    }

    @Override // defpackage.nz
    public final void U(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.J0(r2, r3, r0)
            return
    }

    public final int U0(int r4, defpackage.tz r5, defpackage.yz r6) {
            r3 = this;
            int r0 = r3.v()
            r1 = 0
            if (r0 == 0) goto L2d
            if (r4 != 0) goto La
            goto L2d
        La:
            r3.P0(r4, r6)
            dq r0 = r3.v
            int r6 = r3.A0(r5, r0, r6)
            int r2 = r0.b
            if (r2 >= r6) goto L18
            goto L1d
        L18:
            if (r4 >= 0) goto L1c
            int r4 = -r6
            goto L1d
        L1c:
            r4 = r6
        L1d:
            ai r6 = r3.r
            int r2 = -r4
            r6.o(r2)
            boolean r6 = r3.x
            r3.D = r6
            r0.b = r1
            r3.Q0(r5, r0)
            return r4
        L2d:
            return r1
    }

    @Override // defpackage.nz
    public final void V() {
            r3 = this;
            d4 r0 = r3.B
            java.lang.Object r1 = r0.b
            int[] r1 = (int[]) r1
            if (r1 == 0) goto Lc
            r2 = -1
            java.util.Arrays.fill(r1, r2)
        Lc:
            r1 = 0
            r0.c = r1
            r3.j0()
            return
    }

    public final void V0(int r5) {
            r4 = this;
            dq r0 = r4.v
            r0.e = r5
            boolean r1 = r4.x
            r2 = 1
            r3 = -1
            if (r5 != r3) goto Lc
            r5 = r2
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != r5) goto L10
            goto L11
        L10:
            r2 = r3
        L11:
            r0.d = r2
            return
    }

    @Override // defpackage.nz
    public final void W(int r2, int r3) {
            r1 = this;
            r0 = 8
            r1.J0(r2, r3, r0)
            return
    }

    public final void W0(int r5, defpackage.yz r6) {
            r4 = this;
            dq r0 = r4.v
            r1 = 0
            r0.b = r1
            r0.c = r5
            yq r2 = r4.e
            r3 = 1
            if (r2 == 0) goto L2f
            boolean r2 = r2.e
            if (r2 == 0) goto L2f
            int r6 = r6.a
            r2 = -1
            if (r6 == r2) goto L2f
            boolean r2 = r4.x
            if (r6 >= r5) goto L1b
            r5 = r3
            goto L1c
        L1b:
            r5 = r1
        L1c:
            if (r2 != r5) goto L26
            ai r5 = r4.r
            int r5 = r5.l()
            r6 = r1
            goto L31
        L26:
            ai r5 = r4.r
            int r5 = r5.l()
            r6 = r5
            r5 = r1
            goto L31
        L2f:
            r5 = r1
            r6 = r5
        L31:
            androidx.recyclerview.widget.RecyclerView r2 = r4.b
            if (r2 == 0) goto L4c
            boolean r2 = r2.g
            if (r2 == 0) goto L4c
            ai r2 = r4.r
            int r2 = r2.k()
            int r2 = r2 - r6
            r0.f = r2
            ai r6 = r4.r
            int r6 = r6.g()
            int r6 = r6 + r5
            r0.g = r6
            goto L58
        L4c:
            ai r2 = r4.r
            int r2 = r2.f()
            int r2 = r2 + r5
            r0.g = r2
            int r5 = -r6
            r0.f = r5
        L58:
            r0.h = r1
            r0.a = r3
            ai r5 = r4.r
            int r5 = r5.i()
            if (r5 != 0) goto L6d
            ai r5 = r4.r
            int r5 = r5.f()
            if (r5 != 0) goto L6d
            r1 = r3
        L6d:
            r0.i = r1
            return
    }

    @Override // defpackage.nz
    public final void X(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.J0(r2, r3, r0)
            return
    }

    public final void X0(defpackage.n40 r6, int r7, int r8) {
            r5 = this;
            int r0 = r6.d
            int r1 = r6.e
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r7 != r2) goto L35
            int r7 = r6.b
            if (r7 == r3) goto Lf
            goto L2c
        Lf:
            java.util.ArrayList r7 = r6.a
            java.lang.Object r7 = r7.get(r4)
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            k40 r2 = (defpackage.k40) r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r6.f
            ai r3 = r3.r
            int r7 = r3.e(r7)
            r6.b = r7
            r2.getClass()
            int r7 = r6.b
        L2c:
            int r7 = r7 + r0
            if (r7 > r8) goto L47
            java.util.BitSet r6 = r5.y
            r6.set(r1, r4)
            return
        L35:
            int r7 = r6.c
            if (r7 == r3) goto L3a
            goto L3f
        L3a:
            r6.a()
            int r7 = r6.c
        L3f:
            int r7 = r7 - r0
            if (r7 < r8) goto L47
            java.util.BitSet r6 = r5.y
            r6.set(r1, r4)
        L47:
            return
    }

    @Override // defpackage.nz
    public final void Y(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.J0(r2, r3, r0)
            return
    }

    @Override // defpackage.nz
    public final void Z(defpackage.tz r2, defpackage.yz r3) {
            r1 = this;
            r0 = 1
            r1.N0(r2, r3, r0)
            return
    }

    @Override // defpackage.xz
    public final android.graphics.PointF a(int r4) {
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.F0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
    }

    @Override // defpackage.nz
    public final void a0(defpackage.yz r1) {
            r0 = this;
            r1 = -1
            r0.z = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.A = r1
            r1 = 0
            r0.F = r1
            j40 r1 = r0.H
            r1.a()
            return
    }

    @Override // defpackage.nz
    public final void b0(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.m40
            if (r0 == 0) goto Lb
            m40 r2 = (defpackage.m40) r2
            r1.F = r2
            r1.j0()
        Lb:
            return
    }

    @Override // defpackage.nz
    public final void c(java.lang.String r2) {
            r1 = this;
            m40 r0 = r1.F
            if (r0 != 0) goto L7
            super.c(r2)
        L7:
            return
    }

    @Override // defpackage.nz
    public final android.os.Parcelable c0() {
            r5 = this;
            m40 r0 = r5.F
            if (r0 == 0) goto L32
            m40 r1 = new m40
            r1.<init>()
            int r2 = r0.c
            r1.c = r2
            int r2 = r0.a
            r1.a = r2
            int r2 = r0.b
            r1.b = r2
            int[] r2 = r0.d
            r1.d = r2
            int r2 = r0.e
            r1.e = r2
            int[] r2 = r0.f
            r1.f = r2
            boolean r2 = r0.h
            r1.h = r2
            boolean r2 = r0.i
            r1.i = r2
            boolean r2 = r0.j
            r1.j = r2
            java.util.ArrayList r0 = r0.g
            r1.g = r0
            return r1
        L32:
            m40 r0 = new m40
            r0.<init>()
            boolean r1 = r5.w
            r0.h = r1
            boolean r1 = r5.D
            r0.i = r1
            boolean r1 = r5.E
            r0.j = r1
            r1 = 0
            d4 r2 = r5.B
            if (r2 == 0) goto L5a
            java.lang.Object r3 = r2.b
            int[] r3 = (int[]) r3
            if (r3 == 0) goto L5a
            r0.f = r3
            int r3 = r3.length
            r0.e = r3
            java.lang.Object r2 = r2.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r0.g = r2
            goto L5c
        L5a:
            r0.e = r1
        L5c:
            int r2 = r5.v()
            r3 = -1
            if (r2 <= 0) goto Lc6
            boolean r2 = r5.D
            if (r2 == 0) goto L6c
            int r2 = r5.G0()
            goto L70
        L6c:
            int r2 = r5.F0()
        L70:
            r0.a = r2
            boolean r2 = r5.x
            r4 = 1
            if (r2 == 0) goto L7c
            android.view.View r2 = r5.B0(r4)
            goto L80
        L7c:
            android.view.View r2 = r5.C0(r4)
        L80:
            if (r2 != 0) goto L83
            goto L87
        L83:
            int r3 = defpackage.nz.F(r2)
        L87:
            r0.b = r3
            int r2 = r5.p
            r0.c = r2
            int[] r2 = new int[r2]
            r0.d = r2
        L91:
            int r2 = r5.p
            if (r1 >= r2) goto Lc5
            boolean r2 = r5.D
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto Lad
            n40[] r2 = r5.q
            r2 = r2[r1]
            int r2 = r2.f(r3)
            if (r2 == r3) goto Lbe
            ai r3 = r5.r
            int r3 = r3.g()
        Lab:
            int r2 = r2 - r3
            goto Lbe
        Lad:
            n40[] r2 = r5.q
            r2 = r2[r1]
            int r2 = r2.h(r3)
            if (r2 == r3) goto Lbe
            ai r3 = r5.r
            int r3 = r3.k()
            goto Lab
        Lbe:
            int[] r3 = r0.d
            r3[r1] = r2
            int r1 = r1 + 1
            goto L91
        Lc5:
            return r0
        Lc6:
            r0.a = r3
            r0.b = r3
            r0.c = r1
            return r0
    }

    @Override // defpackage.nz
    public final boolean d() {
            r1 = this;
            int r0 = r1.t
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.nz
    public final void d0(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r0.y0()
        L5:
            return
    }

    @Override // defpackage.nz
    public final boolean e() {
            r2 = this;
            int r0 = r2.t
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.nz
    public final boolean f(defpackage.oz r1) {
            r0 = this;
            boolean r1 = r1 instanceof defpackage.k40
            return r1
    }

    @Override // defpackage.nz
    public final void h(int r5, int r6, defpackage.yz r7, defpackage.bn r8) {
            r4 = this;
            int r0 = r4.t
            if (r0 != 0) goto L5
            goto L6
        L5:
            r5 = r6
        L6:
            int r6 = r4.v()
            if (r6 == 0) goto L77
            if (r5 != 0) goto Lf
            goto L77
        Lf:
            r4.P0(r5, r7)
            int[] r5 = r4.J
            if (r5 == 0) goto L1b
            int r5 = r5.length
            int r6 = r4.p
            if (r5 >= r6) goto L21
        L1b:
            int r5 = r4.p
            int[] r5 = new int[r5]
            r4.J = r5
        L21:
            r5 = 0
            r6 = r5
            r0 = r6
        L24:
            int r1 = r4.p
            dq r2 = r4.v
            if (r6 >= r1) goto L53
            int r1 = r2.d
            r3 = -1
            if (r1 != r3) goto L3b
            int r1 = r2.f
            n40[] r2 = r4.q
            r2 = r2[r6]
            int r2 = r2.h(r1)
        L39:
            int r1 = r1 - r2
            goto L48
        L3b:
            n40[] r1 = r4.q
            r1 = r1[r6]
            int r3 = r2.g
            int r1 = r1.f(r3)
            int r2 = r2.g
            goto L39
        L48:
            if (r1 < 0) goto L50
            int[] r2 = r4.J
            r2[r0] = r1
            int r0 = r0 + 1
        L50:
            int r6 = r6 + 1
            goto L24
        L53:
            int[] r6 = r4.J
            java.util.Arrays.sort(r6, r5, r0)
        L58:
            if (r5 >= r0) goto L77
            int r6 = r2.c
            if (r6 < 0) goto L77
            int r1 = r7.b()
            if (r6 >= r1) goto L77
            int r6 = r2.c
            int[] r1 = r4.J
            r1 = r1[r5]
            r8.a(r6, r1)
            int r6 = r2.c
            int r1 = r2.d
            int r6 = r6 + r1
            r2.c = r6
            int r5 = r5 + 1
            goto L58
        L77:
            return
    }

    @Override // defpackage.nz
    public final int j(defpackage.yz r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            boolean r0 = r7.I
            r0 = r0 ^ 1
            android.view.View r3 = r7.C0(r0)
            android.view.View r4 = r7.B0(r0)
            boolean r6 = r7.I
            ai r2 = r7.r
            r5 = r7
            r1 = r8
            int r8 = defpackage.zt.g(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // defpackage.nz
    public final int k(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.z0(r1)
            return r1
    }

    @Override // defpackage.nz
    public final int k0(int r1, defpackage.tz r2, defpackage.yz r3) {
            r0 = this;
            int r1 = r0.U0(r1, r2, r3)
            return r1
    }

    @Override // defpackage.nz
    public final int l(defpackage.yz r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            boolean r0 = r7.I
            r0 = r0 ^ 1
            android.view.View r3 = r7.C0(r0)
            android.view.View r4 = r7.B0(r0)
            boolean r6 = r7.I
            ai r2 = r7.r
            r5 = r7
            r1 = r8
            int r8 = defpackage.zt.i(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // defpackage.nz
    public final void l0(int r3) {
            r2 = this;
            m40 r0 = r2.F
            if (r0 == 0) goto L13
            int r1 = r0.a
            if (r1 == r3) goto L13
            r1 = 0
            r0.d = r1
            r1 = 0
            r0.c = r1
            r1 = -1
            r0.a = r1
            r0.b = r1
        L13:
            r2.z = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.A = r3
            r2.j0()
            return
    }

    @Override // defpackage.nz
    public final int m(defpackage.yz r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            boolean r0 = r7.I
            r0 = r0 ^ 1
            android.view.View r3 = r7.C0(r0)
            android.view.View r4 = r7.B0(r0)
            boolean r6 = r7.I
            ai r2 = r7.r
            r5 = r7
            r1 = r8
            int r8 = defpackage.zt.g(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // defpackage.nz
    public final int m0(int r1, defpackage.tz r2, defpackage.yz r3) {
            r0 = this;
            int r1 = r0.U0(r1, r2, r3)
            return r1
    }

    @Override // defpackage.nz
    public final int n(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.z0(r1)
            return r1
    }

    @Override // defpackage.nz
    public final int o(defpackage.yz r8) {
            r7 = this;
            int r0 = r7.v()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            boolean r0 = r7.I
            r0 = r0 ^ 1
            android.view.View r3 = r7.C0(r0)
            android.view.View r4 = r7.B0(r0)
            boolean r6 = r7.I
            ai r2 = r7.r
            r5 = r7
            r1 = r8
            int r8 = defpackage.zt.i(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // defpackage.nz
    public final void p0(android.graphics.Rect r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.C()
            int r1 = r5.D()
            int r1 = r1 + r0
            int r0 = r5.E()
            int r2 = r5.B()
            int r2 = r2 + r0
            int r0 = r5.t
            r3 = 1
            int r4 = r5.p
            if (r0 != r3) goto L39
            int r6 = r6.height()
            int r6 = r6 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            java.util.WeakHashMap r2 = defpackage.ja0.a
            int r0 = defpackage.s90.d(r0)
            int r6 = defpackage.nz.g(r8, r6, r0)
            int r8 = r5.u
            int r8 = r8 * r4
            int r8 = r8 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            int r0 = defpackage.s90.e(r0)
            int r7 = defpackage.nz.g(r7, r8, r0)
            goto L58
        L39:
            int r6 = r6.width()
            int r6 = r6 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r0 = defpackage.s90.e(r0)
            int r7 = defpackage.nz.g(r7, r6, r0)
            int r6 = r5.u
            int r6 = r6 * r4
            int r6 = r6 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            int r0 = defpackage.s90.d(r0)
            int r6 = defpackage.nz.g(r8, r6, r0)
        L58:
            androidx.recyclerview.widget.RecyclerView r8 = r5.b
            androidx.recyclerview.widget.RecyclerView.e(r8, r7, r6)
            return
    }

    @Override // defpackage.nz
    public final defpackage.oz r() {
            r3 = this;
            int r0 = r3.t
            r1 = -1
            r2 = -2
            if (r0 != 0) goto Lc
            k40 r0 = new k40
            r0.<init>(r2, r1)
            return r0
        Lc:
            k40 r0 = new k40
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.nz
    public final defpackage.oz s(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            k40 r0 = new k40
            r0.<init>(r2, r3)
            return r0
    }

    @Override // defpackage.nz
    public final defpackage.oz t(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            k40 r0 = new k40
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            k40 r0 = new k40
            r0.<init>(r2)
            return r0
    }

    @Override // defpackage.nz
    public final void v0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            yq r0 = new yq
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.a = r3
            r1.w0(r0)
            return
    }

    @Override // defpackage.nz
    public final int x(defpackage.tz r3, defpackage.yz r4) {
            r2 = this;
            int r0 = r2.t
            r1 = 1
            if (r0 != r1) goto L8
            int r3 = r2.p
            return r3
        L8:
            int r3 = super.x(r3, r4)
            return r3
    }

    @Override // defpackage.nz
    public final boolean x0() {
            r1 = this;
            m40 r0 = r1.F
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean y0() {
            r3 = this;
            int r0 = r3.v()
            r1 = 0
            if (r0 == 0) goto L41
            int r0 = r3.C
            if (r0 == 0) goto L41
            boolean r0 = r3.g
            if (r0 != 0) goto L10
            goto L41
        L10:
            boolean r0 = r3.x
            if (r0 == 0) goto L1c
            int r0 = r3.G0()
            r3.F0()
            goto L23
        L1c:
            int r0 = r3.F0()
            r3.G0()
        L23:
            if (r0 != 0) goto L41
            android.view.View r0 = r3.K0()
            if (r0 == 0) goto L41
            d4 r0 = r3.B
            java.lang.Object r1 = r0.b
            int[] r1 = (int[]) r1
            if (r1 == 0) goto L37
            r2 = -1
            java.util.Arrays.fill(r1, r2)
        L37:
            r1 = 0
            r0.c = r1
            r0 = 1
            r3.f = r0
            r3.j0()
            return r0
        L41:
            return r1
    }

    public final int z0(defpackage.yz r9) {
            r8 = this;
            int r0 = r8.v()
            if (r0 != 0) goto L8
            r9 = 0
            return r9
        L8:
            boolean r0 = r8.I
            r0 = r0 ^ 1
            android.view.View r3 = r8.C0(r0)
            android.view.View r4 = r8.B0(r0)
            boolean r6 = r8.I
            boolean r7 = r8.x
            ai r2 = r8.r
            r5 = r8
            r1 = r9
            int r9 = defpackage.zt.h(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }
}
