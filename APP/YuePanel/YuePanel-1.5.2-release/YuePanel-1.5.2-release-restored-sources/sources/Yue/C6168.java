package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6168<T1, T2, V> implements InterfaceC7326<V> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T1> f1871;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC7326<T2> f1872;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5138<T1, T2, V> f15080;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۧۡ$ۥ */
    public static final class C0927 implements Iterator<V>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T1> f15081;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T2> f15082;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C6168<T1, T2, V> f15083;

        public C0927(C6168<T1, T2, V> c6168) {
            this.f15083 = c6168;
            this.f15081 = c6168.f1871.iterator();
            this.f15082 = c6168.f1872.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15081.hasNext() && this.f15082.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f15083.f15080.invoke(this.f15081.next(), this.f15082.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final Iterator<T1> m2671() {
            return this.f15081;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final Iterator<T2> m2672() {
            return this.f15082;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T1> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۡۨۢ<? extends T2> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۢۢ<? super T1, ? super T2, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6168(@InterfaceC6399 InterfaceC7326<? extends T1> interfaceC7326, @InterfaceC6399 InterfaceC7326<? extends T2> interfaceC73262, @InterfaceC6399 InterfaceC5138<? super T1, ? super T2, ? extends V> interfaceC5138) {
        C5499.m17103(interfaceC7326, "sequence1");
        C5499.m17103(interfaceC73262, "sequence2");
        C5499.m17103(interfaceC5138, "transform");
        this.f1871 = interfaceC7326;
        this.f1872 = interfaceC73262;
        this.f15080 = interfaceC5138;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<V> iterator() {
        return new C0927(this);
    }
}
