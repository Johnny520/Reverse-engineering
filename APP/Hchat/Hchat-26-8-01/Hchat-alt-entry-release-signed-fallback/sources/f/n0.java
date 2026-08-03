package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements hg.e, java.util.Set, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.l0 f2874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.l0 f2875h;

    public n0(f.l0 r1) {
            r0 = this;
            r0.<init>()
            r0.f2874g = r1
            r0.f2875h = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            f.l0 r0 = r1.f2875h
            boolean r2 = r0.a(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Collection r4 = (java.util.Collection) r4
            f.l0 r0 = r3.f2875h
            int r1 = r0.f2858d
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r4.next()
            r0.k(r2)
            goto Lf
        L1d:
            int r4 = r0.f2858d
            if (r1 == r4) goto L23
            r4 = 1
            return r4
        L23:
            r4 = 0
            return r4
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r1 = this;
            f.l0 r0 = r1.f2875h
            r0.b()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            f.l0 r0 = r1.f2874g
            boolean r2 = r0.c(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r3.next()
            f.l0 r1 = r2.f2874g
            boolean r0 = r1.c(r0)
            if (r0 != 0) goto L9
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<f.n0> r0 = f.n0.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            f.n0 r3 = (f.n0) r3
            f.l0 r0 = r2.f2874g
            f.l0 r3 = r3.f2874g
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r1 = this;
            f.l0 r0 = r1.f2874g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            f.l0 r0 = r1.f2874g
            boolean r0 = r0.g()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            f.i0 r0 = new f.i0
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            f.l0 r0 = r1.f2875h
            boolean r2 = r0.l(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            f.l0 r0 = r3.f2875h
            int r1 = r0.f2858d
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r4.next()
            r0.i(r2)
            goto Ld
        L1b:
            int r4 = r0.f2858d
            if (r1 == r4) goto L21
            r4 = 1
            return r4
        L21:
            r4 = 0
            return r4
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r18) {
            r17 = this;
            r18.getClass()
            r0 = r17
            f.l0 r1 = r0.f2875h
            java.lang.Object[] r2 = r1.f2856b
            int r3 = r1.f2858d
            long[] r4 = r1.f2855a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L56
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L51
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r18
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = tf.m.o1(r14, r15)
            if (r14 != 0) goto L4b
            r1.m(r13)
        L4b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4f:
            if (r10 != r11) goto L56
        L51:
            if (r7 == r5) goto L56
            int r7 = r7 + 1
            goto L14
        L56:
            int r1 = r1.f2858d
            if (r3 == r1) goto L5c
            r1 = 1
            return r1
        L5c:
            return r6
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r1 = this;
            f.l0 r0 = r1.f2874g
            int r0 = r0.f2858d
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object[] r1 = gg.k.b(r0, r1)
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            f.l0 r0 = r1.f2874g
            java.lang.String r0 = r0.toString()
            return r0
    }
}
