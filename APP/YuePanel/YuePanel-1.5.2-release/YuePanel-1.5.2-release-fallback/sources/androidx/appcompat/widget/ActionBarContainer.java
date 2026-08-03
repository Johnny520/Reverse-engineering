package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class ActionBarContainer extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f25521;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.view.View f25522;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.view.View f25523;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.view.View f25524;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25525;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25526;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25527;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f25528;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f25529;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f25530;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContainer$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C7360 {
        public C7360() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m28261(androidx.appcompat.widget.ActionBarContainer r0) {
                r0.invalidateOutline()
                return
        }
    }

    public ActionBarContainer(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContainer(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            Yue.ۥ۟۟ۦۧ r0 = new Yue.ۥ۟۟ۦۧ
            r0.<init>(r2)
            r2.setBackground(r0)
            int[] r0 = Yue.C5058.C5071.f17589
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            int r4 = Yue.C5058.C5071.f17590
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.f25525 = r4
            int r4 = Yue.C5058.C5071.f17592
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.f25526 = r4
            int r4 = Yue.C5058.C5071.f17603
            r0 = -1
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.f25530 = r4
            int r4 = r2.getId()
            int r0 = Yue.C5058.C5065.f17158
            r1 = 1
            if (r4 != r0) goto L3d
            r2.f25528 = r1
            int r4 = Yue.C5058.C5071.f17591
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.f25527 = r4
        L3d:
            r3.recycle()
            boolean r3 = r2.f25528
            r4 = 0
            if (r3 == 0) goto L4c
            android.graphics.drawable.Drawable r3 = r2.f25527
            if (r3 != 0) goto L4a
            goto L54
        L4a:
            r1 = r4
            goto L54
        L4c:
            android.graphics.drawable.Drawable r3 = r2.f25525
            if (r3 != 0) goto L4a
            android.graphics.drawable.Drawable r3 = r2.f25526
            if (r3 != 0) goto L4a
        L54:
            r2.setWillNotDraw(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f25525
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.f25525
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            android.graphics.drawable.Drawable r0 = r2.f25526
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r2.f25526
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L29:
            android.graphics.drawable.Drawable r0 = r2.f25527
            if (r0 == 0) goto L3c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r0 = r2.f25527
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3c:
            return
    }

    public android.view.View getTabContainer() {
            r1 = this;
            android.view.View r0 = r1.f25522
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f25525
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.f25526
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.graphics.drawable.Drawable r0 = r1.f25527
            if (r0 == 0) goto L18
            r0.jumpToCurrentState()
        L18:
            return
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = Yue.C5058.C5065.f17097
            android.view.View r0 = r1.findViewById(r0)
            r1.f25523 = r0
            int r0 = Yue.C5058.C5065.f17104
            android.view.View r0 = r1.findViewById(r0)
            r1.f25524 = r0
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onHoverEvent(r1)
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.f25521
            if (r0 != 0) goto Ld
            boolean r2 = super.onInterceptTouchEvent(r2)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f25522
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
            boolean r6 = r4.f25528
            if (r6 == 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f25527
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lbe
        L48:
            r9 = r0
            goto Lbe
        L4b:
            android.graphics.drawable.Drawable r6 = r4.f25525
            if (r6 == 0) goto La3
            android.view.View r6 = r4.f25523
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L75
            android.graphics.drawable.Drawable r6 = r4.f25525
            android.view.View r7 = r4.f25523
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f25523
            int r8 = r8.getTop()
            android.view.View r0 = r4.f25523
            int r0 = r0.getRight()
            android.view.View r2 = r4.f25523
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L75:
            android.view.View r6 = r4.f25524
            if (r6 == 0) goto L9d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L9d
            android.graphics.drawable.Drawable r6 = r4.f25525
            android.view.View r7 = r4.f25524
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f25524
            int r8 = r8.getTop()
            android.view.View r0 = r4.f25524
            int r0 = r0.getRight()
            android.view.View r2 = r4.f25524
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L9d:
            android.graphics.drawable.Drawable r6 = r4.f25525
            r6.setBounds(r0, r0, r0, r0)
        La2:
            r0 = r9
        La3:
            r4.f25529 = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f25526
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
    public void onMeasure(int r4, int r5) {
            r3 = this;
            android.view.View r0 = r3.f25523
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f25530
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f25523
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f25522
            if (r0 == 0) goto L73
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L73
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L73
            android.view.View r0 = r3.f25523
            boolean r0 = r3.m28260(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f25523
            int r0 = r3.m28259(r0)
            goto L57
        L47:
            android.view.View r0 = r3.f25524
            boolean r0 = r3.m28260(r0)
            if (r0 != 0) goto L56
            android.view.View r0 = r3.f25524
            int r0 = r3.m28259(r0)
            goto L57
        L56:
            r0 = 0
        L57:
            if (r4 != r1) goto L5e
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L61
        L5e:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L61:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f25522
            int r1 = r3.m28259(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L73:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onTouchEvent(r1)
            r1 = 1
            return r1
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f25525
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f25525
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f25525 = r5
            if (r5 == 0) goto L33
            r5.setCallback(r4)
            android.view.View r5 = r4.f25523
            if (r5 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.f25525
            int r5 = r5.getLeft()
            android.view.View r1 = r4.f25523
            int r1 = r1.getTop()
            android.view.View r2 = r4.f25523
            int r2 = r2.getRight()
            android.view.View r3 = r4.f25523
            int r3 = r3.getBottom()
            r0.setBounds(r5, r1, r2, r3)
        L33:
            boolean r5 = r4.f25528
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L3f
            android.graphics.drawable.Drawable r5 = r4.f25527
            if (r5 != 0) goto L48
        L3d:
            r0 = r1
            goto L48
        L3f:
            android.graphics.drawable.Drawable r5 = r4.f25525
            if (r5 != 0) goto L48
            android.graphics.drawable.Drawable r5 = r4.f25526
            if (r5 != 0) goto L48
            goto L3d
        L48:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            androidx.appcompat.widget.ActionBarContainer.C7360.m28261(r4)
            return
    }

    public void setSplitBackground(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f25527
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r3.f25527
            r3.unscheduleDrawable(r0)
        Ld:
            r3.f25527 = r4
            r0 = 0
            if (r4 == 0) goto L28
            r4.setCallback(r3)
            boolean r4 = r3.f25528
            if (r4 == 0) goto L28
            android.graphics.drawable.Drawable r4 = r3.f25527
            if (r4 == 0) goto L28
            int r1 = r3.getMeasuredWidth()
            int r2 = r3.getMeasuredHeight()
            r4.setBounds(r0, r0, r1, r2)
        L28:
            boolean r4 = r3.f25528
            r1 = 1
            if (r4 == 0) goto L33
            android.graphics.drawable.Drawable r4 = r3.f25527
            if (r4 != 0) goto L3c
        L31:
            r0 = r1
            goto L3c
        L33:
            android.graphics.drawable.Drawable r4 = r3.f25525
            if (r4 != 0) goto L3c
            android.graphics.drawable.Drawable r4 = r3.f25526
            if (r4 != 0) goto L3c
            goto L31
        L3c:
            r3.setWillNotDraw(r0)
            r3.invalidate()
            androidx.appcompat.widget.ActionBarContainer.C7360.m28261(r3)
            return
    }

    public void setStackedBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f25526
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f25526
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f25526 = r5
            if (r5 == 0) goto L37
            r5.setCallback(r4)
            boolean r5 = r4.f25529
            if (r5 == 0) goto L37
            android.graphics.drawable.Drawable r5 = r4.f25526
            if (r5 == 0) goto L37
            android.view.View r0 = r4.f25522
            int r0 = r0.getLeft()
            android.view.View r1 = r4.f25522
            int r1 = r1.getTop()
            android.view.View r2 = r4.f25522
            int r2 = r2.getRight()
            android.view.View r3 = r4.f25522
            int r3 = r3.getBottom()
            r5.setBounds(r0, r1, r2, r3)
        L37:
            boolean r5 = r4.f25528
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L43
            android.graphics.drawable.Drawable r5 = r4.f25527
            if (r5 != 0) goto L4c
        L41:
            r0 = r1
            goto L4c
        L43:
            android.graphics.drawable.Drawable r5 = r4.f25525
            if (r5 != 0) goto L4c
            android.graphics.drawable.Drawable r5 = r4.f25526
            if (r5 != 0) goto L4c
            goto L41
        L4c:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            androidx.appcompat.widget.ActionBarContainer.C7360.m28261(r4)
            return
    }

    public void setTabContainer(androidx.appcompat.widget.C7435 r3) {
            r2 = this;
            android.view.View r0 = r2.f25522
            if (r0 == 0) goto L7
            r2.removeView(r0)
        L7:
            r2.f25522 = r3
            if (r3 == 0) goto L1c
            r2.addView(r3)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r1 = -1
            r0.width = r1
            r1 = -2
            r0.height = r1
            r0 = 0
            r3.setAllowCollapse(r0)
        L1c:
            return
    }

    public void setTransitioning(boolean r1) {
            r0 = this;
            r0.f25521 = r1
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
            android.graphics.drawable.Drawable r1 = r2.f25525
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            android.graphics.drawable.Drawable r1 = r2.f25526
            if (r1 == 0) goto L17
            r1.setVisible(r3, r0)
        L17:
            android.graphics.drawable.Drawable r1 = r2.f25527
            if (r1 == 0) goto L1e
            r1.setVisible(r3, r0)
        L1e:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2, int r3) {
            r0 = this;
            if (r3 == 0) goto L7
            android.view.ActionMode r1 = super.startActionModeForChild(r1, r2, r3)
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public boolean verifyDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f25525
            if (r2 != r0) goto L8
            boolean r0 = r1.f25528
            if (r0 == 0) goto L1e
        L8:
            android.graphics.drawable.Drawable r0 = r1.f25526
            if (r2 != r0) goto L10
            boolean r0 = r1.f25529
            if (r0 != 0) goto L1e
        L10:
            android.graphics.drawable.Drawable r0 = r1.f25527
            if (r2 != r0) goto L18
            boolean r0 = r1.f25528
            if (r0 != 0) goto L1e
        L18:
            boolean r2 = super.verifyDrawable(r2)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            return r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int m28259(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r3 = r3.getMeasuredHeight()
            int r1 = r0.topMargin
            int r3 = r3 + r1
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m28260(android.view.View r3) {
            r2 = this;
            if (r3 == 0) goto L13
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L13
            int r3 = r3.getMeasuredHeight()
            if (r3 != 0) goto L11
            goto L13
        L11:
            r3 = 0
            goto L14
        L13:
            r3 = 1
        L14:
            return r3
    }
}
