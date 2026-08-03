package uf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements java.util.ListIterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f13768k;

    public a(uf.b r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f13764g = r0
            r1.<init>()
            r1.f13768k = r2
            r1.f13765h = r3
            r3 = -1
            r1.f13766i = r3
            int r2 = uf.b.d(r2)
            r1.f13767j = r2
            return
    }

    public a(uf.c r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f13764g = r0
            r1.<init>()
            r1.f13768k = r2
            r1.f13765h = r3
            r3 = -1
            r1.f13766i = r3
            int r2 = uf.c.d(r2)
            r1.f13767j = r2
            return
    }

    public a(w0.p r2, int r3) {
            r1 = this;
            r0 = 2
            r1.f13764g = r0
            r1.<init>()
            r1.f13768k = r2
            int r3 = r3 + (-1)
            r1.f13765h = r3
            r3 = -1
            r1.f13766i = r3
            int r2 = w0.q.g(r2)
            r1.f13767j = r2
            return
    }

    public a(x1.p r2, int r3, int r4) {
            r1 = this;
            r0 = 3
            r1.f13764g = r0
            r4 = r4 & 1
            r0 = 0
            if (r4 == 0) goto L9
            r3 = r0
        L9:
            f.f0 r4 = r2.f21015g
            int r4 = r4.f2804b
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public a(x1.p r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = 3
            r1.f13764g = r0
            r1.<init>()
            r1.f13768k = r2
            r1.f13765h = r3
            r1.f13766i = r4
            r1.f13767j = r5
            return
    }

    public void a() {
            r2 = this;
            java.lang.Object r0 = r2.f13768k
            uf.b r0 = (uf.b) r0
            uf.c r0 = r0.f13773k
            int r0 = uf.c.d(r0)
            int r1 = r2.f13767j
            if (r0 != r1) goto Lf
            return
        Lf:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f13764g
            switch(r0) {
                case 0: goto L45;
                case 1: goto L2b;
                case 2: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r4.<init>(r0)
            throw r4
        Ld:
            r3.d()
            java.lang.Object r0 = r3.f13768k
            w0.p r0 = (w0.p) r0
            int r1 = r3.f13765h
            int r1 = r1 + 1
            r0.add(r1, r4)
            r4 = -1
            r3.f13766i = r4
            int r4 = r3.f13765h
            int r4 = r4 + 1
            r3.f13765h = r4
            int r4 = w0.q.g(r0)
            r3.f13767j = r4
            return
        L2b:
            r3.c()
            java.lang.Object r0 = r3.f13768k
            uf.c r0 = (uf.c) r0
            int r1 = r3.f13765h
            int r2 = r1 + 1
            r3.f13765h = r2
            r0.add(r1, r4)
            r4 = -1
            r3.f13766i = r4
            int r4 = uf.c.d(r0)
            r3.f13767j = r4
            return
        L45:
            r3.a()
            java.lang.Object r0 = r3.f13768k
            uf.b r0 = (uf.b) r0
            int r1 = r3.f13765h
            int r2 = r1 + 1
            r3.f13765h = r2
            r0.add(r1, r4)
            r4 = -1
            r3.f13766i = r4
            int r4 = uf.b.d(r0)
            r3.f13767j = r4
            return
    }

    public void c() {
            r2 = this;
            java.lang.Object r0 = r2.f13768k
            uf.c r0 = (uf.c) r0
            int r0 = uf.c.d(r0)
            int r1 = r2.f13767j
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public void d() {
            r2 = this;
            java.lang.Object r0 = r2.f13768k
            w0.p r0 = (w0.p) r0
            int r0 = w0.q.g(r0)
            int r1 = r2.f13767j
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.f13764g
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L20;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            int r0 = r3.f13765h
            int r1 = r3.f13767j
            if (r0 >= r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
        Lf:
            int r0 = r3.f13765h
            java.lang.Object r1 = r3.f13768k
            w0.p r1 = (w0.p) r1
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
        L20:
            int r0 = r3.f13765h
            java.lang.Object r1 = r3.f13768k
            uf.c r1 = (uf.c) r1
            int r1 = r1.f13776h
            if (r0 >= r1) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            int r0 = r3.f13765h
            java.lang.Object r1 = r3.f13768k
            uf.b r1 = (uf.b) r1
            int r1 = r1.f13771i
            if (r0 >= r1) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r2 = this;
            int r0 = r2.f13764g
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L17;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            int r0 = r2.f13765h
            int r1 = r2.f13766i
            if (r0 <= r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
        Lf:
            int r0 = r2.f13765h
            if (r0 < 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
        L17:
            int r0 = r2.f13765h
            if (r0 <= 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
        L1f:
            int r0 = r2.f13765h
            if (r0 <= 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f13764g
            switch(r0) {
                case 0: goto L53;
                case 1: goto L36;
                case 2: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f13768k
            x1.p r0 = (x1.p) r0
            f.f0 r0 = r0.f21015g
            int r1 = r3.f13765h
            int r2 = r1 + 1
            r3.f13765h = r2
            java.lang.Object r0 = r0.f(r1)
            r0.getClass()
            y0.n r0 = (y0.n) r0
            return r0
        L1b:
            r3.d()
            int r0 = r3.f13765h
            int r0 = r0 + 1
            r3.f13766i = r0
            java.lang.Object r1 = r3.f13768k
            w0.p r1 = (w0.p) r1
            int r2 = r1.size()
            w0.q.a(r0, r2)
            java.lang.Object r1 = r1.get(r0)
            r3.f13765h = r0
            return r1
        L36:
            r3.c()
            int r0 = r3.f13765h
            java.lang.Object r1 = r3.f13768k
            uf.c r1 = (uf.c) r1
            int r2 = r1.f13776h
            if (r0 >= r2) goto L4e
            int r2 = r0 + 1
            r3.f13765h = r2
            r3.f13766i = r0
            java.lang.Object[] r1 = r1.f13775g
            r0 = r1[r0]
            goto L52
        L4e:
            bsh.j.e()
            r0 = 0
        L52:
            return r0
        L53:
            r3.a()
            int r0 = r3.f13765h
            java.lang.Object r1 = r3.f13768k
            uf.b r1 = (uf.b) r1
            int r2 = r1.f13771i
            if (r0 >= r2) goto L6e
            int r2 = r0 + 1
            r3.f13765h = r2
            r3.f13766i = r0
            java.lang.Object[] r2 = r1.f13769g
            int r1 = r1.f13770h
            int r1 = r1 + r0
            r0 = r2[r1]
            goto L72
        L6e:
            bsh.j.e()
            r0 = 0
        L72:
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r2 = this;
            int r0 = r2.f13764g
            switch(r0) {
                case 0: goto L13;
                case 1: goto L10;
                case 2: goto Lb;
                default: goto L5;
            }
        L5:
            int r0 = r2.f13765h
            int r1 = r2.f13766i
            int r0 = r0 - r1
            return r0
        Lb:
            int r0 = r2.f13765h
            int r0 = r0 + 1
            return r0
        L10:
            int r0 = r2.f13765h
            return r0
        L13:
            int r0 = r2.f13765h
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            int r0 = r3.f13764g
            switch(r0) {
                case 0: goto L55;
                case 1: goto L3a;
                case 2: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f13768k
            x1.p r0 = (x1.p) r0
            f.f0 r0 = r0.f21015g
            int r1 = r3.f13765h
            int r1 = r1 + (-1)
            r3.f13765h = r1
            java.lang.Object r0 = r0.f(r1)
            r0.getClass()
            y0.n r0 = (y0.n) r0
            return r0
        L1b:
            r3.d()
            int r0 = r3.f13765h
            java.lang.Object r1 = r3.f13768k
            w0.p r1 = (w0.p) r1
            int r2 = r1.size()
            w0.q.a(r0, r2)
            int r0 = r3.f13765h
            r3.f13766i = r0
            java.lang.Object r0 = r1.get(r0)
            int r1 = r3.f13765h
            int r1 = r1 + (-1)
            r3.f13765h = r1
            return r0
        L3a:
            r3.c()
            int r0 = r3.f13765h
            if (r0 <= 0) goto L50
            int r0 = r0 + (-1)
            r3.f13765h = r0
            r3.f13766i = r0
            java.lang.Object r1 = r3.f13768k
            uf.c r1 = (uf.c) r1
            java.lang.Object[] r1 = r1.f13775g
            r0 = r1[r0]
            goto L54
        L50:
            bsh.j.e()
            r0 = 0
        L54:
            return r0
        L55:
            r3.a()
            int r0 = r3.f13765h
            if (r0 <= 0) goto L6e
            int r0 = r0 + (-1)
            r3.f13765h = r0
            r3.f13766i = r0
            java.lang.Object r1 = r3.f13768k
            uf.b r1 = (uf.b) r1
            java.lang.Object[] r2 = r1.f13769g
            int r1 = r1.f13770h
            int r1 = r1 + r0
            r0 = r2[r1]
            goto L72
        L6e:
            bsh.j.e()
            r0 = 0
        L72:
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r2 = this;
            int r0 = r2.f13764g
            switch(r0) {
                case 0: goto L13;
                case 1: goto L10;
                case 2: goto Ld;
                default: goto L5;
            }
        L5:
            int r0 = r2.f13765h
            int r1 = r2.f13766i
            int r0 = r0 - r1
        La:
            int r0 = r0 + (-1)
            return r0
        Ld:
            int r0 = r2.f13765h
            return r0
        L10:
            int r0 = r2.f13765h
            goto La
        L13:
            int r0 = r2.f13765h
            goto La
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r3 = this;
            int r0 = r3.f13764g
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L28;
                case 2: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            r3.d()
            java.lang.Object r0 = r3.f13768k
            w0.p r0 = (w0.p) r0
            int r1 = r3.f13766i
            r0.remove(r1)
            int r1 = r3.f13765h
            r2 = -1
            int r1 = r1 + r2
            r3.f13765h = r1
            r3.f13766i = r2
            int r0 = w0.q.g(r0)
            r3.f13767j = r0
            return
        L28:
            java.lang.Object r0 = r3.f13768k
            uf.c r0 = (uf.c) r0
            r3.c()
            int r1 = r3.f13766i
            r2 = -1
            if (r1 == r2) goto L44
            r0.c(r1)
            int r1 = r3.f13766i
            r3.f13765h = r1
            r3.f13766i = r2
            int r0 = uf.c.d(r0)
            r3.f13767j = r0
            goto L49
        L44:
            java.lang.String r0 = "Call next() or previous() before removing element from the iterator."
            j8.o.A(r0)
        L49:
            return
        L4a:
            java.lang.Object r0 = r3.f13768k
            uf.b r0 = (uf.b) r0
            r3.a()
            int r1 = r3.f13766i
            r2 = -1
            if (r1 == r2) goto L66
            r0.c(r1)
            int r1 = r3.f13766i
            r3.f13765h = r1
            r3.f13766i = r2
            int r0 = uf.b.d(r0)
            r3.f13767j = r0
            goto L6b
        L66:
            java.lang.String r0 = "Call next() or previous() before removing element from the iterator."
            j8.o.A(r0)
        L6b:
            return
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f13764g
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L28;
                case 2: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r3.<init>(r0)
            throw r3
        Ld:
            java.lang.Object r0 = r2.f13768k
            w0.p r0 = (w0.p) r0
            r2.d()
            int r1 = r2.f13766i
            if (r1 < 0) goto L22
            r0.set(r1, r3)
            int r3 = w0.q.g(r0)
            r2.f13767j = r3
            goto L27
        L22:
            java.lang.String r3 = "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()"
            j8.o.A(r3)
        L27:
            return
        L28:
            r2.c()
            int r0 = r2.f13766i
            r1 = -1
            if (r0 == r1) goto L38
            java.lang.Object r1 = r2.f13768k
            uf.c r1 = (uf.c) r1
            r1.set(r0, r3)
            goto L3d
        L38:
            java.lang.String r3 = "Call next() or previous() before replacing element from the iterator."
            j8.o.A(r3)
        L3d:
            return
        L3e:
            r2.a()
            int r0 = r2.f13766i
            r1 = -1
            if (r0 == r1) goto L4e
            java.lang.Object r1 = r2.f13768k
            uf.b r1 = (uf.b) r1
            r1.set(r0, r3)
            goto L53
        L4e:
            java.lang.String r3 = "Call next() or previous() before replacing element from the iterator."
            j8.o.A(r3)
        L53:
            return
    }
}
