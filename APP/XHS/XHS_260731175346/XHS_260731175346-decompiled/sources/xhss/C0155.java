package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛴᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0155 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final android.view.View.AccessibilityDelegate f635 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0029 f636;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.view.View.AccessibilityDelegate f637;

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            xhss.C0155.f635 = r0
            return
    }

    public C0155() {
            r1 = this;
            r1.<init>()
            android.view.View$AccessibilityDelegate r0 = xhss.C0155.f635
            r1.f637 = r0
            xhss.ᛱᛳᲁᲈ r0 = new xhss.ᛱᛳᲁᲈ
            r0.<init>(r1)
            r1.f636 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public void mo396(android.view.View r1, xhss.C0755 r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f637
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f2532
            r0.onInitializeAccessibilityNodeInfo(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean mo397(android.view.View r5, int r6, android.os.Bundle r7) {
            r4 = this;
            r0 = 1678246140(0x640800fc, float:1.0035313E22)
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
            xhss.ᛳᛸᛵᲀ r3 = (xhss.C0299) r3
            java.lang.Object r3 = r3.f1148
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r3 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r3
            int r3 = r3.getId()
            if (r3 != r6) goto L26
            goto L29
        L26:
            int r2 = r2 + 1
            goto Lf
        L29:
            android.view.View$AccessibilityDelegate r4 = r4.f637
            boolean r4 = r4.performAccessibilityAction(r5, r6, r7)
            if (r4 != 0) goto L8e
            r0 = 1678245894(0x64080006, float:1.0035036E22)
            if (r6 != r0) goto L8e
            if (r7 == 0) goto L8e
            java.lang.String r4 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r6 = -1
            int r4 = r7.getInt(r4, r6)
            r6 = 1678246141(0x640800fd, float:1.0035314E22)
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public void mo398(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f637
            r0.onInitializeAccessibilityEvent(r1, r2)
            return
    }
}
