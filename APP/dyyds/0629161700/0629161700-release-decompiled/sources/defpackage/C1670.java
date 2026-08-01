package defpackage;

/* JADX INFO: renamed from: ᲀᛵᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1670 extends defpackage.C1195 {
    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo976(android.view.View r3, defpackage.C2060 r4) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.f8857
            android.view.View$AccessibilityDelegate r2 = r2.f5396
            r2.onInitializeAccessibilityNodeInfo(r3, r0)
            androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
            java.lang.String r2 = "android.widget.ScrollView"
            r0.setClassName(r2)
            boolean r2 = r3.isEnabled()
            if (r2 == 0) goto L3e
            int r2 = r3.getScrollRange()
            if (r2 <= 0) goto L3e
            r1 = 1
            r0.setScrollable(r1)
            int r0 = r3.getScrollY()
            if (r0 <= 0) goto L2e
            ᛳᛳᛳᲈ r0 = defpackage.C0436.f2139
            r4.m3460(r0)
            ᛳᛳᛳᲈ r0 = defpackage.C0436.f2141
            r4.m3460(r0)
        L2e:
            int r3 = r3.getScrollY()
            if (r3 >= r2) goto L3e
            ᛳᛳᛳᲈ r2 = defpackage.C0436.f2140
            r4.m3460(r2)
            ᛳᛳᛳᲈ r2 = defpackage.C0436.f2142
            r4.m3460(r2)
        L3e:
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo977(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.mo977(r1, r2)
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            int r0 = r1.getScrollRange()
            if (r0 <= 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            r2.setScrollable(r0)
            int r0 = r1.getScrollX()
            r2.setScrollX(r0)
            int r0 = r1.getScrollY()
            r2.setScrollY(r0)
            int r0 = r1.getScrollX()
            r2.setMaxScrollX(r0)
            int r0 = r1.getScrollRange()
            r2.setMaxScrollY(r0)
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final boolean mo981(android.view.View r4, int r5, android.os.Bundle r6) {
            r3 = this;
            boolean r3 = super.mo981(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L8
            return r6
        L8:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L13
            goto L95
        L13:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L30
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L30
            int r3 = r1.height()
        L30:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L6a
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L43
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L43
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L6a
            goto L95
        L43:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L95
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.m89(r0, r3, r6)
            return r6
        L6a:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L95
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.m89(r0, r3, r6)
            return r6
        L95:
            return r0
    }
}
