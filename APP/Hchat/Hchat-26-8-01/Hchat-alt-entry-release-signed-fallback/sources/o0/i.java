package o0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends o0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o0.i f9494h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object[] f9495g;

    static {
            o0.i r0 = new o0.i
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.<init>(r1)
            o0.i.f9494h = r0
            return
    }

    public i(java.lang.Object[] r1) {
            r0 = this;
            r0.<init>()
            r0.f9495g = r1
            return
    }

    @Override // o0.c
    public final o0.c a(int r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.size()
            be.h.n(r7, r0)
            int r0 = r6.size()
            if (r7 != r0) goto L12
            o0.c r7 = r6.c(r8)
            return r7
        L12:
            int r0 = r6.size()
            r1 = 32
            r2 = 0
            java.lang.Object[] r3 = r6.f9495g
            if (r0 >= r1) goto L3a
            int r0 = r6.size()
            int r0 = r0 + 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 6
            tf.l.r0(r2, r7, r3, r1, r0)
            int r1 = r7 + 1
            int r2 = r6.size()
            tf.l.n0(r1, r7, r3, r2, r0)
            r0[r7] = r8
            o0.i r7 = new o0.i
            r7.<init>(r0)
            return r7
        L3a:
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r4 = r7 + 1
            int r5 = r6.size()
            int r5 = r5 + (-1)
            tf.l.n0(r4, r7, r3, r5, r0)
            r0[r7] = r8
            r7 = 31
            r7 = r3[r7]
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r2] = r7
            o0.e r7 = new o0.e
            int r1 = r6.size()
            int r1 = r1 + 1
            r7.<init>(r0, r8, r1, r2)
            return r7
    }

    @Override // o0.c
    public final o0.c c(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.size()
            java.lang.Object[] r1 = r4.f9495g
            r2 = 32
            if (r0 >= r2) goto L20
            int r0 = r4.size()
            int r0 = r0 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            int r1 = r4.size()
            r0[r1] = r5
            o0.i r5 = new o0.i
            r5.<init>(r0)
            return r5
        L20:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 0
            r0[r2] = r5
            o0.e r5 = new o0.e
            int r3 = r4.size()
            int r3 = r3 + 1
            r5.<init>(r1, r0, r3, r2)
            return r5
    }

    @Override // o0.c
    public final o0.c d(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.size()
            int r1 = r5.size()
            int r1 = r1 + r0
            r0 = 32
            if (r1 > r0) goto L3a
            int r0 = r4.size()
            int r1 = r5.size()
            int r1 = r1 + r0
            java.lang.Object[] r0 = r4.f9495g
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            int r1 = r4.size()
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r5.next()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto L24
        L34:
            o0.i r5 = new o0.i
            r5.<init>(r0)
            return r5
        L3a:
            o0.f r0 = r4.e()
            r0.addAll(r5)
            o0.c r5 = r0.d()
            return r5
    }

    @Override // o0.c
    public final o0.f e() {
            r4 = this;
            o0.f r0 = new o0.f
            java.lang.Object[] r1 = r4.f9495g
            r2 = 0
            r3 = 0
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    @Override // o0.c
    public final o0.c f(o0.b r10) {
            r9 = this;
            int r0 = r9.size()
            int r1 = r9.size()
            java.lang.Object[] r2 = r9.f9495g
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Le:
            if (r4 >= r1) goto L32
            r7 = r2[r4]
            java.lang.Object r8 = r10.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L28
            if (r5 != 0) goto L2f
            int r0 = r2.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r2, r0)
            r5 = 1
            r0 = r4
            goto L2f
        L28:
            if (r5 == 0) goto L2f
            int r8 = r0 + 1
            r6[r0] = r7
            r0 = r8
        L2f:
            int r4 = r4 + 1
            goto Le
        L32:
            int r10 = r9.size()
            if (r0 != r10) goto L39
            return r9
        L39:
            if (r0 != 0) goto L3e
            o0.i r10 = o0.i.f9494h
            return r10
        L3e:
            o0.i r10 = new o0.i
            java.lang.Object[] r0 = tf.l.u0(r6, r3, r0)
            r10.<init>(r0)
            return r10
    }

    @Override // o0.c
    public final o0.c g(int r5) {
            r4 = this;
            int r0 = r4.size()
            be.h.m(r5, r0)
            int r0 = r4.size()
            r1 = 1
            if (r0 != r1) goto L11
            o0.i r5 = o0.i.f9494h
            return r5
        L11:
            int r0 = r4.size()
            int r0 = r0 - r1
            java.lang.Object[] r1 = r4.f9495g
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            int r2 = r5 + 1
            int r3 = r4.size()
            tf.l.n0(r5, r2, r1, r3, r0)
            o0.i r5 = new o0.i
            r5.<init>(r0)
            return r5
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.size()
            be.h.m(r2, r0)
            java.lang.Object[] r0 = r1.f9495g
            r2 = r0[r2]
            return r2
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            java.lang.Object[] r0 = r1.f9495g
            int r0 = r0.length
            return r0
    }

    @Override // o0.c
    public final o0.c h(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.size()
            be.h.m(r3, r0)
            java.lang.Object[] r0 = r2.f9495g
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r0[r3] = r4
            o0.i r3 = new o0.i
            r3.<init>(r0)
            return r3
    }

    @Override // tf.f, java.util.List
    public final int indexOf(java.lang.Object r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f9495g
            int r2 = tf.l.D0(r0, r2)
            return r2
    }

    @Override // tf.f, java.util.List
    public final int lastIndexOf(java.lang.Object r6) {
            r5 = this;
            java.lang.Object[] r0 = r5.f9495g
            r1 = -1
            if (r6 != 0) goto L15
            int r6 = r0.length
            int r6 = r6 + r1
            if (r6 < 0) goto L29
        L9:
            int r2 = r6 + (-1)
            r3 = r0[r6]
            if (r3 != 0) goto L10
            return r6
        L10:
            if (r2 >= 0) goto L13
            goto L29
        L13:
            r6 = r2
            goto L9
        L15:
            int r2 = r0.length
            int r2 = r2 + r1
            if (r2 < 0) goto L29
        L19:
            int r3 = r2 + (-1)
            r4 = r0[r2]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L24
            return r2
        L24:
            if (r3 >= 0) goto L27
            goto L29
        L27:
            r2 = r3
            goto L19
        L29:
            return r1
    }

    @Override // tf.f, java.util.List
    public final java.util.ListIterator listIterator(int r4) {
            r3 = this;
            int r0 = r3.size()
            be.h.n(r4, r0)
            o0.d r0 = new o0.d
            java.lang.Object[] r1 = r3.f9495g
            int r2 = r3.size()
            r0.<init>(r1, r4, r2)
            return r0
    }
}
