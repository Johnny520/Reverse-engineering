package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.ia1 f5826;

    public ka1(p000.fa1 r5) {
            r4 = this;
            r4.<init>()
            r0 = 8
            a62[] r1 = new p000.a62[r0]
            r2 = 0
        L8:
            if (r2 >= r0) goto L14
            c62 r3 = new c62
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L14:
            ia1 r0 = new ia1
            r0.<init>(r5, r1)
            r4.f5826 = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            ia1 r0 = r0.f5826
            boolean r0 = r0.f4670
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r0 = this;
            ia1 r0 = r0.f5826
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r0 = this;
            ia1 r0 = r0.f5826
            r0.remove()
            return
    }
}
