package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class a62 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public java.lang.Object[] f78;

    /* JADX INFO: renamed from: ζ */
    public int f79;

    /* JADX INFO: renamed from: η */
    public int f80;

    public a62() {
            r1 = this;
            r1.<init>()
            z52 r0 = p000.z52.f12983
            java.lang.Object[] r0 = r0.f12987
            r1.f78 = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f80
            int r1 = r1.f79
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
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

    /* JADX INFO: renamed from: α */
    public final void m46(java.lang.Object[] r1, int r2, int r3) {
            r0 = this;
            r0.f78 = r1
            r0.f79 = r2
            r0.f80 = r3
            return
    }
}
