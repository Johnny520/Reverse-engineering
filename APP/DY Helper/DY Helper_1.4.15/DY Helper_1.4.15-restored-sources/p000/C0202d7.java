package p000;

/* JADX INFO: renamed from: d7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0202d7 implements java.util.Collection, java.util.Set, p000.mo0, p000.qo0 {

    /* JADX INFO: renamed from: ε */
    public int[] f2929;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object[] f2930;

    /* JADX INFO: renamed from: η */
    public int f2931;

    public C0202d7(int r1) {
            r0 = this;
            r0.<init>()
            int[] r1 = p000.AbstractC1021yh.f12616
            r0.f2929 = r1
            java.lang.Object[] r1 = p000.AbstractC1021yh.f12618
            r0.f2930 = r1
            return
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f2931
            r1 = 0
            if (r11 != 0) goto Lc
            r2 = 0
            int r2 = p000.pd2.m4502(r10, r2, r1)
            r3 = r1
            goto L17
        Lc:
            int r2 = r11.hashCode()
            int r3 = p000.pd2.m4502(r10, r11, r2)
            r9 = r3
            r3 = r2
            r2 = r9
        L17:
            if (r2 < 0) goto L1a
            return r1
        L1a:
            int r2 = ~r2
            int[] r4 = r10.f2929
            int r5 = r4.length
            if (r0 < r5) goto L51
            r5 = 8
            if (r0 < r5) goto L28
            int r5 = r0 >> 1
            int r5 = r5 + r0
            goto L2d
        L28:
            r6 = 4
            if (r0 < r6) goto L2c
            goto L2d
        L2c:
            r5 = r6
        L2d:
            java.lang.Object[] r6 = r10.f2930
            int[] r7 = new int[r5]
            r10.f2929 = r7
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r10.f2930 = r5
            int r5 = r10.f2931
            if (r0 != r5) goto L4b
            int r5 = r7.length
            if (r5 != 0) goto L3f
            goto L51
        L3f:
            int r5 = r4.length
            r8 = 6
            p000.AbstractC0312g7.m2239(r1, r5, r8, r4, r7)
            java.lang.Object[] r4 = r10.f2930
            int r5 = r6.length
            p000.AbstractC0312g7.m2240(r6, r4, r1, r5, r8)
            goto L51
        L4b:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L51:
            if (r2 >= r0) goto L5f
            int[] r1 = r10.f2929
            int r4 = r2 + 1
            p000.AbstractC0312g7.m2235(r4, r2, r0, r1, r1)
            java.lang.Object[] r1 = r10.f2930
            p000.AbstractC0312g7.m2238(r1, r1, r4, r2, r0)
        L5f:
            int r1 = r10.f2931
            if (r0 != r1) goto L73
            int[] r0 = r10.f2929
            int r4 = r0.length
            if (r2 >= r4) goto L73
            r0[r2] = r3
            java.lang.Object[] r0 = r10.f2930
            r0[r2] = r11
            r11 = 1
            int r1 = r1 + r11
            r10.f2931 = r1
            return r11
        L73:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r7) {
            r6 = this;
            r7.getClass()
            int r0 = r6.f2931
            int r1 = r7.size()
            int r1 = r1 + r0
            int r0 = r6.f2931
            int[] r2 = r6.f2929
            int r3 = r2.length
            r4 = 0
            if (r3 >= r1) goto L29
            java.lang.Object[] r3 = r6.f2930
            int[] r5 = new int[r1]
            r6.f2929 = r5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.f2930 = r1
            if (r0 <= 0) goto L29
            r1 = 6
            p000.AbstractC0312g7.m2239(r4, r0, r1, r2, r5)
            java.lang.Object[] r2 = r6.f2930
            int r5 = r6.f2931
            p000.AbstractC0312g7.m2240(r3, r2, r4, r5, r1)
        L29:
            int r1 = r6.f2931
            if (r1 != r0) goto L42
            java.util.Iterator r7 = r7.iterator()
        L31:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r7.next()
            boolean r0 = r6.add(r0)
            r4 = r4 | r0
            goto L31
        L41:
            return r4
        L42:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            int r0 = r1.f2931
            if (r0 == 0) goto Lf
            int[] r0 = p000.AbstractC1021yh.f12616
            r1.f2929 = r0
            java.lang.Object[] r0 = p000.AbstractC1021yh.f12618
            r1.f2930 = r0
            r0 = 0
            r1.f2931 = r0
        Lf:
            int r1 = r1.f2931
            if (r1 != 0) goto L14
            return
        L14:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L9
            r3 = 0
            int r2 = p000.pd2.m4502(r2, r3, r0)
            goto L11
        L9:
            int r1 = r3.hashCode()
            int r2 = p000.pd2.m4502(r2, r3, r1)
        L11:
            if (r2 < 0) goto L15
            r2 = 1
            return r2
        L15:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L7
            r1 = 0
            return r1
        L19:
            r1 = 1
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L2c
            int r1 = r6.f2931
            r3 = r7
            java.util.Set r3 = (java.util.Set) r3
            int r3 = r3.size()
            if (r1 == r3) goto L15
            return r2
        L15:
            int r1 = r6.f2931     // Catch: java.lang.Throwable -> L2c
            r3 = r2
        L18:
            if (r3 >= r1) goto L2b
            java.lang.Object[] r4 = r6.f2930     // Catch: java.lang.Throwable -> L2c
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L2c
            r5 = r7
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L2c
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L28
            return r2
        L28:
            int r3 = r3 + 1
            goto L18
        L2b:
            return r0
        L2c:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
            r4 = this;
            int[] r0 = r4.f2929
            int r4 = r4.f2931
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r4) goto Le
            r3 = r0[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        Le:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.f2931
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            y6 r0 = new y6
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L9
            r3 = 0
            int r3 = p000.pd2.m4502(r2, r3, r0)
            goto L11
        L9:
            int r1 = r3.hashCode()
            int r3 = p000.pd2.m4502(r2, r3, r1)
        L11:
            if (r3 < 0) goto L18
            r2.m1669(r3)
            r2 = 1
            return r2
        L18:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L8
        L18:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r6) {
            r5 = this;
            r6.getClass()
            int r0 = r5.f2931
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L8:
            r3 = -1
            if (r3 >= r0) goto L1f
            r3 = r6
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object[] r4 = r5.f2930
            r4 = r4[r0]
            boolean r3 = p000.AbstractC0984xh.m6632(r3, r4)
            if (r3 != 0) goto L1c
            r5.m1669(r0)
            r2 = r1
        L1c:
            int r0 = r0 + (-1)
            goto L8
        L1f:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
            r0 = this;
            int r0 = r0.f2931
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
            r2 = this;
            java.lang.Object[] r0 = r2.f2930
            r1 = 0
            int r2 = r2.f2931
            java.lang.Object[] r2 = p000.AbstractC0312g7.m2242(r0, r1, r2)
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] r3) {
            r2 = this;
            r3.getClass()
            int r0 = r2.f2931
            int r1 = r3.length
            if (r1 >= r0) goto L17
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L1d
        L17:
            int r1 = r3.length
            if (r1 <= r0) goto L1d
            r1 = 0
            r3[r0] = r1
        L1d:
            java.lang.Object[] r0 = r2.f2930
            int r2 = r2.f2931
            r1 = 0
            p000.AbstractC0312g7.m2238(r0, r3, r1, r1, r2)
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r4 = "{}"
            return r4
        L9:
            int r0 = r4.f2931
            int r0 = r0 * 14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r4.f2931
            r2 = 0
        L1a:
            if (r2 >= r0) goto L35
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            java.lang.Object[] r3 = r4.f2930
            r3 = r3[r2]
            if (r3 == r4) goto L2d
            r1.append(r3)
            goto L32
        L2d:
            java.lang.String r3 = "(this Set)"
            r1.append(r3)
        L32:
            int r2 = r2 + 1
            goto L1a
        L35:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Object m1669(int r9) {
            r8 = this;
            int r0 = r8.f2931
            java.lang.Object[] r1 = r8.f2930
            r2 = r1[r9]
            r3 = 1
            if (r0 > r3) goto Ld
            r8.clear()
            return r2
        Ld:
            int r3 = r0 + (-1)
            int[] r4 = r8.f2929
            int r5 = r4.length
            r6 = 8
            if (r5 <= r6) goto L44
            int r5 = r4.length
            int r5 = r5 / 3
            if (r0 >= r5) goto L44
            if (r0 <= r6) goto L21
            int r5 = r0 >> 1
            int r6 = r0 + r5
        L21:
            int[] r5 = new int[r6]
            r8.f2929 = r5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r8.f2930 = r6
            if (r9 <= 0) goto L35
            r6 = 0
            r7 = 6
            p000.AbstractC0312g7.m2239(r6, r9, r7, r4, r5)
            java.lang.Object[] r5 = r8.f2930
            p000.AbstractC0312g7.m2240(r1, r5, r6, r9, r7)
        L35:
            if (r9 >= r3) goto L55
            int[] r5 = r8.f2929
            int r6 = r9 + 1
            p000.AbstractC0312g7.m2235(r9, r6, r0, r4, r5)
            java.lang.Object[] r4 = r8.f2930
            p000.AbstractC0312g7.m2238(r1, r4, r9, r6, r0)
            goto L55
        L44:
            if (r9 >= r3) goto L50
            int r1 = r9 + 1
            p000.AbstractC0312g7.m2235(r9, r1, r0, r4, r4)
            java.lang.Object[] r4 = r8.f2930
            p000.AbstractC0312g7.m2238(r4, r4, r9, r1, r0)
        L50:
            java.lang.Object[] r9 = r8.f2930
            r1 = 0
            r9[r3] = r1
        L55:
            int r9 = r8.f2931
            if (r0 != r9) goto L5c
            r8.f2931 = r3
            return r2
        L5c:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
    }
}
