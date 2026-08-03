package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    static {
            return
    }

    public static byte[] a(java.util.ArrayDeque r6, int r7) {
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            byte[] r6 = new byte[r1]
            return r6
        La:
            java.lang.Object r0 = r6.remove()
            byte[] r0 = (byte[]) r0
            int r2 = r0.length
            if (r2 != r7) goto L14
            return r0
        L14:
            int r2 = r0.length
            int r2 = r7 - r2
            byte[] r0 = java.util.Arrays.copyOf(r0, r7)
        L1b:
            if (r2 <= 0) goto L2f
            java.lang.Object r3 = r6.remove()
            byte[] r3 = (byte[]) r3
            int r4 = r3.length
            int r4 = java.lang.Math.min(r2, r4)
            int r5 = r7 - r2
            java.lang.System.arraycopy(r3, r1, r0, r5, r4)
            int r2 = r2 - r4
            goto L1b
        L2f:
            return r0
    }

    public static int b(java.util.List r2, java.util.List r3) {
            java.util.Iterator r3 = r3.iterator()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L1a
            r2 = 1
            return r2
        L1a:
            java.lang.Object r1 = r3.next()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r1.toString()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L8
            return r0
        L2d:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L35
            r2 = -1
            return r2
        L35:
            r2 = 0
            return r2
    }

    public static int c(java.util.Set r2, java.util.Set r3) {
            int r0 = r2.size()
            int r1 = r3.size()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            h(r2)
            h(r3)
            java.util.Iterator r3 = r3.iterator()
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r2.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L1d
            return r0
        L36:
            r2 = 0
            return r2
    }

    public static int d(int r0) {
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >>> 4
            return r0
    }

    public static boolean e(java.util.List r1, java.util.List r2) {
            d6.j r0 = new d6.j
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            java.util.ArrayList r1 = g(r0)
            d6.j r0 = new d6.j
            java.util.Iterator r2 = r2.iterator()
            r0.<init>(r2)
            java.util.ArrayList r2 = g(r0)
            boolean r1 = r1.equals(r2)
            return r1
    }

    public static void f(java.io.BufferedInputStream r4, byte[] r5) {
            int r0 = r5.length
            if (r0 < 0) goto L2e
            int r1 = r5.length
            if (r0 > r1) goto L2e
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            int r2 = r0 - r1
            int r2 = r4.read(r5, r1, r2)
            r3 = -1
            if (r2 != r3) goto L13
            goto L15
        L13:
            int r1 = r1 + r2
            goto L7
        L15:
            int r4 = r5.length
            if (r1 != r4) goto L19
            return
        L19:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r0 = "reached end of stream after reading "
            java.lang.String r2 = " bytes; "
            java.lang.StringBuilder r0 = eh.a.t(r1, r0, r2)
            int r5 = r5.length
            java.lang.String r1 = " bytes expected"
            java.lang.String r5 = j8.b.j(r0, r5, r1)
            r4.<init>(r5)
            throw r4
        L2e:
            java.lang.String r4 = "trying to read invalid offset/length range"
            okio.a.i(r4)
            return
    }

    public static java.util.ArrayList g(java.util.Iterator r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L13
            java.lang.Object r1 = r2.next()
            r0.add(r1)
            goto L5
        L13:
            return r0
    }

    public static void h(java.util.Collection r2) {
            boolean r0 = r2 instanceof java.util.SortedSet
            if (r0 == 0) goto L16
            r0 = r2
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            java.util.Comparator r0 = r0.comparator()
            if (r0 == 0) goto L15
            d6.e r1 = d6.e.f2006h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
        L15:
            return
        L16:
            java.lang.Object[] r2 = r2.toArray()
            d6.b r0 = new d6.b
            r0.<init>(r2)
            java.util.Collections.unmodifiableSortedSet(r0)
            return
    }
}
