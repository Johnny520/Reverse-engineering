package androidx.core.view.insets;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: η */
    public static final java.lang.Object f1015 = null;

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f1016;

    /* JADX INFO: renamed from: ζ */
    public p000.yj1 f1017;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.view.insets.ProtectionLayout.f1015 = r0
            return
    }

    public ProtectionLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1016 = r1
            return
    }

    public ProtectionLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public ProtectionLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ProtectionLayout(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1016 = r1
            return
    }

    private androidx.core.view.insets.C0044 getOrInstallSystemBarStateMonitor() {
            r3 = this;
            android.view.View r3 = r3.getRootView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 2131296993(0x7f0902e1, float:1.8211918E38)
            java.lang.Object r1 = r3.getTag(r0)
            boolean r2 = r1 instanceof androidx.core.view.insets.C0044
            if (r2 == 0) goto L14
            androidx.core.view.insets.α r1 = (androidx.core.view.insets.C0044) r1
            return r1
        L14:
            androidx.core.view.insets.α r1 = new androidx.core.view.insets.α
            r1.<init>(r3)
            r3.setTag(r0, r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            if (r3 == 0) goto L20
            java.lang.Object r0 = r3.getTag()
            java.lang.Object r1 = androidx.core.view.insets.ProtectionLayout.f1015
            if (r0 == r1) goto L20
            yj1 r0 = r2.f1017
            if (r0 == 0) goto L15
            java.util.ArrayList r0 = r0.f12649
            int r0 = r0.size()
            goto L16
        L15:
            r0 = 0
        L16:
            int r1 = r2.getChildCount()
            int r1 = r1 - r0
            if (r4 > r1) goto L1f
            if (r4 >= 0) goto L20
        L1f:
            r4 = r1
        L20:
            super.addView(r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            yj1 r0 = r1.f1017
            if (r0 == 0) goto La
            r1.m419()
        La:
            r1.m418()
            r1.requestApplyInsets()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r5 = this;
            super.onDetachedFromWindow()
            r5.m419()
            android.view.View r5 = r5.getRootView()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0 = 2131296993(0x7f0902e1, float:1.8211918E38)
            java.lang.Object r1 = r5.getTag(r0)
            boolean r2 = r1 instanceof androidx.core.view.insets.C0044
            if (r2 != 0) goto L18
            goto L22
        L18:
            androidx.core.view.insets.α r1 = (androidx.core.view.insets.C0044) r1
            java.util.ArrayList r2 = r1.f1021
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L23
        L22:
            return
        L23:
            android.view.View r2 = r1.f1020
            ν r3 = new ν
            r4 = 26
            r3.<init>(r4, r1)
            r2.post(r3)
            r1 = 0
            r5.setTag(r0, r1)
            return
    }

    public void setProtections(java.util.List<java.lang.Object> r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f1016
            r0.clear()
            r0.addAll(r2)
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto L17
            r1.m419()
            r1.m418()
            r1.requestApplyInsets()
        L17:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m418() {
            r3 = this;
            java.util.ArrayList r0 = r3.f1016
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9
            goto L21
        L9:
            androidx.core.view.insets.α r1 = r3.getOrInstallSystemBarStateMonitor()
            yj1 r2 = new yj1
            r2.<init>(r1, r0)
            r3.f1017 = r2
            r3.getChildCount()
            yj1 r0 = r3.f1017
            java.util.ArrayList r0 = r0.f12649
            int r0 = r0.size()
            if (r0 > 0) goto L22
        L21:
            return
        L22:
            yj1 r0 = r3.f1017
            r1 = 0
            java.util.ArrayList r0 = r0.f12649
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L31
            p000.C1080.m7264()
            return
        L31:
            r3.getContext()
            r3 = 0
            throw r3
    }

    /* JADX INFO: renamed from: β */
    public final void m419() {
            r4 = this;
            yj1 r0 = r4.f1017
            if (r0 == 0) goto L54
            int r0 = r4.getChildCount()
            yj1 r1 = r4.f1017
            java.util.ArrayList r1 = r1.f12649
            int r1 = r1.size()
            int r0 = r0 - r1
            yj1 r1 = r4.f1017
            java.util.ArrayList r1 = r1.f12649
            int r1 = r1.size()
            r4.removeViews(r0, r1)
            yj1 r0 = r4.f1017
            java.util.ArrayList r0 = r0.f12649
            int r0 = r0.size()
            yj1 r1 = r4.f1017
            if (r0 > 0) goto L4c
            java.util.ArrayList r0 = r1.f12649
            boolean r2 = r1.f12652
            if (r2 == 0) goto L2f
            goto L43
        L2f:
            r2 = 1
            r1.f12652 = r2
            androidx.core.view.insets.α r3 = r1.f12650
            java.util.ArrayList r3 = r3.f1021
            r3.remove(r1)
            int r1 = r0.size()
            int r1 = r1 - r2
            if (r1 >= 0) goto L47
            r0.clear()
        L43:
            r0 = 0
            r4.f1017 = r0
            return
        L47:
            java.lang.ClassCastException r4 = p000.lz1.m3685(r1, r0)
            throw r4
        L4c:
            r4 = 0
            java.util.ArrayList r0 = r1.f12649
            java.lang.ClassCastException r4 = p000.lz1.m3685(r4, r0)
            throw r4
        L54:
            return
    }
}
