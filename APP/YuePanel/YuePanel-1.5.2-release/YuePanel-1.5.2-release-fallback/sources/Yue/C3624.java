package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class C3624<E> extends Yue.AbstractC0069<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, Yue.InterfaceC3447 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3624.C3625 f11537 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3624 f11538 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public E[] f11539;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f11540;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f11541;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f11542;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.C3624<E> f11543;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.C3624<E> f11544;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۡ$ۥ, reason: contains not printable characters */
    public static final class C3625 {
        public C3625() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3625(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۡ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
    public static final class C3626<E> implements java.util.ListIterator<E>, Yue.InterfaceC3448 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C3624<E> f11545;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f11546;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11547;

        public C3626(@Yue.InterfaceC4418 Yue.C3624<E> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "list"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f11545 = r2
                r1.f11546 = r3
                r2 = -1
                r1.f11547 = r2
                return
        }

        @Override // java.util.ListIterator
        public void add(E r4) {
                r3 = this;
                Yue.ۥ۠ۧۢۡ<E> r0 = r3.f11545
                int r1 = r3.f11546
                int r2 = r1 + 1
                r3.f11546 = r2
                r0.add(r1, r4)
                r4 = -1
                r3.f11547 = r4
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f11546
                Yue.ۥ۠ۧۢۡ<E> r1 = r2.f11545
                int r1 = Yue.C3624.m14652(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.f11546
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
                r3 = this;
                int r0 = r3.f11546
                Yue.ۥ۠ۧۢۡ<E> r1 = r3.f11545
                int r1 = Yue.C3624.m14652(r1)
                if (r0 >= r1) goto L24
                int r0 = r3.f11546
                int r1 = r0 + 1
                r3.f11546 = r1
                r3.f11547 = r0
                Yue.ۥ۠ۧۢۡ<E> r0 = r3.f11545
                java.lang.Object[] r0 = Yue.C3624.m14651(r0)
                Yue.ۥ۠ۧۢۡ<E> r1 = r3.f11545
                int r1 = Yue.C3624.m14653(r1)
                int r2 = r3.f11547
                int r1 = r1 + r2
                r0 = r0[r1]
                return r0
            L24:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.f11546
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r3 = this;
                int r0 = r3.f11546
                if (r0 <= 0) goto L1c
                int r0 = r0 + (-1)
                r3.f11546 = r0
                r3.f11547 = r0
                Yue.ۥ۠ۧۢۡ<E> r0 = r3.f11545
                java.lang.Object[] r0 = Yue.C3624.m14651(r0)
                Yue.ۥ۠ۧۢۡ<E> r1 = r3.f11545
                int r1 = Yue.C3624.m14653(r1)
                int r2 = r3.f11547
                int r1 = r1 + r2
                r0 = r0[r1]
                return r0
            L1c:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.f11546
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r3 = this;
                int r0 = r3.f11547
                r1 = -1
                if (r0 == r1) goto L11
                Yue.ۥ۠ۧۢۡ<E> r2 = r3.f11545
                r2.remove(r0)
                int r0 = r3.f11547
                r3.f11546 = r0
                r3.f11547 = r1
                return
            L11:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() or previous() before removing element from the iterator."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.ListIterator
        public void set(E r3) {
                r2 = this;
                int r0 = r2.f11547
                r1 = -1
                if (r0 == r1) goto Lb
                Yue.ۥ۠ۧۢۡ<E> r1 = r2.f11545
                r1.set(r0, r3)
                return
            Lb:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Call next() or previous() before replacing element from the iterator."
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    static {
            Yue.ۥ۠ۧۢۡ$ۥ r0 = new Yue.ۥ۠ۧۢۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3624.f11537 = r0
            Yue.ۥ۠ۧۢۡ r0 = new Yue.ۥ۠ۧۢۡ
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.f11542 = r1
            Yue.C3624.f11538 = r0
            return
    }

    public C3624() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public C3624(int r8) {
            r7 = this;
            java.lang.Object[] r1 = Yue.C3627.m14670(r8)
            r5 = 0
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C3624(E[] r1, int r2, int r3, boolean r4, Yue.C3624<E> r5, Yue.C3624<E> r6) {
            r0 = this;
            r0.<init>()
            r0.f11539 = r1
            r0.f11540 = r2
            r0.f11541 = r3
            r0.f11542 = r4
            r0.f11543 = r5
            r0.f11544 = r6
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object[] m14651(Yue.C3624 r0) {
            E[] r0 = r0.f11539
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m14652(Yue.C3624 r0) {
            int r0 = r0.f11541
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m14653(Yue.C3624 r0) {
            int r0 = r0.f11540
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    private final void m14654(int r3) {
            r2 = this;
            Yue.ۥ۠ۧۢۡ<E> r0 = r2.f11543
            if (r0 != 0) goto L21
            if (r3 < 0) goto L1b
            E[] r0 = r2.f11539
            int r1 = r0.length
            if (r3 <= r1) goto L1a
            Yue.ۥ۟ۡۧۡ$ۥ r1 = Yue.C0561.f1461
            int r0 = r0.length
            int r3 = r1.m2003(r0, r3)
            E[] r0 = r2.f11539
            java.lang.Object[] r3 = Yue.C3627.m14671(r0, r3)
            r2.f11539 = r3
        L1a:
            return
        L1b:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError
            r3.<init>()
            throw r3
        L21:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    private final java.lang.Object m14655() {
            r2 = this;
            boolean r0 = r2.m14663()
            if (r0 == 0) goto Ld
            Yue.ۥۣۡۨ r0 = new Yue.ۥۣۡۨ
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        Ld:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The list cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.AbstractC0069, java.util.AbstractList, java.util.List
    public void add(int r3, E r4) {
            r2 = this;
            r2.m14659()
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.f11541
            r0.m400(r3, r1)
            int r0 = r2.f11540
            int r0 = r0 + r3
            r2.m14657(r0, r4)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r3) {
            r2 = this;
            r2.m14659()
            int r0 = r2.f11540
            int r1 = r2.f11541
            int r0 = r0 + r1
            r2.m14657(r0, r3)
            r3 = 1
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r3, @Yue.InterfaceC4418 java.util.Collection<? extends E> r4) {
            r2 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r4, r0)
            r2.m14659()
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.f11541
            r0.m400(r3, r1)
            int r0 = r4.size()
            int r1 = r2.f11540
            int r1 = r1 + r3
            r2.m14656(r1, r4, r0)
            if (r0 <= 0) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@Yue.InterfaceC4418 java.util.Collection<? extends E> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r4, r0)
            r3.m14659()
            int r0 = r4.size()
            int r1 = r3.f11540
            int r2 = r3.f11541
            int r1 = r1 + r2
            r3.m14656(r1, r4, r0)
            if (r0 <= 0) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            return r4
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r2 = this;
            r2.m14659()
            int r0 = r2.f11540
            int r1 = r2.f11541
            r2.m14665(r0, r1)
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L11
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto Lf
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r1.m14660(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
            r2 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.f11541
            r0.m399(r3, r1)
            E[] r0 = r2.f11539
            int r1 = r2.f11540
            int r1 = r1 + r3
            r3 = r0[r1]
            return r3
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r3 = this;
            E[] r0 = r3.f11539
            int r1 = r3.f11540
            int r2 = r3.f11541
            int r0 = Yue.C3627.m14668(r0, r1, r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f11541
            if (r0 >= r1) goto L16
            E[] r1 = r3.f11539
            int r2 = r3.f11540
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = Yue.C3329.m13897(r1, r4)
            if (r1 == 0) goto L13
            return r0
        L13:
            int r0 = r0 + 1
            goto L1
        L16:
            r4 = -1
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f11541
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @Yue.InterfaceC4418
    public java.util.Iterator<E> iterator() {
            r2 = this;
            Yue.ۥ۠ۧۢۡ$ۥ۟ r0 = new Yue.ۥ۠ۧۢۡ$ۥ۟
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f11541
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L17
            E[] r1 = r3.f11539
            int r2 = r3.f11540
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = Yue.C3329.m13897(r1, r4)
            if (r1 == 0) goto L14
            return r0
        L14:
            int r0 = r0 + (-1)
            goto L4
        L17:
            r4 = -1
            return r4
    }

    @Override // java.util.AbstractList, java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator<E> listIterator() {
            r2 = this;
            Yue.ۥ۠ۧۢۡ$ۥ۟ r0 = new Yue.ۥ۠ۧۢۡ$ۥ۟
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator<E> listIterator(int r3) {
            r2 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.f11541
            r0.m400(r3, r1)
            Yue.ۥ۠ۧۢۡ$ۥ۟ r0 = new Yue.ۥ۠ۧۢۡ$ۥ۟
            r0.<init>(r2, r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            r0.m14659()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lc
            r0.remove(r1)
        Lc:
            if (r1 < 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r4, r0)
            r3.m14659()
            int r0 = r3.f11540
            int r1 = r3.f11541
            r2 = 0
            int r4 = r3.m14666(r0, r1, r4, r2)
            if (r4 <= 0) goto L14
            r2 = 1
        L14:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r4, r0)
            r3.m14659()
            int r0 = r3.f11540
            int r1 = r3.f11541
            r2 = 1
            int r4 = r3.m14666(r0, r1, r4, r2)
            if (r4 <= 0) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    @Override // Yue.AbstractC0069, java.util.AbstractList, java.util.List
    public E set(int r4, E r5) {
            r3 = this;
            r3.m14659()
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r3.f11541
            r0.m399(r4, r1)
            E[] r0 = r3.f11539
            int r1 = r3.f11540
            int r2 = r1 + r4
            r2 = r0[r2]
            int r1 = r1 + r4
            r0[r1] = r5
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    @Yue.InterfaceC4418
    public java.util.List<E> subList(int r10, int r11) {
            r9 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r9.f11541
            r0.m401(r10, r11, r1)
            Yue.ۥ۠ۧۢۡ r0 = new Yue.ۥ۠ۧۢۡ
            E[] r3 = r9.f11539
            int r1 = r9.f11540
            int r4 = r1 + r10
            int r5 = r11 - r10
            boolean r6 = r9.f11542
            Yue.ۥ۠ۧۢۡ<E> r10 = r9.f11544
            if (r10 != 0) goto L19
            r8 = r9
            goto L1a
        L19:
            r8 = r10
        L1a:
            r2 = r0
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Yue.InterfaceC4418
    public java.lang.Object[] toArray() {
            r3 = this;
            E[] r0 = r3.f11539
            int r1 = r3.f11540
            int r2 = r3.f11541
            int r2 = r2 + r1
            java.lang.Object[] r0 = Yue.C0586.m2212(r0, r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Yue.InterfaceC4418
    public <T> T[] toArray(@Yue.InterfaceC4418 T[] r5) {
            r4 = this;
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r5, r0)
            int r0 = r5.length
            int r1 = r4.f11541
            if (r0 >= r1) goto L1d
            E[] r0 = r4.f11539
            int r2 = r4.f11540
            int r1 = r1 + r2
            java.lang.Class r5 = r5.getClass()
            java.lang.Object[] r5 = java.util.Arrays.copyOfRange(r0, r2, r1, r5)
            java.lang.String r0 = "copyOfRange(array, offse…h, destination.javaClass)"
            Yue.C3329.m13905(r5, r0)
            return r5
        L1d:
            E[] r0 = r4.f11539
            int r2 = r4.f11540
            int r1 = r1 + r2
            r3 = 0
            Yue.C0586.m2176(r0, r5, r3, r2, r1)
            int r0 = r5.length
            int r1 = r4.f11541
            if (r0 <= r1) goto L2e
            r0 = 0
            r5[r1] = r0
        L2e:
            return r5
    }

    @Override // java.util.AbstractCollection
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            E[] r0 = r3.f11539
            int r1 = r3.f11540
            int r2 = r3.f11541
            java.lang.String r0 = Yue.C3627.m14669(r0, r1, r2)
            return r0
    }

    @Override // Yue.AbstractC0069
    /* JADX INFO: renamed from: ۥ */
    public int mo428() {
            r1 = this;
            int r0 = r1.f11541
            return r0
    }

    @Override // Yue.AbstractC0069
    /* JADX INFO: renamed from: ۥ۟ */
    public E mo429(int r3) {
            r2 = this;
            r2.m14659()
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.f11541
            r0.m399(r3, r1)
            int r0 = r2.f11540
            int r0 = r0 + r3
            java.lang.Object r3 = r2.m14664(r0)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m14656(int r5, java.util.Collection<? extends E> r6, int r7) {
            r4 = this;
            Yue.ۥ۠ۧۢۡ<E> r0 = r4.f11543
            if (r0 == 0) goto L13
            r0.m14656(r5, r6, r7)
            Yue.ۥ۠ۧۢۡ<E> r5 = r4.f11543
            E[] r5 = r5.f11539
            r4.f11539 = r5
            int r5 = r4.f11541
            int r5 = r5 + r7
            r4.f11541 = r5
            goto L2a
        L13:
            r4.m14662(r5, r7)
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        L1b:
            if (r0 >= r7) goto L2a
            E[] r1 = r4.f11539
            int r2 = r5 + r0
            java.lang.Object r3 = r6.next()
            r1[r2] = r3
            int r0 = r0 + 1
            goto L1b
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m14657(int r3, E r4) {
            r2 = this;
            Yue.ۥ۠ۧۢۡ<E> r0 = r2.f11543
            r1 = 1
            if (r0 == 0) goto L14
            r0.m14657(r3, r4)
            Yue.ۥ۠ۧۢۡ<E> r3 = r2.f11543
            E[] r3 = r3.f11539
            r2.f11539 = r3
            int r3 = r2.f11541
            int r3 = r3 + r1
            r2.f11541 = r3
            goto L1b
        L14:
            r2.m14662(r3, r1)
            E[] r0 = r2.f11539
            r0[r3] = r4
        L1b:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final java.util.List<E> m14658() {
            r1 = this;
            Yue.ۥ۠ۧۢۡ<E> r0 = r1.f11543
            if (r0 != 0) goto L13
            r1.m14659()
            r0 = 1
            r1.f11542 = r0
            int r0 = r1.f11541
            if (r0 <= 0) goto L10
            r0 = r1
            goto L12
        L10:
            Yue.ۥ۠ۧۢۡ r0 = Yue.C3624.f11538
        L12:
            return r0
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m14659() {
            r1 = this;
            boolean r0 = r1.m14663()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m14660(java.util.List<?> r4) {
            r3 = this;
            E[] r0 = r3.f11539
            int r1 = r3.f11540
            int r2 = r3.f11541
            boolean r4 = Yue.C3627.m14667(r0, r1, r2, r4)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m14661(int r2) {
            r1 = this;
            int r0 = r1.f11541
            int r0 = r0 + r2
            r1.m14654(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m14662(int r4, int r5) {
            r3 = this;
            r3.m14661(r5)
            E[] r0 = r3.f11539
            int r1 = r3.f11540
            int r2 = r3.f11541
            int r1 = r1 + r2
            int r2 = r4 + r5
            Yue.C0586.m2176(r0, r0, r2, r4, r1)
            int r4 = r3.f11541
            int r4 = r4 + r5
            r3.f11541 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m14663() {
            r1 = this;
            boolean r0 = r1.f11542
            if (r0 != 0) goto Lf
            Yue.ۥ۠ۧۢۡ<E> r0 = r1.f11544
            if (r0 == 0) goto Ld
            boolean r0 = r0.f11542
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final E m14664(int r6) {
            r5 = this;
            Yue.ۥ۠ۧۢۡ<E> r0 = r5.f11543
            if (r0 == 0) goto Lf
            java.lang.Object r6 = r0.m14664(r6)
            int r0 = r5.f11541
            int r0 = r0 + (-1)
            r5.f11541 = r0
            return r6
        Lf:
            E[] r0 = r5.f11539
            r1 = r0[r6]
            int r2 = r6 + 1
            int r3 = r5.f11540
            int r4 = r5.f11541
            int r3 = r3 + r4
            Yue.C0586.m2176(r0, r0, r6, r2, r3)
            E[] r6 = r5.f11539
            int r0 = r5.f11540
            int r2 = r5.f11541
            int r0 = r0 + r2
            int r0 = r0 + (-1)
            Yue.C3627.m14672(r6, r0)
            int r6 = r5.f11541
            int r6 = r6 + (-1)
            r5.f11541 = r6
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m14665(int r4, int r5) {
            r3 = this;
            Yue.ۥ۠ۧۢۡ<E> r0 = r3.f11543
            if (r0 == 0) goto L8
            r0.m14665(r4, r5)
            goto L1a
        L8:
            E[] r0 = r3.f11539
            int r1 = r4 + r5
            int r2 = r3.f11541
            Yue.C0586.m2176(r0, r0, r4, r1, r2)
            E[] r4 = r3.f11539
            int r0 = r3.f11541
            int r1 = r0 - r5
            Yue.C3627.m14673(r4, r1, r0)
        L1a:
            int r4 = r3.f11541
            int r4 = r4 - r5
            r3.f11541 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m14666(int r6, int r7, java.util.Collection<? extends E> r8, boolean r9) {
            r5 = this;
            Yue.ۥ۠ۧۢۡ<E> r0 = r5.f11543
            if (r0 == 0) goto Le
            int r6 = r0.m14666(r6, r7, r8, r9)
            int r7 = r5.f11541
            int r7 = r7 - r6
            r5.f11541 = r7
            return r6
        Le:
            r0 = 0
            r1 = r0
        L10:
            if (r0 >= r7) goto L2e
            E[] r2 = r5.f11539
            int r3 = r6 + r0
            r2 = r2[r3]
            boolean r2 = r8.contains(r2)
            if (r2 != r9) goto L2b
            E[] r2 = r5.f11539
            int r4 = r1 + 1
            int r1 = r1 + r6
            int r0 = r0 + 1
            r3 = r2[r3]
            r2[r1] = r3
            r1 = r4
            goto L10
        L2b:
            int r0 = r0 + 1
            goto L10
        L2e:
            int r8 = r7 - r1
            E[] r9 = r5.f11539
            int r7 = r7 + r6
            int r0 = r5.f11541
            int r6 = r6 + r1
            Yue.C0586.m2176(r9, r9, r6, r7, r0)
            E[] r6 = r5.f11539
            int r7 = r5.f11541
            int r9 = r7 - r8
            Yue.C3627.m14673(r6, r9, r7)
            int r6 = r5.f11541
            int r6 = r6 - r8
            r5.f11541 = r6
            return r8
    }
}
