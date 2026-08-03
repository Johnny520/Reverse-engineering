package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f830a;
    public androidx.appcompat.widget.c b;
    public android.view.View c;
    public android.view.View d;
    public android.graphics.drawable.Drawable e;
    public android.graphics.drawable.Drawable f;
    public android.graphics.drawable.Drawable g;
    public final boolean h;
    public boolean i;
    public final int j;

    public ActionBarContainer(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            a.M r0 = new a.M
            r0.<init>(r2)
            r2.setBackground(r0)
            int[] r0 = androidx.appcompat.R.styleable.ActionBar
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            int r4 = androidx.appcompat.R.styleable.ActionBar_background
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.e = r4
            int r4 = androidx.appcompat.R.styleable.ActionBar_backgroundStacked
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.f = r4
            int r4 = androidx.appcompat.R.styleable.ActionBar_height
            r0 = -1
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.j = r4
            int r4 = r2.getId()
            int r0 = androidx.appcompat.R.id.split_action_bar
            r1 = 1
            if (r4 != r0) goto L3d
            r2.h = r1
            int r4 = androidx.appcompat.R.styleable.ActionBar_backgroundSplit
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.g = r4
        L3d:
            r3.recycle()
            boolean r3 = r2.h
            r4 = 0
            if (r3 == 0) goto L4c
            android.graphics.drawable.Drawable r3 = r2.g
            if (r3 != 0) goto L4a
            goto L54
        L4a:
            r1 = r4
            goto L54
        L4c:
            android.graphics.drawable.Drawable r3 = r2.e
            if (r3 != 0) goto L4a
            android.graphics.drawable.Drawable r3 = r2.f
            if (r3 != 0) goto L4a
        L54:
            r2.setWillNotDraw(r1)
            return
    }

    public static int a(android.view.View r2) {
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
            android.graphics.drawable.Drawable r0 = r2.e
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.e
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            android.graphics.drawable.Drawable r0 = r2.f
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r2.f
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L29:
            android.graphics.drawable.Drawable r0 = r2.g
            if (r0 == 0) goto L3c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r0 = r2.g
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3c:
            return
    }

    public android.view.View getTabContainer() {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.b
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.e
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.f
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.graphics.drawable.Drawable r0 = r1.g
            if (r0 == 0) goto L18
            r0.jumpToCurrentState()
        L18:
            return
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = androidx.appcompat.R.id.action_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.c = r0
            int r0 = androidx.appcompat.R.id.action_context_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.d = r0
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onHoverEvent(r1)
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.f830a
            if (r0 != 0) goto Ld
            boolean r2 = super.onInterceptTouchEvent(r2)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r6 = r5
            androidx.appcompat.widget.c r8 = r6.b
            r10 = 8
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            int r2 = r8.getVisibility()
            if (r2 == r10) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r8 == 0) goto L34
            int r3 = r8.getVisibility()
            if (r3 == r10) goto L34
            int r10 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r8.getMeasuredHeight()
            int r4 = r10 - r4
            int r3 = r3.bottomMargin
            int r4 = r4 - r3
            int r10 = r10 - r3
            r8.layout(r7, r4, r9, r10)
        L34:
            boolean r7 = r6.h
            if (r7 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = r6.g
            if (r7 == 0) goto L49
            int r8 = r5.getMeasuredWidth()
            int r9 = r5.getMeasuredHeight()
            r7.setBounds(r1, r1, r8, r9)
            goto Lbf
        L49:
            r0 = r1
            goto Lbf
        L4c:
            android.graphics.drawable.Drawable r7 = r6.e
            if (r7 == 0) goto La4
            android.view.View r7 = r6.c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L76
            android.graphics.drawable.Drawable r7 = r6.e
            android.view.View r9 = r6.c
            int r9 = r9.getLeft()
            android.view.View r10 = r6.c
            int r10 = r10.getTop()
            android.view.View r1 = r6.c
            int r1 = r1.getRight()
            android.view.View r3 = r6.c
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L76:
            android.view.View r7 = r6.d
            if (r7 == 0) goto L9e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9e
            android.graphics.drawable.Drawable r7 = r6.e
            android.view.View r9 = r6.d
            int r9 = r9.getLeft()
            android.view.View r10 = r6.d
            int r10 = r10.getTop()
            android.view.View r1 = r6.d
            int r1 = r1.getRight()
            android.view.View r3 = r6.d
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L9e:
            android.graphics.drawable.Drawable r7 = r6.e
            r7.setBounds(r1, r1, r1, r1)
        La3:
            r1 = r0
        La4:
            r6.i = r2
            if (r2 == 0) goto L49
            android.graphics.drawable.Drawable r7 = r6.f
            if (r7 == 0) goto L49
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r1 = r8.getRight()
            int r8 = r8.getBottom()
            r7.setBounds(r9, r10, r1, r8)
        Lbf:
            if (r0 == 0) goto Lc4
            r5.invalidate()
        Lc4:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            android.view.View r0 = r4.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != r1) goto L1c
            int r0 = r4.j
            if (r0 < 0) goto L1c
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)
        L1c:
            super.onMeasure(r5, r6)
            android.view.View r5 = r4.c
            if (r5 != 0) goto L24
            goto L85
        L24:
            int r5 = android.view.View.MeasureSpec.getMode(r6)
            androidx.appcompat.widget.c r0 = r4.b
            if (r0 == 0) goto L85
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L85
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == r0) goto L85
            android.view.View r0 = r4.c
            if (r0 == 0) goto L50
            int r3 = r0.getVisibility()
            if (r3 == r2) goto L50
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L49
            goto L50
        L49:
            android.view.View r0 = r4.c
            int r0 = a(r0)
            goto L69
        L50:
            android.view.View r0 = r4.d
            if (r0 == 0) goto L68
            int r3 = r0.getVisibility()
            if (r3 == r2) goto L68
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L61
            goto L68
        L61:
            android.view.View r0 = r4.d
            int r0 = a(r0)
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
            androidx.appcompat.widget.c r1 = r4.b
            int r1 = a(r1)
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
            r1 = 1
            return r1
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.e
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.e
            r4.unscheduleDrawable(r0)
        Ld:
            r4.e = r5
            if (r5 == 0) goto L33
            r5.setCallback(r4)
            android.view.View r5 = r4.c
            if (r5 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.e
            int r5 = r5.getLeft()
            android.view.View r1 = r4.c
            int r1 = r1.getTop()
            android.view.View r2 = r4.c
            int r2 = r2.getRight()
            android.view.View r3 = r4.c
            int r3 = r3.getBottom()
            r0.setBounds(r5, r1, r2, r3)
        L33:
            boolean r5 = r4.h
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L3f
            android.graphics.drawable.Drawable r5 = r4.g
            if (r5 != 0) goto L48
        L3d:
            r0 = r1
            goto L48
        L3f:
            android.graphics.drawable.Drawable r5 = r4.e
            if (r5 != 0) goto L48
            android.graphics.drawable.Drawable r5 = r4.f
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
            android.graphics.drawable.Drawable r0 = r4.g
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.g
            r4.unscheduleDrawable(r0)
        Ld:
            r4.g = r5
            boolean r0 = r4.h
            r1 = 0
            if (r5 == 0) goto L28
            r5.setCallback(r4)
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r5 = r4.g
            if (r5 == 0) goto L28
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getMeasuredHeight()
            r5.setBounds(r1, r1, r2, r3)
        L28:
            r5 = 1
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r4.g
            if (r0 != 0) goto L3a
        L2f:
            r1 = r5
            goto L3a
        L31:
            android.graphics.drawable.Drawable r0 = r4.e
            if (r0 != 0) goto L3a
            android.graphics.drawable.Drawable r0 = r4.f
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
            android.graphics.drawable.Drawable r0 = r4.f
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f = r5
            if (r5 == 0) goto L37
            r5.setCallback(r4)
            boolean r5 = r4.i
            if (r5 == 0) goto L37
            android.graphics.drawable.Drawable r5 = r4.f
            if (r5 == 0) goto L37
            androidx.appcompat.widget.c r0 = r4.b
            int r0 = r0.getLeft()
            androidx.appcompat.widget.c r1 = r4.b
            int r1 = r1.getTop()
            androidx.appcompat.widget.c r2 = r4.b
            int r2 = r2.getRight()
            androidx.appcompat.widget.c r3 = r4.b
            int r3 = r3.getBottom()
            r5.setBounds(r0, r1, r2, r3)
        L37:
            boolean r5 = r4.h
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L43
            android.graphics.drawable.Drawable r5 = r4.g
            if (r5 != 0) goto L4c
        L41:
            r0 = r1
            goto L4c
        L43:
            android.graphics.drawable.Drawable r5 = r4.e
            if (r5 != 0) goto L4c
            android.graphics.drawable.Drawable r5 = r4.f
            if (r5 != 0) goto L4c
            goto L41
        L4c:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            r4.invalidateOutline()
            return
    }

    public void setTabContainer(androidx.appcompat.widget.c r3) {
            r2 = this;
            androidx.appcompat.widget.c r0 = r2.b
            if (r0 == 0) goto L7
            r2.removeView(r0)
        L7:
            r2.b = r3
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
            r0.f830a = r1
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
            android.graphics.drawable.Drawable r1 = r2.e
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            android.graphics.drawable.Drawable r1 = r2.f
            if (r1 == 0) goto L17
            r1.setVisible(r3, r0)
        L17:
            android.graphics.drawable.Drawable r1 = r2.g
            if (r1 == 0) goto L1e
            r1.setVisible(r3, r0)
        L1e:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2, int r3) {
            r0 = this;
            if (r3 == 0) goto L7
            android.view.ActionMode r1 = super.startActionModeForChild(r1, r2, r3)
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.e
            boolean r1 = r2.h
            if (r3 != r0) goto L8
            if (r1 == 0) goto L1c
        L8:
            android.graphics.drawable.Drawable r0 = r2.f
            if (r3 != r0) goto L10
            boolean r0 = r2.i
            if (r0 != 0) goto L1c
        L10:
            android.graphics.drawable.Drawable r0 = r2.g
            if (r3 != r0) goto L16
            if (r1 != 0) goto L1c
        L16:
            boolean r3 = super.verifyDrawable(r3)
            if (r3 == 0) goto L1e
        L1c:
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }
}
