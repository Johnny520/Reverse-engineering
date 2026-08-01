package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends defpackage.tq implements defpackage.ju, defpackage.fv {
    public defpackage.ku p;
    public android.content.Context q;
    public int r;
    public boolean s;
    public defpackage.j1 t;
    public defpackage.d70 u;
    public boolean v;
    public int w;
    public final int x;
    public final int y;
    public defpackage.m1 z;

    public ActionMenuView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r4, r0)
            r2.setBaselineAligned(r0)
            android.content.res.Resources r4 = r3.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r1 = 1113587712(0x42600000, float:56.0)
            float r1 = r1 * r4
            int r1 = (int) r1
            r2.x = r1
            r1 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.y = r4
            r2.q = r3
            r2.r = r0
            return
    }

    public static defpackage.l1 j() {
            l1 r0 = new l1
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 0
            r0.a = r1
            r1 = 16
            r0.gravity = r1
            return r0
    }

    public static defpackage.l1 k(android.view.ViewGroup.LayoutParams r1) {
            if (r1 == 0) goto L20
            boolean r0 = r1 instanceof defpackage.l1
            if (r0 == 0) goto L12
            l1 r0 = new l1
            l1 r1 = (defpackage.l1) r1
            r0.<init>(r1)
            boolean r1 = r1.a
            r0.a = r1
            goto L17
        L12:
            l1 r0 = new l1
            r0.<init>(r1)
        L17:
            int r1 = r0.gravity
            if (r1 > 0) goto L1f
            r1 = 16
            r0.gravity = r1
        L1f:
            return r0
        L20:
            l1 r1 = j()
            return r1
    }

    @Override // defpackage.ju
    public final boolean a(defpackage.ou r4) {
            r3 = this;
            ku r0 = r3.p
            r1 = 0
            r2 = 0
            boolean r4 = r0.q(r4, r2, r1)
            return r4
    }

    @Override // defpackage.fv
    public final void b(defpackage.ku r1) {
            r0 = this;
            r0.p = r1
            return
    }

    @Override // defpackage.tq, android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof defpackage.l1
            return r1
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.tq
    public final /* bridge */ /* synthetic */ defpackage.sq f() {
            r1 = this;
            l1 r0 = j()
            return r0
    }

    @Override // defpackage.tq
    public final defpackage.sq g(android.util.AttributeSet r3) {
            r2 = this;
            l1 r0 = new l1
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // defpackage.tq, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            l1 r0 = j()
            return r0
    }

    @Override // defpackage.tq, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            l1 r0 = new l1
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // defpackage.tq, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            l1 r1 = k(r1)
            return r1
    }

    public android.view.Menu getMenu() {
            r4 = this;
            ku r0 = r4.p
            if (r0 != 0) goto L3b
            android.content.Context r0 = r4.getContext()
            ku r1 = new ku
            r1.<init>(r0)
            r4.p = r1
            l0 r2 = new l0
            r3 = 2
            r2.<init>(r3, r4)
            r1.e = r2
            j1 r1 = new j1
            r1.<init>(r0)
            r4.t = r1
            r0 = 1
            r1.l = r0
            r1.m = r0
            vh r0 = new vh
            r2 = 13
            r0.<init>(r2)
            r1.e = r0
            ku r0 = r4.p
            android.content.Context r2 = r4.q
            r0.b(r1, r2)
            j1 r0 = r4.t
            r0.h = r4
            ku r0 = r0.c
            r4.p = r0
        L3b:
            ku r0 = r4.p
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r2 = this;
            r2.getMenu()
            j1 r0 = r2.t
            i1 r1 = r0.i
            if (r1 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            return r0
        Le:
            boolean r1 = r0.k
            if (r1 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r0.j
            return r0
        L15:
            r0 = 0
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.tq
    public final /* bridge */ /* synthetic */ defpackage.sq h(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            l1 r1 = k(r1)
            return r1
    }

    public final boolean l(int r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5 + (-1)
            android.view.View r1 = r4.getChildAt(r1)
            android.view.View r2 = r4.getChildAt(r5)
            int r3 = r4.getChildCount()
            if (r5 >= r3) goto L1e
            boolean r3 = r1 instanceof defpackage.k1
            if (r3 == 0) goto L1e
            k1 r1 = (defpackage.k1) r1
            boolean r0 = r1.a()
        L1e:
            if (r5 <= 0) goto L2c
            boolean r5 = r2 instanceof defpackage.k1
            if (r5 == 0) goto L2c
            k1 r2 = (defpackage.k1) r2
            boolean r5 = r2.b()
            r5 = r5 | r0
            return r5
        L2c:
            return r0
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            j1 r1 = r0.t
            if (r1 == 0) goto L1c
            r1.h()
            j1 r1 = r0.t
            boolean r1 = r1.j()
            if (r1 == 0) goto L1c
            j1 r1 = r0.t
            r1.f()
            j1 r1 = r0.t
            r1.l()
        L1c:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            j1 r0 = r2.t
            if (r0 == 0) goto L19
            r0.f()
            f1 r0 = r0.t
            if (r0 == 0) goto L19
            boolean r1 = r0.b()
            if (r1 == 0) goto L19
            tu r0 = r0.i
            r0.dismiss()
        L19:
            return
    }

    @Override // defpackage.tq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            boolean r1 = r0.v
            if (r1 != 0) goto La
            super.onLayout(r18, r19, r20, r21, r22)
            return
        La:
            int r1 = r0.getChildCount()
            int r2 = r22 - r20
            int r2 = r2 / 2
            int r3 = r0.getDividerWidth()
            int r4 = r21 - r19
            int r5 = r0.getPaddingRight()
            int r5 = r4 - r5
            int r6 = r0.getPaddingLeft()
            int r5 = r5 - r6
            boolean r6 = defpackage.cb0.a(r0)
            r8 = 0
            r9 = 0
            r10 = 0
        L2a:
            r11 = 8
            r12 = 1
            if (r8 >= r1) goto L8d
            android.view.View r13 = r0.getChildAt(r8)
            int r14 = r13.getVisibility()
            if (r14 != r11) goto L3a
            goto L8a
        L3a:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            l1 r11 = (defpackage.l1) r11
            boolean r14 = r11.a
            if (r14 == 0) goto L7a
            int r9 = r13.getMeasuredWidth()
            boolean r14 = r0.l(r8)
            if (r14 == 0) goto L4f
            int r9 = r9 + r3
        L4f:
            int r14 = r13.getMeasuredHeight()
            if (r6 == 0) goto L5f
            int r15 = r0.getPaddingLeft()
            int r11 = r11.leftMargin
            int r15 = r15 + r11
            int r11 = r15 + r9
            goto L6f
        L5f:
            int r15 = r0.getWidth()
            int r16 = r0.getPaddingRight()
            int r15 = r15 - r16
            int r11 = r11.rightMargin
            int r11 = r15 - r11
            int r15 = r11 - r9
        L6f:
            int r16 = r14 / 2
            int r7 = r2 - r16
            int r14 = r14 + r7
            r13.layout(r15, r7, r11, r14)
            int r5 = r5 - r9
            r9 = r12
            goto L8a
        L7a:
            int r7 = r13.getMeasuredWidth()
            int r12 = r11.leftMargin
            int r7 = r7 + r12
            int r11 = r11.rightMargin
            int r7 = r7 + r11
            int r5 = r5 - r7
            r0.l(r8)
            int r10 = r10 + 1
        L8a:
            int r8 = r8 + 1
            goto L2a
        L8d:
            if (r1 != r12) goto Lac
            if (r9 != 0) goto Lac
            r3 = 0
            android.view.View r1 = r0.getChildAt(r3)
            int r3 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            int r4 = r4 / 2
            int r6 = r3 / 2
            int r4 = r4 - r6
            int r6 = r5 / 2
            int r2 = r2 - r6
            int r3 = r3 + r4
            int r5 = r5 + r2
            r1.layout(r4, r2, r3, r5)
            return
        Lac:
            r3 = r9 ^ 1
            int r10 = r10 - r3
            if (r10 <= 0) goto Lb5
            int r3 = r5 / r10
        Lb3:
            r4 = 0
            goto Lb7
        Lb5:
            r3 = 0
            goto Lb3
        Lb7:
            int r3 = java.lang.Math.max(r4, r3)
            if (r6 == 0) goto Lfb
            int r5 = r0.getWidth()
            int r6 = r0.getPaddingRight()
            int r5 = r5 - r6
            r7 = r4
        Lc7:
            if (r7 >= r1) goto L135
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            l1 r6 = (defpackage.l1) r6
            int r8 = r4.getVisibility()
            if (r8 == r11) goto Lf8
            boolean r8 = r6.a
            if (r8 == 0) goto Lde
            goto Lf8
        Lde:
            int r8 = r6.rightMargin
            int r5 = r5 - r8
            int r8 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 - r8
            int r9 = r9 + r10
            r4.layout(r12, r10, r5, r9)
            int r4 = r6.leftMargin
            int r8 = r8 + r4
            int r8 = r8 + r3
            int r5 = r5 - r8
        Lf8:
            int r7 = r7 + 1
            goto Lc7
        Lfb:
            int r5 = r0.getPaddingLeft()
            r7 = r4
        L100:
            if (r7 >= r1) goto L135
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            l1 r6 = (defpackage.l1) r6
            int r8 = r4.getVisibility()
            if (r8 == r11) goto L132
            boolean r8 = r6.a
            if (r8 == 0) goto L117
            goto L132
        L117:
            int r8 = r6.leftMargin
            int r5 = r5 + r8
            int r8 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 + r8
            int r9 = r9 + r10
            r4.layout(r5, r10, r12, r9)
            int r4 = r6.rightMargin
            int r8 = r8 + r4
            int r8 = r8 + r3
            int r8 = r8 + r5
            r5 = r8
        L132:
            int r7 = r7 + 1
            goto L100
        L135:
            return
    }

    @Override // defpackage.tq, android.view.View
    public final void onMeasure(int r31, int r32) {
            r30 = this;
            r0 = r30
            boolean r1 = r0.v
            int r2 = android.view.View.MeasureSpec.getMode(r31)
            r3 = 1
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 != r5) goto L10
            r2 = r3
            goto L11
        L10:
            r2 = r4
        L11:
            r0.v = r2
            if (r1 == r2) goto L17
            r0.w = r4
        L17:
            int r1 = android.view.View.MeasureSpec.getSize(r31)
            boolean r2 = r0.v
            if (r2 == 0) goto L2c
            ku r2 = r0.p
            if (r2 == 0) goto L2c
            int r6 = r0.w
            if (r1 == r6) goto L2c
            r0.w = r1
            r2.p(r3)
        L2c:
            int r1 = r0.getChildCount()
            boolean r2 = r0.v
            if (r2 == 0) goto L2fb
            if (r1 <= 0) goto L2fb
            int r1 = android.view.View.MeasureSpec.getMode(r32)
            int r2 = android.view.View.MeasureSpec.getSize(r31)
            int r6 = android.view.View.MeasureSpec.getSize(r32)
            int r7 = r0.getPaddingLeft()
            int r8 = r0.getPaddingRight()
            int r8 = r8 + r7
            int r7 = r0.getPaddingTop()
            int r9 = r0.getPaddingBottom()
            int r9 = r9 + r7
            r7 = -2
            r10 = r32
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r10, r9, r7)
            int r2 = r2 - r8
            int r8 = r0.x
            int r10 = r2 / r8
            int r11 = r2 % r8
            if (r10 != 0) goto L68
            r0.setMeasuredDimension(r2, r4)
            return
        L68:
            int r11 = r11 / r10
            int r11 = r11 + r8
            int r8 = r0.getChildCount()
            r3 = r4
            r12 = r3
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r31 = 0
            r18 = 0
        L79:
            int r5 = r0.y
            if (r14 >= r8) goto L166
            android.view.View r4 = r0.getChildAt(r14)
            r21 = r6
            int r6 = r4.getVisibility()
            r22 = r9
            r9 = 8
            if (r6 != r9) goto L91
            r23 = r11
            goto L15b
        L91:
            boolean r6 = r4 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r12 = r12 + 1
            r9 = 0
            if (r6 == 0) goto L9b
            r4.setPadding(r5, r9, r5, r9)
        L9b:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            l1 r5 = (defpackage.l1) r5
            r5.f = r9
            r5.c = r9
            r5.b = r9
            r5.d = r9
            r5.leftMargin = r9
            r5.rightMargin = r9
            if (r6 == 0) goto Lbe
            r9 = r4
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            java.lang.CharSequence r9 = r9.getText()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto Lbe
            r9 = 1
            goto Lbf
        Lbe:
            r9 = 0
        Lbf:
            r5.e = r9
            boolean r9 = r5.a
            if (r9 == 0) goto Lc7
            r9 = 1
            goto Lc8
        Lc7:
            r9 = r10
        Lc8:
            android.view.ViewGroup$LayoutParams r23 = r4.getLayoutParams()
            r24 = r6
            r6 = r23
            l1 r6 = (defpackage.l1) r6
            int r23 = android.view.View.MeasureSpec.getSize(r7)
            r25 = r10
            int r10 = r23 - r22
            r23 = r11
            int r11 = android.view.View.MeasureSpec.getMode(r7)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            if (r24 == 0) goto Lea
            r11 = r4
            androidx.appcompat.view.menu.ActionMenuItemView r11 = (androidx.appcompat.view.menu.ActionMenuItemView) r11
            goto Leb
        Lea:
            r11 = 0
        Leb:
            if (r11 == 0) goto Lf9
            java.lang.CharSequence r11 = r11.getText()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto Lf9
            r11 = 1
            goto Lfa
        Lf9:
            r11 = 0
        Lfa:
            r24 = r11
            if (r9 <= 0) goto L121
            if (r11 == 0) goto L103
            r11 = 2
            if (r9 < r11) goto L121
        L103:
            int r11 = r23 * r9
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r9)
            r4.measure(r9, r10)
            int r9 = r4.getMeasuredWidth()
            int r11 = r9 / r23
            int r9 = r9 % r23
            if (r9 == 0) goto L11a
            int r11 = r11 + 1
        L11a:
            if (r24 == 0) goto L122
            r9 = 2
            if (r11 >= r9) goto L122
            r11 = 2
            goto L122
        L121:
            r11 = 0
        L122:
            boolean r9 = r6.a
            if (r9 != 0) goto L12a
            if (r24 == 0) goto L12a
            r9 = 1
            goto L12b
        L12a:
            r9 = 0
        L12b:
            r6.d = r9
            r6.b = r11
            int r6 = r11 * r23
            r9 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r4.measure(r6, r10)
            int r13 = java.lang.Math.max(r13, r11)
            boolean r6 = r5.d
            if (r6 == 0) goto L144
            int r16 = r16 + 1
        L144:
            boolean r5 = r5.a
            if (r5 == 0) goto L149
            r15 = 1
        L149:
            int r10 = r25 - r11
            int r4 = r4.getMeasuredHeight()
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 1
            if (r11 != r4) goto L15b
            int r5 = r4 << r14
            long r4 = (long) r5
            long r18 = r18 | r4
        L15b:
            int r14 = r14 + 1
            r6 = r21
            r9 = r22
            r11 = r23
            r4 = 0
            goto L79
        L166:
            r21 = r6
            r25 = r10
            r23 = r11
            if (r15 == 0) goto L173
            r9 = 2
            if (r12 != r9) goto L173
            r4 = 1
            goto L174
        L173:
            r4 = 0
        L174:
            r10 = r25
            r6 = 0
        L177:
            r24 = 1
            if (r16 <= 0) goto L208
            if (r10 <= 0) goto L208
            r9 = 2147483647(0x7fffffff, float:NaN)
            r26 = r31
            r11 = 0
            r14 = 0
        L184:
            if (r14 >= r8) goto L1b4
            android.view.View r22 = r0.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r22 = r22.getLayoutParams()
            r28 = r3
            r3 = r22
            l1 r3 = (defpackage.l1) r3
            r22 = r4
            boolean r4 = r3.d
            if (r4 != 0) goto L19b
            goto L1ad
        L19b:
            int r3 = r3.b
            if (r3 >= r9) goto L1a4
            long r26 = r24 << r14
            r9 = r3
            r11 = 1
            goto L1ad
        L1a4:
            if (r3 != r9) goto L1ad
            long r3 = r24 << r14
            long r26 = r26 | r3
            int r3 = r11 + 1
            r11 = r3
        L1ad:
            int r14 = r14 + 1
            r4 = r22
            r3 = r28
            goto L184
        L1b4:
            r28 = r3
            r22 = r4
            long r18 = r18 | r26
            if (r11 <= r10) goto L1bf
        L1bc:
            r29 = r15
            goto L20b
        L1bf:
            int r9 = r9 + 1
            r3 = 0
        L1c2:
            if (r3 >= r8) goto L201
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            l1 r6 = (defpackage.l1) r6
            r17 = 1
            int r11 = r17 << r3
            r29 = r15
            long r14 = (long) r11
            long r24 = r26 & r14
            int r11 = (r24 > r31 ? 1 : (r24 == r31 ? 0 : -1))
            if (r11 != 0) goto L1e2
            int r4 = r6.b
            if (r4 != r9) goto L1fc
            long r18 = r18 | r14
            goto L1fc
        L1e2:
            if (r22 == 0) goto L1f2
            boolean r11 = r6.e
            if (r11 == 0) goto L1f2
            r11 = 1
            if (r10 != r11) goto L1f3
            int r14 = r5 + r23
            r15 = 0
            r4.setPadding(r14, r15, r5, r15)
            goto L1f3
        L1f2:
            r11 = 1
        L1f3:
            int r4 = r6.b
            int r4 = r4 + r11
            r6.b = r4
            r6.f = r11
            int r10 = r10 + (-1)
        L1fc:
            int r3 = r3 + 1
            r15 = r29
            goto L1c2
        L201:
            r4 = r22
            r3 = r28
            r6 = 1
            goto L177
        L208:
            r28 = r3
            goto L1bc
        L20b:
            r4 = 1
            if (r29 != 0) goto L212
            if (r12 != r4) goto L212
            r3 = r4
            goto L213
        L212:
            r3 = 0
        L213:
            if (r10 <= 0) goto L2c5
            int r5 = (r18 > r31 ? 1 : (r18 == r31 ? 0 : -1))
            if (r5 == 0) goto L2c5
            int r12 = r12 - r4
            if (r10 < r12) goto L220
            if (r3 != 0) goto L220
            if (r13 <= r4) goto L2c5
        L220:
            int r4 = java.lang.Long.bitCount(r18)
            float r4 = (float) r4
            if (r3 != 0) goto L25b
            long r11 = r18 & r24
            int r3 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r3 == 0) goto L23f
            r15 = 0
            android.view.View r3 = r0.getChildAt(r15)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            l1 r3 = (defpackage.l1) r3
            boolean r3 = r3.e
            if (r3 != 0) goto L23f
            float r4 = r4 - r5
        L23f:
            int r3 = r8 + (-1)
            r17 = 1
            int r9 = r17 << r3
            long r11 = (long) r9
            long r11 = r18 & r11
            int r9 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
            if (r9 == 0) goto L25b
            android.view.View r3 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            l1 r3 = (defpackage.l1) r3
            boolean r3 = r3.e
            if (r3 != 0) goto L25b
            float r4 = r4 - r5
        L25b:
            r3 = 0
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L266
            int r10 = r10 * r23
            float r3 = (float) r10
            float r3 = r3 / r4
            int r9 = (int) r3
            goto L267
        L266:
            r9 = 0
        L267:
            r4 = r6
            r3 = 0
        L269:
            if (r3 >= r8) goto L2c4
            r17 = 1
            int r5 = r17 << r3
            long r5 = (long) r5
            long r5 = r18 & r5
            int r5 = (r5 > r31 ? 1 : (r5 == r31 ? 0 : -1))
            if (r5 != 0) goto L27a
            r11 = 1
            r20 = 2
            goto L2c1
        L27a:
            android.view.View r5 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            l1 r6 = (defpackage.l1) r6
            boolean r5 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r5 == 0) goto L2a0
            r6.c = r9
            r4 = 1
            r6.f = r4
            if (r3 != 0) goto L29b
            boolean r4 = r6.e
            if (r4 != 0) goto L29b
            int r4 = -r9
            r20 = 2
            int r4 = r4 / 2
            r6.leftMargin = r4
            goto L29d
        L29b:
            r20 = 2
        L29d:
            r4 = 1
            r11 = 1
            goto L2c1
        L2a0:
            r20 = 2
            boolean r5 = r6.a
            if (r5 == 0) goto L2b2
            r6.c = r9
            r11 = 1
            r6.f = r11
            int r4 = -r9
            int r4 = r4 / 2
            r6.rightMargin = r4
            r4 = r11
            goto L2c1
        L2b2:
            r11 = 1
            if (r3 == 0) goto L2b9
            int r5 = r9 / 2
            r6.leftMargin = r5
        L2b9:
            int r5 = r8 + (-1)
            if (r3 == r5) goto L2c1
            int r5 = r9 / 2
            r6.rightMargin = r5
        L2c1:
            int r3 = r3 + 1
            goto L269
        L2c4:
            r6 = r4
        L2c5:
            if (r6 == 0) goto L2ee
            r4 = 0
        L2c8:
            if (r4 >= r8) goto L2ee
            android.view.View r3 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            l1 r5 = (defpackage.l1) r5
            boolean r6 = r5.f
            if (r6 != 0) goto L2db
            r9 = 1073741824(0x40000000, float:2.0)
            goto L2eb
        L2db:
            int r6 = r5.b
            int r6 = r6 * r23
            int r5 = r5.c
            int r6 = r6 + r5
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r3.measure(r5, r7)
        L2eb:
            int r4 = r4 + 1
            goto L2c8
        L2ee:
            r9 = 1073741824(0x40000000, float:2.0)
            if (r1 == r9) goto L2f5
            r6 = r28
            goto L2f7
        L2f5:
            r6 = r21
        L2f7:
            r0.setMeasuredDimension(r2, r6)
            return
        L2fb:
            r10 = r32
            r9 = 0
        L2fe:
            if (r9 >= r1) goto L312
            android.view.View r2 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            l1 r2 = (defpackage.l1) r2
            r15 = 0
            r2.rightMargin = r15
            r2.leftMargin = r15
            int r9 = r9 + 1
            goto L2fe
        L312:
            super.onMeasure(r31, r32)
            return
    }

    public void setExpandedActionViewsExclusive(boolean r2) {
            r1 = this;
            j1 r0 = r1.t
            r0.q = r2
            return
    }

    public void setOnMenuItemClickListener(defpackage.m1 r1) {
            r0 = this;
            r0.z = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            r2.getMenu()
            j1 r0 = r2.t
            i1 r1 = r0.i
            if (r1 == 0) goto Ld
            r1.setImageDrawable(r3)
            return
        Ld:
            r1 = 1
            r0.k = r1
            r0.j = r3
            return
    }

    public void setOverflowReserved(boolean r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.r
            if (r0 == r3) goto L1a
            r2.r = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.q = r3
            return
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.q = r0
        L1a:
            return
    }

    public void setPresenter(defpackage.j1 r1) {
            r0 = this;
            r0.t = r1
            r1.h = r0
            ku r1 = r1.c
            r0.p = r1
            return
    }
}
