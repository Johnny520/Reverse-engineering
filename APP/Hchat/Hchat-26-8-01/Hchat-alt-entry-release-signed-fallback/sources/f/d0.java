package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements java.util.List, hg.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f2789h;

    public /* synthetic */ d0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f2788g = r2
            r0.f2789h = r1
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final void add(int r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f2788g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f2789h
            j0.b r0 = (j0.b) r0
            r0.a(r5, r6)
            return
        Ld:
            java.lang.Object r0 = r4.f2789h
            f.f0 r0 = (f.f0) r0
            if (r5 < 0) goto L35
            int r1 = r0.f2804b
            if (r5 > r1) goto L35
            int r1 = r1 + 1
            java.lang.Object[] r2 = r0.f2803a
            int r3 = r2.length
            if (r3 >= r1) goto L21
            r0.m(r1, r2)
        L21:
            java.lang.Object[] r1 = r0.f2803a
            int r2 = r0.f2804b
            if (r5 == r2) goto L2c
            int r3 = r5 + 1
            tf.l.n0(r3, r5, r1, r2, r1)
        L2c:
            r1[r5] = r6
            int r5 = r0.f2804b
            int r5 = r5 + 1
            r0.f2804b = r5
            return
        L35:
            r0.p(r5)
            r5 = 0
            throw r5
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2789h
            j0.b r0 = (j0.b) r0
            r0.b(r2)
        Lc:
            r2 = 1
            return r2
        Le:
            java.lang.Object r0 = r1.f2789h
            f.f0 r0 = (f.f0) r0
            r0.a(r2)
            goto Lc
    }

    @Override // java.util.List
    public final boolean addAll(int r8, java.util.Collection r9) {
            r7 = this;
            int r0 = r7.f2788g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f2789h
            j0.b r0 = (j0.b) r0
            boolean r8 = r0.e(r8, r9)
            return r8
        Le:
            r9.getClass()
            java.lang.Object r0 = r7.f2789h
            f.f0 r0 = (f.f0) r0
            r1 = 0
            if (r8 < 0) goto L6c
            int r2 = r0.f2804b
            if (r8 > r2) goto L6c
            boolean r2 = r9.isEmpty()
            r3 = 0
            if (r2 == 0) goto L24
            goto L6b
        L24:
            int r2 = r0.f2804b
            int r4 = r9.size()
            int r4 = r4 + r2
            java.lang.Object[] r2 = r0.f2803a
            int r5 = r2.length
            if (r5 >= r4) goto L33
            r0.m(r4, r2)
        L33:
            java.lang.Object[] r2 = r0.f2803a
            int r4 = r0.f2804b
            if (r8 == r4) goto L43
            int r4 = r9.size()
            int r4 = r4 + r8
            int r5 = r0.f2804b
            tf.l.n0(r4, r8, r2, r5, r2)
        L43:
            r4 = r9
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r4.next()
            int r6 = r3 + 1
            if (r3 < 0) goto L5d
            int r3 = r3 + r8
            r2[r3] = r5
            r3 = r6
            goto L4a
        L5d:
            a.a.Q0()
            throw r1
        L61:
            int r8 = r0.f2804b
            int r9 = r9.size()
            int r9 = r9 + r8
            r0.f2804b = r9
            r3 = 1
        L6b:
            return r3
        L6c:
            r0.p(r8)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r4) {
            r3 = this;
            int r0 = r3.f2788g
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f2789h
            j0.b r0 = (j0.b) r0
            int r1 = r0.f6673i
            boolean r4 = r0.e(r1, r4)
            return r4
        L10:
            r4.getClass()
            java.lang.Object r0 = r3.f2789h
            f.f0 r0 = (f.f0) r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            int r1 = r0.f2804b
            java.util.Iterator r4 = r4.iterator()
        L1f:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r4.next()
            r0.a(r2)
            goto L1f
        L2d:
            int r4 = r0.f2804b
            if (r1 == r4) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2789h
            j0.b r0 = (j0.b) r0
            r0.g()
            return
        Ld:
            java.lang.Object r0 = r1.f2789h
            f.f0 r0 = (f.f0) r0
            r0.d()
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2789h
            j0.b r0 = (j0.b) r0
            boolean r2 = r0.h(r2)
            return r2
        Le:
            java.lang.Object r0 = r1.f2789h
            f.f0 r0 = (f.f0) r0
            int r2 = r0.g(r2)
            if (r2 < 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.f2788g
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f2789h
            j0.b r0 = (j0.b) r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            boolean r1 = r0.h(r1)
            if (r1 != 0) goto Lf
            r3 = 0
            goto L22
        L21:
            r3 = 1
        L22:
            return r3
        L23:
            r3.getClass()
            java.lang.Object r0 = r2.f2789h
            f.f0 r0 = (f.f0) r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L30:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r3.next()
            int r1 = r0.g(r1)
            if (r1 < 0) goto L41
            goto L30
        L41:
            r3 = 0
            goto L44
        L43:
            r3 = 1
        L44:
            return r3
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            j0.c.a(r2, r1)
            java.lang.Object r0 = r1.f2789h
            j0.b r0 = (j0.b) r0
            java.lang.Object[] r0 = r0.f6671g
            r2 = r0[r2]
            return r2
        L11:
            f.p0.a(r2, r1)
            java.lang.Object r0 = r1.f2789h
            f.f0 r0 = (f.f0) r0
            java.lang.Object r2 = r0.f(r2)
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2789h
            j0.b r0 = (j0.b) r0
            int r2 = r0.i(r2)
            return r2
        Le:
            java.lang.Object r0 = r1.f2789h
            f.f0 r0 = (f.f0) r0
            int r2 = r0.g(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2789h
            j0.b r0 = (j0.b) r0
            int r0 = r0.f6673i
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
        L11:
            java.lang.Object r0 = r1.f2789h
            f.f0 r0 = (f.f0) r0
            boolean r0 = r0.h()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f2788g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            f.c0 r0 = new f.c0
            r1 = 0
            r2 = 1
            r0.<init>(r3, r1, r2)
            return r0
        Ld:
            f.c0 r0 = new f.c0
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f2788g
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f2789h
            j0.b r0 = (j0.b) r0
            int r1 = r0.f6673i
            int r1 = r1 + (-1)
            java.lang.Object[] r0 = r0.f6671g
        Lf:
            if (r1 < 0) goto L1d
            r2 = r0[r1]
            boolean r2 = gg.l.a(r5, r2)
            if (r2 == 0) goto L1a
            goto L1e
        L1a:
            int r1 = r1 + (-1)
            goto Lf
        L1d:
            r1 = -1
        L1e:
            return r1
        L1f:
            java.lang.Object r0 = r4.f2789h
            f.f0 r0 = (f.f0) r0
            java.lang.Object[] r1 = r0.f2803a
            int r0 = r0.f2804b
            r2 = -1
            if (r5 != 0) goto L37
            int r0 = r0 + (-1)
        L2c:
            if (r2 >= r0) goto L47
            r5 = r1[r0]
            if (r5 != 0) goto L34
        L32:
            r2 = r0
            goto L47
        L34:
            int r0 = r0 + (-1)
            goto L2c
        L37:
            int r0 = r0 + (-1)
        L39:
            if (r2 >= r0) goto L47
            r3 = r1[r0]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L44
            goto L32
        L44:
            int r0 = r0 + (-1)
            goto L39
        L47:
            return r2
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r3 = this;
            int r0 = r3.f2788g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            f.c0 r0 = new f.c0
            r1 = 0
            r2 = 1
            r0.<init>(r3, r1, r2)
            return r0
        Ld:
            f.c0 r0 = new f.c0
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            int r0 = r2.f2788g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            f.c0 r0 = new f.c0
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
        Lc:
            f.c0 r0 = new f.c0
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r2) {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            j0.c.a(r2, r1)
            java.lang.Object r0 = r1.f2789h
            j0.b r0 = (j0.b) r0
            java.lang.Object r2 = r0.k(r2)
            return r2
        L11:
            f.p0.a(r2, r1)
            java.lang.Object r0 = r1.f2789h
            f.f0 r0 = (f.f0) r0
            java.lang.Object r2 = r0.k(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2789h
            j0.b r0 = (j0.b) r0
            boolean r2 = r0.j(r2)
            return r2
        Le:
            java.lang.Object r0 = r1.f2789h
            f.f0 r0 = (f.f0) r0
            boolean r2 = r0.j(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            int r0 = r3.f2788g
            switch(r0) {
                case 0: goto L2e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f2789h
            j0.b r0 = (j0.b) r0
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L10
            goto L2c
        L10:
            int r1 = r0.f6673i
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            r0.j(r2)
            goto L18
        L26:
            int r4 = r0.f6673i
            if (r1 == r4) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            return r4
        L2e:
            r4.getClass()
            java.lang.Object r0 = r3.f2789h
            f.f0 r0 = (f.f0) r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            int r1 = r0.f2804b
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r4.next()
            r0.j(r2)
            goto L3d
        L4b:
            int r4 = r0.f2804b
            if (r1 == r4) goto L51
            r4 = 1
            goto L52
        L51:
            r4 = 0
        L52:
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r6) {
            r5 = this;
            int r0 = r5.f2788g
            switch(r0) {
                case 0: goto L28;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f2789h
            j0.b r0 = (j0.b) r0
            int r1 = r0.f6673i
            int r2 = r1 + (-1)
        Ld:
            r3 = -1
            if (r3 >= r2) goto L20
            java.lang.Object[] r3 = r0.f6671g
            r3 = r3[r2]
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L1d
            r0.k(r2)
        L1d:
            int r2 = r2 + (-1)
            goto Ld
        L20:
            int r6 = r0.f6673i
            if (r1 == r6) goto L26
            r6 = 1
            goto L27
        L26:
            r6 = 0
        L27:
            return r6
        L28:
            r6.getClass()
            java.lang.Object r0 = r5.f2789h
            f.f0 r0 = (f.f0) r0
            int r1 = r0.f2804b
            java.lang.Object[] r2 = r0.f2803a
            int r3 = r1 + (-1)
        L35:
            r4 = -1
            if (r4 >= r3) goto L46
            r4 = r2[r3]
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L43
            r0.k(r3)
        L43:
            int r3 = r3 + (-1)
            goto L35
        L46:
            int r6 = r0.f2804b
            if (r1 == r6) goto L4c
            r6 = 1
            goto L4d
        L4c:
            r6 = 0
        L4d:
            return r6
    }

    @Override // java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f2788g
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            j0.c.a(r3, r2)
            java.lang.Object r0 = r2.f2789h
            j0.b r0 = (j0.b) r0
            java.lang.Object[] r0 = r0.f6671g
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        L13:
            f.p0.a(r3, r2)
            java.lang.Object r0 = r2.f2789h
            f.f0 r0 = (f.f0) r0
            java.lang.Object r3 = r0.n(r3, r4)
            return r3
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2789h
            j0.b r0 = (j0.b) r0
            int r0 = r0.f6673i
            return r0
        Lc:
            java.lang.Object r0 = r1.f2789h
            f.f0 r0 = (f.f0) r0
            int r0 = r0.f2804b
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.f2788g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            j0.c.b(r2, r3, r4)
            f.e0 r0 = new f.e0
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            return r0
        Lf:
            f.p0.b(r2, r3, r4)
            f.e0 r0 = new f.e0
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
        La:
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            int r0 = r1.f2788g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object[] r2 = gg.k.b(r1, r2)
            return r2
        La:
            r2.getClass()
            java.lang.Object[] r2 = gg.k.b(r1, r2)
            return r2
    }
}
