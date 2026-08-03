package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class b implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f4546i;

    public b(tf.f r2) {
            r1 = this;
            r0 = 1
            r1.f4544g = r0
            r1.<init>()
            r1.f4546i = r2
            return
    }

    public b(java.lang.Object[] r2) {
            r1 = this;
            r0 = 0
            r1.f4544g = r0
            r2.getClass()
            r1.<init>()
            r1.f4546i = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f4544g
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r2.f4545h
            java.lang.Object r1 = r2.f4546i
            tf.f r1 = (tf.f) r1
            int r1 = r1.size()
            if (r0 >= r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
        L15:
            int r0 = r2.f4545h
            java.lang.Object r1 = r2.f4546i
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = r1.length
            if (r0 >= r1) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f4544g
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r3.f4546i
            tf.f r0 = (tf.f) r0
            int r1 = r3.f4545h
            int r2 = r1 + 1
            r3.f4545h = r2
            java.lang.Object r0 = r0.get(r1)
            goto L1e
        L1a:
            bsh.j.e()
            r0 = 0
        L1e:
            return r0
        L1f:
            java.lang.Object r0 = r3.f4546i     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            int r1 = r3.f4545h     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            int r2 = r1 + 1
            r3.f4545h = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            goto L3b
        L2c:
            r0 = move-exception
            int r1 = r3.f4545h
            int r1 = r1 + (-1)
            r3.f4545h = r1
            java.lang.String r0 = r0.getMessage()
            j8.o.l(r0)
            r0 = 0
        L3b:
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f4544g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
