package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛸᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0578 implements android.text.TextWatcher, android.text.SpanWatcher {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicInteger f2011;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object f2012;

    public C0578(java.lang.Object r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.f2011 = r0
            r2.f2012 = r3
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            java.lang.Object r0 = r0.f2012
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            r0.afterTextChanged(r1)
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            java.lang.Object r0 = r0.f2012
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            r0.beforeTextChanged(r1, r2, r3, r4)
            return
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(android.text.Spannable r2, java.lang.Object r3, int r4, int r5) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f2011
            int r0 = r0.get()
            if (r0 <= 0) goto Ld
            boolean r0 = r3 instanceof xhss.C0396
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Object r1 = r1.f2012
            android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
            r1.onSpanAdded(r2, r3, r4, r5)
            return
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(android.text.Spannable r8, java.lang.Object r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.f2011
            int r0 = r0.get()
            if (r0 <= 0) goto Ld
            boolean r0 = r9 instanceof xhss.C0396
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Object r7 = r7.f2012
            r0 = r7
            android.text.SpanWatcher r0 = (android.text.SpanWatcher) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.onSpanChanged(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(android.text.Spannable r2, java.lang.Object r3, int r4, int r5) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f2011
            int r0 = r0.get()
            if (r0 <= 0) goto Ld
            boolean r0 = r3 instanceof xhss.C0396
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Object r1 = r1.f2012
            android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
            r1.onSpanRemoved(r2, r3, r4, r5)
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            java.lang.Object r0 = r0.f2012
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            r0.onTextChanged(r1, r2, r3, r4)
            return
    }
}
