package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛱᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1001 extends xhss.C0377 implements java.util.Map {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0568 f3288;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0482 f3289;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.C0317 f3290;

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            xhss.ᛶᛶᛷᲈ r0 = r2.f3288
            if (r0 != 0) goto Lc
            xhss.ᛶᛶᛷᲈ r0 = new xhss.ᛶᛶᛷᲈ
            r1 = 2
            r0.<init>(r2, r1)
            r2.f3288 = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r1 = this;
            xhss.ᛳᲁᲀᛲ r0 = r1.f3290
            if (r0 != 0) goto Lb
            xhss.ᛳᲁᲀᛲ r0 = new xhss.ᛳᲁᲀᛲ
            r0.<init>(r1)
            r1.f3290 = r0
        Lb:
            return r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r5) {
            r4 = this;
            int r0 = r4.f1364
            int r1 = r5.size()
            int r1 = r1 + r0
            int r0 = r4.f1364
            int[] r2 = r4.f1362
            int r3 = r2.length
            if (r3 >= r1) goto L1e
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            r4.f1362 = r2
            java.lang.Object[] r2 = r4.f1363
            int r1 = r1 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            r4.f1363 = r1
        L1e:
            int r1 = r4.f1364
            if (r1 != r0) goto L43
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r4.put(r1, r0)
            goto L2a
        L42:
            return
        L43:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            r4.<init>()
            throw r4
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            xhss.ᛵᛶᛳᛵ r0 = r1.f3289
            if (r0 != 0) goto Lb
            xhss.ᛵᛶᛳᛵ r0 = new xhss.ᛵᛶᛳᛵ
            r0.<init>(r1)
            r1.f3289 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final boolean m1642(java.util.Collection r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = super.containsKey(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final boolean m1643(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.f1364
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r3.next()
            super.remove(r1)
            goto L6
        L14:
            int r2 = r2.f1364
            if (r0 == r2) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }
}
