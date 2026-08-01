package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f46;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final int f47;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean f48;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.view.View f49;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.view.View f50;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f51;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f52;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f53;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f54;

    public ActionBarContainer(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContainer(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            ᛲᛵᲁᛲ r0 = new ᛲᛵᲁᛲ
            r0.<init>(r3)
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            r3.setBackground(r0)
            int[] r0 = defpackage.AbstractC1070.f4792
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            r5 = 0
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r5)
            r3.f53 = r0
            r0 = 2
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r3.f54 = r0
            r0 = 13
            r1 = -1
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.f47 = r0
            int r0 = r3.getId()
            r1 = 1711866813(0x660903bd, float:1.617583E23)
            r2 = 1
            if (r0 != r1) goto L3c
            r3.f48 = r2
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r2)
            r3.f46 = r0
        L3c:
            r4.recycle()
            boolean r4 = r3.f48
            if (r4 == 0) goto L49
            android.graphics.drawable.Drawable r4 = r3.f46
            if (r4 != 0) goto L52
        L47:
            r5 = r2
            goto L52
        L49:
            android.graphics.drawable.Drawable r4 = r3.f53
            if (r4 != 0) goto L52
            android.graphics.drawable.Drawable r4 = r3.f54
            if (r4 != 0) goto L52
            goto L47
        L52:
            r3.setWillNotDraw(r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f53
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.f53
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            android.graphics.drawable.Drawable r0 = r2.f54
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r2.f54
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L29:
            android.graphics.drawable.Drawable r0 = r2.f46
            if (r0 == 0) goto L3c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r0 = r2.f46
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L3c:
            return
    }

    public android.view.View getTabContainer() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f53
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.f54
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.graphics.drawable.Drawable r1 = r1.f46
            if (r1 == 0) goto L18
            r1.jumpToCurrentState()
        L18:
            return
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            r0 = 1711865905(0x66090031, float:1.6174193E23)
            android.view.View r0 = r1.findViewById(r0)
            r1.f50 = r0
            r0 = 1711865913(0x66090039, float:1.6174208E23)
            android.view.View r0 = r1.findViewById(r0)
            r1.f49 = r0
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
            boolean r0 = r1.f51
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
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            boolean r3 = r2.f48
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1b
            android.graphics.drawable.Drawable r3 = r2.f46
            if (r3 == 0) goto L19
            int r6 = r2.getMeasuredWidth()
            int r7 = r2.getMeasuredHeight()
            r3.setBounds(r5, r5, r6, r7)
            goto L76
        L19:
            r4 = r5
            goto L76
        L1b:
            android.graphics.drawable.Drawable r3 = r2.f53
            if (r3 == 0) goto L73
            android.view.View r3 = r2.f50
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L45
            android.graphics.drawable.Drawable r3 = r2.f53
            android.view.View r6 = r2.f50
            int r6 = r6.getLeft()
            android.view.View r7 = r2.f50
            int r7 = r7.getTop()
            android.view.View r0 = r2.f50
            int r0 = r0.getRight()
            android.view.View r1 = r2.f50
            int r1 = r1.getBottom()
            r3.setBounds(r6, r7, r0, r1)
            goto L74
        L45:
            android.view.View r3 = r2.f49
            if (r3 == 0) goto L6d
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L6d
            android.graphics.drawable.Drawable r3 = r2.f53
            android.view.View r6 = r2.f49
            int r6 = r6.getLeft()
            android.view.View r7 = r2.f49
            int r7 = r7.getTop()
            android.view.View r0 = r2.f49
            int r0 = r0.getRight()
            android.view.View r1 = r2.f49
            int r1 = r1.getBottom()
            r3.setBounds(r6, r7, r0, r1)
            goto L74
        L6d:
            android.graphics.drawable.Drawable r3 = r2.f53
            r3.setBounds(r5, r5, r5, r5)
            goto L74
        L73:
            r4 = r5
        L74:
            r2.f52 = r5
        L76:
            if (r4 == 0) goto L7b
            r2.invalidate()
        L7b:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            android.view.View r0 = r2.f50
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L1c
            int r0 = r2.f47
            if (r0 < 0) goto L1c
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L1c:
            super.onMeasure(r3, r4)
            android.view.View r2 = r2.f50
            if (r2 != 0) goto L24
            return
        L24:
            android.view.View.MeasureSpec.getMode(r4)
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
            android.graphics.drawable.Drawable r0 = r4.f53
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f53
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f53 = r5
            if (r5 == 0) goto L33
            r5.setCallback(r4)
            android.view.View r5 = r4.f50
            if (r5 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.f53
            int r5 = r5.getLeft()
            android.view.View r1 = r4.f50
            int r1 = r1.getTop()
            android.view.View r2 = r4.f50
            int r2 = r2.getRight()
            android.view.View r3 = r4.f50
            int r3 = r3.getBottom()
            r0.setBounds(r5, r1, r2, r3)
        L33:
            boolean r5 = r4.f48
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L3f
            android.graphics.drawable.Drawable r5 = r4.f46
            if (r5 != 0) goto L48
        L3d:
            r0 = r1
            goto L48
        L3f:
            android.graphics.drawable.Drawable r5 = r4.f53
            if (r5 != 0) goto L48
            android.graphics.drawable.Drawable r5 = r4.f54
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
            android.graphics.drawable.Drawable r0 = r4.f46
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f46
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f46 = r5
            boolean r0 = r4.f48
            r1 = 0
            if (r5 == 0) goto L28
            r5.setCallback(r4)
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r5 = r4.f46
            if (r5 == 0) goto L28
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getMeasuredHeight()
            r5.setBounds(r1, r1, r2, r3)
        L28:
            r5 = 1
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r4.f46
            if (r0 != 0) goto L3a
        L2f:
            r1 = r5
            goto L3a
        L31:
            android.graphics.drawable.Drawable r0 = r4.f53
            if (r0 != 0) goto L3a
            android.graphics.drawable.Drawable r0 = r4.f54
            if (r0 != 0) goto L3a
            goto L2f
        L3a:
            r4.setWillNotDraw(r1)
            r4.invalidate()
            r4.invalidateOutline()
            return
    }

    public void setStackedBackground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f54
            r1 = 0
            if (r0 == 0) goto Ld
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r2.f54
            r2.unscheduleDrawable(r0)
        Ld:
            r2.f54 = r3
            if (r3 == 0) goto L1e
            r3.setCallback(r2)
            boolean r3 = r2.f52
            if (r3 == 0) goto L1e
            android.graphics.drawable.Drawable r3 = r2.f54
            if (r3 != 0) goto L1d
            goto L1e
        L1d:
            throw r1
        L1e:
            boolean r3 = r2.f48
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L2a
            android.graphics.drawable.Drawable r3 = r2.f46
            if (r3 != 0) goto L33
        L28:
            r0 = r1
            goto L33
        L2a:
            android.graphics.drawable.Drawable r3 = r2.f53
            if (r3 != 0) goto L33
            android.graphics.drawable.Drawable r3 = r2.f54
            if (r3 != 0) goto L33
            goto L28
        L33:
            r2.setWillNotDraw(r0)
            r2.invalidate()
            r2.invalidateOutline()
            return
    }

    public void setTabContainer(defpackage.AbstractC1887 r1) {
            r0 = this;
            return
    }

    public void setTransitioning(boolean r1) {
            r0 = this;
            r0.f51 = r1
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
            android.graphics.drawable.Drawable r1 = r2.f53
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            android.graphics.drawable.Drawable r1 = r2.f54
            if (r1 == 0) goto L17
            r1.setVisible(r3, r0)
        L17:
            android.graphics.drawable.Drawable r2 = r2.f46
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
            android.graphics.drawable.Drawable r0 = r2.f53
            boolean r1 = r2.f48
            if (r3 != r0) goto L8
            if (r1 == 0) goto L1c
        L8:
            android.graphics.drawable.Drawable r0 = r2.f54
            if (r3 != r0) goto L10
            boolean r0 = r2.f52
            if (r0 != 0) goto L1c
        L10:
            android.graphics.drawable.Drawable r0 = r2.f46
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
