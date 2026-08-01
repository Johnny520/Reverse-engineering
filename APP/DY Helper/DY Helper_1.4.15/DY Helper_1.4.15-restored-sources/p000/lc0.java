package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lc0 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.ow1 f6540;

    /* JADX INFO: renamed from: ζ */
    public final int f6541;

    /* JADX INFO: renamed from: η */
    public int f6542;

    /* JADX INFO: renamed from: θ */
    public final int f6543;

    public lc0(p000.ow1 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f6540 = r1
            r0.f6541 = r3
            r0.f6542 = r2
            int r2 = r1.f8293
            r0.f6543 = r2
            boolean r0 = r1.f8292
            if (r0 == 0) goto L14
            p000.qw1.m4950()
        L14:
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f6542
            int r1 = r1.f6541
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r5 = this;
            ow1 r0 = r5.f6540
            int r1 = r0.f8293
            int r2 = r5.f6543
            if (r1 == r2) goto Lb
            p000.qw1.m4950()
        Lb:
            int r1 = r5.f6542
            int[] r3 = r0.f8286
            int r4 = r1 * 5
            int r4 = r4 + 3
            r3 = r3[r4]
            int r3 = r3 + r1
            r5.f6542 = r3
            pw1 r5 = new pw1
            r5.<init>(r0, r1, r2)
            return r5
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
