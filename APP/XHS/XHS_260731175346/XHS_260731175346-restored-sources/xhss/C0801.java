package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲀᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0801 extends xhss.AbstractC0779 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final java.lang.Object[] f2613 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f2614;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object[] f2615;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2616;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            xhss.C0801.f2613 = r0
            return
    }

    public C0801() {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = xhss.C0801.f2613
            r1.f2615 = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f2616
            if (r8 < 0) goto L94
            if (r8 > r0) goto L94
            if (r8 != r0) goto Lc
            r7.addLast(r9)
            return
        Lc:
            if (r8 != 0) goto L12
            r7.addFirst(r9)
            return
        L12:
            r7.m1370()
            int r0 = r7.f2616
            r1 = 1
            int r0 = r0 + r1
            r7.m1373(r0)
            int r0 = r7.f2614
            int r0 = r0 + r8
            int r0 = r7.m1371(r0)
            int r2 = r7.f2616
            int r3 = r2 + 1
            int r3 = r3 >> r1
            int r4 = r7.f2614
            r5 = 0
            if (r8 >= r3) goto L69
            if (r0 != 0) goto L34
            java.lang.Object[] r8 = r7.f2615
            int r8 = r8.length
            int r8 = r8 - r1
            goto L36
        L34:
            int r8 = r0 + (-1)
        L36:
            if (r4 != 0) goto L3d
            java.lang.Object[] r0 = r7.f2615
            int r0 = r0.length
            int r0 = r0 - r1
            goto L3f
        L3d:
            int r0 = r4 + (-1)
        L3f:
            java.lang.Object[] r2 = r7.f2615
            if (r8 < r4) goto L4f
            r3 = r2[r4]
            r2[r0] = r3
            int r3 = r4 + 1
            int r5 = r8 + 1
            xhss.AbstractC0193.m448(r4, r3, r5, r2, r2)
            goto L62
        L4f:
            int r3 = r4 + (-1)
            int r6 = r2.length
            xhss.AbstractC0193.m448(r3, r4, r6, r2, r2)
            java.lang.Object[] r2 = r7.f2615
            int r3 = r2.length
            int r3 = r3 - r1
            r4 = r2[r5]
            r2[r3] = r4
            int r3 = r8 + 1
            xhss.AbstractC0193.m448(r5, r1, r3, r2, r2)
        L62:
            java.lang.Object[] r2 = r7.f2615
            r2[r8] = r9
            r7.f2614 = r0
            goto L8e
        L69:
            int r2 = r2 + r4
            int r8 = r7.m1371(r2)
            java.lang.Object[] r2 = r7.f2615
            if (r0 >= r8) goto L78
            int r3 = r0 + 1
            xhss.AbstractC0193.m448(r3, r0, r8, r2, r2)
            goto L8a
        L78:
            xhss.AbstractC0193.m448(r1, r5, r8, r2, r2)
            java.lang.Object[] r8 = r7.f2615
            int r2 = r8.length
            int r2 = r2 - r1
            r2 = r8[r2]
            r8[r5] = r2
            int r2 = r0 + 1
            int r3 = r8.length
            int r3 = r3 - r1
            xhss.AbstractC0193.m448(r2, r0, r3, r8, r8)
        L8a:
            java.lang.Object[] r8 = r7.f2615
            r8[r0] = r9
        L8e:
            int r8 = r7.f2616
            int r8 = r8 + r1
            r7.f2616 = r8
            return
        L94:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r9 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r8 = xhss.AbstractC0390.m782(r8, r0, r9, r1)
            r7.<init>(r8)
            throw r7
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            r0.addLast(r1)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, java.util.Collection r10) {
            r8 = this;
            int r0 = r8.f2616
            if (r9 < 0) goto Lce
            if (r9 > r0) goto Lce
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto Le
            return r1
        Le:
            int r0 = r8.f2616
            if (r9 != r0) goto L17
            boolean r8 = r8.addAll(r10)
            return r8
        L17:
            r8.m1370()
            int r0 = r8.f2616
            int r2 = r10.size()
            int r2 = r2 + r0
            r8.m1373(r2)
            int r0 = r8.f2614
            int r2 = r8.f2616
            int r2 = r2 + r0
            int r0 = r8.m1371(r2)
            int r2 = r8.f2614
            int r2 = r2 + r9
            int r2 = r8.m1371(r2)
            int r3 = r10.size()
            int r4 = r8.f2616
            r5 = 1
            int r4 = r4 + r5
            int r4 = r4 >> r5
            if (r9 >= r4) goto L8a
            int r9 = r8.f2614
            int r0 = r9 - r3
            java.lang.Object[] r4 = r8.f2615
            if (r2 < r9) goto L67
            if (r0 < 0) goto L4d
            xhss.AbstractC0193.m448(r0, r9, r2, r4, r4)
            goto L7f
        L4d:
            int r6 = r4.length
            int r0 = r0 + r6
            int r6 = r2 - r9
            int r7 = r4.length
            int r7 = r7 - r0
            if (r7 < r6) goto L59
            xhss.AbstractC0193.m448(r0, r9, r2, r4, r4)
            goto L7f
        L59:
            int r6 = r9 + r7
            xhss.AbstractC0193.m448(r0, r9, r6, r4, r4)
            java.lang.Object[] r9 = r8.f2615
            int r4 = r8.f2614
            int r4 = r4 + r7
            xhss.AbstractC0193.m448(r1, r4, r2, r9, r9)
            goto L7f
        L67:
            int r6 = r4.length
            xhss.AbstractC0193.m448(r0, r9, r6, r4, r4)
            java.lang.Object[] r9 = r8.f2615
            if (r3 < r2) goto L75
            int r4 = r9.length
            int r4 = r4 - r3
            xhss.AbstractC0193.m448(r4, r1, r2, r9, r9)
            goto L7f
        L75:
            int r4 = r9.length
            int r4 = r4 - r3
            xhss.AbstractC0193.m448(r4, r1, r3, r9, r9)
            java.lang.Object[] r9 = r8.f2615
            xhss.AbstractC0193.m448(r1, r3, r2, r9, r9)
        L7f:
            r8.f2614 = r0
            int r2 = r2 - r3
            int r9 = r8.m1374(r2)
            r8.m1368(r9, r10)
            return r5
        L8a:
            int r9 = r2 + r3
            java.lang.Object[] r4 = r8.f2615
            if (r2 >= r0) goto Lae
            int r3 = r3 + r0
            int r6 = r4.length
            if (r3 > r6) goto L98
            xhss.AbstractC0193.m448(r9, r2, r0, r4, r4)
            goto Lca
        L98:
            int r6 = r4.length
            if (r9 < r6) goto La1
            int r1 = r4.length
            int r9 = r9 - r1
            xhss.AbstractC0193.m448(r9, r2, r0, r4, r4)
            goto Lca
        La1:
            int r6 = r4.length
            int r3 = r3 - r6
            int r3 = r0 - r3
            xhss.AbstractC0193.m448(r1, r3, r0, r4, r4)
            java.lang.Object[] r0 = r8.f2615
            xhss.AbstractC0193.m448(r9, r2, r3, r0, r0)
            goto Lca
        Lae:
            xhss.AbstractC0193.m448(r3, r1, r0, r4, r4)
            java.lang.Object[] r0 = r8.f2615
            int r4 = r0.length
            if (r9 < r4) goto Lbd
            int r1 = r0.length
            int r9 = r9 - r1
            int r1 = r0.length
            xhss.AbstractC0193.m448(r9, r2, r1, r0, r0)
            goto Lca
        Lbd:
            int r4 = r0.length
            int r4 = r4 - r3
            int r6 = r0.length
            xhss.AbstractC0193.m448(r1, r4, r6, r0, r0)
            java.lang.Object[] r0 = r8.f2615
            int r1 = r0.length
            int r1 = r1 - r3
            xhss.AbstractC0193.m448(r9, r2, r1, r0, r0)
        Lca:
            r8.m1368(r2, r10)
            return r5
        Lce:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.String r10 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r9 = xhss.AbstractC0390.m782(r9, r0, r10, r1)
            r8.<init>(r9)
            throw r8
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            r2.m1370()
            int r0 = r2.f2616
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.m1373(r1)
            int r0 = r2.f2614
            int r1 = r2.f2616
            int r1 = r1 + r0
            int r0 = r2.m1371(r1)
            r2.m1368(r0, r3)
            r2 = 1
            return r2
    }

    public final void addFirst(java.lang.Object r3) {
            r2 = this;
            r2.m1370()
            int r0 = r2.f2616
            int r0 = r0 + 1
            r2.m1373(r0)
            int r0 = r2.f2614
            if (r0 != 0) goto L11
            java.lang.Object[] r0 = r2.f2615
            int r0 = r0.length
        L11:
            int r0 = r0 + (-1)
            r2.f2614 = r0
            java.lang.Object[] r1 = r2.f2615
            r1[r0] = r3
            int r3 = r2.f2616
            int r3 = r3 + 1
            r2.f2616 = r3
            return
    }

    public final void addLast(java.lang.Object r4) {
            r3 = this;
            r3.m1370()
            int r0 = r3.f2616
            int r0 = r0 + 1
            r3.m1373(r0)
            java.lang.Object[] r0 = r3.f2615
            int r1 = r3.f2614
            int r2 = r3.f2616
            int r2 = r2 + r1
            int r1 = r3.m1371(r2)
            r0[r1] = r4
            int r4 = r3.f2616
            int r4 = r4 + 1
            r3.f2616 = r4
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L17
            r2.m1370()
            int r0 = r2.f2614
            int r1 = r2.f2616
            int r1 = r1 + r0
            int r0 = r2.m1371(r1)
            int r1 = r2.f2614
            r2.m1372(r1, r0)
        L17:
            r0 = 0
            r2.f2614 = r0
            r2.f2616 = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            int r0 = r3.f2616
            if (r4 < 0) goto L12
            if (r4 >= r0) goto L12
            java.lang.Object[] r0 = r3.f2615
            int r1 = r3.f2614
            int r1 = r1 + r4
            int r3 = r3.m1371(r1)
            r3 = r0[r3]
            return r3
        L12:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = xhss.AbstractC0390.m782(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f2614
            int r1 = r4.f2616
            int r1 = r1 + r0
            int r0 = r4.m1371(r1)
            int r1 = r4.f2614
            if (r1 >= r0) goto L20
        Ld:
            if (r1 >= r0) goto L56
            java.lang.Object[] r2 = r4.f2615
            r2 = r2[r1]
            boolean r2 = xhss.AbstractC0007.m97(r5, r2)
            if (r2 == 0) goto L1d
            int r4 = r4.f2614
        L1b:
            int r1 = r1 - r4
            return r1
        L1d:
            int r1 = r1 + 1
            goto Ld
        L20:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L56
            int r1 = r4.f2614
            if (r1 < r0) goto L56
            java.lang.Object[] r2 = r4.f2615
            int r2 = r2.length
        L2d:
            if (r1 >= r2) goto L3f
            java.lang.Object[] r3 = r4.f2615
            r3 = r3[r1]
            boolean r3 = xhss.AbstractC0007.m97(r5, r3)
            if (r3 == 0) goto L3c
            int r4 = r4.f2614
            goto L1b
        L3c:
            int r1 = r1 + 1
            goto L2d
        L3f:
            r1 = 0
        L40:
            if (r1 >= r0) goto L56
            java.lang.Object[] r2 = r4.f2615
            r2 = r2[r1]
            boolean r2 = xhss.AbstractC0007.m97(r5, r2)
            if (r2 == 0) goto L53
            java.lang.Object[] r5 = r4.f2615
            int r5 = r5.length
            int r1 = r1 + r5
            int r4 = r4.f2614
            goto L1b
        L53:
            int r1 = r1 + 1
            goto L40
        L56:
            r4 = -1
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.mo1230()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f2614
            int r1 = r4.f2616
            int r1 = r1 + r0
            int r0 = r4.m1371(r1)
            int r1 = r4.f2614
            r2 = -1
            if (r1 >= r0) goto L25
            int r0 = r0 + (-1)
            if (r1 > r0) goto L60
        L12:
            java.lang.Object[] r3 = r4.f2615
            r3 = r3[r0]
            boolean r3 = xhss.AbstractC0007.m97(r5, r3)
            if (r3 == 0) goto L20
            int r4 = r4.f2614
        L1e:
            int r0 = r0 - r4
            return r0
        L20:
            if (r0 == r1) goto L60
            int r0 = r0 + (-1)
            goto L12
        L25:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L60
            int r1 = r4.f2614
            if (r1 < r0) goto L60
            int r0 = r0 + (-1)
        L31:
            java.lang.Object[] r1 = r4.f2615
            if (r2 >= r0) goto L47
            r1 = r1[r0]
            boolean r1 = xhss.AbstractC0007.m97(r5, r1)
            if (r1 == 0) goto L44
            java.lang.Object[] r5 = r4.f2615
            int r5 = r5.length
            int r0 = r0 + r5
            int r4 = r4.f2614
            goto L1e
        L44:
            int r0 = r0 + (-1)
            goto L31
        L47:
            int r0 = r1.length
            int r0 = r0 + (-1)
            int r1 = r4.f2614
            if (r1 > r0) goto L60
        L4e:
            java.lang.Object[] r3 = r4.f2615
            r3 = r3[r0]
            boolean r3 = xhss.AbstractC0007.m97(r5, r3)
            if (r3 == 0) goto L5b
            int r4 = r4.f2614
            goto L1e
        L5b:
            if (r0 == r1) goto L60
            int r0 = r0 + (-1)
            goto L4e
        L60:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r1 = 0
            return r1
        L9:
            r1.mo1228(r2)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r12) {
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L88
            java.lang.Object[] r0 = r11.f2615
            int r0 = r0.length
            if (r0 != 0) goto Le
            goto L88
        Le:
            int r0 = r11.f2614
            int r2 = r11.f2616
            int r2 = r2 + r0
            int r0 = r11.m1371(r2)
            int r2 = r11.f2614
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L3a
            r5 = r2
        L1e:
            java.lang.Object[] r6 = r11.f2615
            if (r2 >= r0) goto L36
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L32
            java.lang.Object[] r7 = r11.f2615
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L33
        L32:
            r1 = r4
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            java.util.Arrays.fill(r6, r5, r0, r3)
            goto L7a
        L3a:
            java.lang.Object[] r5 = r11.f2615
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L3f:
            if (r2 >= r5) goto L59
            java.lang.Object[] r8 = r11.f2615
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L55
            java.lang.Object[] r8 = r11.f2615
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L56
        L55:
            r7 = r4
        L56:
            int r2 = r2 + 1
            goto L3f
        L59:
            int r2 = r11.m1371(r6)
            r5 = r2
        L5e:
            if (r1 >= r0) goto L79
            java.lang.Object[] r2 = r11.f2615
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L75
            java.lang.Object[] r2 = r11.f2615
            r2[r5] = r6
            int r5 = r11.m1369(r5)
            goto L76
        L75:
            r7 = r4
        L76:
            int r1 = r1 + 1
            goto L5e
        L79:
            r1 = r7
        L7a:
            if (r1 == 0) goto L88
            r11.m1370()
            int r12 = r11.f2614
            int r5 = r5 - r12
            int r12 = r11.m1374(r5)
            r11.f2616 = r12
        L88:
            return r1
    }

    public final java.lang.Object removeFirst() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1f
            r4.m1370()
            java.lang.Object[] r0 = r4.f2615
            int r1 = r4.f2614
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            int r0 = r4.m1369(r1)
            r4.f2614 = r0
            int r0 = r4.f2616
            int r0 = r0 + (-1)
            r4.f2616 = r0
            return r2
        L1f:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r0 = "ArrayDeque is empty."
            r4.<init>(r0)
            throw r4
    }

    public final java.lang.Object removeLast() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L22
            r4.m1370()
            int r0 = r4.f2614
            int r1 = xhss.AbstractC0086.m243(r4)
            int r1 = r1 + r0
            int r0 = r4.m1371(r1)
            java.lang.Object[] r1 = r4.f2615
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r4.f2616
            int r0 = r0 + (-1)
            r4.f2616 = r0
            return r2
        L22:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r0 = "ArrayDeque is empty."
            r4.<init>(r0)
            throw r4
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
            r7 = this;
            int r0 = r7.f2616
            xhss.AbstractC0561.m997(r8, r9, r0)
            int r0 = r9 - r8
            if (r0 != 0) goto La
            return
        La:
            int r1 = r7.f2616
            if (r0 != r1) goto L12
            r7.clear()
            return
        L12:
            r1 = 1
            if (r0 != r1) goto L19
            r7.mo1228(r8)
            return
        L19:
            r7.m1370()
            int r2 = r7.f2616
            int r2 = r2 - r9
            int r3 = r7.f2614
            int r4 = r7.f2614
            if (r8 >= r2) goto L64
            int r2 = r8 + (-1)
            int r2 = r2 + r3
            int r2 = r7.m1371(r2)
            int r9 = r9 - r1
            int r9 = r9 + r4
            int r9 = r7.m1371(r9)
        L32:
            if (r8 <= 0) goto L55
            int r1 = r2 + 1
            int r3 = r9 + 1
            int r3 = java.lang.Math.min(r1, r3)
            int r3 = java.lang.Math.min(r8, r3)
            java.lang.Object[] r4 = r7.f2615
            int r9 = r9 - r3
            int r5 = r9 + 1
            int r2 = r2 - r3
            int r6 = r2 + 1
            xhss.AbstractC0193.m448(r5, r6, r1, r4, r4)
            int r2 = r7.m1374(r2)
            int r9 = r7.m1374(r9)
            int r8 = r8 - r3
            goto L32
        L55:
            int r8 = r7.f2614
            int r8 = r8 + r0
            int r8 = r7.m1371(r8)
            int r9 = r7.f2614
            r7.m1372(r9, r8)
            r7.f2614 = r8
            goto La4
        L64:
            int r3 = r3 + r9
            int r1 = r7.m1371(r3)
            int r4 = r4 + r8
            int r8 = r7.m1371(r4)
            int r2 = r7.f2616
        L70:
            int r2 = r2 - r9
            if (r2 <= 0) goto L92
            java.lang.Object[] r9 = r7.f2615
            int r3 = r9.length
            int r3 = r3 - r1
            int r9 = r9.length
            int r9 = r9 - r8
            int r9 = java.lang.Math.min(r3, r9)
            int r9 = java.lang.Math.min(r2, r9)
            java.lang.Object[] r3 = r7.f2615
            int r4 = r1 + r9
            xhss.AbstractC0193.m448(r8, r1, r4, r3, r3)
            int r1 = r7.m1371(r4)
            int r8 = r8 + r9
            int r8 = r7.m1371(r8)
            goto L70
        L92:
            int r8 = r7.f2614
            int r9 = r7.f2616
            int r9 = r9 + r8
            int r8 = r7.m1371(r9)
            int r9 = r8 - r0
            int r9 = r7.m1374(r9)
            r7.m1372(r9, r8)
        La4:
            int r8 = r7.f2616
            int r8 = r8 - r0
            r7.f2616 = r8
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r12) {
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L88
            java.lang.Object[] r0 = r11.f2615
            int r0 = r0.length
            if (r0 != 0) goto Le
            goto L88
        Le:
            int r0 = r11.f2614
            int r2 = r11.f2616
            int r2 = r2 + r0
            int r0 = r11.m1371(r2)
            int r2 = r11.f2614
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L3a
            r5 = r2
        L1e:
            java.lang.Object[] r6 = r11.f2615
            if (r2 >= r0) goto L36
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L32
            java.lang.Object[] r7 = r11.f2615
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L33
        L32:
            r1 = r4
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            java.util.Arrays.fill(r6, r5, r0, r3)
            goto L7a
        L3a:
            java.lang.Object[] r5 = r11.f2615
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L3f:
            if (r2 >= r5) goto L59
            java.lang.Object[] r8 = r11.f2615
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L55
            java.lang.Object[] r8 = r11.f2615
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L56
        L55:
            r7 = r4
        L56:
            int r2 = r2 + 1
            goto L3f
        L59:
            int r2 = r11.m1371(r6)
            r5 = r2
        L5e:
            if (r1 >= r0) goto L79
            java.lang.Object[] r2 = r11.f2615
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L75
            java.lang.Object[] r2 = r11.f2615
            r2[r5] = r6
            int r5 = r11.m1369(r5)
            goto L76
        L75:
            r7 = r4
        L76:
            int r1 = r1 + 1
            goto L5e
        L79:
            r1 = r7
        L7a:
            if (r1 == 0) goto L88
            r11.m1370()
            int r12 = r11.f2614
            int r5 = r5 - r12
            int r12 = r11.m1374(r5)
            r11.f2616 = r12
        L88:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f2616
            if (r3 < 0) goto L14
            if (r3 >= r0) goto L14
            int r0 = r2.f2614
            int r0 = r0 + r3
            int r3 = r2.m1371(r0)
            java.lang.Object[] r2 = r2.f2615
            r0 = r2[r3]
            r2[r3] = r4
            return r0
        L14:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r3 = xhss.AbstractC0390.m782(r3, r0, r4, r1)
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.mo1230()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r6) {
            r5 = this;
            int r0 = r6.length
            int r1 = r5.f2616
            if (r0 < r1) goto L6
            goto L14
        L6:
            java.lang.Class r6 = r6.getClass()
            java.lang.Class r6 = r6.getComponentType()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L14:
            int r0 = r5.f2614
            int r1 = r5.f2616
            int r1 = r1 + r0
            int r0 = r5.m1371(r1)
            int r1 = r5.f2614
            if (r1 >= r0) goto L28
            java.lang.Object[] r2 = r5.f2615
            r3 = 2
            xhss.AbstractC0193.m450(r1, r0, r3, r2, r6)
            goto L40
        L28:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L40
            java.lang.Object[] r1 = r5.f2615
            int r2 = r5.f2614
            int r3 = r1.length
            r4 = 0
            xhss.AbstractC0193.m448(r4, r2, r3, r1, r6)
            java.lang.Object[] r1 = r5.f2615
            int r2 = r1.length
            int r3 = r5.f2614
            int r2 = r2 - r3
            xhss.AbstractC0193.m448(r2, r4, r0, r1, r6)
        L40:
            int r5 = r5.f2616
            int r0 = r6.length
            if (r5 >= r0) goto L48
            r0 = 0
            r6[r5] = r0
        L48:
            return r6
    }

    @Override // xhss.AbstractC0779
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo1228(int r9) {
            r8 = this;
            int r0 = r8.f2616
            if (r9 < 0) goto L8b
            if (r9 >= r0) goto L8b
            int r0 = xhss.AbstractC0086.m243(r8)
            if (r9 != r0) goto L11
            java.lang.Object r8 = r8.removeLast()
            return r8
        L11:
            if (r9 != 0) goto L18
            java.lang.Object r8 = r8.removeFirst()
            return r8
        L18:
            r8.m1370()
            int r0 = r8.f2614
            int r0 = r0 + r9
            int r0 = r8.m1371(r0)
            java.lang.Object[] r1 = r8.f2615
            r2 = r1[r0]
            int r3 = r8.f2616
            r4 = 1
            int r3 = r3 >> r4
            int r5 = r8.f2614
            r6 = 0
            r7 = 0
            if (r9 >= r3) goto L59
            if (r0 < r5) goto L38
            int r9 = r5 + 1
            xhss.AbstractC0193.m448(r9, r5, r0, r1, r1)
            goto L4c
        L38:
            xhss.AbstractC0193.m448(r4, r7, r0, r1, r1)
            java.lang.Object[] r9 = r8.f2615
            int r0 = r9.length
            int r0 = r0 - r4
            r0 = r9[r0]
            r9[r7] = r0
            int r0 = r8.f2614
            int r1 = r0 + 1
            int r3 = r9.length
            int r3 = r3 - r4
            xhss.AbstractC0193.m448(r1, r0, r3, r9, r9)
        L4c:
            java.lang.Object[] r9 = r8.f2615
            int r0 = r8.f2614
            r9[r0] = r6
            int r9 = r8.m1369(r0)
            r8.f2614 = r9
            goto L85
        L59:
            int r9 = xhss.AbstractC0086.m243(r8)
            int r9 = r9 + r5
            int r9 = r8.m1371(r9)
            java.lang.Object[] r1 = r8.f2615
            if (r0 > r9) goto L6e
            int r3 = r0 + 1
            int r5 = r9 + 1
            xhss.AbstractC0193.m448(r0, r3, r5, r1, r1)
            goto L81
        L6e:
            int r3 = r0 + 1
            int r5 = r1.length
            xhss.AbstractC0193.m448(r0, r3, r5, r1, r1)
            java.lang.Object[] r0 = r8.f2615
            int r1 = r0.length
            int r1 = r1 - r4
            r3 = r0[r7]
            r0[r1] = r3
            int r1 = r9 + 1
            xhss.AbstractC0193.m448(r7, r4, r1, r0, r0)
        L81:
            java.lang.Object[] r0 = r8.f2615
            r0[r9] = r6
        L85:
            int r9 = r8.f2616
            int r9 = r9 - r4
            r8.f2616 = r9
            return r2
        L8b:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r9 = xhss.AbstractC0390.m782(r9, r0, r1, r2)
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m1368(int r5, java.util.Collection r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object[] r1 = r4.f2615
            int r1 = r1.length
        L7:
            if (r5 >= r1) goto L1a
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object[] r2 = r4.f2615
            java.lang.Object r3 = r0.next()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L7
        L1a:
            int r5 = r4.f2614
            r1 = 0
        L1d:
            if (r1 >= r5) goto L30
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object[] r2 = r4.f2615
            java.lang.Object r3 = r0.next()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1d
        L30:
            int r5 = r4.f2616
            int r6 = r6.size()
            int r6 = r6 + r5
            r4.f2616 = r6
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int m1369(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f2615
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r1 != r0) goto L9
            r0 = 0
            return r0
        L9:
            int r1 = r1 + 1
            return r1
    }

    @Override // xhss.AbstractC0779
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final int mo1230() {
            r0 = this;
            int r0 = r0.f2616
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m1370() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int m1371(int r2) {
            r1 = this;
            java.lang.Object[] r1 = r1.f2615
            int r0 = r1.length
            if (r2 < r0) goto L7
            int r1 = r1.length
            int r2 = r2 - r1
        L7:
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1372(int r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.f2615
            r1 = 0
            if (r4 >= r5) goto L9
            java.util.Arrays.fill(r0, r4, r5, r1)
            return
        L9:
            int r2 = r0.length
            java.util.Arrays.fill(r0, r4, r2, r1)
            java.lang.Object[] r3 = r3.f2615
            r4 = 0
            java.util.Arrays.fill(r3, r4, r5, r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1373(int r5) {
            r4 = this;
            if (r5 < 0) goto L44
            java.lang.Object[] r0 = r4.f2615
            int r1 = r0.length
            if (r5 > r1) goto L8
            return
        L8:
            java.lang.Object[] r1 = xhss.C0801.f2613
            if (r0 != r1) goto L16
            r0 = 10
            if (r5 >= r0) goto L11
            r5 = r0
        L11:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r4.f2615 = r5
            return
        L16:
            int r1 = r0.length
            int r2 = r1 >> 1
            int r1 = r1 + r2
            int r2 = r1 - r5
            if (r2 >= 0) goto L1f
            r1 = r5
        L1f:
            r2 = 2147483639(0x7ffffff7, float:NaN)
            int r3 = r1 - r2
            if (r3 <= 0) goto L2d
            if (r5 <= r2) goto L2c
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L2d
        L2c:
            r1 = r2
        L2d:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            int r1 = r4.f2614
            int r2 = r0.length
            r3 = 0
            xhss.AbstractC0193.m448(r3, r1, r2, r0, r5)
            java.lang.Object[] r0 = r4.f2615
            int r1 = r0.length
            int r2 = r4.f2614
            int r1 = r1 - r2
            xhss.AbstractC0193.m448(r1, r3, r2, r0, r5)
            r4.f2614 = r3
            r4.f2615 = r5
            return
        L44:
            java.lang.String r4 = "Deque is too big."
            xhss.C0532.m950(r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int m1374(int r1) {
            r0 = this;
            if (r1 >= 0) goto L6
            java.lang.Object[] r0 = r0.f2615
            int r0 = r0.length
            int r1 = r1 + r0
        L6:
            return r1
    }
}
