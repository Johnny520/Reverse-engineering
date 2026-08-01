package defpackage;

/* JADX INFO: renamed from: ᛶᛷᛳᛲ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1107 extends defpackage.AbstractC1376 {
    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public static java.util.List m2111(java.lang.Iterable r3) {
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L28
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r2 = r0.size()
            if (r2 > r1) goto L13
            java.util.List r3 = m2113(r3)
            return r3
        L13:
            r3 = 0
            java.lang.Comparable[] r3 = new java.lang.Comparable[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            r0 = r3
            java.lang.Comparable[] r0 = (java.lang.Comparable[]) r0
            int r2 = r0.length
            if (r2 <= r1) goto L23
            java.util.Arrays.sort(r0)
        L23:
            java.util.List r3 = java.util.Arrays.asList(r3)
            return r3
        L28:
            java.util.List r3 = m2118(r3)
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= r1) goto L38
            java.util.Collections.sort(r3)
        L38:
            return r3
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static java.util.ArrayList m2112(int r8, java.util.List r9) {
            if (r8 <= 0) goto L73
            if (r8 <= 0) goto L73
            boolean r0 = r9 instanceof java.util.RandomAccess
            if (r0 == 0) goto L41
            int r0 = r9.size()
            int r1 = r0 / r8
            int r2 = r0 % r8
            r3 = 0
            if (r2 != 0) goto L15
            r2 = r3
            goto L16
        L15:
            r2 = 1
        L16:
            int r1 = r1 + r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r1 = r3
        L1d:
            if (r1 < 0) goto L40
            if (r1 >= r0) goto L40
            int r4 = r0 - r1
            if (r8 <= r4) goto L26
            goto L27
        L26:
            r4 = r8
        L27:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r6 = r3
        L2d:
            if (r6 >= r4) goto L3b
            int r7 = r6 + r1
            java.lang.Object r7 = r9.get(r7)
            r5.add(r7)
            int r6 = r6 + 1
            goto L2d
        L3b:
            r2.add(r5)
            int r1 = r1 + r8
            goto L1d
        L40:
            return r2
        L41:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            boolean r1 = r9.hasNext()
            if (r1 != 0) goto L53
            ᛲᛳᲁᲁ r8 = defpackage.C0269.f1528
            goto L62
        L53:
            ᲀᛶᛴᛲ r1 = new ᲀᛶᛴᛲ
            r1.<init>()
            ᲈᛷᛸᛶ r2 = new ᲈᛷᛸᛶ
            r2.<init>(r8, r8, r9, r1)
            r2.f9700 = r1
            r1.f7507 = r2
            r8 = r1
        L62:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L72
            java.lang.Object r9 = r8.next()
            java.util.List r9 = (java.util.List) r9
            r0.add(r9)
            goto L62
        L72:
            return r0
        L73:
            java.lang.String r9 = "size "
            java.lang.String r0 = " must be greater than zero."
            defpackage.C0086.m546(r9, r8, r0)
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public static java.util.List m2113(java.lang.Iterable r5) {
            boolean r0 = r5 instanceof java.util.Collection
            ᲀᛶᲇ r1 = defpackage.C1698.f7558
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L32
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            int r4 = r0.size()
            if (r4 == 0) goto L31
            if (r4 == r3) goto L19
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            return r5
        L19:
            boolean r1 = r5 instanceof java.util.List
            if (r1 == 0) goto L24
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r5.get(r2)
            goto L2c
        L24:
            java.util.Iterator r5 = r0.iterator()
            java.lang.Object r5 = r5.next()
        L2c:
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
        L31:
            return r1
        L32:
            java.util.List r5 = m2118(r5)
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r0.size()
            if (r4 == 0) goto L4b
            if (r4 == r3) goto L42
            return r5
        L42:
            java.lang.Object r5 = r0.get(r2)
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
        L4b:
            return r1
    }

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public static java.lang.Object m2114(java.util.List r1) {
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf
            int r0 = defpackage.AbstractC0425.m1184(r1)
            java.lang.Object r1 = r1.get(r0)
            return r1
        Lf:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public static java.util.ArrayList m2115(java.util.List r3, java.util.List r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            r0.addAll(r3)
            r0.addAll(r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public static java.util.List m2116(java.lang.Iterable r3, java.util.Comparator r4) {
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L25
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r2 = r0.size()
            if (r2 > r1) goto L13
            java.util.List r3 = m2113(r3)
            return r3
        L13:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            int r0 = r3.length
            if (r0 <= r1) goto L20
            java.util.Arrays.sort(r3, r4)
        L20:
            java.util.List r3 = java.util.Arrays.asList(r3)
            return r3
        L25:
            java.util.List r3 = m2118(r3)
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= r1) goto L35
            java.util.Collections.sort(r3, r4)
        L35:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public static java.util.Set m2117(java.util.Collection r1) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public static final java.util.List m2118(java.lang.Iterable r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m2128(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public static int[] m2119(java.util.ArrayList r4) {
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

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public static java.util.List m2120(java.util.List r7) {
            int r0 = r7.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r0 >= 0) goto La
            r0 = r2
        La:
            if (r0 < 0) goto L54
            ᲀᛶᲇ r3 = defpackage.C1698.f7558
            if (r0 != 0) goto L11
            return r3
        L11:
            int r4 = r7.size()
            if (r0 < r4) goto L1c
            java.util.List r7 = m2113(r7)
            return r7
        L1c:
            if (r0 != r1) goto L27
            java.lang.Object r7 = m2122(r7)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            return r7
        L27:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
            r5 = r2
        L31:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L41
            java.lang.Object r6 = r7.next()
            r4.add(r6)
            int r5 = r5 + r1
            if (r5 != r0) goto L31
        L41:
            int r7 = r4.size()
            if (r7 == 0) goto L53
            if (r7 == r1) goto L4a
            return r4
        L4a:
            java.lang.Object r7 = r4.get(r2)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            return r7
        L53:
            return r3
        L54:
            java.lang.String r7 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            defpackage.C0086.m546(r7, r0, r1)
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public static java.util.Set m2121(java.util.ArrayList r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L24
            r1 = 1
            if (r0 == r1) goto L1a
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = defpackage.AbstractC1893.m3323(r1)
            r0.<init>(r1)
            m2128(r2, r0)
            return r0
        L1a:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.Set r2 = java.util.Collections.singleton(r2)
            return r2
        L24:
            ᛵᲈᛳᲀ r2 = defpackage.C0993.f4434
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static java.lang.Object m2122(java.util.List r1) {
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

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public static java.lang.Object m2123(java.util.List r2) {
            ᛴᛸᲈᲈ r0 = defpackage.AbstractC1482.f6568
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1b
            int r0 = r2.size()
            ᛴᛸᲈᲈ r1 = defpackage.AbstractC1482.f6568
            java.util.Random r1 = r1.mo1661()
            int r0 = r1.nextInt(r0)
            java.lang.Object r2 = r2.get(r0)
            return r2
        L1b:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection is empty."
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public static java.lang.Object m2124(java.util.List r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public static java.lang.String m2125(java.lang.Iterable r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, defpackage.InterfaceC0598 r11, int r12) {
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
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "..."
            r0 = r7
            m2126(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r7 = r1.toString()
            return r7
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public static final void m2126(java.lang.Iterable r1, java.lang.StringBuilder r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, defpackage.InterfaceC0598 r7) {
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
            defpackage.AbstractC1171.m2264(r2, r6, r7)
            goto L8
        L1d:
            r2.append(r5)
            return
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public static java.lang.Object m2127(int r1, java.util.List r2) {
            if (r1 < 0) goto Ld
            int r0 = r2.size()
            if (r1 >= r0) goto Ld
            java.lang.Object r1 = r2.get(r1)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public static final void m2128(java.lang.Iterable r1, java.util.AbstractCollection r2) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L4
        L12:
            return
    }
}
