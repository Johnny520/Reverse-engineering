package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f2838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Object f2839j;

    public i0(f.j0 r3) {
            r2 = this;
            r0 = 0
            r2.f2836g = r0
            r2.<init>()
            r2.f2839j = r3
            r0 = -1
            r2.f2837h = r0
            f.h0 r0 = new f.h0
            r1 = 0
            r0.<init>(r3, r2, r1)
            ng.k r3 = fb.v0.B(r0)
            r2.f2838i = r3
            return
    }

    public i0(f.n0 r3) {
            r2 = this;
            r0 = 1
            r2.f2836g = r0
            r2.<init>()
            r2.f2839j = r3
            r0 = -1
            r2.f2837h = r0
            f.m0 r0 = new f.m0
            r1 = 0
            r0.<init>(r3, r2, r1)
            ng.k r3 = fb.v0.B(r0)
            r2.f2838i = r3
            return
    }

    public i0(java.lang.Object r2, java.util.Map r3) {
            r1 = this;
            r0 = 4
            r1.f2836g = r0
            r1.<init>()
            r1.f2838i = r2
            r1.f2839j = r3
            return
    }

    public i0(ng.c r2) {
            r1 = this;
            r0 = 2
            r1.f2836g = r0
            r1.<init>()
            r1.f2839j = r2
            r2 = -2
            r1.f2837h = r2
            return
    }

    public i0(ng.r r2) {
            r1 = this;
            r0 = 3
            r1.f2836g = r0
            r1.<init>()
            r1.f2839j = r2
            ng.j r2 = r2.f9454a
            java.util.Iterator r2 = r2.iterator()
            r1.f2838i = r2
            return
    }

    public void a() {
            r3 = this;
            int r0 = r3.f2837h
            java.lang.Object r1 = r3.f2839j
            ng.c r1 = (ng.c) r1
            r2 = -2
            if (r0 != r2) goto L12
            java.lang.Object r0 = r1.f9429c
            fg.a r0 = (fg.a) r0
            java.lang.Object r0 = r0.invoke()
            goto L1d
        L12:
            fg.l r0 = r1.f9428b
            java.lang.Object r1 = r3.f2838i
            r1.getClass()
            java.lang.Object r0 = r0.invoke(r1)
        L1d:
            r3.f2838i = r0
            if (r0 != 0) goto L23
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            r3.f2837h = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r5 = this;
            int r0 = r5.f2836g
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L51;
                case 2: goto L42;
                case 3: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r5.f2837h
            java.lang.Object r1 = r5.f2839j
            java.util.Map r1 = (java.util.Map) r1
            int r1 = r1.size()
            if (r0 >= r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
        L15:
            java.lang.Object r0 = r5.f2839j
            ng.r r0 = (ng.r) r0
            java.lang.Object r1 = r5.f2838i
            java.util.Iterator r1 = (java.util.Iterator) r1
        L1d:
            int r2 = r5.f2837h
            int r3 = r0.f9455b
            r4 = 1
            if (r2 >= r3) goto L33
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            r1.next()
            int r2 = r5.f2837h
            int r2 = r2 + r4
            r5.f2837h = r2
            goto L1d
        L33:
            int r2 = r5.f2837h
            int r0 = r0.f9456c
            if (r2 >= r0) goto L40
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            goto L41
        L40:
            r4 = 0
        L41:
            return r4
        L42:
            int r0 = r5.f2837h
            if (r0 >= 0) goto L49
            r5.a()
        L49:
            int r0 = r5.f2837h
            r1 = 1
            if (r0 != r1) goto L4f
            goto L50
        L4f:
            r1 = 0
        L50:
            return r1
        L51:
            java.lang.Object r0 = r5.f2838i
            ng.k r0 = (ng.k) r0
            boolean r0 = r0.hasNext()
            return r0
        L5a:
            java.lang.Object r0 = r5.f2838i
            ng.k r0 = (ng.k) r0
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f2836g
            switch(r0) {
                case 0: goto L96;
                case 1: goto L8d;
                case 2: goto L74;
                case 3: goto L42;
                default: goto L5;
            }
        L5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r4.f2838i
            int r1 = r4.f2837h
            int r1 = r1 + 1
            r4.f2837h = r1
            java.lang.Object r1 = r4.f2839j
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L24
            q0.a r1 = (q0.a) r1
            java.lang.Object r1 = r1.f10566b
            r4.f2838i = r1
            goto L41
        L24:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Hash code of an element ("
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ") has changed after it was added to the persistent set."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L3d:
            bsh.j.e()
            r0 = 0
        L41:
            return r0
        L42:
            java.lang.Object r0 = r4.f2839j
            ng.r r0 = (ng.r) r0
            java.lang.Object r1 = r4.f2838i
            java.util.Iterator r1 = (java.util.Iterator) r1
        L4a:
            int r2 = r4.f2837h
            int r3 = r0.f9455b
            if (r2 >= r3) goto L60
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L60
            r1.next()
            int r2 = r4.f2837h
            int r2 = r2 + 1
            r4.f2837h = r2
            goto L4a
        L60:
            int r2 = r4.f2837h
            int r0 = r0.f9456c
            if (r2 >= r0) goto L6f
            int r2 = r2 + 1
            r4.f2837h = r2
            java.lang.Object r0 = r1.next()
            goto L73
        L6f:
            bsh.j.e()
            r0 = 0
        L73:
            return r0
        L74:
            int r0 = r4.f2837h
            if (r0 >= 0) goto L7b
            r4.a()
        L7b:
            int r0 = r4.f2837h
            if (r0 == 0) goto L88
            java.lang.Object r0 = r4.f2838i
            r0.getClass()
            r1 = -1
            r4.f2837h = r1
            goto L8c
        L88:
            bsh.j.e()
            r0 = 0
        L8c:
            return r0
        L8d:
            java.lang.Object r0 = r4.f2838i
            ng.k r0 = (ng.k) r0
            java.lang.Object r0 = r0.next()
            return r0
        L96:
            java.lang.Object r0 = r4.f2838i
            ng.k r0 = (ng.k) r0
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            int r0 = r3.f2836g
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L1d;
                case 2: goto L15;
                case 3: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        L15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        L1d:
            int r0 = r3.f2837h
            r1 = -1
            if (r0 == r1) goto L2d
            java.lang.Object r2 = r3.f2839j
            f.n0 r2 = (f.n0) r2
            f.l0 r2 = r2.f2875h
            r2.m(r0)
            r3.f2837h = r1
        L2d:
            return
        L2e:
            int r0 = r3.f2837h
            r1 = -1
            if (r0 == r1) goto L3e
            java.lang.Object r2 = r3.f2839j
            f.j0 r2 = (f.j0) r2
            f.g0 r2 = r2.f2842h
            r2.h(r0)
            r3.f2837h = r1
        L3e:
            return
    }
}
