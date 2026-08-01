package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲈᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0430 implements java.util.Iterator, java.util.Map.Entry {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f1519;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f1520;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C1001 f1521;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f1522;

    public C0430(xhss.C1001 r1) {
            r0 = this;
            r0.<init>()
            r0.f1521 = r1
            int r1 = r1.f1364
            int r1 = r1 + (-1)
            r0.f1519 = r1
            r1 = -1
            r0.f1520 = r1
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r4.f1522
            r1 = 0
            if (r0 == 0) goto L31
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 != 0) goto La
            goto L30
        La:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            int r2 = r4.f1520
            xhss.ᲇᛱᛱᛶ r3 = r4.f1521
            java.lang.Object r2 = r3.m727(r2)
            boolean r0 = xhss.AbstractC0007.m97(r0, r2)
            if (r0 == 0) goto L30
            java.lang.Object r5 = r5.getValue()
            int r4 = r4.f1520
            java.lang.Object r4 = r3.m729(r4)
            boolean r4 = xhss.AbstractC0007.m97(r5, r4)
            if (r4 == 0) goto L30
            r4 = 1
            return r4
        L30:
            return r1
        L31:
            java.lang.String r4 = "This container does not support retaining Map.Entry objects"
            xhss.C0532.m950(r4)
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            boolean r0 = r1.f1522
            if (r0 == 0) goto Ld
            xhss.ᲇᛱᛱᛶ r0 = r1.f1521
            int r1 = r1.f1520
            java.lang.Object r1 = r0.m727(r1)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            boolean r0 = r1.f1522
            if (r0 == 0) goto Ld
            xhss.ᲇᛱᛱᛶ r0 = r1.f1521
            int r1 = r1.f1520
            java.lang.Object r1 = r0.m729(r1)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f1520
            int r1 = r1.f1519
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f1522
            r1 = 0
            if (r0 == 0) goto L25
            int r0 = r3.f1520
            xhss.ᲇᛱᛱᛶ r2 = r3.f1521
            java.lang.Object r0 = r2.m727(r0)
            int r3 = r3.f1520
            java.lang.Object r3 = r2.m729(r3)
            if (r0 != 0) goto L17
            r0 = r1
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            if (r3 != 0) goto L1e
            goto L22
        L1e:
            int r1 = r3.hashCode()
        L22:
            r3 = r0 ^ r1
            return r3
        L25:
            java.lang.String r3 = "This container does not support retaining Map.Entry objects"
            xhss.C0532.m950(r3)
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            int r0 = r2.f1520
            r1 = 1
            int r0 = r0 + r1
            r2.f1520 = r0
            r2.f1522 = r1
            return r2
        Lf:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            boolean r0 = r2.f1522
            if (r0 == 0) goto L1b
            xhss.ᲇᛱᛱᛶ r0 = r2.f1521
            int r1 = r2.f1520
            r0.m732(r1)
            int r0 = r2.f1520
            int r0 = r0 + (-1)
            r2.f1520 = r0
            int r0 = r2.f1519
            int r0 = r0 + (-1)
            r2.f1519 = r0
            r0 = 0
            r2.f1522 = r0
            return
        L1b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.f1522
            if (r0 == 0) goto Ld
            xhss.ᲇᛱᛱᛶ r0 = r1.f1521
            int r1 = r1.f1520
            java.lang.Object r1 = r0.m730(r1, r2)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
