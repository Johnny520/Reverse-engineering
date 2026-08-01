package defpackage;

/* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1195 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final android.view.View.AccessibilityDelegate f5395 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.view.View.AccessibilityDelegate f5396;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0256 f5397;

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            defpackage.C1195.f5395 = r0
            return
    }

    public C1195() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = defpackage.C1195.f5395
            r1.<init>(r0)
            return
    }

    public C1195(android.view.View.AccessibilityDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.f5396 = r1
            ᛲᛲᛸᲈ r1 = new ᛲᛲᛸᲈ
            r1.<init>(r0)
            r0.f5397 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public void mo973(android.view.View r1, int r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f5396
            r0.sendAccessibilityEvent(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public void mo974(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f5396
            r0.sendAccessibilityEventUnchecked(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public void mo975(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f5396
            r0.onPopulateAccessibilityEvent(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public void mo976(android.view.View r1, defpackage.C2060 r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f5396
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f8857
            r0.onInitializeAccessibilityNodeInfo(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo977(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f5396
            r0.onInitializeAccessibilityEvent(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public boolean mo978(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f5396
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public defpackage.C1606 mo979(android.view.View r2) {
            r1 = this;
            android.view.View$AccessibilityDelegate r1 = r1.f5396
            android.view.accessibility.AccessibilityNodeProvider r1 = r1.getAccessibilityNodeProvider(r2)
            if (r1 == 0) goto Lf
            ᛸᲈᛸᲈ r2 = new ᛸᲈᛸᲈ
            r0 = 1
            r2.<init>(r0, r1)
            return r2
        Lf:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public boolean mo980(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f5396
            boolean r0 = r0.onRequestSendAccessibilityEvent(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public boolean mo981(android.view.View r5, int r6, android.os.Bundle r7) {
            r4 = this;
            r0 = 1711866851(0x660903e3, float:1.6175898E23)
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
            ᛳᛳᛳᲈ r3 = (defpackage.C0436) r3
            java.lang.Object r3 = r3.f2143
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r3 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r3
            int r3 = r3.getId()
            if (r3 != r6) goto L26
            goto L29
        L26:
            int r2 = r2 + 1
            goto Lf
        L29:
            android.view.View$AccessibilityDelegate r4 = r4.f5396
            boolean r4 = r4.performAccessibilityAction(r5, r6, r7)
            if (r4 != 0) goto L8e
            r0 = 1711865868(0x6609000c, float:1.6174127E23)
            if (r6 != r0) goto L8e
            if (r7 == 0) goto L8e
            java.lang.String r4 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r6 = -1
            int r4 = r7.getInt(r4, r6)
            r6 = 1711866852(0x660903e4, float:1.61759E23)
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
}
