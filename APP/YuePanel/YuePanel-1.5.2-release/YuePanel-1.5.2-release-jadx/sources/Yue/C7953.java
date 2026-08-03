package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7953<T, R> implements InterfaceC7326<R> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f3138;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC5138<Integer, T, R> f3139;

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۤ$ۥ */
    public static final class C1389 implements Iterator<R>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f23722;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f23723;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C7953<T, R> f23724;

        public C1389(C7953<T, R> c7953) {
            this.f23724 = c7953;
            this.f23722 = c7953.f3138.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23722.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            InterfaceC5138 interfaceC5138 = this.f23724.f3139;
            int i = this.f23723;
            this.f23723 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            return (R) interfaceC5138.invoke(Integer.valueOf(i), this.f23722.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m3979() {
            return this.f23723;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final Iterator<T> m3980() {
            return this.f23722;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m25100(int i) {
            this.f23723 = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.lang.Integer, ? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7953(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC7326, "sequence");
        C5499.m17103(interfaceC5138, "transformer");
        this.f3138 = interfaceC7326;
        this.f3139 = interfaceC5138;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<R> iterator() {
        return new C1389(this);
    }
}
