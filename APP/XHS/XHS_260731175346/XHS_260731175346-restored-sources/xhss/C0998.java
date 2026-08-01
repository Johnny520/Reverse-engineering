package xhss;

/* JADX INFO: renamed from: xhss.ᲁᲇᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0998 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0663 f3260;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean f3261;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.AbstractC0195 f3262;

    public C0998(xhss.AbstractC0195 r1) {
            r0 = this;
            r0.<init>()
            r0.f3262 = r1
            r1 = 1
            r0.f3261 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1636(android.widget.EditText r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L3d
            if (r4 == 0) goto L3d
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L3d
            android.text.Editable r4 = r4.getEditableText()
            int r5 = android.text.Selection.getSelectionStart(r4)
            int r0 = android.text.Selection.getSelectionEnd(r4)
            xhss.ᛵᲁᛱᲁ r1 = xhss.C0514.m921()
            r2 = 0
            if (r4 != 0) goto L20
            r3 = r2
            goto L27
        L20:
            r1.getClass()
            int r3 = r4.length()
        L27:
            r1.m924(r4, r2, r3)
            if (r5 < 0) goto L32
            if (r0 < 0) goto L32
            android.text.Selection.setSelection(r4, r5, r0)
            return
        L32:
            if (r5 < 0) goto L38
            android.text.Selection.setSelection(r4, r5)
            return
        L38:
            if (r0 < 0) goto L3d
            android.text.Selection.setSelection(r4, r0)
        L3d:
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            r2 = this;
            xhss.ᛲᛸᛳᛳ r0 = r2.f3262
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L44
            boolean r1 = r2.f3261
            if (r1 == 0) goto L44
            xhss.ᛵᲁᛱᲁ r1 = xhss.C0514.f1869
            if (r1 == 0) goto L44
            if (r5 > r6) goto L44
            boolean r5 = r3 instanceof android.text.Spannable
            if (r5 == 0) goto L44
            xhss.ᛵᲁᛱᲁ r5 = xhss.C0514.m921()
            int r5 = r5.m922()
            if (r5 == 0) goto L32
            r1 = 1
            if (r5 == r1) goto L27
            r3 = 3
            if (r5 == r3) goto L32
            goto L44
        L27:
            android.text.Spannable r3 = (android.text.Spannable) r3
            xhss.ᛵᲁᛱᲁ r2 = xhss.C0514.m921()
            int r6 = r6 + r4
            r2.m924(r3, r4, r6)
            return
        L32:
            xhss.ᛵᲁᛱᲁ r3 = xhss.C0514.m921()
            xhss.ᛷᛶᛳᛷ r4 = r2.f3260
            if (r4 != 0) goto L41
            xhss.ᛷᛶᛳᛷ r4 = new xhss.ᛷᛶᛳᛷ
            r4.<init>(r0)
            r2.f3260 = r4
        L41:
            r3.m926(r4)
        L44:
            return
    }
}
