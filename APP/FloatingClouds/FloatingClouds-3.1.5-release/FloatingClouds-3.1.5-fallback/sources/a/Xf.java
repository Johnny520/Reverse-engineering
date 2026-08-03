package a;

/* JADX INFO: loaded from: classes.dex */
public final class Xf implements android.text.Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f344a;
    public android.text.Spannable b;

    public Xf(android.text.Spannable r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f344a = r0
            r1.b = r2
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
    public final <T> T[] getSpans(int r2, int r3, java.lang.Class<T> r4) {
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
    public final void removeSpan(java.lang.Object r3) {
            r2 = this;
            android.text.Spannable r0 = r2.b
            boolean r1 = r2.f344a
            if (r1 != 0) goto L15
            boolean r1 = r0 instanceof android.text.PrecomputedText
            if (r1 != 0) goto Le
            boolean r1 = r0 instanceof a.Gc
            if (r1 == 0) goto L15
        Le:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r2.b = r1
        L15:
            r0 = 1
            r2.f344a = r0
            android.text.Spannable r0 = r2.b
            r0.removeSpan(r3)
            return
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object r3, int r4, int r5, int r6) {
            r2 = this;
            android.text.Spannable r0 = r2.b
            boolean r1 = r2.f344a
            if (r1 != 0) goto L15
            boolean r1 = r0 instanceof android.text.PrecomputedText
            if (r1 != 0) goto Le
            boolean r1 = r0 instanceof a.Gc
            if (r1 == 0) goto L15
        Le:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r2.b = r1
        L15:
            r0 = 1
            r2.f344a = r0
            android.text.Spannable r0 = r2.b
            r0.setSpan(r3, r4, r5, r6)
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
