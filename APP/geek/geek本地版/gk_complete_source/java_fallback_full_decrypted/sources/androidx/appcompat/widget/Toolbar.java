package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup {
    public android.content.res.ColorStateList A;
    public boolean B;
    public boolean C;
    public final java.util.ArrayList D;
    public final java.util.ArrayList E;
    public final int[] F;
    public final defpackage.d4 G;
    public java.util.ArrayList H;
    public final defpackage.d70 I;
    public defpackage.k70 J;
    public defpackage.j1 K;
    public defpackage.f70 L;
    public boolean M;
    public android.window.OnBackInvokedCallback N;
    public android.window.OnBackInvokedDispatcher O;
    public boolean P;
    public final defpackage.y6 Q;
    public androidx.appcompat.widget.ActionMenuView a;
    public defpackage.g5 b;
    public defpackage.g5 c;
    public defpackage.y3 d;
    public defpackage.a4 e;
    public final android.graphics.drawable.Drawable f;
    public final java.lang.CharSequence g;
    public defpackage.y3 h;
    public android.view.View i;
    public android.content.Context j;
    public int k;
    public int l;
    public int m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public defpackage.i10 t;
    public int u;
    public int v;
    public final int w;
    public java.lang.CharSequence x;
    public java.lang.CharSequence y;
    public android.content.res.ColorStateList z;

    public Toolbar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Toolbar(android.content.Context r9, android.util.AttributeSet r10, int r11) {
            r8 = this;
            r5 = 2130969671(0x7f040447, float:1.754803E38)
            r8.<init>(r9, r10, r5)
            r11 = 8388627(0x800013, float:1.175497E-38)
            r8.w = r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.D = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.E = r0
            r6 = 2
            int[] r0 = new int[r6]
            r8.F = r0
            d4 r0 = new d4
            c70 r1 = new c70
            r2 = 1
            r1.<init>(r8, r2)
            r0.<init>(r1)
            r8.G = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.H = r0
            d70 r0 = new d70
            r0.<init>(r8)
            r8.I = r0
            y6 r0 = new y6
            r1 = 11
            r0.<init>(r1, r8)
            r8.Q = r0
            android.content.Context r0 = r8.getContext()
            int[] r2 = defpackage.xy.x
            r5 r7 = defpackage.r5.y(r0, r10, r2, r5)
            java.lang.Object r0 = r7.b
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r8
            r1 = r9
            r3 = r10
            defpackage.ja0.k(r0, r1, r2, r3, r4, r5)
            java.lang.Object r9 = r7.b
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 28
            r1 = 0
            int r10 = r9.getResourceId(r10, r1)
            r0.l = r10
            r10 = 19
            int r10 = r9.getResourceId(r10, r1)
            r0.m = r10
            int r10 = r9.getInteger(r1, r11)
            r0.w = r10
            r10 = 48
            int r10 = r9.getInteger(r6, r10)
            r0.n = r10
            r10 = 22
            int r10 = r9.getDimensionPixelOffset(r10, r1)
            r11 = 27
            boolean r2 = r9.hasValue(r11)
            if (r2 == 0) goto L8c
            int r10 = r9.getDimensionPixelOffset(r11, r10)
        L8c:
            r0.s = r10
            r0.r = r10
            r0.q = r10
            r0.p = r10
            r10 = 25
            r11 = -1
            int r10 = r9.getDimensionPixelOffset(r10, r11)
            if (r10 < 0) goto L9f
            r0.p = r10
        L9f:
            r10 = 24
            int r10 = r9.getDimensionPixelOffset(r10, r11)
            if (r10 < 0) goto La9
            r0.q = r10
        La9:
            r10 = 26
            int r10 = r9.getDimensionPixelOffset(r10, r11)
            if (r10 < 0) goto Lb3
            r0.r = r10
        Lb3:
            r10 = 23
            int r10 = r9.getDimensionPixelOffset(r10, r11)
            if (r10 < 0) goto Lbd
            r0.s = r10
        Lbd:
            r10 = 13
            int r10 = r9.getDimensionPixelSize(r10, r11)
            r0.o = r10
            r10 = 9
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = r9.getDimensionPixelOffset(r10, r11)
            r2 = 5
            int r2 = r9.getDimensionPixelOffset(r2, r11)
            r3 = 7
            int r3 = r9.getDimensionPixelSize(r3, r1)
            r4 = 8
            int r4 = r9.getDimensionPixelSize(r4, r1)
            r8.d()
            i10 r5 = r0.t
            r5.h = r1
            if (r3 == r11) goto Lea
            r5.e = r3
            r5.a = r3
        Lea:
            if (r4 == r11) goto Lf0
            r5.f = r4
            r5.b = r4
        Lf0:
            if (r10 != r11) goto Lf4
            if (r2 == r11) goto Lf7
        Lf4:
            r5.a(r10, r2)
        Lf7:
            r10 = 10
            int r10 = r9.getDimensionPixelOffset(r10, r11)
            r0.u = r10
            r10 = 6
            int r10 = r9.getDimensionPixelOffset(r10, r11)
            r0.v = r10
            r10 = 4
            android.graphics.drawable.Drawable r10 = r7.m(r10)
            r0.f = r10
            r10 = 3
            java.lang.CharSequence r10 = r9.getText(r10)
            r0.g = r10
            r10 = 21
            java.lang.CharSequence r10 = r9.getText(r10)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L123
            r8.setTitle(r10)
        L123:
            r10 = 18
            java.lang.CharSequence r10 = r9.getText(r10)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L132
            r8.setSubtitle(r10)
        L132:
            android.content.Context r10 = r8.getContext()
            r0.j = r10
            r10 = 17
            int r10 = r9.getResourceId(r10, r1)
            r8.setPopupTheme(r10)
            r10 = 16
            android.graphics.drawable.Drawable r10 = r7.m(r10)
            if (r10 == 0) goto L14c
            r8.setNavigationIcon(r10)
        L14c:
            r10 = 15
            java.lang.CharSequence r10 = r9.getText(r10)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L15b
            r8.setNavigationContentDescription(r10)
        L15b:
            r10 = 11
            android.graphics.drawable.Drawable r10 = r7.m(r10)
            if (r10 == 0) goto L166
            r8.setLogo(r10)
        L166:
            r10 = 12
            java.lang.CharSequence r10 = r9.getText(r10)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L175
            r8.setLogoDescription(r10)
        L175:
            r10 = 29
            boolean r11 = r9.hasValue(r10)
            if (r11 == 0) goto L184
            android.content.res.ColorStateList r10 = r7.l(r10)
            r8.setTitleTextColor(r10)
        L184:
            r10 = 20
            boolean r11 = r9.hasValue(r10)
            if (r11 == 0) goto L193
            android.content.res.ColorStateList r10 = r7.l(r10)
            r8.setSubtitleTextColor(r10)
        L193:
            r10 = 14
            boolean r11 = r9.hasValue(r10)
            if (r11 == 0) goto L1a2
            int r9 = r9.getResourceId(r10, r1)
            r8.m(r9)
        L1a2:
            r7.z()
            return
    }

    private java.util.ArrayList<android.view.MenuItem> getCurrentMenuItems() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.Menu r1 = r4.getMenu()
            r2 = 0
        La:
            int r3 = r1.size()
            if (r2 >= r3) goto L1a
            android.view.MenuItem r3 = r1.getItem(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto La
        L1a:
            return r0
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            k50 r0 = new k50
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            return r0
    }

    public static defpackage.g70 h() {
            g70 r0 = new g70
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 0
            r0.b = r1
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.a = r1
            return r0
    }

    public static defpackage.g70 i(android.view.ViewGroup.LayoutParams r2) {
            boolean r0 = r2 instanceof defpackage.g70
            r1 = 0
            if (r0 == 0) goto L13
            g70 r0 = new g70
            g70 r2 = (defpackage.g70) r2
            r0.<init>(r2)
            r0.b = r1
            int r2 = r2.b
            r0.b = r2
            return r0
        L13:
            if (r0 == 0) goto L1f
            g70 r0 = new g70
            g70 r2 = (defpackage.g70) r2
            r0.<init>(r2)
            r0.b = r1
            return r0
        L1f:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L3d
            g70 r0 = new g70
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            r0.b = r1
            int r1 = r2.leftMargin
            r0.leftMargin = r1
            int r1 = r2.topMargin
            r0.topMargin = r1
            int r1 = r2.rightMargin
            r0.rightMargin = r1
            int r2 = r2.bottomMargin
            r0.bottomMargin = r2
            return r0
        L3d:
            g70 r0 = new g70
            r0.<init>(r2)
            r0.b = r1
            return r0
    }

    public static int k(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = defpackage.et.c(r1)
            int r1 = defpackage.et.b(r1)
            int r1 = r1 + r0
            return r1
    }

    public static int l(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.topMargin
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            return r0
    }

    public final void a(java.util.ArrayList r9, int r10) {
            r8 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r0 = defpackage.t90.d(r8)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            int r3 = r8.getChildCount()
            int r4 = defpackage.t90.d(r8)
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r4)
            r9.clear()
            r4 = 3
            r5 = 5
            if (r0 == 0) goto L58
            int r3 = r3 - r2
        L21:
            if (r3 < 0) goto L8f
            android.view.View r0 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            g70 r1 = (defpackage.g70) r1
            int r6 = r1.b
            if (r6 != 0) goto L55
            boolean r6 = r8.t(r0)
            if (r6 == 0) goto L55
            int r1 = r1.a
            java.util.WeakHashMap r6 = defpackage.ja0.a
            int r6 = defpackage.t90.d(r8)
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r6)
            r1 = r1 & 7
            if (r1 == r2) goto L50
            if (r1 == r4) goto L50
            if (r1 == r5) goto L50
            if (r6 != r2) goto L4f
            r1 = r5
            goto L50
        L4f:
            r1 = r4
        L50:
            if (r1 != r10) goto L55
            r9.add(r0)
        L55:
            int r3 = r3 + (-1)
            goto L21
        L58:
            if (r1 >= r3) goto L8f
            android.view.View r0 = r8.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            g70 r6 = (defpackage.g70) r6
            int r7 = r6.b
            if (r7 != 0) goto L8c
            boolean r7 = r8.t(r0)
            if (r7 == 0) goto L8c
            int r6 = r6.a
            java.util.WeakHashMap r7 = defpackage.ja0.a
            int r7 = defpackage.t90.d(r8)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            r6 = r6 & 7
            if (r6 == r2) goto L87
            if (r6 == r4) goto L87
            if (r6 == r5) goto L87
            if (r7 != r2) goto L86
            r6 = r5
            goto L87
        L86:
            r6 = r4
        L87:
            if (r6 != r10) goto L8c
            r9.add(r0)
        L8c:
            int r1 = r1 + 1
            goto L58
        L8f:
            return
    }

    public final void b(android.view.View r3, boolean r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto Lb
            g70 r0 = h()
            goto L18
        Lb:
            boolean r1 = r2.checkLayoutParams(r0)
            if (r1 != 0) goto L16
            g70 r0 = i(r0)
            goto L18
        L16:
            g70 r0 = (defpackage.g70) r0
        L18:
            r1 = 1
            r0.b = r1
            if (r4 == 0) goto L2a
            android.view.View r4 = r2.i
            if (r4 == 0) goto L2a
            r3.setLayoutParams(r0)
            java.util.ArrayList r4 = r2.E
            r4.add(r3)
            return
        L2a:
            r2.addView(r3, r0)
            return
    }

    public final void c() {
            r4 = this;
            y3 r0 = r4.h
            if (r0 != 0) goto L40
            y3 r0 = new y3
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 2130969670(0x7f040446, float:1.7548028E38)
            r0.<init>(r1, r2, r3)
            r4.h = r0
            android.graphics.drawable.Drawable r1 = r4.f
            r0.setImageDrawable(r1)
            y3 r0 = r4.h
            java.lang.CharSequence r1 = r4.g
            r0.setContentDescription(r1)
            g70 r0 = h()
            int r1 = r4.n
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.a = r1
            r1 = 2
            r0.b = r1
            y3 r1 = r4.h
            r1.setLayoutParams(r0)
            y3 r0 = r4.h
            x0 r1 = new x0
            r2 = 3
            r1.<init>(r2, r4)
            r0.setOnClickListener(r1)
        L40:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof defpackage.g70
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public final void d() {
            r3 = this;
            i10 r0 = r3.t
            if (r0 != 0) goto L1e
            i10 r0 = new i10
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.c = r2
            r0.d = r2
            r0.e = r1
            r0.f = r1
            r0.g = r1
            r0.h = r1
            r3.t = r0
        L1e:
            return
    }

    public final void e() {
            r3 = this;
            r3.f()
            androidx.appcompat.widget.ActionMenuView r0 = r3.a
            ku r1 = r0.p
            if (r1 != 0) goto L2a
            android.view.Menu r0 = r0.getMenu()
            ku r0 = (defpackage.ku) r0
            f70 r1 = r3.L
            if (r1 != 0) goto L1a
            f70 r1 = new f70
            r1.<init>(r3)
            r3.L = r1
        L1a:
            androidx.appcompat.widget.ActionMenuView r1 = r3.a
            r2 = 1
            r1.setExpandedActionViewsExclusive(r2)
            f70 r1 = r3.L
            android.content.Context r2 = r3.j
            r0.b(r1, r2)
            r3.u()
        L2a:
            return
    }

    public final void f() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.a
            if (r0 != 0) goto L41
            androidx.appcompat.widget.ActionMenuView r0 = new androidx.appcompat.widget.ActionMenuView
            android.content.Context r1 = r3.getContext()
            r2 = 0
            r0.<init>(r1, r2)
            r3.a = r0
            int r1 = r3.k
            r0.setPopupTheme(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.a
            d70 r1 = r3.I
            r0.setOnMenuItemClickListener(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.a
            d70 r1 = new d70
            r1.<init>(r3)
            r0.getClass()
            r0.u = r1
            g70 r0 = h()
            int r1 = r3.n
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388613(0x800005, float:1.175495E-38)
            r1 = r1 | r2
            r0.a = r1
            androidx.appcompat.widget.ActionMenuView r1 = r3.a
            r1.setLayoutParams(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.a
            r1 = 0
            r3.b(r0, r1)
        L41:
            return
    }

    public final void g() {
            r4 = this;
            y3 r0 = r4.d
            if (r0 != 0) goto L26
            y3 r0 = new y3
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 2130969670(0x7f040446, float:1.7548028E38)
            r0.<init>(r1, r2, r3)
            r4.d = r0
            g70 r0 = h()
            int r1 = r4.n
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.a = r1
            y3 r1 = r4.d
            r1.setLayoutParams(r0)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            g70 r0 = h()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r5) {
            r4 = this;
            g70 r0 = new g70
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1, r5)
            r2 = 0
            r0.a = r2
            int[] r3 = defpackage.xy.b
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r5, r3)
            int r1 = r5.getInt(r2, r2)
            r0.a = r1
            r5.recycle()
            r0.b = r2
            return r0
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            g70 r1 = i(r1)
            return r1
    }

    public java.lang.CharSequence getCollapseContentDescription() {
            r1 = this;
            y3 r0 = r1.h
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
            r1 = this;
            y3 r0 = r1.h
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getContentInsetEnd() {
            r2 = this;
            i10 r0 = r2.t
            if (r0 == 0) goto Le
            boolean r1 = r0.g
            if (r1 == 0) goto Lb
            int r0 = r0.a
            return r0
        Lb:
            int r0 = r0.b
            return r0
        Le:
            r0 = 0
            return r0
    }

    public int getContentInsetEndWithActions() {
            r2 = this;
            int r0 = r2.v
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            int r0 = r2.getContentInsetEnd()
            return r0
    }

    public int getContentInsetLeft() {
            r1 = this;
            i10 r0 = r1.t
            if (r0 == 0) goto L7
            int r0 = r0.a
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getContentInsetRight() {
            r1 = this;
            i10 r0 = r1.t
            if (r0 == 0) goto L7
            int r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getContentInsetStart() {
            r2 = this;
            i10 r0 = r2.t
            if (r0 == 0) goto Le
            boolean r1 = r0.g
            if (r1 == 0) goto Lb
            int r0 = r0.b
            return r0
        Lb:
            int r0 = r0.a
            return r0
        Le:
            r0 = 0
            return r0
    }

    public int getContentInsetStartWithNavigation() {
            r2 = this;
            int r0 = r2.u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            int r0 = r2.getContentInsetStart()
            return r0
    }

    public int getCurrentContentInsetEnd() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.a
            if (r0 == 0) goto L1e
            ku r0 = r0.p
            if (r0 == 0) goto L1e
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L1e
            int r0 = r3.getContentInsetEnd()
            int r1 = r3.v
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L1e:
            int r0 = r3.getContentInsetEnd()
            return r0
    }

    public int getCurrentContentInsetLeft() {
            r2 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r0 = defpackage.t90.d(r2)
            r1 = 1
            if (r0 != r1) goto Le
            int r0 = r2.getCurrentContentInsetEnd()
            return r0
        Le:
            int r0 = r2.getCurrentContentInsetStart()
            return r0
    }

    public int getCurrentContentInsetRight() {
            r2 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r0 = defpackage.t90.d(r2)
            r1 = 1
            if (r0 != r1) goto Le
            int r0 = r2.getCurrentContentInsetStart()
            return r0
        Le:
            int r0 = r2.getCurrentContentInsetEnd()
            return r0
    }

    public int getCurrentContentInsetStart() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getNavigationIcon()
            if (r0 == 0) goto L16
            int r0 = r3.getContentInsetStart()
            int r1 = r3.u
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L16:
            int r0 = r3.getContentInsetStart()
            return r0
    }

    public android.graphics.drawable.Drawable getLogo() {
            r1 = this;
            a4 r0 = r1.e
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.CharSequence getLogoDescription() {
            r1 = this;
            a4 r0 = r1.e
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            r1.e()
            androidx.appcompat.widget.ActionMenuView r0 = r1.a
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    public android.view.View getNavButtonView() {
            r1 = this;
            y3 r0 = r1.d
            return r0
    }

    public java.lang.CharSequence getNavigationContentDescription() {
            r1 = this;
            y3 r0 = r1.d
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
            r1 = this;
            y3 r0 = r1.d
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public defpackage.j1 getOuterActionMenuPresenter() {
            r1 = this;
            j1 r0 = r1.K
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.e()
            androidx.appcompat.widget.ActionMenuView r0 = r1.a
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.j
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.y
            return r0
    }

    public final android.widget.TextView getSubtitleTextView() {
            r1 = this;
            g5 r0 = r1.c
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.x
            return r0
    }

    public int getTitleMarginBottom() {
            r1 = this;
            int r0 = r1.s
            return r0
    }

    public int getTitleMarginEnd() {
            r1 = this;
            int r0 = r1.q
            return r0
    }

    public int getTitleMarginStart() {
            r1 = this;
            int r0 = r1.p
            return r0
    }

    public int getTitleMarginTop() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    public final android.widget.TextView getTitleTextView() {
            r1 = this;
            g5 r0 = r1.b
            return r0
    }

    public defpackage.hf getWrapper() {
            r8 = this;
            k70 r0 = r8.J
            if (r0 != 0) goto L18c
            k70 r0 = new k70
            r0.<init>()
            r1 = 0
            r0.n = r1
            r0.a = r8
            java.lang.CharSequence r2 = r8.getTitle()
            r0.h = r2
            java.lang.CharSequence r2 = r8.getSubtitle()
            r0.i = r2
            java.lang.CharSequence r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L21
            r2 = r3
            goto L22
        L21:
            r2 = r1
        L22:
            r0.g = r2
            android.graphics.drawable.Drawable r2 = r8.getNavigationIcon()
            r0.f = r2
            android.content.Context r2 = r8.getContext()
            int[] r4 = defpackage.xy.a
            r5 = 2130968581(0x7f040005, float:1.754582E38)
            r6 = 0
            r5 r2 = defpackage.r5.y(r2, r6, r4, r5)
            java.lang.Object r4 = r2.b
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r5 = 15
            android.graphics.drawable.Drawable r5 = r2.m(r5)
            r0.o = r5
            r5 = 27
            java.lang.CharSequence r5 = r4.getText(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L68
            r0.g = r3
            r0.h = r5
            int r3 = r0.b
            r3 = r3 & 8
            if (r3 == 0) goto L68
            r8.setTitle(r5)
            boolean r3 = r0.g
            if (r3 == 0) goto L68
            android.view.View r3 = r8.getRootView()
            defpackage.ja0.m(r3, r5)
        L68:
            r3 = 25
            java.lang.CharSequence r3 = r4.getText(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L7f
            r0.i = r3
            int r5 = r0.b
            r5 = r5 & 8
            if (r5 == 0) goto L7f
            r8.setSubtitle(r3)
        L7f:
            r3 = 20
            android.graphics.drawable.Drawable r3 = r2.m(r3)
            if (r3 == 0) goto L8c
            r0.e = r3
            r0.c()
        L8c:
            r3 = 17
            android.graphics.drawable.Drawable r3 = r2.m(r3)
            if (r3 == 0) goto L99
            r0.d = r3
            r0.c()
        L99:
            android.graphics.drawable.Drawable r3 = r0.f
            if (r3 != 0) goto Lb0
            android.graphics.drawable.Drawable r3 = r0.o
            if (r3 == 0) goto Lb0
            r0.f = r3
            int r5 = r0.b
            r5 = r5 & 4
            if (r5 == 0) goto Lad
            r8.setNavigationIcon(r3)
            goto Lb0
        Lad:
            r8.setNavigationIcon(r6)
        Lb0:
            r3 = 10
            int r3 = r4.getInt(r3, r1)
            r0.a(r3)
            r3 = 9
            int r3 = r4.getResourceId(r3, r1)
            if (r3 == 0) goto Lee
            android.content.Context r5 = r8.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            android.view.View r3 = r5.inflate(r3, r8, r1)
            android.view.View r5 = r0.c
            if (r5 == 0) goto Lda
            int r7 = r0.b
            r7 = r7 & 16
            if (r7 == 0) goto Lda
            r8.removeView(r5)
        Lda:
            r0.c = r3
            if (r3 == 0) goto Le7
            int r5 = r0.b
            r5 = r5 & 16
            if (r5 == 0) goto Le7
            r8.addView(r3)
        Le7:
            int r3 = r0.b
            r3 = r3 | 16
            r0.a(r3)
        Lee:
            r3 = 13
            int r3 = r4.getLayoutDimension(r3, r1)
            if (r3 <= 0) goto Lff
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            r5.height = r3
            r8.setLayoutParams(r5)
        Lff:
            r3 = 7
            r5 = -1
            int r3 = r4.getDimensionPixelOffset(r3, r5)
            r7 = 3
            int r5 = r4.getDimensionPixelOffset(r7, r5)
            if (r3 >= 0) goto L10e
            if (r5 < 0) goto L11e
        L10e:
            int r3 = java.lang.Math.max(r3, r1)
            int r5 = java.lang.Math.max(r5, r1)
            r8.d()
            i10 r7 = r8.t
            r7.a(r3, r5)
        L11e:
            r3 = 28
            int r3 = r4.getResourceId(r3, r1)
            if (r3 == 0) goto L133
            android.content.Context r5 = r8.getContext()
            r8.l = r3
            g5 r7 = r8.b
            if (r7 == 0) goto L133
            r7.setTextAppearance(r5, r3)
        L133:
            r3 = 26
            int r3 = r4.getResourceId(r3, r1)
            if (r3 == 0) goto L148
            android.content.Context r5 = r8.getContext()
            r8.m = r3
            g5 r7 = r8.c
            if (r7 == 0) goto L148
            r7.setTextAppearance(r5, r3)
        L148:
            r3 = 22
            int r1 = r4.getResourceId(r3, r1)
            if (r1 == 0) goto L153
            r8.setPopupTheme(r1)
        L153:
            r2.z()
            int r1 = r0.n
            r2 = 2131755009(0x7f100001, float:1.9140885E38)
            if (r2 != r1) goto L15e
            goto L17c
        L15e:
            r0.n = r2
            java.lang.CharSequence r1 = r8.getNavigationContentDescription()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L17c
            int r1 = r0.n
            if (r1 != 0) goto L16f
            goto L177
        L16f:
            android.content.Context r2 = r8.getContext()
            java.lang.String r6 = r2.getString(r1)
        L177:
            r0.j = r6
            r0.b()
        L17c:
            java.lang.CharSequence r1 = r8.getNavigationContentDescription()
            r0.j = r1
            pt r1 = new pt
            r1.<init>(r0)
            r8.setNavigationOnClickListener(r1)
            r8.J = r0
        L18c:
            k70 r0 = r8.J
            return r0
    }

    public final int j(android.view.View r7, int r8) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            g70 r0 = (defpackage.g70) r0
            int r7 = r7.getMeasuredHeight()
            r1 = 0
            if (r8 <= 0) goto L12
            int r8 = r7 - r8
            int r8 = r8 / 2
            goto L13
        L12:
            r8 = r1
        L13:
            int r2 = r0.a
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 16
            r4 = 80
            r5 = 48
            if (r2 == r3) goto L27
            if (r2 == r5) goto L27
            if (r2 == r4) goto L27
            int r2 = r6.w
            r2 = r2 & 112(0x70, float:1.57E-43)
        L27:
            if (r2 == r5) goto L62
            if (r2 == r4) goto L53
            int r8 = r6.getPaddingTop()
            int r2 = r6.getPaddingBottom()
            int r3 = r6.getHeight()
            int r4 = r3 - r8
            int r4 = r4 - r2
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r5 = r0.topMargin
            if (r4 >= r5) goto L43
            r4 = r5
            goto L51
        L43:
            int r3 = r3 - r2
            int r3 = r3 - r7
            int r3 = r3 - r4
            int r3 = r3 - r8
            int r7 = r0.bottomMargin
            if (r3 >= r7) goto L51
            int r7 = r7 - r3
            int r4 = r4 - r7
            int r4 = java.lang.Math.max(r1, r4)
        L51:
            int r8 = r8 + r4
            return r8
        L53:
            int r1 = r6.getHeight()
            int r2 = r6.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = r1 - r7
            int r7 = r0.bottomMargin
            int r1 = r1 - r7
            int r1 = r1 - r8
            return r1
        L62:
            int r7 = r6.getPaddingTop()
            int r7 = r7 - r8
            return r7
    }

    public void m(int r3) {
            r2 = this;
            android.view.MenuInflater r0 = r2.getMenuInflater()
            android.view.Menu r1 = r2.getMenu()
            r0.inflate(r3, r1)
            return
    }

    public final void n() {
            r5 = this;
            java.util.ArrayList r0 = r5.H
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L1d
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            android.view.Menu r4 = r5.getMenu()
            int r3 = r3.getItemId()
            r4.removeItem(r3)
            goto L7
        L1d:
            r5.getMenu()
            java.util.ArrayList r0 = r5.getCurrentMenuItems()
            r5.getMenuInflater()
            d4 r1 = r5.G
            java.lang.Object r1 = r1.c
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L41
            java.util.ArrayList r1 = r5.getCurrentMenuItems()
            r1.removeAll(r0)
            r5.H = r1
            return
        L41:
            java.lang.ClassCastException r0 = defpackage.z30.h(r1)
            throw r0
    }

    public final boolean o(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L11
            java.util.ArrayList r0 = r1.E
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.u()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            y6 r0 = r1.Q
            r1.removeCallbacks(r0)
            r1.u()
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.C = r1
        Lb:
            boolean r3 = r5.C
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.C = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L23
            r6 = 3
            if (r0 != r6) goto L22
            goto L23
        L22:
            return r4
        L23:
            r5.C = r1
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
            r19 = this;
            r0 = r19
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r1 = defpackage.t90.d(r0)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Le
            r1 = r3
            goto Lf
        Le:
            r1 = r2
        Lf:
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r8 = r0.getPaddingTop()
            int r9 = r0.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.F
            r11[r3] = r2
            r11[r2] = r2
            int r12 = defpackage.s90.d(r0)
            if (r12 < 0) goto L3c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L3d
        L3c:
            r12 = r2
        L3d:
            y3 r13 = r0.d
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L58
            if (r1 == 0) goto L50
            y3 r13 = r0.d
            int r13 = r0.q(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L5a
        L50:
            y3 r13 = r0.d
            int r13 = r0.p(r13, r6, r12, r11)
        L56:
            r14 = r10
            goto L5a
        L58:
            r13 = r6
            goto L56
        L5a:
            y3 r15 = r0.h
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L71
            if (r1 == 0) goto L6b
            y3 r15 = r0.h
            int r14 = r0.q(r15, r14, r12, r11)
            goto L71
        L6b:
            y3 r15 = r0.h
            int r13 = r0.p(r15, r13, r12, r11)
        L71:
            androidx.appcompat.widget.ActionMenuView r15 = r0.a
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L88
            if (r1 == 0) goto L82
            androidx.appcompat.widget.ActionMenuView r15 = r0.a
            int r13 = r0.p(r15, r13, r12, r11)
            goto L88
        L82:
            androidx.appcompat.widget.ActionMenuView r15 = r0.a
            int r14 = r0.q(r15, r14, r12, r11)
        L88:
            int r15 = r0.getCurrentContentInsetLeft()
            int r16 = r0.getCurrentContentInsetRight()
            r20 = r3
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r20] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.i
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto Lc5
            if (r1 == 0) goto Lbf
            android.view.View r13 = r0.i
            int r10 = r0.q(r13, r10, r12, r11)
            goto Lc5
        Lbf:
            android.view.View r13 = r0.i
            int r3 = r0.p(r13, r3, r12, r11)
        Lc5:
            a4 r13 = r0.e
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto Ldc
            if (r1 == 0) goto Ld6
            a4 r13 = r0.e
            int r10 = r0.q(r13, r10, r12, r11)
            goto Ldc
        Ld6:
            a4 r13 = r0.e
            int r3 = r0.p(r13, r3, r12, r11)
        Ldc:
            g5 r13 = r0.b
            boolean r13 = r0.t(r13)
            g5 r14 = r0.c
            boolean r14 = r0.t(r14)
            if (r13 == 0) goto L101
            g5 r15 = r0.b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            g70 r15 = (defpackage.g70) r15
            int r2 = r15.topMargin
            r23 = r1
            g5 r1 = r0.b
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            int r2 = r15.bottomMargin
            int r1 = r1 + r2
            goto L104
        L101:
            r23 = r1
            r1 = 0
        L104:
            if (r14 == 0) goto L11f
            g5 r2 = r0.c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            g70 r2 = (defpackage.g70) r2
            int r15 = r2.topMargin
            r22 = r1
            g5 r1 = r0.c
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r15
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            int r1 = r1 + r22
            goto L121
        L11f:
            r22 = r1
        L121:
            if (r13 != 0) goto L125
            if (r14 == 0) goto L281
        L125:
            if (r13 == 0) goto L12a
            g5 r2 = r0.b
            goto L12c
        L12a:
            g5 r2 = r0.c
        L12c:
            if (r14 == 0) goto L131
            g5 r15 = r0.c
            goto L133
        L131:
            g5 r15 = r0.b
        L133:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            g70 r2 = (defpackage.g70) r2
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            g70 r15 = (defpackage.g70) r15
            r22 = r1
            if (r13 == 0) goto L14b
            g5 r1 = r0.b
            int r1 = r1.getMeasuredWidth()
            if (r1 > 0) goto L155
        L14b:
            if (r14 == 0) goto L158
            g5 r1 = r0.c
            int r1 = r1.getMeasuredWidth()
            if (r1 <= 0) goto L158
        L155:
            r24 = r20
            goto L15a
        L158:
            r24 = 0
        L15a:
            int r1 = r0.w
            r1 = r1 & 112(0x70, float:1.57E-43)
            r16 = r3
            r3 = 48
            if (r1 == r3) goto L19d
            r3 = 80
            if (r1 == r3) goto L193
            int r1 = r5 - r8
            int r1 = r1 - r9
            int r1 = r1 - r22
            int r1 = r1 / 2
            int r3 = r2.topMargin
            r17 = r3
            int r3 = r0.r
            int r3 = r17 + r3
            if (r1 >= r3) goto L17b
            r1 = r3
            goto L191
        L17b:
            int r5 = r5 - r9
            int r5 = r5 - r22
            int r5 = r5 - r1
            int r5 = r5 - r8
            int r2 = r2.bottomMargin
            int r3 = r0.s
            int r2 = r2 + r3
            if (r5 >= r2) goto L191
            int r2 = r15.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L191:
            int r8 = r8 + r1
            goto L1a8
        L193:
            int r5 = r5 - r9
            int r1 = r15.bottomMargin
            int r5 = r5 - r1
            int r1 = r0.s
            int r5 = r5 - r1
            int r8 = r5 - r22
            goto L1a8
        L19d:
            int r1 = r0.getPaddingTop()
            int r2 = r2.topMargin
            int r1 = r1 + r2
            int r2 = r0.r
            int r8 = r1 + r2
        L1a8:
            if (r23 == 0) goto L218
            if (r24 == 0) goto L1af
            int r1 = r0.p
            goto L1b0
        L1af:
            r1 = 0
        L1b0:
            r2 = r11[r20]
            int r1 = r1 - r2
            r2 = 0
            int r3 = java.lang.Math.max(r2, r1)
            int r10 = r10 - r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r20] = r1
            if (r13 == 0) goto L1e6
            g5 r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            g70 r1 = (defpackage.g70) r1
            g5 r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            g5 r3 = r0.b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            g5 r5 = r0.b
            r5.layout(r2, r8, r10, r3)
            int r5 = r0.q
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L1e7
        L1e6:
            r2 = r10
        L1e7:
            if (r14 == 0) goto L20d
            g5 r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            g70 r1 = (defpackage.g70) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            g5 r1 = r0.c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            g5 r3 = r0.c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            g5 r5 = r0.c
            r5.layout(r1, r8, r10, r3)
            int r1 = r0.q
            int r1 = r10 - r1
            goto L20e
        L20d:
            r1 = r10
        L20e:
            if (r24 == 0) goto L215
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L215:
            r3 = r16
            goto L281
        L218:
            if (r24 == 0) goto L21e
            int r1 = r0.p
        L21c:
            r2 = 0
            goto L220
        L21e:
            r1 = 0
            goto L21c
        L220:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r16
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L255
            g5 r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            g70 r1 = (defpackage.g70) r1
            g5 r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            g5 r5 = r0.b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            g5 r9 = r0.b
            r9.layout(r3, r8, r2, r5)
            int r8 = r0.q
            int r2 = r2 + r8
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L256
        L255:
            r2 = r3
        L256:
            if (r14 == 0) goto L27a
            g5 r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            g70 r1 = (defpackage.g70) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            g5 r1 = r0.c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            g5 r5 = r0.c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            g5 r9 = r0.c
            r9.layout(r3, r8, r1, r5)
            int r5 = r0.q
            int r1 = r1 + r5
            goto L27b
        L27a:
            r1 = r3
        L27b:
            if (r24 == 0) goto L281
            int r3 = java.lang.Math.max(r2, r1)
        L281:
            r1 = 3
            java.util.ArrayList r2 = r0.D
            r0.a(r2, r1)
            int r1 = r2.size()
            r5 = r3
            r3 = 0
        L28d:
            if (r3 >= r1) goto L29c
            java.lang.Object r8 = r2.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r5 = r0.p(r8, r5, r12, r11)
            int r3 = r3 + 1
            goto L28d
        L29c:
            r1 = 5
            r0.a(r2, r1)
            int r1 = r2.size()
            r3 = 0
        L2a5:
            if (r3 >= r1) goto L2b4
            java.lang.Object r8 = r2.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r10 = r0.q(r8, r10, r12, r11)
            int r3 = r3 + 1
            goto L2a5
        L2b4:
            r3 = r20
            r0.a(r2, r3)
            r1 = 0
            r8 = r11[r1]
            r1 = r11[r3]
            int r3 = r2.size()
            r13 = r8
            r8 = 0
            r9 = 0
        L2c5:
            if (r8 >= r3) goto L300
            java.lang.Object r14 = r2.get(r8)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            g70 r15 = (defpackage.g70) r15
            r20 = r1
            int r1 = r15.leftMargin
            int r1 = r1 - r13
            int r13 = r15.rightMargin
            int r13 = r13 - r20
            r15 = 0
            int r16 = java.lang.Math.max(r15, r1)
            int r17 = java.lang.Math.max(r15, r13)
            int r1 = -r1
            int r1 = java.lang.Math.max(r15, r1)
            int r13 = -r13
            int r13 = java.lang.Math.max(r15, r13)
            int r14 = r14.getMeasuredWidth()
            int r14 = r14 + r16
            int r14 = r14 + r17
            int r9 = r9 + r14
            int r8 = r8 + 1
            r18 = r13
            r13 = r1
            r1 = r18
            goto L2c5
        L300:
            r15 = 0
            int r4 = r4 - r6
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r4 = r4 + r6
            int r1 = r9 / 2
            int r4 = r4 - r1
            int r9 = r9 + r4
            if (r4 >= r5) goto L30d
            goto L314
        L30d:
            if (r9 <= r10) goto L313
            int r9 = r9 - r10
            int r5 = r4 - r9
            goto L314
        L313:
            r5 = r4
        L314:
            int r1 = r2.size()
        L318:
            if (r15 >= r1) goto L327
            java.lang.Object r3 = r2.get(r15)
            android.view.View r3 = (android.view.View) r3
            int r5 = r0.p(r3, r5, r12, r11)
            int r15 = r15 + 1
            goto L318
        L327:
            r2.clear()
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r15, int r16) {
            r14 = this;
            boolean r6 = defpackage.cb0.a(r14)
            r7 = r6 ^ 1
            y3 r1 = r14.d
            boolean r1 = r14.t(r1)
            r3 = 0
            r8 = 0
            if (r1 == 0) goto L46
            y3 r1 = r14.d
            int r5 = r14.o
            r0 = r14
            r2 = r15
            r4 = r16
            r0.s(r1, r2, r3, r4, r5)
            y3 r1 = r14.d
            int r1 = r1.getMeasuredWidth()
            y3 r2 = r14.d
            int r2 = k(r2)
            int r2 = r2 + r1
            y3 r1 = r14.d
            int r1 = r1.getMeasuredHeight()
            y3 r4 = r14.d
            int r4 = l(r4)
            int r4 = r4 + r1
            int r1 = java.lang.Math.max(r8, r4)
            y3 r4 = r14.d
            int r4 = r4.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r8, r4)
            r9 = r1
            r10 = r4
            goto L49
        L46:
            r2 = r8
            r9 = r2
            r10 = r9
        L49:
            y3 r1 = r14.h
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L84
            y3 r1 = r14.h
            int r5 = r14.o
            r0 = r14
            r2 = r15
            r4 = r16
            r0.s(r1, r2, r3, r4, r5)
            y3 r1 = r14.h
            int r1 = r1.getMeasuredWidth()
            y3 r2 = r14.h
            int r2 = k(r2)
            int r2 = r2 + r1
            y3 r1 = r14.h
            int r1 = r1.getMeasuredHeight()
            y3 r3 = r14.h
            int r3 = l(r3)
            int r3 = r3 + r1
            int r9 = java.lang.Math.max(r9, r3)
            y3 r1 = r14.h
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L84:
            int r1 = r14.getCurrentContentInsetStart()
            int r3 = java.lang.Math.max(r1, r2)
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r8, r1)
            r2 = r6
            int[] r6 = r14.F
            r6[r2] = r1
            androidx.appcompat.widget.ActionMenuView r1 = r14.a
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto Ld2
            androidx.appcompat.widget.ActionMenuView r1 = r14.a
            int r5 = r14.o
            r0 = r14
            r2 = r15
            r4 = r16
            r0.s(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionMenuView r1 = r14.a
            int r1 = r1.getMeasuredWidth()
            androidx.appcompat.widget.ActionMenuView r2 = r14.a
            int r2 = k(r2)
            int r2 = r2 + r1
            androidx.appcompat.widget.ActionMenuView r1 = r14.a
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.ActionMenuView r4 = r14.a
            int r4 = l(r4)
            int r4 = r4 + r1
            int r9 = java.lang.Math.max(r9, r4)
            androidx.appcompat.widget.ActionMenuView r1 = r14.a
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            goto Ld3
        Ld2:
            r2 = r8
        Ld3:
            int r1 = r14.getCurrentContentInsetEnd()
            int r4 = java.lang.Math.max(r1, r2)
            int r3 = r3 + r4
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r8, r1)
            r6[r7] = r1
            android.view.View r1 = r14.i
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L112
            android.view.View r1 = r14.i
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.r(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            android.view.View r1 = r14.i
            int r1 = r1.getMeasuredHeight()
            android.view.View r2 = r14.i
            int r2 = l(r2)
            int r2 = r2 + r1
            int r9 = java.lang.Math.max(r9, r2)
            android.view.View r1 = r14.i
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L112:
            a4 r1 = r14.e
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L141
            a4 r1 = r14.e
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.r(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            a4 r1 = r14.e
            int r1 = r1.getMeasuredHeight()
            a4 r2 = r14.e
            int r2 = l(r2)
            int r2 = r2 + r1
            int r9 = java.lang.Math.max(r9, r2)
            a4 r1 = r14.e
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L141:
            int r7 = r14.getChildCount()
            r11 = r8
        L146:
            if (r11 >= r7) goto L186
            android.view.View r1 = r14.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            g70 r2 = (defpackage.g70) r2
            int r2 = r2.b
            if (r2 != 0) goto L15c
            boolean r2 = r14.t(r1)
            if (r2 != 0) goto L15e
        L15c:
            r12 = r3
            goto L182
        L15e:
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r5 = r0.r(r1, r2, r3, r4, r5, r6)
            r12 = r3
            int r3 = r12 + r5
            int r2 = r1.getMeasuredHeight()
            int r4 = l(r1)
            int r4 = r4 + r2
            int r2 = java.lang.Math.max(r9, r4)
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r10, r1)
            r10 = r1
            r9 = r2
            goto L183
        L182:
            r3 = r12
        L183:
            int r11 = r11 + 1
            goto L146
        L186:
            r12 = r3
            int r1 = r14.r
            int r2 = r14.s
            int r5 = r1 + r2
            int r1 = r14.p
            int r2 = r14.q
            int r7 = r1 + r2
            g5 r1 = r14.b
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L1ce
            g5 r1 = r14.b
            int r3 = r12 + r7
            r0 = r14
            r2 = r15
            r4 = r16
            r0.r(r1, r2, r3, r4, r5, r6)
            g5 r1 = r14.b
            int r1 = r1.getMeasuredWidth()
            g5 r2 = r14.b
            int r2 = k(r2)
            int r2 = r2 + r1
            g5 r1 = r14.b
            int r1 = r1.getMeasuredHeight()
            g5 r3 = r14.b
            int r3 = l(r3)
            int r3 = r3 + r1
            g5 r1 = r14.b
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            r11 = r3
            r13 = r10
            r10 = r2
            goto L1d1
        L1ce:
            r11 = r8
            r13 = r10
            r10 = r11
        L1d1:
            g5 r1 = r14.c
            boolean r1 = r14.t(r1)
            if (r1 == 0) goto L202
            g5 r1 = r14.c
            int r3 = r12 + r7
            int r5 = r5 + r11
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.r(r1, r2, r3, r4, r5, r6)
            int r10 = java.lang.Math.max(r10, r1)
            g5 r1 = r14.c
            int r1 = r1.getMeasuredHeight()
            g5 r2 = r14.c
            int r2 = l(r2)
            int r2 = r2 + r1
            int r11 = r11 + r2
            g5 r1 = r14.c
            int r1 = r1.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r1)
        L202:
            int r3 = r12 + r10
            int r1 = java.lang.Math.max(r9, r11)
            int r2 = r14.getPaddingLeft()
            int r4 = r14.getPaddingRight()
            int r4 = r4 + r2
            int r4 = r4 + r3
            int r2 = r14.getPaddingTop()
            int r3 = r14.getPaddingBottom()
            int r3 = r3 + r2
            int r3 = r3 + r1
            int r1 = r14.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r13
            int r1 = android.view.View.resolveSizeAndState(r1, r15, r2)
            int r2 = r14.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r3, r2)
            int r3 = r13 << 16
            r4 = r16
            int r2 = android.view.View.resolveSizeAndState(r2, r4, r3)
            boolean r3 = r14.M
            if (r3 != 0) goto L240
            goto L25d
        L240:
            int r3 = r14.getChildCount()
            r4 = r8
        L245:
            if (r4 >= r3) goto L262
            android.view.View r5 = r14.getChildAt(r4)
            boolean r6 = r14.t(r5)
            if (r6 == 0) goto L25f
            int r6 = r5.getMeasuredWidth()
            if (r6 <= 0) goto L25f
            int r5 = r5.getMeasuredHeight()
            if (r5 <= 0) goto L25f
        L25d:
            r8 = r2
            goto L262
        L25f:
            int r4 = r4 + 1
            goto L245
        L262:
            r14.setMeasuredDimension(r1, r8)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.i70
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            i70 r4 = (defpackage.i70) r4
            android.os.Parcelable r0 = r4.a
            super.onRestoreInstanceState(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.a
            if (r0 == 0) goto L16
            ku r0 = r0.p
            goto L17
        L16:
            r0 = 0
        L17:
            int r1 = r4.c
            if (r1 == 0) goto L2a
            f70 r2 = r3.L
            if (r2 == 0) goto L2a
            if (r0 == 0) goto L2a
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto L2a
            r0.expandActionView()
        L2a:
            boolean r4 = r4.d
            if (r4 == 0) goto L36
            y6 r4 = r3.Q
            r3.removeCallbacks(r4)
            r3.post(r4)
        L36:
            return
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r3) {
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            i10 r0 = r2.t
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.g
            if (r1 != r3) goto L12
            return
        L12:
            r0.g = r1
            boolean r3 = r0.h
            if (r3 == 0) goto L42
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2f
            int r1 = r0.d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.e
        L23:
            r0.a = r1
            int r1 = r0.c
            if (r1 == r3) goto L2a
            goto L2c
        L2a:
            int r1 = r0.f
        L2c:
            r0.b = r1
            return
        L2f:
            int r1 = r0.c
            if (r1 == r3) goto L34
            goto L36
        L34:
            int r1 = r0.e
        L36:
            r0.a = r1
            int r1 = r0.d
            if (r1 == r3) goto L3d
            goto L3f
        L3d:
            int r1 = r0.f
        L3f:
            r0.b = r1
            return
        L42:
            int r3 = r0.e
            r0.a = r3
            int r3 = r0.f
            r0.b = r3
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            i70 r0 = new i70
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            f70 r1 = r2.L
            if (r1 == 0) goto L15
            ou r1 = r1.b
            if (r1 == 0) goto L15
            int r1 = r1.a
            r0.c = r1
        L15:
            androidx.appcompat.widget.ActionMenuView r1 = r2.a
            if (r1 == 0) goto L25
            j1 r1 = r1.t
            if (r1 == 0) goto L25
            boolean r1 = r1.j()
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = 0
        L26:
            r0.d = r1
            return r0
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.B = r1
        L9:
            boolean r2 = r4.B
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.B = r3
        L18:
            if (r0 == r3) goto L1f
            r5 = 3
            if (r0 != r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            r4.B = r1
            return r3
    }

    public final int p(android.view.View r5, int r6, int r7, int[] r8) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            g70 r0 = (defpackage.g70) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r8[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r6
            int r6 = -r1
            int r6 = java.lang.Math.max(r2, r6)
            r8[r2] = r6
            int r6 = r4.j(r5, r7)
            int r7 = r5.getMeasuredWidth()
            int r8 = r3 + r7
            int r1 = r5.getMeasuredHeight()
            int r1 = r1 + r6
            r5.layout(r3, r6, r8, r1)
            int r5 = r0.rightMargin
            int r7 = r7 + r5
            int r7 = r7 + r3
            return r7
    }

    public final int q(android.view.View r6, int r7, int r8, int[] r9) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            g70 r0 = (defpackage.g70) r0
            int r1 = r0.rightMargin
            r2 = 1
            r3 = r9[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r7 = r7 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r9[r2] = r1
            int r8 = r5.j(r6, r8)
            int r9 = r6.getMeasuredWidth()
            int r1 = r7 - r9
            int r2 = r6.getMeasuredHeight()
            int r2 = r2 + r8
            r6.layout(r1, r8, r7, r2)
            int r6 = r0.leftMargin
            int r9 = r9 + r6
            int r7 = r7 - r9
            return r7
    }

    public final int r(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r13[r2]
            int r1 = r1 - r3
            int r3 = r0.rightMargin
            r4 = 1
            r5 = r13[r4]
            int r3 = r3 - r5
            int r5 = java.lang.Math.max(r2, r1)
            int r6 = java.lang.Math.max(r2, r3)
            int r6 = r6 + r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r13[r2] = r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r2, r1)
            r13[r4] = r1
            int r13 = r7.getPaddingLeft()
            int r1 = r7.getPaddingRight()
            int r1 = r1 + r13
            int r1 = r1 + r6
            int r1 = r1 + r10
            int r10 = r0.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r9, r1, r10)
            int r10 = r7.getPaddingTop()
            int r13 = r7.getPaddingBottom()
            int r13 = r13 + r10
            int r10 = r0.topMargin
            int r13 = r13 + r10
            int r10 = r0.bottomMargin
            int r13 = r13 + r10
            int r13 = r13 + r12
            int r10 = r0.height
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r11, r13, r10)
            r8.measure(r9, r10)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r6
            return r8
    }

    public final void s(android.view.View r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r0.leftMargin
            int r2 = r2 + r1
            int r1 = r0.rightMargin
            int r2 = r2 + r1
            int r2 = r2 + r6
            int r6 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r2, r6)
            int r6 = r3.getPaddingTop()
            int r1 = r3.getPaddingBottom()
            int r1 = r1 + r6
            int r6 = r0.topMargin
            int r1 = r1 + r6
            int r6 = r0.bottomMargin
            int r1 = r1 + r6
            int r6 = r0.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r1, r6)
            int r7 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L49
            if (r8 < 0) goto L49
            if (r7 == 0) goto L45
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r8 = java.lang.Math.min(r6, r8)
        L45:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
        L49:
            r4.measure(r5, r6)
            return
    }

    public void setBackInvokedCallbackEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.P
            if (r0 == r2) goto L9
            r1.P = r2
            r1.u()
        L9:
            return
    }

    public void setCollapseContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setCollapseContentDescription(r2)
            return
    }

    public void setCollapseContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.c()
        L9:
            y3 r0 = r1.h
            if (r0 == 0) goto L10
            r0.setContentDescription(r2)
        L10:
            return
    }

    public void setCollapseIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setCollapseIcon(r2)
            return
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            r1.c()
            y3 r0 = r1.h
            r0.setImageDrawable(r2)
            return
        Lb:
            y3 r2 = r1.h
            if (r2 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.f
            r2.setImageDrawable(r0)
        L14:
            return
    }

    public void setCollapsible(boolean r1) {
            r0 = this;
            r0.M = r1
            r0.requestLayout()
            return
    }

    public void setContentInsetEndWithActions(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.v
            if (r2 == r0) goto L13
            r1.v = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setContentInsetStartWithNavigation(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.u
            if (r2 == r0) goto L13
            r1.u = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setLogo(r2)
            return
    }

    public void setLogo(android.graphics.drawable.Drawable r5) {
            r4 = this;
            if (r5 == 0) goto L22
            a4 r0 = r4.e
            if (r0 != 0) goto L13
            a4 r0 = new a4
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.e = r0
        L13:
            a4 r0 = r4.e
            boolean r0 = r4.o(r0)
            if (r0 != 0) goto L38
            a4 r0 = r4.e
            r1 = 1
            r4.b(r0, r1)
            goto L38
        L22:
            a4 r0 = r4.e
            if (r0 == 0) goto L38
            boolean r0 = r4.o(r0)
            if (r0 == 0) goto L38
            a4 r0 = r4.e
            r4.removeView(r0)
            java.util.ArrayList r0 = r4.E
            a4 r1 = r4.e
            r0.remove(r1)
        L38:
            a4 r0 = r4.e
            if (r0 == 0) goto L3f
            r0.setImageDrawable(r5)
        L3f:
            return
    }

    public void setLogoDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setLogoDescription(r2)
            return
    }

    public void setLogoDescription(java.lang.CharSequence r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L17
            a4 r0 = r4.e
            if (r0 != 0) goto L17
            a4 r0 = new a4
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.e = r0
        L17:
            a4 r0 = r4.e
            if (r0 == 0) goto L1e
            r0.setContentDescription(r5)
        L1e:
            return
    }

    public void setNavigationContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setNavigationContentDescription(r2)
            return
    }

    public void setNavigationContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.g()
        L9:
            y3 r0 = r1.d
            if (r0 == 0) goto L15
            r0.setContentDescription(r2)
            y3 r0 = r1.d
            defpackage.l70.a(r0, r2)
        L15:
            return
    }

    public void setNavigationIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setNavigationIcon(r2)
            return
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.g()
            y3 r0 = r2.d
            boolean r0 = r2.o(r0)
            if (r0 != 0) goto L2a
            y3 r0 = r2.d
            r1 = 1
            r2.b(r0, r1)
            goto L2a
        L14:
            y3 r0 = r2.d
            if (r0 == 0) goto L2a
            boolean r0 = r2.o(r0)
            if (r0 == 0) goto L2a
            y3 r0 = r2.d
            r2.removeView(r0)
            java.util.ArrayList r0 = r2.E
            y3 r1 = r2.d
            r0.remove(r1)
        L2a:
            y3 r0 = r2.d
            if (r0 == 0) goto L31
            r0.setImageDrawable(r3)
        L31:
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            r1.g()
            y3 r0 = r1.d
            r0.setOnClickListener(r2)
            return
    }

    public void setOnMenuItemClickListener(defpackage.h70 r1) {
            r0 = this;
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.e()
            androidx.appcompat.widget.ActionMenuView r0 = r1.a
            r0.setOverflowIcon(r2)
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.k
            if (r0 == r3) goto L1a
            r2.k = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.j = r3
            return
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.j = r0
        L1a:
            return
    }

    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setSubtitle(r2)
            return
    }

    public void setSubtitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L41
            g5 r0 = r3.c
            if (r0 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            g5 r1 = new g5
            r2 = 0
            r1.<init>(r0, r2)
            r3.c = r1
            r1.setSingleLine()
            g5 r1 = r3.c
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.m
            if (r1 == 0) goto L29
            g5 r2 = r3.c
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.A
            if (r0 == 0) goto L32
            g5 r1 = r3.c
            r1.setTextColor(r0)
        L32:
            g5 r0 = r3.c
            boolean r0 = r3.o(r0)
            if (r0 != 0) goto L57
            g5 r0 = r3.c
            r1 = 1
            r3.b(r0, r1)
            goto L57
        L41:
            g5 r0 = r3.c
            if (r0 == 0) goto L57
            boolean r0 = r3.o(r0)
            if (r0 == 0) goto L57
            g5 r0 = r3.c
            r3.removeView(r0)
            java.util.ArrayList r0 = r3.E
            g5 r1 = r3.c
            r0.remove(r1)
        L57:
            g5 r0 = r3.c
            if (r0 == 0) goto L5e
            r0.setText(r4)
        L5e:
            r3.y = r4
            return
    }

    public void setSubtitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setSubtitleTextColor(r1)
            return
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.A = r2
            g5 r0 = r1.c
            if (r0 == 0) goto L9
            r0.setTextColor(r2)
        L9:
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L41
            g5 r0 = r3.b
            if (r0 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            g5 r1 = new g5
            r2 = 0
            r1.<init>(r0, r2)
            r3.b = r1
            r1.setSingleLine()
            g5 r1 = r3.b
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.l
            if (r1 == 0) goto L29
            g5 r2 = r3.b
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.z
            if (r0 == 0) goto L32
            g5 r1 = r3.b
            r1.setTextColor(r0)
        L32:
            g5 r0 = r3.b
            boolean r0 = r3.o(r0)
            if (r0 != 0) goto L57
            g5 r0 = r3.b
            r1 = 1
            r3.b(r0, r1)
            goto L57
        L41:
            g5 r0 = r3.b
            if (r0 == 0) goto L57
            boolean r0 = r3.o(r0)
            if (r0 == 0) goto L57
            g5 r0 = r3.b
            r3.removeView(r0)
            java.util.ArrayList r0 = r3.E
            g5 r1 = r3.b
            r0.remove(r1)
        L57:
            g5 r0 = r3.b
            if (r0 == 0) goto L5e
            r0.setText(r4)
        L5e:
            r3.x = r4
            return
    }

    public void setTitleMarginBottom(int r1) {
            r0 = this;
            r0.s = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginEnd(int r1) {
            r0 = this;
            r0.q = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginStart(int r1) {
            r0 = this;
            r0.p = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginTop(int r1) {
            r0 = this;
            r0.r = r1
            r0.requestLayout()
            return
    }

    public void setTitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTitleTextColor(r1)
            return
    }

    public void setTitleTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.z = r2
            g5 r0 = r1.b
            if (r0 == 0) goto L9
            r0.setTextColor(r2)
        L9:
            return
    }

    public final boolean t(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L12
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L12
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final void u() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4f
            android.window.OnBackInvokedDispatcher r0 = defpackage.e70.a(r4)
            f70 r1 = r4.L
            r2 = 0
            if (r1 == 0) goto L23
            ou r1 = r1.b
            if (r1 == 0) goto L23
            if (r0 == 0) goto L23
            java.util.WeakHashMap r1 = defpackage.ja0.a
            boolean r1 = defpackage.v90.b(r4)
            if (r1 == 0) goto L23
            boolean r1 = r4.P
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L41
            android.window.OnBackInvokedDispatcher r3 = r4.O
            if (r3 != 0) goto L41
            android.window.OnBackInvokedCallback r1 = r4.N
            if (r1 != 0) goto L39
            c70 r1 = new c70
            r1.<init>(r4, r2)
            android.window.OnBackInvokedCallback r1 = defpackage.e70.b(r1)
            r4.N = r1
        L39:
            android.window.OnBackInvokedCallback r1 = r4.N
            defpackage.e70.c(r0, r1)
            r4.O = r0
            return
        L41:
            if (r1 != 0) goto L4f
            android.window.OnBackInvokedDispatcher r0 = r4.O
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedCallback r1 = r4.N
            defpackage.e70.d(r0, r1)
            r0 = 0
            r4.O = r0
        L4f:
            return
    }
}
