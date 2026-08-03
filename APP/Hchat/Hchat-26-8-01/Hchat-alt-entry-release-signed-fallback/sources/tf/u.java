package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements java.util.Map, java.io.Serializable, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tf.u f13168g = null;

    static {
            tf.u r0 = new tf.u
            r0.<init>()
            tf.u.f13168g = r0
            return
    }

    @Override // java.util.Map
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
            r1 = this;
            tf.v r0 = tf.v.f13169g
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Le
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
            r1 = this;
            tf.v r0 = tf.v.f13169g
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "{}"
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
            r1 = this;
            tf.t r0 = tf.t.f13167g
            return r0
    }
}
