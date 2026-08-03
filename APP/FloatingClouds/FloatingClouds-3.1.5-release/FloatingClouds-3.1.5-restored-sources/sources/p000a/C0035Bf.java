package p000a;

import java.util.Iterator;

/* JADX INFO: renamed from: a.Bf */
/* JADX INFO: loaded from: classes.dex */
public final class C0035Bf<T, R> implements InterfaceC0286Pd<R> {

    /* JADX INFO: renamed from: a */
    public final C0220M1 f128a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0064D7<T, R> f129b;

    /* JADX INFO: renamed from: a.Bf$a */
    public static final class a implements Iterator<R>, InterfaceC0783q9 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f130a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0035Bf<T, R> f131b;

        public a(C0035Bf<T, R> c0035Bf) {
            this.f131b = c0035Bf;
            this.f130a = ((Iterable) c0035Bf.f128a.f741b).iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f130a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f131b.f129b.mo53f(this.f130a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0035Bf(C0220M1 c0220m1, InterfaceC0064D7 interfaceC0064D7) {
        this.f128a = c0220m1;
        this.f129b = interfaceC0064D7;
    }

    @Override // p000a.InterfaceC0286Pd
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
