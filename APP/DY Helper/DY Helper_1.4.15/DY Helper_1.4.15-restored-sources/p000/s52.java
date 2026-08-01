package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class s52 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final java.util.Iterator f9741;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.t52 f9742;

    public s52(p000.t52 r1) {
            r0 = this;
            r0.<init>()
            r0.f9742 = r1
            ss1 r1 = r1.f10207
            java.util.Iterator r1 = r1.iterator()
            r0.f9741 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            java.util.Iterator r0 = r0.f9741
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            t52 r0 = r1.f9742
            a80 r0 = r0.f10208
            java.util.Iterator r1 = r1.f9741
            java.lang.Object r1 = r1.next()
            java.lang.Object r1 = r0.invoke(r1)
            return r1
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
