package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements android.text.Spannable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.text.Spannable f7837h;

    public y(android.text.Spannable r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f7836g = r0
            r1.f7837h = r2
            return
    }

    public final void a() {
            r3 = this;
            android.text.Spannable r0 = r3.f7837h
            boolean r1 = r3.f7836g
            if (r1 != 0) goto L26
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 >= r2) goto L13
            l3.w r1 = new l3.w
            r2 = 0
            r1.<init>(r2)
            goto L19
        L13:
            l3.x r1 = new l3.x
            r2 = 0
            r1.<init>(r2)
        L19:
            boolean r1 = r1.j(r0)
            if (r1 == 0) goto L26
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r3.f7837h = r1
        L26:
            r0 = 1
            r3.f7836g = r0
            return
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream chars() {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            java.util.stream.IntStream r0 = r0.chars()
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            java.util.stream.IntStream r0 = r0.codePoints()
            return r0
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            int r2 = r0.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            int r2 = r0.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.Spanned
    public final int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            int r2 = r0.getSpanStart(r2)
            return r2
    }

    @Override // android.text.Spanned
    public final java.lang.Object[] getSpans(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            java.lang.Object[] r2 = r0.getSpans(r2, r3, r4)
            return r2
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            int r2 = r0.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.Spannable
    public final void removeSpan(java.lang.Object r2) {
            r1 = this;
            r1.a()
            android.text.Spannable r0 = r1.f7837h
            r0.removeSpan(r2)
            return
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            r1.a()
            android.text.Spannable r0 = r1.f7837h
            r0.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.f7837h
            java.lang.String r0 = r0.toString()
            return r0
    }
}
