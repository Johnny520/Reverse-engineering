package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {
    public boolean a;
    public android.view.View b;
    public android.view.View c;
    public android.graphics.drawable.Drawable d;
    public android.graphics.drawable.Drawable e;
    public android.graphics.drawable.Drawable f;
    public final boolean g;
    public boolean h;
    public final int i;

    public ActionBarContainer(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            w0 r0 = new w0
            r0.<init>(r3)
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.q(r3, r0)
            int[] r0 = defpackage.xy.a
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            r5 = 0
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r5)
            r3.d = r0
            r0 = 2
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r3.e = r0
            r0 = 13
            r1 = -1
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.i = r0
            int r0 = r3.getId()
            r1 = 2131296622(0x7f09016e, float:1.8211166E38)
            r2 = 1
            if (r0 != r1) goto L3c
            r3.g = r2
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r2)
            r3.f = r0
        L3c:
            r4.recycle()
            boolean r4 = r3.g
            if (r4 == 0) goto L49
            android.graphics.drawable.Drawable r4 = r3.f
            if (r4 != 0) goto L52
        L47:
            r5 = r2
            goto L52
        L49:
            android.graphics.drawable.Drawable r4 = r3.d
            if (r4 != 0) goto L52
            android.graphics.drawable.Drawable r4 = r3.e
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
            android.graphics.drawable.Drawable r0 = r2.d
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.d
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            android.graphics.drawable.Drawable r0 = r2.e
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r2.e
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L29:
            android.graphics.drawable.Drawable r0 = r2.f
            if (r0 == 0) goto L3c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r0 = r2.f
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3c:
            return
    }

    public android.view.View getTabContainer() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.d
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.e
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.graphics.drawable.Drawable r0 = r1.f
            if (r0 == 0) goto L18
            r0.jumpToCurrentState()
        L18:
            return
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            r0 = 2131296304(0x7f090030, float:1.821052E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.b = r0
            r0 = 2131296312(0x7f090038, float:1.8210537E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.c = r0
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
            boolean r0 = r1.a
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
    public final void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            super.onLayout(r4, r5, r6, r7, r8)
            r4 = r3
            boolean r5 = r4.g
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = r4.f
            if (r5 == 0) goto L1a
            int r8 = r3.getMeasuredWidth()
            int r0 = r3.getMeasuredHeight()
            r5.setBounds(r7, r7, r8, r0)
            goto L77
        L1a:
            r6 = r7
            goto L77
        L1c:
            android.graphics.drawable.Drawable r5 = r4.d
            if (r5 == 0) goto L74
            android.view.View r5 = r4.b
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L46
            android.graphics.drawable.Drawable r5 = r4.d
            android.view.View r8 = r4.b
            int r8 = r8.getLeft()
            android.view.View r0 = r4.b
            int r0 = r0.getTop()
            android.view.View r1 = r4.b
            int r1 = r1.getRight()
            android.view.View r2 = r4.b
            int r2 = r2.getBottom()
            r5.setBounds(r8, r0, r1, r2)
            goto L75
        L46:
            android.view.View r5 = r4.c
            if (r5 == 0) goto L6e
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L6e
            android.graphics.drawable.Drawable r5 = r4.d
            android.view.View r8 = r4.c
            int r8 = r8.getLeft()
            android.view.View r0 = r4.c
            int r0 = r0.getTop()
            android.view.View r1 = r4.c
            int r1 = r1.getRight()
            android.view.View r2 = r4.c
            int r2 = r2.getBottom()
            r5.setBounds(r8, r0, r1, r2)
            goto L75
        L6e:
            android.graphics.drawable.Drawable r5 = r4.d
            r5.setBounds(r7, r7, r7, r7)
            goto L75
        L74:
            r6 = r7
        L75:
            r4.h = r7
        L77:
            if (r6 == 0) goto L7c
            r3.invalidate()
        L7c:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            android.view.View r0 = r2.b
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L1c
            int r0 = r2.i
            if (r0 < 0) goto L1c
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L1c:
            super.onMeasure(r3, r4)
            android.view.View r3 = r2.b
            if (r3 != 0) goto L24
            return
        L24:
            android.view.View.MeasureSpec.getMode(r4)
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
            android.graphics.drawable.Drawable r0 = r4.d
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.d
            r4.unscheduleDrawable(r0)
        Ld:
            r4.d = r5
            if (r5 == 0) goto L33
            r5.setCallback(r4)
            android.view.View r5 = r4.b
            if (r5 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.d
            int r5 = r5.getLeft()
            android.view.View r1 = r4.b
            int r1 = r1.getTop()
            android.view.View r2 = r4.b
            int r2 = r2.getRight()
            android.view.View r3 = r4.b
            int r3 = r3.getBottom()
            r0.setBounds(r5, r1, r2, r3)
        L33:
            boolean r5 = r4.g
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L3f
            android.graphics.drawable.Drawable r5 = r4.f
            if (r5 != 0) goto L48
        L3d:
            r0 = r1
            goto L48
        L3f:
            android.graphics.drawable.Drawable r5 = r4.d
            if (r5 != 0) goto L48
            android.graphics.drawable.Drawable r5 = r4.e
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
            android.graphics.drawable.Drawable r0 = r4.f
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f = r5
            boolean r0 = r4.g
            r1 = 0
            if (r5 == 0) goto L28
            r5.setCallback(r4)
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r5 = r4.f
            if (r5 == 0) goto L28
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getMeasuredHeight()
            r5.setBounds(r1, r1, r2, r3)
        L28:
            r5 = 1
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r4.f
            if (r0 != 0) goto L3a
        L2f:
            r1 = r5
            goto L3a
        L31:
            android.graphics.drawable.Drawable r0 = r4.d
            if (r0 != 0) goto L3a
            android.graphics.drawable.Drawable r0 = r4.e
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
            android.graphics.drawable.Drawable r0 = r2.e
            r1 = 0
            if (r0 == 0) goto Ld
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r2.e
            r2.unscheduleDrawable(r0)
        Ld:
            r2.e = r3
            if (r3 == 0) goto L1e
            r3.setCallback(r2)
            boolean r3 = r2.h
            if (r3 == 0) goto L1e
            android.graphics.drawable.Drawable r3 = r2.e
            if (r3 != 0) goto L1d
            goto L1e
        L1d:
            throw r1
        L1e:
            boolean r3 = r2.g
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L2a
            android.graphics.drawable.Drawable r3 = r2.f
            if (r3 != 0) goto L33
        L28:
            r0 = r1
            goto L33
        L2a:
            android.graphics.drawable.Drawable r3 = r2.d
            if (r3 != 0) goto L33
            android.graphics.drawable.Drawable r3 = r2.e
            if (r3 != 0) goto L33
            goto L28
        L33:
            r2.setWillNotDraw(r0)
            r2.invalidate()
            r2.invalidateOutline()
            return
    }

    public void setTabContainer(defpackage.y10 r1) {
            r0 = this;
            return
    }

    public void setTransitioning(boolean r1) {
            r0 = this;
            r0.a = r1
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
            android.graphics.drawable.Drawable r1 = r2.d
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            android.graphics.drawable.Drawable r1 = r2.e
            if (r1 == 0) goto L17
            r1.setVisible(r3, r0)
        L17:
            android.graphics.drawable.Drawable r1 = r2.f
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
            android.graphics.drawable.Drawable r0 = r2.d
            boolean r1 = r2.g
            if (r3 != r0) goto L8
            if (r1 == 0) goto L1c
        L8:
            android.graphics.drawable.Drawable r0 = r2.e
            if (r3 != r0) goto L10
            boolean r0 = r2.h
            if (r0 != 0) goto L1c
        L10:
            android.graphics.drawable.Drawable r0 = r2.f
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
