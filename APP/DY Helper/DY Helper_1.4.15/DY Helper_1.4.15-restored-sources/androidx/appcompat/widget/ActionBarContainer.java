package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ε */
    public boolean f464;

    /* JADX INFO: renamed from: ζ */
    public androidx.appcompat.widget.ScrollingTabContainerView f465;

    /* JADX INFO: renamed from: η */
    public android.view.View f466;

    /* JADX INFO: renamed from: θ */
    public android.view.View f467;

    /* JADX INFO: renamed from: ι */
    public android.graphics.drawable.Drawable f468;

    /* JADX INFO: renamed from: κ */
    public android.graphics.drawable.Drawable f469;

    /* JADX INFO: renamed from: λ */
    public android.graphics.drawable.Drawable f470;

    /* JADX INFO: renamed from: μ */
    public final boolean f471;

    /* JADX INFO: renamed from: ν */
    public boolean f472;

    /* JADX INFO: renamed from: ξ */
    public final int f473;

    public ActionBarContainer(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContainer(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            ｇ r0 = new ｇ
            r0.<init>(r3)
            r3.setBackground(r0)
            int[] r0 = p000.kk1.f5967
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            r5 = 0
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r5)
            r3.f468 = r0
            r0 = 2
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r3.f469 = r0
            r0 = 13
            r1 = -1
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.f473 = r0
            int r0 = r3.getId()
            r1 = 2131296965(0x7f0902c5, float:1.8211862E38)
            r2 = 1
            if (r0 != r1) goto L3a
            r3.f471 = r2
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r2)
            r3.f470 = r0
        L3a:
            r4.recycle()
            boolean r4 = r3.f471
            if (r4 == 0) goto L47
            android.graphics.drawable.Drawable r4 = r3.f470
            if (r4 != 0) goto L50
        L45:
            r5 = r2
            goto L50
        L47:
            android.graphics.drawable.Drawable r4 = r3.f468
            if (r4 != 0) goto L50
            android.graphics.drawable.Drawable r4 = r3.f469
            if (r4 != 0) goto L50
            goto L45
        L50:
            r3.setWillNotDraw(r5)
            return
    }

    /* JADX INFO: renamed from: α */
    public static int m243(android.view.View r2) {
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r2 = r2.getMeasuredHeight()
            int r1 = r0.topMargin
            int r2 = r2 + r1
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f468
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.f468
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            android.graphics.drawable.Drawable r0 = r2.f469
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r2.f469
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L29:
            android.graphics.drawable.Drawable r0 = r2.f470
            if (r0 == 0) goto L3c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r0 = r2.f470
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L3c:
            return
    }

    public android.view.View getTabContainer() {
            r0 = this;
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r0.f465
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f468
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.f469
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.graphics.drawable.Drawable r1 = r1.f470
            if (r1 == 0) goto L18
            r1.jumpToCurrentState()
        L18:
            return
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            r0 = 2131296295(0x7f090027, float:1.8210503E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.f466 = r0
            r0 = 2131296303(0x7f09002f, float:1.8210519E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.f467 = r0
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onHoverEvent(r1)
            r0 = 1
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.f464
            if (r0 != 0) goto Ld
            boolean r1 = super.onInterceptTouchEvent(r2)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            androidx.appcompat.widget.ScrollingTabContainerView r5 = r4.f465
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f471
            if (r6 == 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f470
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lbe
        L48:
            r9 = r0
            goto Lbe
        L4b:
            android.graphics.drawable.Drawable r6 = r4.f468
            if (r6 == 0) goto La3
            android.view.View r6 = r4.f466
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L75
            android.graphics.drawable.Drawable r6 = r4.f468
            android.view.View r7 = r4.f466
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f466
            int r8 = r8.getTop()
            android.view.View r0 = r4.f466
            int r0 = r0.getRight()
            android.view.View r2 = r4.f466
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L75:
            android.view.View r6 = r4.f467
            if (r6 == 0) goto L9d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L9d
            android.graphics.drawable.Drawable r6 = r4.f468
            android.view.View r7 = r4.f467
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f467
            int r8 = r8.getTop()
            android.view.View r0 = r4.f467
            int r0 = r0.getRight()
            android.view.View r2 = r4.f467
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L9d:
            android.graphics.drawable.Drawable r6 = r4.f468
            r6.setBounds(r0, r0, r0, r0)
        La2:
            r0 = r9
        La3:
            r4.f472 = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f469
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lbe:
            if (r9 == 0) goto Lc3
            r4.invalidate()
        Lc3:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            android.view.View r0 = r4.f466
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != r1) goto L1c
            int r0 = r4.f473
            if (r0 < 0) goto L1c
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)
        L1c:
            super.onMeasure(r5, r6)
            android.view.View r5 = r4.f466
            if (r5 != 0) goto L24
            goto L85
        L24:
            int r5 = android.view.View.MeasureSpec.getMode(r6)
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r4.f465
            if (r0 == 0) goto L85
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L85
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == r0) goto L85
            android.view.View r0 = r4.f466
            if (r0 == 0) goto L50
            int r3 = r0.getVisibility()
            if (r3 == r2) goto L50
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L49
            goto L50
        L49:
            android.view.View r0 = r4.f466
            int r0 = m243(r0)
            goto L69
        L50:
            android.view.View r0 = r4.f467
            if (r0 == 0) goto L68
            int r3 = r0.getVisibility()
            if (r3 == r2) goto L68
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L61
            goto L68
        L61:
            android.view.View r0 = r4.f467
            int r0 = m243(r0)
            goto L69
        L68:
            r0 = 0
        L69:
            if (r5 != r1) goto L70
            int r5 = android.view.View.MeasureSpec.getSize(r6)
            goto L73
        L70:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L73:
            int r6 = r4.getMeasuredWidth()
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r4.f465
            int r1 = m243(r1)
            int r1 = r1 + r0
            int r5 = java.lang.Math.min(r1, r5)
            r4.setMeasuredDimension(r6, r5)
        L85:
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onTouchEvent(r1)
            r0 = 1
            return r0
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f468
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f468
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f468 = r5
            if (r5 == 0) goto L33
            r5.setCallback(r4)
            android.view.View r5 = r4.f466
            if (r5 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.f468
            int r5 = r5.getLeft()
            android.view.View r1 = r4.f466
            int r1 = r1.getTop()
            android.view.View r2 = r4.f466
            int r2 = r2.getRight()
            android.view.View r3 = r4.f466
            int r3 = r3.getBottom()
            r0.setBounds(r5, r1, r2, r3)
        L33:
            boolean r5 = r4.f471
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L3f
            android.graphics.drawable.Drawable r5 = r4.f470
            if (r5 != 0) goto L48
        L3d:
            r0 = r1
            goto L48
        L3f:
            android.graphics.drawable.Drawable r5 = r4.f468
            if (r5 != 0) goto L48
            android.graphics.drawable.Drawable r5 = r4.f469
            if (r5 != 0) goto L48
            goto L3d
        L48:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            r4.invalidateOutline()
            return
    }

    public void setSplitBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f470
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f470
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f470 = r5
            boolean r0 = r4.f471
            r1 = 0
            if (r5 == 0) goto L28
            r5.setCallback(r4)
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r5 = r4.f470
            if (r5 == 0) goto L28
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getMeasuredHeight()
            r5.setBounds(r1, r1, r2, r3)
        L28:
            r5 = 1
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r4.f470
            if (r0 != 0) goto L3a
        L2f:
            r1 = r5
            goto L3a
        L31:
            android.graphics.drawable.Drawable r0 = r4.f468
            if (r0 != 0) goto L3a
            android.graphics.drawable.Drawable r0 = r4.f469
            if (r0 != 0) goto L3a
            goto L2f
        L3a:
            r4.setWillNotDraw(r1)
            r4.invalidate()
            r4.invalidateOutline()
            return
    }

    public void setStackedBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f469
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f469
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f469 = r5
            if (r5 == 0) goto L37
            r5.setCallback(r4)
            boolean r5 = r4.f472
            if (r5 == 0) goto L37
            android.graphics.drawable.Drawable r5 = r4.f469
            if (r5 == 0) goto L37
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r4.f465
            int r0 = r0.getLeft()
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r4.f465
            int r1 = r1.getTop()
            androidx.appcompat.widget.ScrollingTabContainerView r2 = r4.f465
            int r2 = r2.getRight()
            androidx.appcompat.widget.ScrollingTabContainerView r3 = r4.f465
            int r3 = r3.getBottom()
            r5.setBounds(r0, r1, r2, r3)
        L37:
            boolean r5 = r4.f471
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L43
            android.graphics.drawable.Drawable r5 = r4.f470
            if (r5 != 0) goto L4c
        L41:
            r0 = r1
            goto L4c
        L43:
            android.graphics.drawable.Drawable r5 = r4.f468
            if (r5 != 0) goto L4c
            android.graphics.drawable.Drawable r5 = r4.f469
            if (r5 != 0) goto L4c
            goto L41
        L4c:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            r4.invalidateOutline()
            return
    }

    public void setTabContainer(androidx.appcompat.widget.ScrollingTabContainerView r2) {
            r1 = this;
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.f465
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.f465 = r2
            if (r2 == 0) goto L1c
            r1.addView(r2)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -1
            r1.width = r0
            r0 = -2
            r1.height = r0
            r1 = 0
            r2.setAllowCollapse(r1)
        L1c:
            return
    }

    public void setTransitioning(boolean r1) {
            r0 = this;
            r0.f464 = r1
            if (r1 == 0) goto L7
            r1 = 393216(0x60000, float:5.51013E-40)
            goto L9
        L7:
            r1 = 262144(0x40000, float:3.67342E-40)
        L9:
            r0.setDescendantFocusability(r1)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = r0
        L9:
            android.graphics.drawable.Drawable r1 = r2.f468
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            android.graphics.drawable.Drawable r1 = r2.f469
            if (r1 == 0) goto L17
            r1.setVisible(r3, r0)
        L17:
            android.graphics.drawable.Drawable r2 = r2.f470
            if (r2 == 0) goto L1e
            r2.setVisible(r3, r0)
        L1e:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2, int r3) {
            r0 = this;
            if (r3 == 0) goto L7
            android.view.ActionMode r0 = super.startActionModeForChild(r1, r2, r3)
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f468
            boolean r1 = r2.f471
            if (r3 != r0) goto L8
            if (r1 == 0) goto L1c
        L8:
            android.graphics.drawable.Drawable r0 = r2.f469
            if (r3 != r0) goto L10
            boolean r0 = r2.f472
            if (r0 != 0) goto L1c
        L10:
            android.graphics.drawable.Drawable r0 = r2.f470
            if (r3 != r0) goto L16
            if (r1 != 0) goto L1c
        L16:
            boolean r2 = super.verifyDrawable(r3)
            if (r2 == 0) goto L1e
        L1c:
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }
}
