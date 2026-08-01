package defpackage;

/* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0278 implements java.util.Iterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f1553;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f1554;

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.f1554
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L14
            if (r0 == r2) goto L13
            r3 = 2
            if (r0 != r3) goto Lc
            return r1
        Lc:
            java.lang.String r3 = "hasNext called when the iterator is in the FAILED state."
            defpackage.C2264.m3684(r3)
            r3 = 0
            return r3
        L13:
            return r2
        L14:
            r0 = 3
            r3.f1554 = r0
            r3.mo912()
            int r3 = r3.f1554
            if (r3 != r2) goto L1f
            return r2
        L1f:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f1554
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lb
            r4.f1554 = r1
            java.lang.Object r4 = r4.f1553
            return r4
        Lb:
            r3 = 2
            if (r0 == r3) goto L1d
            r0 = 3
            r4.f1554 = r0
            r4.mo912()
            int r0 = r4.f1554
            if (r0 != r2) goto L1d
            r4.f1554 = r1
            java.lang.Object r4 = r4.f1553
            return r4
        L1d:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public abstract void mo912();
}
