package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C2136 f55;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public java.lang.CharSequence f56;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public java.lang.CharSequence f57;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f58;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public boolean f59;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final int f60;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public android.view.View f61;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final int f62;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public androidx.appcompat.widget.ActionMenuView f63;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public android.view.View f64;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.Context f65;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final int f66;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1334 f67;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f68;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public android.view.View f69;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public android.widget.TextView f70;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public android.widget.TextView f71;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C1909 f72;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public android.widget.LinearLayout f73;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f74;

    public ActionBarContextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContextView(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r0 = 1711538206(0x6604001e, float:1.5583863E23)
            r5.<init>(r6, r7, r0)
            ᛷᛸᛵᲇ r1 = new ᛷᛸᛵᲇ
            r1.<init>(r5)
            r5.f67 = r1
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r3 = 1711538180(0x66040004, float:1.5583817E23)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r1, r4)
            if (r2 == 0) goto L2e
            int r2 = r1.resourceId
            if (r2 == 0) goto L2e
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r1 = r1.resourceId
            r2.<init>(r6, r1)
            r5.f65 = r2
            goto L30
        L2e:
            r5.f65 = r6
        L30:
            int[] r1 = defpackage.AbstractC1070.f4789
            r2 = 0
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1, r0, r2)
            boolean r0 = r7.hasValue(r2)
            if (r0 == 0) goto L48
            int r0 = r7.getResourceId(r2, r2)
            if (r0 == 0) goto L48
            android.graphics.drawable.Drawable r6 = defpackage.AbstractC1592.m2873(r6, r0)
            goto L4c
        L48:
            android.graphics.drawable.Drawable r6 = r7.getDrawable(r2)
        L4c:
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            r5.setBackground(r6)
            r6 = 5
            int r6 = r7.getResourceId(r6, r2)
            r5.f62 = r6
            r6 = 4
            int r6 = r7.getResourceId(r6, r2)
            r5.f60 = r6
            r6 = 3
            int r6 = r7.getLayoutDimension(r6, r2)
            r5.f74 = r6
            r6 = 2
            r0 = 1712062469(0x660c0005, float:1.6528292E23)
            int r6 = r7.getResourceId(r6, r0)
            r5.f66 = r6
            r7.recycle()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static /* synthetic */ void m18(androidx.appcompat.widget.ActionBarContextView r1) {
            r0 = 0
            super.setVisibility(r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static /* synthetic */ void m19(androidx.appcompat.widget.ActionBarContextView r0, int r1) {
            super.setVisibility(r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static int m20(android.view.View r1, int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r1.measure(r0, r3)
            int r1 = r1.getMeasuredWidth()
            int r2 = r2 - r1
            r1 = 0
            int r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static int m21(android.view.View r2, int r3, int r4, int r5, boolean r6) {
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

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -1
            r1 = -2
            r2.<init>(r0, r1)
            return r2
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    public int getAnimatedVisibility() {
            r1 = this;
            ᲇᲇᛱᛳ r0 = r1.f55
            if (r0 == 0) goto L9
            ᛷᛸᛵᲇ r1 = r1.f67
            int r1 = r1.f5906
            return r1
        L9:
            int r1 = r1.getVisibility()
            return r1
    }

    public int getContentHeight() {
            r0 = this;
            int r0 = r0.f74
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f57
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f56
            return r0
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
            r4 = this;
            super.onConfigurationChanged(r5)
            android.content.Context r5 = r4.getContext()
            r0 = 0
            int[] r1 = defpackage.AbstractC1070.f4792
            r2 = 1711538183(0x66040007, float:1.5583822E23)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r0, r1, r2, r3)
            r0 = 13
            int r0 = r5.getLayoutDimension(r0, r3)
            r4.setContentHeight(r0)
            r5.recycle()
            ᲁᲀᛴᛷ r4 = r4.f72
            if (r4 == 0) goto L6b
            android.content.Context r5 = r4.f8292
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r0 = r5.screenWidthDp
            int r1 = r5.screenHeightDp
            int r5 = r5.smallestScreenWidthDp
            r2 = 600(0x258, float:8.41E-43)
            if (r5 > r2) goto L60
            if (r0 > r2) goto L60
            r5 = 720(0x2d0, float:1.009E-42)
            r2 = 960(0x3c0, float:1.345E-42)
            if (r0 <= r2) goto L40
            if (r1 > r5) goto L60
        L40:
            if (r0 <= r5) goto L45
            if (r1 <= r2) goto L45
            goto L60
        L45:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r5) goto L5e
            r5 = 480(0x1e0, float:6.73E-43)
            r2 = 640(0x280, float:8.97E-43)
            if (r0 <= r2) goto L51
            if (r1 > r5) goto L5e
        L51:
            if (r0 <= r5) goto L56
            if (r1 <= r2) goto L56
            goto L5e
        L56:
            r5 = 360(0x168, float:5.04E-43)
            if (r0 < r5) goto L5c
            r5 = 3
            goto L61
        L5c:
            r5 = 2
            goto L61
        L5e:
            r5 = 4
            goto L61
        L60:
            r5 = 5
        L61:
            r4.f8300 = r5
            ᲀᛷᛱᲇ r4 = r4.f8290
            if (r4 == 0) goto L6b
            r5 = 1
            r4.m3088(r5)
        L6b:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            ᲁᲀᛴᛷ r0 = r1.f72
            if (r0 == 0) goto L1b
            r0.m3340()
            ᲁᲀᛴᛷ r1 = r1.f72
            ᛲᲈᛸᛲ r1 = r1.f8293
            if (r1 == 0) goto L1b
            boolean r0 = r1.m3339()
            if (r0 == 0) goto L1b
            ᛶᲇᲀᛵ r1 = r1.f8273
            r1.dismiss()
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
            r5.f68 = r1
        Lb:
            boolean r3 = r5.f68
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.f68 = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L23
            r6 = 3
            if (r0 != r6) goto L22
            goto L23
        L22:
            return r4
        L23:
            r5.f68 = r1
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            boolean r5 = defpackage.AbstractC1211.m2349(r4)
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
            android.view.View r7 = r4.f64
            r2 = 8
            if (r7 == 0) goto L56
            int r7 = r7.getVisibility()
            if (r7 == r2) goto L56
            android.view.View r7 = r4.f64
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
            android.view.View r3 = r4.f64
            int r3 = m21(r3, r0, r1, r9, r5)
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
            android.widget.LinearLayout r7 = r4.f73
            if (r7 == 0) goto L6b
            android.view.View r3 = r4.f61
            if (r3 != 0) goto L6b
            int r7 = r7.getVisibility()
            if (r7 == r2) goto L6b
            android.widget.LinearLayout r7 = r4.f73
            int r7 = m21(r7, r0, r1, r9, r5)
            int r0 = r0 + r7
        L6b:
            android.view.View r7 = r4.f61
            if (r7 == 0) goto L72
            m21(r7, r0, r1, r9, r5)
        L72:
            if (r5 == 0) goto L79
            int r6 = r4.getPaddingLeft()
            goto L80
        L79:
            int r8 = r8 - r6
            int r6 = r4.getPaddingRight()
            int r6 = r8 - r6
        L80:
            androidx.appcompat.widget.ActionMenuView r4 = r4.f63
            if (r4 == 0) goto L89
            r5 = r5 ^ 1
            m21(r4, r6, r1, r9, r5)
        L89:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Lf4
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Le2
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.f74
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
            android.view.View r6 = r10.f64
            if (r6 == 0) goto L4d
            int r12 = m20(r6, r12, r5)
            android.view.View r6 = r10.f64
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r12 = r12 - r7
        L4d:
            androidx.appcompat.widget.ActionMenuView r6 = r10.f63
            if (r6 == 0) goto L5d
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L5d
            androidx.appcompat.widget.ActionMenuView r6 = r10.f63
            int r12 = m20(r6, r12, r5)
        L5d:
            android.widget.LinearLayout r6 = r10.f73
            r7 = 0
            if (r6 == 0) goto L91
            android.view.View r8 = r10.f61
            if (r8 != 0) goto L91
            boolean r8 = r10.f59
            if (r8 == 0) goto L8d
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.f73
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.f73
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
            android.widget.LinearLayout r5 = r10.f73
            if (r6 == 0) goto L87
            r6 = r7
            goto L89
        L87:
            r6 = 8
        L89:
            r5.setVisibility(r6)
            goto L91
        L8d:
            int r12 = m20(r6, r12, r5)
        L91:
            android.view.View r5 = r10.f61
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
            android.view.View r4 = r10.f61
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r12, r1)
        Lc0:
            int r12 = r10.f74
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
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r11 = " can only be used with android:layout_height=\"wrap_content\""
            java.lang.String r10 = r10.concat(r11)
            defpackage.C2264.m3676(r10)
            return
        Lf4:
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r11 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            java.lang.String r10 = r10.concat(r11)
            defpackage.C2264.m3676(r10)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.f58 = r1
        L9:
            boolean r2 = r4.f58
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.f58 = r3
        L18:
            if (r0 == r3) goto L1f
            r5 = 3
            if (r0 != r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            r4.f58 = r1
            return r3
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.f74 = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.f61
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.f61 = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.f73
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.f73 = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f57 = r1
            r0.m25()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f56 = r1
            r0.m25()
            defpackage.AbstractC0858.m1812(r0, r1)
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.f59
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.f59 = r2
            return
    }

    @Override // android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            r0.m22(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m22(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L10
            ᲇᲇᛱᛳ r0 = r1.f55
            if (r0 == 0) goto Ld
            r0.m3556()
        Ld:
            super.setVisibility(r2)
        L10:
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C2136 m23(long r4, int r6) {
            r3 = this;
            ᲇᲇᛱᛳ r0 = r3.f55
            if (r0 == 0) goto L7
            r0.m3556()
        L7:
            ᛷᛸᛵᲇ r0 = r3.f67
            r1 = 0
            if (r6 != 0) goto L2b
            int r2 = r3.getVisibility()
            if (r2 == 0) goto L15
            r3.setAlpha(r1)
        L15:
            ᲇᲇᛱᛳ r3 = defpackage.AbstractC0858.m1815(r3)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.m3555(r1)
            r3.m3554(r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r0.f5904
            r4.f55 = r3
            r0.f5906 = r6
            r3.m3553(r0)
            return r3
        L2b:
            ᲇᲇᛱᛳ r3 = defpackage.AbstractC0858.m1815(r3)
            r3.m3555(r1)
            r3.m3554(r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r0.f5904
            r4.f55 = r3
            r0.f5906 = r6
            r3.m3553(r0)
            return r3
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m24() {
            r1 = this;
            r1.removeAllViews()
            r0 = 0
            r1.f61 = r0
            r1.f63 = r0
            r1.f72 = r0
            android.view.View r1 = r1.f69
            if (r1 == 0) goto L11
            r1.setOnClickListener(r0)
        L11:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m25() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.f73
            if (r0 != 0) goto L51
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 1712062464(0x660c0000, float:1.6528283E23)
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.f73 = r0
            r1 = 1711865911(0x66090037, float:1.6174204E23)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f70 = r0
            android.widget.LinearLayout r0 = r6.f73
            r1 = 1711865910(0x66090036, float:1.6174202E23)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f71 = r0
            int r0 = r6.f62
            if (r0 == 0) goto L44
            android.widget.TextView r1 = r6.f70
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L44:
            int r0 = r6.f60
            if (r0 == 0) goto L51
            android.widget.TextView r1 = r6.f71
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L51:
            android.widget.TextView r0 = r6.f70
            java.lang.CharSequence r1 = r6.f56
            r0.setText(r1)
            android.widget.TextView r0 = r6.f71
            java.lang.CharSequence r1 = r6.f57
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.f56
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.CharSequence r1 = r6.f57
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            android.widget.TextView r2 = r6.f71
            r3 = 8
            r4 = 0
            if (r1 != 0) goto L74
            r5 = r4
            goto L75
        L74:
            r5 = r3
        L75:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.f73
            if (r0 == 0) goto L7e
            if (r1 != 0) goto L7f
        L7e:
            r3 = r4
        L7f:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.f73
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L8f
            android.widget.LinearLayout r0 = r6.f73
            r6.addView(r0)
        L8f:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m26(defpackage.AbstractC1115 r6) {
            r5 = this;
            android.view.View r0 = r5.f64
            r1 = 0
            if (r0 != 0) goto L19
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.f66
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.f64 = r0
            r5.addView(r0)
            goto L24
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L24
            android.view.View r0 = r5.f64
            r5.addView(r0)
        L24:
            android.view.View r0 = r5.f64
            r2 = 1711865920(0x66090040, float:1.617422E23)
            android.view.View r0 = r0.findViewById(r2)
            r5.f69 = r0
            ᛲᛶᛷᛲ r2 = new ᛲᛶᛷᛲ
            r2.<init>(r1, r6)
            r0.setOnClickListener(r2)
            ᲀᛷᛱᲇ r6 = r6.mo2070()
            ᲁᲀᛴᛷ r0 = r5.f72
            if (r0 == 0) goto L51
            r0.m3340()
            ᛲᲈᛸᛲ r0 = r0.f8293
            if (r0 == 0) goto L51
            boolean r2 = r0.m3339()
            if (r2 == 0) goto L51
            ᛶᲇᲀᛵ r0 = r0.f8273
            r0.dismiss()
        L51:
            ᲁᲀᛴᛷ r0 = new ᲁᲀᛴᛷ
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f72 = r0
            r2 = 1
            r0.f8296 = r2
            r0.f8288 = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            ᲁᲀᛴᛷ r2 = r5.f72
            android.content.Context r3 = r5.f65
            r6.m3087(r2, r3)
            ᲁᲀᛴᛷ r6 = r5.f72
            ᲇᲁᛸᲈ r2 = r6.f8295
            if (r2 != 0) goto L89
            android.view.LayoutInflater r3 = r6.f8301
            int r4 = r6.f8282
            android.view.View r1 = r3.inflate(r4, r5, r1)
            ᲇᲁᛸᲈ r1 = (defpackage.InterfaceC2132) r1
            r6.f8295 = r1
            ᲀᛷᛱᲇ r3 = r6.f8290
            r1.mo17(r3)
            r6.mo855()
        L89:
            ᲇᲁᛸᲈ r1 = r6.f8295
            if (r2 == r1) goto L93
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L93:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f63 = r1
            java.util.WeakHashMap r6 = defpackage.AbstractC0858.f3911
            r6 = 0
            r1.setBackground(r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f63
            r5.addView(r6, r0)
            return
    }
}
