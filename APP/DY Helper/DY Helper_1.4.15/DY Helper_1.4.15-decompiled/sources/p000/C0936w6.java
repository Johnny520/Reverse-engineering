package p000;

/* JADX INFO: renamed from: w6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0936w6 extends p000.AbstractC1101 {

    /* JADX INFO: renamed from: θ */
    public static final java.lang.Object[] f11577 = null;

    /* JADX INFO: renamed from: ε */
    public int f11578;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object[] f11579;

    /* JADX INFO: renamed from: η */
    public int f11580;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p000.C0936w6.f11577 = r0
            return
    }

    public C0936w6() {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = p000.C0936w6.f11577
            r1.f11579 = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f11580
            if (r8 < 0) goto L9b
            if (r8 > r0) goto L9b
            if (r8 != r0) goto Lc
            r7.addLast(r9)
            return
        Lc:
            if (r8 != 0) goto L12
            r7.addFirst(r9)
            return
        L12:
            r7.m6321()
            int r0 = r7.f11580
            r1 = 1
            int r0 = r0 + r1
            r7.m6316(r0)
            int r0 = r7.f11578
            int r0 = r0 + r8
            int r0 = r7.m6320(r0)
            int r2 = r7.f11580
            int r3 = r2 + 1
            int r3 = r3 >> r1
            r4 = 0
            if (r8 >= r3) goto L6e
            if (r0 != 0) goto L35
            java.lang.Object[] r8 = r7.f11579
            r8.getClass()
            int r8 = r8.length
            int r8 = r8 - r1
            goto L37
        L35:
            int r8 = r0 + (-1)
        L37:
            int r0 = r7.f11578
            if (r0 != 0) goto L41
            java.lang.Object[] r0 = r7.f11579
            r0.getClass()
            int r0 = r0.length
        L41:
            int r0 = r0 - r1
            int r2 = r7.f11578
            java.lang.Object[] r3 = r7.f11579
            if (r8 < r2) goto L54
            r4 = r3[r2]
            r3[r0] = r4
            int r4 = r2 + 1
            int r5 = r8 + 1
            p000.AbstractC0312g7.m2238(r3, r3, r2, r4, r5)
            goto L67
        L54:
            int r5 = r2 + (-1)
            int r6 = r3.length
            p000.AbstractC0312g7.m2238(r3, r3, r5, r2, r6)
            java.lang.Object[] r2 = r7.f11579
            int r3 = r2.length
            int r3 = r3 - r1
            r5 = r2[r4]
            r2[r3] = r5
            int r3 = r8 + 1
            p000.AbstractC0312g7.m2238(r2, r2, r4, r1, r3)
        L67:
            java.lang.Object[] r2 = r7.f11579
            r2[r8] = r9
            r7.f11578 = r0
            goto L95
        L6e:
            int r8 = r7.f11578
            int r2 = r2 + r8
            int r8 = r7.m6320(r2)
            java.lang.Object[] r2 = r7.f11579
            if (r0 >= r8) goto L7f
            int r3 = r0 + 1
            p000.AbstractC0312g7.m2238(r2, r2, r3, r0, r8)
            goto L91
        L7f:
            p000.AbstractC0312g7.m2238(r2, r2, r1, r4, r8)
            java.lang.Object[] r8 = r7.f11579
            int r2 = r8.length
            int r2 = r2 - r1
            r2 = r8[r2]
            r8[r4] = r2
            int r2 = r0 + 1
            int r3 = r8.length
            int r3 = r3 - r1
            p000.AbstractC0312g7.m2238(r8, r8, r2, r0, r3)
        L91:
            java.lang.Object[] r8 = r7.f11579
            r8[r0] = r9
        L95:
            int r8 = r7.f11580
            int r8 = r8 + r1
            r7.f11580 = r8
            return
        L9b:
            java.lang.String r7 = "index: "
            java.lang.String r9 = ", size: "
            java.lang.String r7 = p000.AbstractC0602nx.m4125(r8, r0, r7, r9)
            p000.C1080.m7269(r7)
            return
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
            r10.getClass()
            int r0 = r8.f11580
            if (r9 < 0) goto Ld1
            if (r9 > r0) goto Ld1
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto L11
            return r1
        L11:
            int r0 = r8.f11580
            if (r9 != r0) goto L1a
            boolean r8 = r8.addAll(r10)
            return r8
        L1a:
            r8.m6321()
            int r0 = r8.f11580
            int r2 = r10.size()
            int r2 = r2 + r0
            r8.m6316(r2)
            int r0 = r8.f11578
            int r2 = r8.f11580
            int r2 = r2 + r0
            int r0 = r8.m6320(r2)
            int r2 = r8.f11578
            int r2 = r2 + r9
            int r2 = r8.m6320(r2)
            int r3 = r10.size()
            int r4 = r8.f11580
            r5 = 1
            int r4 = r4 + r5
            int r4 = r4 >> r5
            if (r9 >= r4) goto L8d
            int r9 = r8.f11578
            int r0 = r9 - r3
            java.lang.Object[] r4 = r8.f11579
            if (r2 < r9) goto L6a
            if (r0 < 0) goto L50
            p000.AbstractC0312g7.m2238(r4, r4, r0, r9, r2)
            goto L82
        L50:
            int r6 = r4.length
            int r0 = r0 + r6
            int r6 = r2 - r9
            int r7 = r4.length
            int r7 = r7 - r0
            if (r7 < r6) goto L5c
            p000.AbstractC0312g7.m2238(r4, r4, r0, r9, r2)
            goto L82
        L5c:
            int r6 = r9 + r7
            p000.AbstractC0312g7.m2238(r4, r4, r0, r9, r6)
            java.lang.Object[] r9 = r8.f11579
            int r4 = r8.f11578
            int r4 = r4 + r7
            p000.AbstractC0312g7.m2238(r9, r9, r1, r4, r2)
            goto L82
        L6a:
            int r6 = r4.length
            p000.AbstractC0312g7.m2238(r4, r4, r0, r9, r6)
            java.lang.Object[] r9 = r8.f11579
            if (r3 < r2) goto L78
            int r4 = r9.length
            int r4 = r4 - r3
            p000.AbstractC0312g7.m2238(r9, r9, r4, r1, r2)
            goto L82
        L78:
            int r4 = r9.length
            int r4 = r4 - r3
            p000.AbstractC0312g7.m2238(r9, r9, r4, r1, r3)
            java.lang.Object[] r9 = r8.f11579
            p000.AbstractC0312g7.m2238(r9, r9, r1, r3, r2)
        L82:
            r8.f11578 = r0
            int r2 = r2 - r3
            int r9 = r8.m6318(r2)
            r8.m6315(r9, r10)
            return r5
        L8d:
            int r9 = r2 + r3
            java.lang.Object[] r4 = r8.f11579
            if (r2 >= r0) goto Lb1
            int r3 = r3 + r0
            int r6 = r4.length
            if (r3 > r6) goto L9b
            p000.AbstractC0312g7.m2238(r4, r4, r9, r2, r0)
            goto Lcd
        L9b:
            int r6 = r4.length
            if (r9 < r6) goto La4
            int r1 = r4.length
            int r9 = r9 - r1
            p000.AbstractC0312g7.m2238(r4, r4, r9, r2, r0)
            goto Lcd
        La4:
            int r6 = r4.length
            int r3 = r3 - r6
            int r3 = r0 - r3
            p000.AbstractC0312g7.m2238(r4, r4, r1, r3, r0)
            java.lang.Object[] r0 = r8.f11579
            p000.AbstractC0312g7.m2238(r0, r0, r9, r2, r3)
            goto Lcd
        Lb1:
            p000.AbstractC0312g7.m2238(r4, r4, r3, r1, r0)
            java.lang.Object[] r0 = r8.f11579
            int r4 = r0.length
            if (r9 < r4) goto Lc0
            int r1 = r0.length
            int r9 = r9 - r1
            int r1 = r0.length
            p000.AbstractC0312g7.m2238(r0, r0, r9, r2, r1)
            goto Lcd
        Lc0:
            int r4 = r0.length
            int r4 = r4 - r3
            int r6 = r0.length
            p000.AbstractC0312g7.m2238(r0, r0, r1, r4, r6)
            java.lang.Object[] r0 = r8.f11579
            int r1 = r0.length
            int r1 = r1 - r3
            p000.AbstractC0312g7.m2238(r0, r0, r9, r2, r1)
        Lcd:
            r8.m6315(r2, r10)
            return r5
        Ld1:
            java.lang.String r8 = "index: "
            java.lang.String r10 = ", size: "
            java.lang.String r8 = p000.AbstractC0602nx.m4125(r9, r0, r8, r10)
            p000.C1080.m7269(r8)
            r8 = 0
            return r8
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lb
            r2 = 0
            return r2
        Lb:
            r2.m6321()
            int r0 = r2.mo4827()
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.m6316(r1)
            int r0 = r2.f11578
            int r1 = r2.mo4827()
            int r1 = r1 + r0
            int r0 = r2.m6320(r1)
            r2.m6315(r0, r3)
            r2 = 1
            return r2
    }

    public final void addFirst(java.lang.Object r3) {
            r2 = this;
            r2.m6321()
            int r0 = r2.f11580
            int r0 = r0 + 1
            r2.m6316(r0)
            int r0 = r2.f11578
            if (r0 != 0) goto L14
            java.lang.Object[] r0 = r2.f11579
            r0.getClass()
            int r0 = r0.length
        L14:
            int r0 = r0 + (-1)
            r2.f11578 = r0
            java.lang.Object[] r1 = r2.f11579
            r1[r0] = r3
            int r3 = r2.f11580
            int r3 = r3 + 1
            r2.f11580 = r3
            return
    }

    public final void addLast(java.lang.Object r4) {
            r3 = this;
            r3.m6321()
            int r0 = r3.mo4827()
            int r0 = r0 + 1
            r3.m6316(r0)
            java.lang.Object[] r0 = r3.f11579
            int r1 = r3.f11578
            int r2 = r3.mo4827()
            int r2 = r2 + r1
            int r1 = r3.m6320(r2)
            r0[r1] = r4
            int r4 = r3.mo4827()
            int r4 = r4 + 1
            r3.f11580 = r4
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L19
            r2.m6321()
            int r0 = r2.f11578
            int r1 = r2.mo4827()
            int r1 = r1 + r0
            int r0 = r2.m6320(r1)
            int r1 = r2.f11578
            r2.m6319(r1, r0)
        L19:
            r0 = 0
            r2.f11578 = r0
            r2.f11580 = r0
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
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.mo4827()
            if (r3 < 0) goto L14
            if (r3 >= r0) goto L14
            java.lang.Object[] r0 = r2.f11579
            int r1 = r2.f11578
            int r1 = r1 + r3
            int r2 = r2.m6320(r1)
            r2 = r0[r2]
            return r2
        L14:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r1)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f11578
            int r1 = r4.mo4827()
            int r1 = r1 + r0
            int r0 = r4.m6320(r1)
            int r1 = r4.f11578
            if (r1 >= r0) goto L22
        Lf:
            if (r1 >= r0) goto L50
            java.lang.Object[] r2 = r4.f11579
            r2 = r2[r1]
            boolean r2 = p000.ln0.m3626(r5, r2)
            if (r2 == 0) goto L1f
            int r4 = r4.f11578
        L1d:
            int r1 = r1 - r4
            return r1
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            if (r1 < r0) goto L50
            java.lang.Object[] r2 = r4.f11579
            int r2 = r2.length
        L27:
            if (r1 >= r2) goto L39
            java.lang.Object[] r3 = r4.f11579
            r3 = r3[r1]
            boolean r3 = p000.ln0.m3626(r5, r3)
            if (r3 == 0) goto L36
            int r4 = r4.f11578
            goto L1d
        L36:
            int r1 = r1 + 1
            goto L27
        L39:
            r1 = 0
        L3a:
            if (r1 >= r0) goto L50
            java.lang.Object[] r2 = r4.f11579
            r2 = r2[r1]
            boolean r2 = p000.ln0.m3626(r5, r2)
            if (r2 == 0) goto L4d
            java.lang.Object[] r5 = r4.f11579
            int r5 = r5.length
            int r1 = r1 + r5
            int r4 = r4.f11578
            goto L1d
        L4d:
            int r1 = r1 + 1
            goto L3a
        L50:
            r4 = -1
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.mo4827()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final java.lang.Object last() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L18
            java.lang.Object[] r0 = r3.f11579
            int r1 = r3.f11578
            int r2 = r3.size()
            int r2 = r2 + (-1)
            int r2 = r2 + r1
            int r3 = r3.m6320(r2)
            r3 = r0[r3]
            return r3
        L18:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            java.lang.String r0 = "ArrayDeque is empty."
            r3.<init>(r0)
            throw r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f11578
            int r1 = r4.f11580
            int r1 = r1 + r0
            int r0 = r4.m6320(r1)
            int r1 = r4.f11578
            r2 = -1
            if (r1 >= r0) goto L25
            int r0 = r0 + (-1)
            if (r1 > r0) goto L5b
        L12:
            java.lang.Object[] r3 = r4.f11579
            r3 = r3[r0]
            boolean r3 = p000.ln0.m3626(r5, r3)
            if (r3 == 0) goto L20
            int r4 = r4.f11578
        L1e:
            int r0 = r0 - r4
            return r0
        L20:
            if (r0 == r1) goto L5b
            int r0 = r0 + (-1)
            goto L12
        L25:
            if (r1 <= r0) goto L5b
            int r0 = r0 + (-1)
        L29:
            java.lang.Object[] r1 = r4.f11579
            if (r2 >= r0) goto L3f
            r1 = r1[r0]
            boolean r1 = p000.ln0.m3626(r5, r1)
            if (r1 == 0) goto L3c
            java.lang.Object[] r5 = r4.f11579
            int r5 = r5.length
            int r0 = r0 + r5
            int r4 = r4.f11578
            goto L1e
        L3c:
            int r0 = r0 + (-1)
            goto L29
        L3f:
            r1.getClass()
            int r0 = r1.length
            int r0 = r0 + (-1)
            int r1 = r4.f11578
            if (r1 > r0) goto L5b
        L49:
            java.lang.Object[] r3 = r4.f11579
            r3 = r3[r0]
            boolean r3 = p000.ln0.m3626(r5, r3)
            if (r3 == 0) goto L56
            int r4 = r4.f11578
            goto L1e
        L56:
            if (r0 == r1) goto L5b
            int r0 = r0 + (-1)
            goto L49
        L5b:
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
            r1.mo4828(r2)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r12) {
            r11 = this;
            r12.getClass()
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L8d
            java.lang.Object[] r0 = r11.f11579
            int r0 = r0.length
            if (r0 != 0) goto L11
            goto L8d
        L11:
            int r0 = r11.f11578
            int r2 = r11.mo4827()
            int r2 = r2 + r0
            int r0 = r11.m6320(r2)
            int r2 = r11.f11578
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L3f
            r5 = r2
        L23:
            java.lang.Object[] r6 = r11.f11579
            if (r2 >= r0) goto L3b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L37
            java.lang.Object[] r7 = r11.f11579
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L38
        L37:
            r1 = r4
        L38:
            int r2 = r2 + 1
            goto L23
        L3b:
            p000.AbstractC0312g7.m2244(r5, r0, r3, r6)
            goto L7f
        L3f:
            java.lang.Object[] r5 = r11.f11579
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L44:
            if (r2 >= r5) goto L5e
            java.lang.Object[] r8 = r11.f11579
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L5a
            java.lang.Object[] r8 = r11.f11579
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L5b
        L5a:
            r7 = r4
        L5b:
            int r2 = r2 + 1
            goto L44
        L5e:
            int r2 = r11.m6320(r6)
            r5 = r2
        L63:
            if (r1 >= r0) goto L7e
            java.lang.Object[] r2 = r11.f11579
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L7a
            java.lang.Object[] r2 = r11.f11579
            r2[r5] = r6
            int r5 = r11.m6317(r5)
            goto L7b
        L7a:
            r7 = r4
        L7b:
            int r1 = r1 + 1
            goto L63
        L7e:
            r1 = r7
        L7f:
            if (r1 == 0) goto L8d
            r11.m6321()
            int r12 = r11.f11578
            int r5 = r5 - r12
            int r12 = r11.m6318(r5)
            r11.f11580 = r12
        L8d:
            return r1
    }

    public final java.lang.Object removeFirst() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L21
            r4.m6321()
            java.lang.Object[] r0 = r4.f11579
            int r1 = r4.f11578
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            int r0 = r4.m6317(r1)
            r4.f11578 = r0
            int r0 = r4.mo4827()
            int r0 = r0 + (-1)
            r4.f11580 = r0
            return r2
        L21:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r0 = "ArrayDeque is empty."
            r4.<init>(r0)
            throw r4
    }

    public final java.lang.Object removeLast() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L26
            r4.m6321()
            int r0 = r4.f11578
            int r1 = r4.size()
            int r1 = r1 + (-1)
            int r1 = r1 + r0
            int r0 = r4.m6320(r1)
            java.lang.Object[] r1 = r4.f11579
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r4.mo4827()
            int r0 = r0 + (-1)
            r4.f11580 = r0
            return r2
        L26:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r0 = "ArrayDeque is empty."
            r4.<init>(r0)
            throw r4
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
            r7 = this;
            int r0 = r7.f11580
            p000.jx0.m3046(r8, r9, r0)
            int r0 = r9 - r8
            if (r0 != 0) goto La
            return
        La:
            int r1 = r7.f11580
            if (r0 != r1) goto L12
            r7.clear()
            return
        L12:
            r1 = 1
            if (r0 != r1) goto L19
            r7.mo4828(r8)
            return
        L19:
            r7.m6321()
            int r2 = r7.f11580
            int r2 = r2 - r9
            int r3 = r7.f11578
            if (r8 >= r2) goto L64
            int r2 = r8 + (-1)
            int r2 = r2 + r3
            int r2 = r7.m6320(r2)
            int r9 = r9 - r1
            int r1 = r7.f11578
            int r1 = r1 + r9
            int r9 = r7.m6320(r1)
        L32:
            if (r8 <= 0) goto L55
            int r1 = r2 + 1
            int r3 = r9 + 1
            int r3 = java.lang.Math.min(r1, r3)
            int r3 = java.lang.Math.min(r8, r3)
            java.lang.Object[] r4 = r7.f11579
            int r9 = r9 - r3
            int r5 = r9 + 1
            int r2 = r2 - r3
            int r6 = r2 + 1
            p000.AbstractC0312g7.m2238(r4, r4, r5, r6, r1)
            int r2 = r7.m6318(r2)
            int r9 = r7.m6318(r9)
            int r8 = r8 - r3
            goto L32
        L55:
            int r8 = r7.f11578
            int r8 = r8 + r0
            int r8 = r7.m6320(r8)
            int r9 = r7.f11578
            r7.m6319(r9, r8)
            r7.f11578 = r8
            goto La6
        L64:
            int r3 = r3 + r9
            int r1 = r7.m6320(r3)
            int r2 = r7.f11578
            int r2 = r2 + r8
            int r8 = r7.m6320(r2)
            int r2 = r7.f11580
        L72:
            int r2 = r2 - r9
            if (r2 <= 0) goto L94
            java.lang.Object[] r9 = r7.f11579
            int r3 = r9.length
            int r3 = r3 - r1
            int r9 = r9.length
            int r9 = r9 - r8
            int r9 = java.lang.Math.min(r3, r9)
            int r9 = java.lang.Math.min(r2, r9)
            java.lang.Object[] r3 = r7.f11579
            int r4 = r1 + r9
            p000.AbstractC0312g7.m2238(r3, r3, r8, r1, r4)
            int r1 = r7.m6320(r4)
            int r8 = r8 + r9
            int r8 = r7.m6320(r8)
            goto L72
        L94:
            int r8 = r7.f11578
            int r9 = r7.f11580
            int r9 = r9 + r8
            int r8 = r7.m6320(r9)
            int r9 = r8 - r0
            int r9 = r7.m6318(r9)
            r7.m6319(r9, r8)
        La6:
            int r8 = r7.f11580
            int r8 = r8 - r0
            r7.f11580 = r8
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r12) {
            r11 = this;
            r12.getClass()
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L8d
            java.lang.Object[] r0 = r11.f11579
            int r0 = r0.length
            if (r0 != 0) goto L11
            goto L8d
        L11:
            int r0 = r11.f11578
            int r2 = r11.mo4827()
            int r2 = r2 + r0
            int r0 = r11.m6320(r2)
            int r2 = r11.f11578
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L3f
            r5 = r2
        L23:
            java.lang.Object[] r6 = r11.f11579
            if (r2 >= r0) goto L3b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L37
            java.lang.Object[] r7 = r11.f11579
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L38
        L37:
            r1 = r4
        L38:
            int r2 = r2 + 1
            goto L23
        L3b:
            p000.AbstractC0312g7.m2244(r5, r0, r3, r6)
            goto L7f
        L3f:
            java.lang.Object[] r5 = r11.f11579
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L44:
            if (r2 >= r5) goto L5e
            java.lang.Object[] r8 = r11.f11579
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L5a
            java.lang.Object[] r8 = r11.f11579
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L5b
        L5a:
            r7 = r4
        L5b:
            int r2 = r2 + 1
            goto L44
        L5e:
            int r2 = r11.m6320(r6)
            r5 = r2
        L63:
            if (r1 >= r0) goto L7e
            java.lang.Object[] r2 = r11.f11579
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L7a
            java.lang.Object[] r2 = r11.f11579
            r2[r5] = r6
            int r5 = r11.m6317(r5)
            goto L7b
        L7a:
            r7 = r4
        L7b:
            int r1 = r1 + 1
            goto L63
        L7e:
            r1 = r7
        L7f:
            if (r1 == 0) goto L8d
            r11.m6321()
            int r12 = r11.f11578
            int r5 = r5 - r12
            int r12 = r11.m6318(r5)
            r11.f11580 = r12
        L8d:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.mo4827()
            if (r2 < 0) goto L16
            if (r2 >= r0) goto L16
            int r0 = r1.f11578
            int r0 = r0 + r2
            int r2 = r1.m6320(r0)
            java.lang.Object[] r1 = r1.f11579
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L16:
            java.lang.String r1 = "index: "
            java.lang.String r3 = ", size: "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r2, r0, r1, r3)
            p000.C1080.m7269(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.mo4827()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r6) {
            r5 = this;
            r6.getClass()
            int r0 = r6.length
            int r1 = r5.f11580
            if (r0 < r1) goto L9
            goto L1a
        L9:
            java.lang.Class r6 = r6.getClass()
            java.lang.Class r6 = r6.getComponentType()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
            r6.getClass()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L1a:
            int r0 = r5.f11578
            int r1 = r5.f11580
            int r1 = r1 + r0
            int r0 = r5.m6320(r1)
            int r1 = r5.f11578
            if (r1 >= r0) goto L2e
            java.lang.Object[] r2 = r5.f11579
            r3 = 2
            p000.AbstractC0312g7.m2240(r2, r6, r1, r0, r3)
            goto L46
        L2e:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L46
            java.lang.Object[] r1 = r5.f11579
            int r2 = r5.f11578
            int r3 = r1.length
            r4 = 0
            p000.AbstractC0312g7.m2238(r1, r6, r4, r2, r3)
            java.lang.Object[] r1 = r5.f11579
            int r2 = r1.length
            int r3 = r5.f11578
            int r2 = r2 - r3
            p000.AbstractC0312g7.m2238(r1, r6, r2, r4, r0)
        L46:
            int r5 = r5.f11580
            int r0 = r6.length
            if (r5 >= r0) goto L4e
            r0 = 0
            r6[r5] = r0
        L4e:
            return r6
    }

    @Override // p000.AbstractC1101
    /* JADX INFO: renamed from: α */
    public final int mo4827() {
            r0 = this;
            int r0 = r0.f11580
            return r0
    }

    @Override // p000.AbstractC1101
    /* JADX INFO: renamed from: β */
    public final java.lang.Object mo4828(int r9) {
            r8 = this;
            int r0 = r8.f11580
            if (r9 < 0) goto L8d
            if (r9 >= r0) goto L8d
            int r0 = r8.mo4827()
            r1 = 1
            int r0 = r0 - r1
            if (r9 != r0) goto L13
            java.lang.Object r8 = r8.removeLast()
            return r8
        L13:
            if (r9 != 0) goto L1a
            java.lang.Object r8 = r8.removeFirst()
            return r8
        L1a:
            r8.m6321()
            int r0 = r8.f11578
            int r0 = r0 + r9
            int r0 = r8.m6320(r0)
            java.lang.Object[] r2 = r8.f11579
            r3 = r2[r0]
            int r4 = r8.f11580
            int r4 = r4 >> r1
            int r5 = r8.f11578
            r6 = 0
            r7 = 0
            if (r9 >= r4) goto L5a
            if (r0 < r5) goto L39
            int r9 = r5 + 1
            p000.AbstractC0312g7.m2238(r2, r2, r9, r5, r0)
            goto L4d
        L39:
            p000.AbstractC0312g7.m2238(r2, r2, r1, r7, r0)
            java.lang.Object[] r9 = r8.f11579
            int r0 = r9.length
            int r0 = r0 - r1
            r0 = r9[r0]
            r9[r7] = r0
            int r0 = r8.f11578
            int r2 = r0 + 1
            int r4 = r9.length
            int r4 = r4 - r1
            p000.AbstractC0312g7.m2238(r9, r9, r2, r0, r4)
        L4d:
            java.lang.Object[] r9 = r8.f11579
            int r0 = r8.f11578
            r9[r0] = r6
            int r9 = r8.m6317(r0)
            r8.f11578 = r9
            goto L87
        L5a:
            int r9 = r8.mo4827()
            int r9 = r9 - r1
            int r9 = r9 + r5
            int r9 = r8.m6320(r9)
            java.lang.Object[] r2 = r8.f11579
            if (r0 > r9) goto L70
            int r4 = r0 + 1
            int r5 = r9 + 1
            p000.AbstractC0312g7.m2238(r2, r2, r0, r4, r5)
            goto L83
        L70:
            int r4 = r0 + 1
            int r5 = r2.length
            p000.AbstractC0312g7.m2238(r2, r2, r0, r4, r5)
            java.lang.Object[] r0 = r8.f11579
            int r2 = r0.length
            int r2 = r2 - r1
            r4 = r0[r7]
            r0[r2] = r4
            int r2 = r9 + 1
            p000.AbstractC0312g7.m2238(r0, r0, r7, r1, r2)
        L83:
            java.lang.Object[] r0 = r8.f11579
            r0[r9] = r6
        L87:
            int r9 = r8.f11580
            int r9 = r9 - r1
            r8.f11580 = r9
            return r3
        L8d:
            java.lang.String r8 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r8 = p000.AbstractC0602nx.m4125(r9, r0, r8, r1)
            p000.C1080.m7269(r8)
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: γ */
    public final void m6315(int r5, java.util.Collection r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object[] r1 = r4.f11579
            int r1 = r1.length
        L7:
            if (r5 >= r1) goto L1a
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object[] r2 = r4.f11579
            java.lang.Object r3 = r0.next()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L7
        L1a:
            int r5 = r4.f11578
            r1 = 0
        L1d:
            if (r1 >= r5) goto L30
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object[] r2 = r4.f11579
            java.lang.Object r3 = r0.next()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1d
        L30:
            int r5 = r4.f11580
            int r6 = r6.size()
            int r6 = r6 + r5
            r4.f11580 = r6
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m6316(int r5) {
            r4 = this;
            if (r5 < 0) goto L44
            java.lang.Object[] r0 = r4.f11579
            int r1 = r0.length
            if (r5 > r1) goto L8
            return
        L8:
            java.lang.Object[] r1 = p000.C0936w6.f11577
            if (r0 != r1) goto L16
            r0 = 10
            if (r5 >= r0) goto L11
            r5 = r0
        L11:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r4.f11579 = r5
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
            int r1 = r4.f11578
            int r2 = r0.length
            r3 = 0
            p000.AbstractC0312g7.m2238(r0, r5, r3, r1, r2)
            java.lang.Object[] r0 = r4.f11579
            int r1 = r0.length
            int r2 = r4.f11578
            int r1 = r1 - r2
            p000.AbstractC0312g7.m2238(r0, r5, r1, r3, r2)
            r4.f11578 = r3
            r4.f11579 = r5
            return
        L44:
            java.lang.String r4 = "Deque is too big."
            p000.C1080.m7279(r4)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final int m6317(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f11579
            r0.getClass()
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r1 != r0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r1 = r1 + 1
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public final int m6318(int r1) {
            r0 = this;
            if (r1 >= 0) goto L6
            java.lang.Object[] r0 = r0.f11579
            int r0 = r0.length
            int r1 = r1 + r0
        L6:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public final void m6319(int r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.f11579
            r1 = 0
            if (r4 >= r5) goto L9
            p000.AbstractC0312g7.m2244(r4, r5, r1, r0)
            return
        L9:
            int r2 = r0.length
            p000.AbstractC0312g7.m2244(r4, r2, r1, r0)
            java.lang.Object[] r3 = r3.f11579
            r4 = 0
            p000.AbstractC0312g7.m2244(r4, r5, r1, r3)
            return
    }

    /* JADX INFO: renamed from: θ */
    public final int m6320(int r2) {
            r1 = this;
            java.lang.Object[] r1 = r1.f11579
            int r0 = r1.length
            if (r2 < r0) goto L7
            int r1 = r1.length
            int r2 = r2 - r1
        L7:
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public final void m6321() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }
}
