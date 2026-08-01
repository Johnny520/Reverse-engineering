package com.google.android.material.sidesheet;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends android.view.View> extends defpackage.wd {
    public defpackage.zt a;
    public final defpackage.eu b;
    public final android.content.res.ColorStateList c;
    public final defpackage.f30 d;
    public final defpackage.u7 e;
    public final float f;
    public final boolean g;
    public int h;
    public defpackage.ma0 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public java.lang.ref.WeakReference p;
    public java.lang.ref.WeakReference q;
    public final int r;
    public android.view.VelocityTracker s;
    public int t;
    public final java.util.LinkedHashSet u;
    public final defpackage.s7 v;

    public SideSheetBehavior() {
            r2 = this;
            r2.<init>()
            u7 r0 = new u7
            r0.<init>(r2)
            r2.e = r0
            r0 = 1
            r2.g = r0
            r0 = 5
            r2.h = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r2.k = r0
            r0 = -1
            r2.r = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.u = r0
            s7 r0 = new s7
            r1 = 1
            r0.<init>(r2, r1)
            r2.v = r0
            return
    }

    public SideSheetBehavior(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>()
            u7 r0 = new u7
            r0.<init>(r6)
            r6.e = r0
            r0 = 1
            r6.g = r0
            r1 = 5
            r6.h = r1
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r6.k = r2
            r2 = -1
            r6.r = r2
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r6.u = r3
            s7 r3 = new s7
            r3.<init>(r6, r0)
            r6.v = r3
            int[] r3 = defpackage.wy.w
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r8, r3)
            r4 = 3
            boolean r5 = r3.hasValue(r4)
            if (r5 == 0) goto L39
            android.content.res.ColorStateList r4 = defpackage.ct.n(r7, r3, r4)
            r6.c = r4
        L39:
            r4 = 6
            boolean r4 = r3.hasValue(r4)
            if (r4 == 0) goto L4e
            r4 = 0
            r5 = 2131821505(0x7f1103c1, float:1.9275755E38)
            e30 r8 = defpackage.f30.b(r7, r8, r4, r5)
            f30 r8 = r8.a()
            r6.d = r8
        L4e:
            boolean r8 = r3.hasValue(r1)
            if (r8 == 0) goto L7b
            int r8 = r3.getResourceId(r1, r2)
            r6.r = r8
            java.lang.ref.WeakReference r1 = r6.q
            if (r1 == 0) goto L61
            r1.clear()
        L61:
            r1 = 0
            r6.q = r1
            java.lang.ref.WeakReference r1 = r6.p
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r8 == r2) goto L7b
            java.util.WeakHashMap r8 = defpackage.ja0.a
            boolean r8 = defpackage.v90.c(r1)
            if (r8 == 0) goto L7b
            r1.requestLayout()
        L7b:
            f30 r8 = r6.d
            if (r8 != 0) goto L80
            goto Laa
        L80:
            eu r1 = new eu
            r1.<init>(r8)
            r6.b = r1
            r1.h(r7)
            android.content.res.ColorStateList r8 = r6.c
            if (r8 == 0) goto L94
            eu r1 = r6.b
            r1.j(r8)
            goto Laa
        L94:
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r1 = r7.getTheme()
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r1.resolveAttribute(r2, r8, r0)
            eu r1 = r6.b
            int r8 = r8.data
            r1.setTint(r8)
        Laa:
            r8 = 2
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r8 = r3.getDimension(r8, r1)
            r6.f = r8
            r8 = 4
            boolean r8 = r3.getBoolean(r8, r0)
            r6.g = r8
            r3.recycle()
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
            r7.getScaledMaximumFlingVelocity()
            return
    }

    @Override // defpackage.wd
    public final void c(defpackage.zd r1) {
            r0 = this;
            r1 = 0
            r0.p = r1
            r0.i = r1
            return
    }

    @Override // defpackage.wd
    public final void e() {
            r1 = this;
            r0 = 0
            r1.p = r0
            r1.i = r0
            return
    }

    @Override // defpackage.wd
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto Le
            java.lang.CharSequence r3 = defpackage.ja0.d(r4)
            if (r3 == 0) goto L57
        Le:
            boolean r3 = r2.g
            if (r3 == 0) goto L57
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L22
            android.view.VelocityTracker r4 = r2.s
            if (r4 == 0) goto L22
            r4.recycle()
            r4 = 0
            r2.s = r4
        L22:
            android.view.VelocityTracker r4 = r2.s
            if (r4 != 0) goto L2c
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.s = r4
        L2c:
            android.view.VelocityTracker r4 = r2.s
            r4.addMovement(r5)
            if (r3 == 0) goto L40
            if (r3 == r0) goto L39
            r4 = 3
            if (r3 == r4) goto L39
            goto L47
        L39:
            boolean r3 = r2.j
            if (r3 == 0) goto L47
            r2.j = r1
            return r1
        L40:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.t = r3
        L47:
            boolean r3 = r2.j
            if (r3 != 0) goto L56
            ma0 r3 = r2.i
            if (r3 == 0) goto L56
            boolean r3 = r3.p(r5)
            if (r3 == 0) goto L56
            return r0
        L56:
            return r1
        L57:
            r2.j = r0
            return r1
    }

    @Override // defpackage.wd
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
            r10 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            boolean r0 = defpackage.s90.b(r11)
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = defpackage.s90.b(r12)
            if (r0 != 0) goto L12
            r12.setFitsSystemWindows(r1)
        L12:
            java.lang.ref.WeakReference r0 = r10.p
            eu r2 = r10.b
            r3 = 5
            r4 = 0
            r5 = 0
            if (r0 != 0) goto Lac
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r12)
            r10.p = r0
            android.content.Context r0 = r12.getContext()
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.PathInterpolator r6 = defpackage.nx.b(r4, r4, r4, r6)
            r7 = 2130969356(0x7f04030c, float:1.7547392E38)
            defpackage.ct.w(r0, r7, r6)
            r6 = 2130969339(0x7f0402fb, float:1.7547357E38)
            r7 = 300(0x12c, float:4.2E-43)
            defpackage.ct.v(r0, r6, r7)
            r6 = 2130969344(0x7f040300, float:1.7547367E38)
            r7 = 150(0x96, float:2.1E-43)
            defpackage.ct.v(r0, r6, r7)
            r6 = 2130969343(0x7f0402ff, float:1.7547365E38)
            r7 = 100
            defpackage.ct.v(r0, r6, r7)
            android.content.res.Resources r0 = r12.getResources()
            r6 = 2131165361(0x7f0700b1, float:1.7944937E38)
            r0.getDimension(r6)
            r6 = 2131165360(0x7f0700b0, float:1.7944935E38)
            r0.getDimension(r6)
            r6 = 2131165362(0x7f0700b2, float:1.7944939E38)
            r0.getDimension(r6)
            if (r2 == 0) goto L75
            defpackage.s90.q(r12, r2)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r10.f
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L71
            float r6 = defpackage.y90.i(r12)
        L71:
            r2.i(r6)
            goto L7c
        L75:
            android.content.res.ColorStateList r0 = r10.c
            if (r0 == 0) goto L7c
            defpackage.y90.q(r12, r0)
        L7c:
            int r0 = r10.h
            if (r0 != r3) goto L82
            r0 = 4
            goto L83
        L82:
            r0 = r5
        L83:
            int r6 = r12.getVisibility()
            if (r6 == r0) goto L8c
            r12.setVisibility(r0)
        L8c:
            r10.u()
            int r0 = defpackage.s90.c(r12)
            if (r0 != 0) goto L98
            defpackage.s90.s(r12, r1)
        L98:
            java.lang.CharSequence r0 = defpackage.ja0.d(r12)
            if (r0 != 0) goto Lac
            android.content.res.Resources r0 = r12.getResources()
            r6 = 2131755165(0x7f10009d, float:1.9141202E38)
            java.lang.String r0 = r0.getString(r6)
            defpackage.ja0.m(r12, r0)
        Lac:
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            zd r0 = (defpackage.zd) r0
            int r0 = r0.c
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r13)
            r6 = 3
            if (r0 != r6) goto Lbd
            r0 = r1
            goto Lbe
        Lbd:
            r0 = r5
        Lbe:
            zt r7 = r10.a
            if (r7 == 0) goto Lc8
            int r7 = r7.v()
            if (r7 == r0) goto L15c
        Lc8:
            r7 = 0
            f30 r8 = r10.d
            if (r0 != 0) goto L114
            eq r0 = new eq
            r0.<init>(r10, r1)
            r10.a = r0
            if (r8 == 0) goto L15c
            java.lang.ref.WeakReference r0 = r10.p
            if (r0 == 0) goto Lf1
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Lf1
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            boolean r9 = r9 instanceof defpackage.zd
            if (r9 == 0) goto Lf1
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r7 = r0
            zd r7 = (defpackage.zd) r7
        Lf1:
            if (r7 == 0) goto Lf8
            int r0 = r7.rightMargin
            if (r0 <= 0) goto Lf8
            goto L15c
        Lf8:
            e30 r0 = r8.e()
            e r7 = new e
            r7.<init>(r4)
            r0.f = r7
            e r7 = new e
            r7.<init>(r4)
            r0.g = r7
            f30 r0 = r0.a()
            if (r2 == 0) goto L15c
            r2.setShapeAppearanceModel(r0)
            goto L15c
        L114:
            if (r0 != r1) goto L1ff
            eq r0 = new eq
            r0.<init>(r10, r5)
            r10.a = r0
            if (r8 == 0) goto L15c
            java.lang.ref.WeakReference r0 = r10.p
            if (r0 == 0) goto L13a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13a
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            boolean r9 = r9 instanceof defpackage.zd
            if (r9 == 0) goto L13a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r7 = r0
            zd r7 = (defpackage.zd) r7
        L13a:
            if (r7 == 0) goto L141
            int r0 = r7.leftMargin
            if (r0 <= 0) goto L141
            goto L15c
        L141:
            e30 r0 = r8.e()
            e r7 = new e
            r7.<init>(r4)
            r0.e = r7
            e r7 = new e
            r7.<init>(r4)
            r0.h = r7
            f30 r0 = r0.a()
            if (r2 == 0) goto L15c
            r2.setShapeAppearanceModel(r0)
        L15c:
            ma0 r0 = r10.i
            if (r0 != 0) goto L16d
            ma0 r0 = new ma0
            android.content.Context r2 = r11.getContext()
            s7 r4 = r10.v
            r0.<init>(r2, r11, r4)
            r10.i = r0
        L16d:
            zt r0 = r10.a
            int r0 = r0.q(r12)
            r11.q(r12, r13)
            int r13 = r11.getWidth()
            r10.m = r13
            zt r13 = r10.a
            int r13 = r13.u(r11)
            r10.n = r13
            int r13 = r12.getWidth()
            r10.l = r13
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            if (r13 == 0) goto L199
            zt r2 = r10.a
            int r13 = r2.a(r13)
            goto L19a
        L199:
            r13 = r5
        L19a:
            r10.o = r13
            int r13 = r10.h
            if (r13 == r1) goto L1c4
            r2 = 2
            if (r13 == r2) goto L1c4
            if (r13 == r6) goto L1cc
            if (r13 != r3) goto L1ae
            zt r13 = r10.a
            int r5 = r13.m()
            goto L1cc
        L1ae:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unexpected value: "
            r12.<init>(r13)
            int r13 = r10.h
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L1c4:
            zt r13 = r10.a
            int r13 = r13.q(r12)
            int r5 = r0 - r13
        L1cc:
            r12.offsetLeftAndRight(r5)
            java.lang.ref.WeakReference r12 = r10.q
            if (r12 != 0) goto L1e5
            r12 = -1
            int r13 = r10.r
            if (r13 == r12) goto L1e5
            android.view.View r11 = r11.findViewById(r13)
            if (r11 == 0) goto L1e5
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r11)
            r10.q = r12
        L1e5:
            java.util.LinkedHashSet r11 = r10.u
            java.util.Iterator r11 = r11.iterator()
        L1eb:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1fe
            java.lang.Object r12 = r11.next()
            if (r12 != 0) goto L1f8
            goto L1eb
        L1f8:
            java.lang.ClassCastException r11 = new java.lang.ClassCastException
            r11.<init>()
            throw r11
        L1fe:
            return r1
        L1ff:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Invalid sheet edge position value: "
            r12.<init>(r13)
            r12.append(r0)
            java.lang.String r13 = ". Must be 0 or 1."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // defpackage.wd
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r0.leftMargin
            int r2 = r2 + r1
            int r1 = r0.rightMargin
            int r2 = r2 + r1
            int r2 = r2 + r7
            int r7 = r0.width
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r2, r7)
            int r7 = r4.getPaddingTop()
            int r4 = r4.getPaddingBottom()
            int r4 = r4 + r7
            int r7 = r0.topMargin
            int r4 = r4 + r7
            int r7 = r0.bottomMargin
            int r4 = r4 + r7
            int r7 = r0.height
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r8, r4, r7)
            r5.measure(r6, r4)
            r4 = 1
            return r4
    }

    @Override // defpackage.wd
    public final void m(android.view.View r1, android.os.Parcelable r2) {
            r0 = this;
            t30 r2 = (defpackage.t30) r2
            int r1 = r2.c
            r2 = 1
            if (r1 == r2) goto La
            r2 = 2
            if (r1 != r2) goto Lb
        La:
            r1 = 5
        Lb:
            r0.h = r1
            return
    }

    @Override // defpackage.wd
    public final android.os.Parcelable n(android.view.View r2) {
            r1 = this;
            t30 r2 = new t30
            android.view.AbsSavedState r0 = android.view.View.BaseSavedState.EMPTY_STATE
            r2.<init>(r1)
            return r2
    }

    @Override // defpackage.wd
    public final boolean q(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            boolean r0 = r5.isShown()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            int r0 = r6.getActionMasked()
            int r1 = r4.h
            r2 = 1
            if (r1 != r2) goto L14
            if (r0 != 0) goto L14
            return r2
        L14:
            boolean r1 = r4.s()
            if (r1 == 0) goto L1f
            ma0 r1 = r4.i
            r1.j(r6)
        L1f:
            if (r0 != 0) goto L2b
            android.view.VelocityTracker r1 = r4.s
            if (r1 == 0) goto L2b
            r1.recycle()
            r1 = 0
            r4.s = r1
        L2b:
            android.view.VelocityTracker r1 = r4.s
            if (r1 != 0) goto L35
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r4.s = r1
        L35:
            android.view.VelocityTracker r1 = r4.s
            r1.addMovement(r6)
            boolean r1 = r4.s()
            if (r1 == 0) goto L6e
            r1 = 2
            if (r0 != r1) goto L6e
            boolean r0 = r4.j
            if (r0 != 0) goto L6e
            boolean r0 = r4.s()
            if (r0 != 0) goto L4e
            goto L6e
        L4e:
            int r0 = r4.t
            float r0 = (float) r0
            float r1 = r6.getX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            ma0 r1 = r4.i
            int r3 = r1.b
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6e
            int r0 = r6.getActionIndex()
            int r6 = r6.getPointerId(r0)
            r1.b(r5, r6)
        L6e:
            boolean r5 = r4.j
            r5 = r5 ^ r2
            return r5
    }

    public final void r(int r3) {
            r2 = this;
            int r0 = r2.h
            if (r0 != r3) goto L5
            goto L16
        L5:
            r2.h = r3
            r0 = 3
            r1 = 5
            java.lang.ref.WeakReference r3 = r2.p
            if (r3 != 0) goto Le
            goto L16
        Le:
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L17
        L16:
            return
        L17:
            int r0 = r2.h
            if (r0 != r1) goto L1d
            r0 = 4
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r1 = r3.getVisibility()
            if (r1 == r0) goto L27
            r3.setVisibility(r0)
        L27:
            java.util.LinkedHashSet r3 = r2.u
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L37
            r2.u()
            return
        L37:
            java.lang.ClassCastException r3 = defpackage.z30.h(r3)
            throw r3
    }

    public final boolean s() {
            r2 = this;
            ma0 r0 = r2.i
            if (r0 == 0) goto Le
            boolean r0 = r2.g
            r1 = 1
            if (r0 != 0) goto Ld
            int r0 = r2.h
            if (r0 != r1) goto Le
        Ld:
            return r1
        Le:
            r0 = 0
            return r0
    }

    public final void t(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L21
            r0 = 5
            if (r4 != r0) goto Ld
            zt r0 = r2.a
            int r0 = r0.m()
            goto L27
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid state to get outer edge offset: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L21:
            zt r0 = r2.a
            int r0 = r0.l()
        L27:
            ma0 r1 = r2.i
            if (r1 == 0) goto L5f
            if (r5 == 0) goto L38
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L5f
            goto L55
        L38:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L53
            int r5 = r1.a
            if (r5 != 0) goto L53
            android.view.View r5 = r1.r
            if (r5 == 0) goto L53
            r5 = 0
            r1.r = r5
        L53:
            if (r3 == 0) goto L5f
        L55:
            r3 = 2
            r2.r(r3)
            u7 r3 = r2.e
            r3.a(r4)
            return
        L5f:
            r2.r(r4)
            return
    }

    public final void u() {
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.p
            if (r0 != 0) goto L5
            goto L3d
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            goto L3d
        Le:
            r1 = 262144(0x40000, float:3.67342E-40)
            defpackage.ja0.i(r0, r1)
            r1 = 0
            defpackage.ja0.g(r0, r1)
            r2 = 1048576(0x100000, float:1.469368E-39)
            defpackage.ja0.i(r0, r2)
            defpackage.ja0.g(r0, r1)
            int r1 = r4.h
            r2 = 5
            if (r1 == r2) goto L2e
            h0 r1 = defpackage.h0.j
            s30 r3 = new s30
            r3.<init>(r4, r2)
            defpackage.ja0.j(r0, r1, r3)
        L2e:
            int r1 = r4.h
            r2 = 3
            if (r1 == r2) goto L3d
            h0 r1 = defpackage.h0.h
            s30 r3 = new s30
            r3.<init>(r4, r2)
            defpackage.ja0.j(r0, r1, r3)
        L3d:
            return
    }
}
