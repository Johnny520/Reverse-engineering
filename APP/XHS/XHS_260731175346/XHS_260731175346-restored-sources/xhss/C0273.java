package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛵᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0273 extends xhss.C0155 {
    @Override // xhss.C0155
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final void mo396(android.view.View r2, xhss.C0755 r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.f2532
            android.view.View$AccessibilityDelegate r1 = r1.f637
            r1.onInitializeAccessibilityNodeInfo(r2, r3)
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            java.lang.Class<android.widget.ScrollView> r1 = android.widget.ScrollView.class
            java.lang.String r1 = r1.getName()
            r3.setClassName(r1)
            boolean r1 = r2.isEnabled()
            if (r1 == 0) goto L52
            int r1 = r2.getScrollRange()
            if (r1 <= 0) goto L52
            r0 = 1
            r3.setScrollable(r0)
            int r0 = r2.getScrollY()
            if (r0 <= 0) goto L3a
            xhss.ᛳᛸᛵᲀ r0 = xhss.C0299.f1145
            java.lang.Object r0 = r0.f1148
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            r3.addAction(r0)
            xhss.ᛳᛸᛵᲀ r0 = xhss.C0299.f1144
            java.lang.Object r0 = r0.f1148
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            r3.addAction(r0)
        L3a:
            int r2 = r2.getScrollY()
            if (r2 >= r1) goto L52
            xhss.ᛳᛸᛵᲀ r1 = xhss.C0299.f1143
            java.lang.Object r1 = r1.f1148
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r1
            r3.addAction(r1)
            xhss.ᛳᛸᛵᲀ r1 = xhss.C0299.f1146
            java.lang.Object r1 = r1.f1148
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r1
            r3.addAction(r1)
        L52:
            return
    }

    @Override // xhss.C0155
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final boolean mo397(android.view.View r4, int r5, android.os.Bundle r6) {
            r3 = this;
            boolean r3 = super.mo397(r4, r5, r6)
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
            r4.m17(r0, r3, r6)
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
            r4.m17(r0, r3, r6)
            return r6
        L95:
            return r0
    }

    @Override // xhss.C0155
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo398(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.mo398(r1, r2)
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
}
