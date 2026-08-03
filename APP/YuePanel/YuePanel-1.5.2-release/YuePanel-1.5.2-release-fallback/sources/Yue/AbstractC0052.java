package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.1")
@Yue.InterfaceC5840({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n350#2,7:158\n378#2,7:165\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:158,7\n29#1:165,7\n*E\n"})
public abstract class AbstractC0052<E> extends Yue.AbstractC0041<E> implements java.util.List<E>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.AbstractC0052.C0053 f115 = null;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ$ۥ, reason: contains not printable characters */
    public static final class C0053 {
        public C0053() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0053(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m398(int r4, int r5, int r6) {
                r3 = this;
                java.lang.String r0 = "startIndex: "
                if (r4 < 0) goto L26
                if (r5 > r6) goto L26
                if (r4 > r5) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r4 = " > endIndex: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r6.<init>(r4)
                throw r6
            L26:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r4)
                java.lang.String r4 = ", endIndex: "
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = ", size: "
                r2.append(r4)
                r2.append(r6)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4)
                throw r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m399(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 >= r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", size: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m400(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 > r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", size: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m401(int r4, int r5, int r6) {
                r3 = this;
                java.lang.String r0 = "fromIndex: "
                if (r4 < 0) goto L26
                if (r5 > r6) goto L26
                if (r4 > r5) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r4 = " > toIndex: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r6.<init>(r4)
                throw r6
            L26:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r4)
                java.lang.String r4 = ", toIndex: "
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = ", size: "
                r2.append(r4)
                r2.append(r6)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4)
                throw r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m402(@Yue.InterfaceC4418 java.util.Collection<?> r4, @Yue.InterfaceC4418 java.util.Collection<?> r5) {
                r3 = this;
                java.lang.String r0 = "c"
                Yue.C3329.m13906(r4, r0)
                java.lang.String r0 = "other"
                Yue.C3329.m13906(r5, r0)
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r0 == r1) goto L16
                return r2
            L16:
                java.util.Iterator r5 = r5.iterator()
                java.util.Iterator r4 = r4.iterator()
            L1e:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L33
                java.lang.Object r0 = r4.next()
                java.lang.Object r1 = r5.next()
                boolean r0 = Yue.C3329.m13897(r0, r1)
                if (r0 != 0) goto L1e
                return r2
            L33:
                r4 = 1
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int m403(@Yue.InterfaceC4418 java.util.Collection<?> r3) {
                r2 = this;
                java.lang.String r0 = "c"
                Yue.C3329.m13906(r3, r0)
                java.util.Iterator r3 = r3.iterator()
                r0 = 1
            La:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r3.next()
                int r0 = r0 * 31
                if (r1 == 0) goto L1d
                int r1 = r1.hashCode()
                goto L1e
            L1d:
                r1 = 0
            L1e:
                int r0 = r0 + r1
                goto La
            L20:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ$ۥ۟, reason: contains not printable characters */
    public class C0054 implements java.util.Iterator<E>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f116;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0052<E> f117;

        public C0054(Yue.AbstractC0052 r1) {
                r0 = this;
                r0.f117 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f116
                Yue.ۥ۟۟ۡۢ<E> r1 = r2.f117
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public E next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L13
                Yue.ۥ۟۟ۡۢ<E> r0 = r3.f117
                int r1 = r3.f116
                int r2 = r1 + 1
                r3.f116 = r2
                java.lang.Object r0 = r0.get(r1)
                return r0
            L13:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int m404() {
                r1 = this;
                int r0 = r1.f116
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m405(int r1) {
                r0 = this;
                r0.f116 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ$ۥ۟۟, reason: contains not printable characters */
    public class C0055 extends Yue.AbstractC0052<E>.C0054 implements java.util.ListIterator<E>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0052<E> f118;

        public C0055(Yue.AbstractC0052 r2, int r3) {
                r1 = this;
                r1.f118 = r2
                r1.<init>(r2)
                Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
                int r2 = r2.size()
                r0.m400(r3, r2)
                r1.m405(r3)
                return
        }

        @Override // java.util.ListIterator
        public void add(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.m404()
                if (r0 <= 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.m404()
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r2 = this;
                boolean r0 = r2.hasPrevious()
                if (r0 == 0) goto L1a
                Yue.ۥ۟۟ۡۢ<E> r0 = r2.f118
                int r1 = r2.m404()
                int r1 = r1 + (-1)
                r2.m405(r1)
                int r1 = r2.m404()
                java.lang.Object r0 = r0.get(r1)
                return r0
            L1a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.m404()
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator
        public void set(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C0056<E> extends Yue.AbstractC0052<E> implements java.util.RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.AbstractC0052<E> f119;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final int f120;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f121;

        public C0056(@Yue.InterfaceC4418 Yue.AbstractC0052<? extends E> r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "list"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f119 = r2
                r1.f120 = r3
                Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
                int r2 = r2.size()
                r0.m401(r3, r4, r2)
                int r4 = r4 - r3
                r1.f121 = r4
                return
        }

        @Override // Yue.AbstractC0052, java.util.List
        public E get(int r3) {
                r2 = this;
                Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
                int r1 = r2.f121
                r0.m399(r3, r1)
                Yue.ۥ۟۟ۡۢ<E> r0 = r2.f119
                int r1 = r2.f120
                int r1 = r1 + r3
                java.lang.Object r3 = r0.get(r1)
                return r3
        }

        @Override // Yue.AbstractC0052, Yue.AbstractC0041
        /* JADX INFO: renamed from: ۥ */
        public int mo368() {
                r1 = this;
                int r0 = r1.f121
                return r0
        }
    }

    static {
            Yue.ۥ۟۟ۡۢ$ۥ r0 = new Yue.ۥ۟۟ۡۢ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.AbstractC0052.f115 = r0
            return
    }

    public AbstractC0052() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.List
    public void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    public boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof java.util.List
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r0.m402(r1, r2)
            return r2
    }

    @Override // java.util.List
    public abstract E get(int r1);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r1 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r0 = r0.m403(r1)
            return r0
    }

    @Override // java.util.List
    public int indexOf(E r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            boolean r2 = Yue.C3329.m13897(r2, r4)
            if (r2 == 0) goto L16
            goto L1a
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r1 = -1
        L1a:
            return r1
    }

    @Override // Yue.AbstractC0041, java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<E> iterator() {
            r1 = this;
            Yue.ۥ۟۟ۡۢ$ۥ۟ r0 = new Yue.ۥ۟۟ۡۢ$ۥ۟
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(E r3) {
            r2 = this;
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L8:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.previous()
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 == 0) goto L8
            int r3 = r0.nextIndex()
            goto L1e
        L1d:
            r3 = -1
        L1e:
            return r3
    }

    @Override // java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator<E> listIterator() {
            r2 = this;
            Yue.ۥ۟۟ۡۢ$ۥ۟۟ r0 = new Yue.ۥ۟۟ۡۢ$ۥ۟۟
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            Yue.ۥ۟۟ۡۢ$ۥ۟۟ r0 = new Yue.ۥ۟۟ۡۢ$ۥ۟۟
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public E remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    @Yue.InterfaceC4418
    public java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            Yue.ۥ۟۟ۡۢ$ۥ۟۟۟ r0 = new Yue.ۥ۟۟ۡۢ$ۥ۟۟۟
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // Yue.AbstractC0041
    /* JADX INFO: renamed from: ۥ */
    public abstract int mo368();
}
