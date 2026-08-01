package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ts1 implements java.util.Iterator, p000.InterfaceC0631op, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public int f10441;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f10442;

    /* JADX INFO: renamed from: η */
    public java.util.Iterator f10443;

    /* JADX INFO: renamed from: θ */
    public p000.InterfaceC0631op f10444;

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
        L0:
            int r0 = r4.f10441
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
            r4 = 0
            return r4
        L13:
            java.lang.RuntimeException r4 = r4.m5739()
            throw r4
        L18:
            return r3
        L19:
            java.util.Iterator r0 = r4.f10443
            r0.getClass()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r4.f10441 = r2
            return r3
        L27:
            r4.f10443 = r1
        L29:
            r0 = 5
            r4.f10441 = r0
            op r0 = r4.f10444
            r0.getClass()
            r4.f10444 = r1
            s62 r1 = p000.s62.f9751
            r0.mo75(r1)
            goto L0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f10441
            if (r0 == 0) goto L27
            r1 = 1
            if (r0 == r1) goto L27
            r2 = 2
            if (r0 == r2) goto L1b
            r1 = 3
            if (r0 != r1) goto L16
            r0 = 0
            r3.f10441 = r0
            java.lang.Object r0 = r3.f10442
            r1 = 0
            r3.f10442 = r1
            return r0
        L16:
            java.lang.RuntimeException r3 = r3.m5739()
            throw r3
        L1b:
            r3.f10441 = r1
            java.util.Iterator r3 = r3.f10443
            r3.getClass()
            java.lang.Object r3 = r3.next()
            return r3
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r3 = r3.next()
            return r3
        L32:
            p000.C1080.m7277()
            r3 = 0
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.RuntimeException m5739() {
            r3 = this;
            int r0 = r3.f10441
            r1 = 4
            if (r0 == r1) goto L26
            r1 = 5
            if (r0 == r1) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected state of the iterator: "
            r1.<init>(r2)
            int r3 = r3.f10441
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Iterator has failed."
            r3.<init>(r0)
            return r3
        L26:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final void m5740(p000.InterfaceC0631op r1, java.lang.Object r2) {
            r0 = this;
            r0.f10442 = r2
            r2 = 3
            r0.f10441 = r2
            r0.f10444 = r1
            r1.getClass()
            return
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            hz r0 = p000.C0377hz.f4846
            return r0
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r1) {
            r0 = this;
            p000.i81.m2649(r1)
            r1 = 4
            r0.f10441 = r1
            return
    }
}
