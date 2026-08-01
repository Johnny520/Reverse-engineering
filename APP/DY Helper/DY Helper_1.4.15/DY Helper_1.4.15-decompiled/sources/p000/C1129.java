package p000;

/* JADX INFO: renamed from: ю */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1129 extends android.view.accessibility.AccessibilityNodeProvider {

    /* JADX INFO: renamed from: α */
    public final p000.C0568n f13481;

    public C1129(p000.C0568n r1) {
            r0 = this;
            r0.<init>()
            r0.f13481 = r1
            return
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int r2, android.view.accessibility.AccessibilityNodeInfo r3, java.lang.String r4, android.os.Bundle r5) {
            r1 = this;
            э r0 = new э
            r0.<init>(r3)
            n r1 = r1.f13481
            r1.mo1989(r2, r0, r4, r5)
            return
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r1) {
            r0 = this;
            n r0 = r0.f13481
            э r0 = r0.mo1990(r1)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f13478
            return r0
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final java.util.List findAccessibilityNodeInfosByText(java.lang.String r1, int r2) {
            r0 = this;
            n r0 = r0.f13481
            r0.getClass()
            r0 = 0
            return r0
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int r1) {
            r0 = this;
            n r0 = r0.f13481
            э r0 = r0.mo1991(r1)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f13478
            return r0
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r1, int r2, android.os.Bundle r3) {
            r0 = this;
            n r0 = r0.f13481
            boolean r0 = r0.mo1992(r1, r2, r3)
            return r0
    }
}
