package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f8573h;

    public f0(java.util.Enumeration r2) {
            r1 = this;
            r0 = 2
            r1.f8572g = r0
            r1.<init>()
            r1.f8573h = r2
            return
    }

    public f0(m1.g0 r2) {
            r1 = this;
            r0 = 0
            r1.f8572g = r0
            r1.<init>()
            java.util.List r2 = r2.f8586p
            java.util.Iterator r2 = r2.iterator()
            r1.f8573h = r2
            return
    }

    public f0(s0.g r5) {
            r4 = this;
            r0 = 1
            r4.f8572g = r0
            r4.<init>()
            r0 = 8
            p0.k[] r1 = new p0.k[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L17
            p0.m r3 = new p0.m
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L17:
            p0.d r0 = new p0.d
            r0.<init>(r5, r1)
            r4.f8573h = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f8572g
            switch(r0) {
                case 0: goto L15;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f8573h
            java.util.Enumeration r0 = (java.util.Enumeration) r0
            boolean r0 = r0.hasMoreElements()
            return r0
        Le:
            java.lang.Object r0 = r1.f8573h
            p0.d r0 = (p0.d) r0
            boolean r0 = r0.f10054i
            return r0
        L15:
            java.lang.Object r0 = r1.f8573h
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            int r0 = r1.f8572g
            switch(r0) {
                case 0: goto L19;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f8573h
            java.util.Enumeration r0 = (java.util.Enumeration) r0
            java.lang.Object r0 = r0.nextElement()
            return r0
        Le:
            java.lang.Object r0 = r1.f8573h
            p0.d r0 = (p0.d) r0
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
        L19:
            java.lang.Object r0 = r1.f8573h
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r0.next()
            m1.i0 r0 = (m1.i0) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f8572g
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.Object r0 = r2.f8573h
            p0.d r0 = (p0.d) r0
            r0.remove()
            return
        L15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
