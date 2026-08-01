package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j21 implements java.util.ListIterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f5299;

    /* JADX INFO: renamed from: ζ */
    public int f5300;

    public j21(int r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f5299 = r2
            r0.f5300 = r1
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.f5299
            int r1 = r2.f5300
            r0.add(r1, r3)
            int r3 = r2.f5300
            int r3 = r3 + 1
            r2.f5300 = r3
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f5300
            java.lang.Object r1 = r1.f5299
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            int r0 = r0.f5300
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            int r0 = r2.f5300
            int r1 = r0 + 1
            r2.f5300 = r1
            java.lang.Object r2 = r2.f5299
            java.lang.Object r2 = r2.get(r0)
            return r2
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            int r0 = r0.f5300
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            int r0 = r1.f5300
            int r0 = r0 + (-1)
            r1.f5300 = r0
            java.lang.Object r1 = r1.f5299
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            int r0 = r0.f5300
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r1 = this;
            int r0 = r1.f5300
            int r0 = r0 + (-1)
            r1.f5300 = r0
            java.lang.Object r1 = r1.f5299
            r1.remove(r0)
            return
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f5299
            int r1 = r1.f5300
            r0.set(r1, r2)
            return
    }
}
