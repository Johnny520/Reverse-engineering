package a;

/* JADX INFO: loaded from: classes.dex */
public final class F1<E> extends a.AbstractC0451x<E> {
    public static final java.lang.Object[] d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79a;
    public java.lang.Object[] b;
    public int c;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            a.F1.d = r0
            return
    }

    public F1() {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = a.F1.d
            r1.b = r0
            return
    }

    public final void a(int r5, java.util.Collection<? extends E> r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object[] r1 = r4.b
            int r1 = r1.length
        L7:
            if (r5 >= r1) goto L1a
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object[] r2 = r4.b
            java.lang.Object r3 = r0.next()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L7
        L1a:
            int r5 = r4.f79a
            r1 = 0
        L1d:
            if (r1 >= r5) goto L30
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object[] r2 = r4.b
            java.lang.Object r3 = r0.next()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1d
        L30:
            int r5 = r4.c
            int r6 = r6.size()
            int r6 = r6 + r5
            r4.c = r6
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, E r9) {
            r7 = this;
            int r0 = r7.c
            if (r8 < 0) goto La1
            if (r8 > r0) goto La1
            if (r8 != r0) goto Lc
            r7.addLast(r9)
            return
        Lc:
            if (r8 != 0) goto L12
            r7.addFirst(r9)
            return
        L12:
            r7.g()
            int r0 = r7.c
            r1 = 1
            int r0 = r0 + r1
            r7.b(r0)
            int r0 = r7.f79a
            int r0 = r0 + r8
            int r0 = r7.f(r0)
            int r2 = r7.c
            int r3 = r2 + 1
            int r3 = r3 >> r1
            r4 = 0
            if (r8 >= r3) goto L72
            java.lang.String r8 = "<this>"
            if (r0 != 0) goto L35
            java.lang.Object[] r0 = r7.b
            a.C0193i9.e(r0, r8)
            int r0 = r0.length
        L35:
            int r0 = r0 - r1
            int r2 = r7.f79a
            if (r2 != 0) goto L42
            java.lang.Object[] r2 = r7.b
            a.C0193i9.e(r2, r8)
            int r8 = r2.length
            int r8 = r8 - r1
            goto L44
        L42:
            int r8 = r2 + (-1)
        L44:
            int r2 = r7.f79a
            if (r0 < r2) goto L56
            java.lang.Object[] r3 = r7.b
            r4 = r3[r2]
            r3[r8] = r4
            int r4 = r2 + 1
            int r5 = r0 + 1
            a.C0435w1.h(r3, r3, r2, r4, r5)
            goto L6b
        L56:
            java.lang.Object[] r3 = r7.b
            int r5 = r2 + (-1)
            int r6 = r3.length
            a.C0435w1.h(r3, r3, r5, r2, r6)
            java.lang.Object[] r2 = r7.b
            int r3 = r2.length
            int r3 = r3 - r1
            r5 = r2[r4]
            r2[r3] = r5
            int r3 = r0 + 1
            a.C0435w1.h(r2, r2, r4, r1, r3)
        L6b:
            java.lang.Object[] r2 = r7.b
            r2[r0] = r9
            r7.f79a = r8
            goto L9b
        L72:
            int r8 = r7.f79a
            int r8 = r8 + r2
            int r8 = r7.f(r8)
            if (r0 >= r8) goto L83
            java.lang.Object[] r2 = r7.b
            int r3 = r0 + 1
            a.C0435w1.h(r2, r2, r3, r0, r8)
            goto L97
        L83:
            java.lang.Object[] r2 = r7.b
            a.C0435w1.h(r2, r2, r1, r4, r8)
            java.lang.Object[] r8 = r7.b
            int r2 = r8.length
            int r2 = r2 - r1
            r2 = r8[r2]
            r8[r4] = r2
            int r2 = r0 + 1
            int r3 = r8.length
            int r3 = r3 - r1
            a.C0435w1.h(r8, r8, r2, r0, r3)
        L97:
            java.lang.Object[] r8 = r7.b
            r8[r0] = r9
        L9b:
            int r8 = r7.c
            int r8 = r8 + r1
            r7.c = r8
            return
        La1:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "index: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = ", size: "
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            r9.<init>(r8)
            throw r9
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E r1) {
            r0 = this;
            r0.addLast(r1)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, java.util.Collection<? extends E> r10) {
            r8 = this;
            java.lang.String r0 = "elements"
            a.C0193i9.e(r10, r0)
            int r0 = r8.c
            if (r9 < 0) goto Ldb
            if (r9 > r0) goto Ldb
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto L13
            return r1
        L13:
            int r0 = r8.c
            if (r9 != r0) goto L1c
            boolean r9 = r8.addAll(r10)
            return r9
        L1c:
            r8.g()
            int r0 = r8.c
            int r2 = r10.size()
            int r2 = r2 + r0
            r8.b(r2)
            int r0 = r8.f79a
            int r2 = r8.c
            int r0 = r0 + r2
            int r0 = r8.f(r0)
            int r2 = r8.f79a
            int r2 = r2 + r9
            int r2 = r8.f(r2)
            int r3 = r10.size()
            int r4 = r8.c
            r5 = 1
            int r4 = r4 + r5
            int r4 = r4 >> r5
            if (r9 >= r4) goto L95
            int r9 = r8.f79a
            int r0 = r9 - r3
            if (r2 < r9) goto L6e
            if (r0 < 0) goto L52
            java.lang.Object[] r1 = r8.b
            a.C0435w1.h(r1, r1, r0, r9, r2)
            goto L8a
        L52:
            java.lang.Object[] r4 = r8.b
            int r6 = r4.length
            int r0 = r0 + r6
            int r6 = r2 - r9
            int r7 = r4.length
            int r7 = r7 - r0
            if (r7 < r6) goto L60
            a.C0435w1.h(r4, r4, r0, r9, r2)
            goto L8a
        L60:
            int r6 = r9 + r7
            a.C0435w1.h(r4, r4, r0, r9, r6)
            java.lang.Object[] r9 = r8.b
            int r4 = r8.f79a
            int r4 = r4 + r7
            a.C0435w1.h(r9, r9, r1, r4, r2)
            goto L8a
        L6e:
            java.lang.Object[] r4 = r8.b
            int r6 = r4.length
            a.C0435w1.h(r4, r4, r0, r9, r6)
            if (r3 < r2) goto L7e
            java.lang.Object[] r9 = r8.b
            int r4 = r9.length
            int r4 = r4 - r3
            a.C0435w1.h(r9, r9, r4, r1, r2)
            goto L8a
        L7e:
            java.lang.Object[] r9 = r8.b
            int r4 = r9.length
            int r4 = r4 - r3
            a.C0435w1.h(r9, r9, r4, r1, r3)
            java.lang.Object[] r9 = r8.b
            a.C0435w1.h(r9, r9, r1, r3, r2)
        L8a:
            r8.f79a = r0
            int r2 = r2 - r3
            int r9 = r8.d(r2)
            r8.a(r9, r10)
            return r5
        L95:
            int r9 = r2 + r3
            if (r2 >= r0) goto Lb9
            int r3 = r3 + r0
            java.lang.Object[] r4 = r8.b
            int r6 = r4.length
            if (r3 > r6) goto La3
            a.C0435w1.h(r4, r4, r9, r2, r0)
            goto Ld7
        La3:
            int r6 = r4.length
            if (r9 < r6) goto Lac
            int r1 = r4.length
            int r9 = r9 - r1
            a.C0435w1.h(r4, r4, r9, r2, r0)
            goto Ld7
        Lac:
            int r6 = r4.length
            int r3 = r3 - r6
            int r3 = r0 - r3
            a.C0435w1.h(r4, r4, r1, r3, r0)
            java.lang.Object[] r0 = r8.b
            a.C0435w1.h(r0, r0, r9, r2, r3)
            goto Ld7
        Lb9:
            java.lang.Object[] r4 = r8.b
            a.C0435w1.h(r4, r4, r3, r1, r0)
            java.lang.Object[] r0 = r8.b
            int r4 = r0.length
            if (r9 < r4) goto Lca
            int r1 = r0.length
            int r9 = r9 - r1
            int r1 = r0.length
            a.C0435w1.h(r0, r0, r9, r2, r1)
            goto Ld7
        Lca:
            int r4 = r0.length
            int r4 = r4 - r3
            int r6 = r0.length
            a.C0435w1.h(r0, r0, r1, r4, r6)
            java.lang.Object[] r0 = r8.b
            int r1 = r0.length
            int r1 = r1 - r3
            a.C0435w1.h(r0, r0, r9, r2, r1)
        Ld7:
            r8.a(r2, r10)
            return r5
        Ldb:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "index: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = ", size: "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r10.<init>(r9)
            throw r10
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            a.C0193i9.e(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld
            r3 = 0
            return r3
        Ld:
            r2.g()
            int r0 = r2.c
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.b(r1)
            int r0 = r2.f79a
            int r1 = r2.c
            int r0 = r0 + r1
            int r0 = r2.f(r0)
            r2.a(r0, r3)
            r3 = 1
            return r3
    }

    public final void addFirst(E r3) {
            r2 = this;
            r2.g()
            int r0 = r2.c
            int r0 = r0 + 1
            r2.b(r0)
            int r0 = r2.f79a
            if (r0 != 0) goto L16
            java.lang.Object[] r0 = r2.b
            java.lang.String r1 = "<this>"
            a.C0193i9.e(r0, r1)
            int r0 = r0.length
        L16:
            int r0 = r0 + (-1)
            r2.f79a = r0
            java.lang.Object[] r1 = r2.b
            r1[r0] = r3
            int r3 = r2.c
            int r3 = r3 + 1
            r2.c = r3
            return
    }

    public final void addLast(E r4) {
            r3 = this;
            r3.g()
            int r0 = r3.c
            int r0 = r0 + 1
            r3.b(r0)
            java.lang.Object[] r0 = r3.b
            int r1 = r3.f79a
            int r2 = r3.c
            int r1 = r1 + r2
            int r1 = r3.f(r1)
            r0[r1] = r4
            int r4 = r3.c
            int r4 = r4 + 1
            r3.c = r4
            return
    }

    public final void b(int r5) {
            r4 = this;
            if (r5 < 0) goto L44
            java.lang.Object[] r0 = r4.b
            int r1 = r0.length
            if (r5 > r1) goto L8
            return
        L8:
            java.lang.Object[] r1 = a.F1.d
            if (r0 != r1) goto L16
            r0 = 10
            if (r5 >= r0) goto L11
            r5 = r0
        L11:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r4.b = r5
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
            int r1 = r4.f79a
            int r2 = r0.length
            r3 = 0
            a.C0435w1.h(r0, r5, r3, r1, r2)
            java.lang.Object[] r0 = r4.b
            int r1 = r0.length
            int r2 = r4.f79a
            int r1 = r1 - r2
            a.C0435w1.h(r0, r5, r1, r3, r2)
            r4.f79a = r3
            r4.b = r5
            return
        L44:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Deque is too big."
            r5.<init>(r0)
            throw r5
    }

    public final int c(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.b
            java.lang.String r1 = "<this>"
            a.C0193i9.e(r0, r1)
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r3 != r0) goto Le
            r3 = 0
            return r3
        Le:
            int r3 = r3 + 1
            return r3
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L17
            r2.g()
            int r0 = r2.f79a
            int r1 = r2.c
            int r0 = r0 + r1
            int r0 = r2.f(r0)
            int r1 = r2.f79a
            r2.e(r1, r0)
        L17:
            r0 = 0
            r2.f79a = r0
            r2.c = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    public final int d(int r2) {
            r1 = this;
            if (r2 >= 0) goto L6
            java.lang.Object[] r0 = r1.b
            int r0 = r0.length
            int r2 = r2 + r0
        L6:
            return r2
    }

    public final void e(int r5, int r6) {
            r4 = this;
            java.lang.String r0 = "<this>"
            r1 = 0
            if (r5 >= r6) goto Le
            java.lang.Object[] r2 = r4.b
            a.C0193i9.e(r2, r0)
            java.util.Arrays.fill(r2, r5, r6, r1)
            return
        Le:
            java.lang.Object[] r2 = r4.b
            int r3 = r2.length
            java.util.Arrays.fill(r2, r5, r3, r1)
            java.lang.Object[] r5 = r4.b
            a.C0193i9.e(r5, r0)
            r0 = 0
            java.util.Arrays.fill(r5, r0, r6, r1)
            return
    }

    public final int f(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.b
            int r1 = r0.length
            if (r3 < r1) goto L7
            int r0 = r0.length
            int r3 = r3 - r0
        L7:
            return r3
    }

    public final void g() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int r5) {
            r4 = this;
            int r0 = r4.c
            if (r5 < 0) goto L12
            if (r5 >= r0) goto L12
            java.lang.Object[] r0 = r4.b
            int r1 = r4.f79a
            int r1 = r1 + r5
            int r5 = r4.f(r1)
            r5 = r0[r5]
            return r5
        L12:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "index: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ", size: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f79a
            int r1 = r4.c
            int r0 = r0 + r1
            int r0 = r4.f(r0)
            int r1 = r4.f79a
            if (r1 >= r0) goto L20
        Ld:
            if (r1 >= r0) goto L4e
            java.lang.Object[] r2 = r4.b
            r2 = r2[r1]
            boolean r2 = a.C0193i9.a(r5, r2)
            if (r2 == 0) goto L1d
            int r5 = r4.f79a
        L1b:
            int r1 = r1 - r5
            return r1
        L1d:
            int r1 = r1 + 1
            goto Ld
        L20:
            if (r1 < r0) goto L4e
            java.lang.Object[] r2 = r4.b
            int r2 = r2.length
        L25:
            if (r1 >= r2) goto L37
            java.lang.Object[] r3 = r4.b
            r3 = r3[r1]
            boolean r3 = a.C0193i9.a(r5, r3)
            if (r3 == 0) goto L34
            int r5 = r4.f79a
            goto L1b
        L34:
            int r1 = r1 + 1
            goto L25
        L37:
            r1 = 0
        L38:
            if (r1 >= r0) goto L4e
            java.lang.Object[] r2 = r4.b
            r2 = r2[r1]
            boolean r2 = a.C0193i9.a(r5, r2)
            if (r2 == 0) goto L4b
            java.lang.Object[] r5 = r4.b
            int r5 = r5.length
            int r1 = r1 + r5
            int r5 = r4.f79a
            goto L1b
        L4b:
            int r1 = r1 + 1
            goto L38
        L4e:
            r5 = -1
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.c
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f79a
            int r1 = r4.c
            int r0 = r0 + r1
            int r0 = r4.f(r0)
            int r1 = r4.f79a
            r2 = -1
            if (r1 >= r0) goto L25
            int r0 = r0 + (-1)
            if (r1 > r0) goto L5f
        L12:
            java.lang.Object[] r3 = r4.b
            r3 = r3[r0]
            boolean r3 = a.C0193i9.a(r5, r3)
            if (r3 == 0) goto L20
            int r5 = r4.f79a
        L1e:
            int r0 = r0 - r5
            return r0
        L20:
            if (r0 == r1) goto L5f
            int r0 = r0 + (-1)
            goto L12
        L25:
            if (r1 <= r0) goto L5f
            int r0 = r0 + (-1)
        L29:
            if (r2 >= r0) goto L3f
            java.lang.Object[] r1 = r4.b
            r1 = r1[r0]
            boolean r1 = a.C0193i9.a(r5, r1)
            if (r1 == 0) goto L3c
            java.lang.Object[] r5 = r4.b
            int r5 = r5.length
            int r0 = r0 + r5
            int r5 = r4.f79a
            goto L1e
        L3c:
            int r0 = r0 + (-1)
            goto L29
        L3f:
            java.lang.Object[] r0 = r4.b
            java.lang.String r1 = "<this>"
            a.C0193i9.e(r0, r1)
            int r0 = r0.length
            int r0 = r0 + (-1)
            int r1 = r4.f79a
            if (r1 > r0) goto L5f
        L4d:
            java.lang.Object[] r3 = r4.b
            r3 = r3[r0]
            boolean r3 = a.C0193i9.a(r5, r3)
            if (r3 == 0) goto L5a
            int r5 = r4.f79a
            goto L1e
        L5a:
            if (r0 == r1) goto L5f
            int r0 = r0 + (-1)
            goto L4d
        L5f:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            r1.remove(r2)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
            r11 = this;
            java.lang.String r0 = "elements"
            a.C0193i9.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L94
            java.lang.Object[] r0 = r11.b
            int r0 = r0.length
            if (r0 != 0) goto L13
            goto L94
        L13:
            int r0 = r11.f79a
            int r2 = r11.c
            int r0 = r0 + r2
            int r0 = r11.f(r0)
            int r2 = r11.f79a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L46
            r5 = r2
        L23:
            if (r2 >= r0) goto L3b
            java.lang.Object[] r6 = r11.b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L37
            java.lang.Object[] r7 = r11.b
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
            java.lang.Object[] r12 = r11.b
            java.lang.String r2 = "<this>"
            a.C0193i9.e(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L86
        L46:
            java.lang.Object[] r5 = r11.b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L4b:
            if (r2 >= r5) goto L65
            java.lang.Object[] r8 = r11.b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L61
            java.lang.Object[] r8 = r11.b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L62
        L61:
            r7 = r4
        L62:
            int r2 = r2 + 1
            goto L4b
        L65:
            int r2 = r11.f(r6)
            r5 = r2
        L6a:
            if (r1 >= r0) goto L85
            java.lang.Object[] r2 = r11.b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L81
            java.lang.Object[] r2 = r11.b
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L82
        L81:
            r7 = r4
        L82:
            int r1 = r1 + 1
            goto L6a
        L85:
            r1 = r7
        L86:
            if (r1 == 0) goto L94
            r11.g()
            int r12 = r11.f79a
            int r5 = r5 - r12
            int r12 = r11.d(r5)
            r11.c = r12
        L94:
            return r1
    }

    public final E removeFirst() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1f
            r4.g()
            java.lang.Object[] r0 = r4.b
            int r1 = r4.f79a
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            int r0 = r4.c(r1)
            r4.f79a = r0
            int r0 = r4.c
            int r0 = r0 + (-1)
            r4.c = r0
            return r2
        L1f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E removeLast() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L22
            r4.g()
            int r0 = r4.f79a
            int r1 = a.C0294o3.c0(r4)
            int r1 = r1 + r0
            int r0 = r4.f(r1)
            java.lang.Object[] r1 = r4.b
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r4.c
            int r0 = r0 + (-1)
            r4.c = r0
            return r2
        L22:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
            r7 = this;
            int r0 = r7.c
            a.AbstractC0433w.a.a(r8, r9, r0)
            int r0 = r9 - r8
            if (r0 != 0) goto La
            return
        La:
            int r1 = r7.c
            if (r0 != r1) goto L12
            r7.clear()
            return
        L12:
            r1 = 1
            if (r0 != r1) goto L19
            r7.remove(r8)
            return
        L19:
            r7.g()
            int r2 = r7.c
            int r2 = r2 - r9
            if (r8 >= r2) goto L64
            int r2 = r7.f79a
            int r3 = r8 + (-1)
            int r3 = r3 + r2
            int r2 = r7.f(r3)
            int r3 = r7.f79a
            int r9 = r9 - r1
            int r9 = r9 + r3
            int r9 = r7.f(r9)
        L32:
            if (r8 <= 0) goto L55
            int r1 = r2 + 1
            int r3 = r9 + 1
            int r3 = java.lang.Math.min(r1, r3)
            int r3 = java.lang.Math.min(r8, r3)
            java.lang.Object[] r4 = r7.b
            int r9 = r9 - r3
            int r5 = r9 + 1
            int r2 = r2 - r3
            int r6 = r2 + 1
            a.C0435w1.h(r4, r4, r5, r6, r1)
            int r2 = r7.d(r2)
            int r9 = r7.d(r9)
            int r8 = r8 - r3
            goto L32
        L55:
            int r8 = r7.f79a
            int r8 = r8 + r0
            int r8 = r7.f(r8)
            int r9 = r7.f79a
            r7.e(r9, r8)
            r7.f79a = r8
            goto La8
        L64:
            int r1 = r7.f79a
            int r1 = r1 + r9
            int r1 = r7.f(r1)
            int r2 = r7.f79a
            int r2 = r2 + r8
            int r8 = r7.f(r2)
            int r2 = r7.c
        L74:
            int r2 = r2 - r9
            if (r2 <= 0) goto L96
            java.lang.Object[] r9 = r7.b
            int r3 = r9.length
            int r3 = r3 - r1
            int r9 = r9.length
            int r9 = r9 - r8
            int r9 = java.lang.Math.min(r3, r9)
            int r9 = java.lang.Math.min(r2, r9)
            java.lang.Object[] r3 = r7.b
            int r4 = r1 + r9
            a.C0435w1.h(r3, r3, r8, r1, r4)
            int r1 = r7.f(r4)
            int r8 = r8 + r9
            int r8 = r7.f(r8)
            goto L74
        L96:
            int r8 = r7.f79a
            int r9 = r7.c
            int r8 = r8 + r9
            int r8 = r7.f(r8)
            int r9 = r8 - r0
            int r9 = r7.d(r9)
            r7.e(r9, r8)
        La8:
            int r8 = r7.c
            int r8 = r8 - r0
            r7.c = r8
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
            r11 = this;
            java.lang.String r0 = "elements"
            a.C0193i9.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L94
            java.lang.Object[] r0 = r11.b
            int r0 = r0.length
            if (r0 != 0) goto L13
            goto L94
        L13:
            int r0 = r11.f79a
            int r2 = r11.c
            int r0 = r0 + r2
            int r0 = r11.f(r0)
            int r2 = r11.f79a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L46
            r5 = r2
        L23:
            if (r2 >= r0) goto L3b
            java.lang.Object[] r6 = r11.b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L37
            java.lang.Object[] r7 = r11.b
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
            java.lang.Object[] r12 = r11.b
            java.lang.String r2 = "<this>"
            a.C0193i9.e(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L86
        L46:
            java.lang.Object[] r5 = r11.b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L4b:
            if (r2 >= r5) goto L65
            java.lang.Object[] r8 = r11.b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L61
            java.lang.Object[] r8 = r11.b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L62
        L61:
            r7 = r4
        L62:
            int r2 = r2 + 1
            goto L4b
        L65:
            int r2 = r11.f(r6)
            r5 = r2
        L6a:
            if (r1 >= r0) goto L85
            java.lang.Object[] r2 = r11.b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L81
            java.lang.Object[] r2 = r11.b
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L82
        L81:
            r7 = r4
        L82:
            int r1 = r1 + 1
            goto L6a
        L85:
            r1 = r7
        L86:
            if (r1 == 0) goto L94
            r11.g()
            int r12 = r11.f79a
            int r5 = r5 - r12
            int r12 = r11.d(r5)
            r11.c = r12
        L94:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int r4, E r5) {
            r3 = this;
            int r0 = r3.c
            if (r4 < 0) goto L14
            if (r4 >= r0) goto L14
            int r0 = r3.f79a
            int r0 = r0 + r4
            int r4 = r3.f(r0)
            java.lang.Object[] r0 = r3.b
            r1 = r0[r4]
            r0[r4] = r5
            return r1
        L14:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "index: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", size: "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.c
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] r7) {
            r6 = this;
            java.lang.String r0 = "array"
            a.C0193i9.e(r7, r0)
            int r0 = r7.length
            int r1 = r6.c
            if (r0 < r1) goto Lc
        La:
            r1 = r7
            goto L20
        Lc:
            java.lang.Class r7 = r7.getClass()
            java.lang.Class r7 = r7.getComponentType()
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>"
            a.C0193i9.c(r7, r0)
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            goto La
        L20:
            int r7 = r6.f79a
            int r0 = r6.c
            int r7 = r7 + r0
            int r4 = r6.f(r7)
            int r3 = r6.f79a
            if (r3 >= r4) goto L35
            java.lang.Object[] r0 = r6.b
            r5 = 2
            r2 = 0
            a.C0435w1.i(r0, r1, r2, r3, r4, r5)
            goto L4d
        L35:
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L4d
            java.lang.Object[] r7 = r6.b
            int r0 = r6.f79a
            int r2 = r7.length
            r3 = 0
            a.C0435w1.h(r7, r1, r3, r0, r2)
            java.lang.Object[] r7 = r6.b
            int r0 = r7.length
            int r2 = r6.f79a
            int r0 = r0 - r2
            a.C0435w1.h(r7, r1, r0, r3, r4)
        L4d:
            int r7 = r6.c
            int r0 = r1.length
            if (r7 >= r0) goto L55
            r0 = 0
            r1[r7] = r0
        L55:
            return r1
    }
}
