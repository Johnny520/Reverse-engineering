package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4553<T> implements InterfaceC7326<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f965;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC5124<T, Boolean> f966;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۢ$ۥ */
    public static final class C0438 implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f9799;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f9800 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6489
        public T f9801;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ C4553<T> f9802;

        public C0438(C4553<T> c4553) {
            this.f9802 = c4553;
            this.f9799 = c4553.f965.iterator();
        }

        /* JADX INFO: renamed from: ۥ */
        private final void m1497() {
            while (this.f9799.hasNext()) {
                T next = this.f9799.next();
                if (!((Boolean) this.f9802.f966.invoke(next)).booleanValue()) {
                    this.f9801 = next;
                    this.f9800 = 1;
                    return;
                }
            }
            this.f9800 = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9800 == -1) {
                m1497();
            }
            return this.f9800 == 1 || this.f9799.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f9800 == -1) {
                m1497();
            }
            if (this.f9800 != 1) {
                return this.f9799.next();
            }
            T t = this.f9801;
            this.f9801 = null;
            this.f9800 = 0;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m1498() {
            return this.f9800;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Iterator<T> m13385() {
            return this.f9799;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final T m13386() {
            return this.f9801;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m13387(int i) {
            this.f9800 = i;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m13388(@InterfaceC6489 T t) {
            this.f9801 = t;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4553(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "sequence");
        C5499.m17103(interfaceC5124, "predicate");
        this.f965 = interfaceC7326;
        this.f966 = interfaceC5124;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<T> iterator() {
        return new C0438(this);
    }
}
