package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5412<T> extends Yue.AbstractC0052<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<T> f20054;

    /* JADX INFO: renamed from: Yue.ۥۡۧ۟$ۥ, reason: contains not printable characters */
    public static final class C5413 implements java.util.ListIterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.ListIterator<T> f20055;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5412<T> f20056;

        public C5413(Yue.C5412<? extends T> r2, int r3) {
                r1 = this;
                r1.f20056 = r2
                r1.<init>()
                java.util.List r0 = Yue.C5412.m20420(r2)
                int r2 = Yue.C1217.m6281(r2, r3)
                java.util.ListIterator r2 = r0.listIterator(r2)
                r1.f20055 = r2
                return
        }

        @Override // java.util.ListIterator
        public void add(T r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20055
                boolean r0 = r0.hasPrevious()
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20055
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20055
                java.lang.Object r0 = r0.previous()
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r2 = this;
                Yue.ۥۡۧ۟<T> r0 = r2.f20056
                java.util.ListIterator<T> r1 = r2.f20055
                int r1 = r1.previousIndex()
                int r0 = Yue.C1217.m6280(r0, r1)
                return r0
        }

        @Override // java.util.ListIterator
        public T previous() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20055
                java.lang.Object r0 = r0.next()
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r2 = this;
                Yue.ۥۡۧ۟<T> r0 = r2.f20056
                java.util.ListIterator<T> r1 = r2.f20055
                int r1 = r1.nextIndex()
                int r0 = Yue.C1217.m6280(r0, r1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.ListIterator
        public void set(T r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.ListIterator<T> m20421() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.f20055
                return r0
        }
    }

    public C5412(@Yue.InterfaceC4418 java.util.List<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20054 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.List m20420(Yue.C5412 r0) {
            java.util.List<T> r0 = r0.f20054
            return r0
    }

    @Override // Yue.AbstractC0052, java.util.List
    public T get(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.f20054
            int r2 = Yue.C1217.m6279(r1, r2)
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // Yue.AbstractC0052, Yue.AbstractC0041, java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // Yue.AbstractC0052, java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator<T> listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // Yue.AbstractC0052, java.util.List
    @Yue.InterfaceC4418
    public java.util.ListIterator<T> listIterator(int r2) {
            r1 = this;
            Yue.ۥۡۧ۟$ۥ r0 = new Yue.ۥۡۧ۟$ۥ
            r0.<init>(r1, r2)
            return r0
    }

    @Override // Yue.AbstractC0052, Yue.AbstractC0041
    /* JADX INFO: renamed from: ۥ */
    public int mo368() {
            r1 = this;
            java.util.List<T> r0 = r1.f20054
            int r0 = r0.size()
            return r0
    }
}
