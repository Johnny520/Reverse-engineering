package p000;

/* JADX INFO: renamed from: iw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0409iw extends androidx.core.view.C0045 {

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f5217;

    public /* synthetic */ C0409iw(int r1) {
            r0 = this;
            r0.f5217 = r1
            r0.<init>()
            return
    }

    public C0409iw(androidx.viewpager.widget.ViewPager r1) {
            r0 = this;
            r1 = 2
            r0.f5217 = r1
            r0.<init>()
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: γ */
    public void mo422(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            int r0 = r1.f5217
            switch(r0) {
                case 1: goto L1d;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.mo422(r2, r3)
            return
        L9:
            super.mo422(r2, r3)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r1 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r1 = r1.getName()
            r3.setClassName(r1)
            r1 = 0
            r3.setScrollable(r1)
            r3.getEventType()
            return
        L1d:
            super.mo422(r2, r3)
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            java.lang.Class<android.widget.ScrollView> r1 = android.widget.ScrollView.class
            java.lang.String r1 = r1.getName()
            r3.setClassName(r1)
            int r1 = r2.getScrollRange()
            if (r1 <= 0) goto L33
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            r3.setScrollable(r1)
            int r1 = r2.getScrollX()
            r3.setScrollX(r1)
            int r1 = r2.getScrollY()
            r3.setScrollY(r1)
            int r1 = r2.getScrollX()
            r3.setMaxScrollX(r1)
            int r1 = r2.getScrollRange()
            r3.setMaxScrollY(r1)
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: δ */
    public final void mo423(android.view.View r3, p000.C1128 r4) {
            r2 = this;
            int r0 = r2.f5217
            android.view.View$AccessibilityDelegate r2 = r2.f1026
            switch(r0) {
                case 0: goto L5b;
                case 1: goto L1a;
                default: goto L7;
            }
        L7:
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.f13478
            r2.onInitializeAccessibilityNodeInfo(r3, r0)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r2 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r2 = r2.getName()
            r4.m7358(r2)
            r2 = 0
            r0.setScrollable(r2)
            return
        L1a:
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.f13478
            r2.onInitializeAccessibilityNodeInfo(r3, r0)
            androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
            java.lang.Class<android.widget.ScrollView> r2 = android.widget.ScrollView.class
            java.lang.String r2 = r2.getName()
            r4.m7358(r2)
            boolean r2 = r3.isEnabled()
            if (r2 == 0) goto L5a
            int r2 = r3.getScrollRange()
            if (r2 <= 0) goto L5a
            r1 = 1
            r0.setScrollable(r1)
            int r0 = r3.getScrollY()
            if (r0 <= 0) goto L4a
            ч r0 = p000.C1125.f13472
            r4.m7354(r0)
            ч r0 = p000.C1125.f13473
            r4.m7354(r0)
        L4a:
            int r3 = r3.getScrollY()
            if (r3 >= r2) goto L5a
            ч r2 = p000.C1125.f13471
            r4.m7354(r2)
            ч r2 = p000.C1125.f13474
            r4.m7354(r2)
        L5a:
            return
        L5b:
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.f13478
            r2.onInitializeAccessibilityNodeInfo(r3, r0)
            int[] r2 = androidx.drawerlayout.widget.DrawerLayout.f1064
            java.util.WeakHashMap r2 = p000.b92.f1572
            int r2 = r3.getImportantForAccessibility()
            r1 = 4
            if (r2 == r1) goto L73
            int r2 = r3.getImportantForAccessibility()
            r3 = 2
            if (r2 == r3) goto L73
            goto L7a
        L73:
            r2 = -1
            r4.f13479 = r2
            r2 = 0
            r0.setParent(r2)
        L7a:
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: η */
    public boolean mo426(android.view.View r4, int r5, android.os.Bundle r6) {
            r3 = this;
            int r0 = r3.f5217
            switch(r0) {
                case 1: goto Lf;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.mo426(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.mo426(r4, r5, r6)
            return r3
        Lf:
            boolean r3 = super.mo426(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L18
            goto La6
        L18:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L23
            goto La5
        L23:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L40
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L40
            int r3 = r1.height()
        L40:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L7a
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L53
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L53
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L7a
            goto La5
        L53:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La5
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.m445(r0, r3, r6)
            goto La6
        L7a:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La5
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.m445(r0, r3, r6)
            goto La6
        La5:
            r6 = r0
        La6:
            return r6
    }
}
