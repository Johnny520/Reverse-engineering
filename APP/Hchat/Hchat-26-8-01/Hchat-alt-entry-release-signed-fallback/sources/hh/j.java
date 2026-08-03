package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends hh.e {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof hh.i
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            hh.i r2 = (hh.i) r2
            boolean r2 = super.contains(r2)
            return r2
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof hh.i
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            hh.i r2 = (hh.i) r2
            int r2 = super.indexOf(r2)
            return r2
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof hh.i
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            hh.i r2 = (hh.i) r2
            int r2 = super.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof hh.i
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            hh.i r2 = (hh.i) r2
            boolean r2 = super.remove(r2)
            return r2
    }
}
