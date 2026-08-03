package tf;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends tf.r {
    public static java.lang.String A1(java.lang.Iterable r7, java.lang.CharSequence r8, java.lang.String r9, java.lang.String r10, fg.l r11, int r12) {
            r0 = r12 & 1
            if (r0 == 0) goto L6
            java.lang.String r8 = ", "
        L6:
            r2 = r8
            r8 = r12 & 2
            java.lang.String r0 = ""
            if (r8 == 0) goto Lf
            r3 = r0
            goto L10
        Lf:
            r3 = r9
        L10:
            r8 = r12 & 4
            if (r8 == 0) goto L16
            r4 = r0
            goto L17
        L16:
            r4 = r10
        L17:
            r8 = r12 & 32
            if (r8 == 0) goto L1c
            r11 = 0
        L1c:
            r6 = r11
            r7.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "..."
            r0 = r7
            y1(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r7 = r1.toString()
            return r7
    }

    public static java.lang.Object B1(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L14
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
        L14:
            java.lang.String r1 = "List is empty."
            j8.o.l(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object C1(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            r1 = 0
            return r1
        Lb:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static java.lang.Comparable D1(java.lang.Iterable r3) {
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L12
            r0 = r1
            goto L12
        L26:
            return r0
    }

    public static java.lang.Object E1(java.util.ArrayList r3, java.util.Comparator r4) {
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            java.lang.Object r0 = r3.next()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L10
            r0 = r1
            goto L10
        L22:
            return r0
    }

    public static java.util.ArrayList F1(java.util.Collection r3, java.lang.Iterable r4) {
            r3.getClass()
            r4.getClass()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L21
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            java.util.Collection r4 = (java.util.Collection) r4
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            r0.addAll(r3)
            r0.addAll(r4)
            return r0
        L21:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            tf.r.h1(r0, r4)
            return r0
    }

    public static java.util.ArrayList G1(java.util.Collection r2, java.lang.Object r3) {
            r2.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.addAll(r2)
            r0.add(r3)
            return r0
    }

    public static java.lang.Object H1(java.util.List r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L16
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        Lf:
            java.lang.String r2 = "List has more than one element."
            j8.o.t(r2)
            r2 = 0
            return r2
        L16:
            java.lang.String r2 = "List is empty."
            j8.o.l(r2)
            r2 = 0
            return r2
    }

    public static java.lang.Object I1(java.util.List r2) {
            r2.getClass()
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L10
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        L10:
            r2 = 0
            return r2
    }

    public static java.util.List J1(java.lang.Iterable r3) {
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L34
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L16
            java.util.List r3 = P1(r3)
            return r3
        L16:
            r3 = 0
            java.lang.Comparable[] r3 = new java.lang.Comparable[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            r0 = r3
            java.lang.Comparable[] r0 = (java.lang.Comparable[]) r0
            r0.getClass()
            int r1 = r0.length
            if (r1 <= r2) goto L29
            java.util.Arrays.sort(r0)
        L29:
            r3.getClass()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r3.getClass()
            return r3
        L34:
            java.util.List r3 = S1(r3)
            tf.q.f1(r3)
            return r3
    }

    public static java.util.List K1(java.lang.Iterable r3, java.util.Comparator r4) {
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L2e
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L16
            java.util.List r3 = P1(r3)
            return r3
        L16:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            r3.getClass()
            int r0 = r3.length
            if (r0 <= r2) goto L26
            java.util.Arrays.sort(r3, r4)
        L26:
            java.util.List r3 = java.util.Arrays.asList(r3)
            r3.getClass()
            return r3
        L2e:
            java.util.List r3 = S1(r3)
            tf.q.g1(r3, r4)
            return r3
    }

    public static java.util.List L1(int r4, java.lang.Iterable r5) {
            r5.getClass()
            if (r4 < 0) goto L47
            if (r4 != 0) goto La
            tf.t r4 = tf.t.f13167g
            return r4
        La:
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L28
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            if (r4 < r0) goto L1d
            java.util.List r4 = P1(r5)
            return r4
        L1d:
            if (r4 != r1) goto L28
            java.lang.Object r4 = s1(r5)
            java.util.List r4 = a.a.x0(r4)
            return r4
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        L32:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r5.next()
            r0.add(r3)
            int r2 = r2 + r1
            if (r2 != r4) goto L32
        L42:
            java.util.List r4 = a.a.G0(r0)
            return r4
        L47:
            java.lang.String r5 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r4 = eh.a.m(r4, r5, r0)
            j8.o.q(r4)
            r4 = 0
            return r4
    }

    public static java.util.List M1(int r3, java.util.List r4) {
            r4.getClass()
            if (r3 < 0) goto L4c
            if (r3 != 0) goto La
            tf.t r3 = tf.t.f13167g
            return r3
        La:
            int r0 = r4.size()
            if (r3 < r0) goto L15
            java.util.List r3 = P1(r4)
            return r3
        L15:
            r1 = 1
            if (r3 != r1) goto L21
            java.lang.Object r3 = B1(r4)
            java.util.List r3 = a.a.x0(r3)
            return r3
        L21:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            boolean r2 = r4 instanceof java.util.RandomAccess
            if (r2 == 0) goto L38
            int r3 = r0 - r3
        L2c:
            if (r3 >= r0) goto L4b
            java.lang.Object r2 = r4.get(r3)
            r1.add(r2)
            int r3 = r3 + 1
            goto L2c
        L38:
            int r0 = r0 - r3
            java.util.ListIterator r3 = r4.listIterator(r0)
        L3d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            r1.add(r4)
            goto L3d
        L4b:
            return r1
        L4c:
            java.lang.String r4 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r3 = eh.a.m(r3, r4, r0)
            j8.o.q(r3)
            r3 = 0
            return r3
    }

    public static void N1(java.lang.Iterable r1, java.util.AbstractCollection r2) {
            r1.getClass()
            java.util.Iterator r1 = r1.iterator()
        L7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L7
        L15:
            return
    }

    public static int[] O1(java.util.ArrayList r4) {
            int r0 = r4.size()
            int[] r0 = new int[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto Lb
        L21:
            return r0
    }

    public static java.util.List P1(java.lang.Iterable r3) {
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L35
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            if (r1 == 0) goto L32
            r2 = 1
            if (r1 == r2) goto L19
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            return r3
        L19:
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L25
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L2d
        L25:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
        L2d:
            java.util.List r3 = a.a.x0(r3)
            return r3
        L32:
            tf.t r3 = tf.t.f13167g
            return r3
        L35:
            java.util.List r3 = S1(r3)
            java.util.List r3 = a.a.G0(r3)
            return r3
    }

    public static long[] Q1(java.util.ArrayList r5) {
            int r0 = r5.size()
            long[] r0 = new long[r0]
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        Lb:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r5.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            int r4 = r1 + 1
            r0[r1] = r2
            r1 = r4
            goto Lb
        L21:
            return r0
    }

    public static java.util.ArrayList R1(java.util.Collection r1) {
            r1.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    public static final java.util.List S1(java.lang.Iterable r1) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lf
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            N1(r1, r0)
            return r0
    }

    public static java.util.Set T1(java.lang.Iterable r1) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lf
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        Lf:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            N1(r1, r0)
            return r0
    }

    public static java.util.Set U1(java.lang.Iterable r3) {
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L3d
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r2 = r0.size()
            if (r2 == 0) goto L5b
            if (r2 == r1) goto L24
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            int r0 = r0.size()
            int r0 = tf.y.a0(r0)
            r1.<init>(r0)
            N1(r3, r1)
            return r1
        L24:
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L30
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L38
        L30:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
        L38:
            java.util.Set r3 = ac.p.N(r3)
            return r3
        L3d:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            N1(r3, r0)
            int r3 = r0.size()
            if (r3 == 0) goto L5b
            if (r3 == r1) goto L4e
            return r0
        L4e:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
            java.util.Set r3 = ac.p.N(r3)
            return r3
        L5b:
            tf.v r3 = tf.v.f13169g
            return r3
    }

    public static final int k1(int r4, java.util.List r5) {
            r0 = 1
            if (r4 < 0) goto L11
            int r1 = r5.size()
            int r1 = r1 - r0
            if (r4 > r1) goto L11
            int r5 = r5.size()
            int r5 = r5 - r0
            int r5 = r5 - r4
            return r5
        L11:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Element index "
            java.lang.String r3 = " must be in range ["
            java.lang.StringBuilder r4 = eh.a.t(r4, r2, r3)
            lg.d r2 = new lg.d
            int r5 = r5.size()
            int r5 = r5 - r0
            r3 = 0
            r2.<init>(r3, r5, r0)
            r4.append(r2)
            java.lang.String r5 = "]."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
    }

    public static final int l1(int r4, java.util.List r5) {
            if (r4 < 0) goto Le
            int r0 = r5.size()
            if (r4 > r0) goto Le
            int r5 = r5.size()
            int r5 = r5 - r4
            return r5
        Le:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Position index "
            java.lang.String r2 = " must be in range ["
            java.lang.StringBuilder r4 = eh.a.t(r4, r1, r2)
            lg.d r1 = new lg.d
            int r5 = r5.size()
            r2 = 1
            r3 = 0
            r1.<init>(r3, r5, r2)
            r4.append(r1)
            java.lang.String r5 = "]."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public static dg.n m1(java.lang.Iterable r2) {
            r2.getClass()
            dg.n r0 = new dg.n
            r1 = 6
            r0.<init>(r2, r1)
            return r0
    }

    public static java.util.ArrayList n1(int r8, java.util.List r9) {
            r9.getClass()
            if (r8 <= 0) goto L74
            if (r8 <= 0) goto L74
            boolean r0 = r9 instanceof java.util.RandomAccess
            if (r0 == 0) goto L44
            int r0 = r9.size()
            int r1 = r0 / r8
            int r2 = r0 % r8
            r3 = 0
            if (r2 != 0) goto L18
            r2 = r3
            goto L19
        L18:
            r2 = 1
        L19:
            int r1 = r1 + r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r1 = r3
        L20:
            if (r1 < 0) goto L43
            if (r1 >= r0) goto L43
            int r4 = r0 - r1
            if (r8 <= r4) goto L29
            goto L2a
        L29:
            r4 = r8
        L2a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r6 = r3
        L30:
            if (r6 >= r4) goto L3e
            int r7 = r6 + r1
            java.lang.Object r7 = r9.get(r7)
            r5.add(r7)
            int r6 = r6 + 1
            goto L30
        L3e:
            r2.add(r5)
            int r1 = r1 + r8
            goto L20
        L43:
            return r2
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            r9.getClass()
            boolean r1 = r9.hasNext()
            if (r1 != 0) goto L59
            tf.s r8 = tf.s.f13166g
            goto L63
        L59:
            tf.e0 r1 = new tf.e0
            r2 = 0
            r1.<init>(r8, r8, r9, r2)
            ng.k r8 = fb.v0.B(r1)
        L63:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L73
            java.lang.Object r9 = r8.next()
            java.util.List r9 = (java.util.List) r9
            r0.add(r9)
            goto L63
        L73:
            return r0
        L74:
            java.lang.String r9 = "size "
            java.lang.String r0 = " must be greater than zero."
            java.lang.String r8 = eh.a.m(r8, r9, r0)
            j8.o.q(r8)
            r8 = 0
            return r8
    }

    public static boolean o1(java.lang.Iterable r3, java.lang.Object r4) {
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.contains(r4)
            return r3
        Le:
            boolean r0 = r3 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.indexOf(r4)
            goto L3c
        L1a:
            java.util.Iterator r3 = r3.iterator()
            r0 = r1
        L1f:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r3.next()
            if (r0 < 0) goto L36
            boolean r2 = gg.l.a(r4, r2)
            if (r2 == 0) goto L33
            r3 = r0
            goto L3c
        L33:
            int r0 = r0 + 1
            goto L1f
        L36:
            a.a.Q0()
            r3 = 0
            throw r3
        L3b:
            r3 = -1
        L3c:
            if (r3 < 0) goto L40
            r3 = 1
            return r3
        L40:
            return r1
    }

    public static java.util.List p1(java.lang.Iterable r0) {
            r0.getClass()
            java.util.Set r0 = T1(r0)
            java.util.List r0 = P1(r0)
            return r0
    }

    public static java.util.List q1(int r3, java.lang.Iterable r4) {
            r4.getClass()
            if (r3 < 0) goto La7
            if (r3 != 0) goto Lc
            java.util.List r3 = P1(r4)
            return r3
        Lc:
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L85
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            int r0 = r0 - r3
            if (r0 > 0) goto L1d
            tf.t r3 = tf.t.f13167g
            return r3
        L1d:
            r1 = 1
            if (r0 != r1) goto L51
            boolean r3 = r4 instanceof java.util.List
            if (r3 == 0) goto L2b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = B1(r4)
            goto L45
        L2b:
            java.util.Iterator r3 = r4.iterator()
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r3.next()
        L39:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r4 = r3.next()
            goto L39
        L44:
            r3 = r4
        L45:
            java.util.List r3 = a.a.x0(r3)
            return r3
        L4a:
            java.lang.String r3 = "Collection is empty."
            j8.o.l(r3)
        L4f:
            r3 = 0
            return r3
        L51:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L8a
            boolean r0 = r4 instanceof java.util.RandomAccess
            if (r0 == 0) goto L70
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
        L64:
            if (r3 >= r0) goto L84
            java.lang.Object r2 = r4.get(r3)
            r1.add(r2)
            int r3 = r3 + 1
            goto L64
        L70:
            java.util.List r4 = (java.util.List) r4
            java.util.ListIterator r3 = r4.listIterator(r3)
        L76:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L84
            java.lang.Object r4 = r3.next()
            r1.add(r4)
            goto L76
        L84:
            return r1
        L85:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L8a:
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L8f:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r4.next()
            if (r0 < r3) goto L9f
            r1.add(r2)
            goto L8f
        L9f:
            int r0 = r0 + 1
            goto L8f
        La2:
            java.util.List r3 = a.a.G0(r1)
            return r3
        La7:
            java.lang.String r4 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r3 = eh.a.m(r3, r4, r0)
            j8.o.q(r3)
            goto L4f
    }

    public static java.util.List r1(int r1, java.util.List r2) {
            if (r1 < 0) goto Lf
            int r0 = r2.size()
            int r0 = r0 - r1
            if (r0 >= 0) goto La
            r0 = 0
        La:
            java.util.List r1 = L1(r0, r2)
            return r1
        Lf:
            java.lang.String r2 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = eh.a.m(r1, r2, r0)
            j8.o.q(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object s1(java.lang.Iterable r1) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Le
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = t1(r1)
            return r1
        Le:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r1 = r1.next()
            return r1
        L1d:
            java.lang.String r1 = "Collection is empty."
            j8.o.l(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object t1(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        Lf:
            java.lang.String r1 = "List is empty."
            j8.o.l(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object u1(java.lang.Iterable r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L13
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            goto L1d
        Ld:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        L13:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            java.lang.Object r1 = r1.next()
            return r1
    }

    public static java.lang.Object v1(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            r1 = 0
            return r1
        Lb:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static java.lang.Object w1(int r1, java.util.List r2) {
            r2.getClass()
            if (r1 < 0) goto L10
            int r0 = r2.size()
            if (r1 >= r0) goto L10
            java.lang.Object r1 = r2.get(r1)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.util.LinkedHashSet x1(java.lang.Iterable r3, java.lang.Iterable r4) {
            r3.getClass()
            r4.getClass()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto Ld
            java.util.Collection r4 = (java.util.Collection) r4
            goto L11
        Ld:
            java.util.List r4 = P1(r4)
        L11:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            boolean r2 = r4.contains(r1)
            if (r2 == 0) goto L1a
            r0.add(r1)
            goto L1a
        L2e:
            return r0
    }

    public static final void y1(java.lang.Iterable r1, java.lang.StringBuilder r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, fg.l r7) {
            r1.getClass()
            r2.append(r4)
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        Lb:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L20
            java.lang.Object r6 = r1.next()
            r0 = 1
            int r4 = r4 + r0
            if (r4 <= r0) goto L1c
            r2.append(r3)
        L1c:
            ac.p.f(r2, r6, r7)
            goto Lb
        L20:
            r2.append(r5)
            return
    }

    public static /* synthetic */ void z1(java.util.List r7, java.lang.StringBuilder r8, java.lang.String r9, b0.d0 r10, int r11) {
            r11 = r11 & 64
            if (r11 == 0) goto L5
            r10 = 0
        L5:
            r6 = r10
            java.lang.String r3 = ""
            java.lang.String r5 = "..."
            r4 = r3
            r0 = r7
            r1 = r8
            r2 = r9
            y1(r0, r1, r2, r3, r4, r5, r6)
            return
    }
}
