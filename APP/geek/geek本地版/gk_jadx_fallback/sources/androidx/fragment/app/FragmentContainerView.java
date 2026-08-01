package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {
    public java.util.ArrayList a;
    public java.util.ArrayList b;
    public android.view.View.OnApplyWindowInsetsListener c;
    public boolean d;

    public FragmentContainerView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            r1 = 1
            r3.d = r1
            if (r5 == 0) goto L4b
            java.lang.String r1 = r5.getClassAttribute()
            int[] r2 = defpackage.uy.b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2)
            if (r1 != 0) goto L1c
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r5 = "android:name"
            goto L1e
        L1c:
            java.lang.String r5 = "class"
        L1e:
            r4.recycle()
            if (r1 == 0) goto L4b
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L2a
            goto L4b
        L2a:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FragmentContainerView must be within a FragmentActivity to use "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = "=\""
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = "\""
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L4b:
            return
    }

    public final void a(android.view.View r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.b
            if (r0 == 0) goto L1a
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1a
            java.util.ArrayList r0 = r1.a
            if (r0 != 0) goto L15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
        L15:
            java.util.ArrayList r0 = r1.a
            r0.add(r2)
        L1a:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            r0 = 2131296428(0x7f0900ac, float:1.8210772E38)
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof defpackage.ml
            if (r1 == 0) goto Le
            ml r0 = (defpackage.ml) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L15
            super.addView(r3, r4, r5)
            return
        L15:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = " is not associated with a Fragment."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5, boolean r6) {
            r2 = this;
            r0 = 2131296428(0x7f0900ac, float:1.8210772E38)
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof defpackage.ml
            if (r1 == 0) goto Le
            ml r0 = (defpackage.ml) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L16
            boolean r3 = super.addViewInLayout(r3, r4, r5, r6)
            return r3
        L16:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " is not associated with a Fragment."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r7) {
            r6 = this;
            r0 = 0
            wc0 r1 = defpackage.wc0.g(r0, r7)
            android.view.View$OnApplyWindowInsetsListener r2 = r6.c
            if (r2 == 0) goto L12
            android.view.WindowInsets r1 = r2.onApplyWindowInsets(r6, r7)
            wc0 r0 = defpackage.wc0.g(r0, r1)
            goto L29
        L12:
            java.util.WeakHashMap r0 = defpackage.ja0.a
            android.view.WindowInsets r0 = r1.f()
            if (r0 == 0) goto L28
            android.view.WindowInsets r2 = defpackage.w90.b(r6, r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L28
            wc0 r1 = defpackage.wc0.g(r6, r2)
        L28:
            r0 = r1
        L29:
            tc0 r1 = r0.a
            boolean r1 = r1.m()
            if (r1 != 0) goto L54
            int r1 = r6.getChildCount()
            r2 = 0
        L36:
            if (r2 >= r1) goto L54
            android.view.View r3 = r6.getChildAt(r2)
            java.util.WeakHashMap r4 = defpackage.ja0.a
            android.view.WindowInsets r4 = r0.f()
            if (r4 == 0) goto L51
            android.view.WindowInsets r5 = defpackage.w90.a(r3, r4)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L51
            defpackage.wc0.g(r3, r5)
        L51:
            int r2 = r2 + 1
            goto L36
        L54:
            return r7
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.d
            if (r0 == 0) goto L23
            java.util.ArrayList r0 = r4.a
            if (r0 == 0) goto L23
            r0 = 0
        L9:
            java.util.ArrayList r1 = r4.a
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            java.util.ArrayList r1 = r4.a
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
    public final boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == 0) goto L18
            java.util.ArrayList r0 = r1.a
            if (r0 == 0) goto L18
            int r0 = r0.size()
            if (r0 <= 0) goto L18
            java.util.ArrayList r0 = r1.a
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L18
            r2 = 0
            return r2
        L18:
            boolean r2 = super.drawChild(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(android.view.View r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.b
            if (r0 == 0) goto L14
            r0.remove(r2)
            java.util.ArrayList r0 = r1.a
            if (r0 == 0) goto L14
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L14
            r0 = 1
            r1.d = r0
        L14:
            super.endViewTransition(r2)
            return
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r1) {
            r0 = this;
            return r1
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            android.view.View r1 = r2.getChildAt(r0)
            r2.a(r1)
            int r0 = r0 + (-1)
            goto L6
        L12:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.a(r1)
        L5:
            super.removeDetachedView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View r1) {
            r0 = this;
            r0.a(r1)
            super.removeView(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int r2) {
            r1 = this;
            android.view.View r0 = r1.getChildAt(r2)
            r1.a(r0)
            super.removeViewAt(r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(android.view.View r1) {
            r0 = this;
            r0.a(r1)
            super.removeViewInLayout(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int r3, int r4) {
            r2 = this;
            r0 = r3
        L1:
            int r1 = r3 + r4
            if (r0 >= r1) goto Lf
            android.view.View r1 = r2.getChildAt(r0)
            r2.a(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            super.removeViews(r3, r4)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int r3, int r4) {
            r2 = this;
            r0 = r3
        L1:
            int r1 = r3 + r4
            if (r0 >= r1) goto Lf
            android.view.View r1 = r2.getChildAt(r0)
            r2.a(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            super.removeViewsInLayout(r3, r4)
            return
    }

    public void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L16
            java.util.ArrayList r0 = r1.b
            if (r0 != 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
        L11:
            java.util.ArrayList r0 = r1.b
            r0.add(r2)
        L16:
            super.startViewTransition(r2)
            return
    }
}
