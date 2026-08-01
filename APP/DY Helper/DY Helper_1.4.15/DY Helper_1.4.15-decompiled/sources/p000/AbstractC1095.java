package p000;

/* JADX INFO: renamed from: σ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1095 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public int f13415;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f13416;

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.f13415
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L14
            if (r0 == r2) goto L13
            r3 = 2
            if (r0 != r3) goto Lc
            return r1
        Lc:
            java.lang.String r3 = "hasNext called when the iterator is in the FAILED state."
            p000.C1080.m7275(r3)
            r3 = 0
            return r3
        L13:
            return r2
        L14:
            r0 = 3
            r3.f13415 = r0
            r3.mo1025()
            int r3 = r3.f13415
            if (r3 != r2) goto L1f
            return r2
        L1f:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f13415
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lb
            r4.f13415 = r1
            java.lang.Object r4 = r4.f13416
            return r4
        Lb:
            r3 = 2
            if (r0 == r3) goto L1d
            r0 = 3
            r4.f13415 = r0
            r4.mo1025()
            int r0 = r4.f13415
            if (r0 != r2) goto L1d
            r4.f13415 = r1
            java.lang.Object r4 = r4.f13416
            return r4
        L1d:
            p000.C1080.m7277()
            r4 = 0
            return r4
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
    public abstract void mo1025();
}
