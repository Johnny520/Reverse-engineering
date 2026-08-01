package defpackage;

/* JADX INFO: renamed from: ᛸᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1593 extends defpackage.AbstractC1986 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C1593 f7042 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0665 f7043;

    static {
            ᛸᲇᲈᲀ r0 = new ᛸᲇᲈᲀ
            ᛴᛴᲁᲇ r1 = defpackage.C0665.f3220
            ᛴᛴᲁᲇ r1 = defpackage.C0665.f3220
            r0.<init>(r1)
            defpackage.C1593.f7042 = r0
            return
    }

    public C1593() {
            r1 = this;
            ᛴᛴᲁᲇ r0 = new ᛴᛴᲁᲇ
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public C1593(defpackage.C0665 r1) {
            r0 = this;
            r0.<init>()
            r0.f7043 = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            ᛴᛴᲁᲇ r0 = r0.f7043
            int r0 = r0.m1499(r1)
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
            ᛴᛴᲁᲇ r0 = r1.f7043
            r0.m1500()
            boolean r1 = super.addAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r0 = this;
            ᛴᛴᲁᲇ r0 = r0.f7043
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            ᛴᛴᲁᲇ r0 = r0.f7043
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r0 = this;
            ᛴᛴᲁᲇ r0 = r0.f7043
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            ᛴᛴᲁᲇ r2 = r2.f7043
            r2.getClass()
            ᲇᛲᛱᛵ r0 = new ᲇᛲᛱᛵ
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            ᛴᛴᲁᲇ r0 = r0.f7043
            r0.m1500()
            int r1 = r0.m1496(r1)
            if (r1 >= 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0.m1495(r1)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            ᛴᛴᲁᲇ r0 = r1.f7043
            r0.m1500()
            boolean r1 = super.removeAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            ᛴᛴᲁᲇ r0 = r1.f7043
            r0.m1500()
            boolean r1 = super.retainAll(r2)
            return r1
    }

    @Override // defpackage.AbstractC1986
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final int mo2011() {
            r0 = this;
            ᛴᛴᲁᲇ r0 = r0.f7043
            int r0 = r0.f3222
            return r0
    }
}
