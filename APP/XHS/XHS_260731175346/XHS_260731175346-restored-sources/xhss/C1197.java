package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲇᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1197 extends xhss.AbstractC1063 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C1197 f3853 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0686 f3854;

    static {
            xhss.ᲈᲇᲁᛲ r0 = new xhss.ᲈᲇᲁᛲ
            xhss.ᛷᛸᛵᛶ r1 = xhss.C0686.f2319
            xhss.ᛷᛸᛵᛶ r1 = xhss.C0686.f2319
            r0.<init>(r1)
            xhss.C1197.f3853 = r0
            return
    }

    public C1197(xhss.C0686 r1) {
            r0 = this;
            r0.<init>()
            r0.f3854 = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3854
            int r0 = r0.m1167(r1)
            if (r0 < 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            xhss.ᛷᛸᛵᛶ r0 = r1.f3854
            r0.m1164()
            boolean r1 = super.addAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3854
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3854
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3854
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            xhss.ᛷᛸᛵᛶ r2 = r2.f3854
            r2.getClass()
            xhss.ᲈᛴᲈᛵ r0 = new xhss.ᲈᛴᲈᛵ
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3854
            r0.m1164()
            int r1 = r0.m1166(r1)
            if (r1 >= 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0.m1168(r1)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            xhss.ᛷᛸᛵᛶ r0 = r1.f3854
            r0.m1164()
            boolean r1 = super.removeAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            xhss.ᛷᛸᛵᛶ r0 = r1.f3854
            r0.m1164()
            boolean r1 = super.retainAll(r2)
            return r1
    }

    @Override // xhss.AbstractC1063
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final int mo1675() {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3854
            int r0 = r0.f2327
            return r0
    }
}
