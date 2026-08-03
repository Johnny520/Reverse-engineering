package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5155<T> implements InterfaceC7326<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC5122<T> f1307;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC5124<T, T> f1308;

    /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ$ۥ */
    public static final class C0651 implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6489
        public T f12141;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f12142 = -2;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C5155<T> f12143;

        public C0651(C5155<T> c5155) {
            this.f12143 = c5155;
        }

        /* JADX INFO: renamed from: ۥ */
        private final void m1935() {
            T t;
            if (this.f12142 == -2) {
                t = (T) this.f12143.f1307.invoke();
            } else {
                InterfaceC5124 interfaceC5124 = this.f12143.f1308;
                T t2 = this.f12141;
                C5499.m17100(t2);
                t = (T) interfaceC5124.invoke(t2);
            }
            this.f12141 = t;
            this.f12142 = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12142 < 0) {
                m1935();
            }
            return this.f12142 == 1;
        }

        @Override // java.util.Iterator
        @InterfaceC6399
        public T next() {
            if (this.f12142 < 0) {
                m1935();
            }
            if (this.f12142 == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f12141;
            C5499.m17101(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f12142 = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public final T m1936() {
            return this.f12141;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m15821() {
            return this.f12142;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m15822(@InterfaceC6489 T t) {
            this.f12141 = t;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m15823(int i) {
            this.f12142 = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5155(@InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122, @InterfaceC6399 InterfaceC5124<? super T, ? extends T> interfaceC5124) {
        C5499.m17103(interfaceC5122, "getInitialValue");
        C5499.m17103(interfaceC5124, "getNextValue");
        this.f1307 = interfaceC5122;
        this.f1308 = interfaceC5124;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<T> iterator() {
        return new C0651(this);
    }
}
