package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {
    private android.view.View.OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private java.util.ArrayList<android.view.View> mDisappearingFragmentChildren;
    private boolean mDrawDisappearingViewsFirst;
    private java.util.ArrayList<android.view.View> mTransitioningFragmentViews;

    public FragmentContainerView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1
            r1.mDrawDisappearingViewsFirst = r0
            return
    }

    public FragmentContainerView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public FragmentContainerView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r0 = 1
            r6.mDrawDisappearingViewsFirst = r0
            if (r8 == 0) goto L53
            java.lang.String r0 = r8.getClassAttribute()
            java.lang.String r1 = "class"
            int[] r2 = androidx.fragment.C0240R.styleable.FragmentContainerView
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r8, r2)
            if (r0 != 0) goto L1e
            int r3 = androidx.fragment.C0240R.styleable.FragmentContainerView_android_name
            java.lang.String r0 = r2.getString(r3)
            java.lang.String r1 = "android:name"
        L1e:
            r2.recycle()
            if (r0 == 0) goto L53
            boolean r3 = r6.isInEditMode()
            if (r3 == 0) goto L2a
            goto L53
        L2a:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "FragmentContainerView must be within a FragmentActivity to use "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = "=\""
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = "\""
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L53:
            return
    }

    FragmentContainerView(android.content.Context r10, android.util.AttributeSet r11, androidx.fragment.app.FragmentManager r12) {
            r9 = this;
            r9.<init>(r10, r11)
            r0 = 1
            r9.mDrawDisappearingViewsFirst = r0
            java.lang.String r1 = r11.getClassAttribute()
            int[] r2 = androidx.fragment.C0240R.styleable.FragmentContainerView
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r2)
            if (r1 != 0) goto L18
            int r3 = androidx.fragment.C0240R.styleable.FragmentContainerView_android_name
            java.lang.String r1 = r2.getString(r3)
        L18:
            int r3 = androidx.fragment.C0240R.styleable.FragmentContainerView_android_tag
            java.lang.String r3 = r2.getString(r3)
            r2.recycle()
            int r4 = r9.getId()
            androidx.fragment.app.Fragment r5 = r12.findFragmentById(r4)
            if (r1 == 0) goto L85
            if (r5 != 0) goto L85
            if (r4 > 0) goto L65
            if (r3 == 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = " with tag "
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L47
        L45:
            java.lang.String r0 = ""
        L47:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "FragmentContainerView must have an android:id to add Fragment "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L65:
            androidx.fragment.app.FragmentFactory r6 = r12.getFragmentFactory()
            java.lang.ClassLoader r7 = r10.getClassLoader()
            androidx.fragment.app.Fragment r6 = r6.instantiate(r7, r1)
            r7 = 0
            r6.onInflate(r10, r11, r7)
            androidx.fragment.app.FragmentTransaction r7 = r12.beginTransaction()
            androidx.fragment.app.FragmentTransaction r0 = r7.setReorderingAllowed(r0)
            androidx.fragment.app.FragmentTransaction r0 = r0.add(r9, r6, r3)
            r0.commitNowAllowingStateLoss()
        L85:
            r12.onContainerAvailable(r9)
            return
    }

    private void addDisappearingFragmentView(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            if (r0 == 0) goto L1c
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1c
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            if (r0 != 0) goto L17
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mDisappearingFragmentChildren = r0
        L17:
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            r0.add(r2)
        L1c:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.getViewFragment(r4)
            if (r0 == 0) goto La
            super.addView(r4, r5, r6)
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not associated with a Fragment."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6, boolean r7) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.getViewFragment(r4)
            if (r0 == 0) goto Lb
            boolean r0 = super.addViewInLayout(r4, r5, r6, r7)
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not associated with a Fragment."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r6) {
            r5 = this;
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r6)
            android.view.View$OnApplyWindowInsetsListener r1 = r5.mApplyWindowInsetsListener
            if (r1 == 0) goto L13
            android.view.View$OnApplyWindowInsetsListener r1 = r5.mApplyWindowInsetsListener
            android.view.WindowInsets r1 = r1.onApplyWindowInsets(r5, r6)
            androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1)
            goto L17
        L13:
            androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.ViewCompat.onApplyWindowInsets(r5, r0)
        L17:
            boolean r2 = r1.isConsumed()
            if (r2 != 0) goto L2f
            int r2 = r5.getChildCount()
            r3 = 0
        L23:
            if (r3 >= r2) goto L2f
            android.view.View r4 = r5.getChildAt(r3)
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r4, r1)
            int r3 = r3 + 1
            goto L23
        L2f:
            return r6
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.mDrawDisappearingViewsFirst
            if (r0 == 0) goto L23
            java.util.ArrayList<android.view.View> r0 = r4.mDisappearingFragmentChildren
            if (r0 == 0) goto L23
            r0 = 0
        L9:
            java.util.ArrayList<android.view.View> r1 = r4.mDisappearingFragmentChildren
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            java.util.ArrayList<android.view.View> r1 = r4.mDisappearingFragmentChildren
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            long r2 = r4.getDrawingTime()
            super.drawChild(r5, r1, r2)
            int r0 = r0 + 1
            goto L9
        L23:
            super.dispatchDraw(r5)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            boolean r0 = r1.mDrawDisappearingViewsFirst
            if (r0 == 0) goto L1a
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            if (r0 == 0) goto L1a
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            int r0 = r0.size()
            if (r0 <= 0) goto L1a
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L1a
            r0 = 0
            return r0
        L1a:
            boolean r0 = super.drawChild(r2, r3, r4)
            return r0
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            if (r0 == 0) goto L18
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            r0.remove(r2)
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            if (r0 == 0) goto L18
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L18
            r0 = 1
            r1.mDrawDisappearingViewsFirst = r0
        L18:
            super.endViewTransition(r2)
            return
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r1) {
            r0 = this;
            return r1
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            android.view.View r1 = r2.getChildAt(r0)
            r2.addDisappearingFragmentView(r1)
            int r0 = r0 + (-1)
            goto L6
        L12:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.addDisappearingFragmentView(r1)
        L5:
            super.removeDetachedView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r1) {
            r0 = this;
            r0.addDisappearingFragmentView(r1)
            super.removeView(r1)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int r2) {
            r1 = this;
            android.view.View r0 = r1.getChildAt(r2)
            r1.addDisappearingFragmentView(r0)
            super.removeViewAt(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View r1) {
            r0 = this;
            r0.addDisappearingFragmentView(r1)
            super.removeViewInLayout(r1)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViews(int r3, int r4) {
            r2 = this;
            r0 = r3
        L1:
            int r1 = r3 + r4
            if (r0 >= r1) goto Lf
            android.view.View r1 = r2.getChildAt(r0)
            r2.addDisappearingFragmentView(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            super.removeViews(r3, r4)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int r3, int r4) {
            r2 = this;
            r0 = r3
        L1:
            int r1 = r3 + r4
            if (r0 >= r1) goto Lf
            android.view.View r1 = r2.getChildAt(r0)
            r2.addDisappearingFragmentView(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            super.removeViewsInLayout(r3, r4)
            return
    }

    void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.mDrawDisappearingViewsFirst = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r1) {
            r0 = this;
            r0.mApplyWindowInsetsListener = r1
            return
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L16
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            if (r0 != 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTransitioningFragmentViews = r0
        L11:
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            r0.add(r2)
        L16:
            super.startViewTransition(r2)
            return
    }
}
