package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f90 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3828;

    /* JADX INFO: renamed from: ζ */
    public int f3829;

    /* JADX INFO: renamed from: η */
    public java.lang.Object f3830;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Object f3831;

    public f90(p000.c12 r2) {
            r1 = this;
            r0 = 4
            r1.f3828 = r0
            r1.<init>()
            r1.f3831 = r2
            ss1 r2 = r2.f1932
            java.util.Iterator r2 = r2.iterator()
            r1.f3830 = r2
            return
    }

    public f90(p000.C0188cu r2) {
            r1 = this;
            r0 = 0
            r1.f3828 = r0
            r1.<init>()
            r1.f3831 = r2
            r2 = -2
            r1.f3829 = r2
            return
    }

    public f90(p000.e21 r3) {
            r2 = this;
            r0 = 2
            r2.f3828 = r0
            r2.<init>()
            r2.f3831 = r3
            r0 = -1
            r2.f3829 = r0
            d21 r0 = new d21
            r1 = 0
            r0.<init>(r3, r2, r1)
            ts1 r3 = p000.e81.m1879(r0)
            r2.f3830 = r3
            return
    }

    public f90(java.lang.Object r2, java.util.Map r3) {
            r1 = this;
            r0 = 3
            r1.f3828 = r0
            r1.<init>()
            r1.f3830 = r2
            r1.f3831 = r3
            return
    }

    public f90(p000.y11 r3) {
            r2 = this;
            r0 = 1
            r2.f3828 = r0
            r2.<init>()
            r2.f3831 = r3
            r0 = -1
            r2.f3829 = r0
            x11 r0 = new x11
            r1 = 0
            r0.<init>(r3, r2, r1)
            ts1 r3 = p000.e81.m1879(r0)
            r2.f3830 = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r5 = this;
            int r0 = r5.f3828
            switch(r0) {
                case 0: goto L54;
                case 1: goto L4b;
                case 2: goto L42;
                case 3: goto L32;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f3831
            c12 r0 = (p000.c12) r0
            java.lang.Object r1 = r5.f3830
            java.util.Iterator r1 = (java.util.Iterator) r1
        Ld:
            int r2 = r5.f3829
            int r3 = r0.f1933
            r4 = 1
            if (r2 >= r3) goto L23
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            r1.next()
            int r2 = r5.f3829
            int r2 = r2 + r4
            r5.f3829 = r2
            goto Ld
        L23:
            int r5 = r5.f3829
            int r0 = r0.f1934
            if (r5 >= r0) goto L30
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L30
            goto L31
        L30:
            r4 = 0
        L31:
            return r4
        L32:
            int r0 = r5.f3829
            java.lang.Object r5 = r5.f3831
            java.util.Map r5 = (java.util.Map) r5
            int r5 = r5.size()
            if (r0 >= r5) goto L40
            r5 = 1
            goto L41
        L40:
            r5 = 0
        L41:
            return r5
        L42:
            java.lang.Object r5 = r5.f3830
            ts1 r5 = (p000.ts1) r5
            boolean r5 = r5.hasNext()
            return r5
        L4b:
            java.lang.Object r5 = r5.f3830
            ts1 r5 = (p000.ts1) r5
            boolean r5 = r5.hasNext()
            return r5
        L54:
            int r0 = r5.f3829
            if (r0 >= 0) goto L5b
            r5.m2072()
        L5b:
            int r5 = r5.f3829
            r0 = 1
            if (r5 != r0) goto L61
            goto L62
        L61:
            r0 = 0
        L62:
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f3828
            switch(r0) {
                case 0: goto L86;
                case 1: goto L7d;
                case 2: goto L74;
                case 3: goto L37;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f3831
            c12 r0 = (p000.c12) r0
            java.lang.Object r1 = r4.f3830
            java.util.Iterator r1 = (java.util.Iterator) r1
        Ld:
            int r2 = r4.f3829
            int r3 = r0.f1933
            if (r2 >= r3) goto L23
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            r1.next()
            int r2 = r4.f3829
            int r2 = r2 + 1
            r4.f3829 = r2
            goto Ld
        L23:
            int r2 = r4.f3829
            int r0 = r0.f1934
            if (r2 >= r0) goto L32
            int r2 = r2 + 1
            r4.f3829 = r2
            java.lang.Object r4 = r1.next()
            goto L36
        L32:
            p000.C1080.m7277()
            r4 = 0
        L36:
            return r4
        L37:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r4.f3830
            int r1 = r4.f3829
            int r1 = r1 + 1
            r4.f3829 = r1
            java.lang.Object r1 = r4.f3831
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L56
            is0 r1 = (p000.is0) r1
            java.lang.Object r1 = r1.f5177
            r4.f3830 = r1
            goto L73
        L56:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Hash code of an element ("
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ") has changed after it was added to the persistent set."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L6f:
            p000.C1080.m7277()
            r0 = 0
        L73:
            return r0
        L74:
            java.lang.Object r4 = r4.f3830
            ts1 r4 = (p000.ts1) r4
            java.lang.Object r4 = r4.next()
            return r4
        L7d:
            java.lang.Object r4 = r4.f3830
            ts1 r4 = (p000.ts1) r4
            java.lang.Object r4 = r4.next()
            return r4
        L86:
            int r0 = r4.f3829
            if (r0 >= 0) goto L8d
            r4.m2072()
        L8d:
            int r0 = r4.f3829
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r4.f3830
            r0.getClass()
            r1 = -1
            r4.f3829 = r1
            goto L9e
        L9a:
            p000.C1080.m7277()
            r0 = 0
        L9e:
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            int r0 = r3.f3828
            switch(r0) {
                case 0: goto L37;
                case 1: goto L26;
                case 2: goto L15;
                case 3: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r3.<init>(r0)
            throw r3
        Ld:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r3.<init>(r0)
            throw r3
        L15:
            int r0 = r3.f3829
            r1 = -1
            if (r0 == r1) goto L25
            java.lang.Object r2 = r3.f3831
            e21 r2 = (p000.e21) r2
            c21 r2 = r2.f3379
            r2.m1118(r0)
            r3.f3829 = r1
        L25:
            return
        L26:
            int r0 = r3.f3829
            r1 = -1
            if (r0 == r1) goto L36
            java.lang.Object r2 = r3.f3831
            y11 r2 = (p000.y11) r2
            w11 r2 = r2.f12426
            r2.m6306(r0)
            r3.f3829 = r1
        L36:
            return
        L37:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: α */
    public void m2072() {
            r3 = this;
            int r0 = r3.f3829
            java.lang.Object r1 = r3.f3831
            cu r1 = (p000.C0188cu) r1
            r2 = -2
            if (r0 != r2) goto L12
            java.lang.Object r0 = r1.f2750
            p70 r0 = (p000.p70) r0
            java.lang.Object r0 = r0.invoke()
            goto L1f
        L12:
            java.lang.Object r0 = r1.f2751
            a80 r0 = (p000.a80) r0
            java.lang.Object r1 = r3.f3830
            r1.getClass()
            java.lang.Object r0 = r0.invoke(r1)
        L1f:
            r3.f3830 = r0
            if (r0 != 0) goto L25
            r0 = 0
            goto L26
        L25:
            r0 = 1
        L26:
            r3.f3829 = r0
            return
    }
}
