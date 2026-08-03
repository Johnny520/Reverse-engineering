package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0648 implements java.lang.Iterable<Yue.C0646>, java.lang.Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final char f1644 = '/';

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.lang.String f1645 = "data-";

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f1646 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f1647 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f1648 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final java.lang.String f1649 = "";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f1650;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String[] f1651;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.lang.Object[] f1652;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ$ۥ, reason: contains not printable characters */
    public class C0649 implements java.util.Iterator<Yue.C0646> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f1653;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f1654;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0648 f1655;

        public C0649(Yue.C0648 r1) {
                r0 = this;
                r0.f1655 = r1
                r0.<init>()
                int r1 = Yue.C0648.m4265(r1)
                r0.f1653 = r1
                r1 = 0
                r0.f1654 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                r3.m4304()
            L3:
                int r0 = r3.f1654
                Yue.ۥ۟ۢ۠ۤ r1 = r3.f1655
                int r1 = Yue.C0648.m4265(r1)
                r2 = 1
                if (r0 >= r1) goto L22
                Yue.ۥ۟ۢ۠ۤ r0 = r3.f1655
                java.lang.String[] r0 = r0.f1651
                int r1 = r3.f1654
                r0 = r0[r1]
                boolean r0 = Yue.C0648.m4271(r0)
                if (r0 == 0) goto L22
                int r0 = r3.f1654
                int r0 = r0 + r2
                r3.f1654 = r0
                goto L3
            L22:
                int r0 = r3.f1654
                Yue.ۥ۟ۢ۠ۤ r1 = r3.f1655
                int r1 = Yue.C0648.m4265(r1)
                if (r0 >= r1) goto L2d
                goto L2e
            L2d:
                r2 = 0
            L2e:
                return r2
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Yue.C0646 next() {
                r1 = this;
                Yue.ۥ۟ۢ۠ۢ r0 = r1.m4305()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                Yue.ۥ۟ۢ۠ۤ r0 = r2.f1655
                int r1 = r2.f1654
                int r1 = r1 + (-1)
                r2.f1654 = r1
                Yue.C0648.m4266(r0, r1)
                int r0 = r2.f1653
                int r0 = r0 + (-1)
                r2.f1653 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m4304() {
                r2 = this;
                Yue.ۥ۟ۢ۠ۤ r0 = r2.f1655
                int r0 = Yue.C0648.m4265(r0)
                int r1 = r2.f1653
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                java.lang.String r1 = "Use Iterator#remove() instead to remove attributes while iterating."
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C0646 m4305() {
                r5 = this;
                r5.m4304()
                int r0 = r5.f1654
                Yue.ۥ۟ۢ۠ۤ r1 = r5.f1655
                int r1 = Yue.C0648.m4265(r1)
                if (r0 >= r1) goto L27
                Yue.ۥ۟ۢ۠ۢ r0 = new Yue.ۥ۟ۢ۠ۢ
                Yue.ۥ۟ۢ۠ۤ r1 = r5.f1655
                java.lang.String[] r2 = r1.f1651
                int r3 = r5.f1654
                r2 = r2[r3]
                java.lang.Object[] r4 = r1.f1652
                r3 = r4[r3]
                java.lang.String r3 = (java.lang.String) r3
                r0.<init>(r2, r3, r1)
                int r1 = r5.f1654
                int r1 = r1 + 1
                r5.f1654 = r1
                return r0
            L27:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ$ۥ۟, reason: contains not printable characters */
    public static class C0650 extends java.util.AbstractMap<java.lang.String, java.lang.String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Yue.C0648 f1656;

        /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ, reason: contains not printable characters */
        public class C0651 implements java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public java.util.Iterator<Yue.C0646> f1657;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public Yue.C0646 f1658;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0648.C0650 f1659;

            public C0651(Yue.C0648.C0650 r1) {
                    r0 = this;
                    r0.f1659 = r1
                    r0.<init>()
                    Yue.ۥ۟ۢ۠ۤ r1 = Yue.C0648.C0650.m4306(r1)
                    java.util.Iterator r1 = r1.iterator()
                    r0.f1657 = r1
                    return
            }

            public /* synthetic */ C0651(Yue.C0648.C0650 r1, Yue.C0648.C0649 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                L0:
                    java.util.Iterator<Yue.ۥ۟ۢ۠ۢ> r0 = r1.f1657
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L1a
                    java.util.Iterator<Yue.ۥ۟ۢ۠ۢ> r0 = r1.f1657
                    java.lang.Object r0 = r0.next()
                    Yue.ۥ۟ۢ۠ۢ r0 = (Yue.C0646) r0
                    r1.f1658 = r0
                    boolean r0 = r0.m4224()
                    if (r0 == 0) goto L0
                    r0 = 1
                    return r0
                L1a:
                    r0 = 0
                    return r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ java.util.Map.Entry<java.lang.String, java.lang.String> next() {
                    r1 = this;
                    java.util.Map$Entry r0 = r1.m4308()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r2 = this;
                    Yue.ۥ۟ۢ۠ۤ$ۥ۟ r0 = r2.f1659
                    Yue.ۥ۟ۢ۠ۤ r0 = Yue.C0648.C0650.m4306(r0)
                    Yue.ۥ۟ۢ۠ۢ r1 = r2.f1658
                    java.lang.String r1 = r1.m4219()
                    r0.m4298(r1)
                    return
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public java.util.Map.Entry<java.lang.String, java.lang.String> m4308() {
                    r3 = this;
                    Yue.ۥ۟ۢ۠ۢ r0 = new Yue.ۥ۟ۢ۠ۢ
                    Yue.ۥ۟ۢ۠ۢ r1 = r3.f1658
                    java.lang.String r1 = r1.m4219()
                    r2 = 5
                    java.lang.String r1 = r1.substring(r2)
                    Yue.ۥ۟ۢ۠ۢ r2 = r3.f1658
                    java.lang.String r2 = r2.m4220()
                    r0.<init>(r1, r2)
                    return r0
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ۟, reason: contains not printable characters */
        public class C0652 extends java.util.AbstractSet<java.util.Map.Entry<java.lang.String, java.lang.String>> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0648.C0650 f1660;

            public C0652(Yue.C0648.C0650 r1) {
                    r0 = this;
                    r0.f1660 = r1
                    r0.<init>()
                    return
            }

            public /* synthetic */ C0652(Yue.C0648.C0650 r1, Yue.C0648.C0649 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iterator() {
                    r3 = this;
                    Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ r0 = new Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ
                    Yue.ۥ۟ۢ۠ۤ$ۥ۟ r1 = r3.f1660
                    r2 = 0
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                    r3 = this;
                    Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ r0 = new Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ
                    Yue.ۥ۟ۢ۠ۤ$ۥ۟ r1 = r3.f1660
                    r2 = 0
                    r0.<init>(r1, r2)
                    r1 = 0
                L9:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L12
                    int r1 = r1 + 1
                    goto L9
                L12:
                    return r1
            }
        }

        public C0650(Yue.C0648 r1) {
                r0 = this;
                r0.<init>()
                r0.f1656 = r1
                return
        }

        public /* synthetic */ C0650(Yue.C0648 r1, Yue.C0648.C0649 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ Yue.C0648 m4306(Yue.C0648.C0650 r0) {
                Yue.ۥ۟ۢ۠ۤ r0 = r0.f1656
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet() {
                r2 = this;
                Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ۟ r0 = new Yue.ۥ۟ۢ۠ۤ$ۥ۟$ۥ۟
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r1 = r0.m4307(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.String m4307(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r3 = Yue.C0648.m4267(r3)
                Yue.ۥ۟ۢ۠ۤ r0 = r2.f1656
                boolean r0 = r0.m4286(r3)
                if (r0 == 0) goto L13
                Yue.ۥ۟ۢ۠ۤ r0 = r2.f1656
                java.lang.String r0 = r0.m4281(r3)
                goto L14
            L13:
                r0 = 0
            L14:
                Yue.ۥ۟ۢ۠ۤ r1 = r2.f1656
                r1.m4294(r3, r4)
                return r0
        }
    }

    public C0648() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1650 = r0
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]
            r2.f1651 = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f1652 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m4265(Yue.C0648 r0) {
            int r0 = r0.f1650
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m4266(Yue.C0648 r0, int r1) {
            r0.m4297(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m4267(java.lang.String r0) {
            java.lang.String r0 = m4269(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.lang.String m4268(java.lang.Object r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            goto L7
        L5:
            java.lang.String r0 = (java.lang.String) r0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static java.lang.String m4269(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "data-"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static java.lang.String m4270(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 47
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static boolean m4271(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L13
            int r1 = r3.length()
            r2 = 1
            if (r1 <= r2) goto L13
            char r3 = r3.charAt(r0)
            r1 = 47
            if (r3 != r1) goto L13
            r0 = r2
        L13:
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r1.m4278()
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L44
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L44
        L12:
            Yue.ۥ۟ۢ۠ۤ r7 = (Yue.C0648) r7
            int r2 = r6.f1650
            int r3 = r7.f1650
            if (r2 == r3) goto L1b
            return r1
        L1b:
            r2 = r1
        L1c:
            int r3 = r6.f1650
            if (r2 >= r3) goto L43
            java.lang.String[] r3 = r6.f1651
            r3 = r3[r2]
            int r3 = r7.m4290(r3)
            r4 = -1
            if (r3 != r4) goto L2c
            return r1
        L2c:
            java.lang.Object[] r4 = r6.f1652
            r4 = r4[r2]
            java.lang.Object[] r5 = r7.f1652
            r3 = r5[r3]
            if (r4 != 0) goto L39
            if (r3 == 0) goto L40
            return r1
        L39:
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L40
            return r1
        L40:
            int r2 = r2 + 1
            goto L1c
        L43:
            return r0
        L44:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f1650
            int r0 = r0 * 31
            java.lang.String[] r1 = r2.f1651
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Object[] r1 = r2.f1652
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f1650
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<Yue.C0646> iterator() {
            r1 = this;
            Yue.ۥ۟ۢ۠ۤ$ۥ r0 = new Yue.ۥ۟ۢ۠ۤ$ۥ
            r0.<init>(r1)
            return r0
    }

    public int size() {
            r1 = this;
            int r0 = r1.f1650
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.m4288()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.C0648 m4272(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.m4274(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m4273(Yue.C0648 r4) {
            r3 = this;
            int r0 = r4.size()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r3.f1650
            int r1 = r4.f1650
            int r0 = r0 + r1
            r3.m4277(r0)
            int r0 = r3.f1650
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            java.util.Iterator r4 = r4.iterator()
        L1a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r4.next()
            Yue.ۥ۟ۢ۠ۢ r1 = (Yue.C0646) r1
            if (r0 == 0) goto L2c
            r3.m4293(r1)
            goto L1a
        L2c:
            java.lang.String r2 = r1.m4219()
            java.lang.String r1 = r1.m4220()
            r3.m4272(r2, r1)
            goto L1a
        L38:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m4274(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f1650
            int r0 = r0 + 1
            r2.m4277(r0)
            java.lang.String[] r0 = r2.f1651
            int r1 = r2.f1650
            r0[r1] = r3
            java.lang.Object[] r3 = r2.f1652
            r3[r1] = r4
            int r1 = r1 + 1
            r2.f1650 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.util.List<Yue.C0646> m4275() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.f1650
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r5.f1650
            if (r1 >= r2) goto L2c
            java.lang.String[] r2 = r5.f1651
            r2 = r2[r1]
            boolean r2 = m4271(r2)
            if (r2 == 0) goto L17
            goto L29
        L17:
            Yue.ۥ۟ۢ۠ۢ r2 = new Yue.ۥ۟ۢ۠ۢ
            java.lang.String[] r3 = r5.f1651
            r3 = r3[r1]
            java.lang.Object[] r4 = r5.f1652
            r4 = r4[r1]
            java.lang.String r4 = (java.lang.String) r4
            r2.<init>(r3, r4, r5)
            r0.add(r2)
        L29:
            int r1 = r1 + 1
            goto L8
        L2c:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.C0646 m4276(java.lang.String r4) {
            r3 = this;
            int r0 = r3.m4290(r4)
            r1 = -1
            if (r0 != r1) goto L9
            r4 = 0
            goto L17
        L9:
            Yue.ۥ۟ۢ۠ۢ r1 = new Yue.ۥ۟ۢ۠ۢ
            java.lang.Object[] r2 = r3.f1652
            r0 = r2[r0]
            java.lang.String r0 = m4268(r0)
            r1.<init>(r4, r0, r3)
            r4 = r1
        L17:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m4277(int r4) {
            r3 = this;
            int r0 = r3.f1650
            if (r4 < r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            Yue.C6657.m25628(r0)
            java.lang.String[] r0 = r3.f1651
            int r1 = r0.length
            if (r1 < r4) goto L10
            return
        L10:
            r2 = 3
            if (r1 < r2) goto L17
            int r1 = r3.f1650
            int r2 = r1 * 2
        L17:
            if (r4 <= r2) goto L1a
            goto L1b
        L1a:
            r4 = r2
        L1b:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.f1651 = r0
            java.lang.Object[] r0 = r3.f1652
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.f1652 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.C0648 m4278() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L21
            Yue.ۥ۟ۢ۠ۤ r0 = (Yue.C0648) r0     // Catch: java.lang.CloneNotSupportedException -> L21
            int r1 = r3.f1650
            r0.f1650 = r1
            java.lang.String[] r1 = r3.f1651
            int r2 = r3.f1650
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.f1651 = r1
            java.lang.Object[] r1 = r3.f1652
            int r2 = r3.f1650
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.f1652 = r1
            return r0
        L21:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> m4279() {
            r2 = this;
            Yue.ۥ۟ۢ۠ۤ$ۥ۟ r0 = new Yue.ۥ۟ۢ۠ۤ$ۥ۟
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m4280(Yue.C4699 r7) {
            r6 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r7 = r7.m18615()
            r0 = r1
        Ld:
            java.lang.String[] r2 = r6.f1651
            int r2 = r2.length
            if (r1 >= r2) goto L43
            int r2 = r1 + 1
            r3 = r2
        L15:
            java.lang.String[] r4 = r6.f1651
            int r5 = r4.length
            if (r3 >= r5) goto L41
            r5 = r4[r3]
            if (r5 != 0) goto L1f
            goto L41
        L1f:
            if (r7 == 0) goto L29
            r4 = r4[r1]
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L37
        L29:
            if (r7 != 0) goto L3e
            java.lang.String[] r4 = r6.f1651
            r5 = r4[r1]
            r4 = r4[r3]
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L3e
        L37:
            int r0 = r0 + 1
            r6.m4297(r3)
            int r3 = r3 + (-1)
        L3e:
            int r3 = r3 + 1
            goto L15
        L41:
            r1 = r2
            goto Ld
        L43:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public java.lang.String m4281(java.lang.String r2) {
            r1 = this;
            int r2 = r1.m4290(r2)
            r0 = -1
            if (r2 != r0) goto La
            java.lang.String r2 = ""
            goto L12
        La:
            java.lang.Object[] r0 = r1.f1652
            r2 = r0[r2]
            java.lang.String r2 = m4268(r2)
        L12:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.String m4282(java.lang.String r2) {
            r1 = this;
            int r2 = r1.m4291(r2)
            r0 = -1
            if (r2 != r0) goto La
            java.lang.String r2 = ""
            goto L12
        La:
            java.lang.Object[] r0 = r1.f1652
            r2 = r0[r2]
            java.lang.String r2 = m4268(r2)
        L12:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.util.Map<java.lang.String, Yue.C5189.C5190> m4283() {
            r1 = this;
            java.lang.String r0 = "jsoup.attrs"
            java.lang.Object r0 = r1.m4302(r0)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m4284(java.lang.String r2) {
            r1 = this;
            int r2 = r1.m4290(r2)
            r0 = -1
            if (r2 == r0) goto Lf
            java.lang.Object[] r0 = r1.f1652
            r2 = r0[r2]
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m4285(java.lang.String r2) {
            r1 = this;
            int r2 = r1.m4291(r2)
            r0 = -1
            if (r2 == r0) goto Lf
            java.lang.Object[] r0 = r1.f1652
            r2 = r0[r2]
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m4286(java.lang.String r2) {
            r1 = this;
            int r2 = r1.m4290(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m4287(java.lang.String r2) {
            r1 = this;
            int r2 = r1.m4291(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public java.lang.String m4288() {
            r3 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            Yue.ۥ۠۟ۧۥ r1 = new Yue.ۥ۠۟ۧۥ     // Catch: java.io.IOException -> L17
            java.lang.String r2 = ""
            r1.<init>(r2)     // Catch: java.io.IOException -> L17
            Yue.ۥ۠۟ۧۥ$ۥ r1 = r1.m8955()     // Catch: java.io.IOException -> L17
            r3.m4289(r0, r1)     // Catch: java.io.IOException -> L17
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
        L17:
            r0 = move-exception
            Yue.ۥۡۨۢۨ r1 = new Yue.ۥۡۨۢۨ
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m4289(java.lang.Appendable r6, Yue.C1948.C1949 r7) throws java.io.IOException {
            r5 = this;
            int r0 = r5.f1650
            r1 = 0
        L3:
            if (r1 >= r0) goto L30
            java.lang.String[] r2 = r5.f1651
            r2 = r2[r1]
            boolean r2 = m4271(r2)
            if (r2 == 0) goto L10
            goto L2d
        L10:
            java.lang.String[] r2 = r5.f1651
            r2 = r2[r1]
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r3 = r7.m8982()
            java.lang.String r2 = Yue.C0646.m4212(r2, r3)
            if (r2 == 0) goto L2d
            java.lang.Object[] r3 = r5.f1652
            r3 = r3[r1]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 32
            java.lang.Appendable r4 = r6.append(r4)
            Yue.C0646.m4214(r2, r3, r4, r7)
        L2d:
            int r1 = r1 + 1
            goto L3
        L30:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m4290(java.lang.String r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            r0 = 0
        L4:
            int r1 = r2.f1650
            if (r0 >= r1) goto L16
            java.lang.String[] r1 = r2.f1651
            r1 = r1[r0]
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L13
            return r0
        L13:
            int r0 = r0 + 1
            goto L4
        L16:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final int m4291(java.lang.String r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            r0 = 0
        L4:
            int r1 = r2.f1650
            if (r0 >= r1) goto L16
            java.lang.String[] r1 = r2.f1651
            r1 = r1[r0]
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L13
            return r0
        L13:
            int r0 = r0 + 1
            goto L4
        L16:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m4292() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f1650
            if (r0 >= r1) goto L1c
            java.lang.String[] r1 = r3.f1651
            r1 = r1[r0]
            boolean r1 = m4271(r1)
            if (r1 != 0) goto L19
            java.lang.String[] r1 = r3.f1651
            r2 = r1[r0]
            java.lang.String r2 = Yue.C4415.m17326(r2)
            r1[r0] = r2
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public Yue.C0648 m4293(Yue.C0646 r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            java.lang.String r0 = r3.m4219()
            java.lang.String r1 = r3.m4220()
            r2.m4294(r0, r1)
            r3.f1635 = r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public Yue.C0648 m4294(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            Yue.C6657.m25635(r3)
            int r0 = r2.m4290(r3)
            r1 = -1
            if (r0 == r1) goto Lf
            java.lang.Object[] r3 = r2.f1652
            r3[r0] = r4
            goto L12
        Lf:
            r2.m4272(r3, r4)
        L12:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public Yue.C0648 m4295(java.lang.String r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            r2 = 0
            r0.m4296(r1, r2)
            goto La
        L7:
            r0.m4298(r1)
        La:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m4296(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.m4291(r3)
            r1 = -1
            if (r0 == r1) goto L1a
            java.lang.Object[] r1 = r2.f1652
            r1[r0] = r4
            java.lang.String[] r4 = r2.f1651
            r4 = r4[r0]
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L1d
            java.lang.String[] r4 = r2.f1651
            r4[r0] = r3
            goto L1d
        L1a:
            r2.m4272(r3, r4)
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m4297(int r5) {
            r4 = this;
            int r0 = r4.f1650
            r1 = 1
            if (r5 < r0) goto L7
            r0 = r1
            goto L8
        L7:
            r0 = 0
        L8:
            Yue.C6657.m25626(r0)
            int r0 = r4.f1650
            int r0 = r0 - r5
            int r0 = r0 - r1
            if (r0 <= 0) goto L1d
            java.lang.String[] r2 = r4.f1651
            int r3 = r5 + 1
            java.lang.System.arraycopy(r2, r3, r2, r5, r0)
            java.lang.Object[] r2 = r4.f1652
            java.lang.System.arraycopy(r2, r3, r2, r5, r0)
        L1d:
            int r5 = r4.f1650
            int r5 = r5 - r1
            r4.f1650 = r5
            java.lang.String[] r0 = r4.f1651
            r1 = 0
            r0[r5] = r1
            java.lang.Object[] r0 = r4.f1652
            r0[r5] = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m4298(java.lang.String r2) {
            r1 = this;
            int r2 = r1.m4290(r2)
            r0 = -1
            if (r2 == r0) goto La
            r1.m4297(r2)
        La:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m4299(java.lang.String r2) {
            r1 = this;
            int r2 = r1.m4291(r2)
            r0 = -1
            if (r2 == r0) goto La
            r1.m4297(r2)
        La:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public Yue.C5189.C5190 m4300(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.m4286(r2)
            if (r0 != 0) goto L9
            Yue.ۥۡۥۨۦ$ۥ r2 = Yue.C5189.C5190.f19535
            return r2
        L9:
            java.util.Map r0 = r1.m4283()
            if (r0 != 0) goto L12
            Yue.ۥۡۥۨۦ$ۥ r2 = Yue.C5189.C5190.f19535
            return r2
        L12:
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥۡۥۨۦ$ۥ r2 = (Yue.C5189.C5190) r2
            if (r2 == 0) goto L1b
            goto L1d
        L1b:
            Yue.ۥۡۥۨۦ$ۥ r2 = Yue.C5189.C5190.f19535
        L1d:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public Yue.C0648 m4301(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            Yue.C6657.m25635(r2)
            java.util.Map r0 = r1.m4303()
            r0.put(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public java.lang.Object m4302(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            java.lang.String r0 = "/jsoup.userdata"
            boolean r0 = r1.m4286(r0)
            if (r0 != 0) goto Ld
            r2 = 0
            return r2
        Ld:
            java.util.Map r0 = r1.m4303()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.Object> m4303() {
            r3 = this;
            java.lang.String r0 = "/jsoup.userdata"
            int r1 = r3.m4290(r0)
            r2 = -1
            if (r1 != r2) goto L12
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.m4274(r0, r1)
            goto L19
        L12:
            java.lang.Object[] r0 = r3.f1652
            r0 = r0[r1]
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
        L19:
            return r1
    }
}
