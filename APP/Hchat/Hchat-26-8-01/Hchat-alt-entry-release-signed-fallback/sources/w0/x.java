package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements java.util.List, hg.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0.p f14826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14829j;

    public x(w0.p r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f14826g = r1
            r0.f14827h = r2
            int r1 = w0.q.g(r1)
            r0.f14828i = r1
            int r3 = r3 - r2
            r0.f14829j = r3
            return
    }

    public final void a() {
            r2 = this;
            w0.p r0 = r2.f14826g
            int r0 = w0.q.g(r0)
            int r1 = r2.f14828i
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            r1.a()
            int r0 = r1.f14827h
            int r0 = r0 + r2
            w0.p r2 = r1.f14826g
            r2.add(r0, r3)
            int r3 = r1.f14829j
            int r3 = r3 + 1
            r1.f14829j = r3
            int r2 = w0.q.g(r2)
            r1.f14828i = r2
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            r2.a()
            int r0 = r2.f14827h
            int r1 = r2.f14829j
            int r0 = r0 + r1
            w0.p r1 = r2.f14826g
            r1.add(r0, r3)
            int r3 = r2.f14829j
            r0 = 1
            int r3 = r3 + r0
            r2.f14829j = r3
            int r3 = w0.q.g(r1)
            r2.f14828i = r3
            return r0
    }

    @Override // java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r2.a()
            int r0 = r2.f14827h
            int r3 = r3 + r0
            w0.p r0 = r2.f14826g
            boolean r3 = r0.addAll(r3, r4)
            if (r3 == 0) goto L1d
            int r1 = r2.f14829j
            int r4 = r4.size()
            int r4 = r4 + r1
            r2.f14829j = r4
            int r4 = w0.q.g(r0)
            r2.f14828i = r4
        L1d:
            return r3
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f14829j
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r3 = this;
            int r0 = r3.f14829j
            if (r0 <= 0) goto L1a
            r3.a()
            int r0 = r3.f14829j
            int r1 = r3.f14827h
            int r0 = r0 + r1
            w0.p r2 = r3.f14826g
            r2.e(r1, r0)
            r0 = 0
            r3.f14829j = r0
            int r0 = w0.q.g(r2)
            r3.f14828i = r0
        L1a:
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L11
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L15
            r3 = 0
            return r3
        L27:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            r1.a()
            int r0 = r1.f14829j
            w0.q.a(r2, r0)
            int r0 = r1.f14827h
            int r0 = r0 + r2
            w0.p r2 = r1.f14826g
            java.lang.Object r2 = r2.get(r0)
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            r4.a()
            int r0 = r4.f14829j
            int r1 = r4.f14827h
            int r0 = r0 + r1
            lg.d r0 = r9.e0.r0(r1, r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            r2 = r0
            lg.c r2 = (lg.c) r2
            boolean r3 = r2.f8047i
            if (r3 == 0) goto L29
            int r2 = r2.nextInt()
            w0.p r3 = r4.f14826g
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = gg.l.a(r5, r3)
            if (r3 == 0) goto L10
            int r2 = r2 - r1
            return r2
        L29:
            r5 = -1
            return r5
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f14829j
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r3.a()
            int r0 = r3.f14829j
            int r1 = r3.f14827h
            int r0 = r0 + r1
            int r0 = r0 + (-1)
        La:
            if (r0 < r1) goto L1d
            w0.p r2 = r3.f14826g
            java.lang.Object r2 = r2.get(r0)
            boolean r2 = gg.l.a(r4, r2)
            if (r2 == 0) goto L1a
            int r0 = r0 - r1
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto La
        L1d:
            r4 = -1
            return r4
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            r1.a()
            gg.s r0 = new gg.s
            r0.<init>()
            int r2 = r2 + (-1)
            r0.f4562g = r2
            tf.z r2 = new tf.z
            r2.<init>(r0, r1)
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r3) {
            r2 = this;
            r2.a()
            int r0 = r2.f14827h
            int r0 = r0 + r3
            w0.p r3 = r2.f14826g
            java.lang.Object r0 = r3.remove(r0)
            int r1 = r2.f14829j
            int r1 = r1 + (-1)
            r2.f14829j = r1
            int r3 = w0.q.g(r3)
            r2.f14828i = r3
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb
            r0.remove(r1)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L5:
            r1 = r0
        L6:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r4.next()
            boolean r2 = r3.remove(r2)
            if (r2 != 0) goto L18
            if (r1 == 0) goto L5
        L18:
            r1 = 1
            goto L6
        L1a:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r11) {
            r10 = this;
            r10.a()
            w0.p r0 = r10.f14826g
            int r1 = r10.f14827h
            int r2 = r10.f14829j
            int r2 = r2 + r1
            int r3 = r0.size()
        Le:
            java.lang.Object r4 = w0.q.f14796a
            monitor-enter(r4)
            w0.t r5 = r0.f14795g     // Catch: java.lang.Throwable -> L73
            r5.getClass()     // Catch: java.lang.Throwable -> L73
            w0.w r5 = w0.m.h(r5)     // Catch: java.lang.Throwable -> L73
            w0.t r5 = (w0.t) r5     // Catch: java.lang.Throwable -> L73
            int r6 = r5.f14821d     // Catch: java.lang.Throwable -> L73
            o0.c r5 = r5.f14820c     // Catch: java.lang.Throwable -> L73
            monitor-exit(r4)
            r5.getClass()
            o0.f r4 = r5.e()
            java.util.List r7 = r4.subList(r1, r2)
            r7.retainAll(r11)
            o0.c r4 = r4.d()
            boolean r5 = gg.l.a(r4, r5)
            r7 = 1
            if (r5 != 0) goto L5a
            w0.t r5 = r0.f14795g
            r5.getClass()
            java.lang.Object r8 = w0.m.f14786c
            monitor-enter(r8)
            w0.f r9 = w0.m.j()     // Catch: java.lang.Throwable -> L57
            w0.w r5 = w0.m.w(r5, r0, r9)     // Catch: java.lang.Throwable -> L57
            w0.t r5 = (w0.t) r5     // Catch: java.lang.Throwable -> L57
            boolean r4 = w0.q.b(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r8)
            w0.m.n(r9, r0)
            if (r4 == 0) goto Le
            goto L5a
        L57:
            r11 = move-exception
            monitor-exit(r8)
            throw r11
        L5a:
            int r11 = r0.size()
            int r3 = r3 - r11
            if (r3 <= 0) goto L6e
            w0.p r11 = r10.f14826g
            int r11 = w0.q.g(r11)
            r10.f14828i = r11
            int r11 = r10.f14829j
            int r11 = r11 - r3
            r10.f14829j = r11
        L6e:
            if (r3 <= 0) goto L71
            return r7
        L71:
            r11 = 0
            return r11
        L73:
            r11 = move-exception
            monitor-exit(r4)
            throw r11
    }

    @Override // java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f14829j
            w0.q.a(r2, r0)
            r1.a()
            int r0 = r1.f14827h
            int r2 = r2 + r0
            w0.p r0 = r1.f14826g
            java.lang.Object r2 = r0.set(r2, r3)
            int r3 = w0.q.g(r0)
            r1.f14828i = r3
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.f14829j
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L9
            if (r3 > r4) goto L9
            int r0 = r2.f14829j
            if (r4 > r0) goto L9
            goto Le
        L9:
            java.lang.String r0 = "fromIndex or toIndex are out of bounds"
            i0.n1.a(r0)
        Le:
            r2.a()
            w0.x r0 = new w0.x
            int r1 = r2.f14827h
            int r3 = r3 + r1
            int r4 = r4 + r1
            w0.p r1 = r2.f14826g
            r0.<init>(r1, r3, r4)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r1 = gg.k.b(r0, r1)
            return r1
    }
}
