package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ws1 extends p000.AbstractC1077 implements java.io.Serializable {

    /* JADX INFO: renamed from: ζ */
    public static final p000.ws1 f11852 = null;

    /* JADX INFO: renamed from: ε */
    public final p000.zw0 f11853;

    static {
            ws1 r0 = new ws1
            zw0 r1 = p000.zw0.f13327
            r0.<init>(r1)
            p000.ws1.f11852 = r0
            return
    }

    public ws1() {
            r1 = this;
            zw0 r0 = new zw0
            r0.<init>()
            r1.<init>()
            r1.f11853 = r0
            return
    }

    public ws1(p000.zw0 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f11853 = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            zw0 r0 = r0.f11853
            int r0 = r0.m7240(r1)
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
            r2.getClass()
            zw0 r0 = r1.f11853
            r0.m7242()
            boolean r1 = super.addAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r0 = this;
            zw0 r0 = r0.f11853
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            zw0 r0 = r0.f11853
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r0 = this;
            zw0 r0 = r0.f11853
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            zw0 r2 = r2.f11853
            r2.getClass()
            ww0 r0 = new ww0
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            zw0 r0 = r0.f11853
            r0.m7242()
            int r1 = r0.m7246(r1)
            if (r1 >= 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0.m7250(r1)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            zw0 r0 = r1.f11853
            r0.m7242()
            boolean r1 = super.removeAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            zw0 r0 = r1.f11853
            r0.m7242()
            boolean r1 = super.retainAll(r2)
            return r1
    }

    @Override // p000.AbstractC1077
    /* JADX INFO: renamed from: α */
    public final int mo618() {
            r0 = this;
            zw0 r0 = r0.f11853
            int r0 = r0.f13336
            return r0
    }
}
