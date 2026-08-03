package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4868<T, R, E> implements InterfaceC7326<E> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f1194;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC5124<T, R> f1195;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<R, Iterator<E>> f11161;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۟$ۥ */
    public static final class C0515 implements Iterator<E>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f11162;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6489
        public Iterator<? extends E> f11163;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C4868<T, R, E> f11164;

        public C0515(C4868<T, R, E> c4868) {
            this.f11164 = c4868;
            this.f11162 = c4868.f1194.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return m1772();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!m1772()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.f11163;
            C5499.m17100(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public final boolean m1772() {
            Iterator<? extends E> it = this.f11163;
            if (it != null && !it.hasNext()) {
                this.f11163 = null;
            }
            while (true) {
                if (this.f11163 != null) {
                    break;
                }
                if (!this.f11162.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it2 = (Iterator) this.f11164.f11161.invoke(this.f11164.f1195.invoke(this.f11162.next()));
                if (it2.hasNext()) {
                    this.f11163 = it2;
                    break;
                }
            }
            return true;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public final Iterator<E> m1773() {
            return this.f11163;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Iterator<T> m14950() {
            return this.f11162;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m14951(@InterfaceC6489 Iterator<? extends E> it) {
            this.f11163 = it;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends R> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۡ۟<? super R, ? extends java.util.Iterator<? extends E>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4868(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super R, ? extends Iterator<? extends E>> interfaceC51242) {
        C5499.m17103(interfaceC7326, "sequence");
        C5499.m17103(interfaceC5124, "transformer");
        C5499.m17103(interfaceC51242, "iterator");
        this.f1194 = interfaceC7326;
        this.f1195 = interfaceC5124;
        this.f11161 = interfaceC51242;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<E> iterator() {
        return new C0515(this);
    }
}
