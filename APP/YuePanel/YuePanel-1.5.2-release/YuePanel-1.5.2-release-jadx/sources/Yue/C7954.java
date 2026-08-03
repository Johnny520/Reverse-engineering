package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7954<T, R> implements InterfaceC7326<R> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f3140;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC5124<T, R> f3141;

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۥ$ۥ */
    public static final class C1390 implements Iterator<R>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f23725;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7954<T, R> f23726;

        public C1390(C7954<T, R> c7954) {
            this.f23726 = c7954;
            this.f23725 = c7954.f3140.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23725.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f23726.f3141.invoke(this.f23725.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final Iterator<T> m3981() {
            return this.f23725;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7954(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "sequence");
        C5499.m17103(interfaceC5124, "transformer");
        this.f3140 = interfaceC7326;
        this.f3141 = interfaceC5124;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<R> iterator() {
        return new C1390(this);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final <E> InterfaceC7326<E> m25103(@InterfaceC6399 InterfaceC5124<? super R, ? extends Iterator<? extends E>> interfaceC5124) {
        C5499.m17103(interfaceC5124, "iterator");
        return new C4868(this.f3140, this.f3141, interfaceC5124);
    }
}
