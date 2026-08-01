package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class av0 implements java.util.Collection, p000.lo0 {

    /* JADX INFO: renamed from: η */
    public static final p000.av0 f1319 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f1320;

    /* JADX INFO: renamed from: ζ */
    public final int f1321;

    static {
            av0 r0 = new av0
            jz r1 = p000.C0450jz.f5672
            r0.<init>(r1)
            p000.av0.f1319 = r0
            return
    }

    public av0(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.f1320 = r1
            int r1 = r1.size()
            r0.f1321 = r1
            return
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.zu0
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            zu0 r2 = (p000.zu0) r2
            java.lang.Object r1 = r1.f1320
            boolean r1 = r1.contains(r2)
            return r1
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            java.lang.Object r0 = r0.f1320
            boolean r0 = r0.containsAll(r1)
            return r0
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof p000.av0
            if (r0 != 0) goto L8
            goto L14
        L8:
            av0 r2 = (p000.av0) r2
            java.lang.Object r2 = r2.f1320
            java.lang.Object r1 = r1.f1320
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    @Override // java.util.Collection
    public final int hashCode() {
            r0 = this;
            java.lang.Object r0 = r0.f1320
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            java.lang.Object r0 = r0.f1320
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.lang.Object r0 = r0.f1320
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final int size() {
            r0 = this;
            int r0 = r0.f1321
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5320(r0)
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5321(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LocaleList(localeList="
            r0.<init>(r1)
            java.lang.Object r2 = r2.f1320
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
