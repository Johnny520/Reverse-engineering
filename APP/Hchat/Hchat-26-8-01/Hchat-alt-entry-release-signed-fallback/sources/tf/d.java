package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends gg.b implements java.util.ListIterator {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tf.f f13147j;

    public d(tf.f r2, int r3) {
            r1 = this;
            r1.f13147j = r2
            r1.<init>(r2)
            tf.c r0 = tf.f.Companion
            int r2 = r2.size()
            r0.getClass()
            tf.c.b(r3, r2)
            r1.f4545h = r3
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f4545h
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f4545h
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r2 = this;
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L13
            int r0 = r2.f4545h
            int r0 = r0 + (-1)
            r2.f4545h = r0
            tf.f r1 = r2.f13147j
            java.lang.Object r0 = r1.get(r0)
            return r0
        L13:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f4545h
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }
}
