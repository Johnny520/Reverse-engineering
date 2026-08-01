package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class li implements android.text.InputFilter {
    public final android.widget.TextView a;
    public defpackage.ki b;

    public li(android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
            r3 = this;
            android.widget.TextView r0 = r3.a
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L47
        L9:
            ei r1 = defpackage.ei.a()
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
            ei r5 = defpackage.ei.a()
            int r6 = r4.length()
            r7 = 0
            java.lang.CharSequence r4 = r5.e(r4, r7, r6)
        L47:
            return r4
        L48:
            ei r5 = defpackage.ei.a()
            ki r6 = r3.b
            if (r6 != 0) goto L57
            ki r6 = new ki
            r6.<init>(r0, r3)
            r3.b = r6
        L57:
            ki r6 = r3.b
            r5.f(r6)
            return r4
    }
}
