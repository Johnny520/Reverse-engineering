package defpackage;

/* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1344 implements android.text.Spannable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.text.Spannable f5921;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f5922;

    public C1344(android.text.Spannable r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5922 = r0
            r1.f5921 = r2
            return
    }

    public C1344(java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5922 = r0
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.f5921 = r0
            return
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            char r0 = r0.charAt(r1)
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream chars() {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            java.util.stream.IntStream r0 = r0.chars()
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            java.util.stream.IntStream r0 = r0.codePoints()
            return r0
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(java.lang.Object r1) {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            int r0 = r0.getSpanEnd(r1)
            return r0
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(java.lang.Object r1) {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            int r0 = r0.getSpanFlags(r1)
            return r0
    }

    @Override // android.text.Spanned
    public final int getSpanStart(java.lang.Object r1) {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            int r0 = r0.getSpanStart(r1)
            return r0
    }

    @Override // android.text.Spanned
    public final java.lang.Object[] getSpans(int r1, int r2, java.lang.Class r3) {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            java.lang.Object[] r0 = r0.getSpans(r1, r2, r3)
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r1, int r2, java.lang.Class r3) {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            int r0 = r0.nextSpanTransition(r1, r2, r3)
            return r0
    }

    @Override // android.text.Spannable
    public final void removeSpan(java.lang.Object r3) {
            r2 = this;
            android.text.Spannable r0 = r2.f5921
            boolean r1 = r2.f5922
            if (r1 != 0) goto L12
            boolean r1 = r0 instanceof android.text.PrecomputedText
            if (r1 == 0) goto L12
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r2.f5921 = r1
            r0 = r1
        L12:
            r1 = 1
            r2.f5922 = r1
            r0.removeSpan(r3)
            return
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object r3, int r4, int r5, int r6) {
            r2 = this;
            android.text.Spannable r0 = r2.f5921
            boolean r1 = r2.f5922
            if (r1 != 0) goto L12
            boolean r1 = r0 instanceof android.text.PrecomputedText
            if (r1 == 0) goto L12
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r2.f5921 = r1
            r0 = r1
        L12:
            r1 = 1
            r2.f5922 = r1
            r0.setSpan(r3, r4, r5, r6)
            return
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r0 = this;
            android.text.Spannable r0 = r0.f5921
            java.lang.String r0 = r0.toString()
            return r0
    }
}
