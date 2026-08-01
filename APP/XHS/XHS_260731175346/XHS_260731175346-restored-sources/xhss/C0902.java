package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲀᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0902 implements java.util.Iterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f2927;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f2928;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0023 f2929;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2930;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0845 f2931;

    public C0902(xhss.C0845 r2) {
            r1 = this;
            r1.<init>()
            r1.f2931 = r2
            r0 = -1
            r1.f2927 = r0
            java.lang.Object r2 = r2.f2747
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r0 = 0
            int r2 = xhss.AbstractC0473.m865(r0, r0, r2)
            r1.f2928 = r2
            r1.f2930 = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f2927
            r1 = -1
            if (r0 != r1) goto L8
            r2.m1460()
        L8:
            int r2 = r2.f2927
            r0 = 1
            if (r2 != r0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f2927
            r1 = -1
            if (r0 != r1) goto L8
            r3.m1460()
        L8:
            int r0 = r3.f2927
            if (r0 == 0) goto L14
            xhss.ᛱᛲᲇᲀ r0 = r3.f2929
            r2 = 0
            r3.f2929 = r2
            r3.f2927 = r1
            return r0
        L14:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1460() {
            r7 = this;
            xhss.ᲀᛲᲇᛲ r0 = r7.f2931
            java.lang.Object r1 = r0.f2747
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r2 = r7.f2930
            r3 = 0
            if (r2 >= 0) goto L11
            r7.f2927 = r3
            r0 = 0
            r7.f2929 = r0
            return
        L11:
            int r4 = r1.length()
            r5 = -1
            r6 = 1
            if (r2 <= r4) goto L29
            xhss.ᛱᛲᲇᲀ r0 = new xhss.ᛱᛲᲇᲀ
            int r2 = r7.f2928
            int r1 = xhss.AbstractC0120.m345(r1)
            r0.<init>(r2, r1, r6)
            r7.f2929 = r0
            r7.f2930 = r5
            goto L6c
        L29:
            xhss.ᲁᛳᲀᛴ r0 = r0.f2748
            xhss.ᛵᲇᛱᛴ r0 = (xhss.InterfaceC0517) r0
            int r2 = r7.f2930
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo115(r1, r2)
            xhss.ᲀᛴᛳᛸ r0 = (xhss.C0857) r0
            if (r0 != 0) goto L4b
            xhss.ᛱᛲᲇᲀ r0 = new xhss.ᛱᛲᲇᲀ
            int r2 = r7.f2928
            int r1 = xhss.AbstractC0120.m345(r1)
            r0.<init>(r2, r1, r6)
            r7.f2929 = r0
            r7.f2930 = r5
            goto L6c
        L4b:
            java.lang.Object r1 = r0.f2767
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.f2768
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r7.f2928
            xhss.ᛱᛲᲇᲀ r2 = xhss.AbstractC0473.m855(r2, r1)
            r7.f2929 = r2
            int r1 = r1 + r0
            r7.f2928 = r1
            if (r0 != 0) goto L69
            r3 = r6
        L69:
            int r1 = r1 + r3
            r7.f2930 = r1
        L6c:
            r7.f2927 = r6
            return
    }
}
