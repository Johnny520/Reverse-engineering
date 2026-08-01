package defpackage;

/* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0256 extends android.view.View.AccessibilityDelegate {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1195 f1508;

    public C0256(defpackage.C1195 r1) {
            r0 = this;
            r0.<init>()
            r0.f1508 = r1
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            ᛶᲈᲈᛸ r0 = r0.f1508
            boolean r0 = r0.mo978(r1, r2)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r1) {
            r0 = this;
            ᛶᲈᲈᛸ r0 = r0.f1508
            ᛸᲈᛸᲈ r0 = r0.mo979(r1)
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.f7101
            android.view.accessibility.AccessibilityNodeProvider r0 = (android.view.accessibility.AccessibilityNodeProvider) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            ᛶᲈᲈᛸ r0 = r0.f1508
            r0.mo977(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View r3, android.view.accessibility.AccessibilityNodeInfo r4) {
            r2 = this;
            ᲇᛶᛱᛱ r0 = new ᲇᛶᛱᛱ
            r0.<init>(r4)
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            boolean r1 = defpackage.AbstractC0181.m718(r3)
            r4.setScreenReaderFocusable(r1)
            boolean r1 = defpackage.AbstractC0181.m720(r3)
            r4.setHeading(r1)
            java.lang.CharSequence r1 = defpackage.AbstractC0181.m719(r3)
            r4.setPaneTitle(r1)
            java.lang.CharSequence r1 = defpackage.AbstractC0724.m1627(r3)
            r4.setStateDescription(r1)
            ᛶᲈᲈᛸ r2 = r2.f1508
            r2.mo976(r3, r0)
            r4.getText()
            r2 = 1711866851(0x660903e3, float:1.6175898E23)
            java.lang.Object r2 = r3.getTag(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L38
            java.util.List r2 = java.util.Collections.EMPTY_LIST
        L38:
            r3 = 0
        L39:
            int r4 = r2.size()
            if (r3 >= r4) goto L4b
            java.lang.Object r4 = r2.get(r3)
            ᛳᛳᛳᲈ r4 = (defpackage.C0436) r4
            r0.m3460(r4)
            int r3 = r3 + 1
            goto L39
        L4b:
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            ᛶᲈᲈᛸ r0 = r0.f1508
            r0.mo975(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r0 = this;
            ᛶᲈᲈᛸ r0 = r0.f1508
            boolean r0 = r0.mo980(r1, r2, r3)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View r1, int r2, android.os.Bundle r3) {
            r0 = this;
            ᛶᲈᲈᛸ r0 = r0.f1508
            boolean r0 = r0.mo981(r1, r2, r3)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View r1, int r2) {
            r0 = this;
            ᛶᲈᲈᛸ r0 = r0.f1508
            r0.mo973(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            ᛶᲈᲈᛸ r0 = r0.f1508
            r0.mo974(r1, r2)
            return
    }
}
