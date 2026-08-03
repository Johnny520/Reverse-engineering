package a;

/* JADX INFO: loaded from: classes.dex */
public final class T5 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.EditText f270a;
    public a.T5.a b;
    public boolean c;

    public static class a extends androidx.emoji2.text.c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.ref.WeakReference f271a;

        public a(android.widget.EditText r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f271a = r0
                return
        }

        @Override // androidx.emoji2.text.c.e
        public final void b() {
                r2 = this;
                java.lang.ref.WeakReference r0 = r2.f271a
                java.lang.Object r0 = r0.get()
                android.widget.EditText r0 = (android.widget.EditText) r0
                r1 = 1
                a.T5.a(r0, r1)
                return
        }
    }

    public T5(android.widget.EditText r1) {
            r0 = this;
            r0.<init>()
            r0.f270a = r1
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
            androidx.emoji2.text.c r1 = androidx.emoji2.text.c.a()
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
            android.widget.EditText r0 = r2.f270a
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L46
            boolean r1 = r2.c
            if (r1 == 0) goto L46
            androidx.emoji2.text.c r1 = androidx.emoji2.text.c.k
            if (r1 == 0) goto L46
            if (r5 > r6) goto L46
            boolean r5 = r3 instanceof android.text.Spannable
            if (r5 == 0) goto L46
            androidx.emoji2.text.c r5 = androidx.emoji2.text.c.a()
            int r5 = r5.b()
            if (r5 == 0) goto L32
            r1 = 1
            if (r5 == r1) goto L27
            r3 = 3
            if (r5 == r3) goto L32
            goto L46
        L27:
            android.text.Spannable r3 = (android.text.Spannable) r3
            androidx.emoji2.text.c r5 = androidx.emoji2.text.c.a()
            int r6 = r6 + r4
            r5.e(r3, r4, r6)
            return
        L32:
            androidx.emoji2.text.c r3 = androidx.emoji2.text.c.a()
            a.T5$a r4 = r2.b
            if (r4 != 0) goto L41
            a.T5$a r4 = new a.T5$a
            r4.<init>(r0)
            r2.b = r4
        L41:
            a.T5$a r4 = r2.b
            r3.f(r4)
        L46:
            return
    }
}
