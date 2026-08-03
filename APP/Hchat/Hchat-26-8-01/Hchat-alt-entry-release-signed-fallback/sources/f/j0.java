package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements hg.e, java.util.Set, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.g0 f2841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.g0 f2842h;

    public j0(f.g0 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f2841g = r1
            r0.f2842h = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            f.g0 r0 = r1.f2842h
            boolean r2 = r0.a(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r14) {
            r13 = this;
            r14.getClass()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            f.g0 r0 = r13.f2842h
            r0.getClass()
            int r1 = r0.f2823g
            java.util.Iterator r14 = r14.iterator()
        L10:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r14.next()
            int r3 = r0.d(r2)
            java.lang.Object[] r4 = r0.f2818b
            r4[r3] = r2
            long[] r2 = r0.f2819c
            int r4 = r0.f2820d
            long r5 = (long) r4
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r5 = r5 & r7
            r9 = 4611686016279904256(0x3fffffff80000000, double:1.9999995231628418)
            long r5 = r5 | r9
            r2[r3] = r5
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L49
            r9 = r2[r4]
            r11 = -4611686016279904257(0xc00000007fffffff, double:-2.000000953674316)
            long r9 = r9 & r11
            long r11 = (long) r3
            long r6 = r11 & r7
            r8 = 31
            long r6 = r6 << r8
            long r6 = r6 | r9
            r2[r4] = r6
        L49:
            r0.f2820d = r3
            int r2 = r0.f2821e
            if (r2 != r5) goto L10
            r0.f2821e = r3
            goto L10
        L52:
            int r14 = r0.f2823g
            if (r1 == r14) goto L58
            r14 = 1
            return r14
        L58:
            r14 = 0
            return r14
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r1 = this;
            f.g0 r0 = r1.f2842h
            r0.b()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            f.g0 r0 = r1.f2841g
            boolean r2 = r0.c(r2)
            return r2
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
            f.g0 r1 = r2.f2841g
            boolean r0 = r1.c(r0)
            if (r0 != 0) goto L9
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<f.j0> r0 = f.j0.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            f.j0 r3 = (f.j0) r3
            f.g0 r0 = r2.f2841g
            f.g0 r3 = r3.f2841g
            boolean r3 = gg.l.a(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r1 = this;
            f.g0 r0 = r1.f2841g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            f.g0 r0 = r1.f2841g
            int r0 = r0.f2823g
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
            f.i0 r0 = new f.i0
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            f.g0 r0 = r1.f2842h
            boolean r2 = r0.g(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r21) {
            r20 = this;
            r21.getClass()
            r0 = r21
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r20
            f.g0 r2 = r1.f2842h
            r2.getClass()
            int r3 = r2.f2823g
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La2
            java.lang.Object r4 = r0.next()
            if (r4 == 0) goto L27
            int r7 = r4.hashCode()
            goto L28
        L27:
            r7 = r6
        L28:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f2822f
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L36:
            long[] r10 = r2.f2817a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L64:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L87
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.f2818b
            r12 = r12[r14]
            boolean r12 = gg.l.a(r12, r4)
            if (r12 == 0) goto L7f
            goto L94
        L7f:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L64
        L87:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9b
            r14 = -1
        L94:
            if (r14 < 0) goto L14
            r2.h(r14)
            goto L14
        L9b:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L36
        La2:
            r21 = r5
            int r0 = r2.f2823g
            if (r3 == r0) goto La9
            return r21
        La9:
            return r6
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            f.g0 r0 = r1.f2842h
            boolean r2 = r0.i(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r1 = this;
            f.g0 r0 = r1.f2841g
            int r0 = r0.f2823g
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object[] r1 = gg.k.b(r0, r1)
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            f.g0 r0 = r1.f2841g
            java.lang.String r0 = r0.toString()
            return r0
    }
}
