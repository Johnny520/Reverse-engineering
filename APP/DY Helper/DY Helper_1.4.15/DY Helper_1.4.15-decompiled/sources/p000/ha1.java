package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ha1 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.a62[] f4668;

    /* JADX INFO: renamed from: ζ */
    public int f4669;

    /* JADX INFO: renamed from: η */
    public boolean f4670;

    public ha1(p000.z52 r3, p000.a62[] r4) {
            r2 = this;
            r2.<init>()
            r2.f4668 = r4
            r0 = 1
            r2.f4670 = r0
            r0 = 0
            r4 = r4[r0]
            java.lang.Object[] r1 = r3.f12987
            int r3 = r3.f12984
            int r3 = java.lang.Integer.bitCount(r3)
            int r3 = r3 * 2
            r4.m46(r1, r3, r0)
            r2.f4669 = r0
            r2.m2479()
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            boolean r0 = r0.f4670
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.f4670
            if (r0 == 0) goto L12
            a62[] r0 = r2.f4668
            int r1 = r2.f4669
            r0 = r0[r1]
            java.lang.Object r0 = r0.next()
            r2.m2479()
            return r0
        L12:
            p000.C1080.m7277()
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: α */
    public final void m2479() {
            r9 = this;
            int r0 = r9.f4669
            a62[] r1 = r9.f4668
            r2 = r1[r0]
            int r3 = r2.f80
            int r2 = r2.f79
            if (r3 >= r2) goto Ld
            return
        Ld:
            r2 = 0
            r3 = -1
            if (r3 >= r0) goto L49
            int r4 = r9.m2480(r0)
            if (r4 != r3) goto L29
            r5 = r1[r0]
            int r6 = r5.f80
            java.lang.Object[] r7 = r5.f78
            int r8 = r7.length
            if (r6 >= r8) goto L29
            int r4 = r7.length
            int r6 = r6 + 1
            r5.f80 = r6
            int r4 = r9.m2480(r0)
        L29:
            if (r4 == r3) goto L2e
            r9.f4669 = r4
            return
        L2e:
            if (r0 <= 0) goto L3d
            int r3 = r0 + (-1)
            r3 = r1[r3]
            int r4 = r3.f80
            java.lang.Object[] r5 = r3.f78
            int r5 = r5.length
            int r4 = r4 + 1
            r3.f80 = r4
        L3d:
            r3 = r1[r0]
            z52 r4 = p000.z52.f12983
            java.lang.Object[] r4 = r4.f12987
            r3.m46(r4, r2, r2)
            int r0 = r0 + (-1)
            goto Ld
        L49:
            r9.f4670 = r2
            return
    }

    /* JADX INFO: renamed from: β */
    public final int m2480(int r5) {
            r4 = this;
            a62[] r0 = r4.f4668
            r1 = r0[r5]
            int r2 = r1.f80
            int r3 = r1.f79
            if (r2 >= r3) goto Lb
            return r5
        Lb:
            java.lang.Object[] r1 = r1.f78
            int r3 = r1.length
            if (r2 >= r3) goto L3f
            int r3 = r1.length
            r1 = r1[r2]
            r1.getClass()
            z52 r1 = (p000.z52) r1
            r2 = 6
            r3 = 0
            if (r5 != r2) goto L27
            int r2 = r5 + 1
            r0 = r0[r2]
            java.lang.Object[] r1 = r1.f12987
            int r2 = r1.length
            r0.m46(r1, r2, r3)
            goto L38
        L27:
            int r2 = r5 + 1
            r0 = r0[r2]
            java.lang.Object[] r2 = r1.f12987
            int r1 = r1.f12984
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 * 2
            r0.m46(r2, r1, r3)
        L38:
            int r5 = r5 + 1
            int r4 = r4.m2480(r5)
            return r4
        L3f:
            r4 = -1
            return r4
    }
}
