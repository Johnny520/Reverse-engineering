package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e21 implements p000.qo0, java.util.Set, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.c21 f3378;

    /* JADX INFO: renamed from: ζ */
    public final p000.c21 f3379;

    public e21(p000.c21 r1) {
            r0 = this;
            r0.<init>()
            r0.f3378 = r1
            r0.f3379 = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            c21 r0 = r0.f3379
            boolean r0 = r0.m1107(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Collection r3 = (java.util.Collection) r3
            c21 r2 = r2.f3379
            int r0 = r2.f1944
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r3.next()
            r2.m1116(r1)
            goto Lf
        L1d:
            int r2 = r2.f1944
            if (r0 == r2) goto L23
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r0 = this;
            c21 r0 = r0.f3379
            r0.m1108()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            c21 r0 = r0.f3378
            boolean r0 = r0.m1109(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r3.next()
            c21 r1 = r2.f3378
            boolean r0 = r1.m1109(r0)
            if (r0 != 0) goto L9
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<e21> r0 = p000.e21.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            e21 r3 = (p000.e21) r3
            c21 r2 = r2.f3378
            c21 r3 = r3.f3378
            boolean r2 = r2.equals(r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r0 = this;
            c21 r0 = r0.f3378
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            c21 r0 = r0.f3378
            boolean r0 = r0.m1113()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            f90 r0 = new f90
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            c21 r0 = r0.f3379
            boolean r0 = r0.m1117(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r19) {
            r18 = this;
            r19.getClass()
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r18
            c21 r1 = r1.f3379
            int r2 = r1.f1944
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L24
            int r6 = r3.hashCode()
            goto L25
        L24:
            r6 = r5
        L25:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r6 = r6 ^ r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r8 = r1.f1943
            int r6 = r6 >>> 7
            r6 = r6 & r8
        L33:
            long[] r9 = r1.f1941
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            int r10 = r10 + r4
            r9 = r9[r10]
            int r14 = 64 - r11
            long r9 = r9 << r14
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r7
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r9
            long r13 = r11 - r13
            long r11 = ~r11
            long r11 = r11 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
        L5d:
            r15 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L80
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> 3
            int r15 = r15 + r6
            r15 = r15 & r8
            r18 = r4
            java.lang.Object[] r4 = r1.f1942
            r4 = r4[r15]
            boolean r4 = p000.ln0.m3626(r4, r3)
            if (r4 == 0) goto L78
            goto L8c
        L78:
            r15 = 1
            long r15 = r11 - r15
            long r11 = r11 & r15
            r4 = r18
            goto L5d
        L80:
            r18 = r4
            long r11 = ~r9
            r4 = 6
            long r11 = r11 << r4
            long r9 = r9 & r11
            long r9 = r9 & r13
            int r4 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r4 == 0) goto L93
            r15 = -1
        L8c:
            if (r15 < 0) goto L11
            r1.m1118(r15)
            goto L11
        L93:
            int r5 = r5 + 8
            int r6 = r6 + r5
            r6 = r6 & r8
            r4 = r18
            goto L33
        L9a:
            r18 = r4
            int r0 = r1.f1944
            if (r2 == r0) goto La1
            return r18
        La1:
            return r5
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r17) {
            r16 = this;
            r17.getClass()
            r0 = r16
            c21 r0 = r0.f3379
            java.lang.Object[] r1 = r0.f1942
            int r2 = r0.f1944
            long[] r3 = r0.f1941
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L56
            r6 = r5
        L14:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L51
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2e:
            if (r11 >= r9) goto L4f
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L4b
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = p000.AbstractC0984xh.m6632(r13, r14)
            if (r13 != 0) goto L4b
            r0.m1118(r12)
        L4b:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2e
        L4f:
            if (r9 != r10) goto L56
        L51:
            if (r6 == r4) goto L56
            int r6 = r6 + 1
            goto L14
        L56:
            int r0 = r0.f1944
            if (r2 == r0) goto L5c
            r0 = 1
            return r0
        L5c:
            return r5
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r0 = this;
            c21 r0 = r0.f3378
            int r0 = r0.f1944
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5320(r0)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5321(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            c21 r0 = r0.f3378
            java.lang.String r0 = r0.toString()
            return r0
    }
}
