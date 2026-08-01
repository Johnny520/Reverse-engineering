package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲀᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0201 implements java.util.Iterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f762;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f763;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f764;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f765;

    public C0201(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.f762 = r5
            r2.f763 = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto Lf
            if (r3 > r4) goto L12
        Ld:
            r0 = r1
            goto L12
        Lf:
            if (r3 < r4) goto L12
            goto Ld
        L12:
            r2.f765 = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.f764 = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            boolean r0 = r0.f765
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r0 = this;
            int r0 = r0.nextInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public final int nextInt() {
            r2 = this;
            int r0 = r2.f764
            int r1 = r2.f763
            if (r0 != r1) goto L14
            boolean r1 = r2.f765
            if (r1 == 0) goto Le
            r1 = 0
            r2.f765 = r1
            return r0
        Le:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
        L14:
            int r1 = r2.f762
            int r1 = r1 + r0
            r2.f764 = r1
            return r0
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
