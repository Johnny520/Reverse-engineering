package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements android.os.Parcelable, w0.u, java.util.List, java.util.RandomAccess, hg.c {
    public static final android.os.Parcelable.Creator<w0.p> CREATOR = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w0.t f14795g;

    static {
            w0.o r0 = new w0.o
            r0.<init>()
            w0.p.CREATOR = r0
            return
    }

    public p() {
            r1 = this;
            o0.i r0 = o0.i.f9494h
            r1.<init>(r0)
            return
    }

    public p(o0.c r5) {
            r4 = this;
            r4.<init>()
            w0.f r0 = w0.m.j()
            w0.t r1 = new w0.t
            long r2 = r0.g()
            r1.<init>(r2, r5)
            boolean r0 = r0 instanceof w0.a
            if (r0 != 0) goto L1d
            w0.t r0 = new w0.t
            r2 = 1
            long r2 = (long) r2
            r0.<init>(r2, r5)
            r1.f14825b = r0
        L1d:
            r4.f14795g = r1
            return
    }

    @Override // w0.u
    public final w0.w a() {
            r1 = this;
            w0.t r0 = r1.f14795g
            return r0
    }

    @Override // java.util.List
    public final void add(int r7, java.lang.Object r8) {
            r6 = this;
        L0:
            java.lang.Object r0 = w0.q.f14796a
            monitor-enter(r0)
            w0.t r1 = r6.f14795g     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
            w0.w r1 = w0.m.h(r1)     // Catch: java.lang.Throwable -> L42
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L42
            int r2 = r1.f14821d     // Catch: java.lang.Throwable -> L42
            o0.c r1 = r1.f14820c     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            r1.getClass()
            o0.c r0 = r1.a(r7, r8)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L21
            goto L3e
        L21:
            w0.t r1 = r6.f14795g
            r1.getClass()
            java.lang.Object r3 = w0.m.f14786c
            monitor-enter(r3)
            w0.f r4 = w0.m.j()     // Catch: java.lang.Throwable -> L3f
            w0.w r1 = w0.m.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L3f
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            boolean r0 = w0.q.b(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r3)
            w0.m.n(r4, r6)
            if (r0 == 0) goto L0
        L3e:
            return
        L3f:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L42:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = w0.q.f14796a
            monitor-enter(r0)
            w0.t r1 = r6.f14795g     // Catch: java.lang.Throwable -> L43
            r1.getClass()     // Catch: java.lang.Throwable -> L43
            w0.w r1 = w0.m.h(r1)     // Catch: java.lang.Throwable -> L43
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L43
            int r2 = r1.f14821d     // Catch: java.lang.Throwable -> L43
            o0.c r1 = r1.f14820c     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            r1.getClass()
            o0.c r0 = r1.c(r7)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L22
            r7 = 0
            return r7
        L22:
            w0.t r1 = r6.f14795g
            r1.getClass()
            java.lang.Object r3 = w0.m.f14786c
            monitor-enter(r3)
            w0.f r4 = w0.m.j()     // Catch: java.lang.Throwable -> L40
            w0.w r1 = w0.m.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L40
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L40
            r5 = 1
            boolean r0 = w0.q.b(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)
            w0.m.n(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L40:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    @Override // java.util.List
    public final boolean addAll(int r2, java.util.Collection r3) {
            r1 = this;
            th.d r0 = new th.d
            r0.<init>(r2, r3)
            boolean r2 = w0.q.i(r1, r0)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = w0.q.f14796a
            monitor-enter(r0)
            w0.t r1 = r6.f14795g     // Catch: java.lang.Throwable -> L43
            r1.getClass()     // Catch: java.lang.Throwable -> L43
            w0.w r1 = w0.m.h(r1)     // Catch: java.lang.Throwable -> L43
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L43
            int r2 = r1.f14821d     // Catch: java.lang.Throwable -> L43
            o0.c r1 = r1.f14820c     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            r1.getClass()
            o0.c r0 = r1.d(r7)
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L22
            r7 = 0
            return r7
        L22:
            w0.t r1 = r6.f14795g
            r1.getClass()
            java.lang.Object r3 = w0.m.f14786c
            monitor-enter(r3)
            w0.f r4 = w0.m.j()     // Catch: java.lang.Throwable -> L40
            w0.w r1 = w0.m.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L40
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L40
            r5 = 1
            boolean r0 = w0.q.b(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)
            w0.m.n(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L40:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    @Override // w0.u
    public final void c(w0.w r2) {
            r1 = this;
            w0.t r0 = r1.f14795g
            r2.f14825b = r0
            w0.t r2 = (w0.t) r2
            r1.f14795g = r2
            return
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r5 = this;
            w0.t r0 = r5.f14795g
            r0.getClass()
            java.lang.Object r1 = w0.m.f14786c
            monitor-enter(r1)
            w0.f r2 = w0.m.j()     // Catch: java.lang.Throwable -> L2b
            w0.w r0 = w0.m.w(r0, r5, r2)     // Catch: java.lang.Throwable -> L2b
            w0.t r0 = (w0.t) r0     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = w0.q.f14796a     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L2b
            o0.i r4 = o0.i.f9494h     // Catch: java.lang.Throwable -> L2d
            r0.f14820c = r4     // Catch: java.lang.Throwable -> L2d
            int r4 = r0.f14821d     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            r0.f14821d = r4     // Catch: java.lang.Throwable -> L2d
            int r4 = r0.f14822e     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            r0.f14822e = r4     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            w0.m.n(r2, r5)
            return
        L2b:
            r0 = move-exception
            goto L30
        L2d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L30:
            monitor-exit(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            w0.t r0 = w0.q.f(r1)
            o0.c r0 = r0.f14820c
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            w0.t r0 = w0.q.f(r1)
            o0.c r0 = r0.f14820c
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void e(int r7, int r8) {
            r6 = this;
        L0:
            java.lang.Object r0 = w0.q.f14796a
            monitor-enter(r0)
            w0.t r1 = r6.f14795g     // Catch: java.lang.Throwable -> L4d
            r1.getClass()     // Catch: java.lang.Throwable -> L4d
            w0.w r1 = w0.m.h(r1)     // Catch: java.lang.Throwable -> L4d
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.f14821d     // Catch: java.lang.Throwable -> L4d
            o0.c r1 = r1.f14820c     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            r1.getClass()
            o0.f r0 = r1.e()
            java.util.List r3 = r0.subList(r7, r8)
            r3.clear()
            o0.c r0 = r0.d()
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L4c
            w0.t r1 = r6.f14795g
            r1.getClass()
            java.lang.Object r3 = w0.m.f14786c
            monitor-enter(r3)
            w0.f r4 = w0.m.j()     // Catch: java.lang.Throwable -> L49
            w0.w r1 = w0.m.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L49
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L49
            r5 = 1
            boolean r0 = w0.q.b(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            w0.m.n(r4, r6)
            if (r0 == 0) goto L0
            goto L4c
        L49:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L4c:
            return
        L4d:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            w0.t r0 = w0.q.f(r1)
            o0.c r0 = r0.f14820c
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r2) {
            r1 = this;
            w0.t r0 = w0.q.f(r1)
            o0.c r0 = r0.f14820c
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            w0.t r0 = w0.q.f(r1)
            o0.c r0 = r0.f14820c
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            java.util.ListIterator r0 = r1.listIterator()
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            w0.t r0 = w0.q.f(r1)
            o0.c r0 = r0.f14820c
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r2 = this;
            uf.a r0 = new uf.a
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            uf.a r0 = new uf.a
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r8) {
            r7 = this;
            java.lang.Object r0 = r7.get(r8)
        L4:
            java.lang.Object r1 = w0.q.f14796a
            monitor-enter(r1)
            w0.t r2 = r7.f14795g     // Catch: java.lang.Throwable -> L46
            r2.getClass()     // Catch: java.lang.Throwable -> L46
            w0.w r2 = w0.m.h(r2)     // Catch: java.lang.Throwable -> L46
            w0.t r2 = (w0.t) r2     // Catch: java.lang.Throwable -> L46
            int r3 = r2.f14821d     // Catch: java.lang.Throwable -> L46
            o0.c r2 = r2.f14820c     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)
            r2.getClass()
            o0.c r1 = r2.g(r8)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L25
            goto L42
        L25:
            w0.t r2 = r7.f14795g
            r2.getClass()
            java.lang.Object r4 = w0.m.f14786c
            monitor-enter(r4)
            w0.f r5 = w0.m.j()     // Catch: java.lang.Throwable -> L43
            w0.w r2 = w0.m.w(r2, r7, r5)     // Catch: java.lang.Throwable -> L43
            w0.t r2 = (w0.t) r2     // Catch: java.lang.Throwable -> L43
            r6 = 1
            boolean r1 = w0.q.b(r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)
            w0.m.n(r5, r7)
            if (r1 == 0) goto L4
        L42:
            return r0
        L43:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        L46:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = w0.q.f14796a
            monitor-enter(r0)
            w0.t r1 = r6.f14795g     // Catch: java.lang.Throwable -> L4c
            r1.getClass()     // Catch: java.lang.Throwable -> L4c
            w0.w r1 = w0.m.h(r1)     // Catch: java.lang.Throwable -> L4c
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L4c
            int r2 = r1.f14821d     // Catch: java.lang.Throwable -> L4c
            o0.c r1 = r1.f14820c     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)
            r1.getClass()
            int r0 = r1.indexOf(r7)
            r3 = -1
            if (r0 == r3) goto L22
            o0.c r0 = r1.g(r0)
            goto L23
        L22:
            r0 = r1
        L23:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2b
            r7 = 0
            return r7
        L2b:
            w0.t r1 = r6.f14795g
            r1.getClass()
            java.lang.Object r3 = w0.m.f14786c
            monitor-enter(r3)
            w0.f r4 = w0.m.j()     // Catch: java.lang.Throwable -> L49
            w0.w r1 = w0.m.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L49
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L49
            r5 = 1
            boolean r0 = w0.q.b(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            w0.m.n(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L49:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L4c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = w0.q.f14796a
            monitor-enter(r0)
            w0.t r1 = r6.f14795g     // Catch: java.lang.Throwable -> L49
            r1.getClass()     // Catch: java.lang.Throwable -> L49
            w0.w r1 = w0.m.h(r1)     // Catch: java.lang.Throwable -> L49
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L49
            int r2 = r1.f14821d     // Catch: java.lang.Throwable -> L49
            o0.c r1 = r1.f14820c     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            r1.getClass()
            o0.b r0 = new o0.b
            r3 = 0
            r0.<init>(r3, r7)
            o0.c r0 = r1.f(r0)
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L28
            r7 = 0
            return r7
        L28:
            w0.t r1 = r6.f14795g
            r1.getClass()
            java.lang.Object r3 = w0.m.f14786c
            monitor-enter(r3)
            w0.f r4 = w0.m.j()     // Catch: java.lang.Throwable -> L46
            w0.w r1 = w0.m.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L46
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L46
            r5 = 1
            boolean r0 = w0.q.b(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            w0.m.n(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L46:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L49:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r3) {
            r2 = this;
            o0.b r0 = new o0.b
            r1 = 2
            r0.<init>(r1, r3)
            boolean r3 = w0.q.i(r2, r0)
            return r3
    }

    @Override // java.util.List
    public final java.lang.Object set(int r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Object r0 = r7.get(r8)
        L4:
            java.lang.Object r1 = w0.q.f14796a
            monitor-enter(r1)
            w0.t r2 = r7.f14795g     // Catch: java.lang.Throwable -> L46
            r2.getClass()     // Catch: java.lang.Throwable -> L46
            w0.w r2 = w0.m.h(r2)     // Catch: java.lang.Throwable -> L46
            w0.t r2 = (w0.t) r2     // Catch: java.lang.Throwable -> L46
            int r3 = r2.f14821d     // Catch: java.lang.Throwable -> L46
            o0.c r2 = r2.f14820c     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)
            r2.getClass()
            o0.c r1 = r2.h(r8, r9)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L25
            goto L42
        L25:
            w0.t r2 = r7.f14795g
            r2.getClass()
            java.lang.Object r4 = w0.m.f14786c
            monitor-enter(r4)
            w0.f r5 = w0.m.j()     // Catch: java.lang.Throwable -> L43
            w0.w r2 = w0.m.w(r2, r7, r5)     // Catch: java.lang.Throwable -> L43
            w0.t r2 = (w0.t) r2     // Catch: java.lang.Throwable -> L43
            r6 = 0
            boolean r1 = w0.q.b(r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)
            w0.m.n(r5, r7)
            if (r1 == 0) goto L4
        L42:
            return r0
        L43:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        L46:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r1 = this;
            w0.t r0 = w0.q.f(r1)
            o0.c r0 = r0.f14820c
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto Lc
            if (r2 > r3) goto Lc
            int r0 = r1.size()
            if (r3 > r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L14
            java.lang.String r0 = "fromIndex or toIndex are out of bounds"
            i0.n1.a(r0)
        L14:
            w0.x r0 = new w0.x
            r0.<init>(r1, r2, r3)
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

    public final java.lang.String toString() {
            r3 = this;
            w0.t r0 = r3.f14795g
            r0.getClass()
            w0.w r0 = w0.m.h(r0)
            w0.t r0 = (w0.t) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SnapshotStateList(value="
            r1.<init>(r2)
            o0.c r0 = r0.f14820c
            r1.append(r0)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r0 = r3.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            w0.t r5 = w0.q.f(r3)
            o0.c r5 = r5.f14820c
            int r0 = r5.size()
            r4.writeInt(r0)
            r1 = 0
        Le:
            if (r1 >= r0) goto L1a
            java.lang.Object r2 = r5.get(r1)
            r4.writeValue(r2)
            int r1 = r1 + 1
            goto Le
        L1a:
            return
    }
}
