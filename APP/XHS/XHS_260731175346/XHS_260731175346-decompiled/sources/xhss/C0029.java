package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛳᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0029 extends android.view.View.AccessibilityDelegate {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0155 f207;

    public C0029(xhss.C0155 r1) {
            r0 = this;
            r0.<init>()
            r0.f207 = r1
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            xhss.ᛲᛴᲀᲈ r0 = r0.f207
            android.view.View$AccessibilityDelegate r0 = r0.f637
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r1, r2)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r3) {
            r2 = this;
            xhss.ᛲᛴᲀᲈ r2 = r2.f207
            android.view.View$AccessibilityDelegate r2 = r2.f637
            android.view.accessibility.AccessibilityNodeProvider r2 = r2.getAccessibilityNodeProvider(r3)
            r3 = 0
            if (r2 == 0) goto L12
            xhss.ᲇᛵᛲᲁ r0 = new xhss.ᲇᛵᛲᲁ
            r1 = 1
            r0.<init>(r1, r2)
            goto L13
        L12:
            r0 = r3
        L13:
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.f3349
            android.view.accessibility.AccessibilityNodeProvider r2 = (android.view.accessibility.AccessibilityNodeProvider) r2
            return r2
        L1a:
            return r3
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            xhss.ᛲᛴᲀᲈ r0 = r0.f207
            r0.mo398(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View r3, android.view.accessibility.AccessibilityNodeInfo r4) {
            r2 = this;
            xhss.ᛸᛴᛸᛲ r0 = new xhss.ᛸᛴᛸᛲ
            r0.<init>(r4)
            int r1 = xhss.AbstractC0624.f2154
            boolean r1 = xhss.AbstractC0756.m1298(r3)
            r4.setScreenReaderFocusable(r1)
            boolean r1 = xhss.AbstractC0756.m1297(r3)
            r4.setHeading(r1)
            java.lang.CharSequence r1 = xhss.AbstractC0756.m1299(r3)
            r4.setPaneTitle(r1)
            java.lang.CharSequence r1 = xhss.AbstractC0531.m945(r3)
            r4.setStateDescription(r1)
            xhss.ᛲᛴᲀᲈ r2 = r2.f207
            r2.mo396(r3, r0)
            r4.getText()
            r2 = 1678246140(0x640800fc, float:1.0035313E22)
            java.lang.Object r2 = r3.getTag(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L38
            java.util.List r2 = java.util.Collections.EMPTY_LIST
        L38:
            r3 = 0
        L39:
            int r4 = r2.size()
            if (r3 >= r4) goto L51
            java.lang.Object r4 = r2.get(r3)
            xhss.ᛳᛸᛵᲀ r4 = (xhss.C0299) r4
            java.lang.Object r4 = r4.f1148
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r4
            android.view.accessibility.AccessibilityNodeInfo r1 = r0.f2532
            r1.addAction(r4)
            int r3 = r3 + 1
            goto L39
        L51:
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            xhss.ᛲᛴᲀᲈ r0 = r0.f207
            android.view.View$AccessibilityDelegate r0 = r0.f637
            r0.onPopulateAccessibilityEvent(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r0 = this;
            xhss.ᛲᛴᲀᲈ r0 = r0.f207
            android.view.View$AccessibilityDelegate r0 = r0.f637
            boolean r0 = r0.onRequestSendAccessibilityEvent(r1, r2, r3)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View r1, int r2, android.os.Bundle r3) {
            r0 = this;
            xhss.ᛲᛴᲀᲈ r0 = r0.f207
            boolean r0 = r0.mo397(r1, r2, r3)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View r1, int r2) {
            r0 = this;
            xhss.ᛲᛴᲀᲈ r0 = r0.f207
            android.view.View$AccessibilityDelegate r0 = r0.f637
            r0.sendAccessibilityEvent(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            xhss.ᛲᛴᲀᲈ r0 = r0.f207
            android.view.View$AccessibilityDelegate r0 = r0.f637
            r0.sendAccessibilityEventUnchecked(r1, r2)
            return
    }
}
