package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a.C {
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout d;
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout e;
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior f;

    public b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout.BaseBehavior r2, com.google.android.material.appbar.AppBarLayout r3) {
            r0 = this;
            r0.f = r2
            r0.d = r3
            r0.e = r1
            r0.<init>()
            return
    }

    @Override // a.C
    public final void d(android.view.View r6, a.I r7) {
            r5 = this;
            android.view.View$AccessibilityDelegate r0 = r5.f36a
            android.view.accessibility.AccessibilityNodeInfo r1 = r7.f118a
            r0.onInitializeAccessibilityNodeInfo(r6, r1)
            java.lang.Class<android.widget.ScrollView> r6 = android.widget.ScrollView.class
            java.lang.String r6 = r6.getName()
            r7.h(r6)
            com.google.android.material.appbar.AppBarLayout r6 = r5.d
            int r0 = r6.getTotalScrollRange()
            if (r0 != 0) goto L19
            goto L76
        L19:
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = r5.f
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r5.e
            android.view.View r1 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.B(r0, r1)
            if (r1 != 0) goto L24
            goto L76
        L24:
            int r2 = r6.getChildCount()
            r3 = 0
        L29:
            if (r3 >= r2) goto L76
            android.view.View r4 = r6.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r4 = (com.google.android.material.appbar.AppBarLayout.c) r4
            int r4 = r4.f1041a
            if (r4 == 0) goto L73
            int r2 = r0.t()
            int r3 = r6.getTotalScrollRange()
            int r3 = -r3
            r4 = 1
            if (r2 == r3) goto L4d
            a.I$a r2 = a.I.a.f
            r7.b(r2)
            r7.i(r4)
        L4d:
            int r0 = r0.t()
            if (r0 == 0) goto L76
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 == 0) goto L6a
            int r6 = r6.getDownNestedPreScrollRange()
            int r6 = -r6
            if (r6 == 0) goto L76
            a.I$a r6 = a.I.a.g
            r7.b(r6)
            r7.i(r4)
            return
        L6a:
            a.I$a r6 = a.I.a.g
            r7.b(r6)
            r7.i(r4)
            return
        L73:
            int r3 = r3 + 1
            goto L29
        L76:
            return
    }

    @Override // a.C
    public final boolean g(android.view.View r11, int r12, android.os.Bundle r13) {
            r10 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.android.material.appbar.AppBarLayout r1 = r10.d
            r2 = 1
            r3 = 0
            if (r12 != r0) goto Lc
            r1.setExpanded(r3)
            return r2
        Lc:
            r0 = 8192(0x2000, float:1.148E-41)
            if (r12 != r0) goto L3f
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r11 = r10.f
            int r12 = r11.t()
            if (r12 == 0) goto L3e
            androidx.coordinatorlayout.widget.CoordinatorLayout r12 = r10.e
            android.view.View r7 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.B(r11, r12)
            r11 = -1
            boolean r11 = r7.canScrollVertically(r11)
            if (r11 == 0) goto L3a
            int r11 = r1.getDownNestedPreScrollRange()
            int r8 = -r11
            if (r8 == 0) goto L3e
            int[] r9 = new int[]{r3, r3}
            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = r10.e
            com.google.android.material.appbar.AppBarLayout r6 = r10.d
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r4 = r10.f
            r4.E(r5, r6, r7, r8, r9)
            return r2
        L3a:
            r1.setExpanded(r2)
            return r2
        L3e:
            return r3
        L3f:
            boolean r11 = super.g(r11, r12, r13)
            return r11
    }
}
