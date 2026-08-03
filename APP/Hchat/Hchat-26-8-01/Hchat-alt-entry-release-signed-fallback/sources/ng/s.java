package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Iterator f9457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ng.t f9458h;

    public s(ng.t r1) {
            r0 = this;
            r0.<init>()
            r0.f9458h = r1
            ng.j r1 = r1.f9459a
            java.util.Iterator r1 = r1.iterator()
            r0.f9457g = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.f9457g
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            ng.t r0 = r2.f9458h
            fg.l r0 = r0.f9460b
            java.util.Iterator r1 = r2.f9457g
            java.lang.Object r1 = r1.next()
            java.lang.Object r0 = r0.invoke(r1)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
