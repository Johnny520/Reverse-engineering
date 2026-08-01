package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class es0 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final java.lang.CharSequence f3657;

    /* JADX INFO: renamed from: ζ */
    public int f3658;

    /* JADX INFO: renamed from: η */
    public int f3659;

    /* JADX INFO: renamed from: θ */
    public int f3660;

    /* JADX INFO: renamed from: ι */
    public int f3661;

    public es0(java.lang.CharSequence r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3657 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r9 = this;
            int r0 = r9.f3658
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            if (r0 != r2) goto L9
            return r2
        L9:
            return r1
        La:
            int r0 = r9.f3661
            r3 = 2
            if (r0 >= 0) goto L12
            r9.f3658 = r3
            return r1
        L12:
            java.lang.CharSequence r0 = r9.f3657
            int r1 = r0.length()
            int r4 = r9.f3659
            int r5 = r0.length()
        L1e:
            if (r4 >= r5) goto L43
            char r6 = r0.charAt(r4)
            r7 = 13
            r8 = 10
            if (r6 == r8) goto L2f
            if (r6 == r7) goto L2f
            int r4 = r4 + 1
            goto L1e
        L2f:
            if (r6 != r7) goto L40
            int r1 = r4 + 1
            int r5 = r0.length()
            if (r1 >= r5) goto L40
            char r0 = r0.charAt(r1)
            if (r0 != r8) goto L40
            goto L41
        L40:
            r3 = r2
        L41:
            r1 = r4
            goto L44
        L43:
            r3 = -1
        L44:
            r9.f3658 = r2
            r9.f3661 = r3
            r9.f3660 = r1
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            r0 = 0
            r3.f3658 = r0
            int r0 = r3.f3660
            int r1 = r3.f3659
            int r2 = r3.f3661
            int r2 = r2 + r0
            r3.f3659 = r2
            java.lang.CharSequence r3 = r3.f3657
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            java.lang.String r3 = r3.toString()
            return r3
        L1d:
            p000.C1080.m7277()
            r3 = 0
            return r3
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
