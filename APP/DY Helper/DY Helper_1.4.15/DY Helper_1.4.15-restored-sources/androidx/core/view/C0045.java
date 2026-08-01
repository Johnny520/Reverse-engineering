package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0045 {

    /* JADX INFO: renamed from: η */
    public static final android.view.View.AccessibilityDelegate f1025 = null;

    /* JADX INFO: renamed from: ε */
    public final android.view.View.AccessibilityDelegate f1026;

    /* JADX INFO: renamed from: ζ */
    public final p000.C1116 f1027;

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            androidx.core.view.C0045.f1025 = r0
            return
    }

    public C0045() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = androidx.core.view.C0045.f1025
            r1.<init>(r0)
            return
    }

    public C0045(android.view.View.AccessibilityDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.f1026 = r1
            о r1 = new о
            r1.<init>(r0)
            r0.f1027 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public boolean mo420(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f1026
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public p000.C0568n mo421(android.view.View r2) {
            r1 = this;
            android.view.View$AccessibilityDelegate r1 = r1.f1026
            android.view.accessibility.AccessibilityNodeProvider r1 = r1.getAccessibilityNodeProvider(r2)
            if (r1 == 0) goto Lf
            n r2 = new n
            r0 = 1
            r2.<init>(r0, r1)
            return r2
        Lf:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public void mo422(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f1026
            r0.onInitializeAccessibilityEvent(r1, r2)
            return
    }

    /* JADX INFO: renamed from: δ */
    public void mo423(android.view.View r1, p000.C1128 r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f1026
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f13478
            r0.onInitializeAccessibilityNodeInfo(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ε */
    public void mo424(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f1026
            r0.onPopulateAccessibilityEvent(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public boolean mo425(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f1026
            boolean r0 = r0.onRequestSendAccessibilityEvent(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public boolean mo426(android.view.View r5, int r6, android.os.Bundle r7) {
            r4 = this;
            r0 = 2131296983(0x7f0902d7, float:1.8211898E38)
            java.lang.Object r0 = r5.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Ld
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        Ld:
            r1 = 0
            r2 = r1
        Lf:
            int r3 = r0.size()
            if (r2 >= r3) goto L29
            java.lang.Object r3 = r0.get(r2)
            ч r3 = (p000.C1125) r3
            java.lang.Object r3 = r3.f13476
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r3 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r3
            int r3 = r3.getId()
            if (r3 != r6) goto L26
            goto L29
        L26:
            int r2 = r2 + 1
            goto Lf
        L29:
            android.view.View$AccessibilityDelegate r4 = r4.f1026
            boolean r4 = r4.performAccessibilityAction(r5, r6, r7)
            if (r4 != 0) goto L8e
            r0 = 2131296262(0x7f090006, float:1.8210436E38)
            if (r6 != r0) goto L8e
            if (r7 == 0) goto L8e
            java.lang.String r4 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r6 = -1
            int r4 = r7.getInt(r4, r6)
            r6 = 2131296984(0x7f0902d8, float:1.82119E38)
            java.lang.Object r6 = r5.getTag(r6)
            android.util.SparseArray r6 = (android.util.SparseArray) r6
            if (r6 == 0) goto L8d
            java.lang.Object r4 = r6.get(r4)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            if (r4 == 0) goto L8d
            java.lang.Object r4 = r4.get()
            android.text.style.ClickableSpan r4 = (android.text.style.ClickableSpan) r4
            if (r4 == 0) goto L8d
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.createAccessibilityNodeInfo()
            java.lang.CharSequence r6 = r6.getText()
            boolean r7 = r6 instanceof android.text.Spanned
            if (r7 == 0) goto L76
            r7 = r6
            android.text.Spanned r7 = (android.text.Spanned) r7
            int r6 = r6.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r6 = r7.getSpans(r1, r6, r0)
            android.text.style.ClickableSpan[] r6 = (android.text.style.ClickableSpan[]) r6
            goto L77
        L76:
            r6 = 0
        L77:
            r7 = r1
        L78:
            if (r6 == 0) goto L8d
            int r0 = r6.length
            if (r7 >= r0) goto L8d
            r0 = r6[r7]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L8a
            r4.onClick(r5)
            r4 = 1
            return r4
        L8a:
            int r7 = r7 + 1
            goto L78
        L8d:
            return r1
        L8e:
            return r4
    }

    /* JADX INFO: renamed from: θ */
    public void mo427(android.view.View r1, int r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f1026
            r0.sendAccessibilityEvent(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ι */
    public void mo428(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f1026
            r0.sendAccessibilityEventUnchecked(r1, r2)
            return
    }
}
