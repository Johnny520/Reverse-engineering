package p000;

/* JADX INFO: renamed from: kz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0493kz implements java.util.Map, java.io.Serializable, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public static final p000.C0493kz f6332 = null;

    static {
            kz r0 = new kz
            r0.<init>()
            p000.C0493kz.f6332 = r0
            return
    }

    @Override // java.util.Map
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
            r0 = this;
            nz r0 = p000.C0604nz.f7825
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto Le
            java.util.Map r1 = (java.util.Map) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final int hashCode() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
            r0 = this;
            nz r0 = p000.C0604nz.f7825
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "{}"
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
            r0 = this;
            jz r0 = p000.C0450jz.f5672
            return r0
    }
}
