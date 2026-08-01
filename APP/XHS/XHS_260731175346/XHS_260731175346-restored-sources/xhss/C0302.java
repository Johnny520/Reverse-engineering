package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛸᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0302 extends android.text.SpannableStringBuilder {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Class f1151;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.ArrayList f1152;

    public C0302(java.lang.Class r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f1152 = r2
            java.lang.String r2 = "watcherClass cannot be null"
            xhss.AbstractC0060.m191(r1, r2)
            r0.f1151 = r1
            return
    }

    public C0302(java.lang.Class r1, xhss.C0302 r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f1152 = r2
            java.lang.String r2 = "watcherClass cannot be null"
            xhss.AbstractC0060.m191(r1, r2)
            r0.f1151 = r1
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(char r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(char r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence r1, java.lang.Object r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(char r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable delete(int r1, int r2) {
            r0 = this;
            super.delete(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder delete(int r1, int r2) {
            r0 = this;
            super.delete(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.m630(r2)
            if (r0 == 0) goto Ld
            xhss.ᛶᛸᛲᲈ r0 = r1.m627(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r1 = super.getSpanEnd(r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.m630(r2)
            if (r0 == 0) goto Ld
            xhss.ᛶᛸᛲᲈ r0 = r1.m627(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r1 = super.getSpanFlags(r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.m630(r2)
            if (r0 == 0) goto Ld
            xhss.ᛶᛸᛲᲈ r0 = r1.m627(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r1 = super.getSpanStart(r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final java.lang.Object[] getSpans(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            java.lang.Class r0 = r1.f1151
            if (r0 != r4) goto L21
            java.lang.Class<xhss.ᛶᛸᛲᲈ> r0 = xhss.C0578.class
            java.lang.Object[] r1 = super.getSpans(r2, r3, r0)
            xhss.ᛶᛸᛲᲈ[] r1 = (xhss.C0578[]) r1
            int r2 = r1.length
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r4, r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 0
        L14:
            int r4 = r1.length
            if (r3 >= r4) goto L20
            r4 = r1[r3]
            java.lang.Object r4 = r4.f2012
            r2[r3] = r4
            int r3 = r3 + 1
            goto L14
        L20:
            return r2
        L21:
            java.lang.Object[] r1 = super.getSpans(r2, r3, r4)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int r1, java.lang.CharSequence r2) {
            r0 = this;
            super.insert(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int r1, java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            super.insert(r1, r2, r3, r4)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int r1, java.lang.CharSequence r2) {
            r0 = this;
            super.insert(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int r1, java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            super.insert(r1, r2, r3, r4)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            if (r4 == 0) goto L6
            java.lang.Class r0 = r1.f1151
            if (r0 != r4) goto L8
        L6:
            java.lang.Class<xhss.ᛶᛸᛲᲈ> r4 = xhss.C0578.class
        L8:
            int r1 = super.nextSpanTransition(r2, r3, r4)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.m630(r2)
            if (r0 == 0) goto Le
            xhss.ᛶᛸᛲᲈ r0 = r1.m627(r2)
            if (r0 == 0) goto Lf
            r2 = r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            super.removeSpan(r2)
            if (r0 == 0) goto L19
            java.util.ArrayList r1 = r1.f1152
            r1.remove(r0)
        L19:
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int r1, int r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.replace(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int r1, int r2, java.lang.CharSequence r3, int r4, int r5) {
            r0 = this;
            r0.replace(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.m629()
            super.replace(r1, r2, r3)
            r0.m628()
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3, int r4, int r5) {
            r0 = this;
            r0.m629()
            super.replace(r1, r2, r3, r4, r5)
            r0.m628()
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.m630(r2)
            if (r0 == 0) goto L11
            xhss.ᛶᛸᛲᲈ r0 = new xhss.ᛶᛸᛲᲈ
            r0.<init>(r2)
            java.util.ArrayList r2 = r1.f1152
            r2.add(r0)
            r2 = r0
        L11:
            super.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r3, int r4) {
            r2 = this;
            xhss.ᛳᛸᛷᛸ r0 = new xhss.ᛳᛸᛷᛸ
            java.lang.Class r1 = r2.f1151
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m626() {
            r5 = this;
            r5.m628()
            r0 = 0
            r1 = r0
        L5:
            java.util.ArrayList r2 = r5.f1152
            int r3 = r2.size()
            if (r1 >= r3) goto L21
            java.lang.Object r2 = r2.get(r1)
            xhss.ᛶᛸᛲᲈ r2 = (xhss.C0578) r2
            int r3 = r5.length()
            int r4 = r5.length()
            r2.onTextChanged(r5, r0, r3, r4)
            int r1 = r1 + 1
            goto L5
        L21:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0578 m627(java.lang.Object r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.f1152
            int r2 = r1.size()
            if (r0 >= r2) goto L17
            java.lang.Object r1 = r1.get(r0)
            xhss.ᛶᛸᛲᲈ r1 = (xhss.C0578) r1
            java.lang.Object r2 = r1.f2012
            if (r2 != r4) goto L14
            return r1
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m628() {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.f1152
            int r2 = r1.size()
            if (r0 >= r2) goto L17
            java.lang.Object r1 = r1.get(r0)
            xhss.ᛶᛸᛲᲈ r1 = (xhss.C0578) r1
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f2011
            r1.decrementAndGet()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m629() {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.f1152
            int r2 = r1.size()
            if (r0 >= r2) goto L17
            java.lang.Object r1 = r1.get(r0)
            xhss.ᛶᛸᛲᲈ r1 = (xhss.C0578) r1
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f2011
            r1.incrementAndGet()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean m630(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto Lc
            java.lang.Class r1 = r1.getClass()
            java.lang.Class r0 = r0.f1151
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
