package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲁᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0805 extends xhss.AbstractC0231 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.ref.WeakReference f2624;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.ref.WeakReference f2625;

    public C0805(xhss.AbstractC0796 r2, xhss.C1193 r3) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f2625 = r0
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.f2624 = r2
            return
    }

    @Override // xhss.AbstractC0231
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo538() {
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.f2625
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.ref.WeakReference r5 = r5.f2624
            java.lang.Object r5 = r5.get()
            android.text.InputFilter r5 = (android.text.InputFilter) r5
            if (r5 == 0) goto L6d
            if (r0 != 0) goto L15
            goto L6d
        L15:
            android.text.InputFilter[] r1 = r0.getFilters()
            if (r1 != 0) goto L1c
            goto L6d
        L1c:
            r2 = 0
            r3 = r2
        L1e:
            int r4 = r1.length
            if (r3 >= r4) goto L6d
            r4 = r1[r3]
            if (r4 != r5) goto L6a
            boolean r5 = r0.isAttachedToWindow()
            if (r5 == 0) goto L6d
            java.lang.CharSequence r5 = r0.getText()
            xhss.ᛵᲁᛱᲁ r1 = xhss.C0514.m921()
            if (r5 != 0) goto L37
            r3 = r2
            goto L3e
        L37:
            r1.getClass()
            int r3 = r5.length()
        L3e:
            java.lang.CharSequence r1 = r1.m924(r5, r2, r3)
            if (r5 != r1) goto L45
            goto L6d
        L45:
            int r5 = android.text.Selection.getSelectionStart(r1)
            int r2 = android.text.Selection.getSelectionEnd(r1)
            r0.setText(r1)
            boolean r0 = r1 instanceof android.text.Spannable
            if (r0 == 0) goto L6d
            android.text.Spannable r1 = (android.text.Spannable) r1
            if (r5 < 0) goto L5e
            if (r2 < 0) goto L5e
            android.text.Selection.setSelection(r1, r5, r2)
            return
        L5e:
            if (r5 < 0) goto L64
            android.text.Selection.setSelection(r1, r5)
            return
        L64:
            if (r2 < 0) goto L6d
            android.text.Selection.setSelection(r1, r2)
            return
        L6a:
            int r3 = r3 + 1
            goto L1e
        L6d:
            return
    }
}
