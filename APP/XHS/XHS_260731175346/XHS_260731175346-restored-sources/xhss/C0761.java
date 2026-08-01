package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛴᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0761 implements java.util.Iterator, xhss.InterfaceC0038, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f2539;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.reflect.Field f2540;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.InterfaceC0038 f2541;

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
        L0:
            int r0 = r3.f2539
            r1 = 0
            if (r0 == 0) goto L1a
            r2 = 1
            if (r0 == r2) goto L19
            r1 = 2
            if (r0 == r1) goto L18
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 != r1) goto L13
            r3 = 0
            return r3
        L13:
            java.lang.RuntimeException r3 = r3.m1304()
            throw r3
        L18:
            return r2
        L19:
            throw r1
        L1a:
            r0 = 5
            r3.f2539 = r0
            xhss.ᛱᛴᛶᛴ r0 = r3.f2541
            r3.f2541 = r1
            xhss.ᛵᛷᲈᛶ r1 = xhss.C0500.f1817
            r0.mo152(r1)
            goto L0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f2539
            if (r0 == 0) goto L1e
            r1 = 1
            if (r0 == r1) goto L1e
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L1b
            r1 = 3
            if (r0 != r1) goto L16
            r0 = 0
            r4.f2539 = r0
            java.lang.reflect.Field r0 = r4.f2540
            r4.f2540 = r3
            return r0
        L16:
            java.lang.RuntimeException r4 = r4.m1304()
            throw r4
        L1b:
            r4.f2539 = r1
            throw r3
        L1e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r4 = r4.next()
            return r4
        L29:
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.RuntimeException m1304() {
            r3 = this;
            int r0 = r3.f2539
            r1 = 4
            if (r0 == r1) goto L26
            r1 = 5
            if (r0 == r1) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected state of the iterator: "
            r1.<init>(r2)
            int r3 = r3.f2539
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

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final void mo152(java.lang.Object r1) {
            r0 = this;
            xhss.C0614.m1058(r1)
            r1 = 4
            r0.f2539 = r1
            return
    }

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final xhss.InterfaceC0362 mo153() {
            r0 = this;
            xhss.ᲇᛷᲁᛷ r0 = xhss.C1059.f3421
            return r0
    }
}
