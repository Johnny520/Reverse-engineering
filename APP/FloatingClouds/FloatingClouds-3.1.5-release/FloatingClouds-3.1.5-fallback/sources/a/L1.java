package a;

/* JADX INFO: loaded from: classes.dex */
public final class L1<E> implements java.util.Collection<E>, java.util.Set<E> {
    public static final int[] e = null;
    public static final java.lang.Object[] f = null;
    public static java.lang.Object[] g;
    public static int h;
    public static java.lang.Object[] i;
    public static int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f158a;
    public java.lang.Object[] b;
    public int c;
    public a.I1 d;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            a.L1.e = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            a.L1.f = r0
            return
    }

    public L1() {
            r1 = this;
            r1.<init>()
            int[] r0 = a.L1.e
            r1.f158a = r0
            java.lang.Object[] r0 = a.L1.f
            r1.b = r0
            r0 = 0
            r1.c = r0
            return
    }

    public static void b(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 8
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 10
            r6 = 1
            if (r0 != r1) goto L2d
            java.lang.Class<a.L1> r0 = a.L1.class
            monitor-enter(r0)
            int r1 = a.L1.j     // Catch: java.lang.Throwable -> L20
            if (r1 >= r5) goto L29
            java.lang.Object[] r1 = a.L1.i     // Catch: java.lang.Throwable -> L20
            r8[r4] = r1     // Catch: java.lang.Throwable -> L20
            r8[r6] = r7     // Catch: java.lang.Throwable -> L20
            int r9 = r9 - r6
        L19:
            if (r9 < r3) goto L22
            r8[r9] = r2     // Catch: java.lang.Throwable -> L20
            int r9 = r9 + (-1)
            goto L19
        L20:
            r7 = move-exception
            goto L2b
        L22:
            a.L1.i = r8     // Catch: java.lang.Throwable -> L20
            int r7 = a.L1.j     // Catch: java.lang.Throwable -> L20
            int r7 = r7 + r6
            a.L1.j = r7     // Catch: java.lang.Throwable -> L20
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r7
        L2d:
            int r0 = r7.length
            r1 = 4
            if (r0 != r1) goto L53
            java.lang.Class<a.L1> r0 = a.L1.class
            monitor-enter(r0)
            int r1 = a.L1.h     // Catch: java.lang.Throwable -> L46
            if (r1 >= r5) goto L4f
            java.lang.Object[] r1 = a.L1.g     // Catch: java.lang.Throwable -> L46
            r8[r4] = r1     // Catch: java.lang.Throwable -> L46
            r8[r6] = r7     // Catch: java.lang.Throwable -> L46
            int r9 = r9 - r6
        L3f:
            if (r9 < r3) goto L48
            r8[r9] = r2     // Catch: java.lang.Throwable -> L46
            int r9 = r9 + (-1)
            goto L3f
        L46:
            r7 = move-exception
            goto L51
        L48:
            a.L1.g = r8     // Catch: java.lang.Throwable -> L46
            int r7 = a.L1.h     // Catch: java.lang.Throwable -> L46
            int r7 = r7 + r6
            a.L1.h = r7     // Catch: java.lang.Throwable -> L46
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r7
        L53:
            return
    }

    public final void a(int r6) {
            r5 = this;
            r0 = 8
            r1 = 0
            r2 = 0
            r3 = 1
            if (r6 != r0) goto L2d
            java.lang.Class<a.L1> r0 = a.L1.class
            monitor-enter(r0)
            java.lang.Object[] r4 = a.L1.i     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L29
            r5.b = r4     // Catch: java.lang.Throwable -> L27
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L27
            a.L1.i = r6     // Catch: java.lang.Throwable -> L27
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L27
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L27
            r5.f158a = r6     // Catch: java.lang.Throwable -> L27
            r4[r3] = r1     // Catch: java.lang.Throwable -> L27
            r4[r2] = r1     // Catch: java.lang.Throwable -> L27
            int r6 = a.L1.j     // Catch: java.lang.Throwable -> L27
            int r6 = r6 - r3
            a.L1.j = r6     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r6 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            goto L56
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r6
        L2d:
            r0 = 4
            if (r6 != r0) goto L56
            java.lang.Class<a.L1> r0 = a.L1.class
            monitor-enter(r0)
            java.lang.Object[] r4 = a.L1.g     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L52
            r5.b = r4     // Catch: java.lang.Throwable -> L50
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L50
            a.L1.g = r6     // Catch: java.lang.Throwable -> L50
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L50
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L50
            r5.f158a = r6     // Catch: java.lang.Throwable -> L50
            r4[r3] = r1     // Catch: java.lang.Throwable -> L50
            r4[r2] = r1     // Catch: java.lang.Throwable -> L50
            int r6 = a.L1.h     // Catch: java.lang.Throwable -> L50
            int r6 = r6 - r3
            a.L1.h = r6     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r6 = move-exception
            goto L54
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            goto L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r6
        L56:
            int[] r0 = new int[r6]
            r5.f158a = r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.b = r6
            return
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L9
            int r1 = r8.d()
            r2 = r0
            goto L14
        L9:
            int r1 = r9.hashCode()
            int r2 = r8.c(r1, r9)
            r7 = r2
            r2 = r1
            r1 = r7
        L14:
            if (r1 < 0) goto L17
            return r0
        L17:
            int r1 = ~r1
            int r3 = r8.c
            int[] r4 = r8.f158a
            int r5 = r4.length
            if (r3 < r5) goto L45
            r5 = 8
            if (r3 < r5) goto L27
            int r5 = r3 >> 1
            int r5 = r5 + r3
            goto L2c
        L27:
            r6 = 4
            if (r3 < r6) goto L2b
            goto L2c
        L2b:
            r5 = r6
        L2c:
            java.lang.Object[] r3 = r8.b
            r8.a(r5)
            int[] r5 = r8.f158a
            int r6 = r5.length
            if (r6 <= 0) goto L40
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r0, r5, r0, r6)
            java.lang.Object[] r5 = r8.b
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r0, r5, r0, r6)
        L40:
            int r0 = r8.c
            b(r4, r3, r0)
        L45:
            int r0 = r8.c
            if (r1 >= r0) goto L59
            int[] r3 = r8.f158a
            int r4 = r1 + 1
            int r0 = r0 - r1
            java.lang.System.arraycopy(r3, r1, r3, r4, r0)
            java.lang.Object[] r0 = r8.b
            int r3 = r8.c
            int r3 = r3 - r1
            java.lang.System.arraycopy(r0, r1, r0, r4, r3)
        L59:
            int[] r0 = r8.f158a
            r0[r1] = r2
            java.lang.Object[] r0 = r8.b
            r0[r1] = r9
            int r9 = r8.c
            r0 = 1
            int r9 = r9 + r0
            r8.c = r9
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection<? extends E> r6) {
            r5 = this;
            int r0 = r5.c
            int r1 = r6.size()
            int r1 = r1 + r0
            int[] r0 = r5.f158a
            int r2 = r0.length
            r3 = 0
            if (r2 >= r1) goto L27
            java.lang.Object[] r2 = r5.b
            r5.a(r1)
            int r1 = r5.c
            if (r1 <= 0) goto L22
            int[] r4 = r5.f158a
            java.lang.System.arraycopy(r0, r3, r4, r3, r1)
            java.lang.Object[] r1 = r5.b
            int r4 = r5.c
            java.lang.System.arraycopy(r2, r3, r1, r3, r4)
        L22:
            int r1 = r5.c
            b(r0, r2, r1)
        L27:
            java.util.Iterator r6 = r6.iterator()
        L2b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r6.next()
            boolean r0 = r5.add(r0)
            r3 = r3 | r0
            goto L2b
        L3b:
            return r3
    }

    public final int c(int r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.c
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r4.f158a
            int r1 = a.C0435w1.a(r0, r5, r1)
            if (r1 >= 0) goto Lf
            goto L19
        Lf:
            java.lang.Object[] r2 = r4.b
            r2 = r2[r1]
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L1a
        L19:
            return r1
        L1a:
            int r2 = r1 + 1
        L1c:
            if (r2 >= r0) goto L32
            int[] r3 = r4.f158a
            r3 = r3[r2]
            if (r3 != r5) goto L32
            java.lang.Object[] r3 = r4.b
            r3 = r3[r2]
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r2 = r2 + 1
            goto L1c
        L32:
            int r1 = r1 + (-1)
        L34:
            if (r1 < 0) goto L4a
            int[] r0 = r4.f158a
            r0 = r0[r1]
            if (r0 != r5) goto L4a
            java.lang.Object[] r0 = r4.b
            r0 = r0[r1]
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L47
            return r1
        L47:
            int r1 = r1 + (-1)
            goto L34
        L4a:
            int r5 = ~r2
            return r5
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
            r3 = this;
            int r0 = r3.c
            if (r0 == 0) goto L16
            int[] r1 = r3.f158a
            java.lang.Object[] r2 = r3.b
            b(r1, r2, r0)
            int[] r0 = a.L1.e
            r3.f158a = r0
            java.lang.Object[] r0 = a.L1.f
            r3.b = r0
            r0 = 0
            r3.c = r0
        L16:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.d()
            goto Lf
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.c(r0, r2)
        Lf:
            if (r2 < 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    public final int d() {
            r4 = this;
            int r0 = r4.c
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int[] r1 = r4.f158a
            r2 = 0
            int r1 = a.C0435w1.a(r0, r2, r1)
            if (r1 >= 0) goto L10
            goto L16
        L10:
            java.lang.Object[] r2 = r4.b
            r2 = r2[r1]
            if (r2 != 0) goto L17
        L16:
            return r1
        L17:
            int r2 = r1 + 1
        L19:
            if (r2 >= r0) goto L2b
            int[] r3 = r4.f158a
            r3 = r3[r2]
            if (r3 != 0) goto L2b
            java.lang.Object[] r3 = r4.b
            r3 = r3[r2]
            if (r3 != 0) goto L28
            return r2
        L28:
            int r2 = r2 + 1
            goto L19
        L2b:
            int r1 = r1 + (-1)
        L2d:
            if (r1 < 0) goto L3f
            int[] r0 = r4.f158a
            r0 = r0[r1]
            if (r0 != 0) goto L3f
            java.lang.Object[] r0 = r4.b
            r0 = r0[r1]
            if (r0 != 0) goto L3c
            return r1
        L3c:
            int r1 = r1 + (-1)
            goto L2d
        L3f:
            int r0 = ~r2
            return r0
    }

    public final void e(int r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.b
            r1 = r0[r8]
            int r1 = r7.c
            r2 = 0
            r3 = 1
            if (r1 > r3) goto L1a
            int[] r8 = r7.f158a
            b(r8, r0, r1)
            int[] r8 = a.L1.e
            r7.f158a = r8
            java.lang.Object[] r8 = a.L1.f
            r7.b = r8
            r7.c = r2
            return
        L1a:
            int[] r4 = r7.f158a
            int r5 = r4.length
            r6 = 8
            if (r5 <= r6) goto L55
            int r5 = r4.length
            int r5 = r5 / 3
            if (r1 >= r5) goto L55
            if (r1 <= r6) goto L2c
            int r5 = r1 >> 1
            int r6 = r1 + r5
        L2c:
            r7.a(r6)
            int r1 = r7.c
            int r1 = r1 - r3
            r7.c = r1
            if (r8 <= 0) goto L40
            int[] r1 = r7.f158a
            java.lang.System.arraycopy(r4, r2, r1, r2, r8)
            java.lang.Object[] r1 = r7.b
            java.lang.System.arraycopy(r0, r2, r1, r2, r8)
        L40:
            int r1 = r7.c
            if (r8 >= r1) goto L54
            int r2 = r8 + 1
            int[] r3 = r7.f158a
            int r1 = r1 - r8
            java.lang.System.arraycopy(r4, r2, r3, r8, r1)
            java.lang.Object[] r1 = r7.b
            int r3 = r7.c
            int r3 = r3 - r8
            java.lang.System.arraycopy(r0, r2, r1, r8, r3)
        L54:
            return
        L55:
            int r1 = r1 - r3
            r7.c = r1
            if (r8 >= r1) goto L68
            int r0 = r8 + 1
            int r1 = r1 - r8
            java.lang.System.arraycopy(r4, r0, r4, r8, r1)
            java.lang.Object[] r1 = r7.b
            int r2 = r7.c
            int r2 = r2 - r8
            java.lang.System.arraycopy(r1, r0, r1, r8, r2)
        L68:
            java.lang.Object[] r8 = r7.b
            int r0 = r7.c
            r1 = 0
            r8[r0] = r1
            return
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L28
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.c
            int r3 = r5.size()
            if (r1 == r3) goto L14
            return r2
        L14:
            r1 = r2
        L15:
            int r3 = r4.c     // Catch: java.lang.Throwable -> L28
            if (r1 >= r3) goto L27
            java.lang.Object[] r3 = r4.b     // Catch: java.lang.Throwable -> L28
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L28
            boolean r3 = r5.contains(r3)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L24
            return r2
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            return r0
        L28:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
            r5 = this;
            int[] r0 = r5.f158a
            int r1 = r5.c
            r2 = 0
            r3 = r2
        L6:
            if (r2 >= r1) goto Le
            r4 = r0[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        Le:
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.c
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<E> iterator() {
            r2 = this;
            a.I1 r0 = r2.d
            if (r0 != 0) goto Lc
            a.I1 r0 = new a.I1
            r1 = 1
            r0.<init>(r1, r2)
            r2.d = r0
        Lc:
            a.I1 r0 = r2.d
            a.Z9<K, V>$c r1 = r0.b
            if (r1 != 0) goto L19
            a.Z9$c r1 = new a.Z9$c
            r1.<init>(r0)
            r0.b = r1
        L19:
            a.Z9<K, V>$c r0 = r0.b
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.d()
            goto Lf
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.c(r0, r2)
        Lf:
            if (r2 < 0) goto L16
            r1.e(r2)
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L5
        L15:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection<?> r5) {
            r4 = this;
            int r0 = r4.c
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L5:
            if (r0 < 0) goto L18
            java.lang.Object[] r3 = r4.b
            r3 = r3[r0]
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L15
            r4.e(r0)
            r2 = r1
        L15:
            int r0 = r0 + (-1)
            goto L5
        L18:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
            r4 = this;
            int r0 = r4.c
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r4.b
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.c
            if (r0 >= r1) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            int r0 = r3.c
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            java.lang.Object[] r0 = r3.b
            int r1 = r3.c
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.c
            if (r0 <= r1) goto L25
            r0 = 0
            r4[r1] = r0
        L25:
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.c
            int r1 = r1 * 14
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r3.c
            if (r1 >= r2) goto L35
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object[] r2 = r3.b
            r2 = r2[r1]
            if (r2 == r3) goto L2d
            r0.append(r2)
            goto L32
        L2d:
            java.lang.String r2 = "(this Set)"
            r0.append(r2)
        L32:
            int r1 = r1 + 1
            goto L18
        L35:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
