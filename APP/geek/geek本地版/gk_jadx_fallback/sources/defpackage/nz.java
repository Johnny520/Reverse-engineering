package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nz {
    public defpackage.r5 a;
    public androidx.recyclerview.widget.RecyclerView b;
    public final defpackage.d4 c;
    public final defpackage.d4 d;
    public defpackage.yq e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public nz() {
            r3 = this;
            r3.<init>()
            lz r0 = new lz
            r1 = 0
            r0.<init>(r3, r1)
            lz r1 = new lz
            r2 = 1
            r1.<init>(r3, r2)
            d4 r2 = new d4
            r2.<init>(r0)
            r3.c = r2
            d4 r0 = new d4
            r0.<init>(r1)
            r3.d = r0
            r0 = 0
            r3.f = r0
            r3.g = r0
            r0 = 1
            r3.h = r0
            r3.i = r0
            return
    }

    public static int F(android.view.View r0) {
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            b00 r0 = r0.a
            int r0 = r0.b()
            return r0
    }

    public static defpackage.mz G(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            mz r0 = new mz
            r0.<init>()
            int[] r1 = defpackage.vy.a
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1, r4, r5)
            r3 = 0
            r4 = 1
            int r5 = r2.getInt(r3, r4)
            r0.a = r5
            r5 = 10
            int r4 = r2.getInt(r5, r4)
            r0.b = r4
            r4 = 9
            boolean r4 = r2.getBoolean(r4, r3)
            r0.c = r4
            r4 = 11
            boolean r3 = r2.getBoolean(r4, r3)
            r0.d = r3
            r2.recycle()
            return r0
    }

    public static boolean K(int r3, int r4, int r5) {
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = 0
            if (r5 <= 0) goto Le
            if (r3 == r5) goto Le
            return r1
        Le:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            if (r0 == r5) goto L1f
            if (r0 == 0) goto L1e
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 == r5) goto L1a
            return r1
        L1a:
            if (r4 != r3) goto L1d
            return r2
        L1d:
            return r1
        L1e:
            return r2
        L1f:
            if (r4 < r3) goto L22
            return r2
        L22:
            return r1
    }

    public static void L(android.view.View r3, int r4, int r5, int r6, int r7) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            android.graphics.Rect r1 = r0.b
            int r2 = r1.left
            int r4 = r4 + r2
            int r2 = r0.leftMargin
            int r4 = r4 + r2
            int r2 = r1.top
            int r5 = r5 + r2
            int r2 = r0.topMargin
            int r5 = r5 + r2
            int r2 = r1.right
            int r6 = r6 - r2
            int r2 = r0.rightMargin
            int r6 = r6 - r2
            int r1 = r1.bottom
            int r7 = r7 - r1
            int r0 = r0.bottomMargin
            int r7 = r7 - r0
            r3.layout(r4, r5, r6, r7)
            return
    }

    public static int g(int r2, int r3, int r4) {
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L15
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L14
            int r2 = java.lang.Math.max(r3, r4)
        L14:
            return r2
        L15:
            int r3 = java.lang.Math.max(r3, r4)
            int r2 = java.lang.Math.min(r2, r3)
            return r2
    }

    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
    }

    public final int A() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.b
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r0 = defpackage.t90.d(r0)
            return r0
    }

    public final int B() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.b
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingBottom()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int C() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.b
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingLeft()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int D() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.b
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingRight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int E() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.b
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingTop()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int H(defpackage.tz r1, defpackage.yz r2) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L19
            fz r1 = r1.k
            if (r1 != 0) goto La
            goto L19
        La:
            boolean r1 = r0.e()
            if (r1 == 0) goto L19
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            fz r1 = r1.k
            int r1 = r1.a()
            return r1
        L19:
            return r2
    }

    public final void I(android.view.View r7, android.graphics.Rect r8) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            android.graphics.Rect r0 = r0.b
            int r1 = r0.left
            int r1 = -r1
            int r2 = r0.top
            int r2 = -r2
            int r3 = r7.getWidth()
            int r4 = r0.right
            int r3 = r3 + r4
            int r4 = r7.getHeight()
            int r0 = r0.bottom
            int r4 = r4 + r0
            r8.set(r1, r2, r3, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r6.b
            if (r0 == 0) goto L5c
            android.graphics.Matrix r0 = r7.getMatrix()
            if (r0 == 0) goto L5c
            boolean r1 = r0.isIdentity()
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.RecyclerView r1 = r6.b
            android.graphics.RectF r1 = r1.j
            r1.set(r8)
            r0.mapRect(r1)
            float r0 = r1.left
            double r2 = (double) r0
            double r2 = java.lang.Math.floor(r2)
            int r0 = (int) r2
            float r2 = r1.top
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            int r2 = (int) r2
            float r3 = r1.right
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            float r1 = r1.bottom
            double r4 = (double) r1
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            r8.set(r0, r2, r3, r1)
        L5c:
            int r0 = r7.getLeft()
            int r7 = r7.getTop()
            r8.offset(r0, r7)
            return
    }

    public boolean J() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void M(int r5) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            if (r0 == 0) goto L19
            r5 r1 = r0.e
            int r1 = r1.k()
            r2 = 0
        Lb:
            if (r2 >= r1) goto L19
            r5 r3 = r0.e
            android.view.View r3 = r3.j(r2)
            r3.offsetLeftAndRight(r5)
            int r2 = r2 + 1
            goto Lb
        L19:
            return
    }

    public void N(int r5) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            if (r0 == 0) goto L19
            r5 r1 = r0.e
            int r1 = r1.k()
            r2 = 0
        Lb:
            if (r2 >= r1) goto L19
            r5 r3 = r0.e
            android.view.View r3 = r3.j(r2)
            r3.offsetTopAndBottom(r5)
            int r2 = r2 + 1
            goto Lb
        L19:
            return
    }

    public void O(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            return
    }

    public abstract void P(androidx.recyclerview.widget.RecyclerView r1);

    public abstract android.view.View Q(android.view.View r1, int r2, defpackage.tz r3, defpackage.yz r4);

    public void R(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            tz r1 = r0.b
            yz r1 = r0.c0
            if (r0 == 0) goto L3d
            if (r4 != 0) goto Lb
            goto L3d
        Lb:
            r1 = 1
            boolean r0 = r0.canScrollVertically(r1)
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            r2 = -1
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            boolean r0 = r0.canScrollHorizontally(r2)
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            boolean r0 = r0.canScrollHorizontally(r1)
            if (r0 == 0) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r4.setScrollable(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            fz r0 = r0.k
            if (r0 == 0) goto L3d
            int r0 = r0.a()
            r4.setItemCount(r0)
        L3d:
            return
    }

    public void S(defpackage.tz r2, defpackage.yz r3, android.view.View r4, defpackage.j0 r5) {
            r1 = this;
            boolean r2 = r1.e()
            r3 = 0
            if (r2 == 0) goto Lc
            int r2 = F(r4)
            goto Ld
        Lc:
            r2 = r3
        Ld:
            boolean r0 = r1.d()
            if (r0 == 0) goto L18
            int r4 = F(r4)
            goto L19
        L18:
            r4 = r3
        L19:
            r0 = 1
            i0 r2 = defpackage.i0.a(r3, r2, r0, r4, r0)
            r5.f(r2)
            return
    }

    public final void T(android.view.View r3, defpackage.j0 r4) {
            r2 = this;
            b00 r0 = androidx.recyclerview.widget.RecyclerView.I(r3)
            if (r0 == 0) goto L23
            boolean r1 = r0.h()
            if (r1 != 0) goto L23
            r5 r1 = r2.a
            android.view.View r0 = r0.a
            java.lang.Object r1 = r1.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            androidx.recyclerview.widget.RecyclerView r0 = r2.b
            tz r1 = r0.b
            yz r0 = r0.c0
            r2.S(r1, r0, r3, r4)
        L23:
            return
    }

    public void U(int r1, int r2) {
            r0 = this;
            return
    }

    public void V() {
            r0 = this;
            return
    }

    public void W(int r1, int r2) {
            r0 = this;
            return
    }

    public void X(int r1, int r2) {
            r0 = this;
            return
    }

    public void Y(int r1, int r2) {
            r0 = this;
            return
    }

    public abstract void Z(defpackage.tz r1, defpackage.yz r2);

    public abstract void a0(defpackage.yz r1);

    public final void b(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            b00 r0 = androidx.recyclerview.widget.RecyclerView.I(r9)
            r1 = 0
            r2 = 1
            if (r11 != 0) goto L17
            boolean r11 = r0.h()
            if (r11 == 0) goto Lf
            goto L17
        Lf:
            androidx.recyclerview.widget.RecyclerView r11 = r8.b
            d4 r11 = r11.f
            r11.I(r0)
            goto L33
        L17:
            androidx.recyclerview.widget.RecyclerView r11 = r8.b
            d4 r11 = r11.f
            java.lang.Object r11 = r11.b
            u30 r11 = (defpackage.u30) r11
            java.lang.Object r3 = r11.getOrDefault(r0, r1)
            oa0 r3 = (defpackage.oa0) r3
            if (r3 != 0) goto L2e
            oa0 r3 = defpackage.oa0.a()
            r11.put(r0, r3)
        L2e:
            int r11 = r3.a
            r11 = r11 | r2
            r3.a = r11
        L33:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            oz r11 = (defpackage.oz) r11
            boolean r3 = r0.p()
            r4 = 0
            if (r3 != 0) goto L133
            boolean r3 = r0.i()
            if (r3 == 0) goto L48
            goto L133
        L48:
            android.view.ViewParent r3 = r9.getParent()
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            r6 = -1
            if (r3 != r5) goto L10e
            r5 r3 = r8.a
            java.lang.Object r5 = r3.c
            fa r5 = (defpackage.fa) r5
            java.lang.Object r3 = r3.b
            ez r3 = (defpackage.ez) r3
            androidx.recyclerview.widget.RecyclerView r3 = r3.a
            int r3 = r3.indexOfChild(r9)
            if (r3 != r6) goto L65
        L63:
            r3 = r6
            goto L71
        L65:
            boolean r7 = r5.d(r3)
            if (r7 == 0) goto L6c
            goto L63
        L6c:
            int r5 = r5.b(r3)
            int r3 = r3 - r5
        L71:
            if (r10 != r6) goto L79
            r5 r10 = r8.a
            int r10 = r10.k()
        L79:
            if (r3 == r6) goto Leb
            if (r3 == r10) goto L14e
            androidx.recyclerview.widget.RecyclerView r9 = r8.b
            nz r9 = r9.l
            android.view.View r5 = r9.u(r3)
            if (r5 == 0) goto Lce
            r9.u(r3)
            r5 r6 = r9.a
            r6.d(r3)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            b00 r6 = androidx.recyclerview.widget.RecyclerView.I(r5)
            boolean r7 = r6.h()
            if (r7 == 0) goto Lbc
            androidx.recyclerview.widget.RecyclerView r7 = r9.b
            d4 r7 = r7.f
            java.lang.Object r7 = r7.b
            u30 r7 = (defpackage.u30) r7
            java.lang.Object r1 = r7.getOrDefault(r6, r1)
            oa0 r1 = (defpackage.oa0) r1
            if (r1 != 0) goto Lb6
            oa0 r1 = defpackage.oa0.a()
            r7.put(r6, r1)
        Lb6:
            int r7 = r1.a
            r2 = r2 | r7
            r1.a = r2
            goto Lc3
        Lbc:
            androidx.recyclerview.widget.RecyclerView r1 = r9.b
            d4 r1 = r1.f
            r1.I(r6)
        Lc3:
            r5 r9 = r9.a
            boolean r1 = r6.h()
            r9.c(r5, r10, r3, r1)
            goto L14e
        Lce:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot move a child from non-existing index:"
            r11.<init>(r0)
            r11.append(r3)
            androidx.recyclerview.widget.RecyclerView r9 = r9.b
            java.lang.String r9 = r9.toString()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        Leb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r11.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            int r9 = r0.indexOfChild(r9)
            r11.append(r9)
            androidx.recyclerview.widget.RecyclerView r9 = r8.b
            java.lang.String r9 = r9.y()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L10e:
            r5 r1 = r8.a
            r1.b(r9, r10, r4)
            r11.c = r2
            yq r10 = r8.e
            if (r10 == 0) goto L14e
            boolean r1 = r10.e
            if (r1 == 0) goto L14e
            androidx.recyclerview.widget.RecyclerView r1 = r10.b
            r1.getClass()
            b00 r1 = androidx.recyclerview.widget.RecyclerView.I(r9)
            if (r1 == 0) goto L12c
            int r6 = r1.b()
        L12c:
            int r1 = r10.a
            if (r6 != r1) goto L14e
            r10.f = r9
            goto L14e
        L133:
            boolean r1 = r0.i()
            if (r1 == 0) goto L13f
            tz r1 = r0.n
            r1.j(r0)
            goto L145
        L13f:
            int r1 = r0.j
            r1 = r1 & (-33)
            r0.j = r1
        L145:
            r5 r1 = r8.a
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            r1.c(r9, r10, r2, r4)
        L14e:
            boolean r9 = r11.d
            if (r9 == 0) goto L159
            android.view.View r9 = r0.a
            r9.invalidate()
            r11.d = r4
        L159:
            return
    }

    public void b0(android.os.Parcelable r1) {
            r0 = this;
            return
    }

    public void c(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.b
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    public android.os.Parcelable c0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean d();

    public void d0(int r1) {
            r0 = this;
            return
    }

    public abstract boolean e();

    public final void e0(defpackage.tz r3) {
            r2 = this;
            int r0 = r2.v()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L23
            android.view.View r1 = r2.u(r0)
            b00 r1 = androidx.recyclerview.widget.RecyclerView.I(r1)
            boolean r1 = r1.o()
            if (r1 != 0) goto L20
            android.view.View r1 = r2.u(r0)
            r2.h0(r0)
            r3.f(r1)
        L20:
            int r0 = r0 + (-1)
            goto L6
        L23:
            return
    }

    public boolean f(defpackage.oz r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public final void f0(defpackage.tz r8) {
            r7 = this;
            java.util.ArrayList r0 = r8.a
            int r1 = r0.size()
            int r2 = r1 + (-1)
        L8:
            if (r2 < 0) goto L4e
            java.lang.Object r3 = r0.get(r2)
            b00 r3 = (defpackage.b00) r3
            android.view.View r3 = r3.a
            b00 r4 = androidx.recyclerview.widget.RecyclerView.I(r3)
            boolean r5 = r4.o()
            if (r5 == 0) goto L1d
            goto L4b
        L1d:
            r5 = 0
            r4.n(r5)
            boolean r6 = r4.j()
            if (r6 == 0) goto L2c
            androidx.recyclerview.widget.RecyclerView r6 = r7.b
            r6.removeDetachedView(r3, r5)
        L2c:
            androidx.recyclerview.widget.RecyclerView r6 = r7.b
            jz r6 = r6.H
            if (r6 == 0) goto L35
            r6.d(r4)
        L35:
            r6 = 1
            r4.n(r6)
            b00 r3 = androidx.recyclerview.widget.RecyclerView.I(r3)
            r4 = 0
            r3.n = r4
            r3.o = r5
            int r4 = r3.j
            r4 = r4 & (-33)
            r3.j = r4
            r8.g(r3)
        L4b:
            int r2 = r2 + (-1)
            goto L8
        L4e:
            r0.clear()
            java.util.ArrayList r8 = r8.b
            if (r8 == 0) goto L58
            r8.clear()
        L58:
            if (r1 <= 0) goto L5f
            androidx.recyclerview.widget.RecyclerView r8 = r7.b
            r8.invalidate()
        L5f:
            return
    }

    public final void g0(android.view.View r5, defpackage.tz r6) {
            r4 = this;
            r5 r0 = r4.a
            java.lang.Object r1 = r0.b
            ez r1 = (defpackage.ez) r1
            androidx.recyclerview.widget.RecyclerView r2 = r1.a
            int r2 = r2.indexOfChild(r5)
            if (r2 >= 0) goto Lf
            goto L1f
        Lf:
            java.lang.Object r3 = r0.c
            fa r3 = (defpackage.fa) r3
            boolean r3 = r3.f(r2)
            if (r3 == 0) goto L1c
            r0.B(r5)
        L1c:
            r1.h(r2)
        L1f:
            r6.f(r5)
            return
    }

    public void h(int r1, int r2, defpackage.yz r3, defpackage.bn r4) {
            r0 = this;
            return
    }

    public final void h0(int r5) {
            r4 = this;
            android.view.View r0 = r4.u(r5)
            if (r0 == 0) goto L29
            r5 r0 = r4.a
            int r5 = r0.r(r5)
            java.lang.Object r1 = r0.b
            ez r1 = (defpackage.ez) r1
            androidx.recyclerview.widget.RecyclerView r2 = r1.a
            android.view.View r2 = r2.getChildAt(r5)
            if (r2 != 0) goto L19
            goto L29
        L19:
            java.lang.Object r3 = r0.c
            fa r3 = (defpackage.fa) r3
            boolean r3 = r3.f(r5)
            if (r3 == 0) goto L26
            r0.B(r2)
        L26:
            r1.h(r5)
        L29:
            return
    }

    public void i(int r1, defpackage.bn r2) {
            r0 = this;
            return
    }

    public boolean i0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            r8 = this;
            int r0 = r8.C()
            int r1 = r8.E()
            int r2 = r8.n
            int r3 = r8.D()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.B()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.A()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.C()
            int r2 = r8.E()
            int r3 = r8.n
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.B()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.h
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.Z(r11, r10, r0)
            return r7
    }

    public abstract int j(defpackage.yz r1);

    public final void j0() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.b
            if (r0 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public abstract int k(defpackage.yz r1);

    public abstract int k0(int r1, defpackage.tz r2, defpackage.yz r3);

    public abstract int l(defpackage.yz r1);

    public abstract void l0(int r1);

    public abstract int m(defpackage.yz r1);

    public abstract int m0(int r1, defpackage.tz r2, defpackage.yz r3);

    public abstract int n(defpackage.yz r1);

    public final void n0(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            int r0 = r3.getWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r3 = r3.getHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r2.o0(r0, r3)
            return
    }

    public abstract int o(defpackage.yz r1);

    public final void o0(int r2, int r3) {
            r1 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r2)
            r1.n = r0
            int r2 = android.view.View.MeasureSpec.getMode(r2)
            r1.l = r2
            if (r2 != 0) goto L10
            int[] r2 = androidx.recyclerview.widget.RecyclerView.s0
        L10:
            int r2 = android.view.View.MeasureSpec.getSize(r3)
            r1.o = r2
            int r2 = android.view.View.MeasureSpec.getMode(r3)
            r1.m = r2
            if (r2 != 0) goto L20
            int[] r2 = androidx.recyclerview.widget.RecyclerView.s0
        L20:
            return
    }

    public final void p(defpackage.tz r5) {
            r4 = this;
            int r0 = r4.v()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L47
            android.view.View r1 = r4.u(r0)
            b00 r2 = androidx.recyclerview.widget.RecyclerView.I(r1)
            boolean r3 = r2.o()
            if (r3 == 0) goto L17
            goto L44
        L17:
            boolean r3 = r2.f()
            if (r3 == 0) goto L32
            boolean r3 = r2.h()
            if (r3 != 0) goto L32
            androidx.recyclerview.widget.RecyclerView r3 = r4.b
            fz r3 = r3.k
            boolean r3 = r3.b
            if (r3 != 0) goto L32
            r4.h0(r0)
            r5.g(r2)
            goto L44
        L32:
            r4.u(r0)
            r5 r3 = r4.a
            r3.d(r0)
            r5.h(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.b
            d4 r1 = r1.f
            r1.I(r2)
        L44:
            int r0 = r0 + (-1)
            goto L6
        L47:
            return
    }

    public void p0(android.graphics.Rect r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.width()
            int r1 = r3.C()
            int r1 = r1 + r0
            int r0 = r3.D()
            int r0 = r0 + r1
            int r4 = r4.height()
            int r1 = r3.E()
            int r1 = r1 + r4
            int r4 = r3.B()
            int r4 = r4 + r1
            androidx.recyclerview.widget.RecyclerView r1 = r3.b
            java.util.WeakHashMap r2 = defpackage.ja0.a
            int r1 = defpackage.s90.e(r1)
            int r5 = g(r5, r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = defpackage.s90.d(r0)
            int r4 = g(r6, r4, r0)
            androidx.recyclerview.widget.RecyclerView r6 = r3.b
            androidx.recyclerview.widget.RecyclerView.e(r6, r5, r4)
            return
    }

    public android.view.View q(int r6) {
            r5 = this;
            int r0 = r5.v()
            r1 = 0
        L5:
            if (r1 >= r0) goto L30
            android.view.View r2 = r5.u(r1)
            b00 r3 = androidx.recyclerview.widget.RecyclerView.I(r2)
            if (r3 != 0) goto L12
            goto L2d
        L12:
            int r4 = r3.b()
            if (r4 != r6) goto L2d
            boolean r4 = r3.o()
            if (r4 != 0) goto L2d
            androidx.recyclerview.widget.RecyclerView r4 = r5.b
            yz r4 = r4.c0
            boolean r4 = r4.g
            if (r4 != 0) goto L2c
            boolean r3 = r3.h()
            if (r3 != 0) goto L2d
        L2c:
            return r2
        L2d:
            int r1 = r1 + 1
            goto L5
        L30:
            r6 = 0
            return r6
    }

    public final void q0(int r9, int r10) {
            r8 = this;
            int r0 = r8.v()
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            r0.n(r9, r10)
            return
        Lc:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = r2
            r5 = r3
            r2 = r1
            r3 = r4
        L16:
            if (r5 >= r0) goto L3a
            android.view.View r6 = r8.u(r5)
            androidx.recyclerview.widget.RecyclerView r7 = r8.b
            android.graphics.Rect r7 = r7.h
            r8.y(r6, r7)
            int r6 = r7.left
            if (r6 >= r3) goto L28
            r3 = r6
        L28:
            int r6 = r7.right
            if (r6 <= r1) goto L2d
            r1 = r6
        L2d:
            int r6 = r7.top
            if (r6 >= r4) goto L32
            r4 = r6
        L32:
            int r6 = r7.bottom
            if (r6 <= r2) goto L37
            r2 = r6
        L37:
            int r5 = r5 + 1
            goto L16
        L3a:
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            android.graphics.Rect r0 = r0.h
            r0.set(r3, r4, r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            android.graphics.Rect r0 = r0.h
            r8.p0(r0, r9, r10)
            return
    }

    public abstract defpackage.oz r();

    public final void r0(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            if (r2 != 0) goto Ld
            r2 = 0
            r1.b = r2
            r1.a = r2
            r2 = 0
            r1.n = r2
            r1.o = r2
            goto L1f
        Ld:
            r1.b = r2
            r5 r0 = r2.e
            r1.a = r0
            int r0 = r2.getWidth()
            r1.n = r0
            int r2 = r2.getHeight()
            r1.o = r2
        L1f:
            r2 = 1073741824(0x40000000, float:2.0)
            r1.l = r2
            r1.m = r2
            return
    }

    public defpackage.oz s(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            oz r0 = new oz
            r0.<init>(r2, r3)
            return r0
    }

    public final boolean s0(android.view.View r3, int r4, int r5, defpackage.oz r6) {
            r2 = this;
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L25
            boolean r0 = r2.h
            if (r0 == 0) goto L25
            int r0 = r3.getWidth()
            int r1 = r6.width
            boolean r4 = K(r0, r4, r1)
            if (r4 == 0) goto L25
            int r3 = r3.getHeight()
            int r4 = r6.height
            boolean r3 = K(r3, r5, r4)
            if (r3 != 0) goto L23
            goto L25
        L23:
            r3 = 0
            return r3
        L25:
            r3 = 1
            return r3
    }

    public defpackage.oz t(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.oz
            if (r0 == 0) goto Lc
            oz r0 = new oz
            oz r2 = (defpackage.oz) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            oz r0 = new oz
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            oz r0 = new oz
            r0.<init>(r2)
            return r0
    }

    public boolean t0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.view.View u(int r2) {
            r1 = this;
            r5 r0 = r1.a
            if (r0 == 0) goto L9
            android.view.View r2 = r0.j(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public final boolean u0(android.view.View r3, int r4, int r5, defpackage.oz r6) {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto L1f
            int r0 = r3.getMeasuredWidth()
            int r1 = r6.width
            boolean r4 = K(r0, r4, r1)
            if (r4 == 0) goto L1f
            int r3 = r3.getMeasuredHeight()
            int r4 = r6.height
            boolean r3 = K(r3, r5, r4)
            if (r3 != 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            return r3
        L1f:
            r3 = 1
            return r3
    }

    public final int v() {
            r1 = this;
            r5 r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.k()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public abstract void v0(androidx.recyclerview.widget.RecyclerView r1, int r2);

    public final void w0(defpackage.yq r4) {
            r3 = this;
            yq r0 = r3.e
            if (r0 == 0) goto Ld
            if (r4 == r0) goto Ld
            boolean r1 = r0.e
            if (r1 == 0) goto Ld
            r0.i()
        Ld:
            r3.e = r4
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            a00 r1 = r0.W
            androidx.recyclerview.widget.RecyclerView r2 = r1.g
            r2.removeCallbacks(r1)
            android.widget.OverScroller r1 = r1.c
            r1.abortAnimation()
            boolean r1 = r4.h
            if (r1 == 0) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "An instance of "
            r1.<init>(r2)
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " was started more than once. Each instance of"
            r1.append(r2)
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " is intended to only be used once. You should create a new instance for each use."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.w(r2, r1)
        L51:
            r4.b = r0
            r4.c = r3
            int r1 = r4.a
            r2 = -1
            if (r1 == r2) goto L75
            yz r2 = r0.c0
            r2.a = r1
            r2 = 1
            r4.e = r2
            r4.d = r2
            nz r0 = r0.l
            android.view.View r0 = r0.q(r1)
            r4.f = r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            a00 r0 = r0.W
            r0.a()
            r4.h = r2
            return
        L75:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid target position"
            r4.<init>(r0)
            throw r4
    }

    public int x(defpackage.tz r1, defpackage.yz r2) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L19
            fz r1 = r1.k
            if (r1 != 0) goto La
            goto L19
        La:
            boolean r1 = r0.d()
            if (r1 == 0) goto L19
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            fz r1 = r1.k
            int r1 = r1.a()
            return r1
        L19:
            return r2
    }

    public boolean x0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void y(android.view.View r7, android.graphics.Rect r8) {
            r6 = this;
            int[] r0 = androidx.recyclerview.widget.RecyclerView.s0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            android.graphics.Rect r1 = r0.b
            int r2 = r7.getLeft()
            int r3 = r1.left
            int r2 = r2 - r3
            int r3 = r0.leftMargin
            int r2 = r2 - r3
            int r3 = r7.getTop()
            int r4 = r1.top
            int r3 = r3 - r4
            int r4 = r0.topMargin
            int r3 = r3 - r4
            int r4 = r7.getRight()
            int r5 = r1.right
            int r4 = r4 + r5
            int r5 = r0.rightMargin
            int r4 = r4 + r5
            int r7 = r7.getBottom()
            int r1 = r1.bottom
            int r7 = r7 + r1
            int r0 = r0.bottomMargin
            int r7 = r7 + r0
            r8.set(r2, r3, r4, r7)
            return
    }

    public final int z() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.b
            if (r0 == 0) goto L9
            fz r0 = r0.getAdapter()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            int r0 = r0.a()
            return r0
        L11:
            r0 = 0
            return r0
    }
}
