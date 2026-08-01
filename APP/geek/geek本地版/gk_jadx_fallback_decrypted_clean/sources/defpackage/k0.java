package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends android.view.accessibility.AccessibilityNodeProvider {
    public final defpackage.l0 a;

    public k0(defpackage.l0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int r1, android.view.accessibility.AccessibilityNodeInfo r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            l0 r1 = r0.a
            r1.getClass()
            return
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
            r1 = this;
            l0 r0 = r1.a
            j0 r2 = r0.t(r2)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.a
            return r2
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final java.util.List findAccessibilityNodeInfosByText(java.lang.String r1, int r2) {
            r0 = this;
            l0 r1 = r0.a
            r1.getClass()
            r1 = 0
            return r1
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
            r1 = this;
            l0 r0 = r1.a
            j0 r2 = r0.u(r2)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.a
            return r2
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            l0 r0 = r1.a
            boolean r2 = r0.w(r2, r3, r4)
            return r2
    }
}
