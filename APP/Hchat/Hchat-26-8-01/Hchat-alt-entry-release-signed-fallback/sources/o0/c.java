package o0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends tf.f {
    public abstract o0.c a(int r1, java.lang.Object r2);

    public abstract o0.c c(java.lang.Object r1);

    @Override // tf.a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // tf.a, java.util.Collection, java.util.List
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L11
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L15
            r3 = 0
            return r3
        L27:
            return r1
    }

    public o0.c d(java.util.Collection r2) {
            r1 = this;
            o0.f r0 = r1.e()
            r0.addAll(r2)
            o0.c r2 = r0.d()
            return r2
    }

    public abstract o0.f e();

    public abstract o0.c f(o0.b r1);

    public abstract o0.c g(int r1);

    public abstract o0.c h(int r1, java.lang.Object r2);

    @Override // tf.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // tf.f, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // tf.f, java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            n0.a r0 = new n0.a
            r0.<init>(r1, r2, r3)
            return r0
    }
}
