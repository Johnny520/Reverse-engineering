package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Iterator f2027g;

    public j(java.util.Iterator r1) {
            r0 = this;
            r0.<init>()
            r0.f2027g = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.f2027g
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            java.util.Iterator r0 = r1.f2027g
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.util.Iterator r0 = r1.f2027g
            r0.remove()
            return
    }
}
