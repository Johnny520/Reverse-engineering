package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛴᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1136 extends xhss.AbstractC0703 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0303
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            xhss.ᛳᛸᛸᛵ r2 = (xhss.C0303) r2
            boolean r1 = super.contains(r2)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0303
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            xhss.ᛳᛸᛸᛵ r2 = (xhss.C0303) r2
            int r1 = super.indexOf(r2)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0303
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            xhss.ᛳᛸᛸᛵ r2 = (xhss.C0303) r2
            int r1 = super.lastIndexOf(r2)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0303
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            xhss.ᛳᛸᛸᛵ r2 = (xhss.C0303) r2
            boolean r1 = super.remove(r2)
            return r1
    }
}
