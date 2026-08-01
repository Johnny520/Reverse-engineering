package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f1098;

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList f1099;

    /* JADX INFO: renamed from: η */
    public android.view.View.OnApplyWindowInsetsListener f1100;

    /* JADX INFO: renamed from: θ */
    public boolean f1101;

    public FragmentContainerView(android.content.Context r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1098 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1099 = r1
            r1 = 1
            r0.f1101 = r1
            return
    }

    public FragmentContainerView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public FragmentContainerView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r3.getClass()
            r2.<init>(r3, r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.f1098 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.f1099 = r5
            r5 = 1
            r2.f1101 = r5
            if (r4 == 0) goto L5c
            java.lang.String r5 = r4.getClassAttribute()
            int[] r0 = p000.ik1.f5107
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r1, r1)
            if (r5 != 0) goto L2d
            java.lang.String r5 = r3.getString(r1)
            java.lang.String r4 = "android:name"
            goto L2f
        L2d:
            java.lang.String r4 = "class"
        L2f:
            r3.recycle()
            if (r5 == 0) goto L5c
            boolean r2 = r2.isInEditMode()
            if (r2 == 0) goto L3b
            goto L5c
        L3b:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "FragmentContainerView must be within a FragmentActivity to use "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r4 = "=\""
            r3.append(r4)
            r3.append(r5)
            r4 = 34
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L5c:
            return
    }

    public FragmentContainerView(android.content.Context r11, android.util.AttributeSet r12, p000.b70 r13) {
            r10 = this;
            r11.getClass()
            r12.getClass()
            r10.<init>(r11, r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1098 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1099 = r0
            r0 = 1
            r10.f1101 = r0
            java.lang.String r1 = r12.getClassAttribute()
            int[] r2 = p000.ik1.f5107
            r3 = 0
            android.content.res.TypedArray r12 = r11.obtainStyledAttributes(r12, r2, r3, r3)
            if (r1 != 0) goto L2b
            java.lang.String r1 = r12.getString(r3)
        L2b:
            java.lang.String r2 = r12.getString(r0)
            r12.recycle()
            int r12 = r10.getId()
            n60 r4 = r13.m757(r12)
            if (r1 == 0) goto L197
            if (r4 != 0) goto L197
            r4 = 0
            java.lang.String r5 = " with tag "
            r6 = -1
            if (r12 != r6) goto L57
            if (r2 == 0) goto L4b
            java.lang.String r10 = r5.concat(r2)
            goto L4d
        L4b:
            java.lang.String r10 = ""
        L4d:
            java.lang.String r11 = "FragmentContainerView must have an android:id to add Fragment "
            java.lang.String r10 = p000.lz1.m3674(r11, r1, r10)
            p000.C1080.m7279(r10)
            throw r4
        L57:
            w60 r12 = r13.m759()
            r11.getClassLoader()
            n60 r11 = r12.m6324(r1)
            r11.getClass()
            r11.f7408 = r0
            p60 r12 = r11.f7440
            if (r12 != 0) goto L6d
            r12 = r4
            goto L6f
        L6d:
            androidx.fragment.app.FragmentActivity r12 = r12.f8430
        L6f:
            if (r12 == 0) goto L73
            r11.f7408 = r0
        L73:
            k8 r12 = new k8
            r12.<init>(r13)
            r12.f5804 = r0
            r11.f7409 = r10
            int r1 = r10.getId()
            java.lang.String r7 = r11.f7415
            if (r7 == 0) goto L87
            p000.k70.m3177(r11, r7)
        L87:
            java.lang.Class r7 = r11.getClass()
            int r8 = r7.getModifiers()
            boolean r9 = r7.isAnonymousClass()
            if (r9 != 0) goto L17a
            boolean r9 = java.lang.reflect.Modifier.isPublic(r8)
            if (r9 == 0) goto L17a
            boolean r9 = r7.isMemberClass()
            if (r9 == 0) goto La7
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 == 0) goto L17a
        La7:
            java.lang.String r7 = " now "
            java.lang.String r8 = ": was "
            if (r2 == 0) goto Ld1
            java.lang.String r9 = r11.f7403
            if (r9 == 0) goto Lcf
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto Lb8
            goto Lcf
        Lb8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "Can't change tag of fragment "
            r10.<init>(r12)
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = r11.f7403
            java.lang.String r10 = p000.AbstractC0602nx.m4133(r10, r11, r7, r2)
            p000.C1080.m7279(r10)
            throw r4
        Lcf:
            r11.f7403 = r2
        Ld1:
            if (r1 == 0) goto L122
            if (r1 == r6) goto L103
            int r2 = r11.f7401
            if (r2 == 0) goto Lfe
            if (r2 != r1) goto Ldc
            goto Lfe
        Ldc:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Can't change container ID of fragment "
            r12.<init>(r13)
            r12.append(r11)
            int r11 = r11.f7401
            r12.append(r8)
            r12.append(r11)
            r12.append(r7)
            r12.append(r1)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        Lfe:
            r11.f7401 = r1
            r11.f7402 = r1
            goto L122
        L103:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Can't add fragment "
            r12.<init>(r13)
            r12.append(r11)
            r12.append(r5)
            r12.append(r2)
            java.lang.String r11 = " to container view with no id"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L122:
            m70 r1 = new m70
            r1.<init>(r0, r11)
            r12.m3178(r1)
            b70 r1 = r12.f5805
            r11.f7439 = r1
            boolean r11 = r12.f5796
            if (r11 != 0) goto L174
            p60 r11 = r1.f1537
            if (r11 == 0) goto L197
            boolean r11 = r1.f1511
            if (r11 == 0) goto L13b
            goto L197
        L13b:
            r1.m798(r0)
            java.util.ArrayList r11 = r1.f1513
            java.util.ArrayList r2 = r1.f1514
            r12.mo47(r11, r2)
            r1.f1519 = r0
            java.util.ArrayList r11 = r1.f1513     // Catch: java.lang.Throwable -> L16f
            java.util.ArrayList r12 = r1.f1514     // Catch: java.lang.Throwable -> L16f
            r1.m769(r11, r12)     // Catch: java.lang.Throwable -> L16f
            r1.m779()
            r1.m803()
            boolean r11 = r1.f1512
            if (r11 == 0) goto L15d
            r1.f1512 = r3
            r1.m801()
        L15d:
            i0 r11 = r1.f1520
            java.lang.Object r11 = r11.f4858
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.util.Collection r11 = r11.values()
            java.util.Set r12 = java.util.Collections.singleton(r4)
            r11.removeAll(r12)
            goto L197
        L16f:
            r10 = move-exception
            r1.m779()
            throw r10
        L174:
            java.lang.String r10 = "This transaction is already being added to the back stack"
            p000.C1080.m7279(r10)
            throw r4
        L17a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = r7.getCanonicalName()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Fragment "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = " must be a public static class to be  properly recreated from instance state."
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L197:
            i0 r11 = r13.f1520
            java.util.ArrayList r11 = r11.m2571()
            java.util.Iterator r11 = r11.iterator()
        L1a1:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1b5
            java.lang.Object r12 = r11.next()
            i70 r12 = (p000.i70) r12
            n60 r12 = r12.f4942
            int r12 = r12.f7402
            r10.getId()
            goto L1a1
        L1b5:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            r3.getClass()
            r0 = 2131296587(0x7f09014b, float:1.8211095E38)
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof p000.n60
            if (r1 == 0) goto L11
            n60 r0 = (p000.n60) r0
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L18
            super.addView(r3, r4, r5)
            return
        L18:
            java.lang.String r2 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            java.lang.String r4 = " is not associated with a Fragment."
            p000.C1080.m7276(r2, r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r5) {
            r4 = this;
            r5.getClass()
            r0 = 0
            oc2 r1 = p000.oc2.m4220(r0, r5)
            android.view.View$OnApplyWindowInsetsListener r2 = r4.f1100
            if (r2 == 0) goto L1b
            r2.getClass()
            android.view.WindowInsets r1 = r2.onApplyWindowInsets(r4, r5)
            r1.getClass()
            oc2 r0 = p000.oc2.m4220(r0, r1)
            goto L1f
        L1b:
            oc2 r0 = p000.b92.m826(r4, r1)
        L1f:
            lc2 r1 = r0.f8033
            boolean r1 = r1.mo2098()
            if (r1 != 0) goto L38
            int r1 = r4.getChildCount()
            r2 = 0
        L2c:
            if (r2 >= r1) goto L38
            android.view.View r3 = r4.getChildAt(r2)
            p000.b92.m824(r3, r0)
            int r2 = r2 + 1
            goto L2c
        L38:
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = r4.f1101
            if (r0 == 0) goto L21
            java.util.ArrayList r0 = r4.f1098
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            long r2 = r4.getDrawingTime()
            super.drawChild(r5, r1, r2)
            goto Ld
        L21:
            super.dispatchDraw(r5)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r3, android.view.View r4, long r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            boolean r0 = r2.f1101
            if (r0 == 0) goto L1a
            java.util.ArrayList r0 = r2.f1098
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1a
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L1a:
            boolean r2 = super.drawChild(r3, r4, r5)
            return r2
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(android.view.View r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayList r0 = r1.f1099
            r0.remove(r2)
            java.util.ArrayList r0 = r1.f1098
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L13
            r0 = 1
            r1.f1101 = r0
        L13:
            super.endViewTransition(r2)
            return
    }

    public final <F extends p000.n60> F getFragment() {
            r4 = this;
            r0 = r4
        L1:
            r1 = 0
            if (r0 == 0) goto L23
            r2 = 2131296587(0x7f09014b, float:1.8211095E38)
            java.lang.Object r2 = r0.getTag(r2)
            boolean r3 = r2 instanceof p000.n60
            if (r3 == 0) goto L12
            n60 r2 = (p000.n60) r2
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L16
            goto L24
        L16:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L21
            android.view.View r0 = (android.view.View) r0
            goto L1
        L21:
            r0 = r1
            goto L1
        L23:
            r2 = r1
        L24:
            if (r2 == 0) goto L54
            p60 r0 = r2.f7440
            if (r0 == 0) goto L33
            boolean r0 = r2.f7432
            if (r0 == 0) goto L33
            b70 r0 = r2.m3997()
            goto L75
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "The Fragment "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " that owns View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L54:
            android.content.Context r0 = r4.getContext()
        L58:
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L6a
            boolean r2 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r2 == 0) goto L63
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            goto L6b
        L63:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L58
        L6a:
            r0 = r1
        L6b:
            if (r0 == 0) goto L7e
            n r0 = r0.f1096
            java.lang.Object r0 = r0.f7336
            p60 r0 = (p000.p60) r0
            b70 r0 = r0.f8433
        L75:
            int r4 = r4.getId()
            n60 r4 = r0.m757(r4)
            return r4
        L7e:
            java.lang.String r0 = "View "
            java.lang.String r2 = " is not within a subclass of FragmentActivity."
            p000.C1080.m7270(r0, r4, r2)
            return r1
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r1) {
            r0 = this;
            r1.getClass()
            return r1
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            r1 = -1
            if (r1 >= r0) goto L16
            android.view.View r1 = r2.getChildAt(r0)
            r1.getClass()
            r2.m464(r1)
            int r0 = r0 + (-1)
            goto L6
        L16:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View r1) {
            r0 = this;
            r1.getClass()
            r0.m464(r1)
            super.removeView(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int r2) {
            r1 = this;
            android.view.View r0 = r1.getChildAt(r2)
            r0.getClass()
            r1.m464(r0)
            super.removeViewAt(r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(android.view.View r1) {
            r0 = this;
            r1.getClass()
            r0.m464(r1)
            super.removeViewInLayout(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int r4, int r5) {
            r3 = this;
            int r0 = r4 + r5
            r1 = r4
        L3:
            if (r1 >= r0) goto L12
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            r3.m464(r2)
            int r1 = r1 + 1
            goto L3
        L12:
            super.removeViews(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int r4, int r5) {
            r3 = this;
            int r0 = r4 + r5
            r1 = r4
        L3:
            if (r1 >= r0) goto L12
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            r3.m464(r2)
            int r1 = r1 + 1
            goto L3
        L12:
            super.removeViewsInLayout(r4, r5)
            return
    }

    public final void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.f1101 = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r1) {
            r0 = this;
            r1.getClass()
            r0.f1100 = r1
            return
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(android.view.View r2) {
            r1 = this;
            r2.getClass()
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto Le
            java.util.ArrayList r0 = r1.f1099
            r0.add(r2)
        Le:
            super.startViewTransition(r2)
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m464(android.view.View r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f1099
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Ld
            java.util.ArrayList r1 = r1.f1098
            r1.add(r2)
        Ld:
            return
    }
}
