package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛸᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0686 implements java.util.Map, java.io.Serializable, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static final xhss.C0686 f2319 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.Object[] f2320;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object[] f2321;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int[] f2322;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public xhss.C1094 f2323;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public int f2324;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f2325;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public xhss.C1030 f2326;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int f2327;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int f2328;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int[] f2329;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f2330;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public boolean f2331;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public xhss.C1030 f2332;

    static {
            xhss.ᛷᛸᛵᛶ r0 = new xhss.ᛷᛸᛵᛶ
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.f2331 = r1
            xhss.C0686.f2319 = r0
            return
    }

    public C0686(int r5) {
            r4 = this;
            if (r5 < 0) goto L2c
            java.lang.Object[] r0 = new java.lang.Object[r5]
            int[] r1 = new int[r5]
            r2 = 1
            if (r5 >= r2) goto La
            r5 = r2
        La:
            int r5 = r5 * 3
            int r5 = java.lang.Integer.highestOneBit(r5)
            int[] r3 = new int[r5]
            r4.<init>()
            r4.f2320 = r0
            r0 = 0
            r4.f2321 = r0
            r4.f2329 = r1
            r4.f2322 = r3
            r0 = 2
            r4.f2330 = r0
            r0 = 0
            r4.f2328 = r0
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = r5 + r2
            r4.f2325 = r5
            return
        L2c:
            java.lang.String r4 = "capacity must be non-negative."
            xhss.C0532.m959(r4)
            r4 = 0
            throw r4
    }

    @Override // java.util.Map
    public final void clear() {
            r6 = this;
            r6.m1164()
            int r0 = r6.f2328
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L1d
            r2 = r1
        Lb:
            int[] r3 = r6.f2329
            r4 = r3[r2]
            if (r4 < 0) goto L18
            int[] r5 = r6.f2322
            r5[r4] = r1
            r4 = -1
            r3[r2] = r4
        L18:
            if (r2 == r0) goto L1d
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.Object[] r0 = r6.f2320
            int r2 = r6.f2328
            xhss.AbstractC0485.m888(r0, r1, r2)
            java.lang.Object[] r0 = r6.f2321
            if (r0 == 0) goto L2d
            int r2 = r6.f2328
            xhss.AbstractC0485.m888(r0, r1, r2)
        L2d:
            r6.f2327 = r1
            r6.f2328 = r1
            int r0 = r6.f2324
            int r0 = r0 + 1
            r6.f2324 = r0
            return
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.m1166(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f2328
        L2:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L17
            int[] r1 = r2.f2329
            r1 = r1[r0]
            if (r1 < 0) goto L2
            java.lang.Object[] r1 = r2.f2321
            r1 = r1[r0]
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 == 0) goto L2
            r1 = r0
        L17:
            if (r1 < 0) goto L1b
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            xhss.ᲇᛴᛵᲈ r0 = r2.f2326
            if (r0 != 0) goto Lc
            xhss.ᲇᛴᛵᲈ r0 = new xhss.ᲇᛴᛵᲈ
            r1 = 0
            r0.<init>(r2, r1)
            r2.f2326 = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r5 == r4) goto L42
            boolean r0 = r5 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L41
            java.util.Map r5 = (java.util.Map) r5
            int r0 = r4.f2327
            int r2 = r5.size()
            if (r0 != r2) goto L41
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r5.next()
            if (r0 == 0) goto L41
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L41
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.ClassCastException -> L41
            int r2 = r4.m1166(r2)     // Catch: java.lang.ClassCastException -> L41
            if (r2 >= 0) goto L33
            r0 = r1
            goto L3f
        L33:
            java.lang.Object[] r3 = r4.f2321     // Catch: java.lang.ClassCastException -> L41
            r2 = r3[r2]     // Catch: java.lang.ClassCastException -> L41
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.ClassCastException -> L41
            boolean r0 = xhss.AbstractC0007.m97(r2, r0)     // Catch: java.lang.ClassCastException -> L41
        L3f:
            if (r0 != 0) goto L19
        L41:
            return r1
        L42:
            r4 = 1
            return r4
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m1166(r1)
            if (r1 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object[] r0 = r0.f2321
            r0 = r0[r1]
            return r0
    }

    @Override // java.util.Map
    public final int hashCode() {
            r5 = this;
            xhss.ᲈᛴᲈᛵ r0 = new xhss.ᲈᛴᲈᛵ
            r1 = 0
            r0.<init>(r5, r1)
            r5 = r1
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            int r2 = r0.f1737
            java.lang.Object r3 = r0.f1739
            xhss.ᛷᛸᛵᛶ r3 = (xhss.C0686) r3
            int r4 = r3.f2328
            if (r2 >= r4) goto L3d
            int r4 = r2 + 1
            r0.f1737 = r4
            r0.f1738 = r2
            java.lang.Object[] r4 = r3.f2320
            r2 = r4[r2]
            if (r2 == 0) goto L28
            int r2 = r2.hashCode()
            goto L29
        L28:
            r2 = r1
        L29:
            java.lang.Object[] r3 = r3.f2321
            int r4 = r0.f1738
            r3 = r3[r4]
            if (r3 == 0) goto L36
            int r3 = r3.hashCode()
            goto L37
        L36:
            r3 = r1
        L37:
            r2 = r2 ^ r3
            r0.m879()
            int r5 = r5 + r2
            goto L7
        L3d:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
        L43:
            return r5
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.f2327
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            xhss.ᲇᛴᛵᲈ r0 = r2.f2332
            if (r0 != 0) goto Lc
            xhss.ᲇᛴᛵᲈ r0 = new xhss.ᲇᛴᛵᲈ
            r1 = 1
            r0.<init>(r2, r1)
            r2.f2332 = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r2.m1164()
            int r3 = r2.m1167(r3)
            java.lang.Object[] r0 = r2.f2321
            r1 = 0
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            java.lang.Object[] r0 = r2.f2320
            int r0 = r0.length
            if (r0 < 0) goto L23
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f2321 = r0
        L16:
            if (r3 >= 0) goto L20
            int r2 = -r3
            int r2 = r2 + (-1)
            r3 = r0[r2]
            r0[r2] = r4
            return r3
        L20:
            r0[r3] = r4
            return r1
        L23:
            java.lang.String r2 = "capacity must be non-negative."
            xhss.C0532.m959(r2)
            return r1
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r6) {
            r5 = this;
            r5.m1164()
            java.util.Set r6 = r6.entrySet()
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Le
            goto L5f
        Le:
            int r0 = r6.size()
            r5.m1170(r0)
            java.util.Iterator r6 = r6.iterator()
        L19:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            int r1 = r5.m1167(r1)
            java.lang.Object[] r2 = r5.f2321
            if (r2 == 0) goto L32
            goto L3b
        L32:
            java.lang.Object[] r2 = r5.f2320
            int r2 = r2.length
            if (r2 < 0) goto L5a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5.f2321 = r2
        L3b:
            if (r1 < 0) goto L44
            java.lang.Object r0 = r0.getValue()
            r2[r1] = r0
            goto L19
        L44:
            int r1 = -r1
            int r1 = r1 + (-1)
            r3 = r2[r1]
            java.lang.Object r4 = r0.getValue()
            boolean r3 = xhss.AbstractC0007.m97(r4, r3)
            if (r3 != 0) goto L19
            java.lang.Object r0 = r0.getValue()
            r2[r1] = r0
            goto L19
        L5a:
            java.lang.String r5 = "capacity must be non-negative."
            xhss.C0532.m959(r5)
        L5f:
            return
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            r1.m1164()
            int r2 = r1.m1166(r2)
            if (r2 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            java.lang.Object[] r0 = r1.f2321
            r0 = r0[r2]
            r1.m1168(r2)
            return r0
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.f2327
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.f2327
            int r1 = r1 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            xhss.ᲈᛴᲈᛵ r1 = new xhss.ᲈᛴᲈᛵ
            r2 = 0
            r1.<init>(r6, r2)
        L16:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L62
            if (r2 <= 0) goto L23
            java.lang.String r6 = ", "
            r0.append(r6)
        L23:
            int r6 = r1.f1737
            java.lang.Object r3 = r1.f1739
            xhss.ᛷᛸᛵᛶ r3 = (xhss.C0686) r3
            int r4 = r3.f2328
            if (r6 >= r4) goto L5c
            int r4 = r6 + 1
            r1.f1737 = r4
            r1.f1738 = r6
            java.lang.Object[] r4 = r3.f2320
            r6 = r4[r6]
            java.lang.String r4 = "(this Map)"
            if (r6 != r3) goto L3f
            r0.append(r4)
            goto L42
        L3f:
            r0.append(r6)
        L42:
            r6 = 61
            r0.append(r6)
            java.lang.Object[] r6 = r3.f2321
            int r5 = r1.f1738
            r6 = r6[r5]
            if (r6 != r3) goto L53
            r0.append(r4)
            goto L56
        L53:
            r0.append(r6)
        L56:
            r1.m879()
            int r2 = r2 + 1
            goto L16
        L5c:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            r6.<init>()
            throw r6
        L62:
            java.lang.String r6 = "}"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            xhss.ᲇᲁᛷᛶ r0 = r1.f2323
            if (r0 != 0) goto Lb
            xhss.ᲇᲁᛷᛶ r0 = new xhss.ᲇᲁᛷᛶ
            r0.<init>(r1)
            r1.f2323 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1164() {
            r0 = this;
            boolean r0 = r0.f2331
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m1165(boolean r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.f2321
            r1 = 0
            r2 = r1
        L4:
            int r3 = r7.f2328
            if (r1 >= r3) goto L29
            int[] r3 = r7.f2329
            r4 = r3[r1]
            if (r4 < 0) goto L26
            java.lang.Object[] r5 = r7.f2320
            r6 = r5[r1]
            r5[r2] = r6
            if (r0 == 0) goto L1a
            r5 = r0[r1]
            r0[r2] = r5
        L1a:
            if (r8 == 0) goto L24
            r3[r2] = r4
            int[] r3 = r7.f2322
            int r5 = r2 + 1
            r3[r4] = r5
        L24:
            int r2 = r2 + 1
        L26:
            int r1 = r1 + 1
            goto L4
        L29:
            java.lang.Object[] r8 = r7.f2320
            xhss.AbstractC0485.m888(r8, r2, r3)
            if (r0 == 0) goto L35
            int r8 = r7.f2328
            xhss.AbstractC0485.m888(r0, r2, r8)
        L35:
            r7.f2328 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int m1166(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.m1171(r6)
            int r1 = r5.f2330
        L6:
            int[] r2 = r5.f2322
            r2 = r2[r0]
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            java.lang.Object[] r4 = r5.f2320
            int r2 = r2 + (-1)
            r4 = r4[r2]
            boolean r4 = xhss.AbstractC0007.m97(r4, r6)
            if (r4 == 0) goto L1b
            return r2
        L1b:
            int r1 = r1 + r3
            if (r1 >= 0) goto L1f
            return r3
        L1f:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L29
            int[] r0 = r5.f2322
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L6
        L29:
            r0 = r2
            goto L6
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int m1167(java.lang.Object r8) {
            r7 = this;
            r7.m1164()
        L3:
            int r0 = r7.m1171(r8)
            int r1 = r7.f2330
            int r1 = r1 * 2
            int[] r2 = r7.f2322
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L13
            r1 = r2
        L13:
            r2 = 0
        L14:
            int[] r3 = r7.f2322
            r4 = r3[r0]
            r5 = 1
            if (r4 != 0) goto L43
            int r1 = r7.f2328
            java.lang.Object[] r4 = r7.f2320
            int r6 = r4.length
            if (r1 < r6) goto L26
            r7.m1170(r5)
            goto L3
        L26:
            int r6 = r1 + 1
            r7.f2328 = r6
            r4[r1] = r8
            int[] r8 = r7.f2329
            r8[r1] = r0
            r3[r0] = r6
            int r8 = r7.f2327
            int r8 = r8 + r5
            r7.f2327 = r8
            int r8 = r7.f2324
            int r8 = r8 + r5
            r7.f2324 = r8
            int r8 = r7.f2330
            if (r2 <= r8) goto L42
            r7.f2330 = r2
        L42:
            return r1
        L43:
            java.lang.Object[] r3 = r7.f2320
            int r6 = r4 + (-1)
            r3 = r3[r6]
            boolean r3 = xhss.AbstractC0007.m97(r3, r8)
            if (r3 == 0) goto L51
            int r7 = -r4
            return r7
        L51:
            int r2 = r2 + 1
            if (r2 <= r1) goto L5e
            int[] r0 = r7.f2322
            int r0 = r0.length
            int r0 = r0 * 2
            r7.m1169(r0)
            goto L3
        L5e:
            int r3 = r0 + (-1)
            if (r0 != 0) goto L67
            int[] r0 = r7.f2322
            int r0 = r0.length
            int r0 = r0 - r5
            goto L14
        L67:
            r0 = r3
            goto L14
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final void m1168(int r10) {
            r9 = this;
            java.lang.Object[] r0 = r9.f2320
            r1 = 0
            r0[r10] = r1
            java.lang.Object[] r0 = r9.f2321
            if (r0 == 0) goto Lb
            r0[r10] = r1
        Lb:
            int[] r0 = r9.f2329
            r0 = r0[r10]
            r1 = 0
        L10:
            r2 = r0
            r3 = r1
        L12:
            int r4 = r0 + (-1)
            if (r0 != 0) goto L1c
            int[] r0 = r9.f2322
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L1d
        L1c:
            r0 = r4
        L1d:
            int[] r4 = r9.f2322
            r5 = r4[r0]
            int r3 = r3 + 1
            int r6 = r9.f2330
            if (r3 <= r6) goto L2a
            r4[r2] = r1
            goto L2e
        L2a:
            if (r5 != 0) goto L3f
            r4[r2] = r1
        L2e:
            int[] r0 = r9.f2329
            r1 = -1
            r0[r10] = r1
            int r10 = r9.f2327
            int r10 = r10 + r1
            r9.f2327 = r10
            int r10 = r9.f2324
            int r10 = r10 + 1
            r9.f2324 = r10
            return
        L3f:
            java.lang.Object[] r4 = r9.f2320
            int r6 = r5 + (-1)
            r4 = r4[r6]
            int r4 = r9.m1171(r4)
            int r4 = r4 - r0
            int[] r7 = r9.f2322
            int r8 = r7.length
            int r8 = r8 + (-1)
            r4 = r4 & r8
            if (r4 < r3) goto L12
            r7[r2] = r5
            int[] r3 = r9.f2329
            r3[r6] = r2
            goto L10
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1169(int r6) {
            r5 = this;
            int r0 = r5.f2324
            int r0 = r0 + 1
            r5.f2324 = r0
            int r0 = r5.f2328
            int r1 = r5.f2327
            r2 = 0
            if (r0 <= r1) goto L10
            r5.m1165(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f2322 = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f2325 = r6
        L1c:
            int r6 = r5.f2328
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f2320
            r0 = r0[r2]
            int r0 = r5.m1171(r0)
            int r1 = r5.f2330
        L2c:
            int[] r3 = r5.f2322
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f2329
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            xhss.C0532.m950(r5)
        L4d:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1170(int r6) {
            r5 = this;
            java.lang.Object[] r0 = r5.f2320
            int r1 = r0.length
            int r2 = r5.f2328
            int r1 = r1 - r2
            int r3 = r5.f2327
            int r3 = r2 - r3
            r4 = 1
            if (r1 >= r6) goto L19
            int r1 = r1 + r3
            if (r1 < r6) goto L19
            int r1 = r0.length
            int r1 = r1 / 4
            if (r3 < r1) goto L19
            r5.m1165(r4)
            return
        L19:
            int r2 = r2 + r6
            if (r2 < 0) goto L63
            int r6 = r0.length
            if (r2 <= r6) goto L62
            int r6 = r0.length
            int r1 = r6 >> 1
            int r6 = r6 + r1
            int r1 = r6 - r2
            if (r1 >= 0) goto L28
            r6 = r2
        L28:
            r1 = 2147483639(0x7ffffff7, float:NaN)
            int r3 = r6 - r1
            if (r3 <= 0) goto L36
            if (r2 <= r1) goto L35
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L36
        L35:
            r6 = r1
        L36:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            r5.f2320 = r0
            java.lang.Object[] r0 = r5.f2321
            if (r0 == 0) goto L45
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            goto L46
        L45:
            r0 = 0
        L46:
            r5.f2321 = r0
            int[] r0 = r5.f2329
            int[] r0 = java.util.Arrays.copyOf(r0, r6)
            r5.f2329 = r0
            if (r6 >= r4) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            int r4 = r4 * 3
            int r6 = java.lang.Integer.highestOneBit(r4)
            int[] r0 = r5.f2322
            int r0 = r0.length
            if (r6 <= r0) goto L62
            r5.m1169(r6)
        L62:
            return
        L63:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int m1171(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int r2 = r2.hashCode()
            goto L8
        L7:
            r2 = 0
        L8:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r2 = r2 * r0
            int r1 = r1.f2325
            int r1 = r2 >>> r1
            return r1
    }
}
