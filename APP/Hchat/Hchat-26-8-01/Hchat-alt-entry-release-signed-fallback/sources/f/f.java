package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.util.Collection, java.util.Set, hg.b, hg.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f2800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object[] f2801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2802i;

    public f() {
            r1 = this;
            r1.<init>()
            int[] r0 = g.a.f3960a
            r1.f2800g = r0
            java.lang.Object[] r0 = g.a.f3962c
            r1.f2801h = r0
            return
    }

    public final java.lang.Object a(int r9) {
            r8 = this;
            int r0 = r8.f2802i
            java.lang.Object[] r1 = r8.f2801h
            r2 = r1[r9]
            r3 = 1
            if (r0 > r3) goto Ld
            r8.clear()
            return r2
        Ld:
            int r3 = r0 + (-1)
            int[] r4 = r8.f2800g
            int r5 = r4.length
            r6 = 8
            if (r5 <= r6) goto L44
            int r5 = r4.length
            int r5 = r5 / 3
            if (r0 >= r5) goto L44
            if (r0 <= r6) goto L21
            int r5 = r0 >> 1
            int r6 = r0 + r5
        L21:
            int[] r5 = new int[r6]
            r8.f2800g = r5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r8.f2801h = r6
            if (r9 <= 0) goto L35
            r6 = 0
            r7 = 6
            tf.l.s0(r4, r5, r6, r9, r7)
            java.lang.Object[] r5 = r8.f2801h
            tf.l.r0(r6, r9, r1, r7, r5)
        L35:
            if (r9 >= r3) goto L55
            int[] r5 = r8.f2800g
            int r6 = r9 + 1
            tf.l.p0(r4, r5, r9, r6, r0)
            java.lang.Object[] r4 = r8.f2801h
            tf.l.n0(r9, r6, r1, r0, r4)
            goto L55
        L44:
            if (r9 >= r3) goto L50
            int r1 = r9 + 1
            tf.l.p0(r4, r4, r9, r1, r0)
            java.lang.Object[] r4 = r8.f2801h
            tf.l.n0(r9, r1, r4, r0, r4)
        L50:
            java.lang.Object[] r9 = r8.f2801h
            r1 = 0
            r9[r3] = r1
        L55:
            int r9 = r8.f2802i
            if (r0 != r9) goto L5c
            r8.f2802i = r3
            return r2
        L5c:
            java.util.ConcurrentModificationException r9 = new java.util.ConcurrentModificationException
            r9.<init>()
            throw r9
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f2802i
            r1 = 0
            if (r11 != 0) goto Lc
            r2 = 0
            int r2 = f.q.a(r10, r2, r1)
            r3 = r1
            goto L17
        Lc:
            int r2 = r11.hashCode()
            int r3 = f.q.a(r10, r11, r2)
            r9 = r3
            r3 = r2
            r2 = r9
        L17:
            if (r2 < 0) goto L1a
            return r1
        L1a:
            int r2 = ~r2
            int[] r4 = r10.f2800g
            int r5 = r4.length
            if (r0 < r5) goto L51
            r5 = 8
            if (r0 < r5) goto L28
            int r5 = r0 >> 1
            int r5 = r5 + r0
            goto L2d
        L28:
            r6 = 4
            if (r0 < r6) goto L2c
            goto L2d
        L2c:
            r5 = r6
        L2d:
            java.lang.Object[] r6 = r10.f2801h
            int[] r7 = new int[r5]
            r10.f2800g = r7
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r10.f2801h = r5
            int r5 = r10.f2802i
            if (r0 != r5) goto L4b
            int r5 = r7.length
            if (r5 != 0) goto L3f
            goto L51
        L3f:
            int r5 = r4.length
            r8 = 6
            tf.l.s0(r4, r7, r1, r5, r8)
            java.lang.Object[] r4 = r10.f2801h
            int r5 = r6.length
            tf.l.r0(r1, r5, r6, r8, r4)
            goto L51
        L4b:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
        L51:
            if (r2 >= r0) goto L5f
            int[] r1 = r10.f2800g
            int r4 = r2 + 1
            tf.l.p0(r1, r1, r4, r2, r0)
            java.lang.Object[] r1 = r10.f2801h
            tf.l.n0(r4, r2, r1, r0, r1)
        L5f:
            int r1 = r10.f2802i
            if (r0 != r1) goto L73
            int[] r0 = r10.f2800g
            int r4 = r0.length
            if (r2 >= r4) goto L73
            r0[r2] = r3
            java.lang.Object[] r0 = r10.f2801h
            r0[r2] = r11
            r11 = 1
            int r1 = r1 + r11
            r10.f2802i = r1
            return r11
        L73:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r7) {
            r6 = this;
            r7.getClass()
            int r0 = r6.f2802i
            int r1 = r7.size()
            int r1 = r1 + r0
            int r0 = r6.f2802i
            int[] r2 = r6.f2800g
            int r3 = r2.length
            r4 = 0
            if (r3 >= r1) goto L29
            java.lang.Object[] r3 = r6.f2801h
            int[] r5 = new int[r1]
            r6.f2800g = r5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.f2801h = r1
            if (r0 <= 0) goto L29
            r1 = 6
            tf.l.s0(r2, r5, r4, r0, r1)
            java.lang.Object[] r2 = r6.f2801h
            int r5 = r6.f2802i
            tf.l.r0(r4, r5, r3, r1, r2)
        L29:
            int r1 = r6.f2802i
            if (r1 != r0) goto L42
            java.util.Iterator r7 = r7.iterator()
        L31:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r7.next()
            boolean r0 = r6.add(r0)
            r4 = r4 | r0
            goto L31
        L41:
            return r4
        L42:
            java.util.ConcurrentModificationException r7 = new java.util.ConcurrentModificationException
            r7.<init>()
            throw r7
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            int r0 = r1.f2802i
            if (r0 == 0) goto Lf
            int[] r0 = g.a.f3960a
            r1.f2800g = r0
            java.lang.Object[] r0 = g.a.f3962c
            r1.f2801h = r0
            r0 = 0
            r1.f2802i = r0
        Lf:
            int r0 = r1.f2802i
            if (r0 != 0) goto L14
            return
        L14:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L9
            r3 = 0
            int r3 = f.q.a(r2, r3, r0)
            goto L11
        L9:
            int r1 = r3.hashCode()
            int r3 = f.q.a(r2, r3, r1)
        L11:
            if (r3 < 0) goto L15
            r3 = 1
            return r3
        L15:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L7
            r2 = 0
            return r2
        L19:
            r2 = 1
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L2c
            int r1 = r6.f2802i
            r3 = r7
            java.util.Set r3 = (java.util.Set) r3
            int r3 = r3.size()
            if (r1 == r3) goto L15
            return r2
        L15:
            int r1 = r6.f2802i     // Catch: java.lang.Throwable -> L2c
            r3 = r2
        L18:
            if (r3 >= r1) goto L2b
            java.lang.Object[] r4 = r6.f2801h     // Catch: java.lang.Throwable -> L2c
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L2c
            r5 = r7
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L2c
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L28
            return r2
        L28:
            int r3 = r3 + 1
            goto L18
        L2b:
            return r0
        L2c:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
            r5 = this;
            int[] r0 = r5.f2800g
            int r1 = r5.f2802i
            r2 = 0
            r3 = r2
        L6:
            if (r2 >= r1) goto Le
            r4 = r0[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        Le:
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f2802i
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            f.a r0 = new f.a
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L9
            r3 = 0
            int r3 = f.q.a(r2, r3, r0)
            goto L11
        L9:
            int r1 = r3.hashCode()
            int r3 = f.q.a(r2, r3, r1)
        L11:
            if (r3 < 0) goto L18
            r2.a(r3)
            r3 = 1
            return r3
        L18:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L8
        L18:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r6) {
            r5 = this;
            r6.getClass()
            int r0 = r5.f2802i
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L8:
            r3 = -1
            if (r3 >= r0) goto L1f
            r3 = r6
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object[] r4 = r5.f2801h
            r4 = r4[r0]
            boolean r3 = tf.m.o1(r3, r4)
            if (r3 != 0) goto L1c
            r5.a(r0)
            r2 = r1
        L1c:
            int r0 = r0 + (-1)
            goto L8
        L1f:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.f2802i
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
            r3 = this;
            java.lang.Object[] r0 = r3.f2801h
            r1 = 0
            int r2 = r3.f2802i
            java.lang.Object[] r0 = tf.l.u0(r0, r1, r2)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.f2802i
            int r1 = r4.length
            if (r1 >= r0) goto L17
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto L1d
        L17:
            int r1 = r4.length
            if (r1 <= r0) goto L1d
            r1 = 0
            r4[r0] = r1
        L1d:
            java.lang.Object[] r0 = r3.f2801h
            int r1 = r3.f2802i
            r2 = 0
            tf.l.n0(r2, r2, r0, r1, r4)
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            int r0 = r4.f2802i
            int r0 = r0 * 14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r4.f2802i
            r2 = 0
        L1a:
            if (r2 >= r0) goto L35
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            java.lang.Object[] r3 = r4.f2801h
            r3 = r3[r2]
            if (r3 == r4) goto L2d
            r1.append(r3)
            goto L32
        L2d:
            java.lang.String r3 = "(this Set)"
            r1.append(r3)
        L32:
            int r2 = r2 + 1
            goto L1a
        L35:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
