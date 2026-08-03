package o0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends o0.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object[] f9476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object[] f9477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9479j;

    public e(java.lang.Object[] r1, java.lang.Object[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f9476g = r1
            r0.f9477h = r2
            r0.f9478i = r3
            r0.f9479j = r4
            int r1 = r0.size()
            r3 = 32
            if (r1 <= r3) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Trie-based persistent vector should have at least 33 elements, got "
            r1.<init>(r3)
            int r3 = r0.size()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            i0.n1.a(r1)
        L2d:
            r0.size()
            r0.size()
            int r1 = r2.length
            return
    }

    public static java.lang.Object[] i(java.lang.Object[] r4, int r5, int r6, java.lang.Object r7, h3.f r8) {
            int r0 = g4.a.x(r6, r5)
            r1 = 32
            if (r5 != 0) goto L1f
            if (r0 != 0) goto Ld
            java.lang.Object[] r5 = new java.lang.Object[r1]
            goto L11
        Ld:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r4, r1)
        L11:
            int r6 = r0 + 1
            r1 = 31
            tf.l.n0(r6, r0, r4, r1, r5)
            r4 = r4[r1]
            r8.f5065a = r4
            r5[r0] = r7
            return r5
        L1f:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r1)
            int r5 = r5 + (-5)
            r3 = r4[r0]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r6 = i(r3, r5, r6, r7, r8)
            r2[r0] = r6
        L32:
            int r0 = r0 + 1
            if (r0 >= r1) goto L4b
            r6 = r2[r0]
            if (r6 == 0) goto L4b
            r6 = r4[r0]
            r6.getClass()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r7 = 0
            java.lang.Object r3 = r8.f5065a
            java.lang.Object[] r6 = i(r6, r5, r7, r3, r8)
            r2[r0] = r6
            goto L32
        L4b:
            return r2
    }

    public static java.lang.Object[] k(java.lang.Object[] r4, int r5, int r6, h3.f r7) {
            int r0 = g4.a.x(r6, r5)
            r1 = 0
            r2 = 5
            if (r5 != r2) goto Le
            r5 = r4[r0]
            r7.f5065a = r5
            r5 = r1
            goto L1a
        Le:
            r3 = r4[r0]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r5 = r5 - r2
            java.lang.Object[] r5 = k(r3, r5, r6, r7)
        L1a:
            if (r5 != 0) goto L1f
            if (r0 != 0) goto L1f
            return r1
        L1f:
            r6 = 32
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
            r4[r0] = r5
            return r4
    }

    public static java.lang.Object[] q(int r2, int r3, java.lang.Object r4, java.lang.Object[] r5) {
            int r0 = g4.a.x(r3, r2)
            r1 = 32
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            if (r2 != 0) goto Lf
            r5[r0] = r4
            return r5
        Lf:
            r1 = r5[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r2 + (-5)
            java.lang.Object[] r2 = q(r2, r3, r4, r1)
            r5[r0] = r2
            return r5
    }

    @Override // o0.c
    public final o0.c a(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.size()
            be.h.n(r4, r0)
            int r0 = r3.size()
            if (r4 != r0) goto L12
            o0.c r4 = r3.c(r5)
            return r4
        L12:
            int r0 = r3.p()
            java.lang.Object[] r1 = r3.f9476g
            if (r4 < r0) goto L20
            int r4 = r4 - r0
            o0.e r4 = r3.j(r5, r4, r1)
            return r4
        L20:
            h3.f r0 = new h3.f
            r2 = 0
            r0.<init>(r2)
            int r2 = r3.f9479j
            java.lang.Object[] r4 = i(r1, r2, r4, r5, r0)
            r5 = 0
            java.lang.Object r0 = r0.f5065a
            o0.e r4 = r3.j(r0, r5, r4)
            return r4
    }

    @Override // o0.c
    public final o0.c c(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.size()
            int r1 = r4.p()
            int r0 = r0 - r1
            java.lang.Object[] r1 = r4.f9476g
            java.lang.Object[] r2 = r4.f9477h
            r3 = 32
            if (r0 >= r3) goto L25
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            r2[r0] = r5
            o0.e r5 = new o0.e
            int r0 = r4.size()
            int r0 = r0 + 1
            int r3 = r4.f9479j
            r5.<init>(r1, r2, r0, r3)
            return r5
        L25:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r5
            o0.e r5 = r4.l(r1, r2, r0)
            return r5
    }

    @Override // o0.c
    public final o0.f e() {
            r4 = this;
            o0.f r0 = new o0.f
            java.lang.Object[] r1 = r4.f9477h
            int r2 = r4.f9479j
            java.lang.Object[] r3 = r4.f9476g
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    @Override // o0.c
    public final o0.c f(o0.b r5) {
            r4 = this;
            o0.f r0 = new o0.f
            java.lang.Object[] r1 = r4.f9477h
            int r2 = r4.f9479j
            java.lang.Object[] r3 = r4.f9476g
            r0.<init>(r4, r3, r1, r2)
            r0.z(r5)
            o0.c r5 = r0.d()
            return r5
    }

    @Override // o0.c
    public final o0.c g(int r7) {
            r6 = this;
            int r0 = r6.size()
            be.h.m(r7, r0)
            int r0 = r6.p()
            int r1 = r6.f9479j
            java.lang.Object[] r2 = r6.f9476g
            if (r7 < r0) goto L17
            int r7 = r7 - r0
            o0.c r7 = r6.o(r2, r0, r1, r7)
            return r7
        L17:
            h3.f r3 = new h3.f
            java.lang.Object[] r4 = r6.f9477h
            r5 = 0
            r4 = r4[r5]
            r3.<init>(r4)
            java.lang.Object[] r7 = r6.n(r2, r1, r7, r3)
            o0.c r7 = r6.o(r7, r0, r1, r5)
            return r7
    }

    @Override // java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            int r0 = r3.size()
            be.h.m(r4, r0)
            int r0 = r3.p()
            if (r0 > r4) goto L10
            java.lang.Object[] r0 = r3.f9477h
            goto L24
        L10:
            java.lang.Object[] r0 = r3.f9476g
            int r1 = r3.f9479j
        L14:
            if (r1 <= 0) goto L24
            int r2 = g4.a.x(r4, r1)
            r0 = r0[r2]
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r1 + (-5)
            goto L14
        L24:
            r4 = r4 & 31
            r4 = r0[r4]
            return r4
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            int r0 = r1.f9478i
            return r0
    }

    @Override // o0.c
    public final o0.c h(int r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.size()
            be.h.m(r5, r0)
            int r0 = r4.p()
            java.lang.Object[] r1 = r4.f9476g
            java.lang.Object[] r2 = r4.f9477h
            int r3 = r4.f9479j
            if (r0 > r5) goto L27
            r0 = 32
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            r5 = r5 & 31
            r0[r5] = r6
            o0.e r5 = new o0.e
            int r6 = r4.size()
            r5.<init>(r1, r0, r6, r3)
            return r5
        L27:
            java.lang.Object[] r5 = q(r3, r5, r6, r1)
            o0.e r6 = new o0.e
            int r0 = r4.size()
            r6.<init>(r5, r2, r0, r3)
            return r6
    }

    public final o0.e j(java.lang.Object r7, int r8, java.lang.Object[] r9) {
            r6 = this;
            int r0 = r6.size()
            int r1 = r6.p()
            int r0 = r0 - r1
            java.lang.Object[] r1 = r6.f9477h
            r2 = 32
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r1, r2)
            if (r0 >= r2) goto L28
            int r2 = r8 + 1
            tf.l.n0(r2, r8, r1, r0, r3)
            r3[r8] = r7
            o0.e r7 = new o0.e
            int r8 = r6.size()
            int r8 = r8 + 1
            int r0 = r6.f9479j
            r7.<init>(r9, r3, r8, r0)
            return r7
        L28:
            r4 = 31
            r4 = r1[r4]
            int r5 = r8 + 1
            int r0 = r0 + (-1)
            tf.l.n0(r5, r8, r1, r0, r3)
            r3[r8] = r7
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r8 = 0
            r7[r8] = r4
            o0.e r7 = r6.l(r9, r3, r7)
            return r7
    }

    public final o0.e l(java.lang.Object[] r5, java.lang.Object[] r6, java.lang.Object[] r7) {
            r4 = this;
            int r0 = r4.size()
            int r0 = r0 >> 5
            r1 = 1
            int r2 = r4.f9479j
            int r3 = r1 << r2
            if (r0 <= r3) goto L25
            r0 = 32
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r5
            int r2 = r2 + 5
            java.lang.Object[] r5 = r4.m(r2, r0, r6)
            o0.e r6 = new o0.e
            int r0 = r4.size()
            int r0 = r0 + r1
            r6.<init>(r5, r7, r0, r2)
            return r6
        L25:
            java.lang.Object[] r5 = r4.m(r2, r5, r6)
            o0.e r6 = new o0.e
            int r0 = r4.size()
            int r0 = r0 + r1
            r6.<init>(r5, r7, r0, r2)
            return r6
    }

    @Override // tf.f, java.util.List
    public final java.util.ListIterator listIterator(int r8) {
            r7 = this;
            int r0 = r7.size()
            be.h.n(r8, r0)
            o0.g r1 = new o0.g
            int r3 = r7.size()
            int r0 = r7.f9479j
            int r0 = r0 / 5
            int r5 = r0 + 1
            java.lang.Object[] r4 = r7.f9476g
            java.lang.Object[] r6 = r7.f9477h
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    public final java.lang.Object[] m(int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = g4.a.x(r0, r4)
            r1 = 32
            if (r5 == 0) goto L13
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            goto L15
        L13:
            java.lang.Object[] r5 = new java.lang.Object[r1]
        L15:
            r1 = 5
            if (r4 != r1) goto L1b
            r5[r0] = r6
            return r5
        L1b:
            r2 = r5[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r4 = r4 - r1
            java.lang.Object[] r4 = r3.m(r4, r2, r6)
            r5[r0] = r4
            return r5
    }

    public final java.lang.Object[] n(java.lang.Object[] r6, int r7, int r8, h3.f r9) {
            r5 = this;
            int r0 = g4.a.x(r8, r7)
            r1 = 31
            r2 = 32
            if (r7 != 0) goto L21
            if (r0 != 0) goto Lf
            java.lang.Object[] r7 = new java.lang.Object[r2]
            goto L13
        Lf:
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r6, r2)
        L13:
            int r8 = r0 + 1
            tf.l.n0(r0, r8, r6, r2, r7)
            java.lang.Object r8 = r9.f5065a
            r7[r1] = r8
            r6 = r6[r0]
            r9.f5065a = r6
            return r7
        L21:
            r3 = r6[r1]
            if (r3 != 0) goto L2f
            int r1 = r5.p()
            int r1 = r1 + (-1)
            int r1 = g4.a.x(r1, r7)
        L2f:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            int r7 = r7 + (-5)
            int r2 = r0 + 1
            if (r2 > r1) goto L4c
        L39:
            r3 = r6[r1]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
            java.lang.Object[] r3 = r5.n(r3, r7, r4, r9)
            r6[r1] = r3
            if (r1 == r2) goto L4c
            int r1 = r1 + (-1)
            goto L39
        L4c:
            r1 = r6[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r7 = r5.n(r1, r7, r8, r9)
            r6[r0] = r7
            return r6
    }

    public final o0.c o(java.lang.Object[] r8, int r9, int r10, int r11) {
            r7 = this;
            int r0 = r7.size()
            int r0 = r0 - r9
            r1 = 0
            r2 = 32
            r3 = 1
            if (r0 != r3) goto L4b
            if (r10 != 0) goto L1c
            int r9 = r8.length
            r10 = 33
            if (r9 != r10) goto L16
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
        L16:
            o0.i r9 = new o0.i
            r9.<init>(r8)
            return r9
        L1c:
            h3.f r11 = new h3.f
            r11.<init>(r1)
            int r0 = r9 + (-1)
            java.lang.Object[] r8 = k(r8, r10, r0, r11)
            r8.getClass()
            java.lang.Object r11 = r11.f5065a
            r11.getClass()
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            r0 = r8[r3]
            if (r0 != 0) goto L45
            r0 = 0
            r8 = r8[r0]
            r8.getClass()
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            o0.e r0 = new o0.e
            int r10 = r10 + (-5)
            r0.<init>(r8, r11, r9, r10)
            return r0
        L45:
            o0.e r0 = new o0.e
            r0.<init>(r8, r11, r9, r10)
            return r0
        L4b:
            java.lang.Object[] r4 = r7.f9477h
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r2)
            int r5 = r0 + (-1)
            if (r11 >= r5) goto L5a
            int r6 = r11 + 1
            tf.l.n0(r11, r6, r4, r0, r2)
        L5a:
            r2[r5] = r1
            o0.e r11 = new o0.e
            int r9 = r9 + r0
            int r9 = r9 - r3
            r11.<init>(r8, r2, r9, r10)
            return r11
    }

    public final int p() {
            r1 = this;
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r0 = r0 & (-32)
            return r0
    }
}
