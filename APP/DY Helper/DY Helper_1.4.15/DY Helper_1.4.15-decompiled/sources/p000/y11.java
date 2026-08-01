package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y11 implements p000.qo0, java.util.Set, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.w11 f12425;

    /* JADX INFO: renamed from: ζ */
    public final p000.w11 f12426;

    public y11(p000.w11 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f12425 = r1
            r0.f12426 = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            w11 r0 = r0.f12426
            boolean r0 = r0.m6299(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r13) {
            r12 = this;
            r13.getClass()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            w11 r12 = r12.f12426
            r12.getClass()
            int r0 = r12.f11525
            java.util.Iterator r13 = r13.iterator()
        L10:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r13.next()
            int r2 = r12.m6302(r1)
            java.lang.Object[] r3 = r12.f11520
            r3[r2] = r1
            long[] r1 = r12.f11521
            int r3 = r12.f11522
            long r4 = (long) r3
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = r4 & r6
            r8 = 4611686016279904256(0x3fffffff80000000, double:1.9999995231628418)
            long r4 = r4 | r8
            r1[r2] = r4
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L49
            r8 = r1[r3]
            r10 = -4611686016279904257(0xc00000007fffffff, double:-2.000000953674316)
            long r8 = r8 & r10
            long r10 = (long) r2
            long r5 = r10 & r6
            r7 = 31
            long r5 = r5 << r7
            long r5 = r5 | r8
            r1[r3] = r5
        L49:
            r12.f11522 = r2
            int r1 = r12.f11523
            if (r1 != r4) goto L10
            r12.f11523 = r2
            goto L10
        L52:
            int r12 = r12.f11525
            if (r0 == r12) goto L58
            r12 = 1
            return r12
        L58:
            r12 = 0
            return r12
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r0 = this;
            w11 r0 = r0.f12426
            r0.m6300()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            w11 r0 = r0.f12425
            boolean r0 = r0.m6301(r1)
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
            w11 r1 = r2.f12425
            boolean r0 = r1.m6301(r0)
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
            java.lang.Class<y11> r0 = p000.y11.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            y11 r3 = (p000.y11) r3
            w11 r2 = r2.f12425
            w11 r3 = r3.f12425
            boolean r2 = p000.ln0.m3626(r2, r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r0 = this;
            w11 r0 = r0.f12425
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            w11 r0 = r0.f12425
            int r0 = r0.f11525
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
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
            w11 r0 = r0.f12426
            boolean r0 = r0.m6305(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r19) {
            r18 = this;
            r19.getClass()
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r18
            w11 r1 = r1.f12426
            r1.getClass()
            int r2 = r1.f11525
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r3 = r0.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L27
            int r6 = r3.hashCode()
            goto L28
        L27:
            r6 = r5
        L28:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r6 = r6 ^ r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r8 = r1.f11524
            int r6 = r6 >>> 7
            r6 = r6 & r8
        L36:
            long[] r9 = r1.f11519
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
        L60:
            r15 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L83
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> 3
            int r15 = r15 + r6
            r15 = r15 & r8
            r18 = r4
            java.lang.Object[] r4 = r1.f11520
            r4 = r4[r15]
            boolean r4 = p000.ln0.m3626(r4, r3)
            if (r4 == 0) goto L7b
            goto L8f
        L7b:
            r15 = 1
            long r15 = r11 - r15
            long r11 = r11 & r15
            r4 = r18
            goto L60
        L83:
            r18 = r4
            long r11 = ~r9
            r4 = 6
            long r11 = r11 << r4
            long r9 = r9 & r11
            long r9 = r9 & r13
            int r4 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r4 == 0) goto L96
            r15 = -1
        L8f:
            if (r15 < 0) goto L14
            r1.m6306(r15)
            goto L14
        L96:
            int r5 = r5 + 8
            int r6 = r6 + r5
            r6 = r6 & r8
            r4 = r18
            goto L36
        L9d:
            r18 = r4
            int r0 = r1.f11525
            if (r2 == r0) goto La4
            return r18
        La4:
            return r5
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            r1.getClass()
            w11 r0 = r0.f12426
            boolean r0 = r0.m6307(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r0 = this;
            w11 r0 = r0.f12425
            int r0 = r0.f11525
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
            w11 r0 = r0.f12425
            java.lang.String r0 = r0.toString()
            return r0
    }
}
