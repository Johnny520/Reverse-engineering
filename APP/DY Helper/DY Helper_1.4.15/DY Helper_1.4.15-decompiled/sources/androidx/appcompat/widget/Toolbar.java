package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup {

    /* JADX INFO: renamed from: Α */
    public int f736;

    /* JADX INFO: renamed from: Β */
    public int f737;

    /* JADX INFO: renamed from: Γ */
    public final int f738;

    /* JADX INFO: renamed from: Δ */
    public java.lang.CharSequence f739;

    /* JADX INFO: renamed from: Ε */
    public java.lang.CharSequence f740;

    /* JADX INFO: renamed from: Ζ */
    public android.content.res.ColorStateList f741;

    /* JADX INFO: renamed from: Η */
    public android.content.res.ColorStateList f742;

    /* JADX INFO: renamed from: Θ */
    public boolean f743;

    /* JADX INFO: renamed from: Ι */
    public boolean f744;

    /* JADX INFO: renamed from: Κ */
    public final java.util.ArrayList f745;

    /* JADX INFO: renamed from: Λ */
    public final java.util.ArrayList f746;

    /* JADX INFO: renamed from: Μ */
    public final int[] f747;

    /* JADX INFO: renamed from: Ν */
    public final p000.C0538m6 f748;

    /* JADX INFO: renamed from: Ξ */
    public java.util.ArrayList f749;

    /* JADX INFO: renamed from: Ο */
    public final p000.t42 f750;

    /* JADX INFO: renamed from: Π */
    public p000.b52 f751;

    /* JADX INFO: renamed from: Ρ */
    public androidx.appcompat.widget.C0030 f752;

    /* JADX INFO: renamed from: Σ */
    public p000.v42 f753;

    /* JADX INFO: renamed from: Τ */
    public boolean f754;

    /* JADX INFO: renamed from: Υ */
    public android.window.OnBackInvokedCallback f755;

    /* JADX INFO: renamed from: Φ */
    public android.window.OnBackInvokedDispatcher f756;

    /* JADX INFO: renamed from: Χ */
    public boolean f757;

    /* JADX INFO: renamed from: Ψ */
    public final p000.RunnableC0196d1 f758;

    /* JADX INFO: renamed from: ε */
    public androidx.appcompat.widget.ActionMenuView f759;

    /* JADX INFO: renamed from: ζ */
    public androidx.appcompat.widget.AppCompatTextView f760;

    /* JADX INFO: renamed from: η */
    public androidx.appcompat.widget.AppCompatTextView f761;

    /* JADX INFO: renamed from: θ */
    public androidx.appcompat.widget.AppCompatImageButton f762;

    /* JADX INFO: renamed from: ι */
    public androidx.appcompat.widget.AppCompatImageView f763;

    /* JADX INFO: renamed from: κ */
    public final android.graphics.drawable.Drawable f764;

    /* JADX INFO: renamed from: λ */
    public final java.lang.CharSequence f765;

    /* JADX INFO: renamed from: μ */
    public androidx.appcompat.widget.AppCompatImageButton f766;

    /* JADX INFO: renamed from: ν */
    public android.view.View f767;

    /* JADX INFO: renamed from: ξ */
    public android.content.Context f768;

    /* JADX INFO: renamed from: ο */
    public int f769;

    /* JADX INFO: renamed from: π */
    public int f770;

    /* JADX INFO: renamed from: ρ */
    public int f771;

    /* JADX INFO: renamed from: σ */
    public final int f772;

    /* JADX INFO: renamed from: τ */
    public final int f773;

    /* JADX INFO: renamed from: υ */
    public int f774;

    /* JADX INFO: renamed from: φ */
    public int f775;

    /* JADX INFO: renamed from: χ */
    public int f776;

    /* JADX INFO: renamed from: ψ */
    public int f777;

    /* JADX INFO: renamed from: ω */
    public p000.lq0 f778;

    public Toolbar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Toolbar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968886(0x7f040136, float:1.7546438E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public Toolbar(android.content.Context r12, android.util.AttributeSet r13, int r14) {
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r11.f738 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11.f745 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11.f746 = r1
            r1 = 2
            int[] r2 = new int[r1]
            r11.f747 = r2
            m6 r2 = new m6
            s42 r3 = new s42
            r4 = 1
            r3.<init>(r11, r4)
            r2.<init>(r3)
            r11.f748 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r11.f749 = r2
            t42 r2 = new t42
            r2.<init>(r11)
            r11.f750 = r2
            d1 r2 = new d1
            r3 = 11
            r2.<init>(r3, r11)
            r11.f758 = r2
            android.content.Context r2 = r11.getContext()
            int[] r6 = p000.kk1.f5963
            m6 r2 = p000.C0538m6.m3752(r2, r13, r6, r14)
            java.lang.Object r4 = r2.f6967
            r8 = r4
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            java.util.WeakHashMap r4 = p000.b92.f1572
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            p000.y82.m6840(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r11 = r2.f6967
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            r12 = 28
            r13 = 0
            int r12 = r11.getResourceId(r12, r13)
            r4.f770 = r12
            r12 = 19
            int r12 = r11.getResourceId(r12, r13)
            r4.f771 = r12
            int r12 = r11.getInteger(r13, r0)
            r4.f738 = r12
            r12 = 48
            int r12 = r11.getInteger(r1, r12)
            r4.f772 = r12
            r12 = 22
            int r12 = r11.getDimensionPixelOffset(r12, r13)
            r14 = 27
            boolean r0 = r11.hasValue(r14)
            if (r0 == 0) goto L8d
            int r12 = r11.getDimensionPixelOffset(r14, r12)
        L8d:
            r4.f777 = r12
            r4.f776 = r12
            r4.f775 = r12
            r4.f774 = r12
            r12 = 25
            r14 = -1
            int r12 = r11.getDimensionPixelOffset(r12, r14)
            if (r12 < 0) goto La0
            r4.f774 = r12
        La0:
            r12 = 24
            int r12 = r11.getDimensionPixelOffset(r12, r14)
            if (r12 < 0) goto Laa
            r4.f775 = r12
        Laa:
            r12 = 26
            int r12 = r11.getDimensionPixelOffset(r12, r14)
            if (r12 < 0) goto Lb4
            r4.f776 = r12
        Lb4:
            r12 = 23
            int r12 = r11.getDimensionPixelOffset(r12, r14)
            if (r12 < 0) goto Lbe
            r4.f777 = r12
        Lbe:
            r12 = 13
            int r12 = r11.getDimensionPixelSize(r12, r14)
            r4.f773 = r12
            r12 = 9
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            int r12 = r11.getDimensionPixelOffset(r12, r14)
            r0 = 5
            int r0 = r11.getDimensionPixelOffset(r0, r14)
            r1 = 7
            int r1 = r11.getDimensionPixelSize(r1, r13)
            r5 = 8
            int r5 = r11.getDimensionPixelSize(r5, r13)
            r4.m303()
            lq0 r6 = r4.f778
            r6.f6744 = r13
            if (r1 == r14) goto Leb
            r6.f6741 = r1
            r6.f6737 = r1
        Leb:
            if (r5 == r14) goto Lf1
            r6.f6742 = r5
            r6.f6738 = r5
        Lf1:
            if (r12 != r14) goto Lf5
            if (r0 == r14) goto Lf8
        Lf5:
            r6.m3655(r12, r0)
        Lf8:
            r12 = 10
            int r12 = r11.getDimensionPixelOffset(r12, r14)
            r4.f736 = r12
            r12 = 6
            int r12 = r11.getDimensionPixelOffset(r12, r14)
            r4.f737 = r12
            r12 = 4
            android.graphics.drawable.Drawable r12 = r2.m3754(r12)
            r4.f764 = r12
            r12 = 3
            java.lang.CharSequence r12 = r11.getText(r12)
            r4.f765 = r12
            r12 = 21
            java.lang.CharSequence r12 = r11.getText(r12)
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 != 0) goto L124
            r4.setTitle(r12)
        L124:
            r12 = 18
            java.lang.CharSequence r12 = r11.getText(r12)
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 != 0) goto L133
            r4.setSubtitle(r12)
        L133:
            android.content.Context r12 = r4.getContext()
            r4.f768 = r12
            r12 = 17
            int r12 = r11.getResourceId(r12, r13)
            r4.setPopupTheme(r12)
            r12 = 16
            android.graphics.drawable.Drawable r12 = r2.m3754(r12)
            if (r12 == 0) goto L14d
            r4.setNavigationIcon(r12)
        L14d:
            r12 = 15
            java.lang.CharSequence r12 = r11.getText(r12)
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 != 0) goto L15c
            r4.setNavigationContentDescription(r12)
        L15c:
            android.graphics.drawable.Drawable r12 = r2.m3754(r3)
            if (r12 == 0) goto L165
            r4.setLogo(r12)
        L165:
            r12 = 12
            java.lang.CharSequence r12 = r11.getText(r12)
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 != 0) goto L174
            r4.setLogoDescription(r12)
        L174:
            r12 = 29
            boolean r14 = r11.hasValue(r12)
            if (r14 == 0) goto L183
            android.content.res.ColorStateList r12 = r2.m3790(r12)
            r4.setTitleTextColor(r12)
        L183:
            r12 = 20
            boolean r14 = r11.hasValue(r12)
            if (r14 == 0) goto L192
            android.content.res.ColorStateList r12 = r2.m3790(r12)
            r4.setSubtitleTextColor(r12)
        L192:
            r12 = 14
            boolean r14 = r11.hasValue(r12)
            if (r14 == 0) goto L1a9
            int r11 = r11.getResourceId(r12, r13)
            android.view.MenuInflater r12 = r4.getMenuInflater()
            android.view.Menu r13 = r4.getMenu()
            r12.inflate(r11, r13)
        L1a9:
            r2.m3765()
            return
    }

    private java.util.ArrayList<android.view.MenuItem> getCurrentMenuItems() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.Menu r3 = r3.getMenu()
            r1 = 0
        La:
            int r2 = r3.size()
            if (r1 >= r2) goto L1a
            android.view.MenuItem r2 = r3.getItem(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto La
        L1a:
            return r0
    }

    private android.view.MenuInflater getMenuInflater() {
            r1 = this;
            s12 r0 = new s12
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static p000.w42 m296() {
            w42 r0 = new w42
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 0
            r0.f11565 = r1
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.f11564 = r1
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static p000.w42 m297(android.view.ViewGroup.LayoutParams r2) {
            boolean r0 = r2 instanceof p000.w42
            r1 = 0
            if (r0 == 0) goto L13
            w42 r0 = new w42
            w42 r2 = (p000.w42) r2
            r0.<init>(r2)
            r0.f11565 = r1
            int r2 = r2.f11565
            r0.f11565 = r2
            return r0
        L13:
            if (r0 == 0) goto L1f
            w42 r0 = new w42
            w42 r2 = (p000.w42) r2
            r0.<init>(r2)
            r0.f11565 = r1
            return r0
        L1f:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L3d
            w42 r0 = new w42
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            r0.f11565 = r1
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
            w42 r0 = new w42
            r0.<init>(r2)
            r0.f11565 = r1
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static int m298(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginStart()
            int r1 = r1.getMarginEnd()
            int r1 = r1 + r0
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public static int m299(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.topMargin
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = super.checkLayoutParams(r1)
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof p000.w42
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            w42 r0 = m296()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r4) {
            r3 = this;
            w42 r0 = new w42
            android.content.Context r3 = r3.getContext()
            r0.<init>(r3, r4)
            r1 = 0
            r0.f11564 = r1
            int[] r2 = p000.kk1.f5968
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r2)
            int r4 = r3.getInt(r1, r1)
            r0.f11564 = r4
            r3.recycle()
            r0.f11565 = r1
            return r0
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            w42 r0 = m297(r1)
            return r0
    }

    public java.lang.CharSequence getCollapseContentDescription() {
            r0 = this;
            androidx.appcompat.widget.AppCompatImageButton r0 = r0.f766
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
            r0 = this;
            androidx.appcompat.widget.AppCompatImageButton r0 = r0.f766
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getContentInsetEnd() {
            r1 = this;
            lq0 r1 = r1.f778
            if (r1 == 0) goto Le
            boolean r0 = r1.f6743
            if (r0 == 0) goto Lb
            int r1 = r1.f6737
            return r1
        Lb:
            int r1 = r1.f6738
            return r1
        Le:
            r1 = 0
            return r1
    }

    public int getContentInsetEndWithActions() {
            r2 = this;
            int r0 = r2.f737
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            int r2 = r2.getContentInsetEnd()
            return r2
    }

    public int getContentInsetLeft() {
            r0 = this;
            lq0 r0 = r0.f778
            if (r0 == 0) goto L7
            int r0 = r0.f6737
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getContentInsetRight() {
            r0 = this;
            lq0 r0 = r0.f778
            if (r0 == 0) goto L7
            int r0 = r0.f6738
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getContentInsetStart() {
            r1 = this;
            lq0 r1 = r1.f778
            if (r1 == 0) goto Le
            boolean r0 = r1.f6743
            if (r0 == 0) goto Lb
            int r1 = r1.f6738
            return r1
        Lb:
            int r1 = r1.f6737
            return r1
        Le:
            r1 = 0
            return r1
    }

    public int getContentInsetStartWithNavigation() {
            r2 = this;
            int r0 = r2.f736
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            int r2 = r2.getContentInsetStart()
            return r2
    }

    public int getCurrentContentInsetEnd() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r2.f759
            if (r0 == 0) goto L1e
            iz0 r0 = r0.f524
            if (r0 == 0) goto L1e
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L1e
            int r0 = r2.getContentInsetEnd()
            int r2 = r2.f737
            r1 = 0
            int r2 = java.lang.Math.max(r2, r1)
            int r2 = java.lang.Math.max(r0, r2)
            return r2
        L1e:
            int r2 = r2.getContentInsetEnd()
            return r2
    }

    public int getCurrentContentInsetLeft() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r2 = r2.getCurrentContentInsetEnd()
            return r2
        Lc:
            int r2 = r2.getCurrentContentInsetStart()
            return r2
    }

    public int getCurrentContentInsetRight() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r2 = r2.getCurrentContentInsetStart()
            return r2
        Lc:
            int r2 = r2.getCurrentContentInsetEnd()
            return r2
    }

    public int getCurrentContentInsetStart() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getNavigationIcon()
            if (r0 == 0) goto L16
            int r0 = r2.getContentInsetStart()
            int r2 = r2.f736
            r1 = 0
            int r2 = java.lang.Math.max(r2, r1)
            int r2 = java.lang.Math.max(r0, r2)
            return r2
        L16:
            int r2 = r2.getContentInsetStart()
            return r2
    }

    public android.graphics.drawable.Drawable getLogo() {
            r0 = this;
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f763
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.CharSequence getLogoDescription() {
            r0 = this;
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f763
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.view.Menu getMenu() {
            r0 = this;
            r0.m304()
            androidx.appcompat.widget.ActionMenuView r0 = r0.f759
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    public android.view.View getNavButtonView() {
            r0 = this;
            androidx.appcompat.widget.AppCompatImageButton r0 = r0.f762
            return r0
    }

    public java.lang.CharSequence getNavigationContentDescription() {
            r0 = this;
            androidx.appcompat.widget.AppCompatImageButton r0 = r0.f762
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
            r0 = this;
            androidx.appcompat.widget.AppCompatImageButton r0 = r0.f762
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public androidx.appcompat.widget.C0030 getOuterActionMenuPresenter() {
            r0 = this;
            androidx.appcompat.widget.γ r0 = r0.f752
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r0 = this;
            r0.m304()
            androidx.appcompat.widget.ActionMenuView r0 = r0.f759
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    public android.content.Context getPopupContext() {
            r0 = this;
            android.content.Context r0 = r0.f768
            return r0
    }

    public int getPopupTheme() {
            r0 = this;
            int r0 = r0.f769
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f740
            return r0
    }

    public final android.widget.TextView getSubtitleTextView() {
            r0 = this;
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f761
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f739
            return r0
    }

    public int getTitleMarginBottom() {
            r0 = this;
            int r0 = r0.f777
            return r0
    }

    public int getTitleMarginEnd() {
            r0 = this;
            int r0 = r0.f775
            return r0
    }

    public int getTitleMarginStart() {
            r0 = this;
            int r0 = r0.f774
            return r0
    }

    public int getTitleMarginTop() {
            r0 = this;
            int r0 = r0.f776
            return r0
    }

    public final android.widget.TextView getTitleTextView() {
            r0 = this;
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f760
            return r0
    }

    public p000.InterfaceC1030yq getWrapper() {
            r8 = this;
            b52 r0 = r8.f751
            if (r0 != 0) goto L18c
            b52 r0 = new b52
            r0.<init>()
            r1 = 0
            r0.f1497 = r1
            r0.f1484 = r8
            java.lang.CharSequence r2 = r8.getTitle()
            r0.f1491 = r2
            java.lang.CharSequence r2 = r8.getSubtitle()
            r0.f1492 = r2
            java.lang.CharSequence r2 = r0.f1491
            r3 = 1
            if (r2 == 0) goto L21
            r2 = r3
            goto L22
        L21:
            r2 = r1
        L22:
            r0.f1490 = r2
            android.graphics.drawable.Drawable r2 = r8.getNavigationIcon()
            r0.f1489 = r2
            android.content.Context r2 = r8.getContext()
            int[] r4 = p000.kk1.f5967
            r5 = 2130968581(0x7f040005, float:1.754582E38)
            r6 = 0
            m6 r2 = p000.C0538m6.m3752(r2, r6, r4, r5)
            java.lang.Object r4 = r2.f6967
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r5 = 15
            android.graphics.drawable.Drawable r5 = r2.m3754(r5)
            r0.f1498 = r5
            r5 = 27
            java.lang.CharSequence r5 = r4.getText(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L68
            r0.f1490 = r3
            r0.f1491 = r5
            int r3 = r0.f1485
            r3 = r3 & 8
            if (r3 == 0) goto L68
            r8.setTitle(r5)
            boolean r3 = r0.f1490
            if (r3 == 0) goto L68
            android.view.View r3 = r8.getRootView()
            p000.b92.m829(r3, r5)
        L68:
            r3 = 25
            java.lang.CharSequence r3 = r4.getText(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L7f
            r0.f1492 = r3
            int r5 = r0.f1485
            r5 = r5 & 8
            if (r5 == 0) goto L7f
            r8.setSubtitle(r3)
        L7f:
            r3 = 20
            android.graphics.drawable.Drawable r3 = r2.m3754(r3)
            if (r3 == 0) goto L8c
            r0.f1488 = r3
            r0.m746()
        L8c:
            r3 = 17
            android.graphics.drawable.Drawable r3 = r2.m3754(r3)
            if (r3 == 0) goto L99
            r0.f1487 = r3
            r0.m746()
        L99:
            android.graphics.drawable.Drawable r3 = r0.f1489
            if (r3 != 0) goto Lb0
            android.graphics.drawable.Drawable r3 = r0.f1498
            if (r3 == 0) goto Lb0
            r0.f1489 = r3
            int r5 = r0.f1485
            r5 = r5 & 4
            if (r5 == 0) goto Lad
            r8.setNavigationIcon(r3)
            goto Lb0
        Lad:
            r8.setNavigationIcon(r6)
        Lb0:
            r3 = 10
            int r3 = r4.getInt(r3, r1)
            r0.m744(r3)
            r3 = 9
            int r3 = r4.getResourceId(r3, r1)
            if (r3 == 0) goto Lee
            android.content.Context r5 = r8.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            android.view.View r3 = r5.inflate(r3, r8, r1)
            android.view.View r5 = r0.f1486
            if (r5 == 0) goto Lda
            int r7 = r0.f1485
            r7 = r7 & 16
            if (r7 == 0) goto Lda
            r8.removeView(r5)
        Lda:
            r0.f1486 = r3
            if (r3 == 0) goto Le7
            int r5 = r0.f1485
            r5 = r5 & 16
            if (r5 == 0) goto Le7
            r8.addView(r3)
        Le7:
            int r3 = r0.f1485
            r3 = r3 | 16
            r0.m744(r3)
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
            r8.m303()
            lq0 r7 = r8.f778
            r7.m3655(r3, r5)
        L11e:
            r3 = 28
            int r3 = r4.getResourceId(r3, r1)
            if (r3 == 0) goto L133
            android.content.Context r5 = r8.getContext()
            r8.f770 = r3
            androidx.appcompat.widget.AppCompatTextView r7 = r8.f760
            if (r7 == 0) goto L133
            r7.setTextAppearance(r5, r3)
        L133:
            r3 = 26
            int r3 = r4.getResourceId(r3, r1)
            if (r3 == 0) goto L148
            android.content.Context r5 = r8.getContext()
            r8.f771 = r3
            androidx.appcompat.widget.AppCompatTextView r7 = r8.f761
            if (r7 == 0) goto L148
            r7.setTextAppearance(r5, r3)
        L148:
            r3 = 22
            int r1 = r4.getResourceId(r3, r1)
            if (r1 == 0) goto L153
            r8.setPopupTheme(r1)
        L153:
            r2.m3765()
            int r1 = r0.f1497
            r2 = 2131689473(0x7f0f0001, float:1.9007962E38)
            if (r2 != r1) goto L15e
            goto L17c
        L15e:
            r0.f1497 = r2
            java.lang.CharSequence r1 = r8.getNavigationContentDescription()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L17c
            int r1 = r0.f1497
            if (r1 != 0) goto L16f
            goto L177
        L16f:
            android.content.Context r2 = r8.getContext()
            java.lang.String r6 = r2.getString(r1)
        L177:
            r0.f1493 = r6
            r0.m745()
        L17c:
            java.lang.CharSequence r1 = r8.getNavigationContentDescription()
            r0.f1493 = r1
            z42 r1 = new z42
            r1.<init>(r0)
            r8.setNavigationOnClickListener(r1)
            r8.f751 = r0
        L18c:
            b52 r8 = r8.f751
            return r8
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.m315()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            d1 r0 = r1.f758
            r1.removeCallbacks(r0)
            r1.m315()
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.f744 = r1
        Lb:
            boolean r3 = r5.f744
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.f744 = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L23
            r6 = 3
            if (r0 != r6) goto L22
            goto L23
        L22:
            return r4
        L23:
            r5.f744 = r1
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
            r19 = this;
            r0 = r19
            int r1 = r0.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r8 = r0.getPaddingTop()
            int r9 = r0.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f747
            r11[r3] = r2
            r11[r2] = r2
            java.util.WeakHashMap r12 = p000.b92.f1572
            int r12 = r0.getMinimumHeight()
            if (r12 < 0) goto L3c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L3d
        L3c:
            r12 = r2
        L3d:
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.f762
            boolean r13 = r0.m314(r13)
            if (r13 == 0) goto L56
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.f762
            if (r1 == 0) goto L50
            int r13 = r0.m311(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L58
        L50:
            int r13 = r0.m310(r13, r6, r12, r11)
        L54:
            r14 = r10
            goto L58
        L56:
            r13 = r6
            goto L54
        L58:
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.f766
            boolean r15 = r0.m314(r15)
            if (r15 == 0) goto L6d
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.f766
            if (r1 == 0) goto L69
            int r14 = r0.m311(r15, r14, r12, r11)
            goto L6d
        L69:
            int r13 = r0.m310(r15, r13, r12, r11)
        L6d:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f759
            boolean r15 = r0.m314(r15)
            if (r15 == 0) goto L82
            androidx.appcompat.widget.ActionMenuView r15 = r0.f759
            if (r1 == 0) goto L7e
            int r13 = r0.m310(r15, r13, r12, r11)
            goto L82
        L7e:
            int r14 = r0.m311(r15, r14, r12, r11)
        L82:
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
            android.view.View r13 = r0.f767
            boolean r13 = r0.m314(r13)
            if (r13 == 0) goto Lbd
            android.view.View r13 = r0.f767
            if (r1 == 0) goto Lb9
            int r10 = r0.m311(r13, r10, r12, r11)
            goto Lbd
        Lb9:
            int r3 = r0.m310(r13, r3, r12, r11)
        Lbd:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f763
            boolean r13 = r0.m314(r13)
            if (r13 == 0) goto Ld2
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f763
            if (r1 == 0) goto Lce
            int r10 = r0.m311(r13, r10, r12, r11)
            goto Ld2
        Lce:
            int r3 = r0.m310(r13, r3, r12, r11)
        Ld2:
            androidx.appcompat.widget.AppCompatTextView r13 = r0.f760
            boolean r13 = r0.m314(r13)
            androidx.appcompat.widget.AppCompatTextView r14 = r0.f761
            boolean r14 = r0.m314(r14)
            if (r13 == 0) goto Lf7
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f760
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            w42 r15 = (p000.w42) r15
            int r2 = r15.topMargin
            r23 = r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f760
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            int r2 = r15.bottomMargin
            int r1 = r1 + r2
            goto Lfa
        Lf7:
            r23 = r1
            r1 = 0
        Lfa:
            if (r14 == 0) goto L115
            androidx.appcompat.widget.AppCompatTextView r2 = r0.f761
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            w42 r2 = (p000.w42) r2
            int r15 = r2.topMargin
            r22 = r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f761
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r15
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            int r1 = r1 + r22
            goto L117
        L115:
            r22 = r1
        L117:
            if (r13 != 0) goto L11b
            if (r14 == 0) goto L277
        L11b:
            if (r13 == 0) goto L120
            androidx.appcompat.widget.AppCompatTextView r2 = r0.f760
            goto L122
        L120:
            androidx.appcompat.widget.AppCompatTextView r2 = r0.f761
        L122:
            if (r14 == 0) goto L127
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f761
            goto L129
        L127:
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f760
        L129:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            w42 r2 = (p000.w42) r2
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            w42 r15 = (p000.w42) r15
            r22 = r1
            if (r13 == 0) goto L141
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f760
            int r1 = r1.getMeasuredWidth()
            if (r1 > 0) goto L14b
        L141:
            if (r14 == 0) goto L14e
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f761
            int r1 = r1.getMeasuredWidth()
            if (r1 <= 0) goto L14e
        L14b:
            r24 = r20
            goto L150
        L14e:
            r24 = 0
        L150:
            int r1 = r0.f738
            r1 = r1 & 112(0x70, float:1.57E-43)
            r16 = r3
            r3 = 48
            if (r1 == r3) goto L193
            r3 = 80
            if (r1 == r3) goto L189
            int r1 = r5 - r8
            int r1 = r1 - r9
            int r1 = r1 - r22
            int r1 = r1 / 2
            int r3 = r2.topMargin
            r17 = r3
            int r3 = r0.f776
            int r3 = r17 + r3
            if (r1 >= r3) goto L171
            r1 = r3
            goto L187
        L171:
            int r5 = r5 - r9
            int r5 = r5 - r22
            int r5 = r5 - r1
            int r5 = r5 - r8
            int r2 = r2.bottomMargin
            int r3 = r0.f777
            int r2 = r2 + r3
            if (r5 >= r2) goto L187
            int r2 = r15.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L187:
            int r8 = r8 + r1
            goto L19e
        L189:
            int r5 = r5 - r9
            int r1 = r15.bottomMargin
            int r5 = r5 - r1
            int r1 = r0.f777
            int r5 = r5 - r1
            int r8 = r5 - r22
            goto L19e
        L193:
            int r1 = r0.getPaddingTop()
            int r2 = r2.topMargin
            int r1 = r1 + r2
            int r2 = r0.f776
            int r8 = r1 + r2
        L19e:
            if (r23 == 0) goto L20e
            if (r24 == 0) goto L1a5
            int r1 = r0.f774
            goto L1a6
        L1a5:
            r1 = 0
        L1a6:
            r2 = r11[r20]
            int r1 = r1 - r2
            r2 = 0
            int r3 = java.lang.Math.max(r2, r1)
            int r10 = r10 - r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r20] = r1
            if (r13 == 0) goto L1dc
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f760
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            w42 r1 = (p000.w42) r1
            androidx.appcompat.widget.AppCompatTextView r2 = r0.f760
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f760
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f760
            r5.layout(r2, r8, r10, r3)
            int r5 = r0.f775
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L1dd
        L1dc:
            r2 = r10
        L1dd:
            if (r14 == 0) goto L203
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f761
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            w42 r1 = (p000.w42) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f761
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f761
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f761
            r5.layout(r1, r8, r10, r3)
            int r1 = r0.f775
            int r1 = r10 - r1
            goto L204
        L203:
            r1 = r10
        L204:
            if (r24 == 0) goto L20b
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L20b:
            r3 = r16
            goto L277
        L20e:
            if (r24 == 0) goto L214
            int r1 = r0.f774
        L212:
            r2 = 0
            goto L216
        L214:
            r1 = 0
            goto L212
        L216:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r16
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L24b
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f760
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            w42 r1 = (p000.w42) r1
            androidx.appcompat.widget.AppCompatTextView r2 = r0.f760
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f760
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            androidx.appcompat.widget.AppCompatTextView r9 = r0.f760
            r9.layout(r3, r8, r2, r5)
            int r8 = r0.f775
            int r2 = r2 + r8
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L24c
        L24b:
            r2 = r3
        L24c:
            if (r14 == 0) goto L270
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f761
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            w42 r1 = (p000.w42) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f761
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f761
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            androidx.appcompat.widget.AppCompatTextView r9 = r0.f761
            r9.layout(r3, r8, r1, r5)
            int r5 = r0.f775
            int r1 = r1 + r5
            goto L271
        L270:
            r1 = r3
        L271:
            if (r24 == 0) goto L277
            int r3 = java.lang.Math.max(r2, r1)
        L277:
            r1 = 3
            java.util.ArrayList r2 = r0.f745
            r0.m300(r1, r2)
            int r1 = r2.size()
            r5 = r3
            r3 = 0
        L283:
            if (r3 >= r1) goto L292
            java.lang.Object r8 = r2.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r5 = r0.m310(r8, r5, r12, r11)
            int r3 = r3 + 1
            goto L283
        L292:
            r1 = 5
            r0.m300(r1, r2)
            int r1 = r2.size()
            r3 = 0
        L29b:
            if (r3 >= r1) goto L2aa
            java.lang.Object r8 = r2.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r10 = r0.m311(r8, r10, r12, r11)
            int r3 = r3 + 1
            goto L29b
        L2aa:
            r3 = r20
            r0.m300(r3, r2)
            r1 = 0
            r8 = r11[r1]
            r1 = r11[r3]
            int r3 = r2.size()
            r13 = r8
            r8 = 0
            r9 = 0
        L2bb:
            if (r8 >= r3) goto L2f6
            java.lang.Object r14 = r2.get(r8)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            w42 r15 = (p000.w42) r15
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
            goto L2bb
        L2f6:
            r15 = 0
            int r4 = r4 - r6
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r4 = r4 + r6
            int r1 = r9 / 2
            int r4 = r4 - r1
            int r9 = r9 + r4
            if (r4 >= r5) goto L303
            goto L30a
        L303:
            if (r9 <= r10) goto L309
            int r9 = r9 - r10
            int r5 = r4 - r9
            goto L30a
        L309:
            r5 = r4
        L30a:
            int r1 = r2.size()
        L30e:
            if (r15 >= r1) goto L31d
            java.lang.Object r3 = r2.get(r15)
            android.view.View r3 = (android.view.View) r3
            int r5 = r0.m310(r3, r5, r12, r11)
            int r15 = r15 + 1
            goto L30e
        L31d:
            r2.clear()
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r15, int r16) {
            r14 = this;
            int r1 = r14.getLayoutDirection()
            r7 = 0
            r2 = 1
            if (r1 != r2) goto Lb
            r6 = r2
            r8 = r7
            goto Ld
        Lb:
            r8 = r2
            r6 = r7
        Ld:
            androidx.appcompat.widget.AppCompatImageButton r1 = r14.f762
            boolean r1 = r14.m314(r1)
            r3 = 0
            if (r1 == 0) goto L4c
            androidx.appcompat.widget.AppCompatImageButton r1 = r14.f762
            int r5 = r14.f773
            r0 = r14
            r2 = r15
            r4 = r16
            r0.m313(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.AppCompatImageButton r1 = r14.f762
            int r1 = r1.getMeasuredWidth()
            androidx.appcompat.widget.AppCompatImageButton r2 = r14.f762
            int r2 = m298(r2)
            int r2 = r2 + r1
            androidx.appcompat.widget.AppCompatImageButton r1 = r14.f762
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.AppCompatImageButton r4 = r14.f762
            int r4 = m299(r4)
            int r4 = r4 + r1
            int r1 = java.lang.Math.max(r7, r4)
            androidx.appcompat.widget.AppCompatImageButton r4 = r14.f762
            int r4 = r4.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r7, r4)
            r9 = r1
            r10 = r4
            goto L4f
        L4c:
            r2 = r7
            r9 = r2
            r10 = r9
        L4f:
            androidx.appcompat.widget.AppCompatImageButton r1 = r14.f766
            boolean r1 = r14.m314(r1)
            if (r1 == 0) goto L8a
            androidx.appcompat.widget.AppCompatImageButton r1 = r14.f766
            int r5 = r14.f773
            r0 = r14
            r2 = r15
            r4 = r16
            r0.m313(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.AppCompatImageButton r1 = r14.f766
            int r1 = r1.getMeasuredWidth()
            androidx.appcompat.widget.AppCompatImageButton r2 = r14.f766
            int r2 = m298(r2)
            int r2 = r2 + r1
            androidx.appcompat.widget.AppCompatImageButton r1 = r14.f766
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.AppCompatImageButton r3 = r14.f766
            int r3 = m299(r3)
            int r3 = r3 + r1
            int r9 = java.lang.Math.max(r9, r3)
            androidx.appcompat.widget.AppCompatImageButton r1 = r14.f766
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L8a:
            int r1 = r14.getCurrentContentInsetStart()
            int r3 = java.lang.Math.max(r1, r2)
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r7, r1)
            r2 = r6
            int[] r6 = r14.f747
            r6[r2] = r1
            androidx.appcompat.widget.ActionMenuView r1 = r14.f759
            boolean r1 = r14.m314(r1)
            if (r1 == 0) goto Ld8
            androidx.appcompat.widget.ActionMenuView r1 = r14.f759
            int r5 = r14.f773
            r0 = r14
            r2 = r15
            r4 = r16
            r0.m313(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionMenuView r1 = r14.f759
            int r1 = r1.getMeasuredWidth()
            androidx.appcompat.widget.ActionMenuView r2 = r14.f759
            int r2 = m298(r2)
            int r2 = r2 + r1
            androidx.appcompat.widget.ActionMenuView r1 = r14.f759
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.ActionMenuView r4 = r14.f759
            int r4 = m299(r4)
            int r4 = r4 + r1
            int r9 = java.lang.Math.max(r9, r4)
            androidx.appcompat.widget.ActionMenuView r1 = r14.f759
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            goto Ld9
        Ld8:
            r2 = r7
        Ld9:
            int r1 = r14.getCurrentContentInsetEnd()
            int r4 = java.lang.Math.max(r1, r2)
            int r3 = r3 + r4
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r7, r1)
            r6[r8] = r1
            android.view.View r1 = r14.f767
            boolean r1 = r14.m314(r1)
            if (r1 == 0) goto L118
            android.view.View r1 = r14.f767
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.m312(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            android.view.View r1 = r14.f767
            int r1 = r1.getMeasuredHeight()
            android.view.View r2 = r14.f767
            int r2 = m299(r2)
            int r2 = r2 + r1
            int r9 = java.lang.Math.max(r9, r2)
            android.view.View r1 = r14.f767
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L118:
            androidx.appcompat.widget.AppCompatImageView r1 = r14.f763
            boolean r1 = r14.m314(r1)
            if (r1 == 0) goto L147
            androidx.appcompat.widget.AppCompatImageView r1 = r14.f763
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.m312(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            androidx.appcompat.widget.AppCompatImageView r1 = r14.f763
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.AppCompatImageView r2 = r14.f763
            int r2 = m299(r2)
            int r2 = r2 + r1
            int r9 = java.lang.Math.max(r9, r2)
            androidx.appcompat.widget.AppCompatImageView r1 = r14.f763
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L147:
            int r8 = r14.getChildCount()
            r11 = r7
        L14c:
            if (r11 >= r8) goto L18c
            android.view.View r1 = r14.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            w42 r2 = (p000.w42) r2
            int r2 = r2.f11565
            if (r2 != 0) goto L162
            boolean r2 = r14.m314(r1)
            if (r2 != 0) goto L164
        L162:
            r12 = r3
            goto L188
        L164:
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r5 = r0.m312(r1, r2, r3, r4, r5, r6)
            r12 = r3
            int r3 = r12 + r5
            int r2 = r1.getMeasuredHeight()
            int r4 = m299(r1)
            int r4 = r4 + r2
            int r2 = java.lang.Math.max(r9, r4)
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r10, r1)
            r10 = r1
            r9 = r2
            goto L189
        L188:
            r3 = r12
        L189:
            int r11 = r11 + 1
            goto L14c
        L18c:
            r12 = r3
            int r1 = r14.f776
            int r2 = r14.f777
            int r5 = r1 + r2
            int r1 = r14.f774
            int r2 = r14.f775
            int r8 = r1 + r2
            androidx.appcompat.widget.AppCompatTextView r1 = r14.f760
            boolean r1 = r14.m314(r1)
            if (r1 == 0) goto L1d4
            androidx.appcompat.widget.AppCompatTextView r1 = r14.f760
            int r3 = r12 + r8
            r0 = r14
            r2 = r15
            r4 = r16
            r0.m312(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.AppCompatTextView r1 = r14.f760
            int r1 = r1.getMeasuredWidth()
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f760
            int r2 = m298(r2)
            int r2 = r2 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r14.f760
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.AppCompatTextView r3 = r14.f760
            int r3 = m299(r3)
            int r3 = r3 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r14.f760
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            r11 = r3
            r13 = r10
            r10 = r2
            goto L1d7
        L1d4:
            r11 = r7
            r13 = r10
            r10 = r11
        L1d7:
            androidx.appcompat.widget.AppCompatTextView r1 = r14.f761
            boolean r1 = r14.m314(r1)
            if (r1 == 0) goto L208
            androidx.appcompat.widget.AppCompatTextView r1 = r14.f761
            int r3 = r12 + r8
            int r5 = r5 + r11
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.m312(r1, r2, r3, r4, r5, r6)
            int r10 = java.lang.Math.max(r10, r1)
            androidx.appcompat.widget.AppCompatTextView r1 = r14.f761
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f761
            int r2 = m299(r2)
            int r2 = r2 + r1
            int r11 = r11 + r2
            androidx.appcompat.widget.AppCompatTextView r1 = r14.f761
            int r1 = r1.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r1)
        L208:
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
            boolean r3 = r14.f754
            if (r3 != 0) goto L246
            goto L263
        L246:
            int r3 = r14.getChildCount()
            r4 = r7
        L24b:
            if (r4 >= r3) goto L268
            android.view.View r5 = r14.getChildAt(r4)
            boolean r6 = r14.m314(r5)
            if (r6 == 0) goto L265
            int r6 = r5.getMeasuredWidth()
            if (r6 <= 0) goto L265
            int r5 = r5.getMeasuredHeight()
            if (r5 <= 0) goto L265
        L263:
            r7 = r2
            goto L268
        L265:
            int r4 = r4 + 1
            goto L24b
        L268:
            r14.setMeasuredDimension(r1, r7)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof p000.y42
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            y42 r4 = (p000.y42) r4
            android.os.Parcelable r0 = r4.f1063
            super.onRestoreInstanceState(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f759
            if (r0 == 0) goto L16
            iz0 r0 = r0.f524
            goto L17
        L16:
            r0 = 0
        L17:
            int r1 = r4.f12454
            if (r1 == 0) goto L2a
            v42 r2 = r3.f753
            if (r2 == 0) goto L2a
            if (r0 == 0) goto L2a
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto L2a
            r0.expandActionView()
        L2a:
            boolean r4 = r4.f12455
            if (r4 == 0) goto L36
            d1 r4 = r3.f758
            r3.removeCallbacks(r4)
            r3.post(r4)
        L36:
            return
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r2) {
            r1 = this;
            super.onRtlPropertiesChanged(r2)
            r1.m303()
            lq0 r1 = r1.f778
            r0 = 1
            if (r2 != r0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            boolean r2 = r1.f6743
            if (r0 != r2) goto L12
            return
        L12:
            r1.f6743 = r0
            boolean r2 = r1.f6744
            if (r2 == 0) goto L42
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L2f
            int r0 = r1.f6740
            if (r0 == r2) goto L21
            goto L23
        L21:
            int r0 = r1.f6741
        L23:
            r1.f6737 = r0
            int r0 = r1.f6739
            if (r0 == r2) goto L2a
            goto L2c
        L2a:
            int r0 = r1.f6742
        L2c:
            r1.f6738 = r0
            return
        L2f:
            int r0 = r1.f6739
            if (r0 == r2) goto L34
            goto L36
        L34:
            int r0 = r1.f6741
        L36:
            r1.f6737 = r0
            int r0 = r1.f6740
            if (r0 == r2) goto L3d
            goto L3f
        L3d:
            int r0 = r1.f6742
        L3f:
            r1.f6738 = r0
            return
        L42:
            int r2 = r1.f6741
            r1.f6737 = r2
            int r2 = r1.f6742
            r1.f6738 = r2
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            y42 r0 = new y42
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            v42 r1 = r2.f753
            if (r1 == 0) goto L15
            lz0 r1 = r1.f11103
            if (r1 == 0) goto L15
            int r1 = r1.f6853
            r0.f12454 = r1
        L15:
            androidx.appcompat.widget.ActionMenuView r2 = r2.f759
            if (r2 == 0) goto L25
            androidx.appcompat.widget.γ r2 = r2.f528
            if (r2 == 0) goto L25
            boolean r2 = r2.m327()
            if (r2 == 0) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            r0.f12455 = r2
            return r0
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.f743 = r1
        L9:
            boolean r2 = r4.f743
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.f743 = r3
        L18:
            if (r0 == r3) goto L1f
            r5 = 3
            if (r0 != r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            r4.f743 = r1
            return r3
    }

    public void setBackInvokedCallbackEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.f757
            if (r0 == r2) goto L9
            r1.f757 = r2
            r1.m315()
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
            r1.m302()
        L9:
            androidx.appcompat.widget.AppCompatImageButton r1 = r1.f766
            if (r1 == 0) goto L10
            r1.setContentDescription(r2)
        L10:
            return
    }

    public void setCollapseIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            r1.setCollapseIcon(r2)
            return
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            r0.m302()
            androidx.appcompat.widget.AppCompatImageButton r0 = r0.f766
            r0.setImageDrawable(r1)
            return
        Lb:
            androidx.appcompat.widget.AppCompatImageButton r1 = r0.f766
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r0.f764
            r1.setImageDrawable(r0)
        L14:
            return
    }

    public void setCollapsible(boolean r1) {
            r0 = this;
            r0.f754 = r1
            r0.requestLayout()
            return
    }

    public void setContentInsetEndWithActions(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.f737
            if (r2 == r0) goto L13
            r1.f737 = r2
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
            int r0 = r1.f736
            if (r2 == r0) goto L13
            r1.f736 = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            r1.setLogo(r2)
            return
    }

    public void setLogo(android.graphics.drawable.Drawable r3) {
            r2 = this;
            androidx.appcompat.widget.AppCompatImageView r0 = r2.f763
            if (r3 == 0) goto L20
            if (r0 != 0) goto L11
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f763 = r0
        L11:
            androidx.appcompat.widget.AppCompatImageView r0 = r2.f763
            boolean r0 = r2.m309(r0)
            if (r0 != 0) goto L34
            androidx.appcompat.widget.AppCompatImageView r0 = r2.f763
            r1 = 1
            r2.m301(r0, r1)
            goto L34
        L20:
            if (r0 == 0) goto L34
            boolean r0 = r2.m309(r0)
            if (r0 == 0) goto L34
            androidx.appcompat.widget.AppCompatImageView r0 = r2.f763
            r2.removeView(r0)
            java.util.ArrayList r0 = r2.f746
            androidx.appcompat.widget.AppCompatImageView r1 = r2.f763
            r0.remove(r1)
        L34:
            androidx.appcompat.widget.AppCompatImageView r2 = r2.f763
            if (r2 == 0) goto L3b
            r2.setImageDrawable(r3)
        L3b:
            return
    }

    public void setLogoDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setLogoDescription(r2)
            return
    }

    public void setLogoDescription(java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L15
            androidx.appcompat.widget.AppCompatImageView r0 = r2.f763
            if (r0 != 0) goto L15
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f763 = r0
        L15:
            androidx.appcompat.widget.AppCompatImageView r2 = r2.f763
            if (r2 == 0) goto L1c
            r2.setContentDescription(r3)
        L1c:
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
            r1.m306()
        L9:
            androidx.appcompat.widget.AppCompatImageButton r0 = r1.f762
            if (r0 == 0) goto L15
            r0.setContentDescription(r2)
            androidx.appcompat.widget.AppCompatImageButton r1 = r1.f762
            p000.c52.m1142(r1, r2)
        L15:
            return
    }

    public void setNavigationIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            r1.setNavigationIcon(r2)
            return
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.m306()
            androidx.appcompat.widget.AppCompatImageButton r0 = r2.f762
            boolean r0 = r2.m309(r0)
            if (r0 != 0) goto L2a
            androidx.appcompat.widget.AppCompatImageButton r0 = r2.f762
            r1 = 1
            r2.m301(r0, r1)
            goto L2a
        L14:
            androidx.appcompat.widget.AppCompatImageButton r0 = r2.f762
            if (r0 == 0) goto L2a
            boolean r0 = r2.m309(r0)
            if (r0 == 0) goto L2a
            androidx.appcompat.widget.AppCompatImageButton r0 = r2.f762
            r2.removeView(r0)
            java.util.ArrayList r0 = r2.f746
            androidx.appcompat.widget.AppCompatImageButton r1 = r2.f762
            r0.remove(r1)
        L2a:
            androidx.appcompat.widget.AppCompatImageButton r2 = r2.f762
            if (r2 == 0) goto L31
            r2.setImageDrawable(r3)
        L31:
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.m306()
            androidx.appcompat.widget.AppCompatImageButton r0 = r0.f762
            r0.setOnClickListener(r1)
            return
    }

    public void setOnMenuItemClickListener(p000.x42 r1) {
            r0 = this;
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.m304()
            androidx.appcompat.widget.ActionMenuView r0 = r0.f759
            r0.setOverflowIcon(r1)
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.f769
            if (r0 == r3) goto L1a
            r2.f769 = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.f768 = r3
            return
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.f768 = r0
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
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f761
            if (r0 != 0) goto L41
            if (r1 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            r2 = 0
            r1.<init>(r0, r2)
            r3.f761 = r1
            r1.setSingleLine()
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f761
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.f771
            if (r1 == 0) goto L29
            androidx.appcompat.widget.AppCompatTextView r2 = r3.f761
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.f742
            if (r0 == 0) goto L32
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f761
            r1.setTextColor(r0)
        L32:
            androidx.appcompat.widget.AppCompatTextView r0 = r3.f761
            boolean r0 = r3.m309(r0)
            if (r0 != 0) goto L55
            androidx.appcompat.widget.AppCompatTextView r0 = r3.f761
            r1 = 1
            r3.m301(r0, r1)
            goto L55
        L41:
            if (r1 == 0) goto L55
            boolean r0 = r3.m309(r1)
            if (r0 == 0) goto L55
            androidx.appcompat.widget.AppCompatTextView r0 = r3.f761
            r3.removeView(r0)
            java.util.ArrayList r0 = r3.f746
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f761
            r0.remove(r1)
        L55:
            androidx.appcompat.widget.AppCompatTextView r0 = r3.f761
            if (r0 == 0) goto L5c
            r0.setText(r4)
        L5c:
            r3.f740 = r4
            return
    }

    public void setSubtitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setSubtitleTextColor(r1)
            return
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f742 = r1
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f761
            if (r0 == 0) goto L9
            r0.setTextColor(r1)
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
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f760
            if (r0 != 0) goto L41
            if (r1 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            r2 = 0
            r1.<init>(r0, r2)
            r3.f760 = r1
            r1.setSingleLine()
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f760
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.f770
            if (r1 == 0) goto L29
            androidx.appcompat.widget.AppCompatTextView r2 = r3.f760
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.f741
            if (r0 == 0) goto L32
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f760
            r1.setTextColor(r0)
        L32:
            androidx.appcompat.widget.AppCompatTextView r0 = r3.f760
            boolean r0 = r3.m309(r0)
            if (r0 != 0) goto L55
            androidx.appcompat.widget.AppCompatTextView r0 = r3.f760
            r1 = 1
            r3.m301(r0, r1)
            goto L55
        L41:
            if (r1 == 0) goto L55
            boolean r0 = r3.m309(r1)
            if (r0 == 0) goto L55
            androidx.appcompat.widget.AppCompatTextView r0 = r3.f760
            r3.removeView(r0)
            java.util.ArrayList r0 = r3.f746
            androidx.appcompat.widget.AppCompatTextView r1 = r3.f760
            r0.remove(r1)
        L55:
            androidx.appcompat.widget.AppCompatTextView r0 = r3.f760
            if (r0 == 0) goto L5c
            r0.setText(r4)
        L5c:
            r3.f739 = r4
            return
    }

    public void setTitleMarginBottom(int r1) {
            r0 = this;
            r0.f777 = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginEnd(int r1) {
            r0 = this;
            r0.f775 = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginStart(int r1) {
            r0 = this;
            r0.f774 = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginTop(int r1) {
            r0 = this;
            r0.f776 = r1
            r0.requestLayout()
            return
    }

    public void setTitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTitleTextColor(r1)
            return
    }

    public void setTitleTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f741 = r1
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f760
            if (r0 == 0) goto L9
            r0.setTextColor(r1)
        L9:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m300(int r9, java.util.ArrayList r10) {
            r8 = this;
            int r0 = r8.getLayoutDirection()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            int r3 = r8.getChildCount()
            int r4 = r8.getLayoutDirection()
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r4)
            r10.clear()
            r4 = 3
            r5 = 5
            if (r0 == 0) goto L54
            int r3 = r3 - r2
        L1f:
            if (r3 < 0) goto L89
            android.view.View r0 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            w42 r1 = (p000.w42) r1
            int r6 = r1.f11565
            if (r6 != 0) goto L51
            boolean r6 = r8.m314(r0)
            if (r6 == 0) goto L51
            int r1 = r1.f11564
            int r6 = r8.getLayoutDirection()
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r6)
            r1 = r1 & 7
            if (r1 == r2) goto L4c
            if (r1 == r4) goto L4c
            if (r1 == r5) goto L4c
            if (r6 != r2) goto L4b
            r1 = r5
            goto L4c
        L4b:
            r1 = r4
        L4c:
            if (r1 != r9) goto L51
            r10.add(r0)
        L51:
            int r3 = r3 + (-1)
            goto L1f
        L54:
            if (r1 >= r3) goto L89
            android.view.View r0 = r8.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            w42 r6 = (p000.w42) r6
            int r7 = r6.f11565
            if (r7 != 0) goto L86
            boolean r7 = r8.m314(r0)
            if (r7 == 0) goto L86
            int r6 = r6.f11564
            int r7 = r8.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            r6 = r6 & 7
            if (r6 == r2) goto L81
            if (r6 == r4) goto L81
            if (r6 == r5) goto L81
            if (r7 != r2) goto L80
            r6 = r5
            goto L81
        L80:
            r6 = r4
        L81:
            if (r6 != r9) goto L86
            r10.add(r0)
        L86:
            int r1 = r1 + 1
            goto L54
        L89:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m301(android.view.View r3, boolean r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto Lb
            w42 r0 = m296()
            goto L18
        Lb:
            boolean r1 = r2.checkLayoutParams(r0)
            if (r1 != 0) goto L16
            w42 r0 = m297(r0)
            goto L18
        L16:
            w42 r0 = (p000.w42) r0
        L18:
            r1 = 1
            r0.f11565 = r1
            if (r4 == 0) goto L2a
            android.view.View r4 = r2.f767
            if (r4 == 0) goto L2a
            r3.setLayoutParams(r0)
            java.util.ArrayList r2 = r2.f746
            r2.add(r3)
            return
        L2a:
            r2.addView(r3, r0)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m302() {
            r4 = this;
            androidx.appcompat.widget.AppCompatImageButton r0 = r4.f766
            if (r0 != 0) goto L3f
            androidx.appcompat.widget.AppCompatImageButton r0 = new androidx.appcompat.widget.AppCompatImageButton
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 2130968885(0x7f040135, float:1.7546436E38)
            r0.<init>(r1, r2, r3)
            r4.f766 = r0
            android.graphics.drawable.Drawable r1 = r4.f764
            r0.setImageDrawable(r1)
            androidx.appcompat.widget.AppCompatImageButton r0 = r4.f766
            java.lang.CharSequence r1 = r4.f765
            r0.setContentDescription(r1)
            w42 r0 = m296()
            int r1 = r4.f772
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.f11564 = r1
            r1 = 2
            r0.f11565 = r1
            androidx.appcompat.widget.AppCompatImageButton r2 = r4.f766
            r2.setLayoutParams(r0)
            androidx.appcompat.widget.AppCompatImageButton r0 = r4.f766
            ｈ r2 = new ｈ
            r2.<init>(r1, r4)
            r0.setOnClickListener(r2)
        L3f:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m303() {
            r3 = this;
            lq0 r0 = r3.f778
            if (r0 != 0) goto L1f
            lq0 r0 = new lq0
            r1 = 1
            r0.<init>(r1)
            r1 = 0
            r0.f6737 = r1
            r0.f6738 = r1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f6739 = r2
            r0.f6740 = r2
            r0.f6741 = r1
            r0.f6742 = r1
            r0.f6743 = r1
            r0.f6744 = r1
            r3.f778 = r0
        L1f:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m304() {
            r3 = this;
            r3.m305()
            androidx.appcompat.widget.ActionMenuView r0 = r3.f759
            iz0 r1 = r0.f524
            if (r1 != 0) goto L2a
            android.view.Menu r0 = r0.getMenu()
            iz0 r0 = (p000.iz0) r0
            v42 r1 = r3.f753
            if (r1 != 0) goto L1a
            v42 r1 = new v42
            r1.<init>(r3)
            r3.f753 = r1
        L1a:
            androidx.appcompat.widget.ActionMenuView r1 = r3.f759
            r2 = 1
            r1.setExpandedActionViewsExclusive(r2)
            v42 r1 = r3.f753
            android.content.Context r2 = r3.f768
            r0.m2830(r1, r2)
            r3.m315()
        L2a:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m305() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f759
            if (r0 != 0) goto L40
            androidx.appcompat.widget.ActionMenuView r0 = new androidx.appcompat.widget.ActionMenuView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f759 = r0
            int r1 = r3.f769
            r0.setPopupTheme(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f759
            t42 r1 = r3.f750
            r0.setOnMenuItemClickListener(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f759
            t42 r1 = new t42
            r1.<init>(r3)
            r0.getClass()
            r0.f518 = r1
            w42 r0 = m296()
            int r1 = r3.f772
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388613(0x800005, float:1.175495E-38)
            r1 = r1 | r2
            r0.f11564 = r1
            androidx.appcompat.widget.ActionMenuView r1 = r3.f759
            r1.setLayoutParams(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.f759
            r1 = 0
            r3.m301(r0, r1)
        L40:
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m306() {
            r4 = this;
            androidx.appcompat.widget.AppCompatImageButton r0 = r4.f762
            if (r0 != 0) goto L26
            androidx.appcompat.widget.AppCompatImageButton r0 = new androidx.appcompat.widget.AppCompatImageButton
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 2130968885(0x7f040135, float:1.7546436E38)
            r0.<init>(r1, r2, r3)
            r4.f762 = r0
            w42 r0 = m296()
            int r1 = r4.f772
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.f11564 = r1
            androidx.appcompat.widget.AppCompatImageButton r4 = r4.f762
            r4.setLayoutParams(r0)
        L26:
            return
    }

    /* JADX INFO: renamed from: κ */
    public final int m307(android.view.View r7, int r8) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            w42 r0 = (p000.w42) r0
            int r7 = r7.getMeasuredHeight()
            r1 = 0
            if (r8 <= 0) goto L12
            int r8 = r7 - r8
            int r8 = r8 / 2
            goto L13
        L12:
            r8 = r1
        L13:
            int r2 = r0.f11564
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 16
            r4 = 80
            r5 = 48
            if (r2 == r3) goto L27
            if (r2 == r5) goto L27
            if (r2 == r4) goto L27
            int r2 = r6.f738
            r2 = r2 & 112(0x70, float:1.57E-43)
        L27:
            if (r2 == r5) goto L62
            if (r2 == r4) goto L53
            int r8 = r6.getPaddingTop()
            int r2 = r6.getPaddingBottom()
            int r6 = r6.getHeight()
            int r3 = r6 - r8
            int r3 = r3 - r2
            int r3 = r3 - r7
            int r3 = r3 / 2
            int r4 = r0.topMargin
            if (r3 >= r4) goto L43
            r3 = r4
            goto L51
        L43:
            int r6 = r6 - r2
            int r6 = r6 - r7
            int r6 = r6 - r3
            int r6 = r6 - r8
            int r7 = r0.bottomMargin
            if (r6 >= r7) goto L51
            int r7 = r7 - r6
            int r3 = r3 - r7
            int r3 = java.lang.Math.max(r1, r3)
        L51:
            int r8 = r8 + r3
            return r8
        L53:
            int r1 = r6.getHeight()
            int r6 = r6.getPaddingBottom()
            int r1 = r1 - r6
            int r1 = r1 - r7
            int r6 = r0.bottomMargin
            int r1 = r1 - r6
            int r1 = r1 - r8
            return r1
        L62:
            int r6 = r6.getPaddingTop()
            int r6 = r6 - r8
            return r6
    }

    /* JADX INFO: renamed from: ν */
    public final void m308() {
            r3 = this;
            java.util.ArrayList r0 = r3.f749
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            android.view.Menu r2 = r3.getMenu()
            int r1 = r1.getItemId()
            r2.removeItem(r1)
            goto L6
        L1e:
            r3.getMenu()
            java.util.ArrayList r0 = r3.getCurrentMenuItems()
            r3.getMenuInflater()
            m6 r1 = r3.f748
            java.lang.Object r1 = r1.f6969
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            v60 r2 = (p000.v60) r2
            b70 r2 = r2.f11116
            r2.m785()
            goto L32
        L44:
            java.util.ArrayList r1 = r3.getCurrentMenuItems()
            r1.removeAll(r0)
            r3.f749 = r1
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final boolean m309(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L11
            java.util.ArrayList r1 = r1.f746
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ο */
    public final int m310(android.view.View r5, int r6, int r7, int[] r8) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            w42 r0 = (p000.w42) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r8[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r6
            int r6 = -r1
            int r6 = java.lang.Math.max(r2, r6)
            r8[r2] = r6
            int r4 = r4.m307(r5, r7)
            int r6 = r5.getMeasuredWidth()
            int r7 = r3 + r6
            int r8 = r5.getMeasuredHeight()
            int r8 = r8 + r4
            r5.layout(r3, r4, r7, r8)
            int r4 = r0.rightMargin
            int r6 = r6 + r4
            int r6 = r6 + r3
            return r6
    }

    /* JADX INFO: renamed from: π */
    public final int m311(android.view.View r6, int r7, int r8, int[] r9) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            w42 r0 = (p000.w42) r0
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
            int r5 = r5.m307(r6, r8)
            int r8 = r6.getMeasuredWidth()
            int r9 = r7 - r8
            int r1 = r6.getMeasuredHeight()
            int r1 = r1 + r5
            r6.layout(r9, r5, r7, r1)
            int r5 = r0.leftMargin
            int r8 = r8 + r5
            int r7 = r7 - r8
            return r7
    }

    /* JADX INFO: renamed from: ρ */
    public final int m312(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13) {
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
            int r7 = r7.getPaddingBottom()
            int r7 = r7 + r10
            int r10 = r0.topMargin
            int r7 = r7 + r10
            int r10 = r0.bottomMargin
            int r7 = r7 + r10
            int r7 = r7 + r12
            int r10 = r0.height
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r11, r7, r10)
            r8.measure(r9, r7)
            int r7 = r8.getMeasuredWidth()
            int r7 = r7 + r6
            return r7
    }

    /* JADX INFO: renamed from: σ */
    public final void m313(android.view.View r4, int r5, int r6, int r7, int r8) {
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
            int r3 = r3.getPaddingBottom()
            int r3 = r3 + r6
            int r6 = r0.topMargin
            int r3 = r3 + r6
            int r6 = r0.bottomMargin
            int r3 = r3 + r6
            int r6 = r0.height
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r7, r3, r6)
            int r6 = android.view.View.MeasureSpec.getMode(r3)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L49
            if (r8 < 0) goto L49
            if (r6 == 0) goto L45
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r8 = java.lang.Math.min(r3, r8)
        L45:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r7)
        L49:
            r4.measure(r5, r3)
            return
    }

    /* JADX INFO: renamed from: τ */
    public final boolean m314(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L12
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L12
            int r1 = r2.getVisibility()
            r2 = 8
            if (r1 == r2) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: υ */
    public final void m315() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4d
            android.window.OnBackInvokedDispatcher r0 = p000.u42.m5781(r3)
            v42 r1 = r3.f753
            if (r1 == 0) goto L20
            lz0 r1 = r1.f11103
            if (r1 == 0) goto L20
            if (r0 == 0) goto L20
            boolean r1 = r3.isAttachedToWindow()
            if (r1 == 0) goto L20
            boolean r1 = r3.f757
            if (r1 == 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L3f
            android.window.OnBackInvokedDispatcher r2 = r3.f756
            if (r2 != 0) goto L3f
            android.window.OnBackInvokedCallback r1 = r3.f755
            if (r1 != 0) goto L37
            s42 r1 = new s42
            r2 = 0
            r1.<init>(r3, r2)
            android.window.OnBackInvokedCallback r1 = p000.u42.m5782(r1)
            r3.f755 = r1
        L37:
            android.window.OnBackInvokedCallback r1 = r3.f755
            p000.u42.m5783(r0, r1)
            r3.f756 = r0
            return
        L3f:
            if (r1 != 0) goto L4d
            android.window.OnBackInvokedDispatcher r0 = r3.f756
            if (r0 == 0) goto L4d
            android.window.OnBackInvokedCallback r1 = r3.f755
            p000.u42.m5784(r0, r1)
            r0 = 0
            r3.f756 = r0
        L4d:
            return
    }
}
