package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class yw0 {

    /* JADX INFO: renamed from: ε */
    public int f12857;

    /* JADX INFO: renamed from: ζ */
    public int f12858;

    /* JADX INFO: renamed from: η */
    public int f12859;

    /* JADX INFO: renamed from: θ */
    public java.lang.Object f12860;

    public yw0() {
            r2 = this;
            r2.<init>()
            zz1 r2 = p000.zz1.f13384
            if (r2 != 0) goto L11
            zz1 r2 = new zz1
            r0 = 9
            r1 = 0
            r2.<init>(r0, r1)
            p000.zz1.f13384 = r2
        L11:
            return
    }

    public boolean hasNext() {
            r1 = this;
            int r0 = r1.f12857
            java.lang.Object r1 = r1.f12860
            zw0 r1 = (p000.zw0) r1
            int r1 = r1.f13333
            if (r0 >= r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public void remove() {
            r3 = this;
            java.lang.Object r0 = r3.f12860
            zw0 r0 = (p000.zw0) r0
            r3.m7041()
            int r1 = r3.f12858
            r2 = -1
            if (r1 == r2) goto L1b
            r0.m7242()
            int r1 = r3.f12858
            r0.m7250(r1)
            r3.f12858 = r2
            int r0 = r0.f13335
            r3.f12859 = r0
            return
        L1b:
            java.lang.String r3 = "Call next() before removing element from the iterator."
            p000.C1080.m7279(r3)
            return
    }

    /* JADX INFO: renamed from: α */
    public int m7040(int r2) {
            r1 = this;
            int r0 = r1.f12859
            if (r2 >= r0) goto L10
            java.lang.Object r0 = r1.f12860
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r1.f12858
            int r1 = r1 + r2
            short r1 = r0.getShort(r1)
            return r1
        L10:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: β */
    public void m7041() {
            r1 = this;
            java.lang.Object r0 = r1.f12860
            zw0 r0 = (p000.zw0) r0
            int r0 = r0.f13335
            int r1 = r1.f12859
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: γ */
    public abstract java.lang.Object mo4811(android.view.View r1);

    /* JADX INFO: renamed from: δ */
    public abstract void mo4812(android.view.View r1, java.lang.Object r2);

    /* JADX INFO: renamed from: ε */
    public void m7042() {
            r3 = this;
        L0:
            int r0 = r3.f12857
            java.lang.Object r1 = r3.f12860
            zw0 r1 = (p000.zw0) r1
            int r2 = r1.f13333
            if (r0 >= r2) goto L15
            int[] r1 = r1.f13330
            r1 = r1[r0]
            if (r1 >= 0) goto L15
            int r0 = r0 + 1
            r3.f12857 = r0
            goto L0
        L15:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public void m7043(android.view.View r5, java.lang.CharSequence r6) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r4.f12858
            if (r0 < r1) goto La
            r4.mo4812(r5, r6)
            return
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r4.f12858
            r2 = 0
            if (r0 < r1) goto L16
            java.lang.Object r0 = r4.mo4811(r5)
            goto L28
        L16:
            int r0 = r4.f12857
            java.lang.Object r0 = r5.getTag(r0)
            java.lang.Object r1 = r4.f12860
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r0)
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = r2
        L28:
            boolean r0 = r4.mo4813(r0, r6)
            if (r0 == 0) goto Lfe
            java.util.WeakHashMap r0 = p000.b92.f1572
            android.view.View$AccessibilityDelegate r0 = p000.y82.m6839(r5)
            if (r0 != 0) goto L37
            goto L45
        L37:
            boolean r1 = r0 instanceof p000.C1116
            if (r1 == 0) goto L40
            о r0 = (p000.C1116) r0
            androidx.core.view.α r2 = r0.f13451
            goto L45
        L40:
            androidx.core.view.α r2 = new androidx.core.view.α
            r2.<init>(r0)
        L45:
            if (r2 != 0) goto L4c
            androidx.core.view.α r2 = new androidx.core.view.α
            r2.<init>()
        L4c:
            p000.b92.m828(r5, r2)
            int r0 = r4.f12857
            r5.setTag(r0, r6)
            int r4 = r4.f12859
            android.content.Context r6 = r5.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r6 = (android.view.accessibility.AccessibilityManager) r6
            boolean r0 = r6.isEnabled()
            if (r0 != 0) goto L6a
            goto Lfe
        L6a:
            java.lang.CharSequence r0 = p000.x82.m6519(r5)
            r1 = 1
            if (r0 == 0) goto L7f
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L7f
            int r0 = r5.getWindowVisibility()
            if (r0 != 0) goto L7f
            r0 = r1
            goto L80
        L7f:
            r0 = 0
        L80:
            int r2 = r5.getAccessibilityLiveRegion()
            r3 = 32
            if (r2 != 0) goto Ld6
            if (r0 == 0) goto L8b
            goto Ld6
        L8b:
            if (r4 != r3) goto Laf
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            r5.onInitializeAccessibilityEvent(r0)
            r0.setEventType(r3)
            r0.setContentChangeTypes(r4)
            r0.setSource(r5)
            r5.onPopulateAccessibilityEvent(r0)
            java.util.List r4 = r0.getText()
            java.lang.CharSequence r5 = p000.x82.m6519(r5)
            r4.add(r5)
            r6.sendAccessibilityEvent(r0)
            return
        Laf:
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto Lfe
            android.view.ViewParent r6 = r5.getParent()
            r6.notifySubtreeAccessibilityStateChanged(r5, r5, r4)     // Catch: java.lang.AbstractMethodError -> Lbd
            return
        Lbd:
            r4 = move-exception
            android.view.ViewParent r5 = r5.getParent()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r6 = " does not fully implement ViewParent"
            java.lang.String r5 = r5.concat(r6)
            java.lang.String r6 = "ViewCompat"
            android.util.Log.e(r6, r5, r4)
            return
        Ld6:
            android.view.accessibility.AccessibilityEvent r6 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r0 == 0) goto Ldd
            goto Ldf
        Ldd:
            r3 = 2048(0x800, float:2.87E-42)
        Ldf:
            r6.setEventType(r3)
            r6.setContentChangeTypes(r4)
            if (r0 == 0) goto Lfb
            java.util.List r4 = r6.getText()
            java.lang.CharSequence r0 = p000.x82.m6519(r5)
            r4.add(r0)
            int r4 = r5.getImportantForAccessibility()
            if (r4 != 0) goto Lfb
            r5.setImportantForAccessibility(r1)
        Lfb:
            r5.sendAccessibilityEventUnchecked(r6)
        Lfe:
            return
    }

    /* JADX INFO: renamed from: η */
    public abstract boolean mo4813(java.lang.Object r1, java.lang.Object r2);
}
