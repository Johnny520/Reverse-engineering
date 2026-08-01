package p000;

/* JADX INFO: renamed from: ψ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1100 implements java.util.ListIterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public int f13424;

    /* JADX INFO: renamed from: ζ */
    public int f13425;

    public AbstractC1100(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f13424 = r1
            r0.f13425 = r2
            return
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f13424
            int r1 = r1.f13425
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            int r0 = r0.f13424
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            int r0 = r0.f13424
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            int r0 = r0.f13424
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
