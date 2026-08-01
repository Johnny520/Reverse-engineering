package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class si implements android.text.TextWatcher {
    public final android.widget.EditText a;
    public defpackage.ri b;
    public boolean c;

    public si(android.widget.EditText r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = 1
            r0.c = r1
            return
    }

    public static void a(android.widget.EditText r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L3d
            if (r4 == 0) goto L3d
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L3d
            android.text.Editable r4 = r4.getEditableText()
            int r5 = android.text.Selection.getSelectionStart(r4)
            int r0 = android.text.Selection.getSelectionEnd(r4)
            ei r1 = defpackage.ei.a()
            r2 = 0
            if (r4 != 0) goto L20
            r3 = r2
            goto L27
        L20:
            r1.getClass()
            int r3 = r4.length()
        L27:
            r1.e(r4, r2, r3)
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
            android.widget.EditText r0 = r2.a
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L46
            boolean r1 = r2.c
            if (r1 == 0) goto L46
            ei r1 = defpackage.ei.j
            if (r1 == 0) goto L46
            if (r5 > r6) goto L46
            boolean r5 = r3 instanceof android.text.Spannable
            if (r5 == 0) goto L46
            ei r5 = defpackage.ei.a()
            int r5 = r5.b()
            if (r5 == 0) goto L32
            r1 = 1
            if (r5 == r1) goto L27
            r3 = 3
            if (r5 == r3) goto L32
            goto L46
        L27:
            android.text.Spannable r3 = (android.text.Spannable) r3
            ei r5 = defpackage.ei.a()
            int r6 = r6 + r4
            r5.e(r3, r4, r6)
            return
        L32:
            ei r3 = defpackage.ei.a()
            ri r4 = r2.b
            if (r4 != 0) goto L41
            ri r4 = new ri
            r4.<init>(r0)
            r2.b = r4
        L41:
            ri r4 = r2.b
            r3.f(r4)
        L46:
            return
    }
}
