package p000;

/* JADX INFO: renamed from: xh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0984xh extends p000.AbstractC0019ai {
    /* JADX INFO: renamed from: А */
    public static java.util.ArrayList m6631(int r8, java.util.List r9) {
            p000.p91.m4419(r8, r8)
            boolean r0 = r9 instanceof java.util.RandomAccess
            if (r0 == 0) goto L40
            int r0 = r9.size()
            int r1 = r0 / r8
            int r2 = r0 % r8
            r3 = 0
            if (r2 != 0) goto L14
            r2 = r3
            goto L15
        L14:
            r2 = 1
        L15:
            int r1 = r1 + r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r1 = r3
        L1c:
            if (r1 < 0) goto L3f
            if (r1 >= r0) goto L3f
            int r4 = r0 - r1
            if (r8 <= r4) goto L25
            goto L26
        L25:
            r4 = r8
        L26:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r6 = r3
        L2c:
            if (r6 >= r4) goto L3a
            int r7 = r6 + r1
            java.lang.Object r7 = r9.get(r7)
            r5.add(r7)
            int r6 = r6 + 1
            goto L2c
        L3a:
            r2.add(r5)
            int r1 = r1 + r8
            goto L1c
        L3f:
            return r2
        L40:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            r9.getClass()
            boolean r1 = r9.hasNext()
            if (r1 != 0) goto L55
            iz r8 = p000.C0412iz.f5249
            goto L5f
        L55:
            mw1 r1 = new mw1
            r2 = 0
            r1.<init>(r8, r8, r9, r2)
            ts1 r8 = p000.e81.m1879(r1)
        L5f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L6f
            java.lang.Object r9 = r8.next()
            java.util.List r9 = (java.util.List) r9
            r0.add(r9)
            goto L5f
        L6f:
            return r0
    }

    /* JADX INFO: renamed from: Б */
    public static boolean m6632(java.lang.Iterable r3, java.lang.Object r4) {
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
            boolean r2 = p000.ln0.m3626(r4, r2)
            if (r2 == 0) goto L33
            r3 = r0
            goto L3c
        L33:
            int r0 = r0 + 1
            goto L1f
        L36:
            p000.AbstractC1021yh.m6917()
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

    /* JADX INFO: renamed from: В */
    public static java.util.List m6633(java.lang.Iterable r0) {
            r0.getClass()
            java.util.Set r0 = m6670(r0)
            java.util.List r0 = m6666(r0)
            return r0
    }

    /* JADX INFO: renamed from: Г */
    public static java.util.List m6634(java.lang.Iterable r3, int r4) {
            r3.getClass()
            if (r4 < 0) goto La8
            if (r4 != 0) goto Lc
            java.util.List r3 = m6666(r3)
            return r3
        Lc:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L86
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            int r0 = r0 - r4
            if (r0 > 0) goto L1d
            jz r3 = p000.C0450jz.f5672
            return r3
        L1d:
            r1 = 1
            if (r0 != r1) goto L52
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L2b
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = m6645(r3)
            goto L45
        L2b:
            java.util.Iterator r3 = r3.iterator()
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
            java.util.List r3 = p000.AbstractC1021yh.m6896(r3)
            return r3
        L4a:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            java.lang.String r4 = "Collection is empty."
            r3.<init>(r4)
            throw r3
        L52:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L8b
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto L71
            java.util.List r3 = (java.util.List) r3
            int r0 = r3.size()
        L65:
            if (r4 >= r0) goto L85
            java.lang.Object r2 = r3.get(r4)
            r1.add(r2)
            int r4 = r4 + 1
            goto L65
        L71:
            java.util.List r3 = (java.util.List) r3
            java.util.ListIterator r3 = r3.listIterator(r4)
        L77:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r3.next()
            r1.add(r4)
            goto L77
        L85:
            return r1
        L86:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L8b:
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L90:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r3.next()
            if (r0 < r4) goto La0
            r1.add(r2)
            goto L90
        La0:
            int r0 = r0 + 1
            goto L90
        La3:
            java.util.List r3 = p000.AbstractC1021yh.m6900(r1)
            return r3
        La8:
            java.lang.String r3 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r3 = p000.AbstractC0602nx.m4127(r3, r4, r0)
            p000.C1080.m7266(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: Д */
    public static java.util.List m6635(java.util.List r1) {
            int r0 = r1.size()
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L9
            r0 = 0
        L9:
            java.util.List r1 = m6662(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: Е */
    public static final boolean m6636(java.lang.Iterable r2, p000.a80 r3, boolean r4) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r4) goto L5
            r2.remove()
            r0 = 1
            goto L5
        L20:
            return r0
    }

    /* JADX INFO: renamed from: Ж */
    public static java.util.ArrayList m6637(java.lang.Iterable r2) {
            r2.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto Lc
            r0.add(r1)
            goto Lc
        L1c:
            return r0
    }

    /* JADX INFO: renamed from: З */
    public static java.lang.Object m6638(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        Lf:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: И */
    public static java.lang.Object m6639(java.lang.Iterable r1) {
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

    /* JADX INFO: renamed from: К */
    public static java.lang.Object m6640(java.util.List r1) {
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

    /* JADX INFO: renamed from: Л */
    public static java.lang.Object m6641(int r1, java.util.List r2) {
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

    /* JADX INFO: renamed from: М */
    public static final void m6642(java.lang.Iterable r2, java.lang.StringBuilder r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, int r7, java.lang.CharSequence r8, p000.a80 r9) {
            r2.getClass()
            r3.append(r5)
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            int r5 = r5 + 1
            r1 = 1
            if (r5 <= r1) goto L1d
            r3.append(r4)
        L1d:
            if (r7 < 0) goto L21
            if (r5 > r7) goto L25
        L21:
            p000.i81.m2656(r3, r0, r9)
            goto Lb
        L25:
            if (r7 < 0) goto L2c
            if (r5 <= r7) goto L2c
            r3.append(r8)
        L2c:
            r3.append(r6)
            return
    }

    /* JADX INFO: renamed from: Н */
    public static /* synthetic */ void m6643(java.util.ArrayList r8, java.lang.StringBuilder r9) {
            r5 = -1
            java.lang.String r6 = "..."
            java.lang.String r2 = "\n"
            java.lang.String r3 = ""
            r7 = 0
            r4 = r3
            r0 = r8
            r1 = r9
            m6642(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: О */
    public static java.lang.String m6644(java.lang.Iterable r8, java.lang.CharSequence r9, java.lang.String r10, java.lang.String r11, int r12, p000.a80 r13, int r14) {
            r0 = r14 & 1
            if (r0 == 0) goto L6
            java.lang.String r9 = ", "
        L6:
            r2 = r9
            r9 = r14 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto Lf
            r3 = r0
            goto L10
        Lf:
            r3 = r10
        L10:
            r9 = r14 & 4
            if (r9 == 0) goto L16
            r4 = r0
            goto L17
        L16:
            r4 = r11
        L17:
            r9 = r14 & 8
            if (r9 == 0) goto L1c
            r12 = -1
        L1c:
            r5 = r12
            r9 = r14 & 32
            if (r9 == 0) goto L22
            r13 = 0
        L22:
            r7 = r13
            r8.getClass()
            r2.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "..."
            r0 = r8
            m6642(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = r1.toString()
            return r8
    }

    /* JADX INFO: renamed from: П */
    public static java.lang.Object m6645(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L14
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
        L14:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: Р */
    public static java.lang.Object m6646(java.util.List r1) {
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

    /* JADX INFO: renamed from: С */
    public static java.lang.Comparable m6647(java.lang.Iterable r3) {
            r3.getClass()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto Lf
            r3 = 0
            return r3
        Lf:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L15:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L15
            r0 = r1
            goto L15
        L29:
            return r0
    }

    /* JADX INFO: renamed from: Т */
    public static java.lang.Object m6648(java.lang.Iterable r3, java.util.Comparator r4) {
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
            if (r2 >= 0) goto L10
            r0 = r1
            goto L10
        L22:
            return r0
    }

    /* JADX INFO: renamed from: У */
    public static java.lang.Comparable m6649(java.util.ArrayList r3) {
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

    /* JADX INFO: renamed from: Ф */
    public static java.util.ArrayList m6650(java.lang.Object r2, java.util.List r3) {
            r3.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.addAll(r3)
            r0.add(r2)
            return r0
    }

    /* JADX INFO: renamed from: Х */
    public static java.util.ArrayList m6651(java.util.Collection r3, java.lang.Iterable r4) {
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
            m6660(r0, r4)
            return r0
    }

    /* JADX INFO: renamed from: Ц */
    public static void m6652(java.lang.Iterable r1, p000.a80 r2) {
            r1.getClass()
            r0 = 1
            m6636(r1, r2, r0)
            return
    }

    /* JADX INFO: renamed from: Ч */
    public static boolean m6653(java.util.List r7, p000.a80 r8) {
            r7.getClass()
            boolean r0 = r7 instanceof java.util.RandomAccess
            r1 = 1
            if (r0 != 0) goto L1d
            boolean r0 = r7 instanceof p000.lo0
            if (r0 == 0) goto L18
            boolean r0 = r7 instanceof p000.mo0
            if (r0 == 0) goto L11
            goto L18
        L11:
            java.lang.String r8 = "kotlin.collections.MutableIterable"
            p000.h62.m2418(r7, r8)
            r7 = 0
            throw r7
        L18:
            boolean r7 = m6636(r7, r8, r1)
            return r7
        L1d:
            int r0 = r7.size()
            int r0 = r0 - r1
            r2 = 0
            if (r0 < 0) goto L44
            r3 = r2
            r4 = r3
        L27:
            java.lang.Object r5 = r7.get(r3)
            java.lang.Object r6 = r8.invoke(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r1) goto L38
            goto L3f
        L38:
            if (r4 == r3) goto L3d
            r7.set(r4, r5)
        L3d:
            int r4 = r4 + 1
        L3f:
            if (r3 == r0) goto L45
            int r3 = r3 + 1
            goto L27
        L44:
            r4 = r2
        L45:
            int r8 = r7.size()
            if (r4 >= r8) goto L5b
            int r8 = r7.size()
            int r8 = r8 - r1
            if (r4 > r8) goto L5a
        L52:
            r7.remove(r8)
            if (r8 == r4) goto L5a
            int r8 = r8 + (-1)
            goto L52
        L5a:
            return r1
        L5b:
            return r2
    }

    /* JADX INFO: renamed from: Ш */
    public static java.lang.Object m6654(java.lang.Iterable r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Lb
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = m6655(r1)
            return r1
        Lb:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L20
            return r0
        L20:
            java.lang.String r1 = "Collection has more than one element."
            p000.C1080.m7275(r1)
            r1 = 0
            return r1
        L27:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection is empty."
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: Щ */
    public static java.lang.Object m6655(java.util.List r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L16
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        Lf:
            java.lang.String r2 = "List has more than one element."
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
        L16:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: Э */
    public static java.lang.Object m6656(java.util.List r2) {
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

    /* JADX INFO: renamed from: Ю */
    public static java.util.List m6657(java.lang.Iterable r3) {
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L34
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r2 = r0.size()
            if (r2 > r1) goto L16
            java.util.List r3 = m6666(r3)
            return r3
        L16:
            r3 = 0
            java.lang.Comparable[] r3 = new java.lang.Comparable[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            r0 = r3
            java.lang.Comparable[] r0 = (java.lang.Comparable[]) r0
            r0.getClass()
            int r2 = r0.length
            if (r2 <= r1) goto L29
            java.util.Arrays.sort(r0)
        L29:
            r3.getClass()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r3.getClass()
            return r3
        L34:
            java.util.List r3 = m6669(r3)
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= r1) goto L44
            java.util.Collections.sort(r3)
        L44:
            return r3
    }

    /* JADX INFO: renamed from: Я */
    public static java.util.List m6658(java.lang.Iterable r3, java.util.Comparator r4) {
            r3.getClass()
            r4.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L31
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L19
            java.util.List r3 = m6666(r3)
            return r3
        L19:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            r3.getClass()
            int r0 = r3.length
            if (r0 <= r2) goto L29
            java.util.Arrays.sort(r3, r4)
        L29:
            java.util.List r3 = java.util.Arrays.asList(r3)
            r3.getClass()
            return r3
        L31:
            java.util.List r3 = m6669(r3)
            p000.AbstractC0019ai.m168(r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: э */
    public static void m6659(java.util.AbstractCollection r0, java.lang.Object[] r1) {
            r0.getClass()
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.addAll(r1)
            return
    }

    /* JADX INFO: renamed from: ю */
    public static void m6660(java.util.Collection r1, java.lang.Iterable r2) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            return
        L10:
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L14
        L22:
            return
    }

    /* JADX INFO: renamed from: я */
    public static p000.C0275f7 m6661(java.lang.Iterable r2) {
            r2.getClass()
            f7 r0 = new f7
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ａ */
    public static java.util.List m6662(java.lang.Iterable r4, int r5) {
            r4.getClass()
            if (r5 < 0) goto L67
            if (r5 != 0) goto La
            jz r4 = p000.C0450jz.f5672
            return r4
        La:
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L48
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            if (r5 < r0) goto L1d
            java.util.List r4 = m6666(r4)
            return r4
        L1d:
            if (r5 != r1) goto L48
            r4.getClass()
            boolean r5 = r4 instanceof java.util.List
            if (r5 == 0) goto L2d
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = m6638(r4)
            goto L3b
        L2d:
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L40
            java.lang.Object r4 = r4.next()
        L3b:
            java.util.List r4 = p000.AbstractC1021yh.m6896(r4)
            return r4
        L40:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Collection is empty."
            r4.<init>(r5)
            throw r4
        L48:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L52:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r4.next()
            r0.add(r3)
            int r2 = r2 + r1
            if (r2 != r5) goto L52
        L62:
            java.util.List r4 = p000.AbstractC1021yh.m6900(r0)
            return r4
        L67:
            java.lang.String r4 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r4 = p000.AbstractC0602nx.m4127(r4, r5, r0)
            p000.C1080.m7266(r4)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ｂ */
    public static java.util.List m6663(int r3, java.util.List r4) {
            if (r3 < 0) goto L49
            if (r3 != 0) goto L7
            jz r3 = p000.C0450jz.f5672
            return r3
        L7:
            int r0 = r4.size()
            if (r3 < r0) goto L12
            java.util.List r3 = m6666(r4)
            return r3
        L12:
            r1 = 1
            if (r3 != r1) goto L1e
            java.lang.Object r3 = m6645(r4)
            java.util.List r3 = p000.AbstractC1021yh.m6896(r3)
            return r3
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            boolean r2 = r4 instanceof java.util.RandomAccess
            if (r2 == 0) goto L35
            int r3 = r0 - r3
        L29:
            if (r3 >= r0) goto L48
            java.lang.Object r2 = r4.get(r3)
            r1.add(r2)
            int r3 = r3 + 1
            goto L29
        L35:
            int r0 = r0 - r3
            java.util.ListIterator r3 = r4.listIterator(r0)
        L3a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r3.next()
            r1.add(r4)
            goto L3a
        L48:
            return r1
        L49:
            java.lang.String r4 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r3 = p000.AbstractC0602nx.m4127(r4, r3, r0)
            p000.C1080.m7266(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ｃ */
    public static void m6664(java.lang.Iterable r1, java.util.AbstractCollection r2) {
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

    /* JADX INFO: renamed from: ｄ */
    public static int[] m6665(java.util.List r4) {
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

    /* JADX INFO: renamed from: ｅ */
    public static java.util.List m6666(java.lang.Iterable r3) {
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
            java.util.List r3 = p000.AbstractC1021yh.m6896(r3)
            return r3
        L32:
            jz r3 = p000.C0450jz.f5672
            return r3
        L35:
            java.util.List r3 = m6669(r3)
            java.util.List r3 = p000.AbstractC1021yh.m6900(r3)
            return r3
    }

    /* JADX INFO: renamed from: ｆ */
    public static long[] m6667(java.util.ArrayList r5) {
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

    /* JADX INFO: renamed from: ｇ */
    public static java.util.ArrayList m6668(java.util.Collection r1) {
            r1.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ｈ */
    public static final java.util.List m6669(java.lang.Iterable r1) {
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
            m6664(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ｉ */
    public static java.util.Set m6670(java.lang.Iterable r1) {
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
            m6664(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ｊ */
    public static java.util.Set m6671(java.lang.Iterable r3) {
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
            int r0 = p000.ex0.m1970(r0)
            r1.<init>(r0)
            m6664(r3, r1)
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
            java.util.Set r3 = p000.g81.m2288(r3)
            return r3
        L3d:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            m6664(r3, r0)
            int r3 = r0.size()
            if (r3 == 0) goto L5b
            if (r3 == r1) goto L4e
            return r0
        L4e:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
            java.util.Set r3 = p000.g81.m2288(r3)
            return r3
        L5b:
            nz r3 = p000.C0604nz.f7825
            return r3
    }

    /* JADX INFO: renamed from: ｋ */
    public static java.util.ArrayList m6672(java.util.ArrayList r4, java.util.ArrayList r5) {
            java.util.Iterator r0 = r4.iterator()
            java.util.Iterator r1 = r5.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = p000.AbstractC1021yh.m6889(r4, r3)
            int r5 = p000.AbstractC1021yh.m6889(r5, r3)
            int r4 = java.lang.Math.min(r4, r5)
            r2.<init>(r4)
        L1b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L38
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r0.next()
            java.lang.Object r5 = r1.next()
            l91 r3 = new l91
            r3.<init>(r4, r5)
            r2.add(r3)
            goto L1b
        L38:
            return r2
    }
}
