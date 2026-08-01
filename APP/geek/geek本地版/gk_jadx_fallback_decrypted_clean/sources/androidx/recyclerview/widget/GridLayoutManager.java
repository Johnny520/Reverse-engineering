package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public android.view.View[] H;
    public final android.util.SparseIntArray I;
    public final android.util.SparseIntArray J;
    public final defpackage.d4 K;
    public final android.graphics.Rect L;

    public GridLayoutManager(int r3) {
            r2 = this;
            r0 = 1
            r2.<init>(r0)
            r0 = 0
            r2.E = r0
            r0 = -1
            r2.F = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r2.I = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r2.J = r0
            d4 r0 = new d4
            r1 = 13
            r0.<init>(r1)
            r2.K = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.L = r0
            r2.j1(r3)
            return
    }

    public GridLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6)
            r0 = 0
            r2.E = r0
            r0 = -1
            r2.F = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r2.I = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r2.J = r0
            d4 r0 = new d4
            r1 = 13
            r0.<init>(r1)
            r2.K = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.L = r0
            mz r3 = defpackage.nz.G(r3, r4, r5, r6)
            int r3 = r3.b
            r2.j1(r3)
            return
    }

    @Override // defpackage.nz
    public final int H(defpackage.tz r3, defpackage.yz r4) {
            r2 = this;
            int r0 = r2.p
            if (r0 != 0) goto L7
            int r3 = r2.F
            return r3
        L7:
            int r0 = r4.b()
            r1 = 1
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.b()
            int r0 = r0 - r1
            int r3 = r2.f1(r0, r3, r4)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final android.view.View L0(defpackage.tz r8, defpackage.yz r9, int r10, int r11, int r12) {
            r7 = this;
            r7.E0()
            ai r0 = r7.r
            int r0 = r0.k()
            ai r1 = r7.r
            int r1 = r1.g()
            if (r11 <= r10) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = -1
        L14:
            r3 = 0
            r4 = r3
        L16:
            if (r10 == r11) goto L54
            android.view.View r5 = r7.u(r10)
            int r6 = defpackage.nz.F(r5)
            if (r6 < 0) goto L52
            if (r6 >= r12) goto L52
            int r6 = r7.g1(r6, r8, r9)
            if (r6 == 0) goto L2b
            goto L52
        L2b:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            oz r6 = (defpackage.oz) r6
            b00 r6 = r6.a
            boolean r6 = r6.h()
            if (r6 == 0) goto L3d
            if (r4 != 0) goto L52
            r4 = r5
            goto L52
        L3d:
            ai r6 = r7.r
            int r6 = r6.e(r5)
            if (r6 >= r1) goto L4f
            ai r6 = r7.r
            int r6 = r6.b(r5)
            if (r6 >= r0) goto L4e
            goto L4f
        L4e:
            return r5
        L4f:
            if (r3 != 0) goto L52
            r3 = r5
        L52:
            int r10 = r10 + r2
            goto L16
        L54:
            if (r3 == 0) goto L57
            return r3
        L57:
            return r4
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final android.view.View Q(android.view.View r23, int r24, defpackage.tz r25, defpackage.yz r26) {
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            r4 = 0
            if (r3 != 0) goto Le
            r5 = r23
            goto L23
        Le:
            r5 = r23
            android.view.View r3 = r3.A(r5)
            if (r3 != 0) goto L17
            goto L23
        L17:
            r5 r6 = r0.a
            java.lang.Object r6 = r6.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L24
        L23:
            r3 = r4
        L24:
            if (r3 != 0) goto L27
            goto L38
        L27:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            eo r6 = (defpackage.eo) r6
            int r7 = r6.e
            int r6 = r6.f
            int r6 = r6 + r7
            android.view.View r5 = super.Q(r23, r24, r25, r26)
            if (r5 != 0) goto L39
        L38:
            return r4
        L39:
            r5 = r24
            int r5 = r0.D0(r5)
            r9 = 1
            if (r5 != r9) goto L44
            r5 = r9
            goto L45
        L44:
            r5 = 0
        L45:
            boolean r10 = r0.u
            r11 = -1
            if (r5 == r10) goto L52
            int r5 = r0.v()
            int r5 = r5 - r9
            r10 = r11
            r12 = r10
            goto L59
        L52:
            int r5 = r0.v()
            r10 = r5
            r12 = r9
            r5 = 0
        L59:
            int r13 = r0.p
            if (r13 != r9) goto L65
            boolean r13 = r0.Q0()
            if (r13 == 0) goto L65
            r13 = r9
            goto L66
        L65:
            r13 = 0
        L66:
            int r14 = r0.f1(r5, r1, r2)
            r16 = r4
            r8 = r11
            r15 = r8
            r9 = 0
            r11 = r5
            r4 = 0
            r5 = r16
        L73:
            r17 = r5
            if (r11 == r10) goto L142
            int r5 = r0.f1(r11, r1, r2)
            android.view.View r1 = r0.u(r11)
            if (r1 != r3) goto L83
            goto L142
        L83:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L97
            if (r5 == r14) goto L97
            if (r16 == 0) goto L8f
            goto L142
        L8f:
            r18 = r3
            r19 = r9
            r21 = r10
            goto L133
        L97:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            eo r5 = (defpackage.eo) r5
            int r2 = r5.e
            r18 = r3
            int r3 = r5.f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Laf
            if (r2 != r7) goto Laf
            if (r3 != r6) goto Laf
            return r1
        Laf:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Lb7
            if (r16 == 0) goto Lbf
        Lb7:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto Lc4
            if (r17 != 0) goto Lc4
        Lbf:
            r19 = r9
            r21 = r10
            goto L109
        Lc4:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Le8
            if (r10 <= r9) goto Ldb
        Ld8:
            r19 = r9
            goto L109
        Ldb:
            if (r10 != r9) goto Le5
            if (r2 <= r15) goto Le1
            r10 = 1
            goto Le2
        Le1:
            r10 = 0
        Le2:
            if (r13 != r10) goto Le5
            goto Ld8
        Le5:
            r19 = r9
            goto L133
        Le8:
            if (r16 != 0) goto Le5
            r19 = r9
            d4 r9 = r0.c
            boolean r9 = r9.y(r1)
            if (r9 == 0) goto Lfd
            d4 r9 = r0.d
            boolean r9 = r9.y(r1)
            if (r9 == 0) goto Lfd
            goto L133
        Lfd:
            if (r10 <= r4) goto L100
            goto L109
        L100:
            if (r10 != r4) goto L133
            if (r2 <= r8) goto L106
            r9 = 1
            goto L107
        L106:
            r9 = 0
        L107:
            if (r13 != r9) goto L133
        L109:
            boolean r9 = r1.hasFocusable()
            if (r9 == 0) goto L121
            int r5 = r5.e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r9 = r3 - r2
            r16 = r1
            r15 = r5
            r5 = r17
            goto L137
        L121:
            int r4 = r5.e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r2 = r3 - r2
            r5 = r1
            r8 = r4
            r9 = r19
            r4 = r2
            goto L137
        L133:
            r5 = r17
            r9 = r19
        L137:
            int r11 = r11 + r12
            r1 = r25
            r2 = r26
            r3 = r18
            r10 = r21
            goto L73
        L142:
            if (r16 == 0) goto L145
            return r16
        L145:
            return r17
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R0(defpackage.tz r19, defpackage.yz r20, defpackage.wq r21, defpackage.vq r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            ai r5 = r0.r
            int r5 = r5.j()
            r6 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r8) goto L17
            r9 = r6
            goto L18
        L17:
            r9 = 0
        L18:
            int r10 = r0.v()
            if (r10 <= 0) goto L25
            int[] r10 = r0.G
            int r11 = r0.F
            r10 = r10[r11]
            goto L26
        L25:
            r10 = 0
        L26:
            if (r9 == 0) goto L2b
            r0.k1()
        L2b:
            int r11 = r3.e
            if (r11 != r6) goto L31
            r11 = r6
            goto L32
        L31:
            r11 = 0
        L32:
            int r12 = r0.F
            if (r11 != 0) goto L43
            int r12 = r3.d
            int r12 = r0.g1(r12, r1, r2)
            int r13 = r3.d
            int r13 = r0.h1(r13, r1, r2)
            int r12 = r12 + r13
        L43:
            r13 = 0
        L44:
            int r14 = r0.F
            if (r13 >= r14) goto L9d
            int r14 = r3.d
            if (r14 < 0) goto L9d
            int r15 = r2.b()
            if (r14 >= r15) goto L9d
            if (r12 <= 0) goto L9d
            int r14 = r3.d
            int r15 = r0.h1(r14, r1, r2)
            int r8 = r0.F
            if (r15 > r8) goto L72
            int r12 = r12 - r15
            if (r12 >= 0) goto L62
            goto L9d
        L62:
            android.view.View r8 = r3.b(r1)
            if (r8 != 0) goto L69
            goto L9d
        L69:
            android.view.View[] r14 = r0.H
            r14[r13] = r8
            int r13 = r13 + 1
            r8 = 1073741824(0x40000000, float:2.0)
            goto L44
        L72:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Item at position "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r3 = " requires "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = " spans but GridLayoutManager has only "
            r2.append(r3)
            int r3 = r0.F
            r2.append(r3)
            java.lang.String r3 = " spans."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L9d:
            if (r13 != 0) goto La2
            r4.b = r6
            return
        La2:
            if (r11 == 0) goto La8
            r15 = r6
            r14 = r13
            r12 = 0
            goto Lac
        La8:
            int r12 = r13 + (-1)
            r14 = -1
            r15 = -1
        Lac:
            r6 = 0
        Lad:
            if (r12 == r14) goto Lca
            android.view.View[] r7 = r0.H
            r7 = r7[r12]
            android.view.ViewGroup$LayoutParams r16 = r7.getLayoutParams()
            r8 = r16
            eo r8 = (defpackage.eo) r8
            int r7 = defpackage.nz.F(r7)
            int r7 = r0.h1(r7, r1, r2)
            r8.f = r7
            r8.e = r6
            int r6 = r6 + r7
            int r12 = r12 + r15
            goto Lad
        Lca:
            r1 = 0
            r2 = 0
            r6 = 0
        Lcd:
            if (r2 >= r13) goto L12b
            android.view.View[] r7 = r0.H
            r7 = r7[r2]
            java.util.List r8 = r3.k
            if (r8 != 0) goto Le5
            if (r11 == 0) goto Ldf
            r8 = -1
            r12 = 0
            r0.b(r7, r8, r12)
            goto Lf2
        Ldf:
            r8 = -1
            r12 = 0
            r0.b(r7, r12, r12)
            goto Lf2
        Le5:
            r8 = -1
            r12 = 0
            if (r11 == 0) goto Lee
            r14 = 1
            r0.b(r7, r8, r14)
            goto Lf2
        Lee:
            r14 = 1
            r0.b(r7, r12, r14)
        Lf2:
            androidx.recyclerview.widget.RecyclerView r8 = r0.b
            android.graphics.Rect r14 = r0.L
            if (r8 != 0) goto Lfc
            r14.set(r12, r12, r12, r12)
            goto L103
        Lfc:
            android.graphics.Rect r8 = r8.J(r7)
            r14.set(r8)
        L103:
            r0.i1(r7, r5, r12)
            ai r8 = r0.r
            int r8 = r8.c(r7)
            if (r8 <= r6) goto L10f
            r6 = r8
        L10f:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            eo r8 = (defpackage.eo) r8
            ai r12 = r0.r
            int r7 = r12.d(r7)
            float r7 = (float) r7
            r12 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r12
            int r8 = r8.f
            float r8 = (float) r8
            float r7 = r7 / r8
            int r8 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r8 <= 0) goto L128
            r1 = r7
        L128:
            int r2 = r2 + 1
            goto Lcd
        L12b:
            if (r9 == 0) goto L156
            int r2 = r0.F
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r1 = java.lang.Math.max(r1, r10)
            r0.c1(r1)
            r6 = 0
            r12 = 0
        L13e:
            if (r12 >= r13) goto L156
            android.view.View[] r1 = r0.H
            r1 = r1[r12]
            r2 = 1073741824(0x40000000, float:2.0)
            r14 = 1
            r0.i1(r1, r2, r14)
            ai r2 = r0.r
            int r1 = r2.c(r1)
            if (r1 <= r6) goto L153
            r6 = r1
        L153:
            int r12 = r12 + 1
            goto L13e
        L156:
            r12 = 0
        L157:
            if (r12 >= r13) goto L1c6
            android.view.View[] r1 = r0.H
            r1 = r1[r12]
            ai r2 = r0.r
            int r2 = r2.c(r1)
            if (r2 == r6) goto L1c0
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            eo r2 = (defpackage.eo) r2
            android.graphics.Rect r5 = r2.b
            int r7 = r5.top
            int r8 = r5.bottom
            int r7 = r7 + r8
            int r8 = r2.topMargin
            int r7 = r7 + r8
            int r8 = r2.bottomMargin
            int r7 = r7 + r8
            int r8 = r5.left
            int r5 = r5.right
            int r8 = r8 + r5
            int r5 = r2.leftMargin
            int r8 = r8 + r5
            int r5 = r2.rightMargin
            int r8 = r8 + r5
            int r5 = r2.e
            int r9 = r2.f
            int r5 = r0.e1(r5, r9)
            int r9 = r0.p
            r14 = 1
            if (r9 != r14) goto L1a0
            int r2 = r2.width
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            int r2 = defpackage.nz.w(r9, r5, r10, r8, r2)
            int r5 = r6 - r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L1b0
        L1a0:
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            int r8 = r6 - r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            int r2 = r2.height
            int r5 = defpackage.nz.w(r9, r5, r10, r7, r2)
            r2 = r8
        L1b0:
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            oz r7 = (defpackage.oz) r7
            boolean r7 = r0.u0(r1, r2, r5, r7)
            if (r7 == 0) goto L1c3
            r1.measure(r2, r5)
            goto L1c3
        L1c0:
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
        L1c3:
            int r12 = r12 + 1
            goto L157
        L1c6:
            r9 = 0
            r4.a = r6
            int r1 = r0.p
            r14 = 1
            if (r1 != r14) goto L1e2
            int r1 = r3.f
            r8 = -1
            if (r1 != r8) goto L1dd
            int r12 = r3.b
            int r1 = r12 - r6
            r2 = r12
            r12 = r1
            r1 = r2
        L1da:
            r2 = r9
            r3 = r2
            goto L1f8
        L1dd:
            int r12 = r3.b
            int r1 = r12 + r6
            goto L1da
        L1e2:
            r8 = -1
            int r1 = r3.f
            if (r1 != r8) goto L1f0
            int r12 = r3.b
            int r1 = r12 - r6
            r2 = r1
            r1 = r9
            r3 = r12
        L1ee:
            r12 = r1
            goto L1f8
        L1f0:
            int r12 = r3.b
            int r1 = r12 + r6
            r3 = r1
            r1 = r9
            r2 = r12
            goto L1ee
        L1f8:
            r7 = r9
        L1f9:
            if (r7 >= r13) goto L278
            android.view.View[] r5 = r0.H
            r5 = r5[r7]
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            eo r6 = (defpackage.eo) r6
            int r8 = r0.p
            r14 = 1
            if (r8 != r14) goto L23f
            boolean r2 = r0.Q0()
            if (r2 == 0) goto L22c
            int r2 = r0.C()
            int[] r3 = r0.G
            int r8 = r0.F
            int r9 = r6.e
            int r8 = r8 - r9
            r3 = r3[r8]
            int r2 = r2 + r3
            ai r3 = r0.r
            int r3 = r3.d(r5)
            int r3 = r2 - r3
            r17 = r3
            r3 = r2
            r2 = r17
            goto L253
        L22c:
            int r2 = r0.C()
            int[] r3 = r0.G
            int r8 = r6.e
            r3 = r3[r8]
            int r2 = r2 + r3
            ai r3 = r0.r
            int r3 = r3.d(r5)
            int r3 = r3 + r2
            goto L253
        L23f:
            int r1 = r0.E()
            int[] r8 = r0.G
            int r9 = r6.e
            r8 = r8[r9]
            int r1 = r1 + r8
            ai r8 = r0.r
            int r8 = r8.d(r5)
            int r8 = r8 + r1
            r12 = r1
            r1 = r8
        L253:
            defpackage.nz.L(r5, r2, r12, r3, r1)
            b00 r8 = r6.a
            boolean r8 = r8.h()
            if (r8 != 0) goto L266
            b00 r6 = r6.a
            boolean r6 = r6.k()
            if (r6 == 0) goto L268
        L266:
            r14 = 1
            goto L26a
        L268:
            r14 = 1
            goto L26c
        L26a:
            r4.c = r14
        L26c:
            boolean r6 = r4.d
            boolean r5 = r5.hasFocusable()
            r5 = r5 | r6
            r4.d = r5
            int r7 = r7 + 1
            goto L1f9
        L278:
            android.view.View[] r1 = r0.H
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            return
    }

    @Override // defpackage.nz
    public final void S(defpackage.tz r3, defpackage.yz r4, android.view.View r5, defpackage.j0 r6) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            boolean r1 = r0 instanceof defpackage.eo
            if (r1 != 0) goto Lc
            r2.T(r5, r6)
            return
        Lc:
            eo r0 = (defpackage.eo) r0
            b00 r5 = r0.a
            int r5 = r5.b()
            int r3 = r2.f1(r5, r3, r4)
            int r4 = r2.p
            r5 = 0
            r1 = 1
            if (r4 != 0) goto L2a
            int r4 = r0.e
            int r0 = r0.f
            i0 r3 = defpackage.i0.a(r5, r4, r0, r3, r1)
            r6.f(r3)
            return
        L2a:
            int r4 = r0.e
            int r0 = r0.f
            i0 r3 = defpackage.i0.a(r5, r3, r1, r4, r0)
            r6.f(r3)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void S0(defpackage.tz r5, defpackage.yz r6, defpackage.uq r7, int r8) {
            r4 = this;
            r4.k1()
            int r0 = r6.b()
            if (r0 <= 0) goto L40
            boolean r0 = r6.g
            if (r0 != 0) goto L40
            r0 = 1
            if (r8 != r0) goto L12
            r8 = r0
            goto L13
        L12:
            r8 = 0
        L13:
            int r1 = r7.b
            int r1 = r4.g1(r1, r5, r6)
            if (r8 == 0) goto L2a
        L1b:
            if (r1 <= 0) goto L40
            int r8 = r7.b
            if (r8 <= 0) goto L40
            int r8 = r8 + (-1)
            r7.b = r8
            int r1 = r4.g1(r8, r5, r6)
            goto L1b
        L2a:
            int r8 = r6.b()
            int r8 = r8 - r0
            int r0 = r7.b
        L31:
            if (r0 >= r8) goto L3e
            int r2 = r0 + 1
            int r3 = r4.g1(r2, r5, r6)
            if (r3 <= r1) goto L3e
            r0 = r2
            r1 = r3
            goto L31
        L3e:
            r7.b = r0
        L40:
            r4.d1()
            return
    }

    @Override // defpackage.nz
    public final void U(int r1, int r2) {
            r0 = this;
            d4 r1 = r0.K
            r1.x()
            java.lang.Object r1 = r1.c
            android.util.SparseIntArray r1 = (android.util.SparseIntArray) r1
            r1.clear()
            return
    }

    @Override // defpackage.nz
    public final void V() {
            r1 = this;
            d4 r0 = r1.K
            r0.x()
            java.lang.Object r0 = r0.c
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // defpackage.nz
    public final void W(int r1, int r2) {
            r0 = this;
            d4 r1 = r0.K
            r1.x()
            java.lang.Object r1 = r1.c
            android.util.SparseIntArray r1 = (android.util.SparseIntArray) r1
            r1.clear()
            return
    }

    @Override // defpackage.nz
    public final void X(int r1, int r2) {
            r0 = this;
            d4 r1 = r0.K
            r1.x()
            java.lang.Object r1 = r1.c
            android.util.SparseIntArray r1 = (android.util.SparseIntArray) r1
            r1.clear()
            return
    }

    @Override // defpackage.nz
    public final void Y(int r1, int r2) {
            r0 = this;
            d4 r1 = r0.K
            r1.x()
            java.lang.Object r1 = r1.c
            android.util.SparseIntArray r1 = (android.util.SparseIntArray) r1
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y0(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.Y0(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final void Z(defpackage.tz r8, defpackage.yz r9) {
            r7 = this;
            boolean r0 = r9.g
            android.util.SparseIntArray r1 = r7.J
            android.util.SparseIntArray r2 = r7.I
            if (r0 == 0) goto L2c
            int r0 = r7.v()
            r3 = 0
        Ld:
            if (r3 >= r0) goto L2c
            android.view.View r4 = r7.u(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            eo r4 = (defpackage.eo) r4
            b00 r5 = r4.a
            int r5 = r5.b()
            int r6 = r4.f
            r2.put(r5, r6)
            int r4 = r4.e
            r1.put(r5, r4)
            int r3 = r3 + 1
            goto Ld
        L2c:
            super.Z(r8, r9)
            r2.clear()
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final void a0(defpackage.yz r1) {
            r0 = this;
            super.a0(r1)
            r1 = 0
            r0.E = r1
            return
    }

    public final void c1(int r8) {
            r7 = this;
            int[] r0 = r7.G
            int r1 = r7.F
            r2 = 1
            if (r0 == 0) goto L12
            int r3 = r0.length
            int r4 = r1 + 1
            if (r3 != r4) goto L12
            int r3 = r0.length
            int r3 = r3 - r2
            r3 = r0[r3]
            if (r3 == r8) goto L16
        L12:
            int r0 = r1 + 1
            int[] r0 = new int[r0]
        L16:
            r3 = 0
            r0[r3] = r3
            int r4 = r8 / r1
            int r8 = r8 % r1
            r5 = r3
        L1d:
            if (r2 > r1) goto L31
            int r3 = r3 + r8
            if (r3 <= 0) goto L2a
            int r6 = r1 - r3
            if (r6 >= r8) goto L2a
            int r6 = r4 + 1
            int r3 = r3 - r1
            goto L2b
        L2a:
            r6 = r4
        L2b:
            int r5 = r5 + r6
            r0[r2] = r5
            int r2 = r2 + 1
            goto L1d
        L31:
            r7.G = r0
            return
    }

    public final void d1() {
            r2 = this;
            android.view.View[] r0 = r2.H
            if (r0 == 0) goto Lb
            int r0 = r0.length
            int r1 = r2.F
            if (r0 == r1) goto La
            goto Lb
        La:
            return
        Lb:
            int r0 = r2.F
            android.view.View[] r0 = new android.view.View[r0]
            r2.H = r0
            return
    }

    public final int e1(int r4, int r5) {
            r3 = this;
            int r0 = r3.p
            r1 = 1
            if (r0 != r1) goto L19
            boolean r0 = r3.Q0()
            if (r0 == 0) goto L19
            int[] r0 = r3.G
            int r1 = r3.F
            int r2 = r1 - r4
            r2 = r0[r2]
            int r1 = r1 - r4
            int r1 = r1 - r5
            r4 = r0[r1]
            int r2 = r2 - r4
            return r2
        L19:
            int[] r0 = r3.G
            int r5 = r5 + r4
            r5 = r0[r5]
            r4 = r0[r4]
            int r5 = r5 - r4
            return r5
    }

    @Override // defpackage.nz
    public final boolean f(defpackage.oz r1) {
            r0 = this;
            boolean r1 = r1 instanceof defpackage.eo
            return r1
    }

    public final int f1(int r2, defpackage.tz r3, defpackage.yz r4) {
            r1 = this;
            boolean r4 = r4.g
            d4 r0 = r1.K
            if (r4 != 0) goto L10
            int r3 = r1.F
            r0.getClass()
            int r2 = defpackage.d4.v(r2, r3)
            return r2
        L10:
            int r3 = r3.b(r2)
            r4 = -1
            if (r3 != r4) goto L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot find span size for pre layout position. "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L2c:
            int r2 = r1.F
            r0.getClass()
            int r2 = defpackage.d4.v(r3, r2)
            return r2
    }

    public final int g1(int r3, defpackage.tz r4, defpackage.yz r5) {
            r2 = this;
            boolean r5 = r5.g
            d4 r0 = r2.K
            if (r5 != 0) goto Ld
            int r4 = r2.F
            r0.getClass()
            int r3 = r3 % r4
            return r3
        Ld:
            android.util.SparseIntArray r5 = r2.J
            r1 = -1
            int r5 = r5.get(r3, r1)
            if (r5 == r1) goto L17
            return r5
        L17:
            int r4 = r4.b(r3)
            if (r4 != r1) goto L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "GridLayoutManager"
            android.util.Log.w(r4, r3)
            r3 = 0
            return r3
        L32:
            int r3 = r2.F
            r0.getClass()
            int r4 = r4 % r3
            return r4
    }

    public final int h1(int r4, defpackage.tz r5, defpackage.yz r6) {
            r3 = this;
            boolean r6 = r6.g
            d4 r0 = r3.K
            r1 = 1
            if (r6 != 0) goto Lb
            r0.getClass()
            return r1
        Lb:
            android.util.SparseIntArray r6 = r3.I
            r2 = -1
            int r6 = r6.get(r4, r2)
            if (r6 == r2) goto L15
            return r6
        L15:
            int r5 = r5.b(r4)
            if (r5 != r2) goto L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "GridLayoutManager"
            android.util.Log.w(r5, r4)
            return r1
        L2f:
            r0.getClass()
            return r1
    }

    public final void i1(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            eo r0 = (defpackage.eo) r0
            android.graphics.Rect r1 = r0.b
            int r2 = r1.top
            int r3 = r1.bottom
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r1 = r1.right
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r1 = r0.e
            int r4 = r0.f
            int r1 = r8.e1(r1, r4)
            int r4 = r8.p
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L41
            int r4 = r0.width
            int r10 = defpackage.nz.w(r5, r1, r10, r3, r4)
            ai r1 = r8.r
            int r1 = r1.l()
            int r3 = r8.m
            int r0 = r0.height
            int r0 = defpackage.nz.w(r6, r1, r3, r2, r0)
            goto L58
        L41:
            int r4 = r0.height
            int r10 = defpackage.nz.w(r5, r1, r10, r2, r4)
            ai r1 = r8.r
            int r1 = r1.l()
            int r2 = r8.l
            int r0 = r0.width
            int r0 = defpackage.nz.w(r6, r1, r2, r3, r0)
            r7 = r0
            r0 = r10
            r10 = r7
        L58:
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            oz r1 = (defpackage.oz) r1
            if (r11 == 0) goto L65
            boolean r11 = r8.u0(r9, r10, r0, r1)
            goto L69
        L65:
            boolean r11 = r8.s0(r9, r10, r0, r1)
        L69:
            if (r11 == 0) goto L6e
            r9.measure(r10, r0)
        L6e:
            return
    }

    public final void j1(int r4) {
            r3 = this;
            int r0 = r3.F
            if (r4 != r0) goto L5
            return
        L5:
            r0 = 1
            r3.E = r0
            if (r4 < r0) goto L15
            r3.F = r4
            d4 r4 = r3.K
            r4.x()
            r3.j0()
            return
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Span count should be at least 1. Provided "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int k(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.B0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int k0(int r1, defpackage.tz r2, defpackage.yz r3) {
            r0 = this;
            r0.k1()
            r0.d1()
            int r1 = super.k0(r1, r2, r3)
            return r1
    }

    public final void k1() {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L12
            int r0 = r2.n
            int r1 = r2.D()
            int r0 = r0 - r1
            int r1 = r2.C()
        L10:
            int r0 = r0 - r1
            goto L1e
        L12:
            int r0 = r2.o
            int r1 = r2.B()
            int r0 = r0 - r1
            int r1 = r2.E()
            goto L10
        L1e:
            r2.c1(r0)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int l(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.C0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int m0(int r1, defpackage.tz r2, defpackage.yz r3) {
            r0 = this;
            r0.k1()
            r0.d1()
            int r1 = super.m0(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int n(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.B0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int o(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.C0(r1)
            return r1
    }

    @Override // defpackage.nz
    public final void p0(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.G
            if (r0 != 0) goto L7
            super.p0(r5, r6, r7)
        L7:
            int r0 = r4.C()
            int r1 = r4.D()
            int r1 = r1 + r0
            int r0 = r4.E()
            int r2 = r4.B()
            int r2 = r2 + r0
            int r0 = r4.p
            r3 = 1
            if (r0 != r3) goto L41
            int r5 = r5.height()
            int r5 = r5 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            java.util.WeakHashMap r2 = defpackage.ja0.a
            int r0 = defpackage.s90.d(r0)
            int r5 = defpackage.nz.g(r7, r5, r0)
            int[] r7 = r4.G
            int r0 = r7.length
            int r0 = r0 - r3
            r7 = r7[r0]
            int r7 = r7 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            int r0 = defpackage.s90.e(r0)
            int r6 = defpackage.nz.g(r6, r7, r0)
            goto L63
        L41:
            int r5 = r5.width()
            int r5 = r5 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r0 = defpackage.s90.e(r0)
            int r6 = defpackage.nz.g(r6, r5, r0)
            int[] r5 = r4.G
            int r0 = r5.length
            int r0 = r0 - r3
            r5 = r5[r0]
            int r5 = r5 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            int r0 = defpackage.s90.d(r0)
            int r5 = defpackage.nz.g(r7, r5, r0)
        L63:
            androidx.recyclerview.widget.RecyclerView r7 = r4.b
            androidx.recyclerview.widget.RecyclerView.e(r7, r6, r5)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final defpackage.oz r() {
            r3 = this;
            int r0 = r3.p
            r1 = -1
            r2 = -2
            if (r0 != 0) goto Lc
            eo r0 = new eo
            r0.<init>(r2, r1)
            return r0
        Lc:
            eo r0 = new eo
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.nz
    public final defpackage.oz s(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            eo r0 = new eo
            r0.<init>(r2, r3)
            r2 = -1
            r0.e = r2
            r2 = 0
            r0.f = r2
            return r0
    }

    @Override // defpackage.nz
    public final defpackage.oz t(android.view.ViewGroup.LayoutParams r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L12
            eo r0 = new eo
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r0.<init>(r4)
            r0.e = r2
            r0.f = r1
            return r0
        L12:
            eo r0 = new eo
            r0.<init>(r4)
            r0.e = r2
            r0.f = r1
            return r0
    }

    @Override // defpackage.nz
    public final int x(defpackage.tz r3, defpackage.yz r4) {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L8
            int r3 = r2.F
            return r3
        L8:
            int r0 = r4.b()
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.b()
            int r0 = r0 - r1
            int r3 = r2.f1(r0, r3, r4)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final boolean x0() {
            r1 = this;
            xq r0 = r1.z
            if (r0 != 0) goto La
            boolean r0 = r1.E
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(defpackage.yz r6, defpackage.wq r7, defpackage.bn r8) {
            r5 = this;
            int r0 = r5.F
            r1 = 0
            r2 = r1
        L4:
            int r3 = r5.F
            if (r2 >= r3) goto L30
            int r3 = r7.d
            if (r3 < 0) goto L30
            int r4 = r6.b()
            if (r3 >= r4) goto L30
            if (r0 <= 0) goto L30
            int r3 = r7.d
            int r4 = r7.g
            int r4 = java.lang.Math.max(r1, r4)
            r8.a(r3, r4)
            d4 r3 = r5.K
            r3.getClass()
            int r0 = r0 + (-1)
            int r3 = r7.d
            int r4 = r7.e
            int r3 = r3 + r4
            r7.d = r3
            int r2 = r2 + 1
            goto L4
        L30:
            return
    }
}
