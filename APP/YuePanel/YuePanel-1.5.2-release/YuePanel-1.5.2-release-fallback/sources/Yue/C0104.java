package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0104 {
    private static final android.view.View.AccessibilityDelegate DEFAULT_DELEGATE = null;
    private final android.view.View.AccessibilityDelegate mBridge;
    private final android.view.View.AccessibilityDelegate mOriginalDelegate;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۢ$ۥ, reason: contains not printable characters */
    public static final class C0105 extends android.view.View.AccessibilityDelegate {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C0104 f197;

        public C0105(Yue.C0104 r1) {
                r0 = this;
                r0.<init>()
                r0.f197 = r1
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                Yue.ۥۣ۟۟ۢ r0 = r1.f197
                boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r2) {
                r1 = this;
                Yue.ۥۣ۟۟ۢ r0 = r1.f197
                Yue.ۥ۟۟ۦۡ r2 = r0.getAccessibilityNodeProvider(r2)
                if (r2 == 0) goto Lf
                java.lang.Object r2 = r2.m864()
                android.view.accessibility.AccessibilityNodeProvider r2 = (android.view.accessibility.AccessibilityNodeProvider) r2
                goto L10
            Lf:
                r2 = 0
            L10:
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                Yue.ۥۣ۟۟ۢ r0 = r1.f197
                r0.onInitializeAccessibilityEvent(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View r3, android.view.accessibility.AccessibilityNodeInfo r4) {
                r2 = this;
                Yue.ۥ۟۟ۥۧ r0 = Yue.C0140.m624(r4)
                boolean r1 = Yue.C6794.m26193(r3)
                r0.m772(r1)
                boolean r1 = Yue.C6794.m26180(r3)
                r0.m749(r1)
                java.lang.CharSequence r1 = Yue.C6794.m26121(r3)
                r0.m764(r1)
                java.lang.CharSequence r1 = Yue.C6794.m26162(r3)
                r0.m778(r1)
                Yue.ۥۣ۟۟ۢ r1 = r2.f197
                r1.onInitializeAccessibilityNodeInfo(r3, r0)
                java.lang.CharSequence r4 = r4.getText()
                r0.m631(r4, r3)
                java.util.List r3 = Yue.C0104.getActionList(r3)
                r4 = 0
            L31:
                int r1 = r3.size()
                if (r4 >= r1) goto L43
                java.lang.Object r1 = r3.get(r4)
                Yue.ۥ۟۟ۥۧ$ۥ r1 = (Yue.C0140.C0141) r1
                r0.m627(r1)
                int r4 = r4 + 1
                goto L31
            L43:
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                Yue.ۥۣ۟۟ۢ r0 = r1.f197
                r0.onPopulateAccessibilityEvent(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                Yue.ۥۣ۟۟ۢ r0 = r1.f197
                boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View r2, int r3, android.os.Bundle r4) {
                r1 = this;
                Yue.ۥۣ۟۟ۢ r0 = r1.f197
                boolean r2 = r0.performAccessibilityAction(r2, r3, r4)
                return r2
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(android.view.View r2, int r3) {
                r1 = this;
                Yue.ۥۣ۟۟ۢ r0 = r1.f197
                r0.sendAccessibilityEvent(r2, r3)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                Yue.ۥۣ۟۟ۢ r0 = r1.f197
                r0.sendAccessibilityEventUnchecked(r2, r3)
                return
        }
    }

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            Yue.C0104.DEFAULT_DELEGATE = r0
            return
    }

    public C0104() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = Yue.C0104.DEFAULT_DELEGATE
            r1.<init>(r0)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public C0104(@Yue.InterfaceC4410 android.view.View.AccessibilityDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.mOriginalDelegate = r1
            Yue.ۥۣ۟۟ۢ$ۥ r1 = new Yue.ۥۣ۟۟ۢ$ۥ
            r1.<init>(r0)
            r0.mBridge = r1
            return
    }

    public static java.util.List<Yue.C0140.C0141> getActionList(android.view.View r1) {
            int r0 = Yue.C5172.C5177.f19441
            java.lang.Object r1 = r1.getTag(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto Le
            java.util.List r1 = java.util.Collections.emptyList()
        Le:
            return r1
    }

    public boolean dispatchPopulateAccessibilityEvent(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
            return r2
    }

    @Yue.InterfaceC4544
    public Yue.C0155 getAccessibilityNodeProvider(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            android.view.accessibility.AccessibilityNodeProvider r2 = r0.getAccessibilityNodeProvider(r2)
            if (r2 == 0) goto Le
            Yue.ۥ۟۟ۦۡ r0 = new Yue.ۥ۟۟ۦۡ
            r0.<init>(r2)
            return r0
        Le:
            r2 = 0
            return r2
    }

    public android.view.View.AccessibilityDelegate getBridge() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mBridge
            return r0
    }

    public void onInitializeAccessibilityEvent(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.onInitializeAccessibilityEvent(r2, r3)
            return
    }

    public void onInitializeAccessibilityNodeInfo(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 Yue.C0140 r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.m792()
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            return
    }

    public void onPopulateAccessibilityEvent(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.onPopulateAccessibilityEvent(r2, r3)
            return
    }

    public boolean onRequestSendAccessibilityEvent(@Yue.InterfaceC4410 android.view.ViewGroup r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r2
    }

    public boolean performAccessibilityAction(@Yue.InterfaceC4410 android.view.View r6, int r7, @Yue.InterfaceC4544 android.os.Bundle r8) {
            r5 = this;
            java.util.List r0 = getActionList(r6)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0.size()
            if (r2 >= r3) goto L20
            java.lang.Object r3 = r0.get(r2)
            Yue.ۥ۟۟ۥۧ$ۥ r3 = (Yue.C0140.C0141) r3
            int r4 = r3.m794()
            if (r4 != r7) goto L1d
            boolean r1 = r3.m796(r6, r8)
            goto L20
        L1d:
            int r2 = r2 + 1
            goto L6
        L20:
            if (r1 != 0) goto L28
            android.view.View$AccessibilityDelegate r0 = r5.mOriginalDelegate
            boolean r1 = r0.performAccessibilityAction(r6, r7, r8)
        L28:
            if (r1 != 0) goto L3b
            int r0 = Yue.C5172.C5177.f19384
            if (r7 != r0) goto L3b
            if (r8 == 0) goto L3b
            java.lang.String r7 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r7 = r8.getInt(r7, r0)
            boolean r1 = r5.m570(r7, r6)
        L3b:
            return r1
    }

    public void sendAccessibilityEvent(@Yue.InterfaceC4410 android.view.View r2, int r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.sendAccessibilityEvent(r2, r3)
            return
    }

    public void sendAccessibilityEventUnchecked(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.mOriginalDelegate
            r0.sendAccessibilityEventUnchecked(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m569(android.text.style.ClickableSpan r4, android.view.View r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L22
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.createAccessibilityNodeInfo()
            java.lang.CharSequence r5 = r5.getText()
            android.text.style.ClickableSpan[] r5 = Yue.C0140.m619(r5)
            r1 = r0
        L10:
            if (r5 == 0) goto L22
            int r2 = r5.length
            if (r1 >= r2) goto L22
            r2 = r5[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1f
            r4 = 1
            return r4
        L1f:
            int r1 = r1 + 1
            goto L10
        L22:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m570(int r2, android.view.View r3) {
            r1 = this;
            int r0 = Yue.C5172.C5177.f19442
            java.lang.Object r0 = r3.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L23
            java.lang.Object r2 = r0.get(r2)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L23
            java.lang.Object r2 = r2.get()
            android.text.style.ClickableSpan r2 = (android.text.style.ClickableSpan) r2
            boolean r0 = r1.m569(r2, r3)
            if (r0 == 0) goto L23
            r2.onClick(r3)
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }
}
