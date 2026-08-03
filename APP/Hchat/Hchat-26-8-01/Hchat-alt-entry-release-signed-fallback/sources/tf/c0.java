package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends tf.f implements java.util.RandomAccess {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object[] f13143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13146j;

    public c0(int r3, java.lang.Object[] r4) {
            r2 = this;
            r2.<init>()
            r2.f13143g = r4
            if (r3 < 0) goto L1e
            int r0 = r4.length
            if (r3 > r0) goto L10
            int r4 = r4.length
            r2.f13144h = r4
            r2.f13146j = r3
            return
        L10:
            java.lang.String r0 = "ring buffer filled size: "
            java.lang.String r1 = " cannot be larger than the buffer size: "
            java.lang.StringBuilder r3 = eh.a.t(r3, r0, r1)
            int r4 = r4.length
            okio.a.e(r4, r3)
            r3 = 0
            throw r3
        L1e:
            java.lang.String r4 = "ring buffer filled size should not be negative but it is "
            java.lang.String r3 = eh.a.l(r3, r4)
            j8.o.q(r3)
            r3 = 0
            throw r3
    }

    public final void a(int r6) {
            r5 = this;
            if (r6 < 0) goto L3b
            int r0 = r5.size()
            if (r6 > r0) goto L2b
            if (r6 <= 0) goto L2a
            int r0 = r5.f13145i
            int r1 = r0 + r6
            int r2 = r5.f13144h
            int r1 = r1 % r2
            java.lang.Object[] r3 = r5.f13143g
            r4 = 0
            if (r0 <= r1) goto L1e
            java.util.Arrays.fill(r3, r0, r2, r4)
            r0 = 0
            java.util.Arrays.fill(r3, r0, r1, r4)
            goto L21
        L1e:
            java.util.Arrays.fill(r3, r0, r1, r4)
        L21:
            r5.f13145i = r1
            int r0 = r5.size()
            int r0 = r0 - r6
            r5.f13146j = r0
        L2a:
            return
        L2b:
            java.lang.String r0 = "n shouldn't be greater than the buffer size: n = "
            java.lang.String r1 = ", size = "
            java.lang.StringBuilder r6 = eh.a.t(r6, r0, r1)
            int r0 = r5.size()
            okio.a.e(r0, r6)
            return
        L3b:
            java.lang.String r0 = "n shouldn't be negative but it is "
            java.lang.String r6 = eh.a.l(r6, r0)
            j8.o.q(r6)
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r2.size()
            r0.getClass()
            tf.c.a(r3, r1)
            int r0 = r2.f13145i
            int r0 = r0 + r3
            int r3 = r2.f13144h
            int r0 = r0 % r3
            java.lang.Object[] r3 = r2.f13143g
            r3 = r3[r0]
            return r3
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            int r0 = r1.f13146j
            return r0
    }

    @Override // tf.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            tf.b0 r0 = new tf.b0
            r0.<init>(r1)
            return r0
    }

    @Override // tf.a, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // tf.a, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r7) {
            r6 = this;
            r7.getClass()
            int r0 = r7.length
            int r1 = r6.size()
            if (r0 >= r1) goto L12
            int r0 = r6.size()
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
        L12:
            int r0 = r6.size()
            int r1 = r6.f13145i
            r2 = 0
            r3 = r2
        L1a:
            java.lang.Object[] r4 = r6.f13143g
            if (r3 >= r0) goto L2b
            int r5 = r6.f13144h
            if (r1 >= r5) goto L2b
            r4 = r4[r1]
            r7[r3] = r4
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L1a
        L2b:
            if (r3 >= r0) goto L36
            r1 = r4[r2]
            r7[r3] = r1
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L2b
        L36:
            int r1 = r7.length
            if (r0 >= r1) goto L3c
            r1 = 0
            r7[r0] = r1
        L3c:
            return r7
    }
}
