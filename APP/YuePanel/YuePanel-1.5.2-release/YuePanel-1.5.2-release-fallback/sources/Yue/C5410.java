package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5410<T> extends Yue.AbstractC0069<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<T> f20051;

    /* JADX INFO: renamed from: Yue.ۥۡۧ$ۥ, reason: contains not printable characters */
    public static final class C5411 implements java.util.ListIterator<T>, Yue.InterfaceC3448 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.ListIterator<T> f20052;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5410<T> f20053;

        public C5411(Yue.C5410<T> r2, int r3) {
                r1 = this;
                r1.f20053 = r2
                r1.<init>()
                java.util.List r0 = Yue.C5410.m20418(r2)
                int r2 = Yue.C1217.m6281(r2, r3)
                java.util.ListIterator r2 = r0.listIterator(r2)
                r1.f20052 = r2
                return
        }

        @Override // java.util.ListIterator
        public void add(T r2) {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20052
                r0.add(r2)
                java.util.ListIterator<T> r2 = r1.f20052
                r2.previous()
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20052
                boolean r0 = r0.hasPrevious()
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20052
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20052
                java.lang.Object r0 = r0.previous()
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r2 = this;
                Yue.ۥۡۧ<T> r0 = r2.f20053
                java.util.ListIterator<T> r1 = r2.f20052
                int r1 = r1.previousIndex()
                int r0 = Yue.C1217.m6280(r0, r1)
                return r0
        }

        @Override // java.util.ListIterator
        public T previous() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20052
                java.lang.Object r0 = r0.next()
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r2 = this;
                Yue.ۥۡۧ<T> r0 = r2.f20053
                java.util.ListIterator<T> r1 = r2.f20052
                int r1 = r1.nextIndex()
                int r0 = Yue.C1217.m6280(r0, r1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20052
                r0.remove()
                return
        }

        @Override // java.util.ListIterator
        public void set(T r2) {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20052
                r0.set(r2)
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.ListIterator<T> m20419() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20052
                return r0
        }
    }

    public C5410(@Yue.InterfaceC4418 java.util.List<T> r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20051 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.List m20418(Yue.C5410 r0) {
            java.util.List<T> r0 = r0.f20051
            return r0
    }

    @Override // Yue.AbstractC0069, java.util.AbstractList, java.util.List
    public void add(int r2, T r3) {
            r1 = this;
            java.util.List<T> r0 = r1.f20051
            int r2 = Yue.C1217.m6281(r1, r2)
            r0.add(r2, r3)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            java.util.List<T> r0 = r1.f20051
            r0.clear()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.f20051
            int r2 = Yue.C1217.m6279(r1, r2)
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator<T> listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator<T> listIterator(int r2) {
            r1 = this;
            Yue.ۥۡۧ$ۥ r0 = new Yue.ۥۡۧ$ۥ
            r0.<init>(r1, r2)
            return r0
    }

    @Override // Yue.AbstractC0069, java.util.AbstractList, java.util.List
    public T set(int r2, T r3) {
            r1 = this;
            java.util.List<T> r0 = r1.f20051
            int r2 = Yue.C1217.m6279(r1, r2)
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }

    @Override // Yue.AbstractC0069
    /* JADX INFO: renamed from: ۥ */
    public int mo428() {
            r1 = this;
            java.util.List<T> r0 = r1.f20051
            int r0 = r0.size()
            return r0
    }

    @Override // Yue.AbstractC0069
    /* JADX INFO: renamed from: ۥ۟ */
    public T mo429(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.f20051
            int r2 = Yue.C1217.m6279(r1, r2)
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }
}
