package defpackage;

/* JADX INFO: renamed from: ᲀᛶᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1687 implements java.util.Iterator, defpackage.InterfaceC0140, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.util.Iterator f7504;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f7505;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f7506;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.InterfaceC0140 f7507;

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
        L0:
            int r0 = r4.f7506
            r1 = 0
            if (r0 == 0) goto L26
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L19
            if (r0 == r2) goto L18
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 != r1) goto L13
            r4 = 0
            return r4
        L13:
            java.lang.RuntimeException r4 = r4.m3070()
            throw r4
        L18:
            return r3
        L19:
            java.util.Iterator r0 = r4.f7504
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L24
            r4.f7506 = r2
            return r3
        L24:
            r4.f7504 = r1
        L26:
            r0 = 5
            r4.f7506 = r0
            ᛱᛸᛲᲀ r0 = r4.f7507
            r4.f7507 = r1
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            r0.mo662(r1)
            goto L0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f7506
            if (r0 == 0) goto L24
            r1 = 1
            if (r0 == r1) goto L24
            r2 = 2
            if (r0 == r2) goto L1b
            r1 = 3
            if (r0 != r1) goto L16
            r0 = 0
            r3.f7506 = r0
            java.lang.Object r0 = r3.f7505
            r1 = 0
            r3.f7505 = r1
            return r0
        L16:
            java.lang.RuntimeException r3 = r3.m3070()
            throw r3
        L1b:
            r3.f7506 = r1
            java.util.Iterator r3 = r3.f7504
            java.lang.Object r3 = r3.next()
            return r3
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r3 = r3.next()
            return r3
        L2f:
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

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo662(java.lang.Object r1) {
            r0 = this;
            defpackage.AbstractC0762.m1680(r1)
            r1 = 4
            r0.f7506 = r1
            return
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.InterfaceC0493 mo663() {
            r0 = this;
            ᛲᛶᛳᛱ r0 = defpackage.C0303.f1620
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.RuntimeException m3070() {
            r3 = this;
            int r0 = r3.f7506
            r1 = 4
            if (r0 == r1) goto L26
            r1 = 5
            if (r0 == r1) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected state of the iterator: "
            r1.<init>(r2)
            int r3 = r3.f7506
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Iterator has failed."
            r3.<init>(r0)
            return r3
        L26:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3071(java.lang.Object r1, defpackage.AbstractC1382 r2) {
            r0 = this;
            r0.f7505 = r1
            r1 = 3
            r0.f7506 = r1
            r0.f7507 = r2
            return
    }
}
