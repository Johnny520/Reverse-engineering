package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class u30 {
    public static java.lang.Object[] d;
    public static int e;
    public static java.lang.Object[] f;
    public static int g;
    public int[] a;
    public java.lang.Object[] b;
    public int c;

    public u30() {
            r1 = this;
            r1.<init>()
            int[] r0 = defpackage.ff.k
            r1.a = r0
            java.lang.Object[] r0 = defpackage.ff.l
            r1.b = r0
            r0 = 0
            r1.c = r0
            return
    }

    public static void c(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 8
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 10
            r6 = 1
            if (r0 != r1) goto L2f
            java.lang.Class<u30> r0 = defpackage.u30.class
            monitor-enter(r0)
            int r1 = defpackage.u30.g     // Catch: java.lang.Throwable -> L22
            if (r1 >= r5) goto L2b
            java.lang.Object[] r1 = defpackage.u30.f     // Catch: java.lang.Throwable -> L22
            r8[r4] = r1     // Catch: java.lang.Throwable -> L22
            r8[r6] = r7     // Catch: java.lang.Throwable -> L22
            int r7 = r9 << 1
            int r7 = r7 - r6
        L1b:
            if (r7 < r3) goto L24
            r8[r7] = r2     // Catch: java.lang.Throwable -> L22
            int r7 = r7 + (-1)
            goto L1b
        L22:
            r7 = move-exception
            goto L2d
        L24:
            defpackage.u30.f = r8     // Catch: java.lang.Throwable -> L22
            int r7 = defpackage.u30.g     // Catch: java.lang.Throwable -> L22
            int r7 = r7 + r6
            defpackage.u30.g = r7     // Catch: java.lang.Throwable -> L22
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r7
        L2f:
            int r0 = r7.length
            r1 = 4
            if (r0 != r1) goto L57
            java.lang.Class<u30> r0 = defpackage.u30.class
            monitor-enter(r0)
            int r1 = defpackage.u30.e     // Catch: java.lang.Throwable -> L4a
            if (r1 >= r5) goto L53
            java.lang.Object[] r1 = defpackage.u30.d     // Catch: java.lang.Throwable -> L4a
            r8[r4] = r1     // Catch: java.lang.Throwable -> L4a
            r8[r6] = r7     // Catch: java.lang.Throwable -> L4a
            int r7 = r9 << 1
            int r7 = r7 - r6
        L43:
            if (r7 < r3) goto L4c
            r8[r7] = r2     // Catch: java.lang.Throwable -> L4a
            int r7 = r7 + (-1)
            goto L43
        L4a:
            r7 = move-exception
            goto L55
        L4c:
            defpackage.u30.d = r8     // Catch: java.lang.Throwable -> L4a
            int r7 = defpackage.u30.e     // Catch: java.lang.Throwable -> L4a
            int r7 = r7 + r6
            defpackage.u30.e = r7     // Catch: java.lang.Throwable -> L4a
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r7
        L57:
            return
    }

    public final void a(int r6) {
            r5 = this;
            r0 = 8
            r1 = 0
            r2 = 0
            r3 = 1
            if (r6 != r0) goto L2d
            java.lang.Class<u30> r0 = defpackage.u30.class
            monitor-enter(r0)
            java.lang.Object[] r4 = defpackage.u30.f     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L29
            r5.b = r4     // Catch: java.lang.Throwable -> L27
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L27
            defpackage.u30.f = r6     // Catch: java.lang.Throwable -> L27
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L27
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L27
            r5.a = r6     // Catch: java.lang.Throwable -> L27
            r4[r3] = r1     // Catch: java.lang.Throwable -> L27
            r4[r2] = r1     // Catch: java.lang.Throwable -> L27
            int r6 = defpackage.u30.g     // Catch: java.lang.Throwable -> L27
            int r6 = r6 - r3
            defpackage.u30.g = r6     // Catch: java.lang.Throwable -> L27
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
            java.lang.Class<u30> r0 = defpackage.u30.class
            monitor-enter(r0)
            java.lang.Object[] r4 = defpackage.u30.d     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L52
            r5.b = r4     // Catch: java.lang.Throwable -> L50
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L50
            defpackage.u30.d = r6     // Catch: java.lang.Throwable -> L50
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L50
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L50
            r5.a = r6     // Catch: java.lang.Throwable -> L50
            r4[r3] = r1     // Catch: java.lang.Throwable -> L50
            r4[r2] = r1     // Catch: java.lang.Throwable -> L50
            int r6 = defpackage.u30.e     // Catch: java.lang.Throwable -> L50
            int r6 = r6 - r3
            defpackage.u30.e = r6     // Catch: java.lang.Throwable -> L50
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
            r5.a = r0
            int r6 = r6 << r3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.b = r6
            return
    }

    public final void b(int r6) {
            r5 = this;
            int r0 = r5.c
            int[] r1 = r5.a
            int r2 = r1.length
            if (r2 >= r6) goto L20
            java.lang.Object[] r2 = r5.b
            r5.a(r6)
            int r6 = r5.c
            if (r6 <= 0) goto L1d
            int[] r6 = r5.a
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r6, r3, r0)
            java.lang.Object[] r6 = r5.b
            int r4 = r0 << 1
            java.lang.System.arraycopy(r2, r3, r6, r3, r4)
        L1d:
            c(r1, r2, r0)
        L20:
            int r6 = r5.c
            if (r6 != r0) goto L25
            return
        L25:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
    }

    public final void clear() {
            r4 = this;
            int r0 = r4.c
            if (r0 <= 0) goto L16
            int[] r1 = r4.a
            java.lang.Object[] r2 = r4.b
            int[] r3 = defpackage.ff.k
            r4.a = r3
            java.lang.Object[] r3 = defpackage.ff.l
            r4.b = r3
            r3 = 0
            r4.c = r3
            c(r1, r2, r0)
        L16:
            int r0 = r4.c
            if (r0 > 0) goto L1b
            return
        L1b:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.e(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.g(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final int d(int r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.c
            if (r0 != 0) goto L6
            r6 = -1
            return r6
        L6:
            int[] r1 = r5.a
            int r1 = defpackage.ff.c(r0, r6, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L52
            if (r1 >= 0) goto Lf
            goto L1b
        Lf:
            java.lang.Object[] r2 = r5.b
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L1c
        L1b:
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r5.a
            r3 = r3[r2]
            if (r3 != r6) goto L36
            java.lang.Object[] r3 = r5.b
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r1 = r1 + (-1)
        L38:
            if (r1 < 0) goto L50
            int[] r0 = r5.a
            r0 = r0[r1]
            if (r0 != r6) goto L50
            java.lang.Object[] r0 = r5.b
            int r3 = r1 << 1
            r0 = r0[r3]
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4d
            return r1
        L4d:
            int r1 = r1 + (-1)
            goto L38
        L50:
            int r6 = ~r2
            return r6
        L52:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
    }

    public final int e(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.f()
            return r2
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.d(r0, r2)
            return r2
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.u30
            r2 = 0
            if (r1 == 0) goto L3b
            u30 r7 = (defpackage.u30) r7
            int r1 = r6.c
            int r3 = r7.c
            if (r1 == r3) goto L12
            return r2
        L12:
            r1 = r2
        L13:
            int r3 = r6.c     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r3) goto L39
            java.lang.Object r3 = r6.h(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = r6.j(r1)     // Catch: java.lang.Throwable -> L3a
            r5 = 0
            java.lang.Object r5 = r7.getOrDefault(r3, r5)     // Catch: java.lang.Throwable -> L3a
            if (r4 != 0) goto L2f
            if (r5 != 0) goto L2e
            boolean r3 = r7.containsKey(r3)     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L36
        L2e:
            return r2
        L2f:
            boolean r3 = r4.equals(r5)     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L36
            return r2
        L36:
            int r1 = r1 + 1
            goto L13
        L39:
            return r0
        L3a:
            return r2
        L3b:
            boolean r1 = r7 instanceof java.util.Map
            if (r1 == 0) goto L71
            java.util.Map r7 = (java.util.Map) r7
            int r1 = r6.c
            int r3 = r7.size()
            if (r1 == r3) goto L4a
            return r2
        L4a:
            r1 = r2
        L4b:
            int r3 = r6.c     // Catch: java.lang.Throwable -> L71
            if (r1 >= r3) goto L70
            java.lang.Object r3 = r6.h(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.Object r4 = r6.j(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.Object r5 = r7.get(r3)     // Catch: java.lang.Throwable -> L71
            if (r4 != 0) goto L66
            if (r5 != 0) goto L65
            boolean r3 = r7.containsKey(r3)     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto L6d
        L65:
            return r2
        L66:
            boolean r3 = r4.equals(r5)     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto L6d
            return r2
        L6d:
            int r1 = r1 + 1
            goto L4b
        L70:
            return r0
        L71:
            return r2
    }

    public final int f() {
            r5 = this;
            int r0 = r5.c
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int[] r1 = r5.a
            r2 = 0
            int r1 = defpackage.ff.c(r0, r2, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L47
            if (r1 >= 0) goto L10
            goto L18
        L10:
            java.lang.Object[] r2 = r5.b
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
        L18:
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r5.a
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r5.b
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            int r1 = r1 + (-1)
        L31:
            if (r1 < 0) goto L45
            int[] r0 = r5.a
            r0 = r0[r1]
            if (r0 != 0) goto L45
            java.lang.Object[] r0 = r5.b
            int r3 = r1 << 1
            r0 = r0[r3]
            if (r0 != 0) goto L42
            return r1
        L42:
            int r1 = r1 + (-1)
            goto L31
        L45:
            int r0 = ~r2
            return r0
        L47:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public final int g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.c
            int r0 = r0 * 2
            java.lang.Object[] r1 = r5.b
            r2 = 1
            if (r6 != 0) goto L15
            r6 = r2
        La:
            if (r6 >= r0) goto L26
            r3 = r1[r6]
            if (r3 != 0) goto L12
            int r6 = r6 >> r2
            return r6
        L12:
            int r6 = r6 + 2
            goto La
        L15:
            r3 = r2
        L16:
            if (r3 >= r0) goto L26
            r4 = r1[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L23
            int r6 = r3 >> 1
            return r6
        L23:
            int r3 = r3 + 2
            goto L16
        L26:
            r6 = -1
            return r6
    }

    public final java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r0)
            return r2
    }

    public final java.lang.Object getOrDefault(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.e(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r2 = r0.b
            int r1 = r1 << 1
            int r1 = r1 + 1
            r1 = r2[r1]
            return r1
        Lf:
            return r2
    }

    public final java.lang.Object h(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.b
            int r2 = r2 << 1
            r2 = r0[r2]
            return r2
    }

    public final int hashCode() {
            r9 = this;
            int[] r0 = r9.a
            java.lang.Object[] r1 = r9.b
            int r2 = r9.c
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r5
        La:
            if (r5 >= r2) goto L1f
            r7 = r1[r4]
            r8 = r0[r5]
            if (r7 != 0) goto L14
            r7 = r3
            goto L18
        L14:
            int r7 = r7.hashCode()
        L18:
            r7 = r7 ^ r8
            int r6 = r6 + r7
            int r5 = r5 + 1
            int r4 = r4 + 2
            goto La
        L1f:
            return r6
    }

    public final java.lang.Object i(int r11) {
            r10 = this;
            java.lang.Object[] r0 = r10.b
            int r1 = r11 << 1
            int r2 = r1 + 1
            r2 = r0[r2]
            int r3 = r10.c
            r4 = 0
            r5 = 1
            if (r3 > r5) goto L1c
            int[] r11 = r10.a
            c(r11, r0, r3)
            int[] r11 = defpackage.ff.k
            r10.a = r11
            java.lang.Object[] r11 = defpackage.ff.l
            r10.b = r11
            goto L79
        L1c:
            int r6 = r3 + (-1)
            int[] r7 = r10.a
            int r8 = r7.length
            r9 = 8
            if (r8 <= r9) goto L5e
            int r8 = r7.length
            int r8 = r8 / 3
            if (r3 >= r8) goto L5e
            if (r3 <= r9) goto L30
            int r8 = r3 >> 1
            int r9 = r3 + r8
        L30:
            r10.a(r9)
            int r8 = r10.c
            if (r3 != r8) goto L58
            if (r11 <= 0) goto L43
            int[] r8 = r10.a
            java.lang.System.arraycopy(r7, r4, r8, r4, r11)
            java.lang.Object[] r8 = r10.b
            java.lang.System.arraycopy(r0, r4, r8, r4, r1)
        L43:
            if (r11 >= r6) goto L78
            int r4 = r11 + 1
            int[] r8 = r10.a
            int r9 = r6 - r11
            java.lang.System.arraycopy(r7, r4, r8, r11, r9)
            int r11 = r4 << 1
            java.lang.Object[] r4 = r10.b
            int r5 = r9 << 1
            java.lang.System.arraycopy(r0, r11, r4, r1, r5)
            goto L78
        L58:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
        L5e:
            if (r11 >= r6) goto L6e
            int r0 = r11 + 1
            int r4 = r6 - r11
            java.lang.System.arraycopy(r7, r0, r7, r11, r4)
            java.lang.Object[] r11 = r10.b
            int r0 = r0 << r5
            int r4 = r4 << r5
            java.lang.System.arraycopy(r11, r0, r11, r1, r4)
        L6e:
            java.lang.Object[] r11 = r10.b
            int r0 = r6 << 1
            r1 = 0
            r11[r0] = r1
            int r0 = r0 + r5
            r11[r0] = r1
        L78:
            r4 = r6
        L79:
            int r11 = r10.c
            if (r3 != r11) goto L80
            r10.c = r4
            return r2
        L80:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
    }

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

    public final java.lang.Object j(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.b
            int r2 = r2 << 1
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    public final java.lang.Object put(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.c
            r1 = 0
            if (r10 != 0) goto Lb
            int r2 = r9.f()
            r3 = r1
            goto L16
        Lb:
            int r2 = r10.hashCode()
            int r3 = r9.d(r2, r10)
            r8 = r3
            r3 = r2
            r2 = r8
        L16:
            if (r2 < 0) goto L23
            int r10 = r2 << 1
            int r10 = r10 + 1
            java.lang.Object[] r0 = r9.b
            r1 = r0[r10]
            r0[r10] = r11
            return r1
        L23:
            int r2 = ~r2
            int[] r4 = r9.a
            int r5 = r4.length
            if (r0 < r5) goto L58
            r5 = 8
            if (r0 < r5) goto L31
            int r5 = r0 >> 1
            int r5 = r5 + r0
            goto L36
        L31:
            r6 = 4
            if (r0 < r6) goto L35
            goto L36
        L35:
            r5 = r6
        L36:
            java.lang.Object[] r6 = r9.b
            r9.a(r5)
            int r5 = r9.c
            if (r0 != r5) goto L52
            int[] r5 = r9.a
            int r7 = r5.length
            if (r7 <= 0) goto L4e
            int r7 = r4.length
            java.lang.System.arraycopy(r4, r1, r5, r1, r7)
            java.lang.Object[] r5 = r9.b
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r1, r5, r1, r7)
        L4e:
            c(r4, r6, r0)
            goto L58
        L52:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L58:
            if (r2 >= r0) goto L71
            int[] r1 = r9.a
            int r4 = r2 + 1
            int r5 = r0 - r2
            java.lang.System.arraycopy(r1, r2, r1, r4, r5)
            java.lang.Object[] r1 = r9.b
            int r5 = r2 << 1
            int r4 = r4 << 1
            int r6 = r9.c
            int r6 = r6 - r2
            int r6 = r6 << 1
            java.lang.System.arraycopy(r1, r5, r1, r4, r6)
        L71:
            int r1 = r9.c
            if (r0 != r1) goto L8c
            int[] r0 = r9.a
            int r4 = r0.length
            if (r2 >= r4) goto L8c
            r0[r2] = r3
            java.lang.Object[] r0 = r9.b
            int r2 = r2 << 1
            r0[r2] = r10
            int r2 = r2 + 1
            r0[r2] = r11
            int r1 = r1 + 1
            r9.c = r1
            r10 = 0
            return r10
        L8c:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
    }

    public final java.lang.Object putIfAbsent(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = r1.getOrDefault(r2, r0)
            if (r0 != 0) goto Lc
            java.lang.Object r2 = r1.put(r2, r3)
            return r2
        Lc:
            return r0
    }

    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.e(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r1 = r0.i(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public final boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r1.e(r2)
            if (r2 < 0) goto L19
            java.lang.Object r0 = r1.j(r2)
            if (r3 == r0) goto L14
            if (r3 == 0) goto L19
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L19
        L14:
            r1.i(r2)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public final java.lang.Object replace(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r3 = r2.e(r3)
            if (r3 < 0) goto L11
            int r3 = r3 << 1
            int r3 = r3 + 1
            java.lang.Object[] r0 = r2.b
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        L11:
            r3 = 0
            return r3
    }

    public final boolean replace(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r3 = r2.e(r3)
            if (r3 < 0) goto L1e
            java.lang.Object r0 = r2.j(r3)
            if (r0 == r4) goto L14
            if (r4 == 0) goto L1e
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1e
        L14:
            r4 = 1
            int r3 = r3 << r4
            int r3 = r3 + r4
            java.lang.Object[] r0 = r2.b
            r1 = r0[r3]
            r0[r3] = r5
            return r4
        L1e:
            r3 = 0
            return r3
    }

    public final int size() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.c
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.c
            if (r1 >= r2) goto L47
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object r2 = r4.h(r1)
            java.lang.String r3 = "(this Map)"
            if (r2 == r4) goto L2f
            r0.append(r2)
            goto L32
        L2f:
            r0.append(r3)
        L32:
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.j(r1)
            if (r2 == r4) goto L41
            r0.append(r2)
            goto L44
        L41:
            r0.append(r3)
        L44:
            int r1 = r1 + 1
            goto L18
        L47:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
