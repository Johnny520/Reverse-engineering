package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements java.util.List, hg.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f2797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2799j;

    public /* synthetic */ e0(java.util.List r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f2796g = r4
            r0.f2797h = r1
            r0.f2798i = r2
            r0.f2799j = r3
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f2796g
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            r0.add(r2, r3)
            int r2 = r1.f2799j
            int r2 = r2 + 1
            r1.f2799j = r2
            return
        L14:
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            r0.add(r2, r3)
            int r2 = r1.f2799j
            int r2 = r2 + 1
            r1.f2799j = r2
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f2796g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            int r0 = r2.f2799j
            int r1 = r0 + 1
            r2.f2799j = r1
            java.lang.Object r1 = r2.f2797h
            r1.add(r0, r3)
        L10:
            r3 = 1
            return r3
        L12:
            int r0 = r2.f2799j
            int r1 = r0 + 1
            r2.f2799j = r1
            java.lang.Object r1 = r2.f2797h
            r1.add(r0, r3)
            goto L10
    }

    @Override // java.util.List
    public final boolean addAll(int r2, java.util.Collection r3) {
            r1 = this;
            int r0 = r1.f2796g
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            r0.addAll(r2, r3)
            int r2 = r3.size()
            int r3 = r1.f2799j
            int r3 = r3 + r2
            r1.f2799j = r3
            if (r2 <= 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
        L1c:
            r3.getClass()
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            r0.addAll(r2, r3)
            int r2 = r1.f2799j
            int r0 = r3.size()
            int r0 = r0 + r2
            r1.f2799j = r0
            int r2 = r3.size()
            if (r2 <= 0) goto L38
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.f2796g
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f2797h
            int r1 = r2.f2799j
            r0.addAll(r1, r3)
            int r3 = r3.size()
            int r0 = r2.f2799j
            int r0 = r0 + r3
            r2.f2799j = r0
            if (r3 <= 0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            return r3
        L1b:
            r3.getClass()
            java.lang.Object r0 = r2.f2797h
            int r1 = r2.f2799j
            r0.addAll(r1, r3)
            int r0 = r2.f2799j
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.f2799j = r1
            int r3 = r3.size()
            if (r3 <= 0) goto L36
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            return r3
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r3 = this;
            int r0 = r3.f2796g
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            int r0 = r3.f2799j
            int r0 = r0 + (-1)
            int r1 = r3.f2798i
            if (r1 > r0) goto L17
        Ld:
            java.lang.Object r2 = r3.f2797h
            r2.remove(r0)
            if (r0 == r1) goto L17
            int r0 = r0 + (-1)
            goto Ld
        L17:
            r3.f2799j = r1
            return
        L1a:
            int r0 = r3.f2799j
            int r0 = r0 + (-1)
            int r1 = r3.f2798i
            if (r1 > r0) goto L2c
        L22:
            java.lang.Object r2 = r3.f2797h
            r2.remove(r0)
            if (r0 == r1) goto L2c
            int r0 = r0 + (-1)
            goto L22
        L2c:
            r3.f2799j = r1
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f2796g
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            int r0 = r3.f2799j
            int r1 = r3.f2798i
        L9:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = r3.f2797h
            java.lang.Object r2 = r2.get(r1)
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L19
            r4 = 1
            goto L1d
        L19:
            int r1 = r1 + 1
            goto L9
        L1c:
            r4 = 0
        L1d:
            return r4
        L1e:
            int r0 = r3.f2799j
            int r1 = r3.f2798i
        L22:
            if (r1 >= r0) goto L35
            java.lang.Object r2 = r3.f2797h
            java.lang.Object r2 = r2.get(r1)
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L32
            r4 = 1
            goto L36
        L32:
            int r1 = r1 + 1
            goto L22
        L35:
            r4 = 0
        L36:
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f2796g
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lb
            r2 = 0
            goto L1e
        L1d:
            r2 = 1
        L1e:
            return r2
        L1f:
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L28
            r2 = 0
            goto L3b
        L3a:
            r2 = 1
        L3b:
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.f2796g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            j0.c.a(r2, r1)
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            java.lang.Object r2 = r0.get(r2)
            return r2
        L12:
            f.p0.a(r2, r1)
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f2796g
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            int r0 = r4.f2799j
            int r1 = r4.f2798i
            r2 = r1
        La:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r4.f2797h
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L1a
            int r2 = r2 - r1
            goto L1e
        L1a:
            int r2 = r2 + 1
            goto La
        L1d:
            r2 = -1
        L1e:
            return r2
        L1f:
            int r0 = r4.f2799j
            int r1 = r4.f2798i
            r2 = r1
        L24:
            if (r2 >= r0) goto L37
            java.lang.Object r3 = r4.f2797h
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L34
            int r2 = r2 - r1
            goto L38
        L34:
            int r2 = r2 + 1
            goto L24
        L37:
            r2 = -1
        L38:
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.f2796g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            int r0 = r2.f2799j
            int r1 = r2.f2798i
            if (r0 != r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
        Lf:
            int r0 = r2.f2799j
            int r1 = r2.f2798i
            if (r0 != r1) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f2796g
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
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f2796g
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            int r0 = r3.f2799j
            int r0 = r0 + (-1)
            int r1 = r3.f2798i
            if (r1 > r0) goto L20
        Ld:
            java.lang.Object r2 = r3.f2797h
            java.lang.Object r2 = r2.get(r0)
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L1b
            int r0 = r0 - r1
            goto L21
        L1b:
            if (r0 == r1) goto L20
            int r0 = r0 + (-1)
            goto Ld
        L20:
            r0 = -1
        L21:
            return r0
        L22:
            int r0 = r3.f2799j
            int r0 = r0 + (-1)
            int r1 = r3.f2798i
            if (r1 > r0) goto L3d
        L2a:
            java.lang.Object r2 = r3.f2797h
            java.lang.Object r2 = r2.get(r0)
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L38
            int r0 = r0 - r1
            goto L3e
        L38:
            if (r0 == r1) goto L3d
            int r0 = r0 + (-1)
            goto L2a
        L3d:
            r0 = -1
        L3e:
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r3 = this;
            int r0 = r3.f2796g
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
            int r0 = r2.f2796g
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
            int r0 = r1.f2796g
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            j0.c.a(r2, r1)
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.f2799j
            int r0 = r0 + (-1)
            r1.f2799j = r0
            return r2
        L18:
            f.p0.a(r2, r1)
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.f2799j
            int r0 = r0 + (-1)
            r1.f2799j = r0
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f2796g
            switch(r0) {
                case 0: goto L27;
                default: goto L5;
            }
        L5:
            int r0 = r4.f2799j
            int r1 = r4.f2798i
        L9:
            if (r1 >= r0) goto L25
            java.lang.Object r2 = r4.f2797h
            java.lang.Object r3 = r2.get(r1)
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L22
            r2.remove(r1)
            int r5 = r4.f2799j
            int r5 = r5 + (-1)
            r4.f2799j = r5
            r5 = 1
            goto L26
        L22:
            int r1 = r1 + 1
            goto L9
        L25:
            r5 = 0
        L26:
            return r5
        L27:
            int r0 = r4.f2799j
            int r1 = r4.f2798i
        L2b:
            if (r1 >= r0) goto L47
            java.lang.Object r2 = r4.f2797h
            java.lang.Object r3 = r2.get(r1)
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L44
            r2.remove(r1)
            int r5 = r4.f2799j
            int r5 = r5 + (-1)
            r4.f2799j = r5
            r5 = 1
            goto L48
        L44:
            int r1 = r1 + 1
            goto L2b
        L47:
            r5 = 0
        L48:
            return r5
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.f2796g
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            int r0 = r2.f2799j
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r3.next()
            r2.remove(r1)
            goto Ld
        L1b:
            int r3 = r2.f2799j
            if (r0 == r3) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            return r3
        L23:
            r3.getClass()
            int r0 = r2.f2799j
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r3.next()
            r2.remove(r1)
            goto L2e
        L3c:
            int r3 = r2.f2799j
            if (r0 == r3) goto L42
            r3 = 1
            goto L43
        L42:
            r3 = 0
        L43:
            return r3
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r6) {
            r5 = this;
            int r0 = r5.f2796g
            switch(r0) {
                case 0: goto L2f;
                default: goto L5;
            }
        L5:
            int r0 = r5.f2799j
            int r1 = r0 + (-1)
            int r2 = r5.f2798i
            if (r2 > r1) goto L27
        Ld:
            java.lang.Object r3 = r5.f2797h
            java.lang.Object r4 = r3.get(r1)
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L22
            r3.remove(r1)
            int r3 = r5.f2799j
            int r3 = r3 + (-1)
            r5.f2799j = r3
        L22:
            if (r1 == r2) goto L27
            int r1 = r1 + (-1)
            goto Ld
        L27:
            int r6 = r5.f2799j
            if (r0 == r6) goto L2d
            r6 = 1
            goto L2e
        L2d:
            r6 = 0
        L2e:
            return r6
        L2f:
            r6.getClass()
            int r0 = r5.f2799j
            int r1 = r0 + (-1)
            int r2 = r5.f2798i
            if (r2 > r1) goto L54
        L3a:
            java.lang.Object r3 = r5.f2797h
            java.lang.Object r4 = r3.get(r1)
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L4f
            r3.remove(r1)
            int r3 = r5.f2799j
            int r3 = r3 + (-1)
            r5.f2799j = r3
        L4f:
            if (r1 == r2) goto L54
            int r1 = r1 + (-1)
            goto L3a
        L54:
            int r6 = r5.f2799j
            if (r0 == r6) goto L5a
            r6 = 1
            goto L5b
        L5a:
            r6 = 0
        L5b:
            return r6
    }

    @Override // java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f2796g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            j0.c.a(r2, r1)
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
        L12:
            f.p0.a(r2, r1)
            int r0 = r1.f2798i
            int r2 = r2 + r0
            java.lang.Object r0 = r1.f2797h
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r2 = this;
            int r0 = r2.f2796g
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            int r0 = r2.f2799j
            int r1 = r2.f2798i
        L9:
            int r0 = r0 - r1
            return r0
        Lb:
            int r0 = r2.f2799j
            int r1 = r2.f2798i
            goto L9
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.f2796g
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
            int r0 = r1.f2796g
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
            int r0 = r1.f2796g
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
