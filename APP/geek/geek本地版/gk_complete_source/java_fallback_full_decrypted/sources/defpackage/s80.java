package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s80 implements android.text.Spannable {
    public boolean a;
    public android.text.Spannable b;

    public s80(android.text.Spannable r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r2
            return
    }

    public s80(java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public final void a() {
            r3 = this;
            android.text.Spannable r0 = r3.b
            boolean r1 = r3.a
            if (r1 != 0) goto L28
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 >= r2) goto L14
            iy r1 = new iy
            r2 = 10
            r1.<init>(r2)
            goto L1b
        L14:
            r80 r1 = new r80
            r2 = 10
            r1.<init>(r2)
        L1b:
            boolean r1 = r1.b(r0)
            if (r1 == 0) goto L28
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r3.b = r1
        L28:
            r0 = 1
            r3.a = r0
            return
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.b
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream chars() {
            r1 = this;
            android.text.Spannable r0 = r1.b
            java.util.stream.IntStream r0 = r0.chars()
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
            r1 = this;
            android.text.Spannable r0 = r1.b
            java.util.stream.IntStream r0 = r0.codePoints()
            return r0
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.b
            int r2 = r0.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.b
            int r2 = r0.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.Spanned
    public final int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.b
            int r2 = r0.getSpanStart(r2)
            return r2
    }

    @Override // android.text.Spanned
    public final java.lang.Object[] getSpans(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.b
            java.lang.Object[] r2 = r0.getSpans(r2, r3, r4)
            return r2
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r1 = this;
            android.text.Spannable r0 = r1.b
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.b
            int r2 = r0.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.Spannable
    public final void removeSpan(java.lang.Object r2) {
            r1 = this;
            r1.a()
            android.text.Spannable r0 = r1.b
            r0.removeSpan(r2)
            return
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            r1.a()
            android.text.Spannable r0 = r1.b
            r0.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.b
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.b
            java.lang.String r0 = r0.toString()
            return r0
    }
}
