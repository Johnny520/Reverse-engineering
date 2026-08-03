package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7796 extends Yue.C0104 {
    private final androidx.recyclerview.widget.C7796.C7797 mItemDelegate;
    final androidx.recyclerview.widget.RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۢ$ۥ, reason: contains not printable characters */
    public static class C7797 extends Yue.C0104 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.recyclerview.widget.C7796 f30067;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.util.Map<android.view.View, Yue.C0104> f30068;

        public C7797(@Yue.InterfaceC4410 androidx.recyclerview.widget.C7796 r2) {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.f30068 = r0
                r1.f30067 = r2
                return
        }

        @Override // Yue.C0104
        public boolean dispatchPopulateAccessibilityEvent(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r1.f30068
                java.lang.Object r0 = r0.get(r2)
                Yue.ۥۣ۟۟ۢ r0 = (Yue.C0104) r0
                if (r0 == 0) goto Lf
                boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
                return r2
            Lf:
                boolean r2 = super.dispatchPopulateAccessibilityEvent(r2, r3)
                return r2
        }

        @Override // Yue.C0104
        @Yue.InterfaceC4544
        public Yue.C0155 getAccessibilityNodeProvider(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r1.f30068
                java.lang.Object r0 = r0.get(r2)
                Yue.ۥۣ۟۟ۢ r0 = (Yue.C0104) r0
                if (r0 == 0) goto Lf
                Yue.ۥ۟۟ۦۡ r2 = r0.getAccessibilityNodeProvider(r2)
                return r2
            Lf:
                Yue.ۥ۟۟ۦۡ r2 = super.getAccessibilityNodeProvider(r2)
                return r2
        }

        @Override // Yue.C0104
        public void onInitializeAccessibilityEvent(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r1.f30068
                java.lang.Object r0 = r0.get(r2)
                Yue.ۥۣ۟۟ۢ r0 = (Yue.C0104) r0
                if (r0 == 0) goto Le
                r0.onInitializeAccessibilityEvent(r2, r3)
                goto L11
            Le:
                super.onInitializeAccessibilityEvent(r2, r3)
            L11:
                return
        }

        @Override // Yue.C0104
        public void onInitializeAccessibilityNodeInfo(android.view.View r2, Yue.C0140 r3) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۠ۢ r0 = r1.f30067
                boolean r0 = r0.shouldIgnore()
                if (r0 != 0) goto L2f
                androidx.recyclerview.widget.ۥ۟۟۠ۢ r0 = r1.f30067
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.getLayoutManager()
                if (r0 == 0) goto L2f
                androidx.recyclerview.widget.ۥ۟۟۠ۢ r0 = r1.f30067
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.getLayoutManager()
                r0.onInitializeAccessibilityNodeInfoForItem(r2, r3)
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r1.f30068
                java.lang.Object r0 = r0.get(r2)
                Yue.ۥۣ۟۟ۢ r0 = (Yue.C0104) r0
                if (r0 == 0) goto L2b
                r0.onInitializeAccessibilityNodeInfo(r2, r3)
                goto L32
            L2b:
                super.onInitializeAccessibilityNodeInfo(r2, r3)
                goto L32
            L2f:
                super.onInitializeAccessibilityNodeInfo(r2, r3)
            L32:
                return
        }

        @Override // Yue.C0104
        public void onPopulateAccessibilityEvent(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r1.f30068
                java.lang.Object r0 = r0.get(r2)
                Yue.ۥۣ۟۟ۢ r0 = (Yue.C0104) r0
                if (r0 == 0) goto Le
                r0.onPopulateAccessibilityEvent(r2, r3)
                goto L11
            Le:
                super.onPopulateAccessibilityEvent(r2, r3)
            L11:
                return
        }

        @Override // Yue.C0104
        public boolean onRequestSendAccessibilityEvent(@Yue.InterfaceC4410 android.view.ViewGroup r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r1.f30068
                java.lang.Object r0 = r0.get(r2)
                Yue.ۥۣ۟۟ۢ r0 = (Yue.C0104) r0
                if (r0 == 0) goto Lf
                boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
            Lf:
                boolean r2 = super.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
        }

        @Override // Yue.C0104
        public boolean performAccessibilityAction(android.view.View r3, int r4, android.os.Bundle r5) {
                r2 = this;
                androidx.recyclerview.widget.ۥ۟۟۠ۢ r0 = r2.f30067
                boolean r0 = r0.shouldIgnore()
                if (r0 != 0) goto L38
                androidx.recyclerview.widget.ۥ۟۟۠ۢ r0 = r2.f30067
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.getLayoutManager()
                if (r0 == 0) goto L38
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r2.f30068
                java.lang.Object r0 = r0.get(r3)
                Yue.ۥۣ۟۟ۢ r0 = (Yue.C0104) r0
                r1 = 1
                if (r0 == 0) goto L24
                boolean r0 = r0.performAccessibilityAction(r3, r4, r5)
                if (r0 == 0) goto L2b
                return r1
            L24:
                boolean r0 = super.performAccessibilityAction(r3, r4, r5)
                if (r0 == 0) goto L2b
                return r1
            L2b:
                androidx.recyclerview.widget.ۥ۟۟۠ۢ r0 = r2.f30067
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.getLayoutManager()
                boolean r3 = r0.performAccessibilityActionForItem(r3, r4, r5)
                return r3
            L38:
                boolean r3 = super.performAccessibilityAction(r3, r4, r5)
                return r3
        }

        @Override // Yue.C0104
        public void sendAccessibilityEvent(@Yue.InterfaceC4410 android.view.View r2, int r3) {
                r1 = this;
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r1.f30068
                java.lang.Object r0 = r0.get(r2)
                Yue.ۥۣ۟۟ۢ r0 = (Yue.C0104) r0
                if (r0 == 0) goto Le
                r0.sendAccessibilityEvent(r2, r3)
                goto L11
            Le:
                super.sendAccessibilityEvent(r2, r3)
            L11:
                return
        }

        @Override // Yue.C0104
        public void sendAccessibilityEventUnchecked(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r1.f30068
                java.lang.Object r0 = r0.get(r2)
                Yue.ۥۣ۟۟ۢ r0 = (Yue.C0104) r0
                if (r0 == 0) goto Le
                r0.sendAccessibilityEventUnchecked(r2, r3)
                goto L11
            Le:
                super.sendAccessibilityEventUnchecked(r2, r3)
            L11:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C0104 m30265(android.view.View r2) {
                r1 = this;
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r0 = r1.f30068
                java.lang.Object r2 = r0.remove(r2)
                Yue.ۥۣ۟۟ۢ r2 = (Yue.C0104) r2
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30266(android.view.View r3) {
                r2 = this;
                Yue.ۥۣ۟۟ۢ r0 = Yue.C6794.m26116(r3)
                if (r0 == 0) goto Ld
                if (r0 == r2) goto Ld
                java.util.Map<android.view.View, Yue.ۥۣ۟۟ۢ> r1 = r2.f30068
                r1.put(r3, r0)
            Ld:
                return
        }
    }

    public C7796(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            r1.<init>()
            r1.mRecyclerView = r2
            Yue.ۥۣ۟۟ۢ r2 = r1.getItemDelegate()
            if (r2 == 0) goto L14
            boolean r0 = r2 instanceof androidx.recyclerview.widget.C7796.C7797
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.ۥ۟۟۠ۢ$ۥ r2 = (androidx.recyclerview.widget.C7796.C7797) r2
            r1.mItemDelegate = r2
            goto L1b
        L14:
            androidx.recyclerview.widget.ۥ۟۟۠ۢ$ۥ r2 = new androidx.recyclerview.widget.ۥ۟۟۠ۢ$ۥ
            r2.<init>(r1)
            r1.mItemDelegate = r2
        L1b:
            return
    }

    @Yue.InterfaceC4410
    public Yue.C0104 getItemDelegate() {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۠ۢ$ۥ r0 = r1.mItemDelegate
            return r0
    }

    @Override // Yue.C0104
    public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2, r3)
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L1c
            boolean r0 = r1.shouldIgnore()
            if (r0 != 0) goto L1c
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.getLayoutManager()
            if (r0 == 0) goto L1c
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r2 = r2.getLayoutManager()
            r2.onInitializeAccessibilityEvent(r3)
        L1c:
            return
    }

    @Override // Yue.C0104
    public void onInitializeAccessibilityNodeInfo(android.view.View r1, Yue.C0140 r2) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1, r2)
            boolean r1 = r0.shouldIgnore()
            if (r1 != 0) goto L1a
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r1.getLayoutManager()
            if (r1 == 0) goto L1a
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r1.getLayoutManager()
            r1.onInitializeAccessibilityNodeInfo(r2)
        L1a:
            return
    }

    @Override // Yue.C0104
    public boolean performAccessibilityAction(android.view.View r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r1 = super.performAccessibilityAction(r1, r2, r3)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            boolean r1 = r0.shouldIgnore()
            if (r1 != 0) goto L21
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r1.getLayoutManager()
            if (r1 == 0) goto L21
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r1.getLayoutManager()
            boolean r1 = r1.performAccessibilityAction(r2, r3)
            return r1
        L21:
            r1 = 0
            return r1
    }

    public boolean shouldIgnore() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            boolean r0 = r0.hasPendingAdapterUpdates()
            return r0
    }
}
