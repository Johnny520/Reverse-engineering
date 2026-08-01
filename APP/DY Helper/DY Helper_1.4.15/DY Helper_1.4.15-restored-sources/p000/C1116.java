package p000;

/* JADX INFO: renamed from: о */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1116 extends android.view.View.AccessibilityDelegate {

    /* JADX INFO: renamed from: α */
    public final androidx.core.view.C0045 f13451;

    public C1116(androidx.core.view.C0045 r1) {
            r0 = this;
            r0.<init>()
            r0.f13451 = r1
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            androidx.core.view.α r0 = r0.f13451
            boolean r0 = r0.mo420(r1, r2)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r1) {
            r0 = this;
            androidx.core.view.α r0 = r0.f13451
            n r0 = r0.mo421(r1)
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.f7336
            android.view.accessibility.AccessibilityNodeProvider r0 = (android.view.accessibility.AccessibilityNodeProvider) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            androidx.core.view.α r0 = r0.f13451
            r0.mo422(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View r3, android.view.accessibility.AccessibilityNodeInfo r4) {
            r2 = this;
            э r0 = new э
            r0.<init>(r4)
            java.util.WeakHashMap r1 = p000.b92.f1572
            boolean r1 = p000.x82.m6521(r3)
            r4.setScreenReaderFocusable(r1)
            boolean r1 = p000.x82.m6520(r3)
            r4.setHeading(r1)
            java.lang.CharSequence r1 = p000.x82.m6519(r3)
            r4.setPaneTitle(r1)
            java.lang.CharSequence r1 = p000.z82.m7117(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setStateDescription(r1)
            androidx.core.view.α r2 = r2.f13451
            r2.mo423(r3, r0)
            r4.getText()
            r2 = 2131296983(0x7f0902d7, float:1.8211898E38)
            java.lang.Object r2 = r3.getTag(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L3a
            java.util.List r2 = java.util.Collections.EMPTY_LIST
        L3a:
            r3 = 0
        L3b:
            int r4 = r2.size()
            if (r3 >= r4) goto L4d
            java.lang.Object r4 = r2.get(r3)
            ч r4 = (p000.C1125) r4
            r0.m7354(r4)
            int r3 = r3 + 1
            goto L3b
        L4d:
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            androidx.core.view.α r0 = r0.f13451
            r0.mo424(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r0 = this;
            androidx.core.view.α r0 = r0.f13451
            boolean r0 = r0.mo425(r1, r2, r3)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View r1, int r2, android.os.Bundle r3) {
            r0 = this;
            androidx.core.view.α r0 = r0.f13451
            boolean r0 = r0.mo426(r1, r2, r3)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View r1, int r2) {
            r0 = this;
            androidx.core.view.α r0 = r0.f13451
            r0.mo427(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            androidx.core.view.α r0 = r0.f13451
            r0.mo428(r1, r2)
            return
    }
}
