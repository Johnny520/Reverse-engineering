package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public android.view.View[] H;
    public final android.util.SparseIntArray I;
    public final android.util.SparseIntArray J;
    public final androidx.recyclerview.widget.GridLayoutManager.a K;
    public final android.graphics.Rect L;

    public static final class a extends androidx.recyclerview.widget.GridLayoutManager.c {
    }

    public static class b extends androidx.recyclerview.widget.RecyclerView.m {
        public int e;
        public int f;

        public b(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.e = r1
                r1 = 0
                r0.f = r1
                return
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.util.SparseIntArray f957a;
        public final android.util.SparseIntArray b;

        public c() {
                r1 = this;
                r1.<init>()
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.f957a = r0
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.b = r0
                return
        }

        public static int a(int r5, int r6) {
                r0 = 0
                r1 = r0
                r2 = r1
                r3 = r2
            L4:
                r4 = 1
                if (r1 >= r5) goto L17
                int r2 = r2 + 1
                if (r2 != r6) goto Lf
                int r3 = r3 + 1
                r2 = r0
                goto L14
            Lf:
                if (r2 <= r6) goto L14
                int r3 = r3 + 1
                r2 = r4
            L14:
                int r1 = r1 + 1
                goto L4
            L17:
                int r2 = r2 + r4
                if (r2 <= r6) goto L1b
                int r3 = r3 + r4
            L1b:
                return r3
        }

        public final void b() {
                r1 = this;
                android.util.SparseIntArray r0 = r1.f957a
                r0.clear()
                return
        }
    }

    public GridLayoutManager(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r0 = 0
            r1.E = r0
            r0 = -1
            r1.F = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.I = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.J = r0
            androidx.recyclerview.widget.GridLayoutManager$a r0 = new androidx.recyclerview.widget.GridLayoutManager$a
            r0.<init>()
            r1.K = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.L = r0
            r1.n1(r2)
            return
    }

    public GridLayoutManager(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            r0 = 0
            r1.E = r0
            r0 = -1
            r1.F = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.I = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.J = r0
            androidx.recyclerview.widget.GridLayoutManager$a r0 = new androidx.recyclerview.widget.GridLayoutManager$a
            r0.<init>()
            r1.K = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.L = r0
            androidx.recyclerview.widget.RecyclerView$l$c r2 = androidx.recyclerview.widget.RecyclerView.l.I(r2, r3, r4, r5)
            int r2 = r2.b
            r1.n1(r2)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final boolean B0() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r1.z
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
    public final void D0(androidx.recyclerview.widget.RecyclerView.w r6, androidx.recyclerview.widget.LinearLayoutManager.c r7, androidx.recyclerview.widget.m.b r8) {
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
            androidx.recyclerview.widget.GridLayoutManager$a r3 = r5.K
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

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int J(androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4) {
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
            int r3 = r2.j1(r0, r3, r4)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final android.view.View P0(androidx.recyclerview.widget.RecyclerView.r r10, androidx.recyclerview.widget.RecyclerView.w r11, boolean r12, boolean r13) {
            r9 = this;
            int r12 = r9.v()
            r0 = 1
            if (r13 == 0) goto Lf
            int r12 = r9.v()
            int r12 = r12 - r0
            r13 = -1
            r0 = r13
            goto L13
        Lf:
            r13 = 0
            r8 = r13
            r13 = r12
            r12 = r8
        L13:
            int r1 = r11.b()
            r9.I0()
            androidx.recyclerview.widget.s r2 = r9.r
            int r2 = r2.k()
            androidx.recyclerview.widget.s r3 = r9.r
            int r3 = r3.g()
            r4 = 0
            r5 = r4
        L28:
            if (r12 == r13) goto L66
            android.view.View r6 = r9.u(r12)
            int r7 = androidx.recyclerview.widget.RecyclerView.l.H(r6)
            if (r7 < 0) goto L64
            if (r7 >= r1) goto L64
            int r7 = r9.k1(r7, r10, r11)
            if (r7 == 0) goto L3d
            goto L64
        L3d:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r7 = (androidx.recyclerview.widget.RecyclerView.m) r7
            androidx.recyclerview.widget.RecyclerView$A r7 = r7.f975a
            boolean r7 = r7.h()
            if (r7 == 0) goto L4f
            if (r5 != 0) goto L64
            r5 = r6
            goto L64
        L4f:
            androidx.recyclerview.widget.s r7 = r9.r
            int r7 = r7.e(r6)
            if (r7 >= r3) goto L61
            androidx.recyclerview.widget.s r7 = r9.r
            int r7 = r7.b(r6)
            if (r7 >= r2) goto L60
            goto L61
        L60:
            return r6
        L61:
            if (r4 != 0) goto L64
            r4 = r6
        L64:
            int r12 = r12 + r0
            goto L28
        L66:
            if (r4 == 0) goto L69
            return r4
        L69:
            return r5
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final android.view.View T(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.r r25, androidx.recyclerview.widget.RecyclerView.w r26) {
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            r4 = 0
            if (r3 != 0) goto Le
            r5 = r23
            goto L21
        Le:
            r5 = r23
            android.view.View r3 = r3.D(r5)
            if (r3 != 0) goto L17
            goto L21
        L17:
            androidx.recyclerview.widget.b r6 = r0.f971a
            java.util.ArrayList r6 = r6.c
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L22
        L21:
            r3 = r4
        L22:
            if (r3 != 0) goto L25
            goto L36
        L25:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r6 = (androidx.recyclerview.widget.GridLayoutManager.b) r6
            int r7 = r6.e
            int r6 = r6.f
            int r6 = r6 + r7
            android.view.View r5 = super.T(r23, r24, r25, r26)
            if (r5 != 0) goto L37
        L36:
            return r4
        L37:
            r5 = r24
            int r5 = r0.H0(r5)
            r9 = 1
            if (r5 != r9) goto L42
            r5 = r9
            goto L43
        L42:
            r5 = 0
        L43:
            boolean r10 = r0.u
            r11 = -1
            if (r5 == r10) goto L50
            int r5 = r0.v()
            int r5 = r5 - r9
            r10 = r11
            r12 = r10
            goto L57
        L50:
            int r5 = r0.v()
            r10 = r5
            r12 = r9
            r5 = 0
        L57:
            int r13 = r0.p
            if (r13 != r9) goto L63
            boolean r13 = r0.U0()
            if (r13 == 0) goto L63
            r13 = r9
            goto L64
        L63:
            r13 = 0
        L64:
            int r14 = r0.j1(r5, r1, r2)
            r16 = r4
            r8 = r11
            r15 = r8
            r9 = 0
            r11 = r5
            r4 = 0
            r5 = r16
        L71:
            r17 = r5
            if (r11 == r10) goto L140
            int r5 = r0.j1(r11, r1, r2)
            android.view.View r1 = r0.u(r11)
            if (r1 != r3) goto L81
            goto L140
        L81:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L95
            if (r5 == r14) goto L95
            if (r16 == 0) goto L8d
            goto L140
        L8d:
            r18 = r3
            r19 = r9
            r21 = r10
            goto L131
        L95:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r2 = r5.e
            r18 = r3
            int r3 = r5.f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Lad
            if (r2 != r7) goto Lad
            if (r3 != r6) goto Lad
            return r1
        Lad:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Lb5
            if (r16 == 0) goto Lbd
        Lb5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto Lc2
            if (r17 != 0) goto Lc2
        Lbd:
            r19 = r9
            r21 = r10
            goto L107
        Lc2:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Le6
            if (r10 <= r9) goto Ld9
        Ld6:
            r19 = r9
            goto L107
        Ld9:
            if (r10 != r9) goto Le3
            if (r2 <= r15) goto Ldf
            r10 = 1
            goto Le0
        Ldf:
            r10 = 0
        Le0:
            if (r13 != r10) goto Le3
            goto Ld6
        Le3:
            r19 = r9
            goto L131
        Le6:
            if (r16 != 0) goto Le3
            r19 = r9
            androidx.recyclerview.widget.B r9 = r0.c
            boolean r9 = r9.b(r1)
            if (r9 == 0) goto Lfb
            androidx.recyclerview.widget.B r9 = r0.d
            boolean r9 = r9.b(r1)
            if (r9 == 0) goto Lfb
            goto L131
        Lfb:
            if (r10 <= r4) goto Lfe
            goto L107
        Lfe:
            if (r10 != r4) goto L131
            if (r2 <= r8) goto L104
            r9 = 1
            goto L105
        L104:
            r9 = 0
        L105:
            if (r13 != r9) goto L131
        L107:
            boolean r9 = r1.hasFocusable()
            if (r9 == 0) goto L11f
            int r5 = r5.e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r9 = r3 - r2
            r16 = r1
            r15 = r5
            r5 = r17
            goto L135
        L11f:
            int r4 = r5.e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r2 = r3 - r2
            r5 = r1
            r8 = r4
            r9 = r19
            r4 = r2
            goto L135
        L131:
            r5 = r17
            r9 = r19
        L135:
            int r11 = r11 + r12
            r1 = r25
            r2 = r26
            r3 = r18
            r10 = r21
            goto L71
        L140:
            if (r16 == 0) goto L143
            return r16
        L143:
            return r17
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void V(androidx.recyclerview.widget.RecyclerView.r r1, androidx.recyclerview.widget.RecyclerView.w r2, a.I r3) {
            r0 = this;
            super.V(r1, r2, r3)
            java.lang.Class<android.widget.GridView> r1 = android.widget.GridView.class
            java.lang.String r1 = r1.getName()
            r3.h(r1)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(androidx.recyclerview.widget.RecyclerView.r r19, androidx.recyclerview.widget.RecyclerView.w r20, androidx.recyclerview.widget.LinearLayoutManager.c r21, androidx.recyclerview.widget.LinearLayoutManager.b r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            androidx.recyclerview.widget.s r5 = r0.r
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
            r0.o1()
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
            int r12 = r0.k1(r12, r1, r2)
            int r13 = r3.d
            int r13 = r0.l1(r13, r1, r2)
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
            int r15 = r0.l1(r14, r1, r2)
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
            androidx.recyclerview.widget.GridLayoutManager$b r8 = (androidx.recyclerview.widget.GridLayoutManager.b) r8
            int r7 = androidx.recyclerview.widget.RecyclerView.l.H(r7)
            int r7 = r0.l1(r7, r1, r2)
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
            java.util.List<androidx.recyclerview.widget.RecyclerView$A> r8 = r3.k
            if (r8 != 0) goto Le5
            if (r11 == 0) goto Ldf
            r8 = 0
            r12 = -1
            r0.b(r7, r12, r8)
            goto Lf2
        Ldf:
            r8 = 0
            r12 = -1
            r0.b(r7, r8, r8)
            goto Lf2
        Le5:
            r8 = 0
            r12 = -1
            if (r11 == 0) goto Lee
            r14 = 1
            r0.b(r7, r12, r14)
            goto Lf2
        Lee:
            r14 = 1
            r0.b(r7, r8, r14)
        Lf2:
            androidx.recyclerview.widget.RecyclerView r12 = r0.b
            android.graphics.Rect r14 = r0.L
            if (r12 != 0) goto Lfc
            r14.set(r8, r8, r8, r8)
            goto L103
        Lfc:
            android.graphics.Rect r12 = r12.M(r7)
            r14.set(r12)
        L103:
            r0.m1(r7, r5, r8)
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.c(r7)
            if (r8 <= r6) goto L10f
            r6 = r8
        L10f:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r8 = (androidx.recyclerview.widget.GridLayoutManager.b) r8
            androidx.recyclerview.widget.s r12 = r0.r
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
            r0.g1(r1)
            r6 = 0
            r8 = 0
        L13e:
            if (r8 >= r13) goto L156
            android.view.View[] r1 = r0.H
            r1 = r1[r8]
            r2 = 1073741824(0x40000000, float:2.0)
            r14 = 1
            r0.m1(r1, r2, r14)
            androidx.recyclerview.widget.s r2 = r0.r
            int r1 = r2.c(r1)
            if (r1 <= r6) goto L153
            r6 = r1
        L153:
            int r8 = r8 + 1
            goto L13e
        L156:
            r8 = 0
        L157:
            if (r8 >= r13) goto L1c6
            android.view.View[] r1 = r0.H
            r1 = r1[r8]
            androidx.recyclerview.widget.s r2 = r0.r
            int r2 = r2.c(r1)
            if (r2 == r6) goto L1c0
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r2 = (androidx.recyclerview.widget.GridLayoutManager.b) r2
            android.graphics.Rect r5 = r2.b
            int r7 = r5.top
            int r9 = r5.bottom
            int r7 = r7 + r9
            int r9 = r2.topMargin
            int r7 = r7 + r9
            int r9 = r2.bottomMargin
            int r7 = r7 + r9
            int r9 = r5.left
            int r5 = r5.right
            int r9 = r9 + r5
            int r5 = r2.leftMargin
            int r9 = r9 + r5
            int r5 = r2.rightMargin
            int r9 = r9 + r5
            int r5 = r2.e
            int r10 = r2.f
            int r5 = r0.i1(r5, r10)
            int r10 = r0.p
            r14 = 1
            if (r10 != r14) goto L1a0
            int r2 = r2.width
            r10 = 0
            r11 = 1073741824(0x40000000, float:2.0)
            int r2 = androidx.recyclerview.widget.RecyclerView.l.w(r10, r5, r11, r9, r2)
            int r5 = r6 - r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L1b0
        L1a0:
            r10 = 0
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = r6 - r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r2 = r2.height
            int r5 = androidx.recyclerview.widget.RecyclerView.l.w(r10, r5, r11, r7, r2)
            r2 = r9
        L1b0:
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r7 = (androidx.recyclerview.widget.RecyclerView.m) r7
            boolean r7 = r0.y0(r1, r2, r5, r7)
            if (r7 == 0) goto L1c3
            r1.measure(r2, r5)
            goto L1c3
        L1c0:
            r10 = 0
            r11 = 1073741824(0x40000000, float:2.0)
        L1c3:
            int r8 = r8 + 1
            goto L157
        L1c6:
            r10 = 0
            r4.f959a = r6
            int r1 = r0.p
            r14 = 1
            if (r1 != r14) goto L1e4
            int r1 = r3.f
            r12 = -1
            if (r1 != r12) goto L1db
            int r8 = r3.b
            int r1 = r8 - r6
            r3 = r1
            r1 = r10
            r2 = r1
            goto L1f8
        L1db:
            int r8 = r3.b
            int r1 = r8 + r6
            r3 = r8
            r2 = r10
            r8 = r1
            r1 = r2
            goto L1f8
        L1e4:
            r12 = -1
            int r1 = r3.f
            if (r1 != r12) goto L1f1
            int r8 = r3.b
            int r1 = r8 - r6
            r2 = r8
        L1ee:
            r3 = r10
            r8 = r3
            goto L1f8
        L1f1:
            int r8 = r3.b
            int r1 = r8 + r6
            r2 = r1
            r1 = r8
            goto L1ee
        L1f8:
            r7 = r10
        L1f9:
            if (r7 >= r13) goto L276
            android.view.View[] r5 = r0.H
            r5 = r5[r7]
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r6 = (androidx.recyclerview.widget.GridLayoutManager.b) r6
            int r9 = r0.p
            r14 = 1
            if (r9 != r14) goto L23f
            boolean r1 = r0.U0()
            if (r1 == 0) goto L22c
            int r1 = r0.E()
            int[] r2 = r0.G
            int r9 = r0.F
            int r10 = r6.e
            int r9 = r9 - r10
            r2 = r2[r9]
            int r1 = r1 + r2
            androidx.recyclerview.widget.s r2 = r0.r
            int r2 = r2.d(r5)
            int r2 = r1 - r2
            r17 = r2
            r2 = r1
            r1 = r17
            goto L251
        L22c:
            int r1 = r0.E()
            int[] r2 = r0.G
            int r9 = r6.e
            r2 = r2[r9]
            int r1 = r1 + r2
            androidx.recyclerview.widget.s r2 = r0.r
            int r2 = r2.d(r5)
            int r2 = r2 + r1
            goto L251
        L23f:
            int r3 = r0.G()
            int[] r8 = r0.G
            int r9 = r6.e
            r8 = r8[r9]
            int r3 = r3 + r8
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.d(r5)
            int r8 = r8 + r3
        L251:
            androidx.recyclerview.widget.RecyclerView.l.N(r5, r1, r3, r2, r8)
            androidx.recyclerview.widget.RecyclerView$A r9 = r6.f975a
            boolean r9 = r9.h()
            if (r9 != 0) goto L264
            androidx.recyclerview.widget.RecyclerView$A r6 = r6.f975a
            boolean r6 = r6.k()
            if (r6 == 0) goto L266
        L264:
            r14 = 1
            goto L268
        L266:
            r14 = 1
            goto L26a
        L268:
            r4.c = r14
        L26a:
            boolean r6 = r4.d
            boolean r5 = r5.hasFocusable()
            r5 = r5 | r6
            r4.d = r5
            int r7 = r7 + 1
            goto L1f9
        L276:
            android.view.View[] r1 = r0.H
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(androidx.recyclerview.widget.RecyclerView.r r5, androidx.recyclerview.widget.RecyclerView.w r6, androidx.recyclerview.widget.LinearLayoutManager.a r7, int r8) {
            r4 = this;
            r4.o1()
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
            int r1 = r4.k1(r1, r5, r6)
            if (r8 == 0) goto L2a
        L1b:
            if (r1 <= 0) goto L40
            int r8 = r7.b
            if (r8 <= 0) goto L40
            int r8 = r8 + (-1)
            r7.b = r8
            int r1 = r4.k1(r8, r5, r6)
            goto L1b
        L2a:
            int r8 = r6.b()
            int r8 = r8 - r0
            int r0 = r7.b
        L31:
            if (r0 >= r8) goto L3e
            int r2 = r0 + 1
            int r3 = r4.k1(r2, r5, r6)
            if (r3 <= r1) goto L3e
            r0 = r2
            r1 = r3
            goto L31
        L3e:
            r7.b = r0
        L40:
            r4.h1()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void X(androidx.recyclerview.widget.RecyclerView.r r8, androidx.recyclerview.widget.RecyclerView.w r9, android.view.View r10, a.I r11) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager.b
            if (r1 != 0) goto Lc
            r7.W(r10, r11)
            return
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$b r0 = (androidx.recyclerview.widget.GridLayoutManager.b) r0
            androidx.recyclerview.widget.RecyclerView$A r10 = r0.f975a
            int r10 = r10.b()
            int r1 = r7.j1(r10, r8, r9)
            int r8 = r7.p
            android.view.accessibility.AccessibilityNodeInfo r9 = r11.f118a
            if (r8 != 0) goto L2e
            r3 = r1
            int r1 = r0.e
            int r2 = r0.f
            r5 = 0
            r4 = 1
            r6 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r8 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
            r9.setCollectionItemInfo(r8)
            return
        L2e:
            r3 = r1
            int r8 = r0.e
            int r4 = r0.f
            r5 = 0
            r2 = 1
            r6 = 0
            r1 = r3
            r3 = r8
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r8 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
            r9.setCollectionItemInfo(r8)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y(int r1, int r2) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$a r1 = r0.K
            r1.b()
            android.util.SparseIntArray r1 = r1.b
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Z() {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$a r0 = r1.K
            r0.b()
            android.util.SparseIntArray r0 = r0.b
            r0.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void a0(int r1, int r2) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$a r1 = r0.K
            r1.b()
            android.util.SparseIntArray r1 = r1.b
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void b0(int r1, int r2) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$a r1 = r0.K
            r1.b()
            android.util.SparseIntArray r1 = r1.b
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c0(int r1, int r2) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$a r1 = r0.K
            r1.b()
            android.util.SparseIntArray r1 = r1.b
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.c1(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void d0(androidx.recyclerview.widget.RecyclerView.r r8, androidx.recyclerview.widget.RecyclerView.w r9) {
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
            androidx.recyclerview.widget.GridLayoutManager$b r4 = (androidx.recyclerview.widget.GridLayoutManager.b) r4
            androidx.recyclerview.widget.RecyclerView$A r5 = r4.f975a
            int r5 = r5.b()
            int r6 = r4.f
            r2.put(r5, r6)
            int r4 = r4.e
            r1.put(r5, r4)
            int r3 = r3 + 1
            goto Ld
        L2c:
            super.d0(r8, r9)
            r2.clear()
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void e0(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            super.e0(r1)
            r1 = 0
            r0.E = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f(androidx.recyclerview.widget.RecyclerView.m r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager.b
            return r1
    }

    public final void g1(int r8) {
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

    public final void h1() {
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

    public final int i1(int r4, int r5) {
            r3 = this;
            int r0 = r3.p
            r1 = 1
            if (r0 != r1) goto L19
            boolean r0 = r3.U0()
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

    public final int j1(int r2, androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4) {
            r1 = this;
            boolean r4 = r4.g
            androidx.recyclerview.widget.GridLayoutManager$a r0 = r1.K
            if (r4 != 0) goto L10
            int r3 = r1.F
            r0.getClass()
            int r2 = androidx.recyclerview.widget.GridLayoutManager.c.a(r2, r3)
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
            int r2 = androidx.recyclerview.widget.GridLayoutManager.c.a(r3, r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int k(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.F0(r1)
            return r1
    }

    public final int k1(int r3, androidx.recyclerview.widget.RecyclerView.r r4, androidx.recyclerview.widget.RecyclerView.w r5) {
            r2 = this;
            boolean r5 = r5.g
            androidx.recyclerview.widget.GridLayoutManager$a r0 = r2.K
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

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int l(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.G0(r1)
            return r1
    }

    public final int l1(int r4, androidx.recyclerview.widget.RecyclerView.r r5, androidx.recyclerview.widget.RecyclerView.w r6) {
            r3 = this;
            boolean r6 = r6.g
            androidx.recyclerview.widget.GridLayoutManager$a r0 = r3.K
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

    public final void m1(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r0 = (androidx.recyclerview.widget.GridLayoutManager.b) r0
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
            int r1 = r8.i1(r1, r4)
            int r4 = r8.p
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L41
            int r4 = r0.width
            int r10 = androidx.recyclerview.widget.RecyclerView.l.w(r5, r1, r10, r3, r4)
            androidx.recyclerview.widget.s r1 = r8.r
            int r1 = r1.l()
            int r3 = r8.m
            int r0 = r0.height
            int r0 = androidx.recyclerview.widget.RecyclerView.l.w(r6, r1, r3, r2, r0)
            goto L58
        L41:
            int r4 = r0.height
            int r10 = androidx.recyclerview.widget.RecyclerView.l.w(r5, r1, r10, r2, r4)
            androidx.recyclerview.widget.s r1 = r8.r
            int r1 = r1.l()
            int r2 = r8.l
            int r0 = r0.width
            int r0 = androidx.recyclerview.widget.RecyclerView.l.w(r6, r1, r2, r3, r0)
            r7 = r0
            r0 = r10
            r10 = r7
        L58:
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r1 = (androidx.recyclerview.widget.RecyclerView.m) r1
            if (r11 == 0) goto L65
            boolean r11 = r8.y0(r9, r10, r0, r1)
            goto L69
        L65:
            boolean r11 = r8.w0(r9, r10, r0, r1)
        L69:
            if (r11 == 0) goto L6e
            r9.measure(r10, r0)
        L6e:
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int n(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.F0(r1)
            return r1
    }

    public final void n1(int r3) {
            r2 = this;
            int r0 = r2.F
            if (r3 != r0) goto L5
            return
        L5:
            r0 = 1
            r2.E = r0
            if (r3 < r0) goto L15
            r2.F = r3
            androidx.recyclerview.widget.GridLayoutManager$a r3 = r2.K
            r3.b()
            r2.n0()
            return
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Span count should be at least 1. Provided "
            java.lang.String r3 = a.C0487z.e(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int o(androidx.recyclerview.widget.RecyclerView.w r1) {
            r0 = this;
            int r1 = r0.G0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int o0(int r1, androidx.recyclerview.widget.RecyclerView.r r2, androidx.recyclerview.widget.RecyclerView.w r3) {
            r0 = this;
            r0.o1()
            r0.h1()
            int r1 = super.o0(r1, r2, r3)
            return r1
    }

    public final void o1() {
            r2 = this;
            int r0 = r2.p
            r1 = 1
            if (r0 != r1) goto L12
            int r0 = r2.n
            int r1 = r2.F()
            int r0 = r0 - r1
            int r1 = r2.E()
        L10:
            int r0 = r0 - r1
            goto L1e
        L12:
            int r0 = r2.o
            int r1 = r2.D()
            int r0 = r0 - r1
            int r1 = r2.G()
            goto L10
        L1e:
            r2.g1(r0)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int q0(int r1, androidx.recyclerview.widget.RecyclerView.r r2, androidx.recyclerview.widget.RecyclerView.w r3) {
            r0 = this;
            r0.o1()
            r0.h1()
            int r1 = super.q0(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final androidx.recyclerview.widget.RecyclerView.m r() {
            r3 = this;
            int r0 = r3.p
            r1 = -1
            r2 = -2
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r2, r1)
            return r0
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final androidx.recyclerview.widget.RecyclerView.m s(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r2, r3)
            r2 = -1
            r0.e = r2
            r2 = 0
            r0.f = r2
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final androidx.recyclerview.widget.RecyclerView.m t(android.view.ViewGroup.LayoutParams r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r0.<init>(r4)
            r0.e = r2
            r0.f = r1
            return r0
        L12:
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r4)
            r0.e = r2
            r0.f = r1
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void t0(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.G
            if (r0 != 0) goto L7
            super.t0(r5, r6, r7)
        L7:
            int r0 = r4.E()
            int r1 = r4.F()
            int r1 = r1 + r0
            int r0 = r4.G()
            int r2 = r4.D()
            int r2 = r2 + r0
            int r0 = r4.p
            r3 = 1
            if (r0 != r3) goto L41
            int r5 = r5.height()
            int r5 = r5 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            int r0 = r0.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.l.g(r7, r5, r0)
            int[] r7 = r4.G
            int r0 = r7.length
            int r0 = r0 - r3
            r7 = r7[r0]
            int r7 = r7 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            int r0 = r0.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.l.g(r6, r7, r0)
            goto L63
        L41:
            int r5 = r5.width()
            int r5 = r5 + r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r0 = r0.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.l.g(r6, r5, r0)
            int[] r5 = r4.G
            int r0 = r5.length
            int r0 = r0 - r3
            r5 = r5[r0]
            int r5 = r5 + r2
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            int r0 = r0.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.l.g(r7, r5, r0)
        L63:
            androidx.recyclerview.widget.RecyclerView r7 = r4.b
            androidx.recyclerview.widget.RecyclerView.g(r7, r6, r5)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int x(androidx.recyclerview.widget.RecyclerView.r r3, androidx.recyclerview.widget.RecyclerView.w r4) {
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
            int r3 = r2.j1(r0, r3, r4)
            int r3 = r3 + r1
            return r3
    }
}
