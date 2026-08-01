package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends android.view.ViewGroup {
    public final defpackage.a a;
    public final android.content.Context b;
    public androidx.appcompat.widget.ActionMenuView c;
    public defpackage.j1 d;
    public int e;
    public defpackage.wa0 f;
    public boolean g;
    public boolean h;
    public java.lang.CharSequence i;
    public java.lang.CharSequence j;
    public android.view.View k;
    public android.view.View l;
    public android.view.View m;
    public android.widget.LinearLayout n;
    public android.widget.TextView o;
    public android.widget.TextView p;
    public final int q;
    public final int r;
    public boolean s;
    public final int t;

    public ActionBarContextView(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r0 = 2130968604(0x7f04001c, float:1.7545866E38)
            r5.<init>(r6, r7, r0)
            a r1 = new a
            r1.<init>(r5)
            r5.a = r1
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r3 = 2130968578(0x7f040002, float:1.7545814E38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r1, r4)
            if (r2 == 0) goto L2e
            int r2 = r1.resourceId
            if (r2 == 0) goto L2e
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r1 = r1.resourceId
            r2.<init>(r6, r1)
            r5.b = r2
            goto L30
        L2e:
            r5.b = r6
        L30:
            int[] r1 = defpackage.xy.d
            r2 = 0
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1, r0, r2)
            boolean r0 = r7.hasValue(r2)
            if (r0 == 0) goto L48
            int r0 = r7.getResourceId(r2, r2)
            if (r0 == 0) goto L48
            android.graphics.drawable.Drawable r6 = defpackage.ff.r(r6, r0)
            goto L4c
        L48:
            android.graphics.drawable.Drawable r6 = r7.getDrawable(r2)
        L4c:
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.s90.q(r5, r6)
            r6 = 5
            int r6 = r7.getResourceId(r6, r2)
            r5.q = r6
            r6 = 4
            int r6 = r7.getResourceId(r6, r2)
            r5.r = r6
            r6 = 3
            int r6 = r7.getLayoutDimension(r6, r2)
            r5.e = r6
            r6 = 2
            r0 = 2131492869(0x7f0c0005, float:1.8609202E38)
            int r6 = r7.getResourceId(r6, r0)
            r5.t = r6
            r7.recycle()
            return
    }

    public static /* synthetic */ void a(androidx.appcompat.widget.ActionBarContextView r1) {
            r0 = 0
            super.setVisibility(r0)
            return
    }

    public static /* synthetic */ void b(androidx.appcompat.widget.ActionBarContextView r0, int r1) {
            super.setVisibility(r1)
            return
    }

    public static int f(android.view.View r1, int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r1.measure(r0, r3)
            int r1 = r1.getMeasuredWidth()
            int r2 = r2 - r1
            r1 = 0
            int r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    public static int g(android.view.View r2, int r3, int r4, int r5, boolean r6) {
            int r0 = r2.getMeasuredWidth()
            int r1 = r2.getMeasuredHeight()
            int r5 = r5 - r1
            int r5 = r5 / 2
            int r5 = r5 + r4
            if (r6 == 0) goto L15
            int r4 = r3 - r0
            int r1 = r1 + r5
            r2.layout(r4, r5, r3, r1)
            goto L1b
        L15:
            int r4 = r3 + r0
            int r1 = r1 + r5
            r2.layout(r3, r5, r4, r1)
        L1b:
            if (r6 == 0) goto L1f
            int r2 = -r0
            return r2
        L1f:
            return r0
    }

    public final void c(defpackage.n1 r6) {
            r5 = this;
            android.view.View r0 = r5.k
            r1 = 0
            if (r0 != 0) goto L19
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.t
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.k = r0
            r5.addView(r0)
            goto L24
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L24
            android.view.View r0 = r5.k
            r5.addView(r0)
        L24:
            android.view.View r0 = r5.k
            r2 = 2131296319(0x7f09003f, float:1.8210551E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.l = r0
            x0 r2 = new x0
            r2.<init>(r1, r6)
            r0.setOnClickListener(r2)
            ku r6 = r6.c()
            j1 r0 = r5.d
            if (r0 == 0) goto L51
            r0.f()
            f1 r0 = r0.t
            if (r0 == 0) goto L51
            boolean r2 = r0.b()
            if (r2 == 0) goto L51
            tu r0 = r0.i
            r0.dismiss()
        L51:
            j1 r0 = new j1
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.d = r0
            r2 = 1
            r0.l = r2
            r0.m = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            j1 r2 = r5.d
            android.content.Context r3 = r5.b
            r6.b(r2, r3)
            j1 r6 = r5.d
            fv r2 = r6.h
            if (r2 != 0) goto L89
            android.view.LayoutInflater r3 = r6.d
            int r4 = r6.f
            android.view.View r1 = r3.inflate(r4, r5, r1)
            fv r1 = (defpackage.fv) r1
            r6.h = r1
            ku r3 = r6.c
            r1.b(r3)
            r6.h()
        L89:
            fv r1 = r6.h
            if (r2 == r1) goto L93
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L93:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.c = r1
            java.util.WeakHashMap r6 = defpackage.ja0.a
            r6 = 0
            defpackage.s90.q(r1, r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.c
            r5.addView(r6, r0)
            return
    }

    public final void d() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.n
            if (r0 != 0) goto L51
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131492864(0x7f0c0000, float:1.8609192E38)
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.n = r0
            r1 = 2131296310(0x7f090036, float:1.8210533E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.o = r0
            android.widget.LinearLayout r0 = r6.n
            r1 = 2131296309(0x7f090035, float:1.8210531E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.p = r0
            int r0 = r6.q
            if (r0 == 0) goto L44
            android.widget.TextView r1 = r6.o
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L44:
            int r0 = r6.r
            if (r0 == 0) goto L51
            android.widget.TextView r1 = r6.p
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L51:
            android.widget.TextView r0 = r6.o
            java.lang.CharSequence r1 = r6.i
            r0.setText(r1)
            android.widget.TextView r0 = r6.p
            java.lang.CharSequence r1 = r6.j
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.CharSequence r1 = r6.j
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            android.widget.TextView r2 = r6.p
            r3 = 8
            r4 = 0
            if (r1 != 0) goto L74
            r5 = r4
            goto L75
        L74:
            r5 = r3
        L75:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.n
            if (r0 == 0) goto L7e
            if (r1 != 0) goto L7f
        L7e:
            r3 = r4
        L7f:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.n
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L8f
            android.widget.LinearLayout r0 = r6.n
            r6.addView(r0)
        L8f:
            return
    }

    public final void e() {
            r2 = this;
            r2.removeAllViews()
            r0 = 0
            r2.m = r0
            r2.c = r0
            r2.d = r0
            android.view.View r1 = r2.l
            if (r1 == 0) goto L11
            r1.setOnClickListener(r0)
        L11:
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public int getAnimatedVisibility() {
            r1 = this;
            wa0 r0 = r1.f
            if (r0 == 0) goto L9
            a r0 = r1.a
            int r0 = r0.b
            return r0
        L9:
            int r0 = r1.getVisibility()
            return r0
    }

    public int getContentHeight() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.j
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.i
            return r0
    }

    public final void h(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L10
            wa0 r0 = r1.f
            if (r0 == 0) goto Ld
            r0.b()
        Ld:
            super.setVisibility(r2)
        L10:
            return
    }

    public final defpackage.wa0 i(int r4, long r5) {
            r3 = this;
            wa0 r0 = r3.f
            if (r0 == 0) goto L7
            r0.b()
        L7:
            a r0 = r3.a
            r1 = 0
            if (r4 != 0) goto L2b
            int r2 = r3.getVisibility()
            if (r2 == 0) goto L15
            r3.setAlpha(r1)
        L15:
            wa0 r1 = defpackage.ja0.a(r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.a(r2)
            r1.c(r5)
            androidx.appcompat.widget.ActionBarContextView r5 = r0.c
            r5.f = r1
            r0.b = r4
            r1.d(r0)
            return r1
        L2b:
            wa0 r2 = defpackage.ja0.a(r3)
            r2.a(r1)
            r2.c(r5)
            androidx.appcompat.widget.ActionBarContextView r5 = r0.c
            r5.f = r2
            r0.b = r4
            r2.d(r0)
            return r2
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
            r4 = this;
            super.onConfigurationChanged(r5)
            android.content.Context r5 = r4.getContext()
            r0 = 0
            int[] r1 = defpackage.xy.a
            r2 = 2130968581(0x7f040005, float:1.754582E38)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r0, r1, r2, r3)
            r0 = 13
            int r0 = r5.getLayoutDimension(r0, r3)
            r4.setContentHeight(r0)
            r5.recycle()
            j1 r5 = r4.d
            if (r5 == 0) goto L6b
            android.content.Context r0 = r5.b
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            int r0 = r0.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r0 > r3) goto L60
            if (r1 > r3) goto L60
            r0 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r1 <= r3) goto L40
            if (r2 > r0) goto L60
        L40:
            if (r1 <= r0) goto L45
            if (r2 <= r3) goto L45
            goto L60
        L45:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L5e
            r0 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r1 <= r3) goto L51
            if (r2 > r0) goto L5e
        L51:
            if (r1 <= r0) goto L56
            if (r2 <= r3) goto L56
            goto L5e
        L56:
            r0 = 360(0x168, float:5.04E-43)
            if (r1 < r0) goto L5c
            r0 = 3
            goto L61
        L5c:
            r0 = 2
            goto L61
        L5e:
            r0 = 4
            goto L61
        L60:
            r0 = 5
        L61:
            r5.p = r0
            ku r5 = r5.c
            if (r5 == 0) goto L6b
            r0 = 1
            r5.p(r0)
        L6b:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            j1 r0 = r2.d
            if (r0 == 0) goto L1b
            r0.f()
            j1 r0 = r2.d
            f1 r0 = r0.t
            if (r0 == 0) goto L1b
            boolean r1 = r0.b()
            if (r1 == 0) goto L1b
            tu r0 = r0.i
            r0.dismiss()
        L1b:
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.h = r1
        Lb:
            boolean r3 = r5.h
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.h = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L23
            r6 = 3
            if (r0 != r6) goto L22
            goto L23
        L22:
            return r4
        L23:
            r5.h = r1
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            boolean r5 = defpackage.cb0.a(r4)
            if (r5 == 0) goto Le
            int r0 = r8 - r6
            int r1 = r4.getPaddingRight()
            int r0 = r0 - r1
            goto L12
        Le:
            int r0 = r4.getPaddingLeft()
        L12:
            int r1 = r4.getPaddingTop()
            int r9 = r9 - r7
            int r7 = r4.getPaddingTop()
            int r9 = r9 - r7
            int r7 = r4.getPaddingBottom()
            int r9 = r9 - r7
            android.view.View r7 = r4.k
            r2 = 8
            if (r7 == 0) goto L56
            int r7 = r7.getVisibility()
            if (r7 == r2) goto L56
            android.view.View r7 = r4.k
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            if (r5 == 0) goto L3a
            int r3 = r7.rightMargin
            goto L3c
        L3a:
            int r3 = r7.leftMargin
        L3c:
            if (r5 == 0) goto L41
            int r7 = r7.leftMargin
            goto L43
        L41:
            int r7 = r7.rightMargin
        L43:
            if (r5 == 0) goto L47
            int r0 = r0 - r3
            goto L48
        L47:
            int r0 = r0 + r3
        L48:
            android.view.View r3 = r4.k
            int r3 = g(r3, r0, r1, r9, r5)
            int r3 = r3 + r0
            if (r5 == 0) goto L54
            int r3 = r3 - r7
        L52:
            r0 = r3
            goto L56
        L54:
            int r3 = r3 + r7
            goto L52
        L56:
            android.widget.LinearLayout r7 = r4.n
            if (r7 == 0) goto L6b
            android.view.View r3 = r4.m
            if (r3 != 0) goto L6b
            int r7 = r7.getVisibility()
            if (r7 == r2) goto L6b
            android.widget.LinearLayout r7 = r4.n
            int r7 = g(r7, r0, r1, r9, r5)
            int r0 = r0 + r7
        L6b:
            android.view.View r7 = r4.m
            if (r7 == 0) goto L72
            g(r7, r0, r1, r9, r5)
        L72:
            if (r5 == 0) goto L79
            int r6 = r4.getPaddingLeft()
            goto L80
        L79:
            int r8 = r8 - r6
            int r6 = r4.getPaddingRight()
            int r6 = r8 - r6
        L80:
            androidx.appcompat.widget.ActionMenuView r7 = r4.c
            if (r7 == 0) goto L89
            r5 = r5 ^ 1
            g(r7, r6, r1, r9, r5)
        L89:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Lf6
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Le2
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.e
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            int r0 = android.view.View.MeasureSpec.getSize(r12)
        L1b:
            int r12 = r10.getPaddingTop()
            int r2 = r10.getPaddingBottom()
            int r2 = r2 + r12
            int r12 = r10.getPaddingLeft()
            int r12 = r11 - r12
            int r3 = r10.getPaddingRight()
            int r12 = r12 - r3
            int r3 = r0 - r2
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            android.view.View r6 = r10.k
            if (r6 == 0) goto L4d
            int r12 = f(r6, r12, r5)
            android.view.View r6 = r10.k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r12 = r12 - r7
        L4d:
            androidx.appcompat.widget.ActionMenuView r6 = r10.c
            if (r6 == 0) goto L5d
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L5d
            androidx.appcompat.widget.ActionMenuView r6 = r10.c
            int r12 = f(r6, r12, r5)
        L5d:
            android.widget.LinearLayout r6 = r10.n
            r7 = 0
            if (r6 == 0) goto L91
            android.view.View r8 = r10.m
            if (r8 != 0) goto L91
            boolean r8 = r10.s
            if (r8 == 0) goto L8d
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.n
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.n
            int r5 = r5.getMeasuredWidth()
            if (r5 > r12) goto L7d
            r6 = 1
            goto L7e
        L7d:
            r6 = r7
        L7e:
            if (r6 == 0) goto L81
            int r12 = r12 - r5
        L81:
            android.widget.LinearLayout r5 = r10.n
            if (r6 == 0) goto L87
            r6 = r7
            goto L89
        L87:
            r6 = 8
        L89:
            r5.setVisibility(r6)
            goto L91
        L8d:
            int r12 = f(r6, r12, r5)
        L91:
            android.view.View r5 = r10.m
            if (r5 == 0) goto Lc0
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r6 = r5.width
            r8 = -2
            if (r6 == r8) goto La0
            r9 = r1
            goto La1
        La0:
            r9 = r4
        La1:
            if (r6 < 0) goto La7
            int r12 = java.lang.Math.min(r6, r12)
        La7:
            int r5 = r5.height
            if (r5 == r8) goto Lac
            goto Lad
        Lac:
            r1 = r4
        Lad:
            if (r5 < 0) goto Lb3
            int r3 = java.lang.Math.min(r5, r3)
        Lb3:
            android.view.View r4 = r10.m
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r12, r1)
        Lc0:
            int r12 = r10.e
            if (r12 > 0) goto Lde
            int r12 = r10.getChildCount()
            r0 = r7
        Lc9:
            if (r7 >= r12) goto Lda
            android.view.View r1 = r10.getChildAt(r7)
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            if (r1 <= r0) goto Ld7
            r0 = r1
        Ld7:
            int r7 = r7 + 1
            goto Lc9
        Lda:
            r10.setMeasuredDimension(r11, r0)
            return
        Lde:
            r10.setMeasuredDimension(r11, r0)
            return
        Le2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.Class r12 = r10.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r0 = " can only be used with android:layout_height=\"wrap_content\""
            java.lang.String r12 = r12.concat(r0)
            r11.<init>(r12)
            throw r11
        Lf6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.Class r12 = r10.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r0 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            java.lang.String r12 = r12.concat(r0)
            r11.<init>(r12)
            throw r11
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.g = r1
        L9:
            boolean r2 = r4.g
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.g = r3
        L18:
            if (r0 == r3) goto L1f
            r5 = 3
            if (r0 != r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            r4.g = r1
            return r3
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.m
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.m = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.n
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.n = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.j = r1
            r0.d()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.i = r1
            r0.d()
            defpackage.ja0.m(r0, r1)
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.s
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.s = r2
            return
    }

    @Override // android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            r0.h(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
