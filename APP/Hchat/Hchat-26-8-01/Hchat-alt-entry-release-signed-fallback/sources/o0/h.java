package o0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends o0.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o0.f f9490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o0.j f9492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9493l;

    public h(o0.f r2, int r3) {
            r1 = this;
            int r0 = r2.f9487n
            r1.<init>(r3, r0)
            r1.f9490i = r2
            int r2 = r2.f()
            r1.f9491j = r2
            r2 = -1
            r1.f9493l = r2
            r1.c()
            return
    }

    public final void a() {
            r2 = this;
            int r0 = r2.f9491j
            o0.f r1 = r2.f9490i
            int r1 = r1.f()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // o0.a, java.util.ListIterator
    public final void add(java.lang.Object r3) {
            r2 = this;
            r2.a()
            int r0 = r2.f9470g
            o0.f r1 = r2.f9490i
            r1.add(r0, r3)
            int r3 = r2.f9470g
            int r3 = r3 + 1
            r2.f9470g = r3
            int r3 = r1.a()
            r2.f9471h = r3
            int r3 = r1.f()
            r2.f9491j = r3
            r3 = -1
            r2.f9493l = r3
            r2.c()
            return
    }

    public final void c() {
            r7 = this;
            o0.f r0 = r7.f9490i
            java.lang.Object[] r1 = r0.f9485l
            if (r1 != 0) goto La
            r0 = 0
            r7.f9492k = r0
            return
        La:
            int r2 = r0.f9487n
            r3 = 1
            int r2 = r2 - r3
            r2 = r2 & (-32)
            int r4 = r7.f9470g
            if (r4 <= r2) goto L15
            r4 = r2
        L15:
            int r0 = r0.f9483j
            int r0 = r0 / 5
            int r0 = r0 + r3
            o0.j r5 = r7.f9492k
            if (r5 != 0) goto L26
            o0.j r3 = new o0.j
            r3.<init>(r1, r4, r2, r0)
            r7.f9492k = r3
            return
        L26:
            r5.f9470g = r4
            r5.f9471h = r2
            r5.f9496i = r0
            java.lang.Object[] r6 = r5.f9497j
            int r6 = r6.length
            if (r6 >= r0) goto L35
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5.f9497j = r0
        L35:
            java.lang.Object[] r0 = r5.f9497j
            r6 = 0
            r0[r6] = r1
            if (r4 != r2) goto L3d
            r6 = r3
        L3d:
            r5.f9498k = r6
            int r4 = r4 - r6
            r5.c(r4, r3)
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            r4.a()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            int r0 = r4.f9470g
            r4.f9493l = r0
            o0.j r1 = r4.f9492k
            o0.f r2 = r4.f9490i
            if (r1 != 0) goto L1c
            java.lang.Object[] r1 = r2.f9486m
            int r2 = r0 + 1
            r4.f9470g = r2
            r0 = r1[r0]
            return r0
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            int r0 = r4.f9470g
            int r0 = r0 + 1
            r4.f9470g = r0
            java.lang.Object r0 = r1.next()
            return r0
        L2d:
            java.lang.Object[] r0 = r2.f9486m
            int r2 = r4.f9470g
            int r3 = r2 + 1
            r4.f9470g = r3
            int r1 = r1.f9471h
            int r2 = r2 - r1
            r0 = r0[r2]
            return r0
        L3b:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r4 = this;
            r4.a()
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L35
            int r0 = r4.f9470g
            int r1 = r0 + (-1)
            r4.f9493l = r1
            o0.j r1 = r4.f9492k
            o0.f r2 = r4.f9490i
            if (r1 != 0) goto L1e
            java.lang.Object[] r1 = r2.f9486m
            int r0 = r0 + (-1)
            r4.f9470g = r0
            r0 = r1[r0]
            return r0
        L1e:
            int r3 = r1.f9471h
            if (r0 <= r3) goto L2c
            java.lang.Object[] r1 = r2.f9486m
            int r0 = r0 + (-1)
            r4.f9470g = r0
            int r0 = r0 - r3
            r0 = r1[r0]
            return r0
        L2c:
            int r0 = r0 + (-1)
            r4.f9470g = r0
            java.lang.Object r0 = r1.previous()
            return r0
        L35:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // o0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r4 = this;
            r4.a()
            int r0 = r4.f9493l
            r1 = -1
            if (r0 == r1) goto L27
            o0.f r2 = r4.f9490i
            r2.c(r0)
            int r0 = r4.f9493l
            int r3 = r4.f9470g
            if (r0 >= r3) goto L15
            r4.f9470g = r0
        L15:
            int r0 = r2.a()
            r4.f9471h = r0
            int r0 = r2.f()
            r4.f9491j = r0
            r4.f9493l = r1
            r4.c()
            return
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // o0.a, java.util.ListIterator
    public final void set(java.lang.Object r3) {
            r2 = this;
            r2.a()
            int r0 = r2.f9493l
            r1 = -1
            if (r0 == r1) goto L17
            o0.f r1 = r2.f9490i
            r1.set(r0, r3)
            int r3 = r1.f()
            r2.f9491j = r3
            r2.c()
            return
        L17:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }
}
