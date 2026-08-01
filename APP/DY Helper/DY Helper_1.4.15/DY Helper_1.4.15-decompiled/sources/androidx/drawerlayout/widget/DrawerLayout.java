package androidx.drawerlayout.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends android.view.ViewGroup {

    /* JADX INFO: renamed from: Η */
    public static final int[] f1064 = null;

    /* JADX INFO: renamed from: Θ */
    public static final int[] f1065 = null;

    /* JADX INFO: renamed from: Α */
    public android.graphics.drawable.Drawable f1066;

    /* JADX INFO: renamed from: Β */
    public android.view.WindowInsets f1067;

    /* JADX INFO: renamed from: Γ */
    public boolean f1068;

    /* JADX INFO: renamed from: Δ */
    public final java.util.ArrayList f1069;

    /* JADX INFO: renamed from: Ε */
    public android.graphics.Rect f1070;

    /* JADX INFO: renamed from: Ζ */
    public android.graphics.Matrix f1071;

    /* JADX INFO: renamed from: ε */
    public float f1072;

    /* JADX INFO: renamed from: ζ */
    public final int f1073;

    /* JADX INFO: renamed from: η */
    public int f1074;

    /* JADX INFO: renamed from: θ */
    public float f1075;

    /* JADX INFO: renamed from: ι */
    public final android.graphics.Paint f1076;

    /* JADX INFO: renamed from: κ */
    public final p000.h92 f1077;

    /* JADX INFO: renamed from: λ */
    public final p000.h92 f1078;

    /* JADX INFO: renamed from: μ */
    public final p000.C0709q2 f1079;

    /* JADX INFO: renamed from: ν */
    public final p000.C0709q2 f1080;

    /* JADX INFO: renamed from: ξ */
    public int f1081;

    /* JADX INFO: renamed from: ο */
    public boolean f1082;

    /* JADX INFO: renamed from: π */
    public boolean f1083;

    /* JADX INFO: renamed from: ρ */
    public int f1084;

    /* JADX INFO: renamed from: σ */
    public int f1085;

    /* JADX INFO: renamed from: τ */
    public int f1086;

    /* JADX INFO: renamed from: υ */
    public int f1087;

    /* JADX INFO: renamed from: φ */
    public boolean f1088;

    /* JADX INFO: renamed from: χ */
    public java.util.ArrayList f1089;

    /* JADX INFO: renamed from: ψ */
    public float f1090;

    /* JADX INFO: renamed from: ω */
    public float f1091;

    static {
            r0 = 16843828(0x1010434, float:2.3696574E-38)
            int[] r0 = new int[]{r0}
            androidx.drawerlayout.widget.DrawerLayout.f1064 = r0
            r0 = 16842931(0x10100b3, float:2.369406E-38)
            int[] r0 = new int[]{r0}
            androidx.drawerlayout.widget.DrawerLayout.f1065 = r0
            return
    }

    public DrawerLayout(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public DrawerLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DrawerLayout(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            r7.<init>(r8, r9, r10)
            iw r9 = new iw
            r10 = 0
            r9.<init>(r10)
            r9 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r7.f1074 = r9
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r7.f1076 = r9
            r9 = 1
            r7.f1083 = r9
            r0 = 3
            r7.f1084 = r0
            r7.f1085 = r0
            r7.f1086 = r0
            r7.f1087 = r0
            r1 = 262144(0x40000, float:3.67342E-40)
            r7.setDescendantFocusability(r1)
            android.content.res.Resources r1 = r7.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1115684864(0x42800000, float:64.0)
            float r2 = r2 * r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            r7.f1073 = r2
            r2 = 1137180672(0x43c80000, float:400.0)
            float r2 = r2 * r1
            q2 r3 = new q2
            r3.<init>(r7, r0)
            r7.f1079 = r3
            q2 r0 = new q2
            r4 = 5
            r0.<init>(r7, r4)
            r7.f1080 = r0
            h92 r4 = new h92
            android.content.Context r5 = r7.getContext()
            r4.<init>(r5, r7, r3)
            int r5 = r4.f4644
            float r5 = (float) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r6
            int r5 = (int) r5
            r4.f4644 = r5
            r7.f1077 = r4
            r4.f4658 = r9
            r4.f4656 = r2
            r3.f8800 = r4
            h92 r3 = new h92
            android.content.Context r4 = r7.getContext()
            r3.<init>(r4, r7, r0)
            int r4 = r3.f4644
            float r4 = (float) r4
            float r6 = r6 * r4
            int r4 = (int) r6
            r3.f4644 = r4
            r7.f1078 = r3
            r4 = 2
            r3.f4658 = r4
            r3.f4656 = r2
            r0.f8800 = r3
            r7.setFocusableInTouchMode(r9)
            java.util.WeakHashMap r0 = p000.b92.f1572
            r7.setImportantForAccessibility(r9)
            hw r9 = new hw
            r9.<init>(r7)
            p000.b92.m828(r7, r9)
            r7.setMotionEventSplittingEnabled(r10)
            boolean r9 = r7.getFitsSystemWindows()
            if (r9 == 0) goto Lb8
            gw r9 = new gw
            r9.<init>()
            r7.setOnApplyWindowInsetsListener(r9)
            r9 = 1280(0x500, float:1.794E-42)
            r7.setSystemUiVisibility(r9)
            int[] r9 = androidx.drawerlayout.widget.DrawerLayout.f1064
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9)
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r10)     // Catch: java.lang.Throwable -> Lb3
            r7.f1066 = r9     // Catch: java.lang.Throwable -> Lb3
            r8.recycle()
            goto Lb8
        Lb3:
            r7 = move-exception
            r8.recycle()
            throw r7
        Lb8:
            r8 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r8
            r7.f1072 = r1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.f1069 = r8
            return
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m448(android.view.View r0) {
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            kw r0 = (p000.C0490kw) r0
            int r0 = r0.f6130
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m449(android.view.View r2) {
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            kw r0 = (p000.C0490kw) r0
            int r0 = r0.f6130
            java.util.WeakHashMap r1 = p000.b92.f1572
            int r2 = r2.getLayoutDirection()
            int r2 = android.view.Gravity.getAbsoluteGravity(r0, r2)
            r0 = r2 & 3
            if (r0 == 0) goto L17
            goto L1b
        L17:
            r2 = r2 & 5
            if (r2 == 0) goto L1d
        L1b:
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList r8, int r9, int r10) {
            r7 = this;
            int r0 = r7.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 != r1) goto L9
            return
        L9:
            int r0 = r7.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L10:
            java.util.ArrayList r4 = r7.f1069
            if (r2 >= r0) goto L43
            android.view.View r5 = r7.getChildAt(r2)
            boolean r6 = m449(r5)
            if (r6 == 0) goto L3d
            boolean r4 = m449(r5)
            if (r4 == 0) goto L35
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            kw r4 = (p000.C0490kw) r4
            int r4 = r4.f6133
            r6 = 1
            r4 = r4 & r6
            if (r4 != r6) goto L40
            r5.addFocusables(r8, r9, r10)
            r3 = r6
            goto L40
        L35:
            java.lang.String r7 = "View "
            java.lang.String r8 = " is not a drawer"
            p000.ql1.m4938(r7, r5, r8)
            return
        L3d:
            r4.add(r5)
        L40:
            int r2 = r2 + 1
            goto L10
        L43:
            if (r3 != 0) goto L5d
            int r7 = r4.size()
        L49:
            if (r1 >= r7) goto L5d
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r2 = r0.getVisibility()
            if (r2 != 0) goto L5a
            r0.addFocusables(r8, r9, r10)
        L5a:
            int r1 = r1 + 1
            goto L49
        L5d:
            r4.clear()
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            super.addView(r4, r5, r6)
            int r5 = r3.getChildCount()
            r6 = 0
        L8:
            r0 = 1
            if (r6 >= r5) goto L1e
            android.view.View r1 = r3.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            kw r2 = (p000.C0490kw) r2
            int r2 = r2.f6133
            r2 = r2 & r0
            if (r2 != r0) goto L1b
            goto L1f
        L1b:
            int r6 = r6 + 1
            goto L8
        L1e:
            r1 = 0
        L1f:
            if (r1 != 0) goto L2e
            boolean r3 = m449(r4)
            if (r3 == 0) goto L28
            goto L2e
        L28:
            java.util.WeakHashMap r3 = p000.b92.f1572
            r4.setImportantForAccessibility(r0)
            return
        L2e:
            java.util.WeakHashMap r3 = p000.b92.f1572
            r3 = 4
            r4.setImportantForAccessibility(r3)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.C0490kw
            if (r0 == 0) goto Lc
            boolean r1 = super.checkLayoutParams(r2)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final void computeScroll() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L1b
            android.view.View r3 = r4.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            kw r3 = (p000.C0490kw) r3
            float r3 = r3.f6131
            float r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L6
        L1b:
            r4.f1075 = r1
            h92 r0 = r4.f1077
            boolean r0 = r0.m2465()
            h92 r1 = r4.f1078
            boolean r1 = r1.m2465()
            if (r0 != 0) goto L2f
            if (r1 == 0) goto L2e
            goto L2f
        L2e:
            return
        L2f:
            java.util.WeakHashMap r0 = p000.b92.f1572
            r4.postInvalidateOnAnimation()
            return
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r9) {
            r8 = this;
            int r0 = r9.getSource()
            r0 = r0 & 2
            if (r0 == 0) goto Lc5
            int r0 = r9.getAction()
            r1 = 10
            if (r0 == r1) goto Lc5
            float r0 = r8.f1075
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L19
            goto Lc5
        L19:
            int r0 = r8.getChildCount()
            if (r0 == 0) goto Lc3
            float r1 = r9.getX()
            float r2 = r9.getY()
            r3 = 1
            int r0 = r0 - r3
        L29:
            if (r0 < 0) goto Lc3
            android.view.View r4 = r8.getChildAt(r0)
            android.graphics.Rect r5 = r8.f1070
            if (r5 != 0) goto L3a
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r8.f1070 = r5
        L3a:
            android.graphics.Rect r5 = r8.f1070
            r4.getHitRect(r5)
            android.graphics.Rect r5 = r8.f1070
            int r6 = (int) r1
            int r7 = (int) r2
            boolean r5 = r5.contains(r6, r7)
            if (r5 == 0) goto Lbf
            boolean r5 = m448(r4)
            if (r5 == 0) goto L50
            goto Lbf
        L50:
            android.graphics.Matrix r5 = r4.getMatrix()
            boolean r5 = r5.isIdentity()
            if (r5 != 0) goto L9c
            int r5 = r8.getScrollX()
            int r6 = r4.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            int r6 = r8.getScrollY()
            int r7 = r4.getTop()
            int r6 = r6 - r7
            float r6 = (float) r6
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r9)
            r7.offsetLocation(r5, r6)
            android.graphics.Matrix r5 = r4.getMatrix()
            boolean r6 = r5.isIdentity()
            if (r6 != 0) goto L94
            android.graphics.Matrix r6 = r8.f1071
            if (r6 != 0) goto L8a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            r8.f1071 = r6
        L8a:
            android.graphics.Matrix r6 = r8.f1071
            r5.invert(r6)
            android.graphics.Matrix r5 = r8.f1071
            r7.transform(r5)
        L94:
            boolean r4 = r4.dispatchGenericMotionEvent(r7)
            r7.recycle()
            goto Lbc
        L9c:
            int r5 = r8.getScrollX()
            int r6 = r4.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            int r6 = r8.getScrollY()
            int r7 = r4.getTop()
            int r6 = r6 - r7
            float r6 = (float) r6
            r9.offsetLocation(r5, r6)
            boolean r4 = r4.dispatchGenericMotionEvent(r9)
            float r5 = -r5
            float r6 = -r6
            r9.offsetLocation(r5, r6)
        Lbc:
            if (r4 == 0) goto Lbf
            return r3
        Lbf:
            int r0 = r0 + (-1)
            goto L29
        Lc3:
            r8 = 0
            return r8
        Lc5:
            boolean r8 = super.dispatchGenericMotionEvent(r9)
            return r8
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
            r11 = this;
            int r0 = r11.getHeight()
            boolean r1 = m448(r13)
            int r2 = r11.getWidth()
            int r3 = r12.save()
            r4 = 0
            if (r1 == 0) goto L62
            int r5 = r11.getChildCount()
            r6 = r4
            r7 = r6
        L19:
            if (r6 >= r5) goto L5a
            android.view.View r8 = r11.getChildAt(r6)
            if (r8 == r13) goto L57
            int r9 = r8.getVisibility()
            if (r9 != 0) goto L57
            android.graphics.drawable.Drawable r9 = r8.getBackground()
            if (r9 == 0) goto L57
            int r9 = r9.getOpacity()
            r10 = -1
            if (r9 != r10) goto L57
            boolean r9 = m449(r8)
            if (r9 == 0) goto L57
            int r9 = r8.getHeight()
            if (r9 >= r0) goto L41
            goto L57
        L41:
            r9 = 3
            boolean r9 = r11.m450(r8, r9)
            if (r9 == 0) goto L50
            int r8 = r8.getRight()
            if (r8 <= r7) goto L57
            r7 = r8
            goto L57
        L50:
            int r8 = r8.getLeft()
            if (r8 >= r2) goto L57
            r2 = r8
        L57:
            int r6 = r6 + 1
            goto L19
        L5a:
            int r0 = r11.getHeight()
            r12.clipRect(r7, r4, r2, r0)
            r4 = r7
        L62:
            boolean r13 = super.drawChild(r12, r13, r14)
            r12.restoreToCount(r3)
            float r14 = r11.f1075
            r15 = 0
            int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r15 <= 0) goto L94
            if (r1 == 0) goto L94
            int r15 = r11.f1074
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r15
            int r0 = r0 >>> 24
            float r0 = (float) r0
            float r0 = r0 * r14
            int r14 = (int) r0
            int r14 = r14 << 24
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r15 = r15 & r0
            r14 = r14 | r15
            android.graphics.Paint r10 = r11.f1076
            r10.setColor(r14)
            float r6 = (float) r4
            float r8 = (float) r2
            int r11 = r11.getHeight()
            float r9 = (float) r11
            r7 = 0
            r5 = r12
            r5.drawRect(r6, r7, r8, r9, r10)
        L94:
            return r13
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            kw r1 = new kw
            r0 = -1
            r1.<init>(r0, r0)
            r0 = 0
            r1.f6130 = r0
            return r1
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r4) {
            r3 = this;
            kw r0 = new kw
            android.content.Context r3 = r3.getContext()
            r0.<init>(r3, r4)
            r1 = 0
            r0.f6130 = r1
            int[] r2 = androidx.drawerlayout.widget.DrawerLayout.f1065
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r2)
            int r4 = r3.getInt(r1, r1)
            r0.f6130 = r4
            r3.recycle()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r1 = r2 instanceof p000.C0490kw
            r0 = 0
            if (r1 == 0) goto L13
            kw r1 = new kw
            kw r2 = (p000.C0490kw) r2
            r1.<init>(r2)
            r1.f6130 = r0
            int r2 = r2.f6130
            r1.f6130 = r2
            return r1
        L13:
            boolean r1 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L21
            kw r1 = new kw
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r1.<init>(r2)
            r1.f6130 = r0
            return r1
        L21:
            kw r1 = new kw
            r1.<init>(r2)
            r1.f6130 = r0
            return r1
    }

    public float getDrawerElevation() {
            r0 = this;
            float r0 = r0.f1072
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarBackgroundDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f1066
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.f1083 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 1
            r1.f1083 = r0
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f1068
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r4.f1066
            if (r0 == 0) goto L26
            android.view.WindowInsets r0 = r4.f1067
            r1 = 0
            if (r0 == 0) goto L15
            int r0 = r0.getSystemWindowInsetTop()
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 <= 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.f1066
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r4 = r4.f1066
            r4.draw(r5)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            int r0 = r9.getActionMasked()
            h92 r1 = r8.f1077
            boolean r2 = r1.m2476(r9)
            h92 r3 = r8.f1078
            boolean r3 = r3.m2476(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L6d
            if (r0 == r3) goto L66
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L66
            goto L6b
        L1e:
            float[] r9 = r1.f4646
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L6b
            int r5 = r1.f4653
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L63
            float[] r5 = r1.f4648
            r5 = r5[r0]
            float[] r6 = r1.f4646
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f4649
            r6 = r6[r0]
            float[] r7 = r1.f4647
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f4644
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L63
            q2 r9 = r8.f1079
            java.lang.Object r0 = r9.f8802
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            java.lang.Object r9 = r9.f8801
            d1 r9 = (p000.RunnableC0196d1) r9
            r0.removeCallbacks(r9)
            q2 r9 = r8.f1080
            java.lang.Object r0 = r9.f8802
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            java.lang.Object r9 = r9.f8801
            d1 r9 = (p000.RunnableC0196d1) r9
            r0.removeCallbacks(r9)
            goto L6b
        L63:
            int r0 = r0 + 1
            goto L22
        L66:
            r8.m452(r3)
            r8.f1088 = r4
        L6b:
            r9 = r4
            goto L93
        L6d:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f1090 = r0
            r8.f1091 = r9
            float r5 = r8.f1075
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L90
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.m2467(r0, r9)
            if (r9 == 0) goto L90
            boolean r9 = m448(r9)
            if (r9 == 0) goto L90
            r9 = r3
            goto L91
        L90:
            r9 = r4
        L91:
            r8.f1088 = r4
        L93:
            if (r2 != 0) goto Lb6
            if (r9 != 0) goto Lb6
            int r9 = r8.getChildCount()
            r0 = r4
        L9c:
            if (r0 >= r9) goto Lb0
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            kw r1 = (p000.C0490kw) r1
            boolean r1 = r1.f6132
            if (r1 == 0) goto Lad
            goto Lb6
        Lad:
            int r0 = r0 + 1
            goto L9c
        Lb0:
            boolean r8 = r8.f1088
            if (r8 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r4
        Lb6:
            return r3
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto Le
            android.view.View r0 = r1.m454()
            if (r0 == 0) goto Le
            r3.startTracking()
            r1 = 1
            return r1
        Le:
            boolean r1 = super.onKeyDown(r2, r3)
            return r1
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto L18
            android.view.View r2 = r1.m454()
            r3 = 0
            if (r2 == 0) goto L13
            int r0 = r1.m455(r2)
            if (r0 != 0) goto L13
            r1.m452(r3)
        L13:
            if (r2 == 0) goto L17
            r1 = 1
            return r1
        L17:
            return r3
        L18:
            boolean r1 = super.onKeyUp(r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
            r16 = this;
            r0 = r16
            r1 = 1
            r0.f1082 = r1
            int r2 = r20 - r18
            int r3 = r0.getChildCount()
            r4 = 0
            r5 = r4
        Ld:
            if (r5 >= r3) goto Lcc
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L1d
            goto Lc7
        L1d:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            kw r7 = (p000.C0490kw) r7
            boolean r8 = m448(r6)
            if (r8 == 0) goto L3e
            int r8 = r7.leftMargin
            int r9 = r7.topMargin
            int r10 = r6.getMeasuredWidth()
            int r10 = r10 + r8
            int r7 = r7.topMargin
            int r11 = r6.getMeasuredHeight()
            int r11 = r11 + r7
            r6.layout(r8, r9, r10, r11)
            goto Lc7
        L3e:
            int r8 = r6.getMeasuredWidth()
            int r9 = r6.getMeasuredHeight()
            r10 = 3
            boolean r10 = r0.m450(r6, r10)
            if (r10 == 0) goto L59
            int r10 = -r8
            float r11 = (float) r8
            float r12 = r7.f6131
            float r12 = r12 * r11
            int r12 = (int) r12
            int r10 = r10 + r12
            int r12 = r8 + r10
            float r12 = (float) r12
            float r12 = r12 / r11
            goto L65
        L59:
            float r10 = (float) r8
            float r11 = r7.f6131
            float r11 = r11 * r10
            int r11 = (int) r11
            int r11 = r2 - r11
            int r12 = r2 - r11
            float r12 = (float) r12
            float r12 = r12 / r10
            r10 = r11
        L65:
            float r11 = r7.f6131
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 == 0) goto L6d
            r11 = r1
            goto L6e
        L6d:
            r11 = r4
        L6e:
            int r13 = r7.f6130
            r13 = r13 & 112(0x70, float:1.57E-43)
            r14 = 16
            if (r13 == r14) goto L95
            r14 = 80
            if (r13 == r14) goto L82
            int r13 = r7.topMargin
            int r8 = r8 + r10
            int r9 = r9 + r13
            r6.layout(r10, r13, r8, r9)
            goto Laf
        L82:
            int r9 = r21 - r19
            int r13 = r7.bottomMargin
            int r13 = r9 - r13
            int r14 = r6.getMeasuredHeight()
            int r13 = r13 - r14
            int r8 = r8 + r10
            int r14 = r7.bottomMargin
            int r9 = r9 - r14
            r6.layout(r10, r13, r8, r9)
            goto Laf
        L95:
            int r13 = r21 - r19
            int r14 = r13 - r9
            int r14 = r14 / 2
            int r15 = r7.topMargin
            if (r14 >= r15) goto La1
            r14 = r15
            goto Laa
        La1:
            int r15 = r14 + r9
            int r1 = r7.bottomMargin
            int r13 = r13 - r1
            if (r15 <= r13) goto Laa
            int r14 = r13 - r9
        Laa:
            int r8 = r8 + r10
            int r9 = r9 + r14
            r6.layout(r10, r14, r8, r9)
        Laf:
            if (r11 == 0) goto Lb4
            r0.m459(r6, r12)
        Lb4:
            float r1 = r7.f6131
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto Lbd
            r1 = r4
            goto Lbe
        Lbd:
            r1 = 4
        Lbe:
            int r7 = r6.getVisibility()
            if (r7 == r1) goto Lc7
            r6.setVisibility(r1)
        Lc7:
            int r5 = r5 + 1
            r1 = 1
            goto Ld
        Lcc:
            r0.f1082 = r4
            r0.f1083 = r4
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r18, int r19) {
            r17 = this;
            r0 = r17
            int r1 = android.view.View.MeasureSpec.getMode(r18)
            int r2 = android.view.View.MeasureSpec.getMode(r19)
            int r3 = android.view.View.MeasureSpec.getSize(r18)
            int r4 = android.view.View.MeasureSpec.getSize(r19)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 != r5) goto L18
            if (r2 == r5) goto L2e
        L18:
            boolean r6 = r0.isInEditMode()
            if (r6 == 0) goto L1a2
            r6 = 300(0x12c, float:4.2E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r7) goto L25
            goto L28
        L25:
            if (r1 != 0) goto L28
            r3 = r6
        L28:
            if (r2 != r7) goto L2b
            goto L2e
        L2b:
            if (r2 != 0) goto L2e
            r4 = r6
        L2e:
            r0.setMeasuredDimension(r3, r4)
            android.view.WindowInsets r1 = r0.f1067
            r6 = 0
            if (r1 == 0) goto L40
            java.util.WeakHashMap r1 = p000.b92.f1572
            boolean r1 = r0.getFitsSystemWindows()
            if (r1 == 0) goto L40
            r1 = 1
            goto L41
        L40:
            r1 = r6
        L41:
            java.util.WeakHashMap r7 = p000.b92.f1572
            int r7 = r0.getLayoutDirection()
            int r8 = r0.getChildCount()
            r9 = r6
            r10 = r9
            r11 = r10
        L4e:
            if (r9 >= r8) goto L1a1
            android.view.View r12 = r0.getChildAt(r9)
            int r13 = r12.getVisibility()
            r14 = 8
            if (r13 != r14) goto L5e
            goto Lff
        L5e:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            kw r13 = (p000.C0490kw) r13
            r15 = 3
            if (r1 == 0) goto Lde
            int r2 = r13.f6130
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r7)
            boolean r16 = r12.getFitsSystemWindows()
            android.view.WindowInsets r5 = r0.f1067
            if (r16 == 0) goto L9f
            if (r2 != r15) goto L88
            int r2 = r5.getSystemWindowInsetLeft()
            int r15 = r5.getSystemWindowInsetTop()
            int r14 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r2, r15, r6, r14)
            goto L9b
        L88:
            r14 = 5
            if (r2 != r14) goto L9b
            int r2 = r5.getSystemWindowInsetTop()
            int r14 = r5.getSystemWindowInsetRight()
            int r15 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r6, r2, r14, r15)
        L9b:
            r12.dispatchApplyWindowInsets(r5)
            goto Lde
        L9f:
            r14 = r15
            if (r2 != r14) goto Lb3
            int r2 = r5.getSystemWindowInsetLeft()
            int r14 = r5.getSystemWindowInsetTop()
            int r15 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r2, r14, r6, r15)
            goto Lc6
        Lb3:
            r14 = 5
            if (r2 != r14) goto Lc6
            int r2 = r5.getSystemWindowInsetTop()
            int r14 = r5.getSystemWindowInsetRight()
            int r15 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r6, r2, r14, r15)
        Lc6:
            int r2 = r5.getSystemWindowInsetLeft()
            r13.leftMargin = r2
            int r2 = r5.getSystemWindowInsetTop()
            r13.topMargin = r2
            int r2 = r5.getSystemWindowInsetRight()
            r13.rightMargin = r2
            int r2 = r5.getSystemWindowInsetBottom()
            r13.bottomMargin = r2
        Lde:
            boolean r2 = m448(r12)
            if (r2 == 0) goto L105
            int r2 = r13.leftMargin
            int r2 = r3 - r2
            int r5 = r13.rightMargin
            int r2 = r2 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r14 = r13.topMargin
            int r14 = r4 - r14
            int r13 = r13.bottomMargin
            int r14 = r14 - r13
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r12.measure(r2, r13)
        Lff:
            r15 = r18
            r13 = r19
            goto L17a
        L105:
            r5 = 1073741824(0x40000000, float:2.0)
            boolean r2 = m449(r12)
            if (r2 == 0) goto L180
            float r2 = p000.u82.m5823(r12)
            float r14 = r0.f1072
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L11a
            p000.u82.m5826(r12, r14)
        L11a:
            int r2 = r0.m456(r12)
            r14 = r2 & 7
            r15 = 3
            if (r14 != r15) goto L125
            r15 = 1
            goto L126
        L125:
            r15 = r6
        L126:
            if (r15 == 0) goto L12a
            if (r10 != 0) goto L12f
        L12a:
            if (r15 != 0) goto L155
            if (r11 != 0) goto L12f
            goto L155
        L12f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Child drawer has absolute gravity "
            r1.<init>(r3)
            r3 = r2 & 3
            r15 = 3
            if (r3 == r15) goto L149
            r3 = 5
            r2 = r2 & r3
            if (r2 != r3) goto L144
            java.lang.String r2 = "RIGHT"
            goto L14b
        L144:
            java.lang.String r2 = java.lang.Integer.toHexString(r14)
            goto L14b
        L149:
            java.lang.String r2 = "LEFT"
        L14b:
            java.lang.String r3 = " but this DrawerLayout already has a drawer view along that edge"
            java.lang.String r1 = p000.lz1.m3691(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L155:
            if (r15 == 0) goto L159
            r10 = 1
            goto L15a
        L159:
            r11 = 1
        L15a:
            int r2 = r0.f1073
            int r14 = r13.leftMargin
            int r2 = r2 + r14
            int r14 = r13.rightMargin
            int r2 = r2 + r14
            int r14 = r13.width
            r15 = r18
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r15, r2, r14)
            int r14 = r13.topMargin
            int r5 = r13.bottomMargin
            int r14 = r14 + r5
            int r5 = r13.height
            r13 = r19
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r13, r14, r5)
            r12.measure(r2, r5)
        L17a:
            int r9 = r9 + 1
            r5 = 1073741824(0x40000000, float:2.0)
            goto L4e
        L180:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Child "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r2 = " at index "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1a1:
            return
        L1a2:
            java.lang.String r0 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            p000.C1080.m7275(r0)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof p000.C0527lw
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            lw r4 = (p000.C0527lw) r4
            android.os.Parcelable r0 = r4.f1063
            super.onRestoreInstanceState(r0)
            int r0 = r4.f6817
            if (r0 == 0) goto L1c
            android.view.View r0 = r3.m453(r0)
            if (r0 == 0) goto L1c
            r3.m457(r0)
        L1c:
            int r0 = r4.f6818
            r1 = 3
            if (r0 == r1) goto L24
            r3.m458(r0, r1)
        L24:
            int r0 = r4.f6819
            if (r0 == r1) goto L2c
            r2 = 5
            r3.m458(r0, r2)
        L2c:
            int r0 = r4.f6820
            if (r0 == r1) goto L36
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r3.m458(r0, r2)
        L36:
            int r4 = r4.f6821
            if (r4 == r1) goto L40
            r0 = 8388613(0x800005, float:1.175495E-38)
            r3.m458(r4, r0)
        L40:
            return
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r9 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            lw r1 = new lw
            r1.<init>(r0)
            r0 = 0
            r1.f6817 = r0
            int r2 = r9.getChildCount()
            r3 = r0
        L11:
            if (r3 >= r2) goto L36
            android.view.View r4 = r9.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            kw r4 = (p000.C0490kw) r4
            int r5 = r4.f6133
            r6 = 1
            if (r5 != r6) goto L24
            r7 = r6
            goto L25
        L24:
            r7 = r0
        L25:
            r8 = 2
            if (r5 != r8) goto L29
            goto L2a
        L29:
            r6 = r0
        L2a:
            if (r7 != 0) goto L32
            if (r6 == 0) goto L2f
            goto L32
        L2f:
            int r3 = r3 + 1
            goto L11
        L32:
            int r0 = r4.f6130
            r1.f6817 = r0
        L36:
            int r0 = r9.f1084
            r1.f6818 = r0
            int r0 = r9.f1085
            r1.f6819 = r0
            int r0 = r9.f1086
            r1.f6820 = r0
            int r9 = r9.f1087
            r1.f6821 = r9
            return r1
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            h92 r0 = r6.f1077
            r0.m2470(r7)
            h92 r1 = r6.f1078
            r1.m2470(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L70
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.m452(r3)
            r6.f1088 = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.m2467(r4, r5)
            if (r4 == 0) goto L6b
            boolean r4 = m448(r4)
            if (r4 == 0) goto L6b
            float r4 = r6.f1090
            float r1 = r1 - r4
            float r4 = r6.f1091
            float r7 = r7 - r4
            int r0 = r0.f4644
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L6b
            int r7 = r6.getChildCount()
            r0 = r2
        L4c:
            if (r0 >= r7) goto L61
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            kw r4 = (p000.C0490kw) r4
            int r4 = r4.f6133
            r4 = r4 & r3
            if (r4 != r3) goto L5e
            goto L62
        L5e:
            int r0 = r0 + 1
            goto L4c
        L61:
            r1 = 0
        L62:
            if (r1 == 0) goto L6b
            int r7 = r6.m455(r1)
            r0 = 2
            if (r7 != r0) goto L6c
        L6b:
            r2 = r3
        L6c:
            r6.m452(r2)
            return r3
        L70:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f1090 = r0
            r6.f1091 = r7
            r6.f1088 = r2
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            if (r1 == 0) goto L9
            r1 = 1
            r0.m452(r1)
        L9:
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            boolean r0 = r1.f1082
            if (r0 != 0) goto L7
            super.requestLayout()
        L7:
            return
    }

    public void setDrawerElevation(float r4) {
            r3 = this;
            r3.f1072 = r4
            r4 = 0
        L3:
            int r0 = r3.getChildCount()
            if (r4 >= r0) goto L1d
            android.view.View r0 = r3.getChildAt(r4)
            boolean r1 = m449(r0)
            if (r1 == 0) goto L1a
            float r1 = r3.f1072
            java.util.WeakHashMap r2 = p000.b92.f1572
            p000.u82.m5826(r0, r1)
        L1a:
            int r4 = r4 + 1
            goto L3
        L1d:
            return
    }

    @java.lang.Deprecated
    public void setDrawerListener(p000.InterfaceC0447jw r2) {
            r1 = this;
            if (r2 == 0) goto L12
            java.util.ArrayList r0 = r1.f1089
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1089 = r0
        Ld:
            java.util.ArrayList r1 = r1.f1089
            r1.add(r2)
        L12:
            return
    }

    public void setDrawerLockMode(int r2) {
            r1 = this;
            r0 = 3
            r1.m458(r2, r0)
            r0 = 5
            r1.m458(r2, r0)
            return
    }

    public void setScrimColor(int r1) {
            r0 = this;
            r0.f1074 = r1
            r0.invalidate()
            return
    }

    public void setStatusBarBackground(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.f1066 = r2
            r1.invalidate()
            return
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f1066 = r1
            r0.invalidate()
            return
    }

    public void setStatusBarBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.f1066 = r0
            r1.invalidate()
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m450(android.view.View r1, int r2) {
            r0 = this;
            int r0 = r0.m456(r1)
            r0 = r0 & r2
            if (r0 != r2) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m451(android.view.View r4) {
            r3 = this;
            boolean r0 = m449(r4)
            if (r0 == 0) goto L44
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            kw r0 = (p000.C0490kw) r0
            boolean r1 = r3.f1083
            if (r1 == 0) goto L17
            r4 = 0
            r0.f6131 = r4
            r4 = 0
            r0.f6133 = r4
            goto L40
        L17:
            int r1 = r0.f6133
            r1 = r1 | 4
            r0.f6133 = r1
            r0 = 3
            boolean r0 = r3.m450(r4, r0)
            if (r0 == 0) goto L33
            int r0 = r4.getWidth()
            int r0 = -r0
            int r1 = r4.getTop()
            h92 r2 = r3.f1077
            r2.m2477(r4, r0, r1)
            goto L40
        L33:
            int r0 = r3.getWidth()
            int r1 = r4.getTop()
            h92 r2 = r3.f1078
            r2.m2477(r4, r0, r1)
        L40:
            r3.invalidate()
            return
        L44:
            java.lang.String r3 = "View "
            java.lang.String r0 = " is not a sliding drawer"
            p000.ql1.m4938(r3, r4, r0)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m452(boolean r10) {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L4c
            android.view.View r4 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            kw r5 = (p000.C0490kw) r5
            boolean r6 = m449(r4)
            if (r6 == 0) goto L49
            if (r10 == 0) goto L20
            boolean r6 = r5.f6132
            if (r6 != 0) goto L20
            goto L49
        L20:
            int r6 = r4.getWidth()
            r7 = 3
            boolean r7 = r9.m450(r4, r7)
            if (r7 == 0) goto L38
            int r6 = -r6
            int r7 = r4.getTop()
            h92 r8 = r9.f1077
            boolean r4 = r8.m2477(r4, r6, r7)
        L36:
            r3 = r3 | r4
            goto L47
        L38:
            int r6 = r9.getWidth()
            int r7 = r4.getTop()
            h92 r8 = r9.f1078
            boolean r4 = r8.m2477(r4, r6, r7)
            goto L36
        L47:
            r5.f6132 = r1
        L49:
            int r2 = r2 + 1
            goto L7
        L4c:
            q2 r10 = r9.f1079
            java.lang.Object r0 = r10.f8802
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            java.lang.Object r10 = r10.f8801
            d1 r10 = (p000.RunnableC0196d1) r10
            r0.removeCallbacks(r10)
            q2 r10 = r9.f1080
            java.lang.Object r0 = r10.f8802
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            java.lang.Object r10 = r10.f8801
            d1 r10 = (p000.RunnableC0196d1) r10
            r0.removeCallbacks(r10)
            if (r3 == 0) goto L6b
            r9.invalidate()
        L6b:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final android.view.View m453(int r5) {
            r4 = this;
            java.util.WeakHashMap r0 = p000.b92.f1572
            int r0 = r4.getLayoutDirection()
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r0)
            r5 = r5 & 7
            int r0 = r4.getChildCount()
            r1 = 0
        L11:
            if (r1 >= r0) goto L23
            android.view.View r2 = r4.getChildAt(r1)
            int r3 = r4.m456(r2)
            r3 = r3 & 7
            if (r3 != r5) goto L20
            return r2
        L20:
            int r1 = r1 + 1
            goto L11
        L23:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public final android.view.View m454() {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L31
            android.view.View r2 = r5.getChildAt(r1)
            boolean r3 = m449(r2)
            if (r3 == 0) goto L2e
            boolean r3 = m449(r2)
            if (r3 == 0) goto L25
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            kw r3 = (p000.C0490kw) r3
            float r3 = r3.f6131
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L2e
            return r2
        L25:
            java.lang.String r5 = "View "
            java.lang.String r0 = " is not a drawer"
            p000.ql1.m4938(r5, r2, r0)
            r5 = 0
            return r5
        L2e:
            int r1 = r1 + 1
            goto L5
        L31:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ζ */
    public final int m455(android.view.View r5) {
            r4 = this;
            boolean r0 = m449(r5)
            r1 = 0
            if (r0 == 0) goto L63
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            kw r5 = (p000.C0490kw) r5
            int r5 = r5.f6130
            java.util.WeakHashMap r0 = p000.b92.f1572
            int r0 = r4.getLayoutDirection()
            r2 = 3
            if (r5 == r2) goto L53
            r3 = 5
            if (r5 == r3) goto L44
            r3 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r3) goto L35
            r3 = 8388613(0x800005, float:1.175495E-38)
            if (r5 == r3) goto L26
            goto L62
        L26:
            int r5 = r4.f1087
            if (r5 == r2) goto L2b
            return r5
        L2b:
            if (r0 != 0) goto L30
            int r4 = r4.f1085
            goto L32
        L30:
            int r4 = r4.f1084
        L32:
            if (r4 == r2) goto L62
            return r4
        L35:
            int r5 = r4.f1086
            if (r5 == r2) goto L3a
            return r5
        L3a:
            if (r0 != 0) goto L3f
            int r4 = r4.f1084
            goto L41
        L3f:
            int r4 = r4.f1085
        L41:
            if (r4 == r2) goto L62
            return r4
        L44:
            int r5 = r4.f1085
            if (r5 == r2) goto L49
            return r5
        L49:
            if (r0 != 0) goto L4e
            int r4 = r4.f1087
            goto L50
        L4e:
            int r4 = r4.f1086
        L50:
            if (r4 == r2) goto L62
            return r4
        L53:
            int r5 = r4.f1084
            if (r5 == r2) goto L58
            return r5
        L58:
            if (r0 != 0) goto L5d
            int r4 = r4.f1086
            goto L5f
        L5d:
            int r4 = r4.f1087
        L5f:
            if (r4 == r2) goto L62
            return r4
        L62:
            return r1
        L63:
            java.lang.String r4 = "View "
            java.lang.String r0 = " is not a drawer"
            p000.ql1.m4938(r4, r5, r0)
            return r1
    }

    /* JADX INFO: renamed from: η */
    public final int m456(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            kw r2 = (p000.C0490kw) r2
            int r2 = r2.f6130
            java.util.WeakHashMap r0 = p000.b92.f1572
            int r1 = r1.getLayoutDirection()
            int r1 = android.view.Gravity.getAbsoluteGravity(r2, r1)
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public final void m457(android.view.View r4) {
            r3 = this;
            boolean r0 = m449(r4)
            if (r0 == 0) goto L49
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            kw r0 = (p000.C0490kw) r0
            boolean r1 = r3.f1083
            if (r1 == 0) goto L1b
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f6131 = r1
            r1 = 1
            r0.f6133 = r1
            r3.m460(r4, r1)
            goto L45
        L1b:
            int r1 = r0.f6133
            r1 = r1 | 2
            r0.f6133 = r1
            r0 = 3
            boolean r0 = r3.m450(r4, r0)
            if (r0 == 0) goto L33
            h92 r0 = r3.f1077
            int r1 = r4.getTop()
            r2 = 0
            r0.m2477(r4, r2, r1)
            goto L45
        L33:
            int r0 = r3.getWidth()
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r4.getTop()
            h92 r2 = r3.f1078
            r2.m2477(r4, r0, r1)
        L45:
            r3.invalidate()
            return
        L49:
            java.lang.String r3 = "View "
            java.lang.String r0 = " is not a sliding drawer"
            p000.ql1.m4938(r3, r4, r0)
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m458(int r4, int r5) {
            r3 = this;
            java.util.WeakHashMap r0 = p000.b92.f1572
            int r0 = r3.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r5, r0)
            r1 = 3
            if (r5 == r1) goto L24
            r2 = 5
            if (r5 == r2) goto L21
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r2) goto L1e
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r5 == r2) goto L1b
            goto L26
        L1b:
            r3.f1087 = r4
            goto L26
        L1e:
            r3.f1086 = r4
            goto L26
        L21:
            r3.f1085 = r4
            goto L26
        L24:
            r3.f1084 = r4
        L26:
            if (r4 == 0) goto L32
            if (r0 != r1) goto L2d
            h92 r5 = r3.f1077
            goto L2f
        L2d:
            h92 r5 = r3.f1078
        L2f:
            r5.m2459()
        L32:
            r5 = 1
            if (r4 == r5) goto L43
            r5 = 2
            if (r4 == r5) goto L39
            goto L4c
        L39:
            android.view.View r4 = r3.m453(r0)
            if (r4 == 0) goto L4c
            r3.m457(r4)
            return
        L43:
            android.view.View r4 = r3.m453(r0)
            if (r4 == 0) goto L4c
            r3.m451(r4)
        L4c:
            return
    }

    /* JADX INFO: renamed from: μ */
    public final void m459(android.view.View r2, float r3) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            kw r2 = (p000.C0490kw) r2
            float r0 = r2.f6131
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            goto L23
        Ld:
            r2.f6131 = r3
            java.util.ArrayList r2 = r1.f1089
            if (r2 == 0) goto L23
            int r2 = r2.size()
            int r2 = r2 + (-1)
            if (r2 >= 0) goto L1c
            goto L23
        L1c:
            java.util.ArrayList r1 = r1.f1089
            java.lang.ClassCastException r1 = p000.lz1.m3685(r2, r1)
            throw r1
        L23:
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m460(android.view.View r5, boolean r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L27
            android.view.View r2 = r4.getChildAt(r1)
            if (r6 != 0) goto L13
            boolean r3 = m449(r2)
            if (r3 == 0) goto L17
        L13:
            if (r6 == 0) goto L1e
            if (r2 != r5) goto L1e
        L17:
            java.util.WeakHashMap r3 = p000.b92.f1572
            r3 = 1
            r2.setImportantForAccessibility(r3)
            goto L24
        L1e:
            java.util.WeakHashMap r3 = p000.b92.f1572
            r3 = 4
            r2.setImportantForAccessibility(r3)
        L24:
            int r1 = r1 + 1
            goto L5
        L27:
            return
    }
}
