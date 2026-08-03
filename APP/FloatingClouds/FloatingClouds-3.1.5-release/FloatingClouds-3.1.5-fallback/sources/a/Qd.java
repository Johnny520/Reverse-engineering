package a;

/* JADX INFO: loaded from: classes.dex */
public final class Qd<T> extends a.Rd<T> implements java.util.Iterator<T>, a.InterfaceC0042a4<a.Wf>, a.InterfaceC0336q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f232a;
    public T b;
    public java.util.Iterator<? extends T> c;
    public a.InterfaceC0042a4<? super a.Wf> d;

    @Override // a.Rd
    public final void a(java.lang.Object r1, a.Cg r2) {
            r0 = this;
            r0.b = r1
            r1 = 3
            r0.f232a = r1
            r0.d = r2
            return
    }

    @Override // a.Rd
    public final java.lang.Object b(java.util.Iterator r2, a.Cg r3) {
            r1 = this;
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L9
            a.Wf r2 = a.Wf.f330a
            return r2
        L9:
            r1.c = r2
            r2 = 2
            r1.f232a = r2
            r1.d = r3
            a.y4 r2 = a.EnumC0474y4.f767a
            return r2
    }

    @Override // a.InterfaceC0042a4
    public final a.InterfaceC0456x4 c() {
            r1 = this;
            a.W5 r0 = a.W5.f320a
            return r0
    }

    @Override // a.InterfaceC0042a4
    public final void d(java.lang.Object r1) {
            r0 = this;
            a.C0465xd.b(r1)
            r1 = 4
            r0.f232a = r1
            return
    }

    public final java.lang.RuntimeException e() {
            r3 = this;
            int r0 = r3.f232a
            r1 = 4
            if (r0 == r1) goto L26
            r1 = 5
            if (r0 == r1) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected state of the iterator: "
            r1.<init>(r2)
            int r2 = r3.f232a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Iterator has failed."
            r0.<init>(r1)
            return r0
        L26:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
        L0:
            int r0 = r4.f232a
            r1 = 0
            if (r0 == 0) goto L29
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L19
            if (r0 == r2) goto L18
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 != r1) goto L13
            r0 = 0
            return r0
        L13:
            java.lang.RuntimeException r0 = r4.e()
            throw r0
        L18:
            return r3
        L19:
            java.util.Iterator<? extends T> r0 = r4.c
            a.C0193i9.b(r0)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r4.f232a = r2
            return r3
        L27:
            r4.c = r1
        L29:
            r0 = 5
            r4.f232a = r0
            a.a4<? super a.Wf> r0 = r4.d
            a.C0193i9.b(r0)
            r4.d = r1
            a.Wf r1 = a.Wf.f330a
            r0.d(r1)
            goto L0
    }

    @Override // java.util.Iterator
    public final T next() {
            r3 = this;
            int r0 = r3.f232a
            if (r0 == 0) goto L27
            r1 = 1
            if (r0 == r1) goto L27
            r2 = 2
            if (r0 == r2) goto L1b
            r1 = 3
            if (r0 != r1) goto L16
            r0 = 0
            r3.f232a = r0
            T r0 = r3.b
            r1 = 0
            r3.b = r1
            return r0
        L16:
            java.lang.RuntimeException r0 = r3.e()
            throw r0
        L1b:
            r3.f232a = r1
            java.util.Iterator<? extends T> r0 = r3.c
            a.C0193i9.b(r0)
            java.lang.Object r0 = r0.next()
            return r0
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            return r0
        L32:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
