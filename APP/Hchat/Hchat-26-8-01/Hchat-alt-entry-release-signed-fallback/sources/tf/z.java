package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements java.util.ListIterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f13173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13174i;

    public z(gg.s r2, w0.x r3) {
            r1 = this;
            r0 = 2
            r1.f13172g = r0
            r1.<init>()
            r1.f13173h = r2
            r1.f13174i = r3
            return
    }

    public z(og.g r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f13172g = r0
            r1.<init>()
            r1.f13174i = r2
            java.lang.Object r0 = r2.f9825h
            java.util.List r0 = (java.util.List) r0
            int r2 = tf.m.l1(r3, r2)
            java.util.ListIterator r2 = r0.listIterator(r2)
            r1.f13173h = r2
            return
    }

    public z(tf.a0 r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f13172g = r0
            r1.<init>()
            r1.f13174i = r2
            java.util.ArrayList r0 = r2.f13137g
            int r2 = tf.m.l1(r3, r2)
            java.util.ListIterator r2 = r0.listIterator(r2)
            r1.f13173h = r2
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f13172g
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot modify a state list through an iterator"
            r2.<init>(r0)
            throw r2
        Ld:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L15:
            java.lang.Object r0 = r1.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            r0.add(r2)
            r0.previous()
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.f13172g
            switch(r0) {
                case 0: goto L21;
                case 1: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f13173h
            gg.s r0 = (gg.s) r0
            int r0 = r0.f4562g
            java.lang.Object r1 = r3.f13174i
            w0.x r1 = (w0.x) r1
            int r1 = r1.f14829j
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
        L18:
            java.lang.Object r0 = r3.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r0 = r0.hasPrevious()
            return r0
        L21:
            java.lang.Object r0 = r3.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f13172g
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f13173h
            gg.s r0 = (gg.s) r0
            int r0 = r0.f4562g
            if (r0 < 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
        L11:
            java.lang.Object r0 = r1.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r0 = r0.hasNext()
            return r0
        L1a:
            java.lang.Object r0 = r1.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f13172g
            switch(r0) {
                case 0: goto L26;
                case 1: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f13173h
            gg.s r0 = (gg.s) r0
            int r1 = r0.f4562g
            int r1 = r1 + 1
            java.lang.Object r2 = r4.f13174i
            w0.x r2 = (w0.x) r2
            int r3 = r2.f14829j
            w0.q.a(r1, r3)
            r0.f4562g = r1
            java.lang.Object r0 = r2.get(r1)
            return r0
        L1d:
            java.lang.Object r0 = r4.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            java.lang.Object r0 = r0.previous()
            return r0
        L26:
            java.lang.Object r0 = r4.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            java.lang.Object r0 = r0.previous()
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r2 = this;
            int r0 = r2.f13172g
            switch(r0) {
                case 0: goto L22;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f13173h
            gg.s r0 = (gg.s) r0
            int r0 = r0.f4562g
            int r0 = r0 + 1
            return r0
        Le:
            java.lang.Object r0 = r2.f13174i
            og.g r0 = (og.g) r0
            java.lang.Object r1 = r2.f13173h
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            int r1 = r1.previousIndex()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 - r1
            return r0
        L22:
            java.lang.Object r0 = r2.f13174i
            tf.a0 r0 = (tf.a0) r0
            java.lang.Object r1 = r2.f13173h
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            int r1 = r1.previousIndex()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r4 = this;
            int r0 = r4.f13172g
            switch(r0) {
                case 0: goto L26;
                case 1: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f13173h
            gg.s r0 = (gg.s) r0
            int r1 = r0.f4562g
            java.lang.Object r2 = r4.f13174i
            w0.x r2 = (w0.x) r2
            int r3 = r2.f14829j
            w0.q.a(r1, r3)
            int r3 = r1 + (-1)
            r0.f4562g = r3
            java.lang.Object r0 = r2.get(r1)
            return r0
        L1d:
            java.lang.Object r0 = r4.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            java.lang.Object r0 = r0.next()
            return r0
        L26:
            java.lang.Object r0 = r4.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r2 = this;
            int r0 = r2.f13172g
            switch(r0) {
                case 0: goto L20;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f13173h
            gg.s r0 = (gg.s) r0
            int r0 = r0.f4562g
            return r0
        Lc:
            java.lang.Object r0 = r2.f13174i
            og.g r0 = (og.g) r0
            java.lang.Object r1 = r2.f13173h
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            int r1 = r1.nextIndex()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 - r1
            return r0
        L20:
            java.lang.Object r0 = r2.f13174i
            tf.a0 r0 = (tf.a0) r0
            java.lang.Object r1 = r2.f13173h
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            int r1 = r1.nextIndex()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f13172g
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot modify a state list through an iterator"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        L15:
            java.lang.Object r0 = r2.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            r0.remove()
            return
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f13172g
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot modify a state list through an iterator"
            r2.<init>(r0)
            throw r2
        Ld:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L15:
            java.lang.Object r0 = r1.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            r0.set(r2)
            return
    }
}
