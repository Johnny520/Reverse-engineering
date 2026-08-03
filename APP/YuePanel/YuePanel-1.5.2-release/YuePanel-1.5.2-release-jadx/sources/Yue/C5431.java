package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5431<T> implements InterfaceC7326<C5428<? extends T>> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f1505;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۡۧ$ۥ */
    public static final class C0760 implements Iterator<C5428<? extends T>>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f13335;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f13336;

        public C0760(C5431<T> c5431) {
            this.f13335 = c5431.f1505.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13335.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m2202() {
            return this.f13336;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final Iterator<T> m2203() {
            return this.f13335;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5428<T> next() {
            int i = this.f13336;
            this.f13336 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            return new C5428<>(i, this.f13335.next());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m16918(int i) {
            this.f13336 = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5431(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "sequence");
        this.f1505 = interfaceC7326;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<C5428<T>> iterator() {
        return new C0760(this);
    }
}
