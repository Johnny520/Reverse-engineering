package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wm0 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final int f11763;

    /* JADX INFO: renamed from: ζ */
    public final int f11764;

    /* JADX INFO: renamed from: η */
    public boolean f11765;

    /* JADX INFO: renamed from: θ */
    public int f11766;

    public wm0(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.f11763 = r5
            r2.f11764 = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto Lf
            if (r3 > r4) goto L12
        Ld:
            r0 = r1
            goto L12
        Lf:
            if (r3 < r4) goto L12
            goto Ld
        L12:
            r2.f11765 = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.f11766 = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            boolean r0 = r0.f11765
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r0 = this;
            int r0 = r0.nextInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public final int nextInt() {
            r2 = this;
            int r0 = r2.f11766
            int r1 = r2.f11764
            if (r0 != r1) goto L13
            boolean r1 = r2.f11765
            if (r1 == 0) goto Le
            r1 = 0
            r2.f11765 = r1
            return r0
        Le:
            p000.C1080.m7277()
            r2 = 0
            return r2
        L13:
            int r1 = r2.f11763
            int r1 = r1 + r0
            r2.f11766 = r1
            return r0
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
