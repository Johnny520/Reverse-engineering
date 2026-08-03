package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class x extends a.C {
    public final androidx.recyclerview.widget.RecyclerView d;
    public final androidx.recyclerview.widget.x.a e;

    public static class a extends a.C {
        public final androidx.recyclerview.widget.x d;
        public final java.util.WeakHashMap e;

        public a(androidx.recyclerview.widget.x r2) {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.e = r0
                r1.d = r2
                return
        }

        @Override // a.C
        public final boolean a(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.WeakHashMap r0 = r1.e
                java.lang.Object r0 = r0.get(r2)
                a.C r0 = (a.C) r0
                if (r0 == 0) goto Lf
                boolean r2 = r0.a(r2, r3)
                return r2
            Lf:
                android.view.View$AccessibilityDelegate r0 = r1.f36a
                boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
                return r2
        }

        @Override // a.C
        public final a.J b(android.view.View r2) {
                r1 = this;
                java.util.WeakHashMap r0 = r1.e
                java.lang.Object r0 = r0.get(r2)
                a.C r0 = (a.C) r0
                if (r0 == 0) goto Lf
                a.J r2 = r0.b(r2)
                return r2
            Lf:
                a.J r2 = super.b(r2)
                return r2
        }

        @Override // a.C
        public final void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.WeakHashMap r0 = r1.e
                java.lang.Object r0 = r0.get(r2)
                a.C r0 = (a.C) r0
                if (r0 == 0) goto Le
                r0.c(r2, r3)
                return
            Le:
                super.c(r2, r3)
                return
        }

        @Override // a.C
        public final void d(@android.annotation.SuppressLint({"InvalidNullabilityOverride"}) android.view.View r5, @android.annotation.SuppressLint({"InvalidNullabilityOverride"}) a.I r6) {
                r4 = this;
                androidx.recyclerview.widget.x r0 = r4.d
                androidx.recyclerview.widget.RecyclerView r1 = r0.d
                boolean r1 = r1.N()
                android.view.View$AccessibilityDelegate r2 = r4.f36a
                android.view.accessibility.AccessibilityNodeInfo r3 = r6.f118a
                if (r1 != 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r0 = r0.d
                androidx.recyclerview.widget.RecyclerView$l r1 = r0.getLayoutManager()
                if (r1 == 0) goto L2f
                androidx.recyclerview.widget.RecyclerView$l r0 = r0.getLayoutManager()
                r0.W(r5, r6)
                java.util.WeakHashMap r0 = r4.e
                java.lang.Object r0 = r0.get(r5)
                a.C r0 = (a.C) r0
                if (r0 == 0) goto L2b
                r0.d(r5, r6)
                return
            L2b:
                r2.onInitializeAccessibilityNodeInfo(r5, r3)
                return
            L2f:
                r2.onInitializeAccessibilityNodeInfo(r5, r3)
                return
        }

        @Override // a.C
        public final void e(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.WeakHashMap r0 = r1.e
                java.lang.Object r0 = r0.get(r2)
                a.C r0 = (a.C) r0
                if (r0 == 0) goto Le
                r0.e(r2, r3)
                return
            Le:
                super.e(r2, r3)
                return
        }

        @Override // a.C
        public final boolean f(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                java.util.WeakHashMap r0 = r1.e
                java.lang.Object r0 = r0.get(r2)
                a.C r0 = (a.C) r0
                if (r0 == 0) goto Lf
                boolean r2 = r0.f(r2, r3, r4)
                return r2
            Lf:
                android.view.View$AccessibilityDelegate r0 = r1.f36a
                boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
        }

        @Override // a.C
        public final boolean g(@android.annotation.SuppressLint({"InvalidNullabilityOverride"}) android.view.View r3, int r4, @android.annotation.SuppressLint({"InvalidNullabilityOverride"}) android.os.Bundle r5) {
                r2 = this;
                androidx.recyclerview.widget.x r0 = r2.d
                androidx.recyclerview.widget.RecyclerView r1 = r0.d
                boolean r1 = r1.N()
                if (r1 != 0) goto L35
                androidx.recyclerview.widget.RecyclerView r0 = r0.d
                androidx.recyclerview.widget.RecyclerView$l r1 = r0.getLayoutManager()
                if (r1 == 0) goto L35
                java.util.WeakHashMap r1 = r2.e
                java.lang.Object r1 = r1.get(r3)
                a.C r1 = (a.C) r1
                if (r1 == 0) goto L23
                boolean r3 = r1.g(r3, r4, r5)
                if (r3 == 0) goto L2b
                goto L29
            L23:
                boolean r3 = super.g(r3, r4, r5)
                if (r3 == 0) goto L2b
            L29:
                r3 = 1
                return r3
            L2b:
                androidx.recyclerview.widget.RecyclerView$l r3 = r0.getLayoutManager()
                androidx.recyclerview.widget.RecyclerView r3 = r3.b
                androidx.recyclerview.widget.RecyclerView$r r3 = r3.c
                r3 = 0
                return r3
            L35:
                boolean r3 = super.g(r3, r4, r5)
                return r3
        }

        @Override // a.C
        public final void h(android.view.View r2, int r3) {
                r1 = this;
                java.util.WeakHashMap r0 = r1.e
                java.lang.Object r0 = r0.get(r2)
                a.C r0 = (a.C) r0
                if (r0 == 0) goto Le
                r0.h(r2, r3)
                return
            Le:
                super.h(r2, r3)
                return
        }

        @Override // a.C
        public final void i(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.WeakHashMap r0 = r1.e
                java.lang.Object r0 = r0.get(r2)
                a.C r0 = (a.C) r0
                if (r0 == 0) goto Le
                r0.i(r2, r3)
                return
            Le:
                super.i(r2, r3)
                return
        }
    }

    public x(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            androidx.recyclerview.widget.x$a r1 = r0.e
            if (r1 == 0) goto Lc
            r0.e = r1
            return
        Lc:
            androidx.recyclerview.widget.x$a r1 = new androidx.recyclerview.widget.x$a
            r1.<init>(r0)
            r0.e = r1
            return
    }

    @Override // a.C
    public final void c(@android.annotation.SuppressLint({"InvalidNullabilityOverride"}) android.view.View r2, @android.annotation.SuppressLint({"InvalidNullabilityOverride"}) android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            super.c(r2, r3)
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.RecyclerView r0 = r1.d
            boolean r0 = r0.N()
            if (r0 != 0) goto L1e
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.getLayoutManager()
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.RecyclerView$l r2 = r2.getLayoutManager()
            r2.U(r3)
        L1e:
            return
    }

    @Override // a.C
    public final void d(@android.annotation.SuppressLint({"InvalidNullabilityOverride"}) android.view.View r3, @android.annotation.SuppressLint({"InvalidNullabilityOverride"}) a.I r4) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.f36a
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.f118a
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            androidx.recyclerview.widget.RecyclerView r3 = r2.d
            boolean r0 = r3.N()
            if (r0 != 0) goto L22
            androidx.recyclerview.widget.RecyclerView$l r0 = r3.getLayoutManager()
            if (r0 == 0) goto L22
            androidx.recyclerview.widget.RecyclerView$l r3 = r3.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            androidx.recyclerview.widget.RecyclerView$r r1 = r0.c
            androidx.recyclerview.widget.RecyclerView$w r0 = r0.f0
            r3.V(r1, r0, r4)
        L22:
            return
    }

    @Override // a.C
    public final boolean g(@android.annotation.SuppressLint({"InvalidNullabilityOverride"}) android.view.View r6, int r7, @android.annotation.SuppressLint({"InvalidNullabilityOverride"}) android.os.Bundle r8) {
            r5 = this;
            boolean r6 = super.g(r6, r7, r8)
            r8 = 1
            if (r6 == 0) goto L8
            return r8
        L8:
            androidx.recyclerview.widget.RecyclerView r6 = r5.d
            boolean r0 = r6.N()
            r1 = 0
            if (r0 != 0) goto Lae
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.getLayoutManager()
            if (r0 == 0) goto Lae
            androidx.recyclerview.widget.RecyclerView$l r6 = r6.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r6.b
            androidx.recyclerview.widget.RecyclerView$r r0 = r0.c
            int r0 = r6.o
            int r2 = r6.n
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            androidx.recyclerview.widget.RecyclerView r4 = r6.b
            android.graphics.Matrix r4 = r4.getMatrix()
            boolean r4 = r4.isIdentity()
            if (r4 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r4 = r6.b
            boolean r4 = r4.getGlobalVisibleRect(r3)
            if (r4 == 0) goto L44
            int r0 = r3.height()
            int r2 = r3.width()
        L44:
            r3 = 4096(0x1000, float:5.74E-42)
            if (r7 == r3) goto L7b
            r3 = 8192(0x2000, float:1.148E-41)
            if (r7 == r3) goto L4f
            r7 = r1
            r0 = r7
            goto La3
        L4f:
            androidx.recyclerview.widget.RecyclerView r7 = r6.b
            r3 = -1
            boolean r7 = r7.canScrollVertically(r3)
            if (r7 == 0) goto L64
            int r7 = r6.G()
            int r0 = r0 - r7
            int r7 = r6.D()
            int r0 = r0 - r7
            int r7 = -r0
            goto L65
        L64:
            r7 = r1
        L65:
            androidx.recyclerview.widget.RecyclerView r0 = r6.b
            boolean r0 = r0.canScrollHorizontally(r3)
            if (r0 == 0) goto L79
            int r0 = r6.E()
            int r2 = r2 - r0
            int r0 = r6.F()
            int r2 = r2 - r0
            int r0 = -r2
            goto La3
        L79:
            r0 = r1
            goto La3
        L7b:
            androidx.recyclerview.widget.RecyclerView r7 = r6.b
            boolean r7 = r7.canScrollVertically(r8)
            if (r7 == 0) goto L8f
            int r7 = r6.G()
            int r0 = r0 - r7
            int r7 = r6.D()
            int r0 = r0 - r7
            r7 = r0
            goto L90
        L8f:
            r7 = r1
        L90:
            androidx.recyclerview.widget.RecyclerView r0 = r6.b
            boolean r0 = r0.canScrollHorizontally(r8)
            if (r0 == 0) goto L79
            int r0 = r6.E()
            int r2 = r2 - r0
            int r0 = r6.F()
            int r0 = r2 - r0
        La3:
            if (r7 != 0) goto La8
            if (r0 != 0) goto La8
            goto Lae
        La8:
            androidx.recyclerview.widget.RecyclerView r6 = r6.b
            r6.g0(r0, r7, r8)
            return r8
        Lae:
            return r1
    }
}
