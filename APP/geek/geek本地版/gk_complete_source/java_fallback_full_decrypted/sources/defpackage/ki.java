package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ki extends defpackage.ci {
    public final java.lang.ref.WeakReference a;
    public final java.lang.ref.WeakReference b;

    public ki(android.widget.TextView r2, defpackage.li r3) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.a = r0
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.b = r2
            return
    }

    @Override // defpackage.ci
    public final void a() {
            r6 = this;
            java.lang.ref.WeakReference r0 = r6.a
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.ref.WeakReference r1 = r6.b
            java.lang.Object r1 = r1.get()
            android.text.InputFilter r1 = (android.text.InputFilter) r1
            if (r1 == 0) goto L6d
            if (r0 != 0) goto L15
            goto L6d
        L15:
            android.text.InputFilter[] r2 = r0.getFilters()
            if (r2 != 0) goto L1c
            goto L6d
        L1c:
            r3 = 0
            r4 = r3
        L1e:
            int r5 = r2.length
            if (r4 >= r5) goto L6d
            r5 = r2[r4]
            if (r5 != r1) goto L6a
            boolean r1 = r0.isAttachedToWindow()
            if (r1 == 0) goto L6d
            java.lang.CharSequence r1 = r0.getText()
            ei r2 = defpackage.ei.a()
            if (r1 != 0) goto L37
            r4 = r3
            goto L3e
        L37:
            r2.getClass()
            int r4 = r1.length()
        L3e:
            java.lang.CharSequence r2 = r2.e(r1, r3, r4)
            if (r1 != r2) goto L45
            goto L6d
        L45:
            int r1 = android.text.Selection.getSelectionStart(r2)
            int r3 = android.text.Selection.getSelectionEnd(r2)
            r0.setText(r2)
            boolean r0 = r2 instanceof android.text.Spannable
            if (r0 == 0) goto L6d
            android.text.Spannable r2 = (android.text.Spannable) r2
            if (r1 < 0) goto L5e
            if (r3 < 0) goto L5e
            android.text.Selection.setSelection(r2, r1, r3)
            return
        L5e:
            if (r1 < 0) goto L64
            android.text.Selection.setSelection(r2, r1)
            return
        L64:
            if (r3 < 0) goto L6d
            android.text.Selection.setSelection(r2, r3)
            return
        L6a:
            int r4 = r4 + 1
            goto L1e
        L6d:
            return
    }
}
