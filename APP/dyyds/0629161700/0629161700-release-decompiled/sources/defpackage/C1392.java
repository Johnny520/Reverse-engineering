package defpackage;

/* JADX INFO: renamed from: ᛷᲇᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1392 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f6042;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C1002 f6043;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.widget.EditText f6044;

    public C1392(android.widget.EditText r1) {
            r0 = this;
            r0.<init>()
            r0.f6044 = r1
            r1 = 1
            r0.f6042 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m2561(android.widget.EditText r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L3d
            if (r4 == 0) goto L3d
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L3d
            android.text.Editable r4 = r4.getEditableText()
            int r5 = android.text.Selection.getSelectionStart(r4)
            int r0 = android.text.Selection.getSelectionEnd(r4)
            ᛴᲁᛶᲈ r1 = defpackage.C0766.m1696()
            r2 = 0
            if (r4 != 0) goto L20
            r3 = r2
            goto L27
        L20:
            r1.getClass()
            int r3 = r4.length()
        L27:
            r1.m1697(r4, r2, r3)
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
            android.widget.EditText r0 = r2.f6044
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L44
            boolean r1 = r2.f6042
            if (r1 == 0) goto L44
            ᛴᲁᛶᲈ r1 = defpackage.C0766.f3561
            if (r1 == 0) goto L44
            if (r5 > r6) goto L44
            boolean r5 = r3 instanceof android.text.Spannable
            if (r5 == 0) goto L44
            ᛴᲁᛶᲈ r5 = defpackage.C0766.m1696()
            int r5 = r5.m1700()
            if (r5 == 0) goto L32
            r1 = 1
            if (r5 == r1) goto L27
            r3 = 3
            if (r5 == r3) goto L32
            goto L44
        L27:
            android.text.Spannable r3 = (android.text.Spannable) r3
            ᛴᲁᛶᲈ r2 = defpackage.C0766.m1696()
            int r6 = r6 + r4
            r2.m1697(r3, r4, r6)
            return
        L32:
            ᛴᲁᛶᲈ r3 = defpackage.C0766.m1696()
            ᛵᲈᲇᛸ r4 = r2.f6043
            if (r4 != 0) goto L41
            ᛵᲈᲇᛸ r4 = new ᛵᲈᲇᛸ
            r4.<init>(r0)
            r2.f6043 = r4
        L41:
            r3.m1701(r4)
        L44:
            return
    }
}
