package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲈᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0611 implements java.util.Iterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.CharSequence f2097;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f2098;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f2099;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2100;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f2101;

    public C0611(java.lang.CharSequence r1) {
            r0 = this;
            r0.<init>()
            r0.f2097 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r9 = this;
            int r0 = r9.f2098
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            if (r0 != r2) goto L9
            return r2
        L9:
            return r1
        La:
            int r0 = r9.f2101
            r3 = 2
            if (r0 >= 0) goto L12
            r9.f2098 = r3
            return r1
        L12:
            java.lang.CharSequence r0 = r9.f2097
            int r1 = r0.length()
            int r4 = r9.f2100
            int r5 = r0.length()
        L1e:
            if (r4 >= r5) goto L43
            char r6 = r0.charAt(r4)
            r7 = 13
            r8 = 10
            if (r6 == r8) goto L2f
            if (r6 == r7) goto L2f
            int r4 = r4 + 1
            goto L1e
        L2f:
            if (r6 != r7) goto L40
            int r1 = r4 + 1
            int r5 = r0.length()
            if (r1 >= r5) goto L40
            char r0 = r0.charAt(r1)
            if (r0 != r8) goto L40
            goto L41
        L40:
            r3 = r2
        L41:
            r1 = r4
            goto L44
        L43:
            r3 = -1
        L44:
            r9.f2098 = r2
            r9.f2101 = r3
            r9.f2099 = r1
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            r0 = 0
            r3.f2098 = r0
            int r0 = r3.f2099
            int r1 = r3.f2100
            int r2 = r3.f2101
            int r2 = r2 + r0
            r3.f2100 = r2
            java.lang.CharSequence r3 = r3.f2097
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            java.lang.String r3 = r3.toString()
            return r3
        L1d:
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
}
