package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7721<T> implements InterfaceC7326<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f3043;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC5124<T, Boolean> f3044;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۨ$ۥ */
    public static final class C1335 implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f23244;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f23245 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6489
        public T f23246;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ C7721<T> f23247;

        public C1335(C7721<T> c7721) {
            this.f23247 = c7721;
            this.f23244 = c7721.f3043.iterator();
        }

        /* JADX INFO: renamed from: ۥ */
        private final void m3817() {
            if (this.f23244.hasNext()) {
                T next = this.f23244.next();
                if (((Boolean) this.f23247.f3044.invoke(next)).booleanValue()) {
                    this.f23245 = 1;
                    this.f23246 = next;
                    return;
                }
            }
            this.f23245 = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f23245 == -1) {
                m3817();
            }
            return this.f23245 == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f23245 == -1) {
                m3817();
            }
            if (this.f23245 == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f23246;
            this.f23246 = null;
            this.f23245 = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final Iterator<T> m3818() {
            return this.f23244;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final T m24566() {
            return this.f23246;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m24567() {
            return this.f23245;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m24568(@InterfaceC6489 T t) {
            this.f23246 = t;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m24569(int i) {
            this.f23245 = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7721(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "sequence");
        C5499.m17103(interfaceC5124, "predicate");
        this.f3043 = interfaceC7326;
        this.f3044 = interfaceC5124;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<T> iterator() {
        return new C1335(this);
    }
}
