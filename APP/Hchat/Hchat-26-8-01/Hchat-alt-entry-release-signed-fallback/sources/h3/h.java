package h3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends android.view.accessibility.AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.x f5069a;

    public h(androidx.lifecycle.x r1) {
            r0 = this;
            r0.<init>()
            r0.f5069a = r1
            return
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int r2, android.view.accessibility.AccessibilityNodeInfo r3, java.lang.String r4, android.os.Bundle r5) {
            r1 = this;
            h3.g r0 = new h3.g
            r0.<init>(r3)
            androidx.lifecycle.x r3 = r1.f5069a
            r3.f(r2, r0, r4, r5)
            return
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
            r1 = this;
            androidx.lifecycle.x r0 = r1.f5069a
            h3.g r2 = r0.l(r2)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f5066a
            return r2
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final java.util.List findAccessibilityNodeInfosByText(java.lang.String r1, int r2) {
            r0 = this;
            androidx.lifecycle.x r1 = r0.f5069a
            r1.getClass()
            r1 = 0
            return r1
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
            r1 = this;
            androidx.lifecycle.x r0 = r1.f5069a
            h3.g r2 = r0.r(r2)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f5066a
            return r2
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            androidx.lifecycle.x r0 = r1.f5069a
            boolean r2 = r0.H(r2, r3, r4)
            return r2
    }
}
