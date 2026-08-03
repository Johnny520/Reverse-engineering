package a;

/* JADX INFO: renamed from: a.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0383t3 extends a.C0365s3 {
    public static <T> java.util.Set<T> A0(java.lang.Iterable<? extends T> r3) {
            a.b6 r0 = a.C0063b6.f410a
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r1.size()
            if (r2 == 0) goto L3d
            r0 = 1
            if (r2 == r0) goto L1f
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r1.size()
            int r1 = a.C0048aa.C(r1)
            r0.<init>(r1)
            t0(r3, r0)
            return r0
        L1f:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L2b
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L33
        L2b:
            java.util.Iterator r3 = r1.iterator()
            java.lang.Object r3 = r3.next()
        L33:
            java.util.Set r3 = java.util.Collections.singleton(r3)
            java.lang.String r0 = "singleton(...)"
            a.C0193i9.d(r3, r0)
            return r3
        L3d:
            return r0
    }

    public static boolean k0(java.lang.Iterable r3, java.io.Serializable r4) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.contains(r4)
            return r3
        L10:
            boolean r0 = r3 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L1c
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.indexOf(r4)
            goto L41
        L1c:
            java.util.Iterator r3 = r3.iterator()
            r0 = r1
        L21:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r3.next()
            if (r0 < 0) goto L38
            boolean r2 = a.C0193i9.a(r4, r2)
            if (r2 == 0) goto L35
            r3 = r0
            goto L41
        L35:
            int r0 = r0 + 1
            goto L21
        L38:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "Index overflow has happened."
            r3.<init>(r4)
            throw r3
        L40:
            r3 = -1
        L41:
            if (r3 < 0) goto L45
            r3 = 1
            return r3
        L45:
            return r1
    }

    public static java.lang.Object l0(java.util.Collection r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Lb
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = m0(r1)
            return r1
        Lb:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r1.next()
            return r1
        L1a:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection is empty."
            r1.<init>(r0)
            throw r1
    }

    public static <T> T m0(java.util.List<? extends T> r1) {
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        Lc:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    public static <T> T n0(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static <T> T o0(java.util.List<? extends T> r1, int r2) {
            if (r2 < 0) goto Ld
            int r0 = r1.size()
            if (r2 >= r0) goto Ld
            java.lang.Object r1 = r1.get(r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static java.lang.String p0(java.util.Collection r4, java.lang.String r5, a.D7 r6, int r7) {
            r0 = r7 & 1
            if (r0 == 0) goto L6
            java.lang.String r5 = ", "
        L6:
            r0 = r7 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto Le
            r0 = r1
            goto L10
        Le:
            java.lang.String r0 = "["
        L10:
            r2 = r7 & 4
            if (r2 == 0) goto L15
            goto L17
        L15:
            java.lang.String r1 = "]"
        L17:
            r7 = r7 & 32
            if (r7 == 0) goto L1c
            r6 = 0
        L1c:
            java.lang.String r7 = "<this>"
            a.C0193i9.e(r4, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L2e:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r4.next()
            r3 = 1
            int r0 = r0 + r3
            if (r0 <= r3) goto L3f
            r7.append(r5)
        L3f:
            a.C0282n9.e(r7, r2, r6)
            goto L2e
        L43:
            r7.append(r1)
            java.lang.String r4 = r7.toString()
            return r4
    }

    public static java.util.ArrayList q0(java.util.List r3, java.util.List r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            r0.addAll(r3)
            r0.addAll(r4)
            return r0
    }

    public static java.util.List r0(java.util.ArrayList r2, java.util.Comparator r3) {
            int r0 = r2.size()
            r1 = 1
            if (r0 > r1) goto Lc
            java.util.List r2 = w0(r2)
            return r2
        Lc:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r2, r0)
            int r0 = r2.length
            if (r0 <= r1) goto L1e
            java.util.Arrays.sort(r2, r3)
        L1e:
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r3 = "asList(...)"
            a.C0193i9.d(r2, r3)
            return r2
    }

    public static java.util.List s0(int r6, java.util.Collection r7) {
            if (r6 < 0) goto L4c
            a.Y5 r0 = a.Y5.f351a
            if (r6 != 0) goto L7
            return r0
        L7:
            int r1 = r7.size()
            if (r6 < r1) goto L12
            java.util.List r6 = w0(r7)
            return r6
        L12:
            r1 = 1
            if (r6 != r1) goto L1e
            java.lang.Object r6 = l0(r7)
            java.util.List r6 = a.C0435w1.K(r6)
            return r6
        L1e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r6)
            java.util.Iterator r7 = r7.iterator()
            r3 = 0
            r4 = r3
        L29:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r7.next()
            r2.add(r5)
            int r4 = r4 + r1
            if (r4 != r6) goto L29
        L39:
            int r6 = r2.size()
            if (r6 == 0) goto L4b
            if (r6 == r1) goto L42
            return r2
        L42:
            java.lang.Object r6 = r2.get(r3)
            java.util.List r6 = a.C0435w1.K(r6)
            return r6
        L4b:
            return r0
        L4c:
            java.lang.String r7 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r6 = a.C0487z.c(r6, r7, r0)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public static final void t0(java.lang.Iterable r1, java.util.AbstractCollection r2) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L9
        L17:
            return
    }

    public static java.util.HashSet u0(java.util.ArrayList r2) {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 12
            int r1 = a.C0312p3.g0(r2, r1)
            int r1 = a.C0048aa.C(r1)
            r0.<init>(r1)
            t0(r2, r0)
            return r0
    }

    public static int[] v0(java.util.ArrayList r4) {
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

    public static <T> java.util.List<T> w0(java.lang.Iterable<? extends T> r5) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r5, r0)
            boolean r0 = r5 instanceof java.util.Collection
            a.Y5 r1 = a.Y5.f351a
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L36
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            int r4 = r0.size()
            if (r4 == 0) goto L35
            if (r4 == r3) goto L1d
            java.util.ArrayList r5 = y0(r0)
            return r5
        L1d:
            boolean r1 = r5 instanceof java.util.List
            if (r1 == 0) goto L28
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r5.get(r2)
            goto L30
        L28:
            java.util.Iterator r5 = r0.iterator()
            java.lang.Object r5 = r5.next()
        L30:
            java.util.List r5 = a.C0435w1.K(r5)
            return r5
        L35:
            return r1
        L36:
            java.util.List r5 = z0(r5)
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r0.size()
            if (r4 == 0) goto L4f
            if (r4 == r3) goto L46
            return r5
        L46:
            java.lang.Object r5 = r0.get(r2)
            java.util.List r5 = a.C0435w1.K(r5)
            return r5
        L4f:
            return r1
    }

    public static long[] x0(java.util.ArrayList r5) {
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

    public static java.util.ArrayList y0(java.util.Collection r1) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    public static final <T> java.util.List<T> z0(java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r1 = y0(r1)
            return r1
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            t0(r1, r0)
            return r0
    }
}
