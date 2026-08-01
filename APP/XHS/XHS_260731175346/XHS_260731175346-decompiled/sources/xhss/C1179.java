package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲀᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C1179 implements java.lang.Iterable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0359 f3797;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0359 f3798;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f3799;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.WeakHashMap f3800;

    public C1179() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f3800 = r0
            r0 = 0
            r1.f3799 = r0
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof xhss.C1179
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᲈᲀᲀᛵ r6 = (xhss.C1179) r6
            int r1 = r5.f3799
            int r3 = r6.f3799
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            xhss.ᛷᛷᲀ r1 = (xhss.C0681) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            xhss.ᛷᛷᲀ r3 = (xhss.C0681) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            xhss.ᛷᛷᲀ r6 = (xhss.C0681) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            r1 = r3
            xhss.ᛷᛷᲀ r1 = (xhss.C0681) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            goto L5
        L1a:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            xhss.ᛷᛷᲀ r0 = new xhss.ᛷᛷᲀ
            xhss.ᛴᛴᲁᲈ r1 = r4.f3797
            xhss.ᛴᛴᲁᲈ r2 = r4.f3798
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.WeakHashMap r4 = r4.f3800
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.put(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            r1 = r3
            xhss.ᛷᛷᲀ r1 = (xhss.C0681) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto Lb
            java.lang.String r1 = ", "
            r0.append(r1)
            goto Lb
        L2d:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public java.lang.Object mo1300(java.lang.Object r4) {
            r3 = this;
            xhss.ᛴᛴᲁᲈ r4 = r3.mo1301(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.f3799
            int r1 = r1 + (-1)
            r3.f3799 = r1
            java.util.WeakHashMap r1 = r3.f3800
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2e
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            xhss.ᛲᛷᛵ r2 = (xhss.AbstractC0187) r2
            r2.mo446(r4)
            goto L1e
        L2e:
            xhss.ᛴᛴᲁᲈ r1 = r4.f1324
            xhss.ᛴᛴᲁᲈ r2 = r4.f1325
            if (r1 == 0) goto L37
            r1.f1325 = r2
            goto L39
        L37:
            r3.f3797 = r2
        L39:
            xhss.ᛴᛴᲁᲈ r2 = r4.f1325
            if (r2 == 0) goto L40
            r2.f1324 = r1
            goto L42
        L40:
            r3.f3798 = r1
        L42:
            r4.f1325 = r0
            r4.f1324 = r0
            java.lang.Object r3 = r4.f1323
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public xhss.C0359 mo1301(java.lang.Object r2) {
            r1 = this;
            xhss.ᛴᛴᲁᲈ r1 = r1.f3797
        L2:
            if (r1 == 0) goto L10
            java.lang.Object r0 = r1.f1322
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            xhss.ᛴᛴᲁᲈ r1 = r1.f1325
            goto L2
        L10:
            return r1
    }
}
