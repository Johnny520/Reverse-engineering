package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends tf.a implements java.util.List {
    public static final tf.c Companion = null;
    private static final int maxArraySize = 2147483639;

    static {
            tf.c r0 = new tf.c
            r0.<init>()
            tf.f.Companion = r0
            return
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.List
    public void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    public boolean addAll(int r1, java.util.Collection<java.lang.Object> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tf.c r1 = tf.f.Companion
            java.util.Collection r6 = (java.util.Collection) r6
            r1.getClass()
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L1c
            goto L38
        L1c:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r1 = r5.iterator()
        L24:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()
            java.lang.Object r4 = r6.next()
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L24
        L38:
            return r2
        L39:
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r3 = this;
            tf.c r0 = tf.f.Companion
            r0.getClass()
            java.util.Iterator r0 = r3.iterator()
            r1 = 1
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r0.next()
            int r1 = r1 * 31
            if (r2 == 0) goto L1d
            int r2 = r2.hashCode()
            goto L1e
        L1d:
            r2 = 0
        L1e:
            int r1 = r1 + r2
            goto La
        L20:
            return r1
    }

    public int indexOf(java.lang.Object r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r4 = -1
            return r4
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.Object> iterator() {
            r1 = this;
            gg.b r0 = new gg.b
            r0.<init>(r1)
            return r0
    }

    public int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L8:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.previous()
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L8
            int r3 = r0.nextIndex()
            return r3
        L1d:
            r3 = -1
            return r3
    }

    public java.util.ListIterator<java.lang.Object> listIterator() {
            r2 = this;
            tf.d r0 = new tf.d
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.util.ListIterator<java.lang.Object> listIterator(int r2) {
            r1 = this;
            tf.d r0 = new tf.d
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public java.lang.Object remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    public java.util.List<java.lang.Object> subList(int r2, int r3) {
            r1 = this;
            tf.e r0 = new tf.e
            r0.<init>(r1, r2, r3)
            return r0
    }
}
