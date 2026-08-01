package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ko1 implements java.util.ListIterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6060;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f6061;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f6062;

    public ko1(p000.gx0 r4, int r5) {
            r3 = this;
            r0 = 0
            r3.f6060 = r0
            r3.<init>()
            r3.f6062 = r4
            java.lang.Object r0 = r4.f4501
            java.util.List r0 = (java.util.List) r0
            if (r5 < 0) goto L20
            int r1 = r4.mo2340()
            if (r5 > r1) goto L20
            int r4 = r4.mo2340()
            int r4 = r4 - r5
            java.util.ListIterator r4 = r0.listIterator(r4)
            r3.f6061 = r4
            return
        L20:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Position index "
            java.lang.String r1 = " must be in range ["
            java.lang.StringBuilder r5 = p000.a12.m19(r5, r0, r1)
            xm0 r0 = new xm0
            int r4 = r4.mo2340()
            r1 = 1
            r2 = 0
            r0.<init>(r2, r4, r1)
            r5.append(r0)
            java.lang.String r4 = "]."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    public ko1(p000.sm1 r2, p000.z02 r3) {
            r1 = this;
            r0 = 1
            r1.f6060 = r0
            r1.<init>()
            r1.f6061 = r2
            r1.f6062 = r3
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f6060
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot modify a state list through an iterator"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f6060
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f6061
            sm1 r0 = (p000.sm1) r0
            int r0 = r0.f9967
            java.lang.Object r2 = r2.f6062
            z02 r2 = (p000.z02) r2
            int r2 = r2.f12923
            r1 = 1
            int r2 = r2 - r1
            if (r0 >= r2) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
        L18:
            java.lang.Object r2 = r2.f6061
            java.util.ListIterator r2 = (java.util.ListIterator) r2
            boolean r2 = r2.hasPrevious()
            return r2
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f6060
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f6061
            sm1 r1 = (p000.sm1) r1
            int r1 = r1.f9967
            if (r1 < 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
        L11:
            java.lang.Object r1 = r1.f6061
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            boolean r1 = r1.hasNext()
            return r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f6060
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f6061
            sm1 r0 = (p000.sm1) r0
            int r1 = r0.f9967
            int r1 = r1 + 1
            java.lang.Object r3 = r3.f6062
            z02 r3 = (p000.z02) r3
            int r2 = r3.f12923
            p000.AbstractC0073bd.m870(r1, r2)
            r0.f9967 = r1
            java.lang.Object r3 = r3.get(r1)
            return r3
        L1d:
            java.lang.Object r3 = r3.f6061
            java.util.ListIterator r3 = (java.util.ListIterator) r3
            java.lang.Object r3 = r3.previous()
            return r3
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f6060
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f6061
            sm1 r1 = (p000.sm1) r1
            int r1 = r1.f9967
            int r1 = r1 + 1
            return r1
        Le:
            java.lang.Object r0 = r1.f6062
            gx0 r0 = (p000.gx0) r0
            java.lang.Object r1 = r1.f6061
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            int r1 = r1.previousIndex()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            int r0 = r3.f6060
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f6061
            sm1 r0 = (p000.sm1) r0
            int r1 = r0.f9967
            java.lang.Object r3 = r3.f6062
            z02 r3 = (p000.z02) r3
            int r2 = r3.f12923
            p000.AbstractC0073bd.m870(r1, r2)
            int r2 = r1 + (-1)
            r0.f9967 = r2
            java.lang.Object r3 = r3.get(r1)
            return r3
        L1d:
            java.lang.Object r3 = r3.f6061
            java.util.ListIterator r3 = (java.util.ListIterator) r3
            java.lang.Object r3 = r3.next()
            return r3
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f6060
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f6061
            sm1 r1 = (p000.sm1) r1
            int r1 = r1.f9967
            return r1
        Lc:
            java.lang.Object r0 = r1.f6062
            gx0 r0 = (p000.gx0) r0
            java.lang.Object r1 = r1.f6061
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            int r1 = r1.nextIndex()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r1 = this;
            int r1 = r1.f6060
            switch(r1) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot modify a state list through an iterator"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f6060
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot modify a state list through an iterator"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
