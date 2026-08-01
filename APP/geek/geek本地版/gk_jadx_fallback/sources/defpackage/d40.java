package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d40 extends android.text.SpannableStringBuilder {
    public final java.lang.Class a;
    public final java.util.ArrayList b;

    public d40(java.lang.Class r1, defpackage.d40 r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.b = r2
            java.lang.String r2 = "watcherClass cannot be null"
            defpackage.zt.f(r2, r1)
            r0.a = r1
            return
    }

    public d40(java.lang.Class r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.b = r2
            java.lang.String r2 = "watcherClass cannot be null"
            defpackage.zt.f(r2, r1)
            r0.a = r1
            return
    }

    public final void a() {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.b
            int r2 = r1.size()
            if (r0 >= r2) goto L17
            java.lang.Object r1 = r1.get(r0)
            c40 r1 = (defpackage.c40) r1
            java.util.concurrent.atomic.AtomicInteger r1 = r1.b
            r1.incrementAndGet()
            int r0 = r0 + 1
            goto L1
        L17:
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

    public final void b() {
            r5 = this;
            r5.e()
            r0 = 0
            r1 = r0
        L5:
            java.util.ArrayList r2 = r5.b
            int r3 = r2.size()
            if (r1 >= r3) goto L21
            java.lang.Object r2 = r2.get(r1)
            c40 r2 = (defpackage.c40) r2
            int r3 = r5.length()
            int r4 = r5.length()
            r2.onTextChanged(r5, r0, r3, r4)
            int r1 = r1 + 1
            goto L5
        L21:
            return
    }

    public final defpackage.c40 c(java.lang.Object r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.b
            int r2 = r1.size()
            if (r0 >= r2) goto L17
            java.lang.Object r1 = r1.get(r0)
            c40 r1 = (defpackage.c40) r1
            java.lang.Object r2 = r1.a
            if (r2 != r4) goto L14
            return r1
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            r4 = 0
            return r4
    }

    public final boolean d(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r0 = r1.a
            if (r0 != r2) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
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

    public final void e() {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.b
            int r2 = r1.size()
            if (r0 >= r2) goto L17
            java.lang.Object r1 = r1.get(r0)
            c40 r1 = (defpackage.c40) r1
            java.util.concurrent.atomic.AtomicInteger r1 = r1.b
            r1.decrementAndGet()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Ld
            c40 r0 = r1.c(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r2 = super.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Ld
            c40 r0 = r1.c(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r2 = super.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Ld
            c40 r0 = r1.c(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r2 = super.getSpanStart(r2)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final java.lang.Object[] getSpans(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            java.lang.Class r0 = r1.a
            if (r0 != r4) goto L21
            java.lang.Class<c40> r0 = defpackage.c40.class
            java.lang.Object[] r2 = super.getSpans(r2, r3, r0)
            c40[] r2 = (defpackage.c40[]) r2
            int r3 = r2.length
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r4, r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
        L14:
            int r0 = r2.length
            if (r4 >= r0) goto L20
            r0 = r2[r4]
            java.lang.Object r0 = r0.a
            r3[r4] = r0
            int r4 = r4 + 1
            goto L14
        L20:
            return r3
        L21:
            java.lang.Object[] r2 = super.getSpans(r2, r3, r4)
            return r2
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
            java.lang.Class r0 = r1.a
            if (r0 != r4) goto L8
        L6:
            java.lang.Class<c40> r4 = defpackage.c40.class
        L8:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Le
            c40 r0 = r1.c(r2)
            if (r0 == 0) goto Lf
            r2 = r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            super.removeSpan(r2)
            if (r0 == 0) goto L19
            java.util.ArrayList r2 = r1.b
            r2.remove(r0)
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
            r1 = r0
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.a()
            super.replace(r1, r2, r3)
            r0.e()
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3, int r4, int r5) {
            r0 = this;
            r0.a()
            super.replace(r1, r2, r3, r4, r5)
            r1 = r0
            r0.e()
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto L11
            c40 r0 = new c40
            r0.<init>(r2)
            java.util.ArrayList r2 = r1.b
            r2.add(r0)
            r2 = r0
        L11:
            super.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r3, int r4) {
            r2 = this;
            d40 r0 = new d40
            java.lang.Class r1 = r2.a
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
