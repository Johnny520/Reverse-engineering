package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.4")
@Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
@Yue.InterfaceC5840({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,583:1\n467#1,51:586\n467#1,51:637\n37#2,2:584\n26#3:688\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:586,51\n464#1:637,51\n47#1:584,2\n562#1:688\n*E\n"})
public final class C0561<E> extends Yue.AbstractC0069<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0561.C0562 f1461 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.Object[] f1462 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f1463 = 2147483639;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f1464 = 10;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f1465;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.lang.Object[] f1466;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f1467;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۧۡ$ۥ, reason: contains not printable characters */
    public static final class C0562 {
        public C0562() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0562(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int m2003(int r3, int r4) {
                r2 = this;
                int r0 = r3 >> 1
                int r3 = r3 + r0
                int r0 = r3 - r4
                if (r0 >= 0) goto L8
                r3 = r4
            L8:
                r0 = 2147483639(0x7ffffff7, float:NaN)
                int r1 = r3 - r0
                if (r1 <= 0) goto L16
                if (r4 <= r0) goto L15
                r3 = 2147483647(0x7fffffff, float:NaN)
                goto L16
            L15:
                r3 = r0
            L16:
                return r3
        }
    }

    static {
            Yue.ۥ۟ۡۧۡ$ۥ r0 = new Yue.ۥ۟ۡۧۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0561.f1461 = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            Yue.C0561.f1462 = r0
            return
    }

    public C0561() {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = Yue.C0561.f1462
            r1.f1466 = r0
            return
    }

    public C0561(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 != 0) goto L8
            java.lang.Object[] r4 = Yue.C0561.f1462
            goto Lc
        L8:
            if (r4 <= 0) goto Lf
            java.lang.Object[] r4 = new java.lang.Object[r4]
        Lc:
            r3.f1466 = r4
            return
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal Capacity: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public C0561(@Yue.InterfaceC4418 java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            r1.f1466 = r2
            int r0 = r2.length
            r1.f1467 = r0
            int r2 = r2.length
            if (r2 != 0) goto L1b
            java.lang.Object[] r2 = Yue.C0561.f1462
            r1.f1466 = r2
        L1b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private final void m1984(int r3) {
            r2 = this;
            if (r3 < 0) goto L22
            java.lang.Object[] r0 = r2.f1466
            int r1 = r0.length
            if (r3 > r1) goto L8
            return
        L8:
            java.lang.Object[] r1 = Yue.C0561.f1462
            if (r0 != r1) goto L17
            r0 = 10
            int r3 = Yue.C5196.m19514(r3, r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f1466 = r3
            return
        L17:
            Yue.ۥ۟ۡۧۡ$ۥ r1 = Yue.C0561.f1461
            int r0 = r0.length
            int r3 = r1.m2003(r0, r3)
            r2.m1986(r3)
            return
        L22:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Deque is too big."
            r3.<init>(r0)
            throw r3
    }

    @Override // Yue.AbstractC0069, java.util.AbstractList, java.util.List
    public void add(int r8, E r9) {
            r7 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r7.size()
            r0.m400(r8, r1)
            int r0 = r7.size()
            if (r8 != r0) goto L13
            r7.addLast(r9)
            return
        L13:
            if (r8 != 0) goto L19
            r7.addFirst(r9)
            return
        L19:
            int r0 = r7.size()
            r1 = 1
            int r0 = r0 + r1
            r7.m1984(r0)
            int r0 = r7.f1465
            int r0 = r0 + r8
            int r0 = r7.m1998(r0)
            int r2 = r7.size()
            int r2 = r2 + r1
            int r2 = r2 >> r1
            r3 = 0
            if (r8 >= r2) goto L6a
            int r8 = r7.m1987(r0)
            int r0 = r7.f1465
            int r0 = r7.m1987(r0)
            int r2 = r7.f1465
            if (r8 < r2) goto L4e
            java.lang.Object[] r3 = r7.f1466
            r4 = r3[r2]
            r3[r0] = r4
            int r4 = r2 + 1
            int r5 = r8 + 1
            Yue.C0586.m2176(r3, r3, r2, r4, r5)
            goto L63
        L4e:
            java.lang.Object[] r4 = r7.f1466
            int r5 = r2 + (-1)
            int r6 = r4.length
            Yue.C0586.m2176(r4, r4, r5, r2, r6)
            java.lang.Object[] r2 = r7.f1466
            int r4 = r2.length
            int r4 = r4 - r1
            r5 = r2[r3]
            r2[r4] = r5
            int r4 = r8 + 1
            Yue.C0586.m2176(r2, r2, r3, r1, r4)
        L63:
            java.lang.Object[] r2 = r7.f1466
            r2[r8] = r9
            r7.f1465 = r0
            goto L97
        L6a:
            int r8 = r7.f1465
            int r2 = r7.size()
            int r8 = r8 + r2
            int r8 = r7.m1998(r8)
            if (r0 >= r8) goto L7f
            java.lang.Object[] r2 = r7.f1466
            int r3 = r0 + 1
            Yue.C0586.m2176(r2, r2, r3, r0, r8)
            goto L93
        L7f:
            java.lang.Object[] r2 = r7.f1466
            Yue.C0586.m2176(r2, r2, r1, r3, r8)
            java.lang.Object[] r8 = r7.f1466
            int r2 = r8.length
            int r2 = r2 - r1
            r2 = r8[r2]
            r8[r3] = r2
            int r2 = r0 + 1
            int r3 = r8.length
            int r3 = r3 - r1
            Yue.C0586.m2176(r8, r8, r2, r0, r3)
        L93:
            java.lang.Object[] r8 = r7.f1466
            r8[r0] = r9
        L97:
            int r8 = r7.size()
            int r8 = r8 + r1
            r7.f1467 = r8
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r1) {
            r0 = this;
            r0.addLast(r1)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r9, @Yue.InterfaceC4418 java.util.Collection<? extends E> r10) {
            r8 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r10, r0)
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r8.size()
            r0.m400(r9, r1)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto L16
            return r1
        L16:
            int r0 = r8.size()
            if (r9 != r0) goto L21
            boolean r9 = r8.addAll(r10)
            return r9
        L21:
            int r0 = r8.size()
            int r2 = r10.size()
            int r0 = r0 + r2
            r8.m1984(r0)
            int r0 = r8.f1465
            int r2 = r8.size()
            int r0 = r0 + r2
            int r0 = r8.m1998(r0)
            int r2 = r8.f1465
            int r2 = r2 + r9
            int r2 = r8.m1998(r2)
            int r3 = r10.size()
            int r4 = r8.size()
            r5 = 1
            int r4 = r4 + r5
            int r4 = r4 >> r5
            if (r9 >= r4) goto L9d
            int r9 = r8.f1465
            int r0 = r9 - r3
            if (r2 < r9) goto L76
            if (r0 < 0) goto L5a
            java.lang.Object[] r1 = r8.f1466
            Yue.C0586.m2176(r1, r1, r0, r9, r2)
            goto L92
        L5a:
            java.lang.Object[] r4 = r8.f1466
            int r6 = r4.length
            int r0 = r0 + r6
            int r6 = r2 - r9
            int r7 = r4.length
            int r7 = r7 - r0
            if (r7 < r6) goto L68
            Yue.C0586.m2176(r4, r4, r0, r9, r2)
            goto L92
        L68:
            int r6 = r9 + r7
            Yue.C0586.m2176(r4, r4, r0, r9, r6)
            java.lang.Object[] r9 = r8.f1466
            int r4 = r8.f1465
            int r4 = r4 + r7
            Yue.C0586.m2176(r9, r9, r1, r4, r2)
            goto L92
        L76:
            java.lang.Object[] r4 = r8.f1466
            int r6 = r4.length
            Yue.C0586.m2176(r4, r4, r0, r9, r6)
            if (r3 < r2) goto L86
            java.lang.Object[] r9 = r8.f1466
            int r4 = r9.length
            int r4 = r4 - r3
            Yue.C0586.m2176(r9, r9, r4, r1, r2)
            goto L92
        L86:
            java.lang.Object[] r9 = r8.f1466
            int r4 = r9.length
            int r4 = r4 - r3
            Yue.C0586.m2176(r9, r9, r4, r1, r3)
            java.lang.Object[] r9 = r8.f1466
            Yue.C0586.m2176(r9, r9, r1, r3, r2)
        L92:
            r8.f1465 = r0
            int r2 = r2 - r3
            int r9 = r8.m1997(r2)
            r8.m1985(r9, r10)
            goto Le2
        L9d:
            int r9 = r2 + r3
            if (r2 >= r0) goto Lc1
            int r3 = r3 + r0
            java.lang.Object[] r4 = r8.f1466
            int r6 = r4.length
            if (r3 > r6) goto Lab
            Yue.C0586.m2176(r4, r4, r9, r2, r0)
            goto Ldf
        Lab:
            int r6 = r4.length
            if (r9 < r6) goto Lb4
            int r1 = r4.length
            int r9 = r9 - r1
            Yue.C0586.m2176(r4, r4, r9, r2, r0)
            goto Ldf
        Lb4:
            int r6 = r4.length
            int r3 = r3 - r6
            int r3 = r0 - r3
            Yue.C0586.m2176(r4, r4, r1, r3, r0)
            java.lang.Object[] r0 = r8.f1466
            Yue.C0586.m2176(r0, r0, r9, r2, r3)
            goto Ldf
        Lc1:
            java.lang.Object[] r4 = r8.f1466
            Yue.C0586.m2176(r4, r4, r3, r1, r0)
            java.lang.Object[] r0 = r8.f1466
            int r4 = r0.length
            if (r9 < r4) goto Ld2
            int r1 = r0.length
            int r9 = r9 - r1
            int r1 = r0.length
            Yue.C0586.m2176(r0, r0, r9, r2, r1)
            goto Ldf
        Ld2:
            int r4 = r0.length
            int r4 = r4 - r3
            int r6 = r0.length
            Yue.C0586.m2176(r0, r0, r1, r4, r6)
            java.lang.Object[] r0 = r8.f1466
            int r1 = r0.length
            int r1 = r1 - r3
            Yue.C0586.m2176(r0, r0, r9, r2, r1)
        Ldf:
            r8.m1985(r2, r10)
        Le2:
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@Yue.InterfaceC4418 java.util.Collection<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld
            r3 = 0
            return r3
        Ld:
            int r0 = r2.size()
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m1984(r0)
            int r0 = r2.f1465
            int r1 = r2.size()
            int r0 = r0 + r1
            int r0 = r2.m1998(r0)
            r2.m1985(r0, r3)
            r3 = 1
            return r3
    }

    public final void addFirst(E r3) {
            r2 = this;
            int r0 = r2.size()
            int r0 = r0 + 1
            r2.m1984(r0)
            int r0 = r2.f1465
            int r0 = r2.m1987(r0)
            r2.f1465 = r0
            java.lang.Object[] r1 = r2.f1466
            r1[r0] = r3
            int r3 = r2.size()
            int r3 = r3 + 1
            r2.f1467 = r3
            return
    }

    public final void addLast(E r4) {
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + 1
            r3.m1984(r0)
            java.lang.Object[] r0 = r3.f1466
            int r1 = r3.f1465
            int r2 = r3.size()
            int r1 = r1 + r2
            int r1 = r3.m1998(r1)
            r0[r1] = r4
            int r4 = r3.size()
            int r4 = r4 + 1
            r3.f1467 = r4
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r6 = this;
            int r0 = r6.f1465
            int r1 = r6.size()
            int r0 = r0 + r1
            int r0 = r6.m1998(r0)
            int r1 = r6.f1465
            r2 = 0
            r3 = 0
            if (r1 >= r0) goto L17
            java.lang.Object[] r4 = r6.f1466
            Yue.C0586.m2239(r4, r3, r1, r0)
            goto L2c
        L17:
            boolean r1 = r6.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L2c
            java.lang.Object[] r1 = r6.f1466
            int r4 = r6.f1465
            int r5 = r1.length
            Yue.C0586.m2239(r1, r3, r4, r5)
            java.lang.Object[] r1 = r6.f1466
            Yue.C0586.m2239(r1, r3, r2, r0)
        L2c:
            r6.f1465 = r2
            r6.f1467 = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
            r2 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.size()
            r0.m399(r3, r1)
            java.lang.Object[] r0 = r2.f1466
            int r1 = r2.f1465
            int r1 = r1 + r3
            int r3 = r2.m1998(r1)
            r3 = r0[r3]
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f1465
            int r1 = r4.size()
            int r0 = r0 + r1
            int r0 = r4.m1998(r0)
            int r1 = r4.f1465
            if (r1 >= r0) goto L22
        Lf:
            if (r1 >= r0) goto L50
            java.lang.Object[] r2 = r4.f1466
            r2 = r2[r1]
            boolean r2 = Yue.C3329.m13897(r5, r2)
            if (r2 == 0) goto L1f
            int r5 = r4.f1465
        L1d:
            int r1 = r1 - r5
            return r1
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            if (r1 < r0) goto L50
            java.lang.Object[] r2 = r4.f1466
            int r2 = r2.length
        L27:
            if (r1 >= r2) goto L39
            java.lang.Object[] r3 = r4.f1466
            r3 = r3[r1]
            boolean r3 = Yue.C3329.m13897(r5, r3)
            if (r3 == 0) goto L36
            int r5 = r4.f1465
            goto L1d
        L36:
            int r1 = r1 + 1
            goto L27
        L39:
            r1 = 0
        L3a:
            if (r1 >= r0) goto L50
            java.lang.Object[] r2 = r4.f1466
            r2 = r2[r1]
            boolean r2 = Yue.C3329.m13897(r5, r2)
            if (r2 == 0) goto L4d
            java.lang.Object[] r5 = r4.f1466
            int r5 = r5.length
            int r1 = r1 + r5
            int r5 = r4.f1465
            goto L1d
        L4d:
            int r1 = r1 + 1
            goto L3a
        L50:
            r5 = -1
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f1465
            int r1 = r4.size()
            int r0 = r0 + r1
            int r0 = r4.m1998(r0)
            int r1 = r4.f1465
            r2 = -1
            if (r1 >= r0) goto L27
            int r0 = r0 + (-1)
            if (r1 > r0) goto L5d
        L14:
            java.lang.Object[] r3 = r4.f1466
            r3 = r3[r0]
            boolean r3 = Yue.C3329.m13897(r5, r3)
            if (r3 == 0) goto L22
            int r5 = r4.f1465
        L20:
            int r0 = r0 - r5
            return r0
        L22:
            if (r0 == r1) goto L5d
            int r0 = r0 + (-1)
            goto L14
        L27:
            if (r1 <= r0) goto L5d
            int r0 = r0 + (-1)
        L2b:
            if (r2 >= r0) goto L41
            java.lang.Object[] r1 = r4.f1466
            r1 = r1[r0]
            boolean r1 = Yue.C3329.m13897(r5, r1)
            if (r1 == 0) goto L3e
            java.lang.Object[] r5 = r4.f1466
            int r5 = r5.length
            int r0 = r0 + r5
            int r5 = r4.f1465
            goto L20
        L3e:
            int r0 = r0 + (-1)
            goto L2b
        L41:
            java.lang.Object[] r0 = r4.f1466
            int r0 = Yue.C0595.m2931(r0)
            int r1 = r4.f1465
            if (r1 > r0) goto L5d
        L4b:
            java.lang.Object[] r3 = r4.f1466
            r3 = r3[r0]
            boolean r3 = Yue.C3329.m13897(r5, r3)
            if (r3 == 0) goto L58
            int r5 = r4.f1465
            goto L20
        L58:
            if (r0 == r1) goto L5d
            int r0 = r0 + (-1)
            goto L4b
        L5d:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            r1.remove(r2)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r12) {
            r11 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L91
            java.lang.Object[] r0 = r11.f1466
            int r0 = r0.length
            if (r0 != 0) goto L13
            goto L91
        L13:
            int r0 = r11.f1465
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.m1998(r0)
            int r2 = r11.f1465
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L44
            r5 = r2
        L25:
            if (r2 >= r0) goto L3e
            java.lang.Object[] r6 = r11.f1466
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r4
            if (r7 == 0) goto L3a
            java.lang.Object[] r7 = r11.f1466
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L3b
        L3a:
            r1 = r4
        L3b:
            int r2 = r2 + 1
            goto L25
        L3e:
            java.lang.Object[] r12 = r11.f1466
            Yue.C0586.m2239(r12, r3, r5, r0)
            goto L86
        L44:
            java.lang.Object[] r5 = r11.f1466
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L49:
            if (r2 >= r5) goto L64
            java.lang.Object[] r8 = r11.f1466
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r4
            if (r8 == 0) goto L60
            java.lang.Object[] r8 = r11.f1466
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L61
        L60:
            r7 = r4
        L61:
            int r2 = r2 + 1
            goto L49
        L64:
            int r2 = r11.m1998(r6)
            r5 = r2
        L69:
            if (r1 >= r0) goto L85
            java.lang.Object[] r2 = r11.f1466
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            r2 = r2 ^ r4
            if (r2 == 0) goto L81
            java.lang.Object[] r2 = r11.f1466
            r2[r5] = r6
            int r5 = r11.m1991(r5)
            goto L82
        L81:
            r7 = r4
        L82:
            int r1 = r1 + 1
            goto L69
        L85:
            r1 = r7
        L86:
            if (r1 == 0) goto L91
            int r12 = r11.f1465
            int r5 = r5 - r12
            int r12 = r11.m1997(r5)
            r11.f1467 = r12
        L91:
            return r1
    }

    public final E removeFirst() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1e
            java.lang.Object[] r0 = r4.f1466
            int r1 = r4.f1465
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            int r0 = r4.m1991(r1)
            r4.f1465 = r0
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r4.f1467 = r0
            return r2
        L1e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E removeLast() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L21
            int r0 = r4.f1465
            int r1 = Yue.C1208.m6212(r4)
            int r0 = r0 + r1
            int r0 = r4.m1998(r0)
            java.lang.Object[] r1 = r4.f1466
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r4.f1467 = r0
            return r2
        L21:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r12) {
            r11 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L8e
            java.lang.Object[] r0 = r11.f1466
            int r0 = r0.length
            if (r0 != 0) goto L13
            goto L8e
        L13:
            int r0 = r11.f1465
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.m1998(r0)
            int r2 = r11.f1465
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L43
            r5 = r2
        L25:
            if (r2 >= r0) goto L3d
            java.lang.Object[] r6 = r11.f1466
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L39
            java.lang.Object[] r7 = r11.f1466
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L3a
        L39:
            r1 = r4
        L3a:
            int r2 = r2 + 1
            goto L25
        L3d:
            java.lang.Object[] r12 = r11.f1466
            Yue.C0586.m2239(r12, r3, r5, r0)
            goto L83
        L43:
            java.lang.Object[] r5 = r11.f1466
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L48:
            if (r2 >= r5) goto L62
            java.lang.Object[] r8 = r11.f1466
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L5e
            java.lang.Object[] r8 = r11.f1466
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L5f
        L5e:
            r7 = r4
        L5f:
            int r2 = r2 + 1
            goto L48
        L62:
            int r2 = r11.m1998(r6)
            r5 = r2
        L67:
            if (r1 >= r0) goto L82
            java.lang.Object[] r2 = r11.f1466
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L7e
            java.lang.Object[] r2 = r11.f1466
            r2[r5] = r6
            int r5 = r11.m1991(r5)
            goto L7f
        L7e:
            r7 = r4
        L7f:
            int r1 = r1 + 1
            goto L67
        L82:
            r1 = r7
        L83:
            if (r1 == 0) goto L8e
            int r12 = r11.f1465
            int r5 = r5 - r12
            int r12 = r11.m1997(r5)
            r11.f1467 = r12
        L8e:
            return r1
    }

    @Override // Yue.AbstractC0069, java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.size()
            r0.m399(r3, r1)
            int r0 = r2.f1465
            int r0 = r0 + r3
            int r3 = r2.m1998(r0)
            java.lang.Object[] r0 = r2.f1466
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Yue.InterfaceC4418
    public java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Yue.InterfaceC4418
    public <T> T[] toArray(@Yue.InterfaceC4418 T[] r8) {
            r7 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r8, r0)
            int r0 = r8.length
            int r1 = r7.size()
            if (r0 < r1) goto Ld
            goto L15
        Ld:
            int r0 = r7.size()
            java.lang.Object[] r8 = Yue.C0584.m2097(r8, r0)
        L15:
            int r0 = r7.f1465
            int r1 = r7.size()
            int r0 = r0 + r1
            int r4 = r7.m1998(r0)
            int r3 = r7.f1465
            if (r3 >= r4) goto L2e
            java.lang.Object[] r0 = r7.f1466
            r5 = 2
            r6 = 0
            r2 = 0
            r1 = r8
            Yue.C0586.m2185(r0, r1, r2, r3, r4, r5, r6)
            goto L48
        L2e:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L48
            java.lang.Object[] r0 = r7.f1466
            int r1 = r7.f1465
            int r2 = r0.length
            r3 = 0
            Yue.C0586.m2176(r0, r8, r3, r1, r2)
            java.lang.Object[] r0 = r7.f1466
            int r1 = r0.length
            int r2 = r7.f1465
            int r1 = r1 - r2
            Yue.C0586.m2176(r0, r8, r1, r3, r4)
        L48:
            int r0 = r8.length
            int r1 = r7.size()
            if (r0 <= r1) goto L56
            int r0 = r7.size()
            r1 = 0
            r8[r0] = r1
        L56:
            return r8
    }

    @Override // Yue.AbstractC0069
    /* JADX INFO: renamed from: ۥ */
    public int mo428() {
            r1 = this;
            int r0 = r1.f1467
            return r0
    }

    @Override // Yue.AbstractC0069
    /* JADX INFO: renamed from: ۥ۟ */
    public E mo429(int r9) {
            r8 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r8.size()
            r0.m399(r9, r1)
            int r0 = Yue.C1208.m6212(r8)
            if (r9 != r0) goto L14
            java.lang.Object r9 = r8.removeLast()
            return r9
        L14:
            if (r9 != 0) goto L1b
            java.lang.Object r9 = r8.removeFirst()
            return r9
        L1b:
            int r0 = r8.f1465
            int r0 = r0 + r9
            int r0 = r8.m1998(r0)
            java.lang.Object[] r1 = r8.f1466
            r1 = r1[r0]
            int r2 = r8.size()
            r3 = 1
            int r2 = r2 >> r3
            r4 = 0
            r5 = 0
            if (r9 >= r2) goto L5f
            int r9 = r8.f1465
            if (r0 < r9) goto L3c
            java.lang.Object[] r2 = r8.f1466
            int r5 = r9 + 1
            Yue.C0586.m2176(r2, r2, r5, r9, r0)
            goto L52
        L3c:
            java.lang.Object[] r9 = r8.f1466
            Yue.C0586.m2176(r9, r9, r3, r5, r0)
            java.lang.Object[] r9 = r8.f1466
            int r0 = r9.length
            int r0 = r0 - r3
            r0 = r9[r0]
            r9[r5] = r0
            int r0 = r8.f1465
            int r2 = r0 + 1
            int r5 = r9.length
            int r5 = r5 - r3
            Yue.C0586.m2176(r9, r9, r2, r0, r5)
        L52:
            java.lang.Object[] r9 = r8.f1466
            int r0 = r8.f1465
            r9[r0] = r4
            int r9 = r8.m1991(r0)
            r8.f1465 = r9
            goto L8f
        L5f:
            int r9 = r8.f1465
            int r2 = Yue.C1208.m6212(r8)
            int r9 = r9 + r2
            int r9 = r8.m1998(r9)
            if (r0 > r9) goto L76
            java.lang.Object[] r2 = r8.f1466
            int r5 = r0 + 1
            int r6 = r9 + 1
            Yue.C0586.m2176(r2, r2, r0, r5, r6)
            goto L8b
        L76:
            java.lang.Object[] r2 = r8.f1466
            int r6 = r0 + 1
            int r7 = r2.length
            Yue.C0586.m2176(r2, r2, r0, r6, r7)
            java.lang.Object[] r0 = r8.f1466
            int r2 = r0.length
            int r2 = r2 - r3
            r6 = r0[r5]
            r0[r2] = r6
            int r2 = r9 + 1
            Yue.C0586.m2176(r0, r0, r5, r3, r2)
        L8b:
            java.lang.Object[] r0 = r8.f1466
            r0[r9] = r4
        L8f:
            int r9 = r8.size()
            int r9 = r9 - r3
            r8.f1467 = r9
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1985(int r5, java.util.Collection<? extends E> r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object[] r1 = r4.f1466
            int r1 = r1.length
        L7:
            if (r5 >= r1) goto L1a
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object[] r2 = r4.f1466
            java.lang.Object r3 = r0.next()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L7
        L1a:
            int r5 = r4.f1465
            r1 = 0
        L1d:
            if (r1 >= r5) goto L30
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object[] r2 = r4.f1466
            java.lang.Object r3 = r0.next()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1d
        L30:
            int r5 = r4.size()
            int r6 = r6.size()
            int r5 = r5 + r6
            r4.f1467 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m1986(int r5) {
            r4 = this;
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r0 = r4.f1466
            int r1 = r4.f1465
            int r2 = r0.length
            r3 = 0
            Yue.C0586.m2176(r0, r5, r3, r1, r2)
            java.lang.Object[] r0 = r4.f1466
            int r1 = r0.length
            int r2 = r4.f1465
            int r1 = r1 - r2
            Yue.C0586.m2176(r0, r5, r1, r3, r2)
            r4.f1465 = r3
            r4.f1466 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m1987(int r1) {
            r0 = this;
            if (r1 != 0) goto L9
            java.lang.Object[] r1 = r0.f1466
            int r1 = Yue.C0595.m2931(r1)
            goto Lb
        L9:
            int r1 = r1 + (-1)
        Lb:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m1988(Yue.InterfaceC2825<? super E, java.lang.Boolean> r12) {
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L9b
            java.lang.Object[] r0 = r11.f1466
            int r0 = r0.length
            if (r0 != 0) goto Le
            goto L9b
        Le:
            int r0 = r11.f1465
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.m1998(r0)
            int r2 = r11.f1465
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L44
            r5 = r2
        L20:
            if (r2 >= r0) goto L3e
            java.lang.Object[] r6 = r11.f1466
            r6 = r6[r2]
            java.lang.Object r7 = r12.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3a
            java.lang.Object[] r7 = r11.f1466
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L3b
        L3a:
            r1 = r4
        L3b:
            int r2 = r2 + 1
            goto L20
        L3e:
            java.lang.Object[] r12 = r11.f1466
            Yue.C0586.m2239(r12, r3, r5, r0)
            goto L90
        L44:
            java.lang.Object[] r5 = r11.f1466
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L49:
            if (r2 >= r5) goto L69
            java.lang.Object[] r8 = r11.f1466
            r9 = r8[r2]
            r8[r2] = r3
            java.lang.Object r8 = r12.invoke(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L65
            java.lang.Object[] r8 = r11.f1466
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L66
        L65:
            r7 = r4
        L66:
            int r2 = r2 + 1
            goto L49
        L69:
            int r2 = r11.m1998(r6)
            r5 = r2
        L6e:
            if (r1 >= r0) goto L8f
            java.lang.Object[] r2 = r11.f1466
            r6 = r2[r1]
            r2[r1] = r3
            java.lang.Object r2 = r12.invoke(r6)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L8b
            java.lang.Object[] r2 = r11.f1466
            r2[r5] = r6
            int r5 = r11.m1991(r5)
            goto L8c
        L8b:
            r7 = r4
        L8c:
            int r1 = r1 + 1
            goto L6e
        L8f:
            r1 = r7
        L90:
            if (r1 == 0) goto L9b
            int r12 = r11.f1465
            int r5 = r5 - r12
            int r12 = r11.m1997(r5)
            r11.f1467 = r12
        L9b:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final E m1989() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Ld
            java.lang.Object[] r0 = r2.f1466
            int r1 = r2.f1465
            r0 = r0[r1]
            return r0
        Ld:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final E m1990() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Le
        L8:
            java.lang.Object[] r0 = r2.f1466
            int r1 = r2.f1465
            r0 = r0[r1]
        Le:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m1991(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f1466
            int r0 = Yue.C0595.m2931(r0)
            if (r2 != r0) goto La
            r2 = 0
            goto Lc
        La:
            int r2 = r2 + 1
        Lc:
            return r2
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final E m1992(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f1466
            r2 = r0[r2]
            return r2
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m1993(int r2) {
            r1 = this;
            int r0 = r1.f1465
            int r0 = r0 + r2
            int r2 = r1.m1998(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m1994(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Integer, ? super java.lang.Object[], Yue.C6593> r3) {
            r2 = this;
            java.lang.String r0 = "structure"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.f1465
            int r1 = r2.size()
            int r0 = r0 + r1
            int r0 = r2.m1998(r0)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L20
            int r1 = r2.f1465
            if (r1 >= r0) goto L1b
            goto L20
        L1b:
            java.lang.Object[] r0 = r2.f1466
            int r0 = r0.length
            int r1 = r1 - r0
            goto L22
        L20:
            int r1 = r2.f1465
        L22:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = r2.toArray()
            r3.invoke(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final E m1995() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L16
            java.lang.Object[] r0 = r3.f1466
            int r1 = r3.f1465
            int r2 = Yue.C1208.m6212(r3)
            int r1 = r1 + r2
            int r1 = r3.m1998(r1)
            r0 = r0[r1]
            return r0
        L16:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final E m1996() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto L17
        L8:
            java.lang.Object[] r0 = r3.f1466
            int r1 = r3.f1465
            int r2 = Yue.C1208.m6212(r3)
            int r1 = r1 + r2
            int r1 = r3.m1998(r1)
            r0 = r0[r1]
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m1997(int r2) {
            r1 = this;
            if (r2 >= 0) goto L6
            java.lang.Object[] r0 = r1.f1466
            int r0 = r0.length
            int r2 = r2 + r0
        L6:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m1998(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.f1466
            int r1 = r0.length
            if (r3 < r1) goto L7
            int r0 = r0.length
            int r3 = r3 - r0
        L7:
            return r3
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final E m1999() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.Object r0 = r1.removeFirst()
        Lc:
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final E m2000() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.Object r0 = r1.removeLast()
        Lc:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.lang.Object[] m2001() {
            r1 = this;
            java.lang.Object[] r0 = r1.toArray()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final <T> T[] m2002(@Yue.InterfaceC4418 T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object[] r2 = r1.toArray(r2)
            return r2
    }
}
