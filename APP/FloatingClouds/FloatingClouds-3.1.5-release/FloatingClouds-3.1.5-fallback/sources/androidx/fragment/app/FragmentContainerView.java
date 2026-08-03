package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "La/Wf;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/b;", "F", "getFragment", "()Landroidx/fragment/app/b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentContainerView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f899a;
    public final java.util.ArrayList b;
    public android.view.View.OnApplyWindowInsetsListener c;
    public boolean d;

    public FragmentContainerView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            java.lang.String r0 = "context"
            a.C0193i9.e(r5, r0)
            r0 = 0
            r4.<init>(r5, r6, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f899a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.b = r1
            r1 = 1
            r4.d = r1
            if (r6 == 0) goto L65
            java.lang.String r1 = r6.getClassAttribute()
            int[] r2 = androidx.fragment.R.styleable.FragmentContainerView
            java.lang.String r3 = "FragmentContainerView"
            a.C0193i9.d(r2, r3)
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r0, r0)
            if (r1 != 0) goto L36
            int r6 = androidx.fragment.R.styleable.FragmentContainerView_android_name
            java.lang.String r1 = r5.getString(r6)
            java.lang.String r6 = "android:name"
            goto L38
        L36:
            java.lang.String r6 = "class"
        L38:
            r5.recycle()
            if (r1 == 0) goto L65
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L44
            goto L65
        L44:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FragmentContainerView must be within a FragmentActivity to use "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r6 = "=\""
            r0.append(r6)
            r0.append(r1)
            r6 = 34
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L65:
            return
    }

    public FragmentContainerView(android.content.Context r5, android.util.AttributeSet r6, a.AbstractC0119e7 r7) {
            r4 = this;
            java.lang.String r0 = "context"
            a.C0193i9.e(r5, r0)
            java.lang.String r0 = "attrs"
            a.C0193i9.e(r6, r0)
            r4.<init>(r5, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f899a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.b = r0
            r0 = 1
            r4.d = r0
            java.lang.String r1 = r6.getClassAttribute()
            int[] r2 = androidx.fragment.R.styleable.FragmentContainerView
            java.lang.String r3 = "FragmentContainerView"
            a.C0193i9.d(r2, r3)
            r3 = 0
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r2, r3, r3)
            if (r1 != 0) goto L36
            int r1 = androidx.fragment.R.styleable.FragmentContainerView_android_name
            java.lang.String r1 = r6.getString(r1)
        L36:
            int r2 = androidx.fragment.R.styleable.FragmentContainerView_android_tag
            java.lang.String r2 = r6.getString(r2)
            r6.recycle()
            int r6 = r4.getId()
            androidx.fragment.app.b r3 = r7.C(r6)
            if (r1 == 0) goto Lb1
            if (r3 != 0) goto Lb1
            r3 = -1
            if (r6 != r3) goto L65
            if (r2 == 0) goto L57
            java.lang.String r5 = " with tag "
            java.lang.String r5 = r5.concat(r2)
            goto L59
        L57:
            java.lang.String r5 = ""
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "FragmentContainerView must have an android:id to add Fragment "
            java.lang.String r5 = a.C0487z.g(r7, r1, r5)
            r6.<init>(r5)
            throw r6
        L65:
            androidx.fragment.app.d r3 = r7.G()
            r5.getClassLoader()
            androidx.fragment.app.b r5 = r3.a(r1)
            java.lang.String r1 = "fm.fragmentFactory.insta…ontext.classLoader, name)"
            a.C0193i9.d(r5, r1)
            r5.x = r6
            r5.y = r6
            r5.z = r2
            r5.t = r7
            a.X6$a r6 = r7.v
            r5.u = r6
            r5.E = r0
            if (r6 != 0) goto L87
            r6 = 0
            goto L89
        L87:
            a.X6 r6 = r6.f370a
        L89:
            if (r6 == 0) goto L8d
            r5.E = r0
        L8d:
            a.S1 r6 = new a.S1
            r6.<init>(r7)
            r6.o = r0
            r5.F = r4
            r5.p = r0
            int r1 = r4.getId()
            r6.e(r1, r5, r2, r0)
            boolean r5 = r6.g
            if (r5 != 0) goto La9
            a.e7 r5 = r6.q
            r5.A(r6, r0)
            goto Lb1
        La9:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This transaction is already being added to the back stack"
            r5.<init>(r6)
            throw r5
        Lb1:
            a.A2 r5 = r7.c
            java.util.ArrayList r5 = r5.e()
            java.util.Iterator r5 = r5.iterator()
        Lbb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Le4
            java.lang.Object r6 = r5.next()
            androidx.fragment.app.e r6 = (androidx.fragment.app.e) r6
            androidx.fragment.app.b r7 = r6.c
            int r0 = r7.y
            int r1 = r4.getId()
            if (r0 != r1) goto Lbb
            android.view.View r0 = r7.G
            if (r0 == 0) goto Lbb
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto Lbb
            r7.F = r4
            r6.b()
            r6.k()
            goto Lbb
        Le4:
            return
    }

    public final void a(android.view.View r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.b
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Ld
            java.util.ArrayList r0 = r1.f899a
            r0.add(r2)
        Ld:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            java.lang.String r0 = "child"
            a.C0193i9.e(r3, r0)
            int r0 = androidx.fragment.R.id.fragment_container_view_tag
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof androidx.fragment.app.b
            if (r1 == 0) goto L12
            androidx.fragment.app.b r0 = (androidx.fragment.app.b) r0
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L19
            super.addView(r3, r4, r5)
            return
        L19:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = " is not associated with a Fragment."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r7) {
            r6 = this;
            java.lang.String r0 = "insets"
            a.C0193i9.e(r7, r0)
            r0 = 0
            a.nh r1 = a.nh.g(r0, r7)
            android.view.View$OnApplyWindowInsetsListener r2 = r6.c
            if (r2 == 0) goto L1c
            android.view.WindowInsets r1 = r2.onApplyWindowInsets(r6, r7)
            java.lang.String r2 = "onApplyWindowInsetsListe…lyWindowInsets(v, insets)"
            a.C0193i9.d(r1, r2)
            a.nh r0 = a.nh.g(r0, r1)
            goto L33
        L1c:
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            android.view.WindowInsets r0 = r1.f()
            if (r0 == 0) goto L32
            android.view.WindowInsets r2 = a.C0414ug.c.b(r6, r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L32
            a.nh r1 = a.nh.g(r6, r2)
        L32:
            r0 = r1
        L33:
            a.nh$k r1 = r0.f603a
            boolean r1 = r1.m()
            if (r1 != 0) goto L5e
            int r1 = r6.getChildCount()
            r2 = 0
        L40:
            if (r2 >= r1) goto L5e
            android.view.View r3 = r6.getChildAt(r2)
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            android.view.WindowInsets r4 = r0.f()
            if (r4 == 0) goto L5b
            android.view.WindowInsets r5 = a.C0414ug.c.a(r3, r4)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L5b
            a.nh.g(r3, r5)
        L5b:
            int r2 = r2 + 1
            goto L40
        L5e:
            return r7
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            java.lang.String r0 = "canvas"
            a.C0193i9.e(r5, r0)
            boolean r0 = r4.d
            if (r0 == 0) goto L23
            java.util.ArrayList r0 = r4.f899a
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            long r2 = r4.getDrawingTime()
            super.drawChild(r5, r1, r2)
            goto Lf
        L23:
            super.dispatchDraw(r5)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r3, android.view.View r4, long r5) {
            r2 = this;
            java.lang.String r0 = "canvas"
            a.C0193i9.e(r3, r0)
            java.lang.String r0 = "child"
            a.C0193i9.e(r4, r0)
            boolean r0 = r2.d
            if (r0 == 0) goto L1e
            java.util.ArrayList r0 = r2.f899a
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1e
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L1e
            r3 = 0
            return r3
        L1e:
            boolean r3 = super.drawChild(r3, r4, r5)
            return r3
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            a.C0193i9.e(r2, r0)
            java.util.ArrayList r0 = r1.b
            r0.remove(r2)
            java.util.ArrayList r0 = r1.f899a
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L15
            r0 = 1
            r1.d = r0
        L15:
            super.endViewTransition(r2)
            return
    }

    public final <F extends androidx.fragment.app.b> F getFragment() {
            r4 = this;
            r0 = r4
        L1:
            r1 = 0
            if (r0 == 0) goto L22
            int r2 = androidx.fragment.R.id.fragment_container_view_tag
            java.lang.Object r2 = r0.getTag(r2)
            boolean r3 = r2 instanceof androidx.fragment.app.b
            if (r3 == 0) goto L11
            androidx.fragment.app.b r2 = (androidx.fragment.app.b) r2
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 == 0) goto L15
            goto L23
        L15:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r0 = (android.view.View) r0
            goto L1
        L20:
            r0 = r1
            goto L1
        L22:
            r2 = r1
        L23:
            if (r2 == 0) goto L51
            boolean r0 = r2.i()
            if (r0 == 0) goto L30
            a.e7 r0 = r2.c()
            goto L6e
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "The Fragment "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " that owns View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L51:
            android.content.Context r0 = r4.getContext()
        L55:
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L68
            boolean r2 = r0 instanceof a.X6
            if (r2 == 0) goto L61
            r1 = r0
            a.X6 r1 = (a.X6) r1
            goto L68
        L61:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L55
        L68:
            if (r1 == 0) goto L77
            a.e7 r0 = r1.getSupportFragmentManager()
        L6e:
            int r1 = r4.getId()
            androidx.fragment.app.b r0 = r0.C(r1)
            return r0
        L77:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " is not within a subclass of FragmentActivity."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r2) {
            r1 = this;
            java.lang.String r0 = "insets"
            a.C0193i9.e(r2, r0)
            return r2
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
            r3 = this;
            int r0 = r3.getChildCount()
            int r0 = r0 + (-1)
        L6:
            r1 = -1
            if (r1 >= r0) goto L18
            android.view.View r1 = r3.getChildAt(r0)
            java.lang.String r2 = "view"
            a.C0193i9.d(r1, r2)
            r3.a(r1)
            int r0 = r0 + (-1)
            goto L6
        L18:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            a.C0193i9.e(r2, r0)
            r1.a(r2)
            super.removeView(r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int r3) {
            r2 = this;
            android.view.View r0 = r2.getChildAt(r3)
            java.lang.String r1 = "view"
            a.C0193i9.d(r0, r1)
            r2.a(r0)
            super.removeViewAt(r3)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            a.C0193i9.e(r2, r0)
            r1.a(r2)
            super.removeViewInLayout(r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int r5, int r6) {
            r4 = this;
            int r0 = r5 + r6
            r1 = r5
        L3:
            if (r1 >= r0) goto L14
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "view"
            a.C0193i9.d(r2, r3)
            r4.a(r2)
            int r1 = r1 + 1
            goto L3
        L14:
            super.removeViews(r5, r6)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int r5, int r6) {
            r4 = this;
            int r0 = r5 + r6
            r1 = r5
        L3:
            if (r1 >= r0) goto L14
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "view"
            a.C0193i9.d(r2, r3)
            r4.a(r2)
            int r1 = r1 + 1
            goto L3
        L14:
            super.removeViewsInLayout(r5, r6)
            return
    }

    public final void setDrawDisappearingViewsLast(boolean r1) {
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
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            a.C0193i9.e(r2, r0)
            r1.c = r2
            return
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            a.C0193i9.e(r2, r0)
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L10
            java.util.ArrayList r0 = r1.b
            r0.add(r2)
        L10:
            super.startViewTransition(r2)
            return
    }
}
