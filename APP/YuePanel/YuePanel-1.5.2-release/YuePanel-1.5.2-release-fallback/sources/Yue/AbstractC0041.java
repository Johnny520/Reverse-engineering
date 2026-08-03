package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.1")
@Yue.InterfaceC5840({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1747#2,3:43\n1726#2,3:46\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:43,3\n22#1:46,3\n*E\n"})
public abstract class AbstractC0041<E> implements java.util.Collection<E>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۦ$ۥ, reason: contains not printable characters */
    public static final class C0042 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<E, java.lang.CharSequence> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0041<E> f100;

        public C0042(Yue.AbstractC0041<? extends E> r1) {
                r0 = this;
                r0.f100 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.CharSequence invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.CharSequence r1 = r0.m369(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.CharSequence m369(E r2) {
                r1 = this;
                Yue.ۥ۟۟۠ۦ<E> r0 = r1.f100
                if (r2 != r0) goto L7
                java.lang.String r2 = "(this Collection)"
                goto Lb
            L7:
                java.lang.String r2 = java.lang.String.valueOf(r2)
            Lb:
                return r2
        }
    }

    public AbstractC0041() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Collection
    public boolean add(E r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public boolean contains(E r4) {
            r3 = this;
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            goto L1d
        L8:
            java.util.Iterator r0 = r3.iterator()
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            boolean r2 = Yue.C3329.m13897(r2, r4)
            if (r2 == 0) goto Lc
            r1 = 1
        L1d:
            return r1
    }

    @Override // java.util.Collection
    public boolean containsAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L11
            r1 = 0
        L22:
            return r1
    }

    @Override // java.util.Collection
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

    @Override // java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public abstract java.util.Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.mo368()
            return r0
    }

    @Override // java.util.Collection
    @Yue.InterfaceC4418
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = Yue.C1204.m6175(r1)
            return r0
    }

    @Override // java.util.Collection
    @Yue.InterfaceC4418
    public <T> T[] toArray(@Yue.InterfaceC4418 T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object[] r2 = Yue.C1204.m6176(r1, r2)
            return r2
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r9 = this;
            Yue.ۥ۟۟۠ۦ$ۥ r6 = new Yue.ۥ۟۟۠ۦ$ۥ
            r6.<init>(r9)
            r7 = 24
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r0 = r9
            java.lang.String r0 = Yue.C1219.m6398(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract int mo368();
}
