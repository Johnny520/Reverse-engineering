package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements defpackage.InterfaceC0752, defpackage.InterfaceC0509, defpackage.InterfaceC1471 {

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public static final int[] f75 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f76;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f77;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f78;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f79;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public defpackage.C2300 f80;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public defpackage.C2300 f81;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int f82;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public defpackage.C2300 f83;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public final defpackage.RunnableC0667 f84;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public androidx.appcompat.widget.ContentFrameLayout f85;

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public final defpackage.C0088 f86;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f87;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f88;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public defpackage.C2300 f89;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f90;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f91;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f92;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public defpackage.InterfaceC1899 f93;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public android.widget.OverScroller f94;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public final defpackage.RunnableC0667 f95;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final android.graphics.Rect f96;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final android.graphics.Rect f97;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public final defpackage.C1704 f98;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public androidx.appcompat.widget.ActionBarContainer f99;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final android.graphics.Rect f100;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public android.view.ViewPropertyAnimator f101;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.InterfaceC1567 f102;

    static {
            r0 = 1711538181(0x66040005, float:1.5583818E23)
            r1 = 16842841(0x1010059, float:2.3693807E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ActionBarOverlayLayout.f75 = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = 0
            r1.f88 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f100 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f96 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f97 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            ᲈᛸᛱᲀ r3 = defpackage.C2300.f9726
            r1.f83 = r3
            r1.f81 = r3
            r1.f80 = r3
            r1.f89 = r3
            ᲀᛷᛲᛴ r3 = new ᲀᛷᛲᛴ
            r3.<init>(r1)
            r1.f98 = r3
            ᛴᛴᲈᛵ r3 = new ᛴᛴᲈᛵ
            r0 = 0
            r3.<init>(r1, r0)
            r1.f95 = r3
            ᛴᛴᲈᛵ r3 = new ᛴᛴᲈᛵ
            r0 = 1
            r3.<init>(r1, r0)
            r1.f84 = r3
            r1.m31(r2)
            ᛱᛵᛳᲈ r2 = new ᛱᛵᛳᲈ
            r2.<init>()
            r1.f86 = r2
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static boolean m27(android.view.View r4, android.graphics.Rect r5, boolean r6) {
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            ᲀᲀᲇᛴ r4 = (defpackage.C1749) r4
            int r0 = r4.leftMargin
            int r1 = r5.left
            r2 = 1
            if (r0 == r1) goto L11
            r4.leftMargin = r1
            r0 = r2
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r4.topMargin
            int r3 = r5.top
            if (r1 == r3) goto L1b
            r4.topMargin = r3
            r0 = r2
        L1b:
            int r1 = r4.rightMargin
            int r3 = r5.right
            if (r1 == r3) goto L24
            r4.rightMargin = r3
            r0 = r2
        L24:
            if (r6 == 0) goto L2f
            int r6 = r4.bottomMargin
            int r5 = r5.bottom
            if (r6 == r5) goto L2f
            r4.bottomMargin = r5
            return r2
        L2f:
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C1749
            return r0
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.f76
            if (r0 == 0) goto L3d
            boolean r0 = r5.f79
            if (r0 != 0) goto L3d
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f99
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L27
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f99
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.f99
            float r2 = r2.getTranslationY()
            float r2 = r2 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r0 = (int) r2
            goto L28
        L27:
            r0 = r1
        L28:
            android.graphics.drawable.Drawable r2 = r5.f76
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.f76
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r5 = r5.f76
            r5.draw(r6)
        L3d:
            return
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r0 = super.fitSystemWindows(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            ᲀᲀᲇᛴ r1 = new ᲀᲀᲇᛴ
            r0 = -1
            r1.<init>(r0, r0)
            return r1
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            ᲀᲀᲇᛴ r0 = new ᲀᲀᲇᛴ
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            ᲀᲀᲇᛴ r0 = new ᲀᲀᲇᛴ
            r0.<init>(r1)
            return r0
    }

    public int getActionBarHideOffset() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r0.f99
            if (r0 == 0) goto Lb
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            ᛱᛵᛳᲈ r1 = r1.f86
            int r0 = r1.f840
            int r1 = r1.f841
            r1 = r1 | r0
            return r1
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            r0.m29()
            ᛸᲁᛲᛲ r0 = r0.f102
            ᛲᛱᛶᛲ r0 = (defpackage.C0235) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1415
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
            r6 = this;
            r6.m29()
            ᲈᛸᛱᲀ r7 = defpackage.C2300.m3730(r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            ᛲᲇᲀᲈ r1 = r7.f9727
            ᛶᛳᛴᛲ r2 = r1.mo1126()
            int r2 = r2.f4597
            ᛶᛳᛴᛲ r3 = r1.mo1126()
            int r3 = r3.f4598
            ᛶᛳᛴᛲ r4 = r1.mo1126()
            int r4 = r4.f4596
            ᛶᛳᛴᛲ r5 = r1.mo1126()
            int r5 = r5.f4595
            r0.<init>(r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r2 = r6.f99
            r3 = 0
            boolean r0 = m27(r2, r0, r3)
            java.util.WeakHashMap r2 = defpackage.AbstractC0858.f3911
            android.graphics.Rect r2 = r6.f100
            defpackage.AbstractC2204.m3603(r6, r7, r2)
            int r7 = r2.left
            int r3 = r2.top
            int r4 = r2.right
            int r5 = r2.bottom
            ᲈᛸᛱᲀ r7 = r1.mo1122(r7, r3, r4, r5)
            r6.f83 = r7
            ᲈᛸᛱᲀ r3 = r6.f81
            boolean r7 = r3.equals(r7)
            r3 = 1
            if (r7 != 0) goto L50
            ᲈᛸᛱᲀ r7 = r6.f83
            r6.f81 = r7
            r0 = r3
        L50:
            android.graphics.Rect r7 = r6.f96
            boolean r4 = r7.equals(r2)
            if (r4 != 0) goto L5c
            r7.set(r2)
            goto L5d
        L5c:
            r3 = r0
        L5d:
            if (r3 == 0) goto L62
            r6.requestLayout()
        L62:
            ᲈᛸᛱᲀ r6 = r1.mo628()
            ᛲᲇᲀᲈ r6 = r6.f9727
            ᲈᛸᛱᲀ r6 = r6.mo1125()
            ᛲᲇᲀᲈ r6 = r6.f9727
            ᲈᛸᛱᲀ r6 = r6.mo1130()
            android.view.WindowInsets r6 = r6.m3731()
            return r6
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.m31(r1)
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            r0.requestApplyInsets()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.m28()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r6 = r4.getPaddingLeft()
            int r7 = r4.getPaddingTop()
            r8 = 0
        Ld:
            if (r8 >= r5) goto L37
            android.view.View r9 = r4.getChildAt(r8)
            int r0 = r9.getVisibility()
            r1 = 8
            if (r0 == r1) goto L34
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            ᲀᲀᲇᛴ r0 = (defpackage.C1749) r0
            int r1 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            int r3 = r0.leftMargin
            int r3 = r3 + r6
            int r0 = r0.topMargin
            int r0 = r0 + r7
            int r1 = r1 + r3
            int r2 = r2 + r0
            r9.layout(r3, r0, r1, r2)
        L34:
            int r8 = r8 + 1
            goto Ld
        L37:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r13, int r14) {
            r12 = this;
            r12.m29()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f99
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r12 = r0.f99
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            ᲀᲀᲇᛴ r12 = (defpackage.C1749) r12
            androidx.appcompat.widget.ActionBarContainer r13 = r0.f99
            int r13 = r13.getMeasuredWidth()
            int r14 = r12.leftMargin
            int r13 = r13 + r14
            int r14 = r12.rightMargin
            int r13 = r13 + r14
            r14 = 0
            int r13 = java.lang.Math.max(r14, r13)
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f99
            int r1 = r1.getMeasuredHeight()
            int r3 = r12.topMargin
            int r1 = r1 + r3
            int r12 = r12.bottomMargin
            int r1 = r1 + r12
            int r12 = java.lang.Math.max(r14, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f99
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r14, r1)
            java.util.WeakHashMap r3 = defpackage.AbstractC0858.f3911
            int r3 = r0.getWindowSystemUiVisibility()
            r3 = r3 & 256(0x100, float:3.59E-43)
            r5 = 1
            if (r3 == 0) goto L4d
            r3 = r5
            goto L4e
        L4d:
            r3 = r14
        L4e:
            if (r3 == 0) goto L62
            int r6 = r0.f90
            boolean r7 = r0.f77
            if (r7 == 0) goto L74
            androidx.appcompat.widget.ActionBarContainer r7 = r0.f99
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L74
            int r7 = r0.f90
            int r6 = r6 + r7
            goto L74
        L62:
            androidx.appcompat.widget.ActionBarContainer r6 = r0.f99
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L73
            androidx.appcompat.widget.ActionBarContainer r6 = r0.f99
            int r6 = r6.getMeasuredHeight()
            goto L74
        L73:
            r6 = r14
        L74:
            android.graphics.Rect r7 = r0.f100
            android.graphics.Rect r8 = r0.f97
            r8.set(r7)
            ᲈᛸᛱᲀ r7 = r0.f83
            r0.f80 = r7
            boolean r9 = r0.f91
            if (r9 != 0) goto L97
            if (r3 != 0) goto L97
            int r3 = r8.top
            int r3 = r3 + r6
            r8.top = r3
            int r3 = r8.bottom
            r8.bottom = r3
            ᛲᲇᲀᲈ r3 = r7.f9727
            ᲈᛸᛱᲀ r14 = r3.mo1122(r14, r6, r14, r14)
            r0.f80 = r14
            goto Lfc
        L97:
            ᛲᲇᲀᲈ r14 = r7.f9727
            ᛶᛳᛴᛲ r14 = r14.mo1126()
            int r14 = r14.f4597
            ᲈᛸᛱᲀ r3 = r0.f80
            ᛲᲇᲀᲈ r3 = r3.f9727
            ᛶᛳᛴᛲ r3 = r3.mo1126()
            int r3 = r3.f4598
            int r3 = r3 + r6
            ᲈᛸᛱᲀ r6 = r0.f80
            ᛲᲇᲀᲈ r6 = r6.f9727
            ᛶᛳᛴᛲ r6 = r6.mo1126()
            int r6 = r6.f4596
            ᲈᛸᛱᲀ r7 = r0.f80
            ᛲᲇᲀᲈ r7 = r7.f9727
            ᛶᛳᛴᛲ r7 = r7.mo1126()
            int r7 = r7.f4595
            ᛶᛳᛴᛲ r14 = defpackage.C1032.m1985(r14, r3, r6, r7)
            ᲈᛸᛱᲀ r3 = r0.f80
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 36
            if (r6 < r7) goto Ld0
            ᛲᛲᛷᛱ r6 = new ᛲᛲᛷᛱ
            r6.<init>(r3)
            goto Lf3
        Ld0:
            r7 = 35
            if (r6 < r7) goto Lda
            ᲈᛷᛸᛱ r6 = new ᲈᛷᛸᛱ
            r6.<init>(r3)
            goto Lf3
        Lda:
            r7 = 34
            if (r6 < r7) goto Le4
            ᛱᛲᲀᲀ r6 = new ᛱᛲᲀᲀ
            r6.<init>(r3)
            goto Lf3
        Le4:
            r7 = 31
            if (r6 < r7) goto Lee
            ᛸᲀᲈᛵ r6 = new ᛸᲀᲈᛵ
            r6.<init>(r3)
            goto Lf3
        Lee:
            ᛳᲇᛵᛷ r6 = new ᛳᲇᛵᛷ
            r6.<init>(r3)
        Lf3:
            r6.m3353(r14)
            ᲈᛸᛱᲀ r14 = r6.mo2550()
            r0.f80 = r14
        Lfc:
            androidx.appcompat.widget.ContentFrameLayout r14 = r0.f85
            m27(r14, r8, r5)
            ᲈᛸᛱᲀ r14 = r0.f89
            ᲈᛸᛱᲀ r3 = r0.f80
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L124
            ᲈᛸᛱᲀ r14 = r0.f80
            r0.f89 = r14
            androidx.appcompat.widget.ContentFrameLayout r3 = r0.f85
            android.view.WindowInsets r14 = r14.m3731()
            if (r14 == 0) goto L124
            android.view.WindowInsets r5 = defpackage.AbstractC0724.m1626(r3, r14)
            boolean r14 = r5.equals(r14)
            if (r14 != 0) goto L124
            defpackage.C2300.m3730(r3, r5)
        L124:
            androidx.appcompat.widget.ContentFrameLayout r7 = r0.f85
            r9 = 0
            r11 = 0
            r6 = r0
            r8 = r2
            r10 = r4
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r14 = r0.f85
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            ᲀᲀᲇᛴ r14 = (defpackage.C1749) r14
            androidx.appcompat.widget.ContentFrameLayout r3 = r0.f85
            int r3 = r3.getMeasuredWidth()
            int r5 = r14.leftMargin
            int r3 = r3 + r5
            int r5 = r14.rightMargin
            int r3 = r3 + r5
            int r13 = java.lang.Math.max(r13, r3)
            androidx.appcompat.widget.ContentFrameLayout r3 = r0.f85
            int r3 = r3.getMeasuredHeight()
            int r5 = r14.topMargin
            int r3 = r3 + r5
            int r14 = r14.bottomMargin
            int r3 = r3 + r14
            int r12 = java.lang.Math.max(r12, r3)
            androidx.appcompat.widget.ContentFrameLayout r14 = r0.f85
            int r14 = r14.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r1, r14)
            int r1 = r0.getPaddingLeft()
            int r3 = r0.getPaddingRight()
            int r3 = r3 + r1
            int r3 = r3 + r13
            int r13 = r0.getPaddingTop()
            int r1 = r0.getPaddingBottom()
            int r1 = r1 + r13
            int r1 = r1 + r12
            int r12 = r0.getSuggestedMinimumHeight()
            int r12 = java.lang.Math.max(r1, r12)
            int r13 = r0.getSuggestedMinimumWidth()
            int r13 = java.lang.Math.max(r3, r13)
            int r13 = android.view.View.resolveSizeAndState(r13, r2, r14)
            int r14 = r14 << 16
            int r12 = android.view.View.resolveSizeAndState(r12, r4, r14)
            r0.setMeasuredDimension(r13, r12)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r10, float r11, float r12, boolean r13) {
            r9 = this;
            boolean r10 = r9.f78
            if (r10 == 0) goto L3a
            if (r13 != 0) goto L7
            goto L3a
        L7:
            android.widget.OverScroller r0 = r9.f94
            int r4 = (int) r12
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r10 = r9.f94
            int r10 = r10.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r11 = r9.f99
            int r11 = r11.getHeight()
            if (r10 <= r11) goto L2e
            r9.m28()
            ᛴᛴᲈᛵ r10 = r9.f84
            r10.run()
            goto L36
        L2e:
            r9.m28()
            ᛴᛴᲈᛵ r10 = r9.f95
            r10.run()
        L36:
            r10 = 1
            r9.f87 = r10
            return r10
        L3a:
            r9 = 0
            return r9
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.f92
            int r1 = r1 + r3
            r0.f92 = r1
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            ᛱᛵᛳᲈ r1 = r0.f86
            r1.f840 = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f92 = r1
            r0.m28()
            ᲁᛸᛴᛶ r0 = r0.f93
            if (r0 == 0) goto L1d
            ᲇᛲᲇᲁ r0 = (defpackage.C2010) r0
            ᲀᲈᛶᲀ r1 = r0.f8677
            if (r1 == 0) goto L1d
            r1.m3181()
            r1 = 0
            r0.f8677 = r1
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L10
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f99
            int r1 = r1.getVisibility()
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            boolean r0 = r0.f78
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r4) {
            r3 = this;
            boolean r4 = r3.f78
            if (r4 == 0) goto L25
            boolean r4 = r3.f87
            if (r4 != 0) goto L25
            int r4 = r3.f92
            androidx.appcompat.widget.ActionBarContainer r0 = r3.f99
            int r0 = r0.getHeight()
            r1 = 600(0x258, double:2.964E-321)
            if (r4 > r0) goto L1d
            r3.m28()
            ᛴᛴᲈᛵ r4 = r3.f95
            r3.postDelayed(r4, r1)
            goto L25
        L1d:
            r3.m28()
            ᛴᛴᲈᛵ r4 = r3.f84
            r3.postDelayed(r4, r1)
        L25:
            return
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int r7) {
            r6 = this;
            super.onWindowSystemUiVisibilityChanged(r7)
            r6.m29()
            int r0 = r6.f82
            r0 = r0 ^ r7
            r6.f82 = r7
            r1 = r7 & 4
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = r2
        L14:
            r7 = r7 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L1a
            r7 = r3
            goto L1b
        L1a:
            r7 = r2
        L1b:
            ᲁᛸᛴᛶ r4 = r6.f93
            if (r4 == 0) goto L3d
            r5 = r7 ^ 1
            ᲇᛲᲇᲁ r4 = (defpackage.C2010) r4
            r4.f8676 = r5
            if (r1 != 0) goto L34
            if (r7 != 0) goto L2a
            goto L34
        L2a:
            boolean r7 = r4.f8692
            if (r7 != 0) goto L3d
            r4.f8692 = r3
            r4.m3398(r3)
            goto L3d
        L34:
            boolean r7 = r4.f8692
            if (r7 == 0) goto L3d
            r4.f8692 = r2
            r4.m3398(r3)
        L3d:
            r7 = r0 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L4a
            ᲁᛸᛴᛶ r7 = r6.f93
            if (r7 == 0) goto L4a
            java.util.WeakHashMap r7 = defpackage.AbstractC0858.f3911
            r6.requestApplyInsets()
        L4a:
            return
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            r0.f88 = r1
            ᲁᛸᛴᛶ r0 = r0.f93
            if (r0 == 0) goto Ld
            ᲇᛲᲇᲁ r0 = (defpackage.C2010) r0
            r0.f8685 = r1
        Ld:
            return
    }

    public void setActionBarHideOffset(int r3) {
            r2 = this;
            r2.m28()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f99
            int r0 = r0.getHeight()
            r1 = 0
            int r3 = java.lang.Math.min(r3, r0)
            int r3 = java.lang.Math.max(r1, r3)
            androidx.appcompat.widget.ActionBarContainer r2 = r2.f99
            int r3 = -r3
            float r3 = (float) r3
            r2.setTranslationY(r3)
            return
    }

    public void setActionBarVisibilityCallback(defpackage.InterfaceC1899 r2) {
            r1 = this;
            r1.f93 = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L1c
            ᲁᛸᛴᛶ r2 = r1.f93
            int r0 = r1.f88
            ᲇᛲᲇᲁ r2 = (defpackage.C2010) r2
            r2.f8685 = r0
            int r2 = r1.f82
            if (r2 == 0) goto L1c
            r1.onWindowSystemUiVisibilityChanged(r2)
            java.util.WeakHashMap r2 = defpackage.AbstractC0858.f3911
            r1.requestApplyInsets()
        L1c:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.f77 = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.f78
            if (r2 == r0) goto Lf
            r1.f78 = r2
            if (r2 != 0) goto Lf
            r1.m28()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        Lf:
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            r1.m29()
            ᛸᲁᛲᛲ r1 = r1.f102
            ᛲᛱᛶᛲ r1 = (defpackage.C0235) r1
            if (r2 == 0) goto L14
            androidx.appcompat.widget.Toolbar r0 = r1.f1415
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r0, r2)
            goto L15
        L14:
            r2 = 0
        L15:
            r1.f1413 = r2
            r1.m844()
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.m29()
            ᛸᲁᛲᛲ r0 = r0.f102
            ᛲᛱᛶᛲ r0 = (defpackage.C0235) r0
            r0.f1413 = r1
            r0.m844()
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            r1.m29()
            ᛸᲁᛲᛲ r1 = r1.f102
            ᛲᛱᛶᛲ r1 = (defpackage.C0235) r1
            if (r2 == 0) goto L14
            androidx.appcompat.widget.Toolbar r0 = r1.f1415
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r0, r2)
            goto L15
        L14:
            r2 = 0
        L15:
            r1.f1411 = r2
            r1.m844()
            return
    }

    public void setOverlayMode(boolean r2) {
            r1 = this;
            r1.f91 = r2
            if (r2 == 0) goto L14
            android.content.Context r2 = r1.getContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r0 = 19
            if (r2 >= r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.f79 = r2
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.m29()
            ᛸᲁᛲᛲ r0 = r0.f102
            ᛲᛱᛶᛲ r0 = (defpackage.C0235) r0
            r0.f1407 = r1
            return
    }

    public void setWindowTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.m29()
            ᛸᲁᛲᛲ r2 = r2.f102
            ᛲᛱᛶᛲ r2 = (defpackage.C0235) r2
            boolean r0 = r2.f1420
            if (r0 != 0) goto L23
            androidx.appcompat.widget.Toolbar r0 = r2.f1415
            r2.f1406 = r3
            int r1 = r2.f1418
            r1 = r1 & 8
            if (r1 == 0) goto L23
            r0.setTitle(r3)
            boolean r2 = r2.f1420
            if (r2 == 0) goto L23
            android.view.View r2 = r0.getRootView()
            defpackage.AbstractC0858.m1812(r2, r3)
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m28() {
            r1 = this;
            ᛴᛴᲈᛵ r0 = r1.f95
            r1.removeCallbacks(r0)
            ᛴᛴᲈᛵ r0 = r1.f84
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r1 = r1.f101
            if (r1 == 0) goto L11
            r1.cancel()
        L11:
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void m29() {
            r2 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r2.f85
            if (r0 != 0) goto L46
            r0 = 1711865906(0x66090032, float:1.6174195E23)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r2.f85 = r0
            r0 = 1711865907(0x66090033, float:1.6174197E23)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r2.f99 = r0
            r0 = 1711865905(0x66090031, float:1.6174193E23)
            android.view.View r0 = r2.findViewById(r0)
            boolean r1 = r0 instanceof defpackage.InterfaceC1567
            if (r1 == 0) goto L28
            ᛸᲁᛲᛲ r0 = (defpackage.InterfaceC1567) r0
            goto L32
        L28:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto L35
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            ᛸᲁᛲᛲ r0 = r0.getWrapper()
        L32:
            r2.f102 = r0
            return
        L35:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r0 = "Can't make a decor toolbar out of "
            java.lang.String r2 = r0.concat(r2)
            defpackage.C2264.m3676(r2)
        L46:
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m30(defpackage.MenuC1701 r4, defpackage.InterfaceC1469 r5) {
            r3 = this;
            r3.m29()
            ᛸᲁᛲᛲ r3 = r3.f102
            ᛲᛱᛶᛲ r3 = (defpackage.C0235) r3
            androidx.appcompat.widget.Toolbar r0 = r3.f1415
            ᲁᲀᛴᛷ r1 = r3.f1412
            if (r1 != 0) goto L18
            ᲁᲀᛴᛷ r1 = new ᲁᲀᛴᛷ
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            r3.f1412 = r1
        L18:
            r1.f8304 = r5
            if (r4 != 0) goto L21
            androidx.appcompat.widget.ActionMenuView r3 = r0.f195
            if (r3 != 0) goto L21
            goto L2a
        L21:
            r0.m76()
            androidx.appcompat.widget.ActionMenuView r3 = r0.f195
            ᲀᛷᛱᲇ r3 = r3.f111
            if (r3 != r4) goto L2b
        L2a:
            return
        L2b:
            if (r3 == 0) goto L37
            ᲁᲀᛴᛷ r5 = r0.f178
            r3.m3086(r5)
            ᛸᛲᲁᲈ r5 = r0.f207
            r3.m3086(r5)
        L37:
            ᛸᛲᲁᲈ r3 = r0.f207
            if (r3 != 0) goto L42
            ᛸᛲᲁᲈ r3 = new ᛸᛲᲁᲈ
            r3.<init>(r0)
            r0.f207 = r3
        L42:
            r3 = 1
            r1.f8289 = r3
            android.content.Context r3 = r0.f174
            if (r4 == 0) goto L54
            r4.m3087(r1, r3)
            ᛸᛲᲁᲈ r3 = r0.f207
            android.content.Context r5 = r0.f174
            r4.m3087(r3, r5)
            goto L67
        L54:
            r4 = 0
            r1.mo856(r3, r4)
            ᛸᛲᲁᲈ r3 = r0.f207
            android.content.Context r5 = r0.f174
            r3.mo856(r5, r4)
            r1.mo855()
            ᛸᛲᲁᲈ r3 = r0.f207
            r3.mo855()
        L67:
            androidx.appcompat.widget.ActionMenuView r3 = r0.f195
            int r4 = r0.f186
            r3.setPopupTheme(r4)
            androidx.appcompat.widget.ActionMenuView r3 = r0.f195
            r3.setPresenter(r1)
            r0.f178 = r1
            r0.m63()
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m31(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.f75
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.f90 = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.f76 = r3
            if (r3 != 0) goto L20
            r3 = r2
            goto L21
        L20:
            r3 = r1
        L21:
            r4.setWillNotDraw(r3)
            r0.recycle()
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r3 = 19
            if (r0 >= r3) goto L32
            r1 = r2
        L32:
            r4.f79 = r1
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.f94 = r0
            return
    }

    @Override // defpackage.InterfaceC1471
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void mo32(android.view.ViewGroup r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.mo37(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // defpackage.InterfaceC0509
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void mo33(int r1, int r2, int[] r3, int r4) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0509
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo34(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // defpackage.InterfaceC0509
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo35(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void m36(int r4) {
            r3 = this;
            r3.m29()
            r0 = 2
            java.lang.String r1 = "Progress display unsupported"
            java.lang.String r2 = "ToolbarWidgetWrapper"
            if (r4 == r0) goto L22
            r0 = 5
            if (r4 == r0) goto L17
            r0 = 109(0x6d, float:1.53E-43)
            if (r4 == r0) goto L12
            return
        L12:
            r4 = 1
            r3.setOverlayMode(r4)
            return
        L17:
            ᛸᲁᛲᛲ r3 = r3.f102
            ᛲᛱᛶᛲ r3 = (defpackage.C0235) r3
            r3.getClass()
            android.util.Log.i(r2, r1)
            return
        L22:
            ᛸᲁᛲᛲ r3 = r3.f102
            ᛲᛱᛶᛲ r3 = (defpackage.C0235) r3
            r3.getClass()
            android.util.Log.i(r2, r1)
            return
    }

    @Override // defpackage.InterfaceC0509
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void mo37(android.view.ViewGroup r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // defpackage.InterfaceC0509
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean mo38(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto La
            boolean r0 = r0.onStartNestedScroll(r1, r2, r3)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
