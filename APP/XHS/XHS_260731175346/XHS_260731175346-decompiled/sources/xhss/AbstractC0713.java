package xhss;

/* JADX INFO: renamed from: xhss.ᛷᲇᛵᛳ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0713 extends xhss.AbstractC0648 {
    /* JADX INFO: renamed from: ᛱᛱᛴᲀ, reason: contains not printable characters */
    public static java.util.ArrayList m1237(java.util.List r3, java.util.Collection r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            r0.addAll(r3)
            r0.addAll(r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛲᛸᲇ, reason: contains not printable characters */
    public static int[] m1238(java.util.ArrayList r4) {
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

    /* JADX INFO: renamed from: ᛱᲁᛳᛲ, reason: contains not printable characters */
    public static java.util.List m1239(java.util.List r4) {
            int r0 = r4.size()
            r1 = 5000(0x1388, float:7.006E-42)
            if (r1 < r0) goto Ld
            java.util.List r4 = m1243(r4)
            return r4
        Ld:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            int r1 = r0 + (-5000)
        L14:
            if (r1 >= r0) goto L20
            java.lang.Object r3 = r4.get(r1)
            r2.add(r3)
            int r1 = r1 + 1
            goto L14
        L20:
            return r2
    }

    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public static java.lang.Object m1240(java.util.List r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    /* JADX INFO: renamed from: ᛴᛷᛵᛴ, reason: contains not printable characters */
    public static long[] m1241(java.util.ArrayList r5) {
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

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public static java.lang.String m1242(java.util.Collection r7, java.lang.String r8, xhss.InterfaceC0645 r9, int r10) {
            r0 = r10 & 1
            if (r0 == 0) goto L6
            java.lang.String r8 = ", "
        L6:
            r2 = r8
            r8 = r10 & 2
            java.lang.String r0 = ""
            if (r8 == 0) goto Lf
            r3 = r0
            goto L12
        Lf:
            java.lang.String r8 = "["
            r3 = r8
        L12:
            r8 = r10 & 4
            if (r8 == 0) goto L18
        L16:
            r4 = r0
            goto L1b
        L18:
            java.lang.String r0 = "]"
            goto L16
        L1b:
            r8 = r10 & 32
            if (r8 == 0) goto L20
            r9 = 0
        L20:
            r6 = r9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "..."
            r0 = r7
            m1247(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r7 = r1.toString()
            return r7
    }

    /* JADX INFO: renamed from: ᛴᲈᲀᲀ, reason: contains not printable characters */
    public static java.util.List m1243(java.util.Collection r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L28
            r1 = 1
            if (r0 == r1) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            return r0
        Lf:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L1b
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            goto L23
        L1b:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
        L23:
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L28:
            xhss.ᛵᛷᛶᛱ r2 = xhss.C0492.f1802
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public static java.lang.Object m1244(java.util.List r1) {
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

    /* JADX INFO: renamed from: ᛷᛸᛷ, reason: contains not printable characters */
    public static java.util.Set m1245(java.util.Collection r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L42
            r1 = 1
            if (r0 == r1) goto L29
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = xhss.AbstractC0955.m1564(r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r2.next()
            r0.add(r1)
            goto L1a
        L28:
            return r0
        L29:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L35
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            goto L3d
        L35:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
        L3d:
            java.util.Set r2 = java.util.Collections.singleton(r2)
            return r2
        L42:
            xhss.ᛱᛲᲁᛴ r2 = xhss.C0020.f200
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛴᛸᛲ, reason: contains not printable characters */
    public static java.lang.Object m1246(java.util.List r1, int r2) {
            if (r2 < 0) goto Ld
            int r0 = r1.size()
            if (r2 >= r0) goto Ld
            java.lang.Object r1 = r1.get(r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲁᛷᲇᲇ, reason: contains not printable characters */
    public static final void m1247(java.lang.Iterable r1, java.lang.StringBuilder r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, xhss.InterfaceC0645 r7) {
            r2.append(r4)
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L8:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L1d
            java.lang.Object r6 = r1.next()
            r0 = 1
            int r4 = r4 + r0
            if (r4 <= r0) goto L19
            r2.append(r3)
        L19:
            xhss.AbstractC0561.m1008(r2, r6, r7)
            goto L8
        L1d:
            r2.append(r5)
            return
    }
}
