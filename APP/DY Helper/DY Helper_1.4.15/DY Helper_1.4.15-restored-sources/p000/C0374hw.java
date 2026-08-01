package p000;

/* JADX INFO: renamed from: hw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0374hw extends androidx.core.view.C0045 {

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout f4827;

    public C0374hw(androidx.drawerlayout.widget.DrawerLayout r1) {
            r0 = this;
            r0.f4827 = r1
            r0.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: α */
    public final boolean mo420(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r2 = this;
            int r0 = r4.getEventType()
            r1 = 32
            if (r0 != r1) goto L22
            r4.getText()
            androidx.drawerlayout.widget.DrawerLayout r2 = r2.f4827
            android.view.View r3 = r2.m454()
            if (r3 == 0) goto L20
            int r3 = r2.m456(r3)
            java.util.WeakHashMap r4 = p000.b92.f1572
            int r2 = r2.getLayoutDirection()
            android.view.Gravity.getAbsoluteGravity(r3, r2)
        L20:
            r2 = 1
            return r2
        L22:
            android.view.View$AccessibilityDelegate r2 = r2.f1026
            boolean r2 = r2.dispatchPopulateAccessibilityEvent(r3, r4)
            return r2
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: γ */
    public final void mo422(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.mo422(r1, r2)
            java.lang.Class<androidx.drawerlayout.widget.DrawerLayout> r0 = androidx.drawerlayout.widget.DrawerLayout.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: δ */
    public final void mo423(android.view.View r2, p000.C1128 r3) {
            r1 = this;
            int[] r0 = androidx.drawerlayout.widget.DrawerLayout.f1064
            android.view.accessibility.AccessibilityNodeInfo r0 = r3.f13478
            android.view.View$AccessibilityDelegate r1 = r1.f1026
            r1.onInitializeAccessibilityNodeInfo(r2, r0)
            java.lang.Class<androidx.drawerlayout.widget.DrawerLayout> r1 = androidx.drawerlayout.widget.DrawerLayout.class
            java.lang.String r1 = r1.getName()
            r3.m7358(r1)
            r1 = 0
            r0.setFocusable(r1)
            r0.setFocused(r1)
            ч r1 = p000.C1125.f13467
            java.lang.Object r1 = r1.f13476
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r1
            r0.removeAction(r1)
            ч r1 = p000.C1125.f13468
            java.lang.Object r1 = r1.f13476
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r1
            r0.removeAction(r1)
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: ζ */
    public final boolean mo425(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            int[] r0 = androidx.drawerlayout.widget.DrawerLayout.f1064
            android.view.View$AccessibilityDelegate r1 = r1.f1026
            boolean r1 = r1.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r1
    }
}
