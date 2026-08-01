package p000;

/* JADX INFO: renamed from: iz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0412iz implements java.util.ListIterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public static final p000.C0412iz f5249 = null;

    static {
            iz r0 = new iz
            r0.<init>()
            p000.C0412iz.f5249 = r0
            return
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r0 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r0 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            r0 = -1
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
