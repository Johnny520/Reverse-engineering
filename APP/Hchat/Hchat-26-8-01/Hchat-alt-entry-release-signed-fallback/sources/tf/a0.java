package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends tf.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f13137g;

    public a0(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            r0.f13137g = r1
            return
    }

    @Override // tf.g
    public final int a() {
            r1 = this;
            java.util.ArrayList r0 = r1.f13137g
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.f13137g
            int r2 = tf.m.l1(r2, r1)
            r0.add(r2, r3)
            return
    }

    @Override // tf.g
    public final java.lang.Object c(int r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f13137g
            int r2 = tf.m.k1(r2, r1)
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r1 = this;
            java.util.ArrayList r0 = r1.f13137g
            r0.clear()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f13137g
            int r2 = tf.m.k1(r2, r1)
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r2 = this;
            tf.z r0 = new tf.z
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r2 = this;
            tf.z r0 = new tf.z
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            tf.z r0 = new tf.z
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.f13137g
            int r2 = tf.m.k1(r2, r1)
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }
}
