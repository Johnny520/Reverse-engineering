package a;

/* JADX INFO: loaded from: classes.dex */
public final class O5 implements android.text.InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f197a;
    public a.O5.a b;

    public static class a extends androidx.emoji2.text.c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.ref.WeakReference f198a;
        public final java.lang.ref.WeakReference b;

        public a(android.widget.TextView r2, a.O5 r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f198a = r0
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.b = r2
                return
        }

        @Override // androidx.emoji2.text.c.e
        public final void b() {
                r6 = this;
                java.lang.ref.WeakReference r0 = r6.f198a
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
                androidx.emoji2.text.c r2 = androidx.emoji2.text.c.a()
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

    public O5(android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            r0.f197a = r1
            return
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
            r3 = this;
            android.widget.TextView r0 = r3.f197a
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L47
        L9:
            androidx.emoji2.text.c r1 = androidx.emoji2.text.c.a()
            int r1 = r1.b()
            if (r1 == 0) goto L48
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L48
            goto L47
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r7 = r7.length()
            if (r7 != 0) goto L2b
            java.lang.CharSequence r7 = r0.getText()
            if (r4 != r7) goto L2b
            goto L47
        L2b:
            if (r4 == 0) goto L47
            if (r5 != 0) goto L36
            int r7 = r4.length()
            if (r6 != r7) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            androidx.emoji2.text.c r5 = androidx.emoji2.text.c.a()
            int r6 = r4.length()
            r7 = 0
            java.lang.CharSequence r4 = r5.e(r4, r7, r6)
        L47:
            return r4
        L48:
            androidx.emoji2.text.c r5 = androidx.emoji2.text.c.a()
            a.O5$a r6 = r3.b
            if (r6 != 0) goto L57
            a.O5$a r6 = new a.O5$a
            r6.<init>(r0, r3)
            r3.b = r6
        L57:
            a.O5$a r6 = r3.b
            r5.f(r6)
            return r4
    }
}
